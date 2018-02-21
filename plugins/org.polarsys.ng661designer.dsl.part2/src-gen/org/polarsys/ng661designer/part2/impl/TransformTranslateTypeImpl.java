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
import org.polarsys.ng661designer.part2.TransformTranslateType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform Translate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformTranslateTypeImpl#getTx <em>Tx</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformTranslateTypeImpl#getTy <em>Ty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformTranslateTypeImpl extends MinimalEObjectImpl.Container implements TransformTranslateType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getTx() <em>Tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx()
	 * @generated
	 * @ordered
	 */
	protected static final Object TX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTx() <em>Tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx()
	 * @generated
	 * @ordered
	 */
	protected Object tx = TX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTy() <em>Ty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTy()
	 * @generated
	 * @ordered
	 */
	protected static final Object TY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTy() <em>Ty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTy()
	 * @generated
	 * @ordered
	 */
	protected Object ty = TY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformTranslateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getTransformTranslateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTx() {
		return tx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTx(Object newTx) {
		Object oldTx = tx;
		tx = newTx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TRANSFORM_TRANSLATE_TYPE__TX, oldTx, tx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTy() {
		return ty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTy(Object newTy) {
		Object oldTy = ty;
		ty = newTy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TRANSFORM_TRANSLATE_TYPE__TY, oldTy, ty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.TRANSFORM_TRANSLATE_TYPE__TX:
				return getTx();
			case Part2Package.TRANSFORM_TRANSLATE_TYPE__TY:
				return getTy();
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
			case Part2Package.TRANSFORM_TRANSLATE_TYPE__TX:
				setTx(newValue);
				return;
			case Part2Package.TRANSFORM_TRANSLATE_TYPE__TY:
				setTy(newValue);
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
			case Part2Package.TRANSFORM_TRANSLATE_TYPE__TX:
				setTx(TX_EDEFAULT);
				return;
			case Part2Package.TRANSFORM_TRANSLATE_TYPE__TY:
				setTy(TY_EDEFAULT);
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
			case Part2Package.TRANSFORM_TRANSLATE_TYPE__TX:
				return TX_EDEFAULT == null ? tx != null : !TX_EDEFAULT.equals(tx);
			case Part2Package.TRANSFORM_TRANSLATE_TYPE__TY:
				return TY_EDEFAULT == null ? ty != null : !TY_EDEFAULT.equals(ty);
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
		result.append(" (tx: ");
		result.append(tx);
		result.append(", ty: ");
		result.append(ty);
		result.append(')');
		return result.toString();
	}

} //TransformTranslateTypeImpl
