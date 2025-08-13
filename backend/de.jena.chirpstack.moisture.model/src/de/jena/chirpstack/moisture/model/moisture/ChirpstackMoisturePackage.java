/*
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
package de.jena.chirpstack.moisture.model.moisture;


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
 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoistureFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = ChirpstackMoisturePackage.eNS_URI, genModel = "/model/chirpstack-moisture.genmodel", genModelSourceLocations = {"model/chirpstack-moisture.genmodel","de.jena.chirpstack.moisture.model/model/chirpstack-moisture.genmodel"}, ecore="/model/chirpstack-moisture.ecore", ecoreSourceLocations="/model/chirpstack-moisture.ecore")
public interface ChirpstackMoisturePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "moisture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://model.data.jena.de/sensinact/chirpstack/moisture/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "moisture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChirpstackMoisturePackage eINSTANCE = de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.DraginoImpl <em>Dragino</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.DraginoImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getDragino()
	 * @generated
	 */
	int DRAGINO = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO__SENSOR = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Soil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO__SOIL = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO__DEVICE = ProviderPackage.PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dragino</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Dragino</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.SensorImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__BATTERY = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__IFLAG = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SFLAG = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MOD = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Temperature DS18B20</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TEMPERATURE_DS18B20 = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SoilImpl <em>Soil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.SoilImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSoil()
	 * @generated
	 */
	int SOIL = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL__TEMPERATURE = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL__WATER = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL__CONDUCT = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Soil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Soil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Dev EUI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEV_EUI = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Profile Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PROFILE_ID = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PROFILE_NAME = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TENANT_ID = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tenant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TENANT_NAME = ProviderPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__APPLICATION_ID = ProviderPackage.SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__APPLICATION_NAME = ProviderPackage.SERVICE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.MoistureSensorImpl <em>Moisture Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.MoistureSensorImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getMoistureSensor()
	 * @generated
	 */
	int MOISTURE_SENSOR = 4;

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
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.MoistureStatusImpl <em>Moisture Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.MoistureStatusImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getMoistureStatus()
	 * @generated
	 */
	int MOISTURE_STATUS = 5;

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
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.MoistureAdminImpl <em>Moisture Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.MoistureAdminImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getMoistureAdmin()
	 * @generated
	 */
	int MOISTURE_ADMIN = 6;

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
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SenseCapS2120Impl <em>Sense Cap S2120</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.SenseCapS2120Impl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSenseCapS2120()
	 * @generated
	 */
	int SENSE_CAP_S2120 = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2120__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2120__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2120__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Air</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2120__AIR = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2120__RAIN = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2120__LIGHT = ProviderPackage.PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sense Cap S2120</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2120_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2120___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2120___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Sense Cap S2120</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2120_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SenseCapS2105Impl <em>Sense Cap S2105</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.SenseCapS2105Impl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSenseCapS2105()
	 * @generated
	 */
	int SENSE_CAP_S2105 = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2105__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2105__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2105__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Air</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2105__AIR = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2105__RAIN = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2105__LIGHT = ProviderPackage.PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sense Cap S2105</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2105_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2105___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2105___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Sense Cap S2105</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_S2105_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SenseCapImpl <em>Sense Cap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.SenseCapImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSenseCap()
	 * @generated
	 */
	int SENSE_CAP = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Air</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP__AIR = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP__RAIN = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP__LIGHT = ProviderPackage.PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sense Cap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Sense Cap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_CAP_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.AirImpl <em>Air</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.AirImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getAir()
	 * @generated
	 */
	int AIR = 10;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Air Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR__AIR_TEMPERATURE = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Air Humidity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR__AIR_HUMIDITY = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Barometric Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR__BAROMETRIC_PRESSURE = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Peak Wind Gust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR__PEAK_WIND_GUST = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR__WIND_SPEED = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Wind Direction Sensor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR__WIND_DIRECTION_SENSOR = ProviderPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Air</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Air</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.RainImpl <em>Rain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.RainImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getRain()
	 * @generated
	 */
	int RAIN = 11;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIN__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Rain Gauge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIN__RAIN_GAUGE = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rain Accumulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIN__RAIN_ACCUMULATION = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIN_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIN___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Rain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIN_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.LightImpl <em>Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.LightImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getLight()
	 * @generated
	 */
	int LIGHT = 12;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Light Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__LIGHT_INTENSITY = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uv Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__UV_INDEX = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.TEKTELICImpl <em>TEKTELIC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.TEKTELICImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getTEKTELIC()
	 * @generated
	 */
	int TEKTELIC = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKTELIC__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKTELIC__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKTELIC__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Soil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKTELIC__SOIL = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TEKTELIC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKTELIC_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKTELIC___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKTELIC___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>TEKTELIC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKTELIC_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.TSoilImpl <em>TSoil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.TSoilImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getTSoil()
	 * @generated
	 */
	int TSOIL = 14;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSOIL__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Soil Water Tension1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSOIL__SOIL_WATER_TENSION1 = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Soil Water Tension2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSOIL__SOIL_WATER_TENSION2 = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Soil Moisture Raw1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSOIL__SOIL_MOISTURE_RAW1 = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Soil Moisture Raw2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSOIL__SOIL_MOISTURE_RAW2 = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ambient Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSOIL__AMBIENT_LIGHT = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TSoil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSOIL_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSOIL___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>TSoil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSOIL_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.EM310Impl <em>EM310</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.EM310Impl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getEM310()
	 * @generated
	 */
	int EM310 = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM310__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM310__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM310__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Trash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM310__TRASH = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EM310</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM310_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM310___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM310___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>EM310</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM310_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.TrashImpl <em>Trash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.TrashImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getTrash()
	 * @generated
	 */
	int TRASH = 16;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASH__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASH__DISTANCE = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASH__POSITION = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASH__BATTERY = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASH_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASH___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Trash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASH_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SN50Impl <em>SN50</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.SN50Impl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSN50()
	 * @generated
	 */
	int SN50 = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN50__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN50__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN50__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN50__SENSOR = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SN50</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN50_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN50___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN50___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>SN50</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN50_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SNImpl <em>SN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.SNImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSN()
	 * @generated
	 */
	int SN = 18;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Adc1v</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN__ADC1V = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN__BATTERY = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Adc2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN__ADC2 = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Adc3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN__ADC3 = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>SN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>SN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SolidosTeros21Impl <em>Solidos Teros21</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.SolidosTeros21Impl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSolidosTeros21()
	 * @generated
	 */
	int SOLIDOS_TEROS21 = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLIDOS_TEROS21__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLIDOS_TEROS21__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLIDOS_TEROS21__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLIDOS_TEROS21__SENSOR = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solidos Teros21</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLIDOS_TEROS21_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLIDOS_TEROS21___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLIDOS_TEROS21___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Solidos Teros21</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLIDOS_TEROS21_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.Teros21Impl <em>Teros21</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.Teros21Impl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getTeros21()
	 * @generated
	 */
	int TEROS21 = 20;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEROS21__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Potential Water1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEROS21__POTENTIAL_WATER1 = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Potential Water2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEROS21__POTENTIAL_WATER2 = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temperatur1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEROS21__TEMPERATUR1 = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Temperatur2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEROS21__TEMPERATUR2 = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEROS21__BATTERY = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Teros21</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEROS21_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEROS21___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Teros21</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEROS21_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.SoilType <em>Soil Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.SoilType
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSoilType()
	 * @generated
	 */
	int SOIL_TYPE = 21;


	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.Dragino <em>Dragino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dragino</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Dragino
	 * @generated
	 */
	EClass getDragino();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.Dragino#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sensor</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Dragino#getSensor()
	 * @see #getDragino()
	 * @generated
	 */
	EReference getDragino_Sensor();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.Dragino#getSoil <em>Soil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Soil</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Dragino#getSoil()
	 * @see #getDragino()
	 * @generated
	 */
	EReference getDragino_Soil();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.Dragino#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Dragino#getDevice()
	 * @see #getDragino()
	 * @generated
	 */
	EReference getDragino_Device();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getBattery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Sensor#getBattery()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Battery();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getIflag <em>Iflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iflag</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Sensor#getIflag()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Iflag();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getSflag <em>Sflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sflag</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Sensor#getSflag()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Sflag();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getMod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mod</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Sensor#getMod()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Mod();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getTemperatureDS18B20 <em>Temperature DS18B20</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature DS18B20</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Sensor#getTemperatureDS18B20()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_TemperatureDS18B20();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.Soil <em>Soil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soil</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Soil
	 * @generated
	 */
	EClass getSoil();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Soil#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Soil#getTemperature()
	 * @see #getSoil()
	 * @generated
	 */
	EAttribute getSoil_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Soil#getWater <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Soil#getWater()
	 * @see #getSoil()
	 * @generated
	 */
	EAttribute getSoil_Water();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Soil#getConduct <em>Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conduct</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Soil#getConduct()
	 * @see #getSoil()
	 * @generated
	 */
	EAttribute getSoil_Conduct();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getDevEUI <em>Dev EUI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dev EUI</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getDevEUI()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_DevEUI();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getProfileId <em>Profile Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Id</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getProfileId()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_ProfileId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getProfileName <em>Profile Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Name</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getProfileName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_ProfileName();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getTenantId <em>Tenant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Id</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getTenantId()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_TenantId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getTenantName <em>Tenant Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Name</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getTenantName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_TenantName();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getApplicationId <em>Application Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Id</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getApplicationId()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_ApplicationId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getApplicationName <em>Application Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Name</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getApplicationName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_ApplicationName();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.MoistureSensor <em>Moisture Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moisture Sensor</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.MoistureSensor
	 * @generated
	 */
	EClass getMoistureSensor();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.MoistureSensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.MoistureSensor#getName()
	 * @see #getMoistureSensor()
	 * @generated
	 */
	EAttribute getMoistureSensor_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.MoistureSensor#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.MoistureSensor#getStatus()
	 * @see #getMoistureSensor()
	 * @generated
	 */
	EReference getMoistureSensor_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus <em>Moisture Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moisture Status</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.MoistureStatus
	 * @generated
	 */
	EClass getMoistureStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getValue()
	 * @see #getMoistureStatus()
	 * @generated
	 */
	EAttribute getMoistureStatus_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getObservedArea <em>Observed Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observed Area</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getObservedArea()
	 * @see #getMoistureStatus()
	 * @generated
	 */
	EAttribute getMoistureStatus_ObservedArea();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getTemperature()
	 * @see #getMoistureStatus()
	 * @generated
	 */
	EAttribute getMoistureStatus_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getWater <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getWater()
	 * @see #getMoistureStatus()
	 * @generated
	 */
	EAttribute getMoistureStatus_Water();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getConduct <em>Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conduct</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getConduct()
	 * @see #getMoistureStatus()
	 * @generated
	 */
	EAttribute getMoistureStatus_Conduct();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.MoistureAdmin <em>Moisture Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moisture Admin</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.MoistureAdmin
	 * @generated
	 */
	EClass getMoistureAdmin();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.MoistureAdmin#getSoilType <em>Soil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soil Type</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.MoistureAdmin#getSoilType()
	 * @see #getMoistureAdmin()
	 * @generated
	 */
	EAttribute getMoistureAdmin_SoilType();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.SenseCapS2120 <em>Sense Cap S2120</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense Cap S2120</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SenseCapS2120
	 * @generated
	 */
	EClass getSenseCapS2120();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.SenseCapS2120#getAir <em>Air</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Air</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SenseCapS2120#getAir()
	 * @see #getSenseCapS2120()
	 * @generated
	 */
	EReference getSenseCapS2120_Air();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.SenseCapS2120#getRain <em>Rain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rain</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SenseCapS2120#getRain()
	 * @see #getSenseCapS2120()
	 * @generated
	 */
	EReference getSenseCapS2120_Rain();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.SenseCapS2120#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SenseCapS2120#getLight()
	 * @see #getSenseCapS2120()
	 * @generated
	 */
	EReference getSenseCapS2120_Light();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.SenseCapS2105 <em>Sense Cap S2105</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense Cap S2105</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SenseCapS2105
	 * @generated
	 */
	EClass getSenseCapS2105();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.SenseCapS2105#getAir <em>Air</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Air</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SenseCapS2105#getAir()
	 * @see #getSenseCapS2105()
	 * @generated
	 */
	EReference getSenseCapS2105_Air();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.SenseCapS2105#getRain <em>Rain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rain</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SenseCapS2105#getRain()
	 * @see #getSenseCapS2105()
	 * @generated
	 */
	EReference getSenseCapS2105_Rain();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.SenseCapS2105#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SenseCapS2105#getLight()
	 * @see #getSenseCapS2105()
	 * @generated
	 */
	EReference getSenseCapS2105_Light();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.SenseCap <em>Sense Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense Cap</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SenseCap
	 * @generated
	 */
	EClass getSenseCap();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.SenseCap#getAir <em>Air</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Air</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SenseCap#getAir()
	 * @see #getSenseCap()
	 * @generated
	 */
	EReference getSenseCap_Air();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.SenseCap#getRain <em>Rain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rain</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SenseCap#getRain()
	 * @see #getSenseCap()
	 * @generated
	 */
	EReference getSenseCap_Rain();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.SenseCap#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SenseCap#getLight()
	 * @see #getSenseCap()
	 * @generated
	 */
	EReference getSenseCap_Light();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.Air <em>Air</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Air</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Air
	 * @generated
	 */
	EClass getAir();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Air#getAirTemperature <em>Air Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air Temperature</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Air#getAirTemperature()
	 * @see #getAir()
	 * @generated
	 */
	EAttribute getAir_AirTemperature();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Air#getAirHumidity <em>Air Humidity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air Humidity</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Air#getAirHumidity()
	 * @see #getAir()
	 * @generated
	 */
	EAttribute getAir_AirHumidity();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Air#getBarometricPressure <em>Barometric Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Barometric Pressure</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Air#getBarometricPressure()
	 * @see #getAir()
	 * @generated
	 */
	EAttribute getAir_BarometricPressure();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Air#getPeakWindGust <em>Peak Wind Gust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peak Wind Gust</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Air#getPeakWindGust()
	 * @see #getAir()
	 * @generated
	 */
	EAttribute getAir_PeakWindGust();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Air#getWindSpeed <em>Wind Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Speed</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Air#getWindSpeed()
	 * @see #getAir()
	 * @generated
	 */
	EAttribute getAir_WindSpeed();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Air#getWindDirectionSensor <em>Wind Direction Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Direction Sensor</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Air#getWindDirectionSensor()
	 * @see #getAir()
	 * @generated
	 */
	EAttribute getAir_WindDirectionSensor();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.Rain <em>Rain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rain</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Rain
	 * @generated
	 */
	EClass getRain();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Rain#getRainGauge <em>Rain Gauge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rain Gauge</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Rain#getRainGauge()
	 * @see #getRain()
	 * @generated
	 */
	EAttribute getRain_RainGauge();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Rain#getRainAccumulation <em>Rain Accumulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rain Accumulation</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Rain#getRainAccumulation()
	 * @see #getRain()
	 * @generated
	 */
	EAttribute getRain_RainAccumulation();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Light
	 * @generated
	 */
	EClass getLight();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Light#getLightIntensity <em>Light Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light Intensity</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Light#getLightIntensity()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_LightIntensity();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Light#getUvIndex <em>Uv Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uv Index</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Light#getUvIndex()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_UvIndex();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.TEKTELIC <em>TEKTELIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEKTELIC</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.TEKTELIC
	 * @generated
	 */
	EClass getTEKTELIC();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.TEKTELIC#getSoil <em>Soil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Soil</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.TEKTELIC#getSoil()
	 * @see #getTEKTELIC()
	 * @generated
	 */
	EReference getTEKTELIC_Soil();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.TSoil <em>TSoil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSoil</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.TSoil
	 * @generated
	 */
	EClass getTSoil();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.TSoil#getSoilWaterTension1 <em>Soil Water Tension1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soil Water Tension1</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.TSoil#getSoilWaterTension1()
	 * @see #getTSoil()
	 * @generated
	 */
	EAttribute getTSoil_SoilWaterTension1();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.TSoil#getSoilWaterTension2 <em>Soil Water Tension2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soil Water Tension2</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.TSoil#getSoilWaterTension2()
	 * @see #getTSoil()
	 * @generated
	 */
	EAttribute getTSoil_SoilWaterTension2();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.TSoil#getSoilMoistureRaw1 <em>Soil Moisture Raw1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soil Moisture Raw1</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.TSoil#getSoilMoistureRaw1()
	 * @see #getTSoil()
	 * @generated
	 */
	EAttribute getTSoil_SoilMoistureRaw1();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.TSoil#getSoilMoistureRaw2 <em>Soil Moisture Raw2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soil Moisture Raw2</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.TSoil#getSoilMoistureRaw2()
	 * @see #getTSoil()
	 * @generated
	 */
	EAttribute getTSoil_SoilMoistureRaw2();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.TSoil#getAmbientLight <em>Ambient Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ambient Light</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.TSoil#getAmbientLight()
	 * @see #getTSoil()
	 * @generated
	 */
	EAttribute getTSoil_AmbientLight();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.EM310 <em>EM310</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EM310</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.EM310
	 * @generated
	 */
	EClass getEM310();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.EM310#getTrash <em>Trash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trash</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.EM310#getTrash()
	 * @see #getEM310()
	 * @generated
	 */
	EReference getEM310_Trash();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.Trash <em>Trash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trash</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Trash
	 * @generated
	 */
	EClass getTrash();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Trash#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Trash#getDistance()
	 * @see #getTrash()
	 * @generated
	 */
	EAttribute getTrash_Distance();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Trash#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Trash#getPosition()
	 * @see #getTrash()
	 * @generated
	 */
	EAttribute getTrash_Position();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Trash#getBattery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Trash#getBattery()
	 * @see #getTrash()
	 * @generated
	 */
	EAttribute getTrash_Battery();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.SN50 <em>SN50</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SN50</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SN50
	 * @generated
	 */
	EClass getSN50();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.SN50#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sensor</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SN50#getSensor()
	 * @see #getSN50()
	 * @generated
	 */
	EReference getSN50_Sensor();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.SN <em>SN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SN</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SN
	 * @generated
	 */
	EClass getSN();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.SN#getAdc1v <em>Adc1v</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adc1v</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SN#getAdc1v()
	 * @see #getSN()
	 * @generated
	 */
	EAttribute getSN_Adc1v();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.SN#getBattery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SN#getBattery()
	 * @see #getSN()
	 * @generated
	 */
	EAttribute getSN_Battery();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.SN#getAdc2 <em>Adc2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adc2</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SN#getAdc2()
	 * @see #getSN()
	 * @generated
	 */
	EAttribute getSN_Adc2();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.SN#getAdc3 <em>Adc3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adc3</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SN#getAdc3()
	 * @see #getSN()
	 * @generated
	 */
	EAttribute getSN_Adc3();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.SolidosTeros21 <em>Solidos Teros21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solidos Teros21</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SolidosTeros21
	 * @generated
	 */
	EClass getSolidosTeros21();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.SolidosTeros21#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sensor</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SolidosTeros21#getSensor()
	 * @see #getSolidosTeros21()
	 * @generated
	 */
	EReference getSolidosTeros21_Sensor();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.Teros21 <em>Teros21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teros21</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Teros21
	 * @generated
	 */
	EClass getTeros21();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Teros21#getPotentialWater1 <em>Potential Water1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Potential Water1</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Teros21#getPotentialWater1()
	 * @see #getTeros21()
	 * @generated
	 */
	EAttribute getTeros21_PotentialWater1();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Teros21#getPotentialWater2 <em>Potential Water2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Potential Water2</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Teros21#getPotentialWater2()
	 * @see #getTeros21()
	 * @generated
	 */
	EAttribute getTeros21_PotentialWater2();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Teros21#getTemperatur1 <em>Temperatur1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperatur1</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Teros21#getTemperatur1()
	 * @see #getTeros21()
	 * @generated
	 */
	EAttribute getTeros21_Temperatur1();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Teros21#getTemperatur2 <em>Temperatur2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperatur2</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Teros21#getTemperatur2()
	 * @see #getTeros21()
	 * @generated
	 */
	EAttribute getTeros21_Temperatur2();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Teros21#getBattery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Teros21#getBattery()
	 * @see #getTeros21()
	 * @generated
	 */
	EAttribute getTeros21_Battery();

	/**
	 * Returns the meta object for enum '{@link de.jena.chirpstack.moisture.model.moisture.SoilType <em>Soil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Soil Type</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.SoilType
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
	ChirpstackMoistureFactory getChirpstackMoistureFactory();

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
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.DraginoImpl <em>Dragino</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.DraginoImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getDragino()
		 * @generated
		 */
		EClass DRAGINO = eINSTANCE.getDragino();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAGINO__SENSOR = eINSTANCE.getDragino_Sensor();

		/**
		 * The meta object literal for the '<em><b>Soil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAGINO__SOIL = eINSTANCE.getDragino_Soil();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAGINO__DEVICE = eINSTANCE.getDragino_Device();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.SensorImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Battery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__BATTERY = eINSTANCE.getSensor_Battery();

		/**
		 * The meta object literal for the '<em><b>Iflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__IFLAG = eINSTANCE.getSensor_Iflag();

		/**
		 * The meta object literal for the '<em><b>Sflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__SFLAG = eINSTANCE.getSensor_Sflag();

		/**
		 * The meta object literal for the '<em><b>Mod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__MOD = eINSTANCE.getSensor_Mod();

		/**
		 * The meta object literal for the '<em><b>Temperature DS18B20</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TEMPERATURE_DS18B20 = eINSTANCE.getSensor_TemperatureDS18B20();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SoilImpl <em>Soil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.SoilImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSoil()
		 * @generated
		 */
		EClass SOIL = eINSTANCE.getSoil();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOIL__TEMPERATURE = eINSTANCE.getSoil_Temperature();

		/**
		 * The meta object literal for the '<em><b>Water</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOIL__WATER = eINSTANCE.getSoil_Water();

		/**
		 * The meta object literal for the '<em><b>Conduct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOIL__CONDUCT = eINSTANCE.getSoil_Conduct();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Dev EUI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__DEV_EUI = eINSTANCE.getDevice_DevEUI();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Profile Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__PROFILE_ID = eINSTANCE.getDevice_ProfileId();

		/**
		 * The meta object literal for the '<em><b>Profile Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__PROFILE_NAME = eINSTANCE.getDevice_ProfileName();

		/**
		 * The meta object literal for the '<em><b>Tenant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__TENANT_ID = eINSTANCE.getDevice_TenantId();

		/**
		 * The meta object literal for the '<em><b>Tenant Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__TENANT_NAME = eINSTANCE.getDevice_TenantName();

		/**
		 * The meta object literal for the '<em><b>Application Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__APPLICATION_ID = eINSTANCE.getDevice_ApplicationId();

		/**
		 * The meta object literal for the '<em><b>Application Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__APPLICATION_NAME = eINSTANCE.getDevice_ApplicationName();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.MoistureSensorImpl <em>Moisture Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.MoistureSensorImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getMoistureSensor()
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
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.MoistureStatusImpl <em>Moisture Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.MoistureStatusImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getMoistureStatus()
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
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.MoistureAdminImpl <em>Moisture Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.MoistureAdminImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getMoistureAdmin()
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
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SenseCapS2120Impl <em>Sense Cap S2120</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.SenseCapS2120Impl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSenseCapS2120()
		 * @generated
		 */
		EClass SENSE_CAP_S2120 = eINSTANCE.getSenseCapS2120();

		/**
		 * The meta object literal for the '<em><b>Air</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSE_CAP_S2120__AIR = eINSTANCE.getSenseCapS2120_Air();

		/**
		 * The meta object literal for the '<em><b>Rain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSE_CAP_S2120__RAIN = eINSTANCE.getSenseCapS2120_Rain();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSE_CAP_S2120__LIGHT = eINSTANCE.getSenseCapS2120_Light();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SenseCapS2105Impl <em>Sense Cap S2105</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.SenseCapS2105Impl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSenseCapS2105()
		 * @generated
		 */
		EClass SENSE_CAP_S2105 = eINSTANCE.getSenseCapS2105();

		/**
		 * The meta object literal for the '<em><b>Air</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSE_CAP_S2105__AIR = eINSTANCE.getSenseCapS2105_Air();

		/**
		 * The meta object literal for the '<em><b>Rain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSE_CAP_S2105__RAIN = eINSTANCE.getSenseCapS2105_Rain();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSE_CAP_S2105__LIGHT = eINSTANCE.getSenseCapS2105_Light();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SenseCapImpl <em>Sense Cap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.SenseCapImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSenseCap()
		 * @generated
		 */
		EClass SENSE_CAP = eINSTANCE.getSenseCap();

		/**
		 * The meta object literal for the '<em><b>Air</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSE_CAP__AIR = eINSTANCE.getSenseCap_Air();

		/**
		 * The meta object literal for the '<em><b>Rain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSE_CAP__RAIN = eINSTANCE.getSenseCap_Rain();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSE_CAP__LIGHT = eINSTANCE.getSenseCap_Light();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.AirImpl <em>Air</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.AirImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getAir()
		 * @generated
		 */
		EClass AIR = eINSTANCE.getAir();

		/**
		 * The meta object literal for the '<em><b>Air Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIR__AIR_TEMPERATURE = eINSTANCE.getAir_AirTemperature();

		/**
		 * The meta object literal for the '<em><b>Air Humidity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIR__AIR_HUMIDITY = eINSTANCE.getAir_AirHumidity();

		/**
		 * The meta object literal for the '<em><b>Barometric Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIR__BAROMETRIC_PRESSURE = eINSTANCE.getAir_BarometricPressure();

		/**
		 * The meta object literal for the '<em><b>Peak Wind Gust</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIR__PEAK_WIND_GUST = eINSTANCE.getAir_PeakWindGust();

		/**
		 * The meta object literal for the '<em><b>Wind Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIR__WIND_SPEED = eINSTANCE.getAir_WindSpeed();

		/**
		 * The meta object literal for the '<em><b>Wind Direction Sensor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIR__WIND_DIRECTION_SENSOR = eINSTANCE.getAir_WindDirectionSensor();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.RainImpl <em>Rain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.RainImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getRain()
		 * @generated
		 */
		EClass RAIN = eINSTANCE.getRain();

		/**
		 * The meta object literal for the '<em><b>Rain Gauge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAIN__RAIN_GAUGE = eINSTANCE.getRain_RainGauge();

		/**
		 * The meta object literal for the '<em><b>Rain Accumulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAIN__RAIN_ACCUMULATION = eINSTANCE.getRain_RainAccumulation();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.LightImpl <em>Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.LightImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getLight()
		 * @generated
		 */
		EClass LIGHT = eINSTANCE.getLight();

		/**
		 * The meta object literal for the '<em><b>Light Intensity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT__LIGHT_INTENSITY = eINSTANCE.getLight_LightIntensity();

		/**
		 * The meta object literal for the '<em><b>Uv Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT__UV_INDEX = eINSTANCE.getLight_UvIndex();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.TEKTELICImpl <em>TEKTELIC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.TEKTELICImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getTEKTELIC()
		 * @generated
		 */
		EClass TEKTELIC = eINSTANCE.getTEKTELIC();

		/**
		 * The meta object literal for the '<em><b>Soil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEKTELIC__SOIL = eINSTANCE.getTEKTELIC_Soil();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.TSoilImpl <em>TSoil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.TSoilImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getTSoil()
		 * @generated
		 */
		EClass TSOIL = eINSTANCE.getTSoil();

		/**
		 * The meta object literal for the '<em><b>Soil Water Tension1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSOIL__SOIL_WATER_TENSION1 = eINSTANCE.getTSoil_SoilWaterTension1();

		/**
		 * The meta object literal for the '<em><b>Soil Water Tension2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSOIL__SOIL_WATER_TENSION2 = eINSTANCE.getTSoil_SoilWaterTension2();

		/**
		 * The meta object literal for the '<em><b>Soil Moisture Raw1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSOIL__SOIL_MOISTURE_RAW1 = eINSTANCE.getTSoil_SoilMoistureRaw1();

		/**
		 * The meta object literal for the '<em><b>Soil Moisture Raw2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSOIL__SOIL_MOISTURE_RAW2 = eINSTANCE.getTSoil_SoilMoistureRaw2();

		/**
		 * The meta object literal for the '<em><b>Ambient Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSOIL__AMBIENT_LIGHT = eINSTANCE.getTSoil_AmbientLight();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.EM310Impl <em>EM310</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.EM310Impl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getEM310()
		 * @generated
		 */
		EClass EM310 = eINSTANCE.getEM310();

		/**
		 * The meta object literal for the '<em><b>Trash</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EM310__TRASH = eINSTANCE.getEM310_Trash();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.TrashImpl <em>Trash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.TrashImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getTrash()
		 * @generated
		 */
		EClass TRASH = eINSTANCE.getTrash();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRASH__DISTANCE = eINSTANCE.getTrash_Distance();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRASH__POSITION = eINSTANCE.getTrash_Position();

		/**
		 * The meta object literal for the '<em><b>Battery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRASH__BATTERY = eINSTANCE.getTrash_Battery();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SN50Impl <em>SN50</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.SN50Impl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSN50()
		 * @generated
		 */
		EClass SN50 = eINSTANCE.getSN50();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SN50__SENSOR = eINSTANCE.getSN50_Sensor();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SNImpl <em>SN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.SNImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSN()
		 * @generated
		 */
		EClass SN = eINSTANCE.getSN();

		/**
		 * The meta object literal for the '<em><b>Adc1v</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SN__ADC1V = eINSTANCE.getSN_Adc1v();

		/**
		 * The meta object literal for the '<em><b>Battery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SN__BATTERY = eINSTANCE.getSN_Battery();

		/**
		 * The meta object literal for the '<em><b>Adc2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SN__ADC2 = eINSTANCE.getSN_Adc2();

		/**
		 * The meta object literal for the '<em><b>Adc3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SN__ADC3 = eINSTANCE.getSN_Adc3();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SolidosTeros21Impl <em>Solidos Teros21</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.SolidosTeros21Impl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSolidosTeros21()
		 * @generated
		 */
		EClass SOLIDOS_TEROS21 = eINSTANCE.getSolidosTeros21();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLIDOS_TEROS21__SENSOR = eINSTANCE.getSolidosTeros21_Sensor();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.Teros21Impl <em>Teros21</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.Teros21Impl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getTeros21()
		 * @generated
		 */
		EClass TEROS21 = eINSTANCE.getTeros21();

		/**
		 * The meta object literal for the '<em><b>Potential Water1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEROS21__POTENTIAL_WATER1 = eINSTANCE.getTeros21_PotentialWater1();

		/**
		 * The meta object literal for the '<em><b>Potential Water2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEROS21__POTENTIAL_WATER2 = eINSTANCE.getTeros21_PotentialWater2();

		/**
		 * The meta object literal for the '<em><b>Temperatur1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEROS21__TEMPERATUR1 = eINSTANCE.getTeros21_Temperatur1();

		/**
		 * The meta object literal for the '<em><b>Temperatur2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEROS21__TEMPERATUR2 = eINSTANCE.getTeros21_Temperatur2();

		/**
		 * The meta object literal for the '<em><b>Battery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEROS21__BATTERY = eINSTANCE.getTeros21_Battery();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.SoilType <em>Soil Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.SoilType
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSoilType()
		 * @generated
		 */
		EEnum SOIL_TYPE = eINSTANCE.getSoilType();

	}

} //ChirpstackMoisturePackage
