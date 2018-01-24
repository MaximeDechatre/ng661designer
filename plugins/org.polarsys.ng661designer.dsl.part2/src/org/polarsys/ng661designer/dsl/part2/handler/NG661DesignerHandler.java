/*******************************************************************************
 * Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.dsl.part2.handler;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;
import org.polarsys.ng661designer.part2.ChildPrimitive;
import org.polarsys.ng661designer.part2.ClipPathPrimitive;
import org.polarsys.ng661designer.part2.ClippingContainerPrimitive;
import org.polarsys.ng661designer.part2.ComponentDefinitionType;
import org.polarsys.ng661designer.part2.Part2Factory;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.PolygonPrimitive;
import org.polarsys.ng661designer.part2.PolylinePrimitive;
import org.polarsys.ng661designer.part2.PositionListType;
import org.polarsys.ng661designer.part2.PropertyValue;
import org.polarsys.ng661designer.part2.TransformGroupPrimitive;
import org.polarsys.ng661designer.part2.TransformType;
import org.polarsys.ng661designer.part2.TreeType;
import org.polarsys.ng661designer.part2.TreeTypes;
import org.polarsys.ng661designer.part2.WidgetComposition;
import org.polarsys.ng661designer.dsl.part2.util.NG661DesignerUtil;
import org.w3._2005._07.scxml.ScxmlPackage;
import org.w3._2005._07.scxml.ScxmlScriptType;

/**
 * XML Handler used on XML loading.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class NG661DesignerHandler extends SAXXMLHandler {

	private ComponentDefinitionType referencedComponent;
	
	/**
	 * @param xmlResource
	 *            XMLResource
	 * @param helper
	 *            XMLHelper
	 * @param options
	 */
	public NG661DesignerHandler(XMLResource xmlResource, XMLHelper helper, Map<?, ?> options) {
		super(xmlResource, helper, options);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLHandler#createObjectFromFeatureType(org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.EStructuralFeature)
	 */
	@Override
	protected EObject createObjectFromFeatureType(EObject object, EStructuralFeature feature) {
		if (NG661DesignerUtil.COMPOSITIONS_FEATURE.equals(feature.getName())) {
			referencedComponent = NG661DesignerUtil.getWidgetCompositionRepresentation(object, elements.peek());
		}
		EObject type = super.createObjectFromFeatureType(object, feature);
		if (type instanceof WidgetComposition) {
			setFeatureValue(type, Part2Package.eINSTANCE.getWidgetComposition_Representation(), referencedComponent);
		}
		if (object instanceof TreeType) {
			setFeatureValue(object, Part2Package.eINSTANCE.getTreeType_Group(), type);
		}
		if (object instanceof TreeTypes) {
			if (type instanceof PropertyValue) {
				setFeatureValue(object, object.eClass().getEStructuralFeature(NG661DesignerUtil.VALUES_FEATURE), type);
			} else if (object instanceof TransformGroupPrimitive && type instanceof TransformType) {
				setFeatureValue(object, Part2Package.eINSTANCE.getTransformGroupPrimitive_Transform(), type);
			} else if (object instanceof ChildPrimitive && type instanceof TransformType) {
				setFeatureValue(object, Part2Package.eINSTANCE.getChildPrimitive_Transform(), type);
			} else if (object instanceof PolygonPrimitive && type instanceof PositionListType) {
				setFeatureValue(object, Part2Package.eINSTANCE.getPolygonPrimitive_Points(), type);
			} else if (object instanceof PolylinePrimitive && type instanceof PositionListType) {
				setFeatureValue(object, Part2Package.eINSTANCE.getPolylinePrimitive_Points(), type);
			} else if (object instanceof ClippingContainerPrimitive && type instanceof ClipPathPrimitive) {
				setFeatureValue(object, Part2Package.eINSTANCE.getClippingContainerPrimitive_ClipPath(), type);
			} else {
				setFeatureValue(object, object.eClass().getEStructuralFeature(NG661DesignerUtil.CHILD_ELEMENTS_FEATURE), type);
			}
		}
		if (NG661DesignerUtil.COMPOSITIONS_FEATURE.equals(feature.getName())) {
			referencedComponent = null;
		}
		return type;
	}

	@Override
	protected void handleObjectAttribs(EObject obj) {
		if (obj instanceof WidgetComposition) {
			if (attribs != null) {
				for (int i = 0, size = attribs.getLength(); i < size; ++i) {
					String name = attribs.getQName(i);
					PropertyValue propertyValue = Part2Factory.eINSTANCE.createPropertyValue();
					((WidgetComposition) obj).getValues().add(propertyValue);
					setAttribValue(propertyValue, Part2Package.eINSTANCE.getPropertyValue_Value().getName(), attribs.getValue(i));
					setFeatureValue(propertyValue, Part2Package.eINSTANCE.getPropertyValue_Property(), NG661DesignerUtil.getProperty(referencedComponent, name));
				}
			} 
		} else if (obj instanceof ScxmlScriptType) {
			if (attribs != null) {
				String src = attribs.getValue("src");
				setAttribValue(obj, ScxmlPackage.eINSTANCE.getScxmlScriptType_Src().getName(), src);
			}
		} else {
			super.handleObjectAttribs(obj);
		}
	}

	@Override
	public void endElement(String uri, String localName, String name) {
		EObject object = objects.peekEObject();
		super.endElement(uri, localName, name);
		if (object instanceof ScxmlScriptType) {
			FeatureMap mixed = ((ScxmlScriptType)object).getMixed();
			if (mixed != null) {
				Object mixedText = mixed.get(org.eclipse.emf.ecore.xml.type.XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT, true);
				if (mixedText instanceof List && !((List<?>) mixedText).isEmpty()) {
					Object content = ((List<?>) mixedText).get(0);
					if (content instanceof String) {						
						setAttribValue(object, ScxmlPackage.eINSTANCE.getScxmlScriptType_Content().getName(), (String) content);
					}
				}
			}
		}
	}
	
	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLHandler#getFeature(org.eclipse.emf.ecore.EObject,
	 *      java.lang.String, java.lang.String, boolean)
	 */
	@Override
	protected EStructuralFeature getFeature(EObject object, String prefix, String name, boolean isElement) {
		if ((prefix == "" || prefix == null) && object instanceof WidgetComposition) {
			return Part2Package.eINSTANCE.getWidgetComposition_Values();
		}
		if ((prefix == "" || prefix == null) && (object instanceof TreeType || object instanceof TreeTypes) && object.eClass().getEStructuralFeature(name) == null) {
			return object.eClass().getEStructuralFeature(NG661DesignerUtil.COMPOSITIONS_FEATURE);
		}
		return super.getFeature(object, prefix, name, isElement);
	}

}
