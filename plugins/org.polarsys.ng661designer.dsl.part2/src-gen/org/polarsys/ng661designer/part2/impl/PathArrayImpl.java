/**
 * Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.part2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.ng661designer.part2.ClosePathCommand;
import org.polarsys.ng661designer.part2.CubicBezierCurveCommand;
import org.polarsys.ng661designer.part2.EllipseArcCurveCommand;
import org.polarsys.ng661designer.part2.LineToCommand;
import org.polarsys.ng661designer.part2.MoveToCommand;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.PathArray;
import org.polarsys.ng661designer.part2.RelativeClosePathCommand;
import org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand;
import org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand;
import org.polarsys.ng661designer.part2.RelativeLineToCommand;
import org.polarsys.ng661designer.part2.RelativeMoveToCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PathArrayImpl#getMoveToCommand <em>Move To Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PathArrayImpl#getClosePathCommand <em>Close Path Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PathArrayImpl#getLineToCommand <em>Line To Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PathArrayImpl#getCubicBezierCurveCommand <em>Cubic Bezier Curve Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PathArrayImpl#getEllipseArcCurveCommand <em>Ellipse Arc Curve Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PathArrayImpl#getRelativeMoveToCommand <em>Relative Move To Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PathArrayImpl#getRelativeLineToCommand <em>Relative Line To Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PathArrayImpl#getRelativeClosePathCommand <em>Relative Close Path Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PathArrayImpl#getRelativeCubicBezierCurveCommand <em>Relative Cubic Bezier Curve Command</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PathArrayImpl#getRelativeEllipseArcCurveCommand <em>Relative Ellipse Arc Curve Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathArrayImpl extends MinimalEObjectImpl.Container implements PathArray {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getMoveToCommand() <em>Move To Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveToCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<MoveToCommand> moveToCommand;

	/**
	 * The cached value of the '{@link #getClosePathCommand() <em>Close Path Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosePathCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<ClosePathCommand> closePathCommand;

	/**
	 * The cached value of the '{@link #getLineToCommand() <em>Line To Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineToCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<LineToCommand> lineToCommand;

	/**
	 * The cached value of the '{@link #getCubicBezierCurveCommand() <em>Cubic Bezier Curve Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubicBezierCurveCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<CubicBezierCurveCommand> cubicBezierCurveCommand;

	/**
	 * The cached value of the '{@link #getEllipseArcCurveCommand() <em>Ellipse Arc Curve Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEllipseArcCurveCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<EllipseArcCurveCommand> ellipseArcCurveCommand;

	/**
	 * The cached value of the '{@link #getRelativeMoveToCommand() <em>Relative Move To Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeMoveToCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativeMoveToCommand> relativeMoveToCommand;

	/**
	 * The cached value of the '{@link #getRelativeLineToCommand() <em>Relative Line To Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeLineToCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativeLineToCommand> relativeLineToCommand;

	/**
	 * The cached value of the '{@link #getRelativeClosePathCommand() <em>Relative Close Path Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeClosePathCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativeClosePathCommand> relativeClosePathCommand;

	/**
	 * The cached value of the '{@link #getRelativeCubicBezierCurveCommand() <em>Relative Cubic Bezier Curve Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeCubicBezierCurveCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativeCubicBezierCurveCommand> relativeCubicBezierCurveCommand;

	/**
	 * The cached value of the '{@link #getRelativeEllipseArcCurveCommand() <em>Relative Ellipse Arc Curve Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeEllipseArcCurveCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativeEllipseArcCurveCommand> relativeEllipseArcCurveCommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getPathArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MoveToCommand> getMoveToCommand() {
		if (moveToCommand == null) {
			moveToCommand = new EObjectContainmentEList<MoveToCommand>(MoveToCommand.class, this, Part2Package.PATH_ARRAY__MOVE_TO_COMMAND);
		}
		return moveToCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClosePathCommand> getClosePathCommand() {
		if (closePathCommand == null) {
			closePathCommand = new EObjectContainmentEList<ClosePathCommand>(ClosePathCommand.class, this, Part2Package.PATH_ARRAY__CLOSE_PATH_COMMAND);
		}
		return closePathCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineToCommand> getLineToCommand() {
		if (lineToCommand == null) {
			lineToCommand = new EObjectContainmentEList<LineToCommand>(LineToCommand.class, this, Part2Package.PATH_ARRAY__LINE_TO_COMMAND);
		}
		return lineToCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CubicBezierCurveCommand> getCubicBezierCurveCommand() {
		if (cubicBezierCurveCommand == null) {
			cubicBezierCurveCommand = new EObjectContainmentEList<CubicBezierCurveCommand>(CubicBezierCurveCommand.class, this, Part2Package.PATH_ARRAY__CUBIC_BEZIER_CURVE_COMMAND);
		}
		return cubicBezierCurveCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseArcCurveCommand> getEllipseArcCurveCommand() {
		if (ellipseArcCurveCommand == null) {
			ellipseArcCurveCommand = new EObjectContainmentEList<EllipseArcCurveCommand>(EllipseArcCurveCommand.class, this, Part2Package.PATH_ARRAY__ELLIPSE_ARC_CURVE_COMMAND);
		}
		return ellipseArcCurveCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativeMoveToCommand> getRelativeMoveToCommand() {
		if (relativeMoveToCommand == null) {
			relativeMoveToCommand = new EObjectContainmentEList<RelativeMoveToCommand>(RelativeMoveToCommand.class, this, Part2Package.PATH_ARRAY__RELATIVE_MOVE_TO_COMMAND);
		}
		return relativeMoveToCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativeLineToCommand> getRelativeLineToCommand() {
		if (relativeLineToCommand == null) {
			relativeLineToCommand = new EObjectContainmentEList<RelativeLineToCommand>(RelativeLineToCommand.class, this, Part2Package.PATH_ARRAY__RELATIVE_LINE_TO_COMMAND);
		}
		return relativeLineToCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativeClosePathCommand> getRelativeClosePathCommand() {
		if (relativeClosePathCommand == null) {
			relativeClosePathCommand = new EObjectContainmentEList<RelativeClosePathCommand>(RelativeClosePathCommand.class, this, Part2Package.PATH_ARRAY__RELATIVE_CLOSE_PATH_COMMAND);
		}
		return relativeClosePathCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativeCubicBezierCurveCommand> getRelativeCubicBezierCurveCommand() {
		if (relativeCubicBezierCurveCommand == null) {
			relativeCubicBezierCurveCommand = new EObjectContainmentEList<RelativeCubicBezierCurveCommand>(RelativeCubicBezierCurveCommand.class, this, Part2Package.PATH_ARRAY__RELATIVE_CUBIC_BEZIER_CURVE_COMMAND);
		}
		return relativeCubicBezierCurveCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativeEllipseArcCurveCommand> getRelativeEllipseArcCurveCommand() {
		if (relativeEllipseArcCurveCommand == null) {
			relativeEllipseArcCurveCommand = new EObjectContainmentEList<RelativeEllipseArcCurveCommand>(RelativeEllipseArcCurveCommand.class, this, Part2Package.PATH_ARRAY__RELATIVE_ELLIPSE_ARC_CURVE_COMMAND);
		}
		return relativeEllipseArcCurveCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.PATH_ARRAY__MOVE_TO_COMMAND:
				return ((InternalEList<?>)getMoveToCommand()).basicRemove(otherEnd, msgs);
			case Part2Package.PATH_ARRAY__CLOSE_PATH_COMMAND:
				return ((InternalEList<?>)getClosePathCommand()).basicRemove(otherEnd, msgs);
			case Part2Package.PATH_ARRAY__LINE_TO_COMMAND:
				return ((InternalEList<?>)getLineToCommand()).basicRemove(otherEnd, msgs);
			case Part2Package.PATH_ARRAY__CUBIC_BEZIER_CURVE_COMMAND:
				return ((InternalEList<?>)getCubicBezierCurveCommand()).basicRemove(otherEnd, msgs);
			case Part2Package.PATH_ARRAY__ELLIPSE_ARC_CURVE_COMMAND:
				return ((InternalEList<?>)getEllipseArcCurveCommand()).basicRemove(otherEnd, msgs);
			case Part2Package.PATH_ARRAY__RELATIVE_MOVE_TO_COMMAND:
				return ((InternalEList<?>)getRelativeMoveToCommand()).basicRemove(otherEnd, msgs);
			case Part2Package.PATH_ARRAY__RELATIVE_LINE_TO_COMMAND:
				return ((InternalEList<?>)getRelativeLineToCommand()).basicRemove(otherEnd, msgs);
			case Part2Package.PATH_ARRAY__RELATIVE_CLOSE_PATH_COMMAND:
				return ((InternalEList<?>)getRelativeClosePathCommand()).basicRemove(otherEnd, msgs);
			case Part2Package.PATH_ARRAY__RELATIVE_CUBIC_BEZIER_CURVE_COMMAND:
				return ((InternalEList<?>)getRelativeCubicBezierCurveCommand()).basicRemove(otherEnd, msgs);
			case Part2Package.PATH_ARRAY__RELATIVE_ELLIPSE_ARC_CURVE_COMMAND:
				return ((InternalEList<?>)getRelativeEllipseArcCurveCommand()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.PATH_ARRAY__MOVE_TO_COMMAND:
				return getMoveToCommand();
			case Part2Package.PATH_ARRAY__CLOSE_PATH_COMMAND:
				return getClosePathCommand();
			case Part2Package.PATH_ARRAY__LINE_TO_COMMAND:
				return getLineToCommand();
			case Part2Package.PATH_ARRAY__CUBIC_BEZIER_CURVE_COMMAND:
				return getCubicBezierCurveCommand();
			case Part2Package.PATH_ARRAY__ELLIPSE_ARC_CURVE_COMMAND:
				return getEllipseArcCurveCommand();
			case Part2Package.PATH_ARRAY__RELATIVE_MOVE_TO_COMMAND:
				return getRelativeMoveToCommand();
			case Part2Package.PATH_ARRAY__RELATIVE_LINE_TO_COMMAND:
				return getRelativeLineToCommand();
			case Part2Package.PATH_ARRAY__RELATIVE_CLOSE_PATH_COMMAND:
				return getRelativeClosePathCommand();
			case Part2Package.PATH_ARRAY__RELATIVE_CUBIC_BEZIER_CURVE_COMMAND:
				return getRelativeCubicBezierCurveCommand();
			case Part2Package.PATH_ARRAY__RELATIVE_ELLIPSE_ARC_CURVE_COMMAND:
				return getRelativeEllipseArcCurveCommand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Part2Package.PATH_ARRAY__MOVE_TO_COMMAND:
				getMoveToCommand().clear();
				getMoveToCommand().addAll((Collection<? extends MoveToCommand>)newValue);
				return;
			case Part2Package.PATH_ARRAY__CLOSE_PATH_COMMAND:
				getClosePathCommand().clear();
				getClosePathCommand().addAll((Collection<? extends ClosePathCommand>)newValue);
				return;
			case Part2Package.PATH_ARRAY__LINE_TO_COMMAND:
				getLineToCommand().clear();
				getLineToCommand().addAll((Collection<? extends LineToCommand>)newValue);
				return;
			case Part2Package.PATH_ARRAY__CUBIC_BEZIER_CURVE_COMMAND:
				getCubicBezierCurveCommand().clear();
				getCubicBezierCurveCommand().addAll((Collection<? extends CubicBezierCurveCommand>)newValue);
				return;
			case Part2Package.PATH_ARRAY__ELLIPSE_ARC_CURVE_COMMAND:
				getEllipseArcCurveCommand().clear();
				getEllipseArcCurveCommand().addAll((Collection<? extends EllipseArcCurveCommand>)newValue);
				return;
			case Part2Package.PATH_ARRAY__RELATIVE_MOVE_TO_COMMAND:
				getRelativeMoveToCommand().clear();
				getRelativeMoveToCommand().addAll((Collection<? extends RelativeMoveToCommand>)newValue);
				return;
			case Part2Package.PATH_ARRAY__RELATIVE_LINE_TO_COMMAND:
				getRelativeLineToCommand().clear();
				getRelativeLineToCommand().addAll((Collection<? extends RelativeLineToCommand>)newValue);
				return;
			case Part2Package.PATH_ARRAY__RELATIVE_CLOSE_PATH_COMMAND:
				getRelativeClosePathCommand().clear();
				getRelativeClosePathCommand().addAll((Collection<? extends RelativeClosePathCommand>)newValue);
				return;
			case Part2Package.PATH_ARRAY__RELATIVE_CUBIC_BEZIER_CURVE_COMMAND:
				getRelativeCubicBezierCurveCommand().clear();
				getRelativeCubicBezierCurveCommand().addAll((Collection<? extends RelativeCubicBezierCurveCommand>)newValue);
				return;
			case Part2Package.PATH_ARRAY__RELATIVE_ELLIPSE_ARC_CURVE_COMMAND:
				getRelativeEllipseArcCurveCommand().clear();
				getRelativeEllipseArcCurveCommand().addAll((Collection<? extends RelativeEllipseArcCurveCommand>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Part2Package.PATH_ARRAY__MOVE_TO_COMMAND:
				getMoveToCommand().clear();
				return;
			case Part2Package.PATH_ARRAY__CLOSE_PATH_COMMAND:
				getClosePathCommand().clear();
				return;
			case Part2Package.PATH_ARRAY__LINE_TO_COMMAND:
				getLineToCommand().clear();
				return;
			case Part2Package.PATH_ARRAY__CUBIC_BEZIER_CURVE_COMMAND:
				getCubicBezierCurveCommand().clear();
				return;
			case Part2Package.PATH_ARRAY__ELLIPSE_ARC_CURVE_COMMAND:
				getEllipseArcCurveCommand().clear();
				return;
			case Part2Package.PATH_ARRAY__RELATIVE_MOVE_TO_COMMAND:
				getRelativeMoveToCommand().clear();
				return;
			case Part2Package.PATH_ARRAY__RELATIVE_LINE_TO_COMMAND:
				getRelativeLineToCommand().clear();
				return;
			case Part2Package.PATH_ARRAY__RELATIVE_CLOSE_PATH_COMMAND:
				getRelativeClosePathCommand().clear();
				return;
			case Part2Package.PATH_ARRAY__RELATIVE_CUBIC_BEZIER_CURVE_COMMAND:
				getRelativeCubicBezierCurveCommand().clear();
				return;
			case Part2Package.PATH_ARRAY__RELATIVE_ELLIPSE_ARC_CURVE_COMMAND:
				getRelativeEllipseArcCurveCommand().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Part2Package.PATH_ARRAY__MOVE_TO_COMMAND:
				return moveToCommand != null && !moveToCommand.isEmpty();
			case Part2Package.PATH_ARRAY__CLOSE_PATH_COMMAND:
				return closePathCommand != null && !closePathCommand.isEmpty();
			case Part2Package.PATH_ARRAY__LINE_TO_COMMAND:
				return lineToCommand != null && !lineToCommand.isEmpty();
			case Part2Package.PATH_ARRAY__CUBIC_BEZIER_CURVE_COMMAND:
				return cubicBezierCurveCommand != null && !cubicBezierCurveCommand.isEmpty();
			case Part2Package.PATH_ARRAY__ELLIPSE_ARC_CURVE_COMMAND:
				return ellipseArcCurveCommand != null && !ellipseArcCurveCommand.isEmpty();
			case Part2Package.PATH_ARRAY__RELATIVE_MOVE_TO_COMMAND:
				return relativeMoveToCommand != null && !relativeMoveToCommand.isEmpty();
			case Part2Package.PATH_ARRAY__RELATIVE_LINE_TO_COMMAND:
				return relativeLineToCommand != null && !relativeLineToCommand.isEmpty();
			case Part2Package.PATH_ARRAY__RELATIVE_CLOSE_PATH_COMMAND:
				return relativeClosePathCommand != null && !relativeClosePathCommand.isEmpty();
			case Part2Package.PATH_ARRAY__RELATIVE_CUBIC_BEZIER_CURVE_COMMAND:
				return relativeCubicBezierCurveCommand != null && !relativeCubicBezierCurveCommand.isEmpty();
			case Part2Package.PATH_ARRAY__RELATIVE_ELLIPSE_ARC_CURVE_COMMAND:
				return relativeEllipseArcCurveCommand != null && !relativeEllipseArcCurveCommand.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PathArrayImpl
