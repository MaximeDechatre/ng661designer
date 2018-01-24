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

import org.polarsys.ng661designer.part2.ArrayDefinitionType;
import org.polarsys.ng661designer.part2.DefinitionsType;
import org.polarsys.ng661designer.part2.EnumDefinitionType;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.StructDefinitionType;
import org.polarsys.ng661designer.part2.UnionDefinitionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.DefinitionsTypeImpl#getStructDefinition <em>Struct Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.DefinitionsTypeImpl#getEnumDefinition <em>Enum Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.DefinitionsTypeImpl#getArrayDefinition <em>Array Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.DefinitionsTypeImpl#getUnionDefinition <em>Union Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionsTypeImpl extends MinimalEObjectImpl.Container implements DefinitionsType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getStructDefinition() <em>Struct Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<StructDefinitionType> structDefinition;

	/**
	 * The cached value of the '{@link #getEnumDefinition() <em>Enum Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumDefinitionType> enumDefinition;

	/**
	 * The cached value of the '{@link #getArrayDefinition() <em>Array Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayDefinitionType> arrayDefinition;

	/**
	 * The cached value of the '{@link #getUnionDefinition() <em>Union Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnionDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<UnionDefinitionType> unionDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getDefinitionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructDefinitionType> getStructDefinition() {
		if (structDefinition == null) {
			structDefinition = new EObjectContainmentEList<StructDefinitionType>(StructDefinitionType.class, this, Part2Package.DEFINITIONS_TYPE__STRUCT_DEFINITION);
		}
		return structDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumDefinitionType> getEnumDefinition() {
		if (enumDefinition == null) {
			enumDefinition = new EObjectContainmentEList<EnumDefinitionType>(EnumDefinitionType.class, this, Part2Package.DEFINITIONS_TYPE__ENUM_DEFINITION);
		}
		return enumDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayDefinitionType> getArrayDefinition() {
		if (arrayDefinition == null) {
			arrayDefinition = new EObjectContainmentEList<ArrayDefinitionType>(ArrayDefinitionType.class, this, Part2Package.DEFINITIONS_TYPE__ARRAY_DEFINITION);
		}
		return arrayDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnionDefinitionType> getUnionDefinition() {
		if (unionDefinition == null) {
			unionDefinition = new EObjectContainmentEList<UnionDefinitionType>(UnionDefinitionType.class, this, Part2Package.DEFINITIONS_TYPE__UNION_DEFINITION);
		}
		return unionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.DEFINITIONS_TYPE__STRUCT_DEFINITION:
				return ((InternalEList<?>)getStructDefinition()).basicRemove(otherEnd, msgs);
			case Part2Package.DEFINITIONS_TYPE__ENUM_DEFINITION:
				return ((InternalEList<?>)getEnumDefinition()).basicRemove(otherEnd, msgs);
			case Part2Package.DEFINITIONS_TYPE__ARRAY_DEFINITION:
				return ((InternalEList<?>)getArrayDefinition()).basicRemove(otherEnd, msgs);
			case Part2Package.DEFINITIONS_TYPE__UNION_DEFINITION:
				return ((InternalEList<?>)getUnionDefinition()).basicRemove(otherEnd, msgs);
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
			case Part2Package.DEFINITIONS_TYPE__STRUCT_DEFINITION:
				return getStructDefinition();
			case Part2Package.DEFINITIONS_TYPE__ENUM_DEFINITION:
				return getEnumDefinition();
			case Part2Package.DEFINITIONS_TYPE__ARRAY_DEFINITION:
				return getArrayDefinition();
			case Part2Package.DEFINITIONS_TYPE__UNION_DEFINITION:
				return getUnionDefinition();
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
			case Part2Package.DEFINITIONS_TYPE__STRUCT_DEFINITION:
				getStructDefinition().clear();
				getStructDefinition().addAll((Collection<? extends StructDefinitionType>)newValue);
				return;
			case Part2Package.DEFINITIONS_TYPE__ENUM_DEFINITION:
				getEnumDefinition().clear();
				getEnumDefinition().addAll((Collection<? extends EnumDefinitionType>)newValue);
				return;
			case Part2Package.DEFINITIONS_TYPE__ARRAY_DEFINITION:
				getArrayDefinition().clear();
				getArrayDefinition().addAll((Collection<? extends ArrayDefinitionType>)newValue);
				return;
			case Part2Package.DEFINITIONS_TYPE__UNION_DEFINITION:
				getUnionDefinition().clear();
				getUnionDefinition().addAll((Collection<? extends UnionDefinitionType>)newValue);
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
			case Part2Package.DEFINITIONS_TYPE__STRUCT_DEFINITION:
				getStructDefinition().clear();
				return;
			case Part2Package.DEFINITIONS_TYPE__ENUM_DEFINITION:
				getEnumDefinition().clear();
				return;
			case Part2Package.DEFINITIONS_TYPE__ARRAY_DEFINITION:
				getArrayDefinition().clear();
				return;
			case Part2Package.DEFINITIONS_TYPE__UNION_DEFINITION:
				getUnionDefinition().clear();
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
			case Part2Package.DEFINITIONS_TYPE__STRUCT_DEFINITION:
				return structDefinition != null && !structDefinition.isEmpty();
			case Part2Package.DEFINITIONS_TYPE__ENUM_DEFINITION:
				return enumDefinition != null && !enumDefinition.isEmpty();
			case Part2Package.DEFINITIONS_TYPE__ARRAY_DEFINITION:
				return arrayDefinition != null && !arrayDefinition.isEmpty();
			case Part2Package.DEFINITIONS_TYPE__UNION_DEFINITION:
				return unionDefinition != null && !unionDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DefinitionsTypeImpl
