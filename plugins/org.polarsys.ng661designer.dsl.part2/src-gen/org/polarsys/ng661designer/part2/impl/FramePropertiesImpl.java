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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.polarsys.ng661designer.part2.FrameProperties;
import org.polarsys.ng661designer.part2.Part2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.FramePropertiesImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.FramePropertiesImpl#getAscenderMargin <em>Ascender Margin</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.FramePropertiesImpl#getDescenderMargin <em>Descender Margin</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.FramePropertiesImpl#getEndMargin <em>End Margin</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.FramePropertiesImpl#getStartMargin <em>Start Margin</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.FramePropertiesImpl#getStrokeWidth <em>Stroke Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FramePropertiesImpl extends MinimalEObjectImpl.Container implements FrameProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected static final Object ACTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected Object active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAscenderMargin() <em>Ascender Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAscenderMargin()
	 * @generated
	 * @ordered
	 */
	protected static final Object ASCENDER_MARGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAscenderMargin() <em>Ascender Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAscenderMargin()
	 * @generated
	 * @ordered
	 */
	protected Object ascenderMargin = ASCENDER_MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescenderMargin() <em>Descender Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescenderMargin()
	 * @generated
	 * @ordered
	 */
	protected static final Object DESCENDER_MARGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescenderMargin() <em>Descender Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescenderMargin()
	 * @generated
	 * @ordered
	 */
	protected Object descenderMargin = DESCENDER_MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndMargin() <em>End Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndMargin()
	 * @generated
	 * @ordered
	 */
	protected static final Object END_MARGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndMargin() <em>End Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndMargin()
	 * @generated
	 * @ordered
	 */
	protected Object endMargin = END_MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartMargin() <em>Start Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMargin()
	 * @generated
	 * @ordered
	 */
	protected static final Object START_MARGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartMargin() <em>Start Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMargin()
	 * @generated
	 * @ordered
	 */
	protected Object startMargin = START_MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected Object strokeWidth = STROKE_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FramePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getFrameProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(Object newActive) {
		Object oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.FRAME_PROPERTIES__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAscenderMargin() {
		return ascenderMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAscenderMargin(Object newAscenderMargin) {
		Object oldAscenderMargin = ascenderMargin;
		ascenderMargin = newAscenderMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.FRAME_PROPERTIES__ASCENDER_MARGIN, oldAscenderMargin, ascenderMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDescenderMargin() {
		return descenderMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescenderMargin(Object newDescenderMargin) {
		Object oldDescenderMargin = descenderMargin;
		descenderMargin = newDescenderMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.FRAME_PROPERTIES__DESCENDER_MARGIN, oldDescenderMargin, descenderMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEndMargin() {
		return endMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndMargin(Object newEndMargin) {
		Object oldEndMargin = endMargin;
		endMargin = newEndMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.FRAME_PROPERTIES__END_MARGIN, oldEndMargin, endMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStartMargin() {
		return startMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartMargin(Object newStartMargin) {
		Object oldStartMargin = startMargin;
		startMargin = newStartMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.FRAME_PROPERTIES__START_MARGIN, oldStartMargin, startMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokeWidth() {
		return strokeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeWidth(Object newStrokeWidth) {
		Object oldStrokeWidth = strokeWidth;
		strokeWidth = newStrokeWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.FRAME_PROPERTIES__STROKE_WIDTH, oldStrokeWidth, strokeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.FRAME_PROPERTIES__ACTIVE:
				return getActive();
			case Part2Package.FRAME_PROPERTIES__ASCENDER_MARGIN:
				return getAscenderMargin();
			case Part2Package.FRAME_PROPERTIES__DESCENDER_MARGIN:
				return getDescenderMargin();
			case Part2Package.FRAME_PROPERTIES__END_MARGIN:
				return getEndMargin();
			case Part2Package.FRAME_PROPERTIES__START_MARGIN:
				return getStartMargin();
			case Part2Package.FRAME_PROPERTIES__STROKE_WIDTH:
				return getStrokeWidth();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Part2Package.FRAME_PROPERTIES__ACTIVE:
				setActive(newValue);
				return;
			case Part2Package.FRAME_PROPERTIES__ASCENDER_MARGIN:
				setAscenderMargin(newValue);
				return;
			case Part2Package.FRAME_PROPERTIES__DESCENDER_MARGIN:
				setDescenderMargin(newValue);
				return;
			case Part2Package.FRAME_PROPERTIES__END_MARGIN:
				setEndMargin(newValue);
				return;
			case Part2Package.FRAME_PROPERTIES__START_MARGIN:
				setStartMargin(newValue);
				return;
			case Part2Package.FRAME_PROPERTIES__STROKE_WIDTH:
				setStrokeWidth(newValue);
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
			case Part2Package.FRAME_PROPERTIES__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case Part2Package.FRAME_PROPERTIES__ASCENDER_MARGIN:
				setAscenderMargin(ASCENDER_MARGIN_EDEFAULT);
				return;
			case Part2Package.FRAME_PROPERTIES__DESCENDER_MARGIN:
				setDescenderMargin(DESCENDER_MARGIN_EDEFAULT);
				return;
			case Part2Package.FRAME_PROPERTIES__END_MARGIN:
				setEndMargin(END_MARGIN_EDEFAULT);
				return;
			case Part2Package.FRAME_PROPERTIES__START_MARGIN:
				setStartMargin(START_MARGIN_EDEFAULT);
				return;
			case Part2Package.FRAME_PROPERTIES__STROKE_WIDTH:
				setStrokeWidth(STROKE_WIDTH_EDEFAULT);
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
			case Part2Package.FRAME_PROPERTIES__ACTIVE:
				return ACTIVE_EDEFAULT == null ? active != null : !ACTIVE_EDEFAULT.equals(active);
			case Part2Package.FRAME_PROPERTIES__ASCENDER_MARGIN:
				return ASCENDER_MARGIN_EDEFAULT == null ? ascenderMargin != null : !ASCENDER_MARGIN_EDEFAULT.equals(ascenderMargin);
			case Part2Package.FRAME_PROPERTIES__DESCENDER_MARGIN:
				return DESCENDER_MARGIN_EDEFAULT == null ? descenderMargin != null : !DESCENDER_MARGIN_EDEFAULT.equals(descenderMargin);
			case Part2Package.FRAME_PROPERTIES__END_MARGIN:
				return END_MARGIN_EDEFAULT == null ? endMargin != null : !END_MARGIN_EDEFAULT.equals(endMargin);
			case Part2Package.FRAME_PROPERTIES__START_MARGIN:
				return START_MARGIN_EDEFAULT == null ? startMargin != null : !START_MARGIN_EDEFAULT.equals(startMargin);
			case Part2Package.FRAME_PROPERTIES__STROKE_WIDTH:
				return STROKE_WIDTH_EDEFAULT == null ? strokeWidth != null : !STROKE_WIDTH_EDEFAULT.equals(strokeWidth);
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
		result.append(" (active: ");
		result.append(active);
		result.append(", ascenderMargin: ");
		result.append(ascenderMargin);
		result.append(", descenderMargin: ");
		result.append(descenderMargin);
		result.append(", endMargin: ");
		result.append(endMargin);
		result.append(", startMargin: ");
		result.append(startMargin);
		result.append(", strokeWidth: ");
		result.append(strokeWidth);
		result.append(')');
		return result.toString();
	}

} //FramePropertiesImpl
