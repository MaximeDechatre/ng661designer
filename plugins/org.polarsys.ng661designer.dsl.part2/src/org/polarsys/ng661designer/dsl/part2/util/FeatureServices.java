/*******************************************************************************
 * Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.dsl.part2.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.ng661designer.part2.ClipPathPrimitive;
import org.polarsys.ng661designer.part2.ClippingContainerPrimitive;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.TreeType;
import org.polarsys.ng661designer.part2.TreeTypes;

/**
 * Services on EStructuralFeatures.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 *
 */
public class FeatureServices {

	/**
	 * Add EObject in reference.
	 * 
	 * @param container
	 *            EObject
	 * @param element
	 *            EObject
	 * @param featureParent
	 *            EStructuralFeature
	 */
	@SuppressWarnings("unchecked")
	public void addEObjectToReference(EObject container, EObject element, EStructuralFeature featureParent) {
		Object eGet = container.eGet(featureParent);
		if (eGet instanceof List) {
			List<EObject> values = (List<EObject>) eGet;
			values.add(element);
		} else {
			container.eSet(featureParent, element);
		}
	}

	/**
	 * @param container
	 *            EObject
	 * @param name
	 *            the qualified class name of the element to create
	 * @param touch
	 * @return parent feature
	 */
	public EStructuralFeature getParentFeature(EObject container, EClass eClass, boolean touch) {
		EStructuralFeature parentFeature = getParentTreeTypeFeatureName(container, eClass);
		if (parentFeature == null) {
			for (EReference reference : container.eClass().getEAllReferences()) {
				if (reference.getEType().equals(eClass)) {
					if (touch) {
						touch = false;
						continue;
					}
					return reference;
				}
			}
		}
		return parentFeature;
	}

	public EStructuralFeature getParentTreeTypeFeatureName(EObject container, EClass eClass) {
		if (container instanceof TreeType) {
			return container.eClass().getEStructuralFeature("group");
		}
		if (container instanceof ClippingContainerPrimitive && Part2Package.eINSTANCE.getClipPathPrimitive().equals(eClass)) {
			return container.eClass().getEStructuralFeature("clipPath");
		}
		if (container instanceof ClipPathPrimitive) {
			if (Part2Package.eINSTANCE.getRectPrimitive().equals(eClass)) {
				return container.eClass().getEStructuralFeature("rectangle");
			} else if (Part2Package.eINSTANCE.getCirclePrimitive().equals(eClass)) {
				return container.eClass().getEStructuralFeature("circle");
			} else if (Part2Package.eINSTANCE.getEllipsePrimitive().equals(eClass)) {
				return container.eClass().getEStructuralFeature("ellipse");
			} else if (Part2Package.eINSTANCE.getLinePrimitive().equals(eClass)) {
				return container.eClass().getEStructuralFeature("line");
			} else if (Part2Package.eINSTANCE.getPathPrimitive().equals(eClass)) {
				return container.eClass().getEStructuralFeature("closedPath");
			}
		}
		if (container instanceof TreeTypes) {
			return container.eClass().getEStructuralFeature("childElements");
		}
		return null;
	}

	/**
	 * @param element
	 *            EObject
	 * @param name
	 * @return parent feature.
	 */
	public EStructuralFeature getParentFeature(EObject element, String name) {
		for (EReference reference : element.eClass().getEAllReferences()) {
			if (reference.getEType().getInstanceClassName().equals(name)) {
				return reference;
			}
		}
		return null;
	}

	/**
	 * @param element
	 *            EObject
	 * @param name
	 * @return parent feature.
	 */
	public EStructuralFeature getParentFeature(EClass element, String name) {
		for (EReference reference : element.getEAllReferences()) {
			if (reference.getEType().getInstanceClassName().equals(name)) {
				return reference;
			}
		}
		return null;
	}

}
