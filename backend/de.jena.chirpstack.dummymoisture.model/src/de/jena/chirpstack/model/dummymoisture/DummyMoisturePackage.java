/*
 */
package de.jena.chirpstack.model.dummymoisture;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.sensinact.model.core.provider.ProviderPackage;

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
 * @see de.jena.chirpstack.model.dummymoisture.DummyMoistureFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = DummyMoisturePackage.eNS_URI, genModel = "/model/dummy-moisture.genmodel", genModelSourceLocations = {"model/dummy-moisture.genmodel","de.jena.chirpstack.dummymoisture.model/model/dummy-moisture.genmodel"}, ecore="/model/dummy-moisture.ecore", ecoreSourceLocations="/model/dummy-moisture.ecore")
public interface DummyMoisturePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dummymoisture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://model.data.jena.de/sensinact/dummy/moisture/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dummymoisture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DummyMoisturePackage eINSTANCE = de.jena.chirpstack.model.dummymoisture.impl.DummyMoisturePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.model.dummymoisture.impl.MoistureSensorImpl <em>Moisture Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.model.dummymoisture.impl.MoistureSensorImpl
	 * @see de.jena.chirpstack.model.dummymoisture.impl.DummyMoisturePackageImpl#getMoistureSensor()
	 * @generated
	 */
	int MOISTURE_SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_SENSOR__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_SENSOR__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_SENSOR__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_SENSOR__NAME = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_SENSOR__STATUS = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Moisture Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_SENSOR_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_SENSOR___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_SENSOR___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Moisture Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_SENSOR_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.model.dummymoisture.impl.MoistureStatusImpl <em>Moisture Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.model.dummymoisture.impl.MoistureStatusImpl
	 * @see de.jena.chirpstack.model.dummymoisture.impl.DummyMoisturePackageImpl#getMoistureStatus()
	 * @generated
	 */
	int MOISTURE_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_STATUS__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_STATUS__VALUE = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Observed Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_STATUS__OBSERVED_AREA = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_STATUS__TEMPERATURE = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_STATUS__WATER = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_STATUS__CONDUCT = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Moisture Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_STATUS_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_STATUS___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Moisture Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_STATUS_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.model.dummymoisture.impl.MoistureAdminImpl <em>Moisture Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.model.dummymoisture.impl.MoistureAdminImpl
	 * @see de.jena.chirpstack.model.dummymoisture.impl.DummyMoisturePackageImpl#getMoistureAdmin()
	 * @generated
	 */
	int MOISTURE_ADMIN = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_ADMIN__METADATA = ProviderPackage.ADMIN__METADATA;

	/**
	 * The feature id for the '<em><b>Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_ADMIN__FRIENDLY_NAME = ProviderPackage.ADMIN__FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_ADMIN__DESCRIPTION = ProviderPackage.ADMIN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_ADMIN__LOCATION = ProviderPackage.ADMIN__LOCATION;

	/**
	 * The feature id for the '<em><b>Model Package Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_ADMIN__MODEL_PACKAGE_URI = ProviderPackage.ADMIN__MODEL_PACKAGE_URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_ADMIN__MODEL = ProviderPackage.ADMIN__MODEL;

	/**
	 * The feature id for the '<em><b>Soil Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_ADMIN__SOIL_TYPE = ProviderPackage.ADMIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Moisture Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_ADMIN_FEATURE_COUNT = ProviderPackage.ADMIN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_ADMIN___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.ADMIN___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Moisture Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOISTURE_ADMIN_OPERATION_COUNT = ProviderPackage.ADMIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.model.dummymoisture.SoilType <em>Soil Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.model.dummymoisture.SoilType
	 * @see de.jena.chirpstack.model.dummymoisture.impl.DummyMoisturePackageImpl#getSoilType()
	 * @generated
	 */
	int SOIL_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.model.dummymoisture.MoistureSensor <em>Moisture Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moisture Sensor</em>'.
	 * @see de.jena.chirpstack.model.dummymoisture.MoistureSensor
	 * @generated
	 */
	EClass getMoistureSensor();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.model.dummymoisture.MoistureSensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.chirpstack.model.dummymoisture.MoistureSensor#getName()
	 * @see #getMoistureSensor()
	 * @generated
	 */
	EAttribute getMoistureSensor_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.model.dummymoisture.MoistureSensor#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see de.jena.chirpstack.model.dummymoisture.MoistureSensor#getStatus()
	 * @see #getMoistureSensor()
	 * @generated
	 */
	EReference getMoistureSensor_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.model.dummymoisture.MoistureStatus <em>Moisture Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moisture Status</em>'.
	 * @see de.jena.chirpstack.model.dummymoisture.MoistureStatus
	 * @generated
	 */
	EClass getMoistureStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.model.dummymoisture.MoistureStatus#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.chirpstack.model.dummymoisture.MoistureStatus#getValue()
	 * @see #getMoistureStatus()
	 * @generated
	 */
	EAttribute getMoistureStatus_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.model.dummymoisture.MoistureStatus#getObservedArea <em>Observed Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observed Area</em>'.
	 * @see de.jena.chirpstack.model.dummymoisture.MoistureStatus#getObservedArea()
	 * @see #getMoistureStatus()
	 * @generated
	 */
	EAttribute getMoistureStatus_ObservedArea();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.model.dummymoisture.MoistureStatus#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see de.jena.chirpstack.model.dummymoisture.MoistureStatus#getTemperature()
	 * @see #getMoistureStatus()
	 * @generated
	 */
	EAttribute getMoistureStatus_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.model.dummymoisture.MoistureStatus#getWater <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water</em>'.
	 * @see de.jena.chirpstack.model.dummymoisture.MoistureStatus#getWater()
	 * @see #getMoistureStatus()
	 * @generated
	 */
	EAttribute getMoistureStatus_Water();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.model.dummymoisture.MoistureStatus#getConduct <em>Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conduct</em>'.
	 * @see de.jena.chirpstack.model.dummymoisture.MoistureStatus#getConduct()
	 * @see #getMoistureStatus()
	 * @generated
	 */
	EAttribute getMoistureStatus_Conduct();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.model.dummymoisture.MoistureAdmin <em>Moisture Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moisture Admin</em>'.
	 * @see de.jena.chirpstack.model.dummymoisture.MoistureAdmin
	 * @generated
	 */
	EClass getMoistureAdmin();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.model.dummymoisture.MoistureAdmin#getSoilType <em>Soil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soil Type</em>'.
	 * @see de.jena.chirpstack.model.dummymoisture.MoistureAdmin#getSoilType()
	 * @see #getMoistureAdmin()
	 * @generated
	 */
	EAttribute getMoistureAdmin_SoilType();

	/**
	 * Returns the meta object for enum '{@link de.jena.chirpstack.model.dummymoisture.SoilType <em>Soil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Soil Type</em>'.
	 * @see de.jena.chirpstack.model.dummymoisture.SoilType
	 * @generated
	 */
	EEnum getSoilType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DummyMoistureFactory getDummyMoistureFactory();

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
		 * The meta object literal for the '{@link de.jena.chirpstack.model.dummymoisture.impl.MoistureSensorImpl <em>Moisture Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.model.dummymoisture.impl.MoistureSensorImpl
		 * @see de.jena.chirpstack.model.dummymoisture.impl.DummyMoisturePackageImpl#getMoistureSensor()
		 * @generated
		 */
		EClass MOISTURE_SENSOR = eINSTANCE.getMoistureSensor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOISTURE_SENSOR__NAME = eINSTANCE.getMoistureSensor_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOISTURE_SENSOR__STATUS = eINSTANCE.getMoistureSensor_Status();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.model.dummymoisture.impl.MoistureStatusImpl <em>Moisture Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.model.dummymoisture.impl.MoistureStatusImpl
		 * @see de.jena.chirpstack.model.dummymoisture.impl.DummyMoisturePackageImpl#getMoistureStatus()
		 * @generated
		 */
		EClass MOISTURE_STATUS = eINSTANCE.getMoistureStatus();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOISTURE_STATUS__VALUE = eINSTANCE.getMoistureStatus_Value();

		/**
		 * The meta object literal for the '<em><b>Observed Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOISTURE_STATUS__OBSERVED_AREA = eINSTANCE.getMoistureStatus_ObservedArea();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOISTURE_STATUS__TEMPERATURE = eINSTANCE.getMoistureStatus_Temperature();

		/**
		 * The meta object literal for the '<em><b>Water</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOISTURE_STATUS__WATER = eINSTANCE.getMoistureStatus_Water();

		/**
		 * The meta object literal for the '<em><b>Conduct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOISTURE_STATUS__CONDUCT = eINSTANCE.getMoistureStatus_Conduct();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.model.dummymoisture.impl.MoistureAdminImpl <em>Moisture Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.model.dummymoisture.impl.MoistureAdminImpl
		 * @see de.jena.chirpstack.model.dummymoisture.impl.DummyMoisturePackageImpl#getMoistureAdmin()
		 * @generated
		 */
		EClass MOISTURE_ADMIN = eINSTANCE.getMoistureAdmin();

		/**
		 * The meta object literal for the '<em><b>Soil Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOISTURE_ADMIN__SOIL_TYPE = eINSTANCE.getMoistureAdmin_SoilType();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.model.dummymoisture.SoilType <em>Soil Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.model.dummymoisture.SoilType
		 * @see de.jena.chirpstack.model.dummymoisture.impl.DummyMoisturePackageImpl#getSoilType()
		 * @generated
		 */
		EEnum SOIL_TYPE = eINSTANCE.getSoilType();

	}

} //DummyMoisturePackage
