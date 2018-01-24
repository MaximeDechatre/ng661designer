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

import org.polarsys.ng661designer.part2.GestureAreaPrimitive;
import org.polarsys.ng661designer.part2.Part2Package;

/**
 * This is the item provider adapter for a {@link org.polarsys.ng661designer.part2.GestureAreaPrimitive} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GestureAreaPrimitiveItemProvider extends TreeTypesItemProvider {
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
	public GestureAreaPrimitiveItemProvider(AdapterFactory adapterFactory) {
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

			addAcceptedGesturePropertyDescriptor(object);
			addBlockedPropertyDescriptor(object);
			addEnablePropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addInheritedBlockedPropertyDescriptor(object);
			addInheritedEnablePropertyDescriptor(object);
			addInheritedVisiblePropertyDescriptor(object);
			addPreventStealingPropertyDescriptor(object);
			addTrackOutsidePropertyDescriptor(object);
			addVisiblePropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addXPropertyDescriptor(object);
			addYPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Accepted Gesture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAcceptedGesturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GestureAreaPrimitive_acceptedGesture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GestureAreaPrimitive_acceptedGesture_feature", "_UI_GestureAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getGestureAreaPrimitive_AcceptedGesture(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_GestureAreaPrimitive_blocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GestureAreaPrimitive_blocked_feature", "_UI_GestureAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getGestureAreaPrimitive_Blocked(),
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
				 getString("_UI_GestureAreaPrimitive_enable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GestureAreaPrimitive_enable_feature", "_UI_GestureAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getGestureAreaPrimitive_Enable(),
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
				 getString("_UI_GestureAreaPrimitive_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GestureAreaPrimitive_height_feature", "_UI_GestureAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getGestureAreaPrimitive_Height(),
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
				 getString("_UI_GestureAreaPrimitive_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GestureAreaPrimitive_id_feature", "_UI_GestureAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getGestureAreaPrimitive_Id(),
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
				 getString("_UI_GestureAreaPrimitive_inheritedBlocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GestureAreaPrimitive_inheritedBlocked_feature", "_UI_GestureAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getGestureAreaPrimitive_InheritedBlocked(),
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
				 getString("_UI_GestureAreaPrimitive_inheritedEnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GestureAreaPrimitive_inheritedEnable_feature", "_UI_GestureAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getGestureAreaPrimitive_InheritedEnable(),
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
				 getString("_UI_GestureAreaPrimitive_inheritedVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GestureAreaPrimitive_inheritedVisible_feature", "_UI_GestureAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getGestureAreaPrimitive_InheritedVisible(),
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
				 getString("_UI_GestureAreaPrimitive_preventStealing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GestureAreaPrimitive_preventStealing_feature", "_UI_GestureAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getGestureAreaPrimitive_PreventStealing(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Track Outside feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrackOutsidePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GestureAreaPrimitive_trackOutside_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GestureAreaPrimitive_trackOutside_feature", "_UI_GestureAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getGestureAreaPrimitive_TrackOutside(),
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
				 getString("_UI_GestureAreaPrimitive_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GestureAreaPrimitive_visible_feature", "_UI_GestureAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getGestureAreaPrimitive_Visible(),
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
				 getString("_UI_GestureAreaPrimitive_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GestureAreaPrimitive_width_feature", "_UI_GestureAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getGestureAreaPrimitive_Width(),
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
				 getString("_UI_GestureAreaPrimitive_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GestureAreaPrimitive_x_feature", "_UI_GestureAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getGestureAreaPrimitive_X(),
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
				 getString("_UI_GestureAreaPrimitive_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GestureAreaPrimitive_y_feature", "_UI_GestureAreaPrimitive_type"),
				 Part2Package.eINSTANCE.getGestureAreaPrimitive_Y(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GestureAreaPrimitive.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GestureAreaPrimitive"));
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
		String label = ((GestureAreaPrimitive)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_GestureAreaPrimitive_type") :
			getString("_UI_GestureAreaPrimitive_type") + " " + label;
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

		switch (notification.getFeatureID(GestureAreaPrimitive.class)) {
			case Part2Package.GESTURE_AREA_PRIMITIVE__ACCEPTED_GESTURE:
			case Part2Package.GESTURE_AREA_PRIMITIVE__BLOCKED:
			case Part2Package.GESTURE_AREA_PRIMITIVE__ENABLE:
			case Part2Package.GESTURE_AREA_PRIMITIVE__HEIGHT:
			case Part2Package.GESTURE_AREA_PRIMITIVE__ID:
			case Part2Package.GESTURE_AREA_PRIMITIVE__INHERITED_BLOCKED:
			case Part2Package.GESTURE_AREA_PRIMITIVE__INHERITED_ENABLE:
			case Part2Package.GESTURE_AREA_PRIMITIVE__INHERITED_VISIBLE:
			case Part2Package.GESTURE_AREA_PRIMITIVE__PREVENT_STEALING:
			case Part2Package.GESTURE_AREA_PRIMITIVE__TRACK_OUTSIDE:
			case Part2Package.GESTURE_AREA_PRIMITIVE__VISIBLE:
			case Part2Package.GESTURE_AREA_PRIMITIVE__WIDTH:
			case Part2Package.GESTURE_AREA_PRIMITIVE__X:
			case Part2Package.GESTURE_AREA_PRIMITIVE__Y:
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
