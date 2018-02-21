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

import java.math.BigInteger;

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

import org.polarsys.ng661designer.part2.ArrayEntryType;
import org.polarsys.ng661designer.part2.ArrayPropertyType;
import org.polarsys.ng661designer.part2.EntryType;
import org.polarsys.ng661designer.part2.ModalityType2;
import org.polarsys.ng661designer.part2.OtherArrayEntriesType;
import org.polarsys.ng661designer.part2.OtherEntriesType;
import org.polarsys.ng661designer.part2.OtherStructEntriesType;
import org.polarsys.ng661designer.part2.OtherUnionEntriesType;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.StructEntryType;
import org.polarsys.ng661designer.part2.UnionEntryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayPropertyTypeImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayPropertyTypeImpl#getOtherEntries <em>Other Entries</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayPropertyTypeImpl#getArrayEntry <em>Array Entry</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayPropertyTypeImpl#getOtherArrayEntries <em>Other Array Entries</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayPropertyTypeImpl#getStructEntry <em>Struct Entry</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayPropertyTypeImpl#getOtherStructEntries <em>Other Struct Entries</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayPropertyTypeImpl#getUnionEntry <em>Union Entry</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayPropertyTypeImpl#getOtherUnionEntries <em>Other Union Entries</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayPropertyTypeImpl#getMaxNumberOfEntries <em>Max Number Of Entries</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayPropertyTypeImpl#getModality <em>Modality</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayPropertyTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayPropertyTypeImpl#getNumberOfEntries <em>Number Of Entries</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.ArrayPropertyTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayPropertyTypeImpl extends MinimalEObjectImpl.Container implements ArrayPropertyType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryType> entry;

	/**
	 * The cached value of the '{@link #getOtherEntries() <em>Other Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEntries()
	 * @generated
	 * @ordered
	 */
	protected OtherEntriesType otherEntries;

	/**
	 * The cached value of the '{@link #getArrayEntry() <em>Array Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayEntryType> arrayEntry;

	/**
	 * The cached value of the '{@link #getOtherArrayEntries() <em>Other Array Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherArrayEntries()
	 * @generated
	 * @ordered
	 */
	protected OtherArrayEntriesType otherArrayEntries;

	/**
	 * The cached value of the '{@link #getStructEntry() <em>Struct Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<StructEntryType> structEntry;

	/**
	 * The cached value of the '{@link #getOtherStructEntries() <em>Other Struct Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherStructEntries()
	 * @generated
	 * @ordered
	 */
	protected OtherStructEntriesType otherStructEntries;

	/**
	 * The cached value of the '{@link #getUnionEntry() <em>Union Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnionEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<UnionEntryType> unionEntry;

	/**
	 * The cached value of the '{@link #getOtherUnionEntries() <em>Other Union Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherUnionEntries()
	 * @generated
	 * @ordered
	 */
	protected OtherUnionEntriesType otherUnionEntries;

	/**
	 * The default value of the '{@link #getMaxNumberOfEntries() <em>Max Number Of Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfEntries()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_NUMBER_OF_ENTRIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumberOfEntries() <em>Max Number Of Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfEntries()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxNumberOfEntries = MAX_NUMBER_OF_ENTRIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getModality() <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected static final ModalityType2 MODALITY_EDEFAULT = ModalityType2.IN_OUT;

	/**
	 * The cached value of the '{@link #getModality() <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected ModalityType2 modality = MODALITY_EDEFAULT;

	/**
	 * This is true if the Modality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modalityESet;

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
	 * The default value of the '{@link #getNumberOfEntries() <em>Number Of Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfEntries()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_OF_ENTRIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfEntries() <em>Number Of Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfEntries()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberOfEntries = NUMBER_OF_ENTRIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getArrayPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryType> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<EntryType>(EntryType.class, this, Part2Package.ARRAY_PROPERTY_TYPE__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherEntriesType getOtherEntries() {
		return otherEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherEntries(OtherEntriesType newOtherEntries, NotificationChain msgs) {
		OtherEntriesType oldOtherEntries = otherEntries;
		otherEntries = newOtherEntries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ENTRIES, oldOtherEntries, newOtherEntries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherEntries(OtherEntriesType newOtherEntries) {
		if (newOtherEntries != otherEntries) {
			NotificationChain msgs = null;
			if (otherEntries != null)
				msgs = ((InternalEObject)otherEntries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ENTRIES, null, msgs);
			if (newOtherEntries != null)
				msgs = ((InternalEObject)newOtherEntries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ENTRIES, null, msgs);
			msgs = basicSetOtherEntries(newOtherEntries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ENTRIES, newOtherEntries, newOtherEntries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayEntryType> getArrayEntry() {
		if (arrayEntry == null) {
			arrayEntry = new EObjectContainmentEList<ArrayEntryType>(ArrayEntryType.class, this, Part2Package.ARRAY_PROPERTY_TYPE__ARRAY_ENTRY);
		}
		return arrayEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherArrayEntriesType getOtherArrayEntries() {
		return otherArrayEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherArrayEntries(OtherArrayEntriesType newOtherArrayEntries, NotificationChain msgs) {
		OtherArrayEntriesType oldOtherArrayEntries = otherArrayEntries;
		otherArrayEntries = newOtherArrayEntries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ARRAY_ENTRIES, oldOtherArrayEntries, newOtherArrayEntries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherArrayEntries(OtherArrayEntriesType newOtherArrayEntries) {
		if (newOtherArrayEntries != otherArrayEntries) {
			NotificationChain msgs = null;
			if (otherArrayEntries != null)
				msgs = ((InternalEObject)otherArrayEntries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ARRAY_ENTRIES, null, msgs);
			if (newOtherArrayEntries != null)
				msgs = ((InternalEObject)newOtherArrayEntries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ARRAY_ENTRIES, null, msgs);
			msgs = basicSetOtherArrayEntries(newOtherArrayEntries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ARRAY_ENTRIES, newOtherArrayEntries, newOtherArrayEntries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructEntryType> getStructEntry() {
		if (structEntry == null) {
			structEntry = new EObjectContainmentEList<StructEntryType>(StructEntryType.class, this, Part2Package.ARRAY_PROPERTY_TYPE__STRUCT_ENTRY);
		}
		return structEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherStructEntriesType getOtherStructEntries() {
		return otherStructEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherStructEntries(OtherStructEntriesType newOtherStructEntries, NotificationChain msgs) {
		OtherStructEntriesType oldOtherStructEntries = otherStructEntries;
		otherStructEntries = newOtherStructEntries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_PROPERTY_TYPE__OTHER_STRUCT_ENTRIES, oldOtherStructEntries, newOtherStructEntries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherStructEntries(OtherStructEntriesType newOtherStructEntries) {
		if (newOtherStructEntries != otherStructEntries) {
			NotificationChain msgs = null;
			if (otherStructEntries != null)
				msgs = ((InternalEObject)otherStructEntries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Part2Package.ARRAY_PROPERTY_TYPE__OTHER_STRUCT_ENTRIES, null, msgs);
			if (newOtherStructEntries != null)
				msgs = ((InternalEObject)newOtherStructEntries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Part2Package.ARRAY_PROPERTY_TYPE__OTHER_STRUCT_ENTRIES, null, msgs);
			msgs = basicSetOtherStructEntries(newOtherStructEntries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_PROPERTY_TYPE__OTHER_STRUCT_ENTRIES, newOtherStructEntries, newOtherStructEntries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnionEntryType> getUnionEntry() {
		if (unionEntry == null) {
			unionEntry = new EObjectContainmentEList<UnionEntryType>(UnionEntryType.class, this, Part2Package.ARRAY_PROPERTY_TYPE__UNION_ENTRY);
		}
		return unionEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherUnionEntriesType getOtherUnionEntries() {
		return otherUnionEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherUnionEntries(OtherUnionEntriesType newOtherUnionEntries, NotificationChain msgs) {
		OtherUnionEntriesType oldOtherUnionEntries = otherUnionEntries;
		otherUnionEntries = newOtherUnionEntries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_PROPERTY_TYPE__OTHER_UNION_ENTRIES, oldOtherUnionEntries, newOtherUnionEntries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherUnionEntries(OtherUnionEntriesType newOtherUnionEntries) {
		if (newOtherUnionEntries != otherUnionEntries) {
			NotificationChain msgs = null;
			if (otherUnionEntries != null)
				msgs = ((InternalEObject)otherUnionEntries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Part2Package.ARRAY_PROPERTY_TYPE__OTHER_UNION_ENTRIES, null, msgs);
			if (newOtherUnionEntries != null)
				msgs = ((InternalEObject)newOtherUnionEntries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Part2Package.ARRAY_PROPERTY_TYPE__OTHER_UNION_ENTRIES, null, msgs);
			msgs = basicSetOtherUnionEntries(newOtherUnionEntries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_PROPERTY_TYPE__OTHER_UNION_ENTRIES, newOtherUnionEntries, newOtherUnionEntries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxNumberOfEntries() {
		return maxNumberOfEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumberOfEntries(BigInteger newMaxNumberOfEntries) {
		BigInteger oldMaxNumberOfEntries = maxNumberOfEntries;
		maxNumberOfEntries = newMaxNumberOfEntries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_PROPERTY_TYPE__MAX_NUMBER_OF_ENTRIES, oldMaxNumberOfEntries, maxNumberOfEntries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityType2 getModality() {
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModality(ModalityType2 newModality) {
		ModalityType2 oldModality = modality;
		modality = newModality == null ? MODALITY_EDEFAULT : newModality;
		boolean oldModalityESet = modalityESet;
		modalityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_PROPERTY_TYPE__MODALITY, oldModality, modality, !oldModalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModality() {
		ModalityType2 oldModality = modality;
		boolean oldModalityESet = modalityESet;
		modality = MODALITY_EDEFAULT;
		modalityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.ARRAY_PROPERTY_TYPE__MODALITY, oldModality, MODALITY_EDEFAULT, oldModalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModality() {
		return modalityESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_PROPERTY_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberOfEntries() {
		return numberOfEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfEntries(BigInteger newNumberOfEntries) {
		BigInteger oldNumberOfEntries = numberOfEntries;
		numberOfEntries = newNumberOfEntries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_PROPERTY_TYPE__NUMBER_OF_ENTRIES, oldNumberOfEntries, numberOfEntries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.ARRAY_PROPERTY_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.ARRAY_PROPERTY_TYPE__ENTRY:
				return ((InternalEList<?>)getEntry()).basicRemove(otherEnd, msgs);
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ENTRIES:
				return basicSetOtherEntries(null, msgs);
			case Part2Package.ARRAY_PROPERTY_TYPE__ARRAY_ENTRY:
				return ((InternalEList<?>)getArrayEntry()).basicRemove(otherEnd, msgs);
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ARRAY_ENTRIES:
				return basicSetOtherArrayEntries(null, msgs);
			case Part2Package.ARRAY_PROPERTY_TYPE__STRUCT_ENTRY:
				return ((InternalEList<?>)getStructEntry()).basicRemove(otherEnd, msgs);
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_STRUCT_ENTRIES:
				return basicSetOtherStructEntries(null, msgs);
			case Part2Package.ARRAY_PROPERTY_TYPE__UNION_ENTRY:
				return ((InternalEList<?>)getUnionEntry()).basicRemove(otherEnd, msgs);
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_UNION_ENTRIES:
				return basicSetOtherUnionEntries(null, msgs);
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
			case Part2Package.ARRAY_PROPERTY_TYPE__ENTRY:
				return getEntry();
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ENTRIES:
				return getOtherEntries();
			case Part2Package.ARRAY_PROPERTY_TYPE__ARRAY_ENTRY:
				return getArrayEntry();
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ARRAY_ENTRIES:
				return getOtherArrayEntries();
			case Part2Package.ARRAY_PROPERTY_TYPE__STRUCT_ENTRY:
				return getStructEntry();
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_STRUCT_ENTRIES:
				return getOtherStructEntries();
			case Part2Package.ARRAY_PROPERTY_TYPE__UNION_ENTRY:
				return getUnionEntry();
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_UNION_ENTRIES:
				return getOtherUnionEntries();
			case Part2Package.ARRAY_PROPERTY_TYPE__MAX_NUMBER_OF_ENTRIES:
				return getMaxNumberOfEntries();
			case Part2Package.ARRAY_PROPERTY_TYPE__MODALITY:
				return getModality();
			case Part2Package.ARRAY_PROPERTY_TYPE__NAME:
				return getName();
			case Part2Package.ARRAY_PROPERTY_TYPE__NUMBER_OF_ENTRIES:
				return getNumberOfEntries();
			case Part2Package.ARRAY_PROPERTY_TYPE__TYPE:
				return getType();
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
			case Part2Package.ARRAY_PROPERTY_TYPE__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends EntryType>)newValue);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ENTRIES:
				setOtherEntries((OtherEntriesType)newValue);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__ARRAY_ENTRY:
				getArrayEntry().clear();
				getArrayEntry().addAll((Collection<? extends ArrayEntryType>)newValue);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ARRAY_ENTRIES:
				setOtherArrayEntries((OtherArrayEntriesType)newValue);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__STRUCT_ENTRY:
				getStructEntry().clear();
				getStructEntry().addAll((Collection<? extends StructEntryType>)newValue);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_STRUCT_ENTRIES:
				setOtherStructEntries((OtherStructEntriesType)newValue);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__UNION_ENTRY:
				getUnionEntry().clear();
				getUnionEntry().addAll((Collection<? extends UnionEntryType>)newValue);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_UNION_ENTRIES:
				setOtherUnionEntries((OtherUnionEntriesType)newValue);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__MAX_NUMBER_OF_ENTRIES:
				setMaxNumberOfEntries((BigInteger)newValue);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__MODALITY:
				setModality((ModalityType2)newValue);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__NAME:
				setName((String)newValue);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__NUMBER_OF_ENTRIES:
				setNumberOfEntries((BigInteger)newValue);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__TYPE:
				setType((String)newValue);
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
			case Part2Package.ARRAY_PROPERTY_TYPE__ENTRY:
				getEntry().clear();
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ENTRIES:
				setOtherEntries((OtherEntriesType)null);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__ARRAY_ENTRY:
				getArrayEntry().clear();
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ARRAY_ENTRIES:
				setOtherArrayEntries((OtherArrayEntriesType)null);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__STRUCT_ENTRY:
				getStructEntry().clear();
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_STRUCT_ENTRIES:
				setOtherStructEntries((OtherStructEntriesType)null);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__UNION_ENTRY:
				getUnionEntry().clear();
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_UNION_ENTRIES:
				setOtherUnionEntries((OtherUnionEntriesType)null);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__MAX_NUMBER_OF_ENTRIES:
				setMaxNumberOfEntries(MAX_NUMBER_OF_ENTRIES_EDEFAULT);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__MODALITY:
				unsetModality();
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__NUMBER_OF_ENTRIES:
				setNumberOfEntries(NUMBER_OF_ENTRIES_EDEFAULT);
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case Part2Package.ARRAY_PROPERTY_TYPE__ENTRY:
				return entry != null && !entry.isEmpty();
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ENTRIES:
				return otherEntries != null;
			case Part2Package.ARRAY_PROPERTY_TYPE__ARRAY_ENTRY:
				return arrayEntry != null && !arrayEntry.isEmpty();
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ARRAY_ENTRIES:
				return otherArrayEntries != null;
			case Part2Package.ARRAY_PROPERTY_TYPE__STRUCT_ENTRY:
				return structEntry != null && !structEntry.isEmpty();
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_STRUCT_ENTRIES:
				return otherStructEntries != null;
			case Part2Package.ARRAY_PROPERTY_TYPE__UNION_ENTRY:
				return unionEntry != null && !unionEntry.isEmpty();
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_UNION_ENTRIES:
				return otherUnionEntries != null;
			case Part2Package.ARRAY_PROPERTY_TYPE__MAX_NUMBER_OF_ENTRIES:
				return MAX_NUMBER_OF_ENTRIES_EDEFAULT == null ? maxNumberOfEntries != null : !MAX_NUMBER_OF_ENTRIES_EDEFAULT.equals(maxNumberOfEntries);
			case Part2Package.ARRAY_PROPERTY_TYPE__MODALITY:
				return isSetModality();
			case Part2Package.ARRAY_PROPERTY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Part2Package.ARRAY_PROPERTY_TYPE__NUMBER_OF_ENTRIES:
				return NUMBER_OF_ENTRIES_EDEFAULT == null ? numberOfEntries != null : !NUMBER_OF_ENTRIES_EDEFAULT.equals(numberOfEntries);
			case Part2Package.ARRAY_PROPERTY_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (maxNumberOfEntries: ");
		result.append(maxNumberOfEntries);
		result.append(", modality: ");
		if (modalityESet) result.append(modality); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", numberOfEntries: ");
		result.append(numberOfEntries);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ArrayPropertyTypeImpl
