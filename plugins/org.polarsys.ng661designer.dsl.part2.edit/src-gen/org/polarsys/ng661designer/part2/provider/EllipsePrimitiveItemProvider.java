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

import org.polarsys.ng661designer.part2.EllipsePrimitive;
import org.polarsys.ng661designer.part2.Part2Factory;
import org.polarsys.ng661designer.part2.Part2Package;

/**
 * This is the item provider adapter for a {@link org.polarsys.ng661designer.part2.EllipsePrimitive} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EllipsePrimitiveItemProvider extends ClipPathTypesItemProvider {
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
	public EllipsePrimitiveItemProvider(AdapterFactory adapterFactory) {
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
			addCxPropertyDescriptor(object);
			addCyPropertyDescriptor(object);
			addDrawingPriorityPropertyDescriptor(object);
			addEnablePropertyDescriptor(object);
			addFillPropertyDescriptor(object);
			addFillOpacityPropertyDescriptor(object);
			addFillRulePropertyDescriptor(object);
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
				 getString("_UI_EllipsePrimitive_blocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_blocked_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_Blocked(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cx feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EllipsePrimitive_cx_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_cx_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_Cx(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EllipsePrimitive_cy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_cy_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_Cy(),
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
				 getString("_UI_EllipsePrimitive_drawingPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_drawingPriority_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_DrawingPriority(),
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
				 getString("_UI_EllipsePrimitive_enable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_enable_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_Enable(),
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
				 getString("_UI_EllipsePrimitive_fill_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_fill_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_Fill(),
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
				 getString("_UI_EllipsePrimitive_fillOpacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_fillOpacity_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_FillOpacity(),
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
				 getString("_UI_EllipsePrimitive_fillRule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_fillRule_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_FillRule(),
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
				 getString("_UI_EllipsePrimitive_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_id_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_Id(),
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
				 getString("_UI_EllipsePrimitive_inheritedBlocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_inheritedBlocked_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_InheritedBlocked(),
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
				 getString("_UI_EllipsePrimitive_inheritedEnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_inheritedEnable_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_InheritedEnable(),
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
				 getString("_UI_EllipsePrimitive_inheritedVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_inheritedVisible_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_InheritedVisible(),
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
				 getString("_UI_EllipsePrimitive_rx_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_rx_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_Rx(),
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
				 getString("_UI_EllipsePrimitive_ry_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_ry_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_Ry(),
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
				 getString("_UI_EllipsePrimitive_stroke_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_stroke_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_Stroke(),
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
				 getString("_UI_EllipsePrimitive_strokeDasharray_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_strokeDasharray_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_StrokeDasharray(),
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
				 getString("_UI_EllipsePrimitive_strokeDashoffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_strokeDashoffset_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_StrokeDashoffset(),
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
				 getString("_UI_EllipsePrimitive_strokeLinecap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_strokeLinecap_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_StrokeLinecap(),
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
				 getString("_UI_EllipsePrimitive_strokeLinejoin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_strokeLinejoin_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_StrokeLinejoin(),
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
				 getString("_UI_EllipsePrimitive_strokeMiterlimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_strokeMiterlimit_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_StrokeMiterlimit(),
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
				 getString("_UI_EllipsePrimitive_strokeOpacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_strokeOpacity_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_StrokeOpacity(),
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
				 getString("_UI_EllipsePrimitive_strokewidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_strokewidth_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_Strokewidth(),
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
				 getString("_UI_EllipsePrimitive_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EllipsePrimitive_visible_feature", "_UI_EllipsePrimitive_type"),
				 Part2Package.eINSTANCE.getEllipsePrimitive_Visible(),
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
			childrenFeatures.add(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements());
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
	 * This returns EllipsePrimitive.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EllipsePrimitive"));
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
		String label = ((EllipsePrimitive)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_EllipsePrimitive_type") :
			getString("_UI_EllipsePrimitive_type") + " " + label;
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

		switch (notification.getFeatureID(EllipsePrimitive.class)) {
			case Part2Package.ELLIPSE_PRIMITIVE__BLOCKED:
			case Part2Package.ELLIPSE_PRIMITIVE__CX:
			case Part2Package.ELLIPSE_PRIMITIVE__CY:
			case Part2Package.ELLIPSE_PRIMITIVE__DRAWING_PRIORITY:
			case Part2Package.ELLIPSE_PRIMITIVE__ENABLE:
			case Part2Package.ELLIPSE_PRIMITIVE__FILL:
			case Part2Package.ELLIPSE_PRIMITIVE__FILL_OPACITY:
			case Part2Package.ELLIPSE_PRIMITIVE__FILL_RULE:
			case Part2Package.ELLIPSE_PRIMITIVE__ID:
			case Part2Package.ELLIPSE_PRIMITIVE__INHERITED_BLOCKED:
			case Part2Package.ELLIPSE_PRIMITIVE__INHERITED_ENABLE:
			case Part2Package.ELLIPSE_PRIMITIVE__INHERITED_VISIBLE:
			case Part2Package.ELLIPSE_PRIMITIVE__RX:
			case Part2Package.ELLIPSE_PRIMITIVE__RY:
			case Part2Package.ELLIPSE_PRIMITIVE__STROKE:
			case Part2Package.ELLIPSE_PRIMITIVE__STROKE_DASHARRAY:
			case Part2Package.ELLIPSE_PRIMITIVE__STROKE_DASHOFFSET:
			case Part2Package.ELLIPSE_PRIMITIVE__STROKE_LINECAP:
			case Part2Package.ELLIPSE_PRIMITIVE__STROKE_LINEJOIN:
			case Part2Package.ELLIPSE_PRIMITIVE__STROKE_MITERLIMIT:
			case Part2Package.ELLIPSE_PRIMITIVE__STROKE_OPACITY:
			case Part2Package.ELLIPSE_PRIMITIVE__STROKEWIDTH:
			case Part2Package.ELLIPSE_PRIMITIVE__VISIBLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Part2Package.ELLIPSE_PRIMITIVE__CHILD_ELEMENTS:
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
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createArcComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createChildPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createCirclePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createClippingContainerPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createClockType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createCrownComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createEllipsePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createGestureAreaPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createGroupPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createImagePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createImportType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createKeyboardInputPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createLinePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPathPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPointerAreaPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPointerGestureAreaPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPolarLineComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPolygonPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPolylinePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createRectPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createReplicatePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createScrollWheelInputPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createSimpleTextPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createSwitchNodePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createTouchAreaPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createTransformGroupPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getEllipsePrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createWidgetComposition()));
	}

}
