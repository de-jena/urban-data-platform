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
package de.jena.bike;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see de.jena.bike.BikeFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = BikePackage.eNS_URI, genModel = "/model/bike.genmodel", genModelSourceLocations = {"model/bike.genmodel","de.jena.bike.rest.model/model/bike.genmodel"}, ecore="/model/bike.ecore", ecoreSourceLocations="/model/bike.ecore")
public interface BikePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bike";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://api.eco-counter.com/api/v2/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bike";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BikePackage eINSTANCE = de.jena.bike.impl.BikePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.LocationImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LAT = 0;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LON = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GeometryImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.PositionImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 2;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.LineStringCoordinatesImpl <em>Line String Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.LineStringCoordinatesImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getLineStringCoordinates()
	 * @generated
	 */
	int LINE_STRING_COORDINATES = 3;

	/**
	 * The number of structural features of the '<em>Line String Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_COORDINATES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Line String Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_COORDINATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.LineStringImpl <em>Line String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.LineStringImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getLineString()
	 * @generated
	 */
	int LINE_STRING = 4;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING__COORDINATES = 0;

	/**
	 * The number of structural features of the '<em>Line String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Line String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GeoJsonObjectImpl <em>Geo Json Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GeoJsonObjectImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGeoJsonObject()
	 * @generated
	 */
	int GEO_JSON_OBJECT = 5;

	/**
	 * The number of structural features of the '<em>Geo Json Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_JSON_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Geo Json Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_JSON_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.siteCounterImpl <em>site Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.siteCounterImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getsiteCounter()
	 * @generated
	 */
	int SITE_COUNTER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_COUNTER__ID = 0;

	/**
	 * The feature id for the '<em><b>Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_COUNTER__SERIAL = 1;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_COUNTER__INSTALLATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Detachment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_COUNTER__DETACHMENT_DATE = 3;

	/**
	 * The number of structural features of the '<em>site Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_COUNTER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>site Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_COUNTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.DomainImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 1;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.siteTagImpl <em>site Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.siteTagImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getsiteTag()
	 * @generated
	 */
	int SITE_TAG = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TAG__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TAG__NAME = 1;

	/**
	 * The number of structural features of the '<em>site Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TAG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>site Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.ImageImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 9;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URL = 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.siteImpl <em>site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.siteImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getsite()
	 * @generated
	 */
	int SITE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__CUSTOM_ID = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__SEGMENTS = 5;

	/**
	 * The feature id for the '<em><b>First Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__FIRST_DATA = 6;

	/**
	 * The feature id for the '<em><b>Last Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__LAST_DATA = 7;

	/**
	 * The feature id for the '<em><b>Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__GRANULARITY = 8;

	/**
	 * The feature id for the '<em><b>Travel Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__TRAVEL_MODES = 9;

	/**
	 * The feature id for the '<em><b>Directional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__DIRECTIONAL = 10;

	/**
	 * The feature id for the '<em><b>Counters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__COUNTERS = 11;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__DOMAIN = 12;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__TAGS = 13;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__IMAGES = 14;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__ATTRIBUTES = 15;

	/**
	 * The feature id for the '<em><b>Has Timestamped Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__HAS_TIMESTAMPED_DATA = 16;

	/**
	 * The feature id for the '<em><b>Has Weather</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__HAS_WEATHER = 17;

	/**
	 * The number of structural features of the '<em>site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.BadRequestImpl <em>Bad Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.BadRequestImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getBadRequest()
	 * @generated
	 */
	int BAD_REQUEST = 11;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAD_REQUEST__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAD_REQUEST__CODE = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAD_REQUEST__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Bad Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAD_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bad Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAD_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.UnauthorizedImpl <em>Unauthorized</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.UnauthorizedImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getUnauthorized()
	 * @generated
	 */
	int UNAUTHORIZED = 12;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAUTHORIZED__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAUTHORIZED__CODE = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAUTHORIZED__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Unauthorized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAUTHORIZED_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unauthorized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAUTHORIZED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.ForbiddenImpl <em>Forbidden</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.ForbiddenImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getForbidden()
	 * @generated
	 */
	int FORBIDDEN = 13;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN__CODE = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Forbidden</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Forbidden</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.TooManyRequestsImpl <em>Too Many Requests</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.TooManyRequestsImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getTooManyRequests()
	 * @generated
	 */
	int TOO_MANY_REQUESTS = 14;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOO_MANY_REQUESTS__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOO_MANY_REQUESTS__CODE = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOO_MANY_REQUESTS__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Too Many Requests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOO_MANY_REQUESTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Too Many Requests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOO_MANY_REQUESTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.tagImpl <em>tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.tagImpl
	 * @see de.jena.bike.impl.BikePackageImpl#gettag()
	 * @generated
	 */
	int TAG = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__COLOR = 3;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DOMAIN = 4;

	/**
	 * The number of structural features of the '<em>tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.ExportCreationImpl <em>Export Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.ExportCreationImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getExportCreation()
	 * @generated
	 */
	int EXPORT_CREATION = 16;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_CREATION__START_DATE = 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_CREATION__END_DATE = 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_CREATION__START_TIME = 2;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_CREATION__END_TIME = 3;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_CREATION__SCHEMA = 4;

	/**
	 * The feature id for the '<em><b>Site Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_CREATION__SITE_IDS = 5;

	/**
	 * The feature id for the '<em><b>Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_CREATION__GRANULARITY = 6;

	/**
	 * The feature id for the '<em><b>Validated Data Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_CREATION__VALIDATED_DATA_ONLY = 7;

	/**
	 * The feature id for the '<em><b>Gap Filling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_CREATION__GAP_FILLING = 8;

	/**
	 * The feature id for the '<em><b>Validate Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_CREATION__VALIDATE_SCHEMA = 9;

	/**
	 * The number of structural features of the '<em>Export Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_CREATION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Export Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_CREATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.ExportImpl <em>Export</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.ExportImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getExport()
	 * @generated
	 */
	int EXPORT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__ID = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__URL = 2;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__ERROR_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>End Processing Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__END_PROCESSING_DATE_TIME = 4;

	/**
	 * The number of structural features of the '<em>Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.NotFoundImpl <em>Not Found</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.NotFoundImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getNotFound()
	 * @generated
	 */
	int NOT_FOUND = 18;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FOUND__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FOUND__CODE = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FOUND__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Not Found</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FOUND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Not Found</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FOUND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.DirectionNameImpl <em>Direction Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.DirectionNameImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getDirectionName()
	 * @generated
	 */
	int DIRECTION_NAME = 19;

	/**
	 * The number of structural features of the '<em>Direction Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_NAME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Direction Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.ValueImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 20;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.StatisticalTrafficImpl <em>Statistical Traffic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.StatisticalTrafficImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getStatisticalTraffic()
	 * @generated
	 */
	int STATISTICAL_TRAFFIC = 21;

	/**
	 * The feature id for the '<em><b>Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC__SITE_ID = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC__DATE = 1;

	/**
	 * The feature id for the '<em><b>Travel Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC__TRAVEL_MODE = 2;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC__DIRECTION = 3;

	/**
	 * The feature id for the '<em><b>Direction Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC__DIRECTION_NAME = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC__VALUE = 5;

	/**
	 * The number of structural features of the '<em>Statistical Traffic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Statistical Traffic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.BaseSerieImpl <em>Base Serie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.BaseSerieImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getBaseSerie()
	 * @generated
	 */
	int BASE_SERIE = 22;

	/**
	 * The feature id for the '<em><b>Travel Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERIE__TRAVEL_MODE = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERIE__DIRECTION = 1;

	/**
	 * The number of structural features of the '<em>Base Serie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERIE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Base Serie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.DateTimeImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 23;

	/**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.CountImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 24;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.DataStatusImpl <em>Data Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.DataStatusImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getDataStatus()
	 * @generated
	 */
	int DATA_STATUS = 25;

	/**
	 * The number of structural features of the '<em>Data Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATUS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.HistoricalRawTrafficImpl <em>Historical Raw Traffic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.HistoricalRawTrafficImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalRawTraffic()
	 * @generated
	 */
	int HISTORICAL_RAW_TRAFFIC = 26;

	/**
	 * The feature id for the '<em><b>Flow ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC__FLOW_ID = 0;

	/**
	 * The feature id for the '<em><b>Flow Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC__FLOW_NAME = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC__DATA = 2;

	/**
	 * The number of structural features of the '<em>Historical Raw Traffic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Historical Raw Traffic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.HistoricalAggregatedTrafficImpl <em>Historical Aggregated Traffic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.HistoricalAggregatedTrafficImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTraffic()
	 * @generated
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC = 27;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC__DATA = 0;

	/**
	 * The feature id for the '<em><b>Direction Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC__DIRECTION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Flow ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC__FLOW_ID = 2;

	/**
	 * The feature id for the '<em><b>Flow Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC__FLOW_NAME = 3;

	/**
	 * The number of structural features of the '<em>Historical Aggregated Traffic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Historical Aggregated Traffic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.LaneImpl <em>Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.LaneImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getLane()
	 * @generated
	 */
	int LANE = 28;

	/**
	 * The number of structural features of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.HistoricalTimestampTrafficImpl <em>Historical Timestamp Traffic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.HistoricalTimestampTrafficImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalTimestampTraffic()
	 * @generated
	 */
	int HISTORICAL_TIMESTAMP_TRAFFIC = 29;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_TIMESTAMP_TRAFFIC__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Lane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_TIMESTAMP_TRAFFIC__LANE = 1;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_TIMESTAMP_TRAFFIC__SPEED = 2;

	/**
	 * The number of structural features of the '<em>Historical Timestamp Traffic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_TIMESTAMP_TRAFFIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Historical Timestamp Traffic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_TIMESTAMP_TRAFFIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.validationJobImpl <em>validation Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.validationJobImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getvalidationJob()
	 * @generated
	 */
	int VALIDATION_JOB = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB__ID = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Site Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB__SITE_IDS = 2;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB__START_DATE = 3;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB__END_DATE = 4;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB__ERROR_MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>End Processing Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB__END_PROCESSING_DATE_TIME = 6;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB__CREATED_AT = 7;

	/**
	 * The number of structural features of the '<em>validation Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>validation Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.validationJobCreatedImpl <em>validation Job Created</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.validationJobCreatedImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getvalidationJobCreated()
	 * @generated
	 */
	int VALIDATION_JOB_CREATED = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_CREATED__ID = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_CREATED__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Site Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_CREATED__SITE_IDS = 2;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_CREATED__START_DATE = 3;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_CREATED__END_DATE = 4;

	/**
	 * The number of structural features of the '<em>validation Job Created</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_CREATED_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>validation Job Created</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_CREATED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.ConflictImpl <em>Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.ConflictImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getConflict()
	 * @generated
	 */
	int CONFLICT = 32;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__CODE = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.LineString_coordinatesImpl <em>Line String coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.LineString_coordinatesImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getLineString_coordinates()
	 * @generated
	 */
	int LINE_STRING_COORDINATES = 33;

	/**
	 * The number of structural features of the '<em>Line String coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_COORDINATES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Line String coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_COORDINATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.site_locationImpl <em>site location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.site_locationImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getsite_location()
	 * @generated
	 */
	int SITE_LOCATION = 34;

	/**
	 * The number of structural features of the '<em>site location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOCATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>site location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.site_segmentsImpl <em>site segments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.site_segmentsImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getsite_segments()
	 * @generated
	 */
	int SITE_SEGMENTS = 35;

	/**
	 * The number of structural features of the '<em>site segments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_SEGMENTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>site segments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_SEGMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.site_travelModesImpl <em>site travel Modes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.site_travelModesImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getsite_travelModes()
	 * @generated
	 */
	int SITE_TRAVEL_MODES = 36;

	/**
	 * The number of structural features of the '<em>site travel Modes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TRAVEL_MODES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>site travel Modes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TRAVEL_MODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.site_countersImpl <em>site counters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.site_countersImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getsite_counters()
	 * @generated
	 */
	int SITE_COUNTERS = 37;

	/**
	 * The number of structural features of the '<em>site counters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_COUNTERS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>site counters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_COUNTERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.site_domainImpl <em>site domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.site_domainImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getsite_domain()
	 * @generated
	 */
	int SITE_DOMAIN = 38;

	/**
	 * The number of structural features of the '<em>site domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DOMAIN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>site domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.site_tagsImpl <em>site tags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.site_tagsImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getsite_tags()
	 * @generated
	 */
	int SITE_TAGS = 39;

	/**
	 * The number of structural features of the '<em>site tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TAGS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>site tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TAGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.site_imagesImpl <em>site images</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.site_imagesImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getsite_images()
	 * @generated
	 */
	int SITE_IMAGES = 40;

	/**
	 * The number of structural features of the '<em>site images</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_IMAGES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>site images</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_IMAGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.tag_domainImpl <em>tag domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.tag_domainImpl
	 * @see de.jena.bike.impl.BikePackageImpl#gettag_domain()
	 * @generated
	 */
	int TAG_DOMAIN = 41;

	/**
	 * The number of structural features of the '<em>tag domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DOMAIN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>tag domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.StatisticalTraffic_travelModeImpl <em>Statistical Traffic travel Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.StatisticalTraffic_travelModeImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getStatisticalTraffic_travelMode()
	 * @generated
	 */
	int STATISTICAL_TRAFFIC_TRAVEL_MODE = 42;

	/**
	 * The number of structural features of the '<em>Statistical Traffic travel Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC_TRAVEL_MODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statistical Traffic travel Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC_TRAVEL_MODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.StatisticalTraffic_directionImpl <em>Statistical Traffic direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.StatisticalTraffic_directionImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getStatisticalTraffic_direction()
	 * @generated
	 */
	int STATISTICAL_TRAFFIC_DIRECTION = 43;

	/**
	 * The number of structural features of the '<em>Statistical Traffic direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC_DIRECTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statistical Traffic direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC_DIRECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.StatisticalTraffic_directionNameImpl <em>Statistical Traffic direction Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.StatisticalTraffic_directionNameImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getStatisticalTraffic_directionName()
	 * @generated
	 */
	int STATISTICAL_TRAFFIC_DIRECTION_NAME = 44;

	/**
	 * The number of structural features of the '<em>Statistical Traffic direction Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC_DIRECTION_NAME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statistical Traffic direction Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC_DIRECTION_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.StatisticalTraffic_valueImpl <em>Statistical Traffic value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.StatisticalTraffic_valueImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getStatisticalTraffic_value()
	 * @generated
	 */
	int STATISTICAL_TRAFFIC_VALUE = 45;

	/**
	 * The number of structural features of the '<em>Statistical Traffic value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statistical Traffic value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_TRAFFIC_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.BaseSerie_travelModeImpl <em>Base Serie travel Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.BaseSerie_travelModeImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getBaseSerie_travelMode()
	 * @generated
	 */
	int BASE_SERIE_TRAVEL_MODE = 46;

	/**
	 * The number of structural features of the '<em>Base Serie travel Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERIE_TRAVEL_MODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Base Serie travel Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERIE_TRAVEL_MODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.BaseSerie_directionImpl <em>Base Serie direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.BaseSerie_directionImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getBaseSerie_direction()
	 * @generated
	 */
	int BASE_SERIE_DIRECTION = 47;

	/**
	 * The number of structural features of the '<em>Base Serie direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERIE_DIRECTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Base Serie direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERIE_DIRECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.HistoricalRawTraffic_dataImpl <em>Historical Raw Traffic data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.HistoricalRawTraffic_dataImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalRawTraffic_data()
	 * @generated
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA = 48;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA__GRANULARITY = 1;

	/**
	 * The feature id for the '<em><b>Counts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA__COUNTS = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA__STATUS = 3;

	/**
	 * The number of structural features of the '<em>Historical Raw Traffic data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Historical Raw Traffic data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.HistoricalRawTraffic_data_timestampImpl <em>Historical Raw Traffic data timestamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.HistoricalRawTraffic_data_timestampImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalRawTraffic_data_timestamp()
	 * @generated
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA_TIMESTAMP = 49;

	/**
	 * The number of structural features of the '<em>Historical Raw Traffic data timestamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA_TIMESTAMP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Historical Raw Traffic data timestamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA_TIMESTAMP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.HistoricalRawTraffic_data_countsImpl <em>Historical Raw Traffic data counts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.HistoricalRawTraffic_data_countsImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalRawTraffic_data_counts()
	 * @generated
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA_COUNTS = 50;

	/**
	 * The number of structural features of the '<em>Historical Raw Traffic data counts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA_COUNTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Historical Raw Traffic data counts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA_COUNTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.HistoricalRawTraffic_data_statusImpl <em>Historical Raw Traffic data status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.HistoricalRawTraffic_data_statusImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalRawTraffic_data_status()
	 * @generated
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA_STATUS = 51;

	/**
	 * The number of structural features of the '<em>Historical Raw Traffic data status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA_STATUS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Historical Raw Traffic data status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_RAW_TRAFFIC_DATA_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.HistoricalAggregatedTraffic_dataImpl <em>Historical Aggregated Traffic data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.HistoricalAggregatedTraffic_dataImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTraffic_data()
	 * @generated
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA = 52;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Traffic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA__TRAFFIC = 1;

	/**
	 * The feature id for the '<em><b>Weather</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA__WEATHER = 2;

	/**
	 * The number of structural features of the '<em>Historical Aggregated Traffic data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Historical Aggregated Traffic data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.HistoricalAggregatedTraffic_data_timestampImpl <em>Historical Aggregated Traffic data timestamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.HistoricalAggregatedTraffic_data_timestampImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTraffic_data_timestamp()
	 * @generated
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_TIMESTAMP = 53;

	/**
	 * The number of structural features of the '<em>Historical Aggregated Traffic data timestamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_TIMESTAMP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Historical Aggregated Traffic data timestamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_TIMESTAMP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.HistoricalAggregatedTraffic_data_trafficImpl <em>Historical Aggregated Traffic data traffic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.HistoricalAggregatedTraffic_data_trafficImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTraffic_data_traffic()
	 * @generated
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC = 54;

	/**
	 * The feature id for the '<em><b>Counts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__COUNTS = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__STATUS = 1;

	/**
	 * The number of structural features of the '<em>Historical Aggregated Traffic data traffic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Historical Aggregated Traffic data traffic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.HistoricalAggregatedTraffic_data_traffic_countsImpl <em>Historical Aggregated Traffic data traffic counts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.HistoricalAggregatedTraffic_data_traffic_countsImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTraffic_data_traffic_counts()
	 * @generated
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC_COUNTS = 55;

	/**
	 * The number of structural features of the '<em>Historical Aggregated Traffic data traffic counts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC_COUNTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Historical Aggregated Traffic data traffic counts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC_COUNTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.HistoricalAggregatedTraffic_data_weatherImpl <em>Historical Aggregated Traffic data weather</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.HistoricalAggregatedTraffic_data_weatherImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTraffic_data_weather()
	 * @generated
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER = 56;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__TEMPERATURE = 0;

	/**
	 * The feature id for the '<em><b>Rain Accumulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__RAIN_ACCUMULATION = 1;

	/**
	 * The feature id for the '<em><b>Snow Accumulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__SNOW_ACCUMULATION = 2;

	/**
	 * The number of structural features of the '<em>Historical Aggregated Traffic data weather</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Historical Aggregated Traffic data weather</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.HistoricalAggregatedTraffic_directionNameImpl <em>Historical Aggregated Traffic direction Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.HistoricalAggregatedTraffic_directionNameImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTraffic_directionName()
	 * @generated
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DIRECTION_NAME = 57;

	/**
	 * The number of structural features of the '<em>Historical Aggregated Traffic direction Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DIRECTION_NAME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Historical Aggregated Traffic direction Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_DIRECTION_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.HistoricalTimestampTraffic_timestampImpl <em>Historical Timestamp Traffic timestamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.HistoricalTimestampTraffic_timestampImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalTimestampTraffic_timestamp()
	 * @generated
	 */
	int HISTORICAL_TIMESTAMP_TRAFFIC_TIMESTAMP = 58;

	/**
	 * The number of structural features of the '<em>Historical Timestamp Traffic timestamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_TIMESTAMP_TRAFFIC_TIMESTAMP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Historical Timestamp Traffic timestamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_TIMESTAMP_TRAFFIC_TIMESTAMP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.HistoricalTimestampTraffic_laneImpl <em>Historical Timestamp Traffic lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.HistoricalTimestampTraffic_laneImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalTimestampTraffic_lane()
	 * @generated
	 */
	int HISTORICAL_TIMESTAMP_TRAFFIC_LANE = 59;

	/**
	 * The number of structural features of the '<em>Historical Timestamp Traffic lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_TIMESTAMP_TRAFFIC_LANE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Historical Timestamp Traffic lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_TIMESTAMP_TRAFFIC_LANE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.validationJob_statusImpl <em>validation Job status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.validationJob_statusImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getvalidationJob_status()
	 * @generated
	 */
	int VALIDATION_JOB_STATUS = 60;

	/**
	 * The number of structural features of the '<em>validation Job status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_STATUS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>validation Job status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.validationJobCreated_statusImpl <em>validation Job Created status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.validationJobCreated_statusImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getvalidationJobCreated_status()
	 * @generated
	 */
	int VALIDATION_JOB_CREATED_STATUS = 61;

	/**
	 * The number of structural features of the '<em>validation Job Created status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_CREATED_STATUS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>validation Job Created status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_CREATED_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.ResponseImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 62;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESULT = 3;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.OpenApiClient <em>Open Api Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.OpenApiClient
	 * @see de.jena.bike.impl.BikePackageImpl#getOpenApiClient()
	 * @generated
	 */
	int OPEN_API_CLIENT = 63;

	/**
	 * The number of structural features of the '<em>Open Api Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_API_CLIENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>To Query String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_API_CLIENT___TO_QUERY_STRING__STRING_OBJECT = 0;

	/**
	 * The operation id for the '<em>get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_API_CLIENT___GET__STRING_ECLASS_EMAP_EMAP = 1;

	/**
	 * The operation id for the '<em>delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_API_CLIENT___DELETE__STRING_ECLASS_EMAP_EMAP = 2;

	/**
	 * The number of operations of the '<em>Open Api Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_API_CLIENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.BikeOpenApiClientImpl <em>Open Api Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.BikeOpenApiClientImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getBikeOpenApiClient()
	 * @generated
	 */
	int BIKE_OPEN_API_CLIENT = 64;

	/**
	 * The number of structural features of the '<em>Open Api Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT_FEATURE_COUNT = OPEN_API_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To Query String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___TO_QUERY_STRING__STRING_OBJECT = OPEN_API_CLIENT___TO_QUERY_STRING__STRING_OBJECT;

	/**
	 * The operation id for the '<em>get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___GET__STRING_ECLASS_EMAP_EMAP = OPEN_API_CLIENT___GET__STRING_ECLASS_EMAP_EMAP;

	/**
	 * The operation id for the '<em>delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___DELETE__STRING_ECLASS_EMAP_EMAP = OPEN_API_CLIENT___DELETE__STRING_ECLASS_EMAP_EMAP;

	/**
	 * The operation id for the '<em>Get Sites</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___GET_SITES__INTEGER_INTEGER_STRING_STRING_ELIST_ELIST_ELIST_ELIST_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___GET_TAGS__INTEGER_INTEGER_STRING_STRING_ELIST_ELIST_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Export</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___CREATE_EXPORT__CREATEEXPORT_REQUEST = OPEN_API_CLIENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Export Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___GET_EXPORT_STATUS__INTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Download Export Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___DOWNLOAD_EXPORT_DATA__INTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get ADT</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___GET_ADT__BIGINTEGER_BIGINTEGER_GETADT_DATERANGE_INTEGER_INTEGER_GETADT_GROUPBY_ELIST_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get ADT By Site</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___GET_ADT_BY_SITE__BIGINTEGER_BIGINTEGER_GETADTBYSITE_DATERANGE_INTEGER_INTEGER_GETADTBYSITE_GROUPBY_ELIST_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Total Traffic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___GET_TOTAL_TRAFFIC__BIGINTEGER_BIGINTEGER_GETTOTALTRAFFIC_DATERANGE_INTEGER_INTEGER_GETTOTALTRAFFIC_GROUPBY_ELIST_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Raw Traffic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___GET_RAW_TRAFFIC__BIGINTEGER_ELIST_STRING_STRING_STRING_STRING_BOOLEAN_ELIST_BOOLEAN_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Aggregated Traffic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___GET_AGGREGATED_TRAFFIC__BIGINTEGER_ELIST_STRING_STRING_STRING_STRING_GETAGGREGATEDTRAFFIC_GRANULARITY_GETAGGREGATEDTRAFFIC_GROUPBY_BOOLEAN_ELIST_BOOLEAN_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Timestamp Traffic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___GET_TIMESTAMP_TRAFFIC__BIGINTEGER_STRING_STRING_STRING_STRING_ELIST_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Validation Jobs Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___VALIDATION_JOBS_GET__INTEGER_INTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Validation Job Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___VALIDATION_JOB_CREATE__VALIDATIONJOBCREATE_REQUEST = OPEN_API_CLIENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Validation Job Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT___VALIDATION_JOB_GET__INTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Open Api Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPEN_API_CLIENT_OPERATION_COUNT = OPEN_API_CLIENT_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.CreateExport_requestImpl <em>Create Export request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.CreateExport_requestImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getCreateExport_request()
	 * @generated
	 */
	int CREATE_EXPORT_REQUEST = 65;

	/**
	 * The number of structural features of the '<em>Create Export request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPORT_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Create Export request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPORT_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetADT_dateRangeImpl <em>Get ADT date Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetADT_dateRangeImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetADT_dateRange()
	 * @generated
	 */
	int GET_ADT_DATE_RANGE = 66;

	/**
	 * The number of structural features of the '<em>Get ADT date Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ADT_DATE_RANGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get ADT date Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ADT_DATE_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetADT_groupByImpl <em>Get ADT group By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetADT_groupByImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetADT_groupBy()
	 * @generated
	 */
	int GET_ADT_GROUP_BY = 67;

	/**
	 * The number of structural features of the '<em>Get ADT group By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ADT_GROUP_BY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get ADT group By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ADT_GROUP_BY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetADT_travelModesImpl <em>Get ADT travel Modes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetADT_travelModesImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetADT_travelModes()
	 * @generated
	 */
	int GET_ADT_TRAVEL_MODES = 68;

	/**
	 * The number of structural features of the '<em>Get ADT travel Modes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ADT_TRAVEL_MODES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get ADT travel Modes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ADT_TRAVEL_MODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetADTBySite_dateRangeImpl <em>Get ADT By Site date Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetADTBySite_dateRangeImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetADTBySite_dateRange()
	 * @generated
	 */
	int GET_ADT_BY_SITE_DATE_RANGE = 69;

	/**
	 * The number of structural features of the '<em>Get ADT By Site date Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ADT_BY_SITE_DATE_RANGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get ADT By Site date Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ADT_BY_SITE_DATE_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetADTBySite_groupByImpl <em>Get ADT By Site group By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetADTBySite_groupByImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetADTBySite_groupBy()
	 * @generated
	 */
	int GET_ADT_BY_SITE_GROUP_BY = 70;

	/**
	 * The number of structural features of the '<em>Get ADT By Site group By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ADT_BY_SITE_GROUP_BY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get ADT By Site group By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ADT_BY_SITE_GROUP_BY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetADTBySite_travelModesImpl <em>Get ADT By Site travel Modes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetADTBySite_travelModesImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetADTBySite_travelModes()
	 * @generated
	 */
	int GET_ADT_BY_SITE_TRAVEL_MODES = 71;

	/**
	 * The number of structural features of the '<em>Get ADT By Site travel Modes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ADT_BY_SITE_TRAVEL_MODES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get ADT By Site travel Modes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ADT_BY_SITE_TRAVEL_MODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetTotalTraffic_dateRangeImpl <em>Get Total Traffic date Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetTotalTraffic_dateRangeImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetTotalTraffic_dateRange()
	 * @generated
	 */
	int GET_TOTAL_TRAFFIC_DATE_RANGE = 72;

	/**
	 * The number of structural features of the '<em>Get Total Traffic date Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TOTAL_TRAFFIC_DATE_RANGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get Total Traffic date Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TOTAL_TRAFFIC_DATE_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetTotalTraffic_groupByImpl <em>Get Total Traffic group By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetTotalTraffic_groupByImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetTotalTraffic_groupBy()
	 * @generated
	 */
	int GET_TOTAL_TRAFFIC_GROUP_BY = 73;

	/**
	 * The number of structural features of the '<em>Get Total Traffic group By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TOTAL_TRAFFIC_GROUP_BY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get Total Traffic group By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TOTAL_TRAFFIC_GROUP_BY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetTotalTraffic_travelModesImpl <em>Get Total Traffic travel Modes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetTotalTraffic_travelModesImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetTotalTraffic_travelModes()
	 * @generated
	 */
	int GET_TOTAL_TRAFFIC_TRAVEL_MODES = 74;

	/**
	 * The number of structural features of the '<em>Get Total Traffic travel Modes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TOTAL_TRAFFIC_TRAVEL_MODES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get Total Traffic travel Modes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TOTAL_TRAFFIC_TRAVEL_MODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetRawTraffic_includeImpl <em>Get Raw Traffic include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetRawTraffic_includeImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetRawTraffic_include()
	 * @generated
	 */
	int GET_RAW_TRAFFIC_INCLUDE = 75;

	/**
	 * The number of structural features of the '<em>Get Raw Traffic include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_RAW_TRAFFIC_INCLUDE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get Raw Traffic include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_RAW_TRAFFIC_INCLUDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetRawTraffic_travelModesImpl <em>Get Raw Traffic travel Modes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetRawTraffic_travelModesImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetRawTraffic_travelModes()
	 * @generated
	 */
	int GET_RAW_TRAFFIC_TRAVEL_MODES = 76;

	/**
	 * The number of structural features of the '<em>Get Raw Traffic travel Modes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_RAW_TRAFFIC_TRAVEL_MODES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get Raw Traffic travel Modes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_RAW_TRAFFIC_TRAVEL_MODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetAggregatedTraffic_includeImpl <em>Get Aggregated Traffic include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetAggregatedTraffic_includeImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetAggregatedTraffic_include()
	 * @generated
	 */
	int GET_AGGREGATED_TRAFFIC_INCLUDE = 77;

	/**
	 * The number of structural features of the '<em>Get Aggregated Traffic include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_AGGREGATED_TRAFFIC_INCLUDE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get Aggregated Traffic include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_AGGREGATED_TRAFFIC_INCLUDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetAggregatedTraffic_granularityImpl <em>Get Aggregated Traffic granularity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetAggregatedTraffic_granularityImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetAggregatedTraffic_granularity()
	 * @generated
	 */
	int GET_AGGREGATED_TRAFFIC_GRANULARITY = 78;

	/**
	 * The number of structural features of the '<em>Get Aggregated Traffic granularity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_AGGREGATED_TRAFFIC_GRANULARITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get Aggregated Traffic granularity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_AGGREGATED_TRAFFIC_GRANULARITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetAggregatedTraffic_groupByImpl <em>Get Aggregated Traffic group By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetAggregatedTraffic_groupByImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetAggregatedTraffic_groupBy()
	 * @generated
	 */
	int GET_AGGREGATED_TRAFFIC_GROUP_BY = 79;

	/**
	 * The number of structural features of the '<em>Get Aggregated Traffic group By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_AGGREGATED_TRAFFIC_GROUP_BY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get Aggregated Traffic group By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_AGGREGATED_TRAFFIC_GROUP_BY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetAggregatedTraffic_travelModesImpl <em>Get Aggregated Traffic travel Modes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetAggregatedTraffic_travelModesImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetAggregatedTraffic_travelModes()
	 * @generated
	 */
	int GET_AGGREGATED_TRAFFIC_TRAVEL_MODES = 80;

	/**
	 * The number of structural features of the '<em>Get Aggregated Traffic travel Modes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_AGGREGATED_TRAFFIC_TRAVEL_MODES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get Aggregated Traffic travel Modes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_AGGREGATED_TRAFFIC_TRAVEL_MODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetTimestampTraffic_travelModesImpl <em>Get Timestamp Traffic travel Modes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetTimestampTraffic_travelModesImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetTimestampTraffic_travelModes()
	 * @generated
	 */
	int GET_TIMESTAMP_TRAFFIC_TRAVEL_MODES = 81;

	/**
	 * The number of structural features of the '<em>Get Timestamp Traffic travel Modes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TIMESTAMP_TRAFFIC_TRAVEL_MODES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get Timestamp Traffic travel Modes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TIMESTAMP_TRAFFIC_TRAVEL_MODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.GetTimestampTraffic_directionsImpl <em>Get Timestamp Traffic directions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.GetTimestampTraffic_directionsImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getGetTimestampTraffic_directions()
	 * @generated
	 */
	int GET_TIMESTAMP_TRAFFIC_DIRECTIONS = 82;

	/**
	 * The number of structural features of the '<em>Get Timestamp Traffic directions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TIMESTAMP_TRAFFIC_DIRECTIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get Timestamp Traffic directions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TIMESTAMP_TRAFFIC_DIRECTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.impl.ValidationJobCreate_requestImpl <em>Validation Job Create request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.impl.ValidationJobCreate_requestImpl
	 * @see de.jena.bike.impl.BikePackageImpl#getValidationJobCreate_request()
	 * @generated
	 */
	int VALIDATION_JOB_CREATE_REQUEST = 83;

	/**
	 * The feature id for the '<em><b>Site Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_CREATE_REQUEST__SITE_IDS = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_CREATE_REQUEST__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_CREATE_REQUEST__END_DATE = 2;

	/**
	 * The number of structural features of the '<em>Validation Job Create request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_CREATE_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Validation Job Create request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_JOB_CREATE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.bike.TravelModeLabel <em>Travel Mode Label</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.TravelModeLabel
	 * @see de.jena.bike.impl.BikePackageImpl#getTravelModeLabel()
	 * @generated
	 */
	int TRAVEL_MODE_LABEL = 84;

	/**
	 * The meta object id for the '{@link de.jena.bike.DateRange <em>Date Range</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.DateRange
	 * @see de.jena.bike.impl.BikePackageImpl#getDateRange()
	 * @generated
	 */
	int DATE_RANGE = 85;

	/**
	 * The meta object id for the '{@link de.jena.bike.StatisticalAverageGroupBy <em>Statistical Average Group By</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.StatisticalAverageGroupBy
	 * @see de.jena.bike.impl.BikePackageImpl#getStatisticalAverageGroupBy()
	 * @generated
	 */
	int STATISTICAL_AVERAGE_GROUP_BY = 86;

	/**
	 * The meta object id for the '{@link de.jena.bike.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.Direction
	 * @see de.jena.bike.impl.BikePackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 87;

	/**
	 * The meta object id for the '{@link de.jena.bike.StatisticalTotalGroupBy <em>Statistical Total Group By</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.StatisticalTotalGroupBy
	 * @see de.jena.bike.impl.BikePackageImpl#getStatisticalTotalGroupBy()
	 * @generated
	 */
	int STATISTICAL_TOTAL_GROUP_BY = 88;

	/**
	 * The meta object id for the '{@link de.jena.bike.HistoricalRawTrafficInclude <em>Historical Raw Traffic Include</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.HistoricalRawTrafficInclude
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalRawTrafficInclude()
	 * @generated
	 */
	int HISTORICAL_RAW_TRAFFIC_INCLUDE = 89;

	/**
	 * The meta object id for the '{@link de.jena.bike.HistoricalAggregatedTrafficInclude <em>Historical Aggregated Traffic Include</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.HistoricalAggregatedTrafficInclude
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTrafficInclude()
	 * @generated
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_INCLUDE = 90;

	/**
	 * The meta object id for the '{@link de.jena.bike.Granularity <em>Granularity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.Granularity
	 * @see de.jena.bike.impl.BikePackageImpl#getGranularity()
	 * @generated
	 */
	int GRANULARITY = 91;

	/**
	 * The meta object id for the '{@link de.jena.bike.HistoricalAggregatedTrafficGroupBy <em>Historical Aggregated Traffic Group By</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.HistoricalAggregatedTrafficGroupBy
	 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTrafficGroupBy()
	 * @generated
	 */
	int HISTORICAL_AGGREGATED_TRAFFIC_GROUP_BY = 92;

	/**
	 * The meta object id for the '{@link de.jena.bike.validationJobStatus <em>validation Job Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.bike.validationJobStatus
	 * @see de.jena.bike.impl.BikePackageImpl#getvalidationJobStatus()
	 * @generated
	 */
	int VALIDATION_JOB_STATUS = 93;

	/**
	 * The meta object id for the '<em>JResponse</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jakarta.ws.rs.core.Response
	 * @see de.jena.bike.impl.BikePackageImpl#getJResponse()
	 * @generated
	 */
	int JRESPONSE = 94;


	/**
	 * Returns the meta object for class '{@link de.jena.bike.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see de.jena.bike.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Location#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see de.jena.bike.Location#getLat()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Lat();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Location#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see de.jena.bike.Location#getLon()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Lon();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see de.jena.bike.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Geometry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.bike.Geometry#getType()
	 * @see #getGeometry()
	 * @generated
	 */
	EAttribute getGeometry_Type();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see de.jena.bike.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.LineStringCoordinates <em>Line String Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line String Coordinates</em>'.
	 * @see de.jena.bike.LineStringCoordinates
	 * @generated
	 */
	EClass getLineStringCoordinates();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.LineString <em>Line String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line String</em>'.
	 * @see de.jena.bike.LineString
	 * @generated
	 */
	EClass getLineString();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.LineString#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinates</em>'.
	 * @see de.jena.bike.LineString#getCoordinates()
	 * @see #getLineString()
	 * @generated
	 */
	EReference getLineString_Coordinates();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GeoJsonObject <em>Geo Json Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Json Object</em>'.
	 * @see de.jena.bike.GeoJsonObject
	 * @generated
	 */
	EClass getGeoJsonObject();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.siteCounter <em>site Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>site Counter</em>'.
	 * @see de.jena.bike.siteCounter
	 * @generated
	 */
	EClass getsiteCounter();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.siteCounter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.bike.siteCounter#getId()
	 * @see #getsiteCounter()
	 * @generated
	 */
	EAttribute getsiteCounter_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.siteCounter#getSerial <em>Serial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial</em>'.
	 * @see de.jena.bike.siteCounter#getSerial()
	 * @see #getsiteCounter()
	 * @generated
	 */
	EAttribute getsiteCounter_Serial();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.siteCounter#getInstallationDate <em>Installation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Installation Date</em>'.
	 * @see de.jena.bike.siteCounter#getInstallationDate()
	 * @see #getsiteCounter()
	 * @generated
	 */
	EAttribute getsiteCounter_InstallationDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.siteCounter#getDetachmentDate <em>Detachment Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detachment Date</em>'.
	 * @see de.jena.bike.siteCounter#getDetachmentDate()
	 * @see #getsiteCounter()
	 * @generated
	 */
	EAttribute getsiteCounter_DetachmentDate();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see de.jena.bike.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Domain#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.bike.Domain#getId()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.bike.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.siteTag <em>site Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>site Tag</em>'.
	 * @see de.jena.bike.siteTag
	 * @generated
	 */
	EClass getsiteTag();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.siteTag#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.bike.siteTag#getId()
	 * @see #getsiteTag()
	 * @generated
	 */
	EAttribute getsiteTag_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.siteTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.bike.siteTag#getName()
	 * @see #getsiteTag()
	 * @generated
	 */
	EAttribute getsiteTag_Name();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see de.jena.bike.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Image#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.jena.bike.Image#getUrl()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Url();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.site <em>site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>site</em>'.
	 * @see de.jena.bike.site
	 * @generated
	 */
	EClass getsite();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.site#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.bike.site#getId()
	 * @see #getsite()
	 * @generated
	 */
	EAttribute getsite_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.site#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.bike.site#getName()
	 * @see #getsite()
	 * @generated
	 */
	EAttribute getsite_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.site#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.bike.site#getDescription()
	 * @see #getsite()
	 * @generated
	 */
	EAttribute getsite_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.site#getCustomId <em>Custom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Id</em>'.
	 * @see de.jena.bike.site#getCustomId()
	 * @see #getsite()
	 * @generated
	 */
	EAttribute getsite_CustomId();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.site#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see de.jena.bike.site#getLocation()
	 * @see #getsite()
	 * @generated
	 */
	EReference getsite_Location();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.site#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Segments</em>'.
	 * @see de.jena.bike.site#getSegments()
	 * @see #getsite()
	 * @generated
	 */
	EReference getsite_Segments();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.site#getFirstData <em>First Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Data</em>'.
	 * @see de.jena.bike.site#getFirstData()
	 * @see #getsite()
	 * @generated
	 */
	EAttribute getsite_FirstData();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.site#getLastData <em>Last Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Data</em>'.
	 * @see de.jena.bike.site#getLastData()
	 * @see #getsite()
	 * @generated
	 */
	EAttribute getsite_LastData();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.site#getGranularity <em>Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Granularity</em>'.
	 * @see de.jena.bike.site#getGranularity()
	 * @see #getsite()
	 * @generated
	 */
	EAttribute getsite_Granularity();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.bike.site#getTravelModes <em>Travel Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Travel Modes</em>'.
	 * @see de.jena.bike.site#getTravelModes()
	 * @see #getsite()
	 * @generated
	 */
	EReference getsite_TravelModes();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.site#getDirectional <em>Directional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directional</em>'.
	 * @see de.jena.bike.site#getDirectional()
	 * @see #getsite()
	 * @generated
	 */
	EAttribute getsite_Directional();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.bike.site#getCounters <em>Counters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Counters</em>'.
	 * @see de.jena.bike.site#getCounters()
	 * @see #getsite()
	 * @generated
	 */
	EReference getsite_Counters();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.site#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see de.jena.bike.site#getDomain()
	 * @see #getsite()
	 * @generated
	 */
	EReference getsite_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.bike.site#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see de.jena.bike.site#getTags()
	 * @see #getsite()
	 * @generated
	 */
	EReference getsite_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.bike.site#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see de.jena.bike.site#getImages()
	 * @see #getsite()
	 * @generated
	 */
	EReference getsite_Images();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.site#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes</em>'.
	 * @see de.jena.bike.site#getAttributes()
	 * @see #getsite()
	 * @generated
	 */
	EAttribute getsite_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.site#getHasTimestampedData <em>Has Timestamped Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Timestamped Data</em>'.
	 * @see de.jena.bike.site#getHasTimestampedData()
	 * @see #getsite()
	 * @generated
	 */
	EAttribute getsite_HasTimestampedData();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.site#getHasWeather <em>Has Weather</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Weather</em>'.
	 * @see de.jena.bike.site#getHasWeather()
	 * @see #getsite()
	 * @generated
	 */
	EAttribute getsite_HasWeather();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.BadRequest <em>Bad Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bad Request</em>'.
	 * @see de.jena.bike.BadRequest
	 * @generated
	 */
	EClass getBadRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.BadRequest#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.bike.BadRequest#getStatus()
	 * @see #getBadRequest()
	 * @generated
	 */
	EAttribute getBadRequest_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.BadRequest#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.jena.bike.BadRequest#getCode()
	 * @see #getBadRequest()
	 * @generated
	 */
	EAttribute getBadRequest_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.BadRequest#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.jena.bike.BadRequest#getMessage()
	 * @see #getBadRequest()
	 * @generated
	 */
	EAttribute getBadRequest_Message();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.Unauthorized <em>Unauthorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unauthorized</em>'.
	 * @see de.jena.bike.Unauthorized
	 * @generated
	 */
	EClass getUnauthorized();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Unauthorized#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.bike.Unauthorized#getStatus()
	 * @see #getUnauthorized()
	 * @generated
	 */
	EAttribute getUnauthorized_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Unauthorized#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.jena.bike.Unauthorized#getCode()
	 * @see #getUnauthorized()
	 * @generated
	 */
	EAttribute getUnauthorized_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Unauthorized#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.jena.bike.Unauthorized#getMessage()
	 * @see #getUnauthorized()
	 * @generated
	 */
	EAttribute getUnauthorized_Message();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.Forbidden <em>Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forbidden</em>'.
	 * @see de.jena.bike.Forbidden
	 * @generated
	 */
	EClass getForbidden();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Forbidden#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.bike.Forbidden#getStatus()
	 * @see #getForbidden()
	 * @generated
	 */
	EAttribute getForbidden_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Forbidden#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.jena.bike.Forbidden#getCode()
	 * @see #getForbidden()
	 * @generated
	 */
	EAttribute getForbidden_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Forbidden#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.jena.bike.Forbidden#getMessage()
	 * @see #getForbidden()
	 * @generated
	 */
	EAttribute getForbidden_Message();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.TooManyRequests <em>Too Many Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Too Many Requests</em>'.
	 * @see de.jena.bike.TooManyRequests
	 * @generated
	 */
	EClass getTooManyRequests();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.TooManyRequests#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.bike.TooManyRequests#getStatus()
	 * @see #getTooManyRequests()
	 * @generated
	 */
	EAttribute getTooManyRequests_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.TooManyRequests#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.jena.bike.TooManyRequests#getCode()
	 * @see #getTooManyRequests()
	 * @generated
	 */
	EAttribute getTooManyRequests_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.TooManyRequests#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.jena.bike.TooManyRequests#getMessage()
	 * @see #getTooManyRequests()
	 * @generated
	 */
	EAttribute getTooManyRequests_Message();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.tag <em>tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tag</em>'.
	 * @see de.jena.bike.tag
	 * @generated
	 */
	EClass gettag();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.tag#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.bike.tag#getId()
	 * @see #gettag()
	 * @generated
	 */
	EAttribute gettag_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.bike.tag#getName()
	 * @see #gettag()
	 * @generated
	 */
	EAttribute gettag_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.tag#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.bike.tag#getDescription()
	 * @see #gettag()
	 * @generated
	 */
	EAttribute gettag_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.tag#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see de.jena.bike.tag#getColor()
	 * @see #gettag()
	 * @generated
	 */
	EAttribute gettag_Color();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.tag#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see de.jena.bike.tag#getDomain()
	 * @see #gettag()
	 * @generated
	 */
	EReference gettag_Domain();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.ExportCreation <em>Export Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Creation</em>'.
	 * @see de.jena.bike.ExportCreation
	 * @generated
	 */
	EClass getExportCreation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.ExportCreation#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see de.jena.bike.ExportCreation#getStartDate()
	 * @see #getExportCreation()
	 * @generated
	 */
	EAttribute getExportCreation_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.ExportCreation#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see de.jena.bike.ExportCreation#getEndDate()
	 * @see #getExportCreation()
	 * @generated
	 */
	EAttribute getExportCreation_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.ExportCreation#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see de.jena.bike.ExportCreation#getStartTime()
	 * @see #getExportCreation()
	 * @generated
	 */
	EAttribute getExportCreation_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.ExportCreation#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see de.jena.bike.ExportCreation#getEndTime()
	 * @see #getExportCreation()
	 * @generated
	 */
	EAttribute getExportCreation_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.ExportCreation#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see de.jena.bike.ExportCreation#getSchema()
	 * @see #getExportCreation()
	 * @generated
	 */
	EAttribute getExportCreation_Schema();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.bike.ExportCreation#getSiteIds <em>Site Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Site Ids</em>'.
	 * @see de.jena.bike.ExportCreation#getSiteIds()
	 * @see #getExportCreation()
	 * @generated
	 */
	EAttribute getExportCreation_SiteIds();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.ExportCreation#getGranularity <em>Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Granularity</em>'.
	 * @see de.jena.bike.ExportCreation#getGranularity()
	 * @see #getExportCreation()
	 * @generated
	 */
	EAttribute getExportCreation_Granularity();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.ExportCreation#getValidatedDataOnly <em>Validated Data Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validated Data Only</em>'.
	 * @see de.jena.bike.ExportCreation#getValidatedDataOnly()
	 * @see #getExportCreation()
	 * @generated
	 */
	EAttribute getExportCreation_ValidatedDataOnly();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.ExportCreation#getGapFilling <em>Gap Filling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Filling</em>'.
	 * @see de.jena.bike.ExportCreation#getGapFilling()
	 * @see #getExportCreation()
	 * @generated
	 */
	EAttribute getExportCreation_GapFilling();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.ExportCreation#getValidateSchema <em>Validate Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate Schema</em>'.
	 * @see de.jena.bike.ExportCreation#getValidateSchema()
	 * @see #getExportCreation()
	 * @generated
	 */
	EAttribute getExportCreation_ValidateSchema();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export</em>'.
	 * @see de.jena.bike.Export
	 * @generated
	 */
	EClass getExport();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Export#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.bike.Export#getId()
	 * @see #getExport()
	 * @generated
	 */
	EAttribute getExport_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Export#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.bike.Export#getStatus()
	 * @see #getExport()
	 * @generated
	 */
	EAttribute getExport_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Export#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.jena.bike.Export#getUrl()
	 * @see #getExport()
	 * @generated
	 */
	EAttribute getExport_Url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Export#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see de.jena.bike.Export#getErrorMessage()
	 * @see #getExport()
	 * @generated
	 */
	EAttribute getExport_ErrorMessage();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Export#getEndProcessingDateTime <em>End Processing Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Processing Date Time</em>'.
	 * @see de.jena.bike.Export#getEndProcessingDateTime()
	 * @see #getExport()
	 * @generated
	 */
	EAttribute getExport_EndProcessingDateTime();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.NotFound <em>Not Found</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Found</em>'.
	 * @see de.jena.bike.NotFound
	 * @generated
	 */
	EClass getNotFound();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.NotFound#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.bike.NotFound#getStatus()
	 * @see #getNotFound()
	 * @generated
	 */
	EAttribute getNotFound_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.NotFound#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.jena.bike.NotFound#getCode()
	 * @see #getNotFound()
	 * @generated
	 */
	EAttribute getNotFound_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.NotFound#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.jena.bike.NotFound#getMessage()
	 * @see #getNotFound()
	 * @generated
	 */
	EAttribute getNotFound_Message();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.DirectionName <em>Direction Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direction Name</em>'.
	 * @see de.jena.bike.DirectionName
	 * @generated
	 */
	EClass getDirectionName();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see de.jena.bike.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.StatisticalTraffic <em>Statistical Traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistical Traffic</em>'.
	 * @see de.jena.bike.StatisticalTraffic
	 * @generated
	 */
	EClass getStatisticalTraffic();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.StatisticalTraffic#getSiteId <em>Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Id</em>'.
	 * @see de.jena.bike.StatisticalTraffic#getSiteId()
	 * @see #getStatisticalTraffic()
	 * @generated
	 */
	EAttribute getStatisticalTraffic_SiteId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.StatisticalTraffic#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see de.jena.bike.StatisticalTraffic#getDate()
	 * @see #getStatisticalTraffic()
	 * @generated
	 */
	EAttribute getStatisticalTraffic_Date();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.StatisticalTraffic#getTravelMode <em>Travel Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Travel Mode</em>'.
	 * @see de.jena.bike.StatisticalTraffic#getTravelMode()
	 * @see #getStatisticalTraffic()
	 * @generated
	 */
	EReference getStatisticalTraffic_TravelMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.StatisticalTraffic#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Direction</em>'.
	 * @see de.jena.bike.StatisticalTraffic#getDirection()
	 * @see #getStatisticalTraffic()
	 * @generated
	 */
	EReference getStatisticalTraffic_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.StatisticalTraffic#getDirectionName <em>Direction Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Direction Name</em>'.
	 * @see de.jena.bike.StatisticalTraffic#getDirectionName()
	 * @see #getStatisticalTraffic()
	 * @generated
	 */
	EReference getStatisticalTraffic_DirectionName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.StatisticalTraffic#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.jena.bike.StatisticalTraffic#getValue()
	 * @see #getStatisticalTraffic()
	 * @generated
	 */
	EReference getStatisticalTraffic_Value();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.BaseSerie <em>Base Serie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Serie</em>'.
	 * @see de.jena.bike.BaseSerie
	 * @generated
	 */
	EClass getBaseSerie();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.BaseSerie#getTravelMode <em>Travel Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Travel Mode</em>'.
	 * @see de.jena.bike.BaseSerie#getTravelMode()
	 * @see #getBaseSerie()
	 * @generated
	 */
	EReference getBaseSerie_TravelMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.BaseSerie#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Direction</em>'.
	 * @see de.jena.bike.BaseSerie#getDirection()
	 * @see #getBaseSerie()
	 * @generated
	 */
	EReference getBaseSerie_Direction();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see de.jena.bike.DateTime
	 * @generated
	 */
	EClass getDateTime();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see de.jena.bike.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.DataStatus <em>Data Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Status</em>'.
	 * @see de.jena.bike.DataStatus
	 * @generated
	 */
	EClass getDataStatus();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.HistoricalRawTraffic <em>Historical Raw Traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Raw Traffic</em>'.
	 * @see de.jena.bike.HistoricalRawTraffic
	 * @generated
	 */
	EClass getHistoricalRawTraffic();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.HistoricalRawTraffic#getFlowID <em>Flow ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow ID</em>'.
	 * @see de.jena.bike.HistoricalRawTraffic#getFlowID()
	 * @see #getHistoricalRawTraffic()
	 * @generated
	 */
	EAttribute getHistoricalRawTraffic_FlowID();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.HistoricalRawTraffic#getFlowName <em>Flow Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Name</em>'.
	 * @see de.jena.bike.HistoricalRawTraffic#getFlowName()
	 * @see #getHistoricalRawTraffic()
	 * @generated
	 */
	EAttribute getHistoricalRawTraffic_FlowName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.bike.HistoricalRawTraffic#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see de.jena.bike.HistoricalRawTraffic#getData()
	 * @see #getHistoricalRawTraffic()
	 * @generated
	 */
	EReference getHistoricalRawTraffic_Data();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.HistoricalAggregatedTraffic <em>Historical Aggregated Traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Aggregated Traffic</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic
	 * @generated
	 */
	EClass getHistoricalAggregatedTraffic();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.bike.HistoricalAggregatedTraffic#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic#getData()
	 * @see #getHistoricalAggregatedTraffic()
	 * @generated
	 */
	EReference getHistoricalAggregatedTraffic_Data();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.HistoricalAggregatedTraffic#getDirectionName <em>Direction Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Direction Name</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic#getDirectionName()
	 * @see #getHistoricalAggregatedTraffic()
	 * @generated
	 */
	EReference getHistoricalAggregatedTraffic_DirectionName();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.HistoricalAggregatedTraffic#getFlowID <em>Flow ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow ID</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic#getFlowID()
	 * @see #getHistoricalAggregatedTraffic()
	 * @generated
	 */
	EAttribute getHistoricalAggregatedTraffic_FlowID();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.HistoricalAggregatedTraffic#getFlowName <em>Flow Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Name</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic#getFlowName()
	 * @see #getHistoricalAggregatedTraffic()
	 * @generated
	 */
	EAttribute getHistoricalAggregatedTraffic_FlowName();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane</em>'.
	 * @see de.jena.bike.Lane
	 * @generated
	 */
	EClass getLane();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.HistoricalTimestampTraffic <em>Historical Timestamp Traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Timestamp Traffic</em>'.
	 * @see de.jena.bike.HistoricalTimestampTraffic
	 * @generated
	 */
	EClass getHistoricalTimestampTraffic();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.HistoricalTimestampTraffic#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timestamp</em>'.
	 * @see de.jena.bike.HistoricalTimestampTraffic#getTimestamp()
	 * @see #getHistoricalTimestampTraffic()
	 * @generated
	 */
	EReference getHistoricalTimestampTraffic_Timestamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.HistoricalTimestampTraffic#getLane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lane</em>'.
	 * @see de.jena.bike.HistoricalTimestampTraffic#getLane()
	 * @see #getHistoricalTimestampTraffic()
	 * @generated
	 */
	EReference getHistoricalTimestampTraffic_Lane();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.HistoricalTimestampTraffic#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see de.jena.bike.HistoricalTimestampTraffic#getSpeed()
	 * @see #getHistoricalTimestampTraffic()
	 * @generated
	 */
	EAttribute getHistoricalTimestampTraffic_Speed();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.validationJob <em>validation Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>validation Job</em>'.
	 * @see de.jena.bike.validationJob
	 * @generated
	 */
	EClass getvalidationJob();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.validationJob#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.bike.validationJob#getId()
	 * @see #getvalidationJob()
	 * @generated
	 */
	EAttribute getvalidationJob_Id();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.validationJob#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see de.jena.bike.validationJob#getStatus()
	 * @see #getvalidationJob()
	 * @generated
	 */
	EReference getvalidationJob_Status();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.bike.validationJob#getSiteIds <em>Site Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Site Ids</em>'.
	 * @see de.jena.bike.validationJob#getSiteIds()
	 * @see #getvalidationJob()
	 * @generated
	 */
	EAttribute getvalidationJob_SiteIds();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.validationJob#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see de.jena.bike.validationJob#getStartDate()
	 * @see #getvalidationJob()
	 * @generated
	 */
	EAttribute getvalidationJob_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.validationJob#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see de.jena.bike.validationJob#getEndDate()
	 * @see #getvalidationJob()
	 * @generated
	 */
	EAttribute getvalidationJob_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.validationJob#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see de.jena.bike.validationJob#getErrorMessage()
	 * @see #getvalidationJob()
	 * @generated
	 */
	EAttribute getvalidationJob_ErrorMessage();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.validationJob#getEndProcessingDateTime <em>End Processing Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Processing Date Time</em>'.
	 * @see de.jena.bike.validationJob#getEndProcessingDateTime()
	 * @see #getvalidationJob()
	 * @generated
	 */
	EAttribute getvalidationJob_EndProcessingDateTime();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.validationJob#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see de.jena.bike.validationJob#getCreatedAt()
	 * @see #getvalidationJob()
	 * @generated
	 */
	EAttribute getvalidationJob_CreatedAt();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.validationJobCreated <em>validation Job Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>validation Job Created</em>'.
	 * @see de.jena.bike.validationJobCreated
	 * @generated
	 */
	EClass getvalidationJobCreated();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.validationJobCreated#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.bike.validationJobCreated#getId()
	 * @see #getvalidationJobCreated()
	 * @generated
	 */
	EAttribute getvalidationJobCreated_Id();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.validationJobCreated#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see de.jena.bike.validationJobCreated#getStatus()
	 * @see #getvalidationJobCreated()
	 * @generated
	 */
	EReference getvalidationJobCreated_Status();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.bike.validationJobCreated#getSiteIds <em>Site Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Site Ids</em>'.
	 * @see de.jena.bike.validationJobCreated#getSiteIds()
	 * @see #getvalidationJobCreated()
	 * @generated
	 */
	EAttribute getvalidationJobCreated_SiteIds();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.validationJobCreated#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see de.jena.bike.validationJobCreated#getStartDate()
	 * @see #getvalidationJobCreated()
	 * @generated
	 */
	EAttribute getvalidationJobCreated_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.validationJobCreated#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see de.jena.bike.validationJobCreated#getEndDate()
	 * @see #getvalidationJobCreated()
	 * @generated
	 */
	EAttribute getvalidationJobCreated_EndDate();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.Conflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict</em>'.
	 * @see de.jena.bike.Conflict
	 * @generated
	 */
	EClass getConflict();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Conflict#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.bike.Conflict#getStatus()
	 * @see #getConflict()
	 * @generated
	 */
	EAttribute getConflict_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Conflict#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.jena.bike.Conflict#getCode()
	 * @see #getConflict()
	 * @generated
	 */
	EAttribute getConflict_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Conflict#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.jena.bike.Conflict#getMessage()
	 * @see #getConflict()
	 * @generated
	 */
	EAttribute getConflict_Message();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.LineString_coordinates <em>Line String coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line String coordinates</em>'.
	 * @see de.jena.bike.LineString_coordinates
	 * @generated
	 */
	EClass getLineString_coordinates();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.site_location <em>site location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>site location</em>'.
	 * @see de.jena.bike.site_location
	 * @generated
	 */
	EClass getsite_location();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.site_segments <em>site segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>site segments</em>'.
	 * @see de.jena.bike.site_segments
	 * @generated
	 */
	EClass getsite_segments();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.site_travelModes <em>site travel Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>site travel Modes</em>'.
	 * @see de.jena.bike.site_travelModes
	 * @generated
	 */
	EClass getsite_travelModes();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.site_counters <em>site counters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>site counters</em>'.
	 * @see de.jena.bike.site_counters
	 * @generated
	 */
	EClass getsite_counters();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.site_domain <em>site domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>site domain</em>'.
	 * @see de.jena.bike.site_domain
	 * @generated
	 */
	EClass getsite_domain();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.site_tags <em>site tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>site tags</em>'.
	 * @see de.jena.bike.site_tags
	 * @generated
	 */
	EClass getsite_tags();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.site_images <em>site images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>site images</em>'.
	 * @see de.jena.bike.site_images
	 * @generated
	 */
	EClass getsite_images();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.tag_domain <em>tag domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tag domain</em>'.
	 * @see de.jena.bike.tag_domain
	 * @generated
	 */
	EClass gettag_domain();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.StatisticalTraffic_travelMode <em>Statistical Traffic travel Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistical Traffic travel Mode</em>'.
	 * @see de.jena.bike.StatisticalTraffic_travelMode
	 * @generated
	 */
	EClass getStatisticalTraffic_travelMode();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.StatisticalTraffic_direction <em>Statistical Traffic direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistical Traffic direction</em>'.
	 * @see de.jena.bike.StatisticalTraffic_direction
	 * @generated
	 */
	EClass getStatisticalTraffic_direction();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.StatisticalTraffic_directionName <em>Statistical Traffic direction Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistical Traffic direction Name</em>'.
	 * @see de.jena.bike.StatisticalTraffic_directionName
	 * @generated
	 */
	EClass getStatisticalTraffic_directionName();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.StatisticalTraffic_value <em>Statistical Traffic value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistical Traffic value</em>'.
	 * @see de.jena.bike.StatisticalTraffic_value
	 * @generated
	 */
	EClass getStatisticalTraffic_value();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.BaseSerie_travelMode <em>Base Serie travel Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Serie travel Mode</em>'.
	 * @see de.jena.bike.BaseSerie_travelMode
	 * @generated
	 */
	EClass getBaseSerie_travelMode();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.BaseSerie_direction <em>Base Serie direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Serie direction</em>'.
	 * @see de.jena.bike.BaseSerie_direction
	 * @generated
	 */
	EClass getBaseSerie_direction();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.HistoricalRawTraffic_data <em>Historical Raw Traffic data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Raw Traffic data</em>'.
	 * @see de.jena.bike.HistoricalRawTraffic_data
	 * @generated
	 */
	EClass getHistoricalRawTraffic_data();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.HistoricalRawTraffic_data#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timestamp</em>'.
	 * @see de.jena.bike.HistoricalRawTraffic_data#getTimestamp()
	 * @see #getHistoricalRawTraffic_data()
	 * @generated
	 */
	EReference getHistoricalRawTraffic_data_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.HistoricalRawTraffic_data#getGranularity <em>Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Granularity</em>'.
	 * @see de.jena.bike.HistoricalRawTraffic_data#getGranularity()
	 * @see #getHistoricalRawTraffic_data()
	 * @generated
	 */
	EAttribute getHistoricalRawTraffic_data_Granularity();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.HistoricalRawTraffic_data#getCounts <em>Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Counts</em>'.
	 * @see de.jena.bike.HistoricalRawTraffic_data#getCounts()
	 * @see #getHistoricalRawTraffic_data()
	 * @generated
	 */
	EReference getHistoricalRawTraffic_data_Counts();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.HistoricalRawTraffic_data#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see de.jena.bike.HistoricalRawTraffic_data#getStatus()
	 * @see #getHistoricalRawTraffic_data()
	 * @generated
	 */
	EReference getHistoricalRawTraffic_data_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.HistoricalRawTraffic_data_timestamp <em>Historical Raw Traffic data timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Raw Traffic data timestamp</em>'.
	 * @see de.jena.bike.HistoricalRawTraffic_data_timestamp
	 * @generated
	 */
	EClass getHistoricalRawTraffic_data_timestamp();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.HistoricalRawTraffic_data_counts <em>Historical Raw Traffic data counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Raw Traffic data counts</em>'.
	 * @see de.jena.bike.HistoricalRawTraffic_data_counts
	 * @generated
	 */
	EClass getHistoricalRawTraffic_data_counts();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.HistoricalRawTraffic_data_status <em>Historical Raw Traffic data status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Raw Traffic data status</em>'.
	 * @see de.jena.bike.HistoricalRawTraffic_data_status
	 * @generated
	 */
	EClass getHistoricalRawTraffic_data_status();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.HistoricalAggregatedTraffic_data <em>Historical Aggregated Traffic data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Aggregated Traffic data</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data
	 * @generated
	 */
	EClass getHistoricalAggregatedTraffic_data();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.HistoricalAggregatedTraffic_data#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timestamp</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data#getTimestamp()
	 * @see #getHistoricalAggregatedTraffic_data()
	 * @generated
	 */
	EReference getHistoricalAggregatedTraffic_data_Timestamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.HistoricalAggregatedTraffic_data#getTraffic <em>Traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Traffic</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data#getTraffic()
	 * @see #getHistoricalAggregatedTraffic_data()
	 * @generated
	 */
	EReference getHistoricalAggregatedTraffic_data_Traffic();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.HistoricalAggregatedTraffic_data#getWeather <em>Weather</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weather</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data#getWeather()
	 * @see #getHistoricalAggregatedTraffic_data()
	 * @generated
	 */
	EReference getHistoricalAggregatedTraffic_data_Weather();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.HistoricalAggregatedTraffic_data_timestamp <em>Historical Aggregated Traffic data timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Aggregated Traffic data timestamp</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data_timestamp
	 * @generated
	 */
	EClass getHistoricalAggregatedTraffic_data_timestamp();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.HistoricalAggregatedTraffic_data_traffic <em>Historical Aggregated Traffic data traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Aggregated Traffic data traffic</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data_traffic
	 * @generated
	 */
	EClass getHistoricalAggregatedTraffic_data_traffic();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.bike.HistoricalAggregatedTraffic_data_traffic#getCounts <em>Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Counts</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data_traffic#getCounts()
	 * @see #getHistoricalAggregatedTraffic_data_traffic()
	 * @generated
	 */
	EReference getHistoricalAggregatedTraffic_data_traffic_Counts();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.HistoricalAggregatedTraffic_data_traffic#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data_traffic#getStatus()
	 * @see #getHistoricalAggregatedTraffic_data_traffic()
	 * @generated
	 */
	EAttribute getHistoricalAggregatedTraffic_data_traffic_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.HistoricalAggregatedTraffic_data_traffic_counts <em>Historical Aggregated Traffic data traffic counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Aggregated Traffic data traffic counts</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data_traffic_counts
	 * @generated
	 */
	EClass getHistoricalAggregatedTraffic_data_traffic_counts();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.HistoricalAggregatedTraffic_data_weather <em>Historical Aggregated Traffic data weather</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Aggregated Traffic data weather</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data_weather
	 * @generated
	 */
	EClass getHistoricalAggregatedTraffic_data_weather();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.HistoricalAggregatedTraffic_data_weather#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data_weather#getTemperature()
	 * @see #getHistoricalAggregatedTraffic_data_weather()
	 * @generated
	 */
	EAttribute getHistoricalAggregatedTraffic_data_weather_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.HistoricalAggregatedTraffic_data_weather#getRainAccumulation <em>Rain Accumulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rain Accumulation</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data_weather#getRainAccumulation()
	 * @see #getHistoricalAggregatedTraffic_data_weather()
	 * @generated
	 */
	EAttribute getHistoricalAggregatedTraffic_data_weather_RainAccumulation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.HistoricalAggregatedTraffic_data_weather#getSnowAccumulation <em>Snow Accumulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snow Accumulation</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data_weather#getSnowAccumulation()
	 * @see #getHistoricalAggregatedTraffic_data_weather()
	 * @generated
	 */
	EAttribute getHistoricalAggregatedTraffic_data_weather_SnowAccumulation();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.HistoricalAggregatedTraffic_directionName <em>Historical Aggregated Traffic direction Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Aggregated Traffic direction Name</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_directionName
	 * @generated
	 */
	EClass getHistoricalAggregatedTraffic_directionName();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.HistoricalTimestampTraffic_timestamp <em>Historical Timestamp Traffic timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Timestamp Traffic timestamp</em>'.
	 * @see de.jena.bike.HistoricalTimestampTraffic_timestamp
	 * @generated
	 */
	EClass getHistoricalTimestampTraffic_timestamp();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.HistoricalTimestampTraffic_lane <em>Historical Timestamp Traffic lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical Timestamp Traffic lane</em>'.
	 * @see de.jena.bike.HistoricalTimestampTraffic_lane
	 * @generated
	 */
	EClass getHistoricalTimestampTraffic_lane();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.validationJob_status <em>validation Job status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>validation Job status</em>'.
	 * @see de.jena.bike.validationJob_status
	 * @generated
	 */
	EClass getvalidationJob_status();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.validationJobCreated_status <em>validation Job Created status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>validation Job Created status</em>'.
	 * @see de.jena.bike.validationJobCreated_status
	 * @generated
	 */
	EClass getvalidationJobCreated_status();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see de.jena.bike.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Response#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.jena.bike.Response#getCode()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Response#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.bike.Response#getDescription()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.Response#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see de.jena.bike.Response#getResponse()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Response();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.bike.Response#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see de.jena.bike.Response#getResult()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Result();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.OpenApiClient <em>Open Api Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Api Client</em>'.
	 * @see de.jena.bike.OpenApiClient
	 * @generated
	 */
	EClass getOpenApiClient();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.OpenApiClient#toQueryString(java.lang.String, java.lang.Object) <em>To Query String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Query String</em>' operation.
	 * @see de.jena.bike.OpenApiClient#toQueryString(java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getOpenApiClient__ToQueryString__String_Object();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.OpenApiClient#_get(java.lang.String, org.eclipse.emf.ecore.EClass, org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EMap) <em>get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>get</em>' operation.
	 * @see de.jena.bike.OpenApiClient#_get(java.lang.String, org.eclipse.emf.ecore.EClass, org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getOpenApiClient___get__String_EClass_EMap_EMap();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.OpenApiClient#_delete(java.lang.String, org.eclipse.emf.ecore.EClass, org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EMap) <em>delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>delete</em>' operation.
	 * @see de.jena.bike.OpenApiClient#_delete(java.lang.String, org.eclipse.emf.ecore.EClass, org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getOpenApiClient___delete__String_EClass_EMap_EMap();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.BikeOpenApiClient <em>Open Api Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Api Client</em>'.
	 * @see de.jena.bike.BikeOpenApiClient
	 * @generated
	 */
	EClass getBikeOpenApiClient();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.BikeOpenApiClient#GetSites(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Sites</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sites</em>' operation.
	 * @see de.jena.bike.BikeOpenApiClient#GetSites(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getBikeOpenApiClient__GetSites__Integer_Integer_String_String_EList_EList_EList_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.BikeOpenApiClient#GetTags(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tags</em>' operation.
	 * @see de.jena.bike.BikeOpenApiClient#GetTags(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getBikeOpenApiClient__GetTags__Integer_Integer_String_String_EList_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.BikeOpenApiClient#CreateExport(de.jena.bike.CreateExport_request) <em>Create Export</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Export</em>' operation.
	 * @see de.jena.bike.BikeOpenApiClient#CreateExport(de.jena.bike.CreateExport_request)
	 * @generated
	 */
	EOperation getBikeOpenApiClient__CreateExport__CreateExport_request();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.BikeOpenApiClient#GetExportStatus(java.lang.Integer) <em>Get Export Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Export Status</em>' operation.
	 * @see de.jena.bike.BikeOpenApiClient#GetExportStatus(java.lang.Integer)
	 * @generated
	 */
	EOperation getBikeOpenApiClient__GetExportStatus__Integer();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.BikeOpenApiClient#DownloadExportData(java.lang.Integer) <em>Download Export Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Download Export Data</em>' operation.
	 * @see de.jena.bike.BikeOpenApiClient#DownloadExportData(java.lang.Integer)
	 * @generated
	 */
	EOperation getBikeOpenApiClient__DownloadExportData__Integer();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.BikeOpenApiClient#GetADT(java.math.BigInteger, java.math.BigInteger, de.jena.bike.GetADT_dateRange, java.lang.Integer, java.lang.Integer, de.jena.bike.GetADT_groupBy, org.eclipse.emf.common.util.EList, java.lang.Boolean) <em>Get ADT</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ADT</em>' operation.
	 * @see de.jena.bike.BikeOpenApiClient#GetADT(java.math.BigInteger, java.math.BigInteger, de.jena.bike.GetADT_dateRange, java.lang.Integer, java.lang.Integer, de.jena.bike.GetADT_groupBy, org.eclipse.emf.common.util.EList, java.lang.Boolean)
	 * @generated
	 */
	EOperation getBikeOpenApiClient__GetADT__BigInteger_BigInteger_GetADT_dateRange_Integer_Integer_GetADT_groupBy_EList_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.BikeOpenApiClient#GetADTBySite(java.math.BigInteger, java.math.BigInteger, de.jena.bike.GetADTBySite_dateRange, java.lang.Integer, java.lang.Integer, de.jena.bike.GetADTBySite_groupBy, org.eclipse.emf.common.util.EList, java.lang.Boolean) <em>Get ADT By Site</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ADT By Site</em>' operation.
	 * @see de.jena.bike.BikeOpenApiClient#GetADTBySite(java.math.BigInteger, java.math.BigInteger, de.jena.bike.GetADTBySite_dateRange, java.lang.Integer, java.lang.Integer, de.jena.bike.GetADTBySite_groupBy, org.eclipse.emf.common.util.EList, java.lang.Boolean)
	 * @generated
	 */
	EOperation getBikeOpenApiClient__GetADTBySite__BigInteger_BigInteger_GetADTBySite_dateRange_Integer_Integer_GetADTBySite_groupBy_EList_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.BikeOpenApiClient#GetTotalTraffic(java.math.BigInteger, java.math.BigInteger, de.jena.bike.GetTotalTraffic_dateRange, java.lang.Integer, java.lang.Integer, de.jena.bike.GetTotalTraffic_groupBy, org.eclipse.emf.common.util.EList, java.lang.Boolean) <em>Get Total Traffic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Total Traffic</em>' operation.
	 * @see de.jena.bike.BikeOpenApiClient#GetTotalTraffic(java.math.BigInteger, java.math.BigInteger, de.jena.bike.GetTotalTraffic_dateRange, java.lang.Integer, java.lang.Integer, de.jena.bike.GetTotalTraffic_groupBy, org.eclipse.emf.common.util.EList, java.lang.Boolean)
	 * @generated
	 */
	EOperation getBikeOpenApiClient__GetTotalTraffic__BigInteger_BigInteger_GetTotalTraffic_dateRange_Integer_Integer_GetTotalTraffic_groupBy_EList_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.BikeOpenApiClient#GetRawTraffic(java.math.BigInteger, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, org.eclipse.emf.common.util.EList, java.lang.Boolean, java.lang.Boolean) <em>Get Raw Traffic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Raw Traffic</em>' operation.
	 * @see de.jena.bike.BikeOpenApiClient#GetRawTraffic(java.math.BigInteger, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, org.eclipse.emf.common.util.EList, java.lang.Boolean, java.lang.Boolean)
	 * @generated
	 */
	EOperation getBikeOpenApiClient__GetRawTraffic__BigInteger_EList_String_String_String_String_Boolean_EList_Boolean_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.BikeOpenApiClient#GetAggregatedTraffic(java.math.BigInteger, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, de.jena.bike.GetAggregatedTraffic_granularity, de.jena.bike.GetAggregatedTraffic_groupBy, java.lang.Boolean, org.eclipse.emf.common.util.EList, java.lang.Boolean, java.lang.Boolean) <em>Get Aggregated Traffic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Aggregated Traffic</em>' operation.
	 * @see de.jena.bike.BikeOpenApiClient#GetAggregatedTraffic(java.math.BigInteger, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, de.jena.bike.GetAggregatedTraffic_granularity, de.jena.bike.GetAggregatedTraffic_groupBy, java.lang.Boolean, org.eclipse.emf.common.util.EList, java.lang.Boolean, java.lang.Boolean)
	 * @generated
	 */
	EOperation getBikeOpenApiClient__GetAggregatedTraffic__BigInteger_EList_String_String_String_String_GetAggregatedTraffic_granularity_GetAggregatedTraffic_groupBy_Boolean_EList_Boolean_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.BikeOpenApiClient#GetTimestampTraffic(java.math.BigInteger, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Timestamp Traffic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Timestamp Traffic</em>' operation.
	 * @see de.jena.bike.BikeOpenApiClient#GetTimestampTraffic(java.math.BigInteger, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getBikeOpenApiClient__GetTimestampTraffic__BigInteger_String_String_String_String_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.BikeOpenApiClient#ValidationJobsGet(java.lang.Integer, java.lang.Integer) <em>Validation Jobs Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validation Jobs Get</em>' operation.
	 * @see de.jena.bike.BikeOpenApiClient#ValidationJobsGet(java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getBikeOpenApiClient__ValidationJobsGet__Integer_Integer();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.BikeOpenApiClient#ValidationJobCreate(de.jena.bike.ValidationJobCreate_request) <em>Validation Job Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validation Job Create</em>' operation.
	 * @see de.jena.bike.BikeOpenApiClient#ValidationJobCreate(de.jena.bike.ValidationJobCreate_request)
	 * @generated
	 */
	EOperation getBikeOpenApiClient__ValidationJobCreate__ValidationJobCreate_request();

	/**
	 * Returns the meta object for the '{@link de.jena.bike.BikeOpenApiClient#ValidationJobGet(java.lang.Integer) <em>Validation Job Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validation Job Get</em>' operation.
	 * @see de.jena.bike.BikeOpenApiClient#ValidationJobGet(java.lang.Integer)
	 * @generated
	 */
	EOperation getBikeOpenApiClient__ValidationJobGet__Integer();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.CreateExport_request <em>Create Export request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Export request</em>'.
	 * @see de.jena.bike.CreateExport_request
	 * @generated
	 */
	EClass getCreateExport_request();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetADT_dateRange <em>Get ADT date Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get ADT date Range</em>'.
	 * @see de.jena.bike.GetADT_dateRange
	 * @generated
	 */
	EClass getGetADT_dateRange();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetADT_groupBy <em>Get ADT group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get ADT group By</em>'.
	 * @see de.jena.bike.GetADT_groupBy
	 * @generated
	 */
	EClass getGetADT_groupBy();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetADT_travelModes <em>Get ADT travel Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get ADT travel Modes</em>'.
	 * @see de.jena.bike.GetADT_travelModes
	 * @generated
	 */
	EClass getGetADT_travelModes();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetADTBySite_dateRange <em>Get ADT By Site date Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get ADT By Site date Range</em>'.
	 * @see de.jena.bike.GetADTBySite_dateRange
	 * @generated
	 */
	EClass getGetADTBySite_dateRange();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetADTBySite_groupBy <em>Get ADT By Site group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get ADT By Site group By</em>'.
	 * @see de.jena.bike.GetADTBySite_groupBy
	 * @generated
	 */
	EClass getGetADTBySite_groupBy();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetADTBySite_travelModes <em>Get ADT By Site travel Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get ADT By Site travel Modes</em>'.
	 * @see de.jena.bike.GetADTBySite_travelModes
	 * @generated
	 */
	EClass getGetADTBySite_travelModes();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetTotalTraffic_dateRange <em>Get Total Traffic date Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Total Traffic date Range</em>'.
	 * @see de.jena.bike.GetTotalTraffic_dateRange
	 * @generated
	 */
	EClass getGetTotalTraffic_dateRange();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetTotalTraffic_groupBy <em>Get Total Traffic group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Total Traffic group By</em>'.
	 * @see de.jena.bike.GetTotalTraffic_groupBy
	 * @generated
	 */
	EClass getGetTotalTraffic_groupBy();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetTotalTraffic_travelModes <em>Get Total Traffic travel Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Total Traffic travel Modes</em>'.
	 * @see de.jena.bike.GetTotalTraffic_travelModes
	 * @generated
	 */
	EClass getGetTotalTraffic_travelModes();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetRawTraffic_include <em>Get Raw Traffic include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Raw Traffic include</em>'.
	 * @see de.jena.bike.GetRawTraffic_include
	 * @generated
	 */
	EClass getGetRawTraffic_include();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetRawTraffic_travelModes <em>Get Raw Traffic travel Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Raw Traffic travel Modes</em>'.
	 * @see de.jena.bike.GetRawTraffic_travelModes
	 * @generated
	 */
	EClass getGetRawTraffic_travelModes();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetAggregatedTraffic_include <em>Get Aggregated Traffic include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Aggregated Traffic include</em>'.
	 * @see de.jena.bike.GetAggregatedTraffic_include
	 * @generated
	 */
	EClass getGetAggregatedTraffic_include();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetAggregatedTraffic_granularity <em>Get Aggregated Traffic granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Aggregated Traffic granularity</em>'.
	 * @see de.jena.bike.GetAggregatedTraffic_granularity
	 * @generated
	 */
	EClass getGetAggregatedTraffic_granularity();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetAggregatedTraffic_groupBy <em>Get Aggregated Traffic group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Aggregated Traffic group By</em>'.
	 * @see de.jena.bike.GetAggregatedTraffic_groupBy
	 * @generated
	 */
	EClass getGetAggregatedTraffic_groupBy();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetAggregatedTraffic_travelModes <em>Get Aggregated Traffic travel Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Aggregated Traffic travel Modes</em>'.
	 * @see de.jena.bike.GetAggregatedTraffic_travelModes
	 * @generated
	 */
	EClass getGetAggregatedTraffic_travelModes();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetTimestampTraffic_travelModes <em>Get Timestamp Traffic travel Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Timestamp Traffic travel Modes</em>'.
	 * @see de.jena.bike.GetTimestampTraffic_travelModes
	 * @generated
	 */
	EClass getGetTimestampTraffic_travelModes();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.GetTimestampTraffic_directions <em>Get Timestamp Traffic directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Timestamp Traffic directions</em>'.
	 * @see de.jena.bike.GetTimestampTraffic_directions
	 * @generated
	 */
	EClass getGetTimestampTraffic_directions();

	/**
	 * Returns the meta object for class '{@link de.jena.bike.ValidationJobCreate_request <em>Validation Job Create request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Job Create request</em>'.
	 * @see de.jena.bike.ValidationJobCreate_request
	 * @generated
	 */
	EClass getValidationJobCreate_request();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.bike.ValidationJobCreate_request#getSiteIds <em>Site Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Site Ids</em>'.
	 * @see de.jena.bike.ValidationJobCreate_request#getSiteIds()
	 * @see #getValidationJobCreate_request()
	 * @generated
	 */
	EAttribute getValidationJobCreate_request_SiteIds();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.ValidationJobCreate_request#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see de.jena.bike.ValidationJobCreate_request#getStartDate()
	 * @see #getValidationJobCreate_request()
	 * @generated
	 */
	EAttribute getValidationJobCreate_request_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.bike.ValidationJobCreate_request#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see de.jena.bike.ValidationJobCreate_request#getEndDate()
	 * @see #getValidationJobCreate_request()
	 * @generated
	 */
	EAttribute getValidationJobCreate_request_EndDate();

	/**
	 * Returns the meta object for enum '{@link de.jena.bike.TravelModeLabel <em>Travel Mode Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Travel Mode Label</em>'.
	 * @see de.jena.bike.TravelModeLabel
	 * @generated
	 */
	EEnum getTravelModeLabel();

	/**
	 * Returns the meta object for enum '{@link de.jena.bike.DateRange <em>Date Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Range</em>'.
	 * @see de.jena.bike.DateRange
	 * @generated
	 */
	EEnum getDateRange();

	/**
	 * Returns the meta object for enum '{@link de.jena.bike.StatisticalAverageGroupBy <em>Statistical Average Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Statistical Average Group By</em>'.
	 * @see de.jena.bike.StatisticalAverageGroupBy
	 * @generated
	 */
	EEnum getStatisticalAverageGroupBy();

	/**
	 * Returns the meta object for enum '{@link de.jena.bike.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see de.jena.bike.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link de.jena.bike.StatisticalTotalGroupBy <em>Statistical Total Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Statistical Total Group By</em>'.
	 * @see de.jena.bike.StatisticalTotalGroupBy
	 * @generated
	 */
	EEnum getStatisticalTotalGroupBy();

	/**
	 * Returns the meta object for enum '{@link de.jena.bike.HistoricalRawTrafficInclude <em>Historical Raw Traffic Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Historical Raw Traffic Include</em>'.
	 * @see de.jena.bike.HistoricalRawTrafficInclude
	 * @generated
	 */
	EEnum getHistoricalRawTrafficInclude();

	/**
	 * Returns the meta object for enum '{@link de.jena.bike.HistoricalAggregatedTrafficInclude <em>Historical Aggregated Traffic Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Historical Aggregated Traffic Include</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTrafficInclude
	 * @generated
	 */
	EEnum getHistoricalAggregatedTrafficInclude();

	/**
	 * Returns the meta object for enum '{@link de.jena.bike.Granularity <em>Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Granularity</em>'.
	 * @see de.jena.bike.Granularity
	 * @generated
	 */
	EEnum getGranularity();

	/**
	 * Returns the meta object for enum '{@link de.jena.bike.HistoricalAggregatedTrafficGroupBy <em>Historical Aggregated Traffic Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Historical Aggregated Traffic Group By</em>'.
	 * @see de.jena.bike.HistoricalAggregatedTrafficGroupBy
	 * @generated
	 */
	EEnum getHistoricalAggregatedTrafficGroupBy();

	/**
	 * Returns the meta object for enum '{@link de.jena.bike.validationJobStatus <em>validation Job Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>validation Job Status</em>'.
	 * @see de.jena.bike.validationJobStatus
	 * @generated
	 */
	EEnum getvalidationJobStatus();

	/**
	 * Returns the meta object for data type '{@link jakarta.ws.rs.core.Response <em>JResponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JResponse</em>'.
	 * @see jakarta.ws.rs.core.Response
	 * @model instanceClass="jakarta.ws.rs.core.Response"
	 * @generated
	 */
	EDataType getJResponse();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BikeFactory getBikeFactory();

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
		 * The meta object literal for the '{@link de.jena.bike.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.LocationImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LAT = eINSTANCE.getLocation_Lat();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LON = eINSTANCE.getLocation_Lon();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GeometryImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY__TYPE = eINSTANCE.getGeometry_Type();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.PositionImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.LineStringCoordinatesImpl <em>Line String Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.LineStringCoordinatesImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getLineStringCoordinates()
		 * @generated
		 */
		EClass LINE_STRING_COORDINATES = eINSTANCE.getLineStringCoordinates();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.LineStringImpl <em>Line String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.LineStringImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getLineString()
		 * @generated
		 */
		EClass LINE_STRING = eINSTANCE.getLineString();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_STRING__COORDINATES = eINSTANCE.getLineString_Coordinates();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GeoJsonObjectImpl <em>Geo Json Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GeoJsonObjectImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGeoJsonObject()
		 * @generated
		 */
		EClass GEO_JSON_OBJECT = eINSTANCE.getGeoJsonObject();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.siteCounterImpl <em>site Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.siteCounterImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getsiteCounter()
		 * @generated
		 */
		EClass SITE_COUNTER = eINSTANCE.getsiteCounter();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE_COUNTER__ID = eINSTANCE.getsiteCounter_Id();

		/**
		 * The meta object literal for the '<em><b>Serial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE_COUNTER__SERIAL = eINSTANCE.getsiteCounter_Serial();

		/**
		 * The meta object literal for the '<em><b>Installation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE_COUNTER__INSTALLATION_DATE = eINSTANCE.getsiteCounter_InstallationDate();

		/**
		 * The meta object literal for the '<em><b>Detachment Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE_COUNTER__DETACHMENT_DATE = eINSTANCE.getsiteCounter_DetachmentDate();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.DomainImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__ID = eINSTANCE.getDomain_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.siteTagImpl <em>site Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.siteTagImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getsiteTag()
		 * @generated
		 */
		EClass SITE_TAG = eINSTANCE.getsiteTag();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE_TAG__ID = eINSTANCE.getsiteTag_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE_TAG__NAME = eINSTANCE.getsiteTag_Name();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.ImageImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__URL = eINSTANCE.getImage_Url();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.siteImpl <em>site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.siteImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getsite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getsite();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__ID = eINSTANCE.getsite_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__NAME = eINSTANCE.getsite_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__DESCRIPTION = eINSTANCE.getsite_Description();

		/**
		 * The meta object literal for the '<em><b>Custom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__CUSTOM_ID = eINSTANCE.getsite_CustomId();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__LOCATION = eINSTANCE.getsite_Location();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__SEGMENTS = eINSTANCE.getsite_Segments();

		/**
		 * The meta object literal for the '<em><b>First Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__FIRST_DATA = eINSTANCE.getsite_FirstData();

		/**
		 * The meta object literal for the '<em><b>Last Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__LAST_DATA = eINSTANCE.getsite_LastData();

		/**
		 * The meta object literal for the '<em><b>Granularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__GRANULARITY = eINSTANCE.getsite_Granularity();

		/**
		 * The meta object literal for the '<em><b>Travel Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__TRAVEL_MODES = eINSTANCE.getsite_TravelModes();

		/**
		 * The meta object literal for the '<em><b>Directional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__DIRECTIONAL = eINSTANCE.getsite_Directional();

		/**
		 * The meta object literal for the '<em><b>Counters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__COUNTERS = eINSTANCE.getsite_Counters();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__DOMAIN = eINSTANCE.getsite_Domain();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__TAGS = eINSTANCE.getsite_Tags();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__IMAGES = eINSTANCE.getsite_Images();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__ATTRIBUTES = eINSTANCE.getsite_Attributes();

		/**
		 * The meta object literal for the '<em><b>Has Timestamped Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__HAS_TIMESTAMPED_DATA = eINSTANCE.getsite_HasTimestampedData();

		/**
		 * The meta object literal for the '<em><b>Has Weather</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__HAS_WEATHER = eINSTANCE.getsite_HasWeather();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.BadRequestImpl <em>Bad Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.BadRequestImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getBadRequest()
		 * @generated
		 */
		EClass BAD_REQUEST = eINSTANCE.getBadRequest();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAD_REQUEST__STATUS = eINSTANCE.getBadRequest_Status();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAD_REQUEST__CODE = eINSTANCE.getBadRequest_Code();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAD_REQUEST__MESSAGE = eINSTANCE.getBadRequest_Message();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.UnauthorizedImpl <em>Unauthorized</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.UnauthorizedImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getUnauthorized()
		 * @generated
		 */
		EClass UNAUTHORIZED = eINSTANCE.getUnauthorized();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNAUTHORIZED__STATUS = eINSTANCE.getUnauthorized_Status();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNAUTHORIZED__CODE = eINSTANCE.getUnauthorized_Code();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNAUTHORIZED__MESSAGE = eINSTANCE.getUnauthorized_Message();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.ForbiddenImpl <em>Forbidden</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.ForbiddenImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getForbidden()
		 * @generated
		 */
		EClass FORBIDDEN = eINSTANCE.getForbidden();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORBIDDEN__STATUS = eINSTANCE.getForbidden_Status();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORBIDDEN__CODE = eINSTANCE.getForbidden_Code();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORBIDDEN__MESSAGE = eINSTANCE.getForbidden_Message();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.TooManyRequestsImpl <em>Too Many Requests</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.TooManyRequestsImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getTooManyRequests()
		 * @generated
		 */
		EClass TOO_MANY_REQUESTS = eINSTANCE.getTooManyRequests();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOO_MANY_REQUESTS__STATUS = eINSTANCE.getTooManyRequests_Status();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOO_MANY_REQUESTS__CODE = eINSTANCE.getTooManyRequests_Code();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOO_MANY_REQUESTS__MESSAGE = eINSTANCE.getTooManyRequests_Message();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.tagImpl <em>tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.tagImpl
		 * @see de.jena.bike.impl.BikePackageImpl#gettag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.gettag();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__ID = eINSTANCE.gettag_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.gettag_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__DESCRIPTION = eINSTANCE.gettag_Description();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__COLOR = eINSTANCE.gettag_Color();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__DOMAIN = eINSTANCE.gettag_Domain();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.ExportCreationImpl <em>Export Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.ExportCreationImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getExportCreation()
		 * @generated
		 */
		EClass EXPORT_CREATION = eINSTANCE.getExportCreation();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_CREATION__START_DATE = eINSTANCE.getExportCreation_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_CREATION__END_DATE = eINSTANCE.getExportCreation_EndDate();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_CREATION__START_TIME = eINSTANCE.getExportCreation_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_CREATION__END_TIME = eINSTANCE.getExportCreation_EndTime();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_CREATION__SCHEMA = eINSTANCE.getExportCreation_Schema();

		/**
		 * The meta object literal for the '<em><b>Site Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_CREATION__SITE_IDS = eINSTANCE.getExportCreation_SiteIds();

		/**
		 * The meta object literal for the '<em><b>Granularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_CREATION__GRANULARITY = eINSTANCE.getExportCreation_Granularity();

		/**
		 * The meta object literal for the '<em><b>Validated Data Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_CREATION__VALIDATED_DATA_ONLY = eINSTANCE.getExportCreation_ValidatedDataOnly();

		/**
		 * The meta object literal for the '<em><b>Gap Filling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_CREATION__GAP_FILLING = eINSTANCE.getExportCreation_GapFilling();

		/**
		 * The meta object literal for the '<em><b>Validate Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_CREATION__VALIDATE_SCHEMA = eINSTANCE.getExportCreation_ValidateSchema();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.ExportImpl <em>Export</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.ExportImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getExport()
		 * @generated
		 */
		EClass EXPORT = eINSTANCE.getExport();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT__ID = eINSTANCE.getExport_Id();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT__STATUS = eINSTANCE.getExport_Status();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT__URL = eINSTANCE.getExport_Url();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT__ERROR_MESSAGE = eINSTANCE.getExport_ErrorMessage();

		/**
		 * The meta object literal for the '<em><b>End Processing Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT__END_PROCESSING_DATE_TIME = eINSTANCE.getExport_EndProcessingDateTime();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.NotFoundImpl <em>Not Found</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.NotFoundImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getNotFound()
		 * @generated
		 */
		EClass NOT_FOUND = eINSTANCE.getNotFound();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOT_FOUND__STATUS = eINSTANCE.getNotFound_Status();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOT_FOUND__CODE = eINSTANCE.getNotFound_Code();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOT_FOUND__MESSAGE = eINSTANCE.getNotFound_Message();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.DirectionNameImpl <em>Direction Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.DirectionNameImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getDirectionName()
		 * @generated
		 */
		EClass DIRECTION_NAME = eINSTANCE.getDirectionName();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.ValueImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.StatisticalTrafficImpl <em>Statistical Traffic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.StatisticalTrafficImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getStatisticalTraffic()
		 * @generated
		 */
		EClass STATISTICAL_TRAFFIC = eINSTANCE.getStatisticalTraffic();

		/**
		 * The meta object literal for the '<em><b>Site Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICAL_TRAFFIC__SITE_ID = eINSTANCE.getStatisticalTraffic_SiteId();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICAL_TRAFFIC__DATE = eINSTANCE.getStatisticalTraffic_Date();

		/**
		 * The meta object literal for the '<em><b>Travel Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTICAL_TRAFFIC__TRAVEL_MODE = eINSTANCE.getStatisticalTraffic_TravelMode();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTICAL_TRAFFIC__DIRECTION = eINSTANCE.getStatisticalTraffic_Direction();

		/**
		 * The meta object literal for the '<em><b>Direction Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTICAL_TRAFFIC__DIRECTION_NAME = eINSTANCE.getStatisticalTraffic_DirectionName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTICAL_TRAFFIC__VALUE = eINSTANCE.getStatisticalTraffic_Value();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.BaseSerieImpl <em>Base Serie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.BaseSerieImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getBaseSerie()
		 * @generated
		 */
		EClass BASE_SERIE = eINSTANCE.getBaseSerie();

		/**
		 * The meta object literal for the '<em><b>Travel Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_SERIE__TRAVEL_MODE = eINSTANCE.getBaseSerie_TravelMode();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_SERIE__DIRECTION = eINSTANCE.getBaseSerie_Direction();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.DateTimeImpl <em>Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.DateTimeImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getDateTime()
		 * @generated
		 */
		EClass DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.CountImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getCount()
		 * @generated
		 */
		EClass COUNT = eINSTANCE.getCount();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.DataStatusImpl <em>Data Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.DataStatusImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getDataStatus()
		 * @generated
		 */
		EClass DATA_STATUS = eINSTANCE.getDataStatus();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.HistoricalRawTrafficImpl <em>Historical Raw Traffic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.HistoricalRawTrafficImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalRawTraffic()
		 * @generated
		 */
		EClass HISTORICAL_RAW_TRAFFIC = eINSTANCE.getHistoricalRawTraffic();

		/**
		 * The meta object literal for the '<em><b>Flow ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_RAW_TRAFFIC__FLOW_ID = eINSTANCE.getHistoricalRawTraffic_FlowID();

		/**
		 * The meta object literal for the '<em><b>Flow Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_RAW_TRAFFIC__FLOW_NAME = eINSTANCE.getHistoricalRawTraffic_FlowName();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORICAL_RAW_TRAFFIC__DATA = eINSTANCE.getHistoricalRawTraffic_Data();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.HistoricalAggregatedTrafficImpl <em>Historical Aggregated Traffic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.HistoricalAggregatedTrafficImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTraffic()
		 * @generated
		 */
		EClass HISTORICAL_AGGREGATED_TRAFFIC = eINSTANCE.getHistoricalAggregatedTraffic();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORICAL_AGGREGATED_TRAFFIC__DATA = eINSTANCE.getHistoricalAggregatedTraffic_Data();

		/**
		 * The meta object literal for the '<em><b>Direction Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORICAL_AGGREGATED_TRAFFIC__DIRECTION_NAME = eINSTANCE.getHistoricalAggregatedTraffic_DirectionName();

		/**
		 * The meta object literal for the '<em><b>Flow ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_AGGREGATED_TRAFFIC__FLOW_ID = eINSTANCE.getHistoricalAggregatedTraffic_FlowID();

		/**
		 * The meta object literal for the '<em><b>Flow Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_AGGREGATED_TRAFFIC__FLOW_NAME = eINSTANCE.getHistoricalAggregatedTraffic_FlowName();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.LaneImpl <em>Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.LaneImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getLane()
		 * @generated
		 */
		EClass LANE = eINSTANCE.getLane();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.HistoricalTimestampTrafficImpl <em>Historical Timestamp Traffic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.HistoricalTimestampTrafficImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalTimestampTraffic()
		 * @generated
		 */
		EClass HISTORICAL_TIMESTAMP_TRAFFIC = eINSTANCE.getHistoricalTimestampTraffic();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORICAL_TIMESTAMP_TRAFFIC__TIMESTAMP = eINSTANCE.getHistoricalTimestampTraffic_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Lane</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORICAL_TIMESTAMP_TRAFFIC__LANE = eINSTANCE.getHistoricalTimestampTraffic_Lane();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_TIMESTAMP_TRAFFIC__SPEED = eINSTANCE.getHistoricalTimestampTraffic_Speed();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.validationJobImpl <em>validation Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.validationJobImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getvalidationJob()
		 * @generated
		 */
		EClass VALIDATION_JOB = eINSTANCE.getvalidationJob();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_JOB__ID = eINSTANCE.getvalidationJob_Id();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_JOB__STATUS = eINSTANCE.getvalidationJob_Status();

		/**
		 * The meta object literal for the '<em><b>Site Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_JOB__SITE_IDS = eINSTANCE.getvalidationJob_SiteIds();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_JOB__START_DATE = eINSTANCE.getvalidationJob_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_JOB__END_DATE = eINSTANCE.getvalidationJob_EndDate();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_JOB__ERROR_MESSAGE = eINSTANCE.getvalidationJob_ErrorMessage();

		/**
		 * The meta object literal for the '<em><b>End Processing Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_JOB__END_PROCESSING_DATE_TIME = eINSTANCE.getvalidationJob_EndProcessingDateTime();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_JOB__CREATED_AT = eINSTANCE.getvalidationJob_CreatedAt();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.validationJobCreatedImpl <em>validation Job Created</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.validationJobCreatedImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getvalidationJobCreated()
		 * @generated
		 */
		EClass VALIDATION_JOB_CREATED = eINSTANCE.getvalidationJobCreated();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_JOB_CREATED__ID = eINSTANCE.getvalidationJobCreated_Id();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_JOB_CREATED__STATUS = eINSTANCE.getvalidationJobCreated_Status();

		/**
		 * The meta object literal for the '<em><b>Site Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_JOB_CREATED__SITE_IDS = eINSTANCE.getvalidationJobCreated_SiteIds();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_JOB_CREATED__START_DATE = eINSTANCE.getvalidationJobCreated_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_JOB_CREATED__END_DATE = eINSTANCE.getvalidationJobCreated_EndDate();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.ConflictImpl <em>Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.ConflictImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getConflict()
		 * @generated
		 */
		EClass CONFLICT = eINSTANCE.getConflict();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFLICT__STATUS = eINSTANCE.getConflict_Status();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFLICT__CODE = eINSTANCE.getConflict_Code();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFLICT__MESSAGE = eINSTANCE.getConflict_Message();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.LineString_coordinatesImpl <em>Line String coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.LineString_coordinatesImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getLineString_coordinates()
		 * @generated
		 */
		EClass LINE_STRING_COORDINATES = eINSTANCE.getLineString_coordinates();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.site_locationImpl <em>site location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.site_locationImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getsite_location()
		 * @generated
		 */
		EClass SITE_LOCATION = eINSTANCE.getsite_location();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.site_segmentsImpl <em>site segments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.site_segmentsImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getsite_segments()
		 * @generated
		 */
		EClass SITE_SEGMENTS = eINSTANCE.getsite_segments();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.site_travelModesImpl <em>site travel Modes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.site_travelModesImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getsite_travelModes()
		 * @generated
		 */
		EClass SITE_TRAVEL_MODES = eINSTANCE.getsite_travelModes();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.site_countersImpl <em>site counters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.site_countersImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getsite_counters()
		 * @generated
		 */
		EClass SITE_COUNTERS = eINSTANCE.getsite_counters();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.site_domainImpl <em>site domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.site_domainImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getsite_domain()
		 * @generated
		 */
		EClass SITE_DOMAIN = eINSTANCE.getsite_domain();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.site_tagsImpl <em>site tags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.site_tagsImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getsite_tags()
		 * @generated
		 */
		EClass SITE_TAGS = eINSTANCE.getsite_tags();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.site_imagesImpl <em>site images</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.site_imagesImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getsite_images()
		 * @generated
		 */
		EClass SITE_IMAGES = eINSTANCE.getsite_images();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.tag_domainImpl <em>tag domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.tag_domainImpl
		 * @see de.jena.bike.impl.BikePackageImpl#gettag_domain()
		 * @generated
		 */
		EClass TAG_DOMAIN = eINSTANCE.gettag_domain();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.StatisticalTraffic_travelModeImpl <em>Statistical Traffic travel Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.StatisticalTraffic_travelModeImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getStatisticalTraffic_travelMode()
		 * @generated
		 */
		EClass STATISTICAL_TRAFFIC_TRAVEL_MODE = eINSTANCE.getStatisticalTraffic_travelMode();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.StatisticalTraffic_directionImpl <em>Statistical Traffic direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.StatisticalTraffic_directionImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getStatisticalTraffic_direction()
		 * @generated
		 */
		EClass STATISTICAL_TRAFFIC_DIRECTION = eINSTANCE.getStatisticalTraffic_direction();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.StatisticalTraffic_directionNameImpl <em>Statistical Traffic direction Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.StatisticalTraffic_directionNameImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getStatisticalTraffic_directionName()
		 * @generated
		 */
		EClass STATISTICAL_TRAFFIC_DIRECTION_NAME = eINSTANCE.getStatisticalTraffic_directionName();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.StatisticalTraffic_valueImpl <em>Statistical Traffic value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.StatisticalTraffic_valueImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getStatisticalTraffic_value()
		 * @generated
		 */
		EClass STATISTICAL_TRAFFIC_VALUE = eINSTANCE.getStatisticalTraffic_value();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.BaseSerie_travelModeImpl <em>Base Serie travel Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.BaseSerie_travelModeImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getBaseSerie_travelMode()
		 * @generated
		 */
		EClass BASE_SERIE_TRAVEL_MODE = eINSTANCE.getBaseSerie_travelMode();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.BaseSerie_directionImpl <em>Base Serie direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.BaseSerie_directionImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getBaseSerie_direction()
		 * @generated
		 */
		EClass BASE_SERIE_DIRECTION = eINSTANCE.getBaseSerie_direction();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.HistoricalRawTraffic_dataImpl <em>Historical Raw Traffic data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.HistoricalRawTraffic_dataImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalRawTraffic_data()
		 * @generated
		 */
		EClass HISTORICAL_RAW_TRAFFIC_DATA = eINSTANCE.getHistoricalRawTraffic_data();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORICAL_RAW_TRAFFIC_DATA__TIMESTAMP = eINSTANCE.getHistoricalRawTraffic_data_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Granularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_RAW_TRAFFIC_DATA__GRANULARITY = eINSTANCE.getHistoricalRawTraffic_data_Granularity();

		/**
		 * The meta object literal for the '<em><b>Counts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORICAL_RAW_TRAFFIC_DATA__COUNTS = eINSTANCE.getHistoricalRawTraffic_data_Counts();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORICAL_RAW_TRAFFIC_DATA__STATUS = eINSTANCE.getHistoricalRawTraffic_data_Status();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.HistoricalRawTraffic_data_timestampImpl <em>Historical Raw Traffic data timestamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.HistoricalRawTraffic_data_timestampImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalRawTraffic_data_timestamp()
		 * @generated
		 */
		EClass HISTORICAL_RAW_TRAFFIC_DATA_TIMESTAMP = eINSTANCE.getHistoricalRawTraffic_data_timestamp();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.HistoricalRawTraffic_data_countsImpl <em>Historical Raw Traffic data counts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.HistoricalRawTraffic_data_countsImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalRawTraffic_data_counts()
		 * @generated
		 */
		EClass HISTORICAL_RAW_TRAFFIC_DATA_COUNTS = eINSTANCE.getHistoricalRawTraffic_data_counts();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.HistoricalRawTraffic_data_statusImpl <em>Historical Raw Traffic data status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.HistoricalRawTraffic_data_statusImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalRawTraffic_data_status()
		 * @generated
		 */
		EClass HISTORICAL_RAW_TRAFFIC_DATA_STATUS = eINSTANCE.getHistoricalRawTraffic_data_status();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.HistoricalAggregatedTraffic_dataImpl <em>Historical Aggregated Traffic data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.HistoricalAggregatedTraffic_dataImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTraffic_data()
		 * @generated
		 */
		EClass HISTORICAL_AGGREGATED_TRAFFIC_DATA = eINSTANCE.getHistoricalAggregatedTraffic_data();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORICAL_AGGREGATED_TRAFFIC_DATA__TIMESTAMP = eINSTANCE.getHistoricalAggregatedTraffic_data_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Traffic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORICAL_AGGREGATED_TRAFFIC_DATA__TRAFFIC = eINSTANCE.getHistoricalAggregatedTraffic_data_Traffic();

		/**
		 * The meta object literal for the '<em><b>Weather</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORICAL_AGGREGATED_TRAFFIC_DATA__WEATHER = eINSTANCE.getHistoricalAggregatedTraffic_data_Weather();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.HistoricalAggregatedTraffic_data_timestampImpl <em>Historical Aggregated Traffic data timestamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.HistoricalAggregatedTraffic_data_timestampImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTraffic_data_timestamp()
		 * @generated
		 */
		EClass HISTORICAL_AGGREGATED_TRAFFIC_DATA_TIMESTAMP = eINSTANCE.getHistoricalAggregatedTraffic_data_timestamp();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.HistoricalAggregatedTraffic_data_trafficImpl <em>Historical Aggregated Traffic data traffic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.HistoricalAggregatedTraffic_data_trafficImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTraffic_data_traffic()
		 * @generated
		 */
		EClass HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC = eINSTANCE.getHistoricalAggregatedTraffic_data_traffic();

		/**
		 * The meta object literal for the '<em><b>Counts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__COUNTS = eINSTANCE.getHistoricalAggregatedTraffic_data_traffic_Counts();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__STATUS = eINSTANCE.getHistoricalAggregatedTraffic_data_traffic_Status();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.HistoricalAggregatedTraffic_data_traffic_countsImpl <em>Historical Aggregated Traffic data traffic counts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.HistoricalAggregatedTraffic_data_traffic_countsImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTraffic_data_traffic_counts()
		 * @generated
		 */
		EClass HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC_COUNTS = eINSTANCE.getHistoricalAggregatedTraffic_data_traffic_counts();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.HistoricalAggregatedTraffic_data_weatherImpl <em>Historical Aggregated Traffic data weather</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.HistoricalAggregatedTraffic_data_weatherImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTraffic_data_weather()
		 * @generated
		 */
		EClass HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER = eINSTANCE.getHistoricalAggregatedTraffic_data_weather();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__TEMPERATURE = eINSTANCE.getHistoricalAggregatedTraffic_data_weather_Temperature();

		/**
		 * The meta object literal for the '<em><b>Rain Accumulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__RAIN_ACCUMULATION = eINSTANCE.getHistoricalAggregatedTraffic_data_weather_RainAccumulation();

		/**
		 * The meta object literal for the '<em><b>Snow Accumulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__SNOW_ACCUMULATION = eINSTANCE.getHistoricalAggregatedTraffic_data_weather_SnowAccumulation();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.HistoricalAggregatedTraffic_directionNameImpl <em>Historical Aggregated Traffic direction Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.HistoricalAggregatedTraffic_directionNameImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTraffic_directionName()
		 * @generated
		 */
		EClass HISTORICAL_AGGREGATED_TRAFFIC_DIRECTION_NAME = eINSTANCE.getHistoricalAggregatedTraffic_directionName();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.HistoricalTimestampTraffic_timestampImpl <em>Historical Timestamp Traffic timestamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.HistoricalTimestampTraffic_timestampImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalTimestampTraffic_timestamp()
		 * @generated
		 */
		EClass HISTORICAL_TIMESTAMP_TRAFFIC_TIMESTAMP = eINSTANCE.getHistoricalTimestampTraffic_timestamp();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.HistoricalTimestampTraffic_laneImpl <em>Historical Timestamp Traffic lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.HistoricalTimestampTraffic_laneImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalTimestampTraffic_lane()
		 * @generated
		 */
		EClass HISTORICAL_TIMESTAMP_TRAFFIC_LANE = eINSTANCE.getHistoricalTimestampTraffic_lane();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.validationJob_statusImpl <em>validation Job status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.validationJob_statusImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getvalidationJob_status()
		 * @generated
		 */
		EClass VALIDATION_JOB_STATUS = eINSTANCE.getvalidationJob_status();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.validationJobCreated_statusImpl <em>validation Job Created status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.validationJobCreated_statusImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getvalidationJobCreated_status()
		 * @generated
		 */
		EClass VALIDATION_JOB_CREATED_STATUS = eINSTANCE.getvalidationJobCreated_status();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.ResponseImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__CODE = eINSTANCE.getResponse_Code();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__DESCRIPTION = eINSTANCE.getResponse_Description();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__RESPONSE = eINSTANCE.getResponse_Response();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__RESULT = eINSTANCE.getResponse_Result();

		/**
		 * The meta object literal for the '{@link de.jena.bike.OpenApiClient <em>Open Api Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.OpenApiClient
		 * @see de.jena.bike.impl.BikePackageImpl#getOpenApiClient()
		 * @generated
		 */
		EClass OPEN_API_CLIENT = eINSTANCE.getOpenApiClient();

		/**
		 * The meta object literal for the '<em><b>To Query String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPEN_API_CLIENT___TO_QUERY_STRING__STRING_OBJECT = eINSTANCE.getOpenApiClient__ToQueryString__String_Object();

		/**
		 * The meta object literal for the '<em><b>get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPEN_API_CLIENT___GET__STRING_ECLASS_EMAP_EMAP = eINSTANCE.getOpenApiClient___get__String_EClass_EMap_EMap();

		/**
		 * The meta object literal for the '<em><b>delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPEN_API_CLIENT___DELETE__STRING_ECLASS_EMAP_EMAP = eINSTANCE.getOpenApiClient___delete__String_EClass_EMap_EMap();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.BikeOpenApiClientImpl <em>Open Api Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.BikeOpenApiClientImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getBikeOpenApiClient()
		 * @generated
		 */
		EClass BIKE_OPEN_API_CLIENT = eINSTANCE.getBikeOpenApiClient();

		/**
		 * The meta object literal for the '<em><b>Get Sites</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIKE_OPEN_API_CLIENT___GET_SITES__INTEGER_INTEGER_STRING_STRING_ELIST_ELIST_ELIST_ELIST_ELIST = eINSTANCE.getBikeOpenApiClient__GetSites__Integer_Integer_String_String_EList_EList_EList_EList_EList();

		/**
		 * The meta object literal for the '<em><b>Get Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIKE_OPEN_API_CLIENT___GET_TAGS__INTEGER_INTEGER_STRING_STRING_ELIST_ELIST_ELIST = eINSTANCE.getBikeOpenApiClient__GetTags__Integer_Integer_String_String_EList_EList_EList();

		/**
		 * The meta object literal for the '<em><b>Create Export</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIKE_OPEN_API_CLIENT___CREATE_EXPORT__CREATEEXPORT_REQUEST = eINSTANCE.getBikeOpenApiClient__CreateExport__CreateExport_request();

		/**
		 * The meta object literal for the '<em><b>Get Export Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIKE_OPEN_API_CLIENT___GET_EXPORT_STATUS__INTEGER = eINSTANCE.getBikeOpenApiClient__GetExportStatus__Integer();

		/**
		 * The meta object literal for the '<em><b>Download Export Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIKE_OPEN_API_CLIENT___DOWNLOAD_EXPORT_DATA__INTEGER = eINSTANCE.getBikeOpenApiClient__DownloadExportData__Integer();

		/**
		 * The meta object literal for the '<em><b>Get ADT</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIKE_OPEN_API_CLIENT___GET_ADT__BIGINTEGER_BIGINTEGER_GETADT_DATERANGE_INTEGER_INTEGER_GETADT_GROUPBY_ELIST_BOOLEAN = eINSTANCE.getBikeOpenApiClient__GetADT__BigInteger_BigInteger_GetADT_dateRange_Integer_Integer_GetADT_groupBy_EList_Boolean();

		/**
		 * The meta object literal for the '<em><b>Get ADT By Site</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIKE_OPEN_API_CLIENT___GET_ADT_BY_SITE__BIGINTEGER_BIGINTEGER_GETADTBYSITE_DATERANGE_INTEGER_INTEGER_GETADTBYSITE_GROUPBY_ELIST_BOOLEAN = eINSTANCE.getBikeOpenApiClient__GetADTBySite__BigInteger_BigInteger_GetADTBySite_dateRange_Integer_Integer_GetADTBySite_groupBy_EList_Boolean();

		/**
		 * The meta object literal for the '<em><b>Get Total Traffic</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIKE_OPEN_API_CLIENT___GET_TOTAL_TRAFFIC__BIGINTEGER_BIGINTEGER_GETTOTALTRAFFIC_DATERANGE_INTEGER_INTEGER_GETTOTALTRAFFIC_GROUPBY_ELIST_BOOLEAN = eINSTANCE.getBikeOpenApiClient__GetTotalTraffic__BigInteger_BigInteger_GetTotalTraffic_dateRange_Integer_Integer_GetTotalTraffic_groupBy_EList_Boolean();

		/**
		 * The meta object literal for the '<em><b>Get Raw Traffic</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIKE_OPEN_API_CLIENT___GET_RAW_TRAFFIC__BIGINTEGER_ELIST_STRING_STRING_STRING_STRING_BOOLEAN_ELIST_BOOLEAN_BOOLEAN = eINSTANCE.getBikeOpenApiClient__GetRawTraffic__BigInteger_EList_String_String_String_String_Boolean_EList_Boolean_Boolean();

		/**
		 * The meta object literal for the '<em><b>Get Aggregated Traffic</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIKE_OPEN_API_CLIENT___GET_AGGREGATED_TRAFFIC__BIGINTEGER_ELIST_STRING_STRING_STRING_STRING_GETAGGREGATEDTRAFFIC_GRANULARITY_GETAGGREGATEDTRAFFIC_GROUPBY_BOOLEAN_ELIST_BOOLEAN_BOOLEAN = eINSTANCE.getBikeOpenApiClient__GetAggregatedTraffic__BigInteger_EList_String_String_String_String_GetAggregatedTraffic_granularity_GetAggregatedTraffic_groupBy_Boolean_EList_Boolean_Boolean();

		/**
		 * The meta object literal for the '<em><b>Get Timestamp Traffic</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIKE_OPEN_API_CLIENT___GET_TIMESTAMP_TRAFFIC__BIGINTEGER_STRING_STRING_STRING_STRING_ELIST_ELIST = eINSTANCE.getBikeOpenApiClient__GetTimestampTraffic__BigInteger_String_String_String_String_EList_EList();

		/**
		 * The meta object literal for the '<em><b>Validation Jobs Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIKE_OPEN_API_CLIENT___VALIDATION_JOBS_GET__INTEGER_INTEGER = eINSTANCE.getBikeOpenApiClient__ValidationJobsGet__Integer_Integer();

		/**
		 * The meta object literal for the '<em><b>Validation Job Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIKE_OPEN_API_CLIENT___VALIDATION_JOB_CREATE__VALIDATIONJOBCREATE_REQUEST = eINSTANCE.getBikeOpenApiClient__ValidationJobCreate__ValidationJobCreate_request();

		/**
		 * The meta object literal for the '<em><b>Validation Job Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIKE_OPEN_API_CLIENT___VALIDATION_JOB_GET__INTEGER = eINSTANCE.getBikeOpenApiClient__ValidationJobGet__Integer();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.CreateExport_requestImpl <em>Create Export request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.CreateExport_requestImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getCreateExport_request()
		 * @generated
		 */
		EClass CREATE_EXPORT_REQUEST = eINSTANCE.getCreateExport_request();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetADT_dateRangeImpl <em>Get ADT date Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetADT_dateRangeImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetADT_dateRange()
		 * @generated
		 */
		EClass GET_ADT_DATE_RANGE = eINSTANCE.getGetADT_dateRange();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetADT_groupByImpl <em>Get ADT group By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetADT_groupByImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetADT_groupBy()
		 * @generated
		 */
		EClass GET_ADT_GROUP_BY = eINSTANCE.getGetADT_groupBy();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetADT_travelModesImpl <em>Get ADT travel Modes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetADT_travelModesImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetADT_travelModes()
		 * @generated
		 */
		EClass GET_ADT_TRAVEL_MODES = eINSTANCE.getGetADT_travelModes();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetADTBySite_dateRangeImpl <em>Get ADT By Site date Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetADTBySite_dateRangeImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetADTBySite_dateRange()
		 * @generated
		 */
		EClass GET_ADT_BY_SITE_DATE_RANGE = eINSTANCE.getGetADTBySite_dateRange();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetADTBySite_groupByImpl <em>Get ADT By Site group By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetADTBySite_groupByImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetADTBySite_groupBy()
		 * @generated
		 */
		EClass GET_ADT_BY_SITE_GROUP_BY = eINSTANCE.getGetADTBySite_groupBy();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetADTBySite_travelModesImpl <em>Get ADT By Site travel Modes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetADTBySite_travelModesImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetADTBySite_travelModes()
		 * @generated
		 */
		EClass GET_ADT_BY_SITE_TRAVEL_MODES = eINSTANCE.getGetADTBySite_travelModes();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetTotalTraffic_dateRangeImpl <em>Get Total Traffic date Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetTotalTraffic_dateRangeImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetTotalTraffic_dateRange()
		 * @generated
		 */
		EClass GET_TOTAL_TRAFFIC_DATE_RANGE = eINSTANCE.getGetTotalTraffic_dateRange();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetTotalTraffic_groupByImpl <em>Get Total Traffic group By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetTotalTraffic_groupByImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetTotalTraffic_groupBy()
		 * @generated
		 */
		EClass GET_TOTAL_TRAFFIC_GROUP_BY = eINSTANCE.getGetTotalTraffic_groupBy();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetTotalTraffic_travelModesImpl <em>Get Total Traffic travel Modes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetTotalTraffic_travelModesImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetTotalTraffic_travelModes()
		 * @generated
		 */
		EClass GET_TOTAL_TRAFFIC_TRAVEL_MODES = eINSTANCE.getGetTotalTraffic_travelModes();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetRawTraffic_includeImpl <em>Get Raw Traffic include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetRawTraffic_includeImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetRawTraffic_include()
		 * @generated
		 */
		EClass GET_RAW_TRAFFIC_INCLUDE = eINSTANCE.getGetRawTraffic_include();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetRawTraffic_travelModesImpl <em>Get Raw Traffic travel Modes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetRawTraffic_travelModesImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetRawTraffic_travelModes()
		 * @generated
		 */
		EClass GET_RAW_TRAFFIC_TRAVEL_MODES = eINSTANCE.getGetRawTraffic_travelModes();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetAggregatedTraffic_includeImpl <em>Get Aggregated Traffic include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetAggregatedTraffic_includeImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetAggregatedTraffic_include()
		 * @generated
		 */
		EClass GET_AGGREGATED_TRAFFIC_INCLUDE = eINSTANCE.getGetAggregatedTraffic_include();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetAggregatedTraffic_granularityImpl <em>Get Aggregated Traffic granularity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetAggregatedTraffic_granularityImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetAggregatedTraffic_granularity()
		 * @generated
		 */
		EClass GET_AGGREGATED_TRAFFIC_GRANULARITY = eINSTANCE.getGetAggregatedTraffic_granularity();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetAggregatedTraffic_groupByImpl <em>Get Aggregated Traffic group By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetAggregatedTraffic_groupByImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetAggregatedTraffic_groupBy()
		 * @generated
		 */
		EClass GET_AGGREGATED_TRAFFIC_GROUP_BY = eINSTANCE.getGetAggregatedTraffic_groupBy();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetAggregatedTraffic_travelModesImpl <em>Get Aggregated Traffic travel Modes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetAggregatedTraffic_travelModesImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetAggregatedTraffic_travelModes()
		 * @generated
		 */
		EClass GET_AGGREGATED_TRAFFIC_TRAVEL_MODES = eINSTANCE.getGetAggregatedTraffic_travelModes();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetTimestampTraffic_travelModesImpl <em>Get Timestamp Traffic travel Modes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetTimestampTraffic_travelModesImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetTimestampTraffic_travelModes()
		 * @generated
		 */
		EClass GET_TIMESTAMP_TRAFFIC_TRAVEL_MODES = eINSTANCE.getGetTimestampTraffic_travelModes();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.GetTimestampTraffic_directionsImpl <em>Get Timestamp Traffic directions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.GetTimestampTraffic_directionsImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getGetTimestampTraffic_directions()
		 * @generated
		 */
		EClass GET_TIMESTAMP_TRAFFIC_DIRECTIONS = eINSTANCE.getGetTimestampTraffic_directions();

		/**
		 * The meta object literal for the '{@link de.jena.bike.impl.ValidationJobCreate_requestImpl <em>Validation Job Create request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.impl.ValidationJobCreate_requestImpl
		 * @see de.jena.bike.impl.BikePackageImpl#getValidationJobCreate_request()
		 * @generated
		 */
		EClass VALIDATION_JOB_CREATE_REQUEST = eINSTANCE.getValidationJobCreate_request();

		/**
		 * The meta object literal for the '<em><b>Site Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_JOB_CREATE_REQUEST__SITE_IDS = eINSTANCE.getValidationJobCreate_request_SiteIds();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_JOB_CREATE_REQUEST__START_DATE = eINSTANCE.getValidationJobCreate_request_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_JOB_CREATE_REQUEST__END_DATE = eINSTANCE.getValidationJobCreate_request_EndDate();

		/**
		 * The meta object literal for the '{@link de.jena.bike.TravelModeLabel <em>Travel Mode Label</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.TravelModeLabel
		 * @see de.jena.bike.impl.BikePackageImpl#getTravelModeLabel()
		 * @generated
		 */
		EEnum TRAVEL_MODE_LABEL = eINSTANCE.getTravelModeLabel();

		/**
		 * The meta object literal for the '{@link de.jena.bike.DateRange <em>Date Range</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.DateRange
		 * @see de.jena.bike.impl.BikePackageImpl#getDateRange()
		 * @generated
		 */
		EEnum DATE_RANGE = eINSTANCE.getDateRange();

		/**
		 * The meta object literal for the '{@link de.jena.bike.StatisticalAverageGroupBy <em>Statistical Average Group By</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.StatisticalAverageGroupBy
		 * @see de.jena.bike.impl.BikePackageImpl#getStatisticalAverageGroupBy()
		 * @generated
		 */
		EEnum STATISTICAL_AVERAGE_GROUP_BY = eINSTANCE.getStatisticalAverageGroupBy();

		/**
		 * The meta object literal for the '{@link de.jena.bike.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.Direction
		 * @see de.jena.bike.impl.BikePackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link de.jena.bike.StatisticalTotalGroupBy <em>Statistical Total Group By</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.StatisticalTotalGroupBy
		 * @see de.jena.bike.impl.BikePackageImpl#getStatisticalTotalGroupBy()
		 * @generated
		 */
		EEnum STATISTICAL_TOTAL_GROUP_BY = eINSTANCE.getStatisticalTotalGroupBy();

		/**
		 * The meta object literal for the '{@link de.jena.bike.HistoricalRawTrafficInclude <em>Historical Raw Traffic Include</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.HistoricalRawTrafficInclude
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalRawTrafficInclude()
		 * @generated
		 */
		EEnum HISTORICAL_RAW_TRAFFIC_INCLUDE = eINSTANCE.getHistoricalRawTrafficInclude();

		/**
		 * The meta object literal for the '{@link de.jena.bike.HistoricalAggregatedTrafficInclude <em>Historical Aggregated Traffic Include</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.HistoricalAggregatedTrafficInclude
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTrafficInclude()
		 * @generated
		 */
		EEnum HISTORICAL_AGGREGATED_TRAFFIC_INCLUDE = eINSTANCE.getHistoricalAggregatedTrafficInclude();

		/**
		 * The meta object literal for the '{@link de.jena.bike.Granularity <em>Granularity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.Granularity
		 * @see de.jena.bike.impl.BikePackageImpl#getGranularity()
		 * @generated
		 */
		EEnum GRANULARITY = eINSTANCE.getGranularity();

		/**
		 * The meta object literal for the '{@link de.jena.bike.HistoricalAggregatedTrafficGroupBy <em>Historical Aggregated Traffic Group By</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.HistoricalAggregatedTrafficGroupBy
		 * @see de.jena.bike.impl.BikePackageImpl#getHistoricalAggregatedTrafficGroupBy()
		 * @generated
		 */
		EEnum HISTORICAL_AGGREGATED_TRAFFIC_GROUP_BY = eINSTANCE.getHistoricalAggregatedTrafficGroupBy();

		/**
		 * The meta object literal for the '{@link de.jena.bike.validationJobStatus <em>validation Job Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.bike.validationJobStatus
		 * @see de.jena.bike.impl.BikePackageImpl#getvalidationJobStatus()
		 * @generated
		 */
		EEnum VALIDATION_JOB_STATUS = eINSTANCE.getvalidationJobStatus();

		/**
		 * The meta object literal for the '<em>JResponse</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jakarta.ws.rs.core.Response
		 * @see de.jena.bike.impl.BikePackageImpl#getJResponse()
		 * @generated
		 */
		EDataType JRESPONSE = eINSTANCE.getJResponse();

	}

} //BikePackage
