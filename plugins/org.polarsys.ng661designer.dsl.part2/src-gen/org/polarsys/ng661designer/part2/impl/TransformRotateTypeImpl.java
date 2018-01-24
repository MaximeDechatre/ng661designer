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
import org.polarsys.ng661designer.part2.TransformRotateType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform Rotate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformRotateTypeImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformRotateTypeImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformRotateTypeImpl#getCy <em>Cy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformRotateTypeImpl extends MinimalEObjectImpl.Container implements TransformRotateType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final Object ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected Object angle = ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected static final Object CX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected Object cx = CX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected static final Object CY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected Object cy = CY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformRotateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getTransformRotateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(Object newAngle) {
		Object oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TRANSFORM_ROTATE_TYPE__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCx() {
		return cx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCx(Object newCx) {
		Object oldCx = cx;
		cx = newCx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TRANSFORM_ROTATE_TYPE__CX, oldCx, cx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCy() {
		return cy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCy(Object newCy) {
		Object oldCy = cy;
		cy = newCy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TRANSFORM_ROTATE_TYPE__CY, oldCy, cy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.TRANSFORM_ROTATE_TYPE__ANGLE:
				return getAngle();
			case Part2Package.TRANSFORM_ROTATE_TYPE__CX:
				return getCx();
			case Part2Package.TRANSFORM_ROTATE_TYPE__CY:
				return getCy();
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
			case Part2Package.TRANSFORM_ROTATE_TYPE__ANGLE:
				setAngle(newValue);
				return;
			case Part2Package.TRANSFORM_ROTATE_TYPE__CX:
				setCx(newValue);
				return;
			case Part2Package.TRANSFORM_ROTATE_TYPE__CY:
				setCy(newValue);
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
			case Part2Package.TRANSFORM_ROTATE_TYPE__ANGLE:
				setAngle(ANGLE_EDEFAULT);
				return;
			case Part2Package.TRANSFORM_ROTATE_TYPE__CX:
				setCx(CX_EDEFAULT);
				return;
			case Part2Package.TRANSFORM_ROTATE_TYPE__CY:
				setCy(CY_EDEFAULT);
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
			case Part2Package.TRANSFORM_ROTATE_TYPE__ANGLE:
				return ANGLE_EDEFAULT == null ? angle != null : !ANGLE_EDEFAULT.equals(angle);
			case Part2Package.TRANSFORM_ROTATE_TYPE__CX:
				return CX_EDEFAULT == null ? cx != null : !CX_EDEFAULT.equals(cx);
			case Part2Package.TRANSFORM_ROTATE_TYPE__CY:
				return CY_EDEFAULT == null ? cy != null : !CY_EDEFAULT.equals(cy);
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
		result.append(" (angle: ");
		result.append(angle);
		result.append(", cx: ");
		result.append(cx);
		result.append(", cy: ");
		result.append(cy);
		result.append(')');
		return result.toString();
	}

} //TransformRotateTypeImpl
