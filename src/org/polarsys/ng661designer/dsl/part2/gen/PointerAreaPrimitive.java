/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.gen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer Area Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.PointerAreaPrimitive#getAcceptedButtons <em>Accepted Buttons</em>}</li>
 *   <li>{@link org.example.ng661.part2.PointerAreaPrimitive#getClipPath <em>Clip Path</em>}</li>
 *   <li>{@link org.example.ng661.part2.PointerAreaPrimitive#getClipRule <em>Clip Rule</em>}</li>
 *   <li>{@link org.example.ng661.part2.PointerAreaPrimitive#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.example.ng661.part2.PointerAreaPrimitive#getHeight <em>Height</em>}</li>
 *   <li>{@link org.example.ng661.part2.PointerAreaPrimitive#getId <em>Id</em>}</li>
 *   <li>{@link org.example.ng661.part2.PointerAreaPrimitive#getPassThrough <em>Pass Through</em>}</li>
 *   <li>{@link org.example.ng661.part2.PointerAreaPrimitive#getPreventStealing <em>Prevent Stealing</em>}</li>
 *   <li>{@link org.example.ng661.part2.PointerAreaPrimitive#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.example.ng661.part2.PointerAreaPrimitive#getWidth <em>Width</em>}</li>
 *   <li>{@link org.example.ng661.part2.PointerAreaPrimitive#getX <em>X</em>}</li>
 *   <li>{@link org.example.ng661.part2.PointerAreaPrimitive#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.example.ng661.part2.Part2Package#getPointerAreaPrimitive()
 * @model
 * @generated
 */
public interface PointerAreaPrimitive extends RepresentationTypes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

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
	 * @see org.example.ng661.part2.Part2Package#getPointerAreaPrimitive_AcceptedButtons()
	 * @model default="0" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getAcceptedButtons();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getAcceptedButtons <em>Accepted Buttons</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getAcceptedButtons <em>Accepted Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcceptedButtons()
	 * @see #getAcceptedButtons()
	 * @see #setAcceptedButtons(String)
	 * @generated
	 */
	void unsetAcceptedButtons();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getAcceptedButtons <em>Accepted Buttons</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Clip Path</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip Path</em>' attribute.
	 * @see #isSetClipPath()
	 * @see #unsetClipPath()
	 * @see #setClipPath(String)
	 * @see org.example.ng661.part2.Part2Package#getPointerAreaPrimitive_ClipPath()
	 * @model default="none" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getClipPath();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getClipPath <em>Clip Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip Path</em>' attribute.
	 * @see #isSetClipPath()
	 * @see #unsetClipPath()
	 * @see #getClipPath()
	 * @generated
	 */
	void setClipPath(String value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getClipPath <em>Clip Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClipPath()
	 * @see #getClipPath()
	 * @see #setClipPath(String)
	 * @generated
	 */
	void unsetClipPath();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getClipPath <em>Clip Path</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clip Path</em>' attribute is set.
	 * @see #unsetClipPath()
	 * @see #getClipPath()
	 * @see #setClipPath(String)
	 * @generated
	 */
	boolean isSetClipPath();

	/**
	 * Returns the value of the '<em><b>Clip Rule</b></em>' attribute.
	 * The default value is <code>"nonzero"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip Rule</em>' attribute.
	 * @see #isSetClipRule()
	 * @see #unsetClipRule()
	 * @see #setClipRule(String)
	 * @see org.example.ng661.part2.Part2Package#getPointerAreaPrimitive_ClipRule()
	 * @model default="nonzero" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getClipRule();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getClipRule <em>Clip Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip Rule</em>' attribute.
	 * @see #isSetClipRule()
	 * @see #unsetClipRule()
	 * @see #getClipRule()
	 * @generated
	 */
	void setClipRule(String value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getClipRule <em>Clip Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClipRule()
	 * @see #getClipRule()
	 * @see #setClipRule(String)
	 * @generated
	 */
	void unsetClipRule();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getClipRule <em>Clip Rule</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clip Rule</em>' attribute is set.
	 * @see #unsetClipRule()
	 * @see #getClipRule()
	 * @see #setClipRule(String)
	 * @generated
	 */
	boolean isSetClipRule();

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #setEnabled(Object)
	 * @see org.example.ng661.part2.Part2Package#getPointerAreaPrimitive_Enabled()
	 * @model default="true" unsettable="true" dataType="org.example.ng661.part2.BooleanType"
	 * @generated
	 */
	Object getEnabled();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnabled()
	 * @see #getEnabled()
	 * @see #setEnabled(Object)
	 * @generated
	 */
	void unsetEnabled();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getEnabled <em>Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enabled</em>' attribute is set.
	 * @see #unsetEnabled()
	 * @see #getEnabled()
	 * @see #setEnabled(Object)
	 * @generated
	 */
	boolean isSetEnabled();

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
	 * @see org.example.ng661.part2.Part2Package#getPointerAreaPrimitive_Height()
	 * @model dataType="org.example.ng661.part2.DistanceType"
	 * @generated
	 */
	Object getHeight();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getHeight <em>Height</em>}' attribute.
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
	 * @see org.example.ng661.part2.Part2Package#getPointerAreaPrimitive_Id()
	 * @model dataType="org.example.ng661.part2.NameType" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Pass Through</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pass Through</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass Through</em>' attribute.
	 * @see #isSetPassThrough()
	 * @see #unsetPassThrough()
	 * @see #setPassThrough(Object)
	 * @see org.example.ng661.part2.Part2Package#getPointerAreaPrimitive_PassThrough()
	 * @model default="false" unsettable="true" dataType="org.example.ng661.part2.BooleanType"
	 * @generated
	 */
	Object getPassThrough();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getPassThrough <em>Pass Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass Through</em>' attribute.
	 * @see #isSetPassThrough()
	 * @see #unsetPassThrough()
	 * @see #getPassThrough()
	 * @generated
	 */
	void setPassThrough(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getPassThrough <em>Pass Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPassThrough()
	 * @see #getPassThrough()
	 * @see #setPassThrough(Object)
	 * @generated
	 */
	void unsetPassThrough();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getPassThrough <em>Pass Through</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pass Through</em>' attribute is set.
	 * @see #unsetPassThrough()
	 * @see #getPassThrough()
	 * @see #setPassThrough(Object)
	 * @generated
	 */
	boolean isSetPassThrough();

	/**
	 * Returns the value of the '<em><b>Prevent Stealing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prevent Stealing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prevent Stealing</em>' attribute.
	 * @see #isSetPreventStealing()
	 * @see #unsetPreventStealing()
	 * @see #setPreventStealing(Object)
	 * @see org.example.ng661.part2.Part2Package#getPointerAreaPrimitive_PreventStealing()
	 * @model default="false" unsettable="true" dataType="org.example.ng661.part2.BooleanType"
	 * @generated
	 */
	Object getPreventStealing();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getPreventStealing <em>Prevent Stealing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prevent Stealing</em>' attribute.
	 * @see #isSetPreventStealing()
	 * @see #unsetPreventStealing()
	 * @see #getPreventStealing()
	 * @generated
	 */
	void setPreventStealing(Object value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getPreventStealing <em>Prevent Stealing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreventStealing()
	 * @see #getPreventStealing()
	 * @see #setPreventStealing(Object)
	 * @generated
	 */
	void unsetPreventStealing();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getPreventStealing <em>Prevent Stealing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prevent Stealing</em>' attribute is set.
	 * @see #unsetPreventStealing()
	 * @see #getPreventStealing()
	 * @see #setPreventStealing(Object)
	 * @generated
	 */
	boolean isSetPreventStealing();

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' attribute.
	 * @see #isSetTransform()
	 * @see #unsetTransform()
	 * @see #setTransform(String)
	 * @see org.example.ng661.part2.Part2Package#getPointerAreaPrimitive_Transform()
	 * @model default="none" unsettable="true" dataType="org.example.ng661.part2.StringType"
	 * @generated
	 */
	String getTransform();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' attribute.
	 * @see #isSetTransform()
	 * @see #unsetTransform()
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(String value);

	/**
	 * Unsets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransform()
	 * @see #getTransform()
	 * @see #setTransform(String)
	 * @generated
	 */
	void unsetTransform();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getTransform <em>Transform</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transform</em>' attribute is set.
	 * @see #unsetTransform()
	 * @see #getTransform()
	 * @see #setTransform(String)
	 * @generated
	 */
	boolean isSetTransform();

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
	 * @see org.example.ng661.part2.Part2Package#getPointerAreaPrimitive_Width()
	 * @model dataType="org.example.ng661.part2.DistanceType"
	 * @generated
	 */
	Object getWidth();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getWidth <em>Width</em>}' attribute.
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
	 * @see org.example.ng661.part2.Part2Package#getPointerAreaPrimitive_X()
	 * @model default="0" unsettable="true" dataType="org.example.ng661.part2.PositionType"
	 * @generated
	 */
	Object getX();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getX <em>X</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(Object)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getX <em>X</em>}' attribute is set.
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
	 * @see org.example.ng661.part2.Part2Package#getPointerAreaPrimitive_Y()
	 * @model default="0" unsettable="true" dataType="org.example.ng661.part2.PositionType"
	 * @generated
	 */
	Object getY();

	/**
	 * Sets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getY <em>Y</em>}' attribute.
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
	 * Unsets the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(Object)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link org.example.ng661.part2.PointerAreaPrimitive#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(Object)
	 * @generated
	 */
	boolean isSetY();

} // PointerAreaPrimitive
