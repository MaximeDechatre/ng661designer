/**
 * Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.part2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Text Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getWordSeparator <em>Word Separator</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getReverseVideo <em>Reverse Video</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getUnderline <em>Underline</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getStrikeThrough <em>Strike Through</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBackgroundOpacity <em>Background Opacity</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getDrawingPriority <em>Drawing Priority</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getEnable <em>Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFill <em>Fill</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFillOpacity <em>Fill Opacity</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFlowDirection <em>Flow Direction</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFontName <em>Font Name</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getHeight <em>Height</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedEnable <em>Inherited Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedVisible <em>Inherited Visible</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getLineGap <em>Line Gap</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getMultilineMode <em>Multiline Mode</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getTextFlow <em>Text Flow</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getWidth <em>Width</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getX <em>X</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive()
 * @model
 * @generated
 */
public interface SimpleTextPrimitive extends TreeTypes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Word Separator</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word Separator</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word Separator</em>' attribute list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_WordSeparator()
	 * @model unique="false" dataType="org.polarsys.ng661designer.part2.CharacterType"
	 *        extendedMetaData="kind='element' name='wordSeparator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getWordSeparator();

	/**
	 * Returns the value of the '<em><b>Reverse Video</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Video</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Video</em>' containment reference.
	 * @see #setReverseVideo(ReverseVideoProperties)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_ReverseVideo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReverseVideo' namespace='##targetNamespace'"
	 * @generated
	 */
	ReverseVideoProperties getReverseVideo();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getReverseVideo <em>Reverse Video</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Video</em>' containment reference.
	 * @see #getReverseVideo()
	 * @generated
	 */
	void setReverseVideo(ReverseVideoProperties value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference.
	 * @see #setFrame(FrameProperties)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_Frame()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Frame' namespace='##targetNamespace'"
	 * @generated
	 */
	FrameProperties getFrame();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFrame <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' containment reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(FrameProperties value);

	/**
	 * Returns the value of the '<em><b>Underline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underline</em>' containment reference.
	 * @see #setUnderline(UnderlineProperties)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_Underline()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Underline' namespace='##targetNamespace'"
	 * @generated
	 */
	UnderlineProperties getUnderline();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getUnderline <em>Underline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline</em>' containment reference.
	 * @see #getUnderline()
	 * @generated
	 */
	void setUnderline(UnderlineProperties value);

	/**
	 * Returns the value of the '<em><b>Strike Through</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strike Through</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strike Through</em>' containment reference.
	 * @see #setStrikeThrough(StrikeThroughProperties)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_StrikeThrough()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StrikeThrough' namespace='##targetNamespace'"
	 * @generated
	 */
	StrikeThroughProperties getStrikeThrough();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getStrikeThrough <em>Strike Through</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strike Through</em>' containment reference.
	 * @see #getStrikeThrough()
	 * @generated
	 */
	void setStrikeThrough(StrikeThroughProperties value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The default value is <code>"leftOnly"</code>.
	 * The literals are from the enumeration {@link org.polarsys.ng661designer.part2.AlignmentType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.AlignmentType1
	 * @see #isSetAlignment()
	 * @see #unsetAlignment()
	 * @see #setAlignment(AlignmentType1)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_Alignment()
	 * @model default="leftOnly" unsettable="true"
	 * @generated
	 */
	AlignmentType1 getAlignment();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.AlignmentType1
	 * @see #isSetAlignment()
	 * @see #unsetAlignment()
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(AlignmentType1 value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlignment()
	 * @see #getAlignment()
	 * @see #setAlignment(AlignmentType1)
	 * @generated
	 */
	void unsetAlignment();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getAlignment <em>Alignment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alignment</em>' attribute is set.
	 * @see #unsetAlignment()
	 * @see #getAlignment()
	 * @see #setAlignment(AlignmentType1)
	 * @generated
	 */
	boolean isSetAlignment();

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * The default value is <code>"white"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see #isSetBackgroundColor()
	 * @see #unsetBackgroundColor()
	 * @see #setBackgroundColor(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_BackgroundColor()
	 * @model default="white" unsettable="true" dataType="org.polarsys.ng661designer.part2.ColorType"
	 * @generated
	 */
	Object getBackgroundColor();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see #isSetBackgroundColor()
	 * @see #unsetBackgroundColor()
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBackgroundColor()
	 * @see #getBackgroundColor()
	 * @see #setBackgroundColor(Object)
	 * @generated
	 */
	void unsetBackgroundColor();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBackgroundColor <em>Background Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Background Color</em>' attribute is set.
	 * @see #unsetBackgroundColor()
	 * @see #getBackgroundColor()
	 * @see #setBackgroundColor(Object)
	 * @generated
	 */
	boolean isSetBackgroundColor();

	/**
	 * Returns the value of the '<em><b>Background Opacity</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Opacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Opacity</em>' attribute.
	 * @see #isSetBackgroundOpacity()
	 * @see #unsetBackgroundOpacity()
	 * @see #setBackgroundOpacity(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_BackgroundOpacity()
	 * @model default="1.0" unsettable="true" dataType="org.polarsys.ng661designer.part2.OpacityType"
	 * @generated
	 */
	Object getBackgroundOpacity();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBackgroundOpacity <em>Background Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Opacity</em>' attribute.
	 * @see #isSetBackgroundOpacity()
	 * @see #unsetBackgroundOpacity()
	 * @see #getBackgroundOpacity()
	 * @generated
	 */
	void setBackgroundOpacity(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBackgroundOpacity <em>Background Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBackgroundOpacity()
	 * @see #getBackgroundOpacity()
	 * @see #setBackgroundOpacity(Object)
	 * @generated
	 */
	void unsetBackgroundOpacity();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBackgroundOpacity <em>Background Opacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Background Opacity</em>' attribute is set.
	 * @see #unsetBackgroundOpacity()
	 * @see #getBackgroundOpacity()
	 * @see #setBackgroundOpacity(Object)
	 * @generated
	 */
	boolean isSetBackgroundOpacity();

	/**
	 * Returns the value of the '<em><b>Blocked</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocked</em>' attribute.
	 * @see #isSetBlocked()
	 * @see #unsetBlocked()
	 * @see #setBlocked(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_Blocked()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getBlocked();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBlocked <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocked</em>' attribute.
	 * @see #isSetBlocked()
	 * @see #unsetBlocked()
	 * @see #getBlocked()
	 * @generated
	 */
	void setBlocked(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBlocked <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlocked()
	 * @see #getBlocked()
	 * @see #setBlocked(Object)
	 * @generated
	 */
	void unsetBlocked();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBlocked <em>Blocked</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Blocked</em>' attribute is set.
	 * @see #unsetBlocked()
	 * @see #getBlocked()
	 * @see #setBlocked(Object)
	 * @generated
	 */
	boolean isSetBlocked();

	/**
	 * Returns the value of the '<em><b>Drawing Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drawing Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawing Priority</em>' attribute.
	 * @see #isSetDrawingPriority()
	 * @see #unsetDrawingPriority()
	 * @see #setDrawingPriority(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_DrawingPriority()
	 * @model default="0" unsettable="true" dataType="org.polarsys.ng661designer.part2.ZIndexType"
	 * @generated
	 */
	Object getDrawingPriority();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawing Priority</em>' attribute.
	 * @see #isSetDrawingPriority()
	 * @see #unsetDrawingPriority()
	 * @see #getDrawingPriority()
	 * @generated
	 */
	void setDrawingPriority(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrawingPriority()
	 * @see #getDrawingPriority()
	 * @see #setDrawingPriority(Object)
	 * @generated
	 */
	void unsetDrawingPriority();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Drawing Priority</em>' attribute is set.
	 * @see #unsetDrawingPriority()
	 * @see #getDrawingPriority()
	 * @see #setDrawingPriority(Object)
	 * @generated
	 */
	boolean isSetDrawingPriority();

	/**
	 * Returns the value of the '<em><b>Enable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable</em>' attribute.
	 * @see #isSetEnable()
	 * @see #unsetEnable()
	 * @see #setEnable(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_Enable()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getEnable();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getEnable <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable</em>' attribute.
	 * @see #isSetEnable()
	 * @see #unsetEnable()
	 * @see #getEnable()
	 * @generated
	 */
	void setEnable(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getEnable <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnable()
	 * @see #getEnable()
	 * @see #setEnable(Object)
	 * @generated
	 */
	void unsetEnable();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getEnable <em>Enable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enable</em>' attribute is set.
	 * @see #unsetEnable()
	 * @see #getEnable()
	 * @see #setEnable(Object)
	 * @generated
	 */
	boolean isSetEnable();

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' attribute.
	 * The default value is <code>"white"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' attribute.
	 * @see #isSetFill()
	 * @see #unsetFill()
	 * @see #setFill(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_Fill()
	 * @model default="white" unsettable="true" dataType="org.polarsys.ng661designer.part2.ColorType"
	 * @generated
	 */
	Object getFill();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see #isSetFill()
	 * @see #unsetFill()
	 * @see #getFill()
	 * @generated
	 */
	void setFill(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFill()
	 * @see #getFill()
	 * @see #setFill(Object)
	 * @generated
	 */
	void unsetFill();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFill <em>Fill</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill</em>' attribute is set.
	 * @see #unsetFill()
	 * @see #getFill()
	 * @see #setFill(Object)
	 * @generated
	 */
	boolean isSetFill();

	/**
	 * Returns the value of the '<em><b>Fill Opacity</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Opacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Opacity</em>' attribute.
	 * @see #isSetFillOpacity()
	 * @see #unsetFillOpacity()
	 * @see #setFillOpacity(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_FillOpacity()
	 * @model default="1.0" unsettable="true" dataType="org.polarsys.ng661designer.part2.OpacityType"
	 * @generated
	 */
	Object getFillOpacity();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFillOpacity <em>Fill Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Opacity</em>' attribute.
	 * @see #isSetFillOpacity()
	 * @see #unsetFillOpacity()
	 * @see #getFillOpacity()
	 * @generated
	 */
	void setFillOpacity(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFillOpacity <em>Fill Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFillOpacity()
	 * @see #getFillOpacity()
	 * @see #setFillOpacity(Object)
	 * @generated
	 */
	void unsetFillOpacity();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFillOpacity <em>Fill Opacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill Opacity</em>' attribute is set.
	 * @see #unsetFillOpacity()
	 * @see #getFillOpacity()
	 * @see #setFillOpacity(Object)
	 * @generated
	 */
	boolean isSetFillOpacity();

	/**
	 * Returns the value of the '<em><b>Flow Direction</b></em>' attribute.
	 * The default value is <code>"right"</code>.
	 * The literals are from the enumeration {@link org.polarsys.ng661designer.part2.FlowDirectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Direction</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.FlowDirectionType
	 * @see #isSetFlowDirection()
	 * @see #unsetFlowDirection()
	 * @see #setFlowDirection(FlowDirectionType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_FlowDirection()
	 * @model default="right" unsettable="true"
	 * @generated
	 */
	FlowDirectionType getFlowDirection();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFlowDirection <em>Flow Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Direction</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.FlowDirectionType
	 * @see #isSetFlowDirection()
	 * @see #unsetFlowDirection()
	 * @see #getFlowDirection()
	 * @generated
	 */
	void setFlowDirection(FlowDirectionType value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFlowDirection <em>Flow Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlowDirection()
	 * @see #getFlowDirection()
	 * @see #setFlowDirection(FlowDirectionType)
	 * @generated
	 */
	void unsetFlowDirection();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFlowDirection <em>Flow Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flow Direction</em>' attribute is set.
	 * @see #unsetFlowDirection()
	 * @see #getFlowDirection()
	 * @see #setFlowDirection(FlowDirectionType)
	 * @generated
	 */
	boolean isSetFlowDirection();

	/**
	 * Returns the value of the '<em><b>Font Name</b></em>' attribute.
	 * The default value is <code>"Arial"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Name</em>' attribute.
	 * @see #isSetFontName()
	 * @see #unsetFontName()
	 * @see #setFontName(String)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_FontName()
	 * @model default="Arial" unsettable="true" dataType="org.polarsys.ng661designer.part2.StringType"
	 * @generated
	 */
	String getFontName();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFontName <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Name</em>' attribute.
	 * @see #isSetFontName()
	 * @see #unsetFontName()
	 * @see #getFontName()
	 * @generated
	 */
	void setFontName(String value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFontName <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontName()
	 * @see #getFontName()
	 * @see #setFontName(String)
	 * @generated
	 */
	void unsetFontName();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFontName <em>Font Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Name</em>' attribute is set.
	 * @see #unsetFontName()
	 * @see #getFontName()
	 * @see #setFontName(String)
	 * @generated
	 */
	boolean isSetFontName();

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #isSetFontSize()
	 * @see #unsetFontSize()
	 * @see #setFontSize(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_FontSize()
	 * @model default="15" unsettable="true" dataType="org.polarsys.ng661designer.part2.DistanceType"
	 * @generated
	 */
	Object getFontSize();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #isSetFontSize()
	 * @see #unsetFontSize()
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontSize()
	 * @see #getFontSize()
	 * @see #setFontSize(Object)
	 * @generated
	 */
	void unsetFontSize();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFontSize <em>Font Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Size</em>' attribute is set.
	 * @see #unsetFontSize()
	 * @see #getFontSize()
	 * @see #setFontSize(Object)
	 * @generated
	 */
	boolean isSetFontSize();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #setHeight(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_Height()
	 * @model default="0" unsettable="true" dataType="org.polarsys.ng661designer.part2.DistanceType"
	 * @generated
	 */
	Object getHeight();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeight()
	 * @see #getHeight()
	 * @see #setHeight(Object)
	 * @generated
	 */
	void unsetHeight();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getHeight <em>Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Height</em>' attribute is set.
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @see #setHeight(Object)
	 * @generated
	 */
	boolean isSetHeight();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_Id()
	 * @model dataType="org.polarsys.ng661designer.part2.NameType" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Inherited Blocked</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited Blocked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Blocked</em>' attribute.
	 * @see #isSetInheritedBlocked()
	 * @see #unsetInheritedBlocked()
	 * @see #setInheritedBlocked(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_InheritedBlocked()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getInheritedBlocked();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherited Blocked</em>' attribute.
	 * @see #isSetInheritedBlocked()
	 * @see #unsetInheritedBlocked()
	 * @see #getInheritedBlocked()
	 * @generated
	 */
	void setInheritedBlocked(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInheritedBlocked()
	 * @see #getInheritedBlocked()
	 * @see #setInheritedBlocked(Object)
	 * @generated
	 */
	void unsetInheritedBlocked();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inherited Blocked</em>' attribute is set.
	 * @see #unsetInheritedBlocked()
	 * @see #getInheritedBlocked()
	 * @see #setInheritedBlocked(Object)
	 * @generated
	 */
	boolean isSetInheritedBlocked();

	/**
	 * Returns the value of the '<em><b>Inherited Enable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited Enable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Enable</em>' attribute.
	 * @see #isSetInheritedEnable()
	 * @see #unsetInheritedEnable()
	 * @see #setInheritedEnable(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_InheritedEnable()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getInheritedEnable();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedEnable <em>Inherited Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherited Enable</em>' attribute.
	 * @see #isSetInheritedEnable()
	 * @see #unsetInheritedEnable()
	 * @see #getInheritedEnable()
	 * @generated
	 */
	void setInheritedEnable(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedEnable <em>Inherited Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInheritedEnable()
	 * @see #getInheritedEnable()
	 * @see #setInheritedEnable(Object)
	 * @generated
	 */
	void unsetInheritedEnable();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedEnable <em>Inherited Enable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inherited Enable</em>' attribute is set.
	 * @see #unsetInheritedEnable()
	 * @see #getInheritedEnable()
	 * @see #setInheritedEnable(Object)
	 * @generated
	 */
	boolean isSetInheritedEnable();

	/**
	 * Returns the value of the '<em><b>Inherited Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Visible</em>' attribute.
	 * @see #isSetInheritedVisible()
	 * @see #unsetInheritedVisible()
	 * @see #setInheritedVisible(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_InheritedVisible()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getInheritedVisible();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedVisible <em>Inherited Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherited Visible</em>' attribute.
	 * @see #isSetInheritedVisible()
	 * @see #unsetInheritedVisible()
	 * @see #getInheritedVisible()
	 * @generated
	 */
	void setInheritedVisible(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedVisible <em>Inherited Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInheritedVisible()
	 * @see #getInheritedVisible()
	 * @see #setInheritedVisible(Object)
	 * @generated
	 */
	void unsetInheritedVisible();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedVisible <em>Inherited Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inherited Visible</em>' attribute is set.
	 * @see #unsetInheritedVisible()
	 * @see #getInheritedVisible()
	 * @see #setInheritedVisible(Object)
	 * @generated
	 */
	boolean isSetInheritedVisible();

	/**
	 * Returns the value of the '<em><b>Line Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Gap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Gap</em>' attribute.
	 * @see #setLineGap(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_LineGap()
	 * @model dataType="org.polarsys.ng661designer.part2.DistanceType"
	 * @generated
	 */
	Object getLineGap();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getLineGap <em>Line Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Gap</em>' attribute.
	 * @see #getLineGap()
	 * @generated
	 */
	void setLineGap(Object value);

	/**
	 * Returns the value of the '<em><b>Multiline Mode</b></em>' attribute.
	 * The default value is <code>"preserveCharacter"</code>.
	 * The literals are from the enumeration {@link org.polarsys.ng661designer.part2.MultilineModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiline Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiline Mode</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.MultilineModeType
	 * @see #isSetMultilineMode()
	 * @see #unsetMultilineMode()
	 * @see #setMultilineMode(MultilineModeType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_MultilineMode()
	 * @model default="preserveCharacter" unsettable="true"
	 * @generated
	 */
	MultilineModeType getMultilineMode();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getMultilineMode <em>Multiline Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiline Mode</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.MultilineModeType
	 * @see #isSetMultilineMode()
	 * @see #unsetMultilineMode()
	 * @see #getMultilineMode()
	 * @generated
	 */
	void setMultilineMode(MultilineModeType value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getMultilineMode <em>Multiline Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultilineMode()
	 * @see #getMultilineMode()
	 * @see #setMultilineMode(MultilineModeType)
	 * @generated
	 */
	void unsetMultilineMode();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getMultilineMode <em>Multiline Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiline Mode</em>' attribute is set.
	 * @see #unsetMultilineMode()
	 * @see #getMultilineMode()
	 * @see #setMultilineMode(MultilineModeType)
	 * @generated
	 */
	boolean isSetMultilineMode();

	/**
	 * Returns the value of the '<em><b>Text Flow</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.polarsys.ng661designer.part2.TextFlowType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Flow</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.TextFlowType
	 * @see #isSetTextFlow()
	 * @see #unsetTextFlow()
	 * @see #setTextFlow(TextFlowType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_TextFlow()
	 * @model default="none" unsettable="true"
	 * @generated
	 */
	TextFlowType getTextFlow();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getTextFlow <em>Text Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Flow</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.TextFlowType
	 * @see #isSetTextFlow()
	 * @see #unsetTextFlow()
	 * @see #getTextFlow()
	 * @generated
	 */
	void setTextFlow(TextFlowType value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getTextFlow <em>Text Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextFlow()
	 * @see #getTextFlow()
	 * @see #setTextFlow(TextFlowType)
	 * @generated
	 */
	void unsetTextFlow();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getTextFlow <em>Text Flow</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Flow</em>' attribute is set.
	 * @see #unsetTextFlow()
	 * @see #getTextFlow()
	 * @see #setTextFlow(TextFlowType)
	 * @generated
	 */
	boolean isSetTextFlow();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_Value()
	 * @model dataType="org.polarsys.ng661designer.part2.StringType" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #setVisible(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_Visible()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getVisible();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #getVisible()
	 * @generated
	 */
	void setVisible(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #getVisible()
	 * @see #setVisible(Object)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getVisible <em>Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible</em>' attribute is set.
	 * @see #unsetVisible()
	 * @see #getVisible()
	 * @see #setVisible(Object)
	 * @generated
	 */
	boolean isSetVisible();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #setWidth(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_Width()
	 * @model default="0" unsettable="true" dataType="org.polarsys.ng661designer.part2.DistanceType"
	 * @generated
	 */
	Object getWidth();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWidth()
	 * @see #getWidth()
	 * @see #setWidth(Object)
	 * @generated
	 */
	void unsetWidth();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getWidth <em>Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Width</em>' attribute is set.
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @see #setWidth(Object)
	 * @generated
	 */
	boolean isSetWidth();

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_X()
	 * @model default="0" unsettable="true" dataType="org.polarsys.ng661designer.part2.PositionType"
	 * @generated
	 */
	Object getX();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	void setX(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(Object)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(Object)
	 * @generated
	 */
	boolean isSetX();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #setY(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getSimpleTextPrimitive_Y()
	 * @model default="0" unsettable="true" dataType="org.polarsys.ng661designer.part2.PositionType"
	 * @generated
	 */
	Object getY();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #getY()
	 * @generated
	 */
	void setY(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(Object)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(Object)
	 * @generated
	 */
	boolean isSetY();

} // SimpleTextPrimitive
