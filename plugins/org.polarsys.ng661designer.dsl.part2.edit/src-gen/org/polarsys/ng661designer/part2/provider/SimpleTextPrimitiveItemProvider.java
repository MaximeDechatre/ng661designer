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
import org.polarsys.ng661designer.part2.SimpleTextPrimitive;

/**
 * This is the item provider adapter for a {@link org.polarsys.ng661designer.part2.SimpleTextPrimitive} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleTextPrimitiveItemProvider extends TreeTypesItemProvider {
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
	public SimpleTextPrimitiveItemProvider(AdapterFactory adapterFactory) {
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

			addWordSeparatorPropertyDescriptor(object);
			addAlignmentPropertyDescriptor(object);
			addBackgroundColorPropertyDescriptor(object);
			addBackgroundOpacityPropertyDescriptor(object);
			addBlockedPropertyDescriptor(object);
			addDrawingPriorityPropertyDescriptor(object);
			addEnablePropertyDescriptor(object);
			addFillPropertyDescriptor(object);
			addFillOpacityPropertyDescriptor(object);
			addFlowDirectionPropertyDescriptor(object);
			addFontNamePropertyDescriptor(object);
			addFontSizePropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addInheritedBlockedPropertyDescriptor(object);
			addInheritedEnablePropertyDescriptor(object);
			addInheritedVisiblePropertyDescriptor(object);
			addLineGapPropertyDescriptor(object);
			addMultilineModePropertyDescriptor(object);
			addTextFlowPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addVisiblePropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addXPropertyDescriptor(object);
			addYPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Word Separator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWordSeparatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleTextPrimitive_wordSeparator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_wordSeparator_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_WordSeparator(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleTextPrimitive_alignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_alignment_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_Alignment(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Background Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleTextPrimitive_backgroundColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_backgroundColor_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_BackgroundColor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Background Opacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundOpacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleTextPrimitive_backgroundOpacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_backgroundOpacity_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_BackgroundOpacity(),
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
				 getString("_UI_SimpleTextPrimitive_blocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_blocked_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_Blocked(),
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
				 getString("_UI_SimpleTextPrimitive_drawingPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_drawingPriority_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_DrawingPriority(),
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
				 getString("_UI_SimpleTextPrimitive_enable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_enable_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_Enable(),
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
				 getString("_UI_SimpleTextPrimitive_fill_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_fill_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_Fill(),
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
				 getString("_UI_SimpleTextPrimitive_fillOpacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_fillOpacity_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_FillOpacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flow Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleTextPrimitive_flowDirection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_flowDirection_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_FlowDirection(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleTextPrimitive_fontName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_fontName_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_FontName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleTextPrimitive_fontSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_fontSize_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_FontSize(),
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
				 getString("_UI_SimpleTextPrimitive_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_height_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_Height(),
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
				 getString("_UI_SimpleTextPrimitive_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_id_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_Id(),
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
				 getString("_UI_SimpleTextPrimitive_inheritedBlocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_inheritedBlocked_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_InheritedBlocked(),
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
				 getString("_UI_SimpleTextPrimitive_inheritedEnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_inheritedEnable_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_InheritedEnable(),
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
				 getString("_UI_SimpleTextPrimitive_inheritedVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_inheritedVisible_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_InheritedVisible(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Line Gap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineGapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleTextPrimitive_lineGap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_lineGap_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_LineGap(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multiline Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultilineModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleTextPrimitive_multilineMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_multilineMode_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_MultilineMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Flow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextFlowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleTextPrimitive_textFlow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_textFlow_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_TextFlow(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleTextPrimitive_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_value_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_Value(),
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
				 getString("_UI_SimpleTextPrimitive_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_visible_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_Visible(),
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
				 getString("_UI_SimpleTextPrimitive_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_width_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_Width(),
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
				 getString("_UI_SimpleTextPrimitive_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_x_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_X(),
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
				 getString("_UI_SimpleTextPrimitive_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleTextPrimitive_y_feature", "_UI_SimpleTextPrimitive_type"),
				 Part2Package.eINSTANCE.getSimpleTextPrimitive_Y(),
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
			childrenFeatures.add(Part2Package.eINSTANCE.getSimpleTextPrimitive_ReverseVideo());
			childrenFeatures.add(Part2Package.eINSTANCE.getSimpleTextPrimitive_Frame());
			childrenFeatures.add(Part2Package.eINSTANCE.getSimpleTextPrimitive_Underline());
			childrenFeatures.add(Part2Package.eINSTANCE.getSimpleTextPrimitive_StrikeThrough());
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
	 * This returns SimpleTextPrimitive.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimpleTextPrimitive"));
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
		String label = ((SimpleTextPrimitive)object).getFontName();
		return label == null || label.length() == 0 ?
			getString("_UI_SimpleTextPrimitive_type") :
			getString("_UI_SimpleTextPrimitive_type") + " " + label;
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

		switch (notification.getFeatureID(SimpleTextPrimitive.class)) {
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__WORD_SEPARATOR:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__ALIGNMENT:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__BACKGROUND_COLOR:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__BACKGROUND_OPACITY:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__BLOCKED:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__DRAWING_PRIORITY:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__ENABLE:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FILL:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FILL_OPACITY:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FLOW_DIRECTION:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FONT_NAME:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FONT_SIZE:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__HEIGHT:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__ID:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_BLOCKED:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_ENABLE:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_VISIBLE:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__LINE_GAP:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__MULTILINE_MODE:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__TEXT_FLOW:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__VALUE:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__VISIBLE:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__WIDTH:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__X:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__Y:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__REVERSE_VIDEO:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FRAME:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__UNDERLINE:
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__STRIKE_THROUGH:
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
				(Part2Package.eINSTANCE.getSimpleTextPrimitive_ReverseVideo(),
				 Part2Factory.eINSTANCE.createReverseVideoProperties()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getSimpleTextPrimitive_Frame(),
				 Part2Factory.eINSTANCE.createFrameProperties()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getSimpleTextPrimitive_Underline(),
				 Part2Factory.eINSTANCE.createUnderlineProperties()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getSimpleTextPrimitive_StrikeThrough(),
				 Part2Factory.eINSTANCE.createStrikeThroughProperties()));
	}

}
