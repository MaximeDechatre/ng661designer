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

import org.polarsys.ng661designer.part2.ArrayFieldDefinitionType;
import org.polarsys.ng661designer.part2.Part2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Field Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayFieldDefinitionTypeImpl#getEntriesType <em>Entries Type</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayFieldDefinitionTypeImpl#getMaxStringLength <em>Max String Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayFieldDefinitionTypeImpl extends FieldDefinitionAbstractTypeImpl implements ArrayFieldDefinitionType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getEntriesType() <em>Entries Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntriesType()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRIES_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntriesType() <em>Entries Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntriesType()
	 * @generated
	 * @ordered
	 */
	protected String entriesType = ENTRIES_TYPE_EDEFAULT;

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
	protected ArrayFieldDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getArrayFieldDefinitionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntriesType() {
		return entriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntriesType(String newEntriesType) {
		String oldEntriesType = entriesType;
		entriesType = newEntriesType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_FIELD_DEFINITION_TYPE__ENTRIES_TYPE, oldEntriesType, entriesType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_FIELD_DEFINITION_TYPE__MAX_STRING_LENGTH, oldMaxStringLength, maxStringLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.ARRAY_FIELD_DEFINITION_TYPE__ENTRIES_TYPE:
				return getEntriesType();
			case Part2Package.ARRAY_FIELD_DEFINITION_TYPE__MAX_STRING_LENGTH:
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
			case Part2Package.ARRAY_FIELD_DEFINITION_TYPE__ENTRIES_TYPE:
				setEntriesType((String)newValue);
				return;
			case Part2Package.ARRAY_FIELD_DEFINITION_TYPE__MAX_STRING_LENGTH:
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
			case Part2Package.ARRAY_FIELD_DEFINITION_TYPE__ENTRIES_TYPE:
				setEntriesType(ENTRIES_TYPE_EDEFAULT);
				return;
			case Part2Package.ARRAY_FIELD_DEFINITION_TYPE__MAX_STRING_LENGTH:
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
			case Part2Package.ARRAY_FIELD_DEFINITION_TYPE__ENTRIES_TYPE:
				return ENTRIES_TYPE_EDEFAULT == null ? entriesType != null : !ENTRIES_TYPE_EDEFAULT.equals(entriesType);
			case Part2Package.ARRAY_FIELD_DEFINITION_TYPE__MAX_STRING_LENGTH:
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
		result.append(" (entriesType: ");
		result.append(entriesType);
		result.append(", maxStringLength: ");
		result.append(maxStringLength);
		result.append(')');
		return result.toString();
	}

} //ArrayFieldDefinitionTypeImpl
