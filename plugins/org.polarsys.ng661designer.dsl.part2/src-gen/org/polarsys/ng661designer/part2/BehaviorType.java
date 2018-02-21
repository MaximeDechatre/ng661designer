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

import org.w3._2005._07.scxml.ScxmlScxmlType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allows to instantiate components that have no representation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.BehaviorType#getScxml <em>Scxml</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.BehaviorType#getFunction <em>Function</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.BehaviorType#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getBehaviorType()
 * @model
 * @generated
 */
public interface BehaviorType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Scxml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scxml</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scxml</em>' containment reference.
	 * @see #setScxml(ScxmlScxmlType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getBehaviorType_Scxml()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scxml' namespace='##targetNamespace'"
	 * @generated
	 */
	ScxmlScxmlType getScxml();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.BehaviorType#getScxml <em>Scxml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scxml</em>' containment reference.
	 * @see #getScxml()
	 * @generated
	 */
	void setScxml(ScxmlScxmlType value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.FunctionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getBehaviorType_Function()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionType> getFunction();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.PrivatePropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getBehaviorType_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrivatePropertyType> getProperty();

} // BehaviorType
