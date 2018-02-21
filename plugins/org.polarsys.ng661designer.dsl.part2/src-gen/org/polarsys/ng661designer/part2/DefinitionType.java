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
 * A representation of the model object '<em><b>Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.DefinitionType#getImport <em>Import</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.DefinitionType#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.DefinitionType#getPropertyGroupDefinition <em>Property Group Definition</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getDefinitionType()
 * @model
 * @generated
 */
public interface DefinitionType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ImportType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getDefinitionType_Import()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportType> getImport();

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.DefinitionsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getDefinitionType_TypeDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefinitionsType> getTypeDefinition();

	/**
	 * Returns the value of the '<em><b>Property Group Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.DefinitionsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Group Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Group Definition</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getDefinitionType_PropertyGroupDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefinitionsType> getPropertyGroupDefinition();

} // DefinitionType
