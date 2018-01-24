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
 * A representation of the model object '<em><b>Transform Scale Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.TransformScaleType#getSx <em>Sx</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TransformScaleType#getSy <em>Sy</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getTransformScaleType()
 * @model
 * @generated
 */
public interface TransformScaleType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Sx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sx</em>' attribute.
	 * @see #setSx(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTransformScaleType_Sx()
	 * @model dataType="org.polarsys.ng661designer.part2.PositionType"
	 * @generated
	 */
	Object getSx();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.TransformScaleType#getSx <em>Sx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sx</em>' attribute.
	 * @see #getSx()
	 * @generated
	 */
	void setSx(Object value);

	/**
	 * Returns the value of the '<em><b>Sy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sy</em>' attribute.
	 * @see #setSy(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTransformScaleType_Sy()
	 * @model dataType="org.polarsys.ng661designer.part2.PositionType"
	 * @generated
	 */
	Object getSy();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.TransformScaleType#getSy <em>Sy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sy</em>' attribute.
	 * @see #getSy()
	 * @generated
	 */
	void setSy(Object value);

} // TransformScaleType
