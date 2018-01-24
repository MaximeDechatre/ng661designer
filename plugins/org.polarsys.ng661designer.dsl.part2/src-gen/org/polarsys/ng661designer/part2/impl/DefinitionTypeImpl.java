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

import org.polarsys.ng661designer.part2.DefinitionType;
import org.polarsys.ng661designer.part2.DefinitionsType;
import org.polarsys.ng661designer.part2.ImportType;
import org.polarsys.ng661designer.part2.Part2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.DefinitionTypeImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.DefinitionTypeImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.DefinitionTypeImpl#getPropertyGroupDefinition <em>Property Group Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionTypeImpl extends MinimalEObjectImpl.Container implements DefinitionType {
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
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinitionsType> typeDefinition;

	/**
	 * The cached value of the '{@link #getPropertyGroupDefinition() <em>Property Group Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyGroupDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinitionsType> propertyGroupDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getDefinitionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportType> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<ImportType>(ImportType.class, this, Part2Package.DEFINITION_TYPE__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefinitionsType> getTypeDefinition() {
		if (typeDefinition == null) {
			typeDefinition = new EObjectContainmentEList<DefinitionsType>(DefinitionsType.class, this, Part2Package.DEFINITION_TYPE__TYPE_DEFINITION);
		}
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefinitionsType> getPropertyGroupDefinition() {
		if (propertyGroupDefinition == null) {
			propertyGroupDefinition = new EObjectContainmentEList<DefinitionsType>(DefinitionsType.class, this, Part2Package.DEFINITION_TYPE__PROPERTY_GROUP_DEFINITION);
		}
		return propertyGroupDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.DEFINITION_TYPE__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case Part2Package.DEFINITION_TYPE__TYPE_DEFINITION:
				return ((InternalEList<?>)getTypeDefinition()).basicRemove(otherEnd, msgs);
			case Part2Package.DEFINITION_TYPE__PROPERTY_GROUP_DEFINITION:
				return ((InternalEList<?>)getPropertyGroupDefinition()).basicRemove(otherEnd, msgs);
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
			case Part2Package.DEFINITION_TYPE__IMPORT:
				return getImport();
			case Part2Package.DEFINITION_TYPE__TYPE_DEFINITION:
				return getTypeDefinition();
			case Part2Package.DEFINITION_TYPE__PROPERTY_GROUP_DEFINITION:
				return getPropertyGroupDefinition();
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
			case Part2Package.DEFINITION_TYPE__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends ImportType>)newValue);
				return;
			case Part2Package.DEFINITION_TYPE__TYPE_DEFINITION:
				getTypeDefinition().clear();
				getTypeDefinition().addAll((Collection<? extends DefinitionsType>)newValue);
				return;
			case Part2Package.DEFINITION_TYPE__PROPERTY_GROUP_DEFINITION:
				getPropertyGroupDefinition().clear();
				getPropertyGroupDefinition().addAll((Collection<? extends DefinitionsType>)newValue);
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
			case Part2Package.DEFINITION_TYPE__IMPORT:
				getImport().clear();
				return;
			case Part2Package.DEFINITION_TYPE__TYPE_DEFINITION:
				getTypeDefinition().clear();
				return;
			case Part2Package.DEFINITION_TYPE__PROPERTY_GROUP_DEFINITION:
				getPropertyGroupDefinition().clear();
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
			case Part2Package.DEFINITION_TYPE__IMPORT:
				return import_ != null && !import_.isEmpty();
			case Part2Package.DEFINITION_TYPE__TYPE_DEFINITION:
				return typeDefinition != null && !typeDefinition.isEmpty();
			case Part2Package.DEFINITION_TYPE__PROPERTY_GROUP_DEFINITION:
				return propertyGroupDefinition != null && !propertyGroupDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DefinitionTypeImpl
