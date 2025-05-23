/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.jena.chirpstack.moisture.model.moisture.impl;

import de.jena.chirpstack.moisture.model.moisture.ChirpstackMoistureFactory;
import de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage;
import de.jena.chirpstack.moisture.model.moisture.Device;
import de.jena.chirpstack.moisture.model.moisture.Dragino;
import de.jena.chirpstack.moisture.model.moisture.MoistureAdmin;
import de.jena.chirpstack.moisture.model.moisture.MoistureSensor;
import de.jena.chirpstack.moisture.model.moisture.MoistureStatus;
import de.jena.chirpstack.moisture.model.moisture.Sensor;
import de.jena.chirpstack.moisture.model.moisture.Soil;
import de.jena.chirpstack.moisture.model.moisture.SoilType;

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
public class ChirpstackMoisturePackageImpl extends EPackageImpl implements ChirpstackMoisturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass draginoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

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
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChirpstackMoisturePackageImpl() {
		super(eNS_URI, ChirpstackMoistureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ChirpstackMoisturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ChirpstackMoisturePackage init() {
		if (isInited) return (ChirpstackMoisturePackage)EPackage.Registry.INSTANCE.getEPackage(ChirpstackMoisturePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredChirpstackMoisturePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ChirpstackMoisturePackageImpl theChirpstackMoisturePackage = registeredChirpstackMoisturePackage instanceof ChirpstackMoisturePackageImpl ? (ChirpstackMoisturePackageImpl)registeredChirpstackMoisturePackage : new ChirpstackMoisturePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ProviderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theChirpstackMoisturePackage.createPackageContents();

		// Initialize created meta-data
		theChirpstackMoisturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChirpstackMoisturePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChirpstackMoisturePackage.eNS_URI, theChirpstackMoisturePackage);
		return theChirpstackMoisturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDragino() {
		return draginoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDragino_Sensor() {
		return (EReference)draginoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDragino_Soil() {
		return (EReference)draginoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDragino_Device() {
		return (EReference)draginoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_Battery() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_Iflag() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_Sflag() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_Mod() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_TemperatureDS18B20() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoil() {
		return soilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoil_Temperature() {
		return (EAttribute)soilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoil_Water() {
		return (EAttribute)soilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoil_Conduct() {
		return (EAttribute)soilEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_DevEUI() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_Name() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_ProfileId() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_ProfileName() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_TenantId() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_TenantName() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_ApplicationId() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_ApplicationName() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(7);
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
	public ChirpstackMoistureFactory getChirpstackMoistureFactory() {
		return (ChirpstackMoistureFactory)getEFactoryInstance();
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
		draginoEClass = createEClass(DRAGINO);
		createEReference(draginoEClass, DRAGINO__SENSOR);
		createEReference(draginoEClass, DRAGINO__SOIL);
		createEReference(draginoEClass, DRAGINO__DEVICE);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__BATTERY);
		createEAttribute(sensorEClass, SENSOR__IFLAG);
		createEAttribute(sensorEClass, SENSOR__SFLAG);
		createEAttribute(sensorEClass, SENSOR__MOD);
		createEAttribute(sensorEClass, SENSOR__TEMPERATURE_DS18B20);

		soilEClass = createEClass(SOIL);
		createEAttribute(soilEClass, SOIL__TEMPERATURE);
		createEAttribute(soilEClass, SOIL__WATER);
		createEAttribute(soilEClass, SOIL__CONDUCT);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__DEV_EUI);
		createEAttribute(deviceEClass, DEVICE__NAME);
		createEAttribute(deviceEClass, DEVICE__PROFILE_ID);
		createEAttribute(deviceEClass, DEVICE__PROFILE_NAME);
		createEAttribute(deviceEClass, DEVICE__TENANT_ID);
		createEAttribute(deviceEClass, DEVICE__TENANT_NAME);
		createEAttribute(deviceEClass, DEVICE__APPLICATION_ID);
		createEAttribute(deviceEClass, DEVICE__APPLICATION_NAME);

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
		draginoEClass.getESuperTypes().add(theProviderPackage.getProvider());
		sensorEClass.getESuperTypes().add(theProviderPackage.getService());
		soilEClass.getESuperTypes().add(theProviderPackage.getService());
		deviceEClass.getESuperTypes().add(theProviderPackage.getService());
		moistureSensorEClass.getESuperTypes().add(theProviderPackage.getProvider());
		moistureStatusEClass.getESuperTypes().add(theProviderPackage.getService());
		moistureAdminEClass.getESuperTypes().add(theProviderPackage.getAdmin());

		// Initialize classes, features, and operations; add parameters
		initEClass(draginoEClass, Dragino.class, "Dragino", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDragino_Sensor(), this.getSensor(), null, "sensor", null, 0, 1, Dragino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDragino_Soil(), this.getSoil(), null, "soil", null, 0, 1, Dragino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDragino_Device(), this.getDevice(), null, "device", null, 0, 1, Dragino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Battery(), ecorePackage.getEDouble(), "battery", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Iflag(), ecorePackage.getEDouble(), "iflag", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Sflag(), ecorePackage.getEDouble(), "sflag", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Mod(), ecorePackage.getEDouble(), "Mod", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_TemperatureDS18B20(), ecorePackage.getEFloat(), "temperatureDS18B20", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soilEClass, Soil.class, "Soil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoil_Temperature(), ecorePackage.getEDouble(), "temperature", null, 0, 1, Soil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoil_Water(), ecorePackage.getEDouble(), "water", null, 0, 1, Soil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoil_Conduct(), ecorePackage.getEDouble(), "conduct", null, 0, 1, Soil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_DevEUI(), ecorePackage.getEString(), "DevEUI", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Name(), ecorePackage.getEString(), "name", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_ProfileId(), ecorePackage.getEString(), "profileId", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_ProfileName(), ecorePackage.getEString(), "profileName", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_TenantId(), ecorePackage.getEString(), "tenantId", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_TenantName(), ecorePackage.getEString(), "tenantName", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_ApplicationId(), ecorePackage.getEString(), "applicationId", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_ApplicationName(), ecorePackage.getEString(), "applicationName", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		// model
		createModelAnnotations();
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
	 * Initializes the annotations for <b>model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations() {
		String source = "model";
		addAnnotation
		  (draginoEClass,
		   source,
		   new String[] {
			   "name", "Dragino_LSE01"
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

} //ChirpstackMoisturePackageImpl
