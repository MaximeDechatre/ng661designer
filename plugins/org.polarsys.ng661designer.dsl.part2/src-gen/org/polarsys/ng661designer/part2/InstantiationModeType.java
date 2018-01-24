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
 * A representation of the literals of the enumeration '<em><b>Instantiation Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.ng661designer.part2.Part2Package#getInstantiationModeType()
 * @model extendedMetaData="name='InstantiationMode_._type'"
 * @generated
 */
public enum InstantiationModeType implements Enumerator {
	/**
	 * The '<em><b>Anonymous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANONYMOUS_VALUE
	 * @generated
	 * @ordered
	 */
	ANONYMOUS(0, "Anonymous", "Anonymous"),

	/**
	 * The '<em><b>Grouped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUPED_VALUE
	 * @generated
	 * @ordered
	 */
	GROUPED(1, "Grouped", "Grouped"),

	/**
	 * The '<em><b>Insert Children Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_CHILDREN_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	INSERT_CHILDREN_NODE(2, "InsertChildrenNode", "InsertChildrenNode");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The '<em><b>Anonymous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Anonymous</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANONYMOUS
	 * @model name="Anonymous"
	 * @generated
	 * @ordered
	 */
	public static final int ANONYMOUS_VALUE = 0;

	/**
	 * The '<em><b>Grouped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Grouped</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROUPED
	 * @model name="Grouped"
	 * @generated
	 * @ordered
	 */
	public static final int GROUPED_VALUE = 1;

	/**
	 * The '<em><b>Insert Children Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Insert Children Node</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSERT_CHILDREN_NODE
	 * @model name="InsertChildrenNode"
	 * @generated
	 * @ordered
	 */
	public static final int INSERT_CHILDREN_NODE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Instantiation Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InstantiationModeType[] VALUES_ARRAY =
		new InstantiationModeType[] {
			ANONYMOUS,
			GROUPED,
			INSERT_CHILDREN_NODE,
		};

	/**
	 * A public read-only list of all the '<em><b>Instantiation Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InstantiationModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Instantiation Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstantiationModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstantiationModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instantiation Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstantiationModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstantiationModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instantiation Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstantiationModeType get(int value) {
		switch (value) {
			case ANONYMOUS_VALUE: return ANONYMOUS;
			case GROUPED_VALUE: return GROUPED;
			case INSERT_CHILDREN_NODE_VALUE: return INSERT_CHILDREN_NODE;
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
	private InstantiationModeType(int value, String name, String literal) {
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
	
} //InstantiationModeType
