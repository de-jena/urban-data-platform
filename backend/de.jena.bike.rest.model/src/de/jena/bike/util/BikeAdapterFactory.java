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
			public Adapter caseTravelModeLabel(TravelModeLabel object) {
				return createTravelModeLabelAdapter();
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
			public Adapter caseDateRange(DateRange object) {
				return createDateRangeAdapter();
			}
			@Override
			public Adapter caseStatisticalAverageGroupBy(StatisticalAverageGroupBy object) {
				return createStatisticalAverageGroupByAdapter();
			}
			@Override
			public Adapter caseDirection(Direction object) {
				return createDirectionAdapter();
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
			public Adapter caseStatisticalTotalGroupBy(StatisticalTotalGroupBy object) {
				return createStatisticalTotalGroupByAdapter();
			}
			@Override
			public Adapter caseHistoricalRawTrafficInclude(HistoricalRawTrafficInclude object) {
				return createHistoricalRawTrafficIncludeAdapter();
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
			public Adapter caseHistoricalAggregatedTrafficInclude(HistoricalAggregatedTrafficInclude object) {
				return createHistoricalAggregatedTrafficIncludeAdapter();
			}
			@Override
			public Adapter caseGranularity(Granularity object) {
				return createGranularityAdapter();
			}
			@Override
			public Adapter caseHistoricalAggregatedTrafficGroupBy(HistoricalAggregatedTrafficGroupBy object) {
				return createHistoricalAggregatedTrafficGroupByAdapter();
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
			public Adapter casevalidationJobStatus(validationJobStatus object) {
				return createvalidationJobStatusAdapter();
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
			public Adapter caseHistoricalRawTraffic_data(HistoricalRawTraffic_data object) {
				return createHistoricalRawTraffic_dataAdapter();
			}
			@Override
			public Adapter caseHistoricalAggregatedTraffic_data(HistoricalAggregatedTraffic_data object) {
				return createHistoricalAggregatedTraffic_dataAdapter();
			}
			@Override
			public Adapter caseHistoricalAggregatedTraffic_data_traffic(HistoricalAggregatedTraffic_data_traffic object) {
				return createHistoricalAggregatedTraffic_data_trafficAdapter();
			}
			@Override
			public Adapter caseHistoricalAggregatedTraffic_data_weather(HistoricalAggregatedTraffic_data_weather object) {
				return createHistoricalAggregatedTraffic_data_weatherAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.jena.bike.TravelModeLabel <em>Travel Mode Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.TravelModeLabel
	 * @generated
	 */
	public Adapter createTravelModeLabelAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.jena.bike.DateRange <em>Date Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.DateRange
	 * @generated
	 */
	public Adapter createDateRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.StatisticalAverageGroupBy <em>Statistical Average Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.StatisticalAverageGroupBy
	 * @generated
	 */
	public Adapter createStatisticalAverageGroupByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.Direction
	 * @generated
	 */
	public Adapter createDirectionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.jena.bike.StatisticalTotalGroupBy <em>Statistical Total Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.StatisticalTotalGroupBy
	 * @generated
	 */
	public Adapter createStatisticalTotalGroupByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalRawTrafficInclude <em>Historical Raw Traffic Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalRawTrafficInclude
	 * @generated
	 */
	public Adapter createHistoricalRawTrafficIncludeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalAggregatedTrafficInclude <em>Historical Aggregated Traffic Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalAggregatedTrafficInclude
	 * @generated
	 */
	public Adapter createHistoricalAggregatedTrafficIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.Granularity <em>Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.Granularity
	 * @generated
	 */
	public Adapter createGranularityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.bike.HistoricalAggregatedTrafficGroupBy <em>Historical Aggregated Traffic Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.HistoricalAggregatedTrafficGroupBy
	 * @generated
	 */
	public Adapter createHistoricalAggregatedTrafficGroupByAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.jena.bike.validationJobStatus <em>validation Job Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.bike.validationJobStatus
	 * @generated
	 */
	public Adapter createvalidationJobStatusAdapter() {
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
