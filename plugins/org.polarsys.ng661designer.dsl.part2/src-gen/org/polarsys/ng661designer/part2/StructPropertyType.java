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
 * A representation of the model object '<em><b>Struct Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.StructPropertyType#getField <em>Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructPropertyType#getArrayField <em>Array Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructPropertyType#getStructField <em>Struct Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructPropertyType#getEnumField <em>Enum Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructPropertyType#getUnionField <em>Union Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructPropertyType#getModality <em>Modality</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructPropertyType#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructPropertyType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getStructPropertyType()
 * @model
 * @generated
 */
public interface StructPropertyType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.FieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructPropertyType_Field()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldType> getField();

	/**
	 * Returns the value of the '<em><b>Array Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ArrayFieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Field</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructPropertyType_ArrayField()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayFieldType> getArrayField();

	/**
	 * Returns the value of the '<em><b>Struct Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.StructFieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Field</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructPropertyType_StructField()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructFieldType> getStructField();

	/**
	 * Returns the value of the '<em><b>Enum Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.FieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Field</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructPropertyType_EnumField()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldType> getEnumField();

	/**
	 * Returns the value of the '<em><b>Union Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.UnionFieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union Field</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructPropertyType_UnionField()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnionFieldType> getUnionField();

	/**
	 * Returns the value of the '<em><b>Modality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.ng661designer.part2.ModalityType2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.ModalityType2
	 * @see #isSetModality()
	 * @see #unsetModality()
	 * @see #setModality(ModalityType2)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructPropertyType_Modality()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	ModalityType2 getModality();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.StructPropertyType#getModality <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.ModalityType2
	 * @see #isSetModality()
	 * @see #unsetModality()
	 * @see #getModality()
	 * @generated
	 */
	void setModality(ModalityType2 value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.StructPropertyType#getModality <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModality()
	 * @see #getModality()
	 * @see #setModality(ModalityType2)
	 * @generated
	 */
	void unsetModality();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.StructPropertyType#getModality <em>Modality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modality</em>' attribute is set.
	 * @see #unsetModality()
	 * @see #getModality()
	 * @see #setModality(ModalityType2)
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructPropertyType_Name()
	 * @model dataType="org.polarsys.ng661designer.part2.NameType" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.StructPropertyType#getName <em>Name</em>}' attribute.
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructPropertyType_Type()
	 * @model dataType="org.polarsys.ng661designer.part2.TypeType" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.StructPropertyType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // StructPropertyType
