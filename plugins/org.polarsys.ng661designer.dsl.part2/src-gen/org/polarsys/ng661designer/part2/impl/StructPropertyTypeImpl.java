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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.ng661designer.part2.ArrayFieldType;
import org.polarsys.ng661designer.part2.FieldType;
import org.polarsys.ng661designer.part2.ModalityType2;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.StructFieldType;
import org.polarsys.ng661designer.part2.StructPropertyType;
import org.polarsys.ng661designer.part2.UnionFieldType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.StructPropertyTypeImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.StructPropertyTypeImpl#getArrayField <em>Array Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.StructPropertyTypeImpl#getStructField <em>Struct Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.StructPropertyTypeImpl#getEnumField <em>Enum Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.StructPropertyTypeImpl#getUnionField <em>Union Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.StructPropertyTypeImpl#getModality <em>Modality</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.StructPropertyTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.StructPropertyTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructPropertyTypeImpl extends MinimalEObjectImpl.Container implements StructPropertyType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldType> field;

	/**
	 * The cached value of the '{@link #getArrayField() <em>Array Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayField()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayFieldType> arrayField;

	/**
	 * The cached value of the '{@link #getStructField() <em>Struct Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructField()
	 * @generated
	 * @ordered
	 */
	protected EList<StructFieldType> structField;

	/**
	 * The cached value of the '{@link #getEnumField() <em>Enum Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumField()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldType> enumField;

	/**
	 * The cached value of the '{@link #getUnionField() <em>Union Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnionField()
	 * @generated
	 * @ordered
	 */
	protected EList<UnionFieldType> unionField;

	/**
	 * The default value of the '{@link #getModality() <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected static final ModalityType2 MODALITY_EDEFAULT = ModalityType2.IN_OUT;

	/**
	 * The cached value of the '{@link #getModality() <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected ModalityType2 modality = MODALITY_EDEFAULT;

	/**
	 * This is true if the Modality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modalityESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getStructPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldType> getField() {
		if (field == null) {
			field = new EObjectContainmentEList<FieldType>(FieldType.class, this, Part2Package.STRUCT_PROPERTY_TYPE__FIELD);
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayFieldType> getArrayField() {
		if (arrayField == null) {
			arrayField = new EObjectContainmentEList<ArrayFieldType>(ArrayFieldType.class, this, Part2Package.STRUCT_PROPERTY_TYPE__ARRAY_FIELD);
		}
		return arrayField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructFieldType> getStructField() {
		if (structField == null) {
			structField = new EObjectContainmentEList<StructFieldType>(StructFieldType.class, this, Part2Package.STRUCT_PROPERTY_TYPE__STRUCT_FIELD);
		}
		return structField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldType> getEnumField() {
		if (enumField == null) {
			enumField = new EObjectContainmentEList<FieldType>(FieldType.class, this, Part2Package.STRUCT_PROPERTY_TYPE__ENUM_FIELD);
		}
		return enumField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnionFieldType> getUnionField() {
		if (unionField == null) {
			unionField = new EObjectContainmentEList<UnionFieldType>(UnionFieldType.class, this, Part2Package.STRUCT_PROPERTY_TYPE__UNION_FIELD);
		}
		return unionField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityType2 getModality() {
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModality(ModalityType2 newModality) {
		ModalityType2 oldModality = modality;
		modality = newModality == null ? MODALITY_EDEFAULT : newModality;
		boolean oldModalityESet = modalityESet;
		modalityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.STRUCT_PROPERTY_TYPE__MODALITY, oldModality, modality, !oldModalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModality() {
		ModalityType2 oldModality = modality;
		boolean oldModalityESet = modalityESet;
		modality = MODALITY_EDEFAULT;
		modalityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.STRUCT_PROPERTY_TYPE__MODALITY, oldModality, MODALITY_EDEFAULT, oldModalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModality() {
		return modalityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.STRUCT_PROPERTY_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.STRUCT_PROPERTY_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.STRUCT_PROPERTY_TYPE__FIELD:
				return ((InternalEList<?>)getField()).basicRemove(otherEnd, msgs);
			case Part2Package.STRUCT_PROPERTY_TYPE__ARRAY_FIELD:
				return ((InternalEList<?>)getArrayField()).basicRemove(otherEnd, msgs);
			case Part2Package.STRUCT_PROPERTY_TYPE__STRUCT_FIELD:
				return ((InternalEList<?>)getStructField()).basicRemove(otherEnd, msgs);
			case Part2Package.STRUCT_PROPERTY_TYPE__ENUM_FIELD:
				return ((InternalEList<?>)getEnumField()).basicRemove(otherEnd, msgs);
			case Part2Package.STRUCT_PROPERTY_TYPE__UNION_FIELD:
				return ((InternalEList<?>)getUnionField()).basicRemove(otherEnd, msgs);
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
			case Part2Package.STRUCT_PROPERTY_TYPE__FIELD:
				return getField();
			case Part2Package.STRUCT_PROPERTY_TYPE__ARRAY_FIELD:
				return getArrayField();
			case Part2Package.STRUCT_PROPERTY_TYPE__STRUCT_FIELD:
				return getStructField();
			case Part2Package.STRUCT_PROPERTY_TYPE__ENUM_FIELD:
				return getEnumField();
			case Part2Package.STRUCT_PROPERTY_TYPE__UNION_FIELD:
				return getUnionField();
			case Part2Package.STRUCT_PROPERTY_TYPE__MODALITY:
				return getModality();
			case Part2Package.STRUCT_PROPERTY_TYPE__NAME:
				return getName();
			case Part2Package.STRUCT_PROPERTY_TYPE__TYPE:
				return getType();
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
			case Part2Package.STRUCT_PROPERTY_TYPE__FIELD:
				getField().clear();
				getField().addAll((Collection<? extends FieldType>)newValue);
				return;
			case Part2Package.STRUCT_PROPERTY_TYPE__ARRAY_FIELD:
				getArrayField().clear();
				getArrayField().addAll((Collection<? extends ArrayFieldType>)newValue);
				return;
			case Part2Package.STRUCT_PROPERTY_TYPE__STRUCT_FIELD:
				getStructField().clear();
				getStructField().addAll((Collection<? extends StructFieldType>)newValue);
				return;
			case Part2Package.STRUCT_PROPERTY_TYPE__ENUM_FIELD:
				getEnumField().clear();
				getEnumField().addAll((Collection<? extends FieldType>)newValue);
				return;
			case Part2Package.STRUCT_PROPERTY_TYPE__UNION_FIELD:
				getUnionField().clear();
				getUnionField().addAll((Collection<? extends UnionFieldType>)newValue);
				return;
			case Part2Package.STRUCT_PROPERTY_TYPE__MODALITY:
				setModality((ModalityType2)newValue);
				return;
			case Part2Package.STRUCT_PROPERTY_TYPE__NAME:
				setName((String)newValue);
				return;
			case Part2Package.STRUCT_PROPERTY_TYPE__TYPE:
				setType((String)newValue);
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
			case Part2Package.STRUCT_PROPERTY_TYPE__FIELD:
				getField().clear();
				return;
			case Part2Package.STRUCT_PROPERTY_TYPE__ARRAY_FIELD:
				getArrayField().clear();
				return;
			case Part2Package.STRUCT_PROPERTY_TYPE__STRUCT_FIELD:
				getStructField().clear();
				return;
			case Part2Package.STRUCT_PROPERTY_TYPE__ENUM_FIELD:
				getEnumField().clear();
				return;
			case Part2Package.STRUCT_PROPERTY_TYPE__UNION_FIELD:
				getUnionField().clear();
				return;
			case Part2Package.STRUCT_PROPERTY_TYPE__MODALITY:
				unsetModality();
				return;
			case Part2Package.STRUCT_PROPERTY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Part2Package.STRUCT_PROPERTY_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case Part2Package.STRUCT_PROPERTY_TYPE__FIELD:
				return field != null && !field.isEmpty();
			case Part2Package.STRUCT_PROPERTY_TYPE__ARRAY_FIELD:
				return arrayField != null && !arrayField.isEmpty();
			case Part2Package.STRUCT_PROPERTY_TYPE__STRUCT_FIELD:
				return structField != null && !structField.isEmpty();
			case Part2Package.STRUCT_PROPERTY_TYPE__ENUM_FIELD:
				return enumField != null && !enumField.isEmpty();
			case Part2Package.STRUCT_PROPERTY_TYPE__UNION_FIELD:
				return unionField != null && !unionField.isEmpty();
			case Part2Package.STRUCT_PROPERTY_TYPE__MODALITY:
				return isSetModality();
			case Part2Package.STRUCT_PROPERTY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Part2Package.STRUCT_PROPERTY_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modality: ");
		if (modalityESet) result.append(modality); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //StructPropertyTypeImpl
