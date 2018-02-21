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
 * A representation of the model object '<em><b>Path Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.PathArray#getMoveToCommand <em>Move To Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PathArray#getClosePathCommand <em>Close Path Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PathArray#getLineToCommand <em>Line To Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PathArray#getCubicBezierCurveCommand <em>Cubic Bezier Curve Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PathArray#getEllipseArcCurveCommand <em>Ellipse Arc Curve Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PathArray#getRelativeMoveToCommand <em>Relative Move To Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PathArray#getRelativeLineToCommand <em>Relative Line To Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PathArray#getRelativeClosePathCommand <em>Relative Close Path Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PathArray#getRelativeCubicBezierCurveCommand <em>Relative Cubic Bezier Curve Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PathArray#getRelativeEllipseArcCurveCommand <em>Relative Ellipse Arc Curve Command</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getPathArray()
 * @model
 * @generated
 */
public interface PathArray extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Move To Command</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.MoveToCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move To Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move To Command</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPathArray_MoveToCommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<MoveToCommand> getMoveToCommand();

	/**
	 * Returns the value of the '<em><b>Close Path Command</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ClosePathCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Close Path Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Path Command</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPathArray_ClosePathCommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClosePathCommand> getClosePathCommand();

	/**
	 * Returns the value of the '<em><b>Line To Command</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.LineToCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line To Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line To Command</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPathArray_LineToCommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<LineToCommand> getLineToCommand();

	/**
	 * Returns the value of the '<em><b>Cubic Bezier Curve Command</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.CubicBezierCurveCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cubic Bezier Curve Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cubic Bezier Curve Command</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPathArray_CubicBezierCurveCommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<CubicBezierCurveCommand> getCubicBezierCurveCommand();

	/**
	 * Returns the value of the '<em><b>Ellipse Arc Curve Command</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ellipse Arc Curve Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipse Arc Curve Command</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPathArray_EllipseArcCurveCommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<EllipseArcCurveCommand> getEllipseArcCurveCommand();

	/**
	 * Returns the value of the '<em><b>Relative Move To Command</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.RelativeMoveToCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Move To Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Move To Command</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPathArray_RelativeMoveToCommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelativeMoveToCommand> getRelativeMoveToCommand();

	/**
	 * Returns the value of the '<em><b>Relative Line To Command</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.RelativeLineToCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Line To Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Line To Command</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPathArray_RelativeLineToCommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelativeLineToCommand> getRelativeLineToCommand();

	/**
	 * Returns the value of the '<em><b>Relative Close Path Command</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.RelativeClosePathCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Close Path Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Close Path Command</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPathArray_RelativeClosePathCommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelativeClosePathCommand> getRelativeClosePathCommand();

	/**
	 * Returns the value of the '<em><b>Relative Cubic Bezier Curve Command</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Cubic Bezier Curve Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Cubic Bezier Curve Command</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPathArray_RelativeCubicBezierCurveCommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelativeCubicBezierCurveCommand> getRelativeCubicBezierCurveCommand();

	/**
	 * Returns the value of the '<em><b>Relative Ellipse Arc Curve Command</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Ellipse Arc Curve Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Ellipse Arc Curve Command</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPathArray_RelativeEllipseArcCurveCommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelativeEllipseArcCurveCommand> getRelativeEllipseArcCurveCommand();

} // PathArray
