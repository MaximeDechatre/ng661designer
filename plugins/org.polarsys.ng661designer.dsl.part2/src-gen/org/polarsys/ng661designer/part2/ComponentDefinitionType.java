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
 * A representation of the model object '<em><b>Component Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.ComponentDefinitionType#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.ComponentDefinitionType#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.ComponentDefinitionType#getTree <em>Tree</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.ComponentDefinitionType#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.ComponentDefinitionType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getComponentDefinitionType()
 * @model
 * @generated
 */
public interface ComponentDefinitionType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(DefinitionType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getComponentDefinitionType_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Definition' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinitionType getDefinition();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.ComponentDefinitionType#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(DefinitionType value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(InterfaceType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getComponentDefinitionType_Interface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Interface' namespace='##targetNamespace'"
	 * @generated
	 */
	InterfaceType getInterface();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.ComponentDefinitionType#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(InterfaceType value);

	/**
	 * Returns the value of the '<em><b>Tree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree</em>' containment reference.
	 * @see #setTree(TreeType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getComponentDefinitionType_Tree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Tree' namespace='##targetNamespace'"
	 * @generated
	 */
	TreeType getTree();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.ComponentDefinitionType#getTree <em>Tree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree</em>' containment reference.
	 * @see #getTree()
	 * @generated
	 */
	void setTree(TreeType value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference.
	 * @see #setBehavior(BehaviorType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getComponentDefinitionType_Behavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Behavior' namespace='##targetNamespace'"
	 * @generated
	 */
	BehaviorType getBehavior();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.ComponentDefinitionType#getBehavior <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' containment reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(BehaviorType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getComponentDefinitionType_Name()
	 * @model dataType="org.polarsys.ng661designer.part2.NameType" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.ComponentDefinitionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ComponentDefinitionType
