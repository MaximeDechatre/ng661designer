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

import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.TransformMatrixType;
import org.polarsys.ng661designer.part2.TransformRotateType;
import org.polarsys.ng661designer.part2.TransformScaleType;
import org.polarsys.ng661designer.part2.TransformSkewXType;
import org.polarsys.ng661designer.part2.TransformSkewYType;
import org.polarsys.ng661designer.part2.TransformTranslateType;
import org.polarsys.ng661designer.part2.TransformType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformTypeImpl#getTransformMatrix <em>Transform Matrix</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformTypeImpl#getTransformTranslate <em>Transform Translate</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformTypeImpl#getTransformScale <em>Transform Scale</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformTypeImpl#getTransformRotate <em>Transform Rotate</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformTypeImpl#getTransformSkewX <em>Transform Skew X</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TransformTypeImpl#getTransformSkewY <em>Transform Skew Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformTypeImpl extends MinimalEObjectImpl.Container implements TransformType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getTransformMatrix() <em>Transform Matrix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformMatrix()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformMatrixType> transformMatrix;

	/**
	 * The cached value of the '{@link #getTransformTranslate() <em>Transform Translate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformTranslate()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformTranslateType> transformTranslate;

	/**
	 * The cached value of the '{@link #getTransformScale() <em>Transform Scale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformScale()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformScaleType> transformScale;

	/**
	 * The cached value of the '{@link #getTransformRotate() <em>Transform Rotate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformRotate()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformRotateType> transformRotate;

	/**
	 * The cached value of the '{@link #getTransformSkewX() <em>Transform Skew X</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformSkewX()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformSkewXType> transformSkewX;

	/**
	 * The cached value of the '{@link #getTransformSkewY() <em>Transform Skew Y</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformSkewY()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformSkewYType> transformSkewY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getTransformType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformMatrixType> getTransformMatrix() {
		if (transformMatrix == null) {
			transformMatrix = new EObjectContainmentEList<TransformMatrixType>(TransformMatrixType.class, this, Part2Package.TRANSFORM_TYPE__TRANSFORM_MATRIX);
		}
		return transformMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformTranslateType> getTransformTranslate() {
		if (transformTranslate == null) {
			transformTranslate = new EObjectContainmentEList<TransformTranslateType>(TransformTranslateType.class, this, Part2Package.TRANSFORM_TYPE__TRANSFORM_TRANSLATE);
		}
		return transformTranslate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformScaleType> getTransformScale() {
		if (transformScale == null) {
			transformScale = new EObjectContainmentEList<TransformScaleType>(TransformScaleType.class, this, Part2Package.TRANSFORM_TYPE__TRANSFORM_SCALE);
		}
		return transformScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformRotateType> getTransformRotate() {
		if (transformRotate == null) {
			transformRotate = new EObjectContainmentEList<TransformRotateType>(TransformRotateType.class, this, Part2Package.TRANSFORM_TYPE__TRANSFORM_ROTATE);
		}
		return transformRotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformSkewXType> getTransformSkewX() {
		if (transformSkewX == null) {
			transformSkewX = new EObjectContainmentEList<TransformSkewXType>(TransformSkewXType.class, this, Part2Package.TRANSFORM_TYPE__TRANSFORM_SKEW_X);
		}
		return transformSkewX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformSkewYType> getTransformSkewY() {
		if (transformSkewY == null) {
			transformSkewY = new EObjectContainmentEList<TransformSkewYType>(TransformSkewYType.class, this, Part2Package.TRANSFORM_TYPE__TRANSFORM_SKEW_Y);
		}
		return transformSkewY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_MATRIX:
				return ((InternalEList<?>)getTransformMatrix()).basicRemove(otherEnd, msgs);
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_TRANSLATE:
				return ((InternalEList<?>)getTransformTranslate()).basicRemove(otherEnd, msgs);
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_SCALE:
				return ((InternalEList<?>)getTransformScale()).basicRemove(otherEnd, msgs);
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_ROTATE:
				return ((InternalEList<?>)getTransformRotate()).basicRemove(otherEnd, msgs);
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_SKEW_X:
				return ((InternalEList<?>)getTransformSkewX()).basicRemove(otherEnd, msgs);
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_SKEW_Y:
				return ((InternalEList<?>)getTransformSkewY()).basicRemove(otherEnd, msgs);
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
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_MATRIX:
				return getTransformMatrix();
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_TRANSLATE:
				return getTransformTranslate();
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_SCALE:
				return getTransformScale();
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_ROTATE:
				return getTransformRotate();
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_SKEW_X:
				return getTransformSkewX();
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_SKEW_Y:
				return getTransformSkewY();
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
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_MATRIX:
				getTransformMatrix().clear();
				getTransformMatrix().addAll((Collection<? extends TransformMatrixType>)newValue);
				return;
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_TRANSLATE:
				getTransformTranslate().clear();
				getTransformTranslate().addAll((Collection<? extends TransformTranslateType>)newValue);
				return;
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_SCALE:
				getTransformScale().clear();
				getTransformScale().addAll((Collection<? extends TransformScaleType>)newValue);
				return;
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_ROTATE:
				getTransformRotate().clear();
				getTransformRotate().addAll((Collection<? extends TransformRotateType>)newValue);
				return;
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_SKEW_X:
				getTransformSkewX().clear();
				getTransformSkewX().addAll((Collection<? extends TransformSkewXType>)newValue);
				return;
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_SKEW_Y:
				getTransformSkewY().clear();
				getTransformSkewY().addAll((Collection<? extends TransformSkewYType>)newValue);
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
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_MATRIX:
				getTransformMatrix().clear();
				return;
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_TRANSLATE:
				getTransformTranslate().clear();
				return;
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_SCALE:
				getTransformScale().clear();
				return;
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_ROTATE:
				getTransformRotate().clear();
				return;
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_SKEW_X:
				getTransformSkewX().clear();
				return;
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_SKEW_Y:
				getTransformSkewY().clear();
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
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_MATRIX:
				return transformMatrix != null && !transformMatrix.isEmpty();
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_TRANSLATE:
				return transformTranslate != null && !transformTranslate.isEmpty();
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_SCALE:
				return transformScale != null && !transformScale.isEmpty();
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_ROTATE:
				return transformRotate != null && !transformRotate.isEmpty();
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_SKEW_X:
				return transformSkewX != null && !transformSkewX.isEmpty();
			case Part2Package.TRANSFORM_TYPE__TRANSFORM_SKEW_Y:
				return transformSkewY != null && !transformSkewY.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransformTypeImpl
