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
 * A representation of the model object '<em><b>Clip Path Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.ClipPathPrimitive#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.ClipPathPrimitive#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.ClipPathPrimitive#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.ClipPathPrimitive#getLine <em>Line</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.ClipPathPrimitive#getClosedPath <em>Closed Path</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.ClipPathPrimitive#getClipRule <em>Clip Rule</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getClipPathPrimitive()
 * @model
 * @generated
 */
public interface ClipPathPrimitive extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Rectangle</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.RectPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rectangle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectangle</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getClipPathPrimitive_Rectangle()
	 * @model containment="true"
	 * @generated
	 */
	EList<RectPrimitive> getRectangle();

	/**
	 * Returns the value of the '<em><b>Circle</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.CirclePrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circle</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getClipPathPrimitive_Circle()
	 * @model containment="true"
	 * @generated
	 */
	EList<CirclePrimitive> getCircle();

	/**
	 * Returns the value of the '<em><b>Ellipse</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.EllipsePrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ellipse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipse</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getClipPathPrimitive_Ellipse()
	 * @model containment="true"
	 * @generated
	 */
	EList<EllipsePrimitive> getEllipse();

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.LinePrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getClipPathPrimitive_Line()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinePrimitive> getLine();

	/**
	 * Returns the value of the '<em><b>Closed Path</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.PathPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed Path</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed Path</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getClipPathPrimitive_ClosedPath()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathPrimitive> getClosedPath();

	/**
	 * Returns the value of the '<em><b>Clip Rule</b></em>' attribute.
	 * The default value is <code>"nonzero"</code>.
	 * The literals are from the enumeration {@link org.polarsys.ng661designer.part2.ClipRuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip Rule</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.ClipRuleType
	 * @see #isSetClipRule()
	 * @see #unsetClipRule()
	 * @see #setClipRule(ClipRuleType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getClipPathPrimitive_ClipRule()
	 * @model default="nonzero" unsettable="true"
	 * @generated
	 */
	ClipRuleType getClipRule();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.ClipPathPrimitive#getClipRule <em>Clip Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip Rule</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.ClipRuleType
	 * @see #isSetClipRule()
	 * @see #unsetClipRule()
	 * @see #getClipRule()
	 * @generated
	 */
	void setClipRule(ClipRuleType value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.ClipPathPrimitive#getClipRule <em>Clip Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClipRule()
	 * @see #getClipRule()
	 * @see #setClipRule(ClipRuleType)
	 * @generated
	 */
	void unsetClipRule();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.ClipPathPrimitive#getClipRule <em>Clip Rule</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clip Rule</em>' attribute is set.
	 * @see #unsetClipRule()
	 * @see #getClipRule()
	 * @see #setClipRule(ClipRuleType)
	 * @generated
	 */
	boolean isSetClipRule();

} // ClipPathPrimitive
