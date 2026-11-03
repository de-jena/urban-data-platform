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
package de.jena.chirpstack.model.dummymoisture.impl;

import de.jena.chirpstack.model.dummymoisture.DummyMoistureFactory;
import de.jena.chirpstack.model.dummymoisture.DummyMoisturePackage;
import de.jena.chirpstack.model.dummymoisture.MoistureAdmin;
import de.jena.chirpstack.model.dummymoisture.MoistureSensor;
import de.jena.chirpstack.model.dummymoisture.MoistureStatus;
import de.jena.chirpstack.model.dummymoisture.SoilType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sensinact.model.core.provider.ProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DummyMoisturePackageImpl extends EPackageImpl implements DummyMoisturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moistureSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moistureStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moistureAdminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum soilTypeEEnum = null;

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
	 * @see de.jena.chirpstack.model.dummymoisture.DummyMoisturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DummyMoisturePackageImpl() {
		super(eNS_URI, DummyMoistureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DummyMoisturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DummyMoisturePackage init() {
		if (isInited) return (DummyMoisturePackage)EPackage.Registry.INSTANCE.getEPackage(DummyMoisturePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDummyMoisturePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DummyMoisturePackageImpl theDummyMoisturePackage = registeredDummyMoisturePackage instanceof DummyMoisturePackageImpl ? (DummyMoisturePackageImpl)registeredDummyMoisturePackage : new DummyMoisturePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ProviderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDummyMoisturePackage.createPackageContents();

		// Initialize created meta-data
		theDummyMoisturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDummyMoisturePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DummyMoisturePackage.eNS_URI, theDummyMoisturePackage);
		return theDummyMoisturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoistureSensor() {
		return moistureSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoistureSensor_Name() {
		return (EAttribute)moistureSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMoistureSensor_Status() {
		return (EReference)moistureSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoistureStatus() {
		return moistureStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoistureStatus_Value() {
		return (EAttribute)moistureStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoistureStatus_ObservedArea() {
		return (EAttribute)moistureStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoistureStatus_Temperature() {
		return (EAttribute)moistureStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoistureStatus_Water() {
		return (EAttribute)moistureStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoistureStatus_Conduct() {
		return (EAttribute)moistureStatusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoistureAdmin() {
		return moistureAdminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoistureAdmin_SoilType() {
		return (EAttribute)moistureAdminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSoilType() {
		return soilTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DummyMoistureFactory getDummyMoistureFactory() {
		return (DummyMoistureFactory)getEFactoryInstance();
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
		moistureSensorEClass = createEClass(MOISTURE_SENSOR);
		createEAttribute(moistureSensorEClass, MOISTURE_SENSOR__NAME);
		createEReference(moistureSensorEClass, MOISTURE_SENSOR__STATUS);

		moistureStatusEClass = createEClass(MOISTURE_STATUS);
		createEAttribute(moistureStatusEClass, MOISTURE_STATUS__VALUE);
		createEAttribute(moistureStatusEClass, MOISTURE_STATUS__OBSERVED_AREA);
		createEAttribute(moistureStatusEClass, MOISTURE_STATUS__TEMPERATURE);
		createEAttribute(moistureStatusEClass, MOISTURE_STATUS__WATER);
		createEAttribute(moistureStatusEClass, MOISTURE_STATUS__CONDUCT);

		moistureAdminEClass = createEClass(MOISTURE_ADMIN);
		createEAttribute(moistureAdminEClass, MOISTURE_ADMIN__SOIL_TYPE);

		// Create enums
		soilTypeEEnum = createEEnum(SOIL_TYPE);
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
		ProviderPackage theProviderPackage = (ProviderPackage)EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		moistureSensorEClass.getESuperTypes().add(theProviderPackage.getProvider());
		moistureStatusEClass.getESuperTypes().add(theProviderPackage.getService());
		moistureAdminEClass.getESuperTypes().add(theProviderPackage.getAdmin());

		// Initialize classes, features, and operations; add parameters
		initEClass(moistureSensorEClass, MoistureSensor.class, "MoistureSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoistureSensor_Name(), ecorePackage.getEString(), "name", null, 0, 1, MoistureSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoistureSensor_Status(), this.getMoistureStatus(), null, "status", null, 0, 1, MoistureSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moistureStatusEClass, MoistureStatus.class, "MoistureStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoistureStatus_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, MoistureStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoistureStatus_ObservedArea(), theProviderPackage.getEGeoJsonObject(), "observedArea", null, 0, 1, MoistureStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoistureStatus_Temperature(), ecorePackage.getEDouble(), "temperature", null, 0, 1, MoistureStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoistureStatus_Water(), ecorePackage.getEDouble(), "water", null, 0, 1, MoistureStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoistureStatus_Conduct(), ecorePackage.getEDouble(), "conduct", null, 0, 1, MoistureStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moistureAdminEClass, MoistureAdmin.class, "MoistureAdmin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoistureAdmin_SoilType(), this.getSoilType(), "soilType", null, 0, 1, MoistureAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(soilTypeEEnum, SoilType.class, "SoilType");
		addEEnumLiteral(soilTypeEEnum, SoilType.SAND);
		addEEnumLiteral(soilTypeEEnum, SoilType.SILT);
		addEEnumLiteral(soilTypeEEnum, SoilType.LOAM);
		addEEnumLiteral(soilTypeEEnum, SoilType.CLAY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// Metadata
		createMetadataAnnotations();
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
	 * Initializes the annotations for <b>Metadata</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMetadataAnnotations() {
		String source = "Metadata";
		addAnnotation
		  (getMoistureStatus_Value(),
		   source,
		   new String[] {
			   "sensorthings.unit.name", "Prozent"
		   });
		addAnnotation
		  (getMoistureStatus_ObservedArea(),
		   source,
		   new String[] {
			   "sensorthings.observedArea", "true"
		   });
	}

} //DummyMoisturePackageImpl
