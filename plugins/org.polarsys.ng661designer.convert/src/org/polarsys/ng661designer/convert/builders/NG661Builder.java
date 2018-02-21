/*******************************************************************************
 * Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.convert.builders;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * Builder for NG661.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class NG661Builder {

	private EcoreBuilder ecoreBuilder;

	public NG661Builder(EcoreBuilder ecoreBuilder) {
		super();
		this.ecoreBuilder = ecoreBuilder;
	}

	/**
	 * EClass constants
	 */
	private static final String COMPONENT_DEFINITION_TYPE_ECLASS = "ComponentDefinitionType";
	private static final String WIDGET_COMPOSITION_ECLASS = "WidgetComposition";
	private static final String TREE_TYPE_ECLASS = "TreeType";
	private static final String CLIP_PATH_TYPES_ECLASS = "ClipPathTypes";
	// Group ChildElements
	private static final String TREE_TYPES_ECLASS = "TreeTypes";
	
	// From Graphical Primitives XSD
	private static final String RECT_PRIMITIVE_ECLASS = "RectPrimitive";
	private static final String CIRCLE_PRIMITIVE_ECLASS = "CirclePrimitive";
	private static final String ELLIPSE_PRIMITIVE_ECLASS = "EllipsePrimitive";
	private static final String LINE_PRIMITIVE_ECLASS = "LinePrimitive";
	private static final String POLYLINE_PRIMITIVE_ECLASS = "PolylinePrimitive";
	private static final String POLYGON_PRIMITIVE_ECLASS = "PolygonPrimitive";
	private static final String IMAGE_PRIMITIVE_ECLASS = "ImagePrimitive";
	// From Interaction Primitives XSD
	private static final String POINTERAREA_PRIMITIVE_ECLASS = "PointerAreaPrimitive";
	private static final String POINTERGESTUREAREA_PRIMITIVE_ECLASS = "PointerGestureAreaPrimitive";
	private static final String TOUCHAREA_PRIMITIVE_ECLASS = "TouchAreaPrimitive";
	private static final String GESTUREAREA_PRIMITIVE_ECLASS = "GestureAreaPrimitive";
	private static final String KEYBOARDINPUT_PRIMITIVE_ECLASS = "KeyboardInputPrimitive";
	private static final String SCROLLWHEELINPUT_PRIMITIVE_ECLASS = "ScrollWheelInputPrimitive";
	// From Graphical Basic Components XSD
	private static final String ARC_COMPONENT_ECLASS = "ArcComponent";
	private static final String CROWN_COMPONENT_ECLASS = "CrownComponent";
	private static final String POLARLINE_COMPONENT_ECLASS = "PolarLineComponent";
	// From Graphical Containers XSD
	private static final String GROUP_PRIMITIVE_ECLASS = "GroupPrimitive";
	private static final String TRANSFORM_GROUP_PRIMITIVE_ECLASS = "TransformGroupPrimitive";
	private static final String REPLICATE_PRIMITIVE_ECLASS = "ReplicatePrimitive";
	private static final String CHILD_PRIMITIVE_ECLASS = "ChildPrimitive";
	private static final String SWITCH_NODE_PRIMITIVE_ECLASS = "SwitchNodePrimitive";
	private static final String CLIPPING_CONTAINER__PRIMITIVE_ECLASS = "ClippingContainerPrimitive";
	
	private static final String CLIP_PATH_PRIMITIVE_ECLASS = "ClipPathPrimitive";
	private static final String CLOCK_TYPE_ECLASS = "ClockType";

	private static final String PROPERTY_TYPE_ECLASS = "PropertyType";
	private static final String PROPERTY_VALUE_ECLASS = "PropertyValue";
	private static final String PATH_PRIMITIVE_ECLASS = "PathPrimitive";
	private static final String SIMPLE_TEXT_PRIMITIVE_ECLASS = "SimpleTextPrimitive";
	/**
	 * EStructuralFeature constants.
	 */
	public static final String GROUP_FEATURE = "group";
	public static final String CHILD_ELEMENTS_FEATURE = "childElements";
	public static final String COMPOSITIONS_EREFERENCE = "compositions";
	public static final String PROPERTIES_EREFERENCE = "values";
	public static final String REPRESENTATION_EREFERENCE = "representation";
	public static final String PROPERTY_EATTRIBUTE = "property";
	public static final String VALUE_EATTRIBUTE = "value";

	/**
	 * URI Constants.
	 */
	public static final String NG_661_PREFIX = "tns";
	public static final String NG_661_URI = "http://www.polarsys.org/NG661Part2";
	public static final String NG_661_OLD_URI = "http://www.example.org/A661Part2";

	/**
	 * eClasses.
	 */
	private EClass clipPathTypesClass;
	private EClass treeTypesClass;
	private EClass widgetCompositionClass;
	private EClass propertyValueClass;

	/**
	 * Manage NG 661 package and add widget composition.
	 * 
	 * @param ePackage
	 *            EPackage
	 * @return NG 661 resource
	 */
	public Resource manageNG661Package(EPackage ePackage) {
		if (NG_661_OLD_URI.equals(ePackage.getNsURI())) {
			ePackage.setNsURI(NG_661_URI);
			ePackage.setNsPrefix(NG_661_PREFIX);
			// add widget composition
			manageWidgetComposition(ePackage);
			// remove unused metadatas
			ecoreBuilder.removeAttributeMetaData(ePackage);
			return ePackage.eResource();
		}
		return null;
	}

	/**
	 * Add widget composition to ecore resource.
	 * 
	 * @param resource
	 *            Resource
	 */
	public void manageWidgetComposition(EPackage part2Package) {
		// create new representation classes
		createEClasses(part2Package);
		// replace feature map entries
		replaceTreeFeatureMapEntries(part2Package);
	}

	/**
	 * Creates new widget composition concepts.
	 * 
	 * @param ePackage
	 *            EPackage
	 */
	protected void createEClasses(EPackage ePackage) {
		// TreeTypes
		if (ePackage.getEClassifier(TREE_TYPES_ECLASS) == null) {
			treeTypesClass = EcoreFactory.eINSTANCE.createEClass();
			treeTypesClass.setName(TREE_TYPES_ECLASS);
			treeTypesClass.setAbstract(true);
			ePackage.getEClassifiers().add(treeTypesClass);
		}
		// ClipPathTypes
		if (ePackage.getEClassifier(CLIP_PATH_TYPES_ECLASS) == null) {
			clipPathTypesClass = EcoreFactory.eINSTANCE.createEClass();
			clipPathTypesClass.setName(CLIP_PATH_TYPES_ECLASS);
			clipPathTypesClass.setAbstract(true);
			clipPathTypesClass.getESuperTypes().add(treeTypesClass);
			ePackage.getEClassifiers().add(clipPathTypesClass);
		}
		// PropertyValue
		if (ePackage.getEClassifier(PROPERTY_VALUE_ECLASS) == null) {
			propertyValueClass = EcoreFactory.eINSTANCE.createEClass();
			propertyValueClass.setName(PROPERTY_VALUE_ECLASS);
			EAttribute valueAttribute = EcoreFactory.eINSTANCE.createEAttribute();
			valueAttribute.setName(VALUE_EATTRIBUTE);
			valueAttribute.setEType(XMLTypePackage.eINSTANCE.getString());
			propertyValueClass.getEStructuralFeatures().add(valueAttribute);
			EReference propertyReference = EcoreFactory.eINSTANCE.createEReference();
			propertyReference.setName(PROPERTY_EATTRIBUTE);
			propertyReference.setEType(ePackage.getEClassifier(PROPERTY_TYPE_ECLASS));
			propertyValueClass.getEStructuralFeatures().add(propertyReference);
			ePackage.getEClassifiers().add(propertyValueClass);
		}
		// WidgetComposition
		if (ePackage.getEClassifier(WIDGET_COMPOSITION_ECLASS) == null) {
			widgetCompositionClass = EcoreFactory.eINSTANCE.createEClass();
			widgetCompositionClass.setName(WIDGET_COMPOSITION_ECLASS);
			widgetCompositionClass.getESuperTypes().add(treeTypesClass);
			EReference representationReference = EcoreFactory.eINSTANCE.createEReference();
			representationReference.setName(REPRESENTATION_EREFERENCE);
			representationReference.setEType(ePackage.getEClassifier(COMPONENT_DEFINITION_TYPE_ECLASS));
			widgetCompositionClass.getEStructuralFeatures().add(representationReference);
			EReference propertyValuesReference = EcoreFactory.eINSTANCE.createEReference();
			propertyValuesReference.setName(PROPERTIES_EREFERENCE);
			propertyValuesReference.setEType(propertyValueClass);
			propertyValuesReference.setContainment(true);
			propertyValuesReference.setUpperBound(-1);
			widgetCompositionClass.getEStructuralFeatures().add(propertyValuesReference);
			EReference childElementsReference = EcoreFactory.eINSTANCE.createEReference();
			childElementsReference.setName(CHILD_ELEMENTS_FEATURE);
			childElementsReference.setEType(treeTypesClass);
			childElementsReference.setContainment(true);
			childElementsReference.setUpperBound(-1);
			widgetCompositionClass.getEStructuralFeatures().add(childElementsReference);
			
			// Allow to handle primitives & components inside widget compositions
			createPrimitiveReferenceForWidgetComposition("group", ePackage.getEClassifier(GROUP_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("transformGroup", ePackage.getEClassifier(TRANSFORM_GROUP_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("replicate", ePackage.getEClassifier(REPLICATE_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("children", ePackage.getEClassifier(CHILD_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("switchNode", ePackage.getEClassifier(SWITCH_NODE_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("clippingContainer", ePackage.getEClassifier(CLIPPING_CONTAINER__PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("rectangle", ePackage.getEClassifier(RECT_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("circle", ePackage.getEClassifier(CIRCLE_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("ellipse", ePackage.getEClassifier(ELLIPSE_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("line", ePackage.getEClassifier(LINE_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("polyline", ePackage.getEClassifier(POLYLINE_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("polygon", ePackage.getEClassifier(POLYGON_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("path", ePackage.getEClassifier(PATH_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("image", ePackage.getEClassifier(IMAGE_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("simpleText", ePackage.getEClassifier(SIMPLE_TEXT_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("arc", ePackage.getEClassifier(ARC_COMPONENT_ECLASS));
			createPrimitiveReferenceForWidgetComposition("crown", ePackage.getEClassifier(CROWN_COMPONENT_ECLASS));
			createPrimitiveReferenceForWidgetComposition("polarLine", ePackage.getEClassifier(POLARLINE_COMPONENT_ECLASS));
			createPrimitiveReferenceForWidgetComposition("pointerArea", ePackage.getEClassifier(POINTERAREA_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("pointerGestureArea", ePackage.getEClassifier(POINTERGESTUREAREA_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("touchArea", ePackage.getEClassifier(TOUCHAREA_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("gestureArea", ePackage.getEClassifier(GESTUREAREA_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("scrollWheelInput", ePackage.getEClassifier(SCROLLWHEELINPUT_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("keyboardInput", ePackage.getEClassifier(KEYBOARDINPUT_PRIMITIVE_ECLASS));
			createPrimitiveReferenceForWidgetComposition("clock", ePackage.getEClassifier(CLOCK_TYPE_ECLASS));
			ePackage.getEClassifiers().add(widgetCompositionClass);
		}
		// TreeType
		EClassifier treeType = ePackage.getEClassifier(TREE_TYPE_ECLASS);
		if (treeType instanceof EClass) {
			createWidgetCompositionReference((EClass) treeType, widgetCompositionClass);
		}
	}

	protected void createPrimitiveReferenceForWidgetComposition(String refName, EClassifier type) {
		EReference ref = EcoreFactory.eINSTANCE.createEReference();
		ref.setName(refName);
		ref.setEType(type);
		ref.setContainment(false);
		ref.setDerived(true);
		ref.setTransient(true);
		ref.setUnsettable(true);
		ref.setUpperBound(-1);
		widgetCompositionClass.getEStructuralFeatures().add(ref);
	}
	
	/**
	 * Replace feature map entries by composition and derived references.
	 * 
	 * @param ePackage
	 *            {@link EPackage}
	 */
	protected void replaceTreeFeatureMapEntries(EPackage ePackage) {
		// init variables
		if (treeTypesClass == null) {
			treeTypesClass = (EClass) ePackage.getEClassifier(TREE_TYPES_ECLASS);
		}
		if (clipPathTypesClass == null) {
			clipPathTypesClass = (EClass) ePackage.getEClassifier(CLIP_PATH_TYPES_ECLASS);
		}

		// manage TreeType
		EClass treeClass = (EClass) ePackage.getEClassifier(TREE_TYPE_ECLASS);
		if (treeClass != null) {
			EStructuralFeature groupFeature = treeClass.getEStructuralFeature(GROUP_FEATURE);
			// update group feature type
			createReferenceTypedTreeTypes(treeClass, groupFeature);
			// update all existing references
			updateAllRepresentationReferences(treeClass, groupFeature);
			treeClass.getEStructuralFeatures().remove(groupFeature);
		}
	}

	/**
	 * Add widget composition reference in eClass
	 * 
	 * @param eClass
	 *            EClass
	 */
	protected void createWidgetCompositionReference(EClass eClass, EClass eType, EStructuralFeature featureToReplace) {
		EReference compositionReference = EcoreFactory.eINSTANCE.createEReference();
		compositionReference.setName(COMPOSITIONS_EREFERENCE);
		compositionReference.setEType(eType);
		compositionReference.setUpperBound(-1);
		BuilderUtil.updateReferenceAsDerived(compositionReference);
		if (featureToReplace != null) {
			eClass.getEStructuralFeatures().add(eClass.getEStructuralFeatures().indexOf(featureToReplace), compositionReference);
		} else {
			eClass.getEStructuralFeatures().add(compositionReference);
		}

	}

	/**
	 * Add widget composition reference in eClass
	 * 
	 * @param eClass
	 *            EClass
	 */
	protected void createWidgetCompositionReference(EClass eClass, EClass eType) {
		createWidgetCompositionReference(eClass, eType, null);

	}

	/**
	 * Update representation reference.
	 * 
	 * @param eClass
	 *            {@link EClass}
	 * @param attribute
	 *            {@link EAttribute}
	 */
	protected void updateAllRepresentationReferences(EClass eClass, EStructuralFeature attribute) {
		String nameAttribute = BuilderUtil.getFeatureMapEntryKindAttribute(attribute);
		if (nameAttribute != null) {
			// update all feature map references
			for (EReference reference : eClass.getEReferences()) {
				if (BuilderUtil.hasEAnnotationNameAttribute(nameAttribute, reference)) {
					EClass eTypeClass = (EClass) reference.getEType();
					if (isClipPathPrimitiveSubType(eTypeClass)) {
						eTypeClass.getESuperTypes().add(clipPathTypesClass);
					} else {
						eTypeClass.getESuperTypes().add(treeTypesClass);
					}
					// manage reference.getEType()
					EStructuralFeature groupFeature = eTypeClass.getEStructuralFeature(CHILD_ELEMENTS_FEATURE);
					if (groupFeature == null) {
						groupFeature = eTypeClass.getEStructuralFeature(GROUP_FEATURE);
					}
					if (groupFeature != null) {
						updateRepresentationReferences(eTypeClass, groupFeature);
					}
					// add widget composition reference if needed
					EStructuralFeature anyFeature = eTypeClass.getEStructuralFeature(BuilderUtil.ANY_FEATURE);
					if (anyFeature != null) {
						createWidgetCompositionReference(eTypeClass, widgetCompositionClass, anyFeature);
						eTypeClass.getEStructuralFeatures().remove(anyFeature);
					}
				}
			}
			EStructuralFeature anyFeature = eClass.getEStructuralFeature(BuilderUtil.ANY_FEATURE);
			if (anyFeature != null) {
				eClass.getEStructuralFeatures().remove(anyFeature);
			}
			// update eClass references
			ecoreBuilder.updateAllReferencesAsDerived(eClass, attribute);
		}
	}

	/**
	 * Update representation references.
	 * 
	 * @param eClass
	 *            {@link EClass}
	 * @param attribute
	 *            {@link EAttribute}
	 */
	protected void updateRepresentationReferences(EClass eClass, EStructuralFeature attribute) {
		// create composition
		createReferenceTypedTreeTypes(eClass, attribute);
		// update all existing references
		ecoreBuilder.updateAllReferencesAsDerived(eClass, attribute);
		// remove EFeatureMapEntry attribute
		eClass.getEStructuralFeatures().remove(attribute);
	}

	/**
	 * @param eClass
	 *            {@link EClass}
	 * @return if eClass is clipPathPrimitive sub type
	 */
	protected boolean isClipPathPrimitiveSubType(EClass eClass) {
		return RECT_PRIMITIVE_ECLASS.equals(eClass.getName()) || 
				CIRCLE_PRIMITIVE_ECLASS.equals(eClass.getName()) || 
				ELLIPSE_PRIMITIVE_ECLASS.equals(eClass.getName()) || 
				LINE_PRIMITIVE_ECLASS.equals(eClass.getName()) || 
				PATH_PRIMITIVE_ECLASS.equals(eClass.getName());
	}

	/**
	 * Replace feature map entry reference as composition.
	 * 
	 * @param eClass
	 *            {@link EClass}
	 * @param groupFeature
	 *            {@link EStructuralFeature}
	 */
	protected void createReferenceTypedTreeTypes(EClass eClass, EStructuralFeature groupFeature) {
		EReference groupReference = EcoreFactory.eINSTANCE.createEReference();
		groupReference.setName(groupFeature.getName());
		if (CLIP_PATH_PRIMITIVE_ECLASS.equals(eClass.getName())) {
			groupReference.setEType(clipPathTypesClass);
		} else {
			groupReference.setEType(treeTypesClass);
		}
		groupReference.setUpperBound(-1);
		BuilderUtil.updateReferenceAsComposition(groupReference);
		eClass.getEStructuralFeatures().add(0, groupReference);
	}
}
