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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive;

/**
 * This is the item provider adapter for a {@link org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScrollWheelInputPrimitiveItemProvider extends TreeTypesItemProvider {
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
	public ScrollWheelInputPrimitiveItemProvider(AdapterFactory adapterFactory) {
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

			addBlockedPropertyDescriptor(object);
			addEnablePropertyDescriptor(object);
			addFocusPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addInheritedBlockedPropertyDescriptor(object);
			addInheritedEnablePropertyDescriptor(object);
			addInheritedVisiblePropertyDescriptor(object);
			addNeedFocusPropertyDescriptor(object);
			addPassThroughPropertyDescriptor(object);
			addVisiblePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Blocked feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScrollWheelInputPrimitive_blocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScrollWheelInputPrimitive_blocked_feature", "_UI_ScrollWheelInputPrimitive_type"),
				 Part2Package.eINSTANCE.getScrollWheelInputPrimitive_Blocked(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScrollWheelInputPrimitive_enable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScrollWheelInputPrimitive_enable_feature", "_UI_ScrollWheelInputPrimitive_type"),
				 Part2Package.eINSTANCE.getScrollWheelInputPrimitive_Enable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Focus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFocusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScrollWheelInputPrimitive_focus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScrollWheelInputPrimitive_focus_feature", "_UI_ScrollWheelInputPrimitive_type"),
				 Part2Package.eINSTANCE.getScrollWheelInputPrimitive_Focus(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScrollWheelInputPrimitive_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScrollWheelInputPrimitive_id_feature", "_UI_ScrollWheelInputPrimitive_type"),
				 Part2Package.eINSTANCE.getScrollWheelInputPrimitive_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherited Blocked feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedBlockedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScrollWheelInputPrimitive_inheritedBlocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScrollWheelInputPrimitive_inheritedBlocked_feature", "_UI_ScrollWheelInputPrimitive_type"),
				 Part2Package.eINSTANCE.getScrollWheelInputPrimitive_InheritedBlocked(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherited Enable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedEnablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScrollWheelInputPrimitive_inheritedEnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScrollWheelInputPrimitive_inheritedEnable_feature", "_UI_ScrollWheelInputPrimitive_type"),
				 Part2Package.eINSTANCE.getScrollWheelInputPrimitive_InheritedEnable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherited Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScrollWheelInputPrimitive_inheritedVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScrollWheelInputPrimitive_inheritedVisible_feature", "_UI_ScrollWheelInputPrimitive_type"),
				 Part2Package.eINSTANCE.getScrollWheelInputPrimitive_InheritedVisible(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Need Focus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNeedFocusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScrollWheelInputPrimitive_needFocus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScrollWheelInputPrimitive_needFocus_feature", "_UI_ScrollWheelInputPrimitive_type"),
				 Part2Package.eINSTANCE.getScrollWheelInputPrimitive_NeedFocus(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pass Through feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassThroughPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScrollWheelInputPrimitive_passThrough_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScrollWheelInputPrimitive_passThrough_feature", "_UI_ScrollWheelInputPrimitive_type"),
				 Part2Package.eINSTANCE.getScrollWheelInputPrimitive_PassThrough(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScrollWheelInputPrimitive_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScrollWheelInputPrimitive_visible_feature", "_UI_ScrollWheelInputPrimitive_type"),
				 Part2Package.eINSTANCE.getScrollWheelInputPrimitive_Visible(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ScrollWheelInputPrimitive.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScrollWheelInputPrimitive"));
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
		String label = ((ScrollWheelInputPrimitive)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ScrollWheelInputPrimitive_type") :
			getString("_UI_ScrollWheelInputPrimitive_type") + " " + label;
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

		switch (notification.getFeatureID(ScrollWheelInputPrimitive.class)) {
			case Part2Package.SCROLL_WHEEL_INPUT_PRIMITIVE__BLOCKED:
			case Part2Package.SCROLL_WHEEL_INPUT_PRIMITIVE__ENABLE:
			case Part2Package.SCROLL_WHEEL_INPUT_PRIMITIVE__FOCUS:
			case Part2Package.SCROLL_WHEEL_INPUT_PRIMITIVE__ID:
			case Part2Package.SCROLL_WHEEL_INPUT_PRIMITIVE__INHERITED_BLOCKED:
			case Part2Package.SCROLL_WHEEL_INPUT_PRIMITIVE__INHERITED_ENABLE:
			case Part2Package.SCROLL_WHEEL_INPUT_PRIMITIVE__INHERITED_VISIBLE:
			case Part2Package.SCROLL_WHEEL_INPUT_PRIMITIVE__NEED_FOCUS:
			case Part2Package.SCROLL_WHEEL_INPUT_PRIMITIVE__PASS_THROUGH:
			case Part2Package.SCROLL_WHEEL_INPUT_PRIMITIVE__VISIBLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
