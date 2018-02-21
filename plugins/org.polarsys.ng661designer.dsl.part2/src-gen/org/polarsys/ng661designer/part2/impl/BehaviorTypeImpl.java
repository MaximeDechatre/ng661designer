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

import org.polarsys.ng661designer.part2.BehaviorType;
import org.polarsys.ng661designer.part2.FunctionType;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.PrivatePropertyType;

import org.w3._2005._07.scxml.ScxmlScxmlType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.BehaviorTypeImpl#getScxml <em>Scxml</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.BehaviorTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.BehaviorTypeImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorTypeImpl extends MinimalEObjectImpl.Container implements BehaviorType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getScxml() <em>Scxml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScxml()
	 * @generated
	 * @ordered
	 */
	protected ScxmlScxmlType scxml;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionType> function;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PrivatePropertyType> property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getBehaviorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlScxmlType getScxml() {
		return scxml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScxml(ScxmlScxmlType newScxml, NotificationChain msgs) {
		ScxmlScxmlType oldScxml = scxml;
		scxml = newScxml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Part2Package.BEHAVIOR_TYPE__SCXML, oldScxml, newScxml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScxml(ScxmlScxmlType newScxml) {
		if (newScxml != scxml) {
			NotificationChain msgs = null;
			if (scxml != null)
				msgs = ((InternalEObject)scxml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Part2Package.BEHAVIOR_TYPE__SCXML, null, msgs);
			if (newScxml != null)
				msgs = ((InternalEObject)newScxml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Part2Package.BEHAVIOR_TYPE__SCXML, null, msgs);
			msgs = basicSetScxml(newScxml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.BEHAVIOR_TYPE__SCXML, newScxml, newScxml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionType> getFunction() {
		if (function == null) {
			function = new EObjectContainmentEList<FunctionType>(FunctionType.class, this, Part2Package.BEHAVIOR_TYPE__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrivatePropertyType> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<PrivatePropertyType>(PrivatePropertyType.class, this, Part2Package.BEHAVIOR_TYPE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.BEHAVIOR_TYPE__SCXML:
				return basicSetScxml(null, msgs);
			case Part2Package.BEHAVIOR_TYPE__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
			case Part2Package.BEHAVIOR_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
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
			case Part2Package.BEHAVIOR_TYPE__SCXML:
				return getScxml();
			case Part2Package.BEHAVIOR_TYPE__FUNCTION:
				return getFunction();
			case Part2Package.BEHAVIOR_TYPE__PROPERTY:
				return getProperty();
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
			case Part2Package.BEHAVIOR_TYPE__SCXML:
				setScxml((ScxmlScxmlType)newValue);
				return;
			case Part2Package.BEHAVIOR_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends FunctionType>)newValue);
				return;
			case Part2Package.BEHAVIOR_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PrivatePropertyType>)newValue);
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
			case Part2Package.BEHAVIOR_TYPE__SCXML:
				setScxml((ScxmlScxmlType)null);
				return;
			case Part2Package.BEHAVIOR_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case Part2Package.BEHAVIOR_TYPE__PROPERTY:
				getProperty().clear();
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
			case Part2Package.BEHAVIOR_TYPE__SCXML:
				return scxml != null;
			case Part2Package.BEHAVIOR_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case Part2Package.BEHAVIOR_TYPE__PROPERTY:
				return property != null && !property.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorTypeImpl
