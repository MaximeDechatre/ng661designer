/*******************************************************************************
 * Copyright (c) 2018 Dassault Aviation and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.polarsys.ng661designer.part2.PointType;
import org.polarsys.ng661designer.part2.PropertyValue;

public class EEFServices {

	private static final String JAVA_LANG_STRING = "java.lang.String"; //$NON-NLS-1$

	private static final String INT = "int"; //$NON-NLS-1$

	private static final String JAVA_LANG_INTEGER = "java.lang.Integer"; //$NON-NLS-1$

	private static final String DOUBLE = "double"; //$NON-NLS-1$

	private static final String JAVA_LANG_DOUBLE = "java.lang.Double"; //$NON-NLS-1$

	private static final String CHAR = "char"; //$NON-NLS-1$

	private static final String JAVA_LANG_CHARACTER = "java.lang.Character"; //$NON-NLS-1$

	private static final String SHORT = "short"; //$NON-NLS-1$

	private static final String JAVA_LANG_SHORT = "java.lang.Short"; //$NON-NLS-1$

	private static final String LONG = "long"; //$NON-NLS-1$

	private static final String JAVA_LANG_LONG = "java.lang.Long"; //$NON-NLS-1$

	private static final String FLOAT = "float"; //$NON-NLS-1$

	private static final String JAVA_LANG_FLOAT = "java.lang.Float"; //$NON-NLS-1$

	private static final String JAVA_UTIL_DATE = "java.util.Date"; //$NON-NLS-1$

	private static final String JAVA_MATH_BIGINTEGER = "java.math.BigInteger"; //$NON-NLS-1$

	private static final String JAVA_MATH_BIGDECIMAL = "java.math.BigDecimal"; //$NON-NLS-1$

	private static final String JAVA_LANG_OBJECT = "java.lang.Object"; //$NON-NLS-1$

	private static final String PART2_PACKAGE_NAME = "part2"; //$NON-NLS-1$

	/*
	 * Override from org.eclipse.sirius.properties.core.internal.EditSupportSpec
	 */
	public boolean needsTextWidget(EStructuralFeature eStructuralFeature) {
		boolean needsTextWidget = false;

		EClassifier eType = eStructuralFeature.getEType();
		String instanceTypeName = eType.getInstanceTypeName();
		needsTextWidget = needsTextWidget || JAVA_LANG_STRING.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || INT.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || JAVA_LANG_INTEGER.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || DOUBLE.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || JAVA_LANG_DOUBLE.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || CHAR.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || JAVA_LANG_CHARACTER.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || SHORT.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || JAVA_LANG_SHORT.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || LONG.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || JAVA_LANG_LONG.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || FLOAT.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || JAVA_LANG_FLOAT.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || JAVA_UTIL_DATE.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || JAVA_MATH_BIGINTEGER.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || JAVA_MATH_BIGDECIMAL.equals(instanceTypeName);
		needsTextWidget = needsTextWidget || JAVA_MATH_BIGDECIMAL.equals(instanceTypeName);

		needsTextWidget = needsTextWidget
				|| ((eType instanceof EDataType) && (JAVA_LANG_OBJECT.equals(instanceTypeName))
						&& (PART2_PACKAGE_NAME.equals(eType.getEPackage().getName())));

		return needsTextWidget && !eStructuralFeature.isMany();
	}

	/*
	 * Override from org.eclipse.sirius.properties.core.internal.EditSupportSpec
	 */
	public EList<EStructuralFeature> getEStructuralFeatures(EObject object) {
		EList<EStructuralFeature> visibleFeatures = new BasicEList<>();
		List<EStructuralFeature> visibleMandatoryFeatures = new ArrayList<>();
		List<EStructuralFeature> visibleOptionalFeatures = new ArrayList<>();
		for (EStructuralFeature eStructuralFeature : object.eClass().getEAllStructuralFeatures()) {
			if (shouldAppearInPropertySheet(eStructuralFeature)) {
				if (eStructuralFeature.isRequired()) {
					visibleMandatoryFeatures.add(eStructuralFeature);
				} else {
					visibleOptionalFeatures.add(eStructuralFeature);
				}
			}
		}
		visibleFeatures.addAll(visibleMandatoryFeatures);
		visibleFeatures.addAll(visibleOptionalFeatures);
		return visibleFeatures;
	}

	/*
	 * Override from org.eclipse.sirius.properties.core.internal.EditSupportSpec
	 */
	private boolean shouldAppearInPropertySheet(EStructuralFeature eStructuralFeature) {
		return !eStructuralFeature.isDerived() && !eStructuralFeature.isTransient()
				&& !(eStructuralFeature instanceof EReference && ((EReference) eStructuralFeature).isContainment())
				&& !EcorePackage.Literals.EFEATURE_MAP_ENTRY.equals(eStructuralFeature.getEType());
	}

	public boolean isDefaultValueApplied(EObject object, EStructuralFeature feature) {
		String defaultValueLiteral = feature.getDefaultValueLiteral();
		Object appliedValue = object.eGet(feature);
		if (defaultValueLiteral != null && appliedValue != null
				&& defaultValueLiteral.equals(appliedValue.toString())) {
			return true;
		}
		return false;
	}

	public boolean isValueAllowed(EObject object, EStructuralFeature eSF) {
		if (eSF instanceof EAttribute) {
			Diagnostic diagnostic = Diagnostician.INSTANCE.validate(((EAttribute) eSF).getEAttributeType(),
					object.eGet(eSF));
			if (diagnostic != null) {
				if (Diagnostic.OK == diagnostic.getSeverity()) {
					return true;
				} else {
					return false;
				}
			}
			return false;
		}
		return true;
	}

	public void setPropertyValueValue(PropertyValue propertyValue, String newValue) {
		propertyValue.setValue(newValue);
	}

	public void setXValue(PointType point, String newValue) {
		Double doubelValue = Double.valueOf(newValue);
		point.setX(doubelValue);
	}

	public void setYValue(PointType point, String newValue) {
		point.setY(Double.valueOf(newValue));
	}
}
