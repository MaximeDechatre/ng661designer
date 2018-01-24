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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._2005._07.scxml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScxmlFactoryImpl extends EFactoryImpl implements ScxmlFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScxmlFactory init() {
		try {
			ScxmlFactory theScxmlFactory = (ScxmlFactory)EPackage.Registry.INSTANCE.getEFactory(ScxmlPackage.eNS_URI);
			if (theScxmlFactory != null) {
				return theScxmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScxmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScxmlPackage.SCXML_ONEXECUTE_TYPE: return createScxmlOnexecuteType();
			case ScxmlPackage.SCXML_SCRIPT_TYPE: return createScxmlScriptType();
			case ScxmlPackage.SCXML_SCXML_TYPE: return createScxmlScxmlType();
			case ScxmlPackage.SCXML_STATE_TYPE: return createScxmlStateType();
			case ScxmlPackage.SCXML_TRANSITION_TYPE: return createScxmlTransitionType();
			case ScxmlPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ScxmlPackage.SCXML_TRANSITION_TYPE_TYPE:
				return createScxmlTransitionTypeTypeFromString(eDataType, initialValue);
			case ScxmlPackage.SCXML_ID_TYPE:
				return createScxmlIdTypeFromString(eDataType, initialValue);
			case ScxmlPackage.SCXML_SCRIPT_SOURCE_TYPE:
				return createScxmlScriptSourceTypeFromString(eDataType, initialValue);
			case ScxmlPackage.SCXML_TRANSITION_COND_TYPE:
				return createScxmlTransitionCondTypeFromString(eDataType, initialValue);
			case ScxmlPackage.SCXML_TRANSITION_EVENT_TYPE:
				return createScxmlTransitionEventTypeFromString(eDataType, initialValue);
			case ScxmlPackage.SCXML_TRANSITION_TYPE_TYPE_OBJECT:
				return createScxmlTransitionTypeTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ScxmlPackage.SCXML_TRANSITION_TYPE_TYPE:
				return convertScxmlTransitionTypeTypeToString(eDataType, instanceValue);
			case ScxmlPackage.SCXML_ID_TYPE:
				return convertScxmlIdTypeToString(eDataType, instanceValue);
			case ScxmlPackage.SCXML_SCRIPT_SOURCE_TYPE:
				return convertScxmlScriptSourceTypeToString(eDataType, instanceValue);
			case ScxmlPackage.SCXML_TRANSITION_COND_TYPE:
				return convertScxmlTransitionCondTypeToString(eDataType, instanceValue);
			case ScxmlPackage.SCXML_TRANSITION_EVENT_TYPE:
				return convertScxmlTransitionEventTypeToString(eDataType, instanceValue);
			case ScxmlPackage.SCXML_TRANSITION_TYPE_TYPE_OBJECT:
				return convertScxmlTransitionTypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlOnexecuteType createScxmlOnexecuteType() {
		ScxmlOnexecuteTypeImpl scxmlOnexecuteType = new ScxmlOnexecuteTypeImpl();
		return scxmlOnexecuteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlScriptType createScxmlScriptType() {
		ScxmlScriptTypeImpl scxmlScriptType = new ScxmlScriptTypeImpl();
		return scxmlScriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlScxmlType createScxmlScxmlType() {
		ScxmlScxmlTypeImpl scxmlScxmlType = new ScxmlScxmlTypeImpl();
		return scxmlScxmlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlStateType createScxmlStateType() {
		ScxmlStateTypeImpl scxmlStateType = new ScxmlStateTypeImpl();
		return scxmlStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlTransitionType createScxmlTransitionType() {
		ScxmlTransitionTypeImpl scxmlTransitionType = new ScxmlTransitionTypeImpl();
		return scxmlTransitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlTransitionTypeType createScxmlTransitionTypeTypeFromString(EDataType eDataType, String initialValue) {
		ScxmlTransitionTypeType result = ScxmlTransitionTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScxmlTransitionTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScxmlIdTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScxmlIdTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScxmlScriptSourceTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScxmlScriptSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScxmlTransitionCondTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScxmlTransitionCondTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScxmlTransitionEventTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScxmlTransitionEventTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlTransitionTypeType createScxmlTransitionTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createScxmlTransitionTypeTypeFromString(ScxmlPackage.Literals.SCXML_TRANSITION_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScxmlTransitionTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScxmlTransitionTypeTypeToString(ScxmlPackage.Literals.SCXML_TRANSITION_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlPackage getScxmlPackage() {
		return (ScxmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScxmlPackage getPackage() {
		return ScxmlPackage.eINSTANCE;
	}

} //ScxmlFactoryImpl
