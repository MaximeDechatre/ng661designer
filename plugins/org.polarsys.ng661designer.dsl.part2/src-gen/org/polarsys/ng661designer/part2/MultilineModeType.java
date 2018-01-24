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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Multiline Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.ng661designer.part2.Part2Package#getMultilineModeType()
 * @model extendedMetaData="name='multilineMode_._type'"
 * @generated
 */
public enum MultilineModeType implements Enumerator {
	/**
	 * The '<em><b>Preserve Character</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESERVE_CHARACTER_VALUE
	 * @generated
	 * @ordered
	 */
	PRESERVE_CHARACTER(0, "preserveCharacter", "preserveCharacter"),

	/**
	 * The '<em><b>Preserve Character And Advance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESERVE_CHARACTER_AND_ADVANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESERVE_CHARACTER_AND_ADVANCE(1, "preserveCharacterAndAdvance", "preserveCharacterAndAdvance"),

	/**
	 * The '<em><b>Preserve Word</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESERVE_WORD_VALUE
	 * @generated
	 * @ordered
	 */
	PRESERVE_WORD(2, "preserveWord", "preserveWord"),

	/**
	 * The '<em><b>Preserve Word And Advance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESERVE_WORD_AND_ADVANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESERVE_WORD_AND_ADVANCE(3, "preserveWordAndAdvance", "preserveWordAndAdvance");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The '<em><b>Preserve Character</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preserve Character</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESERVE_CHARACTER
	 * @model name="preserveCharacter"
	 * @generated
	 * @ordered
	 */
	public static final int PRESERVE_CHARACTER_VALUE = 0;

	/**
	 * The '<em><b>Preserve Character And Advance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preserve Character And Advance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESERVE_CHARACTER_AND_ADVANCE
	 * @model name="preserveCharacterAndAdvance"
	 * @generated
	 * @ordered
	 */
	public static final int PRESERVE_CHARACTER_AND_ADVANCE_VALUE = 1;

	/**
	 * The '<em><b>Preserve Word</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preserve Word</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESERVE_WORD
	 * @model name="preserveWord"
	 * @generated
	 * @ordered
	 */
	public static final int PRESERVE_WORD_VALUE = 2;

	/**
	 * The '<em><b>Preserve Word And Advance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preserve Word And Advance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESERVE_WORD_AND_ADVANCE
	 * @model name="preserveWordAndAdvance"
	 * @generated
	 * @ordered
	 */
	public static final int PRESERVE_WORD_AND_ADVANCE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Multiline Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MultilineModeType[] VALUES_ARRAY =
		new MultilineModeType[] {
			PRESERVE_CHARACTER,
			PRESERVE_CHARACTER_AND_ADVANCE,
			PRESERVE_WORD,
			PRESERVE_WORD_AND_ADVANCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Multiline Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MultilineModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiline Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultilineModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultilineModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiline Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultilineModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultilineModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiline Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultilineModeType get(int value) {
		switch (value) {
			case PRESERVE_CHARACTER_VALUE: return PRESERVE_CHARACTER;
			case PRESERVE_CHARACTER_AND_ADVANCE_VALUE: return PRESERVE_CHARACTER_AND_ADVANCE;
			case PRESERVE_WORD_VALUE: return PRESERVE_WORD;
			case PRESERVE_WORD_AND_ADVANCE_VALUE: return PRESERVE_WORD_AND_ADVANCE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultilineModeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MultilineModeType
