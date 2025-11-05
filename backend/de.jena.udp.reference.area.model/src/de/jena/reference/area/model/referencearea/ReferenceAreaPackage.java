/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.reference.area.model.referencearea;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

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
 * @see de.jena.reference.area.model.referencearea.ReferenceAreaFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = ReferenceAreaPackage.eNS_URI, genModel = "/model/reference-area.genmodel", genModelSourceLocations = {"model/reference-area.genmodel","de.jena.udp.reference.area.model/model/reference-area.genmodel"}, ecore="/model/reference-area.ecore", ecoreSourceLocations="/model/reference-area.ecore")
public interface ReferenceAreaPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "referencearea";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://model.data.jena.de/referencearea/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "referencearea";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReferenceAreaPackage eINSTANCE = de.jena.reference.area.model.referencearea.impl.ReferenceAreaPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.reference.area.model.referencearea.impl.ReferenceAreaImpl <em>Reference Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.reference.area.model.referencearea.impl.ReferenceAreaImpl
	 * @see de.jena.reference.area.model.referencearea.impl.ReferenceAreaPackageImpl#getReferenceArea()
	 * @generated
	 */
	int REFERENCE_AREA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA__GID = 1;

	/**
	 * The feature id for the '<em><b>Sensor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA__SENSOR_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Tour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA__TOUR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA__GEOMETRY = 4;

	/**
	 * The number of structural features of the '<em>Reference Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Reference Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.reference.area.model.referencearea.impl.ReferenceAreaCollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.reference.area.model.referencearea.impl.ReferenceAreaCollectionImpl
	 * @see de.jena.reference.area.model.referencearea.impl.ReferenceAreaPackageImpl#getReferenceAreaCollection()
	 * @generated
	 */
	int REFERENCE_AREA_COLLECTION = 1;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_COLLECTION__AREAS = 0;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_COLLECTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.jena.reference.area.model.referencearea.ReferenceArea <em>Reference Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Area</em>'.
	 * @see de.jena.reference.area.model.referencearea.ReferenceArea
	 * @generated
	 */
	EClass getReferenceArea();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.reference.area.model.referencearea.ReferenceArea#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.reference.area.model.referencearea.ReferenceArea#getName()
	 * @see #getReferenceArea()
	 * @generated
	 */
	EAttribute getReferenceArea_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.reference.area.model.referencearea.ReferenceArea#getGid <em>Gid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gid</em>'.
	 * @see de.jena.reference.area.model.referencearea.ReferenceArea#getGid()
	 * @see #getReferenceArea()
	 * @generated
	 */
	EAttribute getReferenceArea_Gid();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.reference.area.model.referencearea.ReferenceArea#getSensorCount <em>Sensor Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Count</em>'.
	 * @see de.jena.reference.area.model.referencearea.ReferenceArea#getSensorCount()
	 * @see #getReferenceArea()
	 * @generated
	 */
	EAttribute getReferenceArea_SensorCount();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.reference.area.model.referencearea.ReferenceArea#getTourName <em>Tour Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tour Name</em>'.
	 * @see de.jena.reference.area.model.referencearea.ReferenceArea#getTourName()
	 * @see #getReferenceArea()
	 * @generated
	 */
	EAttribute getReferenceArea_TourName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.reference.area.model.referencearea.ReferenceArea#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see de.jena.reference.area.model.referencearea.ReferenceArea#getGeometry()
	 * @see #getReferenceArea()
	 * @generated
	 */
	EReference getReferenceArea_Geometry();

	/**
	 * Returns the meta object for class '{@link de.jena.reference.area.model.referencearea.ReferenceAreaCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see de.jena.reference.area.model.referencearea.ReferenceAreaCollection
	 * @generated
	 */
	EClass getReferenceAreaCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.reference.area.model.referencearea.ReferenceAreaCollection#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Areas</em>'.
	 * @see de.jena.reference.area.model.referencearea.ReferenceAreaCollection#getAreas()
	 * @see #getReferenceAreaCollection()
	 * @generated
	 */
	EReference getReferenceAreaCollection_Areas();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReferenceAreaFactory getReferenceAreaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.jena.reference.area.model.referencearea.impl.ReferenceAreaImpl <em>Reference Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.reference.area.model.referencearea.impl.ReferenceAreaImpl
		 * @see de.jena.reference.area.model.referencearea.impl.ReferenceAreaPackageImpl#getReferenceArea()
		 * @generated
		 */
		EClass REFERENCE_AREA = eINSTANCE.getReferenceArea();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_AREA__NAME = eINSTANCE.getReferenceArea_Name();

		/**
		 * The meta object literal for the '<em><b>Gid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_AREA__GID = eINSTANCE.getReferenceArea_Gid();

		/**
		 * The meta object literal for the '<em><b>Sensor Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_AREA__SENSOR_COUNT = eINSTANCE.getReferenceArea_SensorCount();

		/**
		 * The meta object literal for the '<em><b>Tour Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_AREA__TOUR_NAME = eINSTANCE.getReferenceArea_TourName();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_AREA__GEOMETRY = eINSTANCE.getReferenceArea_Geometry();

		/**
		 * The meta object literal for the '{@link de.jena.reference.area.model.referencearea.impl.ReferenceAreaCollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.reference.area.model.referencearea.impl.ReferenceAreaCollectionImpl
		 * @see de.jena.reference.area.model.referencearea.impl.ReferenceAreaPackageImpl#getReferenceAreaCollection()
		 * @generated
		 */
		EClass REFERENCE_AREA_COLLECTION = eINSTANCE.getReferenceAreaCollection();

		/**
		 * The meta object literal for the '<em><b>Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_AREA_COLLECTION__AREAS = eINSTANCE.getReferenceAreaCollection_Areas();

	}

} //ReferenceAreaPackage
