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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.ng661designer.part2.CirclePrimitive;
import org.polarsys.ng661designer.part2.ClipPathPrimitive;
import org.polarsys.ng661designer.part2.ClipRuleType;
import org.polarsys.ng661designer.part2.EllipsePrimitive;
import org.polarsys.ng661designer.part2.LinePrimitive;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.PathPrimitive;
import org.polarsys.ng661designer.part2.RectPrimitive;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clip Path Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ClipPathPrimitiveImpl#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ClipPathPrimitiveImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ClipPathPrimitiveImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ClipPathPrimitiveImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ClipPathPrimitiveImpl#getClosedPath <em>Closed Path</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ClipPathPrimitiveImpl#getClipRule <em>Clip Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClipPathPrimitiveImpl extends MinimalEObjectImpl.Container implements ClipPathPrimitive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getRectangle() <em>Rectangle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectangle()
	 * @generated
	 * @ordered
	 */
	protected EList<RectPrimitive> rectangle;

	/**
	 * The cached value of the '{@link #getCircle() <em>Circle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircle()
	 * @generated
	 * @ordered
	 */
	protected EList<CirclePrimitive> circle;

	/**
	 * The cached value of the '{@link #getEllipse() <em>Ellipse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEllipse()
	 * @generated
	 * @ordered
	 */
	protected EList<EllipsePrimitive> ellipse;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList<LinePrimitive> line;

	/**
	 * The cached value of the '{@link #getClosedPath() <em>Closed Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedPath()
	 * @generated
	 * @ordered
	 */
	protected EList<PathPrimitive> closedPath;

	/**
	 * The default value of the '{@link #getClipRule() <em>Clip Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipRule()
	 * @generated
	 * @ordered
	 */
	protected static final ClipRuleType CLIP_RULE_EDEFAULT = ClipRuleType.NONZERO;

	/**
	 * The cached value of the '{@link #getClipRule() <em>Clip Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipRule()
	 * @generated
	 * @ordered
	 */
	protected ClipRuleType clipRule = CLIP_RULE_EDEFAULT;

	/**
	 * This is true if the Clip Rule attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clipRuleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClipPathPrimitiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getClipPathPrimitive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectPrimitive> getRectangle() {
		if (rectangle == null) {
			rectangle = new EObjectContainmentEList<RectPrimitive>(RectPrimitive.class, this, Part2Package.CLIP_PATH_PRIMITIVE__RECTANGLE);
		}
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CirclePrimitive> getCircle() {
		if (circle == null) {
			circle = new EObjectContainmentEList<CirclePrimitive>(CirclePrimitive.class, this, Part2Package.CLIP_PATH_PRIMITIVE__CIRCLE);
		}
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipsePrimitive> getEllipse() {
		if (ellipse == null) {
			ellipse = new EObjectContainmentEList<EllipsePrimitive>(EllipsePrimitive.class, this, Part2Package.CLIP_PATH_PRIMITIVE__ELLIPSE);
		}
		return ellipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinePrimitive> getLine() {
		if (line == null) {
			line = new EObjectContainmentEList<LinePrimitive>(LinePrimitive.class, this, Part2Package.CLIP_PATH_PRIMITIVE__LINE);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathPrimitive> getClosedPath() {
		if (closedPath == null) {
			closedPath = new EObjectContainmentEList<PathPrimitive>(PathPrimitive.class, this, Part2Package.CLIP_PATH_PRIMITIVE__CLOSED_PATH);
		}
		return closedPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClipRuleType getClipRule() {
		return clipRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipRule(ClipRuleType newClipRule) {
		ClipRuleType oldClipRule = clipRule;
		clipRule = newClipRule == null ? CLIP_RULE_EDEFAULT : newClipRule;
		boolean oldClipRuleESet = clipRuleESet;
		clipRuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.CLIP_PATH_PRIMITIVE__CLIP_RULE, oldClipRule, clipRule, !oldClipRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClipRule() {
		ClipRuleType oldClipRule = clipRule;
		boolean oldClipRuleESet = clipRuleESet;
		clipRule = CLIP_RULE_EDEFAULT;
		clipRuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.CLIP_PATH_PRIMITIVE__CLIP_RULE, oldClipRule, CLIP_RULE_EDEFAULT, oldClipRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClipRule() {
		return clipRuleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.CLIP_PATH_PRIMITIVE__RECTANGLE:
				return ((InternalEList<?>)getRectangle()).basicRemove(otherEnd, msgs);
			case Part2Package.CLIP_PATH_PRIMITIVE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case Part2Package.CLIP_PATH_PRIMITIVE__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case Part2Package.CLIP_PATH_PRIMITIVE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case Part2Package.CLIP_PATH_PRIMITIVE__CLOSED_PATH:
				return ((InternalEList<?>)getClosedPath()).basicRemove(otherEnd, msgs);
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
			case Part2Package.CLIP_PATH_PRIMITIVE__RECTANGLE:
				return getRectangle();
			case Part2Package.CLIP_PATH_PRIMITIVE__CIRCLE:
				return getCircle();
			case Part2Package.CLIP_PATH_PRIMITIVE__ELLIPSE:
				return getEllipse();
			case Part2Package.CLIP_PATH_PRIMITIVE__LINE:
				return getLine();
			case Part2Package.CLIP_PATH_PRIMITIVE__CLOSED_PATH:
				return getClosedPath();
			case Part2Package.CLIP_PATH_PRIMITIVE__CLIP_RULE:
				return getClipRule();
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
			case Part2Package.CLIP_PATH_PRIMITIVE__RECTANGLE:
				getRectangle().clear();
				getRectangle().addAll((Collection<? extends RectPrimitive>)newValue);
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CirclePrimitive>)newValue);
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipsePrimitive>)newValue);
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LinePrimitive>)newValue);
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__CLOSED_PATH:
				getClosedPath().clear();
				getClosedPath().addAll((Collection<? extends PathPrimitive>)newValue);
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__CLIP_RULE:
				setClipRule((ClipRuleType)newValue);
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
			case Part2Package.CLIP_PATH_PRIMITIVE__RECTANGLE:
				getRectangle().clear();
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__CIRCLE:
				getCircle().clear();
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__ELLIPSE:
				getEllipse().clear();
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__LINE:
				getLine().clear();
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__CLOSED_PATH:
				getClosedPath().clear();
				return;
			case Part2Package.CLIP_PATH_PRIMITIVE__CLIP_RULE:
				unsetClipRule();
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
			case Part2Package.CLIP_PATH_PRIMITIVE__RECTANGLE:
				return rectangle != null && !rectangle.isEmpty();
			case Part2Package.CLIP_PATH_PRIMITIVE__CIRCLE:
				return circle != null && !circle.isEmpty();
			case Part2Package.CLIP_PATH_PRIMITIVE__ELLIPSE:
				return ellipse != null && !ellipse.isEmpty();
			case Part2Package.CLIP_PATH_PRIMITIVE__LINE:
				return line != null && !line.isEmpty();
			case Part2Package.CLIP_PATH_PRIMITIVE__CLOSED_PATH:
				return closedPath != null && !closedPath.isEmpty();
			case Part2Package.CLIP_PATH_PRIMITIVE__CLIP_RULE:
				return isSetClipRule();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (clipRule: ");
		if (clipRuleESet) result.append(clipRule); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ClipPathPrimitiveImpl
