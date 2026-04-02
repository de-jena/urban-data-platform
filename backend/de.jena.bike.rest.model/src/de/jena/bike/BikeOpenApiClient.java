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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Api Client</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.jena.bike.BikePackage#getBikeOpenApiClient()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface BikeOpenApiClient extends OpenApiClient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of your counting sites.
	 * 
	 * <!-- end-model-doc -->
	 * @model includeMany="true" idsMany="true" domainIdsMany="true" tagIdsMany="true" customIdsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.HashMap&lt;String, String&gt; queryParameter = new java.util.HashMap&lt;&gt;();\njava.util.HashMap&lt;String, String&gt; pathParameter = new java.util.HashMap&lt;&gt;();\nString endpoint = \"/sites\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != page ) queryParameter.put(\"page\", toQueryString(\"page\",page));\nif ( null != pageSize ) queryParameter.put(\"pageSize\", toQueryString(\"pageSize\",pageSize));\nif ( null != sortBy ) queryParameter.put(\"sortBy\", toQueryString(\"sortBy\",sortBy));\nif ( null != orderBy ) queryParameter.put(\"orderBy\", toQueryString(\"orderBy\",orderBy));\nif ( null != include ) queryParameter.put(\"include\", toQueryString(\"include\",include));\nif ( null != ids ) queryParameter.put(\"ids\", toQueryString(\"ids\",ids));\nif ( null != domainIds ) queryParameter.put(\"domainIds\", toQueryString(\"domainIds\",domainIds));\nif ( null != tagIds ) queryParameter.put(\"tagIds\", toQueryString(\"tagIds\",tagIds));\nif ( null != customIds ) queryParameter.put(\"customIds\", toQueryString(\"customIds\",customIds));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));'"
	 * @generated
	 */
	Response GetSites(Integer page, Integer pageSize, String sortBy, String orderBy, EList<String> include, EList<BigInteger> ids, EList<BigInteger> domainIds, EList<BigInteger> tagIds, EList<String> customIds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of your tags.
	 * 
	 * <!-- end-model-doc -->
	 * @model includeMany="true" idsMany="true" domainIdsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.HashMap&lt;String, String&gt; queryParameter = new java.util.HashMap&lt;&gt;();\njava.util.HashMap&lt;String, String&gt; pathParameter = new java.util.HashMap&lt;&gt;();\nString endpoint = \"/tags\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != page ) queryParameter.put(\"page\", toQueryString(\"page\",page));\nif ( null != pageSize ) queryParameter.put(\"pageSize\", toQueryString(\"pageSize\",pageSize));\nif ( null != sortBy ) queryParameter.put(\"sortBy\", toQueryString(\"sortBy\",sortBy));\nif ( null != orderBy ) queryParameter.put(\"orderBy\", toQueryString(\"orderBy\",orderBy));\nif ( null != include ) queryParameter.put(\"include\", toQueryString(\"include\",include));\nif ( null != ids ) queryParameter.put(\"ids\", toQueryString(\"ids\",ids));\nif ( null != domainIds ) queryParameter.put(\"domainIds\", toQueryString(\"domainIds\",domainIds));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));'"
	 * @generated
	 */
	Response GetTags(Integer page, Integer pageSize, String sortBy, String orderBy, EList<String> include, EList<BigInteger> ids, EList<BigInteger> domainIds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a new asynchronous export job to retrieve large volumes of traffic data efficiently.
	 * 
	 * This endpoint allows you to:
	 * - Export data from multiple sites simultaneously (up to 10,000 sites)
	 * - Choose from various time granularities (15 minutes to 1 year)
	 * - Apply filters for validated data only
	 * - Enable gap filling for contiguous time series
	 * - Select from available export schema formats
	 * 
	 * **Important**: Export files are available for download for 30 days after completion, then automatically deleted.
	 *  endpoint: /exports
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response CreateExport(CreateExport_request request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monitor the progress and status of your export job.
	 * 
	 * Possible statuses:
	 * - **queued**: Job is waiting to be processed
	 * - **in_progress**: Data is being processed and prepared
	 * - **success**: Export completed successfully, data ready for download
	 * - **failure**: Export failed (see errorMessage for details)
	 * - **cleaned**: Export file has been automatically deleted (after 30 days)
	 * 
	 * Once the status is 'success', you can download the data using the provided URL. Remember that export files are only available for 30 days before being automatically deleted.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.HashMap&lt;String, String&gt; queryParameter = new java.util.HashMap&lt;&gt;();\njava.util.HashMap&lt;String, String&gt; pathParameter = new java.util.HashMap&lt;&gt;();\nString endpoint = \"/exports/{jobId}\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\npathParameter.put(\"jobId\", toQueryString(\"jobId\",jobId));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));'"
	 * @generated
	 */
	Response GetExportStatus(Integer jobId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Download the completed export data as a compressed archive. The format and structure depend on the export schema selected during job creation.
	 * 
	 * The archive typically includes:
	 * - Traffic counting data organized according to the selected schema
	 * - Metadata files with site information and export parameters
	 * - Documentation files explaining the data structure and format
	 * 
	 * **Important**: Export files are only available for 30 days after job completion. After this period, files are automatically deleted and cannot be recovered.
	 * 
	 * **Note**: This endpoint only works when the export status is 'success' otherwise it returns a HTTP 404 error.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.HashMap&lt;String, String&gt; queryParameter = new java.util.HashMap&lt;&gt;();\njava.util.HashMap&lt;String, String&gt; pathParameter = new java.util.HashMap&lt;&gt;();\nString endpoint = \"/exports/{jobId}/data\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\npathParameter.put(\"jobId\", toQueryString(\"jobId\",jobId));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));'"
	 * @generated
	 */
	Response DownloadExportData(Integer jobId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total traffic volume during the selected time period, divided by the number of days having data in that period.
	 * 
	 * <!-- end-model-doc -->
	 * @model travelModesMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.HashMap&lt;String, String&gt; queryParameter = new java.util.HashMap&lt;&gt;();\njava.util.HashMap&lt;String, String&gt; pathParameter = new java.util.HashMap&lt;&gt;();\nString endpoint = \"/statistical/adt\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != domainId ) queryParameter.put(\"domainId\", toQueryString(\"domainId\",domainId));\nif ( null != siteId ) queryParameter.put(\"siteId\", toQueryString(\"siteId\",siteId));\nif ( null != dateRange ) queryParameter.put(\"dateRange\", toQueryString(\"dateRange\",dateRange));\nif ( null != month ) queryParameter.put(\"month\", toQueryString(\"month\",month));\nif ( null != year ) queryParameter.put(\"year\", toQueryString(\"year\",year));\nif ( null != groupBy ) queryParameter.put(\"groupBy\", toQueryString(\"groupBy\",groupBy));\nif ( null != travelModes ) queryParameter.put(\"travelModes\", toQueryString(\"travelModes\",travelModes));\nif ( null != validatedDataOnly ) queryParameter.put(\"validatedDataOnly\", toQueryString(\"validatedDataOnly\",validatedDataOnly));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));'"
	 * @generated
	 */
	Response GetADT(BigInteger domainId, BigInteger siteId, GetADT_dateRange dateRange, Integer month, Integer year, GetADT_groupBy groupBy, EList<GetADT_travelModes> travelModes, Boolean validatedDataOnly);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total traffic volume during the selected time period, divided by the number of days having data in that period and by the number of counting sites.
	 * 
	 * <!-- end-model-doc -->
	 * @model travelModesMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.HashMap&lt;String, String&gt; queryParameter = new java.util.HashMap&lt;&gt;();\njava.util.HashMap&lt;String, String&gt; pathParameter = new java.util.HashMap&lt;&gt;();\nString endpoint = \"/statistical/adt/by/site\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != domainId ) queryParameter.put(\"domainId\", toQueryString(\"domainId\",domainId));\nif ( null != siteId ) queryParameter.put(\"siteId\", toQueryString(\"siteId\",siteId));\nif ( null != dateRange ) queryParameter.put(\"dateRange\", toQueryString(\"dateRange\",dateRange));\nif ( null != month ) queryParameter.put(\"month\", toQueryString(\"month\",month));\nif ( null != year ) queryParameter.put(\"year\", toQueryString(\"year\",year));\nif ( null != groupBy ) queryParameter.put(\"groupBy\", toQueryString(\"groupBy\",groupBy));\nif ( null != travelModes ) queryParameter.put(\"travelModes\", toQueryString(\"travelModes\",travelModes));\nif ( null != validatedDataOnly ) queryParameter.put(\"validatedDataOnly\", toQueryString(\"validatedDataOnly\",validatedDataOnly));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));'"
	 * @generated
	 */
	Response GetADTBySite(BigInteger domainId, BigInteger siteId, GetADTBySite_dateRange dateRange, Integer month, Integer year, GetADTBySite_groupBy groupBy, EList<GetADTBySite_travelModes> travelModes, Boolean validatedDataOnly);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get total traffic
	 * 
	 * <!-- end-model-doc -->
	 * @model travelModesMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.HashMap&lt;String, String&gt; queryParameter = new java.util.HashMap&lt;&gt;();\njava.util.HashMap&lt;String, String&gt; pathParameter = new java.util.HashMap&lt;&gt;();\nString endpoint = \"/statistical/total\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != domainId ) queryParameter.put(\"domainId\", toQueryString(\"domainId\",domainId));\nif ( null != siteId ) queryParameter.put(\"siteId\", toQueryString(\"siteId\",siteId));\nif ( null != dateRange ) queryParameter.put(\"dateRange\", toQueryString(\"dateRange\",dateRange));\nif ( null != month ) queryParameter.put(\"month\", toQueryString(\"month\",month));\nif ( null != year ) queryParameter.put(\"year\", toQueryString(\"year\",year));\nif ( null != groupBy ) queryParameter.put(\"groupBy\", toQueryString(\"groupBy\",groupBy));\nif ( null != travelModes ) queryParameter.put(\"travelModes\", toQueryString(\"travelModes\",travelModes));\nif ( null != validatedDataOnly ) queryParameter.put(\"validatedDataOnly\", toQueryString(\"validatedDataOnly\",validatedDataOnly));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));'"
	 * @generated
	 */
	Response GetTotalTraffic(BigInteger domainId, BigInteger siteId, GetTotalTraffic_dateRange dateRange, Integer month, Integer year, GetTotalTraffic_groupBy groupBy, EList<GetTotalTraffic_travelModes> travelModes, Boolean validatedDataOnly);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum timeframe of 31 days
	 * 
	 * <!-- end-model-doc -->
	 * @model includeMany="true" travelModesMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.HashMap&lt;String, String&gt; queryParameter = new java.util.HashMap&lt;&gt;();\njava.util.HashMap&lt;String, String&gt; pathParameter = new java.util.HashMap&lt;&gt;();\nString endpoint = \"/history/traffic/raw\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != siteId ) queryParameter.put(\"siteId\", toQueryString(\"siteId\",siteId));\nif ( null != include ) queryParameter.put(\"include\", toQueryString(\"include\",include));\nif ( null != startDate ) queryParameter.put(\"startDate\", toQueryString(\"startDate\",startDate));\nif ( null != endDate ) queryParameter.put(\"endDate\", toQueryString(\"endDate\",endDate));\nif ( null != startTime ) queryParameter.put(\"startTime\", toQueryString(\"startTime\",startTime));\nif ( null != endTime ) queryParameter.put(\"endTime\", toQueryString(\"endTime\",endTime));\nif ( null != gapFilling ) queryParameter.put(\"gapFilling\", toQueryString(\"gapFilling\",gapFilling));\nif ( null != travelModes ) queryParameter.put(\"travelModes\", toQueryString(\"travelModes\",travelModes));\nif ( null != validatedDataOnly ) queryParameter.put(\"validatedDataOnly\", toQueryString(\"validatedDataOnly\",validatedDataOnly));\nif ( null != rawDataOnly ) queryParameter.put(\"rawDataOnly\", toQueryString(\"rawDataOnly\",rawDataOnly));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));'"
	 * @generated
	 */
	Response GetRawTraffic(BigInteger siteId, EList<GetRawTraffic_include> include, String startDate, String endDate, String startTime, String endTime, Boolean gapFilling, EList<GetRawTraffic_travelModes> travelModes, Boolean validatedDataOnly, Boolean rawDataOnly);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum timeframe of : 
	 * 
	 *   | Aggregation interval | Maximum timeframe |
	 *   |----------------------|-------------------|
	 *   | 15 minutes           | 31 days           |
	 *   | 1 hour               | 31 days           |
	 *   | 1 day                | 1 year            |
	 *   | 1 week               | 5 years           |
	 *   | 1 month              | 10 years          |
	 *   | 1 year               | 30 years          |
	 * 
	 * Requesting aggregated data by exceeding the limits above will result in a 400 HTTP error.
	 * 
	 * <!-- end-model-doc -->
	 * @model includeMany="true" travelModesMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.HashMap&lt;String, String&gt; queryParameter = new java.util.HashMap&lt;&gt;();\njava.util.HashMap&lt;String, String&gt; pathParameter = new java.util.HashMap&lt;&gt;();\nString endpoint = \"/history/traffic/aggregated\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != siteId ) queryParameter.put(\"siteId\", toQueryString(\"siteId\",siteId));\nif ( null != include ) queryParameter.put(\"include\", toQueryString(\"include\",include));\nif ( null != startDate ) queryParameter.put(\"startDate\", toQueryString(\"startDate\",startDate));\nif ( null != endDate ) queryParameter.put(\"endDate\", toQueryString(\"endDate\",endDate));\nif ( null != startTime ) queryParameter.put(\"startTime\", toQueryString(\"startTime\",startTime));\nif ( null != endTime ) queryParameter.put(\"endTime\", toQueryString(\"endTime\",endTime));\nif ( null != granularity ) queryParameter.put(\"granularity\", toQueryString(\"granularity\",granularity));\nif ( null != groupBy ) queryParameter.put(\"groupBy\", toQueryString(\"groupBy\",groupBy));\nif ( null != gapFilling ) queryParameter.put(\"gapFilling\", toQueryString(\"gapFilling\",gapFilling));\nif ( null != travelModes ) queryParameter.put(\"travelModes\", toQueryString(\"travelModes\",travelModes));\nif ( null != validatedDataOnly ) queryParameter.put(\"validatedDataOnly\", toQueryString(\"validatedDataOnly\",validatedDataOnly));\nif ( null != rawDataOnly ) queryParameter.put(\"rawDataOnly\", toQueryString(\"rawDataOnly\",rawDataOnly));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));'"
	 * @generated
	 */
	Response GetAggregatedTraffic(BigInteger siteId, EList<GetAggregatedTraffic_include> include, String startDate, String endDate, String startTime, String endTime, GetAggregatedTraffic_granularity granularity, GetAggregatedTraffic_groupBy groupBy, Boolean gapFilling, EList<GetAggregatedTraffic_travelModes> travelModes, Boolean validatedDataOnly, Boolean rawDataOnly);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get timestamp traffic data for a specific date range. The maximum allowed duration between start and end date is **7 days** because of the amount of data returned.
	 * This limitation ensures optimal performance and prevents the server from being overloaded due to excessive data retrieval.
	 * 
	 * <!-- end-model-doc -->
	 * @model travelModesMany="true" directionsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.HashMap&lt;String, String&gt; queryParameter = new java.util.HashMap&lt;&gt;();\njava.util.HashMap&lt;String, String&gt; pathParameter = new java.util.HashMap&lt;&gt;();\nString endpoint = \"/history/traffic/timestamp\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != siteId ) queryParameter.put(\"siteId\", toQueryString(\"siteId\",siteId));\nif ( null != startDate ) queryParameter.put(\"startDate\", toQueryString(\"startDate\",startDate));\nif ( null != endDate ) queryParameter.put(\"endDate\", toQueryString(\"endDate\",endDate));\nif ( null != startTime ) queryParameter.put(\"startTime\", toQueryString(\"startTime\",startTime));\nif ( null != endTime ) queryParameter.put(\"endTime\", toQueryString(\"endTime\",endTime));\nif ( null != travelModes ) queryParameter.put(\"travelModes\", toQueryString(\"travelModes\",travelModes));\nif ( null != directions ) queryParameter.put(\"directions\", toQueryString(\"directions\",directions));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));'"
	 * @generated
	 */
	Response GetTimestampTraffic(BigInteger siteId, String startDate, String endDate, String startTime, String endTime, EList<GetTimestampTraffic_travelModes> travelModes, EList<GetTimestampTraffic_directions> directions);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the informations of your validation jobs.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.HashMap&lt;String, String&gt; queryParameter = new java.util.HashMap&lt;&gt;();\njava.util.HashMap&lt;String, String&gt; pathParameter = new java.util.HashMap&lt;&gt;();\nString endpoint = \"/validation/data/jobs\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\nif ( null != page ) queryParameter.put(\"page\", toQueryString(\"page\",page));\nif ( null != pageSize ) queryParameter.put(\"pageSize\", toQueryString(\"pageSize\",pageSize));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));'"
	 * @generated
	 */
	Response ValidationJobsGet(Integer page, Integer pageSize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validate the data of the given sites from their ids on a period. The process is asynchronous.
	 * Restrictions:
	 * - Only one job can be in progress per API key
	 * - The validation period cannot exceed 1 year
	 * - Maximum 10 sites can be validated at once
	 *  endpoint: /validation/data/jobs
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response ValidationJobCreate(ValidationJobCreate_request request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the informations of a validation job from its id.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.HashMap&lt;String, String&gt; queryParameter = new java.util.HashMap&lt;&gt;();\njava.util.HashMap&lt;String, String&gt; pathParameter = new java.util.HashMap&lt;&gt;();\nString endpoint = \"/validation/data/jobs/{jobId}\";\nEClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();\npathParameter.put(\"jobId\", toQueryString(\"jobId\",jobId));\nreturn _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));'"
	 * @generated
	 */
	Response ValidationJobGet(Integer jobId);

} // BikeOpenApiClient
