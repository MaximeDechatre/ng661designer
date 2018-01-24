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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.polarsys.ng661designer.part2.PropertyType;
import org.polarsys.ng661designer.part2.PropertyValue;
import org.polarsys.ng661designer.part2.TreeTypes;
import org.polarsys.ng661designer.part2.WidgetComposition;
import org.polarsys.ng661designer.dsl.part2.util.FeatureServices;
import org.polarsys.ng661designer.dsl.part2.util.NG661DesignerUtil;
import org.w3._2005._07.scxml.ScxmlPackage;
import org.w3._2005._07.scxml.ScxmlScriptType;

/**
 * XML Handler used on XML saving.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class NGDesignerXMLSave extends XMLSaveImpl {

	private FeatureServices featureServices;

	/**
	 * @param helper
	 *            XMLHelper
	 */
	public NGDesignerXMLSave(XMLHelper helper) {
		super(helper);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl#saveElement(org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.EStructuralFeature)
	 */
	@Override
	protected void saveElement(EObject object, EStructuralFeature feature) {
		// Specific case to save representation
		if (NG661DesignerUtil.isTreeCase(feature)) {
			saveTree(object, feature);
		} else {
			super.saveElement(object, feature);
		}

	}

	/**
	 * Save tree.
	 * 
	 * @param object
	 *            EObject
	 * @param feature
	 *            EStructuralFeature
	 */
	public void saveTree(EObject object, EStructuralFeature feature) {
		EStructuralFeature parentFeature = getFeatureServices().getParentFeature(feature.getEContainingClass(),
				object.eClass().getInstanceClassName());
		if (parentFeature != null) {
			if (NG661DesignerUtil.isWidgetCompositionCase(parentFeature)) {
				saveComposition(object);
			} else {
				saveTreeTypes(object, parentFeature);
			}
		} else {
			System.err.println("feature not found " + feature.getName());
		}
	}

	/**
	 * Save tree types.
	 * 
	 * @param object
	 *            EObject
	 * @param feature
	 *            EStructuralFeature
	 */
	public void saveTreeTypes(EObject object, EStructuralFeature feature) {
		String featureName = helper.getQName(feature);
		if (featureName != null && featureName != "") {
			doc.startElement(featureName);
			saveFeatures(object);
		}
	}

	/**
	 * Save composition.
	 * 
	 * @param object
	 *            EObject
	 */
	public void saveComposition(EObject object) {
		if (object instanceof WidgetComposition && ((WidgetComposition) object).getRepresentation() != null) {
			String featureName = ((WidgetComposition) object).getRepresentation().getName();
			if (featureName != null && featureName != "") {
				doc.startElement(featureName);
				EList<TreeTypes> childElements = ((WidgetComposition) object).getChildElements();
				if (childElements != null && !childElements.isEmpty()) {
					saveFeatures(object);
				} else {
					// save properties
					for (PropertyValue propertyValue : ((WidgetComposition) object).getValues()) {
						PropertyType property = propertyValue.getProperty();
						if (property != null) {					
							String propertyName = property.getName();
							if (propertyName != null && propertyName != "") {
								if (propertyValue.getValue() == null) {
									doc.addAttribute(propertyName, "");
								} else {
									doc.addAttribute(propertyName, propertyValue.getValue());
								}
							}
						}
					}					
					doc.endElement();
				}
				
			}
		}
	}

	
	protected void saveDataTypeSingle(EObject o, EStructuralFeature f) {
		if (o instanceof ScxmlScriptType && ScxmlPackage.eINSTANCE.getScxmlScriptType_Content().equals(f)) {
			// nothing to do
		} else {
			super.saveDataTypeSingle(o, f);
		}
	}
	
	protected boolean shouldSaveFeature(EObject o, EStructuralFeature f) {
		if (o instanceof ScxmlScriptType && ScxmlPackage.Literals.SCXML_SCRIPT_TYPE__MIXED.equals(f)) {
			return false;
		}
		return super.shouldSaveFeature(o, f);
	}
	
	protected String getContent(EObject o, EStructuralFeature[] features) {
		if (o instanceof ScxmlScriptType) {
			Object value = helper.getValue(o, ScxmlPackage.eINSTANCE.getScxmlScriptType_Content());
			return getDatatypeValue(value, ScxmlPackage.eINSTANCE.getScxmlScriptType_Content(), true);
			
		} 
		return super.getContent(o, features);
	}
	
	/**
	 * @return FeatureServices
	 */
	private FeatureServices getFeatureServices() {
		if (featureServices == null) {
			featureServices = new FeatureServices();
		}
		return featureServices;
	}
}

