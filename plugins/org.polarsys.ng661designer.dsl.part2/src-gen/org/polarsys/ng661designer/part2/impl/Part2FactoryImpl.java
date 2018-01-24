/**
 * Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.part2.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.polarsys.ng661designer.part2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Part2FactoryImpl extends EFactoryImpl implements Part2Factory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Part2Factory init() {
		try {
			Part2Factory thePart2Factory = (Part2Factory)EPackage.Registry.INSTANCE.getEFactory(Part2Package.eNS_URI);
			if (thePart2Factory != null) {
				return thePart2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Part2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Part2Package.ARC_COMPONENT: return createArcComponent();
			case Part2Package.ARRAY_DEFINITION_TYPE: return createArrayDefinitionType();
			case Part2Package.ARRAY_ENTRY_TYPE: return createArrayEntryType();
			case Part2Package.ARRAY_EVENT_TYPE: return createArrayEventType();
			case Part2Package.ARRAY_FIELD_DEFINITION_TYPE: return createArrayFieldDefinitionType();
			case Part2Package.ARRAY_FIELD_TYPE: return createArrayFieldType();
			case Part2Package.ARRAY_PROPERTY_TYPE: return createArrayPropertyType();
			case Part2Package.BEHAVIOR_TYPE: return createBehaviorType();
			case Part2Package.CHILD_PRIMITIVE: return createChildPrimitive();
			case Part2Package.CIRCLE_PRIMITIVE: return createCirclePrimitive();
			case Part2Package.CLIP_PATH_PRIMITIVE: return createClipPathPrimitive();
			case Part2Package.CLIPPING_CONTAINER_PRIMITIVE: return createClippingContainerPrimitive();
			case Part2Package.CLOCK_TYPE: return createClockType();
			case Part2Package.CLOSE_PATH_COMMAND: return createClosePathCommand();
			case Part2Package.COMPONENT_DEFINITION_TYPE: return createComponentDefinitionType();
			case Part2Package.CROWN_COMPONENT: return createCrownComponent();
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND: return createCubicBezierCurveCommand();
			case Part2Package.CUSTOM_INTEGER_TYPE_ELEMENT_TYPE: return createCustomIntegerTypeElementType();
			case Part2Package.CUSTOM_REAL_TYPE_ELEMENT_TYPE: return createCustomRealTypeElementType();
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE: return createCustomStringTypeElementType();
			case Part2Package.DEFINITIONS_TYPE: return createDefinitionsType();
			case Part2Package.DEFINITION_TYPE: return createDefinitionType();
			case Part2Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND: return createEllipseArcCurveCommand();
			case Part2Package.ELLIPSE_PRIMITIVE: return createEllipsePrimitive();
			case Part2Package.ENTRY_TYPE: return createEntryType();
			case Part2Package.ENUM_DEFINITION_TYPE: return createEnumDefinitionType();
			case Part2Package.ENUMERATION_TYPE: return createEnumerationType();
			case Part2Package.EVENT_TYPE: return createEventType();
			case Part2Package.FIELD_DEFINITION_TYPE: return createFieldDefinitionType();
			case Part2Package.FIELD_TYPE: return createFieldType();
			case Part2Package.FRAME_PROPERTIES: return createFrameProperties();
			case Part2Package.FUNCTION_TYPE: return createFunctionType();
			case Part2Package.GESTURE_AREA_PRIMITIVE: return createGestureAreaPrimitive();
			case Part2Package.GROUP_PRIMITIVE: return createGroupPrimitive();
			case Part2Package.IMAGE_PRIMITIVE: return createImagePrimitive();
			case Part2Package.IMPORT_TYPE: return createImportType();
			case Part2Package.INTERFACE_TYPE: return createInterfaceType();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE: return createKeyboardInputPrimitive();
			case Part2Package.LINE_PRIMITIVE: return createLinePrimitive();
			case Part2Package.LINE_TO_COMMAND: return createLineToCommand();
			case Part2Package.MOVE_TO_COMMAND: return createMoveToCommand();
			case Part2Package.OPERATION_TYPE: return createOperationType();
			case Part2Package.OTHER_ARRAY_ENTRIES_TYPE: return createOtherArrayEntriesType();
			case Part2Package.OTHER_ENTRIES_TYPE: return createOtherEntriesType();
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE: return createOtherStructEntriesType();
			case Part2Package.OTHER_UNION_ENTRIES_TYPE: return createOtherUnionEntriesType();
			case Part2Package.PARAM_TYPE: return createParamType();
			case Part2Package.PATH_ARRAY: return createPathArray();
			case Part2Package.PATH_PRIMITIVE: return createPathPrimitive();
			case Part2Package.POINTER_AREA_PRIMITIVE: return createPointerAreaPrimitive();
			case Part2Package.POINTER_GESTURE_AREA_PRIMITIVE: return createPointerGestureAreaPrimitive();
			case Part2Package.POINT_TYPE: return createPointType();
			case Part2Package.POLAR_LINE_COMPONENT: return createPolarLineComponent();
			case Part2Package.POLYGON_PRIMITIVE: return createPolygonPrimitive();
			case Part2Package.POLYLINE_PRIMITIVE: return createPolylinePrimitive();
			case Part2Package.POSITION_LIST_TYPE: return createPositionListType();
			case Part2Package.PRIVATE_PROPERTY_TYPE: return createPrivatePropertyType();
			case Part2Package.PROPERTY_TYPE: return createPropertyType();
			case Part2Package.RECT_PRIMITIVE: return createRectPrimitive();
			case Part2Package.RELATIVE_CLOSE_PATH_COMMAND: return createRelativeClosePathCommand();
			case Part2Package.RELATIVE_CUBIC_BEZIER_CURVE_COMMAND: return createRelativeCubicBezierCurveCommand();
			case Part2Package.RELATIVE_ELLIPSE_ARC_CURVE_COMMAND: return createRelativeEllipseArcCurveCommand();
			case Part2Package.RELATIVE_LINE_TO_COMMAND: return createRelativeLineToCommand();
			case Part2Package.RELATIVE_MOVE_TO_COMMAND: return createRelativeMoveToCommand();
			case Part2Package.REPLICATE_PRIMITIVE: return createReplicatePrimitive();
			case Part2Package.REVERSE_VIDEO_PROPERTIES: return createReverseVideoProperties();
			case Part2Package.SCROLL_WHEEL_INPUT_PRIMITIVE: return createScrollWheelInputPrimitive();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE: return createSimpleTextPrimitive();
			case Part2Package.STRIKE_THROUGH_PROPERTIES: return createStrikeThroughProperties();
			case Part2Package.STRUCT_DEFINITION_TYPE: return createStructDefinitionType();
			case Part2Package.STRUCT_ENTRY_TYPE: return createStructEntryType();
			case Part2Package.STRUCT_EVENT_TYPE: return createStructEventType();
			case Part2Package.STRUCT_FIELD_TYPE: return createStructFieldType();
			case Part2Package.STRUCT_PROPERTY_TYPE: return createStructPropertyType();
			case Part2Package.SWITCH_NODE_PRIMITIVE: return createSwitchNodePrimitive();
			case Part2Package.TOUCH_AREA_PRIMITIVE: return createTouchAreaPrimitive();
			case Part2Package.TRANSFORM_GROUP_PRIMITIVE: return createTransformGroupPrimitive();
			case Part2Package.TRANSFORM_MATRIX_TYPE: return createTransformMatrixType();
			case Part2Package.TRANSFORM_ROTATE_TYPE: return createTransformRotateType();
			case Part2Package.TRANSFORM_SCALE_TYPE: return createTransformScaleType();
			case Part2Package.TRANSFORM_SKEW_XTYPE: return createTransformSkewXType();
			case Part2Package.TRANSFORM_SKEW_YTYPE: return createTransformSkewYType();
			case Part2Package.TRANSFORM_TRANSLATE_TYPE: return createTransformTranslateType();
			case Part2Package.TRANSFORM_TYPE: return createTransformType();
			case Part2Package.TREE_TYPE: return createTreeType();
			case Part2Package.TYPE_ALTERNATIVE_TYPE: return createTypeAlternativeType();
			case Part2Package.UNDERLINE_PROPERTIES: return createUnderlineProperties();
			case Part2Package.UNION_DEFINITION_TYPE: return createUnionDefinitionType();
			case Part2Package.UNION_ENTRY_TYPE: return createUnionEntryType();
			case Part2Package.UNION_EVENT_TYPE: return createUnionEventType();
			case Part2Package.UNION_FIELD_TYPE: return createUnionFieldType();
			case Part2Package.UNION_PROPERTY_TYPE: return createUnionPropertyType();
			case Part2Package.PROPERTY_VALUE: return createPropertyValue();
			case Part2Package.WIDGET_COMPOSITION: return createWidgetComposition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Part2Package.ALIGNEMENT_TYPE_VAL:
				return createAlignementTypeValFromString(eDataType, initialValue);
			case Part2Package.ALIGNMENT_TYPE:
				return createAlignmentTypeFromString(eDataType, initialValue);
			case Part2Package.ALIGNMENT_TYPE1:
				return createAlignmentType1FromString(eDataType, initialValue);
			case Part2Package.ASPECT_RATIO_TYPE1:
				return createAspectRatioType1FromString(eDataType, initialValue);
			case Part2Package.ASPECT_RATIO_TYPE_VAL:
				return createAspectRatioTypeValFromString(eDataType, initialValue);
			case Part2Package.BOOLEAN_TYPE_VAL:
				return createBooleanTypeValFromString(eDataType, initialValue);
			case Part2Package.CLIP_RULE_TYPE:
				return createClipRuleTypeFromString(eDataType, initialValue);
			case Part2Package.COLOR_REFERENCE_TYPE:
				return createColorReferenceTypeFromString(eDataType, initialValue);
			case Part2Package.FILL_RULE_TYPE1:
				return createFillRuleType1FromString(eDataType, initialValue);
			case Part2Package.FILL_RULE_TYPE_VAL:
				return createFillRuleTypeValFromString(eDataType, initialValue);
			case Part2Package.FLOW_DIRECTION_TYPE:
				return createFlowDirectionTypeFromString(eDataType, initialValue);
			case Part2Package.INSTANTIATION_MODE_TYPE:
				return createInstantiationModeTypeFromString(eDataType, initialValue);
			case Part2Package.MODALITY_TYPE:
				return createModalityTypeFromString(eDataType, initialValue);
			case Part2Package.MODALITY_TYPE1:
				return createModalityType1FromString(eDataType, initialValue);
			case Part2Package.MODALITY_TYPE2:
				return createModalityType2FromString(eDataType, initialValue);
			case Part2Package.MULTILINE_MODE_TYPE:
				return createMultilineModeTypeFromString(eDataType, initialValue);
			case Part2Package.STROKE_LINECAP_TYPE:
				return createStrokeLinecapTypeFromString(eDataType, initialValue);
			case Part2Package.STROKE_LINEJOIN_TYPE:
				return createStrokeLinejoinTypeFromString(eDataType, initialValue);
			case Part2Package.TEXT_FLOW_TYPE:
				return createTextFlowTypeFromString(eDataType, initialValue);
			case Part2Package.VISIBILITY_TYPE_VAL:
				return createVisibilityTypeValFromString(eDataType, initialValue);
			case Part2Package.ALIGNEMENT_TYPE:
				return createAlignementTypeFromString(eDataType, initialValue);
			case Part2Package.ALIGNEMENT_TYPE_VAL_OBJECT:
				return createAlignementTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.ALIGNMENT_TYPE_OBJECT:
				return createAlignmentTypeObjectFromString(eDataType, initialValue);
			case Part2Package.ALIGNMENT_TYPE_OBJECT1:
				return createAlignmentTypeObject1FromString(eDataType, initialValue);
			case Part2Package.ANGLE_TYPE:
				return createAngleTypeFromString(eDataType, initialValue);
			case Part2Package.ANGLE_TYPE_VAL:
				return createAngleTypeValFromString(eDataType, initialValue);
			case Part2Package.ANGLE_TYPE_VAL_OBJECT:
				return createAngleTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.ASPECT_RATIO_TYPE:
				return createAspectRatioTypeFromString(eDataType, initialValue);
			case Part2Package.ASPECT_RATIO_TYPE_OBJECT:
				return createAspectRatioTypeObjectFromString(eDataType, initialValue);
			case Part2Package.ASPECT_RATIO_TYPE_VAL_OBJECT:
				return createAspectRatioTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.BOOLEAN_TYPE:
				return createBooleanTypeFromString(eDataType, initialValue);
			case Part2Package.BOOLEAN_TYPE_VAL_OBJECT:
				return createBooleanTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.CHARACTER_TYPE:
				return createCharacterTypeFromString(eDataType, initialValue);
			case Part2Package.CLIP_RULE_TYPE_OBJECT:
				return createClipRuleTypeObjectFromString(eDataType, initialValue);
			case Part2Package.COLOR_REFERENCE_TYPE_OBJECT:
				return createColorReferenceTypeObjectFromString(eDataType, initialValue);
			case Part2Package.COLOR_RGBHEX_TYPE:
				return createColorRGBHEXTypeFromString(eDataType, initialValue);
			case Part2Package.COLOR_RGB_RGB255_TYPE:
				return createColorRGBRgb255TypeFromString(eDataType, initialValue);
			case Part2Package.COLOR_RGB_RGB_PERCENT_TYPE:
				return createColorRGBRgbPercentTypeFromString(eDataType, initialValue);
			case Part2Package.COLOR_RGB_TYPE:
				return createColorRGBTypeFromString(eDataType, initialValue);
			case Part2Package.COLOR_TYPE:
				return createColorTypeFromString(eDataType, initialValue);
			case Part2Package.DATE_TIME_TYPE:
				return createDateTimeTypeFromString(eDataType, initialValue);
			case Part2Package.DATE_TYPE:
				return createDateTypeFromString(eDataType, initialValue);
			case Part2Package.DISTANCE_TYPE:
				return createDistanceTypeFromString(eDataType, initialValue);
			case Part2Package.EXPRESSION:
				return createExpressionFromString(eDataType, initialValue);
			case Part2Package.FILL_RULE_TYPE:
				return createFillRuleTypeFromString(eDataType, initialValue);
			case Part2Package.FILL_RULE_TYPE_OBJECT:
				return createFillRuleTypeObjectFromString(eDataType, initialValue);
			case Part2Package.FILL_RULE_TYPE_VAL_OBJECT:
				return createFillRuleTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.FLOW_DIRECTION_TYPE_OBJECT:
				return createFlowDirectionTypeObjectFromString(eDataType, initialValue);
			case Part2Package.FONT_TYPE:
				return createFontTypeFromString(eDataType, initialValue);
			case Part2Package.FORMAT_STRING_TYPE:
				return createFormatStringTypeFromString(eDataType, initialValue);
			case Part2Package.FORMAT_STRING_TYPE_VAL:
				return createFormatStringTypeValFromString(eDataType, initialValue);
			case Part2Package.FREQUENCY_TYPE:
				return createFrequencyTypeFromString(eDataType, initialValue);
			case Part2Package.FREQUENCY_TYPE_VAL:
				return createFrequencyTypeValFromString(eDataType, initialValue);
			case Part2Package.FREQUENCY_TYPE_VAL_OBJECT:
				return createFrequencyTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.IMAGE_TYPE:
				return createImageTypeFromString(eDataType, initialValue);
			case Part2Package.INSTANTIATION_MODE_TYPE_OBJECT:
				return createInstantiationModeTypeObjectFromString(eDataType, initialValue);
			case Part2Package.INTEGER_TYPE:
				return createIntegerTypeFromString(eDataType, initialValue);
			case Part2Package.MODALITY_TYPE_OBJECT:
				return createModalityTypeObjectFromString(eDataType, initialValue);
			case Part2Package.MODALITY_TYPE_OBJECT1:
				return createModalityTypeObject1FromString(eDataType, initialValue);
			case Part2Package.MODALITY_TYPE_OBJECT2:
				return createModalityTypeObject2FromString(eDataType, initialValue);
			case Part2Package.MULTILINE_MODE_TYPE_OBJECT:
				return createMultilineModeTypeObjectFromString(eDataType, initialValue);
			case Part2Package.NAME_TYPE:
				return createNameTypeFromString(eDataType, initialValue);
			case Part2Package.OBJECT_TYPE:
				return createObjectTypeFromString(eDataType, initialValue);
			case Part2Package.OPACITY_TYPE:
				return createOpacityTypeFromString(eDataType, initialValue);
			case Part2Package.OPACITY_TYPE_VAL:
				return createOpacityTypeValFromString(eDataType, initialValue);
			case Part2Package.OPACITY_TYPE_VAL_OBJECT:
				return createOpacityTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.POSITION_TYPE:
				return createPositionTypeFromString(eDataType, initialValue);
			case Part2Package.PRESSURE_TYPE:
				return createPressureTypeFromString(eDataType, initialValue);
			case Part2Package.PRESSURE_TYPE_VAL:
				return createPressureTypeValFromString(eDataType, initialValue);
			case Part2Package.PRESSURE_TYPE_VAL_OBJECT:
				return createPressureTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.REAL_TYPE:
				return createRealTypeFromString(eDataType, initialValue);
			case Part2Package.STIPPLE_TYPE:
				return createStippleTypeFromString(eDataType, initialValue);
			case Part2Package.STRING_TYPE:
				return createStringTypeFromString(eDataType, initialValue);
			case Part2Package.STROKE_LINECAP_TYPE_OBJECT:
				return createStrokeLinecapTypeObjectFromString(eDataType, initialValue);
			case Part2Package.STROKE_LINEJOIN_TYPE_OBJECT:
				return createStrokeLinejoinTypeObjectFromString(eDataType, initialValue);
			case Part2Package.TEXT_FLOW_TYPE_OBJECT:
				return createTextFlowTypeObjectFromString(eDataType, initialValue);
			case Part2Package.TIME_DEFAULTMILLISECONDS_TYPE:
				return createTimeDefaultmillisecondsTypeFromString(eDataType, initialValue);
			case Part2Package.TIME_HOURS_TYPE:
				return createTimeHoursTypeFromString(eDataType, initialValue);
			case Part2Package.TIME_MINUTES_TYPE:
				return createTimeMinutesTypeFromString(eDataType, initialValue);
			case Part2Package.TIME_SECONDS_OR_SUBSECONDS_TYPE:
				return createTimeSecondsOrSubsecondsTypeFromString(eDataType, initialValue);
			case Part2Package.TIME_TYPE:
				return createTimeTypeFromString(eDataType, initialValue);
			case Part2Package.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case Part2Package.VELOCITY_TYPE:
				return createVelocityTypeFromString(eDataType, initialValue);
			case Part2Package.VELOCITY_TYPE_OBJECT:
				return createVelocityTypeObjectFromString(eDataType, initialValue);
			case Part2Package.VISIBILITY_TYPE:
				return createVisibilityTypeFromString(eDataType, initialValue);
			case Part2Package.VISIBILITY_TYPE_VAL_OBJECT:
				return createVisibilityTypeValObjectFromString(eDataType, initialValue);
			case Part2Package.ZINDEX_TYPE:
				return createZIndexTypeFromString(eDataType, initialValue);
			case Part2Package.ZINDEX_TYPE_VAL:
				return createZIndexTypeValFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Part2Package.ALIGNEMENT_TYPE_VAL:
				return convertAlignementTypeValToString(eDataType, instanceValue);
			case Part2Package.ALIGNMENT_TYPE:
				return convertAlignmentTypeToString(eDataType, instanceValue);
			case Part2Package.ALIGNMENT_TYPE1:
				return convertAlignmentType1ToString(eDataType, instanceValue);
			case Part2Package.ASPECT_RATIO_TYPE1:
				return convertAspectRatioType1ToString(eDataType, instanceValue);
			case Part2Package.ASPECT_RATIO_TYPE_VAL:
				return convertAspectRatioTypeValToString(eDataType, instanceValue);
			case Part2Package.BOOLEAN_TYPE_VAL:
				return convertBooleanTypeValToString(eDataType, instanceValue);
			case Part2Package.CLIP_RULE_TYPE:
				return convertClipRuleTypeToString(eDataType, instanceValue);
			case Part2Package.COLOR_REFERENCE_TYPE:
				return convertColorReferenceTypeToString(eDataType, instanceValue);
			case Part2Package.FILL_RULE_TYPE1:
				return convertFillRuleType1ToString(eDataType, instanceValue);
			case Part2Package.FILL_RULE_TYPE_VAL:
				return convertFillRuleTypeValToString(eDataType, instanceValue);
			case Part2Package.FLOW_DIRECTION_TYPE:
				return convertFlowDirectionTypeToString(eDataType, instanceValue);
			case Part2Package.INSTANTIATION_MODE_TYPE:
				return convertInstantiationModeTypeToString(eDataType, instanceValue);
			case Part2Package.MODALITY_TYPE:
				return convertModalityTypeToString(eDataType, instanceValue);
			case Part2Package.MODALITY_TYPE1:
				return convertModalityType1ToString(eDataType, instanceValue);
			case Part2Package.MODALITY_TYPE2:
				return convertModalityType2ToString(eDataType, instanceValue);
			case Part2Package.MULTILINE_MODE_TYPE:
				return convertMultilineModeTypeToString(eDataType, instanceValue);
			case Part2Package.STROKE_LINECAP_TYPE:
				return convertStrokeLinecapTypeToString(eDataType, instanceValue);
			case Part2Package.STROKE_LINEJOIN_TYPE:
				return convertStrokeLinejoinTypeToString(eDataType, instanceValue);
			case Part2Package.TEXT_FLOW_TYPE:
				return convertTextFlowTypeToString(eDataType, instanceValue);
			case Part2Package.VISIBILITY_TYPE_VAL:
				return convertVisibilityTypeValToString(eDataType, instanceValue);
			case Part2Package.ALIGNEMENT_TYPE:
				return convertAlignementTypeToString(eDataType, instanceValue);
			case Part2Package.ALIGNEMENT_TYPE_VAL_OBJECT:
				return convertAlignementTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.ALIGNMENT_TYPE_OBJECT:
				return convertAlignmentTypeObjectToString(eDataType, instanceValue);
			case Part2Package.ALIGNMENT_TYPE_OBJECT1:
				return convertAlignmentTypeObject1ToString(eDataType, instanceValue);
			case Part2Package.ANGLE_TYPE:
				return convertAngleTypeToString(eDataType, instanceValue);
			case Part2Package.ANGLE_TYPE_VAL:
				return convertAngleTypeValToString(eDataType, instanceValue);
			case Part2Package.ANGLE_TYPE_VAL_OBJECT:
				return convertAngleTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.ASPECT_RATIO_TYPE:
				return convertAspectRatioTypeToString(eDataType, instanceValue);
			case Part2Package.ASPECT_RATIO_TYPE_OBJECT:
				return convertAspectRatioTypeObjectToString(eDataType, instanceValue);
			case Part2Package.ASPECT_RATIO_TYPE_VAL_OBJECT:
				return convertAspectRatioTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.BOOLEAN_TYPE:
				return convertBooleanTypeToString(eDataType, instanceValue);
			case Part2Package.BOOLEAN_TYPE_VAL_OBJECT:
				return convertBooleanTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.CHARACTER_TYPE:
				return convertCharacterTypeToString(eDataType, instanceValue);
			case Part2Package.CLIP_RULE_TYPE_OBJECT:
				return convertClipRuleTypeObjectToString(eDataType, instanceValue);
			case Part2Package.COLOR_REFERENCE_TYPE_OBJECT:
				return convertColorReferenceTypeObjectToString(eDataType, instanceValue);
			case Part2Package.COLOR_RGBHEX_TYPE:
				return convertColorRGBHEXTypeToString(eDataType, instanceValue);
			case Part2Package.COLOR_RGB_RGB255_TYPE:
				return convertColorRGBRgb255TypeToString(eDataType, instanceValue);
			case Part2Package.COLOR_RGB_RGB_PERCENT_TYPE:
				return convertColorRGBRgbPercentTypeToString(eDataType, instanceValue);
			case Part2Package.COLOR_RGB_TYPE:
				return convertColorRGBTypeToString(eDataType, instanceValue);
			case Part2Package.COLOR_TYPE:
				return convertColorTypeToString(eDataType, instanceValue);
			case Part2Package.DATE_TIME_TYPE:
				return convertDateTimeTypeToString(eDataType, instanceValue);
			case Part2Package.DATE_TYPE:
				return convertDateTypeToString(eDataType, instanceValue);
			case Part2Package.DISTANCE_TYPE:
				return convertDistanceTypeToString(eDataType, instanceValue);
			case Part2Package.EXPRESSION:
				return convertExpressionToString(eDataType, instanceValue);
			case Part2Package.FILL_RULE_TYPE:
				return convertFillRuleTypeToString(eDataType, instanceValue);
			case Part2Package.FILL_RULE_TYPE_OBJECT:
				return convertFillRuleTypeObjectToString(eDataType, instanceValue);
			case Part2Package.FILL_RULE_TYPE_VAL_OBJECT:
				return convertFillRuleTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.FLOW_DIRECTION_TYPE_OBJECT:
				return convertFlowDirectionTypeObjectToString(eDataType, instanceValue);
			case Part2Package.FONT_TYPE:
				return convertFontTypeToString(eDataType, instanceValue);
			case Part2Package.FORMAT_STRING_TYPE:
				return convertFormatStringTypeToString(eDataType, instanceValue);
			case Part2Package.FORMAT_STRING_TYPE_VAL:
				return convertFormatStringTypeValToString(eDataType, instanceValue);
			case Part2Package.FREQUENCY_TYPE:
				return convertFrequencyTypeToString(eDataType, instanceValue);
			case Part2Package.FREQUENCY_TYPE_VAL:
				return convertFrequencyTypeValToString(eDataType, instanceValue);
			case Part2Package.FREQUENCY_TYPE_VAL_OBJECT:
				return convertFrequencyTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.IMAGE_TYPE:
				return convertImageTypeToString(eDataType, instanceValue);
			case Part2Package.INSTANTIATION_MODE_TYPE_OBJECT:
				return convertInstantiationModeTypeObjectToString(eDataType, instanceValue);
			case Part2Package.INTEGER_TYPE:
				return convertIntegerTypeToString(eDataType, instanceValue);
			case Part2Package.MODALITY_TYPE_OBJECT:
				return convertModalityTypeObjectToString(eDataType, instanceValue);
			case Part2Package.MODALITY_TYPE_OBJECT1:
				return convertModalityTypeObject1ToString(eDataType, instanceValue);
			case Part2Package.MODALITY_TYPE_OBJECT2:
				return convertModalityTypeObject2ToString(eDataType, instanceValue);
			case Part2Package.MULTILINE_MODE_TYPE_OBJECT:
				return convertMultilineModeTypeObjectToString(eDataType, instanceValue);
			case Part2Package.NAME_TYPE:
				return convertNameTypeToString(eDataType, instanceValue);
			case Part2Package.OBJECT_TYPE:
				return convertObjectTypeToString(eDataType, instanceValue);
			case Part2Package.OPACITY_TYPE:
				return convertOpacityTypeToString(eDataType, instanceValue);
			case Part2Package.OPACITY_TYPE_VAL:
				return convertOpacityTypeValToString(eDataType, instanceValue);
			case Part2Package.OPACITY_TYPE_VAL_OBJECT:
				return convertOpacityTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.POSITION_TYPE:
				return convertPositionTypeToString(eDataType, instanceValue);
			case Part2Package.PRESSURE_TYPE:
				return convertPressureTypeToString(eDataType, instanceValue);
			case Part2Package.PRESSURE_TYPE_VAL:
				return convertPressureTypeValToString(eDataType, instanceValue);
			case Part2Package.PRESSURE_TYPE_VAL_OBJECT:
				return convertPressureTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.REAL_TYPE:
				return convertRealTypeToString(eDataType, instanceValue);
			case Part2Package.STIPPLE_TYPE:
				return convertStippleTypeToString(eDataType, instanceValue);
			case Part2Package.STRING_TYPE:
				return convertStringTypeToString(eDataType, instanceValue);
			case Part2Package.STROKE_LINECAP_TYPE_OBJECT:
				return convertStrokeLinecapTypeObjectToString(eDataType, instanceValue);
			case Part2Package.STROKE_LINEJOIN_TYPE_OBJECT:
				return convertStrokeLinejoinTypeObjectToString(eDataType, instanceValue);
			case Part2Package.TEXT_FLOW_TYPE_OBJECT:
				return convertTextFlowTypeObjectToString(eDataType, instanceValue);
			case Part2Package.TIME_DEFAULTMILLISECONDS_TYPE:
				return convertTimeDefaultmillisecondsTypeToString(eDataType, instanceValue);
			case Part2Package.TIME_HOURS_TYPE:
				return convertTimeHoursTypeToString(eDataType, instanceValue);
			case Part2Package.TIME_MINUTES_TYPE:
				return convertTimeMinutesTypeToString(eDataType, instanceValue);
			case Part2Package.TIME_SECONDS_OR_SUBSECONDS_TYPE:
				return convertTimeSecondsOrSubsecondsTypeToString(eDataType, instanceValue);
			case Part2Package.TIME_TYPE:
				return convertTimeTypeToString(eDataType, instanceValue);
			case Part2Package.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case Part2Package.VELOCITY_TYPE:
				return convertVelocityTypeToString(eDataType, instanceValue);
			case Part2Package.VELOCITY_TYPE_OBJECT:
				return convertVelocityTypeObjectToString(eDataType, instanceValue);
			case Part2Package.VISIBILITY_TYPE:
				return convertVisibilityTypeToString(eDataType, instanceValue);
			case Part2Package.VISIBILITY_TYPE_VAL_OBJECT:
				return convertVisibilityTypeValObjectToString(eDataType, instanceValue);
			case Part2Package.ZINDEX_TYPE:
				return convertZIndexTypeToString(eDataType, instanceValue);
			case Part2Package.ZINDEX_TYPE_VAL:
				return convertZIndexTypeValToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcComponent createArcComponent() {
		ArcComponentImpl arcComponent = new ArcComponentImpl();
		return arcComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDefinitionType createArrayDefinitionType() {
		ArrayDefinitionTypeImpl arrayDefinitionType = new ArrayDefinitionTypeImpl();
		return arrayDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayEntryType createArrayEntryType() {
		ArrayEntryTypeImpl arrayEntryType = new ArrayEntryTypeImpl();
		return arrayEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayEventType createArrayEventType() {
		ArrayEventTypeImpl arrayEventType = new ArrayEventTypeImpl();
		return arrayEventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayFieldDefinitionType createArrayFieldDefinitionType() {
		ArrayFieldDefinitionTypeImpl arrayFieldDefinitionType = new ArrayFieldDefinitionTypeImpl();
		return arrayFieldDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayFieldType createArrayFieldType() {
		ArrayFieldTypeImpl arrayFieldType = new ArrayFieldTypeImpl();
		return arrayFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayPropertyType createArrayPropertyType() {
		ArrayPropertyTypeImpl arrayPropertyType = new ArrayPropertyTypeImpl();
		return arrayPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorType createBehaviorType() {
		BehaviorTypeImpl behaviorType = new BehaviorTypeImpl();
		return behaviorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildPrimitive createChildPrimitive() {
		ChildPrimitiveImpl childPrimitive = new ChildPrimitiveImpl();
		return childPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CirclePrimitive createCirclePrimitive() {
		CirclePrimitiveImpl circlePrimitive = new CirclePrimitiveImpl();
		return circlePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClipPathPrimitive createClipPathPrimitive() {
		ClipPathPrimitiveImpl clipPathPrimitive = new ClipPathPrimitiveImpl();
		return clipPathPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClippingContainerPrimitive createClippingContainerPrimitive() {
		ClippingContainerPrimitiveImpl clippingContainerPrimitive = new ClippingContainerPrimitiveImpl();
		return clippingContainerPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockType createClockType() {
		ClockTypeImpl clockType = new ClockTypeImpl();
		return clockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosePathCommand createClosePathCommand() {
		ClosePathCommandImpl closePathCommand = new ClosePathCommandImpl();
		return closePathCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionType createComponentDefinitionType() {
		ComponentDefinitionTypeImpl componentDefinitionType = new ComponentDefinitionTypeImpl();
		return componentDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrownComponent createCrownComponent() {
		CrownComponentImpl crownComponent = new CrownComponentImpl();
		return crownComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubicBezierCurveCommand createCubicBezierCurveCommand() {
		CubicBezierCurveCommandImpl cubicBezierCurveCommand = new CubicBezierCurveCommandImpl();
		return cubicBezierCurveCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomIntegerTypeElementType createCustomIntegerTypeElementType() {
		CustomIntegerTypeElementTypeImpl customIntegerTypeElementType = new CustomIntegerTypeElementTypeImpl();
		return customIntegerTypeElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomRealTypeElementType createCustomRealTypeElementType() {
		CustomRealTypeElementTypeImpl customRealTypeElementType = new CustomRealTypeElementTypeImpl();
		return customRealTypeElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomStringTypeElementType createCustomStringTypeElementType() {
		CustomStringTypeElementTypeImpl customStringTypeElementType = new CustomStringTypeElementTypeImpl();
		return customStringTypeElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionsType createDefinitionsType() {
		DefinitionsTypeImpl definitionsType = new DefinitionsTypeImpl();
		return definitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionType createDefinitionType() {
		DefinitionTypeImpl definitionType = new DefinitionTypeImpl();
		return definitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipseArcCurveCommand createEllipseArcCurveCommand() {
		EllipseArcCurveCommandImpl ellipseArcCurveCommand = new EllipseArcCurveCommandImpl();
		return ellipseArcCurveCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipsePrimitive createEllipsePrimitive() {
		EllipsePrimitiveImpl ellipsePrimitive = new EllipsePrimitiveImpl();
		return ellipsePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryType createEntryType() {
		EntryTypeImpl entryType = new EntryTypeImpl();
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDefinitionType createEnumDefinitionType() {
		EnumDefinitionTypeImpl enumDefinitionType = new EnumDefinitionTypeImpl();
		return enumDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType createEnumerationType() {
		EnumerationTypeImpl enumerationType = new EnumerationTypeImpl();
		return enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventType() {
		EventTypeImpl eventType = new EventTypeImpl();
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDefinitionType createFieldDefinitionType() {
		FieldDefinitionTypeImpl fieldDefinitionType = new FieldDefinitionTypeImpl();
		return fieldDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldType createFieldType() {
		FieldTypeImpl fieldType = new FieldTypeImpl();
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameProperties createFrameProperties() {
		FramePropertiesImpl frameProperties = new FramePropertiesImpl();
		return frameProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionType() {
		FunctionTypeImpl functionType = new FunctionTypeImpl();
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GestureAreaPrimitive createGestureAreaPrimitive() {
		GestureAreaPrimitiveImpl gestureAreaPrimitive = new GestureAreaPrimitiveImpl();
		return gestureAreaPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupPrimitive createGroupPrimitive() {
		GroupPrimitiveImpl groupPrimitive = new GroupPrimitiveImpl();
		return groupPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagePrimitive createImagePrimitive() {
		ImagePrimitiveImpl imagePrimitive = new ImagePrimitiveImpl();
		return imagePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportType createImportType() {
		ImportTypeImpl importType = new ImportTypeImpl();
		return importType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType createInterfaceType() {
		InterfaceTypeImpl interfaceType = new InterfaceTypeImpl();
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyboardInputPrimitive createKeyboardInputPrimitive() {
		KeyboardInputPrimitiveImpl keyboardInputPrimitive = new KeyboardInputPrimitiveImpl();
		return keyboardInputPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinePrimitive createLinePrimitive() {
		LinePrimitiveImpl linePrimitive = new LinePrimitiveImpl();
		return linePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineToCommand createLineToCommand() {
		LineToCommandImpl lineToCommand = new LineToCommandImpl();
		return lineToCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveToCommand createMoveToCommand() {
		MoveToCommandImpl moveToCommand = new MoveToCommandImpl();
		return moveToCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationType() {
		OperationTypeImpl operationType = new OperationTypeImpl();
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherArrayEntriesType createOtherArrayEntriesType() {
		OtherArrayEntriesTypeImpl otherArrayEntriesType = new OtherArrayEntriesTypeImpl();
		return otherArrayEntriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherEntriesType createOtherEntriesType() {
		OtherEntriesTypeImpl otherEntriesType = new OtherEntriesTypeImpl();
		return otherEntriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherStructEntriesType createOtherStructEntriesType() {
		OtherStructEntriesTypeImpl otherStructEntriesType = new OtherStructEntriesTypeImpl();
		return otherStructEntriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherUnionEntriesType createOtherUnionEntriesType() {
		OtherUnionEntriesTypeImpl otherUnionEntriesType = new OtherUnionEntriesTypeImpl();
		return otherUnionEntriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamType createParamType() {
		ParamTypeImpl paramType = new ParamTypeImpl();
		return paramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathArray createPathArray() {
		PathArrayImpl pathArray = new PathArrayImpl();
		return pathArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPrimitive createPathPrimitive() {
		PathPrimitiveImpl pathPrimitive = new PathPrimitiveImpl();
		return pathPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerAreaPrimitive createPointerAreaPrimitive() {
		PointerAreaPrimitiveImpl pointerAreaPrimitive = new PointerAreaPrimitiveImpl();
		return pointerAreaPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerGestureAreaPrimitive createPointerGestureAreaPrimitive() {
		PointerGestureAreaPrimitiveImpl pointerGestureAreaPrimitive = new PointerGestureAreaPrimitiveImpl();
		return pointerGestureAreaPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointType createPointType() {
		PointTypeImpl pointType = new PointTypeImpl();
		return pointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarLineComponent createPolarLineComponent() {
		PolarLineComponentImpl polarLineComponent = new PolarLineComponentImpl();
		return polarLineComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonPrimitive createPolygonPrimitive() {
		PolygonPrimitiveImpl polygonPrimitive = new PolygonPrimitiveImpl();
		return polygonPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolylinePrimitive createPolylinePrimitive() {
		PolylinePrimitiveImpl polylinePrimitive = new PolylinePrimitiveImpl();
		return polylinePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionListType createPositionListType() {
		PositionListTypeImpl positionListType = new PositionListTypeImpl();
		return positionListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivatePropertyType createPrivatePropertyType() {
		PrivatePropertyTypeImpl privatePropertyType = new PrivatePropertyTypeImpl();
		return privatePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectPrimitive createRectPrimitive() {
		RectPrimitiveImpl rectPrimitive = new RectPrimitiveImpl();
		return rectPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeClosePathCommand createRelativeClosePathCommand() {
		RelativeClosePathCommandImpl relativeClosePathCommand = new RelativeClosePathCommandImpl();
		return relativeClosePathCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeCubicBezierCurveCommand createRelativeCubicBezierCurveCommand() {
		RelativeCubicBezierCurveCommandImpl relativeCubicBezierCurveCommand = new RelativeCubicBezierCurveCommandImpl();
		return relativeCubicBezierCurveCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeEllipseArcCurveCommand createRelativeEllipseArcCurveCommand() {
		RelativeEllipseArcCurveCommandImpl relativeEllipseArcCurveCommand = new RelativeEllipseArcCurveCommandImpl();
		return relativeEllipseArcCurveCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeLineToCommand createRelativeLineToCommand() {
		RelativeLineToCommandImpl relativeLineToCommand = new RelativeLineToCommandImpl();
		return relativeLineToCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeMoveToCommand createRelativeMoveToCommand() {
		RelativeMoveToCommandImpl relativeMoveToCommand = new RelativeMoveToCommandImpl();
		return relativeMoveToCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplicatePrimitive createReplicatePrimitive() {
		ReplicatePrimitiveImpl replicatePrimitive = new ReplicatePrimitiveImpl();
		return replicatePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReverseVideoProperties createReverseVideoProperties() {
		ReverseVideoPropertiesImpl reverseVideoProperties = new ReverseVideoPropertiesImpl();
		return reverseVideoProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrollWheelInputPrimitive createScrollWheelInputPrimitive() {
		ScrollWheelInputPrimitiveImpl scrollWheelInputPrimitive = new ScrollWheelInputPrimitiveImpl();
		return scrollWheelInputPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTextPrimitive createSimpleTextPrimitive() {
		SimpleTextPrimitiveImpl simpleTextPrimitive = new SimpleTextPrimitiveImpl();
		return simpleTextPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrikeThroughProperties createStrikeThroughProperties() {
		StrikeThroughPropertiesImpl strikeThroughProperties = new StrikeThroughPropertiesImpl();
		return strikeThroughProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructDefinitionType createStructDefinitionType() {
		StructDefinitionTypeImpl structDefinitionType = new StructDefinitionTypeImpl();
		return structDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructEntryType createStructEntryType() {
		StructEntryTypeImpl structEntryType = new StructEntryTypeImpl();
		return structEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructEventType createStructEventType() {
		StructEventTypeImpl structEventType = new StructEventTypeImpl();
		return structEventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructFieldType createStructFieldType() {
		StructFieldTypeImpl structFieldType = new StructFieldTypeImpl();
		return structFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructPropertyType createStructPropertyType() {
		StructPropertyTypeImpl structPropertyType = new StructPropertyTypeImpl();
		return structPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchNodePrimitive createSwitchNodePrimitive() {
		SwitchNodePrimitiveImpl switchNodePrimitive = new SwitchNodePrimitiveImpl();
		return switchNodePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchAreaPrimitive createTouchAreaPrimitive() {
		TouchAreaPrimitiveImpl touchAreaPrimitive = new TouchAreaPrimitiveImpl();
		return touchAreaPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformGroupPrimitive createTransformGroupPrimitive() {
		TransformGroupPrimitiveImpl transformGroupPrimitive = new TransformGroupPrimitiveImpl();
		return transformGroupPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformMatrixType createTransformMatrixType() {
		TransformMatrixTypeImpl transformMatrixType = new TransformMatrixTypeImpl();
		return transformMatrixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformRotateType createTransformRotateType() {
		TransformRotateTypeImpl transformRotateType = new TransformRotateTypeImpl();
		return transformRotateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformScaleType createTransformScaleType() {
		TransformScaleTypeImpl transformScaleType = new TransformScaleTypeImpl();
		return transformScaleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformSkewXType createTransformSkewXType() {
		TransformSkewXTypeImpl transformSkewXType = new TransformSkewXTypeImpl();
		return transformSkewXType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformSkewYType createTransformSkewYType() {
		TransformSkewYTypeImpl transformSkewYType = new TransformSkewYTypeImpl();
		return transformSkewYType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformTranslateType createTransformTranslateType() {
		TransformTranslateTypeImpl transformTranslateType = new TransformTranslateTypeImpl();
		return transformTranslateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformType createTransformType() {
		TransformTypeImpl transformType = new TransformTypeImpl();
		return transformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeType createTreeType() {
		TreeTypeImpl treeType = new TreeTypeImpl();
		return treeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAlternativeType createTypeAlternativeType() {
		TypeAlternativeTypeImpl typeAlternativeType = new TypeAlternativeTypeImpl();
		return typeAlternativeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnderlineProperties createUnderlineProperties() {
		UnderlinePropertiesImpl underlineProperties = new UnderlinePropertiesImpl();
		return underlineProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionDefinitionType createUnionDefinitionType() {
		UnionDefinitionTypeImpl unionDefinitionType = new UnionDefinitionTypeImpl();
		return unionDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionEntryType createUnionEntryType() {
		UnionEntryTypeImpl unionEntryType = new UnionEntryTypeImpl();
		return unionEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionEventType createUnionEventType() {
		UnionEventTypeImpl unionEventType = new UnionEventTypeImpl();
		return unionEventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionFieldType createUnionFieldType() {
		UnionFieldTypeImpl unionFieldType = new UnionFieldTypeImpl();
		return unionFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionPropertyType createUnionPropertyType() {
		UnionPropertyTypeImpl unionPropertyType = new UnionPropertyTypeImpl();
		return unionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValue createPropertyValue() {
		PropertyValueImpl propertyValue = new PropertyValueImpl();
		return propertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetComposition createWidgetComposition() {
		WidgetCompositionImpl widgetComposition = new WidgetCompositionImpl();
		return widgetComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignementTypeVal createAlignementTypeValFromString(EDataType eDataType, String initialValue) {
		AlignementTypeVal result = AlignementTypeVal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignementTypeValToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentType createAlignmentTypeFromString(EDataType eDataType, String initialValue) {
		AlignmentType result = AlignmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentType1 createAlignmentType1FromString(EDataType eDataType, String initialValue) {
		AlignmentType1 result = AlignmentType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectRatioType1 createAspectRatioType1FromString(EDataType eDataType, String initialValue) {
		AspectRatioType1 result = AspectRatioType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAspectRatioType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectRatioTypeVal createAspectRatioTypeValFromString(EDataType eDataType, String initialValue) {
		AspectRatioTypeVal result = AspectRatioTypeVal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAspectRatioTypeValToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanTypeVal createBooleanTypeValFromString(EDataType eDataType, String initialValue) {
		BooleanTypeVal result = BooleanTypeVal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanTypeValToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClipRuleType createClipRuleTypeFromString(EDataType eDataType, String initialValue) {
		ClipRuleType result = ClipRuleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClipRuleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorReferenceType createColorReferenceTypeFromString(EDataType eDataType, String initialValue) {
		ColorReferenceType result = ColorReferenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorReferenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillRuleType1 createFillRuleType1FromString(EDataType eDataType, String initialValue) {
		FillRuleType1 result = FillRuleType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillRuleType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillRuleTypeVal createFillRuleTypeValFromString(EDataType eDataType, String initialValue) {
		FillRuleTypeVal result = FillRuleTypeVal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillRuleTypeValToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowDirectionType createFlowDirectionTypeFromString(EDataType eDataType, String initialValue) {
		FlowDirectionType result = FlowDirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlowDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiationModeType createInstantiationModeTypeFromString(EDataType eDataType, String initialValue) {
		InstantiationModeType result = InstantiationModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstantiationModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityType createModalityTypeFromString(EDataType eDataType, String initialValue) {
		ModalityType result = ModalityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityType1 createModalityType1FromString(EDataType eDataType, String initialValue) {
		ModalityType1 result = ModalityType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalityType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityType2 createModalityType2FromString(EDataType eDataType, String initialValue) {
		ModalityType2 result = ModalityType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalityType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultilineModeType createMultilineModeTypeFromString(EDataType eDataType, String initialValue) {
		MultilineModeType result = MultilineModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultilineModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeLinecapType createStrokeLinecapTypeFromString(EDataType eDataType, String initialValue) {
		StrokeLinecapType result = StrokeLinecapType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrokeLinecapTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeLinejoinType createStrokeLinejoinTypeFromString(EDataType eDataType, String initialValue) {
		StrokeLinejoinType result = StrokeLinejoinType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrokeLinejoinTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFlowType createTextFlowTypeFromString(EDataType eDataType, String initialValue) {
		TextFlowType result = TextFlowType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextFlowTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityTypeVal createVisibilityTypeValFromString(EDataType eDataType, String initialValue) {
		VisibilityTypeVal result = VisibilityTypeVal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityTypeValToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createAlignementTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createAlignementTypeValFromString(Part2Package.eINSTANCE.getAlignementTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignementTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getAlignementTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertAlignementTypeValToString(Part2Package.eINSTANCE.getAlignementTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignementTypeVal createAlignementTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignementTypeValFromString(Part2Package.eINSTANCE.getAlignementTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignementTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignementTypeValToString(Part2Package.eINSTANCE.getAlignementTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentType createAlignmentTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignmentTypeFromString(Part2Package.eINSTANCE.getAlignmentType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignmentTypeToString(Part2Package.eINSTANCE.getAlignmentType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentType1 createAlignmentTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createAlignmentType1FromString(Part2Package.eINSTANCE.getAlignmentType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignmentType1ToString(Part2Package.eINSTANCE.getAlignmentType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createAngleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createAngleTypeValFromString(Part2Package.eINSTANCE.getAngleTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getAngleTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertAngleTypeValToString(Part2Package.eINSTANCE.getAngleTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngleTypeValFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngleTypeValToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngleTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createAngleTypeValFromString(Part2Package.eINSTANCE.getAngleTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngleTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAngleTypeValToString(Part2Package.eINSTANCE.getAngleTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createAspectRatioTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createAspectRatioTypeValFromString(Part2Package.eINSTANCE.getAspectRatioTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAspectRatioTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getAspectRatioTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertAspectRatioTypeValToString(Part2Package.eINSTANCE.getAspectRatioTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectRatioType1 createAspectRatioTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAspectRatioType1FromString(Part2Package.eINSTANCE.getAspectRatioType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAspectRatioTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAspectRatioType1ToString(Part2Package.eINSTANCE.getAspectRatioType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectRatioTypeVal createAspectRatioTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createAspectRatioTypeValFromString(Part2Package.eINSTANCE.getAspectRatioTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAspectRatioTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAspectRatioTypeValToString(Part2Package.eINSTANCE.getAspectRatioTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createBooleanTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createBooleanTypeValFromString(Part2Package.eINSTANCE.getBooleanTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getBooleanTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertBooleanTypeValToString(Part2Package.eINSTANCE.getBooleanTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanTypeVal createBooleanTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createBooleanTypeValFromString(Part2Package.eINSTANCE.getBooleanTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanTypeValToString(Part2Package.eINSTANCE.getBooleanTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCharacterTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacterTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClipRuleType createClipRuleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createClipRuleTypeFromString(Part2Package.eINSTANCE.getClipRuleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClipRuleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClipRuleTypeToString(Part2Package.eINSTANCE.getClipRuleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorReferenceType createColorReferenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createColorReferenceTypeFromString(Part2Package.eINSTANCE.getColorReferenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorReferenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertColorReferenceTypeToString(Part2Package.eINSTANCE.getColorReferenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createColorRGBHEXTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorRGBHEXTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createColorRGBRgb255TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorRGBRgb255TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createColorRGBRgbPercentTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorRGBRgbPercentTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createColorRGBTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createColorRGBRgbPercentTypeFromString(Part2Package.eINSTANCE.getColorRGBRgbPercentType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createColorRGBRgb255TypeFromString(Part2Package.eINSTANCE.getColorRGBRgb255Type(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createColorRGBHEXTypeFromString(Part2Package.eINSTANCE.getColorRGBHEXType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorRGBTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getColorRGBRgbPercentType().isInstance(instanceValue)) {
			try {
				String value = convertColorRGBRgbPercentTypeToString(Part2Package.eINSTANCE.getColorRGBRgbPercentType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getColorRGBRgb255Type().isInstance(instanceValue)) {
			try {
				String value = convertColorRGBRgb255TypeToString(Part2Package.eINSTANCE.getColorRGBRgb255Type(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getColorRGBHEXType().isInstance(instanceValue)) {
			try {
				String value = convertColorRGBHEXTypeToString(Part2Package.eINSTANCE.getColorRGBHEXType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createColorTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createColorRGBTypeFromString(Part2Package.eINSTANCE.getColorRGBType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createColorReferenceTypeFromString(Part2Package.eINSTANCE.getColorReferenceType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getColorRGBType().isInstance(instanceValue)) {
			try {
				String value = convertColorRGBTypeToString(Part2Package.eINSTANCE.getColorRGBType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getColorReferenceType().isInstance(instanceValue)) {
			try {
				String value = convertColorReferenceTypeToString(Part2Package.eINSTANCE.getColorReferenceType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDateTimeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDateTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDistanceTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistanceTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DOUBLE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExpressionFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpressionToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFillRuleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createFillRuleTypeValFromString(Part2Package.eINSTANCE.getFillRuleTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillRuleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getFillRuleTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertFillRuleTypeValToString(Part2Package.eINSTANCE.getFillRuleTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillRuleType1 createFillRuleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFillRuleType1FromString(Part2Package.eINSTANCE.getFillRuleType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillRuleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFillRuleType1ToString(Part2Package.eINSTANCE.getFillRuleType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillRuleTypeVal createFillRuleTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createFillRuleTypeValFromString(Part2Package.eINSTANCE.getFillRuleTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillRuleTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFillRuleTypeValToString(Part2Package.eINSTANCE.getFillRuleTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowDirectionType createFlowDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFlowDirectionTypeFromString(Part2Package.eINSTANCE.getFlowDirectionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlowDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFlowDirectionTypeToString(Part2Package.eINSTANCE.getFlowDirectionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFontTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFormatStringTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createFormatStringTypeValFromString(Part2Package.eINSTANCE.getFormatStringTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatStringTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getFormatStringTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertFormatStringTypeValToString(Part2Package.eINSTANCE.getFormatStringTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFormatStringTypeValFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatStringTypeValToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFrequencyTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createFrequencyTypeValFromString(Part2Package.eINSTANCE.getFrequencyTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrequencyTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getFrequencyTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertFrequencyTypeValToString(Part2Package.eINSTANCE.getFrequencyTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createFrequencyTypeValFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrequencyTypeValToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createFrequencyTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createFrequencyTypeValFromString(Part2Package.eINSTANCE.getFrequencyTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrequencyTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFrequencyTypeValToString(Part2Package.eINSTANCE.getFrequencyTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createImageTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiationModeType createInstantiationModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInstantiationModeTypeFromString(Part2Package.eINSTANCE.getInstantiationModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstantiationModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInstantiationModeTypeToString(Part2Package.eINSTANCE.getInstantiationModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createIntegerTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.LONG.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityType createModalityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createModalityTypeFromString(Part2Package.eINSTANCE.getModalityType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModalityTypeToString(Part2Package.eINSTANCE.getModalityType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityType1 createModalityTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createModalityType1FromString(Part2Package.eINSTANCE.getModalityType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalityTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertModalityType1ToString(Part2Package.eINSTANCE.getModalityType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityType2 createModalityTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createModalityType2FromString(Part2Package.eINSTANCE.getModalityType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalityTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertModalityType2ToString(Part2Package.eINSTANCE.getModalityType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultilineModeType createMultilineModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMultilineModeTypeFromString(Part2Package.eINSTANCE.getMultilineModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultilineModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMultilineModeTypeToString(Part2Package.eINSTANCE.getMultilineModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createObjectTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createOpacityTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createOpacityTypeValFromString(Part2Package.eINSTANCE.getOpacityTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpacityTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getOpacityTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertOpacityTypeValToString(Part2Package.eINSTANCE.getOpacityTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createOpacityTypeValFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpacityTypeValToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createOpacityTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createOpacityTypeValFromString(Part2Package.eINSTANCE.getOpacityTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpacityTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOpacityTypeValToString(Part2Package.eINSTANCE.getOpacityTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPositionTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DOUBLE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPressureTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createPressureTypeValFromString(Part2Package.eINSTANCE.getPressureTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPressureTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getPressureTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertPressureTypeValToString(Part2Package.eINSTANCE.getPressureTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createPressureTypeValFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPressureTypeValToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createPressureTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createPressureTypeValFromString(Part2Package.eINSTANCE.getPressureTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPressureTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPressureTypeValToString(Part2Package.eINSTANCE.getPressureTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRealTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRealTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DOUBLE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStippleTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStippleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeLinecapType createStrokeLinecapTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStrokeLinecapTypeFromString(Part2Package.eINSTANCE.getStrokeLinecapType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrokeLinecapTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStrokeLinecapTypeToString(Part2Package.eINSTANCE.getStrokeLinecapType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeLinejoinType createStrokeLinejoinTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStrokeLinejoinTypeFromString(Part2Package.eINSTANCE.getStrokeLinejoinType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrokeLinejoinTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStrokeLinejoinTypeToString(Part2Package.eINSTANCE.getStrokeLinejoinType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFlowType createTextFlowTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextFlowTypeFromString(Part2Package.eINSTANCE.getTextFlowType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextFlowTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextFlowTypeToString(Part2Package.eINSTANCE.getTextFlowType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimeDefaultmillisecondsTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeDefaultmillisecondsTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimeHoursTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeHoursTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimeMinutesTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeMinutesTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimeSecondsOrSubsecondsTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeSecondsOrSubsecondsTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createTimeHoursTypeFromString(Part2Package.eINSTANCE.getTimeHoursType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTimeMinutesTypeFromString(Part2Package.eINSTANCE.getTimeMinutesType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTimeSecondsOrSubsecondsTypeFromString(Part2Package.eINSTANCE.getTimeSecondsOrSubsecondsType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTimeDefaultmillisecondsTypeFromString(Part2Package.eINSTANCE.getTimeDefaultmillisecondsType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getTimeHoursType().isInstance(instanceValue)) {
			try {
				String value = convertTimeHoursTypeToString(Part2Package.eINSTANCE.getTimeHoursType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getTimeMinutesType().isInstance(instanceValue)) {
			try {
				String value = convertTimeMinutesTypeToString(Part2Package.eINSTANCE.getTimeMinutesType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getTimeSecondsOrSubsecondsType().isInstance(instanceValue)) {
			try {
				String value = convertTimeSecondsOrSubsecondsTypeToString(Part2Package.eINSTANCE.getTimeSecondsOrSubsecondsType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getTimeDefaultmillisecondsType().isInstance(instanceValue)) {
			try {
				String value = convertTimeDefaultmillisecondsTypeToString(Part2Package.eINSTANCE.getTimeDefaultmillisecondsType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createVelocityTypeFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVelocityTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createVelocityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVelocityTypeFromString(Part2Package.eINSTANCE.getVelocityType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVelocityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVelocityTypeToString(Part2Package.eINSTANCE.getVelocityType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createVisibilityTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createVisibilityTypeValFromString(Part2Package.eINSTANCE.getVisibilityTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getVisibilityTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertVisibilityTypeValToString(Part2Package.eINSTANCE.getVisibilityTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityTypeVal createVisibilityTypeValObjectFromString(EDataType eDataType, String initialValue) {
		return createVisibilityTypeValFromString(Part2Package.eINSTANCE.getVisibilityTypeVal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityTypeValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisibilityTypeValToString(Part2Package.eINSTANCE.getVisibilityTypeVal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createZIndexTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createZIndexTypeValFromString(Part2Package.eINSTANCE.getZIndexTypeVal(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExpressionFromString(Part2Package.eINSTANCE.getExpression(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZIndexTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Part2Package.eINSTANCE.getZIndexTypeVal().isInstance(instanceValue)) {
			try {
				String value = convertZIndexTypeValToString(Part2Package.eINSTANCE.getZIndexTypeVal(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Part2Package.eINSTANCE.getExpression().isInstance(instanceValue)) {
			try {
				String value = convertExpressionToString(Part2Package.eINSTANCE.getExpression(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createZIndexTypeValFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZIndexTypeValToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part2Package getPart2Package() {
		return (Part2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Part2Package getPackage() {
		return Part2Package.eINSTANCE;
	}

} //Part2FactoryImpl
