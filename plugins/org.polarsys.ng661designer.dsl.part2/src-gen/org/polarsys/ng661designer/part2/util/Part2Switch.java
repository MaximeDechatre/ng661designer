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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.ng661designer.part2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.polarsys.ng661designer.part2.Part2Package
 * @generated
 */
public class Part2Switch<T> extends Switch<T> {
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
	protected static Part2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part2Switch() {
		if (modelPackage == null) {
			modelPackage = Part2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Part2Package.ARC_COMPONENT: {
				ArcComponent arcComponent = (ArcComponent)theEObject;
				T result = caseArcComponent(arcComponent);
				if (result == null) result = caseTreeTypes(arcComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.ARRAY_DEFINITION_TYPE: {
				ArrayDefinitionType arrayDefinitionType = (ArrayDefinitionType)theEObject;
				T result = caseArrayDefinitionType(arrayDefinitionType);
				if (result == null) result = caseTypeDefinitionAbstractType(arrayDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.ARRAY_ENTRY_TYPE: {
				ArrayEntryType arrayEntryType = (ArrayEntryType)theEObject;
				T result = caseArrayEntryType(arrayEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.ARRAY_EVENT_TYPE: {
				ArrayEventType arrayEventType = (ArrayEventType)theEObject;
				T result = caseArrayEventType(arrayEventType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.ARRAY_FIELD_DEFINITION_TYPE: {
				ArrayFieldDefinitionType arrayFieldDefinitionType = (ArrayFieldDefinitionType)theEObject;
				T result = caseArrayFieldDefinitionType(arrayFieldDefinitionType);
				if (result == null) result = caseFieldDefinitionAbstractType(arrayFieldDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.ARRAY_FIELD_TYPE: {
				ArrayFieldType arrayFieldType = (ArrayFieldType)theEObject;
				T result = caseArrayFieldType(arrayFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.ARRAY_PROPERTY_TYPE: {
				ArrayPropertyType arrayPropertyType = (ArrayPropertyType)theEObject;
				T result = caseArrayPropertyType(arrayPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.BEHAVIOR_TYPE: {
				BehaviorType behaviorType = (BehaviorType)theEObject;
				T result = caseBehaviorType(behaviorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CHILD_PRIMITIVE: {
				ChildPrimitive childPrimitive = (ChildPrimitive)theEObject;
				T result = caseChildPrimitive(childPrimitive);
				if (result == null) result = caseTreeTypes(childPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CIRCLE_PRIMITIVE: {
				CirclePrimitive circlePrimitive = (CirclePrimitive)theEObject;
				T result = caseCirclePrimitive(circlePrimitive);
				if (result == null) result = caseClipPathTypes(circlePrimitive);
				if (result == null) result = caseTreeTypes(circlePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CLIP_PATH_PRIMITIVE: {
				ClipPathPrimitive clipPathPrimitive = (ClipPathPrimitive)theEObject;
				T result = caseClipPathPrimitive(clipPathPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CLIPPING_CONTAINER_PRIMITIVE: {
				ClippingContainerPrimitive clippingContainerPrimitive = (ClippingContainerPrimitive)theEObject;
				T result = caseClippingContainerPrimitive(clippingContainerPrimitive);
				if (result == null) result = caseTreeTypes(clippingContainerPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CLOCK_TYPE: {
				ClockType clockType = (ClockType)theEObject;
				T result = caseClockType(clockType);
				if (result == null) result = caseTreeTypes(clockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CLOSE_PATH_COMMAND: {
				ClosePathCommand closePathCommand = (ClosePathCommand)theEObject;
				T result = caseClosePathCommand(closePathCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.COMPONENT_DEFINITION_TYPE: {
				ComponentDefinitionType componentDefinitionType = (ComponentDefinitionType)theEObject;
				T result = caseComponentDefinitionType(componentDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CROWN_COMPONENT: {
				CrownComponent crownComponent = (CrownComponent)theEObject;
				T result = caseCrownComponent(crownComponent);
				if (result == null) result = caseTreeTypes(crownComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND: {
				CubicBezierCurveCommand cubicBezierCurveCommand = (CubicBezierCurveCommand)theEObject;
				T result = caseCubicBezierCurveCommand(cubicBezierCurveCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CUSTOM_INTEGER_TYPE_ELEMENT_TYPE: {
				CustomIntegerTypeElementType customIntegerTypeElementType = (CustomIntegerTypeElementType)theEObject;
				T result = caseCustomIntegerTypeElementType(customIntegerTypeElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CUSTOM_REAL_TYPE_ELEMENT_TYPE: {
				CustomRealTypeElementType customRealTypeElementType = (CustomRealTypeElementType)theEObject;
				T result = caseCustomRealTypeElementType(customRealTypeElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CUSTOM_STRING_TYPE_ELEMENT_TYPE: {
				CustomStringTypeElementType customStringTypeElementType = (CustomStringTypeElementType)theEObject;
				T result = caseCustomStringTypeElementType(customStringTypeElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.DEFINITIONS_TYPE: {
				DefinitionsType definitionsType = (DefinitionsType)theEObject;
				T result = caseDefinitionsType(definitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.DEFINITION_TYPE: {
				DefinitionType definitionType = (DefinitionType)theEObject;
				T result = caseDefinitionType(definitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND: {
				EllipseArcCurveCommand ellipseArcCurveCommand = (EllipseArcCurveCommand)theEObject;
				T result = caseEllipseArcCurveCommand(ellipseArcCurveCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.ELLIPSE_PRIMITIVE: {
				EllipsePrimitive ellipsePrimitive = (EllipsePrimitive)theEObject;
				T result = caseEllipsePrimitive(ellipsePrimitive);
				if (result == null) result = caseClipPathTypes(ellipsePrimitive);
				if (result == null) result = caseTreeTypes(ellipsePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.ENTRY_TYPE: {
				EntryType entryType = (EntryType)theEObject;
				T result = caseEntryType(entryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.ENUM_DEFINITION_TYPE: {
				EnumDefinitionType enumDefinitionType = (EnumDefinitionType)theEObject;
				T result = caseEnumDefinitionType(enumDefinitionType);
				if (result == null) result = caseTypeDefinitionAbstractType(enumDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.ENUMERATION_TYPE: {
				EnumerationType enumerationType = (EnumerationType)theEObject;
				T result = caseEnumerationType(enumerationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.EVENT_TYPE: {
				EventType eventType = (EventType)theEObject;
				T result = caseEventType(eventType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.FIELD_DEFINITION_ABSTRACT_TYPE: {
				FieldDefinitionAbstractType fieldDefinitionAbstractType = (FieldDefinitionAbstractType)theEObject;
				T result = caseFieldDefinitionAbstractType(fieldDefinitionAbstractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.FIELD_DEFINITION_TYPE: {
				FieldDefinitionType fieldDefinitionType = (FieldDefinitionType)theEObject;
				T result = caseFieldDefinitionType(fieldDefinitionType);
				if (result == null) result = caseFieldDefinitionAbstractType(fieldDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.FIELD_TYPE: {
				FieldType fieldType = (FieldType)theEObject;
				T result = caseFieldType(fieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.FRAME_PROPERTIES: {
				FrameProperties frameProperties = (FrameProperties)theEObject;
				T result = caseFrameProperties(frameProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				T result = caseFunctionType(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.GESTURE_AREA_PRIMITIVE: {
				GestureAreaPrimitive gestureAreaPrimitive = (GestureAreaPrimitive)theEObject;
				T result = caseGestureAreaPrimitive(gestureAreaPrimitive);
				if (result == null) result = caseTreeTypes(gestureAreaPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.GROUP_PRIMITIVE: {
				GroupPrimitive groupPrimitive = (GroupPrimitive)theEObject;
				T result = caseGroupPrimitive(groupPrimitive);
				if (result == null) result = caseTreeTypes(groupPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.IMAGE_PRIMITIVE: {
				ImagePrimitive imagePrimitive = (ImagePrimitive)theEObject;
				T result = caseImagePrimitive(imagePrimitive);
				if (result == null) result = caseTreeTypes(imagePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.IMPORT_TYPE: {
				ImportType importType = (ImportType)theEObject;
				T result = caseImportType(importType);
				if (result == null) result = caseTreeTypes(importType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.INTERFACE_TYPE: {
				InterfaceType interfaceType = (InterfaceType)theEObject;
				T result = caseInterfaceType(interfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE: {
				KeyboardInputPrimitive keyboardInputPrimitive = (KeyboardInputPrimitive)theEObject;
				T result = caseKeyboardInputPrimitive(keyboardInputPrimitive);
				if (result == null) result = caseTreeTypes(keyboardInputPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.LINE_PRIMITIVE: {
				LinePrimitive linePrimitive = (LinePrimitive)theEObject;
				T result = caseLinePrimitive(linePrimitive);
				if (result == null) result = caseClipPathTypes(linePrimitive);
				if (result == null) result = caseTreeTypes(linePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.LINE_TO_COMMAND: {
				LineToCommand lineToCommand = (LineToCommand)theEObject;
				T result = caseLineToCommand(lineToCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.MOVE_TO_COMMAND: {
				MoveToCommand moveToCommand = (MoveToCommand)theEObject;
				T result = caseMoveToCommand(moveToCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.OPERATION_TYPE: {
				OperationType operationType = (OperationType)theEObject;
				T result = caseOperationType(operationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.OTHER_ARRAY_ENTRIES_TYPE: {
				OtherArrayEntriesType otherArrayEntriesType = (OtherArrayEntriesType)theEObject;
				T result = caseOtherArrayEntriesType(otherArrayEntriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.OTHER_ENTRIES_TYPE: {
				OtherEntriesType otherEntriesType = (OtherEntriesType)theEObject;
				T result = caseOtherEntriesType(otherEntriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE: {
				OtherStructEntriesType otherStructEntriesType = (OtherStructEntriesType)theEObject;
				T result = caseOtherStructEntriesType(otherStructEntriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.OTHER_UNION_ENTRIES_TYPE: {
				OtherUnionEntriesType otherUnionEntriesType = (OtherUnionEntriesType)theEObject;
				T result = caseOtherUnionEntriesType(otherUnionEntriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.PARAM_TYPE: {
				ParamType paramType = (ParamType)theEObject;
				T result = caseParamType(paramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.PATH_ARRAY: {
				PathArray pathArray = (PathArray)theEObject;
				T result = casePathArray(pathArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.PATH_PRIMITIVE: {
				PathPrimitive pathPrimitive = (PathPrimitive)theEObject;
				T result = casePathPrimitive(pathPrimitive);
				if (result == null) result = caseClipPathTypes(pathPrimitive);
				if (result == null) result = caseTreeTypes(pathPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.POINTER_AREA_PRIMITIVE: {
				PointerAreaPrimitive pointerAreaPrimitive = (PointerAreaPrimitive)theEObject;
				T result = casePointerAreaPrimitive(pointerAreaPrimitive);
				if (result == null) result = caseTreeTypes(pointerAreaPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.POINTER_GESTURE_AREA_PRIMITIVE: {
				PointerGestureAreaPrimitive pointerGestureAreaPrimitive = (PointerGestureAreaPrimitive)theEObject;
				T result = casePointerGestureAreaPrimitive(pointerGestureAreaPrimitive);
				if (result == null) result = caseTreeTypes(pointerGestureAreaPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.POINT_TYPE: {
				PointType pointType = (PointType)theEObject;
				T result = casePointType(pointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.POLAR_LINE_COMPONENT: {
				PolarLineComponent polarLineComponent = (PolarLineComponent)theEObject;
				T result = casePolarLineComponent(polarLineComponent);
				if (result == null) result = caseTreeTypes(polarLineComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.POLYGON_PRIMITIVE: {
				PolygonPrimitive polygonPrimitive = (PolygonPrimitive)theEObject;
				T result = casePolygonPrimitive(polygonPrimitive);
				if (result == null) result = caseTreeTypes(polygonPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.POLYLINE_PRIMITIVE: {
				PolylinePrimitive polylinePrimitive = (PolylinePrimitive)theEObject;
				T result = casePolylinePrimitive(polylinePrimitive);
				if (result == null) result = caseTreeTypes(polylinePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.POSITION_LIST_TYPE: {
				PositionListType positionListType = (PositionListType)theEObject;
				T result = casePositionListType(positionListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.PRIVATE_PROPERTY_TYPE: {
				PrivatePropertyType privatePropertyType = (PrivatePropertyType)theEObject;
				T result = casePrivatePropertyType(privatePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.RECT_PRIMITIVE: {
				RectPrimitive rectPrimitive = (RectPrimitive)theEObject;
				T result = caseRectPrimitive(rectPrimitive);
				if (result == null) result = caseClipPathTypes(rectPrimitive);
				if (result == null) result = caseTreeTypes(rectPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.RELATIVE_CLOSE_PATH_COMMAND: {
				RelativeClosePathCommand relativeClosePathCommand = (RelativeClosePathCommand)theEObject;
				T result = caseRelativeClosePathCommand(relativeClosePathCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.RELATIVE_CUBIC_BEZIER_CURVE_COMMAND: {
				RelativeCubicBezierCurveCommand relativeCubicBezierCurveCommand = (RelativeCubicBezierCurveCommand)theEObject;
				T result = caseRelativeCubicBezierCurveCommand(relativeCubicBezierCurveCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.RELATIVE_ELLIPSE_ARC_CURVE_COMMAND: {
				RelativeEllipseArcCurveCommand relativeEllipseArcCurveCommand = (RelativeEllipseArcCurveCommand)theEObject;
				T result = caseRelativeEllipseArcCurveCommand(relativeEllipseArcCurveCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.RELATIVE_LINE_TO_COMMAND: {
				RelativeLineToCommand relativeLineToCommand = (RelativeLineToCommand)theEObject;
				T result = caseRelativeLineToCommand(relativeLineToCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.RELATIVE_MOVE_TO_COMMAND: {
				RelativeMoveToCommand relativeMoveToCommand = (RelativeMoveToCommand)theEObject;
				T result = caseRelativeMoveToCommand(relativeMoveToCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.REPLICATE_PRIMITIVE: {
				ReplicatePrimitive replicatePrimitive = (ReplicatePrimitive)theEObject;
				T result = caseReplicatePrimitive(replicatePrimitive);
				if (result == null) result = caseTreeTypes(replicatePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.REVERSE_VIDEO_PROPERTIES: {
				ReverseVideoProperties reverseVideoProperties = (ReverseVideoProperties)theEObject;
				T result = caseReverseVideoProperties(reverseVideoProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.SCROLL_WHEEL_INPUT_PRIMITIVE: {
				ScrollWheelInputPrimitive scrollWheelInputPrimitive = (ScrollWheelInputPrimitive)theEObject;
				T result = caseScrollWheelInputPrimitive(scrollWheelInputPrimitive);
				if (result == null) result = caseTreeTypes(scrollWheelInputPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.SIMPLE_TEXT_PRIMITIVE: {
				SimpleTextPrimitive simpleTextPrimitive = (SimpleTextPrimitive)theEObject;
				T result = caseSimpleTextPrimitive(simpleTextPrimitive);
				if (result == null) result = caseTreeTypes(simpleTextPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.STRIKE_THROUGH_PROPERTIES: {
				StrikeThroughProperties strikeThroughProperties = (StrikeThroughProperties)theEObject;
				T result = caseStrikeThroughProperties(strikeThroughProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.STRUCT_DEFINITION_TYPE: {
				StructDefinitionType structDefinitionType = (StructDefinitionType)theEObject;
				T result = caseStructDefinitionType(structDefinitionType);
				if (result == null) result = caseTypeDefinitionAbstractType(structDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.STRUCT_ENTRY_TYPE: {
				StructEntryType structEntryType = (StructEntryType)theEObject;
				T result = caseStructEntryType(structEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.STRUCT_EVENT_TYPE: {
				StructEventType structEventType = (StructEventType)theEObject;
				T result = caseStructEventType(structEventType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.STRUCT_FIELD_TYPE: {
				StructFieldType structFieldType = (StructFieldType)theEObject;
				T result = caseStructFieldType(structFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.STRUCT_PROPERTY_TYPE: {
				StructPropertyType structPropertyType = (StructPropertyType)theEObject;
				T result = caseStructPropertyType(structPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.SWITCH_NODE_PRIMITIVE: {
				SwitchNodePrimitive switchNodePrimitive = (SwitchNodePrimitive)theEObject;
				T result = caseSwitchNodePrimitive(switchNodePrimitive);
				if (result == null) result = caseTreeTypes(switchNodePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.TOUCH_AREA_PRIMITIVE: {
				TouchAreaPrimitive touchAreaPrimitive = (TouchAreaPrimitive)theEObject;
				T result = caseTouchAreaPrimitive(touchAreaPrimitive);
				if (result == null) result = caseTreeTypes(touchAreaPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.TRANSFORM_GROUP_PRIMITIVE: {
				TransformGroupPrimitive transformGroupPrimitive = (TransformGroupPrimitive)theEObject;
				T result = caseTransformGroupPrimitive(transformGroupPrimitive);
				if (result == null) result = caseTreeTypes(transformGroupPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.TRANSFORM_MATRIX_TYPE: {
				TransformMatrixType transformMatrixType = (TransformMatrixType)theEObject;
				T result = caseTransformMatrixType(transformMatrixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.TRANSFORM_ROTATE_TYPE: {
				TransformRotateType transformRotateType = (TransformRotateType)theEObject;
				T result = caseTransformRotateType(transformRotateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.TRANSFORM_SCALE_TYPE: {
				TransformScaleType transformScaleType = (TransformScaleType)theEObject;
				T result = caseTransformScaleType(transformScaleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.TRANSFORM_SKEW_XTYPE: {
				TransformSkewXType transformSkewXType = (TransformSkewXType)theEObject;
				T result = caseTransformSkewXType(transformSkewXType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.TRANSFORM_SKEW_YTYPE: {
				TransformSkewYType transformSkewYType = (TransformSkewYType)theEObject;
				T result = caseTransformSkewYType(transformSkewYType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.TRANSFORM_TRANSLATE_TYPE: {
				TransformTranslateType transformTranslateType = (TransformTranslateType)theEObject;
				T result = caseTransformTranslateType(transformTranslateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.TRANSFORM_TYPE: {
				TransformType transformType = (TransformType)theEObject;
				T result = caseTransformType(transformType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.TREE_TYPE: {
				TreeType treeType = (TreeType)theEObject;
				T result = caseTreeType(treeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.TYPE_ALTERNATIVE_TYPE: {
				TypeAlternativeType typeAlternativeType = (TypeAlternativeType)theEObject;
				T result = caseTypeAlternativeType(typeAlternativeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.TYPE_DEFINITION_ABSTRACT_TYPE: {
				TypeDefinitionAbstractType typeDefinitionAbstractType = (TypeDefinitionAbstractType)theEObject;
				T result = caseTypeDefinitionAbstractType(typeDefinitionAbstractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.UNDERLINE_PROPERTIES: {
				UnderlineProperties underlineProperties = (UnderlineProperties)theEObject;
				T result = caseUnderlineProperties(underlineProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.UNION_DEFINITION_TYPE: {
				UnionDefinitionType unionDefinitionType = (UnionDefinitionType)theEObject;
				T result = caseUnionDefinitionType(unionDefinitionType);
				if (result == null) result = caseTypeDefinitionAbstractType(unionDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.UNION_ENTRY_TYPE: {
				UnionEntryType unionEntryType = (UnionEntryType)theEObject;
				T result = caseUnionEntryType(unionEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.UNION_EVENT_TYPE: {
				UnionEventType unionEventType = (UnionEventType)theEObject;
				T result = caseUnionEventType(unionEventType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.UNION_FIELD_TYPE: {
				UnionFieldType unionFieldType = (UnionFieldType)theEObject;
				T result = caseUnionFieldType(unionFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.UNION_PROPERTY_TYPE: {
				UnionPropertyType unionPropertyType = (UnionPropertyType)theEObject;
				T result = caseUnionPropertyType(unionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.TREE_TYPES: {
				TreeTypes treeTypes = (TreeTypes)theEObject;
				T result = caseTreeTypes(treeTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.CLIP_PATH_TYPES: {
				ClipPathTypes clipPathTypes = (ClipPathTypes)theEObject;
				T result = caseClipPathTypes(clipPathTypes);
				if (result == null) result = caseTreeTypes(clipPathTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.PROPERTY_VALUE: {
				PropertyValue propertyValue = (PropertyValue)theEObject;
				T result = casePropertyValue(propertyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Part2Package.WIDGET_COMPOSITION: {
				WidgetComposition widgetComposition = (WidgetComposition)theEObject;
				T result = caseWidgetComposition(widgetComposition);
				if (result == null) result = caseTreeTypes(widgetComposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcComponent(ArcComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayDefinitionType(ArrayDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayEntryType(ArrayEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Event Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayEventType(ArrayEventType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Field Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Field Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayFieldDefinitionType(ArrayFieldDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayFieldType(ArrayFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayPropertyType(ArrayPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorType(BehaviorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildPrimitive(ChildPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCirclePrimitive(CirclePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clip Path Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clip Path Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClipPathPrimitive(ClipPathPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clipping Container Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clipping Container Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClippingContainerPrimitive(ClippingContainerPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockType(ClockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Path Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Path Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosePathCommand(ClosePathCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDefinitionType(ComponentDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crown Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crown Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrownComponent(CrownComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cubic Bezier Curve Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cubic Bezier Curve Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCubicBezierCurveCommand(CubicBezierCurveCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Integer Type Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Integer Type Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomIntegerTypeElementType(CustomIntegerTypeElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Real Type Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Real Type Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomRealTypeElementType(CustomRealTypeElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom String Type Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom String Type Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomStringTypeElementType(CustomStringTypeElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionsType(DefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionType(DefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipse Arc Curve Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipse Arc Curve Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipseArcCurveCommand(EllipseArcCurveCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipse Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipse Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipsePrimitive(EllipsePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryType(EntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumDefinitionType(EnumDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationType(EnumerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventType(EventType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Definition Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Definition Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDefinitionAbstractType(FieldDefinitionAbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDefinitionType(FieldDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldType(FieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrameProperties(FrameProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gesture Area Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gesture Area Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGestureAreaPrimitive(GestureAreaPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupPrimitive(GroupPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagePrimitive(ImagePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportType(ImportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceType(InterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyboard Input Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyboard Input Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyboardInputPrimitive(KeyboardInputPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinePrimitive(LinePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line To Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line To Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineToCommand(LineToCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move To Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move To Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveToCommand(MoveToCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationType(OperationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Array Entries Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Array Entries Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherArrayEntriesType(OtherArrayEntriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Entries Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Entries Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherEntriesType(OtherEntriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Struct Entries Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Struct Entries Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherStructEntriesType(OtherStructEntriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Union Entries Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Union Entries Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherUnionEntriesType(OtherUnionEntriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamType(ParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathArray(PathArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathPrimitive(PathPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Area Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Area Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerAreaPrimitive(PointerAreaPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Gesture Area Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Gesture Area Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerGestureAreaPrimitive(PointerGestureAreaPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointType(PointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polar Line Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polar Line Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolarLineComponent(PolarLineComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonPrimitive(PolygonPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polyline Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polyline Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolylinePrimitive(PolylinePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionListType(PositionListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivatePropertyType(PrivatePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rect Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rect Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectPrimitive(RectPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Close Path Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Close Path Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeClosePathCommand(RelativeClosePathCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Cubic Bezier Curve Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Cubic Bezier Curve Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeCubicBezierCurveCommand(RelativeCubicBezierCurveCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Ellipse Arc Curve Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Ellipse Arc Curve Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeEllipseArcCurveCommand(RelativeEllipseArcCurveCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Line To Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Line To Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeLineToCommand(RelativeLineToCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Move To Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Move To Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeMoveToCommand(RelativeMoveToCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replicate Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replicate Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplicatePrimitive(ReplicatePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reverse Video Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reverse Video Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReverseVideoProperties(ReverseVideoProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scroll Wheel Input Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scroll Wheel Input Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrollWheelInputPrimitive(ScrollWheelInputPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Text Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Text Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTextPrimitive(SimpleTextPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strike Through Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strike Through Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrikeThroughProperties(StrikeThroughProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructDefinitionType(StructDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructEntryType(StructEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Event Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructEventType(StructEventType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructFieldType(StructFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructPropertyType(StructPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Node Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Node Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchNodePrimitive(SwitchNodePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Area Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Area Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchAreaPrimitive(TouchAreaPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Group Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Group Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformGroupPrimitive(TransformGroupPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Matrix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Matrix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformMatrixType(TransformMatrixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Rotate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Rotate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformRotateType(TransformRotateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Scale Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Scale Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformScaleType(TransformScaleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Skew XType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Skew XType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformSkewXType(TransformSkewXType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Skew YType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Skew YType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformSkewYType(TransformSkewYType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Translate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Translate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformTranslateType(TransformTranslateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformType(TransformType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreeType(TreeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Alternative Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Alternative Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAlternativeType(TypeAlternativeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinitionAbstractType(TypeDefinitionAbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Underline Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Underline Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnderlineProperties(UnderlineProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionDefinitionType(UnionDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionEntryType(UnionEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Event Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionEventType(UnionEventType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionFieldType(UnionFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionPropertyType(UnionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreeTypes(TreeTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clip Path Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clip Path Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClipPathTypes(ClipPathTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyValue(PropertyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetComposition(WidgetComposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Part2Switch
