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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.ng661designer.part2.InterfaceType;
import org.polarsys.ng661designer.part2.Part2Factory;
import org.polarsys.ng661designer.part2.Part2Package;

/**
 * This is the item provider adapter for a {@link org.polarsys.ng661designer.part2.InterfaceType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceTypeItemProvider 
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
	public InterfaceTypeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(Part2Package.eINSTANCE.getInterfaceType_Import());
			childrenFeatures.add(Part2Package.eINSTANCE.getInterfaceType_Property());
			childrenFeatures.add(Part2Package.eINSTANCE.getInterfaceType_ArrayProperty());
			childrenFeatures.add(Part2Package.eINSTANCE.getInterfaceType_StructProperty());
			childrenFeatures.add(Part2Package.eINSTANCE.getInterfaceType_EnumProperty());
			childrenFeatures.add(Part2Package.eINSTANCE.getInterfaceType_UnionProperty());
			childrenFeatures.add(Part2Package.eINSTANCE.getInterfaceType_Event());
			childrenFeatures.add(Part2Package.eINSTANCE.getInterfaceType_ArrayEvent());
			childrenFeatures.add(Part2Package.eINSTANCE.getInterfaceType_StructEvent());
			childrenFeatures.add(Part2Package.eINSTANCE.getInterfaceType_EnumEvent());
			childrenFeatures.add(Part2Package.eINSTANCE.getInterfaceType_UnionEvent());
			childrenFeatures.add(Part2Package.eINSTANCE.getInterfaceType_Operation());
			childrenFeatures.add(Part2Package.eINSTANCE.getInterfaceType_PublicFunction());
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
	 * This returns InterfaceType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InterfaceType"));
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
		return getString("_UI_InterfaceType_type");
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

		switch (notification.getFeatureID(InterfaceType.class)) {
			case Part2Package.INTERFACE_TYPE__IMPORT:
			case Part2Package.INTERFACE_TYPE__PROPERTY:
			case Part2Package.INTERFACE_TYPE__ARRAY_PROPERTY:
			case Part2Package.INTERFACE_TYPE__STRUCT_PROPERTY:
			case Part2Package.INTERFACE_TYPE__ENUM_PROPERTY:
			case Part2Package.INTERFACE_TYPE__UNION_PROPERTY:
			case Part2Package.INTERFACE_TYPE__EVENT:
			case Part2Package.INTERFACE_TYPE__ARRAY_EVENT:
			case Part2Package.INTERFACE_TYPE__STRUCT_EVENT:
			case Part2Package.INTERFACE_TYPE__ENUM_EVENT:
			case Part2Package.INTERFACE_TYPE__UNION_EVENT:
			case Part2Package.INTERFACE_TYPE__OPERATION:
			case Part2Package.INTERFACE_TYPE__PUBLIC_FUNCTION:
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
				(Part2Package.eINSTANCE.getInterfaceType_Import(),
				 Part2Factory.eINSTANCE.createImportType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getInterfaceType_Property(),
				 Part2Factory.eINSTANCE.createPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getInterfaceType_ArrayProperty(),
				 Part2Factory.eINSTANCE.createArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getInterfaceType_StructProperty(),
				 Part2Factory.eINSTANCE.createStructPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getInterfaceType_EnumProperty(),
				 Part2Factory.eINSTANCE.createPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getInterfaceType_UnionProperty(),
				 Part2Factory.eINSTANCE.createUnionPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getInterfaceType_Event(),
				 Part2Factory.eINSTANCE.createEventType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getInterfaceType_ArrayEvent(),
				 Part2Factory.eINSTANCE.createArrayEventType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getInterfaceType_StructEvent(),
				 Part2Factory.eINSTANCE.createStructEventType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getInterfaceType_EnumEvent(),
				 Part2Factory.eINSTANCE.createEventType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getInterfaceType_UnionEvent(),
				 Part2Factory.eINSTANCE.createUnionEventType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getInterfaceType_Operation(),
				 Part2Factory.eINSTANCE.createOperationType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getInterfaceType_PublicFunction(),
				 Part2Factory.eINSTANCE.createFunctionType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Part2Package.eINSTANCE.getInterfaceType_Property() ||
			childFeature == Part2Package.eINSTANCE.getInterfaceType_EnumProperty() ||
			childFeature == Part2Package.eINSTANCE.getInterfaceType_Event() ||
			childFeature == Part2Package.eINSTANCE.getInterfaceType_EnumEvent();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
