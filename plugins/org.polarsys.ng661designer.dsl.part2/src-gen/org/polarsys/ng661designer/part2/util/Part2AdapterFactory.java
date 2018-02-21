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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.ng661designer.part2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.ng661designer.part2.Part2Package
 * @generated
 */
public class Part2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Part2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Part2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Part2Switch<Adapter> modelSwitch =
		new Part2Switch<Adapter>() {
			@Override
			public Adapter caseArcComponent(ArcComponent object) {
				return createArcComponentAdapter();
			}
			@Override
			public Adapter caseArrayDefinitionType(ArrayDefinitionType object) {
				return createArrayDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseArrayEntryType(ArrayEntryType object) {
				return createArrayEntryTypeAdapter();
			}
			@Override
			public Adapter caseArrayEventType(ArrayEventType object) {
				return createArrayEventTypeAdapter();
			}
			@Override
			public Adapter caseArrayFieldDefinitionType(ArrayFieldDefinitionType object) {
				return createArrayFieldDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseArrayFieldType(ArrayFieldType object) {
				return createArrayFieldTypeAdapter();
			}
			@Override
			public Adapter caseArrayPropertyType(ArrayPropertyType object) {
				return createArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseBehaviorType(BehaviorType object) {
				return createBehaviorTypeAdapter();
			}
			@Override
			public Adapter caseChildPrimitive(ChildPrimitive object) {
				return createChildPrimitiveAdapter();
			}
			@Override
			public Adapter caseCirclePrimitive(CirclePrimitive object) {
				return createCirclePrimitiveAdapter();
			}
			@Override
			public Adapter caseClipPathPrimitive(ClipPathPrimitive object) {
				return createClipPathPrimitiveAdapter();
			}
			@Override
			public Adapter caseClippingContainerPrimitive(ClippingContainerPrimitive object) {
				return createClippingContainerPrimitiveAdapter();
			}
			@Override
			public Adapter caseClockType(ClockType object) {
				return createClockTypeAdapter();
			}
			@Override
			public Adapter caseClosePathCommand(ClosePathCommand object) {
				return createClosePathCommandAdapter();
			}
			@Override
			public Adapter caseComponentDefinitionType(ComponentDefinitionType object) {
				return createComponentDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseCrownComponent(CrownComponent object) {
				return createCrownComponentAdapter();
			}
			@Override
			public Adapter caseCubicBezierCurveCommand(CubicBezierCurveCommand object) {
				return createCubicBezierCurveCommandAdapter();
			}
			@Override
			public Adapter caseCustomIntegerTypeElementType(CustomIntegerTypeElementType object) {
				return createCustomIntegerTypeElementTypeAdapter();
			}
			@Override
			public Adapter caseCustomRealTypeElementType(CustomRealTypeElementType object) {
				return createCustomRealTypeElementTypeAdapter();
			}
			@Override
			public Adapter caseCustomStringTypeElementType(CustomStringTypeElementType object) {
				return createCustomStringTypeElementTypeAdapter();
			}
			@Override
			public Adapter caseDefinitionsType(DefinitionsType object) {
				return createDefinitionsTypeAdapter();
			}
			@Override
			public Adapter caseDefinitionType(DefinitionType object) {
				return createDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEllipseArcCurveCommand(EllipseArcCurveCommand object) {
				return createEllipseArcCurveCommandAdapter();
			}
			@Override
			public Adapter caseEllipsePrimitive(EllipsePrimitive object) {
				return createEllipsePrimitiveAdapter();
			}
			@Override
			public Adapter caseEntryType(EntryType object) {
				return createEntryTypeAdapter();
			}
			@Override
			public Adapter caseEnumDefinitionType(EnumDefinitionType object) {
				return createEnumDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseEnumerationType(EnumerationType object) {
				return createEnumerationTypeAdapter();
			}
			@Override
			public Adapter caseEventType(EventType object) {
				return createEventTypeAdapter();
			}
			@Override
			public Adapter caseFieldDefinitionAbstractType(FieldDefinitionAbstractType object) {
				return createFieldDefinitionAbstractTypeAdapter();
			}
			@Override
			public Adapter caseFieldDefinitionType(FieldDefinitionType object) {
				return createFieldDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseFieldType(FieldType object) {
				return createFieldTypeAdapter();
			}
			@Override
			public Adapter caseFrameProperties(FrameProperties object) {
				return createFramePropertiesAdapter();
			}
			@Override
			public Adapter caseFunctionType(FunctionType object) {
				return createFunctionTypeAdapter();
			}
			@Override
			public Adapter caseGestureAreaPrimitive(GestureAreaPrimitive object) {
				return createGestureAreaPrimitiveAdapter();
			}
			@Override
			public Adapter caseGroupPrimitive(GroupPrimitive object) {
				return createGroupPrimitiveAdapter();
			}
			@Override
			public Adapter caseImagePrimitive(ImagePrimitive object) {
				return createImagePrimitiveAdapter();
			}
			@Override
			public Adapter caseImportType(ImportType object) {
				return createImportTypeAdapter();
			}
			@Override
			public Adapter caseInterfaceType(InterfaceType object) {
				return createInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseKeyboardInputPrimitive(KeyboardInputPrimitive object) {
				return createKeyboardInputPrimitiveAdapter();
			}
			@Override
			public Adapter caseLinePrimitive(LinePrimitive object) {
				return createLinePrimitiveAdapter();
			}
			@Override
			public Adapter caseLineToCommand(LineToCommand object) {
				return createLineToCommandAdapter();
			}
			@Override
			public Adapter caseMoveToCommand(MoveToCommand object) {
				return createMoveToCommandAdapter();
			}
			@Override
			public Adapter caseOperationType(OperationType object) {
				return createOperationTypeAdapter();
			}
			@Override
			public Adapter caseOtherArrayEntriesType(OtherArrayEntriesType object) {
				return createOtherArrayEntriesTypeAdapter();
			}
			@Override
			public Adapter caseOtherEntriesType(OtherEntriesType object) {
				return createOtherEntriesTypeAdapter();
			}
			@Override
			public Adapter caseOtherStructEntriesType(OtherStructEntriesType object) {
				return createOtherStructEntriesTypeAdapter();
			}
			@Override
			public Adapter caseOtherUnionEntriesType(OtherUnionEntriesType object) {
				return createOtherUnionEntriesTypeAdapter();
			}
			@Override
			public Adapter caseParamType(ParamType object) {
				return createParamTypeAdapter();
			}
			@Override
			public Adapter casePathArray(PathArray object) {
				return createPathArrayAdapter();
			}
			@Override
			public Adapter casePathPrimitive(PathPrimitive object) {
				return createPathPrimitiveAdapter();
			}
			@Override
			public Adapter casePointerAreaPrimitive(PointerAreaPrimitive object) {
				return createPointerAreaPrimitiveAdapter();
			}
			@Override
			public Adapter casePointerGestureAreaPrimitive(PointerGestureAreaPrimitive object) {
				return createPointerGestureAreaPrimitiveAdapter();
			}
			@Override
			public Adapter casePointType(PointType object) {
				return createPointTypeAdapter();
			}
			@Override
			public Adapter casePolarLineComponent(PolarLineComponent object) {
				return createPolarLineComponentAdapter();
			}
			@Override
			public Adapter casePolygonPrimitive(PolygonPrimitive object) {
				return createPolygonPrimitiveAdapter();
			}
			@Override
			public Adapter casePolylinePrimitive(PolylinePrimitive object) {
				return createPolylinePrimitiveAdapter();
			}
			@Override
			public Adapter casePositionListType(PositionListType object) {
				return createPositionListTypeAdapter();
			}
			@Override
			public Adapter casePrivatePropertyType(PrivatePropertyType object) {
				return createPrivatePropertyTypeAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter caseRectPrimitive(RectPrimitive object) {
				return createRectPrimitiveAdapter();
			}
			@Override
			public Adapter caseRelativeClosePathCommand(RelativeClosePathCommand object) {
				return createRelativeClosePathCommandAdapter();
			}
			@Override
			public Adapter caseRelativeCubicBezierCurveCommand(RelativeCubicBezierCurveCommand object) {
				return createRelativeCubicBezierCurveCommandAdapter();
			}
			@Override
			public Adapter caseRelativeEllipseArcCurveCommand(RelativeEllipseArcCurveCommand object) {
				return createRelativeEllipseArcCurveCommandAdapter();
			}
			@Override
			public Adapter caseRelativeLineToCommand(RelativeLineToCommand object) {
				return createRelativeLineToCommandAdapter();
			}
			@Override
			public Adapter caseRelativeMoveToCommand(RelativeMoveToCommand object) {
				return createRelativeMoveToCommandAdapter();
			}
			@Override
			public Adapter caseReplicatePrimitive(ReplicatePrimitive object) {
				return createReplicatePrimitiveAdapter();
			}
			@Override
			public Adapter caseReverseVideoProperties(ReverseVideoProperties object) {
				return createReverseVideoPropertiesAdapter();
			}
			@Override
			public Adapter caseScrollWheelInputPrimitive(ScrollWheelInputPrimitive object) {
				return createScrollWheelInputPrimitiveAdapter();
			}
			@Override
			public Adapter caseSimpleTextPrimitive(SimpleTextPrimitive object) {
				return createSimpleTextPrimitiveAdapter();
			}
			@Override
			public Adapter caseStrikeThroughProperties(StrikeThroughProperties object) {
				return createStrikeThroughPropertiesAdapter();
			}
			@Override
			public Adapter caseStructDefinitionType(StructDefinitionType object) {
				return createStructDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseStructEntryType(StructEntryType object) {
				return createStructEntryTypeAdapter();
			}
			@Override
			public Adapter caseStructEventType(StructEventType object) {
				return createStructEventTypeAdapter();
			}
			@Override
			public Adapter caseStructFieldType(StructFieldType object) {
				return createStructFieldTypeAdapter();
			}
			@Override
			public Adapter caseStructPropertyType(StructPropertyType object) {
				return createStructPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSwitchNodePrimitive(SwitchNodePrimitive object) {
				return createSwitchNodePrimitiveAdapter();
			}
			@Override
			public Adapter caseTouchAreaPrimitive(TouchAreaPrimitive object) {
				return createTouchAreaPrimitiveAdapter();
			}
			@Override
			public Adapter caseTransformGroupPrimitive(TransformGroupPrimitive object) {
				return createTransformGroupPrimitiveAdapter();
			}
			@Override
			public Adapter caseTransformMatrixType(TransformMatrixType object) {
				return createTransformMatrixTypeAdapter();
			}
			@Override
			public Adapter caseTransformRotateType(TransformRotateType object) {
				return createTransformRotateTypeAdapter();
			}
			@Override
			public Adapter caseTransformScaleType(TransformScaleType object) {
				return createTransformScaleTypeAdapter();
			}
			@Override
			public Adapter caseTransformSkewXType(TransformSkewXType object) {
				return createTransformSkewXTypeAdapter();
			}
			@Override
			public Adapter caseTransformSkewYType(TransformSkewYType object) {
				return createTransformSkewYTypeAdapter();
			}
			@Override
			public Adapter caseTransformTranslateType(TransformTranslateType object) {
				return createTransformTranslateTypeAdapter();
			}
			@Override
			public Adapter caseTransformType(TransformType object) {
				return createTransformTypeAdapter();
			}
			@Override
			public Adapter caseTreeType(TreeType object) {
				return createTreeTypeAdapter();
			}
			@Override
			public Adapter caseTypeAlternativeType(TypeAlternativeType object) {
				return createTypeAlternativeTypeAdapter();
			}
			@Override
			public Adapter caseTypeDefinitionAbstractType(TypeDefinitionAbstractType object) {
				return createTypeDefinitionAbstractTypeAdapter();
			}
			@Override
			public Adapter caseUnderlineProperties(UnderlineProperties object) {
				return createUnderlinePropertiesAdapter();
			}
			@Override
			public Adapter caseUnionDefinitionType(UnionDefinitionType object) {
				return createUnionDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseUnionEntryType(UnionEntryType object) {
				return createUnionEntryTypeAdapter();
			}
			@Override
			public Adapter caseUnionEventType(UnionEventType object) {
				return createUnionEventTypeAdapter();
			}
			@Override
			public Adapter caseUnionFieldType(UnionFieldType object) {
				return createUnionFieldTypeAdapter();
			}
			@Override
			public Adapter caseUnionPropertyType(UnionPropertyType object) {
				return createUnionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTreeTypes(TreeTypes object) {
				return createTreeTypesAdapter();
			}
			@Override
			public Adapter caseClipPathTypes(ClipPathTypes object) {
				return createClipPathTypesAdapter();
			}
			@Override
			public Adapter casePropertyValue(PropertyValue object) {
				return createPropertyValueAdapter();
			}
			@Override
			public Adapter caseWidgetComposition(WidgetComposition object) {
				return createWidgetCompositionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ArcComponent <em>Arc Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ArcComponent
	 * @generated
	 */
	public Adapter createArcComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ArrayDefinitionType <em>Array Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ArrayDefinitionType
	 * @generated
	 */
	public Adapter createArrayDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ArrayEntryType <em>Array Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ArrayEntryType
	 * @generated
	 */
	public Adapter createArrayEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ArrayEventType <em>Array Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ArrayEventType
	 * @generated
	 */
	public Adapter createArrayEventTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ArrayFieldDefinitionType <em>Array Field Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldDefinitionType
	 * @generated
	 */
	public Adapter createArrayFieldDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ArrayFieldType <em>Array Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldType
	 * @generated
	 */
	public Adapter createArrayFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ArrayPropertyType <em>Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ArrayPropertyType
	 * @generated
	 */
	public Adapter createArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.BehaviorType <em>Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.BehaviorType
	 * @generated
	 */
	public Adapter createBehaviorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ChildPrimitive <em>Child Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive
	 * @generated
	 */
	public Adapter createChildPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.CirclePrimitive <em>Circle Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive
	 * @generated
	 */
	public Adapter createCirclePrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ClipPathPrimitive <em>Clip Path Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ClipPathPrimitive
	 * @generated
	 */
	public Adapter createClipPathPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive <em>Clipping Container Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive
	 * @generated
	 */
	public Adapter createClippingContainerPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ClockType <em>Clock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ClockType
	 * @generated
	 */
	public Adapter createClockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ClosePathCommand <em>Close Path Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ClosePathCommand
	 * @generated
	 */
	public Adapter createClosePathCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ComponentDefinitionType <em>Component Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ComponentDefinitionType
	 * @generated
	 */
	public Adapter createComponentDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.CrownComponent <em>Crown Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.CrownComponent
	 * @generated
	 */
	public Adapter createCrownComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.CubicBezierCurveCommand <em>Cubic Bezier Curve Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.CubicBezierCurveCommand
	 * @generated
	 */
	public Adapter createCubicBezierCurveCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.CustomIntegerTypeElementType <em>Custom Integer Type Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.CustomIntegerTypeElementType
	 * @generated
	 */
	public Adapter createCustomIntegerTypeElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.CustomRealTypeElementType <em>Custom Real Type Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.CustomRealTypeElementType
	 * @generated
	 */
	public Adapter createCustomRealTypeElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.CustomStringTypeElementType <em>Custom String Type Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.CustomStringTypeElementType
	 * @generated
	 */
	public Adapter createCustomStringTypeElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.DefinitionsType <em>Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.DefinitionsType
	 * @generated
	 */
	public Adapter createDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.DefinitionType <em>Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.DefinitionType
	 * @generated
	 */
	public Adapter createDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand <em>Ellipse Arc Curve Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.EllipseArcCurveCommand
	 * @generated
	 */
	public Adapter createEllipseArcCurveCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.EllipsePrimitive <em>Ellipse Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive
	 * @generated
	 */
	public Adapter createEllipsePrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.EntryType
	 * @generated
	 */
	public Adapter createEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.EnumDefinitionType <em>Enum Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.EnumDefinitionType
	 * @generated
	 */
	public Adapter createEnumDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.EnumerationType
	 * @generated
	 */
	public Adapter createEnumerationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.EventType
	 * @generated
	 */
	public Adapter createEventTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.FieldDefinitionAbstractType <em>Field Definition Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.FieldDefinitionAbstractType
	 * @generated
	 */
	public Adapter createFieldDefinitionAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.FieldDefinitionType <em>Field Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.FieldDefinitionType
	 * @generated
	 */
	public Adapter createFieldDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.FieldType
	 * @generated
	 */
	public Adapter createFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.FrameProperties <em>Frame Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.FrameProperties
	 * @generated
	 */
	public Adapter createFramePropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.FunctionType
	 * @generated
	 */
	public Adapter createFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive <em>Gesture Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive
	 * @generated
	 */
	public Adapter createGestureAreaPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.GroupPrimitive <em>Group Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive
	 * @generated
	 */
	public Adapter createGroupPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ImagePrimitive <em>Image Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive
	 * @generated
	 */
	public Adapter createImagePrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ImportType
	 * @generated
	 */
	public Adapter createImportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.InterfaceType
	 * @generated
	 */
	public Adapter createInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive <em>Keyboard Input Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.KeyboardInputPrimitive
	 * @generated
	 */
	public Adapter createKeyboardInputPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.LinePrimitive <em>Line Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive
	 * @generated
	 */
	public Adapter createLinePrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.LineToCommand <em>Line To Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.LineToCommand
	 * @generated
	 */
	public Adapter createLineToCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.MoveToCommand <em>Move To Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.MoveToCommand
	 * @generated
	 */
	public Adapter createMoveToCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.OperationType
	 * @generated
	 */
	public Adapter createOperationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType <em>Other Array Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.OtherArrayEntriesType
	 * @generated
	 */
	public Adapter createOtherArrayEntriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.OtherEntriesType <em>Other Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.OtherEntriesType
	 * @generated
	 */
	public Adapter createOtherEntriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.OtherStructEntriesType <em>Other Struct Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.OtherStructEntriesType
	 * @generated
	 */
	public Adapter createOtherStructEntriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.OtherUnionEntriesType <em>Other Union Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.OtherUnionEntriesType
	 * @generated
	 */
	public Adapter createOtherUnionEntriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ParamType
	 * @generated
	 */
	public Adapter createParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.PathArray <em>Path Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.PathArray
	 * @generated
	 */
	public Adapter createPathArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.PathPrimitive <em>Path Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive
	 * @generated
	 */
	public Adapter createPathPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive <em>Pointer Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive
	 * @generated
	 */
	public Adapter createPointerAreaPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive <em>Pointer Gesture Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive
	 * @generated
	 */
	public Adapter createPointerGestureAreaPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.PointType
	 * @generated
	 */
	public Adapter createPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.PolarLineComponent <em>Polar Line Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent
	 * @generated
	 */
	public Adapter createPolarLineComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.PolygonPrimitive <em>Polygon Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive
	 * @generated
	 */
	public Adapter createPolygonPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.PolylinePrimitive <em>Polyline Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive
	 * @generated
	 */
	public Adapter createPolylinePrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.PositionListType <em>Position List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.PositionListType
	 * @generated
	 */
	public Adapter createPositionListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.PrivatePropertyType <em>Private Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.PrivatePropertyType
	 * @generated
	 */
	public Adapter createPrivatePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.RectPrimitive <em>Rect Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive
	 * @generated
	 */
	public Adapter createRectPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.RelativeClosePathCommand <em>Relative Close Path Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.RelativeClosePathCommand
	 * @generated
	 */
	public Adapter createRelativeClosePathCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand <em>Relative Cubic Bezier Curve Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand
	 * @generated
	 */
	public Adapter createRelativeCubicBezierCurveCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand <em>Relative Ellipse Arc Curve Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand
	 * @generated
	 */
	public Adapter createRelativeEllipseArcCurveCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.RelativeLineToCommand <em>Relative Line To Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.RelativeLineToCommand
	 * @generated
	 */
	public Adapter createRelativeLineToCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.RelativeMoveToCommand <em>Relative Move To Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.RelativeMoveToCommand
	 * @generated
	 */
	public Adapter createRelativeMoveToCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive <em>Replicate Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive
	 * @generated
	 */
	public Adapter createReplicatePrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ReverseVideoProperties <em>Reverse Video Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ReverseVideoProperties
	 * @generated
	 */
	public Adapter createReverseVideoPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive <em>Scroll Wheel Input Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive
	 * @generated
	 */
	public Adapter createScrollWheelInputPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive <em>Simple Text Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive
	 * @generated
	 */
	public Adapter createSimpleTextPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.StrikeThroughProperties <em>Strike Through Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.StrikeThroughProperties
	 * @generated
	 */
	public Adapter createStrikeThroughPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.StructDefinitionType <em>Struct Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.StructDefinitionType
	 * @generated
	 */
	public Adapter createStructDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.StructEntryType <em>Struct Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.StructEntryType
	 * @generated
	 */
	public Adapter createStructEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.StructEventType <em>Struct Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.StructEventType
	 * @generated
	 */
	public Adapter createStructEventTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.StructFieldType <em>Struct Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.StructFieldType
	 * @generated
	 */
	public Adapter createStructFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.StructPropertyType <em>Struct Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.StructPropertyType
	 * @generated
	 */
	public Adapter createStructPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive <em>Switch Node Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive
	 * @generated
	 */
	public Adapter createSwitchNodePrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive <em>Touch Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive
	 * @generated
	 */
	public Adapter createTouchAreaPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive <em>Transform Group Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive
	 * @generated
	 */
	public Adapter createTransformGroupPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.TransformMatrixType <em>Transform Matrix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.TransformMatrixType
	 * @generated
	 */
	public Adapter createTransformMatrixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.TransformRotateType <em>Transform Rotate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.TransformRotateType
	 * @generated
	 */
	public Adapter createTransformRotateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.TransformScaleType <em>Transform Scale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.TransformScaleType
	 * @generated
	 */
	public Adapter createTransformScaleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.TransformSkewXType <em>Transform Skew XType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.TransformSkewXType
	 * @generated
	 */
	public Adapter createTransformSkewXTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.TransformSkewYType <em>Transform Skew YType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.TransformSkewYType
	 * @generated
	 */
	public Adapter createTransformSkewYTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.TransformTranslateType <em>Transform Translate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.TransformTranslateType
	 * @generated
	 */
	public Adapter createTransformTranslateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.TransformType <em>Transform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.TransformType
	 * @generated
	 */
	public Adapter createTransformTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.TreeType <em>Tree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.TreeType
	 * @generated
	 */
	public Adapter createTreeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.TypeAlternativeType <em>Type Alternative Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.TypeAlternativeType
	 * @generated
	 */
	public Adapter createTypeAlternativeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.TypeDefinitionAbstractType <em>Type Definition Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.TypeDefinitionAbstractType
	 * @generated
	 */
	public Adapter createTypeDefinitionAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.UnderlineProperties <em>Underline Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.UnderlineProperties
	 * @generated
	 */
	public Adapter createUnderlinePropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.UnionDefinitionType <em>Union Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.UnionDefinitionType
	 * @generated
	 */
	public Adapter createUnionDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.UnionEntryType <em>Union Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.UnionEntryType
	 * @generated
	 */
	public Adapter createUnionEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.UnionEventType <em>Union Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.UnionEventType
	 * @generated
	 */
	public Adapter createUnionEventTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.UnionFieldType <em>Union Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.UnionFieldType
	 * @generated
	 */
	public Adapter createUnionFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.UnionPropertyType <em>Union Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.UnionPropertyType
	 * @generated
	 */
	public Adapter createUnionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.TreeTypes <em>Tree Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.TreeTypes
	 * @generated
	 */
	public Adapter createTreeTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.ClipPathTypes <em>Clip Path Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.ClipPathTypes
	 * @generated
	 */
	public Adapter createClipPathTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.PropertyValue
	 * @generated
	 */
	public Adapter createPropertyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.ng661designer.part2.WidgetComposition <em>Widget Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition
	 * @generated
	 */
	public Adapter createWidgetCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Part2AdapterFactory
