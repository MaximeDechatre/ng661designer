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

import org.polarsys.ng661designer.part2.EllipseArcCurveCommand;
import org.polarsys.ng661designer.part2.Part2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ellipse Arc Curve Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.EllipseArcCurveCommandImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.EllipseArcCurveCommandImpl#getLargeArcFlag <em>Large Arc Flag</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.EllipseArcCurveCommandImpl#getR1 <em>R1</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.EllipseArcCurveCommandImpl#getR2 <em>R2</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.EllipseArcCurveCommandImpl#getSweepFlag <em>Sweep Flag</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.EllipseArcCurveCommandImpl#getX <em>X</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.EllipseArcCurveCommandImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EllipseArcCurveCommandImpl extends MinimalEObjectImpl.Container implements EllipseArcCurveCommand {
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
	 * The default value of the '{@link #getLargeArcFlag() <em>Large Arc Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeArcFlag()
	 * @generated
	 * @ordered
	 */
	protected static final Object LARGE_ARC_FLAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLargeArcFlag() <em>Large Arc Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeArcFlag()
	 * @generated
	 * @ordered
	 */
	protected Object largeArcFlag = LARGE_ARC_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getR1() <em>R1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR1()
	 * @generated
	 * @ordered
	 */
	protected static final Object R1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getR1() <em>R1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR1()
	 * @generated
	 * @ordered
	 */
	protected Object r1 = R1_EDEFAULT;

	/**
	 * The default value of the '{@link #getR2() <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR2()
	 * @generated
	 * @ordered
	 */
	protected static final Object R2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getR2() <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR2()
	 * @generated
	 * @ordered
	 */
	protected Object r2 = R2_EDEFAULT;

	/**
	 * The default value of the '{@link #getSweepFlag() <em>Sweep Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSweepFlag()
	 * @generated
	 * @ordered
	 */
	protected static final Object SWEEP_FLAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSweepFlag() <em>Sweep Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSweepFlag()
	 * @generated
	 * @ordered
	 */
	protected Object sweepFlag = SWEEP_FLAG_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EllipseArcCurveCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getEllipseArcCurveCommand();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ELLIPSE_ARC_CURVE_COMMAND__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLargeArcFlag() {
		return largeArcFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeArcFlag(Object newLargeArcFlag) {
		Object oldLargeArcFlag = largeArcFlag;
		largeArcFlag = newLargeArcFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ELLIPSE_ARC_CURVE_COMMAND__LARGE_ARC_FLAG, oldLargeArcFlag, largeArcFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getR1() {
		return r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR1(Object newR1) {
		Object oldR1 = r1;
		r1 = newR1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ELLIPSE_ARC_CURVE_COMMAND__R1, oldR1, r1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getR2() {
		return r2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR2(Object newR2) {
		Object oldR2 = r2;
		r2 = newR2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ELLIPSE_ARC_CURVE_COMMAND__R2, oldR2, r2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSweepFlag() {
		return sweepFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSweepFlag(Object newSweepFlag) {
		Object oldSweepFlag = sweepFlag;
		sweepFlag = newSweepFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ELLIPSE_ARC_CURVE_COMMAND__SWEEP_FLAG, oldSweepFlag, sweepFlag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ELLIPSE_ARC_CURVE_COMMAND__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ELLIPSE_ARC_CURVE_COMMAND__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__ANGLE:
				return getAngle();
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__LARGE_ARC_FLAG:
				return getLargeArcFlag();
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__R1:
				return getR1();
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__R2:
				return getR2();
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__SWEEP_FLAG:
				return getSweepFlag();
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__X:
				return getX();
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__Y:
				return getY();
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
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__ANGLE:
				setAngle(newValue);
				return;
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__LARGE_ARC_FLAG:
				setLargeArcFlag(newValue);
				return;
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__R1:
				setR1(newValue);
				return;
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__R2:
				setR2(newValue);
				return;
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__SWEEP_FLAG:
				setSweepFlag(newValue);
				return;
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__X:
				setX(newValue);
				return;
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__Y:
				setY(newValue);
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
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__ANGLE:
				setAngle(ANGLE_EDEFAULT);
				return;
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__LARGE_ARC_FLAG:
				setLargeArcFlag(LARGE_ARC_FLAG_EDEFAULT);
				return;
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__R1:
				setR1(R1_EDEFAULT);
				return;
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__R2:
				setR2(R2_EDEFAULT);
				return;
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__SWEEP_FLAG:
				setSweepFlag(SWEEP_FLAG_EDEFAULT);
				return;
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__X:
				setX(X_EDEFAULT);
				return;
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__Y:
				setY(Y_EDEFAULT);
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
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__ANGLE:
				return ANGLE_EDEFAULT == null ? angle != null : !ANGLE_EDEFAULT.equals(angle);
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__LARGE_ARC_FLAG:
				return LARGE_ARC_FLAG_EDEFAULT == null ? largeArcFlag != null : !LARGE_ARC_FLAG_EDEFAULT.equals(largeArcFlag);
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__R1:
				return R1_EDEFAULT == null ? r1 != null : !R1_EDEFAULT.equals(r1);
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__R2:
				return R2_EDEFAULT == null ? r2 != null : !R2_EDEFAULT.equals(r2);
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__SWEEP_FLAG:
				return SWEEP_FLAG_EDEFAULT == null ? sweepFlag != null : !SWEEP_FLAG_EDEFAULT.equals(sweepFlag);
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case Part2Package.ELLIPSE_ARC_CURVE_COMMAND__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
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
		result.append(", largeArcFlag: ");
		result.append(largeArcFlag);
		result.append(", r1: ");
		result.append(r1);
		result.append(", r2: ");
		result.append(r2);
		result.append(", sweepFlag: ");
		result.append(sweepFlag);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //EllipseArcCurveCommandImpl
