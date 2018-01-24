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
 * A representation of the model object '<em><b>Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.DefinitionsType#getStructDefinition <em>Struct Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.DefinitionsType#getEnumDefinition <em>Enum Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.DefinitionsType#getArrayDefinition <em>Array Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.DefinitionsType#getUnionDefinition <em>Union Definition</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getDefinitionsType()
 * @model
 * @generated
 */
public interface DefinitionsType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Struct Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.StructDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Definition</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getDefinitionsType_StructDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructDefinitionType> getStructDefinition();

	/**
	 * Returns the value of the '<em><b>Enum Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.EnumDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Definition</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getDefinitionsType_EnumDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumDefinitionType> getEnumDefinition();

	/**
	 * Returns the value of the '<em><b>Array Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ArrayDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Definition</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getDefinitionsType_ArrayDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayDefinitionType> getArrayDefinition();

	/**
	 * Returns the value of the '<em><b>Union Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.UnionDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union Definition</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getDefinitionsType_UnionDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnionDefinitionType> getUnionDefinition();

} // DefinitionsType
