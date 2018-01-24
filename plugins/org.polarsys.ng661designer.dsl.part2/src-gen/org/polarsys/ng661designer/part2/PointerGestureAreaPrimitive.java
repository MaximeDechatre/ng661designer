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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer Gesture Area Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getAcceptedButtons <em>Accepted Buttons</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getAcceptedGesture <em>Accepted Gesture</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getCursor <em>Cursor</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getEnable <em>Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getHeight <em>Height</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedEnable <em>Inherited Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedVisible <em>Inherited Visible</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getTrackOutside <em>Track Outside</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getWidth <em>Width</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getX <em>X</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive()
 * @model
 * @generated
 */
public interface PointerGestureAreaPrimitive extends TreeTypes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Accepted Buttons</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepted Buttons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Buttons</em>' attribute.
	 * @see #isSetAcceptedButtons()
	 * @see #unsetAcceptedButtons()
	 * @see #setAcceptedButtons(String)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive_AcceptedButtons()
	 * @model default="0" unsettable="true" dataType="org.polarsys.ng661designer.part2.StringType"
	 * @generated
	 */
	String getAcceptedButtons();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getAcceptedButtons <em>Accepted Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepted Buttons</em>' attribute.
	 * @see #isSetAcceptedButtons()
	 * @see #unsetAcceptedButtons()
	 * @see #getAcceptedButtons()
	 * @generated
	 */
	void setAcceptedButtons(String value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getAcceptedButtons <em>Accepted Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcceptedButtons()
	 * @see #getAcceptedButtons()
	 * @see #setAcceptedButtons(String)
	 * @generated
	 */
	void unsetAcceptedButtons();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getAcceptedButtons <em>Accepted Buttons</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Accepted Buttons</em>' attribute is set.
	 * @see #unsetAcceptedButtons()
	 * @see #getAcceptedButtons()
	 * @see #setAcceptedButtons(String)
	 * @generated
	 */
	boolean isSetAcceptedButtons();

	/**
	 * Returns the value of the '<em><b>Accepted Gesture</b></em>' attribute.
	 * The default value is <code>"all"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepted Gesture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Gesture</em>' attribute.
	 * @see #isSetAcceptedGesture()
	 * @see #unsetAcceptedGesture()
	 * @see #setAcceptedGesture(String)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive_AcceptedGesture()
	 * @model default="all" unsettable="true" dataType="org.polarsys.ng661designer.part2.StringType"
	 * @generated
	 */
	String getAcceptedGesture();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getAcceptedGesture <em>Accepted Gesture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepted Gesture</em>' attribute.
	 * @see #isSetAcceptedGesture()
	 * @see #unsetAcceptedGesture()
	 * @see #getAcceptedGesture()
	 * @generated
	 */
	void setAcceptedGesture(String value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getAcceptedGesture <em>Accepted Gesture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcceptedGesture()
	 * @see #getAcceptedGesture()
	 * @see #setAcceptedGesture(String)
	 * @generated
	 */
	void unsetAcceptedGesture();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getAcceptedGesture <em>Accepted Gesture</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Accepted Gesture</em>' attribute is set.
	 * @see #unsetAcceptedGesture()
	 * @see #getAcceptedGesture()
	 * @see #setAcceptedGesture(String)
	 * @generated
	 */
	boolean isSetAcceptedGesture();

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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive_Blocked()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getBlocked();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getBlocked <em>Blocked</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getBlocked <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlocked()
	 * @see #getBlocked()
	 * @see #setBlocked(Object)
	 * @generated
	 */
	void unsetBlocked();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getBlocked <em>Blocked</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor</em>' attribute.
	 * @see #setCursor(String)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive_Cursor()
	 * @model dataType="org.polarsys.ng661designer.part2.ObjectType"
	 * @generated
	 */
	String getCursor();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getCursor <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor</em>' attribute.
	 * @see #getCursor()
	 * @generated
	 */
	void setCursor(String value);

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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive_Enable()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getEnable();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getEnable <em>Enable</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getEnable <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnable()
	 * @see #getEnable()
	 * @see #setEnable(Object)
	 * @generated
	 */
	void unsetEnable();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getEnable <em>Enable</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive_Height()
	 * @model dataType="org.polarsys.ng661designer.part2.DistanceType"
	 * @generated
	 */
	Object getHeight();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Object value);

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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive_Id()
	 * @model dataType="org.polarsys.ng661designer.part2.NameType" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getId <em>Id</em>}' attribute.
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive_InheritedBlocked()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getInheritedBlocked();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInheritedBlocked()
	 * @see #getInheritedBlocked()
	 * @see #setInheritedBlocked(Object)
	 * @generated
	 */
	void unsetInheritedBlocked();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}' attribute is set.
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive_InheritedEnable()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getInheritedEnable();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedEnable <em>Inherited Enable</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedEnable <em>Inherited Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInheritedEnable()
	 * @see #getInheritedEnable()
	 * @see #setInheritedEnable(Object)
	 * @generated
	 */
	void unsetInheritedEnable();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedEnable <em>Inherited Enable</em>}' attribute is set.
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive_InheritedVisible()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getInheritedVisible();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedVisible <em>Inherited Visible</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedVisible <em>Inherited Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInheritedVisible()
	 * @see #getInheritedVisible()
	 * @see #setInheritedVisible(Object)
	 * @generated
	 */
	void unsetInheritedVisible();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedVisible <em>Inherited Visible</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Track Outside</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track Outside</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Outside</em>' attribute.
	 * @see #isSetTrackOutside()
	 * @see #unsetTrackOutside()
	 * @see #setTrackOutside(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive_TrackOutside()
	 * @model default="false" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getTrackOutside();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getTrackOutside <em>Track Outside</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Outside</em>' attribute.
	 * @see #isSetTrackOutside()
	 * @see #unsetTrackOutside()
	 * @see #getTrackOutside()
	 * @generated
	 */
	void setTrackOutside(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getTrackOutside <em>Track Outside</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrackOutside()
	 * @see #getTrackOutside()
	 * @see #setTrackOutside(Object)
	 * @generated
	 */
	void unsetTrackOutside();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getTrackOutside <em>Track Outside</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Track Outside</em>' attribute is set.
	 * @see #unsetTrackOutside()
	 * @see #getTrackOutside()
	 * @see #setTrackOutside(Object)
	 * @generated
	 */
	boolean isSetTrackOutside();

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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive_Visible()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getVisible();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getVisible <em>Visible</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #getVisible()
	 * @see #setVisible(Object)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getVisible <em>Visible</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive_Width()
	 * @model dataType="org.polarsys.ng661designer.part2.DistanceType"
	 * @generated
	 */
	Object getWidth();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Object value);

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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive_X()
	 * @model default="0" unsettable="true" dataType="org.polarsys.ng661designer.part2.PositionType"
	 * @generated
	 */
	Object getX();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getX <em>X</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(Object)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getX <em>X</em>}' attribute is set.
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getPointerGestureAreaPrimitive_Y()
	 * @model default="0" unsettable="true" dataType="org.polarsys.ng661designer.part2.PositionType"
	 * @generated
	 */
	Object getY();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getY <em>Y</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(Object)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(Object)
	 * @generated
	 */
	boolean isSetY();

} // PointerGestureAreaPrimitive
