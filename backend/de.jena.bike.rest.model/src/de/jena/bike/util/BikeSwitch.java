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
				if (result == null) result = caseGeometry(lineString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GEO_JSON_OBJECT: {
				GeoJsonObject geoJsonObject = (GeoJsonObject)theEObject;
				T result = caseGeoJsonObject(geoJsonObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.TRAVEL_MODE_LABEL: {
				TravelModeLabel travelModeLabel = (TravelModeLabel)theEObject;
				T result = caseTravelModeLabel(travelModeLabel);
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
			case BikePackage.DATE_RANGE: {
				DateRange dateRange = (DateRange)theEObject;
				T result = caseDateRange(dateRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.STATISTICAL_AVERAGE_GROUP_BY: {
				StatisticalAverageGroupBy statisticalAverageGroupBy = (StatisticalAverageGroupBy)theEObject;
				T result = caseStatisticalAverageGroupBy(statisticalAverageGroupBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.DIRECTION: {
				Direction direction = (Direction)theEObject;
				T result = caseDirection(direction);
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
			case BikePackage.STATISTICAL_TOTAL_GROUP_BY: {
				StatisticalTotalGroupBy statisticalTotalGroupBy = (StatisticalTotalGroupBy)theEObject;
				T result = caseStatisticalTotalGroupBy(statisticalTotalGroupBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_RAW_TRAFFIC_INCLUDE: {
				HistoricalRawTrafficInclude historicalRawTrafficInclude = (HistoricalRawTrafficInclude)theEObject;
				T result = caseHistoricalRawTrafficInclude(historicalRawTrafficInclude);
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
				if (result == null) result = caseBaseSerie(historicalRawTraffic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_INCLUDE: {
				HistoricalAggregatedTrafficInclude historicalAggregatedTrafficInclude = (HistoricalAggregatedTrafficInclude)theEObject;
				T result = caseHistoricalAggregatedTrafficInclude(historicalAggregatedTrafficInclude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.GRANULARITY: {
				Granularity granularity = (Granularity)theEObject;
				T result = caseGranularity(granularity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_GROUP_BY: {
				HistoricalAggregatedTrafficGroupBy historicalAggregatedTrafficGroupBy = (HistoricalAggregatedTrafficGroupBy)theEObject;
				T result = caseHistoricalAggregatedTrafficGroupBy(historicalAggregatedTrafficGroupBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC: {
				HistoricalAggregatedTraffic historicalAggregatedTraffic = (HistoricalAggregatedTraffic)theEObject;
				T result = caseHistoricalAggregatedTraffic(historicalAggregatedTraffic);
				if (result == null) result = caseBaseSerie(historicalAggregatedTraffic);
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
				if (result == null) result = caseBaseSerie(historicalTimestampTraffic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.VALIDATION_JOB_STATUS: {
				validationJobStatus validationJobStatus = (validationJobStatus)theEObject;
				T result = casevalidationJobStatus(validationJobStatus);
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
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA: {
				HistoricalRawTraffic_data historicalRawTraffic_data = (HistoricalRawTraffic_data)theEObject;
				T result = caseHistoricalRawTraffic_data(historicalRawTraffic_data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA: {
				HistoricalAggregatedTraffic_data historicalAggregatedTraffic_data = (HistoricalAggregatedTraffic_data)theEObject;
				T result = caseHistoricalAggregatedTraffic_data(historicalAggregatedTraffic_data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC: {
				HistoricalAggregatedTraffic_data_traffic historicalAggregatedTraffic_data_traffic = (HistoricalAggregatedTraffic_data_traffic)theEObject;
				T result = caseHistoricalAggregatedTraffic_data_traffic(historicalAggregatedTraffic_data_traffic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER: {
				HistoricalAggregatedTraffic_data_weather historicalAggregatedTraffic_data_weather = (HistoricalAggregatedTraffic_data_weather)theEObject;
				T result = caseHistoricalAggregatedTraffic_data_weather(historicalAggregatedTraffic_data_weather);
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
	 * Returns the result of interpreting the object as an instance of '<em>Travel Mode Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Travel Mode Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTravelModeLabel(TravelModeLabel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Date Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateRange(DateRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistical Average Group By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistical Average Group By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatisticalAverageGroupBy(StatisticalAverageGroupBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirection(Direction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Statistical Total Group By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistical Total Group By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatisticalTotalGroupBy(StatisticalTotalGroupBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Raw Traffic Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Raw Traffic Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalRawTrafficInclude(HistoricalRawTrafficInclude object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalAggregatedTrafficInclude(HistoricalAggregatedTrafficInclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Granularity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Granularity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGranularity(Granularity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic Group By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical Aggregated Traffic Group By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoricalAggregatedTrafficGroupBy(HistoricalAggregatedTrafficGroupBy object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>validation Job Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>validation Job Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casevalidationJobStatus(validationJobStatus object) {
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
