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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getMaxStringLength <em>Max String Length</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getModality <em>Modality</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getPrivatePropertyType()
 * @model
 * @generated
 */
public interface PrivatePropertyType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Max String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for strings
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max String Length</em>' attribute.
	 * @see #setMaxStringLength(BigInteger)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPrivatePropertyType_MaxStringLength()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getMaxStringLength();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getMaxStringLength <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max String Length</em>' attribute.
	 * @see #getMaxStringLength()
	 * @generated
	 */
	void setMaxStringLength(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Modality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.ng661designer.part2.ModalityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.ModalityType
	 * @see #isSetModality()
	 * @see #unsetModality()
	 * @see #setModality(ModalityType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPrivatePropertyType_Modality()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	ModalityType getModality();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getModality <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.ModalityType
	 * @see #isSetModality()
	 * @see #unsetModality()
	 * @see #getModality()
	 * @generated
	 */
	void setModality(ModalityType value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getModality <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModality()
	 * @see #getModality()
	 * @see #setModality(ModalityType)
	 * @generated
	 */
	void unsetModality();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getModality <em>Modality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modality</em>' attribute is set.
	 * @see #unsetModality()
	 * @see #getModality()
	 * @see #setModality(ModalityType)
	 * @generated
	 */
	boolean isSetModality();

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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPrivatePropertyType_Name()
	 * @model dataType="org.polarsys.ng661designer.part2.NameType" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPrivatePropertyType_Type()
	 * @model dataType="org.polarsys.ng661designer.part2.TypeType" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPrivatePropertyType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // PrivatePropertyType
