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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.polarsys.ng661designer.part2.AlignmentType1;
import org.polarsys.ng661designer.part2.FlowDirectionType;
import org.polarsys.ng661designer.part2.FrameProperties;
import org.polarsys.ng661designer.part2.MultilineModeType;
import org.polarsys.ng661designer.part2.Part2Factory;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.ReverseVideoProperties;
import org.polarsys.ng661designer.part2.SimpleTextPrimitive;
import org.polarsys.ng661designer.part2.StrikeThroughProperties;
import org.polarsys.ng661designer.part2.TextFlowType;
import org.polarsys.ng661designer.part2.UnderlineProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Text Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getWordSeparator <em>Word Separator</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getReverseVideo <em>Reverse Video</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getStrikeThrough <em>Strike Through</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getBackgroundOpacity <em>Background Opacity</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getDrawingPriority <em>Drawing Priority</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getEnable <em>Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getFillOpacity <em>Fill Opacity</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getFlowDirection <em>Flow Direction</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getInheritedBlocked <em>Inherited Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getInheritedEnable <em>Inherited Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getInheritedVisible <em>Inherited Visible</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getLineGap <em>Line Gap</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getMultilineMode <em>Multiline Mode</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getTextFlow <em>Text Flow</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getX <em>X</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleTextPrimitiveImpl extends TreeTypesImpl implements SimpleTextPrimitive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getWordSeparator() <em>Word Separator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordSeparator()
	 * @generated
	 * @ordered
	 */
	protected EList<String> wordSeparator;

	/**
	 * The cached value of the '{@link #getReverseVideo() <em>Reverse Video</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseVideo()
	 * @generated
	 * @ordered
	 */
	protected ReverseVideoProperties reverseVideo;

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected FrameProperties frame;

	/**
	 * The cached value of the '{@link #getUnderline() <em>Underline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderline()
	 * @generated
	 * @ordered
	 */
	protected UnderlineProperties underline;

	/**
	 * The cached value of the '{@link #getStrikeThrough() <em>Strike Through</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrikeThrough()
	 * @generated
	 * @ordered
	 */
	protected StrikeThroughProperties strikeThrough;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final AlignmentType1 ALIGNMENT_EDEFAULT = AlignmentType1.LEFT_ONLY;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected AlignmentType1 alignment = ALIGNMENT_EDEFAULT;

	/**
	 * This is true if the Alignment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alignmentESet;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final Object BACKGROUND_COLOR_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getColorType(), "white");

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected Object backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * This is true if the Background Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean backgroundColorESet;

	/**
	 * The default value of the '{@link #getBackgroundOpacity() <em>Background Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final Object BACKGROUND_OPACITY_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getOpacityType(), "1.0");

	/**
	 * The cached value of the '{@link #getBackgroundOpacity() <em>Background Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundOpacity()
	 * @generated
	 * @ordered
	 */
	protected Object backgroundOpacity = BACKGROUND_OPACITY_EDEFAULT;

	/**
	 * This is true if the Background Opacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean backgroundOpacityESet;

	/**
	 * The default value of the '{@link #getBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final Object BLOCKED_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocked()
	 * @generated
	 * @ordered
	 */
	protected Object blocked = BLOCKED_EDEFAULT;

	/**
	 * This is true if the Blocked attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean blockedESet;

	/**
	 * The default value of the '{@link #getDrawingPriority() <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawingPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Object DRAWING_PRIORITY_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getZIndexType(), "0");

	/**
	 * The cached value of the '{@link #getDrawingPriority() <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawingPriority()
	 * @generated
	 * @ordered
	 */
	protected Object drawingPriority = DRAWING_PRIORITY_EDEFAULT;

	/**
	 * This is true if the Drawing Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean drawingPriorityESet;

	/**
	 * The default value of the '{@link #getEnable() <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable()
	 * @generated
	 * @ordered
	 */
	protected static final Object ENABLE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getEnable() <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable()
	 * @generated
	 * @ordered
	 */
	protected Object enable = ENABLE_EDEFAULT;

	/**
	 * This is true if the Enable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enableESet;

	/**
	 * The default value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected static final Object FILL_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getColorType(), "white");

	/**
	 * The cached value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected Object fill = FILL_EDEFAULT;

	/**
	 * This is true if the Fill attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillESet;

	/**
	 * The default value of the '{@link #getFillOpacity() <em>Fill Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final Object FILL_OPACITY_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getOpacityType(), "1.0");

	/**
	 * The cached value of the '{@link #getFillOpacity() <em>Fill Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillOpacity()
	 * @generated
	 * @ordered
	 */
	protected Object fillOpacity = FILL_OPACITY_EDEFAULT;

	/**
	 * This is true if the Fill Opacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillOpacityESet;

	/**
	 * The default value of the '{@link #getFlowDirection() <em>Flow Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowDirection()
	 * @generated
	 * @ordered
	 */
	protected static final FlowDirectionType FLOW_DIRECTION_EDEFAULT = FlowDirectionType.RIGHT;

	/**
	 * The cached value of the '{@link #getFlowDirection() <em>Flow Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowDirection()
	 * @generated
	 * @ordered
	 */
	protected FlowDirectionType flowDirection = FLOW_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Flow Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flowDirectionESet;

	/**
	 * The default value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_NAME_EDEFAULT = "Arial";

	/**
	 * The cached value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected String fontName = FONT_NAME_EDEFAULT;

	/**
	 * This is true if the Font Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontNameESet;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final Object FONT_SIZE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getDistanceType(), "15");

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected Object fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * This is true if the Font Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontSizeESet;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Object HEIGHT_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getDistanceType(), "0");

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Object height = HEIGHT_EDEFAULT;

	/**
	 * This is true if the Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean heightESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInheritedBlocked() <em>Inherited Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final Object INHERITED_BLOCKED_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getInheritedBlocked() <em>Inherited Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedBlocked()
	 * @generated
	 * @ordered
	 */
	protected Object inheritedBlocked = INHERITED_BLOCKED_EDEFAULT;

	/**
	 * This is true if the Inherited Blocked attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inheritedBlockedESet;

	/**
	 * The default value of the '{@link #getInheritedEnable() <em>Inherited Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedEnable()
	 * @generated
	 * @ordered
	 */
	protected static final Object INHERITED_ENABLE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getInheritedEnable() <em>Inherited Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedEnable()
	 * @generated
	 * @ordered
	 */
	protected Object inheritedEnable = INHERITED_ENABLE_EDEFAULT;

	/**
	 * This is true if the Inherited Enable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inheritedEnableESet;

	/**
	 * The default value of the '{@link #getInheritedVisible() <em>Inherited Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedVisible()
	 * @generated
	 * @ordered
	 */
	protected static final Object INHERITED_VISIBLE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getInheritedVisible() <em>Inherited Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedVisible()
	 * @generated
	 * @ordered
	 */
	protected Object inheritedVisible = INHERITED_VISIBLE_EDEFAULT;

	/**
	 * This is true if the Inherited Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inheritedVisibleESet;

	/**
	 * The default value of the '{@link #getLineGap() <em>Line Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineGap()
	 * @generated
	 * @ordered
	 */
	protected static final Object LINE_GAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineGap() <em>Line Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineGap()
	 * @generated
	 * @ordered
	 */
	protected Object lineGap = LINE_GAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultilineMode() <em>Multiline Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultilineMode()
	 * @generated
	 * @ordered
	 */
	protected static final MultilineModeType MULTILINE_MODE_EDEFAULT = MultilineModeType.PRESERVE_CHARACTER;

	/**
	 * The cached value of the '{@link #getMultilineMode() <em>Multiline Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultilineMode()
	 * @generated
	 * @ordered
	 */
	protected MultilineModeType multilineMode = MULTILINE_MODE_EDEFAULT;

	/**
	 * This is true if the Multiline Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multilineModeESet;

	/**
	 * The default value of the '{@link #getTextFlow() <em>Text Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFlow()
	 * @generated
	 * @ordered
	 */
	protected static final TextFlowType TEXT_FLOW_EDEFAULT = TextFlowType.NONE;

	/**
	 * The cached value of the '{@link #getTextFlow() <em>Text Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFlow()
	 * @generated
	 * @ordered
	 */
	protected TextFlowType textFlow = TEXT_FLOW_EDEFAULT;

	/**
	 * This is true if the Text Flow attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textFlowESet;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected static final Object VISIBLE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected Object visible = VISIBLE_EDEFAULT;

	/**
	 * This is true if the Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleESet;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object WIDTH_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getDistanceType(), "0");

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Object width = WIDTH_EDEFAULT;

	/**
	 * This is true if the Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean widthESet;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Object X_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getPositionType(), "0");

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Object x = X_EDEFAULT;

	/**
	 * This is true if the X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xESet;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Object Y_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getPositionType(), "0");

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Object y = Y_EDEFAULT;

	/**
	 * This is true if the Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTextPrimitiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getSimpleTextPrimitive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getWordSeparator() {
		if (wordSeparator == null) {
			wordSeparator = new EDataTypeEList<String>(String.class, this, Part2Package.SIMPLE_TEXT_PRIMITIVE__WORD_SEPARATOR);
		}
		return wordSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReverseVideoProperties getReverseVideo() {
		return reverseVideo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReverseVideo(ReverseVideoProperties newReverseVideo, NotificationChain msgs) {
		ReverseVideoProperties oldReverseVideo = reverseVideo;
		reverseVideo = newReverseVideo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__REVERSE_VIDEO, oldReverseVideo, newReverseVideo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverseVideo(ReverseVideoProperties newReverseVideo) {
		if (newReverseVideo != reverseVideo) {
			NotificationChain msgs = null;
			if (reverseVideo != null)
				msgs = ((InternalEObject)reverseVideo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Part2Package.SIMPLE_TEXT_PRIMITIVE__REVERSE_VIDEO, null, msgs);
			if (newReverseVideo != null)
				msgs = ((InternalEObject)newReverseVideo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Part2Package.SIMPLE_TEXT_PRIMITIVE__REVERSE_VIDEO, null, msgs);
			msgs = basicSetReverseVideo(newReverseVideo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__REVERSE_VIDEO, newReverseVideo, newReverseVideo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameProperties getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrame(FrameProperties newFrame, NotificationChain msgs) {
		FrameProperties oldFrame = frame;
		frame = newFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__FRAME, oldFrame, newFrame);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(FrameProperties newFrame) {
		if (newFrame != frame) {
			NotificationChain msgs = null;
			if (frame != null)
				msgs = ((InternalEObject)frame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Part2Package.SIMPLE_TEXT_PRIMITIVE__FRAME, null, msgs);
			if (newFrame != null)
				msgs = ((InternalEObject)newFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Part2Package.SIMPLE_TEXT_PRIMITIVE__FRAME, null, msgs);
			msgs = basicSetFrame(newFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__FRAME, newFrame, newFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnderlineProperties getUnderline() {
		return underline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnderline(UnderlineProperties newUnderline, NotificationChain msgs) {
		UnderlineProperties oldUnderline = underline;
		underline = newUnderline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__UNDERLINE, oldUnderline, newUnderline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderline(UnderlineProperties newUnderline) {
		if (newUnderline != underline) {
			NotificationChain msgs = null;
			if (underline != null)
				msgs = ((InternalEObject)underline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Part2Package.SIMPLE_TEXT_PRIMITIVE__UNDERLINE, null, msgs);
			if (newUnderline != null)
				msgs = ((InternalEObject)newUnderline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Part2Package.SIMPLE_TEXT_PRIMITIVE__UNDERLINE, null, msgs);
			msgs = basicSetUnderline(newUnderline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__UNDERLINE, newUnderline, newUnderline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrikeThroughProperties getStrikeThrough() {
		return strikeThrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrikeThrough(StrikeThroughProperties newStrikeThrough, NotificationChain msgs) {
		StrikeThroughProperties oldStrikeThrough = strikeThrough;
		strikeThrough = newStrikeThrough;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__STRIKE_THROUGH, oldStrikeThrough, newStrikeThrough);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrikeThrough(StrikeThroughProperties newStrikeThrough) {
		if (newStrikeThrough != strikeThrough) {
			NotificationChain msgs = null;
			if (strikeThrough != null)
				msgs = ((InternalEObject)strikeThrough).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Part2Package.SIMPLE_TEXT_PRIMITIVE__STRIKE_THROUGH, null, msgs);
			if (newStrikeThrough != null)
				msgs = ((InternalEObject)newStrikeThrough).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Part2Package.SIMPLE_TEXT_PRIMITIVE__STRIKE_THROUGH, null, msgs);
			msgs = basicSetStrikeThrough(newStrikeThrough, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__STRIKE_THROUGH, newStrikeThrough, newStrikeThrough));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentType1 getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(AlignmentType1 newAlignment) {
		AlignmentType1 oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		boolean oldAlignmentESet = alignmentESet;
		alignmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__ALIGNMENT, oldAlignment, alignment, !oldAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlignment() {
		AlignmentType1 oldAlignment = alignment;
		boolean oldAlignmentESet = alignmentESet;
		alignment = ALIGNMENT_EDEFAULT;
		alignmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__ALIGNMENT, oldAlignment, ALIGNMENT_EDEFAULT, oldAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlignment() {
		return alignmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(Object newBackgroundColor) {
		Object oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		boolean oldBackgroundColorESet = backgroundColorESet;
		backgroundColorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor, !oldBackgroundColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBackgroundColor() {
		Object oldBackgroundColor = backgroundColor;
		boolean oldBackgroundColorESet = backgroundColorESet;
		backgroundColor = BACKGROUND_COLOR_EDEFAULT;
		backgroundColorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__BACKGROUND_COLOR, oldBackgroundColor, BACKGROUND_COLOR_EDEFAULT, oldBackgroundColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBackgroundColor() {
		return backgroundColorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBackgroundOpacity() {
		return backgroundOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundOpacity(Object newBackgroundOpacity) {
		Object oldBackgroundOpacity = backgroundOpacity;
		backgroundOpacity = newBackgroundOpacity;
		boolean oldBackgroundOpacityESet = backgroundOpacityESet;
		backgroundOpacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__BACKGROUND_OPACITY, oldBackgroundOpacity, backgroundOpacity, !oldBackgroundOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBackgroundOpacity() {
		Object oldBackgroundOpacity = backgroundOpacity;
		boolean oldBackgroundOpacityESet = backgroundOpacityESet;
		backgroundOpacity = BACKGROUND_OPACITY_EDEFAULT;
		backgroundOpacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__BACKGROUND_OPACITY, oldBackgroundOpacity, BACKGROUND_OPACITY_EDEFAULT, oldBackgroundOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBackgroundOpacity() {
		return backgroundOpacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBlocked() {
		return blocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocked(Object newBlocked) {
		Object oldBlocked = blocked;
		blocked = newBlocked;
		boolean oldBlockedESet = blockedESet;
		blockedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__BLOCKED, oldBlocked, blocked, !oldBlockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBlocked() {
		Object oldBlocked = blocked;
		boolean oldBlockedESet = blockedESet;
		blocked = BLOCKED_EDEFAULT;
		blockedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__BLOCKED, oldBlocked, BLOCKED_EDEFAULT, oldBlockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBlocked() {
		return blockedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDrawingPriority() {
		return drawingPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawingPriority(Object newDrawingPriority) {
		Object oldDrawingPriority = drawingPriority;
		drawingPriority = newDrawingPriority;
		boolean oldDrawingPriorityESet = drawingPriorityESet;
		drawingPriorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__DRAWING_PRIORITY, oldDrawingPriority, drawingPriority, !oldDrawingPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDrawingPriority() {
		Object oldDrawingPriority = drawingPriority;
		boolean oldDrawingPriorityESet = drawingPriorityESet;
		drawingPriority = DRAWING_PRIORITY_EDEFAULT;
		drawingPriorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__DRAWING_PRIORITY, oldDrawingPriority, DRAWING_PRIORITY_EDEFAULT, oldDrawingPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDrawingPriority() {
		return drawingPriorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEnable() {
		return enable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable(Object newEnable) {
		Object oldEnable = enable;
		enable = newEnable;
		boolean oldEnableESet = enableESet;
		enableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__ENABLE, oldEnable, enable, !oldEnableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnable() {
		Object oldEnable = enable;
		boolean oldEnableESet = enableESet;
		enable = ENABLE_EDEFAULT;
		enableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__ENABLE, oldEnable, ENABLE_EDEFAULT, oldEnableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnable() {
		return enableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(Object newFill) {
		Object oldFill = fill;
		fill = newFill;
		boolean oldFillESet = fillESet;
		fillESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__FILL, oldFill, fill, !oldFillESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFill() {
		Object oldFill = fill;
		boolean oldFillESet = fillESet;
		fill = FILL_EDEFAULT;
		fillESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__FILL, oldFill, FILL_EDEFAULT, oldFillESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFill() {
		return fillESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFillOpacity() {
		return fillOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillOpacity(Object newFillOpacity) {
		Object oldFillOpacity = fillOpacity;
		fillOpacity = newFillOpacity;
		boolean oldFillOpacityESet = fillOpacityESet;
		fillOpacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__FILL_OPACITY, oldFillOpacity, fillOpacity, !oldFillOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFillOpacity() {
		Object oldFillOpacity = fillOpacity;
		boolean oldFillOpacityESet = fillOpacityESet;
		fillOpacity = FILL_OPACITY_EDEFAULT;
		fillOpacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__FILL_OPACITY, oldFillOpacity, FILL_OPACITY_EDEFAULT, oldFillOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFillOpacity() {
		return fillOpacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowDirectionType getFlowDirection() {
		return flowDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowDirection(FlowDirectionType newFlowDirection) {
		FlowDirectionType oldFlowDirection = flowDirection;
		flowDirection = newFlowDirection == null ? FLOW_DIRECTION_EDEFAULT : newFlowDirection;
		boolean oldFlowDirectionESet = flowDirectionESet;
		flowDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__FLOW_DIRECTION, oldFlowDirection, flowDirection, !oldFlowDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlowDirection() {
		FlowDirectionType oldFlowDirection = flowDirection;
		boolean oldFlowDirectionESet = flowDirectionESet;
		flowDirection = FLOW_DIRECTION_EDEFAULT;
		flowDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__FLOW_DIRECTION, oldFlowDirection, FLOW_DIRECTION_EDEFAULT, oldFlowDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowDirection() {
		return flowDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontName() {
		return fontName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontName(String newFontName) {
		String oldFontName = fontName;
		fontName = newFontName;
		boolean oldFontNameESet = fontNameESet;
		fontNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__FONT_NAME, oldFontName, fontName, !oldFontNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontName() {
		String oldFontName = fontName;
		boolean oldFontNameESet = fontNameESet;
		fontName = FONT_NAME_EDEFAULT;
		fontNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__FONT_NAME, oldFontName, FONT_NAME_EDEFAULT, oldFontNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontName() {
		return fontNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(Object newFontSize) {
		Object oldFontSize = fontSize;
		fontSize = newFontSize;
		boolean oldFontSizeESet = fontSizeESet;
		fontSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__FONT_SIZE, oldFontSize, fontSize, !oldFontSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontSize() {
		Object oldFontSize = fontSize;
		boolean oldFontSizeESet = fontSizeESet;
		fontSize = FONT_SIZE_EDEFAULT;
		fontSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__FONT_SIZE, oldFontSize, FONT_SIZE_EDEFAULT, oldFontSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontSize() {
		return fontSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Object newHeight) {
		Object oldHeight = height;
		height = newHeight;
		boolean oldHeightESet = heightESet;
		heightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__HEIGHT, oldHeight, height, !oldHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeight() {
		Object oldHeight = height;
		boolean oldHeightESet = heightESet;
		height = HEIGHT_EDEFAULT;
		heightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__HEIGHT, oldHeight, HEIGHT_EDEFAULT, oldHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeight() {
		return heightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInheritedBlocked() {
		return inheritedBlocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritedBlocked(Object newInheritedBlocked) {
		Object oldInheritedBlocked = inheritedBlocked;
		inheritedBlocked = newInheritedBlocked;
		boolean oldInheritedBlockedESet = inheritedBlockedESet;
		inheritedBlockedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_BLOCKED, oldInheritedBlocked, inheritedBlocked, !oldInheritedBlockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInheritedBlocked() {
		Object oldInheritedBlocked = inheritedBlocked;
		boolean oldInheritedBlockedESet = inheritedBlockedESet;
		inheritedBlocked = INHERITED_BLOCKED_EDEFAULT;
		inheritedBlockedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_BLOCKED, oldInheritedBlocked, INHERITED_BLOCKED_EDEFAULT, oldInheritedBlockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInheritedBlocked() {
		return inheritedBlockedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInheritedEnable() {
		return inheritedEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritedEnable(Object newInheritedEnable) {
		Object oldInheritedEnable = inheritedEnable;
		inheritedEnable = newInheritedEnable;
		boolean oldInheritedEnableESet = inheritedEnableESet;
		inheritedEnableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_ENABLE, oldInheritedEnable, inheritedEnable, !oldInheritedEnableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInheritedEnable() {
		Object oldInheritedEnable = inheritedEnable;
		boolean oldInheritedEnableESet = inheritedEnableESet;
		inheritedEnable = INHERITED_ENABLE_EDEFAULT;
		inheritedEnableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_ENABLE, oldInheritedEnable, INHERITED_ENABLE_EDEFAULT, oldInheritedEnableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInheritedEnable() {
		return inheritedEnableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInheritedVisible() {
		return inheritedVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritedVisible(Object newInheritedVisible) {
		Object oldInheritedVisible = inheritedVisible;
		inheritedVisible = newInheritedVisible;
		boolean oldInheritedVisibleESet = inheritedVisibleESet;
		inheritedVisibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_VISIBLE, oldInheritedVisible, inheritedVisible, !oldInheritedVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInheritedVisible() {
		Object oldInheritedVisible = inheritedVisible;
		boolean oldInheritedVisibleESet = inheritedVisibleESet;
		inheritedVisible = INHERITED_VISIBLE_EDEFAULT;
		inheritedVisibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_VISIBLE, oldInheritedVisible, INHERITED_VISIBLE_EDEFAULT, oldInheritedVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInheritedVisible() {
		return inheritedVisibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLineGap() {
		return lineGap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineGap(Object newLineGap) {
		Object oldLineGap = lineGap;
		lineGap = newLineGap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__LINE_GAP, oldLineGap, lineGap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultilineModeType getMultilineMode() {
		return multilineMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultilineMode(MultilineModeType newMultilineMode) {
		MultilineModeType oldMultilineMode = multilineMode;
		multilineMode = newMultilineMode == null ? MULTILINE_MODE_EDEFAULT : newMultilineMode;
		boolean oldMultilineModeESet = multilineModeESet;
		multilineModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__MULTILINE_MODE, oldMultilineMode, multilineMode, !oldMultilineModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultilineMode() {
		MultilineModeType oldMultilineMode = multilineMode;
		boolean oldMultilineModeESet = multilineModeESet;
		multilineMode = MULTILINE_MODE_EDEFAULT;
		multilineModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__MULTILINE_MODE, oldMultilineMode, MULTILINE_MODE_EDEFAULT, oldMultilineModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultilineMode() {
		return multilineModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFlowType getTextFlow() {
		return textFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextFlow(TextFlowType newTextFlow) {
		TextFlowType oldTextFlow = textFlow;
		textFlow = newTextFlow == null ? TEXT_FLOW_EDEFAULT : newTextFlow;
		boolean oldTextFlowESet = textFlowESet;
		textFlowESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__TEXT_FLOW, oldTextFlow, textFlow, !oldTextFlowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextFlow() {
		TextFlowType oldTextFlow = textFlow;
		boolean oldTextFlowESet = textFlowESet;
		textFlow = TEXT_FLOW_EDEFAULT;
		textFlowESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__TEXT_FLOW, oldTextFlow, TEXT_FLOW_EDEFAULT, oldTextFlowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextFlow() {
		return textFlowESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(Object newVisible) {
		Object oldVisible = visible;
		visible = newVisible;
		boolean oldVisibleESet = visibleESet;
		visibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__VISIBLE, oldVisible, visible, !oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisible() {
		Object oldVisible = visible;
		boolean oldVisibleESet = visibleESet;
		visible = VISIBLE_EDEFAULT;
		visibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__VISIBLE, oldVisible, VISIBLE_EDEFAULT, oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisible() {
		return visibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Object newWidth) {
		Object oldWidth = width;
		width = newWidth;
		boolean oldWidthESet = widthESet;
		widthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__WIDTH, oldWidth, width, !oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWidth() {
		Object oldWidth = width;
		boolean oldWidthESet = widthESet;
		width = WIDTH_EDEFAULT;
		widthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__WIDTH, oldWidth, WIDTH_EDEFAULT, oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWidth() {
		return widthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Object newX) {
		Object oldX = x;
		x = newX;
		boolean oldXESet = xESet;
		xESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__X, oldX, x, !oldXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetX() {
		Object oldX = x;
		boolean oldXESet = xESet;
		x = X_EDEFAULT;
		xESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__X, oldX, X_EDEFAULT, oldXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetX() {
		return xESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Object newY) {
		Object oldY = y;
		y = newY;
		boolean oldYESet = yESet;
		yESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.SIMPLE_TEXT_PRIMITIVE__Y, oldY, y, !oldYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetY() {
		Object oldY = y;
		boolean oldYESet = yESet;
		y = Y_EDEFAULT;
		yESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.SIMPLE_TEXT_PRIMITIVE__Y, oldY, Y_EDEFAULT, oldYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetY() {
		return yESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__REVERSE_VIDEO:
				return basicSetReverseVideo(null, msgs);
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FRAME:
				return basicSetFrame(null, msgs);
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__UNDERLINE:
				return basicSetUnderline(null, msgs);
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__STRIKE_THROUGH:
				return basicSetStrikeThrough(null, msgs);
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
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__WORD_SEPARATOR:
				return getWordSeparator();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__REVERSE_VIDEO:
				return getReverseVideo();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FRAME:
				return getFrame();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__UNDERLINE:
				return getUnderline();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__STRIKE_THROUGH:
				return getStrikeThrough();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__ALIGNMENT:
				return getAlignment();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__BACKGROUND_COLOR:
				return getBackgroundColor();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__BACKGROUND_OPACITY:
				return getBackgroundOpacity();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__BLOCKED:
				return getBlocked();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__DRAWING_PRIORITY:
				return getDrawingPriority();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__ENABLE:
				return getEnable();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FILL:
				return getFill();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FILL_OPACITY:
				return getFillOpacity();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FLOW_DIRECTION:
				return getFlowDirection();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FONT_NAME:
				return getFontName();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FONT_SIZE:
				return getFontSize();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__HEIGHT:
				return getHeight();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__ID:
				return getId();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_BLOCKED:
				return getInheritedBlocked();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_ENABLE:
				return getInheritedEnable();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_VISIBLE:
				return getInheritedVisible();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__LINE_GAP:
				return getLineGap();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__MULTILINE_MODE:
				return getMultilineMode();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__TEXT_FLOW:
				return getTextFlow();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__VALUE:
				return getValue();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__VISIBLE:
				return getVisible();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__WIDTH:
				return getWidth();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__X:
				return getX();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__Y:
				return getY();
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
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__WORD_SEPARATOR:
				getWordSeparator().clear();
				getWordSeparator().addAll((Collection<? extends String>)newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__REVERSE_VIDEO:
				setReverseVideo((ReverseVideoProperties)newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FRAME:
				setFrame((FrameProperties)newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__UNDERLINE:
				setUnderline((UnderlineProperties)newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__STRIKE_THROUGH:
				setStrikeThrough((StrikeThroughProperties)newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__ALIGNMENT:
				setAlignment((AlignmentType1)newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__BACKGROUND_COLOR:
				setBackgroundColor(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__BACKGROUND_OPACITY:
				setBackgroundOpacity(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__BLOCKED:
				setBlocked(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__DRAWING_PRIORITY:
				setDrawingPriority(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__ENABLE:
				setEnable(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FILL:
				setFill(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FILL_OPACITY:
				setFillOpacity(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FLOW_DIRECTION:
				setFlowDirection((FlowDirectionType)newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FONT_NAME:
				setFontName((String)newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FONT_SIZE:
				setFontSize(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__HEIGHT:
				setHeight(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__ID:
				setId((String)newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_BLOCKED:
				setInheritedBlocked(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_ENABLE:
				setInheritedEnable(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_VISIBLE:
				setInheritedVisible(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__LINE_GAP:
				setLineGap(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__MULTILINE_MODE:
				setMultilineMode((MultilineModeType)newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__TEXT_FLOW:
				setTextFlow((TextFlowType)newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__VALUE:
				setValue((String)newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__VISIBLE:
				setVisible(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__WIDTH:
				setWidth(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__X:
				setX(newValue);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__Y:
				setY(newValue);
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
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__WORD_SEPARATOR:
				getWordSeparator().clear();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__REVERSE_VIDEO:
				setReverseVideo((ReverseVideoProperties)null);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FRAME:
				setFrame((FrameProperties)null);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__UNDERLINE:
				setUnderline((UnderlineProperties)null);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__STRIKE_THROUGH:
				setStrikeThrough((StrikeThroughProperties)null);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__ALIGNMENT:
				unsetAlignment();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__BACKGROUND_COLOR:
				unsetBackgroundColor();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__BACKGROUND_OPACITY:
				unsetBackgroundOpacity();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__BLOCKED:
				unsetBlocked();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__DRAWING_PRIORITY:
				unsetDrawingPriority();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__ENABLE:
				unsetEnable();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FILL:
				unsetFill();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FILL_OPACITY:
				unsetFillOpacity();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FLOW_DIRECTION:
				unsetFlowDirection();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FONT_NAME:
				unsetFontName();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FONT_SIZE:
				unsetFontSize();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__HEIGHT:
				unsetHeight();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__ID:
				setId(ID_EDEFAULT);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_BLOCKED:
				unsetInheritedBlocked();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_ENABLE:
				unsetInheritedEnable();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_VISIBLE:
				unsetInheritedVisible();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__LINE_GAP:
				setLineGap(LINE_GAP_EDEFAULT);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__MULTILINE_MODE:
				unsetMultilineMode();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__TEXT_FLOW:
				unsetTextFlow();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__VISIBLE:
				unsetVisible();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__WIDTH:
				unsetWidth();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__X:
				unsetX();
				return;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__Y:
				unsetY();
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
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__WORD_SEPARATOR:
				return wordSeparator != null && !wordSeparator.isEmpty();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__REVERSE_VIDEO:
				return reverseVideo != null;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FRAME:
				return frame != null;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__UNDERLINE:
				return underline != null;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__STRIKE_THROUGH:
				return strikeThrough != null;
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__ALIGNMENT:
				return isSetAlignment();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__BACKGROUND_COLOR:
				return isSetBackgroundColor();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__BACKGROUND_OPACITY:
				return isSetBackgroundOpacity();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__BLOCKED:
				return isSetBlocked();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__DRAWING_PRIORITY:
				return isSetDrawingPriority();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__ENABLE:
				return isSetEnable();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FILL:
				return isSetFill();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FILL_OPACITY:
				return isSetFillOpacity();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FLOW_DIRECTION:
				return isSetFlowDirection();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FONT_NAME:
				return isSetFontName();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__FONT_SIZE:
				return isSetFontSize();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__HEIGHT:
				return isSetHeight();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_BLOCKED:
				return isSetInheritedBlocked();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_ENABLE:
				return isSetInheritedEnable();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__INHERITED_VISIBLE:
				return isSetInheritedVisible();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__LINE_GAP:
				return LINE_GAP_EDEFAULT == null ? lineGap != null : !LINE_GAP_EDEFAULT.equals(lineGap);
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__MULTILINE_MODE:
				return isSetMultilineMode();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__TEXT_FLOW:
				return isSetTextFlow();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__VISIBLE:
				return isSetVisible();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__WIDTH:
				return isSetWidth();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__X:
				return isSetX();
			case Part2Package.SIMPLE_TEXT_PRIMITIVE__Y:
				return isSetY();
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
		result.append(" (wordSeparator: ");
		result.append(wordSeparator);
		result.append(", alignment: ");
		if (alignmentESet) result.append(alignment); else result.append("<unset>");
		result.append(", backgroundColor: ");
		if (backgroundColorESet) result.append(backgroundColor); else result.append("<unset>");
		result.append(", backgroundOpacity: ");
		if (backgroundOpacityESet) result.append(backgroundOpacity); else result.append("<unset>");
		result.append(", blocked: ");
		if (blockedESet) result.append(blocked); else result.append("<unset>");
		result.append(", drawingPriority: ");
		if (drawingPriorityESet) result.append(drawingPriority); else result.append("<unset>");
		result.append(", enable: ");
		if (enableESet) result.append(enable); else result.append("<unset>");
		result.append(", fill: ");
		if (fillESet) result.append(fill); else result.append("<unset>");
		result.append(", fillOpacity: ");
		if (fillOpacityESet) result.append(fillOpacity); else result.append("<unset>");
		result.append(", flowDirection: ");
		if (flowDirectionESet) result.append(flowDirection); else result.append("<unset>");
		result.append(", fontName: ");
		if (fontNameESet) result.append(fontName); else result.append("<unset>");
		result.append(", fontSize: ");
		if (fontSizeESet) result.append(fontSize); else result.append("<unset>");
		result.append(", height: ");
		if (heightESet) result.append(height); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", inheritedBlocked: ");
		if (inheritedBlockedESet) result.append(inheritedBlocked); else result.append("<unset>");
		result.append(", inheritedEnable: ");
		if (inheritedEnableESet) result.append(inheritedEnable); else result.append("<unset>");
		result.append(", inheritedVisible: ");
		if (inheritedVisibleESet) result.append(inheritedVisible); else result.append("<unset>");
		result.append(", lineGap: ");
		result.append(lineGap);
		result.append(", multilineMode: ");
		if (multilineModeESet) result.append(multilineMode); else result.append("<unset>");
		result.append(", textFlow: ");
		if (textFlowESet) result.append(textFlow); else result.append("<unset>");
		result.append(", value: ");
		result.append(value);
		result.append(", visible: ");
		if (visibleESet) result.append(visible); else result.append("<unset>");
		result.append(", width: ");
		if (widthESet) result.append(width); else result.append("<unset>");
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", y: ");
		if (yESet) result.append(y); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SimpleTextPrimitiveImpl
