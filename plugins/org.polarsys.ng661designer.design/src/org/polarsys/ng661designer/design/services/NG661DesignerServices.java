/*******************************************************************************
 * Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.design.services;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.ng661designer.dsl.part2.util.FeatureServices;
import org.polarsys.ng661designer.part2.ArcComponent;
import org.polarsys.ng661designer.part2.CirclePrimitive;
import org.polarsys.ng661designer.part2.ClipPathPrimitive;
import org.polarsys.ng661designer.part2.ClockType;
import org.polarsys.ng661designer.part2.ComponentDefinitionType;
import org.polarsys.ng661designer.part2.CrownComponent;
import org.polarsys.ng661designer.part2.EllipsePrimitive;
import org.polarsys.ng661designer.part2.FunctionType;
import org.polarsys.ng661designer.part2.GestureAreaPrimitive;
import org.polarsys.ng661designer.part2.KeyboardInputPrimitive;
import org.polarsys.ng661designer.part2.LinePrimitive;
import org.polarsys.ng661designer.part2.PathPrimitive;
import org.polarsys.ng661designer.part2.PointerAreaPrimitive;
import org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive;
import org.polarsys.ng661designer.part2.PolarLineComponent;
import org.polarsys.ng661designer.part2.PolygonPrimitive;
import org.polarsys.ng661designer.part2.PolylinePrimitive;
import org.polarsys.ng661designer.part2.PropertyType;
import org.polarsys.ng661designer.part2.PropertyValue;
import org.polarsys.ng661designer.part2.RectPrimitive;
import org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive;
import org.polarsys.ng661designer.part2.SimpleTextPrimitive;
import org.polarsys.ng661designer.part2.TouchAreaPrimitive;
import org.polarsys.ng661designer.part2.TreeType;
import org.polarsys.ng661designer.part2.TreeTypes;
import org.polarsys.ng661designer.part2.WidgetComposition;
import org.w3._2005._07.scxml.ScxmlOnexecuteType;
import org.w3._2005._07.scxml.ScxmlScxmlType;
import org.w3._2005._07.scxml.ScxmlStateType;
import org.w3._2005._07.scxml.ScxmlTransitionType;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * Services for representations.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class NG661DesignerServices {

	private static final String TOUCH_AREA = ".touch";
	private static final String NAME_TYPE = "NameType";
	private static final String ID = "id";

	private ResourceServices resourceServices;
	private EcoreServices ecoreServices;
	private FeatureServices featureServices;
	private NG661DesignerModelUtils ng661ModelUtils;

	/**
	 * @return ResourceServices
	 */
	private ResourceServices getResourceServices() {
		if (resourceServices == null) {
			resourceServices = new ResourceServices();
		}
		return resourceServices;
	}

	/**
	 * @return EcoreServices
	 */
	private EcoreServices getEcoreServices() {
		if (ecoreServices == null) {
			ecoreServices = new EcoreServices();
		}
		return ecoreServices;
	}

	/**
	 * @return FeatureServices
	 */
	private FeatureServices getFeatureServices() {
		if (featureServices == null) {
			featureServices = new FeatureServices();
		}
		return featureServices;
	}

	/**
	 * @return EcoreServices
	 */
	private NG661DesignerModelUtils getNG661DesignerModelUtils() {
		if (ng661ModelUtils == null) {
			ng661ModelUtils = new NG661DesignerModelUtils();
		}
		return ng661ModelUtils;
	}

	/**
	 * Open editor and set script.
	 * 
	 * @param functionType
	 *            FunctionType
	 */
	public void setScript(FunctionType functionType) {
		String script = getResourceServices().openEditor(functionType);
		functionType.setScript(script);
	}

	/**
	 * Open editor and set script.
	 * 
	 * @param type
	 *            ScxmlOnentryType
	 */
	public void setScript(final ScxmlOnexecuteType type) {
		EObject eContainer = type.eContainer();
		if (eContainer instanceof ScxmlStateType) {
			EList<ScxmlOnexecuteType> onEntry = ((ScxmlStateType) eContainer).getOnentry();
			int index = 0;
			String tag = "";
			if (onEntry.contains(type)) {
				index = onEntry.indexOf(type);
				tag = "_OnEntry";
			} else {
				EList<ScxmlOnexecuteType> onExit = ((ScxmlStateType) eContainer).getOnexit();
				index = onExit.indexOf(type);
				tag = "_OnExit";
			}
			String name = ((ScxmlStateType) eContainer).getId() + tag + Integer.toString(index);
			String script = getResourceServices().openEditor(type, name,
					getNG661DesignerModelUtils().getScript(type.getScript()));
			getNG661DesignerModelUtils().setScript(type, script);
		}
	}

	/**
	 * Open editor and set script.
	 * 
	 * @param type
	 *            ScxmlTransitionType
	 */
	public void setScript(final ScxmlTransitionType type) {
		Iterable<ScxmlTransitionType> filter = Iterables.filter(type.eContainer().eContents(),
				ScxmlTransitionType.class);
		String name = "Transition_" + ((ScxmlStateType) type.eContainer()).getId() + "_"
				+ Integer.toString(Iterables.indexOf(filter, new Predicate<ScxmlTransitionType>() {

					@Override
					public boolean apply(ScxmlTransitionType arg0) {
						return type.equals(arg0);
					}
				}));

		String script = getResourceServices().openEditor(type, name,
				getNG661DesignerModelUtils().getScript(type.getScript()));
		getNG661DesignerModelUtils().setScript(type, script);
	}

	/**
	 * Open editor and set script.
	 * 
	 * @param type
	 *            ScxmlScxmlType
	 */
	public void setScript(ScxmlScxmlType type) {
		String script = getResourceServices().openEditor(type, type.getName(),
				getNG661DesignerModelUtils().getScript(type.getScript()));
		getNG661DesignerModelUtils().setScript(type, script);
	}

	/**
	 * @param element
	 *            EObject
	 * @return id
	 */
	public String getRepresentationLabel(EObject element) {
		String label = "";
		if (element instanceof WidgetComposition && ((WidgetComposition) element).getRepresentation() != null) {
			String nameValue = null;
			EList<PropertyValue> values = ((WidgetComposition) element).getValues();
			for (PropertyValue propertyValue : values) {
				PropertyType property = propertyValue.getProperty();
				if (property != null) {
					String name = property.getName();
					if (name != null && name.equalsIgnoreCase("name")) {
						nameValue = propertyValue.getValue();
						break;
					}
				}
			}
			label = ((WidgetComposition) element).getRepresentation().getName();
			if (nameValue != null && !nameValue.isEmpty()) {
				String suffix = "\n<" + label + ">";
				return nameValue + suffix;
			}
		} else if (element instanceof ClipPathPrimitive) {
			label = "ClipPath";
		} else {
			EStructuralFeature featureID = element.eClass().getEStructuralFeature(ID);
			if (featureID != null && featureID.getEType().getName().contains(NAME_TYPE)) {
				String id = (String) element.eGet(featureID);
				if (id != null) {
					label += id;
				}
			}
		}
		String suffix = "\n<" + getSuffix(element) + ">";
		if (!label.endsWith(suffix)) {
			label += suffix;
		}
		return label;
	}

	/**
	 * @param element
	 *            EObject
	 * @return suffix
	 */
	public String getSuffix(EObject element) {
		String suffix = element.eClass().getName();
		if (element instanceof TreeTypes) {
			if (suffix.equals("RectPrimitive")) {
				suffix = "Rectangle";
			} else if (suffix.endsWith("ChildPrimitive")) {
				suffix = "Children";
			} else if (suffix.endsWith("Primitive")) {
				suffix = suffix.replace("Primitive", "");
			} else if (suffix.endsWith("Component")) {
				suffix = suffix.replace("Component", "");
			}
		}
		return suffix;
	}

	/**
	 * Set id to element.
	 * 
	 * @param element
	 *            EObject
	 */
	public void setTreeType(EObject element, String newValue) {
		String suffix = "<" + getSuffix(element) + ">";
		if (newValue.endsWith(suffix)) {
			newValue = newValue.replaceAll(suffix, "");
		}
		newValue = newValue.trim();
		EStructuralFeature featureID = element.eClass().getEStructuralFeature(ID);
		if (featureID != null && featureID.getEType().getName().contains(NAME_TYPE)) {
			element.eSet(featureID, newValue);
		}
	}

	/**
	 * @param element
	 *            TreeType Container
	 * @param className
	 *            class to create
	 * @return the new created object
	 */
	public EObject createTreeType(EObject element, String className) {
		boolean touch = false;
		if (className.endsWith(TOUCH_AREA)) {
			className = className.substring(0, className.length() - TOUCH_AREA.length());
			touch = true;
		}
		return getEcoreServices().createIDElement(element, className, touch);
	}

	/**
	 * Add target in source.
	 * 
	 * @param source
	 *            EObject
	 * @param target
	 *            EObject
	 * @return source
	 */
	public EObject createContainmentLink(EObject source, EObject target) {
		EStructuralFeature parentFeature = getFeatureServices().getParentTreeTypeFeatureName(source, target.eClass());
		if (parentFeature != null) {
			getFeatureServices().addEObjectToReference(source, target, parentFeature);
		}
		return source;
	}

	/**
	 * @param source
	 *            EObject
	 * @return if a link can start to source
	 */
	public boolean canContainTreeType(EObject source) {
		return !(source instanceof LinePrimitive || source instanceof PolylinePrimitive
				|| source instanceof PolygonPrimitive || source instanceof PathPrimitive
				|| source instanceof SimpleTextPrimitive || source instanceof ArcComponent
				|| source instanceof CrownComponent || source instanceof PolarLineComponent
				|| source instanceof PointerAreaPrimitive || source instanceof PointerGestureAreaPrimitive
				|| source instanceof TouchAreaPrimitive || source instanceof GestureAreaPrimitive
				|| source instanceof KeyboardInputPrimitive || source instanceof ScrollWheelInputPrimitive
				|| source instanceof ClockType);
	}

	/**
	 * @param source
	 *            EObject
	 * @param target
	 *            EObject
	 * @return if a link can end on target
	 */
	public boolean canContainTargetTreeType(EObject source, EObject target) {
		if (source instanceof ClipPathPrimitive && !(target instanceof RectPrimitive
				|| target instanceof CirclePrimitive || target instanceof EllipsePrimitive
				|| target instanceof LinePrimitive || target instanceof PathPrimitive)) {
			return false;
		}
		return true;
	}

	/**
	 * @param transitionScxmlTransitionType
	 * @return transition label
	 */
	public String getTransitionLabel(ScxmlTransitionType transition) {
		String label = "";
		if (transition.getEvent() != null) {
			label += transition.getEvent();
		}
		if (transition.getCond() != null) {
			label += "[" + transition.getCond() + "]";
		}
		return label;
	}

	/**
	 * @param onEntry
	 *            ScxmlOnentryType
	 * @return on entry label
	 */
	public String getOnentryLabel(ScxmlOnexecuteType onEntry) {
		String label = "onEntry";
		return label;
	}

	/**
	 * @param onExit
	 *            ScxmlOnexitType
	 * @return on exit label
	 */
	public String getOnexitLabel(ScxmlOnexecuteType onExit) {
		String label = "onExit";
		return label;
	}

	/**
	 * @param element
	 *            EObject
	 * @return associated element
	 */
	public List<EObject> getAssociatedElement(EObject element) {
		List<EObject> result = Lists.newArrayList();
		if (element instanceof ScxmlOnexecuteType) {
			result.addAll(((ScxmlOnexecuteType) element).getScript());
		} else if (element instanceof ScxmlTransitionType) {
			result.addAll(((ScxmlTransitionType) element).getScript());
		}
		return result;
	}

	/**
	 * @param transition
	 *            ScxmlTransitionType
	 * @return label expression
	 */
	public String getTransitionInputLabelExpression(ScxmlTransitionType transition) {
		return transition.getEvent() + "[" + transition.getCond() + "]";
	}

	/**
	 * @param source
	 *            ScxmlStateType
	 * @param target
	 *            ScxmlStateType
	 * @return transition
	 */
	public ScxmlTransitionType createTransition(ScxmlStateType source, ScxmlStateType target) {
		ScxmlTransitionType element = (ScxmlTransitionType) getEcoreServices().createElement(source,
				"org.w3._2005._07.scxml.ScxmlTransitionType");
		String elementTarget = element.getTarget();
		if (elementTarget == null || (element != null && target != null && !elementTarget.equals(target.getId()))) {
			elementTarget = target.getId();
			element.setTarget(elementTarget);
		}
		return element;
	}

	/**
	 * Import all componentDefinitions in tree
	 * 
	 * @param tree
	 *            TreeType
	 * @param componentDefinitions
	 *            List<ComponentDefinitionType>
	 */
	public void importTreeType(TreeType tree, List<ComponentDefinitionType> componentDefinitions) {
		for (ComponentDefinitionType componentDefinition : componentDefinitions) {
			getNG661DesignerModelUtils().addWidgetComposition(tree, componentDefinition);
		}
	}

	/**
	 * Import all PropertyType in widgetComposition
	 * 
	 * @param widgetComposition
	 *            WidgetComposition
	 * @param propertyTypes
	 *            List<PropertyType>
	 */
	public void importProperty(WidgetComposition widgetComposition, List<PropertyType> propertyTypes) {
		// add property value
		for (PropertyType property : propertyTypes) {
			if (!getNG661DesignerModelUtils().contains(property, widgetComposition.getValues())) {
				getNG661DesignerModelUtils().addPropertyValue(widgetComposition, property);
			}
		}
		List<EObject> toRemove = Lists.newArrayList();
		for (PropertyValue value : widgetComposition.getValues()) {
			if (!propertyTypes.contains(value.getProperty())) {
				toRemove.add(value);
			}
		}
		// remove property value
		widgetComposition.getValues().removeAll(toRemove);
	}

	/**
	 * Remove root element from the given Resource.
	 * 
	 * @param resource
	 *            The given Resource.
	 * @param object
	 *            the root element to remove.
	 */
	public void removeRootElement(Resource resource, EObject object) {
		resource.getContents().remove(object);
	}
}
