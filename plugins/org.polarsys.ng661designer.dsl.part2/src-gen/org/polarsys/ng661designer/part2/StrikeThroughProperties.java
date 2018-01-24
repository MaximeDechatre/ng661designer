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
 * A representation of the model object '<em><b>Strike Through Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.StrikeThroughProperties#getActive <em>Active</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StrikeThroughProperties#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StrikeThroughProperties#getStrokeWidth <em>Stroke Width</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getStrikeThroughProperties()
 * @model
 * @generated
 */
public interface StrikeThroughProperties extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStrikeThroughProperties_Active()
	 * @model dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getActive();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.StrikeThroughProperties#getActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(Object value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStrikeThroughProperties_Distance()
	 * @model dataType="org.polarsys.ng661designer.part2.DistanceType"
	 * @generated
	 */
	Object getDistance();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.StrikeThroughProperties#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Object value);

	/**
	 * Returns the value of the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Width</em>' attribute.
	 * @see #setStrokeWidth(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStrikeThroughProperties_StrokeWidth()
	 * @model dataType="org.polarsys.ng661designer.part2.DistanceType"
	 * @generated
	 */
	Object getStrokeWidth();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.StrikeThroughProperties#getStrokeWidth <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Width</em>' attribute.
	 * @see #getStrokeWidth()
	 * @generated
	 */
	void setStrokeWidth(Object value);

} // StrikeThroughProperties
