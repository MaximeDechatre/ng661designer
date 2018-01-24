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

import org.polarsys.ng661designer.part2.Part2Factory;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.TouchAreaPrimitive;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Touch Area Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl#getEnable <em>Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl#getInheritedBlocked <em>Inherited Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl#getInheritedEnable <em>Inherited Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl#getInheritedVisible <em>Inherited Visible</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl#getMaximumTouchPoints <em>Maximum Touch Points</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl#getMinimumTouchPoints <em>Minimum Touch Points</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl#getPassThrough <em>Pass Through</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl#getPreventStealing <em>Prevent Stealing</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl#getX <em>X</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TouchAreaPrimitiveImpl extends TreeTypesImpl implements TouchAreaPrimitive {
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
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Object HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Object height = HEIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getMaximumTouchPoints() <em>Maximum Touch Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumTouchPoints()
	 * @generated
	 * @ordered
	 */
	protected static final Object MAXIMUM_TOUCH_POINTS_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getIntegerType(), "20");

	/**
	 * The cached value of the '{@link #getMaximumTouchPoints() <em>Maximum Touch Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumTouchPoints()
	 * @generated
	 * @ordered
	 */
	protected Object maximumTouchPoints = MAXIMUM_TOUCH_POINTS_EDEFAULT;

	/**
	 * This is true if the Maximum Touch Points attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumTouchPointsESet;

	/**
	 * The default value of the '{@link #getMinimumTouchPoints() <em>Minimum Touch Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumTouchPoints()
	 * @generated
	 * @ordered
	 */
	protected static final Object MINIMUM_TOUCH_POINTS_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getIntegerType(), "0");

	/**
	 * The cached value of the '{@link #getMinimumTouchPoints() <em>Minimum Touch Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumTouchPoints()
	 * @generated
	 * @ordered
	 */
	protected Object minimumTouchPoints = MINIMUM_TOUCH_POINTS_EDEFAULT;

	/**
	 * This is true if the Minimum Touch Points attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumTouchPointsESet;

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
	 * The default value of the '{@link #getPreventStealing() <em>Prevent Stealing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreventStealing()
	 * @generated
	 * @ordered
	 */
	protected static final Object PREVENT_STEALING_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getPreventStealing() <em>Prevent Stealing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreventStealing()
	 * @generated
	 * @ordered
	 */
	protected Object preventStealing = PREVENT_STEALING_EDEFAULT;

	/**
	 * This is true if the Prevent Stealing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preventStealingESet;

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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Object width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Object X_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getPositionType(), "0");

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Object x = X_EDEFAULT;

	/**
	 * This is true if the X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xESet;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Object Y_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getPositionType(), "0");

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Object y = Y_EDEFAULT;

	/**
	 * This is true if the Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchAreaPrimitiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getTouchAreaPrimitive();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TOUCH_AREA_PRIMITIVE__BLOCKED, oldBlocked, blocked, !oldBlockedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TOUCH_AREA_PRIMITIVE__BLOCKED, oldBlocked, BLOCKED_EDEFAULT, oldBlockedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TOUCH_AREA_PRIMITIVE__ENABLE, oldEnable, enable, !oldEnableESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TOUCH_AREA_PRIMITIVE__ENABLE, oldEnable, ENABLE_EDEFAULT, oldEnableESet));
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
	public Object getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Object newHeight) {
		Object oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TOUCH_AREA_PRIMITIVE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TOUCH_AREA_PRIMITIVE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_BLOCKED, oldInheritedBlocked, inheritedBlocked, !oldInheritedBlockedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_BLOCKED, oldInheritedBlocked, INHERITED_BLOCKED_EDEFAULT, oldInheritedBlockedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_ENABLE, oldInheritedEnable, inheritedEnable, !oldInheritedEnableESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_ENABLE, oldInheritedEnable, INHERITED_ENABLE_EDEFAULT, oldInheritedEnableESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_VISIBLE, oldInheritedVisible, inheritedVisible, !oldInheritedVisibleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_VISIBLE, oldInheritedVisible, INHERITED_VISIBLE_EDEFAULT, oldInheritedVisibleESet));
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
	public Object getMaximumTouchPoints() {
		return maximumTouchPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumTouchPoints(Object newMaximumTouchPoints) {
		Object oldMaximumTouchPoints = maximumTouchPoints;
		maximumTouchPoints = newMaximumTouchPoints;
		boolean oldMaximumTouchPointsESet = maximumTouchPointsESet;
		maximumTouchPointsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TOUCH_AREA_PRIMITIVE__MAXIMUM_TOUCH_POINTS, oldMaximumTouchPoints, maximumTouchPoints, !oldMaximumTouchPointsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumTouchPoints() {
		Object oldMaximumTouchPoints = maximumTouchPoints;
		boolean oldMaximumTouchPointsESet = maximumTouchPointsESet;
		maximumTouchPoints = MAXIMUM_TOUCH_POINTS_EDEFAULT;
		maximumTouchPointsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TOUCH_AREA_PRIMITIVE__MAXIMUM_TOUCH_POINTS, oldMaximumTouchPoints, MAXIMUM_TOUCH_POINTS_EDEFAULT, oldMaximumTouchPointsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumTouchPoints() {
		return maximumTouchPointsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMinimumTouchPoints() {
		return minimumTouchPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumTouchPoints(Object newMinimumTouchPoints) {
		Object oldMinimumTouchPoints = minimumTouchPoints;
		minimumTouchPoints = newMinimumTouchPoints;
		boolean oldMinimumTouchPointsESet = minimumTouchPointsESet;
		minimumTouchPointsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TOUCH_AREA_PRIMITIVE__MINIMUM_TOUCH_POINTS, oldMinimumTouchPoints, minimumTouchPoints, !oldMinimumTouchPointsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumTouchPoints() {
		Object oldMinimumTouchPoints = minimumTouchPoints;
		boolean oldMinimumTouchPointsESet = minimumTouchPointsESet;
		minimumTouchPoints = MINIMUM_TOUCH_POINTS_EDEFAULT;
		minimumTouchPointsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TOUCH_AREA_PRIMITIVE__MINIMUM_TOUCH_POINTS, oldMinimumTouchPoints, MINIMUM_TOUCH_POINTS_EDEFAULT, oldMinimumTouchPointsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumTouchPoints() {
		return minimumTouchPointsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TOUCH_AREA_PRIMITIVE__PASS_THROUGH, oldPassThrough, passThrough, !oldPassThroughESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TOUCH_AREA_PRIMITIVE__PASS_THROUGH, oldPassThrough, PASS_THROUGH_EDEFAULT, oldPassThroughESet));
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
	public Object getPreventStealing() {
		return preventStealing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreventStealing(Object newPreventStealing) {
		Object oldPreventStealing = preventStealing;
		preventStealing = newPreventStealing;
		boolean oldPreventStealingESet = preventStealingESet;
		preventStealingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TOUCH_AREA_PRIMITIVE__PREVENT_STEALING, oldPreventStealing, preventStealing, !oldPreventStealingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreventStealing() {
		Object oldPreventStealing = preventStealing;
		boolean oldPreventStealingESet = preventStealingESet;
		preventStealing = PREVENT_STEALING_EDEFAULT;
		preventStealingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TOUCH_AREA_PRIMITIVE__PREVENT_STEALING, oldPreventStealing, PREVENT_STEALING_EDEFAULT, oldPreventStealingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPreventStealing() {
		return preventStealingESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TOUCH_AREA_PRIMITIVE__VISIBLE, oldVisible, visible, !oldVisibleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TOUCH_AREA_PRIMITIVE__VISIBLE, oldVisible, VISIBLE_EDEFAULT, oldVisibleESet));
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
	public Object getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Object newWidth) {
		Object oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TOUCH_AREA_PRIMITIVE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Object newX) {
		Object oldX = x;
		x = newX;
		boolean oldXESet = xESet;
		xESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TOUCH_AREA_PRIMITIVE__X, oldX, x, !oldXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetX() {
		Object oldX = x;
		boolean oldXESet = xESet;
		x = X_EDEFAULT;
		xESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TOUCH_AREA_PRIMITIVE__X, oldX, X_EDEFAULT, oldXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetX() {
		return xESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Object newY) {
		Object oldY = y;
		y = newY;
		boolean oldYESet = yESet;
		yESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.TOUCH_AREA_PRIMITIVE__Y, oldY, y, !oldYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetY() {
		Object oldY = y;
		boolean oldYESet = yESet;
		y = Y_EDEFAULT;
		yESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.TOUCH_AREA_PRIMITIVE__Y, oldY, Y_EDEFAULT, oldYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetY() {
		return yESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.TOUCH_AREA_PRIMITIVE__BLOCKED:
				return getBlocked();
			case Part2Package.TOUCH_AREA_PRIMITIVE__ENABLE:
				return getEnable();
			case Part2Package.TOUCH_AREA_PRIMITIVE__HEIGHT:
				return getHeight();
			case Part2Package.TOUCH_AREA_PRIMITIVE__ID:
				return getId();
			case Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_BLOCKED:
				return getInheritedBlocked();
			case Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_ENABLE:
				return getInheritedEnable();
			case Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_VISIBLE:
				return getInheritedVisible();
			case Part2Package.TOUCH_AREA_PRIMITIVE__MAXIMUM_TOUCH_POINTS:
				return getMaximumTouchPoints();
			case Part2Package.TOUCH_AREA_PRIMITIVE__MINIMUM_TOUCH_POINTS:
				return getMinimumTouchPoints();
			case Part2Package.TOUCH_AREA_PRIMITIVE__PASS_THROUGH:
				return getPassThrough();
			case Part2Package.TOUCH_AREA_PRIMITIVE__PREVENT_STEALING:
				return getPreventStealing();
			case Part2Package.TOUCH_AREA_PRIMITIVE__VISIBLE:
				return getVisible();
			case Part2Package.TOUCH_AREA_PRIMITIVE__WIDTH:
				return getWidth();
			case Part2Package.TOUCH_AREA_PRIMITIVE__X:
				return getX();
			case Part2Package.TOUCH_AREA_PRIMITIVE__Y:
				return getY();
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
			case Part2Package.TOUCH_AREA_PRIMITIVE__BLOCKED:
				setBlocked(newValue);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__ENABLE:
				setEnable(newValue);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__HEIGHT:
				setHeight(newValue);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__ID:
				setId((String)newValue);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_BLOCKED:
				setInheritedBlocked(newValue);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_ENABLE:
				setInheritedEnable(newValue);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_VISIBLE:
				setInheritedVisible(newValue);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__MAXIMUM_TOUCH_POINTS:
				setMaximumTouchPoints(newValue);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__MINIMUM_TOUCH_POINTS:
				setMinimumTouchPoints(newValue);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__PASS_THROUGH:
				setPassThrough(newValue);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__PREVENT_STEALING:
				setPreventStealing(newValue);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__VISIBLE:
				setVisible(newValue);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__WIDTH:
				setWidth(newValue);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__X:
				setX(newValue);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__Y:
				setY(newValue);
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
			case Part2Package.TOUCH_AREA_PRIMITIVE__BLOCKED:
				unsetBlocked();
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__ENABLE:
				unsetEnable();
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__ID:
				setId(ID_EDEFAULT);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_BLOCKED:
				unsetInheritedBlocked();
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_ENABLE:
				unsetInheritedEnable();
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_VISIBLE:
				unsetInheritedVisible();
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__MAXIMUM_TOUCH_POINTS:
				unsetMaximumTouchPoints();
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__MINIMUM_TOUCH_POINTS:
				unsetMinimumTouchPoints();
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__PASS_THROUGH:
				unsetPassThrough();
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__PREVENT_STEALING:
				unsetPreventStealing();
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__VISIBLE:
				unsetVisible();
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__X:
				unsetX();
				return;
			case Part2Package.TOUCH_AREA_PRIMITIVE__Y:
				unsetY();
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
			case Part2Package.TOUCH_AREA_PRIMITIVE__BLOCKED:
				return isSetBlocked();
			case Part2Package.TOUCH_AREA_PRIMITIVE__ENABLE:
				return isSetEnable();
			case Part2Package.TOUCH_AREA_PRIMITIVE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case Part2Package.TOUCH_AREA_PRIMITIVE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_BLOCKED:
				return isSetInheritedBlocked();
			case Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_ENABLE:
				return isSetInheritedEnable();
			case Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_VISIBLE:
				return isSetInheritedVisible();
			case Part2Package.TOUCH_AREA_PRIMITIVE__MAXIMUM_TOUCH_POINTS:
				return isSetMaximumTouchPoints();
			case Part2Package.TOUCH_AREA_PRIMITIVE__MINIMUM_TOUCH_POINTS:
				return isSetMinimumTouchPoints();
			case Part2Package.TOUCH_AREA_PRIMITIVE__PASS_THROUGH:
				return isSetPassThrough();
			case Part2Package.TOUCH_AREA_PRIMITIVE__PREVENT_STEALING:
				return isSetPreventStealing();
			case Part2Package.TOUCH_AREA_PRIMITIVE__VISIBLE:
				return isSetVisible();
			case Part2Package.TOUCH_AREA_PRIMITIVE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case Part2Package.TOUCH_AREA_PRIMITIVE__X:
				return isSetX();
			case Part2Package.TOUCH_AREA_PRIMITIVE__Y:
				return isSetY();
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
		result.append(", height: ");
		result.append(height);
		result.append(", id: ");
		result.append(id);
		result.append(", inheritedBlocked: ");
		if (inheritedBlockedESet) result.append(inheritedBlocked); else result.append("<unset>");
		result.append(", inheritedEnable: ");
		if (inheritedEnableESet) result.append(inheritedEnable); else result.append("<unset>");
		result.append(", inheritedVisible: ");
		if (inheritedVisibleESet) result.append(inheritedVisible); else result.append("<unset>");
		result.append(", maximumTouchPoints: ");
		if (maximumTouchPointsESet) result.append(maximumTouchPoints); else result.append("<unset>");
		result.append(", minimumTouchPoints: ");
		if (minimumTouchPointsESet) result.append(minimumTouchPoints); else result.append("<unset>");
		result.append(", passThrough: ");
		if (passThroughESet) result.append(passThrough); else result.append("<unset>");
		result.append(", preventStealing: ");
		if (preventStealingESet) result.append(preventStealing); else result.append("<unset>");
		result.append(", visible: ");
		if (visibleESet) result.append(visible); else result.append("<unset>");
		result.append(", width: ");
		result.append(width);
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", y: ");
		if (yESet) result.append(y); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TouchAreaPrimitiveImpl
