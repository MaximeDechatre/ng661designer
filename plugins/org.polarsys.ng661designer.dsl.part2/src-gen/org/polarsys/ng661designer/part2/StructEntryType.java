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
 * A representation of the model object '<em><b>Struct Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.StructEntryType#getField <em>Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructEntryType#getArrayField <em>Array Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructEntryType#getStructField <em>Struct Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructEntryType#getEnumField <em>Enum Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructEntryType#getUnionField <em>Union Field</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructEntryType#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getStructEntryType()
 * @model
 * @generated
 */
public interface StructEntryType extends EObject {
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructEntryType_Field()
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructEntryType_ArrayField()
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructEntryType_StructField()
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructEntryType_EnumField()
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructEntryType_UnionField()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnionFieldType> getUnionField();

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructEntryType_Index()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	Object getIndex();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.StructEntryType#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Object value);

} // StructEntryType
