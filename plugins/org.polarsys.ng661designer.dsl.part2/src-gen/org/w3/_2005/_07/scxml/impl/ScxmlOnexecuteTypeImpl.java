/**
 * Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.w3._2005._07.scxml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2005._07.scxml.ScxmlOnexecuteType;
import org.w3._2005._07.scxml.ScxmlPackage;
import org.w3._2005._07.scxml.ScxmlScriptType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Onexecute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlOnexecuteTypeImpl#getScxmlExecutablecontent <em>Scxml Executablecontent</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlOnexecuteTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlOnexecuteTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.impl.ScxmlOnexecuteTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScxmlOnexecuteTypeImpl extends MinimalEObjectImpl.Container implements ScxmlOnexecuteType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getScxmlExecutablecontent() <em>Scxml Executablecontent</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScxmlExecutablecontent()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap scxmlExecutablecontent;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected EList<ScxmlScriptType> script;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScxmlOnexecuteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.SCXML_ONEXECUTE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getScxmlExecutablecontent() {
		if (scxmlExecutablecontent == null) {
			scxmlExecutablecontent = new BasicFeatureMap(this, ScxmlPackage.SCXML_ONEXECUTE_TYPE__SCXML_EXECUTABLECONTENT);
		}
		return scxmlExecutablecontent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getScxmlExecutablecontent().<FeatureMap.Entry>list(ScxmlPackage.Literals.SCXML_ONEXECUTE_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScxmlScriptType> getScript() {
		if (script == null) {
			script = new EObjectContainmentEList<ScxmlScriptType>(ScxmlScriptType.class, this, ScxmlPackage.SCXML_ONEXECUTE_TYPE__SCRIPT);
		}
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, ScxmlPackage.SCXML_ONEXECUTE_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__SCXML_EXECUTABLECONTENT:
				return ((InternalEList<?>)getScxmlExecutablecontent()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__SCXML_EXECUTABLECONTENT:
				if (coreType) return getScxmlExecutablecontent();
				return ((FeatureMap.Internal)getScxmlExecutablecontent()).getWrapper();
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__SCRIPT:
				return getScript();
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__SCXML_EXECUTABLECONTENT:
				((FeatureMap.Internal)getScxmlExecutablecontent()).set(newValue);
				return;
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScxmlScriptType>)newValue);
				return;
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__SCXML_EXECUTABLECONTENT:
				getScxmlExecutablecontent().clear();
				return;
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__ANY:
				getAny().clear();
				return;
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__SCRIPT:
				getScript().clear();
				return;
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__SCXML_EXECUTABLECONTENT:
				return scxmlExecutablecontent != null && !scxmlExecutablecontent.isEmpty();
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__ANY:
				return !getAny().isEmpty();
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__SCRIPT:
				return script != null && !script.isEmpty();
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (scxmlExecutablecontent: ");
		result.append(scxmlExecutablecontent);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ScxmlOnexecuteTypeImpl
