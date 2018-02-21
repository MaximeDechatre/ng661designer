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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other Array Entries Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherEntries <em>Other Entries</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getArrayEntry <em>Array Entry</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherArrayEntries <em>Other Array Entries</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getStructEntry <em>Struct Entry</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherStructEntries <em>Other Struct Entries</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getUnionEntry <em>Union Entry</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherUnionEntries <em>Other Union Entries</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getMaxNumberOfEntries <em>Max Number Of Entries</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getNumberOfEntries <em>Number Of Entries</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getOtherArrayEntriesType()
 * @model
 * @generated
 */
public interface OtherArrayEntriesType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.EntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getOtherArrayEntriesType_Entry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntryType> getEntry();

	/**
	 * Returns the value of the '<em><b>Other Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Entries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Entries</em>' containment reference.
	 * @see #setOtherEntries(OtherEntriesType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getOtherArrayEntriesType_OtherEntries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OtherEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	OtherEntriesType getOtherEntries();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherEntries <em>Other Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Entries</em>' containment reference.
	 * @see #getOtherEntries()
	 * @generated
	 */
	void setOtherEntries(OtherEntriesType value);

	/**
	 * Returns the value of the '<em><b>Array Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ArrayEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Entry</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getOtherArrayEntriesType_ArrayEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ArrayEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArrayEntryType> getArrayEntry();

	/**
	 * Returns the value of the '<em><b>Other Array Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Array Entries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Array Entries</em>' containment reference.
	 * @see #setOtherArrayEntries(OtherArrayEntriesType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getOtherArrayEntriesType_OtherArrayEntries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OtherArrayEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	OtherArrayEntriesType getOtherArrayEntries();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherArrayEntries <em>Other Array Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Array Entries</em>' containment reference.
	 * @see #getOtherArrayEntries()
	 * @generated
	 */
	void setOtherArrayEntries(OtherArrayEntriesType value);

	/**
	 * Returns the value of the '<em><b>Struct Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.StructEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Entry</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getOtherArrayEntriesType_StructEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StructEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructEntryType> getStructEntry();

	/**
	 * Returns the value of the '<em><b>Other Struct Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Struct Entries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Struct Entries</em>' containment reference.
	 * @see #setOtherStructEntries(OtherStructEntriesType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getOtherArrayEntriesType_OtherStructEntries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OtherStructEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	OtherStructEntriesType getOtherStructEntries();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherStructEntries <em>Other Struct Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Struct Entries</em>' containment reference.
	 * @see #getOtherStructEntries()
	 * @generated
	 */
	void setOtherStructEntries(OtherStructEntriesType value);

	/**
	 * Returns the value of the '<em><b>Union Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.UnionEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union Entry</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getOtherArrayEntriesType_UnionEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UnionEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnionEntryType> getUnionEntry();

	/**
	 * Returns the value of the '<em><b>Other Union Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Union Entries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Union Entries</em>' containment reference.
	 * @see #setOtherUnionEntries(OtherUnionEntriesType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getOtherArrayEntriesType_OtherUnionEntries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OtherUnionEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	OtherUnionEntriesType getOtherUnionEntries();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherUnionEntries <em>Other Union Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Union Entries</em>' containment reference.
	 * @see #getOtherUnionEntries()
	 * @generated
	 */
	void setOtherUnionEntries(OtherUnionEntriesType value);

	/**
	 * Returns the value of the '<em><b>Max Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Number Of Entries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Number Of Entries</em>' attribute.
	 * @see #setMaxNumberOfEntries(BigInteger)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getOtherArrayEntriesType_MaxNumberOfEntries()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 * @generated
	 */
	BigInteger getMaxNumberOfEntries();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getMaxNumberOfEntries <em>Max Number Of Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Entries</em>' attribute.
	 * @see #getMaxNumberOfEntries()
	 * @generated
	 */
	void setMaxNumberOfEntries(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Entries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Entries</em>' attribute.
	 * @see #setNumberOfEntries(BigInteger)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getOtherArrayEntriesType_NumberOfEntries()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 * @generated
	 */
	BigInteger getNumberOfEntries();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getNumberOfEntries <em>Number Of Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Entries</em>' attribute.
	 * @see #getNumberOfEntries()
	 * @generated
	 */
	void setNumberOfEntries(BigInteger value);

} // OtherArrayEntriesType
