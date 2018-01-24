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
 * A representation of the model object '<em><b>Keyboard Input Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getEnable <em>Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedEnable <em>Inherited Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedVisible <em>Inherited Visible</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getNeedFocus <em>Need Focus</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getPassThrough <em>Pass Through</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getKeyboardInputPrimitive()
 * @model
 * @generated
 */
public interface KeyboardInputPrimitive extends TreeTypes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getKeyboardInputPrimitive_Blocked()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getBlocked();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getBlocked <em>Blocked</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getBlocked <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlocked()
	 * @see #getBlocked()
	 * @see #setBlocked(Object)
	 * @generated
	 */
	void unsetBlocked();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getBlocked <em>Blocked</em>}' attribute is set.
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getKeyboardInputPrimitive_Enable()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getEnable();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getEnable <em>Enable</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getEnable <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnable()
	 * @see #getEnable()
	 * @see #setEnable(Object)
	 * @generated
	 */
	void unsetEnable();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getEnable <em>Enable</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Focus</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus</em>' attribute.
	 * @see #isSetFocus()
	 * @see #unsetFocus()
	 * @see #setFocus(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getKeyboardInputPrimitive_Focus()
	 * @model default="false" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getFocus();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getFocus <em>Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' attribute.
	 * @see #isSetFocus()
	 * @see #unsetFocus()
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getFocus <em>Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFocus()
	 * @see #getFocus()
	 * @see #setFocus(Object)
	 * @generated
	 */
	void unsetFocus();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getFocus <em>Focus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Focus</em>' attribute is set.
	 * @see #unsetFocus()
	 * @see #getFocus()
	 * @see #setFocus(Object)
	 * @generated
	 */
	boolean isSetFocus();

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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getKeyboardInputPrimitive_Id()
	 * @model dataType="org.polarsys.ng661designer.part2.NameType" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getId <em>Id</em>}' attribute.
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getKeyboardInputPrimitive_InheritedBlocked()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getInheritedBlocked();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInheritedBlocked()
	 * @see #getInheritedBlocked()
	 * @see #setInheritedBlocked(Object)
	 * @generated
	 */
	void unsetInheritedBlocked();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}' attribute is set.
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getKeyboardInputPrimitive_InheritedEnable()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getInheritedEnable();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedEnable <em>Inherited Enable</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedEnable <em>Inherited Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInheritedEnable()
	 * @see #getInheritedEnable()
	 * @see #setInheritedEnable(Object)
	 * @generated
	 */
	void unsetInheritedEnable();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedEnable <em>Inherited Enable</em>}' attribute is set.
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getKeyboardInputPrimitive_InheritedVisible()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getInheritedVisible();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedVisible <em>Inherited Visible</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedVisible <em>Inherited Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInheritedVisible()
	 * @see #getInheritedVisible()
	 * @see #setInheritedVisible(Object)
	 * @generated
	 */
	void unsetInheritedVisible();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedVisible <em>Inherited Visible</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Need Focus</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Need Focus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need Focus</em>' attribute.
	 * @see #isSetNeedFocus()
	 * @see #unsetNeedFocus()
	 * @see #setNeedFocus(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getKeyboardInputPrimitive_NeedFocus()
	 * @model default="false" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getNeedFocus();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getNeedFocus <em>Need Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need Focus</em>' attribute.
	 * @see #isSetNeedFocus()
	 * @see #unsetNeedFocus()
	 * @see #getNeedFocus()
	 * @generated
	 */
	void setNeedFocus(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getNeedFocus <em>Need Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNeedFocus()
	 * @see #getNeedFocus()
	 * @see #setNeedFocus(Object)
	 * @generated
	 */
	void unsetNeedFocus();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getNeedFocus <em>Need Focus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Need Focus</em>' attribute is set.
	 * @see #unsetNeedFocus()
	 * @see #getNeedFocus()
	 * @see #setNeedFocus(Object)
	 * @generated
	 */
	boolean isSetNeedFocus();

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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getKeyboardInputPrimitive_PassThrough()
	 * @model default="false" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getPassThrough();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getPassThrough <em>Pass Through</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getPassThrough <em>Pass Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPassThrough()
	 * @see #getPassThrough()
	 * @see #setPassThrough(Object)
	 * @generated
	 */
	void unsetPassThrough();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getPassThrough <em>Pass Through</em>}' attribute is set.
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getKeyboardInputPrimitive_Visible()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getVisible();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getVisible <em>Visible</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #getVisible()
	 * @see #setVisible(Object)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getVisible <em>Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible</em>' attribute is set.
	 * @see #unsetVisible()
	 * @see #getVisible()
	 * @see #setVisible(Object)
	 * @generated
	 */
	boolean isSetVisible();

} // KeyboardInputPrimitive
