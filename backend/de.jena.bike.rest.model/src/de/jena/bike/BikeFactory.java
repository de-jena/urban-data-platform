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
	 * Returns a new object of class '<em>Travel Mode Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Travel Mode Label</em>'.
	 * @generated
	 */
	TravelModeLabel createTravelModeLabel();

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
	 * Returns a new object of class '<em>Date Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Range</em>'.
	 * @generated
	 */
	DateRange createDateRange();

	/**
	 * Returns a new object of class '<em>Statistical Average Group By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistical Average Group By</em>'.
	 * @generated
	 */
	StatisticalAverageGroupBy createStatisticalAverageGroupBy();

	/**
	 * Returns a new object of class '<em>Direction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direction</em>'.
	 * @generated
	 */
	Direction createDirection();

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
	 * Returns a new object of class '<em>Statistical Total Group By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistical Total Group By</em>'.
	 * @generated
	 */
	StatisticalTotalGroupBy createStatisticalTotalGroupBy();

	/**
	 * Returns a new object of class '<em>Historical Raw Traffic Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Raw Traffic Include</em>'.
	 * @generated
	 */
	HistoricalRawTrafficInclude createHistoricalRawTrafficInclude();

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
	 * Returns a new object of class '<em>Historical Aggregated Traffic Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Aggregated Traffic Include</em>'.
	 * @generated
	 */
	HistoricalAggregatedTrafficInclude createHistoricalAggregatedTrafficInclude();

	/**
	 * Returns a new object of class '<em>Granularity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Granularity</em>'.
	 * @generated
	 */
	Granularity createGranularity();

	/**
	 * Returns a new object of class '<em>Historical Aggregated Traffic Group By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Aggregated Traffic Group By</em>'.
	 * @generated
	 */
	HistoricalAggregatedTrafficGroupBy createHistoricalAggregatedTrafficGroupBy();

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
	 * Returns a new object of class '<em>validation Job Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>validation Job Status</em>'.
	 * @generated
	 */
	validationJobStatus createvalidationJobStatus();

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
	 * Returns a new object of class '<em>Historical Raw Traffic data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Raw Traffic data</em>'.
	 * @generated
	 */
	HistoricalRawTraffic_data createHistoricalRawTraffic_data();

	/**
	 * Returns a new object of class '<em>Historical Aggregated Traffic data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Aggregated Traffic data</em>'.
	 * @generated
	 */
	HistoricalAggregatedTraffic_data createHistoricalAggregatedTraffic_data();

	/**
	 * Returns a new object of class '<em>Historical Aggregated Traffic data traffic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Aggregated Traffic data traffic</em>'.
	 * @generated
	 */
	HistoricalAggregatedTraffic_data_traffic createHistoricalAggregatedTraffic_data_traffic();

	/**
	 * Returns a new object of class '<em>Historical Aggregated Traffic data weather</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical Aggregated Traffic data weather</em>'.
	 * @generated
	 */
	HistoricalAggregatedTraffic_data_weather createHistoricalAggregatedTraffic_data_weather();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

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
