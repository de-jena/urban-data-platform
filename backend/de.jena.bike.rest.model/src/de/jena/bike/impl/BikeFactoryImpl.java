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

import de.jena.bike.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BikeFactoryImpl extends EFactoryImpl implements BikeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BikeFactory init() {
		try {
			BikeFactory theBikeFactory = (BikeFactory)EPackage.Registry.INSTANCE.getEFactory(BikePackage.eNS_URI);
			if (theBikeFactory != null) {
				return theBikeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BikeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BikeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BikePackage.LOCATION: return createLocation();
			case BikePackage.GEOMETRY: return createGeometry();
			case BikePackage.POSITION: return createPosition();
			case BikePackage.LINE_STRING_COORDINATES: return createLineStringCoordinates();
			case BikePackage.LINE_STRING: return createLineString();
			case BikePackage.GEO_JSON_OBJECT: return createGeoJsonObject();
			case BikePackage.TRAVEL_MODE_LABEL: return createTravelModeLabel();
			case BikePackage.SITE_COUNTER: return createsiteCounter();
			case BikePackage.DOMAIN: return createDomain();
			case BikePackage.SITE_TAG: return createsiteTag();
			case BikePackage.IMAGE: return createImage();
			case BikePackage.SITE: return createsite();
			case BikePackage.BAD_REQUEST: return createBadRequest();
			case BikePackage.UNAUTHORIZED: return createUnauthorized();
			case BikePackage.FORBIDDEN: return createForbidden();
			case BikePackage.TOO_MANY_REQUESTS: return createTooManyRequests();
			case BikePackage.TAG: return createtag();
			case BikePackage.EXPORT_CREATION: return createExportCreation();
			case BikePackage.EXPORT: return createExport();
			case BikePackage.NOT_FOUND: return createNotFound();
			case BikePackage.DATE_RANGE: return createDateRange();
			case BikePackage.STATISTICAL_AVERAGE_GROUP_BY: return createStatisticalAverageGroupBy();
			case BikePackage.DIRECTION: return createDirection();
			case BikePackage.DIRECTION_NAME: return createDirectionName();
			case BikePackage.VALUE: return createValue();
			case BikePackage.STATISTICAL_TRAFFIC: return createStatisticalTraffic();
			case BikePackage.STATISTICAL_TOTAL_GROUP_BY: return createStatisticalTotalGroupBy();
			case BikePackage.HISTORICAL_RAW_TRAFFIC_INCLUDE: return createHistoricalRawTrafficInclude();
			case BikePackage.BASE_SERIE: return createBaseSerie();
			case BikePackage.DATE_TIME: return createDateTime();
			case BikePackage.COUNT: return createCount();
			case BikePackage.DATA_STATUS: return createDataStatus();
			case BikePackage.HISTORICAL_RAW_TRAFFIC: return createHistoricalRawTraffic();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_INCLUDE: return createHistoricalAggregatedTrafficInclude();
			case BikePackage.GRANULARITY: return createGranularity();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_GROUP_BY: return createHistoricalAggregatedTrafficGroupBy();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC: return createHistoricalAggregatedTraffic();
			case BikePackage.LANE: return createLane();
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC: return createHistoricalTimestampTraffic();
			case BikePackage.VALIDATION_JOB_STATUS: return createvalidationJobStatus();
			case BikePackage.VALIDATION_JOB: return createvalidationJob();
			case BikePackage.VALIDATION_JOB_CREATED: return createvalidationJobCreated();
			case BikePackage.CONFLICT: return createConflict();
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA: return createHistoricalRawTraffic_data();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA: return createHistoricalAggregatedTraffic_data();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC: return createHistoricalAggregatedTraffic_data_traffic();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER: return createHistoricalAggregatedTraffic_data_weather();
			case BikePackage.RESPONSE: return createResponse();
			case BikePackage.VALIDATION_JOB_CREATE_REQUEST: return createValidationJobCreate_request();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BikePackage.JRESPONSE:
				return createJResponseFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BikePackage.JRESPONSE:
				return convertJResponseToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geometry createGeometry() {
		GeometryImpl geometry = new GeometryImpl();
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStringCoordinates createLineStringCoordinates() {
		LineStringCoordinatesImpl lineStringCoordinates = new LineStringCoordinatesImpl();
		return lineStringCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineString createLineString() {
		LineStringImpl lineString = new LineStringImpl();
		return lineString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoJsonObject createGeoJsonObject() {
		GeoJsonObjectImpl geoJsonObject = new GeoJsonObjectImpl();
		return geoJsonObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TravelModeLabel createTravelModeLabel() {
		TravelModeLabelImpl travelModeLabel = new TravelModeLabelImpl();
		return travelModeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public siteCounter createsiteCounter() {
		siteCounterImpl siteCounter = new siteCounterImpl();
		return siteCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public siteTag createsiteTag() {
		siteTagImpl siteTag = new siteTagImpl();
		return siteTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public site createsite() {
		siteImpl site = new siteImpl();
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BadRequest createBadRequest() {
		BadRequestImpl badRequest = new BadRequestImpl();
		return badRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unauthorized createUnauthorized() {
		UnauthorizedImpl unauthorized = new UnauthorizedImpl();
		return unauthorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Forbidden createForbidden() {
		ForbiddenImpl forbidden = new ForbiddenImpl();
		return forbidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TooManyRequests createTooManyRequests() {
		TooManyRequestsImpl tooManyRequests = new TooManyRequestsImpl();
		return tooManyRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public tag createtag() {
		tagImpl tag = new tagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExportCreation createExportCreation() {
		ExportCreationImpl exportCreation = new ExportCreationImpl();
		return exportCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Export createExport() {
		ExportImpl export = new ExportImpl();
		return export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotFound createNotFound() {
		NotFoundImpl notFound = new NotFoundImpl();
		return notFound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateRange createDateRange() {
		DateRangeImpl dateRange = new DateRangeImpl();
		return dateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatisticalAverageGroupBy createStatisticalAverageGroupBy() {
		StatisticalAverageGroupByImpl statisticalAverageGroupBy = new StatisticalAverageGroupByImpl();
		return statisticalAverageGroupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Direction createDirection() {
		DirectionImpl direction = new DirectionImpl();
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionName createDirectionName() {
		DirectionNameImpl directionName = new DirectionNameImpl();
		return directionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatisticalTraffic createStatisticalTraffic() {
		StatisticalTrafficImpl statisticalTraffic = new StatisticalTrafficImpl();
		return statisticalTraffic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatisticalTotalGroupBy createStatisticalTotalGroupBy() {
		StatisticalTotalGroupByImpl statisticalTotalGroupBy = new StatisticalTotalGroupByImpl();
		return statisticalTotalGroupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalRawTrafficInclude createHistoricalRawTrafficInclude() {
		HistoricalRawTrafficIncludeImpl historicalRawTrafficInclude = new HistoricalRawTrafficIncludeImpl();
		return historicalRawTrafficInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseSerie createBaseSerie() {
		BaseSerieImpl baseSerie = new BaseSerieImpl();
		return baseSerie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataStatus createDataStatus() {
		DataStatusImpl dataStatus = new DataStatusImpl();
		return dataStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalRawTraffic createHistoricalRawTraffic() {
		HistoricalRawTrafficImpl historicalRawTraffic = new HistoricalRawTrafficImpl();
		return historicalRawTraffic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalAggregatedTrafficInclude createHistoricalAggregatedTrafficInclude() {
		HistoricalAggregatedTrafficIncludeImpl historicalAggregatedTrafficInclude = new HistoricalAggregatedTrafficIncludeImpl();
		return historicalAggregatedTrafficInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Granularity createGranularity() {
		GranularityImpl granularity = new GranularityImpl();
		return granularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalAggregatedTrafficGroupBy createHistoricalAggregatedTrafficGroupBy() {
		HistoricalAggregatedTrafficGroupByImpl historicalAggregatedTrafficGroupBy = new HistoricalAggregatedTrafficGroupByImpl();
		return historicalAggregatedTrafficGroupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalAggregatedTraffic createHistoricalAggregatedTraffic() {
		HistoricalAggregatedTrafficImpl historicalAggregatedTraffic = new HistoricalAggregatedTrafficImpl();
		return historicalAggregatedTraffic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lane createLane() {
		LaneImpl lane = new LaneImpl();
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalTimestampTraffic createHistoricalTimestampTraffic() {
		HistoricalTimestampTrafficImpl historicalTimestampTraffic = new HistoricalTimestampTrafficImpl();
		return historicalTimestampTraffic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public validationJobStatus createvalidationJobStatus() {
		validationJobStatusImpl validationJobStatus = new validationJobStatusImpl();
		return validationJobStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public validationJob createvalidationJob() {
		validationJobImpl validationJob = new validationJobImpl();
		return validationJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public validationJobCreated createvalidationJobCreated() {
		validationJobCreatedImpl validationJobCreated = new validationJobCreatedImpl();
		return validationJobCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conflict createConflict() {
		ConflictImpl conflict = new ConflictImpl();
		return conflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalRawTraffic_data createHistoricalRawTraffic_data() {
		HistoricalRawTraffic_dataImpl historicalRawTraffic_data = new HistoricalRawTraffic_dataImpl();
		return historicalRawTraffic_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalAggregatedTraffic_data createHistoricalAggregatedTraffic_data() {
		HistoricalAggregatedTraffic_dataImpl historicalAggregatedTraffic_data = new HistoricalAggregatedTraffic_dataImpl();
		return historicalAggregatedTraffic_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalAggregatedTraffic_data_traffic createHistoricalAggregatedTraffic_data_traffic() {
		HistoricalAggregatedTraffic_data_trafficImpl historicalAggregatedTraffic_data_traffic = new HistoricalAggregatedTraffic_data_trafficImpl();
		return historicalAggregatedTraffic_data_traffic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalAggregatedTraffic_data_weather createHistoricalAggregatedTraffic_data_weather() {
		HistoricalAggregatedTraffic_data_weatherImpl historicalAggregatedTraffic_data_weather = new HistoricalAggregatedTraffic_data_weatherImpl();
		return historicalAggregatedTraffic_data_weather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response createResponse() {
		ResponseImpl response = new ResponseImpl();
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationJobCreate_request createValidationJobCreate_request() {
		ValidationJobCreate_requestImpl validationJobCreate_request = new ValidationJobCreate_requestImpl();
		return validationJobCreate_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public jakarta.ws.rs.core.Response createJResponseFromString(EDataType eDataType, String initialValue) {
		return (jakarta.ws.rs.core.Response)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJResponseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BikePackage getBikePackage() {
		return (BikePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BikePackage getPackage() {
		return BikePackage.eINSTANCE;
	}

} //BikeFactoryImpl
