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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ellipse Arc Curve Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getLargeArcFlag <em>Large Arc Flag</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getR1 <em>R1</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getR2 <em>R2</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getSweepFlag <em>Sweep Flag</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getX <em>X</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getEllipseArcCurveCommand()
 * @model
 * @generated
 */
public interface EllipseArcCurveCommand extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getEllipseArcCurveCommand_Angle()
	 * @model dataType="org.polarsys.ng661designer.part2.AngleType"
	 * @generated
	 */
	Object getAngle();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Object value);

	/**
	 * Returns the value of the '<em><b>Large Arc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Large Arc Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Large Arc Flag</em>' attribute.
	 * @see #setLargeArcFlag(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getEllipseArcCurveCommand_LargeArcFlag()
	 * @model dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getLargeArcFlag();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getLargeArcFlag <em>Large Arc Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Large Arc Flag</em>' attribute.
	 * @see #getLargeArcFlag()
	 * @generated
	 */
	void setLargeArcFlag(Object value);

	/**
	 * Returns the value of the '<em><b>R1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R1</em>' attribute.
	 * @see #setR1(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getEllipseArcCurveCommand_R1()
	 * @model dataType="org.polarsys.ng661designer.part2.DistanceType"
	 * @generated
	 */
	Object getR1();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getR1 <em>R1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R1</em>' attribute.
	 * @see #getR1()
	 * @generated
	 */
	void setR1(Object value);

	/**
	 * Returns the value of the '<em><b>R2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R2</em>' attribute.
	 * @see #setR2(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getEllipseArcCurveCommand_R2()
	 * @model dataType="org.polarsys.ng661designer.part2.DistanceType"
	 * @generated
	 */
	Object getR2();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getR2 <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R2</em>' attribute.
	 * @see #getR2()
	 * @generated
	 */
	void setR2(Object value);

	/**
	 * Returns the value of the '<em><b>Sweep Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sweep Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sweep Flag</em>' attribute.
	 * @see #setSweepFlag(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getEllipseArcCurveCommand_SweepFlag()
	 * @model dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getSweepFlag();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getSweepFlag <em>Sweep Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sweep Flag</em>' attribute.
	 * @see #getSweepFlag()
	 * @generated
	 */
	void setSweepFlag(Object value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getEllipseArcCurveCommand_X()
	 * @model dataType="org.polarsys.ng661designer.part2.PositionType"
	 * @generated
	 */
	Object getX();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Object value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getEllipseArcCurveCommand_Y()
	 * @model dataType="org.polarsys.ng661designer.part2.PositionType"
	 * @generated
	 */
	Object getY();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(Object value);

} // EllipseArcCurveCommand
