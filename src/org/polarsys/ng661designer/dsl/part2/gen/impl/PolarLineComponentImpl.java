/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.dsl.part2.gen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.ng661designer.dsl.part2.gen.Part2Factory;
import org.polarsys.ng661designer.dsl.part2.gen.Part2Package;
import org.polarsys.ng661designer.dsl.part2.gen.PolarLineComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polar Line Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getClipPath <em>Clip Path</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getClipRule <em>Clip Rule</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getDrawingPriority <em>Drawing Priority</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getR <em>R</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getStrokeDasharray <em>Stroke Dasharray</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getStrokeDashoffset <em>Stroke Dashoffset</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getStrokeLinecap <em>Stroke Linecap</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getStrokeLinejoin <em>Stroke Linejoin</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getStrokeMiterlimit <em>Stroke Miterlimit</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getStrokewidth <em>Strokewidth</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link org.example.ng661.part2.impl.PolarLineComponentImpl#getY1 <em>Y1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolarLineComponentImpl extends RepresentationTypesImpl implements PolarLineComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2016 Airbus.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final Object ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected Object angle = ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClipPath() <em>Clip Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIP_PATH_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getClipPath() <em>Clip Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipPath()
	 * @generated
	 * @ordered
	 */
	protected String clipPath = CLIP_PATH_EDEFAULT;

	/**
	 * This is true if the Clip Path attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clipPathESet;

	/**
	 * The default value of the '{@link #getClipRule() <em>Clip Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipRule()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIP_RULE_EDEFAULT = "nonzero";

	/**
	 * The cached value of the '{@link #getClipRule() <em>Clip Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipRule()
	 * @generated
	 * @ordered
	 */
	protected String clipRule = CLIP_RULE_EDEFAULT;

	/**
	 * This is true if the Clip Rule attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clipRuleESet;

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
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final Object R_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected Object r = R_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getColorType(), "white");

	/**
	 * The cached value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected Object stroke = STROKE_EDEFAULT;

	/**
	 * This is true if the Stroke attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeESet;

	/**
	 * The default value of the '{@link #getStrokeDasharray() <em>Stroke Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDasharray()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_DASHARRAY_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getStrokeDasharray() <em>Stroke Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDasharray()
	 * @generated
	 * @ordered
	 */
	protected String strokeDasharray = STROKE_DASHARRAY_EDEFAULT;

	/**
	 * This is true if the Stroke Dasharray attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeDasharrayESet;

	/**
	 * The default value of the '{@link #getStrokeDashoffset() <em>Stroke Dashoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDashoffset()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_DASHOFFSET_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getDistanceType(), "0");

	/**
	 * The cached value of the '{@link #getStrokeDashoffset() <em>Stroke Dashoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDashoffset()
	 * @generated
	 * @ordered
	 */
	protected Object strokeDashoffset = STROKE_DASHOFFSET_EDEFAULT;

	/**
	 * This is true if the Stroke Dashoffset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeDashoffsetESet;

	/**
	 * The default value of the '{@link #getStrokeLinecap() <em>Stroke Linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinecap()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_LINECAP_EDEFAULT = "butt";

	/**
	 * The cached value of the '{@link #getStrokeLinecap() <em>Stroke Linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinecap()
	 * @generated
	 * @ordered
	 */
	protected String strokeLinecap = STROKE_LINECAP_EDEFAULT;

	/**
	 * This is true if the Stroke Linecap attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeLinecapESet;

	/**
	 * The default value of the '{@link #getStrokeLinejoin() <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinejoin()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_LINEJOIN_EDEFAULT = "miter";

	/**
	 * The cached value of the '{@link #getStrokeLinejoin() <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinejoin()
	 * @generated
	 * @ordered
	 */
	protected String strokeLinejoin = STROKE_LINEJOIN_EDEFAULT;

	/**
	 * This is true if the Stroke Linejoin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeLinejoinESet;

	/**
	 * The default value of the '{@link #getStrokeMiterlimit() <em>Stroke Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeMiterlimit()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_MITERLIMIT_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getRealType(), "4.0");

	/**
	 * The cached value of the '{@link #getStrokeMiterlimit() <em>Stroke Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeMiterlimit()
	 * @generated
	 * @ordered
	 */
	protected Object strokeMiterlimit = STROKE_MITERLIMIT_EDEFAULT;

	/**
	 * This is true if the Stroke Miterlimit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeMiterlimitESet;

	/**
	 * The default value of the '{@link #getStrokeOpacity() <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_OPACITY_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getOpacityType(), "1.0");

	/**
	 * The cached value of the '{@link #getStrokeOpacity() <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeOpacity()
	 * @generated
	 * @ordered
	 */
	protected Object strokeOpacity = STROKE_OPACITY_EDEFAULT;

	/**
	 * This is true if the Stroke Opacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeOpacityESet;

	/**
	 * The default value of the '{@link #getStrokewidth() <em>Strokewidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokewidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKEWIDTH_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getDistanceType(), "1.0");

	/**
	 * The cached value of the '{@link #getStrokewidth() <em>Strokewidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokewidth()
	 * @generated
	 * @ordered
	 */
	protected Object strokewidth = STROKEWIDTH_EDEFAULT;

	/**
	 * This is true if the Strokewidth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokewidthESet;

	/**
	 * The default value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORM_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected String transform = TRANSFORM_EDEFAULT;

	/**
	 * This is true if the Transform attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transformESet;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Object VISIBILITY_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getVisibilityType(), "visible");

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Object visibility = VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibilityESet;

	/**
	 * The default value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected static final Object X1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected Object x1 = X1_EDEFAULT;

	/**
	 * The default value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected static final Object Y1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected Object y1 = Y1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolarLineComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getPolarLineComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(Object newAngle) {
		Object oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClipPath() {
		return clipPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipPath(String newClipPath) {
		String oldClipPath = clipPath;
		clipPath = newClipPath;
		boolean oldClipPathESet = clipPathESet;
		clipPathESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__CLIP_PATH, oldClipPath, clipPath, !oldClipPathESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClipPath() {
		String oldClipPath = clipPath;
		boolean oldClipPathESet = clipPathESet;
		clipPath = CLIP_PATH_EDEFAULT;
		clipPathESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLAR_LINE_COMPONENT__CLIP_PATH, oldClipPath, CLIP_PATH_EDEFAULT, oldClipPathESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClipPath() {
		return clipPathESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClipRule() {
		return clipRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipRule(String newClipRule) {
		String oldClipRule = clipRule;
		clipRule = newClipRule;
		boolean oldClipRuleESet = clipRuleESet;
		clipRuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__CLIP_RULE, oldClipRule, clipRule, !oldClipRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClipRule() {
		String oldClipRule = clipRule;
		boolean oldClipRuleESet = clipRuleESet;
		clipRule = CLIP_RULE_EDEFAULT;
		clipRuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLAR_LINE_COMPONENT__CLIP_RULE, oldClipRule, CLIP_RULE_EDEFAULT, oldClipRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClipRule() {
		return clipRuleESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__DRAWING_PRIORITY, oldDrawingPriority, drawingPriority, !oldDrawingPriorityESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLAR_LINE_COMPONENT__DRAWING_PRIORITY, oldDrawingPriority, DRAWING_PRIORITY_EDEFAULT, oldDrawingPriorityESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(Object newR) {
		Object oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__R, oldR, r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStroke() {
		return stroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke(Object newStroke) {
		Object oldStroke = stroke;
		stroke = newStroke;
		boolean oldStrokeESet = strokeESet;
		strokeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__STROKE, oldStroke, stroke, !oldStrokeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStroke() {
		Object oldStroke = stroke;
		boolean oldStrokeESet = strokeESet;
		stroke = STROKE_EDEFAULT;
		strokeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLAR_LINE_COMPONENT__STROKE, oldStroke, STROKE_EDEFAULT, oldStrokeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStroke() {
		return strokeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeDasharray() {
		return strokeDasharray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeDasharray(String newStrokeDasharray) {
		String oldStrokeDasharray = strokeDasharray;
		strokeDasharray = newStrokeDasharray;
		boolean oldStrokeDasharrayESet = strokeDasharrayESet;
		strokeDasharrayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__STROKE_DASHARRAY, oldStrokeDasharray, strokeDasharray, !oldStrokeDasharrayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeDasharray() {
		String oldStrokeDasharray = strokeDasharray;
		boolean oldStrokeDasharrayESet = strokeDasharrayESet;
		strokeDasharray = STROKE_DASHARRAY_EDEFAULT;
		strokeDasharrayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLAR_LINE_COMPONENT__STROKE_DASHARRAY, oldStrokeDasharray, STROKE_DASHARRAY_EDEFAULT, oldStrokeDasharrayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeDasharray() {
		return strokeDasharrayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokeDashoffset() {
		return strokeDashoffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeDashoffset(Object newStrokeDashoffset) {
		Object oldStrokeDashoffset = strokeDashoffset;
		strokeDashoffset = newStrokeDashoffset;
		boolean oldStrokeDashoffsetESet = strokeDashoffsetESet;
		strokeDashoffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__STROKE_DASHOFFSET, oldStrokeDashoffset, strokeDashoffset, !oldStrokeDashoffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeDashoffset() {
		Object oldStrokeDashoffset = strokeDashoffset;
		boolean oldStrokeDashoffsetESet = strokeDashoffsetESet;
		strokeDashoffset = STROKE_DASHOFFSET_EDEFAULT;
		strokeDashoffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLAR_LINE_COMPONENT__STROKE_DASHOFFSET, oldStrokeDashoffset, STROKE_DASHOFFSET_EDEFAULT, oldStrokeDashoffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeDashoffset() {
		return strokeDashoffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeLinecap() {
		return strokeLinecap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeLinecap(String newStrokeLinecap) {
		String oldStrokeLinecap = strokeLinecap;
		strokeLinecap = newStrokeLinecap;
		boolean oldStrokeLinecapESet = strokeLinecapESet;
		strokeLinecapESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__STROKE_LINECAP, oldStrokeLinecap, strokeLinecap, !oldStrokeLinecapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeLinecap() {
		String oldStrokeLinecap = strokeLinecap;
		boolean oldStrokeLinecapESet = strokeLinecapESet;
		strokeLinecap = STROKE_LINECAP_EDEFAULT;
		strokeLinecapESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLAR_LINE_COMPONENT__STROKE_LINECAP, oldStrokeLinecap, STROKE_LINECAP_EDEFAULT, oldStrokeLinecapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeLinecap() {
		return strokeLinecapESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeLinejoin() {
		return strokeLinejoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeLinejoin(String newStrokeLinejoin) {
		String oldStrokeLinejoin = strokeLinejoin;
		strokeLinejoin = newStrokeLinejoin;
		boolean oldStrokeLinejoinESet = strokeLinejoinESet;
		strokeLinejoinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__STROKE_LINEJOIN, oldStrokeLinejoin, strokeLinejoin, !oldStrokeLinejoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeLinejoin() {
		String oldStrokeLinejoin = strokeLinejoin;
		boolean oldStrokeLinejoinESet = strokeLinejoinESet;
		strokeLinejoin = STROKE_LINEJOIN_EDEFAULT;
		strokeLinejoinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLAR_LINE_COMPONENT__STROKE_LINEJOIN, oldStrokeLinejoin, STROKE_LINEJOIN_EDEFAULT, oldStrokeLinejoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeLinejoin() {
		return strokeLinejoinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokeMiterlimit() {
		return strokeMiterlimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeMiterlimit(Object newStrokeMiterlimit) {
		Object oldStrokeMiterlimit = strokeMiterlimit;
		strokeMiterlimit = newStrokeMiterlimit;
		boolean oldStrokeMiterlimitESet = strokeMiterlimitESet;
		strokeMiterlimitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__STROKE_MITERLIMIT, oldStrokeMiterlimit, strokeMiterlimit, !oldStrokeMiterlimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeMiterlimit() {
		Object oldStrokeMiterlimit = strokeMiterlimit;
		boolean oldStrokeMiterlimitESet = strokeMiterlimitESet;
		strokeMiterlimit = STROKE_MITERLIMIT_EDEFAULT;
		strokeMiterlimitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLAR_LINE_COMPONENT__STROKE_MITERLIMIT, oldStrokeMiterlimit, STROKE_MITERLIMIT_EDEFAULT, oldStrokeMiterlimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeMiterlimit() {
		return strokeMiterlimitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokeOpacity() {
		return strokeOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeOpacity(Object newStrokeOpacity) {
		Object oldStrokeOpacity = strokeOpacity;
		strokeOpacity = newStrokeOpacity;
		boolean oldStrokeOpacityESet = strokeOpacityESet;
		strokeOpacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__STROKE_OPACITY, oldStrokeOpacity, strokeOpacity, !oldStrokeOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeOpacity() {
		Object oldStrokeOpacity = strokeOpacity;
		boolean oldStrokeOpacityESet = strokeOpacityESet;
		strokeOpacity = STROKE_OPACITY_EDEFAULT;
		strokeOpacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLAR_LINE_COMPONENT__STROKE_OPACITY, oldStrokeOpacity, STROKE_OPACITY_EDEFAULT, oldStrokeOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeOpacity() {
		return strokeOpacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokewidth() {
		return strokewidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokewidth(Object newStrokewidth) {
		Object oldStrokewidth = strokewidth;
		strokewidth = newStrokewidth;
		boolean oldStrokewidthESet = strokewidthESet;
		strokewidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__STROKEWIDTH, oldStrokewidth, strokewidth, !oldStrokewidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokewidth() {
		Object oldStrokewidth = strokewidth;
		boolean oldStrokewidthESet = strokewidthESet;
		strokewidth = STROKEWIDTH_EDEFAULT;
		strokewidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLAR_LINE_COMPONENT__STROKEWIDTH, oldStrokewidth, STROKEWIDTH_EDEFAULT, oldStrokewidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokewidth() {
		return strokewidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(String newTransform) {
		String oldTransform = transform;
		transform = newTransform;
		boolean oldTransformESet = transformESet;
		transformESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__TRANSFORM, oldTransform, transform, !oldTransformESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransform() {
		String oldTransform = transform;
		boolean oldTransformESet = transformESet;
		transform = TRANSFORM_EDEFAULT;
		transformESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLAR_LINE_COMPONENT__TRANSFORM, oldTransform, TRANSFORM_EDEFAULT, oldTransformESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransform() {
		return transformESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Object newVisibility) {
		Object oldVisibility = visibility;
		visibility = newVisibility;
		boolean oldVisibilityESet = visibilityESet;
		visibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibility() {
		Object oldVisibility = visibility;
		boolean oldVisibilityESet = visibilityESet;
		visibility = VISIBILITY_EDEFAULT;
		visibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLAR_LINE_COMPONENT__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility() {
		return visibilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getX1() {
		return x1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX1(Object newX1) {
		Object oldX1 = x1;
		x1 = newX1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__X1, oldX1, x1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getY1() {
		return y1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY1(Object newY1) {
		Object oldY1 = y1;
		y1 = newY1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLAR_LINE_COMPONENT__Y1, oldY1, y1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.POLAR_LINE_COMPONENT__ANGLE:
				return getAngle();
			case Part2Package.POLAR_LINE_COMPONENT__CLIP_PATH:
				return getClipPath();
			case Part2Package.POLAR_LINE_COMPONENT__CLIP_RULE:
				return getClipRule();
			case Part2Package.POLAR_LINE_COMPONENT__DRAWING_PRIORITY:
				return getDrawingPriority();
			case Part2Package.POLAR_LINE_COMPONENT__ID:
				return getId();
			case Part2Package.POLAR_LINE_COMPONENT__R:
				return getR();
			case Part2Package.POLAR_LINE_COMPONENT__STROKE:
				return getStroke();
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_DASHARRAY:
				return getStrokeDasharray();
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_DASHOFFSET:
				return getStrokeDashoffset();
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_LINECAP:
				return getStrokeLinecap();
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_LINEJOIN:
				return getStrokeLinejoin();
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_MITERLIMIT:
				return getStrokeMiterlimit();
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_OPACITY:
				return getStrokeOpacity();
			case Part2Package.POLAR_LINE_COMPONENT__STROKEWIDTH:
				return getStrokewidth();
			case Part2Package.POLAR_LINE_COMPONENT__TRANSFORM:
				return getTransform();
			case Part2Package.POLAR_LINE_COMPONENT__VISIBILITY:
				return getVisibility();
			case Part2Package.POLAR_LINE_COMPONENT__X1:
				return getX1();
			case Part2Package.POLAR_LINE_COMPONENT__Y1:
				return getY1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Part2Package.POLAR_LINE_COMPONENT__ANGLE:
				setAngle(newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__CLIP_PATH:
				setClipPath((String)newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__CLIP_RULE:
				setClipRule((String)newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__DRAWING_PRIORITY:
				setDrawingPriority(newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__ID:
				setId((String)newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__R:
				setR(newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKE:
				setStroke(newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_DASHARRAY:
				setStrokeDasharray((String)newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_DASHOFFSET:
				setStrokeDashoffset(newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_LINECAP:
				setStrokeLinecap((String)newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_LINEJOIN:
				setStrokeLinejoin((String)newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_MITERLIMIT:
				setStrokeMiterlimit(newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_OPACITY:
				setStrokeOpacity(newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKEWIDTH:
				setStrokewidth(newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__TRANSFORM:
				setTransform((String)newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__VISIBILITY:
				setVisibility(newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__X1:
				setX1(newValue);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__Y1:
				setY1(newValue);
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
			case Part2Package.POLAR_LINE_COMPONENT__ANGLE:
				setAngle(ANGLE_EDEFAULT);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__CLIP_PATH:
				unsetClipPath();
				return;
			case Part2Package.POLAR_LINE_COMPONENT__CLIP_RULE:
				unsetClipRule();
				return;
			case Part2Package.POLAR_LINE_COMPONENT__DRAWING_PRIORITY:
				unsetDrawingPriority();
				return;
			case Part2Package.POLAR_LINE_COMPONENT__ID:
				setId(ID_EDEFAULT);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__R:
				setR(R_EDEFAULT);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKE:
				unsetStroke();
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_DASHARRAY:
				unsetStrokeDasharray();
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_DASHOFFSET:
				unsetStrokeDashoffset();
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_LINECAP:
				unsetStrokeLinecap();
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_LINEJOIN:
				unsetStrokeLinejoin();
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_MITERLIMIT:
				unsetStrokeMiterlimit();
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_OPACITY:
				unsetStrokeOpacity();
				return;
			case Part2Package.POLAR_LINE_COMPONENT__STROKEWIDTH:
				unsetStrokewidth();
				return;
			case Part2Package.POLAR_LINE_COMPONENT__TRANSFORM:
				unsetTransform();
				return;
			case Part2Package.POLAR_LINE_COMPONENT__VISIBILITY:
				unsetVisibility();
				return;
			case Part2Package.POLAR_LINE_COMPONENT__X1:
				setX1(X1_EDEFAULT);
				return;
			case Part2Package.POLAR_LINE_COMPONENT__Y1:
				setY1(Y1_EDEFAULT);
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
			case Part2Package.POLAR_LINE_COMPONENT__ANGLE:
				return ANGLE_EDEFAULT == null ? angle != null : !ANGLE_EDEFAULT.equals(angle);
			case Part2Package.POLAR_LINE_COMPONENT__CLIP_PATH:
				return isSetClipPath();
			case Part2Package.POLAR_LINE_COMPONENT__CLIP_RULE:
				return isSetClipRule();
			case Part2Package.POLAR_LINE_COMPONENT__DRAWING_PRIORITY:
				return isSetDrawingPriority();
			case Part2Package.POLAR_LINE_COMPONENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Part2Package.POLAR_LINE_COMPONENT__R:
				return R_EDEFAULT == null ? r != null : !R_EDEFAULT.equals(r);
			case Part2Package.POLAR_LINE_COMPONENT__STROKE:
				return isSetStroke();
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_DASHARRAY:
				return isSetStrokeDasharray();
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_DASHOFFSET:
				return isSetStrokeDashoffset();
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_LINECAP:
				return isSetStrokeLinecap();
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_LINEJOIN:
				return isSetStrokeLinejoin();
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_MITERLIMIT:
				return isSetStrokeMiterlimit();
			case Part2Package.POLAR_LINE_COMPONENT__STROKE_OPACITY:
				return isSetStrokeOpacity();
			case Part2Package.POLAR_LINE_COMPONENT__STROKEWIDTH:
				return isSetStrokewidth();
			case Part2Package.POLAR_LINE_COMPONENT__TRANSFORM:
				return isSetTransform();
			case Part2Package.POLAR_LINE_COMPONENT__VISIBILITY:
				return isSetVisibility();
			case Part2Package.POLAR_LINE_COMPONENT__X1:
				return X1_EDEFAULT == null ? x1 != null : !X1_EDEFAULT.equals(x1);
			case Part2Package.POLAR_LINE_COMPONENT__Y1:
				return Y1_EDEFAULT == null ? y1 != null : !Y1_EDEFAULT.equals(y1);
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
		result.append(" (angle: ");
		result.append(angle);
		result.append(", clipPath: ");
		if (clipPathESet) result.append(clipPath); else result.append("<unset>");
		result.append(", clipRule: ");
		if (clipRuleESet) result.append(clipRule); else result.append("<unset>");
		result.append(", drawingPriority: ");
		if (drawingPriorityESet) result.append(drawingPriority); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", r: ");
		result.append(r);
		result.append(", stroke: ");
		if (strokeESet) result.append(stroke); else result.append("<unset>");
		result.append(", strokeDasharray: ");
		if (strokeDasharrayESet) result.append(strokeDasharray); else result.append("<unset>");
		result.append(", strokeDashoffset: ");
		if (strokeDashoffsetESet) result.append(strokeDashoffset); else result.append("<unset>");
		result.append(", strokeLinecap: ");
		if (strokeLinecapESet) result.append(strokeLinecap); else result.append("<unset>");
		result.append(", strokeLinejoin: ");
		if (strokeLinejoinESet) result.append(strokeLinejoin); else result.append("<unset>");
		result.append(", strokeMiterlimit: ");
		if (strokeMiterlimitESet) result.append(strokeMiterlimit); else result.append("<unset>");
		result.append(", strokeOpacity: ");
		if (strokeOpacityESet) result.append(strokeOpacity); else result.append("<unset>");
		result.append(", strokewidth: ");
		if (strokewidthESet) result.append(strokewidth); else result.append("<unset>");
		result.append(", transform: ");
		if (transformESet) result.append(transform); else result.append("<unset>");
		result.append(", visibility: ");
		if (visibilityESet) result.append(visibility); else result.append("<unset>");
		result.append(", x1: ");
		result.append(x1);
		result.append(", y1: ");
		result.append(y1);
		result.append(')');
		return result.toString();
	}

} //PolarLineComponentImpl
