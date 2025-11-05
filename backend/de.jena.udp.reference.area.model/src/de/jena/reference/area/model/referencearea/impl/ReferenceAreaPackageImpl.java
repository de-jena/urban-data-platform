/**
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
package de.jena.reference.area.model.referencearea.impl;

import de.jena.reference.area.model.referencearea.ReferenceArea;
import de.jena.reference.area.model.referencearea.ReferenceAreaCollection;
import de.jena.reference.area.model.referencearea.ReferenceAreaFactory;
import de.jena.reference.area.model.referencearea.ReferenceAreaPackage;

import geojson.GeojsonPackage;

import geojson.impl.GeojsonPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferenceAreaPackageImpl extends EPackageImpl implements ReferenceAreaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceAreaCollectionEClass = null;

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
	 * @see de.jena.reference.area.model.referencearea.ReferenceAreaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReferenceAreaPackageImpl() {
		super(eNS_URI, ReferenceAreaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReferenceAreaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReferenceAreaPackage init() {
		if (isInited) return (ReferenceAreaPackage)EPackage.Registry.INSTANCE.getEPackage(ReferenceAreaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredReferenceAreaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ReferenceAreaPackageImpl theReferenceAreaPackage = registeredReferenceAreaPackage instanceof ReferenceAreaPackageImpl ? (ReferenceAreaPackageImpl)registeredReferenceAreaPackage : new ReferenceAreaPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeojsonPackage.eNS_URI);
		GeojsonPackageImpl theGeojsonPackage = (GeojsonPackageImpl)(registeredPackage instanceof GeojsonPackageImpl ? registeredPackage : GeojsonPackage.eINSTANCE);

		// Create package meta-data objects
		theReferenceAreaPackage.createPackageContents();
		theGeojsonPackage.createPackageContents();

		// Initialize created meta-data
		theReferenceAreaPackage.initializePackageContents();
		theGeojsonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReferenceAreaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReferenceAreaPackage.eNS_URI, theReferenceAreaPackage);
		return theReferenceAreaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceArea() {
		return referenceAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceArea_Name() {
		return (EAttribute)referenceAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceArea_Gid() {
		return (EAttribute)referenceAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceArea_SensorCount() {
		return (EAttribute)referenceAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceArea_TourName() {
		return (EAttribute)referenceAreaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceArea_Geometry() {
		return (EReference)referenceAreaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceAreaCollection() {
		return referenceAreaCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceAreaCollection_Areas() {
		return (EReference)referenceAreaCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceAreaFactory getReferenceAreaFactory() {
		return (ReferenceAreaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		referenceAreaEClass = createEClass(REFERENCE_AREA);
		createEAttribute(referenceAreaEClass, REFERENCE_AREA__NAME);
		createEAttribute(referenceAreaEClass, REFERENCE_AREA__GID);
		createEAttribute(referenceAreaEClass, REFERENCE_AREA__SENSOR_COUNT);
		createEAttribute(referenceAreaEClass, REFERENCE_AREA__TOUR_NAME);
		createEReference(referenceAreaEClass, REFERENCE_AREA__GEOMETRY);

		referenceAreaCollectionEClass = createEClass(REFERENCE_AREA_COLLECTION);
		createEReference(referenceAreaCollectionEClass, REFERENCE_AREA_COLLECTION__AREAS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GeojsonPackage theGeojsonPackage = (GeojsonPackage)EPackage.Registry.INSTANCE.getEPackage(GeojsonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(referenceAreaEClass, ReferenceArea.class, "ReferenceArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceArea_Name(), ecorePackage.getEString(), "name", null, 1, 1, ReferenceArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceArea_Gid(), ecorePackage.getEFloat(), "gid", null, 0, 1, ReferenceArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceArea_SensorCount(), ecorePackage.getEInt(), "sensorCount", null, 0, 1, ReferenceArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceArea_TourName(), ecorePackage.getEString(), "tourName", null, 0, 1, ReferenceArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceArea_Geometry(), theGeojsonPackage.getFeature(), null, "geometry", null, 0, 1, ReferenceArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceAreaCollectionEClass, ReferenceAreaCollection.class, "ReferenceAreaCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceAreaCollection_Areas(), this.getReferenceArea(), null, "areas", null, 0, -1, ReferenceAreaCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (referenceAreaEClass,
		   source,
		   new String[] {
			   "documentation", "Represents a sensor reference area based on KML Placemark structure"
		   });
		addAnnotation
		  (getReferenceArea_Name(),
		   source,
		   new String[] {
			   "documentation", "The name/identifier of the reference area (e.g., ZW-01, ZW-02)"
		   });
		addAnnotation
		  (getReferenceArea_Gid(),
		   source,
		   new String[] {
			   "documentation", "Unique geographic identifier for the reference area"
		   });
		addAnnotation
		  (getReferenceArea_SensorCount(),
		   source,
		   new String[] {
			   "documentation", "Number of sensors (anzahl_sens) in this reference area"
		   });
		addAnnotation
		  (getReferenceArea_TourName(),
		   source,
		   new String[] {
			   "documentation", "Long tour name describing the location (tour_name_lang)"
		   });
		addAnnotation
		  (getReferenceArea_Geometry(),
		   source,
		   new String[] {
			   "documentation", "The geographic boundary of the reference area (typically a Polygon or MultiPolygon)"
		   });
		addAnnotation
		  (referenceAreaCollectionEClass,
		   source,
		   new String[] {
			   "documentation", "A collection of reference areas, typically representing all areas from a KML document"
		   });
		addAnnotation
		  (getReferenceAreaCollection_Areas(),
		   source,
		   new String[] {
			   "documentation", "List of reference areas"
		   });
	}

} //ReferenceAreaPackageImpl
