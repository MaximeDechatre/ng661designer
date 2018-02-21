/**
 * Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.part2.util;

import java.math.BigInteger;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.polarsys.ng661designer.part2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.ng661designer.part2.Part2Package
 * @generated
 */
public class Part2Validator extends EObjectValidator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Part2Validator INSTANCE = new Part2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.polarsys.ng661designer.part2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part2Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Part2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Part2Package.ARC_COMPONENT:
				return validateArcComponent((ArcComponent)value, diagnostics, context);
			case Part2Package.ARRAY_DEFINITION_TYPE:
				return validateArrayDefinitionType((ArrayDefinitionType)value, diagnostics, context);
			case Part2Package.ARRAY_ENTRY_TYPE:
				return validateArrayEntryType((ArrayEntryType)value, diagnostics, context);
			case Part2Package.ARRAY_EVENT_TYPE:
				return validateArrayEventType((ArrayEventType)value, diagnostics, context);
			case Part2Package.ARRAY_FIELD_DEFINITION_TYPE:
				return validateArrayFieldDefinitionType((ArrayFieldDefinitionType)value, diagnostics, context);
			case Part2Package.ARRAY_FIELD_TYPE:
				return validateArrayFieldType((ArrayFieldType)value, diagnostics, context);
			case Part2Package.ARRAY_PROPERTY_TYPE:
				return validateArrayPropertyType((ArrayPropertyType)value, diagnostics, context);
			case Part2Package.BEHAVIOR_TYPE:
				return validateBehaviorType((BehaviorType)value, diagnostics, context);
			case Part2Package.CHILD_PRIMITIVE:
				return validateChildPrimitive((ChildPrimitive)value, diagnostics, context);
			case Part2Package.CIRCLE_PRIMITIVE:
				return validateCirclePrimitive((CirclePrimitive)value, diagnostics, context);
			case Part2Package.CLIP_PATH_PRIMITIVE:
				return validateClipPathPrimitive((ClipPathPrimitive)value, diagnostics, context);
			case Part2Package.CLIPPING_CONTAINER_PRIMITIVE:
				return validateClippingContainerPrimitive((ClippingContainerPrimitive)value, diagnostics, context);
			case Part2Package.CLOCK_TYPE:
				return validateClockType((ClockType)value, diagnostics, context);
			case Part2Package.CLOSE_PATH_COMMAND:
				return validateClosePathCommand((ClosePathCommand)value, diagnostics, context);
			case Part2Package.COMPONENT_DEFINITION_TYPE:
				return validateComponentDefinitionType((ComponentDefinitionType)value, diagnostics, context);
			case Part2Package.CROWN_COMPONENT:
				return validateCrownComponent((CrownComponent)value, diagnostics, context);
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND:
				return validateCubicBezierCurveCommand((CubicBezierCurveCommand)value, diagnostics, context);
			case Part2Package.CUSTOM_INTEGER_TYPE_ELEMENT_TYPE:
				return validateCustomIntegerTypeElementType((CustomIntegerTypeElementType)value, diagnostics, context);
			case Part2Package.CUSTOM_REAL_TYPE_ELEMENT_TYPE:
				return validateCustomRealTypeElementType((CustomRealTypeElementType)value, diagnostics, context);
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE:
				return validateCustomStringTypeElementType((CustomStringTypeElementType)value, diagnostics, context);
			case Part2Package.DEFINITIONS_TYPE:
				return validateDefinitionsType((DefinitionsType)value, diagnostics, context);
			case Part2Package.DEFINITION_TYPE:
				return validateDefinitionType((DefinitionType)value, diagnostics, context);
			case Part2Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND:
				return validateEllipseArcCurveCommand((EllipseArcCurveCommand)value, diagnostics, context);
			case Part2Package.ELLIPSE_PRIMITIVE:
				return validateEllipsePrimitive((EllipsePrimitive)value, diagnostics, context);
			case Part2Package.ENTRY_TYPE:
				return validateEntryType((EntryType)value, diagnostics, context);
			case Part2Package.ENUM_DEFINITION_TYPE:
				return validateEnumDefinitionType((EnumDefinitionType)value, diagnostics, context);
			case Part2Package.ENUMERATION_TYPE:
				return validateEnumerationType((EnumerationType)value, diagnostics, context);
			case Part2Package.EVENT_TYPE:
				return validateEventType((EventType)value, diagnostics, context);
			case Part2Package.FIELD_DEFINITION_ABSTRACT_TYPE:
				return validateFieldDefinitionAbstractType((FieldDefinitionAbstractType)value, diagnostics, context);
			case Part2Package.FIELD_DEFINITION_TYPE:
				return validateFieldDefinitionType((FieldDefinitionType)value, diagnostics, context);
			case Part2Package.FIELD_TYPE:
				return validateFieldType((FieldType)value, diagnostics, context);
			case Part2Package.FRAME_PROPERTIES:
				return validateFrameProperties((FrameProperties)value, diagnostics, context);
			case Part2Package.FUNCTION_TYPE:
				return validateFunctionType((FunctionType)value, diagnostics, context);
			case Part2Package.GESTURE_AREA_PRIMITIVE:
				return validateGestureAreaPrimitive((GestureAreaPrimitive)value, diagnostics, context);
			case Part2Package.GROUP_PRIMITIVE:
				return validateGroupPrimitive((GroupPrimitive)value, diagnostics, context);
			case Part2Package.IMAGE_PRIMITIVE:
				return validateImagePrimitive((ImagePrimitive)value, diagnostics, context);
			case Part2Package.IMPORT_TYPE:
				return validateImportType((ImportType)value, diagnostics, context);
			case Part2Package.INTERFACE_TYPE:
				return validateInterfaceType((InterfaceType)value, diagnostics, context);
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE:
				return validateKeyboardInputPrimitive((KeyboardInputPrimitive)value, diagnostics, context);
			case Part2Package.LINE_PRIMITIVE:
				return validateLinePrimitive((LinePrimitive)value, diagnostics, context);
			case Part2Package.LINE_TO_COMMAND:
				return validateLineToCommand((LineToCommand)value, diagnostics, context);
			case Part2Package.MOVE_TO_COMMAND:
				return validateMoveToCommand((MoveToCommand)value, diagnostics, context);
			case Part2Package.OPERATION_TYPE:
				return validateOperationType((OperationType)value, diagnostics, context);
			case Part2Package.OTHER_ARRAY_ENTRIES_TYPE:
				return validateOtherArrayEntriesType((OtherArrayEntriesType)value, diagnostics, context);
			case Part2Package.OTHER_ENTRIES_TYPE:
				return validateOtherEntriesType((OtherEntriesType)value, diagnostics, context);
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE:
				return validateOtherStructEntriesType((OtherStructEntriesType)value, diagnostics, context);
			case Part2Package.OTHER_UNION_ENTRIES_TYPE:
				return validateOtherUnionEntriesType((OtherUnionEntriesType)value, diagnostics, context);
			case Part2Package.PARAM_TYPE:
				return validateParamType((ParamType)value, diagnostics, context);
			case Part2Package.PATH_ARRAY:
				return validatePathArray((PathArray)value, diagnostics, context);
			case Part2Package.PATH_PRIMITIVE:
				return validatePathPrimitive((PathPrimitive)value, diagnostics, context);
			case Part2Package.POINTER_AREA_PRIMITIVE:
				return validatePointerAreaPrimitive((PointerAreaPrimitive)value, diagnostics, context);
			case Part2Package.POINTER_GESTURE_AREA_PRIMITIVE:
				return validatePointerGestureAreaPrimitive((PointerGestureAreaPrimitive)value, diagnostics, context);
			case Part2Package.POINT_TYPE:
				return validatePointType((PointType)value, diagnostics, context);
			case Part2Package.POLAR_LINE_COMPONENT:
				return validatePolarLineComponent((PolarLineComponent)value, diagnostics, context);
			case Part2Package.POLYGON_PRIMITIVE:
				return validatePolygonPrimitive((PolygonPrimitive)value, diagnostics, context);
			case Part2Package.POLYLINE_PRIMITIVE:
				return validatePolylinePrimitive((PolylinePrimitive)value, diagnostics, context);
			case Part2Package.POSITION_LIST_TYPE:
				return validatePositionListType((PositionListType)value, diagnostics, context);
			case Part2Package.PRIVATE_PROPERTY_TYPE:
				return validatePrivatePropertyType((PrivatePropertyType)value, diagnostics, context);
			case Part2Package.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case Part2Package.RECT_PRIMITIVE:
				return validateRectPrimitive((RectPrimitive)value, diagnostics, context);
			case Part2Package.RELATIVE_CLOSE_PATH_COMMAND:
				return validateRelativeClosePathCommand((RelativeClosePathCommand)value, diagnostics, context);
			case Part2Package.RELATIVE_CUBIC_BEZIER_CURVE_COMMAND:
				return validateRelativeCubicBezierCurveCommand((RelativeCubicBezierCurveCommand)value, diagnostics, context);
			case Part2Package.RELATIVE_ELLIPSE_ARC_CURVE_COMMAND:
				return validateRelativeEllipseArcCurveCommand((RelativeEllipseArcCurveCommand)value, diagnostics, context);
			case Part2Package.RELATIVE_LINE_TO_COMMAND:
				return validateRelativeLineToCommand((RelativeLineToCommand)value, diagnostics, context);
			case Part2Package.RELATIVE_MOVE_TO_COMMAND:
				return validateRelativeMoveToCommand((RelativeMoveToCommand)value, diagnostics, context);
			case Part2Package.REPLICATE_PRIMITIVE:
				return validateReplicatePrimitive((ReplicatePrimitive)value, diagnostics, context);
			case Part2Package.REVERSE_VIDEO_PROPERTIES:
				return validateReverseVideoProperties((ReverseVideoProperties)value, diagnostics, context);
			case Part2Package.SCROLL_WHEEL_INPUT_PRIMITIVE:
				return validateScrollWheelInputPrimitive((ScrollWheelInputPrimitive)value, diagnostics, context);
			case Part2Package.SIMPLE_TEXT_PRIMITIVE:
				return validateSimpleTextPrimitive((SimpleTextPrimitive)value, diagnostics, context);
			case Part2Package.STRIKE_THROUGH_PROPERTIES:
				return validateStrikeThroughProperties((StrikeThroughProperties)value, diagnostics, context);
			case Part2Package.STRUCT_DEFINITION_TYPE:
				return validateStructDefinitionType((StructDefinitionType)value, diagnostics, context);
			case Part2Package.STRUCT_ENTRY_TYPE:
				return validateStructEntryType((StructEntryType)value, diagnostics, context);
			case Part2Package.STRUCT_EVENT_TYPE:
				return validateStructEventType((StructEventType)value, diagnostics, context);
			case Part2Package.STRUCT_FIELD_TYPE:
				return validateStructFieldType((StructFieldType)value, diagnostics, context);
			case Part2Package.STRUCT_PROPERTY_TYPE:
				return validateStructPropertyType((StructPropertyType)value, diagnostics, context);
			case Part2Package.SWITCH_NODE_PRIMITIVE:
				return validateSwitchNodePrimitive((SwitchNodePrimitive)value, diagnostics, context);
			case Part2Package.TOUCH_AREA_PRIMITIVE:
				return validateTouchAreaPrimitive((TouchAreaPrimitive)value, diagnostics, context);
			case Part2Package.TRANSFORM_GROUP_PRIMITIVE:
				return validateTransformGroupPrimitive((TransformGroupPrimitive)value, diagnostics, context);
			case Part2Package.TRANSFORM_MATRIX_TYPE:
				return validateTransformMatrixType((TransformMatrixType)value, diagnostics, context);
			case Part2Package.TRANSFORM_ROTATE_TYPE:
				return validateTransformRotateType((TransformRotateType)value, diagnostics, context);
			case Part2Package.TRANSFORM_SCALE_TYPE:
				return validateTransformScaleType((TransformScaleType)value, diagnostics, context);
			case Part2Package.TRANSFORM_SKEW_XTYPE:
				return validateTransformSkewXType((TransformSkewXType)value, diagnostics, context);
			case Part2Package.TRANSFORM_SKEW_YTYPE:
				return validateTransformSkewYType((TransformSkewYType)value, diagnostics, context);
			case Part2Package.TRANSFORM_TRANSLATE_TYPE:
				return validateTransformTranslateType((TransformTranslateType)value, diagnostics, context);
			case Part2Package.TRANSFORM_TYPE:
				return validateTransformType((TransformType)value, diagnostics, context);
			case Part2Package.TREE_TYPE:
				return validateTreeType((TreeType)value, diagnostics, context);
			case Part2Package.TYPE_ALTERNATIVE_TYPE:
				return validateTypeAlternativeType((TypeAlternativeType)value, diagnostics, context);
			case Part2Package.TYPE_DEFINITION_ABSTRACT_TYPE:
				return validateTypeDefinitionAbstractType((TypeDefinitionAbstractType)value, diagnostics, context);
			case Part2Package.UNDERLINE_PROPERTIES:
				return validateUnderlineProperties((UnderlineProperties)value, diagnostics, context);
			case Part2Package.UNION_DEFINITION_TYPE:
				return validateUnionDefinitionType((UnionDefinitionType)value, diagnostics, context);
			case Part2Package.UNION_ENTRY_TYPE:
				return validateUnionEntryType((UnionEntryType)value, diagnostics, context);
			case Part2Package.UNION_EVENT_TYPE:
				return validateUnionEventType((UnionEventType)value, diagnostics, context);
			case Part2Package.UNION_FIELD_TYPE:
				return validateUnionFieldType((UnionFieldType)value, diagnostics, context);
			case Part2Package.UNION_PROPERTY_TYPE:
				return validateUnionPropertyType((UnionPropertyType)value, diagnostics, context);
			case Part2Package.TREE_TYPES:
				return validateTreeTypes((TreeTypes)value, diagnostics, context);
			case Part2Package.CLIP_PATH_TYPES:
				return validateClipPathTypes((ClipPathTypes)value, diagnostics, context);
			case Part2Package.PROPERTY_VALUE:
				return validatePropertyValue((PropertyValue)value, diagnostics, context);
			case Part2Package.WIDGET_COMPOSITION:
				return validateWidgetComposition((WidgetComposition)value, diagnostics, context);
			case Part2Package.ALIGNEMENT_TYPE_VAL:
				return validateAlignementTypeVal((AlignementTypeVal)value, diagnostics, context);
			case Part2Package.ALIGNMENT_TYPE:
				return validateAlignmentType((AlignmentType)value, diagnostics, context);
			case Part2Package.ALIGNMENT_TYPE1:
				return validateAlignmentType1((AlignmentType1)value, diagnostics, context);
			case Part2Package.ASPECT_RATIO_TYPE1:
				return validateAspectRatioType1((AspectRatioType1)value, diagnostics, context);
			case Part2Package.ASPECT_RATIO_TYPE_VAL:
				return validateAspectRatioTypeVal((AspectRatioTypeVal)value, diagnostics, context);
			case Part2Package.BOOLEAN_TYPE_VAL:
				return validateBooleanTypeVal((BooleanTypeVal)value, diagnostics, context);
			case Part2Package.CLIP_RULE_TYPE:
				return validateClipRuleType((ClipRuleType)value, diagnostics, context);
			case Part2Package.COLOR_REFERENCE_TYPE:
				return validateColorReferenceType((ColorReferenceType)value, diagnostics, context);
			case Part2Package.FILL_RULE_TYPE1:
				return validateFillRuleType1((FillRuleType1)value, diagnostics, context);
			case Part2Package.FILL_RULE_TYPE_VAL:
				return validateFillRuleTypeVal((FillRuleTypeVal)value, diagnostics, context);
			case Part2Package.FLOW_DIRECTION_TYPE:
				return validateFlowDirectionType((FlowDirectionType)value, diagnostics, context);
			case Part2Package.INSTANTIATION_MODE_TYPE:
				return validateInstantiationModeType((InstantiationModeType)value, diagnostics, context);
			case Part2Package.MODALITY_TYPE:
				return validateModalityType((ModalityType)value, diagnostics, context);
			case Part2Package.MODALITY_TYPE1:
				return validateModalityType1((ModalityType1)value, diagnostics, context);
			case Part2Package.MODALITY_TYPE2:
				return validateModalityType2((ModalityType2)value, diagnostics, context);
			case Part2Package.MULTILINE_MODE_TYPE:
				return validateMultilineModeType((MultilineModeType)value, diagnostics, context);
			case Part2Package.STROKE_LINECAP_TYPE:
				return validateStrokeLinecapType((StrokeLinecapType)value, diagnostics, context);
			case Part2Package.STROKE_LINEJOIN_TYPE:
				return validateStrokeLinejoinType((StrokeLinejoinType)value, diagnostics, context);
			case Part2Package.TEXT_FLOW_TYPE:
				return validateTextFlowType((TextFlowType)value, diagnostics, context);
			case Part2Package.VISIBILITY_TYPE_VAL:
				return validateVisibilityTypeVal((VisibilityTypeVal)value, diagnostics, context);
			case Part2Package.ALIGNEMENT_TYPE:
				return validateAlignementType(value, diagnostics, context);
			case Part2Package.ALIGNEMENT_TYPE_VAL_OBJECT:
				return validateAlignementTypeValObject((AlignementTypeVal)value, diagnostics, context);
			case Part2Package.ALIGNMENT_TYPE_OBJECT:
				return validateAlignmentTypeObject((AlignmentType)value, diagnostics, context);
			case Part2Package.ALIGNMENT_TYPE_OBJECT1:
				return validateAlignmentTypeObject1((AlignmentType1)value, diagnostics, context);
			case Part2Package.ANGLE_TYPE:
				return validateAngleType(value, diagnostics, context);
			case Part2Package.ANGLE_TYPE_VAL:
				return validateAngleTypeVal((Double)value, diagnostics, context);
			case Part2Package.ANGLE_TYPE_VAL_OBJECT:
				return validateAngleTypeValObject((Double)value, diagnostics, context);
			case Part2Package.ASPECT_RATIO_TYPE:
				return validateAspectRatioType(value, diagnostics, context);
			case Part2Package.ASPECT_RATIO_TYPE_OBJECT:
				return validateAspectRatioTypeObject((AspectRatioType1)value, diagnostics, context);
			case Part2Package.ASPECT_RATIO_TYPE_VAL_OBJECT:
				return validateAspectRatioTypeValObject((AspectRatioTypeVal)value, diagnostics, context);
			case Part2Package.BOOLEAN_TYPE:
				return validateBooleanType(value, diagnostics, context);
			case Part2Package.BOOLEAN_TYPE_VAL_OBJECT:
				return validateBooleanTypeValObject((BooleanTypeVal)value, diagnostics, context);
			case Part2Package.CHARACTER_TYPE:
				return validateCharacterType((String)value, diagnostics, context);
			case Part2Package.CLIP_RULE_TYPE_OBJECT:
				return validateClipRuleTypeObject((ClipRuleType)value, diagnostics, context);
			case Part2Package.COLOR_REFERENCE_TYPE_OBJECT:
				return validateColorReferenceTypeObject((ColorReferenceType)value, diagnostics, context);
			case Part2Package.COLOR_RGBHEX_TYPE:
				return validateColorRGBHEXType((String)value, diagnostics, context);
			case Part2Package.COLOR_RGB_RGB255_TYPE:
				return validateColorRGBRgb255Type((String)value, diagnostics, context);
			case Part2Package.COLOR_RGB_RGB_PERCENT_TYPE:
				return validateColorRGBRgbPercentType((String)value, diagnostics, context);
			case Part2Package.COLOR_RGB_TYPE:
				return validateColorRGBType((String)value, diagnostics, context);
			case Part2Package.COLOR_TYPE:
				return validateColorType(value, diagnostics, context);
			case Part2Package.DATE_TIME_TYPE:
				return validateDateTimeType(value, diagnostics, context);
			case Part2Package.DATE_TYPE:
				return validateDateType(value, diagnostics, context);
			case Part2Package.DISTANCE_TYPE:
				return validateDistanceType(value, diagnostics, context);
			case Part2Package.EXPRESSION:
				return validateExpression((String)value, diagnostics, context);
			case Part2Package.FILL_RULE_TYPE:
				return validateFillRuleType(value, diagnostics, context);
			case Part2Package.FILL_RULE_TYPE_OBJECT:
				return validateFillRuleTypeObject((FillRuleType1)value, diagnostics, context);
			case Part2Package.FILL_RULE_TYPE_VAL_OBJECT:
				return validateFillRuleTypeValObject((FillRuleTypeVal)value, diagnostics, context);
			case Part2Package.FLOW_DIRECTION_TYPE_OBJECT:
				return validateFlowDirectionTypeObject((FlowDirectionType)value, diagnostics, context);
			case Part2Package.FONT_TYPE:
				return validateFontType((String)value, diagnostics, context);
			case Part2Package.FORMAT_STRING_TYPE:
				return validateFormatStringType((String)value, diagnostics, context);
			case Part2Package.FORMAT_STRING_TYPE_VAL:
				return validateFormatStringTypeVal((String)value, diagnostics, context);
			case Part2Package.FREQUENCY_TYPE:
				return validateFrequencyType(value, diagnostics, context);
			case Part2Package.FREQUENCY_TYPE_VAL:
				return validateFrequencyTypeVal((Double)value, diagnostics, context);
			case Part2Package.FREQUENCY_TYPE_VAL_OBJECT:
				return validateFrequencyTypeValObject((Double)value, diagnostics, context);
			case Part2Package.IMAGE_TYPE:
				return validateImageType((String)value, diagnostics, context);
			case Part2Package.INSTANTIATION_MODE_TYPE_OBJECT:
				return validateInstantiationModeTypeObject((InstantiationModeType)value, diagnostics, context);
			case Part2Package.INTEGER_TYPE:
				return validateIntegerType(value, diagnostics, context);
			case Part2Package.MODALITY_TYPE_OBJECT:
				return validateModalityTypeObject((ModalityType)value, diagnostics, context);
			case Part2Package.MODALITY_TYPE_OBJECT1:
				return validateModalityTypeObject1((ModalityType1)value, diagnostics, context);
			case Part2Package.MODALITY_TYPE_OBJECT2:
				return validateModalityTypeObject2((ModalityType2)value, diagnostics, context);
			case Part2Package.MULTILINE_MODE_TYPE_OBJECT:
				return validateMultilineModeTypeObject((MultilineModeType)value, diagnostics, context);
			case Part2Package.NAME_TYPE:
				return validateNameType((String)value, diagnostics, context);
			case Part2Package.OBJECT_TYPE:
				return validateObjectType((String)value, diagnostics, context);
			case Part2Package.OPACITY_TYPE:
				return validateOpacityType(value, diagnostics, context);
			case Part2Package.OPACITY_TYPE_VAL:
				return validateOpacityTypeVal((Double)value, diagnostics, context);
			case Part2Package.OPACITY_TYPE_VAL_OBJECT:
				return validateOpacityTypeValObject((Double)value, diagnostics, context);
			case Part2Package.POSITION_TYPE:
				return validatePositionType(value, diagnostics, context);
			case Part2Package.PRESSURE_TYPE:
				return validatePressureType(value, diagnostics, context);
			case Part2Package.PRESSURE_TYPE_VAL:
				return validatePressureTypeVal((Double)value, diagnostics, context);
			case Part2Package.PRESSURE_TYPE_VAL_OBJECT:
				return validatePressureTypeValObject((Double)value, diagnostics, context);
			case Part2Package.REAL_TYPE:
				return validateRealType(value, diagnostics, context);
			case Part2Package.STIPPLE_TYPE:
				return validateStippleType((String)value, diagnostics, context);
			case Part2Package.STRING_TYPE:
				return validateStringType((String)value, diagnostics, context);
			case Part2Package.STROKE_LINECAP_TYPE_OBJECT:
				return validateStrokeLinecapTypeObject((StrokeLinecapType)value, diagnostics, context);
			case Part2Package.STROKE_LINEJOIN_TYPE_OBJECT:
				return validateStrokeLinejoinTypeObject((StrokeLinejoinType)value, diagnostics, context);
			case Part2Package.TEXT_FLOW_TYPE_OBJECT:
				return validateTextFlowTypeObject((TextFlowType)value, diagnostics, context);
			case Part2Package.TIME_DEFAULTMILLISECONDS_TYPE:
				return validateTimeDefaultmillisecondsType((String)value, diagnostics, context);
			case Part2Package.TIME_HOURS_TYPE:
				return validateTimeHoursType((String)value, diagnostics, context);
			case Part2Package.TIME_MINUTES_TYPE:
				return validateTimeMinutesType((String)value, diagnostics, context);
			case Part2Package.TIME_SECONDS_OR_SUBSECONDS_TYPE:
				return validateTimeSecondsOrSubsecondsType((String)value, diagnostics, context);
			case Part2Package.TIME_TYPE:
				return validateTimeType((String)value, diagnostics, context);
			case Part2Package.TYPE_TYPE:
				return validateTypeType((String)value, diagnostics, context);
			case Part2Package.VELOCITY_TYPE:
				return validateVelocityType((Double)value, diagnostics, context);
			case Part2Package.VELOCITY_TYPE_OBJECT:
				return validateVelocityTypeObject((Double)value, diagnostics, context);
			case Part2Package.VISIBILITY_TYPE:
				return validateVisibilityType(value, diagnostics, context);
			case Part2Package.VISIBILITY_TYPE_VAL_OBJECT:
				return validateVisibilityTypeValObject((VisibilityTypeVal)value, diagnostics, context);
			case Part2Package.ZINDEX_TYPE:
				return validateZIndexType(value, diagnostics, context);
			case Part2Package.ZINDEX_TYPE_VAL:
				return validateZIndexTypeVal((BigInteger)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcComponent(ArcComponent arcComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arcComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayDefinitionType(ArrayDefinitionType arrayDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayEntryType(ArrayEntryType arrayEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayEventType(ArrayEventType arrayEventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayEventType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayFieldDefinitionType(ArrayFieldDefinitionType arrayFieldDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayFieldDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayFieldType(ArrayFieldType arrayFieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayFieldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayPropertyType(ArrayPropertyType arrayPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviorType(BehaviorType behaviorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behaviorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChildPrimitive(ChildPrimitive childPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(childPrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCirclePrimitive(CirclePrimitive circlePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(circlePrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClipPathPrimitive(ClipPathPrimitive clipPathPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clipPathPrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClippingContainerPrimitive(ClippingContainerPrimitive clippingContainerPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clippingContainerPrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockType(ClockType clockType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClosePathCommand(ClosePathCommand closePathCommand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(closePathCommand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentDefinitionType(ComponentDefinitionType componentDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrownComponent(CrownComponent crownComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crownComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCubicBezierCurveCommand(CubicBezierCurveCommand cubicBezierCurveCommand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cubicBezierCurveCommand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomIntegerTypeElementType(CustomIntegerTypeElementType customIntegerTypeElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customIntegerTypeElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomRealTypeElementType(CustomRealTypeElementType customRealTypeElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customRealTypeElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomStringTypeElementType(CustomStringTypeElementType customStringTypeElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customStringTypeElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionsType(DefinitionsType definitionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionType(DefinitionType definitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEllipseArcCurveCommand(EllipseArcCurveCommand ellipseArcCurveCommand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ellipseArcCurveCommand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEllipsePrimitive(EllipsePrimitive ellipsePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ellipsePrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryType(EntryType entryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumDefinitionType(EnumDefinitionType enumDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationType(EnumerationType enumerationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventType(EventType eventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFieldDefinitionAbstractType(FieldDefinitionAbstractType fieldDefinitionAbstractType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fieldDefinitionAbstractType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFieldDefinitionType(FieldDefinitionType fieldDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fieldDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFieldType(FieldType fieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fieldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameProperties(FrameProperties frameProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frameProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionType(FunctionType functionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGestureAreaPrimitive(GestureAreaPrimitive gestureAreaPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gestureAreaPrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupPrimitive(GroupPrimitive groupPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupPrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagePrimitive(ImagePrimitive imagePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagePrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImportType(ImportType importType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(importType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceType(InterfaceType interfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyboardInputPrimitive(KeyboardInputPrimitive keyboardInputPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyboardInputPrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinePrimitive(LinePrimitive linePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linePrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineToCommand(LineToCommand lineToCommand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineToCommand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoveToCommand(MoveToCommand moveToCommand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moveToCommand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationType(OperationType operationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherArrayEntriesType(OtherArrayEntriesType otherArrayEntriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(otherArrayEntriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherEntriesType(OtherEntriesType otherEntriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(otherEntriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherStructEntriesType(OtherStructEntriesType otherStructEntriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(otherStructEntriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherUnionEntriesType(OtherUnionEntriesType otherUnionEntriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(otherUnionEntriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamType(ParamType paramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathArray(PathArray pathArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathArray, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathPrimitive(PathPrimitive pathPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathPrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointerAreaPrimitive(PointerAreaPrimitive pointerAreaPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointerAreaPrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointerGestureAreaPrimitive(PointerGestureAreaPrimitive pointerGestureAreaPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointerGestureAreaPrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointType(PointType pointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolarLineComponent(PolarLineComponent polarLineComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polarLineComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonPrimitive(PolygonPrimitive polygonPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygonPrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolylinePrimitive(PolylinePrimitive polylinePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polylinePrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionListType(PositionListType positionListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positionListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivatePropertyType(PrivatePropertyType privatePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(privatePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRectPrimitive(RectPrimitive rectPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rectPrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeClosePathCommand(RelativeClosePathCommand relativeClosePathCommand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativeClosePathCommand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeCubicBezierCurveCommand(RelativeCubicBezierCurveCommand relativeCubicBezierCurveCommand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativeCubicBezierCurveCommand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeEllipseArcCurveCommand(RelativeEllipseArcCurveCommand relativeEllipseArcCurveCommand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativeEllipseArcCurveCommand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeLineToCommand(RelativeLineToCommand relativeLineToCommand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativeLineToCommand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeMoveToCommand(RelativeMoveToCommand relativeMoveToCommand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativeMoveToCommand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplicatePrimitive(ReplicatePrimitive replicatePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(replicatePrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReverseVideoProperties(ReverseVideoProperties reverseVideoProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reverseVideoProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScrollWheelInputPrimitive(ScrollWheelInputPrimitive scrollWheelInputPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scrollWheelInputPrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleTextPrimitive(SimpleTextPrimitive simpleTextPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleTextPrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrikeThroughProperties(StrikeThroughProperties strikeThroughProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strikeThroughProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructDefinitionType(StructDefinitionType structDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructEntryType(StructEntryType structEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructEventType(StructEventType structEventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structEventType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructFieldType(StructFieldType structFieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structFieldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructPropertyType(StructPropertyType structPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwitchNodePrimitive(SwitchNodePrimitive switchNodePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(switchNodePrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTouchAreaPrimitive(TouchAreaPrimitive touchAreaPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(touchAreaPrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformGroupPrimitive(TransformGroupPrimitive transformGroupPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformGroupPrimitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformMatrixType(TransformMatrixType transformMatrixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformMatrixType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformRotateType(TransformRotateType transformRotateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformRotateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformScaleType(TransformScaleType transformScaleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformScaleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformSkewXType(TransformSkewXType transformSkewXType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformSkewXType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformSkewYType(TransformSkewYType transformSkewYType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformSkewYType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformTranslateType(TransformTranslateType transformTranslateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformTranslateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformType(TransformType transformType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTreeType(TreeType treeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(treeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeAlternativeType(TypeAlternativeType typeAlternativeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeAlternativeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDefinitionAbstractType(TypeDefinitionAbstractType typeDefinitionAbstractType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDefinitionAbstractType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnderlineProperties(UnderlineProperties underlineProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(underlineProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnionDefinitionType(UnionDefinitionType unionDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unionDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnionEntryType(UnionEntryType unionEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unionEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnionEventType(UnionEventType unionEventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unionEventType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnionFieldType(UnionFieldType unionFieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unionFieldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnionPropertyType(UnionPropertyType unionPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unionPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTreeTypes(TreeTypes treeTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(treeTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClipPathTypes(ClipPathTypes clipPathTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clipPathTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyValue(PropertyValue propertyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWidgetComposition(WidgetComposition widgetComposition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(widgetComposition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignementTypeVal(AlignementTypeVal alignementTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentType(AlignmentType alignmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentType1(AlignmentType1 alignmentType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAspectRatioType1(AspectRatioType1 aspectRatioType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAspectRatioTypeVal(AspectRatioTypeVal aspectRatioTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanTypeVal(BooleanTypeVal booleanTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClipRuleType(ClipRuleType clipRuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorReferenceType(ColorReferenceType colorReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillRuleType1(FillRuleType1 fillRuleType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillRuleTypeVal(FillRuleTypeVal fillRuleTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowDirectionType(FlowDirectionType flowDirectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantiationModeType(InstantiationModeType instantiationModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModalityType(ModalityType modalityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModalityType1(ModalityType1 modalityType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModalityType2(ModalityType2 modalityType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultilineModeType(MultilineModeType multilineModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeLinecapType(StrokeLinecapType strokeLinecapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeLinejoinType(StrokeLinejoinType strokeLinejoinType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextFlowType(TextFlowType textFlowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityTypeVal(VisibilityTypeVal visibilityTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignementType(Object alignementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAlignementType_MemberTypes(alignementType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Alignement Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignementType_MemberTypes(Object alignementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Part2Package.eINSTANCE.getAlignementTypeVal().isInstance(alignementType)) {
				if (validateAlignementTypeVal((AlignementTypeVal)alignementType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(alignementType)) {
				if (validateExpression((String)alignementType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Part2Package.eINSTANCE.getAlignementTypeVal().isInstance(alignementType)) {
				if (validateAlignementTypeVal((AlignementTypeVal)alignementType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(alignementType)) {
				if (validateExpression((String)alignementType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignementTypeValObject(AlignementTypeVal alignementTypeValObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentTypeObject(AlignmentType alignmentTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentTypeObject1(AlignmentType1 alignmentTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleType(Object angleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngleType_MemberTypes(angleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Angle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleType_MemberTypes(Object angleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Part2Package.eINSTANCE.getAngleTypeVal().isInstance(angleType)) {
				if (validateAngleTypeVal((Double)angleType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(angleType)) {
				if (validateExpression((String)angleType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Part2Package.eINSTANCE.getAngleTypeVal().isInstance(angleType)) {
				if (validateAngleTypeVal((Double)angleType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(angleType)) {
				if (validateExpression((String)angleType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleTypeVal(double angleTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngleTypeVal_Min(angleTypeVal, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngleTypeVal_Max(angleTypeVal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngleTypeVal_Min
	 */
	public static final double ANGLE_TYPE_VAL__MIN__VALUE = -360.0;

	/**
	 * Validates the Min constraint of '<em>Angle Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleTypeVal_Min(double angleTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angleTypeVal >= ANGLE_TYPE_VAL__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(Part2Package.eINSTANCE.getAngleTypeVal(), angleTypeVal, ANGLE_TYPE_VAL__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngleTypeVal_Max
	 */
	public static final double ANGLE_TYPE_VAL__MAX__VALUE = 360.0;

	/**
	 * Validates the Max constraint of '<em>Angle Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleTypeVal_Max(double angleTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angleTypeVal <= ANGLE_TYPE_VAL__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(Part2Package.eINSTANCE.getAngleTypeVal(), angleTypeVal, ANGLE_TYPE_VAL__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleTypeValObject(Double angleTypeValObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngleTypeVal_Min(angleTypeValObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngleTypeVal_Max(angleTypeValObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAspectRatioType(Object aspectRatioType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAspectRatioType_MemberTypes(aspectRatioType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Aspect Ratio Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAspectRatioType_MemberTypes(Object aspectRatioType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Part2Package.eINSTANCE.getAspectRatioTypeVal().isInstance(aspectRatioType)) {
				if (validateAspectRatioTypeVal((AspectRatioTypeVal)aspectRatioType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(aspectRatioType)) {
				if (validateExpression((String)aspectRatioType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Part2Package.eINSTANCE.getAspectRatioTypeVal().isInstance(aspectRatioType)) {
				if (validateAspectRatioTypeVal((AspectRatioTypeVal)aspectRatioType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(aspectRatioType)) {
				if (validateExpression((String)aspectRatioType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAspectRatioTypeObject(AspectRatioType1 aspectRatioTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAspectRatioTypeValObject(AspectRatioTypeVal aspectRatioTypeValObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanType(Object booleanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBooleanType_MemberTypes(booleanType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanType_MemberTypes(Object booleanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Part2Package.eINSTANCE.getBooleanTypeVal().isInstance(booleanType)) {
				if (validateBooleanTypeVal((BooleanTypeVal)booleanType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(booleanType)) {
				if (validateExpression((String)booleanType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Part2Package.eINSTANCE.getBooleanTypeVal().isInstance(booleanType)) {
				if (validateBooleanTypeVal((BooleanTypeVal)booleanType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(booleanType)) {
				if (validateExpression((String)booleanType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanTypeValObject(BooleanTypeVal booleanTypeValObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterType(String characterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCharacterType_MinLength(characterType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacterType_MaxLength(characterType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Character Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterType_MinLength(String characterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = characterType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Part2Package.eINSTANCE.getCharacterType(), characterType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Character Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterType_MaxLength(String characterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = characterType.length();
		boolean result = length <= 1;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Part2Package.eINSTANCE.getCharacterType(), characterType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClipRuleTypeObject(ClipRuleType clipRuleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorReferenceTypeObject(ColorReferenceType colorReferenceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorRGBHEXType(String colorRGBHEXType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColorRGBHEXType_Pattern(colorRGBHEXType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateColorRGBHEXType_Pattern
	 */
	public static final  PatternMatcher [][] COLOR_RGBHEX_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("#[0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F])?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Color RGBHEX Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorRGBHEXType_Pattern(String colorRGBHEXType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Part2Package.eINSTANCE.getColorRGBHEXType(), colorRGBHEXType, COLOR_RGBHEX_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorRGBRgb255Type(String colorRGBRgb255Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColorRGBRgb255Type_Pattern(colorRGBRgb255Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateColorRGBRgb255Type_Pattern
	 */
	public static final  PatternMatcher [][] COLOR_RGB_RGB255_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("rgb\\(\\s*([0-9]?[0-9]|[01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])\\s*,\\s*([0-9]?[0-9]|[01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])\\s*,\\s*([0-9]?[0-9]|[01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])\\s*\\)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Color RGB Rgb255 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorRGBRgb255Type_Pattern(String colorRGBRgb255Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Part2Package.eINSTANCE.getColorRGBRgb255Type(), colorRGBRgb255Type, COLOR_RGB_RGB255_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorRGBRgbPercentType(String colorRGBRgbPercentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColorRGBRgbPercentType_Pattern(colorRGBRgbPercentType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateColorRGBRgbPercentType_Pattern
	 */
	public static final  PatternMatcher [][] COLOR_RGB_RGB_PERCENT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("rgb\\(\\s*([0-9]?[0-9]|0?[0-9][0-9]|100)\\s*%\\s*,\\s*([0-9]?[0-9]|0?[0-9][0-9]|100)\\s*%\\s*,\\s*([0-9]?[0-9]|0?[0-9][0-9]|100)\\s*%\\s*\\)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Color RGB Rgb Percent Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorRGBRgbPercentType_Pattern(String colorRGBRgbPercentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Part2Package.eINSTANCE.getColorRGBRgbPercentType(), colorRGBRgbPercentType, COLOR_RGB_RGB_PERCENT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorRGBType(String colorRGBType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColorRGBType_MemberTypes(colorRGBType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Color RGB Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorRGBType_MemberTypes(String colorRGBType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Part2Package.eINSTANCE.getColorRGBRgbPercentType().isInstance(colorRGBType)) {
				if (validateColorRGBRgbPercentType(colorRGBType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getColorRGBRgb255Type().isInstance(colorRGBType)) {
				if (validateColorRGBRgb255Type(colorRGBType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getColorRGBHEXType().isInstance(colorRGBType)) {
				if (validateColorRGBHEXType(colorRGBType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Part2Package.eINSTANCE.getColorRGBRgbPercentType().isInstance(colorRGBType)) {
				if (validateColorRGBRgbPercentType(colorRGBType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getColorRGBRgb255Type().isInstance(colorRGBType)) {
				if (validateColorRGBRgb255Type(colorRGBType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getColorRGBHEXType().isInstance(colorRGBType)) {
				if (validateColorRGBHEXType(colorRGBType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorType(Object colorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColorType_MemberTypes(colorType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Color Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorType_MemberTypes(Object colorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Part2Package.eINSTANCE.getColorRGBType().isInstance(colorType)) {
				if (validateColorRGBType((String)colorType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getColorReferenceType().isInstance(colorType)) {
				if (validateColorReferenceType((ColorReferenceType)colorType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Part2Package.eINSTANCE.getColorRGBType().isInstance(colorType)) {
				if (validateColorRGBType((String)colorType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getColorReferenceType().isInstance(colorType)) {
				if (validateColorReferenceType((ColorReferenceType)colorType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeType(Object dateTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeType_MemberTypes(dateTimeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeType_MemberTypes(Object dateTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateDateTime((XMLGregorianCalendar)dateTimeType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(dateTimeType)) {
				if (validateExpression((String)dateTimeType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateDateTime((XMLGregorianCalendar)dateTimeType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(dateTimeType)) {
				if (validateExpression((String)dateTimeType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateType(Object dateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateType_MemberTypes(dateType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateType_MemberTypes(Object dateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DATE.isInstance(dateType)) {
				if (xmlTypeValidator.validateDate((XMLGregorianCalendar)dateType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(dateType)) {
				if (validateExpression((String)dateType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DATE.isInstance(dateType)) {
				if (xmlTypeValidator.validateDate((XMLGregorianCalendar)dateType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(dateType)) {
				if (validateExpression((String)dateType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistanceType(Object distanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDistanceType_MemberTypes(distanceType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Distance Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistanceType_MemberTypes(Object distanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DOUBLE.isInstance(distanceType)) {
				if (xmlTypeValidator.validateDouble((Double)distanceType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(distanceType)) {
				if (validateExpression((String)distanceType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DOUBLE.isInstance(distanceType)) {
				if (xmlTypeValidator.validateDouble((Double)distanceType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(distanceType)) {
				if (validateExpression((String)distanceType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(String expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExpression_Pattern(expression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateExpression_Pattern
	 */
	public static final  PatternMatcher [][] EXPRESSION__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\{.*\\}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_Pattern(String expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Part2Package.eINSTANCE.getExpression(), expression, EXPRESSION__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillRuleType(Object fillRuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFillRuleType_MemberTypes(fillRuleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Fill Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillRuleType_MemberTypes(Object fillRuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Part2Package.eINSTANCE.getFillRuleTypeVal().isInstance(fillRuleType)) {
				if (validateFillRuleTypeVal((FillRuleTypeVal)fillRuleType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(fillRuleType)) {
				if (validateExpression((String)fillRuleType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Part2Package.eINSTANCE.getFillRuleTypeVal().isInstance(fillRuleType)) {
				if (validateFillRuleTypeVal((FillRuleTypeVal)fillRuleType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(fillRuleType)) {
				if (validateExpression((String)fillRuleType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillRuleTypeObject(FillRuleType1 fillRuleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillRuleTypeValObject(FillRuleTypeVal fillRuleTypeValObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowDirectionTypeObject(FlowDirectionType flowDirectionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontType(String fontType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFontType_MemberTypes(fontType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Font Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontType_MemberTypes(String fontType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(fontType)) {
				if (xmlTypeValidator.validateAnyURI(fontType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(fontType)) {
				if (validateExpression(fontType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.ANY_URI.isInstance(fontType)) {
				if (xmlTypeValidator.validateAnyURI(fontType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(fontType)) {
				if (validateExpression(fontType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatStringType(String formatStringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFormatStringType_MemberTypes(formatStringType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Format String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatStringType_MemberTypes(String formatStringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Part2Package.eINSTANCE.getFormatStringTypeVal().isInstance(formatStringType)) {
				if (validateFormatStringTypeVal(formatStringType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(formatStringType)) {
				if (validateExpression(formatStringType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Part2Package.eINSTANCE.getFormatStringTypeVal().isInstance(formatStringType)) {
				if (validateFormatStringTypeVal(formatStringType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(formatStringType)) {
				if (validateExpression(formatStringType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatStringTypeVal(String formatStringTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFormatStringTypeVal_Pattern(formatStringTypeVal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFormatStringTypeVal_Pattern
	 */
	public static final  PatternMatcher [][] FORMAT_STRING_TYPE_VAL__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^_\\.\\+#\u23e8]*\\+?[^\\.\\+#\u23e8]*[^_\\.\\+\u23e8]*\\.?[^_\\.\\+\u23e8]*[^\\.\\+#\u23e8]*(\u23e8\\+?[_]*[#]+)?[^_\\.\\+#\u23e8]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Format String Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatStringTypeVal_Pattern(String formatStringTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Part2Package.eINSTANCE.getFormatStringTypeVal(), formatStringTypeVal, FORMAT_STRING_TYPE_VAL__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyType(Object frequencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFrequencyType_MemberTypes(frequencyType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Frequency Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyType_MemberTypes(Object frequencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Part2Package.eINSTANCE.getFrequencyTypeVal().isInstance(frequencyType)) {
				if (validateFrequencyTypeVal((Double)frequencyType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(frequencyType)) {
				if (validateExpression((String)frequencyType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Part2Package.eINSTANCE.getFrequencyTypeVal().isInstance(frequencyType)) {
				if (validateFrequencyTypeVal((Double)frequencyType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(frequencyType)) {
				if (validateExpression((String)frequencyType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyTypeVal(double frequencyTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFrequencyTypeVal_Min(frequencyTypeVal, diagnostics, context);
		if (result || diagnostics != null) result &= validateFrequencyTypeVal_Max(frequencyTypeVal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFrequencyTypeVal_Min
	 */
	public static final double FREQUENCY_TYPE_VAL__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Frequency Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyTypeVal_Min(double frequencyTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = frequencyTypeVal >= FREQUENCY_TYPE_VAL__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(Part2Package.eINSTANCE.getFrequencyTypeVal(), frequencyTypeVal, FREQUENCY_TYPE_VAL__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFrequencyTypeVal_Max
	 */
	public static final double FREQUENCY_TYPE_VAL__MAX__VALUE = 1000.0;

	/**
	 * Validates the Max constraint of '<em>Frequency Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyTypeVal_Max(double frequencyTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = frequencyTypeVal <= FREQUENCY_TYPE_VAL__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(Part2Package.eINSTANCE.getFrequencyTypeVal(), frequencyTypeVal, FREQUENCY_TYPE_VAL__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyTypeValObject(Double frequencyTypeValObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFrequencyTypeVal_Min(frequencyTypeValObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateFrequencyTypeVal_Max(frequencyTypeValObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageType(String imageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateImageType_MemberTypes(imageType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Image Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageType_MemberTypes(String imageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(imageType)) {
				if (xmlTypeValidator.validateAnyURI(imageType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(imageType)) {
				if (validateExpression(imageType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.ANY_URI.isInstance(imageType)) {
				if (xmlTypeValidator.validateAnyURI(imageType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(imageType)) {
				if (validateExpression(imageType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantiationModeTypeObject(InstantiationModeType instantiationModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerType(Object integerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerType_MemberTypes(integerType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerType_MemberTypes(Object integerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.LONG.isInstance(integerType)) {
				if (xmlTypeValidator.validateLong((Long)integerType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(integerType)) {
				if (validateExpression((String)integerType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.LONG.isInstance(integerType)) {
				if (xmlTypeValidator.validateLong((Long)integerType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(integerType)) {
				if (validateExpression((String)integerType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModalityTypeObject(ModalityType modalityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModalityTypeObject1(ModalityType1 modalityTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModalityTypeObject2(ModalityType2 modalityTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultilineModeTypeObject(MultilineModeType multilineModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType(String nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameType_Pattern(nameType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNameType_MinLength(nameType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNameType_MaxLength(nameType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNameType_Pattern
	 */
	public static final  PatternMatcher [][] NAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[_a-zA-Z][_0-9a-zA-Z]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType_Pattern(String nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Part2Package.eINSTANCE.getNameType(), nameType, NAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType_MinLength(String nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nameType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Part2Package.eINSTANCE.getNameType(), nameType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType_MaxLength(String nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nameType.length();
		boolean result = length <= 128;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Part2Package.eINSTANCE.getNameType(), nameType, length, 128, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectType(String objectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateObjectType_Pattern(objectType, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectType_MinLength(objectType, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectType_MaxLength(objectType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateObjectType_Pattern
	 */
	public static final  PatternMatcher [][] OBJECT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[_a-zA-Z][_0-9a-zA-Z]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectType_Pattern(String objectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Part2Package.eINSTANCE.getObjectType(), objectType, OBJECT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectType_MinLength(String objectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = objectType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Part2Package.eINSTANCE.getObjectType(), objectType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectType_MaxLength(String objectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = objectType.length();
		boolean result = length <= 128;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Part2Package.eINSTANCE.getObjectType(), objectType, length, 128, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpacityType(Object opacityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOpacityType_MemberTypes(opacityType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Opacity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpacityType_MemberTypes(Object opacityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Part2Package.eINSTANCE.getOpacityTypeVal().isInstance(opacityType)) {
				if (validateOpacityTypeVal((Double)opacityType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(opacityType)) {
				if (validateExpression((String)opacityType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Part2Package.eINSTANCE.getOpacityTypeVal().isInstance(opacityType)) {
				if (validateOpacityTypeVal((Double)opacityType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(opacityType)) {
				if (validateExpression((String)opacityType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpacityTypeVal(double opacityTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOpacityTypeVal_Min(opacityTypeVal, diagnostics, context);
		if (result || diagnostics != null) result &= validateOpacityTypeVal_Max(opacityTypeVal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOpacityTypeVal_Min
	 */
	public static final double OPACITY_TYPE_VAL__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Opacity Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpacityTypeVal_Min(double opacityTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = opacityTypeVal >= OPACITY_TYPE_VAL__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(Part2Package.eINSTANCE.getOpacityTypeVal(), opacityTypeVal, OPACITY_TYPE_VAL__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOpacityTypeVal_Max
	 */
	public static final double OPACITY_TYPE_VAL__MAX__VALUE = 1.0;

	/**
	 * Validates the Max constraint of '<em>Opacity Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpacityTypeVal_Max(double opacityTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = opacityTypeVal <= OPACITY_TYPE_VAL__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(Part2Package.eINSTANCE.getOpacityTypeVal(), opacityTypeVal, OPACITY_TYPE_VAL__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpacityTypeValObject(Double opacityTypeValObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOpacityTypeVal_Min(opacityTypeValObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateOpacityTypeVal_Max(opacityTypeValObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionType(Object positionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositionType_MemberTypes(positionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionType_MemberTypes(Object positionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DOUBLE.isInstance(positionType)) {
				if (xmlTypeValidator.validateDouble((Double)positionType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(positionType)) {
				if (validateExpression((String)positionType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DOUBLE.isInstance(positionType)) {
				if (xmlTypeValidator.validateDouble((Double)positionType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(positionType)) {
				if (validateExpression((String)positionType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePressureType(Object pressureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePressureType_MemberTypes(pressureType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Pressure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePressureType_MemberTypes(Object pressureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Part2Package.eINSTANCE.getPressureTypeVal().isInstance(pressureType)) {
				if (validatePressureTypeVal((Double)pressureType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(pressureType)) {
				if (validateExpression((String)pressureType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Part2Package.eINSTANCE.getPressureTypeVal().isInstance(pressureType)) {
				if (validatePressureTypeVal((Double)pressureType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(pressureType)) {
				if (validateExpression((String)pressureType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePressureTypeVal(double pressureTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePressureTypeVal_Min(pressureTypeVal, diagnostics, context);
		if (result || diagnostics != null) result &= validatePressureTypeVal_Max(pressureTypeVal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePressureTypeVal_Min
	 */
	public static final double PRESSURE_TYPE_VAL__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Pressure Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePressureTypeVal_Min(double pressureTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = pressureTypeVal >= PRESSURE_TYPE_VAL__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(Part2Package.eINSTANCE.getPressureTypeVal(), pressureTypeVal, PRESSURE_TYPE_VAL__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePressureTypeVal_Max
	 */
	public static final double PRESSURE_TYPE_VAL__MAX__VALUE = 1.0;

	/**
	 * Validates the Max constraint of '<em>Pressure Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePressureTypeVal_Max(double pressureTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = pressureTypeVal <= PRESSURE_TYPE_VAL__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(Part2Package.eINSTANCE.getPressureTypeVal(), pressureTypeVal, PRESSURE_TYPE_VAL__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePressureTypeValObject(Double pressureTypeValObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePressureTypeVal_Min(pressureTypeValObject, diagnostics, context);
		if (result || diagnostics != null) result &= validatePressureTypeVal_Max(pressureTypeValObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealType(Object realType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRealType_MemberTypes(realType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealType_MemberTypes(Object realType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DOUBLE.isInstance(realType)) {
				if (xmlTypeValidator.validateDouble((Double)realType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(realType)) {
				if (validateExpression((String)realType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DOUBLE.isInstance(realType)) {
				if (xmlTypeValidator.validateDouble((Double)realType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(realType)) {
				if (validateExpression((String)realType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStippleType(String stippleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringType(String stringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeLinecapTypeObject(StrokeLinecapType strokeLinecapTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeLinejoinTypeObject(StrokeLinejoinType strokeLinejoinTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextFlowTypeObject(TextFlowType textFlowTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeDefaultmillisecondsType(String timeDefaultmillisecondsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeDefaultmillisecondsType_Pattern(timeDefaultmillisecondsType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimeDefaultmillisecondsType_Pattern
	 */
	public static final  PatternMatcher [][] TIME_DEFAULTMILLISECONDS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+-]?[0-9]*(\\.[0-9]*)?(E[+-]?[0-9]?[0-9])?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Time Defaultmilliseconds Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeDefaultmillisecondsType_Pattern(String timeDefaultmillisecondsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Part2Package.eINSTANCE.getTimeDefaultmillisecondsType(), timeDefaultmillisecondsType, TIME_DEFAULTMILLISECONDS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeHoursType(String timeHoursType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeHoursType_Pattern(timeHoursType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimeHoursType_Pattern
	 */
	public static final  PatternMatcher [][] TIME_HOURS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+-]?[0-9]*(\\.[0-9]*)?(E[+-]?[0-9]?[0-9])?\\s*[hH]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Time Hours Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeHoursType_Pattern(String timeHoursType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Part2Package.eINSTANCE.getTimeHoursType(), timeHoursType, TIME_HOURS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeMinutesType(String timeMinutesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeMinutesType_Pattern(timeMinutesType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimeMinutesType_Pattern
	 */
	public static final  PatternMatcher [][] TIME_MINUTES_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+-]?[0-9]*(\\.[0-9]*)?(E[+-]?[0-9]?[0-9])?\\s*[mM][nN]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Time Minutes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeMinutesType_Pattern(String timeMinutesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Part2Package.eINSTANCE.getTimeMinutesType(), timeMinutesType, TIME_MINUTES_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSecondsOrSubsecondsType(String timeSecondsOrSubsecondsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeSecondsOrSubsecondsType_Pattern(timeSecondsOrSubsecondsType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimeSecondsOrSubsecondsType_Pattern
	 */
	public static final  PatternMatcher [][] TIME_SECONDS_OR_SUBSECONDS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+-]?[0-9]*(\\.[0-9]*)?(E[+-]?[0-9]?[0-9])?\\s*[mM\u00b5]?[sS]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Time Seconds Or Subseconds Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSecondsOrSubsecondsType_Pattern(String timeSecondsOrSubsecondsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Part2Package.eINSTANCE.getTimeSecondsOrSubsecondsType(), timeSecondsOrSubsecondsType, TIME_SECONDS_OR_SUBSECONDS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType(String timeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeType_MemberTypes(timeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType_MemberTypes(String timeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Part2Package.eINSTANCE.getTimeHoursType().isInstance(timeType)) {
				if (validateTimeHoursType(timeType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getTimeMinutesType().isInstance(timeType)) {
				if (validateTimeMinutesType(timeType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getTimeSecondsOrSubsecondsType().isInstance(timeType)) {
				if (validateTimeSecondsOrSubsecondsType(timeType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getTimeDefaultmillisecondsType().isInstance(timeType)) {
				if (validateTimeDefaultmillisecondsType(timeType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Part2Package.eINSTANCE.getTimeHoursType().isInstance(timeType)) {
				if (validateTimeHoursType(timeType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getTimeMinutesType().isInstance(timeType)) {
				if (validateTimeMinutesType(timeType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getTimeSecondsOrSubsecondsType().isInstance(timeType)) {
				if (validateTimeSecondsOrSubsecondsType(timeType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getTimeDefaultmillisecondsType().isInstance(timeType)) {
				if (validateTimeDefaultmillisecondsType(timeType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(String typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeType_Pattern(typeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeType_MinLength(typeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeType_MaxLength(typeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeType_Pattern
	 */
	public static final  PatternMatcher [][] TYPE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[_a-zA-Z][_0-9a-zA-Z]*Type")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType_Pattern(String typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Part2Package.eINSTANCE.getTypeType(), typeType, TYPE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType_MinLength(String typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Part2Package.eINSTANCE.getTypeType(), typeType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType_MaxLength(String typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeType.length();
		boolean result = length <= 128;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Part2Package.eINSTANCE.getTypeType(), typeType, length, 128, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVelocityType(double velocityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVelocityType_Min(velocityType, diagnostics, context);
		if (result || diagnostics != null) result &= validateVelocityType_Max(velocityType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVelocityType_Min
	 */
	public static final double VELOCITY_TYPE__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Velocity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVelocityType_Min(double velocityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = velocityType >= VELOCITY_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(Part2Package.eINSTANCE.getVelocityType(), velocityType, VELOCITY_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVelocityType_Max
	 */
	public static final double VELOCITY_TYPE__MAX__VALUE = 3.0E11;

	/**
	 * Validates the Max constraint of '<em>Velocity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVelocityType_Max(double velocityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = velocityType <= VELOCITY_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(Part2Package.eINSTANCE.getVelocityType(), velocityType, VELOCITY_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVelocityTypeObject(Double velocityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVelocityType_Min(velocityTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateVelocityType_Max(velocityTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityType(Object visibilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVisibilityType_MemberTypes(visibilityType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Visibility Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityType_MemberTypes(Object visibilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Part2Package.eINSTANCE.getVisibilityTypeVal().isInstance(visibilityType)) {
				if (validateVisibilityTypeVal((VisibilityTypeVal)visibilityType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(visibilityType)) {
				if (validateExpression((String)visibilityType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Part2Package.eINSTANCE.getVisibilityTypeVal().isInstance(visibilityType)) {
				if (validateVisibilityTypeVal((VisibilityTypeVal)visibilityType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(visibilityType)) {
				if (validateExpression((String)visibilityType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityTypeValObject(VisibilityTypeVal visibilityTypeValObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZIndexType(Object zIndexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateZIndexType_MemberTypes(zIndexType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>ZIndex Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZIndexType_MemberTypes(Object zIndexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Part2Package.eINSTANCE.getZIndexTypeVal().isInstance(zIndexType)) {
				if (validateZIndexTypeVal((BigInteger)zIndexType, tempDiagnostics, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(zIndexType)) {
				if (validateExpression((String)zIndexType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Part2Package.eINSTANCE.getZIndexTypeVal().isInstance(zIndexType)) {
				if (validateZIndexTypeVal((BigInteger)zIndexType, null, context)) return true;
			}
			if (Part2Package.eINSTANCE.getExpression().isInstance(zIndexType)) {
				if (validateExpression((String)zIndexType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZIndexTypeVal(BigInteger zIndexTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateZIndexTypeVal_Min(zIndexTypeVal, diagnostics, context);
		if (result || diagnostics != null) result &= validateZIndexTypeVal_Max(zIndexTypeVal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateZIndexTypeVal_Min
	 */
	public static final BigInteger ZINDEX_TYPE_VAL__MIN__VALUE = new BigInteger("-32768");

	/**
	 * Validates the Min constraint of '<em>ZIndex Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZIndexTypeVal_Min(BigInteger zIndexTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = zIndexTypeVal.compareTo(ZINDEX_TYPE_VAL__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Part2Package.eINSTANCE.getZIndexTypeVal(), zIndexTypeVal, ZINDEX_TYPE_VAL__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateZIndexTypeVal_Max
	 */
	public static final BigInteger ZINDEX_TYPE_VAL__MAX__VALUE = new BigInteger("32767");

	/**
	 * Validates the Max constraint of '<em>ZIndex Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZIndexTypeVal_Max(BigInteger zIndexTypeVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = zIndexTypeVal.compareTo(ZINDEX_TYPE_VAL__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(Part2Package.eINSTANCE.getZIndexTypeVal(), zIndexTypeVal, ZINDEX_TYPE_VAL__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Part2Validator
