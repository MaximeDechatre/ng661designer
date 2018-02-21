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
import org.polarsys.ng661designer.part2.PolarLineComponent;

/**
 * This is the item provider adapter for a {@link org.polarsys.ng661designer.part2.PolarLineComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolarLineComponentItemProvider extends TreeTypesItemProvider {
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
	public PolarLineComponentItemProvider(AdapterFactory adapterFactory) {
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

			addAnglePropertyDescriptor(object);
			addBlockedPropertyDescriptor(object);
			addDrawingPriorityPropertyDescriptor(object);
			addEnablePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addInheritedBlockedPropertyDescriptor(object);
			addInheritedEnablePropertyDescriptor(object);
			addInheritedVisiblePropertyDescriptor(object);
			addRPropertyDescriptor(object);
			addStrokePropertyDescriptor(object);
			addStrokeDasharrayPropertyDescriptor(object);
			addStrokeDashoffsetPropertyDescriptor(object);
			addStrokeLinecapPropertyDescriptor(object);
			addStrokeLinejoinPropertyDescriptor(object);
			addStrokeMiterlimitPropertyDescriptor(object);
			addStrokeOpacityPropertyDescriptor(object);
			addStrokewidthPropertyDescriptor(object);
			addVisiblePropertyDescriptor(object);
			addX1PropertyDescriptor(object);
			addY1PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarLineComponent_angle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_angle_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_Angle(),
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
				 getString("_UI_PolarLineComponent_blocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_blocked_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_Blocked(),
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
				 getString("_UI_PolarLineComponent_drawingPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_drawingPriority_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_DrawingPriority(),
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
				 getString("_UI_PolarLineComponent_enable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_enable_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_Enable(),
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
				 getString("_UI_PolarLineComponent_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_id_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_Id(),
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
				 getString("_UI_PolarLineComponent_inheritedBlocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_inheritedBlocked_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_InheritedBlocked(),
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
				 getString("_UI_PolarLineComponent_inheritedEnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_inheritedEnable_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_InheritedEnable(),
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
				 getString("_UI_PolarLineComponent_inheritedVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_inheritedVisible_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_InheritedVisible(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarLineComponent_r_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_r_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_R(),
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
				 getString("_UI_PolarLineComponent_stroke_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_stroke_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_Stroke(),
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
				 getString("_UI_PolarLineComponent_strokeDasharray_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_strokeDasharray_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_StrokeDasharray(),
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
				 getString("_UI_PolarLineComponent_strokeDashoffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_strokeDashoffset_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_StrokeDashoffset(),
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
				 getString("_UI_PolarLineComponent_strokeLinecap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_strokeLinecap_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_StrokeLinecap(),
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
				 getString("_UI_PolarLineComponent_strokeLinejoin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_strokeLinejoin_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_StrokeLinejoin(),
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
				 getString("_UI_PolarLineComponent_strokeMiterlimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_strokeMiterlimit_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_StrokeMiterlimit(),
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
				 getString("_UI_PolarLineComponent_strokeOpacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_strokeOpacity_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_StrokeOpacity(),
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
				 getString("_UI_PolarLineComponent_strokewidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_strokewidth_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_Strokewidth(),
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
				 getString("_UI_PolarLineComponent_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_visible_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_Visible(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the X1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addX1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarLineComponent_x1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_x1_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_X1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Y1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addY1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolarLineComponent_y1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolarLineComponent_y1_feature", "_UI_PolarLineComponent_type"),
				 Part2Package.eINSTANCE.getPolarLineComponent_Y1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PolarLineComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PolarLineComponent"));
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
		String label = ((PolarLineComponent)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_PolarLineComponent_type") :
			getString("_UI_PolarLineComponent_type") + " " + label;
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

		switch (notification.getFeatureID(PolarLineComponent.class)) {
			case Part2Package.POLAR_LINE_COMPONENT__ANGLE:
			case Part2Package.POLAR_LINE_COMPONENT__BLOCKED:
			case Part2Package.POLAR_LINE_COMPONENT__DRAWING_PRIORITY:
			case Part2Package.POLAR_LINE_COMPONENT__ENABLE:
			case Part2Package.POLAR_LINE_COMPONENT__ID:
			case Part2Package.POLAR_LINE_COMPONENT__INHERITED_BLOCKED:
			case Part2Package.POLAR_LINE_COMPONENT__INHERITED_ENABLE:
			case Part2Package.POLAR_LINE_COMPONENT__INHERITED_VISIBLE:
			case Part2Package.POLAR_LINE_COMPONENT__R:
			case Part2Package.POLAR_LINE_COMPONENT__STROKE:
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_DASHARRAY:
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_DASHOFFSET:
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_LINECAP:
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_LINEJOIN:
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_MITERLIMIT:
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_OPACITY:
			case Part2Package.POLAR_LINE_COMPONENT__STROKEWIDTH:
			case Part2Package.POLAR_LINE_COMPONENT__VISIBLE:
			case Part2Package.POLAR_LINE_COMPONENT__X1:
			case Part2Package.POLAR_LINE_COMPONENT__Y1:
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
