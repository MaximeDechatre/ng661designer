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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.TransformScaleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform Scale Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformScaleTypeImpl#getSx <em>Sx</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformScaleTypeImpl#getSy <em>Sy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformScaleTypeImpl extends MinimalEObjectImpl.Container implements TransformScaleType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getSx() <em>Sx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSx()
	 * @generated
	 * @ordered
	 */
	protected static final Object SX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSx() <em>Sx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSx()
	 * @generated
	 * @ordered
	 */
	protected Object sx = SX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSy() <em>Sy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSy()
	 * @generated
	 * @ordered
	 */
	protected static final Object SY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSy() <em>Sy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSy()
	 * @generated
	 * @ordered
	 */
	protected Object sy = SY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformScaleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getTransformScaleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSx() {
		return sx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSx(Object newSx) {
		Object oldSx = sx;
		sx = newSx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TRANSFORM_SCALE_TYPE__SX, oldSx, sx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSy() {
		return sy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSy(Object newSy) {
		Object oldSy = sy;
		sy = newSy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TRANSFORM_SCALE_TYPE__SY, oldSy, sy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.TRANSFORM_SCALE_TYPE__SX:
				return getSx();
			case Part2Package.TRANSFORM_SCALE_TYPE__SY:
				return getSy();
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
			case Part2Package.TRANSFORM_SCALE_TYPE__SX:
				setSx(newValue);
				return;
			case Part2Package.TRANSFORM_SCALE_TYPE__SY:
				setSy(newValue);
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
			case Part2Package.TRANSFORM_SCALE_TYPE__SX:
				setSx(SX_EDEFAULT);
				return;
			case Part2Package.TRANSFORM_SCALE_TYPE__SY:
				setSy(SY_EDEFAULT);
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
			case Part2Package.TRANSFORM_SCALE_TYPE__SX:
				return SX_EDEFAULT == null ? sx != null : !SX_EDEFAULT.equals(sx);
			case Part2Package.TRANSFORM_SCALE_TYPE__SY:
				return SY_EDEFAULT == null ? sy != null : !SY_EDEFAULT.equals(sy);
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
		result.append(" (sx: ");
		result.append(sx);
		result.append(", sy: ");
		result.append(sy);
		result.append(')');
		return result.toString();
	}

} //TransformScaleTypeImpl
