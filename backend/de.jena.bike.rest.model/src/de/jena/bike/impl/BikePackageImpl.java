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
package de.jena.bike.impl;

import de.jena.bike.BadRequest;
import de.jena.bike.BaseSerie;
import de.jena.bike.BaseSerie_direction;
import de.jena.bike.BaseSerie_travelMode;
import de.jena.bike.BikeFactory;
import de.jena.bike.BikeOpenApiClient;
import de.jena.bike.BikePackage;
import de.jena.bike.Conflict;
import de.jena.bike.Count;
import de.jena.bike.CreateExport_request;
import de.jena.bike.DataStatus;
import de.jena.bike.DateRange;
import de.jena.bike.DateTime;
import de.jena.bike.Direction;
import de.jena.bike.DirectionName;
import de.jena.bike.Domain;
import de.jena.bike.Export;
import de.jena.bike.ExportCreation;
import de.jena.bike.Forbidden;
import de.jena.bike.GeoJsonObject;
import de.jena.bike.Geometry;
import de.jena.bike.GetADTBySite_dateRange;
import de.jena.bike.GetADTBySite_groupBy;
import de.jena.bike.GetADTBySite_travelModes;
import de.jena.bike.GetADT_dateRange;
import de.jena.bike.GetADT_groupBy;
import de.jena.bike.GetADT_travelModes;
import de.jena.bike.GetAggregatedTraffic_granularity;
import de.jena.bike.GetAggregatedTraffic_groupBy;
import de.jena.bike.GetAggregatedTraffic_include;
import de.jena.bike.GetAggregatedTraffic_travelModes;
import de.jena.bike.GetRawTraffic_include;
import de.jena.bike.GetRawTraffic_travelModes;
import de.jena.bike.GetTimestampTraffic_directions;
import de.jena.bike.GetTimestampTraffic_travelModes;
import de.jena.bike.GetTotalTraffic_dateRange;
import de.jena.bike.GetTotalTraffic_groupBy;
import de.jena.bike.GetTotalTraffic_travelModes;
import de.jena.bike.Granularity;
import de.jena.bike.HistoricalAggregatedTraffic;
import de.jena.bike.HistoricalAggregatedTrafficGroupBy;
import de.jena.bike.HistoricalAggregatedTrafficInclude;
import de.jena.bike.HistoricalAggregatedTraffic_data;
import de.jena.bike.HistoricalAggregatedTraffic_data_timestamp;
import de.jena.bike.HistoricalAggregatedTraffic_data_traffic;
import de.jena.bike.HistoricalAggregatedTraffic_data_traffic_counts;
import de.jena.bike.HistoricalAggregatedTraffic_data_weather;
import de.jena.bike.HistoricalAggregatedTraffic_directionName;
import de.jena.bike.HistoricalRawTraffic;
import de.jena.bike.HistoricalRawTrafficInclude;
import de.jena.bike.HistoricalRawTraffic_data;
import de.jena.bike.HistoricalRawTraffic_data_counts;
import de.jena.bike.HistoricalRawTraffic_data_status;
import de.jena.bike.HistoricalRawTraffic_data_timestamp;
import de.jena.bike.HistoricalTimestampTraffic;
import de.jena.bike.HistoricalTimestampTraffic_lane;
import de.jena.bike.HistoricalTimestampTraffic_timestamp;
import de.jena.bike.Image;
import de.jena.bike.Lane;
import de.jena.bike.LineString;
import de.jena.bike.LineStringCoordinates;
import de.jena.bike.LineString_coordinates;
import de.jena.bike.Location;
import de.jena.bike.NotFound;
import de.jena.bike.OpenApiClient;
import de.jena.bike.Position;
import de.jena.bike.Response;
import de.jena.bike.StatisticalAverageGroupBy;
import de.jena.bike.StatisticalTotalGroupBy;
import de.jena.bike.StatisticalTraffic;
import de.jena.bike.StatisticalTraffic_direction;
import de.jena.bike.StatisticalTraffic_directionName;
import de.jena.bike.StatisticalTraffic_travelMode;
import de.jena.bike.StatisticalTraffic_value;
import de.jena.bike.TooManyRequests;
import de.jena.bike.TravelModeLabel;
import de.jena.bike.Unauthorized;
import de.jena.bike.ValidationJobCreate_request;
import de.jena.bike.Value;
import de.jena.bike.site;
import de.jena.bike.siteCounter;
import de.jena.bike.siteTag;
import de.jena.bike.site_counters;
import de.jena.bike.site_domain;
import de.jena.bike.site_images;
import de.jena.bike.site_location;
import de.jena.bike.site_segments;
import de.jena.bike.site_tags;
import de.jena.bike.site_travelModes;
import de.jena.bike.tag;
import de.jena.bike.tag_domain;
import de.jena.bike.validationJob;
import de.jena.bike.validationJobCreated;
import de.jena.bike.validationJobCreated_status;
import de.jena.bike.validationJobStatus;
import de.jena.bike.validationJob_status;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BikePackageImpl extends EPackageImpl implements BikePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStringCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoJsonObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteCounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass badRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unauthorizedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forbiddenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tooManyRequestsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportCreationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notFoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directionNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticalTrafficEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseSerieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalRawTrafficEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalAggregatedTrafficEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalTimestampTrafficEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationJobCreatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineString_coordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass site_locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass site_segmentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass site_travelModesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass site_countersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass site_domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass site_tagsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass site_imagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tag_domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticalTraffic_travelModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticalTraffic_directionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticalTraffic_directionNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticalTraffic_valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseSerie_travelModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseSerie_directionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalRawTraffic_dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalRawTraffic_data_timestampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalRawTraffic_data_countsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalRawTraffic_data_statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalAggregatedTraffic_dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalAggregatedTraffic_data_timestampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalAggregatedTraffic_data_trafficEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalAggregatedTraffic_data_traffic_countsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalAggregatedTraffic_data_weatherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalAggregatedTraffic_directionNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalTimestampTraffic_timestampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historicalTimestampTraffic_laneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationJob_statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationJobCreated_statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openApiClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bikeOpenApiClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createExport_requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getADT_dateRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getADT_groupByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getADT_travelModesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getADTBySite_dateRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getADTBySite_groupByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getADTBySite_travelModesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTotalTraffic_dateRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTotalTraffic_groupByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTotalTraffic_travelModesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getRawTraffic_includeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getRawTraffic_travelModesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAggregatedTraffic_includeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAggregatedTraffic_granularityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAggregatedTraffic_groupByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAggregatedTraffic_travelModesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTimestampTraffic_travelModesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTimestampTraffic_directionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationJobCreate_requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum travelModeLabelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateRangeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statisticalAverageGroupByEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statisticalTotalGroupByEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum historicalRawTrafficIncludeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum historicalAggregatedTrafficIncludeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum granularityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum historicalAggregatedTrafficGroupByEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validationJobStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jResponseEDataType = null;

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
	 * @see de.jena.bike.BikePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BikePackageImpl() {
		super(eNS_URI, BikeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BikePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BikePackage init() {
		if (isInited) return (BikePackage)EPackage.Registry.INSTANCE.getEPackage(BikePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBikePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BikePackageImpl theBikePackage = registeredBikePackage instanceof BikePackageImpl ? (BikePackageImpl)registeredBikePackage : new BikePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBikePackage.createPackageContents();

		// Initialize created meta-data
		theBikePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBikePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BikePackage.eNS_URI, theBikePackage);
		return theBikePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Lat() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Lon() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeometry() {
		return geometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeometry_Type() {
		return (EAttribute)geometryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineStringCoordinates() {
		return lineStringCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineString() {
		return lineStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineString_Coordinates() {
		return (EReference)lineStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeoJsonObject() {
		return geoJsonObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getsiteCounter() {
		return siteCounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsiteCounter_Id() {
		return (EAttribute)siteCounterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsiteCounter_Serial() {
		return (EAttribute)siteCounterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsiteCounter_InstallationDate() {
		return (EAttribute)siteCounterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsiteCounter_DetachmentDate() {
		return (EAttribute)siteCounterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomain_Id() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomain_Name() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getsiteTag() {
		return siteTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsiteTag_Id() {
		return (EAttribute)siteTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsiteTag_Name() {
		return (EAttribute)siteTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Url() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getsite() {
		return siteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsite_Id() {
		return (EAttribute)siteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsite_Name() {
		return (EAttribute)siteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsite_Description() {
		return (EAttribute)siteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsite_CustomId() {
		return (EAttribute)siteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getsite_Location() {
		return (EReference)siteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getsite_Segments() {
		return (EReference)siteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsite_FirstData() {
		return (EAttribute)siteEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsite_LastData() {
		return (EAttribute)siteEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsite_Granularity() {
		return (EAttribute)siteEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getsite_TravelModes() {
		return (EReference)siteEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsite_Directional() {
		return (EAttribute)siteEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getsite_Counters() {
		return (EReference)siteEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getsite_Domain() {
		return (EReference)siteEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getsite_Tags() {
		return (EReference)siteEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getsite_Images() {
		return (EReference)siteEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsite_Attributes() {
		return (EAttribute)siteEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsite_HasTimestampedData() {
		return (EAttribute)siteEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsite_HasWeather() {
		return (EAttribute)siteEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBadRequest() {
		return badRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBadRequest_Status() {
		return (EAttribute)badRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBadRequest_Code() {
		return (EAttribute)badRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBadRequest_Message() {
		return (EAttribute)badRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnauthorized() {
		return unauthorizedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnauthorized_Status() {
		return (EAttribute)unauthorizedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnauthorized_Code() {
		return (EAttribute)unauthorizedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnauthorized_Message() {
		return (EAttribute)unauthorizedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForbidden() {
		return forbiddenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForbidden_Status() {
		return (EAttribute)forbiddenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForbidden_Code() {
		return (EAttribute)forbiddenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForbidden_Message() {
		return (EAttribute)forbiddenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTooManyRequests() {
		return tooManyRequestsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTooManyRequests_Status() {
		return (EAttribute)tooManyRequestsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTooManyRequests_Code() {
		return (EAttribute)tooManyRequestsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTooManyRequests_Message() {
		return (EAttribute)tooManyRequestsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass gettag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute gettag_Id() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute gettag_Name() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute gettag_Description() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute gettag_Color() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference gettag_Domain() {
		return (EReference)tagEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExportCreation() {
		return exportCreationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExportCreation_StartDate() {
		return (EAttribute)exportCreationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExportCreation_EndDate() {
		return (EAttribute)exportCreationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExportCreation_StartTime() {
		return (EAttribute)exportCreationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExportCreation_EndTime() {
		return (EAttribute)exportCreationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExportCreation_Schema() {
		return (EAttribute)exportCreationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExportCreation_SiteIds() {
		return (EAttribute)exportCreationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExportCreation_Granularity() {
		return (EAttribute)exportCreationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExportCreation_ValidatedDataOnly() {
		return (EAttribute)exportCreationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExportCreation_GapFilling() {
		return (EAttribute)exportCreationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExportCreation_ValidateSchema() {
		return (EAttribute)exportCreationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExport() {
		return exportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExport_Id() {
		return (EAttribute)exportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExport_Status() {
		return (EAttribute)exportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExport_Url() {
		return (EAttribute)exportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExport_ErrorMessage() {
		return (EAttribute)exportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExport_EndProcessingDateTime() {
		return (EAttribute)exportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotFound() {
		return notFoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotFound_Status() {
		return (EAttribute)notFoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotFound_Code() {
		return (EAttribute)notFoundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotFound_Message() {
		return (EAttribute)notFoundEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirectionName() {
		return directionNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatisticalTraffic() {
		return statisticalTrafficEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatisticalTraffic_SiteId() {
		return (EAttribute)statisticalTrafficEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatisticalTraffic_Date() {
		return (EAttribute)statisticalTrafficEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatisticalTraffic_TravelMode() {
		return (EReference)statisticalTrafficEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatisticalTraffic_Direction() {
		return (EReference)statisticalTrafficEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatisticalTraffic_DirectionName() {
		return (EReference)statisticalTrafficEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatisticalTraffic_Value() {
		return (EReference)statisticalTrafficEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseSerie() {
		return baseSerieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseSerie_TravelMode() {
		return (EReference)baseSerieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseSerie_Direction() {
		return (EReference)baseSerieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateTime() {
		return dateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCount() {
		return countEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataStatus() {
		return dataStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoricalRawTraffic() {
		return historicalRawTrafficEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistoricalRawTraffic_FlowID() {
		return (EAttribute)historicalRawTrafficEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistoricalRawTraffic_FlowName() {
		return (EAttribute)historicalRawTrafficEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistoricalRawTraffic_Data() {
		return (EReference)historicalRawTrafficEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoricalAggregatedTraffic() {
		return historicalAggregatedTrafficEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistoricalAggregatedTraffic_Data() {
		return (EReference)historicalAggregatedTrafficEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistoricalAggregatedTraffic_DirectionName() {
		return (EReference)historicalAggregatedTrafficEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistoricalAggregatedTraffic_FlowID() {
		return (EAttribute)historicalAggregatedTrafficEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistoricalAggregatedTraffic_FlowName() {
		return (EAttribute)historicalAggregatedTrafficEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLane() {
		return laneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoricalTimestampTraffic() {
		return historicalTimestampTrafficEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistoricalTimestampTraffic_Timestamp() {
		return (EReference)historicalTimestampTrafficEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistoricalTimestampTraffic_Lane() {
		return (EReference)historicalTimestampTrafficEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistoricalTimestampTraffic_Speed() {
		return (EAttribute)historicalTimestampTrafficEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getvalidationJob() {
		return validationJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getvalidationJob_Id() {
		return (EAttribute)validationJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getvalidationJob_Status() {
		return (EReference)validationJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getvalidationJob_SiteIds() {
		return (EAttribute)validationJobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getvalidationJob_StartDate() {
		return (EAttribute)validationJobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getvalidationJob_EndDate() {
		return (EAttribute)validationJobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getvalidationJob_ErrorMessage() {
		return (EAttribute)validationJobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getvalidationJob_EndProcessingDateTime() {
		return (EAttribute)validationJobEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getvalidationJob_CreatedAt() {
		return (EAttribute)validationJobEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getvalidationJobCreated() {
		return validationJobCreatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getvalidationJobCreated_Id() {
		return (EAttribute)validationJobCreatedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getvalidationJobCreated_Status() {
		return (EReference)validationJobCreatedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getvalidationJobCreated_SiteIds() {
		return (EAttribute)validationJobCreatedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getvalidationJobCreated_StartDate() {
		return (EAttribute)validationJobCreatedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getvalidationJobCreated_EndDate() {
		return (EAttribute)validationJobCreatedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConflict() {
		return conflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConflict_Status() {
		return (EAttribute)conflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConflict_Code() {
		return (EAttribute)conflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConflict_Message() {
		return (EAttribute)conflictEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineString_coordinates() {
		return lineString_coordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getsite_location() {
		return site_locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getsite_segments() {
		return site_segmentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getsite_travelModes() {
		return site_travelModesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getsite_counters() {
		return site_countersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getsite_domain() {
		return site_domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getsite_tags() {
		return site_tagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getsite_images() {
		return site_imagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass gettag_domain() {
		return tag_domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatisticalTraffic_travelMode() {
		return statisticalTraffic_travelModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatisticalTraffic_direction() {
		return statisticalTraffic_directionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatisticalTraffic_directionName() {
		return statisticalTraffic_directionNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatisticalTraffic_value() {
		return statisticalTraffic_valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseSerie_travelMode() {
		return baseSerie_travelModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseSerie_direction() {
		return baseSerie_directionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoricalRawTraffic_data() {
		return historicalRawTraffic_dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistoricalRawTraffic_data_Timestamp() {
		return (EReference)historicalRawTraffic_dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistoricalRawTraffic_data_Granularity() {
		return (EAttribute)historicalRawTraffic_dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistoricalRawTraffic_data_Counts() {
		return (EReference)historicalRawTraffic_dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistoricalRawTraffic_data_Status() {
		return (EReference)historicalRawTraffic_dataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoricalRawTraffic_data_timestamp() {
		return historicalRawTraffic_data_timestampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoricalRawTraffic_data_counts() {
		return historicalRawTraffic_data_countsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoricalRawTraffic_data_status() {
		return historicalRawTraffic_data_statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoricalAggregatedTraffic_data() {
		return historicalAggregatedTraffic_dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistoricalAggregatedTraffic_data_Timestamp() {
		return (EReference)historicalAggregatedTraffic_dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistoricalAggregatedTraffic_data_Traffic() {
		return (EReference)historicalAggregatedTraffic_dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistoricalAggregatedTraffic_data_Weather() {
		return (EReference)historicalAggregatedTraffic_dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoricalAggregatedTraffic_data_timestamp() {
		return historicalAggregatedTraffic_data_timestampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoricalAggregatedTraffic_data_traffic() {
		return historicalAggregatedTraffic_data_trafficEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistoricalAggregatedTraffic_data_traffic_Counts() {
		return (EReference)historicalAggregatedTraffic_data_trafficEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistoricalAggregatedTraffic_data_traffic_Status() {
		return (EAttribute)historicalAggregatedTraffic_data_trafficEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoricalAggregatedTraffic_data_traffic_counts() {
		return historicalAggregatedTraffic_data_traffic_countsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoricalAggregatedTraffic_data_weather() {
		return historicalAggregatedTraffic_data_weatherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistoricalAggregatedTraffic_data_weather_Temperature() {
		return (EAttribute)historicalAggregatedTraffic_data_weatherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistoricalAggregatedTraffic_data_weather_RainAccumulation() {
		return (EAttribute)historicalAggregatedTraffic_data_weatherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistoricalAggregatedTraffic_data_weather_SnowAccumulation() {
		return (EAttribute)historicalAggregatedTraffic_data_weatherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoricalAggregatedTraffic_directionName() {
		return historicalAggregatedTraffic_directionNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoricalTimestampTraffic_timestamp() {
		return historicalTimestampTraffic_timestampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoricalTimestampTraffic_lane() {
		return historicalTimestampTraffic_laneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getvalidationJob_status() {
		return validationJob_statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getvalidationJobCreated_status() {
		return validationJobCreated_statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponse_Code() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponse_Description() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponse_Response() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponse_Result() {
		return (EReference)responseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpenApiClient() {
		return openApiClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOpenApiClient__ToQueryString__String_Object() {
		return openApiClientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOpenApiClient___get__String_EClass_EMap_EMap() {
		return openApiClientEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOpenApiClient___delete__String_EClass_EMap_EMap() {
		return openApiClientEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBikeOpenApiClient() {
		return bikeOpenApiClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBikeOpenApiClient__GetSites__Integer_Integer_String_String_EList_EList_EList_EList_EList() {
		return bikeOpenApiClientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBikeOpenApiClient__GetTags__Integer_Integer_String_String_EList_EList_EList() {
		return bikeOpenApiClientEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBikeOpenApiClient__CreateExport__CreateExport_request() {
		return bikeOpenApiClientEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBikeOpenApiClient__GetExportStatus__Integer() {
		return bikeOpenApiClientEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBikeOpenApiClient__DownloadExportData__Integer() {
		return bikeOpenApiClientEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBikeOpenApiClient__GetADT__BigInteger_BigInteger_GetADT_dateRange_Integer_Integer_GetADT_groupBy_EList_Boolean() {
		return bikeOpenApiClientEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBikeOpenApiClient__GetADTBySite__BigInteger_BigInteger_GetADTBySite_dateRange_Integer_Integer_GetADTBySite_groupBy_EList_Boolean() {
		return bikeOpenApiClientEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBikeOpenApiClient__GetTotalTraffic__BigInteger_BigInteger_GetTotalTraffic_dateRange_Integer_Integer_GetTotalTraffic_groupBy_EList_Boolean() {
		return bikeOpenApiClientEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBikeOpenApiClient__GetRawTraffic__BigInteger_EList_String_String_String_String_Boolean_EList_Boolean_Boolean() {
		return bikeOpenApiClientEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBikeOpenApiClient__GetAggregatedTraffic__BigInteger_EList_String_String_String_String_GetAggregatedTraffic_granularity_GetAggregatedTraffic_groupBy_Boolean_EList_Boolean_Boolean() {
		return bikeOpenApiClientEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBikeOpenApiClient__GetTimestampTraffic__BigInteger_String_String_String_String_EList_EList() {
		return bikeOpenApiClientEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBikeOpenApiClient__ValidationJobsGet__Integer_Integer() {
		return bikeOpenApiClientEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBikeOpenApiClient__ValidationJobCreate__ValidationJobCreate_request() {
		return bikeOpenApiClientEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBikeOpenApiClient__ValidationJobGet__Integer() {
		return bikeOpenApiClientEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateExport_request() {
		return createExport_requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetADT_dateRange() {
		return getADT_dateRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetADT_groupBy() {
		return getADT_groupByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetADT_travelModes() {
		return getADT_travelModesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetADTBySite_dateRange() {
		return getADTBySite_dateRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetADTBySite_groupBy() {
		return getADTBySite_groupByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetADTBySite_travelModes() {
		return getADTBySite_travelModesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetTotalTraffic_dateRange() {
		return getTotalTraffic_dateRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetTotalTraffic_groupBy() {
		return getTotalTraffic_groupByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetTotalTraffic_travelModes() {
		return getTotalTraffic_travelModesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetRawTraffic_include() {
		return getRawTraffic_includeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetRawTraffic_travelModes() {
		return getRawTraffic_travelModesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAggregatedTraffic_include() {
		return getAggregatedTraffic_includeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAggregatedTraffic_granularity() {
		return getAggregatedTraffic_granularityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAggregatedTraffic_groupBy() {
		return getAggregatedTraffic_groupByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetAggregatedTraffic_travelModes() {
		return getAggregatedTraffic_travelModesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetTimestampTraffic_travelModes() {
		return getTimestampTraffic_travelModesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetTimestampTraffic_directions() {
		return getTimestampTraffic_directionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidationJobCreate_request() {
		return validationJobCreate_requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationJobCreate_request_SiteIds() {
		return (EAttribute)validationJobCreate_requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationJobCreate_request_StartDate() {
		return (EAttribute)validationJobCreate_requestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationJobCreate_request_EndDate() {
		return (EAttribute)validationJobCreate_requestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTravelModeLabel() {
		return travelModeLabelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDateRange() {
		return dateRangeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStatisticalAverageGroupBy() {
		return statisticalAverageGroupByEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStatisticalTotalGroupBy() {
		return statisticalTotalGroupByEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHistoricalRawTrafficInclude() {
		return historicalRawTrafficIncludeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHistoricalAggregatedTrafficInclude() {
		return historicalAggregatedTrafficIncludeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGranularity() {
		return granularityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHistoricalAggregatedTrafficGroupBy() {
		return historicalAggregatedTrafficGroupByEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getvalidationJobStatus() {
		return validationJobStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJResponse() {
		return jResponseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BikeFactory getBikeFactory() {
		return (BikeFactory)getEFactoryInstance();
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
		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__LAT);
		createEAttribute(locationEClass, LOCATION__LON);

		geometryEClass = createEClass(GEOMETRY);
		createEAttribute(geometryEClass, GEOMETRY__TYPE);

		positionEClass = createEClass(POSITION);

		lineStringCoordinatesEClass = createEClass(LINE_STRING_COORDINATES);

		lineStringEClass = createEClass(LINE_STRING);
		createEReference(lineStringEClass, LINE_STRING__COORDINATES);

		geoJsonObjectEClass = createEClass(GEO_JSON_OBJECT);

		siteCounterEClass = createEClass(SITE_COUNTER);
		createEAttribute(siteCounterEClass, SITE_COUNTER__ID);
		createEAttribute(siteCounterEClass, SITE_COUNTER__SERIAL);
		createEAttribute(siteCounterEClass, SITE_COUNTER__INSTALLATION_DATE);
		createEAttribute(siteCounterEClass, SITE_COUNTER__DETACHMENT_DATE);

		domainEClass = createEClass(DOMAIN);
		createEAttribute(domainEClass, DOMAIN__ID);
		createEAttribute(domainEClass, DOMAIN__NAME);

		siteTagEClass = createEClass(SITE_TAG);
		createEAttribute(siteTagEClass, SITE_TAG__ID);
		createEAttribute(siteTagEClass, SITE_TAG__NAME);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__URL);

		siteEClass = createEClass(SITE);
		createEAttribute(siteEClass, SITE__ID);
		createEAttribute(siteEClass, SITE__NAME);
		createEAttribute(siteEClass, SITE__DESCRIPTION);
		createEAttribute(siteEClass, SITE__CUSTOM_ID);
		createEReference(siteEClass, SITE__LOCATION);
		createEReference(siteEClass, SITE__SEGMENTS);
		createEAttribute(siteEClass, SITE__FIRST_DATA);
		createEAttribute(siteEClass, SITE__LAST_DATA);
		createEAttribute(siteEClass, SITE__GRANULARITY);
		createEReference(siteEClass, SITE__TRAVEL_MODES);
		createEAttribute(siteEClass, SITE__DIRECTIONAL);
		createEReference(siteEClass, SITE__COUNTERS);
		createEReference(siteEClass, SITE__DOMAIN);
		createEReference(siteEClass, SITE__TAGS);
		createEReference(siteEClass, SITE__IMAGES);
		createEAttribute(siteEClass, SITE__ATTRIBUTES);
		createEAttribute(siteEClass, SITE__HAS_TIMESTAMPED_DATA);
		createEAttribute(siteEClass, SITE__HAS_WEATHER);

		badRequestEClass = createEClass(BAD_REQUEST);
		createEAttribute(badRequestEClass, BAD_REQUEST__STATUS);
		createEAttribute(badRequestEClass, BAD_REQUEST__CODE);
		createEAttribute(badRequestEClass, BAD_REQUEST__MESSAGE);

		unauthorizedEClass = createEClass(UNAUTHORIZED);
		createEAttribute(unauthorizedEClass, UNAUTHORIZED__STATUS);
		createEAttribute(unauthorizedEClass, UNAUTHORIZED__CODE);
		createEAttribute(unauthorizedEClass, UNAUTHORIZED__MESSAGE);

		forbiddenEClass = createEClass(FORBIDDEN);
		createEAttribute(forbiddenEClass, FORBIDDEN__STATUS);
		createEAttribute(forbiddenEClass, FORBIDDEN__CODE);
		createEAttribute(forbiddenEClass, FORBIDDEN__MESSAGE);

		tooManyRequestsEClass = createEClass(TOO_MANY_REQUESTS);
		createEAttribute(tooManyRequestsEClass, TOO_MANY_REQUESTS__STATUS);
		createEAttribute(tooManyRequestsEClass, TOO_MANY_REQUESTS__CODE);
		createEAttribute(tooManyRequestsEClass, TOO_MANY_REQUESTS__MESSAGE);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__ID);
		createEAttribute(tagEClass, TAG__NAME);
		createEAttribute(tagEClass, TAG__DESCRIPTION);
		createEAttribute(tagEClass, TAG__COLOR);
		createEReference(tagEClass, TAG__DOMAIN);

		exportCreationEClass = createEClass(EXPORT_CREATION);
		createEAttribute(exportCreationEClass, EXPORT_CREATION__START_DATE);
		createEAttribute(exportCreationEClass, EXPORT_CREATION__END_DATE);
		createEAttribute(exportCreationEClass, EXPORT_CREATION__START_TIME);
		createEAttribute(exportCreationEClass, EXPORT_CREATION__END_TIME);
		createEAttribute(exportCreationEClass, EXPORT_CREATION__SCHEMA);
		createEAttribute(exportCreationEClass, EXPORT_CREATION__SITE_IDS);
		createEAttribute(exportCreationEClass, EXPORT_CREATION__GRANULARITY);
		createEAttribute(exportCreationEClass, EXPORT_CREATION__VALIDATED_DATA_ONLY);
		createEAttribute(exportCreationEClass, EXPORT_CREATION__GAP_FILLING);
		createEAttribute(exportCreationEClass, EXPORT_CREATION__VALIDATE_SCHEMA);

		exportEClass = createEClass(EXPORT);
		createEAttribute(exportEClass, EXPORT__ID);
		createEAttribute(exportEClass, EXPORT__STATUS);
		createEAttribute(exportEClass, EXPORT__URL);
		createEAttribute(exportEClass, EXPORT__ERROR_MESSAGE);
		createEAttribute(exportEClass, EXPORT__END_PROCESSING_DATE_TIME);

		notFoundEClass = createEClass(NOT_FOUND);
		createEAttribute(notFoundEClass, NOT_FOUND__STATUS);
		createEAttribute(notFoundEClass, NOT_FOUND__CODE);
		createEAttribute(notFoundEClass, NOT_FOUND__MESSAGE);

		directionNameEClass = createEClass(DIRECTION_NAME);

		valueEClass = createEClass(VALUE);

		statisticalTrafficEClass = createEClass(STATISTICAL_TRAFFIC);
		createEAttribute(statisticalTrafficEClass, STATISTICAL_TRAFFIC__SITE_ID);
		createEAttribute(statisticalTrafficEClass, STATISTICAL_TRAFFIC__DATE);
		createEReference(statisticalTrafficEClass, STATISTICAL_TRAFFIC__TRAVEL_MODE);
		createEReference(statisticalTrafficEClass, STATISTICAL_TRAFFIC__DIRECTION);
		createEReference(statisticalTrafficEClass, STATISTICAL_TRAFFIC__DIRECTION_NAME);
		createEReference(statisticalTrafficEClass, STATISTICAL_TRAFFIC__VALUE);

		baseSerieEClass = createEClass(BASE_SERIE);
		createEReference(baseSerieEClass, BASE_SERIE__TRAVEL_MODE);
		createEReference(baseSerieEClass, BASE_SERIE__DIRECTION);

		dateTimeEClass = createEClass(DATE_TIME);

		countEClass = createEClass(COUNT);

		dataStatusEClass = createEClass(DATA_STATUS);

		historicalRawTrafficEClass = createEClass(HISTORICAL_RAW_TRAFFIC);
		createEAttribute(historicalRawTrafficEClass, HISTORICAL_RAW_TRAFFIC__FLOW_ID);
		createEAttribute(historicalRawTrafficEClass, HISTORICAL_RAW_TRAFFIC__FLOW_NAME);
		createEReference(historicalRawTrafficEClass, HISTORICAL_RAW_TRAFFIC__DATA);

		historicalAggregatedTrafficEClass = createEClass(HISTORICAL_AGGREGATED_TRAFFIC);
		createEReference(historicalAggregatedTrafficEClass, HISTORICAL_AGGREGATED_TRAFFIC__DATA);
		createEReference(historicalAggregatedTrafficEClass, HISTORICAL_AGGREGATED_TRAFFIC__DIRECTION_NAME);
		createEAttribute(historicalAggregatedTrafficEClass, HISTORICAL_AGGREGATED_TRAFFIC__FLOW_ID);
		createEAttribute(historicalAggregatedTrafficEClass, HISTORICAL_AGGREGATED_TRAFFIC__FLOW_NAME);

		laneEClass = createEClass(LANE);

		historicalTimestampTrafficEClass = createEClass(HISTORICAL_TIMESTAMP_TRAFFIC);
		createEReference(historicalTimestampTrafficEClass, HISTORICAL_TIMESTAMP_TRAFFIC__TIMESTAMP);
		createEReference(historicalTimestampTrafficEClass, HISTORICAL_TIMESTAMP_TRAFFIC__LANE);
		createEAttribute(historicalTimestampTrafficEClass, HISTORICAL_TIMESTAMP_TRAFFIC__SPEED);

		validationJobEClass = createEClass(VALIDATION_JOB);
		createEAttribute(validationJobEClass, VALIDATION_JOB__ID);
		createEReference(validationJobEClass, VALIDATION_JOB__STATUS);
		createEAttribute(validationJobEClass, VALIDATION_JOB__SITE_IDS);
		createEAttribute(validationJobEClass, VALIDATION_JOB__START_DATE);
		createEAttribute(validationJobEClass, VALIDATION_JOB__END_DATE);
		createEAttribute(validationJobEClass, VALIDATION_JOB__ERROR_MESSAGE);
		createEAttribute(validationJobEClass, VALIDATION_JOB__END_PROCESSING_DATE_TIME);
		createEAttribute(validationJobEClass, VALIDATION_JOB__CREATED_AT);

		validationJobCreatedEClass = createEClass(VALIDATION_JOB_CREATED);
		createEAttribute(validationJobCreatedEClass, VALIDATION_JOB_CREATED__ID);
		createEReference(validationJobCreatedEClass, VALIDATION_JOB_CREATED__STATUS);
		createEAttribute(validationJobCreatedEClass, VALIDATION_JOB_CREATED__SITE_IDS);
		createEAttribute(validationJobCreatedEClass, VALIDATION_JOB_CREATED__START_DATE);
		createEAttribute(validationJobCreatedEClass, VALIDATION_JOB_CREATED__END_DATE);

		conflictEClass = createEClass(CONFLICT);
		createEAttribute(conflictEClass, CONFLICT__STATUS);
		createEAttribute(conflictEClass, CONFLICT__CODE);
		createEAttribute(conflictEClass, CONFLICT__MESSAGE);

		lineString_coordinatesEClass = createEClass(LINE_STRING_COORDINATES);

		site_locationEClass = createEClass(SITE_LOCATION);

		site_segmentsEClass = createEClass(SITE_SEGMENTS);

		site_travelModesEClass = createEClass(SITE_TRAVEL_MODES);

		site_countersEClass = createEClass(SITE_COUNTERS);

		site_domainEClass = createEClass(SITE_DOMAIN);

		site_tagsEClass = createEClass(SITE_TAGS);

		site_imagesEClass = createEClass(SITE_IMAGES);

		tag_domainEClass = createEClass(TAG_DOMAIN);

		statisticalTraffic_travelModeEClass = createEClass(STATISTICAL_TRAFFIC_TRAVEL_MODE);

		statisticalTraffic_directionEClass = createEClass(STATISTICAL_TRAFFIC_DIRECTION);

		statisticalTraffic_directionNameEClass = createEClass(STATISTICAL_TRAFFIC_DIRECTION_NAME);

		statisticalTraffic_valueEClass = createEClass(STATISTICAL_TRAFFIC_VALUE);

		baseSerie_travelModeEClass = createEClass(BASE_SERIE_TRAVEL_MODE);

		baseSerie_directionEClass = createEClass(BASE_SERIE_DIRECTION);

		historicalRawTraffic_dataEClass = createEClass(HISTORICAL_RAW_TRAFFIC_DATA);
		createEReference(historicalRawTraffic_dataEClass, HISTORICAL_RAW_TRAFFIC_DATA__TIMESTAMP);
		createEAttribute(historicalRawTraffic_dataEClass, HISTORICAL_RAW_TRAFFIC_DATA__GRANULARITY);
		createEReference(historicalRawTraffic_dataEClass, HISTORICAL_RAW_TRAFFIC_DATA__COUNTS);
		createEReference(historicalRawTraffic_dataEClass, HISTORICAL_RAW_TRAFFIC_DATA__STATUS);

		historicalRawTraffic_data_timestampEClass = createEClass(HISTORICAL_RAW_TRAFFIC_DATA_TIMESTAMP);

		historicalRawTraffic_data_countsEClass = createEClass(HISTORICAL_RAW_TRAFFIC_DATA_COUNTS);

		historicalRawTraffic_data_statusEClass = createEClass(HISTORICAL_RAW_TRAFFIC_DATA_STATUS);

		historicalAggregatedTraffic_dataEClass = createEClass(HISTORICAL_AGGREGATED_TRAFFIC_DATA);
		createEReference(historicalAggregatedTraffic_dataEClass, HISTORICAL_AGGREGATED_TRAFFIC_DATA__TIMESTAMP);
		createEReference(historicalAggregatedTraffic_dataEClass, HISTORICAL_AGGREGATED_TRAFFIC_DATA__TRAFFIC);
		createEReference(historicalAggregatedTraffic_dataEClass, HISTORICAL_AGGREGATED_TRAFFIC_DATA__WEATHER);

		historicalAggregatedTraffic_data_timestampEClass = createEClass(HISTORICAL_AGGREGATED_TRAFFIC_DATA_TIMESTAMP);

		historicalAggregatedTraffic_data_trafficEClass = createEClass(HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC);
		createEReference(historicalAggregatedTraffic_data_trafficEClass, HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__COUNTS);
		createEAttribute(historicalAggregatedTraffic_data_trafficEClass, HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__STATUS);

		historicalAggregatedTraffic_data_traffic_countsEClass = createEClass(HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC_COUNTS);

		historicalAggregatedTraffic_data_weatherEClass = createEClass(HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER);
		createEAttribute(historicalAggregatedTraffic_data_weatherEClass, HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__TEMPERATURE);
		createEAttribute(historicalAggregatedTraffic_data_weatherEClass, HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__RAIN_ACCUMULATION);
		createEAttribute(historicalAggregatedTraffic_data_weatherEClass, HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__SNOW_ACCUMULATION);

		historicalAggregatedTraffic_directionNameEClass = createEClass(HISTORICAL_AGGREGATED_TRAFFIC_DIRECTION_NAME);

		historicalTimestampTraffic_timestampEClass = createEClass(HISTORICAL_TIMESTAMP_TRAFFIC_TIMESTAMP);

		historicalTimestampTraffic_laneEClass = createEClass(HISTORICAL_TIMESTAMP_TRAFFIC_LANE);

		validationJob_statusEClass = createEClass(VALIDATION_JOB_STATUS);

		validationJobCreated_statusEClass = createEClass(VALIDATION_JOB_CREATED_STATUS);

		responseEClass = createEClass(RESPONSE);
		createEAttribute(responseEClass, RESPONSE__CODE);
		createEAttribute(responseEClass, RESPONSE__DESCRIPTION);
		createEAttribute(responseEClass, RESPONSE__RESPONSE);
		createEReference(responseEClass, RESPONSE__RESULT);

		openApiClientEClass = createEClass(OPEN_API_CLIENT);
		createEOperation(openApiClientEClass, OPEN_API_CLIENT___TO_QUERY_STRING__STRING_OBJECT);
		createEOperation(openApiClientEClass, OPEN_API_CLIENT___GET__STRING_ECLASS_EMAP_EMAP);
		createEOperation(openApiClientEClass, OPEN_API_CLIENT___DELETE__STRING_ECLASS_EMAP_EMAP);

		bikeOpenApiClientEClass = createEClass(BIKE_OPEN_API_CLIENT);
		createEOperation(bikeOpenApiClientEClass, BIKE_OPEN_API_CLIENT___GET_SITES__INTEGER_INTEGER_STRING_STRING_ELIST_ELIST_ELIST_ELIST_ELIST);
		createEOperation(bikeOpenApiClientEClass, BIKE_OPEN_API_CLIENT___GET_TAGS__INTEGER_INTEGER_STRING_STRING_ELIST_ELIST_ELIST);
		createEOperation(bikeOpenApiClientEClass, BIKE_OPEN_API_CLIENT___CREATE_EXPORT__CREATEEXPORT_REQUEST);
		createEOperation(bikeOpenApiClientEClass, BIKE_OPEN_API_CLIENT___GET_EXPORT_STATUS__INTEGER);
		createEOperation(bikeOpenApiClientEClass, BIKE_OPEN_API_CLIENT___DOWNLOAD_EXPORT_DATA__INTEGER);
		createEOperation(bikeOpenApiClientEClass, BIKE_OPEN_API_CLIENT___GET_ADT__BIGINTEGER_BIGINTEGER_GETADT_DATERANGE_INTEGER_INTEGER_GETADT_GROUPBY_ELIST_BOOLEAN);
		createEOperation(bikeOpenApiClientEClass, BIKE_OPEN_API_CLIENT___GET_ADT_BY_SITE__BIGINTEGER_BIGINTEGER_GETADTBYSITE_DATERANGE_INTEGER_INTEGER_GETADTBYSITE_GROUPBY_ELIST_BOOLEAN);
		createEOperation(bikeOpenApiClientEClass, BIKE_OPEN_API_CLIENT___GET_TOTAL_TRAFFIC__BIGINTEGER_BIGINTEGER_GETTOTALTRAFFIC_DATERANGE_INTEGER_INTEGER_GETTOTALTRAFFIC_GROUPBY_ELIST_BOOLEAN);
		createEOperation(bikeOpenApiClientEClass, BIKE_OPEN_API_CLIENT___GET_RAW_TRAFFIC__BIGINTEGER_ELIST_STRING_STRING_STRING_STRING_BOOLEAN_ELIST_BOOLEAN_BOOLEAN);
		createEOperation(bikeOpenApiClientEClass, BIKE_OPEN_API_CLIENT___GET_AGGREGATED_TRAFFIC__BIGINTEGER_ELIST_STRING_STRING_STRING_STRING_GETAGGREGATEDTRAFFIC_GRANULARITY_GETAGGREGATEDTRAFFIC_GROUPBY_BOOLEAN_ELIST_BOOLEAN_BOOLEAN);
		createEOperation(bikeOpenApiClientEClass, BIKE_OPEN_API_CLIENT___GET_TIMESTAMP_TRAFFIC__BIGINTEGER_STRING_STRING_STRING_STRING_ELIST_ELIST);
		createEOperation(bikeOpenApiClientEClass, BIKE_OPEN_API_CLIENT___VALIDATION_JOBS_GET__INTEGER_INTEGER);
		createEOperation(bikeOpenApiClientEClass, BIKE_OPEN_API_CLIENT___VALIDATION_JOB_CREATE__VALIDATIONJOBCREATE_REQUEST);
		createEOperation(bikeOpenApiClientEClass, BIKE_OPEN_API_CLIENT___VALIDATION_JOB_GET__INTEGER);

		createExport_requestEClass = createEClass(CREATE_EXPORT_REQUEST);

		getADT_dateRangeEClass = createEClass(GET_ADT_DATE_RANGE);

		getADT_groupByEClass = createEClass(GET_ADT_GROUP_BY);

		getADT_travelModesEClass = createEClass(GET_ADT_TRAVEL_MODES);

		getADTBySite_dateRangeEClass = createEClass(GET_ADT_BY_SITE_DATE_RANGE);

		getADTBySite_groupByEClass = createEClass(GET_ADT_BY_SITE_GROUP_BY);

		getADTBySite_travelModesEClass = createEClass(GET_ADT_BY_SITE_TRAVEL_MODES);

		getTotalTraffic_dateRangeEClass = createEClass(GET_TOTAL_TRAFFIC_DATE_RANGE);

		getTotalTraffic_groupByEClass = createEClass(GET_TOTAL_TRAFFIC_GROUP_BY);

		getTotalTraffic_travelModesEClass = createEClass(GET_TOTAL_TRAFFIC_TRAVEL_MODES);

		getRawTraffic_includeEClass = createEClass(GET_RAW_TRAFFIC_INCLUDE);

		getRawTraffic_travelModesEClass = createEClass(GET_RAW_TRAFFIC_TRAVEL_MODES);

		getAggregatedTraffic_includeEClass = createEClass(GET_AGGREGATED_TRAFFIC_INCLUDE);

		getAggregatedTraffic_granularityEClass = createEClass(GET_AGGREGATED_TRAFFIC_GRANULARITY);

		getAggregatedTraffic_groupByEClass = createEClass(GET_AGGREGATED_TRAFFIC_GROUP_BY);

		getAggregatedTraffic_travelModesEClass = createEClass(GET_AGGREGATED_TRAFFIC_TRAVEL_MODES);

		getTimestampTraffic_travelModesEClass = createEClass(GET_TIMESTAMP_TRAFFIC_TRAVEL_MODES);

		getTimestampTraffic_directionsEClass = createEClass(GET_TIMESTAMP_TRAFFIC_DIRECTIONS);

		validationJobCreate_requestEClass = createEClass(VALIDATION_JOB_CREATE_REQUEST);
		createEAttribute(validationJobCreate_requestEClass, VALIDATION_JOB_CREATE_REQUEST__SITE_IDS);
		createEAttribute(validationJobCreate_requestEClass, VALIDATION_JOB_CREATE_REQUEST__START_DATE);
		createEAttribute(validationJobCreate_requestEClass, VALIDATION_JOB_CREATE_REQUEST__END_DATE);

		// Create enums
		travelModeLabelEEnum = createEEnum(TRAVEL_MODE_LABEL);
		dateRangeEEnum = createEEnum(DATE_RANGE);
		statisticalAverageGroupByEEnum = createEEnum(STATISTICAL_AVERAGE_GROUP_BY);
		directionEEnum = createEEnum(DIRECTION);
		statisticalTotalGroupByEEnum = createEEnum(STATISTICAL_TOTAL_GROUP_BY);
		historicalRawTrafficIncludeEEnum = createEEnum(HISTORICAL_RAW_TRAFFIC_INCLUDE);
		historicalAggregatedTrafficIncludeEEnum = createEEnum(HISTORICAL_AGGREGATED_TRAFFIC_INCLUDE);
		granularityEEnum = createEEnum(GRANULARITY);
		historicalAggregatedTrafficGroupByEEnum = createEEnum(HISTORICAL_AGGREGATED_TRAFFIC_GROUP_BY);
		validationJobStatusEEnum = createEEnum(VALIDATION_JOB_STATUS);

		// Create data types
		jResponseEDataType = createEDataType(JRESPONSE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bikeOpenApiClientEClass.getESuperTypes().add(this.getOpenApiClient());

		// Initialize classes, features, and operations; add parameters
		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Lat(), ecorePackage.getEDoubleObject(), "lat", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Lon(), ecorePackage.getEDoubleObject(), "lon", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometryEClass, Geometry.class, "Geometry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeometry_Type(), ecorePackage.getEString(), "type", null, 0, 1, Geometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lineStringCoordinatesEClass, LineStringCoordinates.class, "LineStringCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lineStringEClass, LineString.class, "LineString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLineString_Coordinates(), this.getLineString_coordinates(), null, "coordinates", null, 0, 1, LineString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geoJsonObjectEClass, GeoJsonObject.class, "GeoJsonObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(siteCounterEClass, siteCounter.class, "siteCounter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getsiteCounter_Id(), ecorePackage.getEIntegerObject(), "id", null, 0, 1, siteCounter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsiteCounter_Serial(), ecorePackage.getEString(), "serial", null, 0, 1, siteCounter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsiteCounter_InstallationDate(), ecorePackage.getEString(), "installationDate", null, 0, 1, siteCounter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsiteCounter_DetachmentDate(), ecorePackage.getEString(), "detachmentDate", null, 0, 1, siteCounter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomain_Id(), ecorePackage.getEBigInteger(), "id", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Name(), ecorePackage.getEString(), "name", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siteTagEClass, siteTag.class, "siteTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getsiteTag_Id(), ecorePackage.getEBigInteger(), "id", null, 0, 1, siteTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsiteTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, siteTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Url(), ecorePackage.getEString(), "url", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siteEClass, site.class, "site", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getsite_Id(), ecorePackage.getEBigInteger(), "id", null, 0, 1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsite_Name(), ecorePackage.getEString(), "name", null, 0, 1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsite_Description(), ecorePackage.getEString(), "description", null, 0, 1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsite_CustomId(), ecorePackage.getEString(), "customId", null, 0, 1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsite_Location(), this.getsite_location(), null, "location", null, 0, 1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsite_Segments(), this.getsite_segments(), null, "segments", null, 0, 1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsite_FirstData(), ecorePackage.getEString(), "firstData", null, 0, 1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsite_LastData(), ecorePackage.getEString(), "lastData", null, 0, 1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsite_Granularity(), ecorePackage.getEString(), "granularity", null, 0, 1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsite_TravelModes(), this.getsite_travelModes(), null, "travelModes", null, 0, -1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsite_Directional(), ecorePackage.getEBooleanObject(), "directional", null, 0, 1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsite_Counters(), this.getsite_counters(), null, "counters", null, 0, -1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsite_Domain(), this.getsite_domain(), null, "domain", null, 0, 1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsite_Tags(), this.getsite_tags(), null, "tags", null, 0, -1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsite_Images(), this.getsite_images(), null, "images", null, 0, -1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsite_Attributes(), ecorePackage.getEJavaObject(), "attributes", null, 0, 1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsite_HasTimestampedData(), ecorePackage.getEBooleanObject(), "hasTimestampedData", null, 0, 1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsite_HasWeather(), ecorePackage.getEBooleanObject(), "hasWeather", null, 0, 1, site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(badRequestEClass, BadRequest.class, "BadRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBadRequest_Status(), ecorePackage.getEFloatObject(), "status", null, 0, 1, BadRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBadRequest_Code(), ecorePackage.getEString(), "code", null, 0, 1, BadRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBadRequest_Message(), ecorePackage.getEString(), "message", null, 0, 1, BadRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unauthorizedEClass, Unauthorized.class, "Unauthorized", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnauthorized_Status(), ecorePackage.getEFloatObject(), "status", null, 0, 1, Unauthorized.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnauthorized_Code(), ecorePackage.getEString(), "code", null, 0, 1, Unauthorized.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnauthorized_Message(), ecorePackage.getEString(), "message", null, 0, 1, Unauthorized.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forbiddenEClass, Forbidden.class, "Forbidden", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForbidden_Status(), ecorePackage.getEFloatObject(), "status", null, 0, 1, Forbidden.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForbidden_Code(), ecorePackage.getEString(), "code", null, 0, 1, Forbidden.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForbidden_Message(), ecorePackage.getEString(), "message", null, 0, 1, Forbidden.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tooManyRequestsEClass, TooManyRequests.class, "TooManyRequests", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTooManyRequests_Status(), ecorePackage.getEFloatObject(), "status", null, 0, 1, TooManyRequests.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTooManyRequests_Code(), ecorePackage.getEString(), "code", null, 0, 1, TooManyRequests.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTooManyRequests_Message(), ecorePackage.getEString(), "message", null, 0, 1, TooManyRequests.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, tag.class, "tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettag_Id(), ecorePackage.getEBigInteger(), "id", null, 0, 1, tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettag_Name(), ecorePackage.getEString(), "name", null, 0, 1, tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettag_Description(), ecorePackage.getEString(), "description", null, 0, 1, tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettag_Color(), ecorePackage.getEString(), "color", null, 0, 1, tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettag_Domain(), this.gettag_domain(), null, "domain", null, 0, 1, tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportCreationEClass, ExportCreation.class, "ExportCreation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExportCreation_StartDate(), ecorePackage.getEString(), "startDate", null, 0, 1, ExportCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExportCreation_EndDate(), ecorePackage.getEString(), "endDate", null, 0, 1, ExportCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExportCreation_StartTime(), ecorePackage.getEString(), "startTime", null, 0, 1, ExportCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExportCreation_EndTime(), ecorePackage.getEString(), "endTime", null, 0, 1, ExportCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExportCreation_Schema(), ecorePackage.getEString(), "schema", null, 0, 1, ExportCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExportCreation_SiteIds(), ecorePackage.getEIntegerObject(), "siteIds", null, 0, -1, ExportCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExportCreation_Granularity(), ecorePackage.getEString(), "granularity", null, 0, 1, ExportCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExportCreation_ValidatedDataOnly(), ecorePackage.getEBooleanObject(), "validatedDataOnly", null, 0, 1, ExportCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExportCreation_GapFilling(), ecorePackage.getEBooleanObject(), "gapFilling", null, 0, 1, ExportCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExportCreation_ValidateSchema(), ecorePackage.getEBooleanObject(), "validateSchema", null, 0, 1, ExportCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportEClass, Export.class, "Export", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExport_Id(), ecorePackage.getEIntegerObject(), "id", null, 0, 1, Export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExport_Status(), ecorePackage.getEString(), "status", null, 0, 1, Export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExport_Url(), ecorePackage.getEString(), "url", null, 0, 1, Export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExport_ErrorMessage(), ecorePackage.getEString(), "errorMessage", null, 0, 1, Export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExport_EndProcessingDateTime(), ecorePackage.getEString(), "endProcessingDateTime", null, 0, 1, Export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notFoundEClass, NotFound.class, "NotFound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotFound_Status(), ecorePackage.getEFloatObject(), "status", null, 0, 1, NotFound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotFound_Code(), ecorePackage.getEString(), "code", null, 0, 1, NotFound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotFound_Message(), ecorePackage.getEString(), "message", null, 0, 1, NotFound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directionNameEClass, DirectionName.class, "DirectionName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statisticalTrafficEClass, StatisticalTraffic.class, "StatisticalTraffic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatisticalTraffic_SiteId(), ecorePackage.getEBigInteger(), "siteId", null, 0, 1, StatisticalTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatisticalTraffic_Date(), ecorePackage.getEString(), "date", null, 0, 1, StatisticalTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatisticalTraffic_TravelMode(), this.getStatisticalTraffic_travelMode(), null, "travelMode", null, 0, 1, StatisticalTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatisticalTraffic_Direction(), this.getStatisticalTraffic_direction(), null, "direction", null, 0, 1, StatisticalTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatisticalTraffic_DirectionName(), this.getStatisticalTraffic_directionName(), null, "directionName", null, 0, 1, StatisticalTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatisticalTraffic_Value(), this.getStatisticalTraffic_value(), null, "value", null, 0, 1, StatisticalTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseSerieEClass, BaseSerie.class, "BaseSerie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseSerie_TravelMode(), this.getBaseSerie_travelMode(), null, "travelMode", null, 0, 1, BaseSerie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseSerie_Direction(), this.getBaseSerie_direction(), null, "direction", null, 0, 1, BaseSerie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeEClass, DateTime.class, "DateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(countEClass, Count.class, "Count", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataStatusEClass, DataStatus.class, "DataStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(historicalRawTrafficEClass, HistoricalRawTraffic.class, "HistoricalRawTraffic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHistoricalRawTraffic_FlowID(), ecorePackage.getEBigInteger(), "flowID", null, 0, 1, HistoricalRawTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistoricalRawTraffic_FlowName(), ecorePackage.getEString(), "flowName", null, 0, 1, HistoricalRawTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistoricalRawTraffic_Data(), this.getHistoricalRawTraffic_data(), null, "data", null, 0, -1, HistoricalRawTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(historicalAggregatedTrafficEClass, HistoricalAggregatedTraffic.class, "HistoricalAggregatedTraffic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistoricalAggregatedTraffic_Data(), this.getHistoricalAggregatedTraffic_data(), null, "data", null, 0, -1, HistoricalAggregatedTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistoricalAggregatedTraffic_DirectionName(), this.getHistoricalAggregatedTraffic_directionName(), null, "directionName", null, 0, 1, HistoricalAggregatedTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistoricalAggregatedTraffic_FlowID(), ecorePackage.getEBigInteger(), "flowID", null, 0, 1, HistoricalAggregatedTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistoricalAggregatedTraffic_FlowName(), ecorePackage.getEString(), "flowName", null, 0, 1, HistoricalAggregatedTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(laneEClass, Lane.class, "Lane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(historicalTimestampTrafficEClass, HistoricalTimestampTraffic.class, "HistoricalTimestampTraffic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistoricalTimestampTraffic_Timestamp(), this.getHistoricalTimestampTraffic_timestamp(), null, "timestamp", null, 0, 1, HistoricalTimestampTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistoricalTimestampTraffic_Lane(), this.getHistoricalTimestampTraffic_lane(), null, "lane", null, 0, 1, HistoricalTimestampTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistoricalTimestampTraffic_Speed(), ecorePackage.getEBigInteger(), "speed", null, 0, 1, HistoricalTimestampTraffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validationJobEClass, validationJob.class, "validationJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getvalidationJob_Id(), ecorePackage.getEBigInteger(), "id", null, 0, 1, validationJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getvalidationJob_Status(), this.getvalidationJob_status(), null, "status", null, 0, 1, validationJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getvalidationJob_SiteIds(), ecorePackage.getEIntegerObject(), "siteIds", null, 0, -1, validationJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getvalidationJob_StartDate(), ecorePackage.getEString(), "startDate", null, 0, 1, validationJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getvalidationJob_EndDate(), ecorePackage.getEString(), "endDate", null, 0, 1, validationJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getvalidationJob_ErrorMessage(), ecorePackage.getEString(), "errorMessage", null, 0, 1, validationJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getvalidationJob_EndProcessingDateTime(), ecorePackage.getEString(), "endProcessingDateTime", null, 0, 1, validationJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getvalidationJob_CreatedAt(), ecorePackage.getEString(), "createdAt", null, 0, 1, validationJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validationJobCreatedEClass, validationJobCreated.class, "validationJobCreated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getvalidationJobCreated_Id(), ecorePackage.getEBigInteger(), "id", null, 0, 1, validationJobCreated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getvalidationJobCreated_Status(), this.getvalidationJobCreated_status(), null, "status", null, 0, 1, validationJobCreated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getvalidationJobCreated_SiteIds(), ecorePackage.getEIntegerObject(), "siteIds", null, 0, -1, validationJobCreated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getvalidationJobCreated_StartDate(), ecorePackage.getEString(), "startDate", null, 0, 1, validationJobCreated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getvalidationJobCreated_EndDate(), ecorePackage.getEString(), "endDate", null, 0, 1, validationJobCreated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conflictEClass, Conflict.class, "Conflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConflict_Status(), ecorePackage.getEFloatObject(), "status", null, 0, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConflict_Code(), ecorePackage.getEString(), "code", null, 0, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConflict_Message(), ecorePackage.getEString(), "message", null, 0, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineString_coordinatesEClass, LineString_coordinates.class, "LineString_coordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(site_locationEClass, site_location.class, "site_location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(site_segmentsEClass, site_segments.class, "site_segments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(site_travelModesEClass, site_travelModes.class, "site_travelModes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(site_countersEClass, site_counters.class, "site_counters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(site_domainEClass, site_domain.class, "site_domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(site_tagsEClass, site_tags.class, "site_tags", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(site_imagesEClass, site_images.class, "site_images", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tag_domainEClass, tag_domain.class, "tag_domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statisticalTraffic_travelModeEClass, StatisticalTraffic_travelMode.class, "StatisticalTraffic_travelMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statisticalTraffic_directionEClass, StatisticalTraffic_direction.class, "StatisticalTraffic_direction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statisticalTraffic_directionNameEClass, StatisticalTraffic_directionName.class, "StatisticalTraffic_directionName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statisticalTraffic_valueEClass, StatisticalTraffic_value.class, "StatisticalTraffic_value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseSerie_travelModeEClass, BaseSerie_travelMode.class, "BaseSerie_travelMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseSerie_directionEClass, BaseSerie_direction.class, "BaseSerie_direction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(historicalRawTraffic_dataEClass, HistoricalRawTraffic_data.class, "HistoricalRawTraffic_data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistoricalRawTraffic_data_Timestamp(), this.getHistoricalRawTraffic_data_timestamp(), null, "timestamp", null, 0, 1, HistoricalRawTraffic_data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistoricalRawTraffic_data_Granularity(), ecorePackage.getEString(), "granularity", null, 0, 1, HistoricalRawTraffic_data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistoricalRawTraffic_data_Counts(), this.getHistoricalRawTraffic_data_counts(), null, "counts", null, 0, 1, HistoricalRawTraffic_data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistoricalRawTraffic_data_Status(), this.getHistoricalRawTraffic_data_status(), null, "status", null, 0, 1, HistoricalRawTraffic_data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(historicalRawTraffic_data_timestampEClass, HistoricalRawTraffic_data_timestamp.class, "HistoricalRawTraffic_data_timestamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(historicalRawTraffic_data_countsEClass, HistoricalRawTraffic_data_counts.class, "HistoricalRawTraffic_data_counts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(historicalRawTraffic_data_statusEClass, HistoricalRawTraffic_data_status.class, "HistoricalRawTraffic_data_status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(historicalAggregatedTraffic_dataEClass, HistoricalAggregatedTraffic_data.class, "HistoricalAggregatedTraffic_data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistoricalAggregatedTraffic_data_Timestamp(), this.getHistoricalAggregatedTraffic_data_timestamp(), null, "timestamp", null, 0, 1, HistoricalAggregatedTraffic_data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistoricalAggregatedTraffic_data_Traffic(), this.getHistoricalAggregatedTraffic_data_traffic(), null, "traffic", null, 0, 1, HistoricalAggregatedTraffic_data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistoricalAggregatedTraffic_data_Weather(), this.getHistoricalAggregatedTraffic_data_weather(), null, "weather", null, 0, 1, HistoricalAggregatedTraffic_data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(historicalAggregatedTraffic_data_timestampEClass, HistoricalAggregatedTraffic_data_timestamp.class, "HistoricalAggregatedTraffic_data_timestamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(historicalAggregatedTraffic_data_trafficEClass, HistoricalAggregatedTraffic_data_traffic.class, "HistoricalAggregatedTraffic_data_traffic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistoricalAggregatedTraffic_data_traffic_Counts(), this.getHistoricalAggregatedTraffic_data_traffic_counts(), null, "counts", null, 0, 1, HistoricalAggregatedTraffic_data_traffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistoricalAggregatedTraffic_data_traffic_Status(), ecorePackage.getEJavaObject(), "status", null, 0, 1, HistoricalAggregatedTraffic_data_traffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(historicalAggregatedTraffic_data_traffic_countsEClass, HistoricalAggregatedTraffic_data_traffic_counts.class, "HistoricalAggregatedTraffic_data_traffic_counts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(historicalAggregatedTraffic_data_weatherEClass, HistoricalAggregatedTraffic_data_weather.class, "HistoricalAggregatedTraffic_data_weather", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHistoricalAggregatedTraffic_data_weather_Temperature(), ecorePackage.getEFloatObject(), "temperature", null, 0, 1, HistoricalAggregatedTraffic_data_weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistoricalAggregatedTraffic_data_weather_RainAccumulation(), ecorePackage.getEFloatObject(), "rainAccumulation", null, 0, 1, HistoricalAggregatedTraffic_data_weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistoricalAggregatedTraffic_data_weather_SnowAccumulation(), ecorePackage.getEFloatObject(), "snowAccumulation", null, 0, 1, HistoricalAggregatedTraffic_data_weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(historicalAggregatedTraffic_directionNameEClass, HistoricalAggregatedTraffic_directionName.class, "HistoricalAggregatedTraffic_directionName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(historicalTimestampTraffic_timestampEClass, HistoricalTimestampTraffic_timestamp.class, "HistoricalTimestampTraffic_timestamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(historicalTimestampTraffic_laneEClass, HistoricalTimestampTraffic_lane.class, "HistoricalTimestampTraffic_lane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(validationJob_statusEClass, validationJob_status.class, "validationJob_status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(validationJobCreated_statusEClass, validationJobCreated_status.class, "validationJobCreated_status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponse_Code(), ecorePackage.getEInt(), "code", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponse_Description(), ecorePackage.getEString(), "description", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponse_Response(), this.getJResponse(), "response", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_Result(), ecorePackage.getEObject(), null, "result", null, 0, -1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openApiClientEClass, OpenApiClient.class, "OpenApiClient", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getOpenApiClient__ToQueryString__String_Object(), ecorePackage.getEString(), "toQueryString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "in", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOpenApiClient___get__String_EClass_EMap_EMap(), this.getResponse(), "_get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endpoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "result", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEStringToStringMapEntry(), "pathParameter", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEStringToStringMapEntry(), "queryParameter", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOpenApiClient___delete__String_EClass_EMap_EMap(), this.getResponse(), "_delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endpoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "result", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEStringToStringMapEntry(), "pathParameter", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEStringToStringMapEntry(), "queryParameter", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(bikeOpenApiClientEClass, BikeOpenApiClient.class, "BikeOpenApiClient", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBikeOpenApiClient__GetSites__Integer_Integer_String_String_EList_EList_EList_EList_EList(), this.getResponse(), "GetSites", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "page", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "pageSize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sortBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "orderBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "include", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "ids", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "domainIds", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "tagIds", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "customIds", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBikeOpenApiClient__GetTags__Integer_Integer_String_String_EList_EList_EList(), this.getResponse(), "GetTags", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "page", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "pageSize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sortBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "orderBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "include", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "ids", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "domainIds", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBikeOpenApiClient__CreateExport__CreateExport_request(), this.getResponse(), "CreateExport", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCreateExport_request(), "request", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBikeOpenApiClient__GetExportStatus__Integer(), this.getResponse(), "GetExportStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "jobId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBikeOpenApiClient__DownloadExportData__Integer(), this.getResponse(), "DownloadExportData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "jobId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBikeOpenApiClient__GetADT__BigInteger_BigInteger_GetADT_dateRange_Integer_Integer_GetADT_groupBy_EList_Boolean(), this.getResponse(), "GetADT", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "domainId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "siteId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetADT_dateRange(), "dateRange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "month", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "year", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetADT_groupBy(), "groupBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetADT_travelModes(), "travelModes", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "validatedDataOnly", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBikeOpenApiClient__GetADTBySite__BigInteger_BigInteger_GetADTBySite_dateRange_Integer_Integer_GetADTBySite_groupBy_EList_Boolean(), this.getResponse(), "GetADTBySite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "domainId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "siteId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetADTBySite_dateRange(), "dateRange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "month", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "year", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetADTBySite_groupBy(), "groupBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetADTBySite_travelModes(), "travelModes", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "validatedDataOnly", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBikeOpenApiClient__GetTotalTraffic__BigInteger_BigInteger_GetTotalTraffic_dateRange_Integer_Integer_GetTotalTraffic_groupBy_EList_Boolean(), this.getResponse(), "GetTotalTraffic", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "domainId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "siteId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetTotalTraffic_dateRange(), "dateRange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "month", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "year", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetTotalTraffic_groupBy(), "groupBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetTotalTraffic_travelModes(), "travelModes", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "validatedDataOnly", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBikeOpenApiClient__GetRawTraffic__BigInteger_EList_String_String_String_String_Boolean_EList_Boolean_Boolean(), this.getResponse(), "GetRawTraffic", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "siteId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetRawTraffic_include(), "include", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "gapFilling", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetRawTraffic_travelModes(), "travelModes", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "validatedDataOnly", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "rawDataOnly", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBikeOpenApiClient__GetAggregatedTraffic__BigInteger_EList_String_String_String_String_GetAggregatedTraffic_granularity_GetAggregatedTraffic_groupBy_Boolean_EList_Boolean_Boolean(), this.getResponse(), "GetAggregatedTraffic", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "siteId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetAggregatedTraffic_include(), "include", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetAggregatedTraffic_granularity(), "granularity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetAggregatedTraffic_groupBy(), "groupBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "gapFilling", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetAggregatedTraffic_travelModes(), "travelModes", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "validatedDataOnly", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "rawDataOnly", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBikeOpenApiClient__GetTimestampTraffic__BigInteger_String_String_String_String_EList_EList(), this.getResponse(), "GetTimestampTraffic", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "siteId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetTimestampTraffic_travelModes(), "travelModes", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGetTimestampTraffic_directions(), "directions", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBikeOpenApiClient__ValidationJobsGet__Integer_Integer(), this.getResponse(), "ValidationJobsGet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "page", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "pageSize", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBikeOpenApiClient__ValidationJobCreate__ValidationJobCreate_request(), this.getResponse(), "ValidationJobCreate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getValidationJobCreate_request(), "request", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBikeOpenApiClient__ValidationJobGet__Integer(), this.getResponse(), "ValidationJobGet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "jobId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(createExport_requestEClass, CreateExport_request.class, "CreateExport_request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getADT_dateRangeEClass, GetADT_dateRange.class, "GetADT_dateRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getADT_groupByEClass, GetADT_groupBy.class, "GetADT_groupBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getADT_travelModesEClass, GetADT_travelModes.class, "GetADT_travelModes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getADTBySite_dateRangeEClass, GetADTBySite_dateRange.class, "GetADTBySite_dateRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getADTBySite_groupByEClass, GetADTBySite_groupBy.class, "GetADTBySite_groupBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getADTBySite_travelModesEClass, GetADTBySite_travelModes.class, "GetADTBySite_travelModes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getTotalTraffic_dateRangeEClass, GetTotalTraffic_dateRange.class, "GetTotalTraffic_dateRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getTotalTraffic_groupByEClass, GetTotalTraffic_groupBy.class, "GetTotalTraffic_groupBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getTotalTraffic_travelModesEClass, GetTotalTraffic_travelModes.class, "GetTotalTraffic_travelModes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getRawTraffic_includeEClass, GetRawTraffic_include.class, "GetRawTraffic_include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getRawTraffic_travelModesEClass, GetRawTraffic_travelModes.class, "GetRawTraffic_travelModes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getAggregatedTraffic_includeEClass, GetAggregatedTraffic_include.class, "GetAggregatedTraffic_include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getAggregatedTraffic_granularityEClass, GetAggregatedTraffic_granularity.class, "GetAggregatedTraffic_granularity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getAggregatedTraffic_groupByEClass, GetAggregatedTraffic_groupBy.class, "GetAggregatedTraffic_groupBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getAggregatedTraffic_travelModesEClass, GetAggregatedTraffic_travelModes.class, "GetAggregatedTraffic_travelModes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getTimestampTraffic_travelModesEClass, GetTimestampTraffic_travelModes.class, "GetTimestampTraffic_travelModes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getTimestampTraffic_directionsEClass, GetTimestampTraffic_directions.class, "GetTimestampTraffic_directions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(validationJobCreate_requestEClass, ValidationJobCreate_request.class, "ValidationJobCreate_request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidationJobCreate_request_SiteIds(), ecorePackage.getEIntegerObject(), "siteIds", null, 0, -1, ValidationJobCreate_request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationJobCreate_request_StartDate(), ecorePackage.getEString(), "startDate", null, 0, 1, ValidationJobCreate_request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationJobCreate_request_EndDate(), ecorePackage.getEString(), "endDate", null, 0, 1, ValidationJobCreate_request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(travelModeLabelEEnum, TravelModeLabel.class, "TravelModeLabel");
		addEEnumLiteral(travelModeLabelEEnum, TravelModeLabel.PEDESTRIAN);
		addEEnumLiteral(travelModeLabelEEnum, TravelModeLabel.BIKE);
		addEEnumLiteral(travelModeLabelEEnum, TravelModeLabel.HORSE);
		addEEnumLiteral(travelModeLabelEEnum, TravelModeLabel.CAR);
		addEEnumLiteral(travelModeLabelEEnum, TravelModeLabel.BUS);
		addEEnumLiteral(travelModeLabelEEnum, TravelModeLabel.MINIBUS);
		addEEnumLiteral(travelModeLabelEEnum, TravelModeLabel.UNDEFINED);
		addEEnumLiteral(travelModeLabelEEnum, TravelModeLabel.MOTORBIKE);
		addEEnumLiteral(travelModeLabelEEnum, TravelModeLabel.KAYAK);
		addEEnumLiteral(travelModeLabelEEnum, TravelModeLabel.SCOOTER);
		addEEnumLiteral(travelModeLabelEEnum, TravelModeLabel.TRUCK);
		addEEnumLiteral(travelModeLabelEEnum, TravelModeLabel.CARGOBIKE);
		addEEnumLiteral(travelModeLabelEEnum, TravelModeLabel.MOTORIZED);

		initEEnum(dateRangeEEnum, DateRange.class, "DateRange");
		addEEnumLiteral(dateRangeEEnum, DateRange.CURRENT_YEAR);
		addEEnumLiteral(dateRangeEEnum, DateRange.LAST_YEAR);
		addEEnumLiteral(dateRangeEEnum, DateRange.CURRENT_MONTH);
		addEEnumLiteral(dateRangeEEnum, DateRange.LAST_MONTH);
		addEEnumLiteral(dateRangeEEnum, DateRange.CURRENT_WEEK);
		addEEnumLiteral(dateRangeEEnum, DateRange.LAST_WEEK);
		addEEnumLiteral(dateRangeEEnum, DateRange.YESTERDAY);
		addEEnumLiteral(dateRangeEEnum, DateRange.CUSTOM);

		initEEnum(statisticalAverageGroupByEEnum, StatisticalAverageGroupBy.class, "StatisticalAverageGroupBy");
		addEEnumLiteral(statisticalAverageGroupByEEnum, StatisticalAverageGroupBy.SITE);
		addEEnumLiteral(statisticalAverageGroupByEEnum, StatisticalAverageGroupBy.TRAVEL_MODE);
		addEEnumLiteral(statisticalAverageGroupByEEnum, StatisticalAverageGroupBy.DIRECTION);
		addEEnumLiteral(statisticalAverageGroupByEEnum, StatisticalAverageGroupBy.SITE_AND_TRAVEL_MODE);

		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.IN);
		addEEnumLiteral(directionEEnum, Direction.OUT);
		addEEnumLiteral(directionEEnum, Direction.UNDEFINED);

		initEEnum(statisticalTotalGroupByEEnum, StatisticalTotalGroupBy.class, "StatisticalTotalGroupBy");
		addEEnumLiteral(statisticalTotalGroupByEEnum, StatisticalTotalGroupBy.SITE);
		addEEnumLiteral(statisticalTotalGroupByEEnum, StatisticalTotalGroupBy.TRAVEL_MODE);
		addEEnumLiteral(statisticalTotalGroupByEEnum, StatisticalTotalGroupBy.SITE_AND_TRAVEL_MODE);

		initEEnum(historicalRawTrafficIncludeEEnum, HistoricalRawTrafficInclude.class, "HistoricalRawTrafficInclude");
		addEEnumLiteral(historicalRawTrafficIncludeEEnum, HistoricalRawTrafficInclude.STATUS);

		initEEnum(historicalAggregatedTrafficIncludeEEnum, HistoricalAggregatedTrafficInclude.class, "HistoricalAggregatedTrafficInclude");
		addEEnumLiteral(historicalAggregatedTrafficIncludeEEnum, HistoricalAggregatedTrafficInclude.STATUS);
		addEEnumLiteral(historicalAggregatedTrafficIncludeEEnum, HistoricalAggregatedTrafficInclude.WEATHER);

		initEEnum(granularityEEnum, Granularity.class, "Granularity");
		addEEnumLiteral(granularityEEnum, Granularity.PT15M);
		addEEnumLiteral(granularityEEnum, Granularity.PT1H);
		addEEnumLiteral(granularityEEnum, Granularity.P1D);
		addEEnumLiteral(granularityEEnum, Granularity.P1W);
		addEEnumLiteral(granularityEEnum, Granularity.P1M);
		addEEnumLiteral(granularityEEnum, Granularity.P1Y);

		initEEnum(historicalAggregatedTrafficGroupByEEnum, HistoricalAggregatedTrafficGroupBy.class, "HistoricalAggregatedTrafficGroupBy");
		addEEnumLiteral(historicalAggregatedTrafficGroupByEEnum, HistoricalAggregatedTrafficGroupBy.SITE);
		addEEnumLiteral(historicalAggregatedTrafficGroupByEEnum, HistoricalAggregatedTrafficGroupBy.TRAVEL_MODE);
		addEEnumLiteral(historicalAggregatedTrafficGroupByEEnum, HistoricalAggregatedTrafficGroupBy.DIRECTION);
		addEEnumLiteral(historicalAggregatedTrafficGroupByEEnum, HistoricalAggregatedTrafficGroupBy.TRAVEL_MODE_AND_DIRECTION);
		addEEnumLiteral(historicalAggregatedTrafficGroupByEEnum, HistoricalAggregatedTrafficGroupBy.FLOW);

		initEEnum(validationJobStatusEEnum, validationJobStatus.class, "validationJobStatus");
		addEEnumLiteral(validationJobStatusEEnum, validationJobStatus.IN_PROGRESS);
		addEEnumLiteral(validationJobStatusEEnum, validationJobStatus.SUCCESS);
		addEEnumLiteral(validationJobStatusEEnum, validationJobStatus.FAILURE);

		// Initialize data types
		initEDataType(jResponseEDataType, jakarta.ws.rs.core.Response.class, "JResponse", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
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
		  (getOpenApiClient__ToQueryString__String_Object(),
		   source,
		   new String[] {
			   "documentation", "Converts an object to a query parameter compatible string",
			   "body", "if(in instanceof java.util.Collection<?> c) {\n\treturn c.stream().map(String::valueOf).map(s -> java.net.URLEncoder.encode(s, java.nio.charset.StandardCharsets.UTF_8)).collect(java.util.stream.Collectors.joining(\"&\"+name+\"=\"));\n}\nreturn java.net.URLEncoder.encode(String.valueOf(in), java.nio.charset.StandardCharsets.UTF_8);\n"
		   });
		addAnnotation
		  (getOpenApiClient___get__String_EClass_EMap_EMap(),
		   source,
		   new String[] {
			   "documentation", " _get it "
		   });
		addAnnotation
		  (getOpenApiClient___delete__String_EClass_EMap_EMap(),
		   source,
		   new String[] {
			   "documentation", " _delete it "
		   });
		addAnnotation
		  (getBikeOpenApiClient__GetSites__Integer_Integer_String_String_EList_EList_EList_EList_EList(),
		   source,
		   new String[] {
			   "documentation", "Returns a list of your counting sites.\n",
			   "body", "java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();\njava.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();\nString endpoint = \"/sites\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != page ) queryParameter.put(\"page\", toQueryString(\"page\",page));\nif ( null != pageSize ) queryParameter.put(\"pageSize\", toQueryString(\"pageSize\",pageSize));\nif ( null != sortBy ) queryParameter.put(\"sortBy\", toQueryString(\"sortBy\",sortBy));\nif ( null != orderBy ) queryParameter.put(\"orderBy\", toQueryString(\"orderBy\",orderBy));\nif ( null != include ) queryParameter.put(\"include\", toQueryString(\"include\",include));\nif ( null != ids ) queryParameter.put(\"ids\", toQueryString(\"ids\",ids));\nif ( null != domainIds ) queryParameter.put(\"domainIds\", toQueryString(\"domainIds\",domainIds));\nif ( null != tagIds ) queryParameter.put(\"tagIds\", toQueryString(\"tagIds\",tagIds));\nif ( null != customIds ) queryParameter.put(\"customIds\", toQueryString(\"customIds\",customIds));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));"
		   });
		addAnnotation
		  (getBikeOpenApiClient__GetTags__Integer_Integer_String_String_EList_EList_EList(),
		   source,
		   new String[] {
			   "documentation", "Returns a list of your tags.\n",
			   "body", "java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();\njava.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();\nString endpoint = \"/tags\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != page ) queryParameter.put(\"page\", toQueryString(\"page\",page));\nif ( null != pageSize ) queryParameter.put(\"pageSize\", toQueryString(\"pageSize\",pageSize));\nif ( null != sortBy ) queryParameter.put(\"sortBy\", toQueryString(\"sortBy\",sortBy));\nif ( null != orderBy ) queryParameter.put(\"orderBy\", toQueryString(\"orderBy\",orderBy));\nif ( null != include ) queryParameter.put(\"include\", toQueryString(\"include\",include));\nif ( null != ids ) queryParameter.put(\"ids\", toQueryString(\"ids\",ids));\nif ( null != domainIds ) queryParameter.put(\"domainIds\", toQueryString(\"domainIds\",domainIds));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));"
		   });
		addAnnotation
		  (getBikeOpenApiClient__CreateExport__CreateExport_request(),
		   source,
		   new String[] {
			   "documentation", "Create a new asynchronous export job to retrieve large volumes of traffic data efficiently.\n\nThis endpoint allows you to:\n- Export data from multiple sites simultaneously (up to 10,000 sites)\n- Choose from various time granularities (15 minutes to 1 year)\n- Apply filters for validated data only\n- Enable gap filling for contiguous time series\n- Select from available export schema formats\n\n**Important**: Export files are available for download for 30 days after completion, then automatically deleted.\n endpoint: /exports"
		   });
		addAnnotation
		  (getBikeOpenApiClient__GetExportStatus__Integer(),
		   source,
		   new String[] {
			   "documentation", "Monitor the progress and status of your export job.\n\nPossible statuses:\n- **queued**: Job is waiting to be processed\n- **in_progress**: Data is being processed and prepared\n- **success**: Export completed successfully, data ready for download\n- **failure**: Export failed (see errorMessage for details)\n- **cleaned**: Export file has been automatically deleted (after 30 days)\n\nOnce the status is \'success\', you can download the data using the provided URL. Remember that export files are only available for 30 days before being automatically deleted.\n",
			   "body", "java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();\njava.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();\nString endpoint = \"/exports/{jobId}\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\npathParameter.put(\"jobId\", toQueryString(\"jobId\",jobId));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));"
		   });
		addAnnotation
		  (getBikeOpenApiClient__DownloadExportData__Integer(),
		   source,
		   new String[] {
			   "documentation", "Download the completed export data as a compressed archive. The format and structure depend on the export schema selected during job creation.\n\nThe archive typically includes:\n- Traffic counting data organized according to the selected schema\n- Metadata files with site information and export parameters\n- Documentation files explaining the data structure and format\n\n**Important**: Export files are only available for 30 days after job completion. After this period, files are automatically deleted and cannot be recovered.\n\n**Note**: This endpoint only works when the export status is \'success\' otherwise it returns a HTTP 404 error.\n",
			   "body", "java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();\njava.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();\nString endpoint = \"/exports/{jobId}/data\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\npathParameter.put(\"jobId\", toQueryString(\"jobId\",jobId));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));"
		   });
		addAnnotation
		  (getBikeOpenApiClient__GetADT__BigInteger_BigInteger_GetADT_dateRange_Integer_Integer_GetADT_groupBy_EList_Boolean(),
		   source,
		   new String[] {
			   "documentation", "Total traffic volume during the selected time period, divided by the number of days having data in that period.\n",
			   "body", "java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();\njava.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();\nString endpoint = \"/statistical/adt\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != domainId ) queryParameter.put(\"domainId\", toQueryString(\"domainId\",domainId));\nif ( null != siteId ) queryParameter.put(\"siteId\", toQueryString(\"siteId\",siteId));\nif ( null != dateRange ) queryParameter.put(\"dateRange\", toQueryString(\"dateRange\",dateRange));\nif ( null != month ) queryParameter.put(\"month\", toQueryString(\"month\",month));\nif ( null != year ) queryParameter.put(\"year\", toQueryString(\"year\",year));\nif ( null != groupBy ) queryParameter.put(\"groupBy\", toQueryString(\"groupBy\",groupBy));\nif ( null != travelModes ) queryParameter.put(\"travelModes\", toQueryString(\"travelModes\",travelModes));\nif ( null != validatedDataOnly ) queryParameter.put(\"validatedDataOnly\", toQueryString(\"validatedDataOnly\",validatedDataOnly));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));"
		   });
		addAnnotation
		  (getBikeOpenApiClient__GetADTBySite__BigInteger_BigInteger_GetADTBySite_dateRange_Integer_Integer_GetADTBySite_groupBy_EList_Boolean(),
		   source,
		   new String[] {
			   "documentation", "Total traffic volume during the selected time period, divided by the number of days having data in that period and by the number of counting sites.\n",
			   "body", "java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();\njava.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();\nString endpoint = \"/statistical/adt/by/site\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != domainId ) queryParameter.put(\"domainId\", toQueryString(\"domainId\",domainId));\nif ( null != siteId ) queryParameter.put(\"siteId\", toQueryString(\"siteId\",siteId));\nif ( null != dateRange ) queryParameter.put(\"dateRange\", toQueryString(\"dateRange\",dateRange));\nif ( null != month ) queryParameter.put(\"month\", toQueryString(\"month\",month));\nif ( null != year ) queryParameter.put(\"year\", toQueryString(\"year\",year));\nif ( null != groupBy ) queryParameter.put(\"groupBy\", toQueryString(\"groupBy\",groupBy));\nif ( null != travelModes ) queryParameter.put(\"travelModes\", toQueryString(\"travelModes\",travelModes));\nif ( null != validatedDataOnly ) queryParameter.put(\"validatedDataOnly\", toQueryString(\"validatedDataOnly\",validatedDataOnly));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));"
		   });
		addAnnotation
		  (getBikeOpenApiClient__GetTotalTraffic__BigInteger_BigInteger_GetTotalTraffic_dateRange_Integer_Integer_GetTotalTraffic_groupBy_EList_Boolean(),
		   source,
		   new String[] {
			   "documentation", "Get total traffic\n",
			   "body", "java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();\njava.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();\nString endpoint = \"/statistical/total\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != domainId ) queryParameter.put(\"domainId\", toQueryString(\"domainId\",domainId));\nif ( null != siteId ) queryParameter.put(\"siteId\", toQueryString(\"siteId\",siteId));\nif ( null != dateRange ) queryParameter.put(\"dateRange\", toQueryString(\"dateRange\",dateRange));\nif ( null != month ) queryParameter.put(\"month\", toQueryString(\"month\",month));\nif ( null != year ) queryParameter.put(\"year\", toQueryString(\"year\",year));\nif ( null != groupBy ) queryParameter.put(\"groupBy\", toQueryString(\"groupBy\",groupBy));\nif ( null != travelModes ) queryParameter.put(\"travelModes\", toQueryString(\"travelModes\",travelModes));\nif ( null != validatedDataOnly ) queryParameter.put(\"validatedDataOnly\", toQueryString(\"validatedDataOnly\",validatedDataOnly));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));"
		   });
		addAnnotation
		  (getBikeOpenApiClient__GetRawTraffic__BigInteger_EList_String_String_String_String_Boolean_EList_Boolean_Boolean(),
		   source,
		   new String[] {
			   "documentation", "Maximum timeframe of 31 days\n",
			   "body", "java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();\njava.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();\nString endpoint = \"/history/traffic/raw\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != siteId ) queryParameter.put(\"siteId\", toQueryString(\"siteId\",siteId));\nif ( null != include ) queryParameter.put(\"include\", toQueryString(\"include\",include));\nif ( null != startDate ) queryParameter.put(\"startDate\", toQueryString(\"startDate\",startDate));\nif ( null != endDate ) queryParameter.put(\"endDate\", toQueryString(\"endDate\",endDate));\nif ( null != startTime ) queryParameter.put(\"startTime\", toQueryString(\"startTime\",startTime));\nif ( null != endTime ) queryParameter.put(\"endTime\", toQueryString(\"endTime\",endTime));\nif ( null != gapFilling ) queryParameter.put(\"gapFilling\", toQueryString(\"gapFilling\",gapFilling));\nif ( null != travelModes ) queryParameter.put(\"travelModes\", toQueryString(\"travelModes\",travelModes));\nif ( null != validatedDataOnly ) queryParameter.put(\"validatedDataOnly\", toQueryString(\"validatedDataOnly\",validatedDataOnly));\nif ( null != rawDataOnly ) queryParameter.put(\"rawDataOnly\", toQueryString(\"rawDataOnly\",rawDataOnly));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));"
		   });
		addAnnotation
		  (getBikeOpenApiClient__GetAggregatedTraffic__BigInteger_EList_String_String_String_String_GetAggregatedTraffic_granularity_GetAggregatedTraffic_groupBy_Boolean_EList_Boolean_Boolean(),
		   source,
		   new String[] {
			   "documentation", "Maximum timeframe of : \n\n  | Aggregation interval | Maximum timeframe |\n  |----------------------|-------------------|\n  | 15 minutes           | 31 days           |\n  | 1 hour               | 31 days           |\n  | 1 day                | 1 year            |\n  | 1 week               | 5 years           |\n  | 1 month              | 10 years          |\n  | 1 year               | 30 years          |\n\nRequesting aggregated data by exceeding the limits above will result in a 400 HTTP error.\n",
			   "body", "java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();\njava.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();\nString endpoint = \"/history/traffic/aggregated\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != siteId ) queryParameter.put(\"siteId\", toQueryString(\"siteId\",siteId));\nif ( null != include ) queryParameter.put(\"include\", toQueryString(\"include\",include));\nif ( null != startDate ) queryParameter.put(\"startDate\", toQueryString(\"startDate\",startDate));\nif ( null != endDate ) queryParameter.put(\"endDate\", toQueryString(\"endDate\",endDate));\nif ( null != startTime ) queryParameter.put(\"startTime\", toQueryString(\"startTime\",startTime));\nif ( null != endTime ) queryParameter.put(\"endTime\", toQueryString(\"endTime\",endTime));\nif ( null != granularity ) queryParameter.put(\"granularity\", toQueryString(\"granularity\",granularity));\nif ( null != groupBy ) queryParameter.put(\"groupBy\", toQueryString(\"groupBy\",groupBy));\nif ( null != gapFilling ) queryParameter.put(\"gapFilling\", toQueryString(\"gapFilling\",gapFilling));\nif ( null != travelModes ) queryParameter.put(\"travelModes\", toQueryString(\"travelModes\",travelModes));\nif ( null != validatedDataOnly ) queryParameter.put(\"validatedDataOnly\", toQueryString(\"validatedDataOnly\",validatedDataOnly));\nif ( null != rawDataOnly ) queryParameter.put(\"rawDataOnly\", toQueryString(\"rawDataOnly\",rawDataOnly));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));"
		   });
		addAnnotation
		  (getBikeOpenApiClient__GetTimestampTraffic__BigInteger_String_String_String_String_EList_EList(),
		   source,
		   new String[] {
			   "documentation", "Get timestamp traffic data for a specific date range. The maximum allowed duration between start and end date is **7 days** because of the amount of data returned.\nThis limitation ensures optimal performance and prevents the server from being overloaded due to excessive data retrieval.\n",
			   "body", "java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();\njava.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();\nString endpoint = \"/history/traffic/timestamp\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != siteId ) queryParameter.put(\"siteId\", toQueryString(\"siteId\",siteId));\nif ( null != startDate ) queryParameter.put(\"startDate\", toQueryString(\"startDate\",startDate));\nif ( null != endDate ) queryParameter.put(\"endDate\", toQueryString(\"endDate\",endDate));\nif ( null != startTime ) queryParameter.put(\"startTime\", toQueryString(\"startTime\",startTime));\nif ( null != endTime ) queryParameter.put(\"endTime\", toQueryString(\"endTime\",endTime));\nif ( null != travelModes ) queryParameter.put(\"travelModes\", toQueryString(\"travelModes\",travelModes));\nif ( null != directions ) queryParameter.put(\"directions\", toQueryString(\"directions\",directions));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));"
		   });
		addAnnotation
		  (getBikeOpenApiClient__ValidationJobsGet__Integer_Integer(),
		   source,
		   new String[] {
			   "documentation", "Get the informations of your validation jobs.\n",
			   "body", "java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();\njava.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();\nString endpoint = \"/validation/data/jobs\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != page ) queryParameter.put(\"page\", toQueryString(\"page\",page));\nif ( null != pageSize ) queryParameter.put(\"pageSize\", toQueryString(\"pageSize\",pageSize));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));"
		   });
		addAnnotation
		  (getBikeOpenApiClient__ValidationJobCreate__ValidationJobCreate_request(),
		   source,
		   new String[] {
			   "documentation", "Validate the data of the given sites from their ids on a period. The process is asynchronous.\nRestrictions:\n- Only one job can be in progress per API key\n- The validation period cannot exceed 1 year\n- Maximum 10 sites can be validated at once\n endpoint: /validation/data/jobs"
		   });
		addAnnotation
		  (getBikeOpenApiClient__ValidationJobGet__Integer(),
		   source,
		   new String[] {
			   "documentation", "Get the informations of a validation job from its id.\n",
			   "body", "java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();\njava.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();\nString endpoint = \"/validation/data/jobs/{jobId}\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\npathParameter.put(\"jobId\", toQueryString(\"jobId\",jobId));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));"
		   });
	}

} //BikePackageImpl
