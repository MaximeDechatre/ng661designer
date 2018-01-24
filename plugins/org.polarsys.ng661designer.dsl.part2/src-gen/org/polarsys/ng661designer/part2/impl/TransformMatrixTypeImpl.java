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
import org.polarsys.ng661designer.part2.TransformMatrixType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform Matrix Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformMatrixTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformMatrixTypeImpl#getB <em>B</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformMatrixTypeImpl#getC <em>C</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformMatrixTypeImpl#getD <em>D</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformMatrixTypeImpl#getE <em>E</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformMatrixTypeImpl#getF <em>F</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformMatrixTypeImpl extends MinimalEObjectImpl.Container implements TransformMatrixType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected static final Object A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected Object a = A_EDEFAULT;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final Object B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected Object b = B_EDEFAULT;

	/**
	 * The default value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected static final Object C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected Object c = C_EDEFAULT;

	/**
	 * The default value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected static final Object D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected Object d = D_EDEFAULT;

	/**
	 * The default value of the '{@link #getE() <em>E</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected static final Object E_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getE() <em>E</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected Object e = E_EDEFAULT;

	/**
	 * The default value of the '{@link #getF() <em>F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF()
	 * @generated
	 * @ordered
	 */
	protected static final Object F_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getF() <em>F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF()
	 * @generated
	 * @ordered
	 */
	protected Object f = F_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformMatrixTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getTransformMatrixType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(Object newA) {
		Object oldA = a;
		a = newA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TRANSFORM_MATRIX_TYPE__A, oldA, a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(Object newB) {
		Object oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TRANSFORM_MATRIX_TYPE__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getC() {
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC(Object newC) {
		Object oldC = c;
		c = newC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TRANSFORM_MATRIX_TYPE__C, oldC, c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getD() {
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD(Object newD) {
		Object oldD = d;
		d = newD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TRANSFORM_MATRIX_TYPE__D, oldD, d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getE() {
		return e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE(Object newE) {
		Object oldE = e;
		e = newE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TRANSFORM_MATRIX_TYPE__E, oldE, e));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getF() {
		return f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF(Object newF) {
		Object oldF = f;
		f = newF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TRANSFORM_MATRIX_TYPE__F, oldF, f));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.TRANSFORM_MATRIX_TYPE__A:
				return getA();
			case Part2Package.TRANSFORM_MATRIX_TYPE__B:
				return getB();
			case Part2Package.TRANSFORM_MATRIX_TYPE__C:
				return getC();
			case Part2Package.TRANSFORM_MATRIX_TYPE__D:
				return getD();
			case Part2Package.TRANSFORM_MATRIX_TYPE__E:
				return getE();
			case Part2Package.TRANSFORM_MATRIX_TYPE__F:
				return getF();
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
			case Part2Package.TRANSFORM_MATRIX_TYPE__A:
				setA(newValue);
				return;
			case Part2Package.TRANSFORM_MATRIX_TYPE__B:
				setB(newValue);
				return;
			case Part2Package.TRANSFORM_MATRIX_TYPE__C:
				setC(newValue);
				return;
			case Part2Package.TRANSFORM_MATRIX_TYPE__D:
				setD(newValue);
				return;
			case Part2Package.TRANSFORM_MATRIX_TYPE__E:
				setE(newValue);
				return;
			case Part2Package.TRANSFORM_MATRIX_TYPE__F:
				setF(newValue);
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
			case Part2Package.TRANSFORM_MATRIX_TYPE__A:
				setA(A_EDEFAULT);
				return;
			case Part2Package.TRANSFORM_MATRIX_TYPE__B:
				setB(B_EDEFAULT);
				return;
			case Part2Package.TRANSFORM_MATRIX_TYPE__C:
				setC(C_EDEFAULT);
				return;
			case Part2Package.TRANSFORM_MATRIX_TYPE__D:
				setD(D_EDEFAULT);
				return;
			case Part2Package.TRANSFORM_MATRIX_TYPE__E:
				setE(E_EDEFAULT);
				return;
			case Part2Package.TRANSFORM_MATRIX_TYPE__F:
				setF(F_EDEFAULT);
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
			case Part2Package.TRANSFORM_MATRIX_TYPE__A:
				return A_EDEFAULT == null ? a != null : !A_EDEFAULT.equals(a);
			case Part2Package.TRANSFORM_MATRIX_TYPE__B:
				return B_EDEFAULT == null ? b != null : !B_EDEFAULT.equals(b);
			case Part2Package.TRANSFORM_MATRIX_TYPE__C:
				return C_EDEFAULT == null ? c != null : !C_EDEFAULT.equals(c);
			case Part2Package.TRANSFORM_MATRIX_TYPE__D:
				return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
			case Part2Package.TRANSFORM_MATRIX_TYPE__E:
				return E_EDEFAULT == null ? e != null : !E_EDEFAULT.equals(e);
			case Part2Package.TRANSFORM_MATRIX_TYPE__F:
				return F_EDEFAULT == null ? f != null : !F_EDEFAULT.equals(f);
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
		result.append(" (a: ");
		result.append(a);
		result.append(", b: ");
		result.append(b);
		result.append(", c: ");
		result.append(c);
		result.append(", d: ");
		result.append(d);
		result.append(", e: ");
		result.append(e);
		result.append(", f: ");
		result.append(f);
		result.append(')');
		return result.toString();
	}

} //TransformMatrixTypeImpl
