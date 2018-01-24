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
import org.polarsys.ng661designer.part2.TouchAreaPrimitive;

/**
 * This is the item provider adapter for a {@link org.polarsys.ng661designer.part2.TouchAreaPrimitive} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TouchAreaPrimitiveItemProvider extends TreeTypesItemProvider {
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
	public TouchAreaPrimitiveItemProvider(AdapterFactory adapterFactory) {
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
			addHeightPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addInheritedBlockedPropertyDescriptor(object);
			addInheritedEnablePropertyDescriptor(object);
			addInheritedVisiblePropertyDescriptor(object);
			addMaximumTouchPointsPropertyDescriptor(object);
			addMinimumTouchPointsPropertyDescriptor(object);
			addPassThroughPropertyDescriptor(object);
			addPreventStealingPropertyDescriptor(object);
			addVisiblePropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addXPropertyDescriptor(object);
			addYPropertyDescriptor(object);
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
				 getString("_UI_TouchAreaPrimitive_blocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchAreaPrimitive_blocked_feature", "_UI_TouchAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getTouchAreaPrimitive_Blocked(),
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
				 getString("_UI_TouchAreaPrimitive_enable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchAreaPrimitive_enable_feature", "_UI_TouchAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getTouchAreaPrimitive_Enable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchAreaPrimitive_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchAreaPrimitive_height_feature", "_UI_TouchAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getTouchAreaPrimitive_Height(),
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
				 getString("_UI_TouchAreaPrimitive_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchAreaPrimitive_id_feature", "_UI_TouchAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getTouchAreaPrimitive_Id(),
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
				 getString("_UI_TouchAreaPrimitive_inheritedBlocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchAreaPrimitive_inheritedBlocked_feature", "_UI_TouchAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getTouchAreaPrimitive_InheritedBlocked(),
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
				 getString("_UI_TouchAreaPrimitive_inheritedEnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchAreaPrimitive_inheritedEnable_feature", "_UI_TouchAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getTouchAreaPrimitive_InheritedEnable(),
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
				 getString("_UI_TouchAreaPrimitive_inheritedVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchAreaPrimitive_inheritedVisible_feature", "_UI_TouchAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getTouchAreaPrimitive_InheritedVisible(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Touch Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumTouchPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchAreaPrimitive_maximumTouchPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchAreaPrimitive_maximumTouchPoints_feature", "_UI_TouchAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getTouchAreaPrimitive_MaximumTouchPoints(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Touch Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumTouchPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchAreaPrimitive_minimumTouchPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchAreaPrimitive_minimumTouchPoints_feature", "_UI_TouchAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getTouchAreaPrimitive_MinimumTouchPoints(),
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
				 getString("_UI_TouchAreaPrimitive_passThrough_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchAreaPrimitive_passThrough_feature", "_UI_TouchAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getTouchAreaPrimitive_PassThrough(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Prevent Stealing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreventStealingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchAreaPrimitive_preventStealing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchAreaPrimitive_preventStealing_feature", "_UI_TouchAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getTouchAreaPrimitive_PreventStealing(),
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
				 getString("_UI_TouchAreaPrimitive_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchAreaPrimitive_visible_feature", "_UI_TouchAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getTouchAreaPrimitive_Visible(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchAreaPrimitive_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchAreaPrimitive_width_feature", "_UI_TouchAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getTouchAreaPrimitive_Width(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchAreaPrimitive_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchAreaPrimitive_x_feature", "_UI_TouchAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getTouchAreaPrimitive_X(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchAreaPrimitive_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchAreaPrimitive_y_feature", "_UI_TouchAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getTouchAreaPrimitive_Y(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TouchAreaPrimitive.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TouchAreaPrimitive"));
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
		String label = ((TouchAreaPrimitive)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_TouchAreaPrimitive_type") :
			getString("_UI_TouchAreaPrimitive_type") + " " + label;
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

		switch (notification.getFeatureID(TouchAreaPrimitive.class)) {
			case Part2Package.TOUCH_AREA_PRIMITIVE__BLOCKED:
			case Part2Package.TOUCH_AREA_PRIMITIVE__ENABLE:
			case Part2Package.TOUCH_AREA_PRIMITIVE__HEIGHT:
			case Part2Package.TOUCH_AREA_PRIMITIVE__ID:
			case Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_BLOCKED:
			case Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_ENABLE:
			case Part2Package.TOUCH_AREA_PRIMITIVE__INHERITED_VISIBLE:
			case Part2Package.TOUCH_AREA_PRIMITIVE__MAXIMUM_TOUCH_POINTS:
			case Part2Package.TOUCH_AREA_PRIMITIVE__MINIMUM_TOUCH_POINTS:
			case Part2Package.TOUCH_AREA_PRIMITIVE__PASS_THROUGH:
			case Part2Package.TOUCH_AREA_PRIMITIVE__PREVENT_STEALING:
			case Part2Package.TOUCH_AREA_PRIMITIVE__VISIBLE:
			case Part2Package.TOUCH_AREA_PRIMITIVE__WIDTH:
			case Part2Package.TOUCH_AREA_PRIMITIVE__X:
			case Part2Package.TOUCH_AREA_PRIMITIVE__Y:
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
