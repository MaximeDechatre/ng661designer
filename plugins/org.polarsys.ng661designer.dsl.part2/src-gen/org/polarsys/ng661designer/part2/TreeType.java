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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TO DO
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getImport <em>Import</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getTransformGroup <em>Transform Group</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getReplicate <em>Replicate</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getChildren <em>Children</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getSwitchNode <em>Switch Node</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getClippingContainer <em>Clipping Container</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getLine <em>Line</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getPath <em>Path</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getImage <em>Image</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getSimpleText <em>Simple Text</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getArc <em>Arc</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getCrown <em>Crown</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getPolarLine <em>Polar Line</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getPointerArea <em>Pointer Area</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getPointerGestureArea <em>Pointer Gesture Area</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getTouchArea <em>Touch Area</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getGestureArea <em>Gesture Area</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getKeyboardInput <em>Keyboard Input</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getScrollWheelInput <em>Scroll Wheel Input</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getClock <em>Clock</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.TreeType#getCompositions <em>Compositions</em>}</li>
 * </ul>
 *
 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType()
 * @model
 * @generated
 */
public interface TreeType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.TreeTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<TreeTypes> getGroup();

	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ImportType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference list.
	 * @see #isSetImport()
	 * @see #unsetImport()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Import()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ImportType> getImport();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getImport <em>Import</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImport()
	 * @see #getImport()
	 * @generated
	 */
	void unsetImport();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getImport <em>Import</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Import</em>' reference list is set.
	 * @see #unsetImport()
	 * @see #getImport()
	 * @generated
	 */
	boolean isSetImport();

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.GroupPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group1</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' reference list.
	 * @see #isSetGroup1()
	 * @see #unsetGroup1()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Group1()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<GroupPrimitive> getGroup1();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getGroup1 <em>Group1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroup1()
	 * @see #getGroup1()
	 * @generated
	 */
	void unsetGroup1();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getGroup1 <em>Group1</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Group1</em>' reference list is set.
	 * @see #unsetGroup1()
	 * @see #getGroup1()
	 * @generated
	 */
	boolean isSetGroup1();

	/**
	 * Returns the value of the '<em><b>Transform Group</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.TransformGroupPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform Group</em>' reference list.
	 * @see #isSetTransformGroup()
	 * @see #unsetTransformGroup()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_TransformGroup()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<TransformGroupPrimitive> getTransformGroup();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getTransformGroup <em>Transform Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransformGroup()
	 * @see #getTransformGroup()
	 * @generated
	 */
	void unsetTransformGroup();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getTransformGroup <em>Transform Group</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transform Group</em>' reference list is set.
	 * @see #unsetTransformGroup()
	 * @see #getTransformGroup()
	 * @generated
	 */
	boolean isSetTransformGroup();

	/**
	 * Returns the value of the '<em><b>Replicate</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ReplicatePrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replicate</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replicate</em>' reference list.
	 * @see #isSetReplicate()
	 * @see #unsetReplicate()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Replicate()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ReplicatePrimitive> getReplicate();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getReplicate <em>Replicate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReplicate()
	 * @see #getReplicate()
	 * @generated
	 */
	void unsetReplicate();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getReplicate <em>Replicate</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Replicate</em>' reference list is set.
	 * @see #unsetReplicate()
	 * @see #getReplicate()
	 * @generated
	 */
	boolean isSetReplicate();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ChildPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see #isSetChildren()
	 * @see #unsetChildren()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Children()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ChildPrimitive> getChildren();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getChildren <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChildren()
	 * @see #getChildren()
	 * @generated
	 */
	void unsetChildren();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getChildren <em>Children</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Children</em>' reference list is set.
	 * @see #unsetChildren()
	 * @see #getChildren()
	 * @generated
	 */
	boolean isSetChildren();

	/**
	 * Returns the value of the '<em><b>Switch Node</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.SwitchNodePrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Node</em>' reference list.
	 * @see #isSetSwitchNode()
	 * @see #unsetSwitchNode()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_SwitchNode()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<SwitchNodePrimitive> getSwitchNode();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getSwitchNode <em>Switch Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSwitchNode()
	 * @see #getSwitchNode()
	 * @generated
	 */
	void unsetSwitchNode();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getSwitchNode <em>Switch Node</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Switch Node</em>' reference list is set.
	 * @see #unsetSwitchNode()
	 * @see #getSwitchNode()
	 * @generated
	 */
	boolean isSetSwitchNode();

	/**
	 * Returns the value of the '<em><b>Clipping Container</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clipping Container</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clipping Container</em>' reference list.
	 * @see #isSetClippingContainer()
	 * @see #unsetClippingContainer()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_ClippingContainer()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ClippingContainerPrimitive> getClippingContainer();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getClippingContainer <em>Clipping Container</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClippingContainer()
	 * @see #getClippingContainer()
	 * @generated
	 */
	void unsetClippingContainer();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getClippingContainer <em>Clipping Container</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clipping Container</em>' reference list is set.
	 * @see #unsetClippingContainer()
	 * @see #getClippingContainer()
	 * @generated
	 */
	boolean isSetClippingContainer();

	/**
	 * Returns the value of the '<em><b>Rectangle</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.RectPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rectangle</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectangle</em>' reference list.
	 * @see #isSetRectangle()
	 * @see #unsetRectangle()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Rectangle()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<RectPrimitive> getRectangle();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getRectangle <em>Rectangle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRectangle()
	 * @see #getRectangle()
	 * @generated
	 */
	void unsetRectangle();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getRectangle <em>Rectangle</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rectangle</em>' reference list is set.
	 * @see #unsetRectangle()
	 * @see #getRectangle()
	 * @generated
	 */
	boolean isSetRectangle();

	/**
	 * Returns the value of the '<em><b>Circle</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.CirclePrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circle</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circle</em>' reference list.
	 * @see #isSetCircle()
	 * @see #unsetCircle()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Circle()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<CirclePrimitive> getCircle();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getCircle <em>Circle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCircle()
	 * @see #getCircle()
	 * @generated
	 */
	void unsetCircle();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getCircle <em>Circle</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Circle</em>' reference list is set.
	 * @see #unsetCircle()
	 * @see #getCircle()
	 * @generated
	 */
	boolean isSetCircle();

	/**
	 * Returns the value of the '<em><b>Ellipse</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.EllipsePrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ellipse</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipse</em>' reference list.
	 * @see #isSetEllipse()
	 * @see #unsetEllipse()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Ellipse()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<EllipsePrimitive> getEllipse();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getEllipse <em>Ellipse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEllipse()
	 * @see #getEllipse()
	 * @generated
	 */
	void unsetEllipse();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getEllipse <em>Ellipse</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ellipse</em>' reference list is set.
	 * @see #unsetEllipse()
	 * @see #getEllipse()
	 * @generated
	 */
	boolean isSetEllipse();

	/**
	 * Returns the value of the '<em><b>Line</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.LinePrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' reference list.
	 * @see #isSetLine()
	 * @see #unsetLine()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Line()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<LinePrimitive> getLine();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getLine <em>Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLine()
	 * @see #getLine()
	 * @generated
	 */
	void unsetLine();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getLine <em>Line</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line</em>' reference list is set.
	 * @see #unsetLine()
	 * @see #getLine()
	 * @generated
	 */
	boolean isSetLine();

	/**
	 * Returns the value of the '<em><b>Polyline</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.PolylinePrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polyline</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polyline</em>' reference list.
	 * @see #isSetPolyline()
	 * @see #unsetPolyline()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Polyline()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PolylinePrimitive> getPolyline();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getPolyline <em>Polyline</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolyline()
	 * @see #getPolyline()
	 * @generated
	 */
	void unsetPolyline();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getPolyline <em>Polyline</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Polyline</em>' reference list is set.
	 * @see #unsetPolyline()
	 * @see #getPolyline()
	 * @generated
	 */
	boolean isSetPolyline();

	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.PolygonPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon</em>' reference list.
	 * @see #isSetPolygon()
	 * @see #unsetPolygon()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Polygon()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PolygonPrimitive> getPolygon();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getPolygon <em>Polygon</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolygon()
	 * @see #getPolygon()
	 * @generated
	 */
	void unsetPolygon();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getPolygon <em>Polygon</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Polygon</em>' reference list is set.
	 * @see #unsetPolygon()
	 * @see #getPolygon()
	 * @generated
	 */
	boolean isSetPolygon();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.PathPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' reference list.
	 * @see #isSetPath()
	 * @see #unsetPath()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Path()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PathPrimitive> getPath();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getPath <em>Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPath()
	 * @see #getPath()
	 * @generated
	 */
	void unsetPath();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getPath <em>Path</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Path</em>' reference list is set.
	 * @see #unsetPath()
	 * @see #getPath()
	 * @generated
	 */
	boolean isSetPath();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ImagePrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference list.
	 * @see #isSetImage()
	 * @see #unsetImage()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Image()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ImagePrimitive> getImage();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getImage <em>Image</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImage()
	 * @see #getImage()
	 * @generated
	 */
	void unsetImage();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getImage <em>Image</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Image</em>' reference list is set.
	 * @see #unsetImage()
	 * @see #getImage()
	 * @generated
	 */
	boolean isSetImage();

	/**
	 * Returns the value of the '<em><b>Simple Text</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.SimpleTextPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Text</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Text</em>' reference list.
	 * @see #isSetSimpleText()
	 * @see #unsetSimpleText()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_SimpleText()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<SimpleTextPrimitive> getSimpleText();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getSimpleText <em>Simple Text</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSimpleText()
	 * @see #getSimpleText()
	 * @generated
	 */
	void unsetSimpleText();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getSimpleText <em>Simple Text</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Simple Text</em>' reference list is set.
	 * @see #unsetSimpleText()
	 * @see #getSimpleText()
	 * @generated
	 */
	boolean isSetSimpleText();

	/**
	 * Returns the value of the '<em><b>Arc</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ArcComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc</em>' reference list.
	 * @see #isSetArc()
	 * @see #unsetArc()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Arc()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ArcComponent> getArc();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getArc <em>Arc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArc()
	 * @see #getArc()
	 * @generated
	 */
	void unsetArc();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getArc <em>Arc</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Arc</em>' reference list is set.
	 * @see #unsetArc()
	 * @see #getArc()
	 * @generated
	 */
	boolean isSetArc();

	/**
	 * Returns the value of the '<em><b>Crown</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.CrownComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crown</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crown</em>' reference list.
	 * @see #isSetCrown()
	 * @see #unsetCrown()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Crown()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<CrownComponent> getCrown();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getCrown <em>Crown</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrown()
	 * @see #getCrown()
	 * @generated
	 */
	void unsetCrown();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getCrown <em>Crown</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Crown</em>' reference list is set.
	 * @see #unsetCrown()
	 * @see #getCrown()
	 * @generated
	 */
	boolean isSetCrown();

	/**
	 * Returns the value of the '<em><b>Polar Line</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.PolarLineComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polar Line</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polar Line</em>' reference list.
	 * @see #isSetPolarLine()
	 * @see #unsetPolarLine()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_PolarLine()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PolarLineComponent> getPolarLine();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getPolarLine <em>Polar Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolarLine()
	 * @see #getPolarLine()
	 * @generated
	 */
	void unsetPolarLine();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getPolarLine <em>Polar Line</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Polar Line</em>' reference list is set.
	 * @see #unsetPolarLine()
	 * @see #getPolarLine()
	 * @generated
	 */
	boolean isSetPolarLine();

	/**
	 * Returns the value of the '<em><b>Pointer Area</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.PointerAreaPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointer Area</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer Area</em>' reference list.
	 * @see #isSetPointerArea()
	 * @see #unsetPointerArea()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_PointerArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PointerAreaPrimitive> getPointerArea();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getPointerArea <em>Pointer Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPointerArea()
	 * @see #getPointerArea()
	 * @generated
	 */
	void unsetPointerArea();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getPointerArea <em>Pointer Area</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pointer Area</em>' reference list is set.
	 * @see #unsetPointerArea()
	 * @see #getPointerArea()
	 * @generated
	 */
	boolean isSetPointerArea();

	/**
	 * Returns the value of the '<em><b>Pointer Gesture Area</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointer Gesture Area</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer Gesture Area</em>' reference list.
	 * @see #isSetPointerGestureArea()
	 * @see #unsetPointerGestureArea()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_PointerGestureArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PointerGestureAreaPrimitive> getPointerGestureArea();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getPointerGestureArea <em>Pointer Gesture Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPointerGestureArea()
	 * @see #getPointerGestureArea()
	 * @generated
	 */
	void unsetPointerGestureArea();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getPointerGestureArea <em>Pointer Gesture Area</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pointer Gesture Area</em>' reference list is set.
	 * @see #unsetPointerGestureArea()
	 * @see #getPointerGestureArea()
	 * @generated
	 */
	boolean isSetPointerGestureArea();

	/**
	 * Returns the value of the '<em><b>Touch Area</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.TouchAreaPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Touch Area</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touch Area</em>' reference list.
	 * @see #isSetTouchArea()
	 * @see #unsetTouchArea()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_TouchArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<TouchAreaPrimitive> getTouchArea();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getTouchArea <em>Touch Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTouchArea()
	 * @see #getTouchArea()
	 * @generated
	 */
	void unsetTouchArea();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getTouchArea <em>Touch Area</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Touch Area</em>' reference list is set.
	 * @see #unsetTouchArea()
	 * @see #getTouchArea()
	 * @generated
	 */
	boolean isSetTouchArea();

	/**
	 * Returns the value of the '<em><b>Gesture Area</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.GestureAreaPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gesture Area</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gesture Area</em>' reference list.
	 * @see #isSetGestureArea()
	 * @see #unsetGestureArea()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_GestureArea()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<GestureAreaPrimitive> getGestureArea();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getGestureArea <em>Gesture Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGestureArea()
	 * @see #getGestureArea()
	 * @generated
	 */
	void unsetGestureArea();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getGestureArea <em>Gesture Area</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gesture Area</em>' reference list is set.
	 * @see #unsetGestureArea()
	 * @see #getGestureArea()
	 * @generated
	 */
	boolean isSetGestureArea();

	/**
	 * Returns the value of the '<em><b>Keyboard Input</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyboard Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyboard Input</em>' reference list.
	 * @see #isSetKeyboardInput()
	 * @see #unsetKeyboardInput()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_KeyboardInput()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<KeyboardInputPrimitive> getKeyboardInput();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getKeyboardInput <em>Keyboard Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeyboardInput()
	 * @see #getKeyboardInput()
	 * @generated
	 */
	void unsetKeyboardInput();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getKeyboardInput <em>Keyboard Input</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Keyboard Input</em>' reference list is set.
	 * @see #unsetKeyboardInput()
	 * @see #getKeyboardInput()
	 * @generated
	 */
	boolean isSetKeyboardInput();

	/**
	 * Returns the value of the '<em><b>Scroll Wheel Input</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scroll Wheel Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scroll Wheel Input</em>' reference list.
	 * @see #isSetScrollWheelInput()
	 * @see #unsetScrollWheelInput()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_ScrollWheelInput()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ScrollWheelInputPrimitive> getScrollWheelInput();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getScrollWheelInput <em>Scroll Wheel Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScrollWheelInput()
	 * @see #getScrollWheelInput()
	 * @generated
	 */
	void unsetScrollWheelInput();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getScrollWheelInput <em>Scroll Wheel Input</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scroll Wheel Input</em>' reference list is set.
	 * @see #unsetScrollWheelInput()
	 * @see #getScrollWheelInput()
	 * @generated
	 */
	boolean isSetScrollWheelInput();

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.ClockType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' reference list.
	 * @see #isSetClock()
	 * @see #unsetClock()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Clock()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ClockType> getClock();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getClock <em>Clock</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClock()
	 * @see #getClock()
	 * @generated
	 */
	void unsetClock();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getClock <em>Clock</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clock</em>' reference list is set.
	 * @see #unsetClock()
	 * @see #getClock()
	 * @generated
	 */
	boolean isSetClock();

	/**
	 * Returns the value of the '<em><b>Compositions</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.ng661designer.part2.WidgetComposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compositions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compositions</em>' reference list.
	 * @see #isSetCompositions()
	 * @see #unsetCompositions()
	 * @see org.polarsys.ng661designer.part2.Part2Package#getTreeType_Compositions()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	EList<WidgetComposition> getCompositions();

	/**
	 * Unsets the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getCompositions <em>Compositions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompositions()
	 * @see #getCompositions()
	 * @generated
	 */
	void unsetCompositions();

	/**
	 * Returns whether the value of the '{@link org.polarsys.ng661designer.part2.TreeType#getCompositions <em>Compositions</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compositions</em>' reference list is set.
	 * @see #unsetCompositions()
	 * @see #getCompositions()
	 * @generated
	 */
	boolean isSetCompositions();

} // TreeType
