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

import org.polarsys.ng661designer.part2.CubicBezierCurveCommand;
import org.polarsys.ng661designer.part2.Part2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cubic Bezier Curve Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.CubicBezierCurveCommandImpl#getX <em>X</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.CubicBezierCurveCommandImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.CubicBezierCurveCommandImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.CubicBezierCurveCommandImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.CubicBezierCurveCommandImpl#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.CubicBezierCurveCommandImpl#getY2 <em>Y2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CubicBezierCurveCommandImpl extends MinimalEObjectImpl.Container implements CubicBezierCurveCommand {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Object X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Object x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected static final Object X1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected Object x1 = X1_EDEFAULT;

	/**
	 * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected static final Object X2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected Object x2 = X2_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Object Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Object y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected static final Object Y1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected Object y1 = Y1_EDEFAULT;

	/**
	 * The default value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected static final Object Y2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected Object y2 = Y2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CubicBezierCurveCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getCubicBezierCurveCommand();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Object newX) {
		Object oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.CUBIC_BEZIER_CURVE_COMMAND__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getX1() {
		return x1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX1(Object newX1) {
		Object oldX1 = x1;
		x1 = newX1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.CUBIC_BEZIER_CURVE_COMMAND__X1, oldX1, x1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getX2() {
		return x2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX2(Object newX2) {
		Object oldX2 = x2;
		x2 = newX2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.CUBIC_BEZIER_CURVE_COMMAND__X2, oldX2, x2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Object newY) {
		Object oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.CUBIC_BEZIER_CURVE_COMMAND__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getY1() {
		return y1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY1(Object newY1) {
		Object oldY1 = y1;
		y1 = newY1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.CUBIC_BEZIER_CURVE_COMMAND__Y1, oldY1, y1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getY2() {
		return y2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY2(Object newY2) {
		Object oldY2 = y2;
		y2 = newY2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.CUBIC_BEZIER_CURVE_COMMAND__Y2, oldY2, y2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__X:
				return getX();
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__X1:
				return getX1();
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__X2:
				return getX2();
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__Y:
				return getY();
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__Y1:
				return getY1();
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__Y2:
				return getY2();
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
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__X:
				setX(newValue);
				return;
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__X1:
				setX1(newValue);
				return;
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__X2:
				setX2(newValue);
				return;
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__Y:
				setY(newValue);
				return;
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__Y1:
				setY1(newValue);
				return;
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__Y2:
				setY2(newValue);
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
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__X:
				setX(X_EDEFAULT);
				return;
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__X1:
				setX1(X1_EDEFAULT);
				return;
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__X2:
				setX2(X2_EDEFAULT);
				return;
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__Y:
				setY(Y_EDEFAULT);
				return;
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__Y1:
				setY1(Y1_EDEFAULT);
				return;
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__Y2:
				setY2(Y2_EDEFAULT);
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
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__X1:
				return X1_EDEFAULT == null ? x1 != null : !X1_EDEFAULT.equals(x1);
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__X2:
				return X2_EDEFAULT == null ? x2 != null : !X2_EDEFAULT.equals(x2);
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__Y1:
				return Y1_EDEFAULT == null ? y1 != null : !Y1_EDEFAULT.equals(y1);
			case Part2Package.CUBIC_BEZIER_CURVE_COMMAND__Y2:
				return Y2_EDEFAULT == null ? y2 != null : !Y2_EDEFAULT.equals(y2);
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
		result.append(" (x: ");
		result.append(x);
		result.append(", x1: ");
		result.append(x1);
		result.append(", x2: ");
		result.append(x2);
		result.append(", y: ");
		result.append(y);
		result.append(", y1: ");
		result.append(y1);
		result.append(", y2: ");
		result.append(y2);
		result.append(')');
		return result.toString();
	}

} //CubicBezierCurveCommandImpl
