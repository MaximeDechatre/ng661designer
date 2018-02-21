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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform Translate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.TransformTranslateType#getTx <em>Tx</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TransformTranslateType#getTy <em>Ty</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getTransformTranslateType()
 * @model
 * @generated
 */
public interface TransformTranslateType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx</em>' attribute.
	 * @see #setTx(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTransformTranslateType_Tx()
	 * @model dataType="org.polarsys.ng661designer.part2.PositionType"
	 * @generated
	 */
	Object getTx();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.TransformTranslateType#getTx <em>Tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx</em>' attribute.
	 * @see #getTx()
	 * @generated
	 */
	void setTx(Object value);

	/**
	 * Returns the value of the '<em><b>Ty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ty</em>' attribute.
	 * @see #setTy(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTransformTranslateType_Ty()
	 * @model dataType="org.polarsys.ng661designer.part2.PositionType"
	 * @generated
	 */
	Object getTy();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.TransformTranslateType#getTy <em>Ty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ty</em>' attribute.
	 * @see #getTy()
	 * @generated
	 */
	void setTy(Object value);

} // TransformTranslateType
