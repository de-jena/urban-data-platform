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
package de.jena.bike.impl;

import de.jena.bike.BikeOpenApiClient;
import de.jena.bike.BikePackage;
import de.jena.bike.DateRange;
import de.jena.bike.Direction;
import de.jena.bike.ExportCreation;
import de.jena.bike.Granularity;
import de.jena.bike.HistoricalAggregatedTrafficGroupBy;
import de.jena.bike.HistoricalAggregatedTrafficInclude;
import de.jena.bike.HistoricalRawTrafficInclude;
import de.jena.bike.Response;
import de.jena.bike.StatisticalAverageGroupBy;
import de.jena.bike.StatisticalTotalGroupBy;
import de.jena.bike.TravelModeLabel;
import de.jena.bike.ValidationJobCreate_request;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Api Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class BikeOpenApiClientImpl extends MinimalEObjectImpl.Container implements BikeOpenApiClient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BikeOpenApiClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.BIKE_OPEN_API_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response GetSites(final Integer page, final Integer pageSize, final String sortBy, final String orderBy, final EList<String> include, final EList<BigInteger> ids, final EList<BigInteger> domainIds, final EList<BigInteger> tagIds, final EList<String> customIds) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/sites";
		EClass resultEClass = BikePackage.eINSTANCE.getsite();
		if ( null != page ) queryParameter.put("page", toQueryString("page",page));
		if ( null != pageSize ) queryParameter.put("pageSize", toQueryString("pageSize",pageSize));
		if ( null != sortBy ) queryParameter.put("sortBy", toQueryString("sortBy",sortBy));
		if ( null != orderBy ) queryParameter.put("orderBy", toQueryString("orderBy",orderBy));
		if ( null != include ) queryParameter.put("include", toQueryString("include",include));
		if ( null != ids ) queryParameter.put("ids", toQueryString("ids",ids));
		if ( null != domainIds ) queryParameter.put("domainIds", toQueryString("domainIds",domainIds));
		if ( null != tagIds ) queryParameter.put("tagIds", toQueryString("tagIds",tagIds));
		if ( null != customIds ) queryParameter.put("customIds", toQueryString("customIds",customIds));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response GetTags(final Integer page, final Integer pageSize, final String sortBy, final String orderBy, final EList<String> include, final EList<BigInteger> ids, final EList<BigInteger> domainIds) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/tags";
		EClass resultEClass = BikePackage.eINSTANCE.gettag();
		if ( null != page ) queryParameter.put("page", toQueryString("page",page));
		if ( null != pageSize ) queryParameter.put("pageSize", toQueryString("pageSize",pageSize));
		if ( null != sortBy ) queryParameter.put("sortBy", toQueryString("sortBy",sortBy));
		if ( null != orderBy ) queryParameter.put("orderBy", toQueryString("orderBy",orderBy));
		if ( null != include ) queryParameter.put("include", toQueryString("include",include));
		if ( null != ids ) queryParameter.put("ids", toQueryString("ids",ids));
		if ( null != domainIds ) queryParameter.put("domainIds", toQueryString("domainIds",domainIds));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response CreateExport(ExportCreation request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response GetExportStatus(final Integer jobId) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/exports/{jobId}";
		EClass resultEClass = BikePackage.eINSTANCE.getExport();
		pathParameter.put("jobId", toQueryString("jobId",jobId));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response DownloadExportData(final Integer jobId) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/exports/{jobId}/data";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		pathParameter.put("jobId", toQueryString("jobId",jobId));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response GetADT(final BigInteger domainId, final BigInteger siteId, final DateRange dateRange, final Integer month, final Integer year, final StatisticalAverageGroupBy groupBy, final EList<TravelModeLabel> travelModes, final Boolean validatedDataOnly) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/statistical/adt";
		EClass resultEClass = BikePackage.eINSTANCE.getStatisticalTraffic();
		if ( null != domainId ) queryParameter.put("domainId", toQueryString("domainId",domainId));
		if ( null != siteId ) queryParameter.put("siteId", toQueryString("siteId",siteId));
		if ( null != dateRange ) queryParameter.put("dateRange", toQueryString("dateRange",dateRange));
		if ( null != month ) queryParameter.put("month", toQueryString("month",month));
		if ( null != year ) queryParameter.put("year", toQueryString("year",year));
		if ( null != groupBy ) queryParameter.put("groupBy", toQueryString("groupBy",groupBy));
		if ( null != travelModes ) queryParameter.put("travelModes", toQueryString("travelModes",travelModes));
		if ( null != validatedDataOnly ) queryParameter.put("validatedDataOnly", toQueryString("validatedDataOnly",validatedDataOnly));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response GetADTBySite(final BigInteger domainId, final BigInteger siteId, final DateRange dateRange, final Integer month, final Integer year, final StatisticalAverageGroupBy groupBy, final EList<TravelModeLabel> travelModes, final Boolean validatedDataOnly) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/statistical/adt/by/site";
		EClass resultEClass = BikePackage.eINSTANCE.getStatisticalTraffic();
		if ( null != domainId ) queryParameter.put("domainId", toQueryString("domainId",domainId));
		if ( null != siteId ) queryParameter.put("siteId", toQueryString("siteId",siteId));
		if ( null != dateRange ) queryParameter.put("dateRange", toQueryString("dateRange",dateRange));
		if ( null != month ) queryParameter.put("month", toQueryString("month",month));
		if ( null != year ) queryParameter.put("year", toQueryString("year",year));
		if ( null != groupBy ) queryParameter.put("groupBy", toQueryString("groupBy",groupBy));
		if ( null != travelModes ) queryParameter.put("travelModes", toQueryString("travelModes",travelModes));
		if ( null != validatedDataOnly ) queryParameter.put("validatedDataOnly", toQueryString("validatedDataOnly",validatedDataOnly));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response GetTotalTraffic(final BigInteger domainId, final BigInteger siteId, final DateRange dateRange, final Integer month, final Integer year, final StatisticalTotalGroupBy groupBy, final EList<TravelModeLabel> travelModes, final Boolean validatedDataOnly) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/statistical/total";
		EClass resultEClass = BikePackage.eINSTANCE.getStatisticalTraffic();
		if ( null != domainId ) queryParameter.put("domainId", toQueryString("domainId",domainId));
		if ( null != siteId ) queryParameter.put("siteId", toQueryString("siteId",siteId));
		if ( null != dateRange ) queryParameter.put("dateRange", toQueryString("dateRange",dateRange));
		if ( null != month ) queryParameter.put("month", toQueryString("month",month));
		if ( null != year ) queryParameter.put("year", toQueryString("year",year));
		if ( null != groupBy ) queryParameter.put("groupBy", toQueryString("groupBy",groupBy));
		if ( null != travelModes ) queryParameter.put("travelModes", toQueryString("travelModes",travelModes));
		if ( null != validatedDataOnly ) queryParameter.put("validatedDataOnly", toQueryString("validatedDataOnly",validatedDataOnly));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response GetRawTraffic(final BigInteger siteId, final EList<HistoricalRawTrafficInclude> include, final String startDate, final String endDate, final String startTime, final String endTime, final Boolean gapFilling, final EList<TravelModeLabel> travelModes, final Boolean validatedDataOnly, final Boolean rawDataOnly) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/history/traffic/raw";
		EClass resultEClass = BikePackage.eINSTANCE.getHistoricalRawTraffic();
		if ( null != siteId ) queryParameter.put("siteId", toQueryString("siteId",siteId));
		if ( null != include ) queryParameter.put("include", toQueryString("include",include));
		if ( null != startDate ) queryParameter.put("startDate", toQueryString("startDate",startDate));
		if ( null != endDate ) queryParameter.put("endDate", toQueryString("endDate",endDate));
		if ( null != startTime ) queryParameter.put("startTime", toQueryString("startTime",startTime));
		if ( null != endTime ) queryParameter.put("endTime", toQueryString("endTime",endTime));
		if ( null != gapFilling ) queryParameter.put("gapFilling", toQueryString("gapFilling",gapFilling));
		if ( null != travelModes ) queryParameter.put("travelModes", toQueryString("travelModes",travelModes));
		if ( null != validatedDataOnly ) queryParameter.put("validatedDataOnly", toQueryString("validatedDataOnly",validatedDataOnly));
		if ( null != rawDataOnly ) queryParameter.put("rawDataOnly", toQueryString("rawDataOnly",rawDataOnly));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response GetAggregatedTraffic(final BigInteger siteId, final EList<HistoricalAggregatedTrafficInclude> include, final String startDate, final String endDate, final String startTime, final String endTime, final Granularity granularity, final HistoricalAggregatedTrafficGroupBy groupBy, final Boolean gapFilling, final EList<TravelModeLabel> travelModes, final Boolean validatedDataOnly, final Boolean rawDataOnly) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/history/traffic/aggregated";
		EClass resultEClass = BikePackage.eINSTANCE.getHistoricalAggregatedTraffic();
		if ( null != siteId ) queryParameter.put("siteId", toQueryString("siteId",siteId));
		if ( null != include ) queryParameter.put("include", toQueryString("include",include));
		if ( null != startDate ) queryParameter.put("startDate", toQueryString("startDate",startDate));
		if ( null != endDate ) queryParameter.put("endDate", toQueryString("endDate",endDate));
		if ( null != startTime ) queryParameter.put("startTime", toQueryString("startTime",startTime));
		if ( null != endTime ) queryParameter.put("endTime", toQueryString("endTime",endTime));
		if ( null != granularity ) queryParameter.put("granularity", toQueryString("granularity",granularity));
		if ( null != groupBy ) queryParameter.put("groupBy", toQueryString("groupBy",groupBy));
		if ( null != gapFilling ) queryParameter.put("gapFilling", toQueryString("gapFilling",gapFilling));
		if ( null != travelModes ) queryParameter.put("travelModes", toQueryString("travelModes",travelModes));
		if ( null != validatedDataOnly ) queryParameter.put("validatedDataOnly", toQueryString("validatedDataOnly",validatedDataOnly));
		if ( null != rawDataOnly ) queryParameter.put("rawDataOnly", toQueryString("rawDataOnly",rawDataOnly));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response GetTimestampTraffic(final BigInteger siteId, final String startDate, final String endDate, final String startTime, final String endTime, final EList<TravelModeLabel> travelModes, final EList<Direction> directions) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/history/traffic/timestamp";
		EClass resultEClass = BikePackage.eINSTANCE.getHistoricalTimestampTraffic();
		if ( null != siteId ) queryParameter.put("siteId", toQueryString("siteId",siteId));
		if ( null != startDate ) queryParameter.put("startDate", toQueryString("startDate",startDate));
		if ( null != endDate ) queryParameter.put("endDate", toQueryString("endDate",endDate));
		if ( null != startTime ) queryParameter.put("startTime", toQueryString("startTime",startTime));
		if ( null != endTime ) queryParameter.put("endTime", toQueryString("endTime",endTime));
		if ( null != travelModes ) queryParameter.put("travelModes", toQueryString("travelModes",travelModes));
		if ( null != directions ) queryParameter.put("directions", toQueryString("directions",directions));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response ValidationJobsGet(final Integer page, final Integer pageSize) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/validation/data/jobs";
		EClass resultEClass = BikePackage.eINSTANCE.getvalidationJob();
		if ( null != page ) queryParameter.put("page", toQueryString("page",page));
		if ( null != pageSize ) queryParameter.put("pageSize", toQueryString("pageSize",pageSize));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response ValidationJobCreate(ValidationJobCreate_request request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response ValidationJobGet(final Integer jobId) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/validation/data/jobs/{jobId}";
		EClass resultEClass = BikePackage.eINSTANCE.getvalidationJob();
		pathParameter.put("jobId", toQueryString("jobId",jobId));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toQueryString(final String name, final Object in) {
		if(in instanceof java.util.Collection<?> c) {
			return c.stream().map(String::valueOf).map(s -> java.net.URLEncoder.encode(s, java.nio.charset.StandardCharsets.UTF_8)).collect(java.util.stream.Collectors.joining("&"+name+"="));
		}
		return java.net.URLEncoder.encode(String.valueOf(in), java.nio.charset.StandardCharsets.UTF_8);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response _get(String endpoint, EClass result, EMap<String, String> pathParameter, EMap<String, String> queryParameter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response _delete(String endpoint, EClass result, EMap<String, String> pathParameter, EMap<String, String> queryParameter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BikePackage.BIKE_OPEN_API_CLIENT___GET_SITES__INTEGER_INTEGER_STRING_STRING_ELIST_ELIST_ELIST_ELIST_ELIST:
				return GetSites((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (EList<String>)arguments.get(4), (EList<BigInteger>)arguments.get(5), (EList<BigInteger>)arguments.get(6), (EList<BigInteger>)arguments.get(7), (EList<String>)arguments.get(8));
			case BikePackage.BIKE_OPEN_API_CLIENT___GET_TAGS__INTEGER_INTEGER_STRING_STRING_ELIST_ELIST_ELIST:
				return GetTags((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (EList<String>)arguments.get(4), (EList<BigInteger>)arguments.get(5), (EList<BigInteger>)arguments.get(6));
			case BikePackage.BIKE_OPEN_API_CLIENT___CREATE_EXPORT__EXPORTCREATION:
				return CreateExport((ExportCreation)arguments.get(0));
			case BikePackage.BIKE_OPEN_API_CLIENT___GET_EXPORT_STATUS__INTEGER:
				return GetExportStatus((Integer)arguments.get(0));
			case BikePackage.BIKE_OPEN_API_CLIENT___DOWNLOAD_EXPORT_DATA__INTEGER:
				return DownloadExportData((Integer)arguments.get(0));
			case BikePackage.BIKE_OPEN_API_CLIENT___GET_ADT__BIGINTEGER_BIGINTEGER_DATERANGE_INTEGER_INTEGER_STATISTICALAVERAGEGROUPBY_ELIST_BOOLEAN:
				return GetADT((BigInteger)arguments.get(0), (BigInteger)arguments.get(1), (DateRange)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (StatisticalAverageGroupBy)arguments.get(5), (EList<TravelModeLabel>)arguments.get(6), (Boolean)arguments.get(7));
			case BikePackage.BIKE_OPEN_API_CLIENT___GET_ADT_BY_SITE__BIGINTEGER_BIGINTEGER_DATERANGE_INTEGER_INTEGER_STATISTICALAVERAGEGROUPBY_ELIST_BOOLEAN:
				return GetADTBySite((BigInteger)arguments.get(0), (BigInteger)arguments.get(1), (DateRange)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (StatisticalAverageGroupBy)arguments.get(5), (EList<TravelModeLabel>)arguments.get(6), (Boolean)arguments.get(7));
			case BikePackage.BIKE_OPEN_API_CLIENT___GET_TOTAL_TRAFFIC__BIGINTEGER_BIGINTEGER_DATERANGE_INTEGER_INTEGER_STATISTICALTOTALGROUPBY_ELIST_BOOLEAN:
				return GetTotalTraffic((BigInteger)arguments.get(0), (BigInteger)arguments.get(1), (DateRange)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (StatisticalTotalGroupBy)arguments.get(5), (EList<TravelModeLabel>)arguments.get(6), (Boolean)arguments.get(7));
			case BikePackage.BIKE_OPEN_API_CLIENT___GET_RAW_TRAFFIC__BIGINTEGER_ELIST_STRING_STRING_STRING_STRING_BOOLEAN_ELIST_BOOLEAN_BOOLEAN:
				return GetRawTraffic((BigInteger)arguments.get(0), (EList<HistoricalRawTrafficInclude>)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Boolean)arguments.get(6), (EList<TravelModeLabel>)arguments.get(7), (Boolean)arguments.get(8), (Boolean)arguments.get(9));
			case BikePackage.BIKE_OPEN_API_CLIENT___GET_AGGREGATED_TRAFFIC__BIGINTEGER_ELIST_STRING_STRING_STRING_STRING_GRANULARITY_HISTORICALAGGREGATEDTRAFFICGROUPBY_BOOLEAN_ELIST_BOOLEAN_BOOLEAN:
				return GetAggregatedTraffic((BigInteger)arguments.get(0), (EList<HistoricalAggregatedTrafficInclude>)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Granularity)arguments.get(6), (HistoricalAggregatedTrafficGroupBy)arguments.get(7), (Boolean)arguments.get(8), (EList<TravelModeLabel>)arguments.get(9), (Boolean)arguments.get(10), (Boolean)arguments.get(11));
			case BikePackage.BIKE_OPEN_API_CLIENT___GET_TIMESTAMP_TRAFFIC__BIGINTEGER_STRING_STRING_STRING_STRING_ELIST_ELIST:
				return GetTimestampTraffic((BigInteger)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (EList<TravelModeLabel>)arguments.get(5), (EList<Direction>)arguments.get(6));
			case BikePackage.BIKE_OPEN_API_CLIENT___VALIDATION_JOBS_GET__INTEGER_INTEGER:
				return ValidationJobsGet((Integer)arguments.get(0), (Integer)arguments.get(1));
			case BikePackage.BIKE_OPEN_API_CLIENT___VALIDATION_JOB_CREATE__VALIDATIONJOBCREATE_REQUEST:
				return ValidationJobCreate((ValidationJobCreate_request)arguments.get(0));
			case BikePackage.BIKE_OPEN_API_CLIENT___VALIDATION_JOB_GET__INTEGER:
				return ValidationJobGet((Integer)arguments.get(0));
			case BikePackage.BIKE_OPEN_API_CLIENT___TO_QUERY_STRING__STRING_OBJECT:
				return toQueryString((String)arguments.get(0), arguments.get(1));
			case BikePackage.BIKE_OPEN_API_CLIENT___GET__STRING_ECLASS_EMAP_EMAP:
				return _get((String)arguments.get(0), (EClass)arguments.get(1), (EMap<String, String>)arguments.get(2), (EMap<String, String>)arguments.get(3));
			case BikePackage.BIKE_OPEN_API_CLIENT___DELETE__STRING_ECLASS_EMAP_EMAP:
				return _delete((String)arguments.get(0), (EClass)arguments.get(1), (EMap<String, String>)arguments.get(2), (EMap<String, String>)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BikeOpenApiClientImpl
