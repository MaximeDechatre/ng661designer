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

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.polarsys.ng661designer.part2.Part2Factory;
import org.polarsys.ng661designer.part2.Part2Package;

import org.polarsys.ng661designer.part2.util.Part2Validator;

import org.w3._2005._07.scxml.ScxmlPackage;

import org.w3._2005._07.scxml.impl.ScxmlPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Part2PackageImpl extends EPackageImpl implements Part2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "part2.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayFieldDefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circlePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clipPathPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clippingContainerPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closePathCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crownComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cubicBezierCurveCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customIntegerTypeElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customRealTypeElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customStringTypeElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipseArcCurveCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipsePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumDefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDefinitionAbstractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass framePropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gestureAreaPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyboardInputPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineToCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveToCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherArrayEntriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherEntriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherStructEntriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherUnionEntriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerAreaPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerGestureAreaPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polarLineComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polylinePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privatePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeClosePathCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeCubicBezierCurveCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeEllipseArcCurveCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeLineToCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeMoveToCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replicatePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reverseVideoPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollWheelInputPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTextPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strikeThroughPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structDefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structEventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchNodePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchAreaPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformGroupPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformMatrixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformRotateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformScaleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformSkewXTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformSkewYTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformTranslateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAlternativeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionAbstractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass underlinePropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionDefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionEventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clipPathTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetCompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignementTypeValEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignmentType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aspectRatioType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aspectRatioTypeValEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanTypeValEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clipRuleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorReferenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fillRuleType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fillRuleTypeValEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowDirectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instantiationModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modalityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modalityType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modalityType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multilineModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum strokeLinecapTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum strokeLinejoinTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textFlowTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityTypeValEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alignementTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alignementTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alignmentTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alignmentTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angleTypeValEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angleTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aspectRatioTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aspectRatioTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aspectRatioTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType characterTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType clipRuleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorReferenceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorRGBHEXTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorRGBRgb255TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorRGBRgbPercentTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorRGBTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType distanceTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType expressionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillRuleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillRuleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillRuleTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType flowDirectionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType formatStringTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType formatStringTypeValEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType frequencyTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType frequencyTypeValEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType frequencyTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType imageTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType instantiationModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modalityTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modalityTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modalityTypeObject2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType multilineModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType opacityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType opacityTypeValEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType opacityTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pressureTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pressureTypeValEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pressureTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType realTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stippleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strokeLinecapTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strokeLinejoinTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textFlowTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeDefaultmillisecondsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeHoursTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeMinutesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeSecondsOrSubsecondsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType velocityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType velocityTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType visibilityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType visibilityTypeValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zIndexTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zIndexTypeValEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.ng661designer.part2.Part2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Part2PackageImpl() {
		super(eNS_URI, Part2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Part2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Part2Package init() {
		if (isInited) return (Part2Package)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI);

		// Obtain or create and register package
		Part2PackageImpl thePart2Package = (Part2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Part2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Part2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ScxmlPackageImpl theScxmlPackage = (ScxmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScxmlPackage.eNS_URI) instanceof ScxmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScxmlPackage.eNS_URI) : ScxmlPackage.eINSTANCE);

		// Load packages
		thePart2Package.loadPackage();

		// Create package meta-data objects
		theScxmlPackage.createPackageContents();

		// Initialize created meta-data
		theScxmlPackage.initializePackageContents();

		// Fix loaded packages
		thePart2Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePart2Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Part2Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePart2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Part2Package.eNS_URI, thePart2Package);
		return thePart2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcComponent() {
		if (arcComponentEClass == null) {
			arcComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(10);
		}
		return arcComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Angle() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Blocked() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_DrawingPriority() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Enable() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Fill() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_FillOpacity() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_FillRule() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Id() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_InboundAngle() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_InheritedBlocked() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_InheritedEnable() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_InheritedVisible() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Radius() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Stroke() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_StrokeDasharray() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_StrokeDashoffset() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_StrokeLinecap() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_StrokeLinejoin() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_StrokeMiterlimit() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_StrokeOpacity() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Strokewidth() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Visible() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_X() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcComponent_Y() {
        return (EAttribute)getArcComponent().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayDefinitionType() {
		if (arrayDefinitionTypeEClass == null) {
			arrayDefinitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(11);
		}
		return arrayDefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDefinitionType_EntryType() {
        return (EAttribute)getArrayDefinitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDefinitionType_MaxStringLength() {
        return (EAttribute)getArrayDefinitionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayEntryType() {
		if (arrayEntryTypeEClass == null) {
			arrayEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(12);
		}
		return arrayEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEntryType_Entry() {
        return (EReference)getArrayEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEntryType_OtherEntries() {
        return (EReference)getArrayEntryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEntryType_ArrayEntry() {
        return (EReference)getArrayEntryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEntryType_OtherArrayEntries() {
        return (EReference)getArrayEntryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEntryType_StructEntry() {
        return (EReference)getArrayEntryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEntryType_OtherStructEntries() {
        return (EReference)getArrayEntryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEntryType_UnionEntry() {
        return (EReference)getArrayEntryType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEntryType_OtherUnionEntries() {
        return (EReference)getArrayEntryType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayEntryType_Index() {
        return (EAttribute)getArrayEntryType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayEntryType_MaxNumberOfEntries() {
        return (EAttribute)getArrayEntryType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayEntryType_NumberOfEntries() {
        return (EAttribute)getArrayEntryType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayEventType() {
		if (arrayEventTypeEClass == null) {
			arrayEventTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(13);
		}
		return arrayEventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEventType_Entry() {
        return (EReference)getArrayEventType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEventType_OtherEntries() {
        return (EReference)getArrayEventType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEventType_ArrayEntry() {
        return (EReference)getArrayEventType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEventType_OtherArrayEntries() {
        return (EReference)getArrayEventType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEventType_StructEntry() {
        return (EReference)getArrayEventType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEventType_OtherStructEntries() {
        return (EReference)getArrayEventType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEventType_UnionEntry() {
        return (EReference)getArrayEventType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayEventType_OtherUnionEntries() {
        return (EReference)getArrayEventType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayEventType_MaxNumberOfEntries() {
        return (EAttribute)getArrayEventType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayEventType_Name() {
        return (EAttribute)getArrayEventType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayEventType_NumberOfEntries() {
        return (EAttribute)getArrayEventType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayEventType_Type() {
        return (EAttribute)getArrayEventType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayFieldDefinitionType() {
		if (arrayFieldDefinitionTypeEClass == null) {
			arrayFieldDefinitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(14);
		}
		return arrayFieldDefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayFieldDefinitionType_EntriesType() {
        return (EAttribute)getArrayFieldDefinitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayFieldDefinitionType_MaxStringLength() {
        return (EAttribute)getArrayFieldDefinitionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayFieldType() {
		if (arrayFieldTypeEClass == null) {
			arrayFieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(15);
		}
		return arrayFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayFieldType_Entry() {
        return (EReference)getArrayFieldType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayFieldType_OtherEntries() {
        return (EReference)getArrayFieldType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayFieldType_ArrayEntry() {
        return (EReference)getArrayFieldType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayFieldType_OtherArrayEntries() {
        return (EReference)getArrayFieldType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayFieldType_StructEntry() {
        return (EReference)getArrayFieldType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayFieldType_OtherStructEntries() {
        return (EReference)getArrayFieldType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayFieldType_UnionEntry() {
        return (EReference)getArrayFieldType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayFieldType_OtherUnionEntries() {
        return (EReference)getArrayFieldType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayFieldType_MaxNumberOfEntries() {
        return (EAttribute)getArrayFieldType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayFieldType_Name() {
        return (EAttribute)getArrayFieldType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayFieldType_NumberOfEntries() {
        return (EAttribute)getArrayFieldType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayPropertyType() {
		if (arrayPropertyTypeEClass == null) {
			arrayPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(16);
		}
		return arrayPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayPropertyType_Entry() {
        return (EReference)getArrayPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayPropertyType_OtherEntries() {
        return (EReference)getArrayPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayPropertyType_ArrayEntry() {
        return (EReference)getArrayPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayPropertyType_OtherArrayEntries() {
        return (EReference)getArrayPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayPropertyType_StructEntry() {
        return (EReference)getArrayPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayPropertyType_OtherStructEntries() {
        return (EReference)getArrayPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayPropertyType_UnionEntry() {
        return (EReference)getArrayPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayPropertyType_OtherUnionEntries() {
        return (EReference)getArrayPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayPropertyType_MaxNumberOfEntries() {
        return (EAttribute)getArrayPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayPropertyType_Modality() {
        return (EAttribute)getArrayPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayPropertyType_Name() {
        return (EAttribute)getArrayPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayPropertyType_NumberOfEntries() {
        return (EAttribute)getArrayPropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayPropertyType_Type() {
        return (EAttribute)getArrayPropertyType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorType() {
		if (behaviorTypeEClass == null) {
			behaviorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(22);
		}
		return behaviorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorType_Scxml() {
        return (EReference)getBehaviorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorType_Function() {
        return (EReference)getBehaviorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorType_Property() {
        return (EReference)getBehaviorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildPrimitive() {
		if (childPrimitiveEClass == null) {
			childPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(27);
		}
		return childPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_ChildElements() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_Transform() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_Group() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_TransformGroup() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_Replicate() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_Children() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_SwitchNode() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_ClippingContainer() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_Rectangle() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_Circle() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_Ellipse() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_Line() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_Polyline() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_Polygon() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_Path() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_Image() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_SimpleText() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_Arc() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_Crown() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_PolarLine() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_PointerArea() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_PointerGestureArea() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_TouchArea() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_GestureArea() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_KeyboardInput() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_ScrollWheelInput() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPrimitive_Compositions() {
        return (EReference)getChildPrimitive().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPrimitive_Blocked() {
        return (EAttribute)getChildPrimitive().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPrimitive_DrawingPriority() {
        return (EAttribute)getChildPrimitive().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPrimitive_Enable() {
        return (EAttribute)getChildPrimitive().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPrimitive_Id() {
        return (EAttribute)getChildPrimitive().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPrimitive_InheritedBlocked() {
        return (EAttribute)getChildPrimitive().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPrimitive_InheritedEnable() {
        return (EAttribute)getChildPrimitive().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPrimitive_InheritedVisible() {
        return (EAttribute)getChildPrimitive().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPrimitive_InstantiationMode() {
        return (EAttribute)getChildPrimitive().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildPrimitive_Visible() {
        return (EAttribute)getChildPrimitive().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCirclePrimitive() {
		if (circlePrimitiveEClass == null) {
			circlePrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(28);
		}
		return circlePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_ChildElements() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Group() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_TransformGroup() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Replicate() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Children() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_SwitchNode() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_ClippingContainer() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Rectangle() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Circle() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Ellipse() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Line() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Polyline() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Polygon() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Path() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Image() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_SimpleText() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Arc() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Crown() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_PolarLine() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_PointerArea() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_PointerGestureArea() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_TouchArea() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_GestureArea() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_KeyboardInput() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_ScrollWheelInput() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCirclePrimitive_Compositions() {
        return (EReference)getCirclePrimitive().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Blocked() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Cx() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Cy() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_DrawingPriority() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Enable() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Fill() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_FillOpacity() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_FillRule() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Id() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_InheritedBlocked() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_InheritedEnable() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_InheritedVisible() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_R() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Stroke() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_StrokeDasharray() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_StrokeDashoffset() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_StrokeLinecap() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_StrokeLinejoin() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_StrokeMiterlimit() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_StrokeOpacity() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Strokewidth() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCirclePrimitive_Visible() {
        return (EAttribute)getCirclePrimitive().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClipPathPrimitive() {
		if (clipPathPrimitiveEClass == null) {
			clipPathPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(29);
		}
		return clipPathPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClipPathPrimitive_Rectangle() {
        return (EReference)getClipPathPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClipPathPrimitive_Circle() {
        return (EReference)getClipPathPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClipPathPrimitive_Ellipse() {
        return (EReference)getClipPathPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClipPathPrimitive_Line() {
        return (EReference)getClipPathPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClipPathPrimitive_ClosedPath() {
        return (EReference)getClipPathPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClipPathPrimitive_ClipRule() {
        return (EAttribute)getClipPathPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClippingContainerPrimitive() {
		if (clippingContainerPrimitiveEClass == null) {
			clippingContainerPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(30);
		}
		return clippingContainerPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_ChildElements() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_ClipPath() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_Group() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_TransformGroup() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_Replicate() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_Children() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_SwitchNode() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_ClippingContainer() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_Rectangle() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_Circle() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_Ellipse() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_Line() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_Polyline() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_Polygon() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_Path() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_Image() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_SimpleText() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_Arc() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_Crown() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_PolarLine() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_PointerArea() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_PointerGestureArea() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_TouchArea() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_GestureArea() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_KeyboardInput() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_ScrollWheelInput() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClippingContainerPrimitive_Compositions() {
        return (EReference)getClippingContainerPrimitive().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClippingContainerPrimitive_Blocked() {
        return (EAttribute)getClippingContainerPrimitive().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClippingContainerPrimitive_DrawingPriority() {
        return (EAttribute)getClippingContainerPrimitive().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClippingContainerPrimitive_Enable() {
        return (EAttribute)getClippingContainerPrimitive().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClippingContainerPrimitive_Id() {
        return (EAttribute)getClippingContainerPrimitive().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClippingContainerPrimitive_InheritedBlocked() {
        return (EAttribute)getClippingContainerPrimitive().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClippingContainerPrimitive_InheritedEnable() {
        return (EAttribute)getClippingContainerPrimitive().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClippingContainerPrimitive_InheritedVisible() {
        return (EAttribute)getClippingContainerPrimitive().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClippingContainerPrimitive_Visible() {
        return (EAttribute)getClippingContainerPrimitive().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockType() {
		if (clockTypeEClass == null) {
			clockTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(33);
		}
		return clockTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockType_Id() {
        return (EAttribute)getClockType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClosePathCommand() {
		if (closePathCommandEClass == null) {
			closePathCommandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(34);
		}
		return closePathCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentDefinitionType() {
		if (componentDefinitionTypeEClass == null) {
			componentDefinitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(42);
		}
		return componentDefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDefinitionType_Definition() {
        return (EReference)getComponentDefinitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDefinitionType_Interface() {
        return (EReference)getComponentDefinitionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDefinitionType_Tree() {
        return (EReference)getComponentDefinitionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDefinitionType_Behavior() {
        return (EReference)getComponentDefinitionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentDefinitionType_Name() {
        return (EAttribute)getComponentDefinitionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrownComponent() {
		if (crownComponentEClass == null) {
			crownComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(43);
		}
		return crownComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_Blocked() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_DrawingPriority() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_Enable() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_Fill() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_FillOpacity() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_FillRule() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_Id() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_InheritedBlocked() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_InheritedEnable() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_InheritedVisible() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_InnerRadius() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_OuterRadius() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_Stroke() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_StrokeDasharray() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_StrokeDashoffset() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_StrokeLinecap() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_StrokeLinejoin() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_StrokeMiterlimit() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_StrokeOpacity() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_Strokewidth() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_Visible() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_X() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrownComponent_Y() {
        return (EAttribute)getCrownComponent().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCubicBezierCurveCommand() {
		if (cubicBezierCurveCommandEClass == null) {
			cubicBezierCurveCommandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(44);
		}
		return cubicBezierCurveCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubicBezierCurveCommand_X() {
        return (EAttribute)getCubicBezierCurveCommand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubicBezierCurveCommand_X1() {
        return (EAttribute)getCubicBezierCurveCommand().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubicBezierCurveCommand_X2() {
        return (EAttribute)getCubicBezierCurveCommand().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubicBezierCurveCommand_Y() {
        return (EAttribute)getCubicBezierCurveCommand().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubicBezierCurveCommand_Y1() {
        return (EAttribute)getCubicBezierCurveCommand().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubicBezierCurveCommand_Y2() {
        return (EAttribute)getCubicBezierCurveCommand().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomIntegerTypeElementType() {
		if (customIntegerTypeElementTypeEClass == null) {
			customIntegerTypeElementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(45);
		}
		return customIntegerTypeElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomIntegerTypeElementType_Any() {
        return (EAttribute)getCustomIntegerTypeElementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomIntegerTypeElementType_Max() {
        return (EAttribute)getCustomIntegerTypeElementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomIntegerTypeElementType_Min() {
        return (EAttribute)getCustomIntegerTypeElementType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomIntegerTypeElementType_Name() {
        return (EAttribute)getCustomIntegerTypeElementType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomIntegerTypeElementType_Resolution() {
        return (EAttribute)getCustomIntegerTypeElementType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomIntegerTypeElementType_Unit() {
        return (EAttribute)getCustomIntegerTypeElementType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomIntegerTypeElementType_AnyAttribute() {
        return (EAttribute)getCustomIntegerTypeElementType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomRealTypeElementType() {
		if (customRealTypeElementTypeEClass == null) {
			customRealTypeElementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(46);
		}
		return customRealTypeElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRealTypeElementType_Any() {
        return (EAttribute)getCustomRealTypeElementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRealTypeElementType_Max() {
        return (EAttribute)getCustomRealTypeElementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRealTypeElementType_Min() {
        return (EAttribute)getCustomRealTypeElementType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRealTypeElementType_Name() {
        return (EAttribute)getCustomRealTypeElementType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRealTypeElementType_Resolution() {
        return (EAttribute)getCustomRealTypeElementType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRealTypeElementType_Unit() {
        return (EAttribute)getCustomRealTypeElementType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRealTypeElementType_AnyAttribute() {
        return (EAttribute)getCustomRealTypeElementType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomStringTypeElementType() {
		if (customStringTypeElementTypeEClass == null) {
			customStringTypeElementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(47);
		}
		return customStringTypeElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomStringTypeElementType_Any() {
        return (EAttribute)getCustomStringTypeElementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomStringTypeElementType_MaxLength() {
        return (EAttribute)getCustomStringTypeElementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomStringTypeElementType_MinLength() {
        return (EAttribute)getCustomStringTypeElementType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomStringTypeElementType_Name() {
        return (EAttribute)getCustomStringTypeElementType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomStringTypeElementType_Regex() {
        return (EAttribute)getCustomStringTypeElementType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomStringTypeElementType_AnyAttribute() {
        return (EAttribute)getCustomStringTypeElementType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionsType() {
		if (definitionsTypeEClass == null) {
			definitionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(50);
		}
		return definitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionsType_StructDefinition() {
        return (EReference)getDefinitionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionsType_EnumDefinition() {
        return (EReference)getDefinitionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionsType_ArrayDefinition() {
        return (EReference)getDefinitionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionsType_UnionDefinition() {
        return (EReference)getDefinitionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionType() {
		if (definitionTypeEClass == null) {
			definitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(51);
		}
		return definitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionType_Import() {
        return (EReference)getDefinitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionType_TypeDefinition() {
        return (EReference)getDefinitionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionType_PropertyGroupDefinition() {
        return (EReference)getDefinitionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(53);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ComponentDefinition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipseArcCurveCommand() {
		if (ellipseArcCurveCommandEClass == null) {
			ellipseArcCurveCommandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(54);
		}
		return ellipseArcCurveCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseArcCurveCommand_Angle() {
        return (EAttribute)getEllipseArcCurveCommand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseArcCurveCommand_LargeArcFlag() {
        return (EAttribute)getEllipseArcCurveCommand().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseArcCurveCommand_R1() {
        return (EAttribute)getEllipseArcCurveCommand().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseArcCurveCommand_R2() {
        return (EAttribute)getEllipseArcCurveCommand().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseArcCurveCommand_SweepFlag() {
        return (EAttribute)getEllipseArcCurveCommand().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseArcCurveCommand_X() {
        return (EAttribute)getEllipseArcCurveCommand().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseArcCurveCommand_Y() {
        return (EAttribute)getEllipseArcCurveCommand().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipsePrimitive() {
		if (ellipsePrimitiveEClass == null) {
			ellipsePrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(55);
		}
		return ellipsePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_ChildElements() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Group() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_TransformGroup() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Replicate() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Children() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_SwitchNode() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_ClippingContainer() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Rectangle() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Circle() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Ellipse() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Line() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Polyline() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Polygon() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Path() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Image() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_SimpleText() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Arc() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Crown() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_PolarLine() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_PointerArea() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_PointerGestureArea() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_TouchArea() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_GestureArea() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_KeyboardInput() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_ScrollWheelInput() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsePrimitive_Compositions() {
        return (EReference)getEllipsePrimitive().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Blocked() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Cx() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Cy() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_DrawingPriority() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Enable() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Fill() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_FillOpacity() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_FillRule() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Id() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_InheritedBlocked() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_InheritedEnable() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_InheritedVisible() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Rx() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Ry() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Stroke() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_StrokeDasharray() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_StrokeDashoffset() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_StrokeLinecap() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_StrokeLinejoin() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_StrokeMiterlimit() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_StrokeOpacity() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Strokewidth() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsePrimitive_Visible() {
        return (EAttribute)getEllipsePrimitive().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryType() {
		if (entryTypeEClass == null) {
			entryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(56);
		}
		return entryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Index() {
        return (EAttribute)getEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Value() {
        return (EAttribute)getEntryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumDefinitionType() {
		if (enumDefinitionTypeEClass == null) {
			enumDefinitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(57);
		}
		return enumDefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumDefinitionType_Enumeration() {
        return (EReference)getEnumDefinitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationType() {
		if (enumerationTypeEClass == null) {
			enumerationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(58);
		}
		return enumerationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_Index() {
        return (EAttribute)getEnumerationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_Value() {
        return (EAttribute)getEnumerationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventType() {
		if (eventTypeEClass == null) {
			eventTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(59);
		}
		return eventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventType_Name() {
        return (EAttribute)getEventType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldDefinitionAbstractType() {
		if (fieldDefinitionAbstractTypeEClass == null) {
			fieldDefinitionAbstractTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(61);
		}
		return fieldDefinitionAbstractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldDefinitionAbstractType_Name() {
        return (EAttribute)getFieldDefinitionAbstractType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldDefinitionType() {
		if (fieldDefinitionTypeEClass == null) {
			fieldDefinitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(62);
		}
		return fieldDefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldDefinitionType_MaxStringLength() {
        return (EAttribute)getFieldDefinitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldDefinitionType_Type() {
        return (EAttribute)getFieldDefinitionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldType() {
		if (fieldTypeEClass == null) {
			fieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(63);
		}
		return fieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldType_Name() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldType_Value() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrameProperties() {
		if (framePropertiesEClass == null) {
			framePropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(74);
		}
		return framePropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameProperties_Active() {
        return (EAttribute)getFrameProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameProperties_AscenderMargin() {
        return (EAttribute)getFrameProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameProperties_DescenderMargin() {
        return (EAttribute)getFrameProperties().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameProperties_EndMargin() {
        return (EAttribute)getFrameProperties().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameProperties_StartMargin() {
        return (EAttribute)getFrameProperties().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameProperties_StrokeWidth() {
        return (EAttribute)getFrameProperties().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionType() {
		if (functionTypeEClass == null) {
			functionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(78);
		}
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_Param() {
        return (EReference)getFunctionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_Script() {
        return (EAttribute)getFunctionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_Name() {
        return (EAttribute)getFunctionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGestureAreaPrimitive() {
		if (gestureAreaPrimitiveEClass == null) {
			gestureAreaPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(79);
		}
		return gestureAreaPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_AcceptedGesture() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_Blocked() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_Enable() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_Height() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_Id() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_InheritedBlocked() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_InheritedEnable() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_InheritedVisible() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_PreventStealing() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_TrackOutside() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_Visible() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_Width() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_X() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestureAreaPrimitive_Y() {
        return (EAttribute)getGestureAreaPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupPrimitive() {
		if (groupPrimitiveEClass == null) {
			groupPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(80);
		}
		return groupPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_ChildElements() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Group() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_TransformGroup() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Replicate() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Children() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_SwitchNode() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_ClippingContainer() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Rectangle() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Circle() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Ellipse() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Line() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Polyline() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Polygon() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Path() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Image() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_SimpleText() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Arc() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Crown() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_PolarLine() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_PointerArea() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_PointerGestureArea() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_TouchArea() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_GestureArea() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_KeyboardInput() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_ScrollWheelInput() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPrimitive_Compositions() {
        return (EReference)getGroupPrimitive().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupPrimitive_Blocked() {
        return (EAttribute)getGroupPrimitive().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupPrimitive_DrawingPriority() {
        return (EAttribute)getGroupPrimitive().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupPrimitive_Enable() {
        return (EAttribute)getGroupPrimitive().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupPrimitive_Id() {
        return (EAttribute)getGroupPrimitive().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupPrimitive_InheritedBlocked() {
        return (EAttribute)getGroupPrimitive().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupPrimitive_InheritedEnable() {
        return (EAttribute)getGroupPrimitive().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupPrimitive_InheritedVisible() {
        return (EAttribute)getGroupPrimitive().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupPrimitive_Tx() {
        return (EAttribute)getGroupPrimitive().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupPrimitive_Ty() {
        return (EAttribute)getGroupPrimitive().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupPrimitive_Visible() {
        return (EAttribute)getGroupPrimitive().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagePrimitive() {
		if (imagePrimitiveEClass == null) {
			imagePrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(81);
		}
		return imagePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_ChildElements() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Group() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_TransformGroup() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Replicate() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Children() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_SwitchNode() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_ClippingContainer() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Rectangle() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Circle() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Ellipse() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Line() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Polyline() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Polygon() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Path() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Image() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_SimpleText() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Arc() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Crown() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_PolarLine() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_PointerArea() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_PointerGestureArea() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_TouchArea() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_GestureArea() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_KeyboardInput() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_ScrollWheelInput() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagePrimitive_Compositions() {
        return (EReference)getImagePrimitive().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Alignment() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_AspectRatio() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Blocked() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_DrawingPriority() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Enable() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Height() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Id() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_InheritedBlocked() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_InheritedEnable() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_InheritedVisible() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Source() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Visible() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Width() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_X() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePrimitive_Y() {
        return (EAttribute)getImagePrimitive().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportType() {
		if (importTypeEClass == null) {
			importTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(83);
		}
		return importTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportType_File() {
        return (EAttribute)getImportType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceType() {
		if (interfaceTypeEClass == null) {
			interfaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(87);
		}
		return interfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_Import() {
        return (EReference)getInterfaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_Property() {
        return (EReference)getInterfaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_ArrayProperty() {
        return (EReference)getInterfaceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_StructProperty() {
        return (EReference)getInterfaceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_EnumProperty() {
        return (EReference)getInterfaceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_UnionProperty() {
        return (EReference)getInterfaceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_Event() {
        return (EReference)getInterfaceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_ArrayEvent() {
        return (EReference)getInterfaceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_StructEvent() {
        return (EReference)getInterfaceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_EnumEvent() {
        return (EReference)getInterfaceType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_UnionEvent() {
        return (EReference)getInterfaceType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_Operation() {
        return (EReference)getInterfaceType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_PublicFunction() {
        return (EReference)getInterfaceType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyboardInputPrimitive() {
		if (keyboardInputPrimitiveEClass == null) {
			keyboardInputPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(88);
		}
		return keyboardInputPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboardInputPrimitive_Blocked() {
        return (EAttribute)getKeyboardInputPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboardInputPrimitive_Enable() {
        return (EAttribute)getKeyboardInputPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboardInputPrimitive_Focus() {
        return (EAttribute)getKeyboardInputPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboardInputPrimitive_Id() {
        return (EAttribute)getKeyboardInputPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboardInputPrimitive_InheritedBlocked() {
        return (EAttribute)getKeyboardInputPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboardInputPrimitive_InheritedEnable() {
        return (EAttribute)getKeyboardInputPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboardInputPrimitive_InheritedVisible() {
        return (EAttribute)getKeyboardInputPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboardInputPrimitive_NeedFocus() {
        return (EAttribute)getKeyboardInputPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboardInputPrimitive_PassThrough() {
        return (EAttribute)getKeyboardInputPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboardInputPrimitive_Visible() {
        return (EAttribute)getKeyboardInputPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinePrimitive() {
		if (linePrimitiveEClass == null) {
			linePrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(89);
		}
		return linePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_Blocked() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_DrawingPriority() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_Enable() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_Id() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_InheritedBlocked() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_InheritedEnable() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_InheritedVisible() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_Stroke() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_StrokeDasharray() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_StrokeDashoffset() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_StrokeLinecap() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_StrokeLinejoin() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_StrokeMiterlimit() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_StrokeOpacity() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_Strokewidth() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_Visible() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_X1() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_X2() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_Y1() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinePrimitive_Y2() {
        return (EAttribute)getLinePrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineToCommand() {
		if (lineToCommandEClass == null) {
			lineToCommandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(90);
		}
		return lineToCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineToCommand_X() {
        return (EAttribute)getLineToCommand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineToCommand_Y() {
        return (EAttribute)getLineToCommand().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveToCommand() {
		if (moveToCommandEClass == null) {
			moveToCommandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(97);
		}
		return moveToCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveToCommand_X() {
        return (EAttribute)getMoveToCommand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveToCommand_Y() {
        return (EAttribute)getMoveToCommand().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationType() {
		if (operationTypeEClass == null) {
			operationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(105);
		}
		return operationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherArrayEntriesType() {
		if (otherArrayEntriesTypeEClass == null) {
			otherArrayEntriesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(106);
		}
		return otherArrayEntriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherArrayEntriesType_Entry() {
        return (EReference)getOtherArrayEntriesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherArrayEntriesType_OtherEntries() {
        return (EReference)getOtherArrayEntriesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherArrayEntriesType_ArrayEntry() {
        return (EReference)getOtherArrayEntriesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherArrayEntriesType_OtherArrayEntries() {
        return (EReference)getOtherArrayEntriesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherArrayEntriesType_StructEntry() {
        return (EReference)getOtherArrayEntriesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherArrayEntriesType_OtherStructEntries() {
        return (EReference)getOtherArrayEntriesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherArrayEntriesType_UnionEntry() {
        return (EReference)getOtherArrayEntriesType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherArrayEntriesType_OtherUnionEntries() {
        return (EReference)getOtherArrayEntriesType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherArrayEntriesType_MaxNumberOfEntries() {
        return (EAttribute)getOtherArrayEntriesType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherArrayEntriesType_NumberOfEntries() {
        return (EAttribute)getOtherArrayEntriesType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherEntriesType() {
		if (otherEntriesTypeEClass == null) {
			otherEntriesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(107);
		}
		return otherEntriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherEntriesType_Value() {
        return (EAttribute)getOtherEntriesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherStructEntriesType() {
		if (otherStructEntriesTypeEClass == null) {
			otherStructEntriesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(108);
		}
		return otherStructEntriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherStructEntriesType_Field() {
        return (EReference)getOtherStructEntriesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherStructEntriesType_ArrayField() {
        return (EReference)getOtherStructEntriesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherStructEntriesType_StructField() {
        return (EReference)getOtherStructEntriesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherStructEntriesType_EnumField() {
        return (EReference)getOtherStructEntriesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherStructEntriesType_UnionField() {
        return (EReference)getOtherStructEntriesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherUnionEntriesType() {
		if (otherUnionEntriesTypeEClass == null) {
			otherUnionEntriesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(109);
		}
		return otherUnionEntriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherUnionEntriesType_Value() {
        return (EAttribute)getOtherUnionEntriesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherUnionEntriesType_ValueType() {
        return (EAttribute)getOtherUnionEntriesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamType() {
		if (paramTypeEClass == null) {
			paramTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(110);
		}
		return paramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Modality() {
        return (EAttribute)getParamType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Name() {
        return (EAttribute)getParamType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Type() {
        return (EAttribute)getParamType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathArray() {
		if (pathArrayEClass == null) {
			pathArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(111);
		}
		return pathArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathArray_MoveToCommand() {
        return (EReference)getPathArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathArray_ClosePathCommand() {
        return (EReference)getPathArray().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathArray_LineToCommand() {
        return (EReference)getPathArray().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathArray_CubicBezierCurveCommand() {
        return (EReference)getPathArray().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathArray_EllipseArcCurveCommand() {
        return (EReference)getPathArray().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathArray_RelativeMoveToCommand() {
        return (EReference)getPathArray().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathArray_RelativeLineToCommand() {
        return (EReference)getPathArray().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathArray_RelativeClosePathCommand() {
        return (EReference)getPathArray().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathArray_RelativeCubicBezierCurveCommand() {
        return (EReference)getPathArray().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathArray_RelativeEllipseArcCurveCommand() {
        return (EReference)getPathArray().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathPrimitive() {
		if (pathPrimitiveEClass == null) {
			pathPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(112);
		}
		return pathPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathPrimitive_D() {
        return (EReference)getPathPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_Blocked() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_DrawingPriority() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_Enable() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_Fill() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_FillOpacity() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_FillRule() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_Id() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_InheritedBlocked() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_InheritedEnable() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_InheritedVisible() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_Stroke() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_StrokeDasharray() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_StrokeDashoffset() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_StrokeLinecap() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_StrokeLinejoin() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_StrokeMiterlimit() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_StrokeOpacity() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_Strokewidth() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPrimitive_Visible() {
        return (EAttribute)getPathPrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointerAreaPrimitive() {
		if (pointerAreaPrimitiveEClass == null) {
			pointerAreaPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(113);
		}
		return pointerAreaPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_AcceptedButtons() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_Blocked() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_Cursor() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_Enable() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_Height() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_Id() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_InheritedBlocked() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_InheritedEnable() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_InheritedVisible() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_PassThrough() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_PreventStealing() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_TrackOutside() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_Visible() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_Width() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_X() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerAreaPrimitive_Y() {
        return (EAttribute)getPointerAreaPrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointerGestureAreaPrimitive() {
		if (pointerGestureAreaPrimitiveEClass == null) {
			pointerGestureAreaPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(114);
		}
		return pointerGestureAreaPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerGestureAreaPrimitive_AcceptedButtons() {
        return (EAttribute)getPointerGestureAreaPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerGestureAreaPrimitive_AcceptedGesture() {
        return (EAttribute)getPointerGestureAreaPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerGestureAreaPrimitive_Blocked() {
        return (EAttribute)getPointerGestureAreaPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerGestureAreaPrimitive_Cursor() {
        return (EAttribute)getPointerGestureAreaPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerGestureAreaPrimitive_Enable() {
        return (EAttribute)getPointerGestureAreaPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerGestureAreaPrimitive_Height() {
        return (EAttribute)getPointerGestureAreaPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerGestureAreaPrimitive_Id() {
        return (EAttribute)getPointerGestureAreaPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerGestureAreaPrimitive_InheritedBlocked() {
        return (EAttribute)getPointerGestureAreaPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerGestureAreaPrimitive_InheritedEnable() {
        return (EAttribute)getPointerGestureAreaPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerGestureAreaPrimitive_InheritedVisible() {
        return (EAttribute)getPointerGestureAreaPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerGestureAreaPrimitive_TrackOutside() {
        return (EAttribute)getPointerGestureAreaPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerGestureAreaPrimitive_Visible() {
        return (EAttribute)getPointerGestureAreaPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerGestureAreaPrimitive_Width() {
        return (EAttribute)getPointerGestureAreaPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerGestureAreaPrimitive_X() {
        return (EAttribute)getPointerGestureAreaPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerGestureAreaPrimitive_Y() {
        return (EAttribute)getPointerGestureAreaPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointType() {
		if (pointTypeEClass == null) {
			pointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(115);
		}
		return pointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointType_X() {
        return (EAttribute)getPointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointType_Y() {
        return (EAttribute)getPointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolarLineComponent() {
		if (polarLineComponentEClass == null) {
			polarLineComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(116);
		}
		return polarLineComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_Angle() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_Blocked() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_DrawingPriority() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_Enable() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_Id() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_InheritedBlocked() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_InheritedEnable() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_InheritedVisible() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_R() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_Stroke() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_StrokeDasharray() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_StrokeDashoffset() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_StrokeLinecap() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_StrokeLinejoin() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_StrokeMiterlimit() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_StrokeOpacity() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_Strokewidth() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_Visible() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_X1() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarLineComponent_Y1() {
        return (EAttribute)getPolarLineComponent().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonPrimitive() {
		if (polygonPrimitiveEClass == null) {
			polygonPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(117);
		}
		return polygonPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonPrimitive_Points() {
        return (EReference)getPolygonPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_Blocked() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_DrawingPriority() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_Enable() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_Fill() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_FillOpacity() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_FillRule() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_Id() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_InheritedBlocked() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_InheritedEnable() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_InheritedVisible() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_Stroke() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_StrokeDasharray() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_StrokeDashoffset() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_StrokeLinecap() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_StrokeLinejoin() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_StrokeMiterlimit() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_StrokeOpacity() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_Strokewidth() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPrimitive_Visible() {
        return (EAttribute)getPolygonPrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolylinePrimitive() {
		if (polylinePrimitiveEClass == null) {
			polylinePrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(118);
		}
		return polylinePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolylinePrimitive_Points() {
        return (EReference)getPolylinePrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_Blocked() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_DrawingPriority() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_Enable() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_Id() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_InheritedBlocked() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_InheritedEnable() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_InheritedVisible() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_Stroke() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_StrokeDasharray() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_StrokeDashoffset() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_StrokeLinecap() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_StrokeLinejoin() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_StrokeMiterlimit() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_StrokeOpacity() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_Strokewidth() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylinePrimitive_Visible() {
        return (EAttribute)getPolylinePrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionListType() {
		if (positionListTypeEClass == null) {
			positionListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(119);
		}
		return positionListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionListType_Point() {
        return (EReference)getPositionListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivatePropertyType() {
		if (privatePropertyTypeEClass == null) {
			privatePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(124);
		}
		return privatePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivatePropertyType_MaxStringLength() {
        return (EAttribute)getPrivatePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivatePropertyType_Modality() {
        return (EAttribute)getPrivatePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivatePropertyType_Name() {
        return (EAttribute)getPrivatePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivatePropertyType_Type() {
        return (EAttribute)getPrivatePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivatePropertyType_Value() {
        return (EAttribute)getPrivatePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyType() {
		if (propertyTypeEClass == null) {
			propertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(125);
		}
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_MaxStringLength() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Modality() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Name() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Type() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Value() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectPrimitive() {
		if (rectPrimitiveEClass == null) {
			rectPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(127);
		}
		return rectPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_ChildElements() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Group() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_TransformGroup() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Replicate() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Children() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_SwitchNode() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_ClippingContainer() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Rectangle() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Circle() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Ellipse() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Line() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Polyline() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Polygon() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Path() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Image() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_SimpleText() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Arc() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Crown() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_PolarLine() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_PointerArea() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_PointerGestureArea() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_TouchArea() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_GestureArea() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_KeyboardInput() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_ScrollWheelInput() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectPrimitive_Compositions() {
        return (EReference)getRectPrimitive().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Blocked() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_DrawingPriority() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Enable() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Fill() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_FillOpacity() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_FillRule() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Height() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Id() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_InheritedBlocked() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_InheritedEnable() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_InheritedVisible() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Rx() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Ry() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Stroke() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_StrokeDasharray() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_StrokeDashoffset() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_StrokeLinecap() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_StrokeLinejoin() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_StrokeMiterlimit() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_StrokeOpacity() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Strokewidth() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Visible() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Width() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_X() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectPrimitive_Y() {
        return (EAttribute)getRectPrimitive().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeClosePathCommand() {
		if (relativeClosePathCommandEClass == null) {
			relativeClosePathCommandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(128);
		}
		return relativeClosePathCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeCubicBezierCurveCommand() {
		if (relativeCubicBezierCurveCommandEClass == null) {
			relativeCubicBezierCurveCommandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(129);
		}
		return relativeCubicBezierCurveCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeCubicBezierCurveCommand_X() {
        return (EAttribute)getRelativeCubicBezierCurveCommand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeCubicBezierCurveCommand_X1() {
        return (EAttribute)getRelativeCubicBezierCurveCommand().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeCubicBezierCurveCommand_X2() {
        return (EAttribute)getRelativeCubicBezierCurveCommand().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeCubicBezierCurveCommand_Y() {
        return (EAttribute)getRelativeCubicBezierCurveCommand().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeCubicBezierCurveCommand_Y1() {
        return (EAttribute)getRelativeCubicBezierCurveCommand().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeCubicBezierCurveCommand_Y2() {
        return (EAttribute)getRelativeCubicBezierCurveCommand().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeEllipseArcCurveCommand() {
		if (relativeEllipseArcCurveCommandEClass == null) {
			relativeEllipseArcCurveCommandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(130);
		}
		return relativeEllipseArcCurveCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeEllipseArcCurveCommand_Angle() {
        return (EAttribute)getRelativeEllipseArcCurveCommand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeEllipseArcCurveCommand_LargeArcFlag() {
        return (EAttribute)getRelativeEllipseArcCurveCommand().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeEllipseArcCurveCommand_R1() {
        return (EAttribute)getRelativeEllipseArcCurveCommand().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeEllipseArcCurveCommand_R2() {
        return (EAttribute)getRelativeEllipseArcCurveCommand().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeEllipseArcCurveCommand_SweepFlag() {
        return (EAttribute)getRelativeEllipseArcCurveCommand().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeEllipseArcCurveCommand_X() {
        return (EAttribute)getRelativeEllipseArcCurveCommand().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeEllipseArcCurveCommand_Y() {
        return (EAttribute)getRelativeEllipseArcCurveCommand().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeLineToCommand() {
		if (relativeLineToCommandEClass == null) {
			relativeLineToCommandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(131);
		}
		return relativeLineToCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeLineToCommand_X() {
        return (EAttribute)getRelativeLineToCommand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeLineToCommand_Y() {
        return (EAttribute)getRelativeLineToCommand().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeMoveToCommand() {
		if (relativeMoveToCommandEClass == null) {
			relativeMoveToCommandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(132);
		}
		return relativeMoveToCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeMoveToCommand_X() {
        return (EAttribute)getRelativeMoveToCommand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeMoveToCommand_Y() {
        return (EAttribute)getRelativeMoveToCommand().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplicatePrimitive() {
		if (replicatePrimitiveEClass == null) {
			replicatePrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(133);
		}
		return replicatePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_ChildElements() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_Group() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_TransformGroup() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_Replicate() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_Children() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_SwitchNode() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_ClippingContainer() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_Rectangle() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_Circle() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_Ellipse() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_Line() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_Polyline() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_Polygon() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_Path() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_Image() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_SimpleText() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_Arc() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_Crown() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_PolarLine() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_PointerArea() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_PointerGestureArea() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_TouchArea() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_GestureArea() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_KeyboardInput() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_ScrollWheelInput() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicatePrimitive_Compositions() {
        return (EReference)getReplicatePrimitive().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicatePrimitive_Blocked() {
        return (EAttribute)getReplicatePrimitive().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicatePrimitive_Datamodel() {
        return (EAttribute)getReplicatePrimitive().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicatePrimitive_DrawingPriority() {
        return (EAttribute)getReplicatePrimitive().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicatePrimitive_Enable() {
        return (EAttribute)getReplicatePrimitive().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicatePrimitive_FirstIndex() {
        return (EAttribute)getReplicatePrimitive().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicatePrimitive_Id() {
        return (EAttribute)getReplicatePrimitive().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicatePrimitive_IndexAlias() {
        return (EAttribute)getReplicatePrimitive().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicatePrimitive_InheritedBlocked() {
        return (EAttribute)getReplicatePrimitive().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicatePrimitive_InheritedEnable() {
        return (EAttribute)getReplicatePrimitive().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicatePrimitive_InheritedVisible() {
        return (EAttribute)getReplicatePrimitive().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicatePrimitive_InstanceAlias() {
        return (EAttribute)getReplicatePrimitive().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicatePrimitive_MaxNumberOfInstance() {
        return (EAttribute)getReplicatePrimitive().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicatePrimitive_NumberOfInstance() {
        return (EAttribute)getReplicatePrimitive().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicatePrimitive_Visible() {
        return (EAttribute)getReplicatePrimitive().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReverseVideoProperties() {
		if (reverseVideoPropertiesEClass == null) {
			reverseVideoPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(134);
		}
		return reverseVideoPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReverseVideoProperties_Active() {
        return (EAttribute)getReverseVideoProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReverseVideoProperties_AscenderMargin() {
        return (EAttribute)getReverseVideoProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReverseVideoProperties_DescenderMargin() {
        return (EAttribute)getReverseVideoProperties().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReverseVideoProperties_EndMargin() {
        return (EAttribute)getReverseVideoProperties().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReverseVideoProperties_StartMargin() {
        return (EAttribute)getReverseVideoProperties().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrollWheelInputPrimitive() {
		if (scrollWheelInputPrimitiveEClass == null) {
			scrollWheelInputPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(135);
		}
		return scrollWheelInputPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelInputPrimitive_Blocked() {
        return (EAttribute)getScrollWheelInputPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelInputPrimitive_Enable() {
        return (EAttribute)getScrollWheelInputPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelInputPrimitive_Focus() {
        return (EAttribute)getScrollWheelInputPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelInputPrimitive_Id() {
        return (EAttribute)getScrollWheelInputPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelInputPrimitive_InheritedBlocked() {
        return (EAttribute)getScrollWheelInputPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelInputPrimitive_InheritedEnable() {
        return (EAttribute)getScrollWheelInputPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelInputPrimitive_InheritedVisible() {
        return (EAttribute)getScrollWheelInputPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelInputPrimitive_NeedFocus() {
        return (EAttribute)getScrollWheelInputPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelInputPrimitive_PassThrough() {
        return (EAttribute)getScrollWheelInputPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScrollWheelInputPrimitive_Visible() {
        return (EAttribute)getScrollWheelInputPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTextPrimitive() {
		if (simpleTextPrimitiveEClass == null) {
			simpleTextPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(136);
		}
		return simpleTextPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_WordSeparator() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTextPrimitive_ReverseVideo() {
        return (EReference)getSimpleTextPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTextPrimitive_Frame() {
        return (EReference)getSimpleTextPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTextPrimitive_Underline() {
        return (EReference)getSimpleTextPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTextPrimitive_StrikeThrough() {
        return (EReference)getSimpleTextPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_Alignment() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_BackgroundColor() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_BackgroundOpacity() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_Blocked() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_DrawingPriority() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_Enable() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_Fill() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_FillOpacity() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_FlowDirection() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_FontName() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_FontSize() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_Height() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_Id() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_InheritedBlocked() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_InheritedEnable() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_InheritedVisible() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_LineGap() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_MultilineMode() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_TextFlow() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_Value() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_Visible() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_Width() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_X() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextPrimitive_Y() {
        return (EAttribute)getSimpleTextPrimitive().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrikeThroughProperties() {
		if (strikeThroughPropertiesEClass == null) {
			strikeThroughPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(138);
		}
		return strikeThroughPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrikeThroughProperties_Active() {
        return (EAttribute)getStrikeThroughProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrikeThroughProperties_Distance() {
        return (EAttribute)getStrikeThroughProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrikeThroughProperties_StrokeWidth() {
        return (EAttribute)getStrikeThroughProperties().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructDefinitionType() {
		if (structDefinitionTypeEClass == null) {
			structDefinitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(144);
		}
		return structDefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructDefinitionType_FieldDefinition() {
        return (EReference)getStructDefinitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructDefinitionType_StructFieldDefinition() {
        return (EReference)getStructDefinitionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructDefinitionType_ArrayFieldDefinition() {
        return (EReference)getStructDefinitionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructDefinitionType_EnumFieldDefinition() {
        return (EReference)getStructDefinitionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructDefinitionType_UnionFieldDefinition() {
        return (EReference)getStructDefinitionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructEntryType() {
		if (structEntryTypeEClass == null) {
			structEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(145);
		}
		return structEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructEntryType_Field() {
        return (EReference)getStructEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructEntryType_ArrayField() {
        return (EReference)getStructEntryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructEntryType_StructField() {
        return (EReference)getStructEntryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructEntryType_EnumField() {
        return (EReference)getStructEntryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructEntryType_UnionField() {
        return (EReference)getStructEntryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructEntryType_Index() {
        return (EAttribute)getStructEntryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructEventType() {
		if (structEventTypeEClass == null) {
			structEventTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(146);
		}
		return structEventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructEventType_Field() {
        return (EReference)getStructEventType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructEventType_ArrayField() {
        return (EReference)getStructEventType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructEventType_StructField() {
        return (EReference)getStructEventType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructEventType_EnumField() {
        return (EReference)getStructEventType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructEventType_UnionField() {
        return (EReference)getStructEventType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructEventType_Name() {
        return (EAttribute)getStructEventType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructEventType_Type() {
        return (EAttribute)getStructEventType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructFieldType() {
		if (structFieldTypeEClass == null) {
			structFieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(147);
		}
		return structFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructFieldType_Field() {
        return (EReference)getStructFieldType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructFieldType_ArrayField() {
        return (EReference)getStructFieldType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructFieldType_StructField() {
        return (EReference)getStructFieldType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructFieldType_EnumField() {
        return (EReference)getStructFieldType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructFieldType_UnionField() {
        return (EReference)getStructFieldType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructFieldType_Name() {
        return (EAttribute)getStructFieldType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructPropertyType() {
		if (structPropertyTypeEClass == null) {
			structPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(148);
		}
		return structPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructPropertyType_Field() {
        return (EReference)getStructPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructPropertyType_ArrayField() {
        return (EReference)getStructPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructPropertyType_StructField() {
        return (EReference)getStructPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructPropertyType_EnumField() {
        return (EReference)getStructPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructPropertyType_UnionField() {
        return (EReference)getStructPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructPropertyType_Modality() {
        return (EAttribute)getStructPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructPropertyType_Name() {
        return (EAttribute)getStructPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructPropertyType_Type() {
        return (EAttribute)getStructPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchNodePrimitive() {
		if (switchNodePrimitiveEClass == null) {
			switchNodePrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(149);
		}
		return switchNodePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_ChildElements() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_Group() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_TransformGroup() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_Replicate() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_Children() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_SwitchNode() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_ClippingContainer() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_Rectangle() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_Circle() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_Ellipse() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_Line() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_Polyline() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_Polygon() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_Path() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_Image() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_SimpleText() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_Arc() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_Crown() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_PolarLine() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_PointerArea() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_PointerGestureArea() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_TouchArea() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_GestureArea() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_KeyboardInput() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_ScrollWheelInput() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchNodePrimitive_Compositions() {
        return (EReference)getSwitchNodePrimitive().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchNodePrimitive_ActiveChild() {
        return (EAttribute)getSwitchNodePrimitive().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchNodePrimitive_Blocked() {
        return (EAttribute)getSwitchNodePrimitive().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchNodePrimitive_Enable() {
        return (EAttribute)getSwitchNodePrimitive().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchNodePrimitive_Id() {
        return (EAttribute)getSwitchNodePrimitive().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchNodePrimitive_InheritedBlocked() {
        return (EAttribute)getSwitchNodePrimitive().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchNodePrimitive_InheritedEnable() {
        return (EAttribute)getSwitchNodePrimitive().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchNodePrimitive_InheritedVisible() {
        return (EAttribute)getSwitchNodePrimitive().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchNodePrimitive_Visible() {
        return (EAttribute)getSwitchNodePrimitive().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchAreaPrimitive() {
		if (touchAreaPrimitiveEClass == null) {
			touchAreaPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(157);
		}
		return touchAreaPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_Blocked() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_Enable() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_Height() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_Id() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_InheritedBlocked() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_InheritedEnable() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_InheritedVisible() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_MaximumTouchPoints() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_MinimumTouchPoints() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_PassThrough() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_PreventStealing() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_Visible() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_Width() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_X() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchAreaPrimitive_Y() {
        return (EAttribute)getTouchAreaPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformGroupPrimitive() {
		if (transformGroupPrimitiveEClass == null) {
			transformGroupPrimitiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(158);
		}
		return transformGroupPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_ChildElements() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_Transform() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_Group() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_TransformGroup() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_Replicate() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_Children() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_SwitchNode() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_ClippingContainer() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_Rectangle() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_Circle() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_Ellipse() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_Line() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_Polyline() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_Polygon() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_Path() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_Image() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_SimpleText() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_Arc() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_Crown() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_PolarLine() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_PointerArea() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_PointerGestureArea() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_TouchArea() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_GestureArea() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_KeyboardInput() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_ScrollWheelInput() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformGroupPrimitive_Compositions() {
        return (EReference)getTransformGroupPrimitive().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformGroupPrimitive_Blocked() {
        return (EAttribute)getTransformGroupPrimitive().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformGroupPrimitive_DrawingPriority() {
        return (EAttribute)getTransformGroupPrimitive().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformGroupPrimitive_Enable() {
        return (EAttribute)getTransformGroupPrimitive().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformGroupPrimitive_Id() {
        return (EAttribute)getTransformGroupPrimitive().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformGroupPrimitive_InheritedBlocked() {
        return (EAttribute)getTransformGroupPrimitive().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformGroupPrimitive_InheritedEnable() {
        return (EAttribute)getTransformGroupPrimitive().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformGroupPrimitive_InheritedVisible() {
        return (EAttribute)getTransformGroupPrimitive().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformGroupPrimitive_Visible() {
        return (EAttribute)getTransformGroupPrimitive().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformMatrixType() {
		if (transformMatrixTypeEClass == null) {
			transformMatrixTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(159);
		}
		return transformMatrixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformMatrixType_A() {
        return (EAttribute)getTransformMatrixType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformMatrixType_B() {
        return (EAttribute)getTransformMatrixType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformMatrixType_C() {
        return (EAttribute)getTransformMatrixType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformMatrixType_D() {
        return (EAttribute)getTransformMatrixType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformMatrixType_E() {
        return (EAttribute)getTransformMatrixType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformMatrixType_F() {
        return (EAttribute)getTransformMatrixType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformRotateType() {
		if (transformRotateTypeEClass == null) {
			transformRotateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(160);
		}
		return transformRotateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformRotateType_Angle() {
        return (EAttribute)getTransformRotateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformRotateType_Cx() {
        return (EAttribute)getTransformRotateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformRotateType_Cy() {
        return (EAttribute)getTransformRotateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformScaleType() {
		if (transformScaleTypeEClass == null) {
			transformScaleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(161);
		}
		return transformScaleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformScaleType_Sx() {
        return (EAttribute)getTransformScaleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformScaleType_Sy() {
        return (EAttribute)getTransformScaleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformSkewXType() {
		if (transformSkewXTypeEClass == null) {
			transformSkewXTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(162);
		}
		return transformSkewXTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformSkewXType_Angle() {
        return (EAttribute)getTransformSkewXType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformSkewYType() {
		if (transformSkewYTypeEClass == null) {
			transformSkewYTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(163);
		}
		return transformSkewYTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformSkewYType_Angle() {
        return (EAttribute)getTransformSkewYType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformTranslateType() {
		if (transformTranslateTypeEClass == null) {
			transformTranslateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(164);
		}
		return transformTranslateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformTranslateType_Tx() {
        return (EAttribute)getTransformTranslateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformTranslateType_Ty() {
        return (EAttribute)getTransformTranslateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformType() {
		if (transformTypeEClass == null) {
			transformTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(165);
		}
		return transformTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformType_TransformMatrix() {
        return (EReference)getTransformType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformType_TransformTranslate() {
        return (EReference)getTransformType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformType_TransformScale() {
        return (EReference)getTransformType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformType_TransformRotate() {
        return (EReference)getTransformType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformType_TransformSkewX() {
        return (EReference)getTransformType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformType_TransformSkewY() {
        return (EReference)getTransformType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeType() {
		if (treeTypeEClass == null) {
			treeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(166);
		}
		return treeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Group() {
        return (EReference)getTreeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Import() {
        return (EReference)getTreeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Group1() {
        return (EReference)getTreeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_TransformGroup() {
        return (EReference)getTreeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Replicate() {
        return (EReference)getTreeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Children() {
        return (EReference)getTreeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_SwitchNode() {
        return (EReference)getTreeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_ClippingContainer() {
        return (EReference)getTreeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Rectangle() {
        return (EReference)getTreeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Circle() {
        return (EReference)getTreeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Ellipse() {
        return (EReference)getTreeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Line() {
        return (EReference)getTreeType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Polyline() {
        return (EReference)getTreeType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Polygon() {
        return (EReference)getTreeType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Path() {
        return (EReference)getTreeType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Image() {
        return (EReference)getTreeType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_SimpleText() {
        return (EReference)getTreeType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Arc() {
        return (EReference)getTreeType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Crown() {
        return (EReference)getTreeType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_PolarLine() {
        return (EReference)getTreeType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_PointerArea() {
        return (EReference)getTreeType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_PointerGestureArea() {
        return (EReference)getTreeType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_TouchArea() {
        return (EReference)getTreeType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_GestureArea() {
        return (EReference)getTreeType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_KeyboardInput() {
        return (EReference)getTreeType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_ScrollWheelInput() {
        return (EReference)getTreeType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Clock() {
        return (EReference)getTreeType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeType_Compositions() {
        return (EReference)getTreeType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeAlternativeType() {
		if (typeAlternativeTypeEClass == null) {
			typeAlternativeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(167);
		}
		return typeAlternativeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeAlternativeType_MaxStringLength() {
        return (EAttribute)getTypeAlternativeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeAlternativeType_Name() {
        return (EAttribute)getTypeAlternativeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeAlternativeType_Type() {
        return (EAttribute)getTypeAlternativeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinitionAbstractType() {
		if (typeDefinitionAbstractTypeEClass == null) {
			typeDefinitionAbstractTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(168);
		}
		return typeDefinitionAbstractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDefinitionAbstractType_Name() {
        return (EAttribute)getTypeDefinitionAbstractType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnderlineProperties() {
		if (underlinePropertiesEClass == null) {
			underlinePropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(170);
		}
		return underlinePropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnderlineProperties_Active() {
        return (EAttribute)getUnderlineProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnderlineProperties_Distance() {
        return (EAttribute)getUnderlineProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnderlineProperties_StrokeWidth() {
        return (EAttribute)getUnderlineProperties().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionDefinitionType() {
		if (unionDefinitionTypeEClass == null) {
			unionDefinitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(171);
		}
		return unionDefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionDefinitionType_TypeAlternative() {
        return (EReference)getUnionDefinitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionEntryType() {
		if (unionEntryTypeEClass == null) {
			unionEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(172);
		}
		return unionEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionEntryType_Index() {
        return (EAttribute)getUnionEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionEntryType_Value() {
        return (EAttribute)getUnionEntryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionEntryType_ValueType() {
        return (EAttribute)getUnionEntryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionEventType() {
		if (unionEventTypeEClass == null) {
			unionEventTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(173);
		}
		return unionEventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionEventType_Name() {
        return (EAttribute)getUnionEventType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionEventType_Type() {
        return (EAttribute)getUnionEventType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionEventType_Value() {
        return (EAttribute)getUnionEventType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionEventType_ValueType() {
        return (EAttribute)getUnionEventType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionFieldType() {
		if (unionFieldTypeEClass == null) {
			unionFieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(174);
		}
		return unionFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionFieldType_Name() {
        return (EAttribute)getUnionFieldType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionFieldType_Value() {
        return (EAttribute)getUnionFieldType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionFieldType_ValueType() {
        return (EAttribute)getUnionFieldType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionPropertyType() {
		if (unionPropertyTypeEClass == null) {
			unionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(175);
		}
		return unionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionPropertyType_Modality() {
        return (EAttribute)getUnionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionPropertyType_Name() {
        return (EAttribute)getUnionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionPropertyType_Type() {
        return (EAttribute)getUnionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionPropertyType_Value() {
        return (EAttribute)getUnionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionPropertyType_ValueType() {
        return (EAttribute)getUnionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeTypes() {
		if (treeTypesEClass == null) {
			treeTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(183);
		}
		return treeTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClipPathTypes() {
		if (clipPathTypesEClass == null) {
			clipPathTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(184);
		}
		return clipPathTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValue() {
		if (propertyValueEClass == null) {
			propertyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(185);
		}
		return propertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValue_Value() {
        return (EAttribute)getPropertyValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValue_Property() {
        return (EReference)getPropertyValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetComposition() {
		if (widgetCompositionEClass == null) {
			widgetCompositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(186);
		}
		return widgetCompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Representation() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Values() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_ChildElements() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Group() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_TransformGroup() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Replicate() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Children() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_SwitchNode() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_ClippingContainer() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Rectangle() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Circle() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Ellipse() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Line() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Polyline() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Polygon() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Path() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Image() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_SimpleText() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Arc() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Crown() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_PolarLine() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_PointerArea() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_PointerGestureArea() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_TouchArea() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_GestureArea() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_ScrollWheelInput() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_KeyboardInput() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetComposition_Clock() {
        return (EReference)getWidgetComposition().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlignementTypeVal() {
		if (alignementTypeValEEnum == null) {
			alignementTypeValEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(1);
		}
		return alignementTypeValEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlignmentType() {
		if (alignmentTypeEEnum == null) {
			alignmentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(3);
		}
		return alignmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlignmentType1() {
		if (alignmentType1EEnum == null) {
			alignmentType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(4);
		}
		return alignmentType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAspectRatioType1() {
		if (aspectRatioType1EEnum == null) {
			aspectRatioType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(18);
		}
		return aspectRatioType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAspectRatioTypeVal() {
		if (aspectRatioTypeValEEnum == null) {
			aspectRatioTypeValEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(20);
		}
		return aspectRatioTypeValEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanTypeVal() {
		if (booleanTypeValEEnum == null) {
			booleanTypeValEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(24);
		}
		return booleanTypeValEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClipRuleType() {
		if (clipRuleTypeEEnum == null) {
			clipRuleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(31);
		}
		return clipRuleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorReferenceType() {
		if (colorReferenceTypeEEnum == null) {
			colorReferenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(35);
		}
		return colorReferenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFillRuleType1() {
		if (fillRuleType1EEnum == null) {
			fillRuleType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(65);
		}
		return fillRuleType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFillRuleTypeVal() {
		if (fillRuleTypeValEEnum == null) {
			fillRuleTypeValEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(67);
		}
		return fillRuleTypeValEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlowDirectionType() {
		if (flowDirectionTypeEEnum == null) {
			flowDirectionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(69);
		}
		return flowDirectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstantiationModeType() {
		if (instantiationModeTypeEEnum == null) {
			instantiationModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(84);
		}
		return instantiationModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModalityType() {
		if (modalityTypeEEnum == null) {
			modalityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(91);
		}
		return modalityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModalityType1() {
		if (modalityType1EEnum == null) {
			modalityType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(92);
		}
		return modalityType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModalityType2() {
		if (modalityType2EEnum == null) {
			modalityType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(93);
		}
		return modalityType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultilineModeType() {
		if (multilineModeTypeEEnum == null) {
			multilineModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(98);
		}
		return multilineModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStrokeLinecapType() {
		if (strokeLinecapTypeEEnum == null) {
			strokeLinecapTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(140);
		}
		return strokeLinecapTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStrokeLinejoinType() {
		if (strokeLinejoinTypeEEnum == null) {
			strokeLinejoinTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(142);
		}
		return strokeLinejoinTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextFlowType() {
		if (textFlowTypeEEnum == null) {
			textFlowTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(150);
		}
		return textFlowTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityTypeVal() {
		if (visibilityTypeValEEnum == null) {
			visibilityTypeValEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(179);
		}
		return visibilityTypeValEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAlignementType() {
		if (alignementTypeEDataType == null) {
			alignementTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(0);
		}
		return alignementTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAlignementTypeValObject() {
		if (alignementTypeValObjectEDataType == null) {
			alignementTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(2);
		}
		return alignementTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAlignmentTypeObject() {
		if (alignmentTypeObjectEDataType == null) {
			alignmentTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(5);
		}
		return alignmentTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAlignmentTypeObject1() {
		if (alignmentTypeObject1EDataType == null) {
			alignmentTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(6);
		}
		return alignmentTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngleType() {
		if (angleTypeEDataType == null) {
			angleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(7);
		}
		return angleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngleTypeVal() {
		if (angleTypeValEDataType == null) {
			angleTypeValEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(8);
		}
		return angleTypeValEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngleTypeValObject() {
		if (angleTypeValObjectEDataType == null) {
			angleTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(9);
		}
		return angleTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAspectRatioType() {
		if (aspectRatioTypeEDataType == null) {
			aspectRatioTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(17);
		}
		return aspectRatioTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAspectRatioTypeObject() {
		if (aspectRatioTypeObjectEDataType == null) {
			aspectRatioTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(19);
		}
		return aspectRatioTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAspectRatioTypeValObject() {
		if (aspectRatioTypeValObjectEDataType == null) {
			aspectRatioTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(21);
		}
		return aspectRatioTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanType() {
		if (booleanTypeEDataType == null) {
			booleanTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(23);
		}
		return booleanTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanTypeValObject() {
		if (booleanTypeValObjectEDataType == null) {
			booleanTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(25);
		}
		return booleanTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCharacterType() {
		if (characterTypeEDataType == null) {
			characterTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(26);
		}
		return characterTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClipRuleTypeObject() {
		if (clipRuleTypeObjectEDataType == null) {
			clipRuleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(32);
		}
		return clipRuleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorReferenceTypeObject() {
		if (colorReferenceTypeObjectEDataType == null) {
			colorReferenceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(36);
		}
		return colorReferenceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorRGBHEXType() {
		if (colorRGBHEXTypeEDataType == null) {
			colorRGBHEXTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(37);
		}
		return colorRGBHEXTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorRGBRgb255Type() {
		if (colorRGBRgb255TypeEDataType == null) {
			colorRGBRgb255TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(38);
		}
		return colorRGBRgb255TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorRGBRgbPercentType() {
		if (colorRGBRgbPercentTypeEDataType == null) {
			colorRGBRgbPercentTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(39);
		}
		return colorRGBRgbPercentTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorRGBType() {
		if (colorRGBTypeEDataType == null) {
			colorRGBTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(40);
		}
		return colorRGBTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorType() {
		if (colorTypeEDataType == null) {
			colorTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(41);
		}
		return colorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTimeType() {
		if (dateTimeTypeEDataType == null) {
			dateTimeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(48);
		}
		return dateTimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateType() {
		if (dateTypeEDataType == null) {
			dateTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(49);
		}
		return dateTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDistanceType() {
		if (distanceTypeEDataType == null) {
			distanceTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(52);
		}
		return distanceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExpression() {
		if (expressionEDataType == null) {
			expressionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(60);
		}
		return expressionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillRuleType() {
		if (fillRuleTypeEDataType == null) {
			fillRuleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(64);
		}
		return fillRuleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillRuleTypeObject() {
		if (fillRuleTypeObjectEDataType == null) {
			fillRuleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(66);
		}
		return fillRuleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillRuleTypeValObject() {
		if (fillRuleTypeValObjectEDataType == null) {
			fillRuleTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(68);
		}
		return fillRuleTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFlowDirectionTypeObject() {
		if (flowDirectionTypeObjectEDataType == null) {
			flowDirectionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(70);
		}
		return flowDirectionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontType() {
		if (fontTypeEDataType == null) {
			fontTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(71);
		}
		return fontTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFormatStringType() {
		if (formatStringTypeEDataType == null) {
			formatStringTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(72);
		}
		return formatStringTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFormatStringTypeVal() {
		if (formatStringTypeValEDataType == null) {
			formatStringTypeValEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(73);
		}
		return formatStringTypeValEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFrequencyType() {
		if (frequencyTypeEDataType == null) {
			frequencyTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(75);
		}
		return frequencyTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFrequencyTypeVal() {
		if (frequencyTypeValEDataType == null) {
			frequencyTypeValEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(76);
		}
		return frequencyTypeValEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFrequencyTypeValObject() {
		if (frequencyTypeValObjectEDataType == null) {
			frequencyTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(77);
		}
		return frequencyTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImageType() {
		if (imageTypeEDataType == null) {
			imageTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(82);
		}
		return imageTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInstantiationModeTypeObject() {
		if (instantiationModeTypeObjectEDataType == null) {
			instantiationModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(85);
		}
		return instantiationModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntegerType() {
		if (integerTypeEDataType == null) {
			integerTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(86);
		}
		return integerTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModalityTypeObject() {
		if (modalityTypeObjectEDataType == null) {
			modalityTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(94);
		}
		return modalityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModalityTypeObject1() {
		if (modalityTypeObject1EDataType == null) {
			modalityTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(95);
		}
		return modalityTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModalityTypeObject2() {
		if (modalityTypeObject2EDataType == null) {
			modalityTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(96);
		}
		return modalityTypeObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMultilineModeTypeObject() {
		if (multilineModeTypeObjectEDataType == null) {
			multilineModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(99);
		}
		return multilineModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameType() {
		if (nameTypeEDataType == null) {
			nameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(100);
		}
		return nameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObjectType() {
		if (objectTypeEDataType == null) {
			objectTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(101);
		}
		return objectTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOpacityType() {
		if (opacityTypeEDataType == null) {
			opacityTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(102);
		}
		return opacityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOpacityTypeVal() {
		if (opacityTypeValEDataType == null) {
			opacityTypeValEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(103);
		}
		return opacityTypeValEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOpacityTypeValObject() {
		if (opacityTypeValObjectEDataType == null) {
			opacityTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(104);
		}
		return opacityTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositionType() {
		if (positionTypeEDataType == null) {
			positionTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(120);
		}
		return positionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPressureType() {
		if (pressureTypeEDataType == null) {
			pressureTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(121);
		}
		return pressureTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPressureTypeVal() {
		if (pressureTypeValEDataType == null) {
			pressureTypeValEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(122);
		}
		return pressureTypeValEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPressureTypeValObject() {
		if (pressureTypeValObjectEDataType == null) {
			pressureTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(123);
		}
		return pressureTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRealType() {
		if (realTypeEDataType == null) {
			realTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(126);
		}
		return realTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStippleType() {
		if (stippleTypeEDataType == null) {
			stippleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(137);
		}
		return stippleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringType() {
		if (stringTypeEDataType == null) {
			stringTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(139);
		}
		return stringTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStrokeLinecapTypeObject() {
		if (strokeLinecapTypeObjectEDataType == null) {
			strokeLinecapTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(141);
		}
		return strokeLinecapTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStrokeLinejoinTypeObject() {
		if (strokeLinejoinTypeObjectEDataType == null) {
			strokeLinejoinTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(143);
		}
		return strokeLinejoinTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextFlowTypeObject() {
		if (textFlowTypeObjectEDataType == null) {
			textFlowTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(151);
		}
		return textFlowTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeDefaultmillisecondsType() {
		if (timeDefaultmillisecondsTypeEDataType == null) {
			timeDefaultmillisecondsTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(152);
		}
		return timeDefaultmillisecondsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeHoursType() {
		if (timeHoursTypeEDataType == null) {
			timeHoursTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(153);
		}
		return timeHoursTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeMinutesType() {
		if (timeMinutesTypeEDataType == null) {
			timeMinutesTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(154);
		}
		return timeMinutesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeSecondsOrSubsecondsType() {
		if (timeSecondsOrSubsecondsTypeEDataType == null) {
			timeSecondsOrSubsecondsTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(155);
		}
		return timeSecondsOrSubsecondsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeType() {
		if (timeTypeEDataType == null) {
			timeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(156);
		}
		return timeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeType() {
		if (typeTypeEDataType == null) {
			typeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(169);
		}
		return typeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVelocityType() {
		if (velocityTypeEDataType == null) {
			velocityTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(176);
		}
		return velocityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVelocityTypeObject() {
		if (velocityTypeObjectEDataType == null) {
			velocityTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(177);
		}
		return velocityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVisibilityType() {
		if (visibilityTypeEDataType == null) {
			visibilityTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(178);
		}
		return visibilityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVisibilityTypeValObject() {
		if (visibilityTypeValObjectEDataType == null) {
			visibilityTypeValObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(180);
		}
		return visibilityTypeValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getZIndexType() {
		if (zIndexTypeEDataType == null) {
			zIndexTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(181);
		}
		return zIndexTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getZIndexTypeVal() {
		if (zIndexTypeValEDataType == null) {
			zIndexTypeValEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Part2Package.eNS_URI).getEClassifiers().get(182);
		}
		return zIndexTypeValEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part2Factory getPart2Factory() {
		return (Part2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.polarsys.ng661designer.part2." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Part2PackageImpl
