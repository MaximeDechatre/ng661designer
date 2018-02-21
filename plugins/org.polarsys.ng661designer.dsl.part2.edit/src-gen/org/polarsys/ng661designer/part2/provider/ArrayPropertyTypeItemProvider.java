/**
 * Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.part2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.ng661designer.part2.ArrayPropertyType;
import org.polarsys.ng661designer.part2.Part2Factory;
import org.polarsys.ng661designer.part2.Part2Package;

/**
 * This is the item provider adapter for a {@link org.polarsys.ng661designer.part2.ArrayPropertyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrayPropertyTypeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayPropertyTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addMaxNumberOfEntriesPropertyDescriptor(object);
			addModalityPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNumberOfEntriesPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Max Number Of Entries feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxNumberOfEntriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArrayPropertyType_maxNumberOfEntries_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArrayPropertyType_maxNumberOfEntries_feature", "_UI_ArrayPropertyType_type"),
				 Part2Package.eINSTANCE.getArrayPropertyType_MaxNumberOfEntries(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArrayPropertyType_modality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArrayPropertyType_modality_feature", "_UI_ArrayPropertyType_type"),
				 Part2Package.eINSTANCE.getArrayPropertyType_Modality(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArrayPropertyType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArrayPropertyType_name_feature", "_UI_ArrayPropertyType_type"),
				 Part2Package.eINSTANCE.getArrayPropertyType_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Entries feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfEntriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArrayPropertyType_numberOfEntries_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArrayPropertyType_numberOfEntries_feature", "_UI_ArrayPropertyType_type"),
				 Part2Package.eINSTANCE.getArrayPropertyType_NumberOfEntries(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArrayPropertyType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArrayPropertyType_type_feature", "_UI_ArrayPropertyType_type"),
				 Part2Package.eINSTANCE.getArrayPropertyType_Type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Part2Package.eINSTANCE.getArrayPropertyType_Entry());
			childrenFeatures.add(Part2Package.eINSTANCE.getArrayPropertyType_OtherEntries());
			childrenFeatures.add(Part2Package.eINSTANCE.getArrayPropertyType_ArrayEntry());
			childrenFeatures.add(Part2Package.eINSTANCE.getArrayPropertyType_OtherArrayEntries());
			childrenFeatures.add(Part2Package.eINSTANCE.getArrayPropertyType_StructEntry());
			childrenFeatures.add(Part2Package.eINSTANCE.getArrayPropertyType_OtherStructEntries());
			childrenFeatures.add(Part2Package.eINSTANCE.getArrayPropertyType_UnionEntry());
			childrenFeatures.add(Part2Package.eINSTANCE.getArrayPropertyType_OtherUnionEntries());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ArrayPropertyType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArrayPropertyType"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ArrayPropertyType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ArrayPropertyType_type") :
			getString("_UI_ArrayPropertyType_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ArrayPropertyType.class)) {
			case Part2Package.ARRAY_PROPERTY_TYPE__MAX_NUMBER_OF_ENTRIES:
			case Part2Package.ARRAY_PROPERTY_TYPE__MODALITY:
			case Part2Package.ARRAY_PROPERTY_TYPE__NAME:
			case Part2Package.ARRAY_PROPERTY_TYPE__NUMBER_OF_ENTRIES:
			case Part2Package.ARRAY_PROPERTY_TYPE__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Part2Package.ARRAY_PROPERTY_TYPE__ENTRY:
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ENTRIES:
			case Part2Package.ARRAY_PROPERTY_TYPE__ARRAY_ENTRY:
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_ARRAY_ENTRIES:
			case Part2Package.ARRAY_PROPERTY_TYPE__STRUCT_ENTRY:
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_STRUCT_ENTRIES:
			case Part2Package.ARRAY_PROPERTY_TYPE__UNION_ENTRY:
			case Part2Package.ARRAY_PROPERTY_TYPE__OTHER_UNION_ENTRIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getArrayPropertyType_Entry(),
				 Part2Factory.eINSTANCE.createEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getArrayPropertyType_OtherEntries(),
				 Part2Factory.eINSTANCE.createOtherEntriesType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getArrayPropertyType_ArrayEntry(),
				 Part2Factory.eINSTANCE.createArrayEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getArrayPropertyType_OtherArrayEntries(),
				 Part2Factory.eINSTANCE.createOtherArrayEntriesType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getArrayPropertyType_StructEntry(),
				 Part2Factory.eINSTANCE.createStructEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getArrayPropertyType_OtherStructEntries(),
				 Part2Factory.eINSTANCE.createOtherStructEntriesType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getArrayPropertyType_UnionEntry(),
				 Part2Factory.eINSTANCE.createUnionEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getArrayPropertyType_OtherUnionEntries(),
				 Part2Factory.eINSTANCE.createOtherUnionEntriesType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return NG661Part2EditPlugin.INSTANCE;
	}

}
