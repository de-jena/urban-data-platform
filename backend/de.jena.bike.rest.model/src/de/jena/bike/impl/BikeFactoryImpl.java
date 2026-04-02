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
			case BikePackage.DIRECTION_NAME: return createDirectionName();
			case BikePackage.VALUE: return createValue();
			case BikePackage.STATISTICAL_TRAFFIC: return createStatisticalTraffic();
			case BikePackage.BASE_SERIE: return createBaseSerie();
			case BikePackage.DATE_TIME: return createDateTime();
			case BikePackage.COUNT: return createCount();
			case BikePackage.DATA_STATUS: return createDataStatus();
			case BikePackage.HISTORICAL_RAW_TRAFFIC: return createHistoricalRawTraffic();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC: return createHistoricalAggregatedTraffic();
			case BikePackage.LANE: return createLane();
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC: return createHistoricalTimestampTraffic();
			case BikePackage.VALIDATION_JOB: return createvalidationJob();
			case BikePackage.VALIDATION_JOB_CREATED: return createvalidationJobCreated();
			case BikePackage.CONFLICT: return createConflict();
			case BikePackage.LINE_STRING_COORDINATES: return createLineString_coordinates();
			case BikePackage.SITE_LOCATION: return createsite_location();
			case BikePackage.SITE_SEGMENTS: return createsite_segments();
			case BikePackage.SITE_TRAVEL_MODES: return createsite_travelModes();
			case BikePackage.SITE_COUNTERS: return createsite_counters();
			case BikePackage.SITE_DOMAIN: return createsite_domain();
			case BikePackage.SITE_TAGS: return createsite_tags();
			case BikePackage.SITE_IMAGES: return createsite_images();
			case BikePackage.TAG_DOMAIN: return createtag_domain();
			case BikePackage.STATISTICAL_TRAFFIC_TRAVEL_MODE: return createStatisticalTraffic_travelMode();
			case BikePackage.STATISTICAL_TRAFFIC_DIRECTION: return createStatisticalTraffic_direction();
			case BikePackage.STATISTICAL_TRAFFIC_DIRECTION_NAME: return createStatisticalTraffic_directionName();
			case BikePackage.STATISTICAL_TRAFFIC_VALUE: return createStatisticalTraffic_value();
			case BikePackage.BASE_SERIE_TRAVEL_MODE: return createBaseSerie_travelMode();
			case BikePackage.BASE_SERIE_DIRECTION: return createBaseSerie_direction();
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA: return createHistoricalRawTraffic_data();
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA_TIMESTAMP: return createHistoricalRawTraffic_data_timestamp();
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA_COUNTS: return createHistoricalRawTraffic_data_counts();
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA_STATUS: return createHistoricalRawTraffic_data_status();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA: return createHistoricalAggregatedTraffic_data();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TIMESTAMP: return createHistoricalAggregatedTraffic_data_timestamp();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC: return createHistoricalAggregatedTraffic_data_traffic();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC_COUNTS: return createHistoricalAggregatedTraffic_data_traffic_counts();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER: return createHistoricalAggregatedTraffic_data_weather();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DIRECTION_NAME: return createHistoricalAggregatedTraffic_directionName();
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC_TIMESTAMP: return createHistoricalTimestampTraffic_timestamp();
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC_LANE: return createHistoricalTimestampTraffic_lane();
			case BikePackage.VALIDATION_JOB_STATUS: return createvalidationJob_status();
			case BikePackage.VALIDATION_JOB_CREATED_STATUS: return createvalidationJobCreated_status();
			case BikePackage.RESPONSE: return createResponse();
			case BikePackage.CREATE_EXPORT_REQUEST: return createCreateExport_request();
			case BikePackage.GET_ADT_DATE_RANGE: return createGetADT_dateRange();
			case BikePackage.GET_ADT_GROUP_BY: return createGetADT_groupBy();
			case BikePackage.GET_ADT_TRAVEL_MODES: return createGetADT_travelModes();
			case BikePackage.GET_ADT_BY_SITE_DATE_RANGE: return createGetADTBySite_dateRange();
			case BikePackage.GET_ADT_BY_SITE_GROUP_BY: return createGetADTBySite_groupBy();
			case BikePackage.GET_ADT_BY_SITE_TRAVEL_MODES: return createGetADTBySite_travelModes();
			case BikePackage.GET_TOTAL_TRAFFIC_DATE_RANGE: return createGetTotalTraffic_dateRange();
			case BikePackage.GET_TOTAL_TRAFFIC_GROUP_BY: return createGetTotalTraffic_groupBy();
			case BikePackage.GET_TOTAL_TRAFFIC_TRAVEL_MODES: return createGetTotalTraffic_travelModes();
			case BikePackage.GET_RAW_TRAFFIC_INCLUDE: return createGetRawTraffic_include();
			case BikePackage.GET_RAW_TRAFFIC_TRAVEL_MODES: return createGetRawTraffic_travelModes();
			case BikePackage.GET_AGGREGATED_TRAFFIC_INCLUDE: return createGetAggregatedTraffic_include();
			case BikePackage.GET_AGGREGATED_TRAFFIC_GRANULARITY: return createGetAggregatedTraffic_granularity();
			case BikePackage.GET_AGGREGATED_TRAFFIC_GROUP_BY: return createGetAggregatedTraffic_groupBy();
			case BikePackage.GET_AGGREGATED_TRAFFIC_TRAVEL_MODES: return createGetAggregatedTraffic_travelModes();
			case BikePackage.GET_TIMESTAMP_TRAFFIC_TRAVEL_MODES: return createGetTimestampTraffic_travelModes();
			case BikePackage.GET_TIMESTAMP_TRAFFIC_DIRECTIONS: return createGetTimestampTraffic_directions();
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
			case BikePackage.TRAVEL_MODE_LABEL:
				return createTravelModeLabelFromString(eDataType, initialValue);
			case BikePackage.DATE_RANGE:
				return createDateRangeFromString(eDataType, initialValue);
			case BikePackage.STATISTICAL_AVERAGE_GROUP_BY:
				return createStatisticalAverageGroupByFromString(eDataType, initialValue);
			case BikePackage.DIRECTION:
				return createDirectionFromString(eDataType, initialValue);
			case BikePackage.STATISTICAL_TOTAL_GROUP_BY:
				return createStatisticalTotalGroupByFromString(eDataType, initialValue);
			case BikePackage.HISTORICAL_RAW_TRAFFIC_INCLUDE:
				return createHistoricalRawTrafficIncludeFromString(eDataType, initialValue);
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_INCLUDE:
				return createHistoricalAggregatedTrafficIncludeFromString(eDataType, initialValue);
			case BikePackage.GRANULARITY:
				return createGranularityFromString(eDataType, initialValue);
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_GROUP_BY:
				return createHistoricalAggregatedTrafficGroupByFromString(eDataType, initialValue);
			case BikePackage.VALIDATION_JOB_STATUS:
				return createvalidationJobStatusFromString(eDataType, initialValue);
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
			case BikePackage.TRAVEL_MODE_LABEL:
				return convertTravelModeLabelToString(eDataType, instanceValue);
			case BikePackage.DATE_RANGE:
				return convertDateRangeToString(eDataType, instanceValue);
			case BikePackage.STATISTICAL_AVERAGE_GROUP_BY:
				return convertStatisticalAverageGroupByToString(eDataType, instanceValue);
			case BikePackage.DIRECTION:
				return convertDirectionToString(eDataType, instanceValue);
			case BikePackage.STATISTICAL_TOTAL_GROUP_BY:
				return convertStatisticalTotalGroupByToString(eDataType, instanceValue);
			case BikePackage.HISTORICAL_RAW_TRAFFIC_INCLUDE:
				return convertHistoricalRawTrafficIncludeToString(eDataType, instanceValue);
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_INCLUDE:
				return convertHistoricalAggregatedTrafficIncludeToString(eDataType, instanceValue);
			case BikePackage.GRANULARITY:
				return convertGranularityToString(eDataType, instanceValue);
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_GROUP_BY:
				return convertHistoricalAggregatedTrafficGroupByToString(eDataType, instanceValue);
			case BikePackage.VALIDATION_JOB_STATUS:
				return convertvalidationJobStatusToString(eDataType, instanceValue);
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
	public LineString_coordinates createLineString_coordinates() {
		LineString_coordinatesImpl lineString_coordinates = new LineString_coordinatesImpl();
		return lineString_coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public site_location createsite_location() {
		site_locationImpl site_location = new site_locationImpl();
		return site_location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public site_segments createsite_segments() {
		site_segmentsImpl site_segments = new site_segmentsImpl();
		return site_segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public site_travelModes createsite_travelModes() {
		site_travelModesImpl site_travelModes = new site_travelModesImpl();
		return site_travelModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public site_counters createsite_counters() {
		site_countersImpl site_counters = new site_countersImpl();
		return site_counters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public site_domain createsite_domain() {
		site_domainImpl site_domain = new site_domainImpl();
		return site_domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public site_tags createsite_tags() {
		site_tagsImpl site_tags = new site_tagsImpl();
		return site_tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public site_images createsite_images() {
		site_imagesImpl site_images = new site_imagesImpl();
		return site_images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public tag_domain createtag_domain() {
		tag_domainImpl tag_domain = new tag_domainImpl();
		return tag_domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatisticalTraffic_travelMode createStatisticalTraffic_travelMode() {
		StatisticalTraffic_travelModeImpl statisticalTraffic_travelMode = new StatisticalTraffic_travelModeImpl();
		return statisticalTraffic_travelMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatisticalTraffic_direction createStatisticalTraffic_direction() {
		StatisticalTraffic_directionImpl statisticalTraffic_direction = new StatisticalTraffic_directionImpl();
		return statisticalTraffic_direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatisticalTraffic_directionName createStatisticalTraffic_directionName() {
		StatisticalTraffic_directionNameImpl statisticalTraffic_directionName = new StatisticalTraffic_directionNameImpl();
		return statisticalTraffic_directionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatisticalTraffic_value createStatisticalTraffic_value() {
		StatisticalTraffic_valueImpl statisticalTraffic_value = new StatisticalTraffic_valueImpl();
		return statisticalTraffic_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseSerie_travelMode createBaseSerie_travelMode() {
		BaseSerie_travelModeImpl baseSerie_travelMode = new BaseSerie_travelModeImpl();
		return baseSerie_travelMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseSerie_direction createBaseSerie_direction() {
		BaseSerie_directionImpl baseSerie_direction = new BaseSerie_directionImpl();
		return baseSerie_direction;
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
	public HistoricalRawTraffic_data_timestamp createHistoricalRawTraffic_data_timestamp() {
		HistoricalRawTraffic_data_timestampImpl historicalRawTraffic_data_timestamp = new HistoricalRawTraffic_data_timestampImpl();
		return historicalRawTraffic_data_timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalRawTraffic_data_counts createHistoricalRawTraffic_data_counts() {
		HistoricalRawTraffic_data_countsImpl historicalRawTraffic_data_counts = new HistoricalRawTraffic_data_countsImpl();
		return historicalRawTraffic_data_counts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalRawTraffic_data_status createHistoricalRawTraffic_data_status() {
		HistoricalRawTraffic_data_statusImpl historicalRawTraffic_data_status = new HistoricalRawTraffic_data_statusImpl();
		return historicalRawTraffic_data_status;
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
	public HistoricalAggregatedTraffic_data_timestamp createHistoricalAggregatedTraffic_data_timestamp() {
		HistoricalAggregatedTraffic_data_timestampImpl historicalAggregatedTraffic_data_timestamp = new HistoricalAggregatedTraffic_data_timestampImpl();
		return historicalAggregatedTraffic_data_timestamp;
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
	public HistoricalAggregatedTraffic_data_traffic_counts createHistoricalAggregatedTraffic_data_traffic_counts() {
		HistoricalAggregatedTraffic_data_traffic_countsImpl historicalAggregatedTraffic_data_traffic_counts = new HistoricalAggregatedTraffic_data_traffic_countsImpl();
		return historicalAggregatedTraffic_data_traffic_counts;
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
	public HistoricalAggregatedTraffic_directionName createHistoricalAggregatedTraffic_directionName() {
		HistoricalAggregatedTraffic_directionNameImpl historicalAggregatedTraffic_directionName = new HistoricalAggregatedTraffic_directionNameImpl();
		return historicalAggregatedTraffic_directionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalTimestampTraffic_timestamp createHistoricalTimestampTraffic_timestamp() {
		HistoricalTimestampTraffic_timestampImpl historicalTimestampTraffic_timestamp = new HistoricalTimestampTraffic_timestampImpl();
		return historicalTimestampTraffic_timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalTimestampTraffic_lane createHistoricalTimestampTraffic_lane() {
		HistoricalTimestampTraffic_laneImpl historicalTimestampTraffic_lane = new HistoricalTimestampTraffic_laneImpl();
		return historicalTimestampTraffic_lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public validationJob_status createvalidationJob_status() {
		validationJob_statusImpl validationJob_status = new validationJob_statusImpl();
		return validationJob_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public validationJobCreated_status createvalidationJobCreated_status() {
		validationJobCreated_statusImpl validationJobCreated_status = new validationJobCreated_statusImpl();
		return validationJobCreated_status;
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
	public CreateExport_request createCreateExport_request() {
		CreateExport_requestImpl createExport_request = new CreateExport_requestImpl();
		return createExport_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetADT_dateRange createGetADT_dateRange() {
		GetADT_dateRangeImpl getADT_dateRange = new GetADT_dateRangeImpl();
		return getADT_dateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetADT_groupBy createGetADT_groupBy() {
		GetADT_groupByImpl getADT_groupBy = new GetADT_groupByImpl();
		return getADT_groupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetADT_travelModes createGetADT_travelModes() {
		GetADT_travelModesImpl getADT_travelModes = new GetADT_travelModesImpl();
		return getADT_travelModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetADTBySite_dateRange createGetADTBySite_dateRange() {
		GetADTBySite_dateRangeImpl getADTBySite_dateRange = new GetADTBySite_dateRangeImpl();
		return getADTBySite_dateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetADTBySite_groupBy createGetADTBySite_groupBy() {
		GetADTBySite_groupByImpl getADTBySite_groupBy = new GetADTBySite_groupByImpl();
		return getADTBySite_groupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetADTBySite_travelModes createGetADTBySite_travelModes() {
		GetADTBySite_travelModesImpl getADTBySite_travelModes = new GetADTBySite_travelModesImpl();
		return getADTBySite_travelModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetTotalTraffic_dateRange createGetTotalTraffic_dateRange() {
		GetTotalTraffic_dateRangeImpl getTotalTraffic_dateRange = new GetTotalTraffic_dateRangeImpl();
		return getTotalTraffic_dateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetTotalTraffic_groupBy createGetTotalTraffic_groupBy() {
		GetTotalTraffic_groupByImpl getTotalTraffic_groupBy = new GetTotalTraffic_groupByImpl();
		return getTotalTraffic_groupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetTotalTraffic_travelModes createGetTotalTraffic_travelModes() {
		GetTotalTraffic_travelModesImpl getTotalTraffic_travelModes = new GetTotalTraffic_travelModesImpl();
		return getTotalTraffic_travelModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetRawTraffic_include createGetRawTraffic_include() {
		GetRawTraffic_includeImpl getRawTraffic_include = new GetRawTraffic_includeImpl();
		return getRawTraffic_include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetRawTraffic_travelModes createGetRawTraffic_travelModes() {
		GetRawTraffic_travelModesImpl getRawTraffic_travelModes = new GetRawTraffic_travelModesImpl();
		return getRawTraffic_travelModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAggregatedTraffic_include createGetAggregatedTraffic_include() {
		GetAggregatedTraffic_includeImpl getAggregatedTraffic_include = new GetAggregatedTraffic_includeImpl();
		return getAggregatedTraffic_include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAggregatedTraffic_granularity createGetAggregatedTraffic_granularity() {
		GetAggregatedTraffic_granularityImpl getAggregatedTraffic_granularity = new GetAggregatedTraffic_granularityImpl();
		return getAggregatedTraffic_granularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAggregatedTraffic_groupBy createGetAggregatedTraffic_groupBy() {
		GetAggregatedTraffic_groupByImpl getAggregatedTraffic_groupBy = new GetAggregatedTraffic_groupByImpl();
		return getAggregatedTraffic_groupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetAggregatedTraffic_travelModes createGetAggregatedTraffic_travelModes() {
		GetAggregatedTraffic_travelModesImpl getAggregatedTraffic_travelModes = new GetAggregatedTraffic_travelModesImpl();
		return getAggregatedTraffic_travelModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetTimestampTraffic_travelModes createGetTimestampTraffic_travelModes() {
		GetTimestampTraffic_travelModesImpl getTimestampTraffic_travelModes = new GetTimestampTraffic_travelModesImpl();
		return getTimestampTraffic_travelModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetTimestampTraffic_directions createGetTimestampTraffic_directions() {
		GetTimestampTraffic_directionsImpl getTimestampTraffic_directions = new GetTimestampTraffic_directionsImpl();
		return getTimestampTraffic_directions;
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
	public TravelModeLabel createTravelModeLabelFromString(EDataType eDataType, String initialValue) {
		TravelModeLabel result = TravelModeLabel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTravelModeLabelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateRange createDateRangeFromString(EDataType eDataType, String initialValue) {
		DateRange result = DateRange.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateRangeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticalAverageGroupBy createStatisticalAverageGroupByFromString(EDataType eDataType, String initialValue) {
		StatisticalAverageGroupBy result = StatisticalAverageGroupBy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatisticalAverageGroupByToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticalTotalGroupBy createStatisticalTotalGroupByFromString(EDataType eDataType, String initialValue) {
		StatisticalTotalGroupBy result = StatisticalTotalGroupBy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatisticalTotalGroupByToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoricalRawTrafficInclude createHistoricalRawTrafficIncludeFromString(EDataType eDataType, String initialValue) {
		HistoricalRawTrafficInclude result = HistoricalRawTrafficInclude.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoricalRawTrafficIncludeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoricalAggregatedTrafficInclude createHistoricalAggregatedTrafficIncludeFromString(EDataType eDataType, String initialValue) {
		HistoricalAggregatedTrafficInclude result = HistoricalAggregatedTrafficInclude.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoricalAggregatedTrafficIncludeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Granularity createGranularityFromString(EDataType eDataType, String initialValue) {
		Granularity result = Granularity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGranularityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoricalAggregatedTrafficGroupBy createHistoricalAggregatedTrafficGroupByFromString(EDataType eDataType, String initialValue) {
		HistoricalAggregatedTrafficGroupBy result = HistoricalAggregatedTrafficGroupBy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoricalAggregatedTrafficGroupByToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public validationJobStatus createvalidationJobStatusFromString(EDataType eDataType, String initialValue) {
		validationJobStatus result = validationJobStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertvalidationJobStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
