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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.ng661designer.part2.ArrayFieldDefinitionType;
import org.polarsys.ng661designer.part2.FieldDefinitionType;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.StructDefinitionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.StructDefinitionTypeImpl#getFieldDefinition <em>Field Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.StructDefinitionTypeImpl#getStructFieldDefinition <em>Struct Field Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.StructDefinitionTypeImpl#getArrayFieldDefinition <em>Array Field Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.StructDefinitionTypeImpl#getEnumFieldDefinition <em>Enum Field Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.StructDefinitionTypeImpl#getUnionFieldDefinition <em>Union Field Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructDefinitionTypeImpl extends TypeDefinitionAbstractTypeImpl implements StructDefinitionType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getFieldDefinition() <em>Field Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldDefinitionType> fieldDefinition;

	/**
	 * The cached value of the '{@link #getStructFieldDefinition() <em>Struct Field Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructFieldDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldDefinitionType> structFieldDefinition;

	/**
	 * The cached value of the '{@link #getArrayFieldDefinition() <em>Array Field Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayFieldDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayFieldDefinitionType> arrayFieldDefinition;

	/**
	 * The cached value of the '{@link #getEnumFieldDefinition() <em>Enum Field Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumFieldDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldDefinitionType> enumFieldDefinition;

	/**
	 * The cached value of the '{@link #getUnionFieldDefinition() <em>Union Field Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnionFieldDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldDefinitionType> unionFieldDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getStructDefinitionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldDefinitionType> getFieldDefinition() {
		if (fieldDefinition == null) {
			fieldDefinition = new EObjectContainmentEList<FieldDefinitionType>(FieldDefinitionType.class, this, Part2Package.STRUCT_DEFINITION_TYPE__FIELD_DEFINITION);
		}
		return fieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldDefinitionType> getStructFieldDefinition() {
		if (structFieldDefinition == null) {
			structFieldDefinition = new EObjectContainmentEList<FieldDefinitionType>(FieldDefinitionType.class, this, Part2Package.STRUCT_DEFINITION_TYPE__STRUCT_FIELD_DEFINITION);
		}
		return structFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayFieldDefinitionType> getArrayFieldDefinition() {
		if (arrayFieldDefinition == null) {
			arrayFieldDefinition = new EObjectContainmentEList<ArrayFieldDefinitionType>(ArrayFieldDefinitionType.class, this, Part2Package.STRUCT_DEFINITION_TYPE__ARRAY_FIELD_DEFINITION);
		}
		return arrayFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldDefinitionType> getEnumFieldDefinition() {
		if (enumFieldDefinition == null) {
			enumFieldDefinition = new EObjectContainmentEList<FieldDefinitionType>(FieldDefinitionType.class, this, Part2Package.STRUCT_DEFINITION_TYPE__ENUM_FIELD_DEFINITION);
		}
		return enumFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldDefinitionType> getUnionFieldDefinition() {
		if (unionFieldDefinition == null) {
			unionFieldDefinition = new EObjectContainmentEList<FieldDefinitionType>(FieldDefinitionType.class, this, Part2Package.STRUCT_DEFINITION_TYPE__UNION_FIELD_DEFINITION);
		}
		return unionFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.STRUCT_DEFINITION_TYPE__FIELD_DEFINITION:
				return ((InternalEList<?>)getFieldDefinition()).basicRemove(otherEnd, msgs);
			case Part2Package.STRUCT_DEFINITION_TYPE__STRUCT_FIELD_DEFINITION:
				return ((InternalEList<?>)getStructFieldDefinition()).basicRemove(otherEnd, msgs);
			case Part2Package.STRUCT_DEFINITION_TYPE__ARRAY_FIELD_DEFINITION:
				return ((InternalEList<?>)getArrayFieldDefinition()).basicRemove(otherEnd, msgs);
			case Part2Package.STRUCT_DEFINITION_TYPE__ENUM_FIELD_DEFINITION:
				return ((InternalEList<?>)getEnumFieldDefinition()).basicRemove(otherEnd, msgs);
			case Part2Package.STRUCT_DEFINITION_TYPE__UNION_FIELD_DEFINITION:
				return ((InternalEList<?>)getUnionFieldDefinition()).basicRemove(otherEnd, msgs);
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
			case Part2Package.STRUCT_DEFINITION_TYPE__FIELD_DEFINITION:
				return getFieldDefinition();
			case Part2Package.STRUCT_DEFINITION_TYPE__STRUCT_FIELD_DEFINITION:
				return getStructFieldDefinition();
			case Part2Package.STRUCT_DEFINITION_TYPE__ARRAY_FIELD_DEFINITION:
				return getArrayFieldDefinition();
			case Part2Package.STRUCT_DEFINITION_TYPE__ENUM_FIELD_DEFINITION:
				return getEnumFieldDefinition();
			case Part2Package.STRUCT_DEFINITION_TYPE__UNION_FIELD_DEFINITION:
				return getUnionFieldDefinition();
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
			case Part2Package.STRUCT_DEFINITION_TYPE__FIELD_DEFINITION:
				getFieldDefinition().clear();
				getFieldDefinition().addAll((Collection<? extends FieldDefinitionType>)newValue);
				return;
			case Part2Package.STRUCT_DEFINITION_TYPE__STRUCT_FIELD_DEFINITION:
				getStructFieldDefinition().clear();
				getStructFieldDefinition().addAll((Collection<? extends FieldDefinitionType>)newValue);
				return;
			case Part2Package.STRUCT_DEFINITION_TYPE__ARRAY_FIELD_DEFINITION:
				getArrayFieldDefinition().clear();
				getArrayFieldDefinition().addAll((Collection<? extends ArrayFieldDefinitionType>)newValue);
				return;
			case Part2Package.STRUCT_DEFINITION_TYPE__ENUM_FIELD_DEFINITION:
				getEnumFieldDefinition().clear();
				getEnumFieldDefinition().addAll((Collection<? extends FieldDefinitionType>)newValue);
				return;
			case Part2Package.STRUCT_DEFINITION_TYPE__UNION_FIELD_DEFINITION:
				getUnionFieldDefinition().clear();
				getUnionFieldDefinition().addAll((Collection<? extends FieldDefinitionType>)newValue);
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
			case Part2Package.STRUCT_DEFINITION_TYPE__FIELD_DEFINITION:
				getFieldDefinition().clear();
				return;
			case Part2Package.STRUCT_DEFINITION_TYPE__STRUCT_FIELD_DEFINITION:
				getStructFieldDefinition().clear();
				return;
			case Part2Package.STRUCT_DEFINITION_TYPE__ARRAY_FIELD_DEFINITION:
				getArrayFieldDefinition().clear();
				return;
			case Part2Package.STRUCT_DEFINITION_TYPE__ENUM_FIELD_DEFINITION:
				getEnumFieldDefinition().clear();
				return;
			case Part2Package.STRUCT_DEFINITION_TYPE__UNION_FIELD_DEFINITION:
				getUnionFieldDefinition().clear();
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
			case Part2Package.STRUCT_DEFINITION_TYPE__FIELD_DEFINITION:
				return fieldDefinition != null && !fieldDefinition.isEmpty();
			case Part2Package.STRUCT_DEFINITION_TYPE__STRUCT_FIELD_DEFINITION:
				return structFieldDefinition != null && !structFieldDefinition.isEmpty();
			case Part2Package.STRUCT_DEFINITION_TYPE__ARRAY_FIELD_DEFINITION:
				return arrayFieldDefinition != null && !arrayFieldDefinition.isEmpty();
			case Part2Package.STRUCT_DEFINITION_TYPE__ENUM_FIELD_DEFINITION:
				return enumFieldDefinition != null && !enumFieldDefinition.isEmpty();
			case Part2Package.STRUCT_DEFINITION_TYPE__UNION_FIELD_DEFINITION:
				return unionFieldDefinition != null && !unionFieldDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructDefinitionTypeImpl
