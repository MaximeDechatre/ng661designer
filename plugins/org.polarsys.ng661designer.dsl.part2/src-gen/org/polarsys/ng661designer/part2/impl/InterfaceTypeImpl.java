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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.ng661designer.part2.ArrayEventType;
import org.polarsys.ng661designer.part2.ArrayPropertyType;
import org.polarsys.ng661designer.part2.EventType;
import org.polarsys.ng661designer.part2.FunctionType;
import org.polarsys.ng661designer.part2.ImportType;
import org.polarsys.ng661designer.part2.InterfaceType;
import org.polarsys.ng661designer.part2.OperationType;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.PropertyType;
import org.polarsys.ng661designer.part2.StructEventType;
import org.polarsys.ng661designer.part2.StructPropertyType;
import org.polarsys.ng661designer.part2.UnionEventType;
import org.polarsys.ng661designer.part2.UnionPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.InterfaceTypeImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.InterfaceTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.InterfaceTypeImpl#getArrayProperty <em>Array Property</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.InterfaceTypeImpl#getStructProperty <em>Struct Property</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.InterfaceTypeImpl#getEnumProperty <em>Enum Property</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.InterfaceTypeImpl#getUnionProperty <em>Union Property</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.InterfaceTypeImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.InterfaceTypeImpl#getArrayEvent <em>Array Event</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.InterfaceTypeImpl#getStructEvent <em>Struct Event</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.InterfaceTypeImpl#getEnumEvent <em>Enum Event</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.InterfaceTypeImpl#getUnionEvent <em>Union Event</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.InterfaceTypeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.InterfaceTypeImpl#getPublicFunction <em>Public Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceTypeImpl extends MinimalEObjectImpl.Container implements InterfaceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportType> import_;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyType> property;

	/**
	 * The cached value of the '{@link #getArrayProperty() <em>Array Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayPropertyType> arrayProperty;

	/**
	 * The cached value of the '{@link #getStructProperty() <em>Struct Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<StructPropertyType> structProperty;

	/**
	 * The cached value of the '{@link #getEnumProperty() <em>Enum Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyType> enumProperty;

	/**
	 * The cached value of the '{@link #getUnionProperty() <em>Union Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnionProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<UnionPropertyType> unionProperty;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<EventType> event;

	/**
	 * The cached value of the '{@link #getArrayEvent() <em>Array Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayEventType> arrayEvent;

	/**
	 * The cached value of the '{@link #getStructEvent() <em>Struct Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<StructEventType> structEvent;

	/**
	 * The cached value of the '{@link #getEnumEvent() <em>Enum Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<EventType> enumEvent;

	/**
	 * The cached value of the '{@link #getUnionEvent() <em>Union Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnionEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<UnionEventType> unionEvent;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationType> operation;

	/**
	 * The cached value of the '{@link #getPublicFunction() <em>Public Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionType> publicFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getInterfaceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportType> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<ImportType>(ImportType.class, this, Part2Package.INTERFACE_TYPE__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<PropertyType>(PropertyType.class, this, Part2Package.INTERFACE_TYPE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayPropertyType> getArrayProperty() {
		if (arrayProperty == null) {
			arrayProperty = new EObjectContainmentEList<ArrayPropertyType>(ArrayPropertyType.class, this, Part2Package.INTERFACE_TYPE__ARRAY_PROPERTY);
		}
		return arrayProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructPropertyType> getStructProperty() {
		if (structProperty == null) {
			structProperty = new EObjectContainmentEList<StructPropertyType>(StructPropertyType.class, this, Part2Package.INTERFACE_TYPE__STRUCT_PROPERTY);
		}
		return structProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getEnumProperty() {
		if (enumProperty == null) {
			enumProperty = new EObjectContainmentEList<PropertyType>(PropertyType.class, this, Part2Package.INTERFACE_TYPE__ENUM_PROPERTY);
		}
		return enumProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnionPropertyType> getUnionProperty() {
		if (unionProperty == null) {
			unionProperty = new EObjectContainmentEList<UnionPropertyType>(UnionPropertyType.class, this, Part2Package.INTERFACE_TYPE__UNION_PROPERTY);
		}
		return unionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventType> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<EventType>(EventType.class, this, Part2Package.INTERFACE_TYPE__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayEventType> getArrayEvent() {
		if (arrayEvent == null) {
			arrayEvent = new EObjectContainmentEList<ArrayEventType>(ArrayEventType.class, this, Part2Package.INTERFACE_TYPE__ARRAY_EVENT);
		}
		return arrayEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructEventType> getStructEvent() {
		if (structEvent == null) {
			structEvent = new EObjectContainmentEList<StructEventType>(StructEventType.class, this, Part2Package.INTERFACE_TYPE__STRUCT_EVENT);
		}
		return structEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventType> getEnumEvent() {
		if (enumEvent == null) {
			enumEvent = new EObjectContainmentEList<EventType>(EventType.class, this, Part2Package.INTERFACE_TYPE__ENUM_EVENT);
		}
		return enumEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnionEventType> getUnionEvent() {
		if (unionEvent == null) {
			unionEvent = new EObjectContainmentEList<UnionEventType>(UnionEventType.class, this, Part2Package.INTERFACE_TYPE__UNION_EVENT);
		}
		return unionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationType> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<OperationType>(OperationType.class, this, Part2Package.INTERFACE_TYPE__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionType> getPublicFunction() {
		if (publicFunction == null) {
			publicFunction = new EObjectContainmentEList<FunctionType>(FunctionType.class, this, Part2Package.INTERFACE_TYPE__PUBLIC_FUNCTION);
		}
		return publicFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.INTERFACE_TYPE__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case Part2Package.INTERFACE_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Part2Package.INTERFACE_TYPE__ARRAY_PROPERTY:
				return ((InternalEList<?>)getArrayProperty()).basicRemove(otherEnd, msgs);
			case Part2Package.INTERFACE_TYPE__STRUCT_PROPERTY:
				return ((InternalEList<?>)getStructProperty()).basicRemove(otherEnd, msgs);
			case Part2Package.INTERFACE_TYPE__ENUM_PROPERTY:
				return ((InternalEList<?>)getEnumProperty()).basicRemove(otherEnd, msgs);
			case Part2Package.INTERFACE_TYPE__UNION_PROPERTY:
				return ((InternalEList<?>)getUnionProperty()).basicRemove(otherEnd, msgs);
			case Part2Package.INTERFACE_TYPE__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case Part2Package.INTERFACE_TYPE__ARRAY_EVENT:
				return ((InternalEList<?>)getArrayEvent()).basicRemove(otherEnd, msgs);
			case Part2Package.INTERFACE_TYPE__STRUCT_EVENT:
				return ((InternalEList<?>)getStructEvent()).basicRemove(otherEnd, msgs);
			case Part2Package.INTERFACE_TYPE__ENUM_EVENT:
				return ((InternalEList<?>)getEnumEvent()).basicRemove(otherEnd, msgs);
			case Part2Package.INTERFACE_TYPE__UNION_EVENT:
				return ((InternalEList<?>)getUnionEvent()).basicRemove(otherEnd, msgs);
			case Part2Package.INTERFACE_TYPE__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case Part2Package.INTERFACE_TYPE__PUBLIC_FUNCTION:
				return ((InternalEList<?>)getPublicFunction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.INTERFACE_TYPE__IMPORT:
				return getImport();
			case Part2Package.INTERFACE_TYPE__PROPERTY:
				return getProperty();
			case Part2Package.INTERFACE_TYPE__ARRAY_PROPERTY:
				return getArrayProperty();
			case Part2Package.INTERFACE_TYPE__STRUCT_PROPERTY:
				return getStructProperty();
			case Part2Package.INTERFACE_TYPE__ENUM_PROPERTY:
				return getEnumProperty();
			case Part2Package.INTERFACE_TYPE__UNION_PROPERTY:
				return getUnionProperty();
			case Part2Package.INTERFACE_TYPE__EVENT:
				return getEvent();
			case Part2Package.INTERFACE_TYPE__ARRAY_EVENT:
				return getArrayEvent();
			case Part2Package.INTERFACE_TYPE__STRUCT_EVENT:
				return getStructEvent();
			case Part2Package.INTERFACE_TYPE__ENUM_EVENT:
				return getEnumEvent();
			case Part2Package.INTERFACE_TYPE__UNION_EVENT:
				return getUnionEvent();
			case Part2Package.INTERFACE_TYPE__OPERATION:
				return getOperation();
			case Part2Package.INTERFACE_TYPE__PUBLIC_FUNCTION:
				return getPublicFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Part2Package.INTERFACE_TYPE__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends ImportType>)newValue);
				return;
			case Part2Package.INTERFACE_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case Part2Package.INTERFACE_TYPE__ARRAY_PROPERTY:
				getArrayProperty().clear();
				getArrayProperty().addAll((Collection<? extends ArrayPropertyType>)newValue);
				return;
			case Part2Package.INTERFACE_TYPE__STRUCT_PROPERTY:
				getStructProperty().clear();
				getStructProperty().addAll((Collection<? extends StructPropertyType>)newValue);
				return;
			case Part2Package.INTERFACE_TYPE__ENUM_PROPERTY:
				getEnumProperty().clear();
				getEnumProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case Part2Package.INTERFACE_TYPE__UNION_PROPERTY:
				getUnionProperty().clear();
				getUnionProperty().addAll((Collection<? extends UnionPropertyType>)newValue);
				return;
			case Part2Package.INTERFACE_TYPE__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EventType>)newValue);
				return;
			case Part2Package.INTERFACE_TYPE__ARRAY_EVENT:
				getArrayEvent().clear();
				getArrayEvent().addAll((Collection<? extends ArrayEventType>)newValue);
				return;
			case Part2Package.INTERFACE_TYPE__STRUCT_EVENT:
				getStructEvent().clear();
				getStructEvent().addAll((Collection<? extends StructEventType>)newValue);
				return;
			case Part2Package.INTERFACE_TYPE__ENUM_EVENT:
				getEnumEvent().clear();
				getEnumEvent().addAll((Collection<? extends EventType>)newValue);
				return;
			case Part2Package.INTERFACE_TYPE__UNION_EVENT:
				getUnionEvent().clear();
				getUnionEvent().addAll((Collection<? extends UnionEventType>)newValue);
				return;
			case Part2Package.INTERFACE_TYPE__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends OperationType>)newValue);
				return;
			case Part2Package.INTERFACE_TYPE__PUBLIC_FUNCTION:
				getPublicFunction().clear();
				getPublicFunction().addAll((Collection<? extends FunctionType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Part2Package.INTERFACE_TYPE__IMPORT:
				getImport().clear();
				return;
			case Part2Package.INTERFACE_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case Part2Package.INTERFACE_TYPE__ARRAY_PROPERTY:
				getArrayProperty().clear();
				return;
			case Part2Package.INTERFACE_TYPE__STRUCT_PROPERTY:
				getStructProperty().clear();
				return;
			case Part2Package.INTERFACE_TYPE__ENUM_PROPERTY:
				getEnumProperty().clear();
				return;
			case Part2Package.INTERFACE_TYPE__UNION_PROPERTY:
				getUnionProperty().clear();
				return;
			case Part2Package.INTERFACE_TYPE__EVENT:
				getEvent().clear();
				return;
			case Part2Package.INTERFACE_TYPE__ARRAY_EVENT:
				getArrayEvent().clear();
				return;
			case Part2Package.INTERFACE_TYPE__STRUCT_EVENT:
				getStructEvent().clear();
				return;
			case Part2Package.INTERFACE_TYPE__ENUM_EVENT:
				getEnumEvent().clear();
				return;
			case Part2Package.INTERFACE_TYPE__UNION_EVENT:
				getUnionEvent().clear();
				return;
			case Part2Package.INTERFACE_TYPE__OPERATION:
				getOperation().clear();
				return;
			case Part2Package.INTERFACE_TYPE__PUBLIC_FUNCTION:
				getPublicFunction().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Part2Package.INTERFACE_TYPE__IMPORT:
				return import_ != null && !import_.isEmpty();
			case Part2Package.INTERFACE_TYPE__PROPERTY:
				return property != null && !property.isEmpty();
			case Part2Package.INTERFACE_TYPE__ARRAY_PROPERTY:
				return arrayProperty != null && !arrayProperty.isEmpty();
			case Part2Package.INTERFACE_TYPE__STRUCT_PROPERTY:
				return structProperty != null && !structProperty.isEmpty();
			case Part2Package.INTERFACE_TYPE__ENUM_PROPERTY:
				return enumProperty != null && !enumProperty.isEmpty();
			case Part2Package.INTERFACE_TYPE__UNION_PROPERTY:
				return unionProperty != null && !unionProperty.isEmpty();
			case Part2Package.INTERFACE_TYPE__EVENT:
				return event != null && !event.isEmpty();
			case Part2Package.INTERFACE_TYPE__ARRAY_EVENT:
				return arrayEvent != null && !arrayEvent.isEmpty();
			case Part2Package.INTERFACE_TYPE__STRUCT_EVENT:
				return structEvent != null && !structEvent.isEmpty();
			case Part2Package.INTERFACE_TYPE__ENUM_EVENT:
				return enumEvent != null && !enumEvent.isEmpty();
			case Part2Package.INTERFACE_TYPE__UNION_EVENT:
				return unionEvent != null && !unionEvent.isEmpty();
			case Part2Package.INTERFACE_TYPE__OPERATION:
				return operation != null && !operation.isEmpty();
			case Part2Package.INTERFACE_TYPE__PUBLIC_FUNCTION:
				return publicFunction != null && !publicFunction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceTypeImpl
