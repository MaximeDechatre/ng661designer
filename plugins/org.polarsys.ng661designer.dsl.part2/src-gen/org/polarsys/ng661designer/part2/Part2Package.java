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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This schema defines the structure of an ARINC 661 component.
 *     	Open points:
 *     	1. base component definition (with default 'id' attribute)
 *     	2. how this base definition works from an interface, representation and behavior point of view
 * This schema defines the definition sub-section of A661 Part 2 language.
 * 
 * 			This Schema defines the build-in types for ARINC 661 Part 2
 * 		
 * This schema defines the color types of A661 Part 2 language.
 * This schema defines the date and time types of A661 Part 2 language.
 * This Schema defines the Definitions type for ARINC 661 Part 2
 * To define a new field consists of defining a name and a type.
 * 		And optionally the maximum size in case of string type use.
 * 		
 * To define a new structure type consists of defining a sequence of one or more fields.
 * 		
 * To define a new enumeration just consists of defining a value and optionally an index.
 * 		
 * To define a new enum type consists of defining a name and the sequence of enumerations.
 * 		
 * To define a new array type consists of defining a name and a type for each entry of the future array.
 * 		The capacity of the array is defined when it will be instantiated for a property.
 * 		When the type requires the definition of the maximum size for one entry (like for arrays of strings), a maxEntrySize attribute shall be set. 
 * 		
 * Inside an union definition, to define an alternative type consists of defining
 * 		the name of the alternative and the associated type.
 * 		When the type requires the definition of the maximum size for one entry (like for arrays of strings), a maxEntrySize attribute shall be set.
 * 		
 * To define a new union type consists of defining a name
 * 		for this union type and the list of alternative types
 * The types definitions section consists of defining a sequence of one or more structures, enums, arrays or unions.
 * 		Inside the definitions section, the names of the structures, enums, arrays and unions shall be unique.
 * 		Inside a structure, the fields names shall be unique.
 * 		Inside an enumerate, the values of the enumerations shall be unique.
 * 		Inside an enumerate, the indexes of the enumerations shall be unique.
 * 		Inside an union, the alternative type names shall be unique.
 * 		Inside an union, the alternative types shall be unique.
 * 		
 * This Schema define the import types used in both definition, interface and tree sections.
 * This schema defines the Interface sub-section of A661 Part 2 language.
 * This Schema defines the Property type and the PrivateProperty type
 * This Schema defines types and attributes used in the interactivity schema and the properties schema. They are element
 * This Schema defines Function, Operation, Clock, Param, Event and all the Event structure types that can be used by a component.
 * This schema defines the Tree sub-section of A661 Part 2 language. Tree is the new name for the Representation sub-section.
 * This Schema contains all the primitives and basic components available in ARINC 661 Part 2
 * This Schema defines all the common capacities for the different primitives provided by ARINC 661 Part 2.
 * This Schema defines all the graphical containers available in ARINC 661 Part 2.
 * This Schema contains all the graphical primitives available in ARINC 661 Part 2.
 * 		This does not include the graphical containers and the graphical basic components. 
 * 		The Path primitive and the Text primitive are defined in other files.
 * 		
 * This Schema defines all the graphical basic components available in ARINC 661 Part 2.
 * This Schema contains all the interaction primitives available in ARINC 661 Part 2
 * This Schema defines the PathPrimitive available in ARINC 661 Part 2
 * This Schema defines the TextPrimitive available in ARINC 661 Part 2
 * This schema defines the Behavior sub-section of A661 Part 2 language.
 * <!-- end-model-doc -->
 * @see org.polarsys.ng661designer.part2.Part2Factory
 * @model kind="package"
 * @generated
 */
public interface Part2Package extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "part2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/NG661Part2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Part2Package eINSTANCE = org.polarsys.ng661designer.part2.impl.Part2PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.TreeTypesImpl <em>Tree Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.TreeTypesImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTreeTypes()
	 * @generated
	 */
	int TREE_TYPES = 95;

	/**
	 * The number of structural features of the '<em>Tree Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tree Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ArcComponentImpl <em>Arc Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ArcComponentImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getArcComponent()
	 * @generated
	 */
	int ARC_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__ANGLE = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__BLOCKED = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__DRAWING_PRIORITY = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__ENABLE = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__FILL = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__FILL_OPACITY = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__FILL_RULE = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__ID = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inbound Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__INBOUND_ANGLE = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__RADIUS = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKE = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKE_DASHARRAY = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKE_DASHOFFSET = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKE_LINECAP = TREE_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKE_LINEJOIN = TREE_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKE_MITERLIMIT = TREE_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKE_OPACITY = TREE_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__STROKEWIDTH = TREE_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__VISIBLE = TREE_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__X = TREE_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT__Y = TREE_TYPES_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Arc Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 24;

	/**
	 * The number of operations of the '<em>Arc Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COMPONENT_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.TypeDefinitionAbstractTypeImpl <em>Type Definition Abstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.TypeDefinitionAbstractTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTypeDefinitionAbstractType()
	 * @generated
	 */
	int TYPE_DEFINITION_ABSTRACT_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_ABSTRACT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type Definition Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type Definition Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_ABSTRACT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ArrayDefinitionTypeImpl <em>Array Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ArrayDefinitionTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getArrayDefinitionType()
	 * @generated
	 */
	int ARRAY_DEFINITION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEFINITION_TYPE__NAME = TYPE_DEFINITION_ABSTRACT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Entry Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEFINITION_TYPE__ENTRY_TYPE = TYPE_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEFINITION_TYPE__MAX_STRING_LENGTH = TYPE_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEFINITION_TYPE_FEATURE_COUNT = TYPE_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEFINITION_TYPE_OPERATION_COUNT = TYPE_DEFINITION_ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ArrayEntryTypeImpl <em>Array Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ArrayEntryTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getArrayEntryType()
	 * @generated
	 */
	int ARRAY_ENTRY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ENTRY_TYPE__ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Other Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ENTRY_TYPE__OTHER_ENTRIES = 1;

	/**
	 * The feature id for the '<em><b>Array Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ENTRY_TYPE__ARRAY_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Other Array Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ENTRY_TYPE__OTHER_ARRAY_ENTRIES = 3;

	/**
	 * The feature id for the '<em><b>Struct Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ENTRY_TYPE__STRUCT_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Other Struct Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ENTRY_TYPE__OTHER_STRUCT_ENTRIES = 5;

	/**
	 * The feature id for the '<em><b>Union Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ENTRY_TYPE__UNION_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Other Union Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ENTRY_TYPE__OTHER_UNION_ENTRIES = 7;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ENTRY_TYPE__INDEX = 8;

	/**
	 * The feature id for the '<em><b>Max Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ENTRY_TYPE__MAX_NUMBER_OF_ENTRIES = 9;

	/**
	 * The feature id for the '<em><b>Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ENTRY_TYPE__NUMBER_OF_ENTRIES = 10;

	/**
	 * The number of structural features of the '<em>Array Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ENTRY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Array Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ENTRY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ArrayEventTypeImpl <em>Array Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ArrayEventTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getArrayEventType()
	 * @generated
	 */
	int ARRAY_EVENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EVENT_TYPE__ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Other Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EVENT_TYPE__OTHER_ENTRIES = 1;

	/**
	 * The feature id for the '<em><b>Array Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EVENT_TYPE__ARRAY_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Other Array Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EVENT_TYPE__OTHER_ARRAY_ENTRIES = 3;

	/**
	 * The feature id for the '<em><b>Struct Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EVENT_TYPE__STRUCT_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Other Struct Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EVENT_TYPE__OTHER_STRUCT_ENTRIES = 5;

	/**
	 * The feature id for the '<em><b>Union Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EVENT_TYPE__UNION_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Other Union Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EVENT_TYPE__OTHER_UNION_ENTRIES = 7;

	/**
	 * The feature id for the '<em><b>Max Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EVENT_TYPE__MAX_NUMBER_OF_ENTRIES = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EVENT_TYPE__NAME = 9;

	/**
	 * The feature id for the '<em><b>Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EVENT_TYPE__NUMBER_OF_ENTRIES = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EVENT_TYPE__TYPE = 11;

	/**
	 * The number of structural features of the '<em>Array Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EVENT_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Array Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EVENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.FieldDefinitionAbstractTypeImpl <em>Field Definition Abstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.FieldDefinitionAbstractTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFieldDefinitionAbstractType()
	 * @generated
	 */
	int FIELD_DEFINITION_ABSTRACT_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_ABSTRACT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Field Definition Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Field Definition Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_ABSTRACT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ArrayFieldDefinitionTypeImpl <em>Array Field Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ArrayFieldDefinitionTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getArrayFieldDefinitionType()
	 * @generated
	 */
	int ARRAY_FIELD_DEFINITION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_DEFINITION_TYPE__NAME = FIELD_DEFINITION_ABSTRACT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Entries Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_DEFINITION_TYPE__ENTRIES_TYPE = FIELD_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_DEFINITION_TYPE__MAX_STRING_LENGTH = FIELD_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Field Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_DEFINITION_TYPE_FEATURE_COUNT = FIELD_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array Field Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_DEFINITION_TYPE_OPERATION_COUNT = FIELD_DEFINITION_ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ArrayFieldTypeImpl <em>Array Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ArrayFieldTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getArrayFieldType()
	 * @generated
	 */
	int ARRAY_FIELD_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_TYPE__ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Other Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_TYPE__OTHER_ENTRIES = 1;

	/**
	 * The feature id for the '<em><b>Array Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_TYPE__ARRAY_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Other Array Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_TYPE__OTHER_ARRAY_ENTRIES = 3;

	/**
	 * The feature id for the '<em><b>Struct Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_TYPE__STRUCT_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Other Struct Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_TYPE__OTHER_STRUCT_ENTRIES = 5;

	/**
	 * The feature id for the '<em><b>Union Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_TYPE__UNION_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Other Union Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_TYPE__OTHER_UNION_ENTRIES = 7;

	/**
	 * The feature id for the '<em><b>Max Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_TYPE__MAX_NUMBER_OF_ENTRIES = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_TYPE__NAME = 9;

	/**
	 * The feature id for the '<em><b>Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_TYPE__NUMBER_OF_ENTRIES = 10;

	/**
	 * The number of structural features of the '<em>Array Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Array Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FIELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ArrayPropertyTypeImpl <em>Array Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ArrayPropertyTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getArrayPropertyType()
	 * @generated
	 */
	int ARRAY_PROPERTY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROPERTY_TYPE__ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Other Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROPERTY_TYPE__OTHER_ENTRIES = 1;

	/**
	 * The feature id for the '<em><b>Array Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROPERTY_TYPE__ARRAY_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Other Array Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROPERTY_TYPE__OTHER_ARRAY_ENTRIES = 3;

	/**
	 * The feature id for the '<em><b>Struct Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROPERTY_TYPE__STRUCT_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Other Struct Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROPERTY_TYPE__OTHER_STRUCT_ENTRIES = 5;

	/**
	 * The feature id for the '<em><b>Union Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROPERTY_TYPE__UNION_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Other Union Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROPERTY_TYPE__OTHER_UNION_ENTRIES = 7;

	/**
	 * The feature id for the '<em><b>Max Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROPERTY_TYPE__MAX_NUMBER_OF_ENTRIES = 8;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROPERTY_TYPE__MODALITY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROPERTY_TYPE__NAME = 10;

	/**
	 * The feature id for the '<em><b>Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROPERTY_TYPE__NUMBER_OF_ENTRIES = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROPERTY_TYPE__TYPE = 12;

	/**
	 * The number of structural features of the '<em>Array Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROPERTY_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Array Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.BehaviorTypeImpl <em>Behavior Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.BehaviorTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getBehaviorType()
	 * @generated
	 */
	int BEHAVIOR_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Scxml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TYPE__SCXML = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TYPE__FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TYPE__PROPERTY = 2;

	/**
	 * The number of structural features of the '<em>Behavior Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Behavior Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ChildPrimitiveImpl <em>Child Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ChildPrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getChildPrimitive()
	 * @generated
	 */
	int CHILD_PRIMITIVE = 8;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__CHILD_ELEMENTS = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__TRANSFORM = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__GROUP = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__TRANSFORM_GROUP = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Replicate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__REPLICATE = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__CHILDREN = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Switch Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__SWITCH_NODE = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Clipping Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__CLIPPING_CONTAINER = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__RECTANGLE = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__CIRCLE = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__ELLIPSE = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__LINE = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__POLYLINE = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__POLYGON = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__PATH = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__IMAGE = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Simple Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__SIMPLE_TEXT = TREE_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__ARC = TREE_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__CROWN = TREE_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__POLAR_LINE = TREE_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__POINTER_AREA = TREE_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Pointer Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__POINTER_GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__TOUCH_AREA = TREE_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__KEYBOARD_INPUT = TREE_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__SCROLL_WHEEL_INPUT = TREE_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__COMPOSITIONS = TREE_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__DRAWING_PRIORITY = TREE_TYPES_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Instantiation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__INSTANTIATION_MODE = TREE_TYPES_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 35;

	/**
	 * The number of structural features of the '<em>Child Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 36;

	/**
	 * The number of operations of the '<em>Child Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ClipPathTypesImpl <em>Clip Path Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ClipPathTypesImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getClipPathTypes()
	 * @generated
	 */
	int CLIP_PATH_TYPES = 96;

	/**
	 * The number of structural features of the '<em>Clip Path Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_TYPES_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clip Path Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_TYPES_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.CirclePrimitiveImpl <em>Circle Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.CirclePrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getCirclePrimitive()
	 * @generated
	 */
	int CIRCLE_PRIMITIVE = 9;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__CHILD_ELEMENTS = CLIP_PATH_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__GROUP = CLIP_PATH_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transform Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__TRANSFORM_GROUP = CLIP_PATH_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Replicate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__REPLICATE = CLIP_PATH_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__CHILDREN = CLIP_PATH_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Switch Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__SWITCH_NODE = CLIP_PATH_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Clipping Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__CLIPPING_CONTAINER = CLIP_PATH_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__RECTANGLE = CLIP_PATH_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__CIRCLE = CLIP_PATH_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__ELLIPSE = CLIP_PATH_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__LINE = CLIP_PATH_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__POLYLINE = CLIP_PATH_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__POLYGON = CLIP_PATH_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__PATH = CLIP_PATH_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__IMAGE = CLIP_PATH_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Simple Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__SIMPLE_TEXT = CLIP_PATH_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__ARC = CLIP_PATH_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__CROWN = CLIP_PATH_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__POLAR_LINE = CLIP_PATH_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__POINTER_AREA = CLIP_PATH_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pointer Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__POINTER_GESTURE_AREA = CLIP_PATH_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__TOUCH_AREA = CLIP_PATH_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__GESTURE_AREA = CLIP_PATH_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__KEYBOARD_INPUT = CLIP_PATH_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__SCROLL_WHEEL_INPUT = CLIP_PATH_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__COMPOSITIONS = CLIP_PATH_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__BLOCKED = CLIP_PATH_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__CX = CLIP_PATH_TYPES_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__CY = CLIP_PATH_TYPES_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__DRAWING_PRIORITY = CLIP_PATH_TYPES_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__ENABLE = CLIP_PATH_TYPES_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__FILL = CLIP_PATH_TYPES_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__FILL_OPACITY = CLIP_PATH_TYPES_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__FILL_RULE = CLIP_PATH_TYPES_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__ID = CLIP_PATH_TYPES_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__INHERITED_BLOCKED = CLIP_PATH_TYPES_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__INHERITED_ENABLE = CLIP_PATH_TYPES_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__INHERITED_VISIBLE = CLIP_PATH_TYPES_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__R = CLIP_PATH_TYPES_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKE = CLIP_PATH_TYPES_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKE_DASHARRAY = CLIP_PATH_TYPES_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKE_DASHOFFSET = CLIP_PATH_TYPES_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKE_LINECAP = CLIP_PATH_TYPES_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKE_LINEJOIN = CLIP_PATH_TYPES_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKE_MITERLIMIT = CLIP_PATH_TYPES_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKE_OPACITY = CLIP_PATH_TYPES_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__STROKEWIDTH = CLIP_PATH_TYPES_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE__VISIBLE = CLIP_PATH_TYPES_FEATURE_COUNT + 47;

	/**
	 * The number of structural features of the '<em>Circle Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE_FEATURE_COUNT = CLIP_PATH_TYPES_FEATURE_COUNT + 48;

	/**
	 * The number of operations of the '<em>Circle Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_PRIMITIVE_OPERATION_COUNT = CLIP_PATH_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ClipPathPrimitiveImpl <em>Clip Path Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ClipPathPrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getClipPathPrimitive()
	 * @generated
	 */
	int CLIP_PATH_PRIMITIVE = 10;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE__RECTANGLE = 0;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE__CIRCLE = 1;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE__ELLIPSE = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE__LINE = 3;

	/**
	 * The feature id for the '<em><b>Closed Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE__CLOSED_PATH = 4;

	/**
	 * The feature id for the '<em><b>Clip Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE__CLIP_RULE = 5;

	/**
	 * The number of structural features of the '<em>Clip Path Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Clip Path Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_PRIMITIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ClippingContainerPrimitiveImpl <em>Clipping Container Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ClippingContainerPrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getClippingContainerPrimitive()
	 * @generated
	 */
	int CLIPPING_CONTAINER_PRIMITIVE = 11;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__CHILD_ELEMENTS = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__CLIP_PATH = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__GROUP = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__TRANSFORM_GROUP = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Replicate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__REPLICATE = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__CHILDREN = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Switch Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__SWITCH_NODE = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Clipping Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__CLIPPING_CONTAINER = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__RECTANGLE = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__CIRCLE = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__ELLIPSE = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__LINE = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__POLYLINE = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__POLYGON = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__PATH = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__IMAGE = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Simple Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__SIMPLE_TEXT = TREE_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__ARC = TREE_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__CROWN = TREE_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__POLAR_LINE = TREE_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__POINTER_AREA = TREE_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Pointer Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__POINTER_GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__TOUCH_AREA = TREE_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__KEYBOARD_INPUT = TREE_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__SCROLL_WHEEL_INPUT = TREE_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__COMPOSITIONS = TREE_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__DRAWING_PRIORITY = TREE_TYPES_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 34;

	/**
	 * The number of structural features of the '<em>Clipping Container Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 35;

	/**
	 * The number of operations of the '<em>Clipping Container Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIPPING_CONTAINER_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ClockTypeImpl <em>Clock Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ClockTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getClockType()
	 * @generated
	 */
	int CLOCK_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TYPE__ID = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TYPE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clock Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TYPE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ClosePathCommandImpl <em>Close Path Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ClosePathCommandImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getClosePathCommand()
	 * @generated
	 */
	int CLOSE_PATH_COMMAND = 13;

	/**
	 * The number of structural features of the '<em>Close Path Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_PATH_COMMAND_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Close Path Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_PATH_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ComponentDefinitionTypeImpl <em>Component Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ComponentDefinitionTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getComponentDefinitionType()
	 * @generated
	 */
	int COMPONENT_DEFINITION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_TYPE__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_TYPE__INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Tree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_TYPE__TREE = 2;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_TYPE__BEHAVIOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_TYPE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Component Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Component Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.CrownComponentImpl <em>Crown Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.CrownComponentImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getCrownComponent()
	 * @generated
	 */
	int CROWN_COMPONENT = 15;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__BLOCKED = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__DRAWING_PRIORITY = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__ENABLE = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__FILL = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__FILL_OPACITY = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__FILL_RULE = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__ID = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Inner Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__INNER_RADIUS = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Outer Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__OUTER_RADIUS = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKE = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKE_DASHARRAY = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKE_DASHOFFSET = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKE_LINECAP = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKE_LINEJOIN = TREE_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKE_MITERLIMIT = TREE_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKE_OPACITY = TREE_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__STROKEWIDTH = TREE_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__VISIBLE = TREE_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__X = TREE_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT__Y = TREE_TYPES_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Crown Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 23;

	/**
	 * The number of operations of the '<em>Crown Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_COMPONENT_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.CubicBezierCurveCommandImpl <em>Cubic Bezier Curve Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.CubicBezierCurveCommandImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getCubicBezierCurveCommand()
	 * @generated
	 */
	int CUBIC_BEZIER_CURVE_COMMAND = 16;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBIC_BEZIER_CURVE_COMMAND__X = 0;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBIC_BEZIER_CURVE_COMMAND__X1 = 1;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBIC_BEZIER_CURVE_COMMAND__X2 = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBIC_BEZIER_CURVE_COMMAND__Y = 3;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBIC_BEZIER_CURVE_COMMAND__Y1 = 4;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBIC_BEZIER_CURVE_COMMAND__Y2 = 5;

	/**
	 * The number of structural features of the '<em>Cubic Bezier Curve Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBIC_BEZIER_CURVE_COMMAND_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Cubic Bezier Curve Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBIC_BEZIER_CURVE_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.CustomIntegerTypeElementTypeImpl <em>Custom Integer Type Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.CustomIntegerTypeElementTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getCustomIntegerTypeElementType()
	 * @generated
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE__MAX = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE__MIN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE__RESOLUTION = 4;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE__UNIT = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Custom Integer Type Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Custom Integer Type Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTEGER_TYPE_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.CustomRealTypeElementTypeImpl <em>Custom Real Type Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.CustomRealTypeElementTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getCustomRealTypeElementType()
	 * @generated
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE__MAX = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE__MIN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE__RESOLUTION = 4;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE__UNIT = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Custom Real Type Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Custom Real Type Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_REAL_TYPE_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.CustomStringTypeElementTypeImpl <em>Custom String Type Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.CustomStringTypeElementTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getCustomStringTypeElementType()
	 * @generated
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE__MAX_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE__MIN_LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE__REGEX = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Custom String Type Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Custom String Type Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STRING_TYPE_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.DefinitionsTypeImpl <em>Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.DefinitionsTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getDefinitionsType()
	 * @generated
	 */
	int DEFINITIONS_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Struct Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__STRUCT_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Enum Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ENUM_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Array Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ARRAY_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Union Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__UNION_DEFINITION = 3;

	/**
	 * The number of structural features of the '<em>Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.DefinitionTypeImpl <em>Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.DefinitionTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getDefinitionType()
	 * @generated
	 */
	int DEFINITION_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE__TYPE_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Property Group Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE__PROPERTY_GROUP_DEFINITION = 2;

	/**
	 * The number of structural features of the '<em>Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.DocumentRootImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 22;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Component Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT_DEFINITION = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.EllipseArcCurveCommandImpl <em>Ellipse Arc Curve Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.EllipseArcCurveCommandImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getEllipseArcCurveCommand()
	 * @generated
	 */
	int ELLIPSE_ARC_CURVE_COMMAND = 23;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_ARC_CURVE_COMMAND__ANGLE = 0;

	/**
	 * The feature id for the '<em><b>Large Arc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_ARC_CURVE_COMMAND__LARGE_ARC_FLAG = 1;

	/**
	 * The feature id for the '<em><b>R1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_ARC_CURVE_COMMAND__R1 = 2;

	/**
	 * The feature id for the '<em><b>R2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_ARC_CURVE_COMMAND__R2 = 3;

	/**
	 * The feature id for the '<em><b>Sweep Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_ARC_CURVE_COMMAND__SWEEP_FLAG = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_ARC_CURVE_COMMAND__X = 5;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_ARC_CURVE_COMMAND__Y = 6;

	/**
	 * The number of structural features of the '<em>Ellipse Arc Curve Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_ARC_CURVE_COMMAND_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Ellipse Arc Curve Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_ARC_CURVE_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.EllipsePrimitiveImpl <em>Ellipse Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.EllipsePrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getEllipsePrimitive()
	 * @generated
	 */
	int ELLIPSE_PRIMITIVE = 24;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__CHILD_ELEMENTS = CLIP_PATH_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__GROUP = CLIP_PATH_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transform Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__TRANSFORM_GROUP = CLIP_PATH_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Replicate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__REPLICATE = CLIP_PATH_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__CHILDREN = CLIP_PATH_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Switch Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__SWITCH_NODE = CLIP_PATH_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Clipping Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__CLIPPING_CONTAINER = CLIP_PATH_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__RECTANGLE = CLIP_PATH_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__CIRCLE = CLIP_PATH_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__ELLIPSE = CLIP_PATH_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__LINE = CLIP_PATH_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__POLYLINE = CLIP_PATH_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__POLYGON = CLIP_PATH_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__PATH = CLIP_PATH_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__IMAGE = CLIP_PATH_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Simple Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__SIMPLE_TEXT = CLIP_PATH_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__ARC = CLIP_PATH_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__CROWN = CLIP_PATH_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__POLAR_LINE = CLIP_PATH_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__POINTER_AREA = CLIP_PATH_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pointer Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__POINTER_GESTURE_AREA = CLIP_PATH_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__TOUCH_AREA = CLIP_PATH_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__GESTURE_AREA = CLIP_PATH_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__KEYBOARD_INPUT = CLIP_PATH_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__SCROLL_WHEEL_INPUT = CLIP_PATH_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__COMPOSITIONS = CLIP_PATH_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__BLOCKED = CLIP_PATH_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__CX = CLIP_PATH_TYPES_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__CY = CLIP_PATH_TYPES_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__DRAWING_PRIORITY = CLIP_PATH_TYPES_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__ENABLE = CLIP_PATH_TYPES_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__FILL = CLIP_PATH_TYPES_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__FILL_OPACITY = CLIP_PATH_TYPES_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__FILL_RULE = CLIP_PATH_TYPES_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__ID = CLIP_PATH_TYPES_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__INHERITED_BLOCKED = CLIP_PATH_TYPES_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__INHERITED_ENABLE = CLIP_PATH_TYPES_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__INHERITED_VISIBLE = CLIP_PATH_TYPES_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__RX = CLIP_PATH_TYPES_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Ry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__RY = CLIP_PATH_TYPES_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKE = CLIP_PATH_TYPES_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKE_DASHARRAY = CLIP_PATH_TYPES_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKE_DASHOFFSET = CLIP_PATH_TYPES_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKE_LINECAP = CLIP_PATH_TYPES_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKE_LINEJOIN = CLIP_PATH_TYPES_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKE_MITERLIMIT = CLIP_PATH_TYPES_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKE_OPACITY = CLIP_PATH_TYPES_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__STROKEWIDTH = CLIP_PATH_TYPES_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE__VISIBLE = CLIP_PATH_TYPES_FEATURE_COUNT + 48;

	/**
	 * The number of structural features of the '<em>Ellipse Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE_FEATURE_COUNT = CLIP_PATH_TYPES_FEATURE_COUNT + 49;

	/**
	 * The number of operations of the '<em>Ellipse Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_PRIMITIVE_OPERATION_COUNT = CLIP_PATH_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.EntryTypeImpl <em>Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.EntryTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getEntryType()
	 * @generated
	 */
	int ENTRY_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.EnumDefinitionTypeImpl <em>Enum Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.EnumDefinitionTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getEnumDefinitionType()
	 * @generated
	 */
	int ENUM_DEFINITION_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEFINITION_TYPE__NAME = TYPE_DEFINITION_ABSTRACT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEFINITION_TYPE__ENUMERATION = TYPE_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEFINITION_TYPE_FEATURE_COUNT = TYPE_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEFINITION_TYPE_OPERATION_COUNT = TYPE_DEFINITION_ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.EnumerationTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getEnumerationType()
	 * @generated
	 */
	int ENUMERATION_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.EventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.EventTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.FieldDefinitionTypeImpl <em>Field Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.FieldDefinitionTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFieldDefinitionType()
	 * @generated
	 */
	int FIELD_DEFINITION_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_TYPE__NAME = FIELD_DEFINITION_ABSTRACT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Max String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_TYPE__MAX_STRING_LENGTH = FIELD_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_TYPE__TYPE = FIELD_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_TYPE_FEATURE_COUNT = FIELD_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_TYPE_OPERATION_COUNT = FIELD_DEFINITION_ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.FieldTypeImpl <em>Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.FieldTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFieldType()
	 * @generated
	 */
	int FIELD_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.FramePropertiesImpl <em>Frame Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.FramePropertiesImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFrameProperties()
	 * @generated
	 */
	int FRAME_PROPERTIES = 32;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_PROPERTIES__ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Ascender Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_PROPERTIES__ASCENDER_MARGIN = 1;

	/**
	 * The feature id for the '<em><b>Descender Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_PROPERTIES__DESCENDER_MARGIN = 2;

	/**
	 * The feature id for the '<em><b>End Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_PROPERTIES__END_MARGIN = 3;

	/**
	 * The feature id for the '<em><b>Start Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_PROPERTIES__START_MARGIN = 4;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_PROPERTIES__STROKE_WIDTH = 5;

	/**
	 * The number of structural features of the '<em>Frame Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_PROPERTIES_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Frame Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.FunctionTypeImpl <em>Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.FunctionTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.GestureAreaPrimitiveImpl <em>Gesture Area Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.GestureAreaPrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getGestureAreaPrimitive()
	 * @generated
	 */
	int GESTURE_AREA_PRIMITIVE = 34;

	/**
	 * The feature id for the '<em><b>Accepted Gesture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__ACCEPTED_GESTURE = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__HEIGHT = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Prevent Stealing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__PREVENT_STEALING = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Track Outside</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__TRACK_OUTSIDE = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__WIDTH = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__X = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE__Y = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Gesture Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Gesture Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTURE_AREA_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.GroupPrimitiveImpl <em>Group Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.GroupPrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getGroupPrimitive()
	 * @generated
	 */
	int GROUP_PRIMITIVE = 35;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__CHILD_ELEMENTS = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__GROUP = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transform Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__TRANSFORM_GROUP = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Replicate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__REPLICATE = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__CHILDREN = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Switch Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__SWITCH_NODE = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Clipping Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__CLIPPING_CONTAINER = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__RECTANGLE = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__CIRCLE = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__ELLIPSE = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__LINE = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__POLYLINE = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__POLYGON = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__PATH = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__IMAGE = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Simple Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__SIMPLE_TEXT = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__ARC = TREE_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__CROWN = TREE_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__POLAR_LINE = TREE_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__POINTER_AREA = TREE_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pointer Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__POINTER_GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__TOUCH_AREA = TREE_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__KEYBOARD_INPUT = TREE_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__SCROLL_WHEEL_INPUT = TREE_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__COMPOSITIONS = TREE_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__DRAWING_PRIORITY = TREE_TYPES_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__TX = TREE_TYPES_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Ty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__TY = TREE_TYPES_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 35;

	/**
	 * The number of structural features of the '<em>Group Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 36;

	/**
	 * The number of operations of the '<em>Group Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ImagePrimitiveImpl <em>Image Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ImagePrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getImagePrimitive()
	 * @generated
	 */
	int IMAGE_PRIMITIVE = 36;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__CHILD_ELEMENTS = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__GROUP = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transform Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__TRANSFORM_GROUP = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Replicate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__REPLICATE = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__CHILDREN = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Switch Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__SWITCH_NODE = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Clipping Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__CLIPPING_CONTAINER = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__RECTANGLE = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__CIRCLE = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__ELLIPSE = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__LINE = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__POLYLINE = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__POLYGON = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__PATH = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__IMAGE = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Simple Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__SIMPLE_TEXT = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__ARC = TREE_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__CROWN = TREE_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__POLAR_LINE = TREE_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__POINTER_AREA = TREE_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pointer Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__POINTER_GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__TOUCH_AREA = TREE_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__KEYBOARD_INPUT = TREE_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__SCROLL_WHEEL_INPUT = TREE_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__COMPOSITIONS = TREE_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__ALIGNMENT = TREE_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__ASPECT_RATIO = TREE_TYPES_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__DRAWING_PRIORITY = TREE_TYPES_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__HEIGHT = TREE_TYPES_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__SOURCE = TREE_TYPES_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__WIDTH = TREE_TYPES_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__X = TREE_TYPES_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE__Y = TREE_TYPES_FEATURE_COUNT + 40;

	/**
	 * The number of structural features of the '<em>Image Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 41;

	/**
	 * The number of operations of the '<em>Image Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ImportTypeImpl <em>Import Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ImportTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getImportType()
	 * @generated
	 */
	int IMPORT_TYPE = 37;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__FILE = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.InterfaceTypeImpl <em>Interface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.InterfaceTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getInterfaceType()
	 * @generated
	 */
	int INTERFACE_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Array Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__ARRAY_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Struct Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__STRUCT_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Enum Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__ENUM_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Union Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__UNION_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__EVENT = 6;

	/**
	 * The feature id for the '<em><b>Array Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__ARRAY_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Struct Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__STRUCT_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Enum Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__ENUM_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Union Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__UNION_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Public Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__PUBLIC_FUNCTION = 12;

	/**
	 * The number of structural features of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.KeyboardInputPrimitiveImpl <em>Keyboard Input Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.KeyboardInputPrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getKeyboardInputPrimitive()
	 * @generated
	 */
	int KEYBOARD_INPUT_PRIMITIVE = 39;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE__FOCUS = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Need Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE__NEED_FOCUS = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pass Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE__PASS_THROUGH = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Keyboard Input Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Keyboard Input Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_INPUT_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.LinePrimitiveImpl <em>Line Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.LinePrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getLinePrimitive()
	 * @generated
	 */
	int LINE_PRIMITIVE = 40;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__BLOCKED = CLIP_PATH_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__DRAWING_PRIORITY = CLIP_PATH_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__ENABLE = CLIP_PATH_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__ID = CLIP_PATH_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__INHERITED_BLOCKED = CLIP_PATH_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__INHERITED_ENABLE = CLIP_PATH_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__INHERITED_VISIBLE = CLIP_PATH_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKE = CLIP_PATH_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKE_DASHARRAY = CLIP_PATH_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKE_DASHOFFSET = CLIP_PATH_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKE_LINECAP = CLIP_PATH_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKE_LINEJOIN = CLIP_PATH_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKE_MITERLIMIT = CLIP_PATH_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKE_OPACITY = CLIP_PATH_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__STROKEWIDTH = CLIP_PATH_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__VISIBLE = CLIP_PATH_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__X1 = CLIP_PATH_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__X2 = CLIP_PATH_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__Y1 = CLIP_PATH_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE__Y2 = CLIP_PATH_TYPES_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Line Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE_FEATURE_COUNT = CLIP_PATH_TYPES_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Line Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PRIMITIVE_OPERATION_COUNT = CLIP_PATH_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.LineToCommandImpl <em>Line To Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.LineToCommandImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getLineToCommand()
	 * @generated
	 */
	int LINE_TO_COMMAND = 41;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TO_COMMAND__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TO_COMMAND__Y = 1;

	/**
	 * The number of structural features of the '<em>Line To Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TO_COMMAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Line To Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TO_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.MoveToCommandImpl <em>Move To Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.MoveToCommandImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getMoveToCommand()
	 * @generated
	 */
	int MOVE_TO_COMMAND = 42;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TO_COMMAND__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TO_COMMAND__Y = 1;

	/**
	 * The number of structural features of the '<em>Move To Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TO_COMMAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Move To Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TO_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.OperationTypeImpl <em>Operation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.OperationTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 43;

	/**
	 * The number of structural features of the '<em>Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.OtherArrayEntriesTypeImpl <em>Other Array Entries Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.OtherArrayEntriesTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getOtherArrayEntriesType()
	 * @generated
	 */
	int OTHER_ARRAY_ENTRIES_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ARRAY_ENTRIES_TYPE__ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Other Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ARRAY_ENTRIES_TYPE__OTHER_ENTRIES = 1;

	/**
	 * The feature id for the '<em><b>Array Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ARRAY_ENTRIES_TYPE__ARRAY_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Other Array Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ARRAY_ENTRIES_TYPE__OTHER_ARRAY_ENTRIES = 3;

	/**
	 * The feature id for the '<em><b>Struct Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ARRAY_ENTRIES_TYPE__STRUCT_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Other Struct Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ARRAY_ENTRIES_TYPE__OTHER_STRUCT_ENTRIES = 5;

	/**
	 * The feature id for the '<em><b>Union Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ARRAY_ENTRIES_TYPE__UNION_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Other Union Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ARRAY_ENTRIES_TYPE__OTHER_UNION_ENTRIES = 7;

	/**
	 * The feature id for the '<em><b>Max Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ARRAY_ENTRIES_TYPE__MAX_NUMBER_OF_ENTRIES = 8;

	/**
	 * The feature id for the '<em><b>Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ARRAY_ENTRIES_TYPE__NUMBER_OF_ENTRIES = 9;

	/**
	 * The number of structural features of the '<em>Other Array Entries Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ARRAY_ENTRIES_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Other Array Entries Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ARRAY_ENTRIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.OtherEntriesTypeImpl <em>Other Entries Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.OtherEntriesTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getOtherEntriesType()
	 * @generated
	 */
	int OTHER_ENTRIES_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ENTRIES_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Other Entries Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ENTRIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Other Entries Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ENTRIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.OtherStructEntriesTypeImpl <em>Other Struct Entries Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.OtherStructEntriesTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getOtherStructEntriesType()
	 * @generated
	 */
	int OTHER_STRUCT_ENTRIES_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_STRUCT_ENTRIES_TYPE__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Array Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_STRUCT_ENTRIES_TYPE__ARRAY_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Struct Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_STRUCT_ENTRIES_TYPE__STRUCT_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Enum Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_STRUCT_ENTRIES_TYPE__ENUM_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Union Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_STRUCT_ENTRIES_TYPE__UNION_FIELD = 4;

	/**
	 * The number of structural features of the '<em>Other Struct Entries Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_STRUCT_ENTRIES_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Other Struct Entries Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_STRUCT_ENTRIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.OtherUnionEntriesTypeImpl <em>Other Union Entries Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.OtherUnionEntriesTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getOtherUnionEntriesType()
	 * @generated
	 */
	int OTHER_UNION_ENTRIES_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_UNION_ENTRIES_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_UNION_ENTRIES_TYPE__VALUE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Other Union Entries Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_UNION_ENTRIES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Other Union Entries Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_UNION_ENTRIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ParamTypeImpl <em>Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ParamTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getParamType()
	 * @generated
	 */
	int PARAM_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__MODALITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.PathArrayImpl <em>Path Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.PathArrayImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPathArray()
	 * @generated
	 */
	int PATH_ARRAY = 49;

	/**
	 * The feature id for the '<em><b>Move To Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ARRAY__MOVE_TO_COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Close Path Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ARRAY__CLOSE_PATH_COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Line To Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ARRAY__LINE_TO_COMMAND = 2;

	/**
	 * The feature id for the '<em><b>Cubic Bezier Curve Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ARRAY__CUBIC_BEZIER_CURVE_COMMAND = 3;

	/**
	 * The feature id for the '<em><b>Ellipse Arc Curve Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ARRAY__ELLIPSE_ARC_CURVE_COMMAND = 4;

	/**
	 * The feature id for the '<em><b>Relative Move To Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ARRAY__RELATIVE_MOVE_TO_COMMAND = 5;

	/**
	 * The feature id for the '<em><b>Relative Line To Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ARRAY__RELATIVE_LINE_TO_COMMAND = 6;

	/**
	 * The feature id for the '<em><b>Relative Close Path Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ARRAY__RELATIVE_CLOSE_PATH_COMMAND = 7;

	/**
	 * The feature id for the '<em><b>Relative Cubic Bezier Curve Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ARRAY__RELATIVE_CUBIC_BEZIER_CURVE_COMMAND = 8;

	/**
	 * The feature id for the '<em><b>Relative Ellipse Arc Curve Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ARRAY__RELATIVE_ELLIPSE_ARC_CURVE_COMMAND = 9;

	/**
	 * The number of structural features of the '<em>Path Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ARRAY_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Path Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.PathPrimitiveImpl <em>Path Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.PathPrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPathPrimitive()
	 * @generated
	 */
	int PATH_PRIMITIVE = 50;

	/**
	 * The feature id for the '<em><b>D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__D = CLIP_PATH_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__BLOCKED = CLIP_PATH_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__DRAWING_PRIORITY = CLIP_PATH_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__ENABLE = CLIP_PATH_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__FILL = CLIP_PATH_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__FILL_OPACITY = CLIP_PATH_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__FILL_RULE = CLIP_PATH_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__ID = CLIP_PATH_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__INHERITED_BLOCKED = CLIP_PATH_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__INHERITED_ENABLE = CLIP_PATH_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__INHERITED_VISIBLE = CLIP_PATH_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKE = CLIP_PATH_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKE_DASHARRAY = CLIP_PATH_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKE_DASHOFFSET = CLIP_PATH_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKE_LINECAP = CLIP_PATH_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKE_LINEJOIN = CLIP_PATH_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKE_MITERLIMIT = CLIP_PATH_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKE_OPACITY = CLIP_PATH_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__STROKEWIDTH = CLIP_PATH_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE__VISIBLE = CLIP_PATH_TYPES_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Path Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE_FEATURE_COUNT = CLIP_PATH_TYPES_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Path Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PRIMITIVE_OPERATION_COUNT = CLIP_PATH_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.PointerAreaPrimitiveImpl <em>Pointer Area Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.PointerAreaPrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPointerAreaPrimitive()
	 * @generated
	 */
	int POINTER_AREA_PRIMITIVE = 51;

	/**
	 * The feature id for the '<em><b>Accepted Buttons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__ACCEPTED_BUTTONS = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__CURSOR = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__HEIGHT = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pass Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__PASS_THROUGH = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Prevent Stealing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__PREVENT_STEALING = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Track Outside</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__TRACK_OUTSIDE = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__WIDTH = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__X = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE__Y = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Pointer Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Pointer Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_AREA_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.PointerGestureAreaPrimitiveImpl <em>Pointer Gesture Area Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.PointerGestureAreaPrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPointerGestureAreaPrimitive()
	 * @generated
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE = 52;

	/**
	 * The feature id for the '<em><b>Accepted Buttons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE__ACCEPTED_BUTTONS = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accepted Gesture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE__ACCEPTED_GESTURE = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE__CURSOR = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE__HEIGHT = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Track Outside</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE__TRACK_OUTSIDE = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE__WIDTH = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE__X = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE__Y = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Pointer Gesture Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Pointer Gesture Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_GESTURE_AREA_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.PointTypeImpl <em>Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.PointTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPointType()
	 * @generated
	 */
	int POINT_TYPE = 53;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__Y = 1;

	/**
	 * The number of structural features of the '<em>Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.PolarLineComponentImpl <em>Polar Line Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.PolarLineComponentImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPolarLineComponent()
	 * @generated
	 */
	int POLAR_LINE_COMPONENT = 54;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__ANGLE = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__BLOCKED = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__DRAWING_PRIORITY = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__ENABLE = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__ID = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__R = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKE = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKE_DASHARRAY = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKE_DASHOFFSET = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKE_LINECAP = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKE_LINEJOIN = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKE_MITERLIMIT = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKE_OPACITY = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__STROKEWIDTH = TREE_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__VISIBLE = TREE_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__X1 = TREE_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT__Y1 = TREE_TYPES_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Polar Line Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Polar Line Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_LINE_COMPONENT_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.PolygonPrimitiveImpl <em>Polygon Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.PolygonPrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPolygonPrimitive()
	 * @generated
	 */
	int POLYGON_PRIMITIVE = 55;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__POINTS = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__DRAWING_PRIORITY = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__FILL = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__FILL_OPACITY = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__FILL_RULE = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKE = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKE_DASHARRAY = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKE_DASHOFFSET = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKE_LINECAP = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKE_LINEJOIN = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKE_MITERLIMIT = TREE_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKE_OPACITY = TREE_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__STROKEWIDTH = TREE_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Polygon Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Polygon Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl <em>Polyline Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPolylinePrimitive()
	 * @generated
	 */
	int POLYLINE_PRIMITIVE = 56;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__POINTS = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__DRAWING_PRIORITY = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKE = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKE_DASHARRAY = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKE_DASHOFFSET = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKE_LINECAP = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKE_LINEJOIN = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKE_MITERLIMIT = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKE_OPACITY = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__STROKEWIDTH = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Polyline Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Polyline Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.PositionListTypeImpl <em>Position List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.PositionListTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPositionListType()
	 * @generated
	 */
	int POSITION_LIST_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_LIST_TYPE__POINT = 0;

	/**
	 * The number of structural features of the '<em>Position List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Position List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.PrivatePropertyTypeImpl <em>Private Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.PrivatePropertyTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPrivatePropertyType()
	 * @generated
	 */
	int PRIVATE_PROPERTY_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Max String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PROPERTY_TYPE__MAX_STRING_LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PROPERTY_TYPE__MODALITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PROPERTY_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PROPERTY_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PROPERTY_TYPE__VALUE = 4;

	/**
	 * The number of structural features of the '<em>Private Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PROPERTY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Private Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.PropertyTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Max String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__MAX_STRING_LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__MODALITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 4;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.RectPrimitiveImpl <em>Rect Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.RectPrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getRectPrimitive()
	 * @generated
	 */
	int RECT_PRIMITIVE = 60;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__CHILD_ELEMENTS = CLIP_PATH_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__GROUP = CLIP_PATH_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transform Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__TRANSFORM_GROUP = CLIP_PATH_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Replicate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__REPLICATE = CLIP_PATH_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__CHILDREN = CLIP_PATH_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Switch Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__SWITCH_NODE = CLIP_PATH_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Clipping Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__CLIPPING_CONTAINER = CLIP_PATH_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__RECTANGLE = CLIP_PATH_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__CIRCLE = CLIP_PATH_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__ELLIPSE = CLIP_PATH_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__LINE = CLIP_PATH_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__POLYLINE = CLIP_PATH_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__POLYGON = CLIP_PATH_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__PATH = CLIP_PATH_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__IMAGE = CLIP_PATH_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Simple Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__SIMPLE_TEXT = CLIP_PATH_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__ARC = CLIP_PATH_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__CROWN = CLIP_PATH_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__POLAR_LINE = CLIP_PATH_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__POINTER_AREA = CLIP_PATH_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pointer Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__POINTER_GESTURE_AREA = CLIP_PATH_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__TOUCH_AREA = CLIP_PATH_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__GESTURE_AREA = CLIP_PATH_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__KEYBOARD_INPUT = CLIP_PATH_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__SCROLL_WHEEL_INPUT = CLIP_PATH_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__COMPOSITIONS = CLIP_PATH_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__BLOCKED = CLIP_PATH_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__DRAWING_PRIORITY = CLIP_PATH_TYPES_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__ENABLE = CLIP_PATH_TYPES_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__FILL = CLIP_PATH_TYPES_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__FILL_OPACITY = CLIP_PATH_TYPES_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__FILL_RULE = CLIP_PATH_TYPES_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__HEIGHT = CLIP_PATH_TYPES_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__ID = CLIP_PATH_TYPES_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__INHERITED_BLOCKED = CLIP_PATH_TYPES_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__INHERITED_ENABLE = CLIP_PATH_TYPES_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__INHERITED_VISIBLE = CLIP_PATH_TYPES_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__RX = CLIP_PATH_TYPES_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Ry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__RY = CLIP_PATH_TYPES_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKE = CLIP_PATH_TYPES_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKE_DASHARRAY = CLIP_PATH_TYPES_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Stroke Dashoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKE_DASHOFFSET = CLIP_PATH_TYPES_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKE_LINECAP = CLIP_PATH_TYPES_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKE_LINEJOIN = CLIP_PATH_TYPES_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Stroke Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKE_MITERLIMIT = CLIP_PATH_TYPES_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKE_OPACITY = CLIP_PATH_TYPES_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__STROKEWIDTH = CLIP_PATH_TYPES_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__VISIBLE = CLIP_PATH_TYPES_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__WIDTH = CLIP_PATH_TYPES_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__X = CLIP_PATH_TYPES_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE__Y = CLIP_PATH_TYPES_FEATURE_COUNT + 50;

	/**
	 * The number of structural features of the '<em>Rect Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE_FEATURE_COUNT = CLIP_PATH_TYPES_FEATURE_COUNT + 51;

	/**
	 * The number of operations of the '<em>Rect Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_PRIMITIVE_OPERATION_COUNT = CLIP_PATH_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.RelativeClosePathCommandImpl <em>Relative Close Path Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.RelativeClosePathCommandImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getRelativeClosePathCommand()
	 * @generated
	 */
	int RELATIVE_CLOSE_PATH_COMMAND = 61;

	/**
	 * The number of structural features of the '<em>Relative Close Path Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CLOSE_PATH_COMMAND_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Relative Close Path Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CLOSE_PATH_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.RelativeCubicBezierCurveCommandImpl <em>Relative Cubic Bezier Curve Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.RelativeCubicBezierCurveCommandImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getRelativeCubicBezierCurveCommand()
	 * @generated
	 */
	int RELATIVE_CUBIC_BEZIER_CURVE_COMMAND = 62;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_BEZIER_CURVE_COMMAND__X = 0;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_BEZIER_CURVE_COMMAND__X1 = 1;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_BEZIER_CURVE_COMMAND__X2 = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_BEZIER_CURVE_COMMAND__Y = 3;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_BEZIER_CURVE_COMMAND__Y1 = 4;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_BEZIER_CURVE_COMMAND__Y2 = 5;

	/**
	 * The number of structural features of the '<em>Relative Cubic Bezier Curve Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_BEZIER_CURVE_COMMAND_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Relative Cubic Bezier Curve Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_BEZIER_CURVE_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.RelativeEllipseArcCurveCommandImpl <em>Relative Ellipse Arc Curve Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.RelativeEllipseArcCurveCommandImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getRelativeEllipseArcCurveCommand()
	 * @generated
	 */
	int RELATIVE_ELLIPSE_ARC_CURVE_COMMAND = 63;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ELLIPSE_ARC_CURVE_COMMAND__ANGLE = 0;

	/**
	 * The feature id for the '<em><b>Large Arc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ELLIPSE_ARC_CURVE_COMMAND__LARGE_ARC_FLAG = 1;

	/**
	 * The feature id for the '<em><b>R1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ELLIPSE_ARC_CURVE_COMMAND__R1 = 2;

	/**
	 * The feature id for the '<em><b>R2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ELLIPSE_ARC_CURVE_COMMAND__R2 = 3;

	/**
	 * The feature id for the '<em><b>Sweep Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ELLIPSE_ARC_CURVE_COMMAND__SWEEP_FLAG = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ELLIPSE_ARC_CURVE_COMMAND__X = 5;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ELLIPSE_ARC_CURVE_COMMAND__Y = 6;

	/**
	 * The number of structural features of the '<em>Relative Ellipse Arc Curve Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ELLIPSE_ARC_CURVE_COMMAND_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Relative Ellipse Arc Curve Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_ELLIPSE_ARC_CURVE_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.RelativeLineToCommandImpl <em>Relative Line To Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.RelativeLineToCommandImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getRelativeLineToCommand()
	 * @generated
	 */
	int RELATIVE_LINE_TO_COMMAND = 64;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LINE_TO_COMMAND__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LINE_TO_COMMAND__Y = 1;

	/**
	 * The number of structural features of the '<em>Relative Line To Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LINE_TO_COMMAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relative Line To Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LINE_TO_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.RelativeMoveToCommandImpl <em>Relative Move To Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.RelativeMoveToCommandImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getRelativeMoveToCommand()
	 * @generated
	 */
	int RELATIVE_MOVE_TO_COMMAND = 65;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_MOVE_TO_COMMAND__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_MOVE_TO_COMMAND__Y = 1;

	/**
	 * The number of structural features of the '<em>Relative Move To Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_MOVE_TO_COMMAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relative Move To Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_MOVE_TO_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ReplicatePrimitiveImpl <em>Replicate Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ReplicatePrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getReplicatePrimitive()
	 * @generated
	 */
	int REPLICATE_PRIMITIVE = 66;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__CHILD_ELEMENTS = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__GROUP = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transform Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__TRANSFORM_GROUP = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Replicate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__REPLICATE = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__CHILDREN = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Switch Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__SWITCH_NODE = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Clipping Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__CLIPPING_CONTAINER = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__RECTANGLE = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__CIRCLE = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__ELLIPSE = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__LINE = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__POLYLINE = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__POLYGON = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__PATH = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__IMAGE = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Simple Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__SIMPLE_TEXT = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__ARC = TREE_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__CROWN = TREE_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__POLAR_LINE = TREE_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__POINTER_AREA = TREE_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pointer Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__POINTER_GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__TOUCH_AREA = TREE_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__KEYBOARD_INPUT = TREE_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__SCROLL_WHEEL_INPUT = TREE_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__COMPOSITIONS = TREE_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__DATAMODEL = TREE_TYPES_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__DRAWING_PRIORITY = TREE_TYPES_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>First Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__FIRST_INDEX = TREE_TYPES_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Index Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__INDEX_ALIAS = TREE_TYPES_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Instance Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__INSTANCE_ALIAS = TREE_TYPES_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Max Number Of Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__MAX_NUMBER_OF_INSTANCE = TREE_TYPES_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Number Of Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__NUMBER_OF_INSTANCE = TREE_TYPES_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 39;

	/**
	 * The number of structural features of the '<em>Replicate Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 40;

	/**
	 * The number of operations of the '<em>Replicate Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATE_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ReverseVideoPropertiesImpl <em>Reverse Video Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ReverseVideoPropertiesImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getReverseVideoProperties()
	 * @generated
	 */
	int REVERSE_VIDEO_PROPERTIES = 67;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_VIDEO_PROPERTIES__ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Ascender Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_VIDEO_PROPERTIES__ASCENDER_MARGIN = 1;

	/**
	 * The feature id for the '<em><b>Descender Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_VIDEO_PROPERTIES__DESCENDER_MARGIN = 2;

	/**
	 * The feature id for the '<em><b>End Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_VIDEO_PROPERTIES__END_MARGIN = 3;

	/**
	 * The feature id for the '<em><b>Start Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_VIDEO_PROPERTIES__START_MARGIN = 4;

	/**
	 * The number of structural features of the '<em>Reverse Video Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_VIDEO_PROPERTIES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Reverse Video Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_VIDEO_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.ScrollWheelInputPrimitiveImpl <em>Scroll Wheel Input Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.ScrollWheelInputPrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getScrollWheelInputPrimitive()
	 * @generated
	 */
	int SCROLL_WHEEL_INPUT_PRIMITIVE = 68;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_INPUT_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_INPUT_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_INPUT_PRIMITIVE__FOCUS = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_INPUT_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_INPUT_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_INPUT_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_INPUT_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Need Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_INPUT_PRIMITIVE__NEED_FOCUS = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pass Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_INPUT_PRIMITIVE__PASS_THROUGH = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_INPUT_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Scroll Wheel Input Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_INPUT_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Scroll Wheel Input Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_WHEEL_INPUT_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl <em>Simple Text Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.SimpleTextPrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getSimpleTextPrimitive()
	 * @generated
	 */
	int SIMPLE_TEXT_PRIMITIVE = 69;

	/**
	 * The feature id for the '<em><b>Word Separator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__WORD_SEPARATOR = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reverse Video</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__REVERSE_VIDEO = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__FRAME = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__UNDERLINE = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Strike Through</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__STRIKE_THROUGH = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__ALIGNMENT = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__BACKGROUND_COLOR = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Background Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__BACKGROUND_OPACITY = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__DRAWING_PRIORITY = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__FILL = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__FILL_OPACITY = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Flow Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__FLOW_DIRECTION = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__FONT_NAME = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__FONT_SIZE = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__HEIGHT = TREE_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Line Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__LINE_GAP = TREE_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Multiline Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__MULTILINE_MODE = TREE_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Text Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__TEXT_FLOW = TREE_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__VALUE = TREE_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__WIDTH = TREE_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__X = TREE_TYPES_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE__Y = TREE_TYPES_FEATURE_COUNT + 28;

	/**
	 * The number of structural features of the '<em>Simple Text Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 29;

	/**
	 * The number of operations of the '<em>Simple Text Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXT_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.StrikeThroughPropertiesImpl <em>Strike Through Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.StrikeThroughPropertiesImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getStrikeThroughProperties()
	 * @generated
	 */
	int STRIKE_THROUGH_PROPERTIES = 70;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_THROUGH_PROPERTIES__ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_THROUGH_PROPERTIES__DISTANCE = 1;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_THROUGH_PROPERTIES__STROKE_WIDTH = 2;

	/**
	 * The number of structural features of the '<em>Strike Through Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_THROUGH_PROPERTIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Strike Through Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_THROUGH_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.StructDefinitionTypeImpl <em>Struct Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.StructDefinitionTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getStructDefinitionType()
	 * @generated
	 */
	int STRUCT_DEFINITION_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION_TYPE__NAME = TYPE_DEFINITION_ABSTRACT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Field Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION_TYPE__FIELD_DEFINITION = TYPE_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Struct Field Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION_TYPE__STRUCT_FIELD_DEFINITION = TYPE_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Array Field Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION_TYPE__ARRAY_FIELD_DEFINITION = TYPE_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enum Field Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION_TYPE__ENUM_FIELD_DEFINITION = TYPE_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Union Field Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION_TYPE__UNION_FIELD_DEFINITION = TYPE_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Struct Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION_TYPE_FEATURE_COUNT = TYPE_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Struct Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION_TYPE_OPERATION_COUNT = TYPE_DEFINITION_ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.StructEntryTypeImpl <em>Struct Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.StructEntryTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getStructEntryType()
	 * @generated
	 */
	int STRUCT_ENTRY_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ENTRY_TYPE__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Array Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ENTRY_TYPE__ARRAY_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Struct Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ENTRY_TYPE__STRUCT_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Enum Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ENTRY_TYPE__ENUM_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Union Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ENTRY_TYPE__UNION_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ENTRY_TYPE__INDEX = 5;

	/**
	 * The number of structural features of the '<em>Struct Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ENTRY_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Struct Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ENTRY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.StructEventTypeImpl <em>Struct Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.StructEventTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getStructEventType()
	 * @generated
	 */
	int STRUCT_EVENT_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_EVENT_TYPE__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Array Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_EVENT_TYPE__ARRAY_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Struct Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_EVENT_TYPE__STRUCT_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Enum Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_EVENT_TYPE__ENUM_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Union Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_EVENT_TYPE__UNION_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_EVENT_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_EVENT_TYPE__TYPE = 6;

	/**
	 * The number of structural features of the '<em>Struct Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_EVENT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Struct Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_EVENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.StructFieldTypeImpl <em>Struct Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.StructFieldTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getStructFieldType()
	 * @generated
	 */
	int STRUCT_FIELD_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FIELD_TYPE__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Array Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FIELD_TYPE__ARRAY_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Struct Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FIELD_TYPE__STRUCT_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Enum Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FIELD_TYPE__ENUM_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Union Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FIELD_TYPE__UNION_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FIELD_TYPE__NAME = 5;

	/**
	 * The number of structural features of the '<em>Struct Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FIELD_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Struct Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FIELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.StructPropertyTypeImpl <em>Struct Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.StructPropertyTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getStructPropertyType()
	 * @generated
	 */
	int STRUCT_PROPERTY_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_PROPERTY_TYPE__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Array Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_PROPERTY_TYPE__ARRAY_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Struct Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_PROPERTY_TYPE__STRUCT_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Enum Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_PROPERTY_TYPE__ENUM_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Union Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_PROPERTY_TYPE__UNION_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_PROPERTY_TYPE__MODALITY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_PROPERTY_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_PROPERTY_TYPE__TYPE = 7;

	/**
	 * The number of structural features of the '<em>Struct Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_PROPERTY_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Struct Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.SwitchNodePrimitiveImpl <em>Switch Node Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.SwitchNodePrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getSwitchNodePrimitive()
	 * @generated
	 */
	int SWITCH_NODE_PRIMITIVE = 76;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__CHILD_ELEMENTS = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__GROUP = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transform Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__TRANSFORM_GROUP = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Replicate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__REPLICATE = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__CHILDREN = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Switch Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__SWITCH_NODE = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Clipping Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__CLIPPING_CONTAINER = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__RECTANGLE = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__CIRCLE = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__ELLIPSE = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__LINE = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__POLYLINE = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__POLYGON = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__PATH = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__IMAGE = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Simple Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__SIMPLE_TEXT = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__ARC = TREE_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__CROWN = TREE_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__POLAR_LINE = TREE_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__POINTER_AREA = TREE_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pointer Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__POINTER_GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__TOUCH_AREA = TREE_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__KEYBOARD_INPUT = TREE_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__SCROLL_WHEEL_INPUT = TREE_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__COMPOSITIONS = TREE_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Active Child</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__ACTIVE_CHILD = TREE_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 33;

	/**
	 * The number of structural features of the '<em>Switch Node Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 34;

	/**
	 * The number of operations of the '<em>Switch Node Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl <em>Touch Area Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.TouchAreaPrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTouchAreaPrimitive()
	 * @generated
	 */
	int TOUCH_AREA_PRIMITIVE = 77;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__HEIGHT = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Maximum Touch Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__MAXIMUM_TOUCH_POINTS = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Minimum Touch Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__MINIMUM_TOUCH_POINTS = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pass Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__PASS_THROUGH = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Prevent Stealing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__PREVENT_STEALING = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__WIDTH = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__X = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE__Y = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Touch Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Touch Area Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_AREA_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.TransformGroupPrimitiveImpl <em>Transform Group Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.TransformGroupPrimitiveImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTransformGroupPrimitive()
	 * @generated
	 */
	int TRANSFORM_GROUP_PRIMITIVE = 78;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__CHILD_ELEMENTS = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__TRANSFORM = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__GROUP = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__TRANSFORM_GROUP = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Replicate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__REPLICATE = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__CHILDREN = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Switch Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__SWITCH_NODE = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Clipping Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__CLIPPING_CONTAINER = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__RECTANGLE = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__CIRCLE = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__ELLIPSE = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__LINE = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__POLYLINE = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__POLYGON = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__PATH = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__IMAGE = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Simple Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__SIMPLE_TEXT = TREE_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__ARC = TREE_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__CROWN = TREE_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__POLAR_LINE = TREE_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__POINTER_AREA = TREE_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Pointer Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__POINTER_GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__TOUCH_AREA = TREE_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__KEYBOARD_INPUT = TREE_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__SCROLL_WHEEL_INPUT = TREE_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__COMPOSITIONS = TREE_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__BLOCKED = TREE_TYPES_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Drawing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__DRAWING_PRIORITY = TREE_TYPES_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__ENABLE = TREE_TYPES_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__ID = TREE_TYPES_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Inherited Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__INHERITED_BLOCKED = TREE_TYPES_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Inherited Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__INHERITED_ENABLE = TREE_TYPES_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Inherited Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__INHERITED_VISIBLE = TREE_TYPES_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE__VISIBLE = TREE_TYPES_FEATURE_COUNT + 34;

	/**
	 * The number of structural features of the '<em>Transform Group Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 35;

	/**
	 * The number of operations of the '<em>Transform Group Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_GROUP_PRIMITIVE_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.TransformMatrixTypeImpl <em>Transform Matrix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.TransformMatrixTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTransformMatrixType()
	 * @generated
	 */
	int TRANSFORM_MATRIX_TYPE = 79;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_MATRIX_TYPE__A = 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_MATRIX_TYPE__B = 1;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_MATRIX_TYPE__C = 2;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_MATRIX_TYPE__D = 3;

	/**
	 * The feature id for the '<em><b>E</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_MATRIX_TYPE__E = 4;

	/**
	 * The feature id for the '<em><b>F</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_MATRIX_TYPE__F = 5;

	/**
	 * The number of structural features of the '<em>Transform Matrix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_MATRIX_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Transform Matrix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_MATRIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.TransformRotateTypeImpl <em>Transform Rotate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.TransformRotateTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTransformRotateType()
	 * @generated
	 */
	int TRANSFORM_ROTATE_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_ROTATE_TYPE__ANGLE = 0;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_ROTATE_TYPE__CX = 1;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_ROTATE_TYPE__CY = 2;

	/**
	 * The number of structural features of the '<em>Transform Rotate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_ROTATE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transform Rotate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_ROTATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.TransformScaleTypeImpl <em>Transform Scale Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.TransformScaleTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTransformScaleType()
	 * @generated
	 */
	int TRANSFORM_SCALE_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Sx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_SCALE_TYPE__SX = 0;

	/**
	 * The feature id for the '<em><b>Sy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_SCALE_TYPE__SY = 1;

	/**
	 * The number of structural features of the '<em>Transform Scale Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_SCALE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transform Scale Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_SCALE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.TransformSkewXTypeImpl <em>Transform Skew XType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.TransformSkewXTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTransformSkewXType()
	 * @generated
	 */
	int TRANSFORM_SKEW_XTYPE = 82;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_SKEW_XTYPE__ANGLE = 0;

	/**
	 * The number of structural features of the '<em>Transform Skew XType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_SKEW_XTYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transform Skew XType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_SKEW_XTYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.TransformSkewYTypeImpl <em>Transform Skew YType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.TransformSkewYTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTransformSkewYType()
	 * @generated
	 */
	int TRANSFORM_SKEW_YTYPE = 83;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_SKEW_YTYPE__ANGLE = 0;

	/**
	 * The number of structural features of the '<em>Transform Skew YType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_SKEW_YTYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transform Skew YType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_SKEW_YTYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.TransformTranslateTypeImpl <em>Transform Translate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.TransformTranslateTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTransformTranslateType()
	 * @generated
	 */
	int TRANSFORM_TRANSLATE_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TRANSLATE_TYPE__TX = 0;

	/**
	 * The feature id for the '<em><b>Ty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TRANSLATE_TYPE__TY = 1;

	/**
	 * The number of structural features of the '<em>Transform Translate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TRANSLATE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transform Translate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TRANSLATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.TransformTypeImpl <em>Transform Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.TransformTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTransformType()
	 * @generated
	 */
	int TRANSFORM_TYPE = 85;

	/**
	 * The feature id for the '<em><b>Transform Matrix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__TRANSFORM_MATRIX = 0;

	/**
	 * The feature id for the '<em><b>Transform Translate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__TRANSFORM_TRANSLATE = 1;

	/**
	 * The feature id for the '<em><b>Transform Scale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__TRANSFORM_SCALE = 2;

	/**
	 * The feature id for the '<em><b>Transform Rotate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__TRANSFORM_ROTATE = 3;

	/**
	 * The feature id for the '<em><b>Transform Skew X</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__TRANSFORM_SKEW_X = 4;

	/**
	 * The feature id for the '<em><b>Transform Skew Y</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__TRANSFORM_SKEW_Y = 5;

	/**
	 * The number of structural features of the '<em>Transform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Transform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.TreeTypeImpl <em>Tree Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.TreeTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTreeType()
	 * @generated
	 */
	int TREE_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__GROUP1 = 2;

	/**
	 * The feature id for the '<em><b>Transform Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__TRANSFORM_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Replicate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__REPLICATE = 4;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__CHILDREN = 5;

	/**
	 * The feature id for the '<em><b>Switch Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__SWITCH_NODE = 6;

	/**
	 * The feature id for the '<em><b>Clipping Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__CLIPPING_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__RECTANGLE = 8;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__CIRCLE = 9;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__ELLIPSE = 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__LINE = 11;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__POLYLINE = 12;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__POLYGON = 13;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__PATH = 14;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__IMAGE = 15;

	/**
	 * The feature id for the '<em><b>Simple Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__SIMPLE_TEXT = 16;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__ARC = 17;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__CROWN = 18;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__POLAR_LINE = 19;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__POINTER_AREA = 20;

	/**
	 * The feature id for the '<em><b>Pointer Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__POINTER_GESTURE_AREA = 21;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__TOUCH_AREA = 22;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__GESTURE_AREA = 23;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__KEYBOARD_INPUT = 24;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__SCROLL_WHEEL_INPUT = 25;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__CLOCK = 26;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE__COMPOSITIONS = 27;

	/**
	 * The number of structural features of the '<em>Tree Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE_FEATURE_COUNT = 28;

	/**
	 * The number of operations of the '<em>Tree Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.TypeAlternativeTypeImpl <em>Type Alternative Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.TypeAlternativeTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTypeAlternativeType()
	 * @generated
	 */
	int TYPE_ALTERNATIVE_TYPE = 87;

	/**
	 * The feature id for the '<em><b>Max String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALTERNATIVE_TYPE__MAX_STRING_LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALTERNATIVE_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALTERNATIVE_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Type Alternative Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALTERNATIVE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Type Alternative Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALTERNATIVE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.UnderlinePropertiesImpl <em>Underline Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.UnderlinePropertiesImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getUnderlineProperties()
	 * @generated
	 */
	int UNDERLINE_PROPERTIES = 89;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_PROPERTIES__ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_PROPERTIES__DISTANCE = 1;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_PROPERTIES__STROKE_WIDTH = 2;

	/**
	 * The number of structural features of the '<em>Underline Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_PROPERTIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Underline Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.UnionDefinitionTypeImpl <em>Union Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.UnionDefinitionTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getUnionDefinitionType()
	 * @generated
	 */
	int UNION_DEFINITION_TYPE = 90;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DEFINITION_TYPE__NAME = TYPE_DEFINITION_ABSTRACT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type Alternative</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DEFINITION_TYPE__TYPE_ALTERNATIVE = TYPE_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Union Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DEFINITION_TYPE_FEATURE_COUNT = TYPE_DEFINITION_ABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Union Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DEFINITION_TYPE_OPERATION_COUNT = TYPE_DEFINITION_ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.UnionEntryTypeImpl <em>Union Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.UnionEntryTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getUnionEntryType()
	 * @generated
	 */
	int UNION_ENTRY_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_ENTRY_TYPE__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_ENTRY_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_ENTRY_TYPE__VALUE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Union Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_ENTRY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Union Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_ENTRY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.UnionEventTypeImpl <em>Union Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.UnionEventTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getUnionEventType()
	 * @generated
	 */
	int UNION_EVENT_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_EVENT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_EVENT_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_EVENT_TYPE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_EVENT_TYPE__VALUE_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Union Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_EVENT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Union Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_EVENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.UnionFieldTypeImpl <em>Union Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.UnionFieldTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getUnionFieldType()
	 * @generated
	 */
	int UNION_FIELD_TYPE = 93;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FIELD_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FIELD_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FIELD_TYPE__VALUE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Union Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FIELD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Union Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FIELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.UnionPropertyTypeImpl <em>Union Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.UnionPropertyTypeImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getUnionPropertyType()
	 * @generated
	 */
	int UNION_PROPERTY_TYPE = 94;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_PROPERTY_TYPE__MODALITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_PROPERTY_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_PROPERTY_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_PROPERTY_TYPE__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_PROPERTY_TYPE__VALUE_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Union Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_PROPERTY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Union Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.PropertyValueImpl <em>Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.PropertyValueImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPropertyValue()
	 * @generated
	 */
	int PROPERTY_VALUE = 97;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl <em>Widget Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.WidgetCompositionImpl
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getWidgetComposition()
	 * @generated
	 */
	int WIDGET_COMPOSITION = 98;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__REPRESENTATION = TREE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__VALUES = TREE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__CHILD_ELEMENTS = TREE_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__GROUP = TREE_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__TRANSFORM_GROUP = TREE_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Replicate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__REPLICATE = TREE_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__CHILDREN = TREE_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Switch Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__SWITCH_NODE = TREE_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Clipping Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__CLIPPING_CONTAINER = TREE_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__RECTANGLE = TREE_TYPES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__CIRCLE = TREE_TYPES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__ELLIPSE = TREE_TYPES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__LINE = TREE_TYPES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__POLYLINE = TREE_TYPES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__POLYGON = TREE_TYPES_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__PATH = TREE_TYPES_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__IMAGE = TREE_TYPES_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Simple Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__SIMPLE_TEXT = TREE_TYPES_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__ARC = TREE_TYPES_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Crown</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__CROWN = TREE_TYPES_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Polar Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__POLAR_LINE = TREE_TYPES_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Pointer Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__POINTER_AREA = TREE_TYPES_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Pointer Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__POINTER_GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Touch Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__TOUCH_AREA = TREE_TYPES_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Gesture Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__GESTURE_AREA = TREE_TYPES_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Scroll Wheel Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__SCROLL_WHEEL_INPUT = TREE_TYPES_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Keyboard Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__KEYBOARD_INPUT = TREE_TYPES_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION__CLOCK = TREE_TYPES_FEATURE_COUNT + 27;

	/**
	 * The number of structural features of the '<em>Widget Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION_FEATURE_COUNT = TREE_TYPES_FEATURE_COUNT + 28;

	/**
	 * The number of operations of the '<em>Widget Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMPOSITION_OPERATION_COUNT = TREE_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.AlignementTypeVal <em>Alignement Type Val</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.AlignementTypeVal
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getAlignementTypeVal()
	 * @generated
	 */
	int ALIGNEMENT_TYPE_VAL = 99;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.AlignmentType <em>Alignment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.AlignmentType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getAlignmentType()
	 * @generated
	 */
	int ALIGNMENT_TYPE = 100;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.AlignmentType1 <em>Alignment Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.AlignmentType1
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getAlignmentType1()
	 * @generated
	 */
	int ALIGNMENT_TYPE1 = 101;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.AspectRatioType1 <em>Aspect Ratio Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.AspectRatioType1
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getAspectRatioType1()
	 * @generated
	 */
	int ASPECT_RATIO_TYPE1 = 102;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.AspectRatioTypeVal <em>Aspect Ratio Type Val</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.AspectRatioTypeVal
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getAspectRatioTypeVal()
	 * @generated
	 */
	int ASPECT_RATIO_TYPE_VAL = 103;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.BooleanTypeVal <em>Boolean Type Val</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.BooleanTypeVal
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getBooleanTypeVal()
	 * @generated
	 */
	int BOOLEAN_TYPE_VAL = 104;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.ClipRuleType <em>Clip Rule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.ClipRuleType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getClipRuleType()
	 * @generated
	 */
	int CLIP_RULE_TYPE = 105;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.ColorReferenceType <em>Color Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.ColorReferenceType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getColorReferenceType()
	 * @generated
	 */
	int COLOR_REFERENCE_TYPE = 106;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.FillRuleType1 <em>Fill Rule Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.FillRuleType1
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFillRuleType1()
	 * @generated
	 */
	int FILL_RULE_TYPE1 = 107;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.FillRuleTypeVal <em>Fill Rule Type Val</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.FillRuleTypeVal
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFillRuleTypeVal()
	 * @generated
	 */
	int FILL_RULE_TYPE_VAL = 108;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.FlowDirectionType <em>Flow Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.FlowDirectionType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFlowDirectionType()
	 * @generated
	 */
	int FLOW_DIRECTION_TYPE = 109;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.InstantiationModeType <em>Instantiation Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.InstantiationModeType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getInstantiationModeType()
	 * @generated
	 */
	int INSTANTIATION_MODE_TYPE = 110;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.ModalityType <em>Modality Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.ModalityType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getModalityType()
	 * @generated
	 */
	int MODALITY_TYPE = 111;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.ModalityType1 <em>Modality Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.ModalityType1
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getModalityType1()
	 * @generated
	 */
	int MODALITY_TYPE1 = 112;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.ModalityType2 <em>Modality Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.ModalityType2
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getModalityType2()
	 * @generated
	 */
	int MODALITY_TYPE2 = 113;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.MultilineModeType <em>Multiline Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.MultilineModeType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getMultilineModeType()
	 * @generated
	 */
	int MULTILINE_MODE_TYPE = 114;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.StrokeLinecapType <em>Stroke Linecap Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.StrokeLinecapType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getStrokeLinecapType()
	 * @generated
	 */
	int STROKE_LINECAP_TYPE = 115;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.StrokeLinejoinType <em>Stroke Linejoin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.StrokeLinejoinType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getStrokeLinejoinType()
	 * @generated
	 */
	int STROKE_LINEJOIN_TYPE = 116;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.TextFlowType <em>Text Flow Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.TextFlowType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTextFlowType()
	 * @generated
	 */
	int TEXT_FLOW_TYPE = 117;

	/**
	 * The meta object id for the '{@link org.polarsys.ng661designer.part2.VisibilityTypeVal <em>Visibility Type Val</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.VisibilityTypeVal
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getVisibilityTypeVal()
	 * @generated
	 */
	int VISIBILITY_TYPE_VAL = 118;

	/**
	 * The meta object id for the '<em>Alignement Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getAlignementType()
	 * @generated
	 */
	int ALIGNEMENT_TYPE = 119;

	/**
	 * The meta object id for the '<em>Alignement Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.AlignementTypeVal
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getAlignementTypeValObject()
	 * @generated
	 */
	int ALIGNEMENT_TYPE_VAL_OBJECT = 120;

	/**
	 * The meta object id for the '<em>Alignment Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.AlignmentType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getAlignmentTypeObject()
	 * @generated
	 */
	int ALIGNMENT_TYPE_OBJECT = 121;

	/**
	 * The meta object id for the '<em>Alignment Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.AlignmentType1
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getAlignmentTypeObject1()
	 * @generated
	 */
	int ALIGNMENT_TYPE_OBJECT1 = 122;

	/**
	 * The meta object id for the '<em>Angle Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getAngleType()
	 * @generated
	 */
	int ANGLE_TYPE = 123;

	/**
	 * The meta object id for the '<em>Angle Type Val</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getAngleTypeVal()
	 * @generated
	 */
	int ANGLE_TYPE_VAL = 124;

	/**
	 * The meta object id for the '<em>Angle Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getAngleTypeValObject()
	 * @generated
	 */
	int ANGLE_TYPE_VAL_OBJECT = 125;

	/**
	 * The meta object id for the '<em>Aspect Ratio Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getAspectRatioType()
	 * @generated
	 */
	int ASPECT_RATIO_TYPE = 126;

	/**
	 * The meta object id for the '<em>Aspect Ratio Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.AspectRatioType1
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getAspectRatioTypeObject()
	 * @generated
	 */
	int ASPECT_RATIO_TYPE_OBJECT = 127;

	/**
	 * The meta object id for the '<em>Aspect Ratio Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.AspectRatioTypeVal
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getAspectRatioTypeValObject()
	 * @generated
	 */
	int ASPECT_RATIO_TYPE_VAL_OBJECT = 128;

	/**
	 * The meta object id for the '<em>Boolean Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 129;

	/**
	 * The meta object id for the '<em>Boolean Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.BooleanTypeVal
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getBooleanTypeValObject()
	 * @generated
	 */
	int BOOLEAN_TYPE_VAL_OBJECT = 130;

	/**
	 * The meta object id for the '<em>Character Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getCharacterType()
	 * @generated
	 */
	int CHARACTER_TYPE = 131;

	/**
	 * The meta object id for the '<em>Clip Rule Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.ClipRuleType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getClipRuleTypeObject()
	 * @generated
	 */
	int CLIP_RULE_TYPE_OBJECT = 132;

	/**
	 * The meta object id for the '<em>Color Reference Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.ColorReferenceType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getColorReferenceTypeObject()
	 * @generated
	 */
	int COLOR_REFERENCE_TYPE_OBJECT = 133;

	/**
	 * The meta object id for the '<em>Color RGBHEX Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getColorRGBHEXType()
	 * @generated
	 */
	int COLOR_RGBHEX_TYPE = 134;

	/**
	 * The meta object id for the '<em>Color RGB Rgb255 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getColorRGBRgb255Type()
	 * @generated
	 */
	int COLOR_RGB_RGB255_TYPE = 135;

	/**
	 * The meta object id for the '<em>Color RGB Rgb Percent Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getColorRGBRgbPercentType()
	 * @generated
	 */
	int COLOR_RGB_RGB_PERCENT_TYPE = 136;

	/**
	 * The meta object id for the '<em>Color RGB Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getColorRGBType()
	 * @generated
	 */
	int COLOR_RGB_TYPE = 137;

	/**
	 * The meta object id for the '<em>Color Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getColorType()
	 * @generated
	 */
	int COLOR_TYPE = 138;

	/**
	 * The meta object id for the '<em>Date Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getDateTimeType()
	 * @generated
	 */
	int DATE_TIME_TYPE = 139;

	/**
	 * The meta object id for the '<em>Date Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 140;

	/**
	 * The meta object id for the '<em>Distance Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getDistanceType()
	 * @generated
	 */
	int DISTANCE_TYPE = 141;

	/**
	 * The meta object id for the '<em>Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 142;

	/**
	 * The meta object id for the '<em>Fill Rule Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFillRuleType()
	 * @generated
	 */
	int FILL_RULE_TYPE = 143;

	/**
	 * The meta object id for the '<em>Fill Rule Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.FillRuleType1
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFillRuleTypeObject()
	 * @generated
	 */
	int FILL_RULE_TYPE_OBJECT = 144;

	/**
	 * The meta object id for the '<em>Fill Rule Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.FillRuleTypeVal
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFillRuleTypeValObject()
	 * @generated
	 */
	int FILL_RULE_TYPE_VAL_OBJECT = 145;

	/**
	 * The meta object id for the '<em>Flow Direction Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.FlowDirectionType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFlowDirectionTypeObject()
	 * @generated
	 */
	int FLOW_DIRECTION_TYPE_OBJECT = 146;

	/**
	 * The meta object id for the '<em>Font Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFontType()
	 * @generated
	 */
	int FONT_TYPE = 147;

	/**
	 * The meta object id for the '<em>Format String Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFormatStringType()
	 * @generated
	 */
	int FORMAT_STRING_TYPE = 148;

	/**
	 * The meta object id for the '<em>Format String Type Val</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFormatStringTypeVal()
	 * @generated
	 */
	int FORMAT_STRING_TYPE_VAL = 149;

	/**
	 * The meta object id for the '<em>Frequency Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFrequencyType()
	 * @generated
	 */
	int FREQUENCY_TYPE = 150;

	/**
	 * The meta object id for the '<em>Frequency Type Val</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFrequencyTypeVal()
	 * @generated
	 */
	int FREQUENCY_TYPE_VAL = 151;

	/**
	 * The meta object id for the '<em>Frequency Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getFrequencyTypeValObject()
	 * @generated
	 */
	int FREQUENCY_TYPE_VAL_OBJECT = 152;

	/**
	 * The meta object id for the '<em>Image Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getImageType()
	 * @generated
	 */
	int IMAGE_TYPE = 153;

	/**
	 * The meta object id for the '<em>Instantiation Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.InstantiationModeType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getInstantiationModeTypeObject()
	 * @generated
	 */
	int INSTANTIATION_MODE_TYPE_OBJECT = 154;

	/**
	 * The meta object id for the '<em>Integer Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 155;

	/**
	 * The meta object id for the '<em>Modality Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.ModalityType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getModalityTypeObject()
	 * @generated
	 */
	int MODALITY_TYPE_OBJECT = 156;

	/**
	 * The meta object id for the '<em>Modality Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.ModalityType1
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getModalityTypeObject1()
	 * @generated
	 */
	int MODALITY_TYPE_OBJECT1 = 157;

	/**
	 * The meta object id for the '<em>Modality Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.ModalityType2
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getModalityTypeObject2()
	 * @generated
	 */
	int MODALITY_TYPE_OBJECT2 = 158;

	/**
	 * The meta object id for the '<em>Multiline Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.MultilineModeType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getMultilineModeTypeObject()
	 * @generated
	 */
	int MULTILINE_MODE_TYPE_OBJECT = 159;

	/**
	 * The meta object id for the '<em>Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 160;

	/**
	 * The meta object id for the '<em>Object Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 161;

	/**
	 * The meta object id for the '<em>Opacity Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getOpacityType()
	 * @generated
	 */
	int OPACITY_TYPE = 162;

	/**
	 * The meta object id for the '<em>Opacity Type Val</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getOpacityTypeVal()
	 * @generated
	 */
	int OPACITY_TYPE_VAL = 163;

	/**
	 * The meta object id for the '<em>Opacity Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getOpacityTypeValObject()
	 * @generated
	 */
	int OPACITY_TYPE_VAL_OBJECT = 164;

	/**
	 * The meta object id for the '<em>Position Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPositionType()
	 * @generated
	 */
	int POSITION_TYPE = 165;

	/**
	 * The meta object id for the '<em>Pressure Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPressureType()
	 * @generated
	 */
	int PRESSURE_TYPE = 166;

	/**
	 * The meta object id for the '<em>Pressure Type Val</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPressureTypeVal()
	 * @generated
	 */
	int PRESSURE_TYPE_VAL = 167;

	/**
	 * The meta object id for the '<em>Pressure Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getPressureTypeValObject()
	 * @generated
	 */
	int PRESSURE_TYPE_VAL_OBJECT = 168;

	/**
	 * The meta object id for the '<em>Real Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getRealType()
	 * @generated
	 */
	int REAL_TYPE = 169;

	/**
	 * The meta object id for the '<em>Stipple Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getStippleType()
	 * @generated
	 */
	int STIPPLE_TYPE = 170;

	/**
	 * The meta object id for the '<em>String Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 171;

	/**
	 * The meta object id for the '<em>Stroke Linecap Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.StrokeLinecapType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getStrokeLinecapTypeObject()
	 * @generated
	 */
	int STROKE_LINECAP_TYPE_OBJECT = 172;

	/**
	 * The meta object id for the '<em>Stroke Linejoin Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.StrokeLinejoinType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getStrokeLinejoinTypeObject()
	 * @generated
	 */
	int STROKE_LINEJOIN_TYPE_OBJECT = 173;

	/**
	 * The meta object id for the '<em>Text Flow Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.TextFlowType
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTextFlowTypeObject()
	 * @generated
	 */
	int TEXT_FLOW_TYPE_OBJECT = 174;

	/**
	 * The meta object id for the '<em>Time Defaultmilliseconds Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTimeDefaultmillisecondsType()
	 * @generated
	 */
	int TIME_DEFAULTMILLISECONDS_TYPE = 175;

	/**
	 * The meta object id for the '<em>Time Hours Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTimeHoursType()
	 * @generated
	 */
	int TIME_HOURS_TYPE = 176;

	/**
	 * The meta object id for the '<em>Time Minutes Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTimeMinutesType()
	 * @generated
	 */
	int TIME_MINUTES_TYPE = 177;

	/**
	 * The meta object id for the '<em>Time Seconds Or Subseconds Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTimeSecondsOrSubsecondsType()
	 * @generated
	 */
	int TIME_SECONDS_OR_SUBSECONDS_TYPE = 178;

	/**
	 * The meta object id for the '<em>Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTimeType()
	 * @generated
	 */
	int TIME_TYPE = 179;

	/**
	 * The meta object id for the '<em>Type Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 180;

	/**
	 * The meta object id for the '<em>Velocity Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getVelocityType()
	 * @generated
	 */
	int VELOCITY_TYPE = 181;

	/**
	 * The meta object id for the '<em>Velocity Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getVelocityTypeObject()
	 * @generated
	 */
	int VELOCITY_TYPE_OBJECT = 182;

	/**
	 * The meta object id for the '<em>Visibility Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getVisibilityType()
	 * @generated
	 */
	int VISIBILITY_TYPE = 183;

	/**
	 * The meta object id for the '<em>Visibility Type Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.ng661designer.part2.VisibilityTypeVal
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getVisibilityTypeValObject()
	 * @generated
	 */
	int VISIBILITY_TYPE_VAL_OBJECT = 184;

	/**
	 * The meta object id for the '<em>ZIndex Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getZIndexType()
	 * @generated
	 */
	int ZINDEX_TYPE = 185;

	/**
	 * The meta object id for the '<em>ZIndex Type Val</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.polarsys.ng661designer.part2.impl.Part2PackageImpl#getZIndexTypeVal()
	 * @generated
	 */
	int ZINDEX_TYPE_VAL = 186;


	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ArcComponent <em>Arc Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Component</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent
	 * @generated
	 */
	EClass getArcComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getAngle()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Angle();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getBlocked()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getDrawingPriority()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getEnable()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getFill()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getFillOpacity()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getFillRule()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getId()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getInboundAngle <em>Inbound Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inbound Angle</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getInboundAngle()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_InboundAngle();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getInheritedBlocked()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getInheritedEnable()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getInheritedVisible()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getRadius()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Radius();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getStroke()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getStrokeDasharray()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getStrokeDashoffset()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getStrokeLinecap()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getStrokeLinejoin()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getStrokeMiterlimit()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getStrokeOpacity()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getStrokewidth()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getVisible()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getX()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArcComponent#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.ArcComponent#getY()
	 * @see #getArcComponent()
	 * @generated
	 */
	EAttribute getArcComponent_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ArrayDefinitionType <em>Array Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Definition Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayDefinitionType
	 * @generated
	 */
	EClass getArrayDefinitionType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayDefinitionType#getEntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayDefinitionType#getEntryType()
	 * @see #getArrayDefinitionType()
	 * @generated
	 */
	EAttribute getArrayDefinitionType_EntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayDefinitionType#getMaxStringLength <em>Max String Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max String Length</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayDefinitionType#getMaxStringLength()
	 * @see #getArrayDefinitionType()
	 * @generated
	 */
	EAttribute getArrayDefinitionType_MaxStringLength();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ArrayEntryType <em>Array Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Entry Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEntryType
	 * @generated
	 */
	EClass getArrayEntryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayEntryType#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEntryType#getEntry()
	 * @see #getArrayEntryType()
	 * @generated
	 */
	EReference getArrayEntryType_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayEntryType#getOtherEntries <em>Other Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEntryType#getOtherEntries()
	 * @see #getArrayEntryType()
	 * @generated
	 */
	EReference getArrayEntryType_OtherEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayEntryType#getArrayEntry <em>Array Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEntryType#getArrayEntry()
	 * @see #getArrayEntryType()
	 * @generated
	 */
	EReference getArrayEntryType_ArrayEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayEntryType#getOtherArrayEntries <em>Other Array Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Array Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEntryType#getOtherArrayEntries()
	 * @see #getArrayEntryType()
	 * @generated
	 */
	EReference getArrayEntryType_OtherArrayEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayEntryType#getStructEntry <em>Struct Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEntryType#getStructEntry()
	 * @see #getArrayEntryType()
	 * @generated
	 */
	EReference getArrayEntryType_StructEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayEntryType#getOtherStructEntries <em>Other Struct Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Struct Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEntryType#getOtherStructEntries()
	 * @see #getArrayEntryType()
	 * @generated
	 */
	EReference getArrayEntryType_OtherStructEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayEntryType#getUnionEntry <em>Union Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEntryType#getUnionEntry()
	 * @see #getArrayEntryType()
	 * @generated
	 */
	EReference getArrayEntryType_UnionEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayEntryType#getOtherUnionEntries <em>Other Union Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Union Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEntryType#getOtherUnionEntries()
	 * @see #getArrayEntryType()
	 * @generated
	 */
	EReference getArrayEntryType_OtherUnionEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayEntryType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEntryType#getIndex()
	 * @see #getArrayEntryType()
	 * @generated
	 */
	EAttribute getArrayEntryType_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayEntryType#getMaxNumberOfEntries <em>Max Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEntryType#getMaxNumberOfEntries()
	 * @see #getArrayEntryType()
	 * @generated
	 */
	EAttribute getArrayEntryType_MaxNumberOfEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayEntryType#getNumberOfEntries <em>Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEntryType#getNumberOfEntries()
	 * @see #getArrayEntryType()
	 * @generated
	 */
	EAttribute getArrayEntryType_NumberOfEntries();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ArrayEventType <em>Array Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Event Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEventType
	 * @generated
	 */
	EClass getArrayEventType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayEventType#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEventType#getEntry()
	 * @see #getArrayEventType()
	 * @generated
	 */
	EReference getArrayEventType_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayEventType#getOtherEntries <em>Other Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEventType#getOtherEntries()
	 * @see #getArrayEventType()
	 * @generated
	 */
	EReference getArrayEventType_OtherEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayEventType#getArrayEntry <em>Array Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEventType#getArrayEntry()
	 * @see #getArrayEventType()
	 * @generated
	 */
	EReference getArrayEventType_ArrayEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayEventType#getOtherArrayEntries <em>Other Array Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Array Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEventType#getOtherArrayEntries()
	 * @see #getArrayEventType()
	 * @generated
	 */
	EReference getArrayEventType_OtherArrayEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayEventType#getStructEntry <em>Struct Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEventType#getStructEntry()
	 * @see #getArrayEventType()
	 * @generated
	 */
	EReference getArrayEventType_StructEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayEventType#getOtherStructEntries <em>Other Struct Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Struct Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEventType#getOtherStructEntries()
	 * @see #getArrayEventType()
	 * @generated
	 */
	EReference getArrayEventType_OtherStructEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayEventType#getUnionEntry <em>Union Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEventType#getUnionEntry()
	 * @see #getArrayEventType()
	 * @generated
	 */
	EReference getArrayEventType_UnionEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayEventType#getOtherUnionEntries <em>Other Union Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Union Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEventType#getOtherUnionEntries()
	 * @see #getArrayEventType()
	 * @generated
	 */
	EReference getArrayEventType_OtherUnionEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayEventType#getMaxNumberOfEntries <em>Max Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEventType#getMaxNumberOfEntries()
	 * @see #getArrayEventType()
	 * @generated
	 */
	EAttribute getArrayEventType_MaxNumberOfEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayEventType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEventType#getName()
	 * @see #getArrayEventType()
	 * @generated
	 */
	EAttribute getArrayEventType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayEventType#getNumberOfEntries <em>Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEventType#getNumberOfEntries()
	 * @see #getArrayEventType()
	 * @generated
	 */
	EAttribute getArrayEventType_NumberOfEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayEventType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayEventType#getType()
	 * @see #getArrayEventType()
	 * @generated
	 */
	EAttribute getArrayEventType_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ArrayFieldDefinitionType <em>Array Field Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Field Definition Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldDefinitionType
	 * @generated
	 */
	EClass getArrayFieldDefinitionType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayFieldDefinitionType#getEntriesType <em>Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entries Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldDefinitionType#getEntriesType()
	 * @see #getArrayFieldDefinitionType()
	 * @generated
	 */
	EAttribute getArrayFieldDefinitionType_EntriesType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayFieldDefinitionType#getMaxStringLength <em>Max String Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max String Length</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldDefinitionType#getMaxStringLength()
	 * @see #getArrayFieldDefinitionType()
	 * @generated
	 */
	EAttribute getArrayFieldDefinitionType_MaxStringLength();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ArrayFieldType <em>Array Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Field Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldType
	 * @generated
	 */
	EClass getArrayFieldType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayFieldType#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldType#getEntry()
	 * @see #getArrayFieldType()
	 * @generated
	 */
	EReference getArrayFieldType_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayFieldType#getOtherEntries <em>Other Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldType#getOtherEntries()
	 * @see #getArrayFieldType()
	 * @generated
	 */
	EReference getArrayFieldType_OtherEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayFieldType#getArrayEntry <em>Array Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldType#getArrayEntry()
	 * @see #getArrayFieldType()
	 * @generated
	 */
	EReference getArrayFieldType_ArrayEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayFieldType#getOtherArrayEntries <em>Other Array Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Array Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldType#getOtherArrayEntries()
	 * @see #getArrayFieldType()
	 * @generated
	 */
	EReference getArrayFieldType_OtherArrayEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayFieldType#getStructEntry <em>Struct Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldType#getStructEntry()
	 * @see #getArrayFieldType()
	 * @generated
	 */
	EReference getArrayFieldType_StructEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayFieldType#getOtherStructEntries <em>Other Struct Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Struct Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldType#getOtherStructEntries()
	 * @see #getArrayFieldType()
	 * @generated
	 */
	EReference getArrayFieldType_OtherStructEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayFieldType#getUnionEntry <em>Union Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldType#getUnionEntry()
	 * @see #getArrayFieldType()
	 * @generated
	 */
	EReference getArrayFieldType_UnionEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayFieldType#getOtherUnionEntries <em>Other Union Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Union Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldType#getOtherUnionEntries()
	 * @see #getArrayFieldType()
	 * @generated
	 */
	EReference getArrayFieldType_OtherUnionEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayFieldType#getMaxNumberOfEntries <em>Max Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldType#getMaxNumberOfEntries()
	 * @see #getArrayFieldType()
	 * @generated
	 */
	EAttribute getArrayFieldType_MaxNumberOfEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayFieldType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldType#getName()
	 * @see #getArrayFieldType()
	 * @generated
	 */
	EAttribute getArrayFieldType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayFieldType#getNumberOfEntries <em>Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayFieldType#getNumberOfEntries()
	 * @see #getArrayFieldType()
	 * @generated
	 */
	EAttribute getArrayFieldType_NumberOfEntries();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ArrayPropertyType <em>Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Property Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayPropertyType
	 * @generated
	 */
	EClass getArrayPropertyType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayPropertyType#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayPropertyType#getEntry()
	 * @see #getArrayPropertyType()
	 * @generated
	 */
	EReference getArrayPropertyType_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayPropertyType#getOtherEntries <em>Other Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayPropertyType#getOtherEntries()
	 * @see #getArrayPropertyType()
	 * @generated
	 */
	EReference getArrayPropertyType_OtherEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayPropertyType#getArrayEntry <em>Array Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayPropertyType#getArrayEntry()
	 * @see #getArrayPropertyType()
	 * @generated
	 */
	EReference getArrayPropertyType_ArrayEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayPropertyType#getOtherArrayEntries <em>Other Array Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Array Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayPropertyType#getOtherArrayEntries()
	 * @see #getArrayPropertyType()
	 * @generated
	 */
	EReference getArrayPropertyType_OtherArrayEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayPropertyType#getStructEntry <em>Struct Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayPropertyType#getStructEntry()
	 * @see #getArrayPropertyType()
	 * @generated
	 */
	EReference getArrayPropertyType_StructEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayPropertyType#getOtherStructEntries <em>Other Struct Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Struct Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayPropertyType#getOtherStructEntries()
	 * @see #getArrayPropertyType()
	 * @generated
	 */
	EReference getArrayPropertyType_OtherStructEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ArrayPropertyType#getUnionEntry <em>Union Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayPropertyType#getUnionEntry()
	 * @see #getArrayPropertyType()
	 * @generated
	 */
	EReference getArrayPropertyType_UnionEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ArrayPropertyType#getOtherUnionEntries <em>Other Union Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Union Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayPropertyType#getOtherUnionEntries()
	 * @see #getArrayPropertyType()
	 * @generated
	 */
	EReference getArrayPropertyType_OtherUnionEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayPropertyType#getMaxNumberOfEntries <em>Max Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayPropertyType#getMaxNumberOfEntries()
	 * @see #getArrayPropertyType()
	 * @generated
	 */
	EAttribute getArrayPropertyType_MaxNumberOfEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayPropertyType#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modality</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayPropertyType#getModality()
	 * @see #getArrayPropertyType()
	 * @generated
	 */
	EAttribute getArrayPropertyType_Modality();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayPropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayPropertyType#getName()
	 * @see #getArrayPropertyType()
	 * @generated
	 */
	EAttribute getArrayPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayPropertyType#getNumberOfEntries <em>Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayPropertyType#getNumberOfEntries()
	 * @see #getArrayPropertyType()
	 * @generated
	 */
	EAttribute getArrayPropertyType_NumberOfEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ArrayPropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ArrayPropertyType#getType()
	 * @see #getArrayPropertyType()
	 * @generated
	 */
	EAttribute getArrayPropertyType_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.BehaviorType <em>Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Type</em>'.
	 * @see org.polarsys.ng661designer.part2.BehaviorType
	 * @generated
	 */
	EClass getBehaviorType();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.BehaviorType#getScxml <em>Scxml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scxml</em>'.
	 * @see org.polarsys.ng661designer.part2.BehaviorType#getScxml()
	 * @see #getBehaviorType()
	 * @generated
	 */
	EReference getBehaviorType_Scxml();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.BehaviorType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see org.polarsys.ng661designer.part2.BehaviorType#getFunction()
	 * @see #getBehaviorType()
	 * @generated
	 */
	EReference getBehaviorType_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.BehaviorType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.polarsys.ng661designer.part2.BehaviorType#getProperty()
	 * @see #getBehaviorType()
	 * @generated
	 */
	EReference getBehaviorType_Property();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ChildPrimitive <em>Child Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive
	 * @generated
	 */
	EClass getChildPrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getChildElements()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_ChildElements();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getTransform()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_Transform();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getGroup()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getTransformGroup <em>Transform Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transform Group</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getTransformGroup()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_TransformGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getReplicate <em>Replicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replicate</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getReplicate()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_Replicate();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getChildren()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getSwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Node</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getSwitchNode()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_SwitchNode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getClippingContainer <em>Clipping Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clipping Container</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getClippingContainer()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_ClippingContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getRectangle()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getCircle()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getEllipse()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getLine()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getPolyline()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getPolygon()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getPath()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getImage()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getSimpleText <em>Simple Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Text</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getSimpleText()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_SimpleText();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getArc()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getCrown()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getPolarLine()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getPointerArea()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getPointerGestureArea <em>Pointer Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getPointerGestureArea()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_PointerGestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getTouchArea()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getGestureArea()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getKeyboardInput()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getScrollWheelInput <em>Scroll Wheel Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Input</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getScrollWheelInput()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_ScrollWheelInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getCompositions()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EReference getChildPrimitive_Compositions();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getBlocked()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EAttribute getChildPrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getDrawingPriority()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EAttribute getChildPrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getEnable()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EAttribute getChildPrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getId()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EAttribute getChildPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getInheritedBlocked()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EAttribute getChildPrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getInheritedEnable()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EAttribute getChildPrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getInheritedVisible()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EAttribute getChildPrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getInstantiationMode <em>Instantiation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiation Mode</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getInstantiationMode()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EAttribute getChildPrimitive_InstantiationMode();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ChildPrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.ChildPrimitive#getVisible()
	 * @see #getChildPrimitive()
	 * @generated
	 */
	EAttribute getChildPrimitive_Visible();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.CirclePrimitive <em>Circle Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive
	 * @generated
	 */
	EClass getCirclePrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getChildElements()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_ChildElements();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getGroup()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getTransformGroup <em>Transform Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transform Group</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getTransformGroup()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_TransformGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getReplicate <em>Replicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replicate</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getReplicate()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Replicate();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getChildren()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getSwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Node</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getSwitchNode()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_SwitchNode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getClippingContainer <em>Clipping Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clipping Container</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getClippingContainer()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_ClippingContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getRectangle()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getCircle()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getEllipse()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getLine()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getPolyline()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getPolygon()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getPath()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getImage()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getSimpleText <em>Simple Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Text</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getSimpleText()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_SimpleText();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getArc()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getCrown()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getPolarLine()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getPointerArea()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getPointerGestureArea <em>Pointer Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getPointerGestureArea()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_PointerGestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getTouchArea()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getGestureArea()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getKeyboardInput()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getScrollWheelInput <em>Scroll Wheel Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Input</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getScrollWheelInput()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_ScrollWheelInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getCompositions()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EReference getCirclePrimitive_Compositions();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getBlocked()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getCx()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Cx();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getCy()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Cy();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getDrawingPriority()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getEnable()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getFill()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getFillOpacity()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getFillRule()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getId()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getInheritedBlocked()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getInheritedEnable()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getInheritedVisible()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getR()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_R();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getStroke()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getStrokeDasharray()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getStrokeDashoffset()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getStrokeLinecap()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getStrokeLinejoin()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getStrokeMiterlimit()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getStrokeOpacity()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getStrokewidth()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CirclePrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.CirclePrimitive#getVisible()
	 * @see #getCirclePrimitive()
	 * @generated
	 */
	EAttribute getCirclePrimitive_Visible();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ClipPathPrimitive <em>Clip Path Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clip Path Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.ClipPathPrimitive
	 * @generated
	 */
	EClass getClipPathPrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ClipPathPrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rectangle</em>'.
	 * @see org.polarsys.ng661designer.part2.ClipPathPrimitive#getRectangle()
	 * @see #getClipPathPrimitive()
	 * @generated
	 */
	EReference getClipPathPrimitive_Rectangle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ClipPathPrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circle</em>'.
	 * @see org.polarsys.ng661designer.part2.ClipPathPrimitive#getCircle()
	 * @see #getClipPathPrimitive()
	 * @generated
	 */
	EReference getClipPathPrimitive_Circle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ClipPathPrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ellipse</em>'.
	 * @see org.polarsys.ng661designer.part2.ClipPathPrimitive#getEllipse()
	 * @see #getClipPathPrimitive()
	 * @generated
	 */
	EReference getClipPathPrimitive_Ellipse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ClipPathPrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see org.polarsys.ng661designer.part2.ClipPathPrimitive#getLine()
	 * @see #getClipPathPrimitive()
	 * @generated
	 */
	EReference getClipPathPrimitive_Line();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ClipPathPrimitive#getClosedPath <em>Closed Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Closed Path</em>'.
	 * @see org.polarsys.ng661designer.part2.ClipPathPrimitive#getClosedPath()
	 * @see #getClipPathPrimitive()
	 * @generated
	 */
	EReference getClipPathPrimitive_ClosedPath();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ClipPathPrimitive#getClipRule <em>Clip Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Rule</em>'.
	 * @see org.polarsys.ng661designer.part2.ClipPathPrimitive#getClipRule()
	 * @see #getClipPathPrimitive()
	 * @generated
	 */
	EAttribute getClipPathPrimitive_ClipRule();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive <em>Clipping Container Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clipping Container Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive
	 * @generated
	 */
	EClass getClippingContainerPrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getChildElements()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_ChildElements();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clip Path</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getClipPath()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_ClipPath();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getGroup()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getTransformGroup <em>Transform Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transform Group</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getTransformGroup()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_TransformGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getReplicate <em>Replicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replicate</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getReplicate()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_Replicate();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getChildren()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getSwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Node</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getSwitchNode()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_SwitchNode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getClippingContainer <em>Clipping Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clipping Container</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getClippingContainer()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_ClippingContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getRectangle()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getCircle()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getEllipse()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getLine()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getPolyline()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getPolygon()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getPath()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getImage()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getSimpleText <em>Simple Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Text</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getSimpleText()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_SimpleText();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getArc()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getCrown()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getPolarLine()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getPointerArea()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getPointerGestureArea <em>Pointer Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getPointerGestureArea()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_PointerGestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getTouchArea()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getGestureArea()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getKeyboardInput()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getScrollWheelInput <em>Scroll Wheel Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Input</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getScrollWheelInput()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_ScrollWheelInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getCompositions()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EReference getClippingContainerPrimitive_Compositions();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getBlocked()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EAttribute getClippingContainerPrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getDrawingPriority()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EAttribute getClippingContainerPrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getEnable()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EAttribute getClippingContainerPrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getId()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EAttribute getClippingContainerPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getInheritedBlocked()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EAttribute getClippingContainerPrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getInheritedEnable()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EAttribute getClippingContainerPrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getInheritedVisible()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EAttribute getClippingContainerPrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.ClippingContainerPrimitive#getVisible()
	 * @see #getClippingContainerPrimitive()
	 * @generated
	 */
	EAttribute getClippingContainerPrimitive_Visible();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ClockType <em>Clock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ClockType
	 * @generated
	 */
	EClass getClockType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ClockType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.ClockType#getId()
	 * @see #getClockType()
	 * @generated
	 */
	EAttribute getClockType_Id();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ClosePathCommand <em>Close Path Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Close Path Command</em>'.
	 * @see org.polarsys.ng661designer.part2.ClosePathCommand
	 * @generated
	 */
	EClass getClosePathCommand();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ComponentDefinitionType <em>Component Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Definition Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ComponentDefinitionType
	 * @generated
	 */
	EClass getComponentDefinitionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ComponentDefinitionType#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.polarsys.ng661designer.part2.ComponentDefinitionType#getDefinition()
	 * @see #getComponentDefinitionType()
	 * @generated
	 */
	EReference getComponentDefinitionType_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ComponentDefinitionType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see org.polarsys.ng661designer.part2.ComponentDefinitionType#getInterface()
	 * @see #getComponentDefinitionType()
	 * @generated
	 */
	EReference getComponentDefinitionType_Interface();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ComponentDefinitionType#getTree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tree</em>'.
	 * @see org.polarsys.ng661designer.part2.ComponentDefinitionType#getTree()
	 * @see #getComponentDefinitionType()
	 * @generated
	 */
	EReference getComponentDefinitionType_Tree();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.ComponentDefinitionType#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavior</em>'.
	 * @see org.polarsys.ng661designer.part2.ComponentDefinitionType#getBehavior()
	 * @see #getComponentDefinitionType()
	 * @generated
	 */
	EReference getComponentDefinitionType_Behavior();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ComponentDefinitionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.ComponentDefinitionType#getName()
	 * @see #getComponentDefinitionType()
	 * @generated
	 */
	EAttribute getComponentDefinitionType_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.CrownComponent <em>Crown Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crown Component</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent
	 * @generated
	 */
	EClass getCrownComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getBlocked()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getDrawingPriority()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getEnable()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getFill()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getFillOpacity()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getFillRule()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getId()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getInheritedBlocked()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getInheritedEnable()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getInheritedVisible()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getInnerRadius <em>Inner Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner Radius</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getInnerRadius()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_InnerRadius();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getOuterRadius <em>Outer Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Radius</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getOuterRadius()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_OuterRadius();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getStroke()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getStrokeDasharray()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getStrokeDashoffset()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getStrokeLinecap()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getStrokeLinejoin()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getStrokeMiterlimit()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getStrokeOpacity()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getStrokewidth()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getVisible()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getX()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CrownComponent#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.CrownComponent#getY()
	 * @see #getCrownComponent()
	 * @generated
	 */
	EAttribute getCrownComponent_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.CubicBezierCurveCommand <em>Cubic Bezier Curve Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cubic Bezier Curve Command</em>'.
	 * @see org.polarsys.ng661designer.part2.CubicBezierCurveCommand
	 * @generated
	 */
	EClass getCubicBezierCurveCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CubicBezierCurveCommand#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.CubicBezierCurveCommand#getX()
	 * @see #getCubicBezierCurveCommand()
	 * @generated
	 */
	EAttribute getCubicBezierCurveCommand_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CubicBezierCurveCommand#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see org.polarsys.ng661designer.part2.CubicBezierCurveCommand#getX1()
	 * @see #getCubicBezierCurveCommand()
	 * @generated
	 */
	EAttribute getCubicBezierCurveCommand_X1();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CubicBezierCurveCommand#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see org.polarsys.ng661designer.part2.CubicBezierCurveCommand#getX2()
	 * @see #getCubicBezierCurveCommand()
	 * @generated
	 */
	EAttribute getCubicBezierCurveCommand_X2();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CubicBezierCurveCommand#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.CubicBezierCurveCommand#getY()
	 * @see #getCubicBezierCurveCommand()
	 * @generated
	 */
	EAttribute getCubicBezierCurveCommand_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CubicBezierCurveCommand#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see org.polarsys.ng661designer.part2.CubicBezierCurveCommand#getY1()
	 * @see #getCubicBezierCurveCommand()
	 * @generated
	 */
	EAttribute getCubicBezierCurveCommand_Y1();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CubicBezierCurveCommand#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see org.polarsys.ng661designer.part2.CubicBezierCurveCommand#getY2()
	 * @see #getCubicBezierCurveCommand()
	 * @generated
	 */
	EAttribute getCubicBezierCurveCommand_Y2();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.CustomIntegerTypeElementType <em>Custom Integer Type Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Integer Type Element Type</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomIntegerTypeElementType
	 * @generated
	 */
	EClass getCustomIntegerTypeElementType();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.ng661designer.part2.CustomIntegerTypeElementType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomIntegerTypeElementType#getAny()
	 * @see #getCustomIntegerTypeElementType()
	 * @generated
	 */
	EAttribute getCustomIntegerTypeElementType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CustomIntegerTypeElementType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomIntegerTypeElementType#getMax()
	 * @see #getCustomIntegerTypeElementType()
	 * @generated
	 */
	EAttribute getCustomIntegerTypeElementType_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CustomIntegerTypeElementType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomIntegerTypeElementType#getMin()
	 * @see #getCustomIntegerTypeElementType()
	 * @generated
	 */
	EAttribute getCustomIntegerTypeElementType_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CustomIntegerTypeElementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomIntegerTypeElementType#getName()
	 * @see #getCustomIntegerTypeElementType()
	 * @generated
	 */
	EAttribute getCustomIntegerTypeElementType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CustomIntegerTypeElementType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomIntegerTypeElementType#getResolution()
	 * @see #getCustomIntegerTypeElementType()
	 * @generated
	 */
	EAttribute getCustomIntegerTypeElementType_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CustomIntegerTypeElementType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomIntegerTypeElementType#getUnit()
	 * @see #getCustomIntegerTypeElementType()
	 * @generated
	 */
	EAttribute getCustomIntegerTypeElementType_Unit();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.ng661designer.part2.CustomIntegerTypeElementType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomIntegerTypeElementType#getAnyAttribute()
	 * @see #getCustomIntegerTypeElementType()
	 * @generated
	 */
	EAttribute getCustomIntegerTypeElementType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.CustomRealTypeElementType <em>Custom Real Type Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Real Type Element Type</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomRealTypeElementType
	 * @generated
	 */
	EClass getCustomRealTypeElementType();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.ng661designer.part2.CustomRealTypeElementType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomRealTypeElementType#getAny()
	 * @see #getCustomRealTypeElementType()
	 * @generated
	 */
	EAttribute getCustomRealTypeElementType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CustomRealTypeElementType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomRealTypeElementType#getMax()
	 * @see #getCustomRealTypeElementType()
	 * @generated
	 */
	EAttribute getCustomRealTypeElementType_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CustomRealTypeElementType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomRealTypeElementType#getMin()
	 * @see #getCustomRealTypeElementType()
	 * @generated
	 */
	EAttribute getCustomRealTypeElementType_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CustomRealTypeElementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomRealTypeElementType#getName()
	 * @see #getCustomRealTypeElementType()
	 * @generated
	 */
	EAttribute getCustomRealTypeElementType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CustomRealTypeElementType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomRealTypeElementType#getResolution()
	 * @see #getCustomRealTypeElementType()
	 * @generated
	 */
	EAttribute getCustomRealTypeElementType_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CustomRealTypeElementType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomRealTypeElementType#getUnit()
	 * @see #getCustomRealTypeElementType()
	 * @generated
	 */
	EAttribute getCustomRealTypeElementType_Unit();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.ng661designer.part2.CustomRealTypeElementType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomRealTypeElementType#getAnyAttribute()
	 * @see #getCustomRealTypeElementType()
	 * @generated
	 */
	EAttribute getCustomRealTypeElementType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.CustomStringTypeElementType <em>Custom String Type Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom String Type Element Type</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomStringTypeElementType
	 * @generated
	 */
	EClass getCustomStringTypeElementType();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.ng661designer.part2.CustomStringTypeElementType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomStringTypeElementType#getAny()
	 * @see #getCustomStringTypeElementType()
	 * @generated
	 */
	EAttribute getCustomStringTypeElementType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CustomStringTypeElementType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomStringTypeElementType#getMaxLength()
	 * @see #getCustomStringTypeElementType()
	 * @generated
	 */
	EAttribute getCustomStringTypeElementType_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CustomStringTypeElementType#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomStringTypeElementType#getMinLength()
	 * @see #getCustomStringTypeElementType()
	 * @generated
	 */
	EAttribute getCustomStringTypeElementType_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CustomStringTypeElementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomStringTypeElementType#getName()
	 * @see #getCustomStringTypeElementType()
	 * @generated
	 */
	EAttribute getCustomStringTypeElementType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.CustomStringTypeElementType#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomStringTypeElementType#getRegex()
	 * @see #getCustomStringTypeElementType()
	 * @generated
	 */
	EAttribute getCustomStringTypeElementType_Regex();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.ng661designer.part2.CustomStringTypeElementType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.polarsys.ng661designer.part2.CustomStringTypeElementType#getAnyAttribute()
	 * @see #getCustomStringTypeElementType()
	 * @generated
	 */
	EAttribute getCustomStringTypeElementType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.DefinitionsType <em>Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions Type</em>'.
	 * @see org.polarsys.ng661designer.part2.DefinitionsType
	 * @generated
	 */
	EClass getDefinitionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.DefinitionsType#getStructDefinition <em>Struct Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Definition</em>'.
	 * @see org.polarsys.ng661designer.part2.DefinitionsType#getStructDefinition()
	 * @see #getDefinitionsType()
	 * @generated
	 */
	EReference getDefinitionsType_StructDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.DefinitionsType#getEnumDefinition <em>Enum Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Definition</em>'.
	 * @see org.polarsys.ng661designer.part2.DefinitionsType#getEnumDefinition()
	 * @see #getDefinitionsType()
	 * @generated
	 */
	EReference getDefinitionsType_EnumDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.DefinitionsType#getArrayDefinition <em>Array Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Definition</em>'.
	 * @see org.polarsys.ng661designer.part2.DefinitionsType#getArrayDefinition()
	 * @see #getDefinitionsType()
	 * @generated
	 */
	EReference getDefinitionsType_ArrayDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.DefinitionsType#getUnionDefinition <em>Union Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Definition</em>'.
	 * @see org.polarsys.ng661designer.part2.DefinitionsType#getUnionDefinition()
	 * @see #getDefinitionsType()
	 * @generated
	 */
	EReference getDefinitionsType_UnionDefinition();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.DefinitionType <em>Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Type</em>'.
	 * @see org.polarsys.ng661designer.part2.DefinitionType
	 * @generated
	 */
	EClass getDefinitionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.DefinitionType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see org.polarsys.ng661designer.part2.DefinitionType#getImport()
	 * @see #getDefinitionType()
	 * @generated
	 */
	EReference getDefinitionType_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.DefinitionType#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Definition</em>'.
	 * @see org.polarsys.ng661designer.part2.DefinitionType#getTypeDefinition()
	 * @see #getDefinitionType()
	 * @generated
	 */
	EReference getDefinitionType_TypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.DefinitionType#getPropertyGroupDefinition <em>Property Group Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Group Definition</em>'.
	 * @see org.polarsys.ng661designer.part2.DefinitionType#getPropertyGroupDefinition()
	 * @see #getDefinitionType()
	 * @generated
	 */
	EReference getDefinitionType_PropertyGroupDefinition();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.polarsys.ng661designer.part2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.ng661designer.part2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.polarsys.ng661designer.part2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.polarsys.ng661designer.part2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.polarsys.ng661designer.part2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.polarsys.ng661designer.part2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.polarsys.ng661designer.part2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.DocumentRoot#getComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Definition</em>'.
	 * @see org.polarsys.ng661designer.part2.DocumentRoot#getComponentDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComponentDefinition();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand <em>Ellipse Arc Curve Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse Arc Curve Command</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipseArcCurveCommand
	 * @generated
	 */
	EClass getEllipseArcCurveCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getAngle()
	 * @see #getEllipseArcCurveCommand()
	 * @generated
	 */
	EAttribute getEllipseArcCurveCommand_Angle();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getLargeArcFlag <em>Large Arc Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Large Arc Flag</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getLargeArcFlag()
	 * @see #getEllipseArcCurveCommand()
	 * @generated
	 */
	EAttribute getEllipseArcCurveCommand_LargeArcFlag();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getR1 <em>R1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R1</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getR1()
	 * @see #getEllipseArcCurveCommand()
	 * @generated
	 */
	EAttribute getEllipseArcCurveCommand_R1();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getR2 <em>R2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R2</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getR2()
	 * @see #getEllipseArcCurveCommand()
	 * @generated
	 */
	EAttribute getEllipseArcCurveCommand_R2();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getSweepFlag <em>Sweep Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sweep Flag</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getSweepFlag()
	 * @see #getEllipseArcCurveCommand()
	 * @generated
	 */
	EAttribute getEllipseArcCurveCommand_SweepFlag();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getX()
	 * @see #getEllipseArcCurveCommand()
	 * @generated
	 */
	EAttribute getEllipseArcCurveCommand_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipseArcCurveCommand#getY()
	 * @see #getEllipseArcCurveCommand()
	 * @generated
	 */
	EAttribute getEllipseArcCurveCommand_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.EllipsePrimitive <em>Ellipse Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive
	 * @generated
	 */
	EClass getEllipsePrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getChildElements()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_ChildElements();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getGroup()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getTransformGroup <em>Transform Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transform Group</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getTransformGroup()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_TransformGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getReplicate <em>Replicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replicate</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getReplicate()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Replicate();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getChildren()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getSwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Node</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getSwitchNode()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_SwitchNode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getClippingContainer <em>Clipping Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clipping Container</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getClippingContainer()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_ClippingContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getRectangle()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getCircle()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getEllipse()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getLine()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getPolyline()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getPolygon()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getPath()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getImage()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getSimpleText <em>Simple Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Text</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getSimpleText()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_SimpleText();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getArc()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getCrown()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getPolarLine()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getPointerArea()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getPointerGestureArea <em>Pointer Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getPointerGestureArea()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_PointerGestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getTouchArea()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getGestureArea()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getKeyboardInput()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getScrollWheelInput <em>Scroll Wheel Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Input</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getScrollWheelInput()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_ScrollWheelInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getCompositions()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EReference getEllipsePrimitive_Compositions();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getBlocked()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getCx()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Cx();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getCy()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Cy();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getDrawingPriority()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getEnable()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getFill()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getFillOpacity()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getFillRule()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getId()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getInheritedBlocked()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getInheritedEnable()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getInheritedVisible()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getRx <em>Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getRx()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Rx();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getRy <em>Ry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ry</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getRy()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Ry();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getStroke()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getStrokeDasharray()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getStrokeDashoffset()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getStrokeLinecap()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getStrokeLinejoin()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getStrokeMiterlimit()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getStrokeOpacity()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getStrokewidth()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EllipsePrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.EllipsePrimitive#getVisible()
	 * @see #getEllipsePrimitive()
	 * @generated
	 */
	EAttribute getEllipsePrimitive_Visible();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Type</em>'.
	 * @see org.polarsys.ng661designer.part2.EntryType
	 * @generated
	 */
	EClass getEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EntryType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.polarsys.ng661designer.part2.EntryType#getIndex()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EntryType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.ng661designer.part2.EntryType#getValue()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.EnumDefinitionType <em>Enum Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Definition Type</em>'.
	 * @see org.polarsys.ng661designer.part2.EnumDefinitionType
	 * @generated
	 */
	EClass getEnumDefinitionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.EnumDefinitionType#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see org.polarsys.ng661designer.part2.EnumDefinitionType#getEnumeration()
	 * @see #getEnumDefinitionType()
	 * @generated
	 */
	EReference getEnumDefinitionType_Enumeration();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type</em>'.
	 * @see org.polarsys.ng661designer.part2.EnumerationType
	 * @generated
	 */
	EClass getEnumerationType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EnumerationType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.polarsys.ng661designer.part2.EnumerationType#getIndex()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EAttribute getEnumerationType_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EnumerationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.ng661designer.part2.EnumerationType#getValue()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EAttribute getEnumerationType_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see org.polarsys.ng661designer.part2.EventType
	 * @generated
	 */
	EClass getEventType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.EventType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.EventType#getName()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.FieldDefinitionAbstractType <em>Field Definition Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Definition Abstract Type</em>'.
	 * @see org.polarsys.ng661designer.part2.FieldDefinitionAbstractType
	 * @generated
	 */
	EClass getFieldDefinitionAbstractType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.FieldDefinitionAbstractType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.FieldDefinitionAbstractType#getName()
	 * @see #getFieldDefinitionAbstractType()
	 * @generated
	 */
	EAttribute getFieldDefinitionAbstractType_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.FieldDefinitionType <em>Field Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Definition Type</em>'.
	 * @see org.polarsys.ng661designer.part2.FieldDefinitionType
	 * @generated
	 */
	EClass getFieldDefinitionType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.FieldDefinitionType#getMaxStringLength <em>Max String Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max String Length</em>'.
	 * @see org.polarsys.ng661designer.part2.FieldDefinitionType#getMaxStringLength()
	 * @see #getFieldDefinitionType()
	 * @generated
	 */
	EAttribute getFieldDefinitionType_MaxStringLength();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.FieldDefinitionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.ng661designer.part2.FieldDefinitionType#getType()
	 * @see #getFieldDefinitionType()
	 * @generated
	 */
	EAttribute getFieldDefinitionType_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Type</em>'.
	 * @see org.polarsys.ng661designer.part2.FieldType
	 * @generated
	 */
	EClass getFieldType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.FieldType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.FieldType#getName()
	 * @see #getFieldType()
	 * @generated
	 */
	EAttribute getFieldType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.FieldType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.ng661designer.part2.FieldType#getValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EAttribute getFieldType_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.FrameProperties <em>Frame Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Properties</em>'.
	 * @see org.polarsys.ng661designer.part2.FrameProperties
	 * @generated
	 */
	EClass getFrameProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.FrameProperties#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.polarsys.ng661designer.part2.FrameProperties#getActive()
	 * @see #getFrameProperties()
	 * @generated
	 */
	EAttribute getFrameProperties_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.FrameProperties#getAscenderMargin <em>Ascender Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ascender Margin</em>'.
	 * @see org.polarsys.ng661designer.part2.FrameProperties#getAscenderMargin()
	 * @see #getFrameProperties()
	 * @generated
	 */
	EAttribute getFrameProperties_AscenderMargin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.FrameProperties#getDescenderMargin <em>Descender Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descender Margin</em>'.
	 * @see org.polarsys.ng661designer.part2.FrameProperties#getDescenderMargin()
	 * @see #getFrameProperties()
	 * @generated
	 */
	EAttribute getFrameProperties_DescenderMargin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.FrameProperties#getEndMargin <em>End Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Margin</em>'.
	 * @see org.polarsys.ng661designer.part2.FrameProperties#getEndMargin()
	 * @see #getFrameProperties()
	 * @generated
	 */
	EAttribute getFrameProperties_EndMargin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.FrameProperties#getStartMargin <em>Start Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Margin</em>'.
	 * @see org.polarsys.ng661designer.part2.FrameProperties#getStartMargin()
	 * @see #getFrameProperties()
	 * @generated
	 */
	EAttribute getFrameProperties_StartMargin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.FrameProperties#getStrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see org.polarsys.ng661designer.part2.FrameProperties#getStrokeWidth()
	 * @see #getFrameProperties()
	 * @generated
	 */
	EAttribute getFrameProperties_StrokeWidth();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type</em>'.
	 * @see org.polarsys.ng661designer.part2.FunctionType
	 * @generated
	 */
	EClass getFunctionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.FunctionType#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.polarsys.ng661designer.part2.FunctionType#getParam()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_Param();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.FunctionType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.polarsys.ng661designer.part2.FunctionType#getScript()
	 * @see #getFunctionType()
	 * @generated
	 */
	EAttribute getFunctionType_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.FunctionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.FunctionType#getName()
	 * @see #getFunctionType()
	 * @generated
	 */
	EAttribute getFunctionType_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive <em>Gesture Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gesture Area Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive
	 * @generated
	 */
	EClass getGestureAreaPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive#getAcceptedGesture <em>Accepted Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted Gesture</em>'.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive#getAcceptedGesture()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_AcceptedGesture();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive#getBlocked()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive#getEnable()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive#getHeight()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive#getId()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive#getInheritedBlocked()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive#getInheritedEnable()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive#getInheritedVisible()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive#getPreventStealing <em>Prevent Stealing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prevent Stealing</em>'.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive#getPreventStealing()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_PreventStealing();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive#getTrackOutside <em>Track Outside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track Outside</em>'.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive#getTrackOutside()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_TrackOutside();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive#getVisible()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive#getWidth()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive#getX()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GestureAreaPrimitive#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.GestureAreaPrimitive#getY()
	 * @see #getGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getGestureAreaPrimitive_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.GroupPrimitive <em>Group Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive
	 * @generated
	 */
	EClass getGroupPrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getChildElements()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_ChildElements();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getGroup()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getTransformGroup <em>Transform Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transform Group</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getTransformGroup()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_TransformGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getReplicate <em>Replicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replicate</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getReplicate()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Replicate();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getChildren()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getSwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Node</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getSwitchNode()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_SwitchNode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getClippingContainer <em>Clipping Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clipping Container</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getClippingContainer()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_ClippingContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getRectangle()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getCircle()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getEllipse()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getLine()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getPolyline()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getPolygon()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getPath()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getImage()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getSimpleText <em>Simple Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Text</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getSimpleText()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_SimpleText();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getArc()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getCrown()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getPolarLine()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getPointerArea()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getPointerGestureArea <em>Pointer Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getPointerGestureArea()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_PointerGestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getTouchArea()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getGestureArea()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getKeyboardInput()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getScrollWheelInput <em>Scroll Wheel Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Input</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getScrollWheelInput()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_ScrollWheelInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getCompositions()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EReference getGroupPrimitive_Compositions();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getBlocked()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EAttribute getGroupPrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getDrawingPriority()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EAttribute getGroupPrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getEnable()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EAttribute getGroupPrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getId()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EAttribute getGroupPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getInheritedBlocked()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EAttribute getGroupPrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getInheritedEnable()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EAttribute getGroupPrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getInheritedVisible()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EAttribute getGroupPrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getTx <em>Tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getTx()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EAttribute getGroupPrimitive_Tx();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getTy <em>Ty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ty</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getTy()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EAttribute getGroupPrimitive_Ty();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.GroupPrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.GroupPrimitive#getVisible()
	 * @see #getGroupPrimitive()
	 * @generated
	 */
	EAttribute getGroupPrimitive_Visible();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ImagePrimitive <em>Image Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive
	 * @generated
	 */
	EClass getImagePrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getChildElements()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_ChildElements();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getGroup()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getTransformGroup <em>Transform Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transform Group</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getTransformGroup()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_TransformGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getReplicate <em>Replicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replicate</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getReplicate()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Replicate();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getChildren()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getSwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Node</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getSwitchNode()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_SwitchNode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getClippingContainer <em>Clipping Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clipping Container</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getClippingContainer()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_ClippingContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getRectangle()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getCircle()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getEllipse()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getLine()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getPolyline()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getPolygon()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getPath()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getImage()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getSimpleText <em>Simple Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Text</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getSimpleText()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_SimpleText();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getArc()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getCrown()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getPolarLine()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getPointerArea()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getPointerGestureArea <em>Pointer Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getPointerGestureArea()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_PointerGestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getTouchArea()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getGestureArea()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getKeyboardInput()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getScrollWheelInput <em>Scroll Wheel Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Input</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getScrollWheelInput()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_ScrollWheelInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getCompositions()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EReference getImagePrimitive_Compositions();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getAlignment()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getAspectRatio <em>Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspect Ratio</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getAspectRatio()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_AspectRatio();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getBlocked()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getDrawingPriority()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getEnable()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getHeight()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getId()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getInheritedBlocked()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getInheritedEnable()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getInheritedVisible()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getSource()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getVisible()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getWidth()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getX()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImagePrimitive#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.ImagePrimitive#getY()
	 * @see #getImagePrimitive()
	 * @generated
	 */
	EAttribute getImagePrimitive_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ImportType
	 * @generated
	 */
	EClass getImportType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ImportType#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.polarsys.ng661designer.part2.ImportType#getFile()
	 * @see #getImportType()
	 * @generated
	 */
	EAttribute getImportType_File();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Type</em>'.
	 * @see org.polarsys.ng661designer.part2.InterfaceType
	 * @generated
	 */
	EClass getInterfaceType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.InterfaceType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see org.polarsys.ng661designer.part2.InterfaceType#getImport()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.InterfaceType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.polarsys.ng661designer.part2.InterfaceType#getProperty()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.InterfaceType#getArrayProperty <em>Array Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Property</em>'.
	 * @see org.polarsys.ng661designer.part2.InterfaceType#getArrayProperty()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_ArrayProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.InterfaceType#getStructProperty <em>Struct Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Property</em>'.
	 * @see org.polarsys.ng661designer.part2.InterfaceType#getStructProperty()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_StructProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.InterfaceType#getEnumProperty <em>Enum Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Property</em>'.
	 * @see org.polarsys.ng661designer.part2.InterfaceType#getEnumProperty()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_EnumProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.InterfaceType#getUnionProperty <em>Union Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Property</em>'.
	 * @see org.polarsys.ng661designer.part2.InterfaceType#getUnionProperty()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_UnionProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.InterfaceType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see org.polarsys.ng661designer.part2.InterfaceType#getEvent()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.InterfaceType#getArrayEvent <em>Array Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Event</em>'.
	 * @see org.polarsys.ng661designer.part2.InterfaceType#getArrayEvent()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_ArrayEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.InterfaceType#getStructEvent <em>Struct Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Event</em>'.
	 * @see org.polarsys.ng661designer.part2.InterfaceType#getStructEvent()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_StructEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.InterfaceType#getEnumEvent <em>Enum Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Event</em>'.
	 * @see org.polarsys.ng661designer.part2.InterfaceType#getEnumEvent()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_EnumEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.InterfaceType#getUnionEvent <em>Union Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Event</em>'.
	 * @see org.polarsys.ng661designer.part2.InterfaceType#getUnionEvent()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_UnionEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.InterfaceType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see org.polarsys.ng661designer.part2.InterfaceType#getOperation()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.InterfaceType#getPublicFunction <em>Public Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Public Function</em>'.
	 * @see org.polarsys.ng661designer.part2.InterfaceType#getPublicFunction()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_PublicFunction();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive <em>Keyboard Input Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyboard Input Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.KeyboardInputPrimitive
	 * @generated
	 */
	EClass getKeyboardInputPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getBlocked()
	 * @see #getKeyboardInputPrimitive()
	 * @generated
	 */
	EAttribute getKeyboardInputPrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getEnable()
	 * @see #getKeyboardInputPrimitive()
	 * @generated
	 */
	EAttribute getKeyboardInputPrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getFocus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focus</em>'.
	 * @see org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getFocus()
	 * @see #getKeyboardInputPrimitive()
	 * @generated
	 */
	EAttribute getKeyboardInputPrimitive_Focus();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getId()
	 * @see #getKeyboardInputPrimitive()
	 * @generated
	 */
	EAttribute getKeyboardInputPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedBlocked()
	 * @see #getKeyboardInputPrimitive()
	 * @generated
	 */
	EAttribute getKeyboardInputPrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedEnable()
	 * @see #getKeyboardInputPrimitive()
	 * @generated
	 */
	EAttribute getKeyboardInputPrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getInheritedVisible()
	 * @see #getKeyboardInputPrimitive()
	 * @generated
	 */
	EAttribute getKeyboardInputPrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getNeedFocus <em>Need Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need Focus</em>'.
	 * @see org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getNeedFocus()
	 * @see #getKeyboardInputPrimitive()
	 * @generated
	 */
	EAttribute getKeyboardInputPrimitive_NeedFocus();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getPassThrough <em>Pass Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass Through</em>'.
	 * @see org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getPassThrough()
	 * @see #getKeyboardInputPrimitive()
	 * @generated
	 */
	EAttribute getKeyboardInputPrimitive_PassThrough();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.KeyboardInputPrimitive#getVisible()
	 * @see #getKeyboardInputPrimitive()
	 * @generated
	 */
	EAttribute getKeyboardInputPrimitive_Visible();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.LinePrimitive <em>Line Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive
	 * @generated
	 */
	EClass getLinePrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getBlocked()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getDrawingPriority()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getEnable()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getId()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getInheritedBlocked()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getInheritedEnable()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getInheritedVisible()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getStroke()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getStrokeDasharray()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getStrokeDashoffset()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getStrokeLinecap()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getStrokeLinejoin()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getStrokeMiterlimit()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getStrokeOpacity()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getStrokewidth()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getVisible()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getX1()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_X1();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getX2()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_X2();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getY1()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_Y1();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LinePrimitive#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see org.polarsys.ng661designer.part2.LinePrimitive#getY2()
	 * @see #getLinePrimitive()
	 * @generated
	 */
	EAttribute getLinePrimitive_Y2();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.LineToCommand <em>Line To Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line To Command</em>'.
	 * @see org.polarsys.ng661designer.part2.LineToCommand
	 * @generated
	 */
	EClass getLineToCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LineToCommand#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.LineToCommand#getX()
	 * @see #getLineToCommand()
	 * @generated
	 */
	EAttribute getLineToCommand_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.LineToCommand#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.LineToCommand#getY()
	 * @see #getLineToCommand()
	 * @generated
	 */
	EAttribute getLineToCommand_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.MoveToCommand <em>Move To Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move To Command</em>'.
	 * @see org.polarsys.ng661designer.part2.MoveToCommand
	 * @generated
	 */
	EClass getMoveToCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.MoveToCommand#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.MoveToCommand#getX()
	 * @see #getMoveToCommand()
	 * @generated
	 */
	EAttribute getMoveToCommand_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.MoveToCommand#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.MoveToCommand#getY()
	 * @see #getMoveToCommand()
	 * @generated
	 */
	EAttribute getMoveToCommand_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Type</em>'.
	 * @see org.polarsys.ng661designer.part2.OperationType
	 * @generated
	 */
	EClass getOperationType();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType <em>Other Array Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Array Entries Type</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherArrayEntriesType
	 * @generated
	 */
	EClass getOtherArrayEntriesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherArrayEntriesType#getEntry()
	 * @see #getOtherArrayEntriesType()
	 * @generated
	 */
	EReference getOtherArrayEntriesType_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherEntries <em>Other Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherEntries()
	 * @see #getOtherArrayEntriesType()
	 * @generated
	 */
	EReference getOtherArrayEntriesType_OtherEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getArrayEntry <em>Array Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherArrayEntriesType#getArrayEntry()
	 * @see #getOtherArrayEntriesType()
	 * @generated
	 */
	EReference getOtherArrayEntriesType_ArrayEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherArrayEntries <em>Other Array Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Array Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherArrayEntries()
	 * @see #getOtherArrayEntriesType()
	 * @generated
	 */
	EReference getOtherArrayEntriesType_OtherArrayEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getStructEntry <em>Struct Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherArrayEntriesType#getStructEntry()
	 * @see #getOtherArrayEntriesType()
	 * @generated
	 */
	EReference getOtherArrayEntriesType_StructEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherStructEntries <em>Other Struct Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Struct Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherStructEntries()
	 * @see #getOtherArrayEntriesType()
	 * @generated
	 */
	EReference getOtherArrayEntriesType_OtherStructEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getUnionEntry <em>Union Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Entry</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherArrayEntriesType#getUnionEntry()
	 * @see #getOtherArrayEntriesType()
	 * @generated
	 */
	EReference getOtherArrayEntriesType_UnionEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherUnionEntries <em>Other Union Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Union Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherArrayEntriesType#getOtherUnionEntries()
	 * @see #getOtherArrayEntriesType()
	 * @generated
	 */
	EReference getOtherArrayEntriesType_OtherUnionEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getMaxNumberOfEntries <em>Max Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherArrayEntriesType#getMaxNumberOfEntries()
	 * @see #getOtherArrayEntriesType()
	 * @generated
	 */
	EAttribute getOtherArrayEntriesType_MaxNumberOfEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.OtherArrayEntriesType#getNumberOfEntries <em>Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Entries</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherArrayEntriesType#getNumberOfEntries()
	 * @see #getOtherArrayEntriesType()
	 * @generated
	 */
	EAttribute getOtherArrayEntriesType_NumberOfEntries();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.OtherEntriesType <em>Other Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Entries Type</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherEntriesType
	 * @generated
	 */
	EClass getOtherEntriesType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.OtherEntriesType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherEntriesType#getValue()
	 * @see #getOtherEntriesType()
	 * @generated
	 */
	EAttribute getOtherEntriesType_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.OtherStructEntriesType <em>Other Struct Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Struct Entries Type</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherStructEntriesType
	 * @generated
	 */
	EClass getOtherStructEntriesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.OtherStructEntriesType#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherStructEntriesType#getField()
	 * @see #getOtherStructEntriesType()
	 * @generated
	 */
	EReference getOtherStructEntriesType_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.OtherStructEntriesType#getArrayField <em>Array Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Field</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherStructEntriesType#getArrayField()
	 * @see #getOtherStructEntriesType()
	 * @generated
	 */
	EReference getOtherStructEntriesType_ArrayField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.OtherStructEntriesType#getStructField <em>Struct Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Field</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherStructEntriesType#getStructField()
	 * @see #getOtherStructEntriesType()
	 * @generated
	 */
	EReference getOtherStructEntriesType_StructField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.OtherStructEntriesType#getEnumField <em>Enum Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Field</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherStructEntriesType#getEnumField()
	 * @see #getOtherStructEntriesType()
	 * @generated
	 */
	EReference getOtherStructEntriesType_EnumField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.OtherStructEntriesType#getUnionField <em>Union Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Field</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherStructEntriesType#getUnionField()
	 * @see #getOtherStructEntriesType()
	 * @generated
	 */
	EReference getOtherStructEntriesType_UnionField();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.OtherUnionEntriesType <em>Other Union Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Union Entries Type</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherUnionEntriesType
	 * @generated
	 */
	EClass getOtherUnionEntriesType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.OtherUnionEntriesType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherUnionEntriesType#getValue()
	 * @see #getOtherUnionEntriesType()
	 * @generated
	 */
	EAttribute getOtherUnionEntriesType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.OtherUnionEntriesType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.polarsys.ng661designer.part2.OtherUnionEntriesType#getValueType()
	 * @see #getOtherUnionEntriesType()
	 * @generated
	 */
	EAttribute getOtherUnionEntriesType_ValueType();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ParamType
	 * @generated
	 */
	EClass getParamType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ParamType#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modality</em>'.
	 * @see org.polarsys.ng661designer.part2.ParamType#getModality()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Modality();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ParamType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.ParamType#getName()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ParamType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ParamType#getType()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.PathArray <em>Path Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Array</em>'.
	 * @see org.polarsys.ng661designer.part2.PathArray
	 * @generated
	 */
	EClass getPathArray();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.PathArray#getMoveToCommand <em>Move To Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Move To Command</em>'.
	 * @see org.polarsys.ng661designer.part2.PathArray#getMoveToCommand()
	 * @see #getPathArray()
	 * @generated
	 */
	EReference getPathArray_MoveToCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.PathArray#getClosePathCommand <em>Close Path Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Close Path Command</em>'.
	 * @see org.polarsys.ng661designer.part2.PathArray#getClosePathCommand()
	 * @see #getPathArray()
	 * @generated
	 */
	EReference getPathArray_ClosePathCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.PathArray#getLineToCommand <em>Line To Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line To Command</em>'.
	 * @see org.polarsys.ng661designer.part2.PathArray#getLineToCommand()
	 * @see #getPathArray()
	 * @generated
	 */
	EReference getPathArray_LineToCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.PathArray#getCubicBezierCurveCommand <em>Cubic Bezier Curve Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cubic Bezier Curve Command</em>'.
	 * @see org.polarsys.ng661designer.part2.PathArray#getCubicBezierCurveCommand()
	 * @see #getPathArray()
	 * @generated
	 */
	EReference getPathArray_CubicBezierCurveCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.PathArray#getEllipseArcCurveCommand <em>Ellipse Arc Curve Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ellipse Arc Curve Command</em>'.
	 * @see org.polarsys.ng661designer.part2.PathArray#getEllipseArcCurveCommand()
	 * @see #getPathArray()
	 * @generated
	 */
	EReference getPathArray_EllipseArcCurveCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.PathArray#getRelativeMoveToCommand <em>Relative Move To Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relative Move To Command</em>'.
	 * @see org.polarsys.ng661designer.part2.PathArray#getRelativeMoveToCommand()
	 * @see #getPathArray()
	 * @generated
	 */
	EReference getPathArray_RelativeMoveToCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.PathArray#getRelativeLineToCommand <em>Relative Line To Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relative Line To Command</em>'.
	 * @see org.polarsys.ng661designer.part2.PathArray#getRelativeLineToCommand()
	 * @see #getPathArray()
	 * @generated
	 */
	EReference getPathArray_RelativeLineToCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.PathArray#getRelativeClosePathCommand <em>Relative Close Path Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relative Close Path Command</em>'.
	 * @see org.polarsys.ng661designer.part2.PathArray#getRelativeClosePathCommand()
	 * @see #getPathArray()
	 * @generated
	 */
	EReference getPathArray_RelativeClosePathCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.PathArray#getRelativeCubicBezierCurveCommand <em>Relative Cubic Bezier Curve Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relative Cubic Bezier Curve Command</em>'.
	 * @see org.polarsys.ng661designer.part2.PathArray#getRelativeCubicBezierCurveCommand()
	 * @see #getPathArray()
	 * @generated
	 */
	EReference getPathArray_RelativeCubicBezierCurveCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.PathArray#getRelativeEllipseArcCurveCommand <em>Relative Ellipse Arc Curve Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relative Ellipse Arc Curve Command</em>'.
	 * @see org.polarsys.ng661designer.part2.PathArray#getRelativeEllipseArcCurveCommand()
	 * @see #getPathArray()
	 * @generated
	 */
	EReference getPathArray_RelativeEllipseArcCurveCommand();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.PathPrimitive <em>Path Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive
	 * @generated
	 */
	EClass getPathPrimitive();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.PathPrimitive#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>D</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getD()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EReference getPathPrimitive_D();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getBlocked()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getDrawingPriority()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getEnable()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getFill()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getFillOpacity()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getFillRule()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getId()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getInheritedBlocked()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getInheritedEnable()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getInheritedVisible()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getStroke()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getStrokeDasharray()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getStrokeDashoffset()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getStrokeLinecap()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getStrokeLinejoin()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getStrokeMiterlimit()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getStrokeOpacity()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getStrokewidth()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PathPrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.PathPrimitive#getVisible()
	 * @see #getPathPrimitive()
	 * @generated
	 */
	EAttribute getPathPrimitive_Visible();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive <em>Pointer Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Area Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive
	 * @generated
	 */
	EClass getPointerAreaPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getAcceptedButtons <em>Accepted Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted Buttons</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getAcceptedButtons()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_AcceptedButtons();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getBlocked()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getCursor <em>Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getCursor()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_Cursor();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getEnable()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getHeight()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getId()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getInheritedBlocked()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getInheritedEnable()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getInheritedVisible()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getPassThrough <em>Pass Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass Through</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getPassThrough()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_PassThrough();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getPreventStealing <em>Prevent Stealing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prevent Stealing</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getPreventStealing()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_PreventStealing();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getTrackOutside <em>Track Outside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track Outside</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getTrackOutside()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_TrackOutside();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getVisible()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getWidth()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getX()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerAreaPrimitive#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerAreaPrimitive#getY()
	 * @see #getPointerAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerAreaPrimitive_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive <em>Pointer Gesture Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Gesture Area Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive
	 * @generated
	 */
	EClass getPointerGestureAreaPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getAcceptedButtons <em>Accepted Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted Buttons</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getAcceptedButtons()
	 * @see #getPointerGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerGestureAreaPrimitive_AcceptedButtons();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getAcceptedGesture <em>Accepted Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted Gesture</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getAcceptedGesture()
	 * @see #getPointerGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerGestureAreaPrimitive_AcceptedGesture();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getBlocked()
	 * @see #getPointerGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerGestureAreaPrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getCursor <em>Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getCursor()
	 * @see #getPointerGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerGestureAreaPrimitive_Cursor();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getEnable()
	 * @see #getPointerGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerGestureAreaPrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getHeight()
	 * @see #getPointerGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerGestureAreaPrimitive_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getId()
	 * @see #getPointerGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerGestureAreaPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedBlocked()
	 * @see #getPointerGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerGestureAreaPrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedEnable()
	 * @see #getPointerGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerGestureAreaPrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getInheritedVisible()
	 * @see #getPointerGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerGestureAreaPrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getTrackOutside <em>Track Outside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track Outside</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getTrackOutside()
	 * @see #getPointerGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerGestureAreaPrimitive_TrackOutside();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getVisible()
	 * @see #getPointerGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerGestureAreaPrimitive_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getWidth()
	 * @see #getPointerGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerGestureAreaPrimitive_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getX()
	 * @see #getPointerGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerGestureAreaPrimitive_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.PointerGestureAreaPrimitive#getY()
	 * @see #getPointerGestureAreaPrimitive()
	 * @generated
	 */
	EAttribute getPointerGestureAreaPrimitive_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Type</em>'.
	 * @see org.polarsys.ng661designer.part2.PointType
	 * @generated
	 */
	EClass getPointType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.PointType#getX()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PointType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.PointType#getY()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.PolarLineComponent <em>Polar Line Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polar Line Component</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent
	 * @generated
	 */
	EClass getPolarLineComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getAngle()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_Angle();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getBlocked()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getDrawingPriority()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getEnable()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getId()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getInheritedBlocked()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getInheritedEnable()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getInheritedVisible()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getR()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_R();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getStroke()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getStrokeDasharray()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getStrokeDashoffset()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getStrokeLinecap()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getStrokeLinejoin()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getStrokeMiterlimit()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getStrokeOpacity()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getStrokewidth()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getVisible()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getX1()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_X1();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolarLineComponent#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see org.polarsys.ng661designer.part2.PolarLineComponent#getY1()
	 * @see #getPolarLineComponent()
	 * @generated
	 */
	EAttribute getPolarLineComponent_Y1();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.PolygonPrimitive <em>Polygon Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive
	 * @generated
	 */
	EClass getPolygonPrimitive();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Points</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getPoints()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EReference getPolygonPrimitive_Points();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getBlocked()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getDrawingPriority()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getEnable()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getFill()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getFillOpacity()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getFillRule()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getId()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getInheritedBlocked()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getInheritedEnable()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getInheritedVisible()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getStroke()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getStrokeDasharray()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getStrokeDashoffset()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getStrokeLinecap()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getStrokeLinejoin()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getStrokeMiterlimit()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getStrokeOpacity()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getStrokewidth()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolygonPrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.PolygonPrimitive#getVisible()
	 * @see #getPolygonPrimitive()
	 * @generated
	 */
	EAttribute getPolygonPrimitive_Visible();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.PolylinePrimitive <em>Polyline Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive
	 * @generated
	 */
	EClass getPolylinePrimitive();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Points</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getPoints()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EReference getPolylinePrimitive_Points();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getBlocked()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getDrawingPriority()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getEnable()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getId()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getInheritedBlocked()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getInheritedEnable()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getInheritedVisible()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getStroke()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getStrokeDasharray()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getStrokeDashoffset()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getStrokeLinecap()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getStrokeLinejoin()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getStrokeMiterlimit()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getStrokeOpacity()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getStrokewidth()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PolylinePrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.PolylinePrimitive#getVisible()
	 * @see #getPolylinePrimitive()
	 * @generated
	 */
	EAttribute getPolylinePrimitive_Visible();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.PositionListType <em>Position List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position List Type</em>'.
	 * @see org.polarsys.ng661designer.part2.PositionListType
	 * @generated
	 */
	EClass getPositionListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.PositionListType#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point</em>'.
	 * @see org.polarsys.ng661designer.part2.PositionListType#getPoint()
	 * @see #getPositionListType()
	 * @generated
	 */
	EReference getPositionListType_Point();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.PrivatePropertyType <em>Private Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Property Type</em>'.
	 * @see org.polarsys.ng661designer.part2.PrivatePropertyType
	 * @generated
	 */
	EClass getPrivatePropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getMaxStringLength <em>Max String Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max String Length</em>'.
	 * @see org.polarsys.ng661designer.part2.PrivatePropertyType#getMaxStringLength()
	 * @see #getPrivatePropertyType()
	 * @generated
	 */
	EAttribute getPrivatePropertyType_MaxStringLength();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modality</em>'.
	 * @see org.polarsys.ng661designer.part2.PrivatePropertyType#getModality()
	 * @see #getPrivatePropertyType()
	 * @generated
	 */
	EAttribute getPrivatePropertyType_Modality();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.PrivatePropertyType#getName()
	 * @see #getPrivatePropertyType()
	 * @generated
	 */
	EAttribute getPrivatePropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.ng661designer.part2.PrivatePropertyType#getType()
	 * @see #getPrivatePropertyType()
	 * @generated
	 */
	EAttribute getPrivatePropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PrivatePropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.ng661designer.part2.PrivatePropertyType#getValue()
	 * @see #getPrivatePropertyType()
	 * @generated
	 */
	EAttribute getPrivatePropertyType_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see org.polarsys.ng661designer.part2.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PropertyType#getMaxStringLength <em>Max String Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max String Length</em>'.
	 * @see org.polarsys.ng661designer.part2.PropertyType#getMaxStringLength()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_MaxStringLength();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PropertyType#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modality</em>'.
	 * @see org.polarsys.ng661designer.part2.PropertyType#getModality()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Modality();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.ng661designer.part2.PropertyType#getType()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.ng661designer.part2.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.RectPrimitive <em>Rect Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rect Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive
	 * @generated
	 */
	EClass getRectPrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getChildElements()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_ChildElements();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getGroup()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getTransformGroup <em>Transform Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transform Group</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getTransformGroup()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_TransformGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getReplicate <em>Replicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replicate</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getReplicate()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Replicate();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getChildren()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getSwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Node</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getSwitchNode()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_SwitchNode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getClippingContainer <em>Clipping Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clipping Container</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getClippingContainer()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_ClippingContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getRectangle()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getCircle()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getEllipse()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getLine()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getPolyline()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getPolygon()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getPath()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getImage()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getSimpleText <em>Simple Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Text</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getSimpleText()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_SimpleText();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getArc()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getCrown()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getPolarLine()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getPointerArea()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getPointerGestureArea <em>Pointer Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getPointerGestureArea()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_PointerGestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getTouchArea()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getGestureArea()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getKeyboardInput()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getScrollWheelInput <em>Scroll Wheel Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Input</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getScrollWheelInput()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_ScrollWheelInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.RectPrimitive#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getCompositions()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EReference getRectPrimitive_Compositions();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getBlocked()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getDrawingPriority()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getEnable()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getFill()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getFillOpacity()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getFillRule()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getHeight()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getId()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getInheritedBlocked()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getInheritedEnable()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getInheritedVisible()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getRx <em>Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getRx()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Rx();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getRy <em>Ry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ry</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getRy()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Ry();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getStroke()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getStrokeDasharray()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getStrokeDashoffset <em>Stroke Dashoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dashoffset</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getStrokeDashoffset()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_StrokeDashoffset();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getStrokeLinecap()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getStrokeLinejoin()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getStrokeMiterlimit <em>Stroke Miterlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Miterlimit</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getStrokeMiterlimit()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_StrokeMiterlimit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getStrokeOpacity()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getStrokewidth <em>Strokewidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strokewidth</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getStrokewidth()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Strokewidth();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getVisible()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getWidth()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getX()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RectPrimitive#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.RectPrimitive#getY()
	 * @see #getRectPrimitive()
	 * @generated
	 */
	EAttribute getRectPrimitive_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.RelativeClosePathCommand <em>Relative Close Path Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Close Path Command</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeClosePathCommand
	 * @generated
	 */
	EClass getRelativeClosePathCommand();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand <em>Relative Cubic Bezier Curve Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Cubic Bezier Curve Command</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand
	 * @generated
	 */
	EClass getRelativeCubicBezierCurveCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand#getX()
	 * @see #getRelativeCubicBezierCurveCommand()
	 * @generated
	 */
	EAttribute getRelativeCubicBezierCurveCommand_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand#getX1()
	 * @see #getRelativeCubicBezierCurveCommand()
	 * @generated
	 */
	EAttribute getRelativeCubicBezierCurveCommand_X1();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand#getX2()
	 * @see #getRelativeCubicBezierCurveCommand()
	 * @generated
	 */
	EAttribute getRelativeCubicBezierCurveCommand_X2();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand#getY()
	 * @see #getRelativeCubicBezierCurveCommand()
	 * @generated
	 */
	EAttribute getRelativeCubicBezierCurveCommand_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand#getY1()
	 * @see #getRelativeCubicBezierCurveCommand()
	 * @generated
	 */
	EAttribute getRelativeCubicBezierCurveCommand_Y1();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeCubicBezierCurveCommand#getY2()
	 * @see #getRelativeCubicBezierCurveCommand()
	 * @generated
	 */
	EAttribute getRelativeCubicBezierCurveCommand_Y2();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand <em>Relative Ellipse Arc Curve Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Ellipse Arc Curve Command</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand
	 * @generated
	 */
	EClass getRelativeEllipseArcCurveCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand#getAngle()
	 * @see #getRelativeEllipseArcCurveCommand()
	 * @generated
	 */
	EAttribute getRelativeEllipseArcCurveCommand_Angle();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand#getLargeArcFlag <em>Large Arc Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Large Arc Flag</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand#getLargeArcFlag()
	 * @see #getRelativeEllipseArcCurveCommand()
	 * @generated
	 */
	EAttribute getRelativeEllipseArcCurveCommand_LargeArcFlag();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand#getR1 <em>R1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R1</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand#getR1()
	 * @see #getRelativeEllipseArcCurveCommand()
	 * @generated
	 */
	EAttribute getRelativeEllipseArcCurveCommand_R1();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand#getR2 <em>R2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R2</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand#getR2()
	 * @see #getRelativeEllipseArcCurveCommand()
	 * @generated
	 */
	EAttribute getRelativeEllipseArcCurveCommand_R2();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand#getSweepFlag <em>Sweep Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sweep Flag</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand#getSweepFlag()
	 * @see #getRelativeEllipseArcCurveCommand()
	 * @generated
	 */
	EAttribute getRelativeEllipseArcCurveCommand_SweepFlag();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand#getX()
	 * @see #getRelativeEllipseArcCurveCommand()
	 * @generated
	 */
	EAttribute getRelativeEllipseArcCurveCommand_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeEllipseArcCurveCommand#getY()
	 * @see #getRelativeEllipseArcCurveCommand()
	 * @generated
	 */
	EAttribute getRelativeEllipseArcCurveCommand_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.RelativeLineToCommand <em>Relative Line To Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Line To Command</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeLineToCommand
	 * @generated
	 */
	EClass getRelativeLineToCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeLineToCommand#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeLineToCommand#getX()
	 * @see #getRelativeLineToCommand()
	 * @generated
	 */
	EAttribute getRelativeLineToCommand_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeLineToCommand#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeLineToCommand#getY()
	 * @see #getRelativeLineToCommand()
	 * @generated
	 */
	EAttribute getRelativeLineToCommand_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.RelativeMoveToCommand <em>Relative Move To Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Move To Command</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeMoveToCommand
	 * @generated
	 */
	EClass getRelativeMoveToCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeMoveToCommand#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeMoveToCommand#getX()
	 * @see #getRelativeMoveToCommand()
	 * @generated
	 */
	EAttribute getRelativeMoveToCommand_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.RelativeMoveToCommand#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.RelativeMoveToCommand#getY()
	 * @see #getRelativeMoveToCommand()
	 * @generated
	 */
	EAttribute getRelativeMoveToCommand_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive <em>Replicate Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replicate Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive
	 * @generated
	 */
	EClass getReplicatePrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getChildElements()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_ChildElements();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getGroup()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getTransformGroup <em>Transform Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transform Group</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getTransformGroup()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_TransformGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getReplicate <em>Replicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replicate</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getReplicate()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_Replicate();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getChildren()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getSwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Node</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getSwitchNode()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_SwitchNode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getClippingContainer <em>Clipping Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clipping Container</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getClippingContainer()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_ClippingContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getRectangle()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getCircle()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getEllipse()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getLine()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getPolyline()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getPolygon()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getPath()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getImage()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getSimpleText <em>Simple Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Text</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getSimpleText()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_SimpleText();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getArc()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getCrown()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getPolarLine()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getPointerArea()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getPointerGestureArea <em>Pointer Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getPointerGestureArea()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_PointerGestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getTouchArea()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getGestureArea()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getKeyboardInput()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getScrollWheelInput <em>Scroll Wheel Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Input</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getScrollWheelInput()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_ScrollWheelInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getCompositions()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EReference getReplicatePrimitive_Compositions();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getBlocked()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EAttribute getReplicatePrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getDatamodel <em>Datamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datamodel</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getDatamodel()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EAttribute getReplicatePrimitive_Datamodel();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getDrawingPriority()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EAttribute getReplicatePrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getEnable()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EAttribute getReplicatePrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getFirstIndex <em>First Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Index</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getFirstIndex()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EAttribute getReplicatePrimitive_FirstIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getId()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EAttribute getReplicatePrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getIndexAlias <em>Index Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Alias</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getIndexAlias()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EAttribute getReplicatePrimitive_IndexAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getInheritedBlocked()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EAttribute getReplicatePrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getInheritedEnable()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EAttribute getReplicatePrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getInheritedVisible()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EAttribute getReplicatePrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getInstanceAlias <em>Instance Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Alias</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getInstanceAlias()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EAttribute getReplicatePrimitive_InstanceAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getMaxNumberOfInstance <em>Max Number Of Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Instance</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getMaxNumberOfInstance()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EAttribute getReplicatePrimitive_MaxNumberOfInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getNumberOfInstance <em>Number Of Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Instance</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getNumberOfInstance()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EAttribute getReplicatePrimitive_NumberOfInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReplicatePrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.ReplicatePrimitive#getVisible()
	 * @see #getReplicatePrimitive()
	 * @generated
	 */
	EAttribute getReplicatePrimitive_Visible();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ReverseVideoProperties <em>Reverse Video Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reverse Video Properties</em>'.
	 * @see org.polarsys.ng661designer.part2.ReverseVideoProperties
	 * @generated
	 */
	EClass getReverseVideoProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReverseVideoProperties#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.polarsys.ng661designer.part2.ReverseVideoProperties#getActive()
	 * @see #getReverseVideoProperties()
	 * @generated
	 */
	EAttribute getReverseVideoProperties_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReverseVideoProperties#getAscenderMargin <em>Ascender Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ascender Margin</em>'.
	 * @see org.polarsys.ng661designer.part2.ReverseVideoProperties#getAscenderMargin()
	 * @see #getReverseVideoProperties()
	 * @generated
	 */
	EAttribute getReverseVideoProperties_AscenderMargin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReverseVideoProperties#getDescenderMargin <em>Descender Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descender Margin</em>'.
	 * @see org.polarsys.ng661designer.part2.ReverseVideoProperties#getDescenderMargin()
	 * @see #getReverseVideoProperties()
	 * @generated
	 */
	EAttribute getReverseVideoProperties_DescenderMargin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReverseVideoProperties#getEndMargin <em>End Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Margin</em>'.
	 * @see org.polarsys.ng661designer.part2.ReverseVideoProperties#getEndMargin()
	 * @see #getReverseVideoProperties()
	 * @generated
	 */
	EAttribute getReverseVideoProperties_EndMargin();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ReverseVideoProperties#getStartMargin <em>Start Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Margin</em>'.
	 * @see org.polarsys.ng661designer.part2.ReverseVideoProperties#getStartMargin()
	 * @see #getReverseVideoProperties()
	 * @generated
	 */
	EAttribute getReverseVideoProperties_StartMargin();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive <em>Scroll Wheel Input Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroll Wheel Input Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive
	 * @generated
	 */
	EClass getScrollWheelInputPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getBlocked()
	 * @see #getScrollWheelInputPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelInputPrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getEnable()
	 * @see #getScrollWheelInputPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelInputPrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getFocus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focus</em>'.
	 * @see org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getFocus()
	 * @see #getScrollWheelInputPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelInputPrimitive_Focus();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getId()
	 * @see #getScrollWheelInputPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelInputPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getInheritedBlocked()
	 * @see #getScrollWheelInputPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelInputPrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getInheritedEnable()
	 * @see #getScrollWheelInputPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelInputPrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getInheritedVisible()
	 * @see #getScrollWheelInputPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelInputPrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getNeedFocus <em>Need Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need Focus</em>'.
	 * @see org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getNeedFocus()
	 * @see #getScrollWheelInputPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelInputPrimitive_NeedFocus();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getPassThrough <em>Pass Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass Through</em>'.
	 * @see org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getPassThrough()
	 * @see #getScrollWheelInputPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelInputPrimitive_PassThrough();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.ScrollWheelInputPrimitive#getVisible()
	 * @see #getScrollWheelInputPrimitive()
	 * @generated
	 */
	EAttribute getScrollWheelInputPrimitive_Visible();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive <em>Simple Text Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Text Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive
	 * @generated
	 */
	EClass getSimpleTextPrimitive();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getWordSeparator <em>Word Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Word Separator</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getWordSeparator()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_WordSeparator();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getReverseVideo <em>Reverse Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reverse Video</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getReverseVideo()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EReference getSimpleTextPrimitive_ReverseVideo();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frame</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFrame()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EReference getSimpleTextPrimitive_Frame();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getUnderline <em>Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Underline</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getUnderline()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EReference getSimpleTextPrimitive_Underline();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getStrikeThrough <em>Strike Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strike Through</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getStrikeThrough()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EReference getSimpleTextPrimitive_StrikeThrough();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getAlignment()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBackgroundColor()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBackgroundOpacity <em>Background Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBackgroundOpacity()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_BackgroundOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getBlocked()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getDrawingPriority()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getEnable()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFill()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFillOpacity()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFlowDirection <em>Flow Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Direction</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFlowDirection()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_FlowDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFontName <em>Font Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Name</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFontName()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_FontName();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getFontSize()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getHeight()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getId()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedBlocked()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedEnable()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getInheritedVisible()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getLineGap <em>Line Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Gap</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getLineGap()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_LineGap();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getMultilineMode <em>Multiline Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiline Mode</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getMultilineMode()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_MultilineMode();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getTextFlow <em>Text Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Flow</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getTextFlow()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_TextFlow();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getValue()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getVisible()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getWidth()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getX()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SimpleTextPrimitive#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.SimpleTextPrimitive#getY()
	 * @see #getSimpleTextPrimitive()
	 * @generated
	 */
	EAttribute getSimpleTextPrimitive_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.StrikeThroughProperties <em>Strike Through Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strike Through Properties</em>'.
	 * @see org.polarsys.ng661designer.part2.StrikeThroughProperties
	 * @generated
	 */
	EClass getStrikeThroughProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.StrikeThroughProperties#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.polarsys.ng661designer.part2.StrikeThroughProperties#getActive()
	 * @see #getStrikeThroughProperties()
	 * @generated
	 */
	EAttribute getStrikeThroughProperties_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.StrikeThroughProperties#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.polarsys.ng661designer.part2.StrikeThroughProperties#getDistance()
	 * @see #getStrikeThroughProperties()
	 * @generated
	 */
	EAttribute getStrikeThroughProperties_Distance();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.StrikeThroughProperties#getStrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see org.polarsys.ng661designer.part2.StrikeThroughProperties#getStrokeWidth()
	 * @see #getStrikeThroughProperties()
	 * @generated
	 */
	EAttribute getStrikeThroughProperties_StrokeWidth();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.StructDefinitionType <em>Struct Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Definition Type</em>'.
	 * @see org.polarsys.ng661designer.part2.StructDefinitionType
	 * @generated
	 */
	EClass getStructDefinitionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructDefinitionType#getFieldDefinition <em>Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Definition</em>'.
	 * @see org.polarsys.ng661designer.part2.StructDefinitionType#getFieldDefinition()
	 * @see #getStructDefinitionType()
	 * @generated
	 */
	EReference getStructDefinitionType_FieldDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructDefinitionType#getStructFieldDefinition <em>Struct Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Field Definition</em>'.
	 * @see org.polarsys.ng661designer.part2.StructDefinitionType#getStructFieldDefinition()
	 * @see #getStructDefinitionType()
	 * @generated
	 */
	EReference getStructDefinitionType_StructFieldDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructDefinitionType#getArrayFieldDefinition <em>Array Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Field Definition</em>'.
	 * @see org.polarsys.ng661designer.part2.StructDefinitionType#getArrayFieldDefinition()
	 * @see #getStructDefinitionType()
	 * @generated
	 */
	EReference getStructDefinitionType_ArrayFieldDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructDefinitionType#getEnumFieldDefinition <em>Enum Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Field Definition</em>'.
	 * @see org.polarsys.ng661designer.part2.StructDefinitionType#getEnumFieldDefinition()
	 * @see #getStructDefinitionType()
	 * @generated
	 */
	EReference getStructDefinitionType_EnumFieldDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructDefinitionType#getUnionFieldDefinition <em>Union Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Field Definition</em>'.
	 * @see org.polarsys.ng661designer.part2.StructDefinitionType#getUnionFieldDefinition()
	 * @see #getStructDefinitionType()
	 * @generated
	 */
	EReference getStructDefinitionType_UnionFieldDefinition();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.StructEntryType <em>Struct Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Entry Type</em>'.
	 * @see org.polarsys.ng661designer.part2.StructEntryType
	 * @generated
	 */
	EClass getStructEntryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructEntryType#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructEntryType#getField()
	 * @see #getStructEntryType()
	 * @generated
	 */
	EReference getStructEntryType_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructEntryType#getArrayField <em>Array Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructEntryType#getArrayField()
	 * @see #getStructEntryType()
	 * @generated
	 */
	EReference getStructEntryType_ArrayField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructEntryType#getStructField <em>Struct Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructEntryType#getStructField()
	 * @see #getStructEntryType()
	 * @generated
	 */
	EReference getStructEntryType_StructField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructEntryType#getEnumField <em>Enum Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructEntryType#getEnumField()
	 * @see #getStructEntryType()
	 * @generated
	 */
	EReference getStructEntryType_EnumField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructEntryType#getUnionField <em>Union Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructEntryType#getUnionField()
	 * @see #getStructEntryType()
	 * @generated
	 */
	EReference getStructEntryType_UnionField();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.StructEntryType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.polarsys.ng661designer.part2.StructEntryType#getIndex()
	 * @see #getStructEntryType()
	 * @generated
	 */
	EAttribute getStructEntryType_Index();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.StructEventType <em>Struct Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Event Type</em>'.
	 * @see org.polarsys.ng661designer.part2.StructEventType
	 * @generated
	 */
	EClass getStructEventType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructEventType#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructEventType#getField()
	 * @see #getStructEventType()
	 * @generated
	 */
	EReference getStructEventType_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructEventType#getArrayField <em>Array Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructEventType#getArrayField()
	 * @see #getStructEventType()
	 * @generated
	 */
	EReference getStructEventType_ArrayField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructEventType#getStructField <em>Struct Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructEventType#getStructField()
	 * @see #getStructEventType()
	 * @generated
	 */
	EReference getStructEventType_StructField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructEventType#getEnumField <em>Enum Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructEventType#getEnumField()
	 * @see #getStructEventType()
	 * @generated
	 */
	EReference getStructEventType_EnumField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructEventType#getUnionField <em>Union Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructEventType#getUnionField()
	 * @see #getStructEventType()
	 * @generated
	 */
	EReference getStructEventType_UnionField();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.StructEventType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.StructEventType#getName()
	 * @see #getStructEventType()
	 * @generated
	 */
	EAttribute getStructEventType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.StructEventType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.ng661designer.part2.StructEventType#getType()
	 * @see #getStructEventType()
	 * @generated
	 */
	EAttribute getStructEventType_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.StructFieldType <em>Struct Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Field Type</em>'.
	 * @see org.polarsys.ng661designer.part2.StructFieldType
	 * @generated
	 */
	EClass getStructFieldType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructFieldType#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructFieldType#getField()
	 * @see #getStructFieldType()
	 * @generated
	 */
	EReference getStructFieldType_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructFieldType#getArrayField <em>Array Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructFieldType#getArrayField()
	 * @see #getStructFieldType()
	 * @generated
	 */
	EReference getStructFieldType_ArrayField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructFieldType#getStructField <em>Struct Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructFieldType#getStructField()
	 * @see #getStructFieldType()
	 * @generated
	 */
	EReference getStructFieldType_StructField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructFieldType#getEnumField <em>Enum Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructFieldType#getEnumField()
	 * @see #getStructFieldType()
	 * @generated
	 */
	EReference getStructFieldType_EnumField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructFieldType#getUnionField <em>Union Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructFieldType#getUnionField()
	 * @see #getStructFieldType()
	 * @generated
	 */
	EReference getStructFieldType_UnionField();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.StructFieldType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.StructFieldType#getName()
	 * @see #getStructFieldType()
	 * @generated
	 */
	EAttribute getStructFieldType_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.StructPropertyType <em>Struct Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Property Type</em>'.
	 * @see org.polarsys.ng661designer.part2.StructPropertyType
	 * @generated
	 */
	EClass getStructPropertyType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructPropertyType#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructPropertyType#getField()
	 * @see #getStructPropertyType()
	 * @generated
	 */
	EReference getStructPropertyType_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructPropertyType#getArrayField <em>Array Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructPropertyType#getArrayField()
	 * @see #getStructPropertyType()
	 * @generated
	 */
	EReference getStructPropertyType_ArrayField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructPropertyType#getStructField <em>Struct Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructPropertyType#getStructField()
	 * @see #getStructPropertyType()
	 * @generated
	 */
	EReference getStructPropertyType_StructField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructPropertyType#getEnumField <em>Enum Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructPropertyType#getEnumField()
	 * @see #getStructPropertyType()
	 * @generated
	 */
	EReference getStructPropertyType_EnumField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.StructPropertyType#getUnionField <em>Union Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Field</em>'.
	 * @see org.polarsys.ng661designer.part2.StructPropertyType#getUnionField()
	 * @see #getStructPropertyType()
	 * @generated
	 */
	EReference getStructPropertyType_UnionField();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.StructPropertyType#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modality</em>'.
	 * @see org.polarsys.ng661designer.part2.StructPropertyType#getModality()
	 * @see #getStructPropertyType()
	 * @generated
	 */
	EAttribute getStructPropertyType_Modality();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.StructPropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.StructPropertyType#getName()
	 * @see #getStructPropertyType()
	 * @generated
	 */
	EAttribute getStructPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.StructPropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.ng661designer.part2.StructPropertyType#getType()
	 * @see #getStructPropertyType()
	 * @generated
	 */
	EAttribute getStructPropertyType_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive <em>Switch Node Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Node Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive
	 * @generated
	 */
	EClass getSwitchNodePrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getChildElements()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_ChildElements();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getGroup()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getTransformGroup <em>Transform Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transform Group</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getTransformGroup()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_TransformGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getReplicate <em>Replicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replicate</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getReplicate()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_Replicate();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getChildren()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getSwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Node</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getSwitchNode()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_SwitchNode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getClippingContainer <em>Clipping Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clipping Container</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getClippingContainer()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_ClippingContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getRectangle()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getCircle()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getEllipse()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getLine()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getPolyline()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getPolygon()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getPath()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getImage()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getSimpleText <em>Simple Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Text</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getSimpleText()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_SimpleText();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getArc()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getCrown()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getPolarLine()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getPointerArea()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getPointerGestureArea <em>Pointer Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getPointerGestureArea()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_PointerGestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getTouchArea()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getGestureArea()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getKeyboardInput()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getScrollWheelInput <em>Scroll Wheel Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Input</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getScrollWheelInput()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_ScrollWheelInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getCompositions()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EReference getSwitchNodePrimitive_Compositions();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getActiveChild <em>Active Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Child</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getActiveChild()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EAttribute getSwitchNodePrimitive_ActiveChild();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getBlocked()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EAttribute getSwitchNodePrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getEnable()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EAttribute getSwitchNodePrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getId()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EAttribute getSwitchNodePrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getInheritedBlocked()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EAttribute getSwitchNodePrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getInheritedEnable()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EAttribute getSwitchNodePrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getInheritedVisible()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EAttribute getSwitchNodePrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.SwitchNodePrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.SwitchNodePrimitive#getVisible()
	 * @see #getSwitchNodePrimitive()
	 * @generated
	 */
	EAttribute getSwitchNodePrimitive_Visible();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive <em>Touch Area Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Area Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive
	 * @generated
	 */
	EClass getTouchAreaPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive#getBlocked()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive#getEnable()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive#getHeight()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive#getId()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive#getInheritedBlocked()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive#getInheritedEnable()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive#getInheritedVisible()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive#getMaximumTouchPoints <em>Maximum Touch Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Touch Points</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive#getMaximumTouchPoints()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_MaximumTouchPoints();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive#getMinimumTouchPoints <em>Minimum Touch Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Touch Points</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive#getMinimumTouchPoints()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_MinimumTouchPoints();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive#getPassThrough <em>Pass Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass Through</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive#getPassThrough()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_PassThrough();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive#getPreventStealing <em>Prevent Stealing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prevent Stealing</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive#getPreventStealing()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_PreventStealing();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive#getVisible()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive#getWidth()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive#getX()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TouchAreaPrimitive#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.ng661designer.part2.TouchAreaPrimitive#getY()
	 * @see #getTouchAreaPrimitive()
	 * @generated
	 */
	EAttribute getTouchAreaPrimitive_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive <em>Transform Group Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Group Primitive</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive
	 * @generated
	 */
	EClass getTransformGroupPrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getChildElements()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_ChildElements();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getTransform()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_Transform();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getGroup()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getTransformGroup <em>Transform Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transform Group</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getTransformGroup()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_TransformGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getReplicate <em>Replicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replicate</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getReplicate()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_Replicate();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getChildren()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getSwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Node</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getSwitchNode()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_SwitchNode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getClippingContainer <em>Clipping Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clipping Container</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getClippingContainer()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_ClippingContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getRectangle()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getCircle()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getEllipse()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getLine()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getPolyline()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getPolygon()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getPath()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getImage()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getSimpleText <em>Simple Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Text</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getSimpleText()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_SimpleText();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getArc()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getCrown()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getPolarLine()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getPointerArea()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getPointerGestureArea <em>Pointer Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getPointerGestureArea()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_PointerGestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getTouchArea()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getGestureArea()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getKeyboardInput()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getScrollWheelInput <em>Scroll Wheel Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Input</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getScrollWheelInput()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_ScrollWheelInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getCompositions()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EReference getTransformGroupPrimitive_Compositions();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getBlocked()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EAttribute getTransformGroupPrimitive_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getDrawingPriority <em>Drawing Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Priority</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getDrawingPriority()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EAttribute getTransformGroupPrimitive_DrawingPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getEnable()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EAttribute getTransformGroupPrimitive_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getId()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EAttribute getTransformGroupPrimitive_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getInheritedBlocked <em>Inherited Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Blocked</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getInheritedBlocked()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EAttribute getTransformGroupPrimitive_InheritedBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getInheritedEnable <em>Inherited Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Enable</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getInheritedEnable()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EAttribute getTransformGroupPrimitive_InheritedEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getInheritedVisible <em>Inherited Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getInheritedVisible()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EAttribute getTransformGroupPrimitive_InheritedVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformGroupPrimitive#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformGroupPrimitive#getVisible()
	 * @see #getTransformGroupPrimitive()
	 * @generated
	 */
	EAttribute getTransformGroupPrimitive_Visible();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.TransformMatrixType <em>Transform Matrix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Matrix Type</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformMatrixType
	 * @generated
	 */
	EClass getTransformMatrixType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformMatrixType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformMatrixType#getA()
	 * @see #getTransformMatrixType()
	 * @generated
	 */
	EAttribute getTransformMatrixType_A();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformMatrixType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformMatrixType#getB()
	 * @see #getTransformMatrixType()
	 * @generated
	 */
	EAttribute getTransformMatrixType_B();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformMatrixType#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformMatrixType#getC()
	 * @see #getTransformMatrixType()
	 * @generated
	 */
	EAttribute getTransformMatrixType_C();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformMatrixType#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformMatrixType#getD()
	 * @see #getTransformMatrixType()
	 * @generated
	 */
	EAttribute getTransformMatrixType_D();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformMatrixType#getE <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformMatrixType#getE()
	 * @see #getTransformMatrixType()
	 * @generated
	 */
	EAttribute getTransformMatrixType_E();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformMatrixType#getF <em>F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>F</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformMatrixType#getF()
	 * @see #getTransformMatrixType()
	 * @generated
	 */
	EAttribute getTransformMatrixType_F();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.TransformRotateType <em>Transform Rotate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Rotate Type</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformRotateType
	 * @generated
	 */
	EClass getTransformRotateType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformRotateType#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformRotateType#getAngle()
	 * @see #getTransformRotateType()
	 * @generated
	 */
	EAttribute getTransformRotateType_Angle();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformRotateType#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformRotateType#getCx()
	 * @see #getTransformRotateType()
	 * @generated
	 */
	EAttribute getTransformRotateType_Cx();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformRotateType#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformRotateType#getCy()
	 * @see #getTransformRotateType()
	 * @generated
	 */
	EAttribute getTransformRotateType_Cy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.TransformScaleType <em>Transform Scale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Scale Type</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformScaleType
	 * @generated
	 */
	EClass getTransformScaleType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformScaleType#getSx <em>Sx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sx</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformScaleType#getSx()
	 * @see #getTransformScaleType()
	 * @generated
	 */
	EAttribute getTransformScaleType_Sx();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformScaleType#getSy <em>Sy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sy</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformScaleType#getSy()
	 * @see #getTransformScaleType()
	 * @generated
	 */
	EAttribute getTransformScaleType_Sy();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.TransformSkewXType <em>Transform Skew XType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Skew XType</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformSkewXType
	 * @generated
	 */
	EClass getTransformSkewXType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformSkewXType#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformSkewXType#getAngle()
	 * @see #getTransformSkewXType()
	 * @generated
	 */
	EAttribute getTransformSkewXType_Angle();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.TransformSkewYType <em>Transform Skew YType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Skew YType</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformSkewYType
	 * @generated
	 */
	EClass getTransformSkewYType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformSkewYType#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformSkewYType#getAngle()
	 * @see #getTransformSkewYType()
	 * @generated
	 */
	EAttribute getTransformSkewYType_Angle();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.TransformTranslateType <em>Transform Translate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Translate Type</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformTranslateType
	 * @generated
	 */
	EClass getTransformTranslateType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformTranslateType#getTx <em>Tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformTranslateType#getTx()
	 * @see #getTransformTranslateType()
	 * @generated
	 */
	EAttribute getTransformTranslateType_Tx();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TransformTranslateType#getTy <em>Ty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ty</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformTranslateType#getTy()
	 * @see #getTransformTranslateType()
	 * @generated
	 */
	EAttribute getTransformTranslateType_Ty();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.TransformType <em>Transform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Type</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformType
	 * @generated
	 */
	EClass getTransformType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.TransformType#getTransformMatrix <em>Transform Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transform Matrix</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformType#getTransformMatrix()
	 * @see #getTransformType()
	 * @generated
	 */
	EReference getTransformType_TransformMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.TransformType#getTransformTranslate <em>Transform Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transform Translate</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformType#getTransformTranslate()
	 * @see #getTransformType()
	 * @generated
	 */
	EReference getTransformType_TransformTranslate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.TransformType#getTransformScale <em>Transform Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transform Scale</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformType#getTransformScale()
	 * @see #getTransformType()
	 * @generated
	 */
	EReference getTransformType_TransformScale();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.TransformType#getTransformRotate <em>Transform Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transform Rotate</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformType#getTransformRotate()
	 * @see #getTransformType()
	 * @generated
	 */
	EReference getTransformType_TransformRotate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.TransformType#getTransformSkewX <em>Transform Skew X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transform Skew X</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformType#getTransformSkewX()
	 * @see #getTransformType()
	 * @generated
	 */
	EReference getTransformType_TransformSkewX();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.TransformType#getTransformSkewY <em>Transform Skew Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transform Skew Y</em>'.
	 * @see org.polarsys.ng661designer.part2.TransformType#getTransformSkewY()
	 * @see #getTransformType()
	 * @generated
	 */
	EReference getTransformType_TransformSkewY();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.TreeType <em>Tree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Type</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType
	 * @generated
	 */
	EClass getTreeType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.TreeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getGroup()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Import</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getImport()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Import();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group1</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getGroup1()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Group1();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getTransformGroup <em>Transform Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transform Group</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getTransformGroup()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_TransformGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getReplicate <em>Replicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replicate</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getReplicate()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Replicate();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getChildren()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getSwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Node</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getSwitchNode()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_SwitchNode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getClippingContainer <em>Clipping Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clipping Container</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getClippingContainer()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_ClippingContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getRectangle()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getCircle()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getEllipse()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getLine()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getPolyline()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getPolygon()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getPath()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getImage()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getSimpleText <em>Simple Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Text</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getSimpleText()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_SimpleText();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getArc()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getCrown()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getPolarLine()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getPointerArea()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getPointerGestureArea <em>Pointer Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getPointerGestureArea()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_PointerGestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getTouchArea()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getGestureArea()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getKeyboardInput()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getScrollWheelInput <em>Scroll Wheel Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Input</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getScrollWheelInput()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_ScrollWheelInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clock</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getClock()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Clock();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.TreeType#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeType#getCompositions()
	 * @see #getTreeType()
	 * @generated
	 */
	EReference getTreeType_Compositions();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.TypeAlternativeType <em>Type Alternative Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Alternative Type</em>'.
	 * @see org.polarsys.ng661designer.part2.TypeAlternativeType
	 * @generated
	 */
	EClass getTypeAlternativeType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TypeAlternativeType#getMaxStringLength <em>Max String Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max String Length</em>'.
	 * @see org.polarsys.ng661designer.part2.TypeAlternativeType#getMaxStringLength()
	 * @see #getTypeAlternativeType()
	 * @generated
	 */
	EAttribute getTypeAlternativeType_MaxStringLength();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TypeAlternativeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.TypeAlternativeType#getName()
	 * @see #getTypeAlternativeType()
	 * @generated
	 */
	EAttribute getTypeAlternativeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TypeAlternativeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.ng661designer.part2.TypeAlternativeType#getType()
	 * @see #getTypeAlternativeType()
	 * @generated
	 */
	EAttribute getTypeAlternativeType_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.TypeDefinitionAbstractType <em>Type Definition Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition Abstract Type</em>'.
	 * @see org.polarsys.ng661designer.part2.TypeDefinitionAbstractType
	 * @generated
	 */
	EClass getTypeDefinitionAbstractType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.TypeDefinitionAbstractType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.TypeDefinitionAbstractType#getName()
	 * @see #getTypeDefinitionAbstractType()
	 * @generated
	 */
	EAttribute getTypeDefinitionAbstractType_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.UnderlineProperties <em>Underline Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Underline Properties</em>'.
	 * @see org.polarsys.ng661designer.part2.UnderlineProperties
	 * @generated
	 */
	EClass getUnderlineProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnderlineProperties#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.polarsys.ng661designer.part2.UnderlineProperties#getActive()
	 * @see #getUnderlineProperties()
	 * @generated
	 */
	EAttribute getUnderlineProperties_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnderlineProperties#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.polarsys.ng661designer.part2.UnderlineProperties#getDistance()
	 * @see #getUnderlineProperties()
	 * @generated
	 */
	EAttribute getUnderlineProperties_Distance();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnderlineProperties#getStrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see org.polarsys.ng661designer.part2.UnderlineProperties#getStrokeWidth()
	 * @see #getUnderlineProperties()
	 * @generated
	 */
	EAttribute getUnderlineProperties_StrokeWidth();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.UnionDefinitionType <em>Union Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Definition Type</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionDefinitionType
	 * @generated
	 */
	EClass getUnionDefinitionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.UnionDefinitionType#getTypeAlternative <em>Type Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Alternative</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionDefinitionType#getTypeAlternative()
	 * @see #getUnionDefinitionType()
	 * @generated
	 */
	EReference getUnionDefinitionType_TypeAlternative();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.UnionEntryType <em>Union Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Entry Type</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionEntryType
	 * @generated
	 */
	EClass getUnionEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnionEntryType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionEntryType#getIndex()
	 * @see #getUnionEntryType()
	 * @generated
	 */
	EAttribute getUnionEntryType_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnionEntryType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionEntryType#getValue()
	 * @see #getUnionEntryType()
	 * @generated
	 */
	EAttribute getUnionEntryType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnionEntryType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionEntryType#getValueType()
	 * @see #getUnionEntryType()
	 * @generated
	 */
	EAttribute getUnionEntryType_ValueType();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.UnionEventType <em>Union Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Event Type</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionEventType
	 * @generated
	 */
	EClass getUnionEventType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnionEventType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionEventType#getName()
	 * @see #getUnionEventType()
	 * @generated
	 */
	EAttribute getUnionEventType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnionEventType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionEventType#getType()
	 * @see #getUnionEventType()
	 * @generated
	 */
	EAttribute getUnionEventType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnionEventType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionEventType#getValue()
	 * @see #getUnionEventType()
	 * @generated
	 */
	EAttribute getUnionEventType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnionEventType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionEventType#getValueType()
	 * @see #getUnionEventType()
	 * @generated
	 */
	EAttribute getUnionEventType_ValueType();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.UnionFieldType <em>Union Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Field Type</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionFieldType
	 * @generated
	 */
	EClass getUnionFieldType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnionFieldType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionFieldType#getName()
	 * @see #getUnionFieldType()
	 * @generated
	 */
	EAttribute getUnionFieldType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnionFieldType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionFieldType#getValue()
	 * @see #getUnionFieldType()
	 * @generated
	 */
	EAttribute getUnionFieldType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnionFieldType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionFieldType#getValueType()
	 * @see #getUnionFieldType()
	 * @generated
	 */
	EAttribute getUnionFieldType_ValueType();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.UnionPropertyType <em>Union Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Property Type</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionPropertyType
	 * @generated
	 */
	EClass getUnionPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnionPropertyType#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modality</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionPropertyType#getModality()
	 * @see #getUnionPropertyType()
	 * @generated
	 */
	EAttribute getUnionPropertyType_Modality();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnionPropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionPropertyType#getName()
	 * @see #getUnionPropertyType()
	 * @generated
	 */
	EAttribute getUnionPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnionPropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionPropertyType#getType()
	 * @see #getUnionPropertyType()
	 * @generated
	 */
	EAttribute getUnionPropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnionPropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionPropertyType#getValue()
	 * @see #getUnionPropertyType()
	 * @generated
	 */
	EAttribute getUnionPropertyType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.UnionPropertyType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.polarsys.ng661designer.part2.UnionPropertyType#getValueType()
	 * @see #getUnionPropertyType()
	 * @generated
	 */
	EAttribute getUnionPropertyType_ValueType();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.TreeTypes <em>Tree Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Types</em>'.
	 * @see org.polarsys.ng661designer.part2.TreeTypes
	 * @generated
	 */
	EClass getTreeTypes();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.ClipPathTypes <em>Clip Path Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clip Path Types</em>'.
	 * @see org.polarsys.ng661designer.part2.ClipPathTypes
	 * @generated
	 */
	EClass getClipPathTypes();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value</em>'.
	 * @see org.polarsys.ng661designer.part2.PropertyValue
	 * @generated
	 */
	EClass getPropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.ng661designer.part2.PropertyValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.ng661designer.part2.PropertyValue#getValue()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EAttribute getPropertyValue_Value();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.ng661designer.part2.PropertyValue#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.polarsys.ng661designer.part2.PropertyValue#getProperty()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EReference getPropertyValue_Property();

	/**
	 * Returns the meta object for class '{@link org.polarsys.ng661designer.part2.WidgetComposition <em>Widget Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Composition</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition
	 * @generated
	 */
	EClass getWidgetComposition();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.ng661designer.part2.WidgetComposition#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representation</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getRepresentation()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Representation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getValues()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Values();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getChildElements()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_ChildElements();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getGroup()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getTransformGroup <em>Transform Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transform Group</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getTransformGroup()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_TransformGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getReplicate <em>Replicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replicate</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getReplicate()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Replicate();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getChildren()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getSwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Node</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getSwitchNode()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_SwitchNode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getClippingContainer <em>Clipping Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clipping Container</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getClippingContainer()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_ClippingContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getRectangle()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Rectangle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circle</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getCircle()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Circle();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getEllipse()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Ellipse();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getLine()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Line();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polyline</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getPolyline()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Polyline();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getPolygon()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Polygon();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getPath()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getImage()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Image();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getSimpleText <em>Simple Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Text</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getSimpleText()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_SimpleText();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getArc()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Arc();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getCrown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crown</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getCrown()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Crown();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getPolarLine <em>Polar Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polar Line</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getPolarLine()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_PolarLine();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getPointerArea <em>Pointer Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Area</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getPointerArea()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_PointerArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getPointerGestureArea <em>Pointer Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointer Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getPointerGestureArea()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_PointerGestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getTouchArea <em>Touch Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touch Area</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getTouchArea()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_TouchArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getGestureArea <em>Gesture Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gesture Area</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getGestureArea()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_GestureArea();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getScrollWheelInput <em>Scroll Wheel Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scroll Wheel Input</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getScrollWheelInput()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_ScrollWheelInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getKeyboardInput <em>Keyboard Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keyboard Input</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getKeyboardInput()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_KeyboardInput();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.ng661designer.part2.WidgetComposition#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clock</em>'.
	 * @see org.polarsys.ng661designer.part2.WidgetComposition#getClock()
	 * @see #getWidgetComposition()
	 * @generated
	 */
	EReference getWidgetComposition_Clock();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.AlignementTypeVal <em>Alignement Type Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignement Type Val</em>'.
	 * @see org.polarsys.ng661designer.part2.AlignementTypeVal
	 * @generated
	 */
	EEnum getAlignementTypeVal();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.AlignmentType <em>Alignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignment Type</em>'.
	 * @see org.polarsys.ng661designer.part2.AlignmentType
	 * @generated
	 */
	EEnum getAlignmentType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.AlignmentType1 <em>Alignment Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignment Type1</em>'.
	 * @see org.polarsys.ng661designer.part2.AlignmentType1
	 * @generated
	 */
	EEnum getAlignmentType1();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.AspectRatioType1 <em>Aspect Ratio Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aspect Ratio Type1</em>'.
	 * @see org.polarsys.ng661designer.part2.AspectRatioType1
	 * @generated
	 */
	EEnum getAspectRatioType1();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.AspectRatioTypeVal <em>Aspect Ratio Type Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aspect Ratio Type Val</em>'.
	 * @see org.polarsys.ng661designer.part2.AspectRatioTypeVal
	 * @generated
	 */
	EEnum getAspectRatioTypeVal();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.BooleanTypeVal <em>Boolean Type Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Type Val</em>'.
	 * @see org.polarsys.ng661designer.part2.BooleanTypeVal
	 * @generated
	 */
	EEnum getBooleanTypeVal();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.ClipRuleType <em>Clip Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clip Rule Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ClipRuleType
	 * @generated
	 */
	EEnum getClipRuleType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.ColorReferenceType <em>Color Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Reference Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ColorReferenceType
	 * @generated
	 */
	EEnum getColorReferenceType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.FillRuleType1 <em>Fill Rule Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fill Rule Type1</em>'.
	 * @see org.polarsys.ng661designer.part2.FillRuleType1
	 * @generated
	 */
	EEnum getFillRuleType1();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.FillRuleTypeVal <em>Fill Rule Type Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fill Rule Type Val</em>'.
	 * @see org.polarsys.ng661designer.part2.FillRuleTypeVal
	 * @generated
	 */
	EEnum getFillRuleTypeVal();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.FlowDirectionType <em>Flow Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flow Direction Type</em>'.
	 * @see org.polarsys.ng661designer.part2.FlowDirectionType
	 * @generated
	 */
	EEnum getFlowDirectionType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.InstantiationModeType <em>Instantiation Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instantiation Mode Type</em>'.
	 * @see org.polarsys.ng661designer.part2.InstantiationModeType
	 * @generated
	 */
	EEnum getInstantiationModeType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.ModalityType <em>Modality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modality Type</em>'.
	 * @see org.polarsys.ng661designer.part2.ModalityType
	 * @generated
	 */
	EEnum getModalityType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.ModalityType1 <em>Modality Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modality Type1</em>'.
	 * @see org.polarsys.ng661designer.part2.ModalityType1
	 * @generated
	 */
	EEnum getModalityType1();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.ModalityType2 <em>Modality Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modality Type2</em>'.
	 * @see org.polarsys.ng661designer.part2.ModalityType2
	 * @generated
	 */
	EEnum getModalityType2();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.MultilineModeType <em>Multiline Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiline Mode Type</em>'.
	 * @see org.polarsys.ng661designer.part2.MultilineModeType
	 * @generated
	 */
	EEnum getMultilineModeType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.StrokeLinecapType <em>Stroke Linecap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stroke Linecap Type</em>'.
	 * @see org.polarsys.ng661designer.part2.StrokeLinecapType
	 * @generated
	 */
	EEnum getStrokeLinecapType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.StrokeLinejoinType <em>Stroke Linejoin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stroke Linejoin Type</em>'.
	 * @see org.polarsys.ng661designer.part2.StrokeLinejoinType
	 * @generated
	 */
	EEnum getStrokeLinejoinType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.TextFlowType <em>Text Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Flow Type</em>'.
	 * @see org.polarsys.ng661designer.part2.TextFlowType
	 * @generated
	 */
	EEnum getTextFlowType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.ng661designer.part2.VisibilityTypeVal <em>Visibility Type Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Type Val</em>'.
	 * @see org.polarsys.ng661designer.part2.VisibilityTypeVal
	 * @generated
	 */
	EEnum getVisibilityTypeVal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Alignement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Alignement Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='AlignementType' memberTypes='AlignementTypeVal Expression'"
	 * @generated
	 */
	EDataType getAlignementType();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.AlignementTypeVal <em>Alignement Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Alignement Type Val Object</em>'.
	 * @see org.polarsys.ng661designer.part2.AlignementTypeVal
	 * @model instanceClass="org.polarsys.ng661designer.part2.AlignementTypeVal"
	 *        extendedMetaData="name='AlignementTypeVal:Object' baseType='AlignementTypeVal'"
	 * @generated
	 */
	EDataType getAlignementTypeValObject();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.AlignmentType <em>Alignment Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Alignment Type Object</em>'.
	 * @see org.polarsys.ng661designer.part2.AlignmentType
	 * @model instanceClass="org.polarsys.ng661designer.part2.AlignmentType"
	 *        extendedMetaData="name='alignment_._type:Object' baseType='alignment_._type'"
	 * @generated
	 */
	EDataType getAlignmentTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.AlignmentType1 <em>Alignment Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Alignment Type Object1</em>'.
	 * @see org.polarsys.ng661designer.part2.AlignmentType1
	 * @model instanceClass="org.polarsys.ng661designer.part2.AlignmentType1"
	 *        extendedMetaData="name='alignment_._1_._type:Object' baseType='alignment_._1_._type'"
	 * @generated
	 */
	EDataType getAlignmentTypeObject1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Angle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='AngleType' memberTypes='AngleTypeVal Expression'"
	 * @generated
	 */
	EDataType getAngleType();

	/**
	 * Returns the meta object for data type '<em>Angle Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle Type Val</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='AngleTypeVal' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='-360.0' maxInclusive='360.0'"
	 * @generated
	 */
	EDataType getAngleTypeVal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Angle Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle Type Val Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='AngleTypeVal:Object' baseType='AngleTypeVal'"
	 * @generated
	 */
	EDataType getAngleTypeValObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Aspect Ratio Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Aspect Ratio Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='AspectRatioType' memberTypes='AspectRatioTypeVal Expression'"
	 * @generated
	 */
	EDataType getAspectRatioType();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.AspectRatioType1 <em>Aspect Ratio Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Aspect Ratio Type Object</em>'.
	 * @see org.polarsys.ng661designer.part2.AspectRatioType1
	 * @model instanceClass="org.polarsys.ng661designer.part2.AspectRatioType1"
	 *        extendedMetaData="name='aspectRatio_._type:Object' baseType='aspectRatio_._type'"
	 * @generated
	 */
	EDataType getAspectRatioTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.AspectRatioTypeVal <em>Aspect Ratio Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Aspect Ratio Type Val Object</em>'.
	 * @see org.polarsys.ng661designer.part2.AspectRatioTypeVal
	 * @model instanceClass="org.polarsys.ng661designer.part2.AspectRatioTypeVal"
	 *        extendedMetaData="name='AspectRatioTypeVal:Object' baseType='AspectRatioTypeVal'"
	 * @generated
	 */
	EDataType getAspectRatioTypeValObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='BooleanType' memberTypes='BooleanTypeVal Expression'"
	 * @generated
	 */
	EDataType getBooleanType();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.BooleanTypeVal <em>Boolean Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Type Val Object</em>'.
	 * @see org.polarsys.ng661designer.part2.BooleanTypeVal
	 * @model instanceClass="org.polarsys.ng661designer.part2.BooleanTypeVal"
	 *        extendedMetaData="name='BooleanTypeVal:Object' baseType='BooleanTypeVal'"
	 * @generated
	 */
	EDataType getBooleanTypeValObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Character Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Character Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CharacterType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='1'"
	 * @generated
	 */
	EDataType getCharacterType();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.ClipRuleType <em>Clip Rule Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Clip Rule Type Object</em>'.
	 * @see org.polarsys.ng661designer.part2.ClipRuleType
	 * @model instanceClass="org.polarsys.ng661designer.part2.ClipRuleType"
	 *        extendedMetaData="name='clipRule_._type:Object' baseType='clipRule_._type'"
	 * @generated
	 */
	EDataType getClipRuleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.ColorReferenceType <em>Color Reference Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Reference Type Object</em>'.
	 * @see org.polarsys.ng661designer.part2.ColorReferenceType
	 * @model instanceClass="org.polarsys.ng661designer.part2.ColorReferenceType"
	 *        extendedMetaData="name='ColorReferenceType:Object' baseType='ColorReferenceType'"
	 * @generated
	 */
	EDataType getColorReferenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Color RGBHEX Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color RGBHEX Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ColorRGB_HEX_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='#[0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F])?'"
	 * @generated
	 */
	EDataType getColorRGBHEXType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Color RGB Rgb255 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color RGB Rgb255 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ColorRGB_rgb255_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='rgb\\(\\s*([0-9]?[0-9]|[01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])\\s*,\\s*([0-9]?[0-9]|[01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])\\s*,\\s*([0-9]?[0-9]|[01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])\\s*\\)'"
	 * @generated
	 */
	EDataType getColorRGBRgb255Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Color RGB Rgb Percent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color RGB Rgb Percent Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ColorRGB_rgbPercent_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='rgb\\(\\s*([0-9]?[0-9]|0?[0-9][0-9]|100)\\s*%25\\s*,\\s*([0-9]?[0-9]|0?[0-9][0-9]|100)\\s*%25\\s*,\\s*([0-9]?[0-9]|0?[0-9][0-9]|100)\\s*%25\\s*\\)'"
	 * @generated
	 */
	EDataType getColorRGBRgbPercentType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Color RGB Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color RGB Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ColorRGBType' memberTypes='ColorRGB_rgbPercent_Type ColorRGB_rgb255_Type ColorRGB_HEX_Type'"
	 * @generated
	 */
	EDataType getColorRGBType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='ColorType' memberTypes='ColorRGBType ColorReferenceType'"
	 * @generated
	 */
	EDataType getColorType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='DateTimeType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#dateTime Expression'"
	 * @generated
	 */
	EDataType getDateTimeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='DateType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#date Expression'"
	 * @generated
	 */
	EDataType getDateType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Distance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Distance Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='DistanceType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#double Expression'"
	 * @generated
	 */
	EDataType getDistanceType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Expression</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Expression' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='\\{.*\\}'"
	 * @generated
	 */
	EDataType getExpression();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Fill Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Rule Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='FillRuleType' memberTypes='FillRuleTypeVal Expression'"
	 * @generated
	 */
	EDataType getFillRuleType();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.FillRuleType1 <em>Fill Rule Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Rule Type Object</em>'.
	 * @see org.polarsys.ng661designer.part2.FillRuleType1
	 * @model instanceClass="org.polarsys.ng661designer.part2.FillRuleType1"
	 *        extendedMetaData="name='fillRule_._type:Object' baseType='fillRule_._type'"
	 * @generated
	 */
	EDataType getFillRuleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.FillRuleTypeVal <em>Fill Rule Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Rule Type Val Object</em>'.
	 * @see org.polarsys.ng661designer.part2.FillRuleTypeVal
	 * @model instanceClass="org.polarsys.ng661designer.part2.FillRuleTypeVal"
	 *        extendedMetaData="name='FillRuleTypeVal:Object' baseType='FillRuleTypeVal'"
	 * @generated
	 */
	EDataType getFillRuleTypeValObject();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.FlowDirectionType <em>Flow Direction Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Flow Direction Type Object</em>'.
	 * @see org.polarsys.ng661designer.part2.FlowDirectionType
	 * @model instanceClass="org.polarsys.ng661designer.part2.FlowDirectionType"
	 *        extendedMetaData="name='flowDirection_._type:Object' baseType='flowDirection_._type'"
	 * @generated
	 */
	EDataType getFlowDirectionTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Font Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FontType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI Expression'"
	 * @generated
	 */
	EDataType getFontType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Format String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Format String Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FormatStringType' memberTypes='FormatStringTypeVal Expression'"
	 * @generated
	 */
	EDataType getFormatStringType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Format String Type Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Format String Type Val</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FormatStringTypeVal' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[^_\\.\\+#\u23e8]*\\+?[^\\.\\+#\u23e8]*[^_\\.\\+\u23e8]*\\.?[^_\\.\\+\u23e8]*[^\\.\\+#\u23e8]*(\u23e8\\+?[_]*[#]+)?[^_\\.\\+#\u23e8]*'"
	 * @generated
	 */
	EDataType getFormatStringTypeVal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Frequency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Frequency Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='FrequencyType' memberTypes='FrequencyTypeVal Expression'"
	 * @generated
	 */
	EDataType getFrequencyType();

	/**
	 * Returns the meta object for data type '<em>Frequency Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Frequency Type Val</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='FrequencyTypeVal' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0' maxInclusive='1000.0'"
	 * @generated
	 */
	EDataType getFrequencyTypeVal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Frequency Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Frequency Type Val Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='FrequencyTypeVal:Object' baseType='FrequencyTypeVal'"
	 * @generated
	 */
	EDataType getFrequencyTypeValObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ImageType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI Expression'"
	 * @generated
	 */
	EDataType getImageType();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.InstantiationModeType <em>Instantiation Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Instantiation Mode Type Object</em>'.
	 * @see org.polarsys.ng661designer.part2.InstantiationModeType
	 * @model instanceClass="org.polarsys.ng661designer.part2.InstantiationModeType"
	 *        extendedMetaData="name='InstantiationMode_._type:Object' baseType='InstantiationMode_._type'"
	 * @generated
	 */
	EDataType getInstantiationModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='IntegerType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#long Expression'"
	 * @generated
	 */
	EDataType getIntegerType();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.ModalityType <em>Modality Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Modality Type Object</em>'.
	 * @see org.polarsys.ng661designer.part2.ModalityType
	 * @model instanceClass="org.polarsys.ng661designer.part2.ModalityType"
	 *        extendedMetaData="name='modality_._type:Object' baseType='modality_._type'"
	 * @generated
	 */
	EDataType getModalityTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.ModalityType1 <em>Modality Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Modality Type Object1</em>'.
	 * @see org.polarsys.ng661designer.part2.ModalityType1
	 * @model instanceClass="org.polarsys.ng661designer.part2.ModalityType1"
	 *        extendedMetaData="name='modality_._1_._type:Object' baseType='modality_._1_._type'"
	 * @generated
	 */
	EDataType getModalityTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.ModalityType2 <em>Modality Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Modality Type Object2</em>'.
	 * @see org.polarsys.ng661designer.part2.ModalityType2
	 * @model instanceClass="org.polarsys.ng661designer.part2.ModalityType2"
	 *        extendedMetaData="name='modality_._2_._type:Object' baseType='modality_._2_._type'"
	 * @generated
	 */
	EDataType getModalityTypeObject2();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.MultilineModeType <em>Multiline Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multiline Mode Type Object</em>'.
	 * @see org.polarsys.ng661designer.part2.MultilineModeType
	 * @model instanceClass="org.polarsys.ng661designer.part2.MultilineModeType"
	 *        extendedMetaData="name='multilineMode_._type:Object' baseType='multilineMode_._type'"
	 * @generated
	 */
	EDataType getMultilineModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NameType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='128' minLength='1' pattern='[_a-zA-Z][_0-9a-zA-Z]*'"
	 * @generated
	 */
	EDataType getNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ObjectType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='128' minLength='1' pattern='[_a-zA-Z][_0-9a-zA-Z]*'"
	 * @generated
	 */
	EDataType getObjectType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Opacity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Opacity Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='OpacityType' memberTypes='OpacityTypeVal Expression'"
	 * @generated
	 */
	EDataType getOpacityType();

	/**
	 * Returns the meta object for data type '<em>Opacity Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Opacity Type Val</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='OpacityTypeVal' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0' maxInclusive='1.0'"
	 * @generated
	 */
	EDataType getOpacityTypeVal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Opacity Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Opacity Type Val Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='OpacityTypeVal:Object' baseType='OpacityTypeVal'"
	 * @generated
	 */
	EDataType getOpacityTypeValObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='PositionType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#double Expression'"
	 * @generated
	 */
	EDataType getPositionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Pressure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pressure Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='PressureType' memberTypes='PressureTypeVal Expression'"
	 * @generated
	 */
	EDataType getPressureType();

	/**
	 * Returns the meta object for data type '<em>Pressure Type Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pressure Type Val</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='PressureTypeVal' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0' maxInclusive='1.0'"
	 * @generated
	 */
	EDataType getPressureTypeVal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Pressure Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pressure Type Val Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='PressureTypeVal:Object' baseType='PressureTypeVal'"
	 * @generated
	 */
	EDataType getPressureTypeValObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Real Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='RealType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#double Expression'"
	 * @generated
	 */
	EDataType getRealType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Stipple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stipple Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='StippleType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getStippleType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='StringType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getStringType();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.StrokeLinecapType <em>Stroke Linecap Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stroke Linecap Type Object</em>'.
	 * @see org.polarsys.ng661designer.part2.StrokeLinecapType
	 * @model instanceClass="org.polarsys.ng661designer.part2.StrokeLinecapType"
	 *        extendedMetaData="name='strokeLinecap_._type:Object' baseType='strokeLinecap_._type'"
	 * @generated
	 */
	EDataType getStrokeLinecapTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.StrokeLinejoinType <em>Stroke Linejoin Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stroke Linejoin Type Object</em>'.
	 * @see org.polarsys.ng661designer.part2.StrokeLinejoinType
	 * @model instanceClass="org.polarsys.ng661designer.part2.StrokeLinejoinType"
	 *        extendedMetaData="name='strokeLinejoin_._type:Object' baseType='strokeLinejoin_._type'"
	 * @generated
	 */
	EDataType getStrokeLinejoinTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.TextFlowType <em>Text Flow Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Flow Type Object</em>'.
	 * @see org.polarsys.ng661designer.part2.TextFlowType
	 * @model instanceClass="org.polarsys.ng661designer.part2.TextFlowType"
	 *        extendedMetaData="name='textFlow_._type:Object' baseType='textFlow_._type'"
	 * @generated
	 */
	EDataType getTextFlowTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Time Defaultmilliseconds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Defaultmilliseconds Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Time_defaultmilliseconds_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[+-]?[0-9]*(\\.[0-9]*)?(E[+-]?[0-9]?[0-9])?'"
	 * @generated
	 */
	EDataType getTimeDefaultmillisecondsType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Time Hours Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Hours Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Time_hours_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[+-]?[0-9]*(\\.[0-9]*)?(E[+-]?[0-9]?[0-9])?\\s*[hH]'"
	 * @generated
	 */
	EDataType getTimeHoursType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Time Minutes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Minutes Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Time_minutes_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[+-]?[0-9]*(\\.[0-9]*)?(E[+-]?[0-9]?[0-9])?\\s*[mM][nN]'"
	 * @generated
	 */
	EDataType getTimeMinutesType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Time Seconds Or Subseconds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Seconds Or Subseconds Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Time_seconds_or_subseconds_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[+-]?[0-9]*(\\.[0-9]*)?(E[+-]?[0-9]?[0-9])?\\s*[mM\265]?[sS]'"
	 * @generated
	 */
	EDataType getTimeSecondsOrSubsecondsType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TimeType' memberTypes='Time_hours_Type Time_minutes_Type Time_seconds_or_subseconds_Type Time_defaultmilliseconds_Type'"
	 * @generated
	 */
	EDataType getTimeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TypeType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='128' minLength='1' pattern='[_a-zA-Z][_0-9a-zA-Z]*Type'"
	 * @generated
	 */
	EDataType getTypeType();

	/**
	 * Returns the meta object for data type '<em>Velocity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Velocity Type</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='VelocityType' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0' maxInclusive='3E11'"
	 * @generated
	 */
	EDataType getVelocityType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Velocity Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Velocity Type Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='VelocityType:Object' baseType='VelocityType'"
	 * @generated
	 */
	EDataType getVelocityTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Visibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Visibility Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='VisibilityType' memberTypes='VisibilityTypeVal Expression'"
	 * @generated
	 */
	EDataType getVisibilityType();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.ng661designer.part2.VisibilityTypeVal <em>Visibility Type Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Visibility Type Val Object</em>'.
	 * @see org.polarsys.ng661designer.part2.VisibilityTypeVal
	 * @model instanceClass="org.polarsys.ng661designer.part2.VisibilityTypeVal"
	 *        extendedMetaData="name='VisibilityTypeVal:Object' baseType='VisibilityTypeVal'"
	 * @generated
	 */
	EDataType getVisibilityTypeValObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>ZIndex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ZIndex Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='ZIndexType' memberTypes='ZIndexTypeVal Expression'"
	 * @generated
	 */
	EDataType getZIndexType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>ZIndex Type Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ZIndex Type Val</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='ZIndexTypeVal' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='-32768' maxInclusive='32767'"
	 * @generated
	 */
	EDataType getZIndexTypeVal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Part2Factory getPart2Factory();

} //Part2Package
