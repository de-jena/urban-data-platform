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
package de.jena.bike.util;

import de.jena.bike.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.jena.bike.BikePackage
 * @generated
 */
public class BikeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BikePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BikeSwitch() {
		if (modelPackage == null) {
			modelPackage = BikePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BikePackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GEOMETRY: {
				Geometry geometry = (Geometry)theEObject;
				T result = caseGeometry(geometry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.POSITION: {
				Position position = (Position)theEObject;
				T result = casePosition(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.LINE_STRING_COORDINATES: {
				LineStringCoordinates lineStringCoordinates = (LineStringCoordinates)theEObject;
				T result = caseLineStringCoordinates(lineStringCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.LINE_STRING: {
				LineString lineString = (LineString)theEObject;
				T result = caseLineString(lineString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GEO_JSON_OBJECT: {
				GeoJsonObject geoJsonObject = (GeoJsonObject)theEObject;
				T result = caseGeoJsonObject(geoJsonObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.SITE_COUNTER: {
				siteCounter siteCounter = (siteCounter)theEObject;
				T result = casesiteCounter(siteCounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.SITE_TAG: {
				siteTag siteTag = (siteTag)theEObject;
				T result = casesiteTag(siteTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.SITE: {
				site site = (site)theEObject;
				T result = casesite(site);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.BAD_REQUEST: {
				BadRequest badRequest = (BadRequest)theEObject;
				T result = caseBadRequest(badRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.UNAUTHORIZED: {
				Unauthorized unauthorized = (Unauthorized)theEObject;
				T result = caseUnauthorized(unauthorized);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.FORBIDDEN: {
				Forbidden forbidden = (Forbidden)theEObject;
				T result = caseForbidden(forbidden);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.TOO_MANY_REQUESTS: {
				TooManyRequests tooManyRequests = (TooManyRequests)theEObject;
				T result = caseTooManyRequests(tooManyRequests);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.TAG: {
				tag tag = (tag)theEObject;
				T result = casetag(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.EXPORT_CREATION: {
				ExportCreation exportCreation = (ExportCreation)theEObject;
				T result = caseExportCreation(exportCreation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.EXPORT: {
				Export export = (Export)theEObject;
				T result = caseExport(export);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.NOT_FOUND: {
				NotFound notFound = (NotFound)theEObject;
				T result = caseNotFound(notFound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.DIRECTION_NAME: {
				DirectionName directionName = (DirectionName)theEObject;
				T result = caseDirectionName(directionName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.STATISTICAL_TRAFFIC: {
				StatisticalTraffic statisticalTraffic = (StatisticalTraffic)theEObject;
				T result = caseStatisticalTraffic(statisticalTraffic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.BASE_SERIE: {
				BaseSerie baseSerie = (BaseSerie)theEObject;
				T result = caseBaseSerie(baseSerie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.DATE_TIME: {
				DateTime dateTime = (DateTime)theEObject;
				T result = caseDateTime(dateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.COUNT: {
				Count count = (Count)theEObject;
				T result = caseCount(count);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.DATA_STATUS: {
				DataStatus dataStatus = (DataStatus)theEObject;
				T result = caseDataStatus(dataStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_RAW_TRAFFIC: {
				HistoricalRawTraffic historicalRawTraffic = (HistoricalRawTraffic)theEObject;
				T result = caseHistoricalRawTraffic(historicalRawTraffic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC: {
				HistoricalAggregatedTraffic historicalAggregatedTraffic = (HistoricalAggregatedTraffic)theEObject;
				T result = caseHistoricalAggregatedTraffic(historicalAggregatedTraffic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.LANE: {
				Lane lane = (Lane)theEObject;
				T result = caseLane(lane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC: {
				HistoricalTimestampTraffic historicalTimestampTraffic = (HistoricalTimestampTraffic)theEObject;
				T result = caseHistoricalTimestampTraffic(historicalTimestampTraffic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.VALIDATION_JOB: {
				validationJob validationJob = (validationJob)theEObject;
				T result = casevalidationJob(validationJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.VALIDATION_JOB_CREATED: {
				validationJobCreated validationJobCreated = (validationJobCreated)theEObject;
				T result = casevalidationJobCreated(validationJobCreated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.CONFLICT: {
				Conflict conflict = (Conflict)theEObject;
				T result = caseConflict(conflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.LINE_STRING_COORDINATES: {
				LineString_coordinates lineString_coordinates = (LineString_coordinates)theEObject;
				T result = caseLineString_coordinates(lineString_coordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.SITE_LOCATION: {
				site_location site_location = (site_location)theEObject;
				T result = casesite_location(site_location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.SITE_SEGMENTS: {
				site_segments site_segments = (site_segments)theEObject;
				T result = casesite_segments(site_segments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.SITE_TRAVEL_MODES: {
				site_travelModes site_travelModes = (site_travelModes)theEObject;
				T result = casesite_travelModes(site_travelModes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.SITE_COUNTERS: {
				site_counters site_counters = (site_counters)theEObject;
				T result = casesite_counters(site_counters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.SITE_DOMAIN: {
				site_domain site_domain = (site_domain)theEObject;
				T result = casesite_domain(site_domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.SITE_TAGS: {
				site_tags site_tags = (site_tags)theEObject;
				T result = casesite_tags(site_tags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.SITE_IMAGES: {
				site_images site_images = (site_images)theEObject;
				T result = casesite_images(site_images);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.TAG_DOMAIN: {
				tag_domain tag_domain = (tag_domain)theEObject;
				T result = casetag_domain(tag_domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.STATISTICAL_TRAFFIC_TRAVEL_MODE: {
				StatisticalTraffic_travelMode statisticalTraffic_travelMode = (StatisticalTraffic_travelMode)theEObject;
				T result = caseStatisticalTraffic_travelMode(statisticalTraffic_travelMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.STATISTICAL_TRAFFIC_DIRECTION: {
				StatisticalTraffic_direction statisticalTraffic_direction = (StatisticalTraffic_direction)theEObject;
				T result = caseStatisticalTraffic_direction(statisticalTraffic_direction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.STATISTICAL_TRAFFIC_DIRECTION_NAME: {
				StatisticalTraffic_directionName statisticalTraffic_directionName = (StatisticalTraffic_directionName)theEObject;
				T result = caseStatisticalTraffic_directionName(statisticalTraffic_directionName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.STATISTICAL_TRAFFIC_VALUE: {
				StatisticalTraffic_value statisticalTraffic_value = (StatisticalTraffic_value)theEObject;
				T result = caseStatisticalTraffic_value(statisticalTraffic_value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.BASE_SERIE_TRAVEL_MODE: {
				BaseSerie_travelMode baseSerie_travelMode = (BaseSerie_travelMode)theEObject;
				T result = caseBaseSerie_travelMode(baseSerie_travelMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.BASE_SERIE_DIRECTION: {
				BaseSerie_direction baseSerie_direction = (BaseSerie_direction)theEObject;
				T result = caseBaseSerie_direction(baseSerie_direction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA: {
				HistoricalRawTraffic_data historicalRawTraffic_data = (HistoricalRawTraffic_data)theEObject;
				T result = caseHistoricalRawTraffic_data(historicalRawTraffic_data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA_TIMESTAMP: {
				HistoricalRawTraffic_data_timestamp historicalRawTraffic_data_timestamp = (HistoricalRawTraffic_data_timestamp)theEObject;
				T result = caseHistoricalRawTraffic_data_timestamp(historicalRawTraffic_data_timestamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA_COUNTS: {
				HistoricalRawTraffic_data_counts historicalRawTraffic_data_counts = (HistoricalRawTraffic_data_counts)theEObject;
				T result = caseHistoricalRawTraffic_data_counts(historicalRawTraffic_data_counts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA_STATUS: {
				HistoricalRawTraffic_data_status historicalRawTraffic_data_status = (HistoricalRawTraffic_data_status)theEObject;
				T result = caseHistoricalRawTraffic_data_status(historicalRawTraffic_data_status);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA: {
				HistoricalAggregatedTraffic_data historicalAggregatedTraffic_data = (HistoricalAggregatedTraffic_data)theEObject;
				T result = caseHistoricalAggregatedTraffic_data(historicalAggregatedTraffic_data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TIMESTAMP: {
				HistoricalAggregatedTraffic_data_timestamp historicalAggregatedTraffic_data_timestamp = (HistoricalAggregatedTraffic_data_timestamp)theEObject;
				T result = caseHistoricalAggregatedTraffic_data_timestamp(historicalAggregatedTraffic_data_timestamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC: {
				HistoricalAggregatedTraffic_data_traffic historicalAggregatedTraffic_data_traffic = (HistoricalAggregatedTraffic_data_traffic)theEObject;
				T result = caseHistoricalAggregatedTraffic_data_traffic(historicalAggregatedTraffic_data_traffic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC_COUNTS: {
				HistoricalAggregatedTraffic_data_traffic_counts historicalAggregatedTraffic_data_traffic_counts = (HistoricalAggregatedTraffic_data_traffic_counts)theEObject;
				T result = caseHistoricalAggregatedTraffic_data_traffic_counts(historicalAggregatedTraffic_data_traffic_counts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER: {
				HistoricalAggregatedTraffic_data_weather historicalAggregatedTraffic_data_weather = (HistoricalAggregatedTraffic_data_weather)theEObject;
				T result = caseHistoricalAggregatedTraffic_data_weather(historicalAggregatedTraffic_data_weather);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DIRECTION_NAME: {
				HistoricalAggregatedTraffic_directionName historicalAggregatedTraffic_directionName = (HistoricalAggregatedTraffic_directionName)theEObject;
				T result = caseHistoricalAggregatedTraffic_directionName(historicalAggregatedTraffic_directionName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC_TIMESTAMP: {
				HistoricalTimestampTraffic_timestamp historicalTimestampTraffic_timestamp = (HistoricalTimestampTraffic_timestamp)theEObject;
				T result = caseHistoricalTimestampTraffic_timestamp(historicalTimestampTraffic_timestamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC_LANE: {
				HistoricalTimestampTraffic_lane historicalTimestampTraffic_lane = (HistoricalTimestampTraffic_lane)theEObject;
				T result = caseHistoricalTimestampTraffic_lane(historicalTimestampTraffic_lane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.VALIDATION_JOB_STATUS: {
				validationJob_status validationJob_status = (validationJob_status)theEObject;
				T result = casevalidationJob_status(validationJob_status);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.VALIDATION_JOB_CREATED_STATUS: {
				validationJobCreated_status validationJobCreated_status = (validationJobCreated_status)theEObject;
				T result = casevalidationJobCreated_status(validationJobCreated_status);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.RESPONSE: {
				Response response = (Response)theEObject;
				T result = caseResponse(response);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.OPEN_API_CLIENT: {
				OpenApiClient openApiClient = (OpenApiClient)theEObject;
				T result = caseOpenApiClient(openApiClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.BIKE_OPEN_API_CLIENT: {
				BikeOpenApiClient bikeOpenApiClient = (BikeOpenApiClient)theEObject;
				T result = caseBikeOpenApiClient(bikeOpenApiClient);
				if (result == null) result = caseOpenApiClient(bikeOpenApiClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.CREATE_EXPORT_REQUEST: {
				CreateExport_request createExport_request = (CreateExport_request)theEObject;
				T result = caseCreateExport_request(createExport_request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_ADT_DATE_RANGE: {
				GetADT_dateRange getADT_dateRange = (GetADT_dateRange)theEObject;
				T result = caseGetADT_dateRange(getADT_dateRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_ADT_GROUP_BY: {
				GetADT_groupBy getADT_groupBy = (GetADT_groupBy)theEObject;
				T result = caseGetADT_groupBy(getADT_groupBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_ADT_TRAVEL_MODES: {
				GetADT_travelModes getADT_travelModes = (GetADT_travelModes)theEObject;
				T result = caseGetADT_travelModes(getADT_travelModes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_ADT_BY_SITE_DATE_RANGE: {
				GetADTBySite_dateRange getADTBySite_dateRange = (GetADTBySite_dateRange)theEObject;
				T result = caseGetADTBySite_dateRange(getADTBySite_dateRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_ADT_BY_SITE_GROUP_BY: {
				GetADTBySite_groupBy getADTBySite_groupBy = (GetADTBySite_groupBy)theEObject;
				T result = caseGetADTBySite_groupBy(getADTBySite_groupBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_ADT_BY_SITE_TRAVEL_MODES: {
				GetADTBySite_travelModes getADTBySite_travelModes = (GetADTBySite_travelModes)theEObject;
				T result = caseGetADTBySite_travelModes(getADTBySite_travelModes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_TOTAL_TRAFFIC_DATE_RANGE: {
				GetTotalTraffic_dateRange getTotalTraffic_dateRange = (GetTotalTraffic_dateRange)theEObject;
				T result = caseGetTotalTraffic_dateRange(getTotalTraffic_dateRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_TOTAL_TRAFFIC_GROUP_BY: {
				GetTotalTraffic_groupBy getTotalTraffic_groupBy = (GetTotalTraffic_groupBy)theEObject;
				T result = caseGetTotalTraffic_groupBy(getTotalTraffic_groupBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_TOTAL_TRAFFIC_TRAVEL_MODES: {
				GetTotalTraffic_travelModes getTotalTraffic_travelModes = (GetTotalTraffic_travelModes)theEObject;
				T result = caseGetTotalTraffic_travelModes(getTotalTraffic_travelModes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_RAW_TRAFFIC_INCLUDE: {
				GetRawTraffic_include getRawTraffic_include = (GetRawTraffic_include)theEObject;
				T result = caseGetRawTraffic_include(getRawTraffic_include);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_RAW_TRAFFIC_TRAVEL_MODES: {
				GetRawTraffic_travelModes getRawTraffic_travelModes = (GetRawTraffic_travelModes)theEObject;
				T result = caseGetRawTraffic_travelModes(getRawTraffic_travelModes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_AGGREGATED_TRAFFIC_INCLUDE: {
				GetAggregatedTraffic_include getAggregatedTraffic_include = (GetAggregatedTraffic_include)theEObject;
				T result = caseGetAggregatedTraffic_include(getAggregatedTraffic_include);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_AGGREGATED_TRAFFIC_GRANULARITY: {
				GetAggregatedTraffic_granularity getAggregatedTraffic_granularity = (GetAggregatedTraffic_granularity)theEObject;
				T result = caseGetAggregatedTraffic_granularity(getAggregatedTraffic_granularity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_AGGREGATED_TRAFFIC_GROUP_BY: {
				GetAggregatedTraffic_groupBy getAggregatedTraffic_groupBy = (GetAggregatedTraffic_groupBy)theEObject;
				T result = caseGetAggregatedTraffic_groupBy(getAggregatedTraffic_groupBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_AGGREGATED_TRAFFIC_TRAVEL_MODES: {
				GetAggregatedTraffic_travelModes getAggregatedTraffic_travelModes = (GetAggregatedTraffic_travelModes)theEObject;
				T result = caseGetAggregatedTraffic_travelModes(getAggregatedTraffic_travelModes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_TIMESTAMP_TRAFFIC_TRAVEL_MODES: {
				GetTimestampTraffic_travelModes getTimestampTraffic_travelModes = (GetTimestampTraffic_travelModes)theEObject;
				T result = caseGetTimestampTraffic_travelModes(getTimestampTraffic_travelModes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GET_TIMESTAMP_TRAFFIC_DIRECTIONS: {
				GetTimestampTraffic_directions getTimestampTraffic_directions = (GetTimestampTraffic_directions)theEObject;
				T result = caseGetTimestampTraffic_directions(getTimestampTraffic_directions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.VALIDATION_JOB_CREATE_REQUEST: {
				ValidationJobCreate_request validationJobCreate_request = (ValidationJobCreate_request)theEObject;
				T result = caseValidationJobCreate_request(validationJobCreate_request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometry(Geometry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line String Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line String Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineStringCoordinates(LineStringCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineString(LineString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Json Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Json Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeoJsonObject(GeoJsonObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>site Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>site Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesiteCounter(siteCounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>site Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>site Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesiteTag(siteTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesite(site object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bad Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bad Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBadRequest(BadRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unauthorized</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unauthorized</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnauthorized(Unauthorized object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forbidden</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forbidden</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForbidden(Forbidden object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Too Many Requests</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Too Many Requests</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTooManyRequests(TooManyRequests object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetag(tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportCreation(ExportCreation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExport(Export object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Found</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Found</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotFound(NotFound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direction Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direction Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectionName(DirectionName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistical Traffic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistical Traffic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatisticalTraffic(StatisticalTraffic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Serie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Serie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseSerie(BaseSerie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime(DateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCount(Count object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStatus(DataStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Raw Traffic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Raw Traffic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalRawTraffic(HistoricalRawTraffic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalAggregatedTraffic(HistoricalAggregatedTraffic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLane(Lane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Timestamp Traffic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Timestamp Traffic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalTimestampTraffic(HistoricalTimestampTraffic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>validation Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>validation Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casevalidationJob(validationJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>validation Job Created</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>validation Job Created</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casevalidationJobCreated(validationJobCreated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConflict(Conflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line String coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line String coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineString_coordinates(LineString_coordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>site location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>site location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesite_location(site_location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>site segments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>site segments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesite_segments(site_segments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>site travel Modes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>site travel Modes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesite_travelModes(site_travelModes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>site counters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>site counters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesite_counters(site_counters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>site domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>site domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesite_domain(site_domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>site tags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>site tags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesite_tags(site_tags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>site images</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>site images</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesite_images(site_images object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tag domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tag domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetag_domain(tag_domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistical Traffic travel Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistical Traffic travel Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatisticalTraffic_travelMode(StatisticalTraffic_travelMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistical Traffic direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistical Traffic direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatisticalTraffic_direction(StatisticalTraffic_direction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistical Traffic direction Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistical Traffic direction Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatisticalTraffic_directionName(StatisticalTraffic_directionName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistical Traffic value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistical Traffic value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatisticalTraffic_value(StatisticalTraffic_value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Serie travel Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Serie travel Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseSerie_travelMode(BaseSerie_travelMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Serie direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Serie direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseSerie_direction(BaseSerie_direction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Raw Traffic data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Raw Traffic data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalRawTraffic_data(HistoricalRawTraffic_data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Raw Traffic data timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Raw Traffic data timestamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalRawTraffic_data_timestamp(HistoricalRawTraffic_data_timestamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Raw Traffic data counts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Raw Traffic data counts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalRawTraffic_data_counts(HistoricalRawTraffic_data_counts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Raw Traffic data status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Raw Traffic data status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalRawTraffic_data_status(HistoricalRawTraffic_data_status object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalAggregatedTraffic_data(HistoricalAggregatedTraffic_data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic data timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic data timestamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalAggregatedTraffic_data_timestamp(HistoricalAggregatedTraffic_data_timestamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic data traffic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic data traffic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalAggregatedTraffic_data_traffic(HistoricalAggregatedTraffic_data_traffic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic data traffic counts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic data traffic counts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalAggregatedTraffic_data_traffic_counts(HistoricalAggregatedTraffic_data_traffic_counts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic data weather</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic data weather</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalAggregatedTraffic_data_weather(HistoricalAggregatedTraffic_data_weather object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic direction Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic direction Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalAggregatedTraffic_directionName(HistoricalAggregatedTraffic_directionName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Timestamp Traffic timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Timestamp Traffic timestamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalTimestampTraffic_timestamp(HistoricalTimestampTraffic_timestamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Timestamp Traffic lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Timestamp Traffic lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalTimestampTraffic_lane(HistoricalTimestampTraffic_lane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>validation Job status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>validation Job status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casevalidationJob_status(validationJob_status object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>validation Job Created status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>validation Job Created status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casevalidationJobCreated_status(validationJobCreated_status object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponse(Response object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Api Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Api Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenApiClient(OpenApiClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Api Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Api Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBikeOpenApiClient(BikeOpenApiClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Export request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Export request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateExport_request(CreateExport_request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get ADT date Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get ADT date Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetADT_dateRange(GetADT_dateRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get ADT group By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get ADT group By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetADT_groupBy(GetADT_groupBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get ADT travel Modes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get ADT travel Modes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetADT_travelModes(GetADT_travelModes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get ADT By Site date Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get ADT By Site date Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetADTBySite_dateRange(GetADTBySite_dateRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get ADT By Site group By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get ADT By Site group By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetADTBySite_groupBy(GetADTBySite_groupBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get ADT By Site travel Modes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get ADT By Site travel Modes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetADTBySite_travelModes(GetADTBySite_travelModes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Total Traffic date Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Total Traffic date Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTotalTraffic_dateRange(GetTotalTraffic_dateRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Total Traffic group By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Total Traffic group By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTotalTraffic_groupBy(GetTotalTraffic_groupBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Total Traffic travel Modes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Total Traffic travel Modes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTotalTraffic_travelModes(GetTotalTraffic_travelModes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Raw Traffic include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Raw Traffic include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetRawTraffic_include(GetRawTraffic_include object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Raw Traffic travel Modes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Raw Traffic travel Modes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetRawTraffic_travelModes(GetRawTraffic_travelModes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Aggregated Traffic include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Aggregated Traffic include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAggregatedTraffic_include(GetAggregatedTraffic_include object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Aggregated Traffic granularity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Aggregated Traffic granularity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAggregatedTraffic_granularity(GetAggregatedTraffic_granularity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Aggregated Traffic group By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Aggregated Traffic group By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAggregatedTraffic_groupBy(GetAggregatedTraffic_groupBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Aggregated Traffic travel Modes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Aggregated Traffic travel Modes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAggregatedTraffic_travelModes(GetAggregatedTraffic_travelModes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Timestamp Traffic travel Modes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Timestamp Traffic travel Modes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTimestampTraffic_travelModes(GetTimestampTraffic_travelModes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Timestamp Traffic directions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Timestamp Traffic directions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTimestampTraffic_directions(GetTimestampTraffic_directions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validation Job Create request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validation Job Create request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidationJobCreate_request(ValidationJobCreate_request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BikeSwitch
