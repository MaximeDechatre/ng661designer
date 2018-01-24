/**
 * Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.part2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.TransformType#getTransformMatrix <em>Transform Matrix</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TransformType#getTransformTranslate <em>Transform Translate</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TransformType#getTransformScale <em>Transform Scale</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TransformType#getTransformRotate <em>Transform Rotate</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TransformType#getTransformSkewX <em>Transform Skew X</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TransformType#getTransformSkewY <em>Transform Skew Y</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getTransformType()
 * @model
 * @generated
 */
public interface TransformType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Transform Matrix</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.TransformMatrixType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Matrix</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform Matrix</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTransformType_TransformMatrix()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformMatrixType> getTransformMatrix();

	/**
	 * Returns the value of the '<em><b>Transform Translate</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.TransformTranslateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Translate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform Translate</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTransformType_TransformTranslate()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformTranslateType> getTransformTranslate();

	/**
	 * Returns the value of the '<em><b>Transform Scale</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.TransformScaleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Scale</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform Scale</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTransformType_TransformScale()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformScaleType> getTransformScale();

	/**
	 * Returns the value of the '<em><b>Transform Rotate</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.TransformRotateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Rotate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform Rotate</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTransformType_TransformRotate()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformRotateType> getTransformRotate();

	/**
	 * Returns the value of the '<em><b>Transform Skew X</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.TransformSkewXType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Skew X</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform Skew X</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTransformType_TransformSkewX()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformSkewXType> getTransformSkewX();

	/**
	 * Returns the value of the '<em><b>Transform Skew Y</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.TransformSkewYType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Skew Y</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform Skew Y</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTransformType_TransformSkewY()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformSkewYType> getTransformSkewY();

} // TransformType
