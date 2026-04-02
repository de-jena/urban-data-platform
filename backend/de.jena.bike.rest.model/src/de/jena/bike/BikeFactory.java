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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.bike.BikePackage
 * @generated
 */
@ProviderType
public interface BikeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BikeFactory eINSTANCE = de.jena.bike.impl.BikeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geometry</em>'.
	 * @generated
	 */
	Geometry createGeometry();

	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Line String Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line String Coordinates</em>'.
	 * @generated
	 */
	LineStringCoordinates createLineStringCoordinates();

	/**
	 * Returns a new object of class '<em>Line String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line String</em>'.
	 * @generated
	 */
	LineString createLineString();

	/**
	 * Returns a new object of class '<em>Geo Json Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geo Json Object</em>'.
	 * @generated
	 */
	GeoJsonObject createGeoJsonObject();

	/**
	 * Returns a new object of class '<em>site Counter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>site Counter</em>'.
	 * @generated
	 */
	siteCounter createsiteCounter();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>site Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>site Tag</em>'.
	 * @generated
	 */
	siteTag createsiteTag();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>site</em>'.
	 * @generated
	 */
	site createsite();

	/**
	 * Returns a new object of class '<em>Bad Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bad Request</em>'.
	 * @generated
	 */
	BadRequest createBadRequest();

	/**
	 * Returns a new object of class '<em>Unauthorized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unauthorized</em>'.
	 * @generated
	 */
	Unauthorized createUnauthorized();

	/**
	 * Returns a new object of class '<em>Forbidden</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forbidden</em>'.
	 * @generated
	 */
	Forbidden createForbidden();

	/**
	 * Returns a new object of class '<em>Too Many Requests</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Too Many Requests</em>'.
	 * @generated
	 */
	TooManyRequests createTooManyRequests();

	/**
	 * Returns a new object of class '<em>tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tag</em>'.
	 * @generated
	 */
	tag createtag();

	/**
	 * Returns a new object of class '<em>Export Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Export Creation</em>'.
	 * @generated
	 */
	ExportCreation createExportCreation();

	/**
	 * Returns a new object of class '<em>Export</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Export</em>'.
	 * @generated
	 */
	Export createExport();

	/**
	 * Returns a new object of class '<em>Not Found</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Found</em>'.
	 * @generated
	 */
	NotFound createNotFound();

	/**
	 * Returns a new object of class '<em>Direction Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direction Name</em>'.
	 * @generated
	 */
	DirectionName createDirectionName();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Statistical Traffic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistical Traffic</em>'.
	 * @generated
	 */
	StatisticalTraffic createStatisticalTraffic();

	/**
	 * Returns a new object of class '<em>Base Serie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Serie</em>'.
	 * @generated
	 */
	BaseSerie createBaseSerie();

	/**
	 * Returns a new object of class '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time</em>'.
	 * @generated
	 */
	DateTime createDateTime();

	/**
	 * Returns a new object of class '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count</em>'.
	 * @generated
	 */
	Count createCount();

	/**
	 * Returns a new object of class '<em>Data Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Status</em>'.
	 * @generated
	 */
	DataStatus createDataStatus();

	/**
	 * Returns a new object of class '<em>Historical Raw Traffic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Raw Traffic</em>'.
	 * @generated
	 */
	HistoricalRawTraffic createHistoricalRawTraffic();

	/**
	 * Returns a new object of class '<em>Historical Aggregated Traffic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Aggregated Traffic</em>'.
	 * @generated
	 */
	HistoricalAggregatedTraffic createHistoricalAggregatedTraffic();

	/**
	 * Returns a new object of class '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lane</em>'.
	 * @generated
	 */
	Lane createLane();

	/**
	 * Returns a new object of class '<em>Historical Timestamp Traffic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Timestamp Traffic</em>'.
	 * @generated
	 */
	HistoricalTimestampTraffic createHistoricalTimestampTraffic();

	/**
	 * Returns a new object of class '<em>validation Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>validation Job</em>'.
	 * @generated
	 */
	validationJob createvalidationJob();

	/**
	 * Returns a new object of class '<em>validation Job Created</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>validation Job Created</em>'.
	 * @generated
	 */
	validationJobCreated createvalidationJobCreated();

	/**
	 * Returns a new object of class '<em>Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conflict</em>'.
	 * @generated
	 */
	Conflict createConflict();

	/**
	 * Returns a new object of class '<em>Line String coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line String coordinates</em>'.
	 * @generated
	 */
	LineString_coordinates createLineString_coordinates();

	/**
	 * Returns a new object of class '<em>site location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>site location</em>'.
	 * @generated
	 */
	site_location createsite_location();

	/**
	 * Returns a new object of class '<em>site segments</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>site segments</em>'.
	 * @generated
	 */
	site_segments createsite_segments();

	/**
	 * Returns a new object of class '<em>site travel Modes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>site travel Modes</em>'.
	 * @generated
	 */
	site_travelModes createsite_travelModes();

	/**
	 * Returns a new object of class '<em>site counters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>site counters</em>'.
	 * @generated
	 */
	site_counters createsite_counters();

	/**
	 * Returns a new object of class '<em>site domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>site domain</em>'.
	 * @generated
	 */
	site_domain createsite_domain();

	/**
	 * Returns a new object of class '<em>site tags</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>site tags</em>'.
	 * @generated
	 */
	site_tags createsite_tags();

	/**
	 * Returns a new object of class '<em>site images</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>site images</em>'.
	 * @generated
	 */
	site_images createsite_images();

	/**
	 * Returns a new object of class '<em>tag domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tag domain</em>'.
	 * @generated
	 */
	tag_domain createtag_domain();

	/**
	 * Returns a new object of class '<em>Statistical Traffic travel Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistical Traffic travel Mode</em>'.
	 * @generated
	 */
	StatisticalTraffic_travelMode createStatisticalTraffic_travelMode();

	/**
	 * Returns a new object of class '<em>Statistical Traffic direction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistical Traffic direction</em>'.
	 * @generated
	 */
	StatisticalTraffic_direction createStatisticalTraffic_direction();

	/**
	 * Returns a new object of class '<em>Statistical Traffic direction Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistical Traffic direction Name</em>'.
	 * @generated
	 */
	StatisticalTraffic_directionName createStatisticalTraffic_directionName();

	/**
	 * Returns a new object of class '<em>Statistical Traffic value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistical Traffic value</em>'.
	 * @generated
	 */
	StatisticalTraffic_value createStatisticalTraffic_value();

	/**
	 * Returns a new object of class '<em>Base Serie travel Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Serie travel Mode</em>'.
	 * @generated
	 */
	BaseSerie_travelMode createBaseSerie_travelMode();

	/**
	 * Returns a new object of class '<em>Base Serie direction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Serie direction</em>'.
	 * @generated
	 */
	BaseSerie_direction createBaseSerie_direction();

	/**
	 * Returns a new object of class '<em>Historical Raw Traffic data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Raw Traffic data</em>'.
	 * @generated
	 */
	HistoricalRawTraffic_data createHistoricalRawTraffic_data();

	/**
	 * Returns a new object of class '<em>Historical Raw Traffic data timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Raw Traffic data timestamp</em>'.
	 * @generated
	 */
	HistoricalRawTraffic_data_timestamp createHistoricalRawTraffic_data_timestamp();

	/**
	 * Returns a new object of class '<em>Historical Raw Traffic data counts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Raw Traffic data counts</em>'.
	 * @generated
	 */
	HistoricalRawTraffic_data_counts createHistoricalRawTraffic_data_counts();

	/**
	 * Returns a new object of class '<em>Historical Raw Traffic data status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Raw Traffic data status</em>'.
	 * @generated
	 */
	HistoricalRawTraffic_data_status createHistoricalRawTraffic_data_status();

	/**
	 * Returns a new object of class '<em>Historical Aggregated Traffic data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Aggregated Traffic data</em>'.
	 * @generated
	 */
	HistoricalAggregatedTraffic_data createHistoricalAggregatedTraffic_data();

	/**
	 * Returns a new object of class '<em>Historical Aggregated Traffic data timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Aggregated Traffic data timestamp</em>'.
	 * @generated
	 */
	HistoricalAggregatedTraffic_data_timestamp createHistoricalAggregatedTraffic_data_timestamp();

	/**
	 * Returns a new object of class '<em>Historical Aggregated Traffic data traffic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Aggregated Traffic data traffic</em>'.
	 * @generated
	 */
	HistoricalAggregatedTraffic_data_traffic createHistoricalAggregatedTraffic_data_traffic();

	/**
	 * Returns a new object of class '<em>Historical Aggregated Traffic data traffic counts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Aggregated Traffic data traffic counts</em>'.
	 * @generated
	 */
	HistoricalAggregatedTraffic_data_traffic_counts createHistoricalAggregatedTraffic_data_traffic_counts();

	/**
	 * Returns a new object of class '<em>Historical Aggregated Traffic data weather</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Aggregated Traffic data weather</em>'.
	 * @generated
	 */
	HistoricalAggregatedTraffic_data_weather createHistoricalAggregatedTraffic_data_weather();

	/**
	 * Returns a new object of class '<em>Historical Aggregated Traffic direction Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Aggregated Traffic direction Name</em>'.
	 * @generated
	 */
	HistoricalAggregatedTraffic_directionName createHistoricalAggregatedTraffic_directionName();

	/**
	 * Returns a new object of class '<em>Historical Timestamp Traffic timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Timestamp Traffic timestamp</em>'.
	 * @generated
	 */
	HistoricalTimestampTraffic_timestamp createHistoricalTimestampTraffic_timestamp();

	/**
	 * Returns a new object of class '<em>Historical Timestamp Traffic lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Timestamp Traffic lane</em>'.
	 * @generated
	 */
	HistoricalTimestampTraffic_lane createHistoricalTimestampTraffic_lane();

	/**
	 * Returns a new object of class '<em>validation Job status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>validation Job status</em>'.
	 * @generated
	 */
	validationJob_status createvalidationJob_status();

	/**
	 * Returns a new object of class '<em>validation Job Created status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>validation Job Created status</em>'.
	 * @generated
	 */
	validationJobCreated_status createvalidationJobCreated_status();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

	/**
	 * Returns a new object of class '<em>Create Export request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Export request</em>'.
	 * @generated
	 */
	CreateExport_request createCreateExport_request();

	/**
	 * Returns a new object of class '<em>Get ADT date Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get ADT date Range</em>'.
	 * @generated
	 */
	GetADT_dateRange createGetADT_dateRange();

	/**
	 * Returns a new object of class '<em>Get ADT group By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get ADT group By</em>'.
	 * @generated
	 */
	GetADT_groupBy createGetADT_groupBy();

	/**
	 * Returns a new object of class '<em>Get ADT travel Modes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get ADT travel Modes</em>'.
	 * @generated
	 */
	GetADT_travelModes createGetADT_travelModes();

	/**
	 * Returns a new object of class '<em>Get ADT By Site date Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get ADT By Site date Range</em>'.
	 * @generated
	 */
	GetADTBySite_dateRange createGetADTBySite_dateRange();

	/**
	 * Returns a new object of class '<em>Get ADT By Site group By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get ADT By Site group By</em>'.
	 * @generated
	 */
	GetADTBySite_groupBy createGetADTBySite_groupBy();

	/**
	 * Returns a new object of class '<em>Get ADT By Site travel Modes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get ADT By Site travel Modes</em>'.
	 * @generated
	 */
	GetADTBySite_travelModes createGetADTBySite_travelModes();

	/**
	 * Returns a new object of class '<em>Get Total Traffic date Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Total Traffic date Range</em>'.
	 * @generated
	 */
	GetTotalTraffic_dateRange createGetTotalTraffic_dateRange();

	/**
	 * Returns a new object of class '<em>Get Total Traffic group By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Total Traffic group By</em>'.
	 * @generated
	 */
	GetTotalTraffic_groupBy createGetTotalTraffic_groupBy();

	/**
	 * Returns a new object of class '<em>Get Total Traffic travel Modes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Total Traffic travel Modes</em>'.
	 * @generated
	 */
	GetTotalTraffic_travelModes createGetTotalTraffic_travelModes();

	/**
	 * Returns a new object of class '<em>Get Raw Traffic include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Raw Traffic include</em>'.
	 * @generated
	 */
	GetRawTraffic_include createGetRawTraffic_include();

	/**
	 * Returns a new object of class '<em>Get Raw Traffic travel Modes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Raw Traffic travel Modes</em>'.
	 * @generated
	 */
	GetRawTraffic_travelModes createGetRawTraffic_travelModes();

	/**
	 * Returns a new object of class '<em>Get Aggregated Traffic include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Aggregated Traffic include</em>'.
	 * @generated
	 */
	GetAggregatedTraffic_include createGetAggregatedTraffic_include();

	/**
	 * Returns a new object of class '<em>Get Aggregated Traffic granularity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Aggregated Traffic granularity</em>'.
	 * @generated
	 */
	GetAggregatedTraffic_granularity createGetAggregatedTraffic_granularity();

	/**
	 * Returns a new object of class '<em>Get Aggregated Traffic group By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Aggregated Traffic group By</em>'.
	 * @generated
	 */
	GetAggregatedTraffic_groupBy createGetAggregatedTraffic_groupBy();

	/**
	 * Returns a new object of class '<em>Get Aggregated Traffic travel Modes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Aggregated Traffic travel Modes</em>'.
	 * @generated
	 */
	GetAggregatedTraffic_travelModes createGetAggregatedTraffic_travelModes();

	/**
	 * Returns a new object of class '<em>Get Timestamp Traffic travel Modes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Timestamp Traffic travel Modes</em>'.
	 * @generated
	 */
	GetTimestampTraffic_travelModes createGetTimestampTraffic_travelModes();

	/**
	 * Returns a new object of class '<em>Get Timestamp Traffic directions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Timestamp Traffic directions</em>'.
	 * @generated
	 */
	GetTimestampTraffic_directions createGetTimestampTraffic_directions();

	/**
	 * Returns a new object of class '<em>Validation Job Create request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation Job Create request</em>'.
	 * @generated
	 */
	ValidationJobCreate_request createValidationJobCreate_request();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BikePackage getBikePackage();

} //BikeFactory
