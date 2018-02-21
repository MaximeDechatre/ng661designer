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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.StructDefinitionType#getFieldDefinition <em>Field Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructDefinitionType#getStructFieldDefinition <em>Struct Field Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructDefinitionType#getArrayFieldDefinition <em>Array Field Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructDefinitionType#getEnumFieldDefinition <em>Enum Field Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.StructDefinitionType#getUnionFieldDefinition <em>Union Field Definition</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getStructDefinitionType()
 * @model
 * @generated
 */
public interface StructDefinitionType extends TypeDefinitionAbstractType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Field Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.FieldDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Definition</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructDefinitionType_FieldDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldDefinitionType> getFieldDefinition();

	/**
	 * Returns the value of the '<em><b>Struct Field Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.FieldDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Field Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Field Definition</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructDefinitionType_StructFieldDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldDefinitionType> getStructFieldDefinition();

	/**
	 * Returns the value of the '<em><b>Array Field Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ArrayFieldDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Field Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Field Definition</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructDefinitionType_ArrayFieldDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayFieldDefinitionType> getArrayFieldDefinition();

	/**
	 * Returns the value of the '<em><b>Enum Field Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.FieldDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Field Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Field Definition</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructDefinitionType_EnumFieldDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldDefinitionType> getEnumFieldDefinition();

	/**
	 * Returns the value of the '<em><b>Union Field Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.FieldDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Field Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union Field Definition</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getStructDefinitionType_UnionFieldDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldDefinitionType> getUnionFieldDefinition();

} // StructDefinitionType
