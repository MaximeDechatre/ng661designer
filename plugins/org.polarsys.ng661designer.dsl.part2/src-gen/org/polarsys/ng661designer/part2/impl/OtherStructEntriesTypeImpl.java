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

import org.polarsys.ng661designer.part2.ArrayFieldType;
import org.polarsys.ng661designer.part2.FieldType;
import org.polarsys.ng661designer.part2.OtherStructEntriesType;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.StructFieldType;
import org.polarsys.ng661designer.part2.UnionFieldType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Struct Entries Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.OtherStructEntriesTypeImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.OtherStructEntriesTypeImpl#getArrayField <em>Array Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.OtherStructEntriesTypeImpl#getStructField <em>Struct Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.OtherStructEntriesTypeImpl#getEnumField <em>Enum Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.OtherStructEntriesTypeImpl#getUnionField <em>Union Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OtherStructEntriesTypeImpl extends MinimalEObjectImpl.Container implements OtherStructEntriesType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtherStructEntriesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getOtherStructEntriesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldType> getField() {
		if (field == null) {
			field = new EObjectContainmentEList<FieldType>(FieldType.class, this, Part2Package.OTHER_STRUCT_ENTRIES_TYPE__FIELD);
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
			arrayField = new EObjectContainmentEList<ArrayFieldType>(ArrayFieldType.class, this, Part2Package.OTHER_STRUCT_ENTRIES_TYPE__ARRAY_FIELD);
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
			structField = new EObjectContainmentEList<StructFieldType>(StructFieldType.class, this, Part2Package.OTHER_STRUCT_ENTRIES_TYPE__STRUCT_FIELD);
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
			enumField = new EObjectContainmentEList<FieldType>(FieldType.class, this, Part2Package.OTHER_STRUCT_ENTRIES_TYPE__ENUM_FIELD);
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
			unionField = new EObjectContainmentEList<UnionFieldType>(UnionFieldType.class, this, Part2Package.OTHER_STRUCT_ENTRIES_TYPE__UNION_FIELD);
		}
		return unionField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__FIELD:
				return ((InternalEList<?>)getField()).basicRemove(otherEnd, msgs);
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__ARRAY_FIELD:
				return ((InternalEList<?>)getArrayField()).basicRemove(otherEnd, msgs);
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__STRUCT_FIELD:
				return ((InternalEList<?>)getStructField()).basicRemove(otherEnd, msgs);
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__ENUM_FIELD:
				return ((InternalEList<?>)getEnumField()).basicRemove(otherEnd, msgs);
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__UNION_FIELD:
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
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__FIELD:
				return getField();
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__ARRAY_FIELD:
				return getArrayField();
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__STRUCT_FIELD:
				return getStructField();
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__ENUM_FIELD:
				return getEnumField();
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__UNION_FIELD:
				return getUnionField();
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
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__FIELD:
				getField().clear();
				getField().addAll((Collection<? extends FieldType>)newValue);
				return;
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__ARRAY_FIELD:
				getArrayField().clear();
				getArrayField().addAll((Collection<? extends ArrayFieldType>)newValue);
				return;
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__STRUCT_FIELD:
				getStructField().clear();
				getStructField().addAll((Collection<? extends StructFieldType>)newValue);
				return;
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__ENUM_FIELD:
				getEnumField().clear();
				getEnumField().addAll((Collection<? extends FieldType>)newValue);
				return;
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__UNION_FIELD:
				getUnionField().clear();
				getUnionField().addAll((Collection<? extends UnionFieldType>)newValue);
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
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__FIELD:
				getField().clear();
				return;
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__ARRAY_FIELD:
				getArrayField().clear();
				return;
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__STRUCT_FIELD:
				getStructField().clear();
				return;
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__ENUM_FIELD:
				getEnumField().clear();
				return;
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__UNION_FIELD:
				getUnionField().clear();
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
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__FIELD:
				return field != null && !field.isEmpty();
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__ARRAY_FIELD:
				return arrayField != null && !arrayField.isEmpty();
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__STRUCT_FIELD:
				return structField != null && !structField.isEmpty();
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__ENUM_FIELD:
				return enumField != null && !enumField.isEmpty();
			case Part2Package.OTHER_STRUCT_ENTRIES_TYPE__UNION_FIELD:
				return unionField != null && !unionField.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OtherStructEntriesTypeImpl
