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
 * A representation of the model object '<em><b>Line Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getDrawingPriority <em>Drawing Priority</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getEnable <em>Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getInheritedBlocked <em>Inherited Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getInheritedEnable <em>Inherited Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getInheritedVisible <em>Inherited Visible</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getStroke <em>Stroke</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeLinecap <em>Stroke Linecap</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokewidth <em>Strokewidth</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getX1 <em>X1</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getX2 <em>X2</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.LinePrimitive#getY2 <em>Y2</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive()
 * @model
 * @generated
 */
public interface LinePrimitive extends ClipPathTypes {
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_Blocked()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getBlocked();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getBlocked <em>Blocked</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getBlocked <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlocked()
	 * @see #getBlocked()
	 * @see #setBlocked(Object)
	 * @generated
	 */
	void unsetBlocked();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getBlocked <em>Blocked</em>}' attribute is set.
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_DrawingPriority()
	 * @model default="0" unsettable="true" dataType="org.polarsys.ng661designer.part2.ZIndexType"
	 * @generated
	 */
	Object getDrawingPriority();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrawingPriority()
	 * @see #getDrawingPriority()
	 * @see #setDrawingPriority(Object)
	 * @generated
	 */
	void unsetDrawingPriority();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getDrawingPriority <em>Drawing Priority</em>}' attribute is set.
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_Enable()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getEnable();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getEnable <em>Enable</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getEnable <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnable()
	 * @see #getEnable()
	 * @see #setEnable(Object)
	 * @generated
	 */
	void unsetEnable();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getEnable <em>Enable</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_Id()
	 * @model dataType="org.polarsys.ng661designer.part2.NameType" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getId <em>Id</em>}' attribute.
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_InheritedBlocked()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getInheritedBlocked();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getInheritedBlocked <em>Inherited Blocked</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getInheritedBlocked <em>Inherited Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInheritedBlocked()
	 * @see #getInheritedBlocked()
	 * @see #setInheritedBlocked(Object)
	 * @generated
	 */
	void unsetInheritedBlocked();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getInheritedBlocked <em>Inherited Blocked</em>}' attribute is set.
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_InheritedEnable()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getInheritedEnable();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getInheritedEnable <em>Inherited Enable</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getInheritedEnable <em>Inherited Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInheritedEnable()
	 * @see #getInheritedEnable()
	 * @see #setInheritedEnable(Object)
	 * @generated
	 */
	void unsetInheritedEnable();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getInheritedEnable <em>Inherited Enable</em>}' attribute is set.
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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_InheritedVisible()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getInheritedVisible();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getInheritedVisible <em>Inherited Visible</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getInheritedVisible <em>Inherited Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInheritedVisible()
	 * @see #getInheritedVisible()
	 * @see #setInheritedVisible(Object)
	 * @generated
	 */
	void unsetInheritedVisible();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getInheritedVisible <em>Inherited Visible</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Stroke</b></em>' attribute.
	 * The default value is <code>"white"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke</em>' attribute.
	 * @see #isSetStroke()
	 * @see #unsetStroke()
	 * @see #setStroke(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_Stroke()
	 * @model default="white" unsettable="true" dataType="org.polarsys.ng661designer.part2.ColorType"
	 * @generated
	 */
	Object getStroke();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStroke <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' attribute.
	 * @see #isSetStroke()
	 * @see #unsetStroke()
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStroke <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStroke()
	 * @see #getStroke()
	 * @see #setStroke(Object)
	 * @generated
	 */
	void unsetStroke();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStroke <em>Stroke</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke</em>' attribute is set.
	 * @see #unsetStroke()
	 * @see #getStroke()
	 * @see #setStroke(Object)
	 * @generated
	 */
	boolean isSetStroke();

	/**
	 * Returns the value of the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Dasharray</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Dasharray</em>' attribute.
	 * @see #isSetStrokeDasharray()
	 * @see #unsetStrokeDasharray()
	 * @see #setStrokeDasharray(String)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_StrokeDasharray()
	 * @model default="none" unsettable="true" dataType="org.polarsys.ng661designer.part2.StippleType"
	 * @generated
	 */
	String getStrokeDasharray();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Dasharray</em>' attribute.
	 * @see #isSetStrokeDasharray()
	 * @see #unsetStrokeDasharray()
	 * @see #getStrokeDasharray()
	 * @generated
	 */
	void setStrokeDasharray(String value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeDasharray()
	 * @see #getStrokeDasharray()
	 * @see #setStrokeDasharray(String)
	 * @generated
	 */
	void unsetStrokeDasharray();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Dasharray</em>' attribute is set.
	 * @see #unsetStrokeDasharray()
	 * @see #getStrokeDasharray()
	 * @see #setStrokeDasharray(String)
	 * @generated
	 */
	boolean isSetStrokeDasharray();

	/**
	 * Returns the value of the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Dashoffset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Dashoffset</em>' attribute.
	 * @see #isSetStrokeDashoffset()
	 * @see #unsetStrokeDashoffset()
	 * @see #setStrokeDashoffset(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_StrokeDashoffset()
	 * @model default="0" unsettable="true" dataType="org.polarsys.ng661designer.part2.DistanceType"
	 * @generated
	 */
	Object getStrokeDashoffset();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Dashoffset</em>' attribute.
	 * @see #isSetStrokeDashoffset()
	 * @see #unsetStrokeDashoffset()
	 * @see #getStrokeDashoffset()
	 * @generated
	 */
	void setStrokeDashoffset(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeDashoffset()
	 * @see #getStrokeDashoffset()
	 * @see #setStrokeDashoffset(Object)
	 * @generated
	 */
	void unsetStrokeDashoffset();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Dashoffset</em>' attribute is set.
	 * @see #unsetStrokeDashoffset()
	 * @see #getStrokeDashoffset()
	 * @see #setStrokeDashoffset(Object)
	 * @generated
	 */
	boolean isSetStrokeDashoffset();

	/**
	 * Returns the value of the '<em><b>Stroke Linecap</b></em>' attribute.
	 * The default value is <code>"butt"</code>.
	 * The literals are from the enumeration {@link org.polarsys.ng661designer.part2.StrokeLinecapType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Linecap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Linecap</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.StrokeLinecapType
	 * @see #isSetStrokeLinecap()
	 * @see #unsetStrokeLinecap()
	 * @see #setStrokeLinecap(StrokeLinecapType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_StrokeLinecap()
	 * @model default="butt" unsettable="true"
	 * @generated
	 */
	StrokeLinecapType getStrokeLinecap();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeLinecap <em>Stroke Linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Linecap</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.StrokeLinecapType
	 * @see #isSetStrokeLinecap()
	 * @see #unsetStrokeLinecap()
	 * @see #getStrokeLinecap()
	 * @generated
	 */
	void setStrokeLinecap(StrokeLinecapType value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeLinecap <em>Stroke Linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeLinecap()
	 * @see #getStrokeLinecap()
	 * @see #setStrokeLinecap(StrokeLinecapType)
	 * @generated
	 */
	void unsetStrokeLinecap();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeLinecap <em>Stroke Linecap</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Linecap</em>' attribute is set.
	 * @see #unsetStrokeLinecap()
	 * @see #getStrokeLinecap()
	 * @see #setStrokeLinecap(StrokeLinecapType)
	 * @generated
	 */
	boolean isSetStrokeLinecap();

	/**
	 * Returns the value of the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * The default value is <code>"miter"</code>.
	 * The literals are from the enumeration {@link org.polarsys.ng661designer.part2.StrokeLinejoinType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Linejoin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Linejoin</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.StrokeLinejoinType
	 * @see #isSetStrokeLinejoin()
	 * @see #unsetStrokeLinejoin()
	 * @see #setStrokeLinejoin(StrokeLinejoinType)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_StrokeLinejoin()
	 * @model default="miter" unsettable="true"
	 * @generated
	 */
	StrokeLinejoinType getStrokeLinejoin();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Linejoin</em>' attribute.
	 * @see org.polarsys.ng661designer.part2.StrokeLinejoinType
	 * @see #isSetStrokeLinejoin()
	 * @see #unsetStrokeLinejoin()
	 * @see #getStrokeLinejoin()
	 * @generated
	 */
	void setStrokeLinejoin(StrokeLinejoinType value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeLinejoin()
	 * @see #getStrokeLinejoin()
	 * @see #setStrokeLinejoin(StrokeLinejoinType)
	 * @generated
	 */
	void unsetStrokeLinejoin();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Linejoin</em>' attribute is set.
	 * @see #unsetStrokeLinejoin()
	 * @see #getStrokeLinejoin()
	 * @see #setStrokeLinejoin(StrokeLinejoinType)
	 * @generated
	 */
	boolean isSetStrokeLinejoin();

	/**
	 * Returns the value of the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * The default value is <code>"4.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Miterlimit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Miterlimit</em>' attribute.
	 * @see #isSetStrokeMiterlimit()
	 * @see #unsetStrokeMiterlimit()
	 * @see #setStrokeMiterlimit(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_StrokeMiterlimit()
	 * @model default="4.0" unsettable="true" dataType="org.polarsys.ng661designer.part2.RealType"
	 * @generated
	 */
	Object getStrokeMiterlimit();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Miterlimit</em>' attribute.
	 * @see #isSetStrokeMiterlimit()
	 * @see #unsetStrokeMiterlimit()
	 * @see #getStrokeMiterlimit()
	 * @generated
	 */
	void setStrokeMiterlimit(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeMiterlimit()
	 * @see #getStrokeMiterlimit()
	 * @see #setStrokeMiterlimit(Object)
	 * @generated
	 */
	void unsetStrokeMiterlimit();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Miterlimit</em>' attribute is set.
	 * @see #unsetStrokeMiterlimit()
	 * @see #getStrokeMiterlimit()
	 * @see #setStrokeMiterlimit(Object)
	 * @generated
	 */
	boolean isSetStrokeMiterlimit();

	/**
	 * Returns the value of the '<em><b>Stroke Opacity</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Opacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Opacity</em>' attribute.
	 * @see #isSetStrokeOpacity()
	 * @see #unsetStrokeOpacity()
	 * @see #setStrokeOpacity(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_StrokeOpacity()
	 * @model default="1.0" unsettable="true" dataType="org.polarsys.ng661designer.part2.OpacityType"
	 * @generated
	 */
	Object getStrokeOpacity();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeOpacity <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Opacity</em>' attribute.
	 * @see #isSetStrokeOpacity()
	 * @see #unsetStrokeOpacity()
	 * @see #getStrokeOpacity()
	 * @generated
	 */
	void setStrokeOpacity(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeOpacity <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeOpacity()
	 * @see #getStrokeOpacity()
	 * @see #setStrokeOpacity(Object)
	 * @generated
	 */
	void unsetStrokeOpacity();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeOpacity <em>Stroke Opacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Opacity</em>' attribute is set.
	 * @see #unsetStrokeOpacity()
	 * @see #getStrokeOpacity()
	 * @see #setStrokeOpacity(Object)
	 * @generated
	 */
	boolean isSetStrokeOpacity();

	/**
	 * Returns the value of the '<em><b>Strokewidth</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strokewidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strokewidth</em>' attribute.
	 * @see #isSetStrokewidth()
	 * @see #unsetStrokewidth()
	 * @see #setStrokewidth(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_Strokewidth()
	 * @model default="1.0" unsettable="true" dataType="org.polarsys.ng661designer.part2.DistanceType"
	 * @generated
	 */
	Object getStrokewidth();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokewidth <em>Strokewidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strokewidth</em>' attribute.
	 * @see #isSetStrokewidth()
	 * @see #unsetStrokewidth()
	 * @see #getStrokewidth()
	 * @generated
	 */
	void setStrokewidth(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokewidth <em>Strokewidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokewidth()
	 * @see #getStrokewidth()
	 * @see #setStrokewidth(Object)
	 * @generated
	 */
	void unsetStrokewidth();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokewidth <em>Strokewidth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Strokewidth</em>' attribute is set.
	 * @see #unsetStrokewidth()
	 * @see #getStrokewidth()
	 * @see #setStrokewidth(Object)
	 * @generated
	 */
	boolean isSetStrokewidth();

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
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_Visible()
	 * @model default="true" unsettable="true" dataType="org.polarsys.ng661designer.part2.BooleanType"
	 * @generated
	 */
	Object getVisible();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getVisible <em>Visible</em>}' attribute.
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
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #getVisible()
	 * @see #setVisible(Object)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getVisible <em>Visible</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>X1</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X1</em>' attribute.
	 * @see #isSetX1()
	 * @see #unsetX1()
	 * @see #setX1(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_X1()
	 * @model default="0" unsettable="true" dataType="org.polarsys.ng661designer.part2.PositionType"
	 * @generated
	 */
	Object getX1();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getX1 <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X1</em>' attribute.
	 * @see #isSetX1()
	 * @see #unsetX1()
	 * @see #getX1()
	 * @generated
	 */
	void setX1(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getX1 <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX1()
	 * @see #getX1()
	 * @see #setX1(Object)
	 * @generated
	 */
	void unsetX1();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getX1 <em>X1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X1</em>' attribute is set.
	 * @see #unsetX1()
	 * @see #getX1()
	 * @see #setX1(Object)
	 * @generated
	 */
	boolean isSetX1();

	/**
	 * Returns the value of the '<em><b>X2</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X2</em>' attribute.
	 * @see #isSetX2()
	 * @see #unsetX2()
	 * @see #setX2(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_X2()
	 * @model default="0" unsettable="true" dataType="org.polarsys.ng661designer.part2.PositionType"
	 * @generated
	 */
	Object getX2();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X2</em>' attribute.
	 * @see #isSetX2()
	 * @see #unsetX2()
	 * @see #getX2()
	 * @generated
	 */
	void setX2(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX2()
	 * @see #getX2()
	 * @see #setX2(Object)
	 * @generated
	 */
	void unsetX2();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getX2 <em>X2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X2</em>' attribute is set.
	 * @see #unsetX2()
	 * @see #getX2()
	 * @see #setX2(Object)
	 * @generated
	 */
	boolean isSetX2();

	/**
	 * Returns the value of the '<em><b>Y1</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1</em>' attribute.
	 * @see #isSetY1()
	 * @see #unsetY1()
	 * @see #setY1(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_Y1()
	 * @model default="0" unsettable="true" dataType="org.polarsys.ng661designer.part2.PositionType"
	 * @generated
	 */
	Object getY1();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getY1 <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1</em>' attribute.
	 * @see #isSetY1()
	 * @see #unsetY1()
	 * @see #getY1()
	 * @generated
	 */
	void setY1(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getY1 <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY1()
	 * @see #getY1()
	 * @see #setY1(Object)
	 * @generated
	 */
	void unsetY1();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getY1 <em>Y1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y1</em>' attribute is set.
	 * @see #unsetY1()
	 * @see #getY1()
	 * @see #setY1(Object)
	 * @generated
	 */
	boolean isSetY1();

	/**
	 * Returns the value of the '<em><b>Y2</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2</em>' attribute.
	 * @see #isSetY2()
	 * @see #unsetY2()
	 * @see #setY2(Object)
	 * @see org.polarsys.ng661designer.part2.Part2Package#getLinePrimitive_Y2()
	 * @model default="0" unsettable="true" dataType="org.polarsys.ng661designer.part2.PositionType"
	 * @generated
	 */
	Object getY2();

	/**
	 * Sets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getY2 <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2</em>' attribute.
	 * @see #isSetY2()
	 * @see #unsetY2()
	 * @see #getY2()
	 * @generated
	 */
	void setY2(Object value);

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getY2 <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY2()
	 * @see #getY2()
	 * @see #setY2(Object)
	 * @generated
	 */
	void unsetY2();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.LinePrimitive#getY2 <em>Y2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y2</em>' attribute is set.
	 * @see #unsetY2()
	 * @see #getY2()
	 * @see #setY2(Object)
	 * @generated
	 */
	boolean isSetY2();

} // LinePrimitive
