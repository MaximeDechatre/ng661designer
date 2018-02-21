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

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.ArrayDefinitionType#getEntryType <em>Entry Type</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.ArrayDefinitionType#getMaxStringLength <em>Max String Length</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getArrayDefinitionType()
 * @model
 * @generated
 */
public interface ArrayDefinitionType extends TypeDefinitionAbstractType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Entry Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Type</em>' attribute.
	 * @see #setEntryType(String)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getArrayDefinitionType_EntryType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getEntryType();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.ArrayDefinitionType#getEntryType <em>Entry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Type</em>' attribute.
	 * @see #getEntryType()
	 * @generated
	 */
	void setEntryType(String value);

	/**
	 * Returns the value of the '<em><b>Max String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for strings
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max String Length</em>' attribute.
	 * @see #setMaxStringLength(BigInteger)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getArrayDefinitionType_MaxStringLength()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 * @generated
	 */
	BigInteger getMaxStringLength();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.ArrayDefinitionType#getMaxStringLength <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max String Length</em>' attribute.
	 * @see #getMaxStringLength()
	 * @generated
	 */
	void setMaxStringLength(BigInteger value);

} // ArrayDefinitionType
