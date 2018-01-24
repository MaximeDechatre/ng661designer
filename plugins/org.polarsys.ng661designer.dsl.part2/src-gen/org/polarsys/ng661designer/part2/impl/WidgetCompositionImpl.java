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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.ng661designer.part2.ArcComponent;
import org.polarsys.ng661designer.part2.ChildPrimitive;
import org.polarsys.ng661designer.part2.CirclePrimitive;
import org.polarsys.ng661designer.part2.ClippingContainerPrimitive;
import org.polarsys.ng661designer.part2.ClockType;
import org.polarsys.ng661designer.part2.ComponentDefinitionType;
import org.polarsys.ng661designer.part2.CrownComponent;
import org.polarsys.ng661designer.part2.EllipsePrimitive;
import org.polarsys.ng661designer.part2.GestureAreaPrimitive;
import org.polarsys.ng661designer.part2.GroupPrimitive;
import org.polarsys.ng661designer.part2.ImagePrimitive;
import org.polarsys.ng661designer.part2.KeyboardInputPrimitive;
import org.polarsys.ng661designer.part2.LinePrimitive;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.PathPrimitive;
import org.polarsys.ng661designer.part2.PointerAreaPrimitive;
import org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive;
import org.polarsys.ng661designer.part2.PolarLineComponent;
import org.polarsys.ng661designer.part2.PolygonPrimitive;
import org.polarsys.ng661designer.part2.PolylinePrimitive;
import org.polarsys.ng661designer.part2.PropertyValue;
import org.polarsys.ng661designer.part2.RectPrimitive;
import org.polarsys.ng661designer.part2.ReplicatePrimitive;
import org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive;
import org.polarsys.ng661designer.part2.SimpleTextPrimitive;
import org.polarsys.ng661designer.part2.SwitchNodePrimitive;
import org.polarsys.ng661designer.part2.TouchAreaPrimitive;
import org.polarsys.ng661designer.part2.TransformGroupPrimitive;
import org.polarsys.ng661designer.part2.TreeTypes;
import org.polarsys.ng661designer.part2.WidgetComposition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getChildElements <em>Child Elements</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getTransformGroup <em>Transform Group</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getReplicate <em>Replicate</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getSwitchNode <em>Switch Node</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getClippingContainer <em>Clipping Container</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getSimpleText <em>Simple Text</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getCrown <em>Crown</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getPolarLine <em>Polar Line</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getPointerArea <em>Pointer Area</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getPointerGestureArea <em>Pointer Gesture Area</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getTouchArea <em>Touch Area</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getGestureArea <em>Gesture Area</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getScrollWheelInput <em>Scroll Wheel Input</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getKeyboardInput <em>Keyboard Input</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl#getClock <em>Clock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WidgetCompositionImpl extends TreeTypesImpl implements WidgetComposition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinitionType representation;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValue> values;

	/**
	 * The cached value of the '{@link #getChildElements() <em>Child Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TreeTypes> childElements;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupPrimitive> group;

	/**
	 * The cached value of the '{@link #getTransformGroup() <em>Transform Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformGroupPrimitive> transformGroup;

	/**
	 * The cached value of the '{@link #getReplicate() <em>Replicate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicate()
	 * @generated
	 * @ordered
	 */
	protected EList<ReplicatePrimitive> replicate;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildPrimitive> children;

	/**
	 * The cached value of the '{@link #getSwitchNode() <em>Switch Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchNode()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchNodePrimitive> switchNode;

	/**
	 * The cached value of the '{@link #getClippingContainer() <em>Clipping Container</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClippingContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ClippingContainerPrimitive> clippingContainer;

	/**
	 * The cached value of the '{@link #getRectangle() <em>Rectangle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectangle()
	 * @generated
	 * @ordered
	 */
	protected EList<RectPrimitive> rectangle;

	/**
	 * The cached value of the '{@link #getCircle() <em>Circle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircle()
	 * @generated
	 * @ordered
	 */
	protected EList<CirclePrimitive> circle;

	/**
	 * The cached value of the '{@link #getEllipse() <em>Ellipse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEllipse()
	 * @generated
	 * @ordered
	 */
	protected EList<EllipsePrimitive> ellipse;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList<LinePrimitive> line;

	/**
	 * The cached value of the '{@link #getPolyline() <em>Polyline</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolyline()
	 * @generated
	 * @ordered
	 */
	protected EList<PolylinePrimitive> polyline;

	/**
	 * The cached value of the '{@link #getPolygon() <em>Polygon</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygon()
	 * @generated
	 * @ordered
	 */
	protected EList<PolygonPrimitive> polygon;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected EList<PathPrimitive> path;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagePrimitive> image;

	/**
	 * The cached value of the '{@link #getSimpleText() <em>Simple Text</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleText()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleTextPrimitive> simpleText;

	/**
	 * The cached value of the '{@link #getArc() <em>Arc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArc()
	 * @generated
	 * @ordered
	 */
	protected EList<ArcComponent> arc;

	/**
	 * The cached value of the '{@link #getCrown() <em>Crown</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrown()
	 * @generated
	 * @ordered
	 */
	protected EList<CrownComponent> crown;

	/**
	 * The cached value of the '{@link #getPolarLine() <em>Polar Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolarLine()
	 * @generated
	 * @ordered
	 */
	protected EList<PolarLineComponent> polarLine;

	/**
	 * The cached value of the '{@link #getPointerArea() <em>Pointer Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointerArea()
	 * @generated
	 * @ordered
	 */
	protected EList<PointerAreaPrimitive> pointerArea;

	/**
	 * The cached value of the '{@link #getPointerGestureArea() <em>Pointer Gesture Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointerGestureArea()
	 * @generated
	 * @ordered
	 */
	protected EList<PointerGestureAreaPrimitive> pointerGestureArea;

	/**
	 * The cached value of the '{@link #getTouchArea() <em>Touch Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchArea()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchAreaPrimitive> touchArea;

	/**
	 * The cached value of the '{@link #getGestureArea() <em>Gesture Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGestureArea()
	 * @generated
	 * @ordered
	 */
	protected EList<GestureAreaPrimitive> gestureArea;

	/**
	 * The cached value of the '{@link #getScrollWheelInput() <em>Scroll Wheel Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollWheelInput()
	 * @generated
	 * @ordered
	 */
	protected EList<ScrollWheelInputPrimitive> scrollWheelInput;

	/**
	 * The cached value of the '{@link #getKeyboardInput() <em>Keyboard Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyboardInput()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyboardInputPrimitive> keyboardInput;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockType> clock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetCompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getWidgetComposition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionType getRepresentation() {
		if (representation != null && representation.eIsProxy()) {
			InternalEObject oldRepresentation = (InternalEObject)representation;
			representation = (ComponentDefinitionType)eResolveProxy(oldRepresentation);
			if (representation != oldRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Part2Package.WIDGET_COMPOSITION__REPRESENTATION, oldRepresentation, representation));
			}
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionType basicGetRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(ComponentDefinitionType newRepresentation) {
		ComponentDefinitionType oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.WIDGET_COMPOSITION__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<PropertyValue>(PropertyValue.class, this, Part2Package.WIDGET_COMPOSITION__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TreeTypes> getChildElements() {
		if (childElements == null) {
			childElements = new EObjectContainmentEList<TreeTypes>(TreeTypes.class, this, Part2Package.WIDGET_COMPOSITION__CHILD_ELEMENTS);
		}
		return childElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupPrimitive> getGroup() {
		if (group == null) {
			group = new EObjectResolvingEList.Unsettable<GroupPrimitive>(GroupPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGroup() {
		if (group != null) ((InternalEList.Unsettable<?>)group).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGroup() {
		return group != null && ((InternalEList.Unsettable<?>)group).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformGroupPrimitive> getTransformGroup() {
		if (transformGroup == null) {
			transformGroup = new EObjectResolvingEList.Unsettable<TransformGroupPrimitive>(TransformGroupPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__TRANSFORM_GROUP);
		}
		return transformGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransformGroup() {
		if (transformGroup != null) ((InternalEList.Unsettable<?>)transformGroup).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransformGroup() {
		return transformGroup != null && ((InternalEList.Unsettable<?>)transformGroup).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReplicatePrimitive> getReplicate() {
		if (replicate == null) {
			replicate = new EObjectResolvingEList.Unsettable<ReplicatePrimitive>(ReplicatePrimitive.class, this, Part2Package.WIDGET_COMPOSITION__REPLICATE);
		}
		return replicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReplicate() {
		if (replicate != null) ((InternalEList.Unsettable<?>)replicate).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReplicate() {
		return replicate != null && ((InternalEList.Unsettable<?>)replicate).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChildPrimitive> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList.Unsettable<ChildPrimitive>(ChildPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetChildren() {
		if (children != null) ((InternalEList.Unsettable<?>)children).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetChildren() {
		return children != null && ((InternalEList.Unsettable<?>)children).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchNodePrimitive> getSwitchNode() {
		if (switchNode == null) {
			switchNode = new EObjectResolvingEList.Unsettable<SwitchNodePrimitive>(SwitchNodePrimitive.class, this, Part2Package.WIDGET_COMPOSITION__SWITCH_NODE);
		}
		return switchNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSwitchNode() {
		if (switchNode != null) ((InternalEList.Unsettable<?>)switchNode).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSwitchNode() {
		return switchNode != null && ((InternalEList.Unsettable<?>)switchNode).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClippingContainerPrimitive> getClippingContainer() {
		if (clippingContainer == null) {
			clippingContainer = new EObjectResolvingEList.Unsettable<ClippingContainerPrimitive>(ClippingContainerPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__CLIPPING_CONTAINER);
		}
		return clippingContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClippingContainer() {
		if (clippingContainer != null) ((InternalEList.Unsettable<?>)clippingContainer).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClippingContainer() {
		return clippingContainer != null && ((InternalEList.Unsettable<?>)clippingContainer).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectPrimitive> getRectangle() {
		if (rectangle == null) {
			rectangle = new EObjectResolvingEList.Unsettable<RectPrimitive>(RectPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__RECTANGLE);
		}
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRectangle() {
		if (rectangle != null) ((InternalEList.Unsettable<?>)rectangle).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRectangle() {
		return rectangle != null && ((InternalEList.Unsettable<?>)rectangle).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CirclePrimitive> getCircle() {
		if (circle == null) {
			circle = new EObjectResolvingEList.Unsettable<CirclePrimitive>(CirclePrimitive.class, this, Part2Package.WIDGET_COMPOSITION__CIRCLE);
		}
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCircle() {
		if (circle != null) ((InternalEList.Unsettable<?>)circle).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCircle() {
		return circle != null && ((InternalEList.Unsettable<?>)circle).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipsePrimitive> getEllipse() {
		if (ellipse == null) {
			ellipse = new EObjectResolvingEList.Unsettable<EllipsePrimitive>(EllipsePrimitive.class, this, Part2Package.WIDGET_COMPOSITION__ELLIPSE);
		}
		return ellipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEllipse() {
		if (ellipse != null) ((InternalEList.Unsettable<?>)ellipse).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEllipse() {
		return ellipse != null && ((InternalEList.Unsettable<?>)ellipse).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinePrimitive> getLine() {
		if (line == null) {
			line = new EObjectResolvingEList.Unsettable<LinePrimitive>(LinePrimitive.class, this, Part2Package.WIDGET_COMPOSITION__LINE);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLine() {
		if (line != null) ((InternalEList.Unsettable<?>)line).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLine() {
		return line != null && ((InternalEList.Unsettable<?>)line).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylinePrimitive> getPolyline() {
		if (polyline == null) {
			polyline = new EObjectResolvingEList.Unsettable<PolylinePrimitive>(PolylinePrimitive.class, this, Part2Package.WIDGET_COMPOSITION__POLYLINE);
		}
		return polyline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPolyline() {
		if (polyline != null) ((InternalEList.Unsettable<?>)polyline).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPolyline() {
		return polyline != null && ((InternalEList.Unsettable<?>)polyline).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonPrimitive> getPolygon() {
		if (polygon == null) {
			polygon = new EObjectResolvingEList.Unsettable<PolygonPrimitive>(PolygonPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__POLYGON);
		}
		return polygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPolygon() {
		if (polygon != null) ((InternalEList.Unsettable<?>)polygon).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPolygon() {
		return polygon != null && ((InternalEList.Unsettable<?>)polygon).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathPrimitive> getPath() {
		if (path == null) {
			path = new EObjectResolvingEList.Unsettable<PathPrimitive>(PathPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__PATH);
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPath() {
		if (path != null) ((InternalEList.Unsettable<?>)path).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPath() {
		return path != null && ((InternalEList.Unsettable<?>)path).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagePrimitive> getImage() {
		if (image == null) {
			image = new EObjectResolvingEList.Unsettable<ImagePrimitive>(ImagePrimitive.class, this, Part2Package.WIDGET_COMPOSITION__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImage() {
		if (image != null) ((InternalEList.Unsettable<?>)image).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImage() {
		return image != null && ((InternalEList.Unsettable<?>)image).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleTextPrimitive> getSimpleText() {
		if (simpleText == null) {
			simpleText = new EObjectResolvingEList.Unsettable<SimpleTextPrimitive>(SimpleTextPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__SIMPLE_TEXT);
		}
		return simpleText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSimpleText() {
		if (simpleText != null) ((InternalEList.Unsettable<?>)simpleText).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSimpleText() {
		return simpleText != null && ((InternalEList.Unsettable<?>)simpleText).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArcComponent> getArc() {
		if (arc == null) {
			arc = new EObjectResolvingEList.Unsettable<ArcComponent>(ArcComponent.class, this, Part2Package.WIDGET_COMPOSITION__ARC);
		}
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArc() {
		if (arc != null) ((InternalEList.Unsettable<?>)arc).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArc() {
		return arc != null && ((InternalEList.Unsettable<?>)arc).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CrownComponent> getCrown() {
		if (crown == null) {
			crown = new EObjectResolvingEList.Unsettable<CrownComponent>(CrownComponent.class, this, Part2Package.WIDGET_COMPOSITION__CROWN);
		}
		return crown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCrown() {
		if (crown != null) ((InternalEList.Unsettable<?>)crown).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCrown() {
		return crown != null && ((InternalEList.Unsettable<?>)crown).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolarLineComponent> getPolarLine() {
		if (polarLine == null) {
			polarLine = new EObjectResolvingEList.Unsettable<PolarLineComponent>(PolarLineComponent.class, this, Part2Package.WIDGET_COMPOSITION__POLAR_LINE);
		}
		return polarLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPolarLine() {
		if (polarLine != null) ((InternalEList.Unsettable<?>)polarLine).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPolarLine() {
		return polarLine != null && ((InternalEList.Unsettable<?>)polarLine).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PointerAreaPrimitive> getPointerArea() {
		if (pointerArea == null) {
			pointerArea = new EObjectResolvingEList.Unsettable<PointerAreaPrimitive>(PointerAreaPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__POINTER_AREA);
		}
		return pointerArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPointerArea() {
		if (pointerArea != null) ((InternalEList.Unsettable<?>)pointerArea).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPointerArea() {
		return pointerArea != null && ((InternalEList.Unsettable<?>)pointerArea).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PointerGestureAreaPrimitive> getPointerGestureArea() {
		if (pointerGestureArea == null) {
			pointerGestureArea = new EObjectResolvingEList.Unsettable<PointerGestureAreaPrimitive>(PointerGestureAreaPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__POINTER_GESTURE_AREA);
		}
		return pointerGestureArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPointerGestureArea() {
		if (pointerGestureArea != null) ((InternalEList.Unsettable<?>)pointerGestureArea).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPointerGestureArea() {
		return pointerGestureArea != null && ((InternalEList.Unsettable<?>)pointerGestureArea).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchAreaPrimitive> getTouchArea() {
		if (touchArea == null) {
			touchArea = new EObjectResolvingEList.Unsettable<TouchAreaPrimitive>(TouchAreaPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__TOUCH_AREA);
		}
		return touchArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTouchArea() {
		if (touchArea != null) ((InternalEList.Unsettable<?>)touchArea).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTouchArea() {
		return touchArea != null && ((InternalEList.Unsettable<?>)touchArea).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GestureAreaPrimitive> getGestureArea() {
		if (gestureArea == null) {
			gestureArea = new EObjectResolvingEList.Unsettable<GestureAreaPrimitive>(GestureAreaPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__GESTURE_AREA);
		}
		return gestureArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGestureArea() {
		if (gestureArea != null) ((InternalEList.Unsettable<?>)gestureArea).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGestureArea() {
		return gestureArea != null && ((InternalEList.Unsettable<?>)gestureArea).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScrollWheelInputPrimitive> getScrollWheelInput() {
		if (scrollWheelInput == null) {
			scrollWheelInput = new EObjectResolvingEList.Unsettable<ScrollWheelInputPrimitive>(ScrollWheelInputPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__SCROLL_WHEEL_INPUT);
		}
		return scrollWheelInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScrollWheelInput() {
		if (scrollWheelInput != null) ((InternalEList.Unsettable<?>)scrollWheelInput).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScrollWheelInput() {
		return scrollWheelInput != null && ((InternalEList.Unsettable<?>)scrollWheelInput).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyboardInputPrimitive> getKeyboardInput() {
		if (keyboardInput == null) {
			keyboardInput = new EObjectResolvingEList.Unsettable<KeyboardInputPrimitive>(KeyboardInputPrimitive.class, this, Part2Package.WIDGET_COMPOSITION__KEYBOARD_INPUT);
		}
		return keyboardInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeyboardInput() {
		if (keyboardInput != null) ((InternalEList.Unsettable<?>)keyboardInput).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeyboardInput() {
		return keyboardInput != null && ((InternalEList.Unsettable<?>)keyboardInput).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockType> getClock() {
		if (clock == null) {
			clock = new EObjectResolvingEList.Unsettable<ClockType>(ClockType.class, this, Part2Package.WIDGET_COMPOSITION__CLOCK);
		}
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClock() {
		if (clock != null) ((InternalEList.Unsettable<?>)clock).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClock() {
		return clock != null && ((InternalEList.Unsettable<?>)clock).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.WIDGET_COMPOSITION__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
			case Part2Package.WIDGET_COMPOSITION__CHILD_ELEMENTS:
				return ((InternalEList<?>)getChildElements()).basicRemove(otherEnd, msgs);
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
			case Part2Package.WIDGET_COMPOSITION__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
			case Part2Package.WIDGET_COMPOSITION__VALUES:
				return getValues();
			case Part2Package.WIDGET_COMPOSITION__CHILD_ELEMENTS:
				return getChildElements();
			case Part2Package.WIDGET_COMPOSITION__GROUP:
				return getGroup();
			case Part2Package.WIDGET_COMPOSITION__TRANSFORM_GROUP:
				return getTransformGroup();
			case Part2Package.WIDGET_COMPOSITION__REPLICATE:
				return getReplicate();
			case Part2Package.WIDGET_COMPOSITION__CHILDREN:
				return getChildren();
			case Part2Package.WIDGET_COMPOSITION__SWITCH_NODE:
				return getSwitchNode();
			case Part2Package.WIDGET_COMPOSITION__CLIPPING_CONTAINER:
				return getClippingContainer();
			case Part2Package.WIDGET_COMPOSITION__RECTANGLE:
				return getRectangle();
			case Part2Package.WIDGET_COMPOSITION__CIRCLE:
				return getCircle();
			case Part2Package.WIDGET_COMPOSITION__ELLIPSE:
				return getEllipse();
			case Part2Package.WIDGET_COMPOSITION__LINE:
				return getLine();
			case Part2Package.WIDGET_COMPOSITION__POLYLINE:
				return getPolyline();
			case Part2Package.WIDGET_COMPOSITION__POLYGON:
				return getPolygon();
			case Part2Package.WIDGET_COMPOSITION__PATH:
				return getPath();
			case Part2Package.WIDGET_COMPOSITION__IMAGE:
				return getImage();
			case Part2Package.WIDGET_COMPOSITION__SIMPLE_TEXT:
				return getSimpleText();
			case Part2Package.WIDGET_COMPOSITION__ARC:
				return getArc();
			case Part2Package.WIDGET_COMPOSITION__CROWN:
				return getCrown();
			case Part2Package.WIDGET_COMPOSITION__POLAR_LINE:
				return getPolarLine();
			case Part2Package.WIDGET_COMPOSITION__POINTER_AREA:
				return getPointerArea();
			case Part2Package.WIDGET_COMPOSITION__POINTER_GESTURE_AREA:
				return getPointerGestureArea();
			case Part2Package.WIDGET_COMPOSITION__TOUCH_AREA:
				return getTouchArea();
			case Part2Package.WIDGET_COMPOSITION__GESTURE_AREA:
				return getGestureArea();
			case Part2Package.WIDGET_COMPOSITION__SCROLL_WHEEL_INPUT:
				return getScrollWheelInput();
			case Part2Package.WIDGET_COMPOSITION__KEYBOARD_INPUT:
				return getKeyboardInput();
			case Part2Package.WIDGET_COMPOSITION__CLOCK:
				return getClock();
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
			case Part2Package.WIDGET_COMPOSITION__REPRESENTATION:
				setRepresentation((ComponentDefinitionType)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends PropertyValue>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__CHILD_ELEMENTS:
				getChildElements().clear();
				getChildElements().addAll((Collection<? extends TreeTypes>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends GroupPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__TRANSFORM_GROUP:
				getTransformGroup().clear();
				getTransformGroup().addAll((Collection<? extends TransformGroupPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__REPLICATE:
				getReplicate().clear();
				getReplicate().addAll((Collection<? extends ReplicatePrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ChildPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__SWITCH_NODE:
				getSwitchNode().clear();
				getSwitchNode().addAll((Collection<? extends SwitchNodePrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__CLIPPING_CONTAINER:
				getClippingContainer().clear();
				getClippingContainer().addAll((Collection<? extends ClippingContainerPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__RECTANGLE:
				getRectangle().clear();
				getRectangle().addAll((Collection<? extends RectPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CirclePrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipsePrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LinePrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylinePrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends ImagePrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__SIMPLE_TEXT:
				getSimpleText().clear();
				getSimpleText().addAll((Collection<? extends SimpleTextPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__ARC:
				getArc().clear();
				getArc().addAll((Collection<? extends ArcComponent>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__CROWN:
				getCrown().clear();
				getCrown().addAll((Collection<? extends CrownComponent>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__POLAR_LINE:
				getPolarLine().clear();
				getPolarLine().addAll((Collection<? extends PolarLineComponent>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__POINTER_AREA:
				getPointerArea().clear();
				getPointerArea().addAll((Collection<? extends PointerAreaPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__POINTER_GESTURE_AREA:
				getPointerGestureArea().clear();
				getPointerGestureArea().addAll((Collection<? extends PointerGestureAreaPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__TOUCH_AREA:
				getTouchArea().clear();
				getTouchArea().addAll((Collection<? extends TouchAreaPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__GESTURE_AREA:
				getGestureArea().clear();
				getGestureArea().addAll((Collection<? extends GestureAreaPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__SCROLL_WHEEL_INPUT:
				getScrollWheelInput().clear();
				getScrollWheelInput().addAll((Collection<? extends ScrollWheelInputPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__KEYBOARD_INPUT:
				getKeyboardInput().clear();
				getKeyboardInput().addAll((Collection<? extends KeyboardInputPrimitive>)newValue);
				return;
			case Part2Package.WIDGET_COMPOSITION__CLOCK:
				getClock().clear();
				getClock().addAll((Collection<? extends ClockType>)newValue);
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
			case Part2Package.WIDGET_COMPOSITION__REPRESENTATION:
				setRepresentation((ComponentDefinitionType)null);
				return;
			case Part2Package.WIDGET_COMPOSITION__VALUES:
				getValues().clear();
				return;
			case Part2Package.WIDGET_COMPOSITION__CHILD_ELEMENTS:
				getChildElements().clear();
				return;
			case Part2Package.WIDGET_COMPOSITION__GROUP:
				unsetGroup();
				return;
			case Part2Package.WIDGET_COMPOSITION__TRANSFORM_GROUP:
				unsetTransformGroup();
				return;
			case Part2Package.WIDGET_COMPOSITION__REPLICATE:
				unsetReplicate();
				return;
			case Part2Package.WIDGET_COMPOSITION__CHILDREN:
				unsetChildren();
				return;
			case Part2Package.WIDGET_COMPOSITION__SWITCH_NODE:
				unsetSwitchNode();
				return;
			case Part2Package.WIDGET_COMPOSITION__CLIPPING_CONTAINER:
				unsetClippingContainer();
				return;
			case Part2Package.WIDGET_COMPOSITION__RECTANGLE:
				unsetRectangle();
				return;
			case Part2Package.WIDGET_COMPOSITION__CIRCLE:
				unsetCircle();
				return;
			case Part2Package.WIDGET_COMPOSITION__ELLIPSE:
				unsetEllipse();
				return;
			case Part2Package.WIDGET_COMPOSITION__LINE:
				unsetLine();
				return;
			case Part2Package.WIDGET_COMPOSITION__POLYLINE:
				unsetPolyline();
				return;
			case Part2Package.WIDGET_COMPOSITION__POLYGON:
				unsetPolygon();
				return;
			case Part2Package.WIDGET_COMPOSITION__PATH:
				unsetPath();
				return;
			case Part2Package.WIDGET_COMPOSITION__IMAGE:
				unsetImage();
				return;
			case Part2Package.WIDGET_COMPOSITION__SIMPLE_TEXT:
				unsetSimpleText();
				return;
			case Part2Package.WIDGET_COMPOSITION__ARC:
				unsetArc();
				return;
			case Part2Package.WIDGET_COMPOSITION__CROWN:
				unsetCrown();
				return;
			case Part2Package.WIDGET_COMPOSITION__POLAR_LINE:
				unsetPolarLine();
				return;
			case Part2Package.WIDGET_COMPOSITION__POINTER_AREA:
				unsetPointerArea();
				return;
			case Part2Package.WIDGET_COMPOSITION__POINTER_GESTURE_AREA:
				unsetPointerGestureArea();
				return;
			case Part2Package.WIDGET_COMPOSITION__TOUCH_AREA:
				unsetTouchArea();
				return;
			case Part2Package.WIDGET_COMPOSITION__GESTURE_AREA:
				unsetGestureArea();
				return;
			case Part2Package.WIDGET_COMPOSITION__SCROLL_WHEEL_INPUT:
				unsetScrollWheelInput();
				return;
			case Part2Package.WIDGET_COMPOSITION__KEYBOARD_INPUT:
				unsetKeyboardInput();
				return;
			case Part2Package.WIDGET_COMPOSITION__CLOCK:
				unsetClock();
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
			case Part2Package.WIDGET_COMPOSITION__REPRESENTATION:
				return representation != null;
			case Part2Package.WIDGET_COMPOSITION__VALUES:
				return values != null && !values.isEmpty();
			case Part2Package.WIDGET_COMPOSITION__CHILD_ELEMENTS:
				return childElements != null && !childElements.isEmpty();
			case Part2Package.WIDGET_COMPOSITION__GROUP:
				return isSetGroup();
			case Part2Package.WIDGET_COMPOSITION__TRANSFORM_GROUP:
				return isSetTransformGroup();
			case Part2Package.WIDGET_COMPOSITION__REPLICATE:
				return isSetReplicate();
			case Part2Package.WIDGET_COMPOSITION__CHILDREN:
				return isSetChildren();
			case Part2Package.WIDGET_COMPOSITION__SWITCH_NODE:
				return isSetSwitchNode();
			case Part2Package.WIDGET_COMPOSITION__CLIPPING_CONTAINER:
				return isSetClippingContainer();
			case Part2Package.WIDGET_COMPOSITION__RECTANGLE:
				return isSetRectangle();
			case Part2Package.WIDGET_COMPOSITION__CIRCLE:
				return isSetCircle();
			case Part2Package.WIDGET_COMPOSITION__ELLIPSE:
				return isSetEllipse();
			case Part2Package.WIDGET_COMPOSITION__LINE:
				return isSetLine();
			case Part2Package.WIDGET_COMPOSITION__POLYLINE:
				return isSetPolyline();
			case Part2Package.WIDGET_COMPOSITION__POLYGON:
				return isSetPolygon();
			case Part2Package.WIDGET_COMPOSITION__PATH:
				return isSetPath();
			case Part2Package.WIDGET_COMPOSITION__IMAGE:
				return isSetImage();
			case Part2Package.WIDGET_COMPOSITION__SIMPLE_TEXT:
				return isSetSimpleText();
			case Part2Package.WIDGET_COMPOSITION__ARC:
				return isSetArc();
			case Part2Package.WIDGET_COMPOSITION__CROWN:
				return isSetCrown();
			case Part2Package.WIDGET_COMPOSITION__POLAR_LINE:
				return isSetPolarLine();
			case Part2Package.WIDGET_COMPOSITION__POINTER_AREA:
				return isSetPointerArea();
			case Part2Package.WIDGET_COMPOSITION__POINTER_GESTURE_AREA:
				return isSetPointerGestureArea();
			case Part2Package.WIDGET_COMPOSITION__TOUCH_AREA:
				return isSetTouchArea();
			case Part2Package.WIDGET_COMPOSITION__GESTURE_AREA:
				return isSetGestureArea();
			case Part2Package.WIDGET_COMPOSITION__SCROLL_WHEEL_INPUT:
				return isSetScrollWheelInput();
			case Part2Package.WIDGET_COMPOSITION__KEYBOARD_INPUT:
				return isSetKeyboardInput();
			case Part2Package.WIDGET_COMPOSITION__CLOCK:
				return isSetClock();
		}
		return super.eIsSet(featureID);
	}

} //WidgetCompositionImpl
