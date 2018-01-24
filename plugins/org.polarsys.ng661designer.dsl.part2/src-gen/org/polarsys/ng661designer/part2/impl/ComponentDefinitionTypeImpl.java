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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.polarsys.ng661designer.part2.BehaviorType;
import org.polarsys.ng661designer.part2.ComponentDefinitionType;
import org.polarsys.ng661designer.part2.DefinitionType;
import org.polarsys.ng661designer.part2.InterfaceType;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.TreeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ComponentDefinitionTypeImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ComponentDefinitionTypeImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ComponentDefinitionTypeImpl#getTree <em>Tree</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ComponentDefinitionTypeImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ComponentDefinitionTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDefinitionTypeImpl extends MinimalEObjectImpl.Container implements ComponentDefinitionType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected DefinitionType definition;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected InterfaceType interface_;

	/**
	 * The cached value of the '{@link #getTree() <em>Tree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTree()
	 * @generated
	 * @ordered
	 */
	protected TreeType tree;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected BehaviorType behavior;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getComponentDefinitionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionType getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(DefinitionType newDefinition, NotificationChain msgs) {
		DefinitionType oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Part2Package.COMPONENT_DEFINITION_TYPE__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(DefinitionType newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Part2Package.COMPONENT_DEFINITION_TYPE__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Part2Package.COMPONENT_DEFINITION_TYPE__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.COMPONENT_DEFINITION_TYPE__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(InterfaceType newInterface, NotificationChain msgs) {
		InterfaceType oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Part2Package.COMPONENT_DEFINITION_TYPE__INTERFACE, oldInterface, newInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(InterfaceType newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Part2Package.COMPONENT_DEFINITION_TYPE__INTERFACE, null, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Part2Package.COMPONENT_DEFINITION_TYPE__INTERFACE, null, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.COMPONENT_DEFINITION_TYPE__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeType getTree() {
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTree(TreeType newTree, NotificationChain msgs) {
		TreeType oldTree = tree;
		tree = newTree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Part2Package.COMPONENT_DEFINITION_TYPE__TREE, oldTree, newTree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTree(TreeType newTree) {
		if (newTree != tree) {
			NotificationChain msgs = null;
			if (tree != null)
				msgs = ((InternalEObject)tree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Part2Package.COMPONENT_DEFINITION_TYPE__TREE, null, msgs);
			if (newTree != null)
				msgs = ((InternalEObject)newTree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Part2Package.COMPONENT_DEFINITION_TYPE__TREE, null, msgs);
			msgs = basicSetTree(newTree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.COMPONENT_DEFINITION_TYPE__TREE, newTree, newTree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorType getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavior(BehaviorType newBehavior, NotificationChain msgs) {
		BehaviorType oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Part2Package.COMPONENT_DEFINITION_TYPE__BEHAVIOR, oldBehavior, newBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(BehaviorType newBehavior) {
		if (newBehavior != behavior) {
			NotificationChain msgs = null;
			if (behavior != null)
				msgs = ((InternalEObject)behavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Part2Package.COMPONENT_DEFINITION_TYPE__BEHAVIOR, null, msgs);
			if (newBehavior != null)
				msgs = ((InternalEObject)newBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Part2Package.COMPONENT_DEFINITION_TYPE__BEHAVIOR, null, msgs);
			msgs = basicSetBehavior(newBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.COMPONENT_DEFINITION_TYPE__BEHAVIOR, newBehavior, newBehavior));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.COMPONENT_DEFINITION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.COMPONENT_DEFINITION_TYPE__DEFINITION:
				return basicSetDefinition(null, msgs);
			case Part2Package.COMPONENT_DEFINITION_TYPE__INTERFACE:
				return basicSetInterface(null, msgs);
			case Part2Package.COMPONENT_DEFINITION_TYPE__TREE:
				return basicSetTree(null, msgs);
			case Part2Package.COMPONENT_DEFINITION_TYPE__BEHAVIOR:
				return basicSetBehavior(null, msgs);
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
			case Part2Package.COMPONENT_DEFINITION_TYPE__DEFINITION:
				return getDefinition();
			case Part2Package.COMPONENT_DEFINITION_TYPE__INTERFACE:
				return getInterface();
			case Part2Package.COMPONENT_DEFINITION_TYPE__TREE:
				return getTree();
			case Part2Package.COMPONENT_DEFINITION_TYPE__BEHAVIOR:
				return getBehavior();
			case Part2Package.COMPONENT_DEFINITION_TYPE__NAME:
				return getName();
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
			case Part2Package.COMPONENT_DEFINITION_TYPE__DEFINITION:
				setDefinition((DefinitionType)newValue);
				return;
			case Part2Package.COMPONENT_DEFINITION_TYPE__INTERFACE:
				setInterface((InterfaceType)newValue);
				return;
			case Part2Package.COMPONENT_DEFINITION_TYPE__TREE:
				setTree((TreeType)newValue);
				return;
			case Part2Package.COMPONENT_DEFINITION_TYPE__BEHAVIOR:
				setBehavior((BehaviorType)newValue);
				return;
			case Part2Package.COMPONENT_DEFINITION_TYPE__NAME:
				setName((String)newValue);
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
			case Part2Package.COMPONENT_DEFINITION_TYPE__DEFINITION:
				setDefinition((DefinitionType)null);
				return;
			case Part2Package.COMPONENT_DEFINITION_TYPE__INTERFACE:
				setInterface((InterfaceType)null);
				return;
			case Part2Package.COMPONENT_DEFINITION_TYPE__TREE:
				setTree((TreeType)null);
				return;
			case Part2Package.COMPONENT_DEFINITION_TYPE__BEHAVIOR:
				setBehavior((BehaviorType)null);
				return;
			case Part2Package.COMPONENT_DEFINITION_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case Part2Package.COMPONENT_DEFINITION_TYPE__DEFINITION:
				return definition != null;
			case Part2Package.COMPONENT_DEFINITION_TYPE__INTERFACE:
				return interface_ != null;
			case Part2Package.COMPONENT_DEFINITION_TYPE__TREE:
				return tree != null;
			case Part2Package.COMPONENT_DEFINITION_TYPE__BEHAVIOR:
				return behavior != null;
			case Part2Package.COMPONENT_DEFINITION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentDefinitionTypeImpl
