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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.bike.BikePackage
 * @generated
 */
public class BikeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BikePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BikeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BikePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BikeSwitch<Adapter> modelSwitch =
		new BikeSwitch<Adapter>() {
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseGeometry(Geometry object) {
				return createGeometryAdapter();
			}
			@Override
			public Adapter casePosition(Position object) {
				return createPositionAdapter();
			}
			@Override
			public Adapter caseLineStringCoordinates(LineStringCoordinates object) {
				return createLineStringCoordinatesAdapter();
			}
			@Override
			public Adapter caseLineString(LineString object) {
				return createLineStringAdapter();
			}
			@Override
			public Adapter caseGeoJsonObject(GeoJsonObject object) {
				return createGeoJsonObjectAdapter();
			}
			@Override
			public Adapter casesiteCounter(siteCounter object) {
				return createsiteCounterAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter casesiteTag(siteTag object) {
				return createsiteTagAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter casesite(site object) {
				return createsiteAdapter();
			}
			@Override
			public Adapter caseBadRequest(BadRequest object) {
				return createBadRequestAdapter();
			}
			@Override
			public Adapter caseUnauthorized(Unauthorized object) {
				return createUnauthorizedAdapter();
			}
			@Override
			public Adapter caseForbidden(Forbidden object) {
				return createForbiddenAdapter();
			}
			@Override
			public Adapter caseTooManyRequests(TooManyRequests object) {
				return createTooManyRequestsAdapter();
			}
			@Override
			public Adapter casetag(tag object) {
				return createtagAdapter();
			}
			@Override
			public Adapter caseExportCreation(ExportCreation object) {
				return createExportCreationAdapter();
			}
			@Override
			public Adapter caseExport(Export object) {
				return createExportAdapter();
			}
			@Override
			public Adapter caseNotFound(NotFound object) {
				return createNotFoundAdapter();
			}
			@Override
			public Adapter caseDirectionName(DirectionName object) {
				return createDirectionNameAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseStatisticalTraffic(StatisticalTraffic object) {
				return createStatisticalTrafficAdapter();
			}
			@Override
			public Adapter caseBaseSerie(BaseSerie object) {
				return createBaseSerieAdapter();
			}
			@Override
			public Adapter caseDateTime(DateTime object) {
				return createDateTimeAdapter();
			}
			@Override
			public Adapter caseCount(Count object) {
				return createCountAdapter();
			}
			@Override
			public Adapter caseDataStatus(DataStatus object) {
				return createDataStatusAdapter();
			}
			@Override
			public Adapter caseHistoricalRawTraffic(HistoricalRawTraffic object) {
				return createHistoricalRawTrafficAdapter();
			}
			@Override
			public Adapter caseHistoricalAggregatedTraffic(HistoricalAggregatedTraffic object) {
				return createHistoricalAggregatedTrafficAdapter();
			}
			@Override
			public Adapter caseLane(Lane object) {
				return createLaneAdapter();
			}
			@Override
			public Adapter caseHistoricalTimestampTraffic(HistoricalTimestampTraffic object) {
				return createHistoricalTimestampTrafficAdapter();
			}
			@Override
			public Adapter casevalidationJob(validationJob object) {
				return createvalidationJobAdapter();
			}
			@Override
			public Adapter casevalidationJobCreated(validationJobCreated object) {
				return createvalidationJobCreatedAdapter();
			}
			@Override
			public Adapter caseConflict(Conflict object) {
				return createConflictAdapter();
			}
			@Override
			public Adapter caseLineString_coordinates(LineString_coordinates object) {
				return createLineString_coordinatesAdapter();
			}
			@Override
			public Adapter casesite_location(site_location object) {
				return createsite_locationAdapter();
			}
			@Override
			public Adapter casesite_segments(site_segments object) {
				return createsite_segmentsAdapter();
			}
			@Override
			public Adapter casesite_travelModes(site_travelModes object) {
				return createsite_travelModesAdapter();
			}
			@Override
			public Adapter casesite_counters(site_counters object) {
				return createsite_countersAdapter();
			}
			@Override
			public Adapter casesite_domain(site_domain object) {
				return createsite_domainAdapter();
			}
			@Override
			public Adapter casesite_tags(site_tags object) {
				return createsite_tagsAdapter();
			}
			@Override
			public Adapter casesite_images(site_images object) {
				return createsite_imagesAdapter();
			}
			@Override
			public Adapter casetag_domain(tag_domain object) {
				return createtag_domainAdapter();
			}
			@Override
			public Adapter caseStatisticalTraffic_travelMode(StatisticalTraffic_travelMode object) {
				return createStatisticalTraffic_travelModeAdapter();
			}
			@Override
			public Adapter caseStatisticalTraffic_direction(StatisticalTraffic_direction object) {
				return createStatisticalTraffic_directionAdapter();
			}
			@Override
			public Adapter caseStatisticalTraffic_directionName(StatisticalTraffic_directionName object) {
				return createStatisticalTraffic_directionNameAdapter();
			}
			@Override
			public Adapter caseStatisticalTraffic_value(StatisticalTraffic_value object) {
				return createStatisticalTraffic_valueAdapter();
			}
			@Override
			public Adapter caseBaseSerie_travelMode(BaseSerie_travelMode object) {
				return createBaseSerie_travelModeAdapter();
			}
			@Override
			public Adapter caseBaseSerie_direction(BaseSerie_direction object) {
				return createBaseSerie_directionAdapter();
			}
			@Override
			public Adapter caseHistoricalRawTraffic_data(HistoricalRawTraffic_data object) {
				return createHistoricalRawTraffic_dataAdapter();
			}
			@Override
			public Adapter caseHistoricalRawTraffic_data_timestamp(HistoricalRawTraffic_data_timestamp object) {
				return createHistoricalRawTraffic_data_timestampAdapter();
			}
			@Override
			public Adapter caseHistoricalRawTraffic_data_counts(HistoricalRawTraffic_data_counts object) {
				return createHistoricalRawTraffic_data_countsAdapter();
			}
			@Override
			public Adapter caseHistoricalRawTraffic_data_status(HistoricalRawTraffic_data_status object) {
				return createHistoricalRawTraffic_data_statusAdapter();
			}
			@Override
			public Adapter caseHistoricalAggregatedTraffic_data(HistoricalAggregatedTraffic_data object) {
				return createHistoricalAggregatedTraffic_dataAdapter();
			}
			@Override
			public Adapter caseHistoricalAggregatedTraffic_data_timestamp(HistoricalAggregatedTraffic_data_timestamp object) {
				return createHistoricalAggregatedTraffic_data_timestampAdapter();
			}
			@Override
			public Adapter caseHistoricalAggregatedTraffic_data_traffic(HistoricalAggregatedTraffic_data_traffic object) {
				return createHistoricalAggregatedTraffic_data_trafficAdapter();
			}
			@Override
			public Adapter caseHistoricalAggregatedTraffic_data_traffic_counts(HistoricalAggregatedTraffic_data_traffic_counts object) {
				return createHistoricalAggregatedTraffic_data_traffic_countsAdapter();
			}
			@Override
			public Adapter caseHistoricalAggregatedTraffic_data_weather(HistoricalAggregatedTraffic_data_weather object) {
				return createHistoricalAggregatedTraffic_data_weatherAdapter();
			}
			@Override
			public Adapter caseHistoricalAggregatedTraffic_directionName(HistoricalAggregatedTraffic_directionName object) {
				return createHistoricalAggregatedTraffic_directionNameAdapter();
			}
			@Override
			public Adapter caseHistoricalTimestampTraffic_timestamp(HistoricalTimestampTraffic_timestamp object) {
				return createHistoricalTimestampTraffic_timestampAdapter();
			}
			@Override
			public Adapter caseHistoricalTimestampTraffic_lane(HistoricalTimestampTraffic_lane object) {
				return createHistoricalTimestampTraffic_laneAdapter();
			}
			@Override
			public Adapter casevalidationJob_status(validationJob_status object) {
				return createvalidationJob_statusAdapter();
			}
			@Override
			public Adapter casevalidationJobCreated_status(validationJobCreated_status object) {
				return createvalidationJobCreated_statusAdapter();
			}
			@Override
			public Adapter caseResponse(Response object) {
				return createResponseAdapter();
			}
			@Override
			public Adapter caseOpenApiClient(OpenApiClient object) {
				return createOpenApiClientAdapter();
			}
			@Override
			public Adapter caseBikeOpenApiClient(BikeOpenApiClient object) {
				return createBikeOpenApiClientAdapter();
			}
			@Override
			public Adapter caseCreateExport_request(CreateExport_request object) {
				return createCreateExport_requestAdapter();
			}
			@Override
			public Adapter caseGetADT_dateRange(GetADT_dateRange object) {
				return createGetADT_dateRangeAdapter();
			}
			@Override
			public Adapter caseGetADT_groupBy(GetADT_groupBy object) {
				return createGetADT_groupByAdapter();
			}
			@Override
			public Adapter caseGetADT_travelModes(GetADT_travelModes object) {
				return createGetADT_travelModesAdapter();
			}
			@Override
			public Adapter caseGetADTBySite_dateRange(GetADTBySite_dateRange object) {
				return createGetADTBySite_dateRangeAdapter();
			}
			@Override
			public Adapter caseGetADTBySite_groupBy(GetADTBySite_groupBy object) {
				return createGetADTBySite_groupByAdapter();
			}
			@Override
			public Adapter caseGetADTBySite_travelModes(GetADTBySite_travelModes object) {
				return createGetADTBySite_travelModesAdapter();
			}
			@Override
			public Adapter caseGetTotalTraffic_dateRange(GetTotalTraffic_dateRange object) {
				return createGetTotalTraffic_dateRangeAdapter();
			}
			@Override
			public Adapter caseGetTotalTraffic_groupBy(GetTotalTraffic_groupBy object) {
				return createGetTotalTraffic_groupByAdapter();
			}
			@Override
			public Adapter caseGetTotalTraffic_travelModes(GetTotalTraffic_travelModes object) {
				return createGetTotalTraffic_travelModesAdapter();
			}
			@Override
			public Adapter caseGetRawTraffic_include(GetRawTraffic_include object) {
				return createGetRawTraffic_includeAdapter();
			}
			@Override
			public Adapter caseGetRawTraffic_travelModes(GetRawTraffic_travelModes object) {
				return createGetRawTraffic_travelModesAdapter();
			}
			@Override
			public Adapter caseGetAggregatedTraffic_include(GetAggregatedTraffic_include object) {
				return createGetAggregatedTraffic_includeAdapter();
			}
			@Override
			public Adapter caseGetAggregatedTraffic_granularity(GetAggregatedTraffic_granularity object) {
				return createGetAggregatedTraffic_granularityAdapter();
			}
			@Override
			public Adapter caseGetAggregatedTraffic_groupBy(GetAggregatedTraffic_groupBy object) {
				return createGetAggregatedTraffic_groupByAdapter();
			}
			@Override
			public Adapter caseGetAggregatedTraffic_travelModes(GetAggregatedTraffic_travelModes object) {
				return createGetAggregatedTraffic_travelModesAdapter();
			}
			@Override
			public Adapter caseGetTimestampTraffic_travelModes(GetTimestampTraffic_travelModes object) {
				return createGetTimestampTraffic_travelModesAdapter();
			}
			@Override
			public Adapter caseGetTimestampTraffic_directions(GetTimestampTraffic_directions object) {
				return createGetTimestampTraffic_directionsAdapter();
			}
			@Override
			public Adapter caseValidationJobCreate_request(ValidationJobCreate_request object) {
				return createValidationJobCreate_requestAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.Geometry
	 * @generated
	 */
	public Adapter createGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.LineStringCoordinates <em>Line String Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.LineStringCoordinates
	 * @generated
	 */
	public Adapter createLineStringCoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.LineString <em>Line String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.LineString
	 * @generated
	 */
	public Adapter createLineStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GeoJsonObject <em>Geo Json Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GeoJsonObject
	 * @generated
	 */
	public Adapter createGeoJsonObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.siteCounter <em>site Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.siteCounter
	 * @generated
	 */
	public Adapter createsiteCounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.siteTag <em>site Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.siteTag
	 * @generated
	 */
	public Adapter createsiteTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.site <em>site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.site
	 * @generated
	 */
	public Adapter createsiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.BadRequest <em>Bad Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.BadRequest
	 * @generated
	 */
	public Adapter createBadRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.Unauthorized <em>Unauthorized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.Unauthorized
	 * @generated
	 */
	public Adapter createUnauthorizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.Forbidden <em>Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.Forbidden
	 * @generated
	 */
	public Adapter createForbiddenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.TooManyRequests <em>Too Many Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.TooManyRequests
	 * @generated
	 */
	public Adapter createTooManyRequestsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.tag <em>tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.tag
	 * @generated
	 */
	public Adapter createtagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.ExportCreation <em>Export Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.ExportCreation
	 * @generated
	 */
	public Adapter createExportCreationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.Export
	 * @generated
	 */
	public Adapter createExportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.NotFound <em>Not Found</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.NotFound
	 * @generated
	 */
	public Adapter createNotFoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.DirectionName <em>Direction Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.DirectionName
	 * @generated
	 */
	public Adapter createDirectionNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.StatisticalTraffic <em>Statistical Traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.StatisticalTraffic
	 * @generated
	 */
	public Adapter createStatisticalTrafficAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.BaseSerie <em>Base Serie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.BaseSerie
	 * @generated
	 */
	public Adapter createBaseSerieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.DateTime
	 * @generated
	 */
	public Adapter createDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.Count
	 * @generated
	 */
	public Adapter createCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.DataStatus <em>Data Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.DataStatus
	 * @generated
	 */
	public Adapter createDataStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalRawTraffic <em>Historical Raw Traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalRawTraffic
	 * @generated
	 */
	public Adapter createHistoricalRawTrafficAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalAggregatedTraffic <em>Historical Aggregated Traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalAggregatedTraffic
	 * @generated
	 */
	public Adapter createHistoricalAggregatedTrafficAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.Lane
	 * @generated
	 */
	public Adapter createLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalTimestampTraffic <em>Historical Timestamp Traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalTimestampTraffic
	 * @generated
	 */
	public Adapter createHistoricalTimestampTrafficAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.validationJob <em>validation Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.validationJob
	 * @generated
	 */
	public Adapter createvalidationJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.validationJobCreated <em>validation Job Created</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.validationJobCreated
	 * @generated
	 */
	public Adapter createvalidationJobCreatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.Conflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.Conflict
	 * @generated
	 */
	public Adapter createConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.LineString_coordinates <em>Line String coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.LineString_coordinates
	 * @generated
	 */
	public Adapter createLineString_coordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.site_location <em>site location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.site_location
	 * @generated
	 */
	public Adapter createsite_locationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.site_segments <em>site segments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.site_segments
	 * @generated
	 */
	public Adapter createsite_segmentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.site_travelModes <em>site travel Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.site_travelModes
	 * @generated
	 */
	public Adapter createsite_travelModesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.site_counters <em>site counters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.site_counters
	 * @generated
	 */
	public Adapter createsite_countersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.site_domain <em>site domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.site_domain
	 * @generated
	 */
	public Adapter createsite_domainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.site_tags <em>site tags</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.site_tags
	 * @generated
	 */
	public Adapter createsite_tagsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.site_images <em>site images</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.site_images
	 * @generated
	 */
	public Adapter createsite_imagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.tag_domain <em>tag domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.tag_domain
	 * @generated
	 */
	public Adapter createtag_domainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.StatisticalTraffic_travelMode <em>Statistical Traffic travel Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.StatisticalTraffic_travelMode
	 * @generated
	 */
	public Adapter createStatisticalTraffic_travelModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.StatisticalTraffic_direction <em>Statistical Traffic direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.StatisticalTraffic_direction
	 * @generated
	 */
	public Adapter createStatisticalTraffic_directionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.StatisticalTraffic_directionName <em>Statistical Traffic direction Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.StatisticalTraffic_directionName
	 * @generated
	 */
	public Adapter createStatisticalTraffic_directionNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.StatisticalTraffic_value <em>Statistical Traffic value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.StatisticalTraffic_value
	 * @generated
	 */
	public Adapter createStatisticalTraffic_valueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.BaseSerie_travelMode <em>Base Serie travel Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.BaseSerie_travelMode
	 * @generated
	 */
	public Adapter createBaseSerie_travelModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.BaseSerie_direction <em>Base Serie direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.BaseSerie_direction
	 * @generated
	 */
	public Adapter createBaseSerie_directionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalRawTraffic_data <em>Historical Raw Traffic data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalRawTraffic_data
	 * @generated
	 */
	public Adapter createHistoricalRawTraffic_dataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalRawTraffic_data_timestamp <em>Historical Raw Traffic data timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalRawTraffic_data_timestamp
	 * @generated
	 */
	public Adapter createHistoricalRawTraffic_data_timestampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalRawTraffic_data_counts <em>Historical Raw Traffic data counts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalRawTraffic_data_counts
	 * @generated
	 */
	public Adapter createHistoricalRawTraffic_data_countsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalRawTraffic_data_status <em>Historical Raw Traffic data status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalRawTraffic_data_status
	 * @generated
	 */
	public Adapter createHistoricalRawTraffic_data_statusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalAggregatedTraffic_data <em>Historical Aggregated Traffic data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data
	 * @generated
	 */
	public Adapter createHistoricalAggregatedTraffic_dataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalAggregatedTraffic_data_timestamp <em>Historical Aggregated Traffic data timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data_timestamp
	 * @generated
	 */
	public Adapter createHistoricalAggregatedTraffic_data_timestampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalAggregatedTraffic_data_traffic <em>Historical Aggregated Traffic data traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data_traffic
	 * @generated
	 */
	public Adapter createHistoricalAggregatedTraffic_data_trafficAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalAggregatedTraffic_data_traffic_counts <em>Historical Aggregated Traffic data traffic counts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data_traffic_counts
	 * @generated
	 */
	public Adapter createHistoricalAggregatedTraffic_data_traffic_countsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalAggregatedTraffic_data_weather <em>Historical Aggregated Traffic data weather</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_data_weather
	 * @generated
	 */
	public Adapter createHistoricalAggregatedTraffic_data_weatherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalAggregatedTraffic_directionName <em>Historical Aggregated Traffic direction Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalAggregatedTraffic_directionName
	 * @generated
	 */
	public Adapter createHistoricalAggregatedTraffic_directionNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalTimestampTraffic_timestamp <em>Historical Timestamp Traffic timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalTimestampTraffic_timestamp
	 * @generated
	 */
	public Adapter createHistoricalTimestampTraffic_timestampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalTimestampTraffic_lane <em>Historical Timestamp Traffic lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalTimestampTraffic_lane
	 * @generated
	 */
	public Adapter createHistoricalTimestampTraffic_laneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.validationJob_status <em>validation Job status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.validationJob_status
	 * @generated
	 */
	public Adapter createvalidationJob_statusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.validationJobCreated_status <em>validation Job Created status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.validationJobCreated_status
	 * @generated
	 */
	public Adapter createvalidationJobCreated_statusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.Response
	 * @generated
	 */
	public Adapter createResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.OpenApiClient <em>Open Api Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.OpenApiClient
	 * @generated
	 */
	public Adapter createOpenApiClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.BikeOpenApiClient <em>Open Api Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.BikeOpenApiClient
	 * @generated
	 */
	public Adapter createBikeOpenApiClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.CreateExport_request <em>Create Export request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.CreateExport_request
	 * @generated
	 */
	public Adapter createCreateExport_requestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetADT_dateRange <em>Get ADT date Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetADT_dateRange
	 * @generated
	 */
	public Adapter createGetADT_dateRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetADT_groupBy <em>Get ADT group By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetADT_groupBy
	 * @generated
	 */
	public Adapter createGetADT_groupByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetADT_travelModes <em>Get ADT travel Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetADT_travelModes
	 * @generated
	 */
	public Adapter createGetADT_travelModesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetADTBySite_dateRange <em>Get ADT By Site date Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetADTBySite_dateRange
	 * @generated
	 */
	public Adapter createGetADTBySite_dateRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetADTBySite_groupBy <em>Get ADT By Site group By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetADTBySite_groupBy
	 * @generated
	 */
	public Adapter createGetADTBySite_groupByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetADTBySite_travelModes <em>Get ADT By Site travel Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetADTBySite_travelModes
	 * @generated
	 */
	public Adapter createGetADTBySite_travelModesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetTotalTraffic_dateRange <em>Get Total Traffic date Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetTotalTraffic_dateRange
	 * @generated
	 */
	public Adapter createGetTotalTraffic_dateRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetTotalTraffic_groupBy <em>Get Total Traffic group By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetTotalTraffic_groupBy
	 * @generated
	 */
	public Adapter createGetTotalTraffic_groupByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetTotalTraffic_travelModes <em>Get Total Traffic travel Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetTotalTraffic_travelModes
	 * @generated
	 */
	public Adapter createGetTotalTraffic_travelModesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetRawTraffic_include <em>Get Raw Traffic include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetRawTraffic_include
	 * @generated
	 */
	public Adapter createGetRawTraffic_includeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetRawTraffic_travelModes <em>Get Raw Traffic travel Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetRawTraffic_travelModes
	 * @generated
	 */
	public Adapter createGetRawTraffic_travelModesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetAggregatedTraffic_include <em>Get Aggregated Traffic include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetAggregatedTraffic_include
	 * @generated
	 */
	public Adapter createGetAggregatedTraffic_includeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetAggregatedTraffic_granularity <em>Get Aggregated Traffic granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetAggregatedTraffic_granularity
	 * @generated
	 */
	public Adapter createGetAggregatedTraffic_granularityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetAggregatedTraffic_groupBy <em>Get Aggregated Traffic group By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetAggregatedTraffic_groupBy
	 * @generated
	 */
	public Adapter createGetAggregatedTraffic_groupByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetAggregatedTraffic_travelModes <em>Get Aggregated Traffic travel Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetAggregatedTraffic_travelModes
	 * @generated
	 */
	public Adapter createGetAggregatedTraffic_travelModesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetTimestampTraffic_travelModes <em>Get Timestamp Traffic travel Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetTimestampTraffic_travelModes
	 * @generated
	 */
	public Adapter createGetTimestampTraffic_travelModesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.GetTimestampTraffic_directions <em>Get Timestamp Traffic directions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.GetTimestampTraffic_directions
	 * @generated
	 */
	public Adapter createGetTimestampTraffic_directionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.ValidationJobCreate_request <em>Validation Job Create request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.ValidationJobCreate_request
	 * @generated
	 */
	public Adapter createValidationJobCreate_requestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BikeAdapterFactory
