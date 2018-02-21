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
 * A representation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.InterfaceType#getImport <em>Import</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.InterfaceType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.InterfaceType#getArrayProperty <em>Array Property</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.InterfaceType#getStructProperty <em>Struct Property</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.InterfaceType#getEnumProperty <em>Enum Property</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.InterfaceType#getUnionProperty <em>Union Property</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.InterfaceType#getEvent <em>Event</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.InterfaceType#getArrayEvent <em>Array Event</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.InterfaceType#getStructEvent <em>Struct Event</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.InterfaceType#getEnumEvent <em>Enum Event</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.InterfaceType#getUnionEvent <em>Union Event</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.InterfaceType#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.InterfaceType#getPublicFunction <em>Public Function</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getInterfaceType()
 * @model
 * @generated
 */
public interface InterfaceType extends EObject {
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getInterfaceType_Import()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportType> getImport();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getInterfaceType_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyType> getProperty();

	/**
	 * Returns the value of the '<em><b>Array Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ArrayPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Property</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getInterfaceType_ArrayProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayPropertyType> getArrayProperty();

	/**
	 * Returns the value of the '<em><b>Struct Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.StructPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Property</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getInterfaceType_StructProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructPropertyType> getStructProperty();

	/**
	 * Returns the value of the '<em><b>Enum Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Property</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getInterfaceType_EnumProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyType> getEnumProperty();

	/**
	 * Returns the value of the '<em><b>Union Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.UnionPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union Property</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getInterfaceType_UnionProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnionPropertyType> getUnionProperty();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getInterfaceType_Event()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventType> getEvent();

	/**
	 * Returns the value of the '<em><b>Array Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ArrayEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Event</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getInterfaceType_ArrayEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayEventType> getArrayEvent();

	/**
	 * Returns the value of the '<em><b>Struct Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.StructEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Event</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getInterfaceType_StructEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructEventType> getStructEvent();

	/**
	 * Returns the value of the '<em><b>Enum Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Event</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getInterfaceType_EnumEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventType> getEnumEvent();

	/**
	 * Returns the value of the '<em><b>Union Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.UnionEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union Event</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getInterfaceType_UnionEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnionEventType> getUnionEvent();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.OperationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getInterfaceType_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationType> getOperation();

	/**
	 * Returns the value of the '<em><b>Public Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.FunctionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Function</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getInterfaceType_PublicFunction()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionType> getPublicFunction();

} // InterfaceType
