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

import org.polarsys.ng661designer.part2.KeyboardInputPrimitive;
import org.polarsys.ng661designer.part2.Part2Factory;
import org.polarsys.ng661designer.part2.Part2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keyboard Input Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.KeyboardInputPrimitiveImpl#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.KeyboardInputPrimitiveImpl#getEnable <em>Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.KeyboardInputPrimitiveImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.KeyboardInputPrimitiveImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.KeyboardInputPrimitiveImpl#getInheritedBlocked <em>Inherited Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.KeyboardInputPrimitiveImpl#getInheritedEnable <em>Inherited Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.KeyboardInputPrimitiveImpl#getInheritedVisible <em>Inherited Visible</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.KeyboardInputPrimitiveImpl#getNeedFocus <em>Need Focus</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.KeyboardInputPrimitiveImpl#getPassThrough <em>Pass Through</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.KeyboardInputPrimitiveImpl#getVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyboardInputPrimitiveImpl extends TreeTypesImpl implements KeyboardInputPrimitive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final Object BLOCKED_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocked()
	 * @generated
	 * @ordered
	 */
	protected Object blocked = BLOCKED_EDEFAULT;

	/**
	 * This is true if the Blocked attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean blockedESet;

	/**
	 * The default value of the '{@link #getEnable() <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable()
	 * @generated
	 * @ordered
	 */
	protected static final Object ENABLE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getEnable() <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable()
	 * @generated
	 * @ordered
	 */
	protected Object enable = ENABLE_EDEFAULT;

	/**
	 * This is true if the Enable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enableESet;

	/**
	 * The default value of the '{@link #getFocus() <em>Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected static final Object FOCUS_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "false");

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected Object focus = FOCUS_EDEFAULT;

	/**
	 * This is true if the Focus attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean focusESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInheritedBlocked() <em>Inherited Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final Object INHERITED_BLOCKED_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getInheritedBlocked() <em>Inherited Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedBlocked()
	 * @generated
	 * @ordered
	 */
	protected Object inheritedBlocked = INHERITED_BLOCKED_EDEFAULT;

	/**
	 * This is true if the Inherited Blocked attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inheritedBlockedESet;

	/**
	 * The default value of the '{@link #getInheritedEnable() <em>Inherited Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedEnable()
	 * @generated
	 * @ordered
	 */
	protected static final Object INHERITED_ENABLE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getInheritedEnable() <em>Inherited Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedEnable()
	 * @generated
	 * @ordered
	 */
	protected Object inheritedEnable = INHERITED_ENABLE_EDEFAULT;

	/**
	 * This is true if the Inherited Enable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inheritedEnableESet;

	/**
	 * The default value of the '{@link #getInheritedVisible() <em>Inherited Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedVisible()
	 * @generated
	 * @ordered
	 */
	protected static final Object INHERITED_VISIBLE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getInheritedVisible() <em>Inherited Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedVisible()
	 * @generated
	 * @ordered
	 */
	protected Object inheritedVisible = INHERITED_VISIBLE_EDEFAULT;

	/**
	 * This is true if the Inherited Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inheritedVisibleESet;

	/**
	 * The default value of the '{@link #getNeedFocus() <em>Need Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedFocus()
	 * @generated
	 * @ordered
	 */
	protected static final Object NEED_FOCUS_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "false");

	/**
	 * The cached value of the '{@link #getNeedFocus() <em>Need Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedFocus()
	 * @generated
	 * @ordered
	 */
	protected Object needFocus = NEED_FOCUS_EDEFAULT;

	/**
	 * This is true if the Need Focus attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean needFocusESet;

	/**
	 * The default value of the '{@link #getPassThrough() <em>Pass Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassThrough()
	 * @generated
	 * @ordered
	 */
	protected static final Object PASS_THROUGH_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "false");

	/**
	 * The cached value of the '{@link #getPassThrough() <em>Pass Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassThrough()
	 * @generated
	 * @ordered
	 */
	protected Object passThrough = PASS_THROUGH_EDEFAULT;

	/**
	 * This is true if the Pass Through attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean passThroughESet;

	/**
	 * The default value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected static final Object VISIBLE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected Object visible = VISIBLE_EDEFAULT;

	/**
	 * This is true if the Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyboardInputPrimitiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getKeyboardInputPrimitive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBlocked() {
		return blocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocked(Object newBlocked) {
		Object oldBlocked = blocked;
		blocked = newBlocked;
		boolean oldBlockedESet = blockedESet;
		blockedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__BLOCKED, oldBlocked, blocked, !oldBlockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBlocked() {
		Object oldBlocked = blocked;
		boolean oldBlockedESet = blockedESet;
		blocked = BLOCKED_EDEFAULT;
		blockedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__BLOCKED, oldBlocked, BLOCKED_EDEFAULT, oldBlockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBlocked() {
		return blockedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEnable() {
		return enable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable(Object newEnable) {
		Object oldEnable = enable;
		enable = newEnable;
		boolean oldEnableESet = enableESet;
		enableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__ENABLE, oldEnable, enable, !oldEnableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnable() {
		Object oldEnable = enable;
		boolean oldEnableESet = enableESet;
		enable = ENABLE_EDEFAULT;
		enableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__ENABLE, oldEnable, ENABLE_EDEFAULT, oldEnableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnable() {
		return enableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocus(Object newFocus) {
		Object oldFocus = focus;
		focus = newFocus;
		boolean oldFocusESet = focusESet;
		focusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__FOCUS, oldFocus, focus, !oldFocusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFocus() {
		Object oldFocus = focus;
		boolean oldFocusESet = focusESet;
		focus = FOCUS_EDEFAULT;
		focusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__FOCUS, oldFocus, FOCUS_EDEFAULT, oldFocusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFocus() {
		return focusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInheritedBlocked() {
		return inheritedBlocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritedBlocked(Object newInheritedBlocked) {
		Object oldInheritedBlocked = inheritedBlocked;
		inheritedBlocked = newInheritedBlocked;
		boolean oldInheritedBlockedESet = inheritedBlockedESet;
		inheritedBlockedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_BLOCKED, oldInheritedBlocked, inheritedBlocked, !oldInheritedBlockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInheritedBlocked() {
		Object oldInheritedBlocked = inheritedBlocked;
		boolean oldInheritedBlockedESet = inheritedBlockedESet;
		inheritedBlocked = INHERITED_BLOCKED_EDEFAULT;
		inheritedBlockedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_BLOCKED, oldInheritedBlocked, INHERITED_BLOCKED_EDEFAULT, oldInheritedBlockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInheritedBlocked() {
		return inheritedBlockedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInheritedEnable() {
		return inheritedEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritedEnable(Object newInheritedEnable) {
		Object oldInheritedEnable = inheritedEnable;
		inheritedEnable = newInheritedEnable;
		boolean oldInheritedEnableESet = inheritedEnableESet;
		inheritedEnableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_ENABLE, oldInheritedEnable, inheritedEnable, !oldInheritedEnableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInheritedEnable() {
		Object oldInheritedEnable = inheritedEnable;
		boolean oldInheritedEnableESet = inheritedEnableESet;
		inheritedEnable = INHERITED_ENABLE_EDEFAULT;
		inheritedEnableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_ENABLE, oldInheritedEnable, INHERITED_ENABLE_EDEFAULT, oldInheritedEnableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInheritedEnable() {
		return inheritedEnableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInheritedVisible() {
		return inheritedVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritedVisible(Object newInheritedVisible) {
		Object oldInheritedVisible = inheritedVisible;
		inheritedVisible = newInheritedVisible;
		boolean oldInheritedVisibleESet = inheritedVisibleESet;
		inheritedVisibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_VISIBLE, oldInheritedVisible, inheritedVisible, !oldInheritedVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInheritedVisible() {
		Object oldInheritedVisible = inheritedVisible;
		boolean oldInheritedVisibleESet = inheritedVisibleESet;
		inheritedVisible = INHERITED_VISIBLE_EDEFAULT;
		inheritedVisibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_VISIBLE, oldInheritedVisible, INHERITED_VISIBLE_EDEFAULT, oldInheritedVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInheritedVisible() {
		return inheritedVisibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNeedFocus() {
		return needFocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedFocus(Object newNeedFocus) {
		Object oldNeedFocus = needFocus;
		needFocus = newNeedFocus;
		boolean oldNeedFocusESet = needFocusESet;
		needFocusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__NEED_FOCUS, oldNeedFocus, needFocus, !oldNeedFocusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNeedFocus() {
		Object oldNeedFocus = needFocus;
		boolean oldNeedFocusESet = needFocusESet;
		needFocus = NEED_FOCUS_EDEFAULT;
		needFocusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__NEED_FOCUS, oldNeedFocus, NEED_FOCUS_EDEFAULT, oldNeedFocusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNeedFocus() {
		return needFocusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPassThrough() {
		return passThrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassThrough(Object newPassThrough) {
		Object oldPassThrough = passThrough;
		passThrough = newPassThrough;
		boolean oldPassThroughESet = passThroughESet;
		passThroughESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__PASS_THROUGH, oldPassThrough, passThrough, !oldPassThroughESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPassThrough() {
		Object oldPassThrough = passThrough;
		boolean oldPassThroughESet = passThroughESet;
		passThrough = PASS_THROUGH_EDEFAULT;
		passThroughESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__PASS_THROUGH, oldPassThrough, PASS_THROUGH_EDEFAULT, oldPassThroughESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPassThrough() {
		return passThroughESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(Object newVisible) {
		Object oldVisible = visible;
		visible = newVisible;
		boolean oldVisibleESet = visibleESet;
		visibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__VISIBLE, oldVisible, visible, !oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisible() {
		Object oldVisible = visible;
		boolean oldVisibleESet = visibleESet;
		visible = VISIBLE_EDEFAULT;
		visibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.KEYBOARD_INPUT_PRIMITIVE__VISIBLE, oldVisible, VISIBLE_EDEFAULT, oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisible() {
		return visibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__BLOCKED:
				return getBlocked();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__ENABLE:
				return getEnable();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__FOCUS:
				return getFocus();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__ID:
				return getId();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_BLOCKED:
				return getInheritedBlocked();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_ENABLE:
				return getInheritedEnable();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_VISIBLE:
				return getInheritedVisible();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__NEED_FOCUS:
				return getNeedFocus();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__PASS_THROUGH:
				return getPassThrough();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__VISIBLE:
				return getVisible();
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
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__BLOCKED:
				setBlocked(newValue);
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__ENABLE:
				setEnable(newValue);
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__FOCUS:
				setFocus(newValue);
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__ID:
				setId((String)newValue);
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_BLOCKED:
				setInheritedBlocked(newValue);
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_ENABLE:
				setInheritedEnable(newValue);
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_VISIBLE:
				setInheritedVisible(newValue);
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__NEED_FOCUS:
				setNeedFocus(newValue);
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__PASS_THROUGH:
				setPassThrough(newValue);
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__VISIBLE:
				setVisible(newValue);
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
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__BLOCKED:
				unsetBlocked();
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__ENABLE:
				unsetEnable();
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__FOCUS:
				unsetFocus();
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__ID:
				setId(ID_EDEFAULT);
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_BLOCKED:
				unsetInheritedBlocked();
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_ENABLE:
				unsetInheritedEnable();
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_VISIBLE:
				unsetInheritedVisible();
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__NEED_FOCUS:
				unsetNeedFocus();
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__PASS_THROUGH:
				unsetPassThrough();
				return;
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__VISIBLE:
				unsetVisible();
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
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__BLOCKED:
				return isSetBlocked();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__ENABLE:
				return isSetEnable();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__FOCUS:
				return isSetFocus();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_BLOCKED:
				return isSetInheritedBlocked();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_ENABLE:
				return isSetInheritedEnable();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__INHERITED_VISIBLE:
				return isSetInheritedVisible();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__NEED_FOCUS:
				return isSetNeedFocus();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__PASS_THROUGH:
				return isSetPassThrough();
			case Part2Package.KEYBOARD_INPUT_PRIMITIVE__VISIBLE:
				return isSetVisible();
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
		result.append(" (blocked: ");
		if (blockedESet) result.append(blocked); else result.append("<unset>");
		result.append(", enable: ");
		if (enableESet) result.append(enable); else result.append("<unset>");
		result.append(", focus: ");
		if (focusESet) result.append(focus); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", inheritedBlocked: ");
		if (inheritedBlockedESet) result.append(inheritedBlocked); else result.append("<unset>");
		result.append(", inheritedEnable: ");
		if (inheritedEnableESet) result.append(inheritedEnable); else result.append("<unset>");
		result.append(", inheritedVisible: ");
		if (inheritedVisibleESet) result.append(inheritedVisible); else result.append("<unset>");
		result.append(", needFocus: ");
		if (needFocusESet) result.append(needFocus); else result.append("<unset>");
		result.append(", passThrough: ");
		if (passThroughESet) result.append(passThrough); else result.append("<unset>");
		result.append(", visible: ");
		if (visibleESet) result.append(visible); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //KeyboardInputPrimitiveImpl
