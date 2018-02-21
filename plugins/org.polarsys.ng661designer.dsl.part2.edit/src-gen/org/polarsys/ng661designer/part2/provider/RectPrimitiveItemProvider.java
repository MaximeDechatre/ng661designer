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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.ng661designer.part2.Part2Factory;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.RectPrimitive;

/**
 * This is the item provider adapter for a {@link org.polarsys.ng661designer.part2.RectPrimitive} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RectPrimitiveItemProvider extends ClipPathTypesItemProvider {
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
	public RectPrimitiveItemProvider(AdapterFactory adapterFactory) {
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
			addDrawingPriorityPropertyDescriptor(object);
			addEnablePropertyDescriptor(object);
			addFillPropertyDescriptor(object);
			addFillOpacityPropertyDescriptor(object);
			addFillRulePropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addInheritedBlockedPropertyDescriptor(object);
			addInheritedEnablePropertyDescriptor(object);
			addInheritedVisiblePropertyDescriptor(object);
			addRxPropertyDescriptor(object);
			addRyPropertyDescriptor(object);
			addStrokePropertyDescriptor(object);
			addStrokeDasharrayPropertyDescriptor(object);
			addStrokeDashoffsetPropertyDescriptor(object);
			addStrokeLinecapPropertyDescriptor(object);
			addStrokeLinejoinPropertyDescriptor(object);
			addStrokeMiterlimitPropertyDescriptor(object);
			addStrokeOpacityPropertyDescriptor(object);
			addStrokewidthPropertyDescriptor(object);
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
				 getString("_UI_RectPrimitive_blocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_blocked_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_Blocked(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Drawing Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDrawingPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectPrimitive_drawingPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_drawingPriority_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_DrawingPriority(),
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
				 getString("_UI_RectPrimitive_enable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_enable_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_Enable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fill feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFillPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectPrimitive_fill_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_fill_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_Fill(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fill Opacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFillOpacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectPrimitive_fillOpacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_fillOpacity_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_FillOpacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fill Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFillRulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectPrimitive_fillRule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_fillRule_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_FillRule(),
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
				 getString("_UI_RectPrimitive_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_height_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_Height(),
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
				 getString("_UI_RectPrimitive_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_id_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_Id(),
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
				 getString("_UI_RectPrimitive_inheritedBlocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_inheritedBlocked_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_InheritedBlocked(),
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
				 getString("_UI_RectPrimitive_inheritedEnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_inheritedEnable_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_InheritedEnable(),
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
				 getString("_UI_RectPrimitive_inheritedVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_inheritedVisible_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_InheritedVisible(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rx feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectPrimitive_rx_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_rx_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_Rx(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ry feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectPrimitive_ry_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_ry_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_Ry(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectPrimitive_stroke_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_stroke_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_Stroke(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke Dasharray feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeDasharrayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectPrimitive_strokeDasharray_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_strokeDasharray_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_StrokeDasharray(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke Dashoffset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeDashoffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectPrimitive_strokeDashoffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_strokeDashoffset_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_StrokeDashoffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke Linecap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeLinecapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectPrimitive_strokeLinecap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_strokeLinecap_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_StrokeLinecap(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke Linejoin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeLinejoinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectPrimitive_strokeLinejoin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_strokeLinejoin_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_StrokeLinejoin(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke Miterlimit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeMiterlimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectPrimitive_strokeMiterlimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_strokeMiterlimit_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_StrokeMiterlimit(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke Opacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeOpacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectPrimitive_strokeOpacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_strokeOpacity_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_StrokeOpacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strokewidth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokewidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectPrimitive_strokewidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_strokewidth_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_Strokewidth(),
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
				 getString("_UI_RectPrimitive_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_visible_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_Visible(),
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
				 getString("_UI_RectPrimitive_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_width_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_Width(),
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
				 getString("_UI_RectPrimitive_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_x_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_X(),
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
				 getString("_UI_RectPrimitive_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectPrimitive_y_feature", "_UI_RectPrimitive_type"),
				 Part2Package.eINSTANCE.getRectPrimitive_Y(),
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
			childrenFeatures.add(Part2Package.eINSTANCE.getRectPrimitive_ChildElements());
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
	 * This returns RectPrimitive.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RectPrimitive"));
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
		String label = ((RectPrimitive)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_RectPrimitive_type") :
			getString("_UI_RectPrimitive_type") + " " + label;
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

		switch (notification.getFeatureID(RectPrimitive.class)) {
			case Part2Package.RECT_PRIMITIVE__BLOCKED:
			case Part2Package.RECT_PRIMITIVE__DRAWING_PRIORITY:
			case Part2Package.RECT_PRIMITIVE__ENABLE:
			case Part2Package.RECT_PRIMITIVE__FILL:
			case Part2Package.RECT_PRIMITIVE__FILL_OPACITY:
			case Part2Package.RECT_PRIMITIVE__FILL_RULE:
			case Part2Package.RECT_PRIMITIVE__HEIGHT:
			case Part2Package.RECT_PRIMITIVE__ID:
			case Part2Package.RECT_PRIMITIVE__INHERITED_BLOCKED:
			case Part2Package.RECT_PRIMITIVE__INHERITED_ENABLE:
			case Part2Package.RECT_PRIMITIVE__INHERITED_VISIBLE:
			case Part2Package.RECT_PRIMITIVE__RX:
			case Part2Package.RECT_PRIMITIVE__RY:
			case Part2Package.RECT_PRIMITIVE__STROKE:
			case Part2Package.RECT_PRIMITIVE__STROKE_DASHARRAY:
			case Part2Package.RECT_PRIMITIVE__STROKE_DASHOFFSET:
			case Part2Package.RECT_PRIMITIVE__STROKE_LINECAP:
			case Part2Package.RECT_PRIMITIVE__STROKE_LINEJOIN:
			case Part2Package.RECT_PRIMITIVE__STROKE_MITERLIMIT:
			case Part2Package.RECT_PRIMITIVE__STROKE_OPACITY:
			case Part2Package.RECT_PRIMITIVE__STROKEWIDTH:
			case Part2Package.RECT_PRIMITIVE__VISIBLE:
			case Part2Package.RECT_PRIMITIVE__WIDTH:
			case Part2Package.RECT_PRIMITIVE__X:
			case Part2Package.RECT_PRIMITIVE__Y:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Part2Package.RECT_PRIMITIVE__CHILD_ELEMENTS:
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
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createArcComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createChildPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createCirclePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createClippingContainerPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createClockType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createCrownComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createEllipsePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createGestureAreaPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createGroupPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createImagePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createImportType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createKeyboardInputPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createLinePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPathPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPointerAreaPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPointerGestureAreaPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPolarLineComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPolygonPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPolylinePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createRectPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createReplicatePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createScrollWheelInputPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createSimpleTextPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createSwitchNodePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createTouchAreaPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createTransformGroupPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getRectPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createWidgetComposition()));
	}

}
