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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.ng661designer.part2.ArrayDefinitionType;
import org.polarsys.ng661designer.part2.Part2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayDefinitionTypeImpl#getEntryType <em>Entry Type</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayDefinitionTypeImpl#getMaxStringLength <em>Max String Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayDefinitionTypeImpl extends TypeDefinitionAbstractTypeImpl implements ArrayDefinitionType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getEntryType() <em>Entry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryType()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryType() <em>Entry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryType()
	 * @generated
	 * @ordered
	 */
	protected String entryType = ENTRY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxStringLength() <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStringLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_STRING_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxStringLength() <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStringLength()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxStringLength = MAX_STRING_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getArrayDefinitionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntryType() {
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryType(String newEntryType) {
		String oldEntryType = entryType;
		entryType = newEntryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_DEFINITION_TYPE__ENTRY_TYPE, oldEntryType, entryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxStringLength() {
		return maxStringLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxStringLength(BigInteger newMaxStringLength) {
		BigInteger oldMaxStringLength = maxStringLength;
		maxStringLength = newMaxStringLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_DEFINITION_TYPE__MAX_STRING_LENGTH, oldMaxStringLength, maxStringLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.ARRAY_DEFINITION_TYPE__ENTRY_TYPE:
				return getEntryType();
			case Part2Package.ARRAY_DEFINITION_TYPE__MAX_STRING_LENGTH:
				return getMaxStringLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Part2Package.ARRAY_DEFINITION_TYPE__ENTRY_TYPE:
				setEntryType((String)newValue);
				return;
			case Part2Package.ARRAY_DEFINITION_TYPE__MAX_STRING_LENGTH:
				setMaxStringLength((BigInteger)newValue);
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
			case Part2Package.ARRAY_DEFINITION_TYPE__ENTRY_TYPE:
				setEntryType(ENTRY_TYPE_EDEFAULT);
				return;
			case Part2Package.ARRAY_DEFINITION_TYPE__MAX_STRING_LENGTH:
				setMaxStringLength(MAX_STRING_LENGTH_EDEFAULT);
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
			case Part2Package.ARRAY_DEFINITION_TYPE__ENTRY_TYPE:
				return ENTRY_TYPE_EDEFAULT == null ? entryType != null : !ENTRY_TYPE_EDEFAULT.equals(entryType);
			case Part2Package.ARRAY_DEFINITION_TYPE__MAX_STRING_LENGTH:
				return MAX_STRING_LENGTH_EDEFAULT == null ? maxStringLength != null : !MAX_STRING_LENGTH_EDEFAULT.equals(maxStringLength);
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
		result.append(" (entryType: ");
		result.append(entryType);
		result.append(", maxStringLength: ");
		result.append(maxStringLength);
		result.append(')');
		return result.toString();
	}

} //ArrayDefinitionTypeImpl
