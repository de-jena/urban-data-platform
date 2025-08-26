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
package de.jena.model.glt.impl;

import de.jena.model.glt.AlarmRequest;
import de.jena.model.glt.CalenderEventRequest;
import de.jena.model.glt.CommentRequest;
import de.jena.model.glt.EntityRequest;
import de.jena.model.glt.GltOpenApiClient;
import de.jena.model.glt.GltPackage;
import de.jena.model.glt.InstructionsPojo;
import de.jena.model.glt.PointRecord;
import de.jena.model.glt.Response;
import de.jena.model.glt.StatusLogRequest;
import de.jena.model.glt.SystemDescriptionRequest;
import de.jena.model.glt.TextRequest;
import de.jena.model.glt.TimeScheduleRecord;
import de.jena.model.glt.UpdateStateRequest;

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
public abstract class GltOpenApiClientImpl extends MinimalEObjectImpl.Container implements GltOpenApiClient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GltOpenApiClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getGltOpenApiClient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response bulkTextUpdate(String type, Integer id, EList<String> request) {
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
	public Response getAlarm(final String id, final Boolean create) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/alarms/{id}";
		EClass resultEClass = GltPackage.eINSTANCE.getAlarmPojo();
		pathParameter.put("id", toQueryString("id",id));
		if ( null != create ) queryParameter.put("create", toQueryString("create",create));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response updateAlarm(String id, AlarmRequest request) {
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
	public Response createAlarm(String id, AlarmRequest request) {
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
	public Response getAlarmIds(final String regex) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/alarms/ids";
		EClass resultEClass = GltPackage.eINSTANCE.getLinkedIdString();
		if ( null != regex ) queryParameter.put("regex", toQueryString("regex",regex));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmInstructions(final String id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/alarms/instructions/{id}";
		EClass resultEClass = GltPackage.eINSTANCE.getInstructionsPojo();
		pathParameter.put("id", toQueryString("id",id));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response updateInstructions(String id, InstructionsPojo request) {
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
	public Response getAlarms(final EList<String> fields, final String regex) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/alarms";
		EClass resultEClass = GltPackage.eINSTANCE.getAlarmPojo();
		if ( null != fields ) queryParameter.put("fields", toQueryString("fields",fields));
		if ( null != regex ) queryParameter.put("regex", toQueryString("regex",regex));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response usage(final Integer id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/alarms/text/{id}";
		EClass resultEClass = GltPackage.eINSTANCE.getAlarmPojo();
		pathParameter.put("id", toQueryString("id",id));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response usageIds(final Integer id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/alarms/text/ids/{id}";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		pathParameter.put("id", toQueryString("id",id));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getEventsForAlarm(final String alarmId, final String type, final String from, final String to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/calendar/alarm/{alarmId}";
		EClass resultEClass = GltPackage.eINSTANCE.getCalendarEventPojo();
		pathParameter.put("alarmId", toQueryString("alarmId",alarmId));
		if ( null != type ) queryParameter.put("type", toQueryString("type",type));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response createEventForAlarm(String alarmId, CalenderEventRequest request) {
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
	public Response getEventsForSystem(final String systemId, final String type, final Boolean includeAlarms, final String from, final String to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/calendar/system/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getCalendarEventPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != type ) queryParameter.put("type", toQueryString("type",type));
		if ( null != includeAlarms ) queryParameter.put("includeAlarms", toQueryString("includeAlarms",includeAlarms));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response createEventForSystem(String systemId, CalenderEventRequest request) {
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
	public Response updateEvent(Integer id, CalenderEventRequest request) {
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
	public Response deleteEvent(final Integer id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/calendar/{id}";
		EClass resultEClass = null;
		pathParameter.put("id", toQueryString("id",id));
		return _delete(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getEvents(final EList<String> systemIds, final String type, final String from, final String to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/calendar";
		EClass resultEClass = GltPackage.eINSTANCE.getCalendarEventPojo();
		if ( null != systemIds ) queryParameter.put("systemIds", toQueryString("systemIds",systemIds));
		if ( null != type ) queryParameter.put("type", toQueryString("type",type));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getEventsAtTime(final EList<String> systemIds, final String time, final String type, final BigInteger grace) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/calendar/{time}";
		EClass resultEClass = GltPackage.eINSTANCE.getCalendarEventPojo();
		if ( null != systemIds ) queryParameter.put("systemIds", toQueryString("systemIds",systemIds));
		pathParameter.put("time", toQueryString("time",time));
		if ( null != type ) queryParameter.put("type", toQueryString("type",type));
		if ( null != grace ) queryParameter.put("grace", toQueryString("grace",grace));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getEventsForAlarm_1(final String alarmId, final String time, final String type, final BigInteger grace) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/calendar/alarm/{alarmId}/{time}";
		EClass resultEClass = GltPackage.eINSTANCE.getCalendarEventPojo();
		pathParameter.put("alarmId", toQueryString("alarmId",alarmId));
		pathParameter.put("time", toQueryString("time",time));
		if ( null != type ) queryParameter.put("type", toQueryString("type",type));
		if ( null != grace ) queryParameter.put("grace", toQueryString("grace",grace));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getEventsForSystem_1(final String systemId, final String time, final String type, final BigInteger grace, final Boolean includeAlarms) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/calendar/system/{systemId}/{time}";
		EClass resultEClass = GltPackage.eINSTANCE.getCalendarEventPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		pathParameter.put("time", toQueryString("time",time));
		if ( null != type ) queryParameter.put("type", toQueryString("type",type));
		if ( null != grace ) queryParameter.put("grace", toQueryString("grace",grace));
		if ( null != includeAlarms ) queryParameter.put("includeAlarms", toQueryString("includeAlarms",includeAlarms));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getForAlarm(final String ownerType, final BigInteger ownerId, final String type) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/comment/{ownerType}/{ownerId}";
		EClass resultEClass = GltPackage.eINSTANCE.getCommentPojo();
		pathParameter.put("ownerType", toQueryString("ownerType",ownerType));
		pathParameter.put("ownerId", toQueryString("ownerId",ownerId));
		if ( null != type ) queryParameter.put("type", toQueryString("type",type));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response createCommentForOwner(String ownerType, BigInteger ownerId, CommentRequest request) {
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
	public Response updateComment(Integer id, CommentRequest request) {
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
	public Response deleteComment(final Integer id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/comment/{id}";
		EClass resultEClass = null;
		pathParameter.put("id", toQueryString("id",id));
		return _delete(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getCommentedOn(final String ownerType, final String type, final String from, final String to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/comment/{ownerType}";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		pathParameter.put("ownerType", toQueryString("ownerType",ownerType));
		if ( null != type ) queryParameter.put("type", toQueryString("type",type));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getFiltered(final Integer offset, final Integer limit, final EList<String> ownerType, final EList<BigInteger> ownerId, final Boolean includeOwnerChildren, final EList<String> type, final EList<String> author, final EList<String> status, final String from, final String to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/comment/filter/{offset}-{limit}";
		EClass resultEClass = GltPackage.eINSTANCE.getCommentPojo();
		pathParameter.put("offset", toQueryString("offset",offset));
		pathParameter.put("limit", toQueryString("limit",limit));
		if ( null != ownerType ) queryParameter.put("ownerType", toQueryString("ownerType",ownerType));
		if ( null != ownerId ) queryParameter.put("ownerId", toQueryString("ownerId",ownerId));
		if ( null != includeOwnerChildren ) queryParameter.put("includeOwnerChildren", toQueryString("includeOwnerChildren",includeOwnerChildren));
		if ( null != type ) queryParameter.put("type", toQueryString("type",type));
		if ( null != author ) queryParameter.put("author", toQueryString("author",author));
		if ( null != status ) queryParameter.put("status", toQueryString("status",status));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getFilteredAuthors(final EList<String> ownerType, final EList<BigInteger> ownerId, final Boolean includeChildren, final EList<String> type, final EList<String> status, final String from, final String to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/comment/filter/authors";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		if ( null != ownerType ) queryParameter.put("ownerType", toQueryString("ownerType",ownerType));
		if ( null != ownerId ) queryParameter.put("ownerId", toQueryString("ownerId",ownerId));
		if ( null != includeChildren ) queryParameter.put("includeChildren", toQueryString("includeChildren",includeChildren));
		if ( null != type ) queryParameter.put("type", toQueryString("type",type));
		if ( null != status ) queryParameter.put("status", toQueryString("status",status));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getFilteredCount(final EList<String> ownerType, final EList<BigInteger> ownerId, final Boolean includeChildren, final EList<String> type, final EList<String> author, final EList<String> status, final String from, final String to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/comment/filter/count";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		if ( null != ownerType ) queryParameter.put("ownerType", toQueryString("ownerType",ownerType));
		if ( null != ownerId ) queryParameter.put("ownerId", toQueryString("ownerId",ownerId));
		if ( null != includeChildren ) queryParameter.put("includeChildren", toQueryString("includeChildren",includeChildren));
		if ( null != type ) queryParameter.put("type", toQueryString("type",type));
		if ( null != author ) queryParameter.put("author", toQueryString("author",author));
		if ( null != status ) queryParameter.put("status", toQueryString("status",status));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response updateStatus(Integer id, String request) {
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
	public Response getBuildingNames(final EList<BigInteger> buildingId) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/devices/buildings";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		if ( null != buildingId ) queryParameter.put("buildingId", toQueryString("buildingId",buildingId));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getDeviceName(final EList<BigInteger> deviceId) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/devices/devices";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		if ( null != deviceId ) queryParameter.put("deviceId", toQueryString("deviceId",deviceId));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getDevices() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/devices";
		EClass resultEClass = GltPackage.eINSTANCE.getDevicesCollectionPojo();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getDevicesCount() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/devices/count";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getDevicesFlat() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/devices/flat";
		EClass resultEClass = GltPackage.eINSTANCE.getDeviceAdapterPojo();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmsWithMismatchedSystems() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/meta/diag/alarms/mismatched";
		EClass resultEClass = GltPackage.eINSTANCE.getAlarmLogPojo();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAuditLog(final Integer limit, final Integer offset) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/meta/audit";
		EClass resultEClass = GltPackage.eINSTANCE.getChangeItem();
		if ( null != limit ) queryParameter.put("limit", toQueryString("limit",limit));
		if ( null != offset ) queryParameter.put("offset", toQueryString("offset",offset));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAuditLogCount() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/meta/audit/count";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getDuplicateTexts() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/meta/diag/texts/duplicate";
		EClass resultEClass = null;
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getFields(final Boolean importableOnly) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/meta/csv/fields";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		if ( null != importableOnly ) queryParameter.put("importableOnly", toQueryString("importableOnly",importableOnly));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getUndocumentedAlarms() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/meta/diag/alarms/undocumented";
		EClass resultEClass = GltPackage.eINSTANCE.getAlarmLogPojo();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getUnusedTexts() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/meta/diag/texts/unused";
		EClass resultEClass = null;
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response importFromCsv(EList<String> fields, String delimiter, Boolean dryRun, String request) {
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
	public Response getDatalogContent(final Integer systemId, final EList<Integer> id, final String from, final String to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/datalogs/content/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getDatalogContentPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != id ) queryParameter.put("id", toQueryString("id",id));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getDatalogInfo(final Integer systemId, final EList<Integer> id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/datalogs/info/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getDatalogContentPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != id ) queryParameter.put("id", toQueryString("id",id));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response updateDatalogContent(Integer systemId, EList<Integer> id) {
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
	public Response getAuthors(final EList<Integer> systemIds, final EList<Integer> identifiers, final Boolean external, final String from, final String to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/points/history/authors";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		if ( null != systemIds ) queryParameter.put("systemIds", toQueryString("systemIds",systemIds));
		if ( null != identifiers ) queryParameter.put("identifiers", toQueryString("identifiers",identifiers));
		if ( null != external ) queryParameter.put("external", toQueryString("external",external));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getChangelog(final Integer offset, final Integer limit, final EList<Integer> systemIds, final Boolean external, final EList<String> author, final String from, final String to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/points/history/{offset}-{limit}";
		EClass resultEClass = GltPackage.eINSTANCE.getPointValuePojo();
		pathParameter.put("offset", toQueryString("offset",offset));
		pathParameter.put("limit", toQueryString("limit",limit));
		if ( null != systemIds ) queryParameter.put("systemIds", toQueryString("systemIds",systemIds));
		if ( null != external ) queryParameter.put("external", toQueryString("external",external));
		if ( null != author ) queryParameter.put("author", toQueryString("author",author));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getChangelogCount(final EList<Integer> systemIds, final Boolean external, final EList<String> author, final String from, final String to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/points/history/count";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		if ( null != systemIds ) queryParameter.put("systemIds", toQueryString("systemIds",systemIds));
		if ( null != external ) queryParameter.put("external", toQueryString("external",external));
		if ( null != author ) queryParameter.put("author", toQueryString("author",author));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getPointValueHistory(final Integer systemId, final EList<Integer> id, final Boolean latestOnly, final Boolean includeComments) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/points/history/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getPointValuePojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != id ) queryParameter.put("id", toQueryString("id",id));
		if ( null != latestOnly ) queryParameter.put("latestOnly", toQueryString("latestOnly",latestOnly));
		if ( null != includeComments ) queryParameter.put("includeComments", toQueryString("includeComments",includeComments));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getPointValues(final Integer systemId, final String type, final String valueType, final EList<Integer> id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/points/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getPointValuePojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != type ) queryParameter.put("type", toQueryString("type",type));
		if ( null != valueType ) queryParameter.put("valueType", toQueryString("valueType",valueType));
		if ( null != id ) queryParameter.put("id", toQueryString("id",id));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response updatePointValues(Integer systemId, EList<Integer> id) {
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
	public Response getAlarmCount(final EList<String> alarmId, final BigInteger from, final BigInteger to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/alarms/count";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		if ( null != alarmId ) queryParameter.put("alarmId", toQueryString("alarmId",alarmId));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmCountPost(BigInteger from, BigInteger to, EList<String> request) {
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
	public Response getAlarmCount_1(final String systemId, final String state, final EList<String> eventType, final EList<Integer> flags) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/alarms/{systemId}/state/{state}/count";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		pathParameter.put("state", toQueryString("state",state));
		if ( null != eventType ) queryParameter.put("eventType", toQueryString("eventType",eventType));
		if ( null != flags ) queryParameter.put("flags", toQueryString("flags",flags));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmCountByState(final String systemId, final EList<String> eventType, final EList<Integer> flags) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/alarms/{systemId}/state/count";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != eventType ) queryParameter.put("eventType", toQueryString("eventType",eventType));
		if ( null != flags ) queryParameter.put("flags", toQueryString("flags",flags));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmCountByState_1(final EList<String> systemIds, final EList<String> eventType, final EList<Integer> flags) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/alarms/state/count";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		if ( null != systemIds ) queryParameter.put("systemIds", toQueryString("systemIds",systemIds));
		if ( null != eventType ) queryParameter.put("eventType", toQueryString("eventType",eventType));
		if ( null != flags ) queryParameter.put("flags", toQueryString("flags",flags));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmCountByStateAndSystem(final EList<String> systemIds, final EList<String> eventType, final EList<Integer> flags) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/alarms/state/systemIds/count";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		if ( null != systemIds ) queryParameter.put("systemIds", toQueryString("systemIds",systemIds));
		if ( null != eventType ) queryParameter.put("eventType", toQueryString("eventType",eventType));
		if ( null != flags ) queryParameter.put("flags", toQueryString("flags",flags));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmCountForSystem(final String systemId, final EList<String> eventType, final EList<Integer> flags) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/alarms/{systemId}/count";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != eventType ) queryParameter.put("eventType", toQueryString("eventType",eventType));
		if ( null != flags ) queryParameter.put("flags", toQueryString("flags",flags));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmForStateCount(final String state, final EList<String> eventType, final EList<Integer> flags) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/alarms/state/{state}/count";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		pathParameter.put("state", toQueryString("state",state));
		if ( null != eventType ) queryParameter.put("eventType", toQueryString("eventType",eventType));
		if ( null != flags ) queryParameter.put("flags", toQueryString("flags",flags));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmLogTimeline(final String alarmId, final BigInteger from, final BigInteger to, final Integer limit, final Integer offset) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/timeline/alarm/{alarmId}";
		EClass resultEClass = GltPackage.eINSTANCE.getAlarmLogTimelinePojo();
		pathParameter.put("alarmId", toQueryString("alarmId",alarmId));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		if ( null != limit ) queryParameter.put("limit", toQueryString("limit",limit));
		if ( null != offset ) queryParameter.put("offset", toQueryString("offset",offset));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmLogTimelineStatistics(final String alarmId, final BigInteger from, final BigInteger to, final String unit, final String timezone) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/timeline/alarm/{alarmId}/statistics";
		EClass resultEClass = GltPackage.eINSTANCE.getStatisticEntry();
		pathParameter.put("alarmId", toQueryString("alarmId",alarmId));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		if ( null != unit ) queryParameter.put("unit", toQueryString("unit",unit));
		if ( null != timezone ) queryParameter.put("timezone", toQueryString("timezone",timezone));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmLogs(final EList<String> eventType, final EList<Integer> flags) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/alarms";
		EClass resultEClass = GltPackage.eINSTANCE.getAlarmLogPojo();
		if ( null != eventType ) queryParameter.put("eventType", toQueryString("eventType",eventType));
		if ( null != flags ) queryParameter.put("flags", toQueryString("flags",flags));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmLogs_1(final String systemId, final EList<String> eventType, final EList<Integer> flags) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/alarms/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getAlarmLogPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != eventType ) queryParameter.put("eventType", toQueryString("eventType",eventType));
		if ( null != flags ) queryParameter.put("flags", toQueryString("flags",flags));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmLogsForState(final String state, final EList<String> eventType, final EList<Integer> flags) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/alarms/state/{state}";
		EClass resultEClass = GltPackage.eINSTANCE.getAlarmLogPojo();
		pathParameter.put("state", toQueryString("state",state));
		if ( null != eventType ) queryParameter.put("eventType", toQueryString("eventType",eventType));
		if ( null != flags ) queryParameter.put("flags", toQueryString("flags",flags));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmLogsForStates(final EList<String> state, final EList<String> eventType, final EList<Integer> flags) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/alarms/state";
		EClass resultEClass = GltPackage.eINSTANCE.getAlarmLogPojo();
		if ( null != state ) queryParameter.put("state", toQueryString("state",state));
		if ( null != eventType ) queryParameter.put("eventType", toQueryString("eventType",eventType));
		if ( null != flags ) queryParameter.put("flags", toQueryString("flags",flags));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmLogsTimeline(final String systemId, final BigInteger from, final BigInteger to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/timeline/system/{systemId}";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmsForState(final String systemId, final String state, final EList<String> eventType, final EList<Integer> flags) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/alarms/{systemId}/state/{state}";
		EClass resultEClass = GltPackage.eINSTANCE.getAlarmLogPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		pathParameter.put("state", toQueryString("state",state));
		if ( null != eventType ) queryParameter.put("eventType", toQueryString("eventType",eventType));
		if ( null != flags ) queryParameter.put("flags", toQueryString("flags",flags));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAlarmsForStates(final String systemId, final EList<String> state, final EList<String> eventType, final EList<Integer> flags) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/alarms/{systemId}/state";
		EClass resultEClass = GltPackage.eINSTANCE.getAlarmLogPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != state ) queryParameter.put("state", toQueryString("state",state));
		if ( null != eventType ) queryParameter.put("eventType", toQueryString("eventType",eventType));
		if ( null != flags ) queryParameter.put("flags", toQueryString("flags",flags));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getEntityMonitoring(final Integer systemId) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/entities/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getEntityMonitoringSettingsPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getEntityMonitoring_1(final Integer systemId, final String type) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/entities/{systemId}/{type}";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		pathParameter.put("type", toQueryString("type",type));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response updateEntityMonitoring(Integer systemId, String type, Integer identifier, String name, Boolean isIncluded) {
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
	public Response getLog(final String systemId) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/logs/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getSyncLogPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getLogs() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/logs";
		EClass resultEClass = GltPackage.eINSTANCE.getSyncLogPojo();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getLogsForState(final String state) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/logs/state/{state}";
		EClass resultEClass = GltPackage.eINSTANCE.getSyncLogPojo();
		pathParameter.put("state", toQueryString("state",state));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getStatistics(final String systemId) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/statistics/{systemId}";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getStatusLogs() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/status";
		EClass resultEClass = GltPackage.eINSTANCE.getStatusLogPojo();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response upsertStatusLog(StatusLogRequest request) {
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
	public Response getStatusLogs_1(final String systemId) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/status/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getStatusLogPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getStatusLogsTimeline(final String systemId, final BigInteger from, final BigInteger to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/timeline/status/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getStatusLogPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getTracked(final String systemId) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/tracked/{systemId}";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response isFlaky(final String systemId, final String alarmId, final BigInteger from, final BigInteger to, final Integer threshold) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/flaky/{systemId}/{alarmId}";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		pathParameter.put("alarmId", toQueryString("alarmId",alarmId));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		if ( null != threshold ) queryParameter.put("threshold", toQueryString("threshold",threshold));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response logsForStates(final EList<String> state) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/logs/state";
		EClass resultEClass = GltPackage.eINSTANCE.getSyncLogPojo();
		if ( null != state ) queryParameter.put("state", toQueryString("state",state));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response refreshSystem(String systemId) {
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
	public Response updateAlarmState(String systemId, UpdateStateRequest request) {
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
	public Response getAuthors_1(final EList<Integer> systemIds, final EList<Integer> identifiers, final Boolean external, final String from, final String to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/timeschedule/block/history/authors";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		if ( null != systemIds ) queryParameter.put("systemIds", toQueryString("systemIds",systemIds));
		if ( null != identifiers ) queryParameter.put("identifiers", toQueryString("identifiers",identifiers));
		if ( null != external ) queryParameter.put("external", toQueryString("external",external));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getChangelog_1(final Integer offset, final Integer limit, final EList<Integer> systemIds, final Boolean external, final EList<String> author, final String from, final String to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/timeschedule/block/history/{offset}-{limit}";
		EClass resultEClass = GltPackage.eINSTANCE.getTimeScheduleBlockPojo();
		pathParameter.put("offset", toQueryString("offset",offset));
		pathParameter.put("limit", toQueryString("limit",limit));
		if ( null != systemIds ) queryParameter.put("systemIds", toQueryString("systemIds",systemIds));
		if ( null != external ) queryParameter.put("external", toQueryString("external",external));
		if ( null != author ) queryParameter.put("author", toQueryString("author",author));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getChangelogCount_1(final EList<Integer> systemIds, final Boolean external, final EList<String> author, final String from, final String to) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/timeschedule/block/history/count";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		if ( null != systemIds ) queryParameter.put("systemIds", toQueryString("systemIds",systemIds));
		if ( null != external ) queryParameter.put("external", toQueryString("external",external));
		if ( null != author ) queryParameter.put("author", toQueryString("author",author));
		if ( null != from ) queryParameter.put("from", toQueryString("from",from));
		if ( null != to ) queryParameter.put("to", toQueryString("to",to));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getTimeScheduleBlockHistory(final Integer systemId, final EList<Integer> id, final Boolean latestOnly) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/timeschedule/block/history/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getTimeScheduleBlockPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != id ) queryParameter.put("id", toQueryString("id",id));
		if ( null != latestOnly ) queryParameter.put("latestOnly", toQueryString("latestOnly",latestOnly));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getTimeScheduleBlocks(final Integer systemId, final EList<Integer> id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/timeschedule/block/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getTimeScheduleBlockPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != id ) queryParameter.put("id", toQueryString("id",id));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response updateTimeScheduleBlocks(Integer systemId, EList<Integer> id) {
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
	public Response getTimeScheduleStateHistory(final Integer systemId, final EList<Integer> id, final Boolean latestOnly) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/timeschedule/state/history/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getTimeScheduleStatePojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != id ) queryParameter.put("id", toQueryString("id",id));
		if ( null != latestOnly ) queryParameter.put("latestOnly", toQueryString("latestOnly",latestOnly));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getTimeScheduleStates(final Integer systemId, final EList<Integer> id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/timeschedule/state/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getTimeScheduleStatePojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != id ) queryParameter.put("id", toQueryString("id",id));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response updateTimeScheduleStates(Integer systemId, EList<Integer> id) {
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
	public Response getVersion(final Integer systemId, final EList<Integer> id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/monitoring/version/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getVersionInfo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != id ) queryParameter.put("id", toQueryString("id",id));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response point(PointRecord request) {
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
	public Response timeschedule(TimeScheduleRecord request) {
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
	public Response get(final String key) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/conf/{key}";
		EClass resultEClass = GltPackage.eINSTANCE.getJsonNode();
		pathParameter.put("key", toQueryString("key",key));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response createOrUpdate(String key, String request) {
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
	public Response create(String key, String request) {
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
	public Response delete(final String key) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/conf/{key}";
		EClass resultEClass = null;
		pathParameter.put("key", toQueryString("key",key));
		return _delete(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAllSettings() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/conf";
		EClass resultEClass = GltPackage.eINSTANCE.getJsonNode();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getAuthStatus() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/status/auth";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getStatus() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/status";
		EClass resultEClass = org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getSystem(final String id, final Boolean shallow) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/systems/{id}";
		EClass resultEClass = GltPackage.eINSTANCE.getSystemDescriptionPojo();
		pathParameter.put("id", toQueryString("id",id));
		if ( null != shallow ) queryParameter.put("shallow", toQueryString("shallow",shallow));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response updateSystem(String id, SystemDescriptionRequest request) {
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
	public Response createSystemDescription(String id, SystemDescriptionRequest request) {
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
	public Response deleteSystem(final String id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/systems/{id}";
		EClass resultEClass = null;
		pathParameter.put("id", toQueryString("id",id));
		return _delete(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getContacts(final String id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/systems/contacts/{id}";
		EClass resultEClass = GltPackage.eINSTANCE.getContactPojo();
		pathParameter.put("id", toQueryString("id",id));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getContracts(final String id, final String type, final Boolean activeOnly) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/systems/contracts/{id}";
		EClass resultEClass = GltPackage.eINSTANCE.getContractPojo();
		pathParameter.put("id", toQueryString("id",id));
		if ( null != type ) queryParameter.put("type", toQueryString("type",type));
		if ( null != activeOnly ) queryParameter.put("activeOnly", toQueryString("activeOnly",activeOnly));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getSystemIds(final Boolean excluded) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/systems/ids";
		EClass resultEClass = GltPackage.eINSTANCE.getLinkedIdString();
		if ( null != excluded ) queryParameter.put("excluded", toQueryString("excluded",excluded));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getSystems(final Boolean excluded) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/systems";
		EClass resultEClass = GltPackage.eINSTANCE.getSystemDescriptionPojo();
		if ( null != excluded ) queryParameter.put("excluded", toQueryString("excluded",excluded));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getTechFacilities(final String id, final String type, final Boolean activeOnly) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/systems/facilities/{id}";
		EClass resultEClass = GltPackage.eINSTANCE.getTechFacilityPojo();
		pathParameter.put("id", toQueryString("id",id));
		if ( null != type ) queryParameter.put("type", toQueryString("type",type));
		if ( null != activeOnly ) queryParameter.put("activeOnly", toQueryString("activeOnly",activeOnly));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getEntities(EList<EntityRequest> request) {
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
	public Response getEntitiesByType(final Integer systemId, final String type, final EList<Integer> id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/system/entities/{systemId}/{type}";
		EClass resultEClass = GltPackage.eINSTANCE.getEntityPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		pathParameter.put("type", toQueryString("type",type));
		if ( null != id ) queryParameter.put("id", toQueryString("id",id));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getEntitiesByTypes(final Integer systemId, final EList<String> type, final EList<Integer> id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/system/entities/{systemId}/types";
		EClass resultEClass = GltPackage.eINSTANCE.getEntityPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != type ) queryParameter.put("type", toQueryString("type",type));
		if ( null != id ) queryParameter.put("id", toQueryString("id",id));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getSystemEntities(final Integer systemId, final Integer depth) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/system/entities/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getCylonNetworkPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != depth ) queryParameter.put("depth", toQueryString("depth",depth));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getSystemEntity(final Integer systemId, final String type, final Integer id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/system/entities/{systemId}/{type}/{id}";
		EClass resultEClass = GltPackage.eINSTANCE.getEntityPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		pathParameter.put("type", toQueryString("type",type));
		pathParameter.put("id", toQueryString("id",id));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response importSystems(Boolean cleanUp, Boolean dryRun, Boolean skipIp, Boolean skipName) {
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
	public Response cleanupTexts() {
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
	public Response createText(TextRequest request) {
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
	public Response getText(final Integer id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/texts/{id}";
		EClass resultEClass = GltPackage.eINSTANCE.getText();
		pathParameter.put("id", toQueryString("id",id));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response updateText(Integer id, TextRequest request) {
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
	public Response deleteText(final Integer id) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/texts/{id}";
		EClass resultEClass = null;
		pathParameter.put("id", toQueryString("id",id));
		return _delete(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getTextIds() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/texts/ids";
		EClass resultEClass = GltPackage.eINSTANCE.getLinkedIdInteger();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getTextIds_1(final String type) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/texts/ids/of/{type}";
		EClass resultEClass = GltPackage.eINSTANCE.getLinkedIdInteger();
		pathParameter.put("type", toQueryString("type",type));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getTexts() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/texts";
		EClass resultEClass = GltPackage.eINSTANCE.getText();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getTexts_1(final String type) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/texts/of/{type}";
		EClass resultEClass = GltPackage.eINSTANCE.getText();
		pathParameter.put("type", toQueryString("type",type));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getGroups() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/useradmin/groups";
		EClass resultEClass = GltPackage.eINSTANCE.getRolePojo();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response addGroup(String request) {
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
	public Response addMemberToGroup(String groupName, String request) {
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
	public Response addPropertyToRole(String roleName, String key, String request) {
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
	public Response removePropertyFromRole(final String roleName, final String key) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/useradmin/roles/{roleName}/properties/{key}";
		EClass resultEClass = GltPackage.eINSTANCE.getRolePojo();
		pathParameter.put("roleName", toQueryString("roleName",roleName));
		pathParameter.put("key", toQueryString("key",key));
		return _delete(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getUsers() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/useradmin/users";
		EClass resultEClass = GltPackage.eINSTANCE.getRolePojo();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response addUser(String request) {
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
	public Response currentRole() {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/useradmin";
		EClass resultEClass = GltPackage.eINSTANCE.getRolePojo();
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getRole(final String identifier, final Boolean mandatory, final Boolean discovery) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/useradmin/{identifier}";
		EClass resultEClass = GltPackage.eINSTANCE.getRolePojo();
		pathParameter.put("identifier", toQueryString("identifier",identifier));
		if ( null != mandatory ) queryParameter.put("mandatory", toQueryString("mandatory",mandatory));
		if ( null != discovery ) queryParameter.put("discovery", toQueryString("discovery",discovery));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response removeMemberFromGroup(final String groupName, final String roleName) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/useradmin/groups/{groupName}/members/{roleName}";
		EClass resultEClass = GltPackage.eINSTANCE.getRolePojo();
		pathParameter.put("groupName", toQueryString("groupName",groupName));
		pathParameter.put("roleName", toQueryString("roleName",roleName));
		return _delete(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response removeRole(final String name) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/useradmin/{name}";
		EClass resultEClass = null;
		pathParameter.put("name", toQueryString("name",name));
		return _delete(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response updateSuspect(String systemId, String alarmId) {
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
	public Response deleteSuspect(final String systemId, final String alarmId) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/watcher/suspects/{systemId}.{alarmId}";
		EClass resultEClass = null;
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		pathParameter.put("alarmId", toQueryString("alarmId",alarmId));
		return _delete(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getSuspects(final EList<String> eventType, final EList<Integer> flags, final Boolean recognized) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/watcher/suspects";
		EClass resultEClass = GltPackage.eINSTANCE.getSuspectPojo();
		if ( null != eventType ) queryParameter.put("eventType", toQueryString("eventType",eventType));
		if ( null != flags ) queryParameter.put("flags", toQueryString("flags",flags));
		if ( null != recognized ) queryParameter.put("recognized", toQueryString("recognized",recognized));
		return _get(endpoint, resultEClass ,org.eclipse.emf.common.util.ECollections.asEMap(pathParameter), org.eclipse.emf.common.util.ECollections.asEMap(queryParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response getSuspects_1(final String systemId, final EList<String> eventType, final EList<Integer> flags, final Boolean recognized) {
		java.util.HashMap<String, String> queryParameter = new java.util.HashMap<>();
		java.util.HashMap<String, String> pathParameter = new java.util.HashMap<>();
		String endpoint = "/watcher/suspects/{systemId}";
		EClass resultEClass = GltPackage.eINSTANCE.getSuspectPojo();
		pathParameter.put("systemId", toQueryString("systemId",systemId));
		if ( null != eventType ) queryParameter.put("eventType", toQueryString("eventType",eventType));
		if ( null != flags ) queryParameter.put("flags", toQueryString("flags",flags));
		if ( null != recognized ) queryParameter.put("recognized", toQueryString("recognized",recognized));
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
			case GltPackage.GLT_OPEN_API_CLIENT___BULK_TEXT_UPDATE__STRING_INTEGER_ELIST:
				return bulkTextUpdate((String)arguments.get(0), (Integer)arguments.get(1), (EList<String>)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM__STRING_BOOLEAN:
				return getAlarm((String)arguments.get(0), (Boolean)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___UPDATE_ALARM__STRING_ALARMREQUEST:
				return updateAlarm((String)arguments.get(0), (AlarmRequest)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___CREATE_ALARM__STRING_ALARMREQUEST:
				return createAlarm((String)arguments.get(0), (AlarmRequest)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_IDS__STRING:
				return getAlarmIds((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_INSTRUCTIONS__STRING:
				return getAlarmInstructions((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___UPDATE_INSTRUCTIONS__STRING_INSTRUCTIONSPOJO:
				return updateInstructions((String)arguments.get(0), (InstructionsPojo)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARMS__ELIST_STRING:
				return getAlarms((EList<String>)arguments.get(0), (String)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___USAGE__INTEGER:
				return usage((Integer)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___USAGE_IDS__INTEGER:
				return usageIds((Integer)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_EVENTS_FOR_ALARM__STRING_STRING_STRING_STRING:
				return getEventsForAlarm((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case GltPackage.GLT_OPEN_API_CLIENT___CREATE_EVENT_FOR_ALARM__STRING_CALENDEREVENTREQUEST:
				return createEventForAlarm((String)arguments.get(0), (CalenderEventRequest)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_EVENTS_FOR_SYSTEM__STRING_STRING_BOOLEAN_STRING_STRING:
				return getEventsForSystem((String)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case GltPackage.GLT_OPEN_API_CLIENT___CREATE_EVENT_FOR_SYSTEM__STRING_CALENDEREVENTREQUEST:
				return createEventForSystem((String)arguments.get(0), (CalenderEventRequest)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___UPDATE_EVENT__INTEGER_CALENDEREVENTREQUEST:
				return updateEvent((Integer)arguments.get(0), (CalenderEventRequest)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___DELETE_EVENT__INTEGER:
				return deleteEvent((Integer)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_EVENTS__ELIST_STRING_STRING_STRING:
				return getEvents((EList<String>)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_EVENTS_AT_TIME__ELIST_STRING_STRING_BIGINTEGER:
				return getEventsAtTime((EList<String>)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (BigInteger)arguments.get(3));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_EVENTS_FOR_ALARM_1__STRING_STRING_STRING_BIGINTEGER:
				return getEventsForAlarm_1((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (BigInteger)arguments.get(3));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_EVENTS_FOR_SYSTEM_1__STRING_STRING_STRING_BIGINTEGER_BOOLEAN:
				return getEventsForSystem_1((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (BigInteger)arguments.get(3), (Boolean)arguments.get(4));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_FOR_ALARM__STRING_BIGINTEGER_STRING:
				return getForAlarm((String)arguments.get(0), (BigInteger)arguments.get(1), (String)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___CREATE_COMMENT_FOR_OWNER__STRING_BIGINTEGER_COMMENTREQUEST:
				return createCommentForOwner((String)arguments.get(0), (BigInteger)arguments.get(1), (CommentRequest)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___UPDATE_COMMENT__INTEGER_COMMENTREQUEST:
				return updateComment((Integer)arguments.get(0), (CommentRequest)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___DELETE_COMMENT__INTEGER:
				return deleteComment((Integer)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_COMMENTED_ON__STRING_STRING_STRING_STRING:
				return getCommentedOn((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_FILTERED__INTEGER_INTEGER_ELIST_ELIST_BOOLEAN_ELIST_ELIST_ELIST_STRING_STRING:
				return getFiltered((Integer)arguments.get(0), (Integer)arguments.get(1), (EList<String>)arguments.get(2), (EList<BigInteger>)arguments.get(3), (Boolean)arguments.get(4), (EList<String>)arguments.get(5), (EList<String>)arguments.get(6), (EList<String>)arguments.get(7), (String)arguments.get(8), (String)arguments.get(9));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_FILTERED_AUTHORS__ELIST_ELIST_BOOLEAN_ELIST_ELIST_STRING_STRING:
				return getFilteredAuthors((EList<String>)arguments.get(0), (EList<BigInteger>)arguments.get(1), (Boolean)arguments.get(2), (EList<String>)arguments.get(3), (EList<String>)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_FILTERED_COUNT__ELIST_ELIST_BOOLEAN_ELIST_ELIST_ELIST_STRING_STRING:
				return getFilteredCount((EList<String>)arguments.get(0), (EList<BigInteger>)arguments.get(1), (Boolean)arguments.get(2), (EList<String>)arguments.get(3), (EList<String>)arguments.get(4), (EList<String>)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7));
			case GltPackage.GLT_OPEN_API_CLIENT___UPDATE_STATUS__INTEGER_STRING:
				return updateStatus((Integer)arguments.get(0), (String)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_BUILDING_NAMES__ELIST:
				return getBuildingNames((EList<BigInteger>)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_DEVICE_NAME__ELIST:
				return getDeviceName((EList<BigInteger>)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_DEVICES:
				return getDevices();
			case GltPackage.GLT_OPEN_API_CLIENT___GET_DEVICES_COUNT:
				return getDevicesCount();
			case GltPackage.GLT_OPEN_API_CLIENT___GET_DEVICES_FLAT:
				return getDevicesFlat();
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARMS_WITH_MISMATCHED_SYSTEMS:
				return getAlarmsWithMismatchedSystems();
			case GltPackage.GLT_OPEN_API_CLIENT___GET_AUDIT_LOG__INTEGER_INTEGER:
				return getAuditLog((Integer)arguments.get(0), (Integer)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_AUDIT_LOG_COUNT:
				return getAuditLogCount();
			case GltPackage.GLT_OPEN_API_CLIENT___GET_DUPLICATE_TEXTS:
				return getDuplicateTexts();
			case GltPackage.GLT_OPEN_API_CLIENT___GET_FIELDS__BOOLEAN:
				return getFields((Boolean)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_UNDOCUMENTED_ALARMS:
				return getUndocumentedAlarms();
			case GltPackage.GLT_OPEN_API_CLIENT___GET_UNUSED_TEXTS:
				return getUnusedTexts();
			case GltPackage.GLT_OPEN_API_CLIENT___IMPORT_FROM_CSV__ELIST_STRING_BOOLEAN_STRING:
				return importFromCsv((EList<String>)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2), (String)arguments.get(3));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_DATALOG_CONTENT__INTEGER_ELIST_STRING_STRING:
				return getDatalogContent((Integer)arguments.get(0), (EList<Integer>)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_DATALOG_INFO__INTEGER_ELIST:
				return getDatalogInfo((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___UPDATE_DATALOG_CONTENT__INTEGER_ELIST:
				return updateDatalogContent((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_AUTHORS__ELIST_ELIST_BOOLEAN_STRING_STRING:
				return getAuthors((EList<Integer>)arguments.get(0), (EList<Integer>)arguments.get(1), (Boolean)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_CHANGELOG__INTEGER_INTEGER_ELIST_BOOLEAN_ELIST_STRING_STRING:
				return getChangelog((Integer)arguments.get(0), (Integer)arguments.get(1), (EList<Integer>)arguments.get(2), (Boolean)arguments.get(3), (EList<String>)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_CHANGELOG_COUNT__ELIST_BOOLEAN_ELIST_STRING_STRING:
				return getChangelogCount((EList<Integer>)arguments.get(0), (Boolean)arguments.get(1), (EList<String>)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_POINT_VALUE_HISTORY__INTEGER_ELIST_BOOLEAN_BOOLEAN:
				return getPointValueHistory((Integer)arguments.get(0), (EList<Integer>)arguments.get(1), (Boolean)arguments.get(2), (Boolean)arguments.get(3));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_POINT_VALUES__INTEGER_STRING_STRING_ELIST:
				return getPointValues((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (EList<Integer>)arguments.get(3));
			case GltPackage.GLT_OPEN_API_CLIENT___UPDATE_POINT_VALUES__INTEGER_ELIST:
				return updatePointValues((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_COUNT__ELIST_BIGINTEGER_BIGINTEGER:
				return getAlarmCount((EList<String>)arguments.get(0), (BigInteger)arguments.get(1), (BigInteger)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_COUNT_POST__BIGINTEGER_BIGINTEGER_ELIST:
				return getAlarmCountPost((BigInteger)arguments.get(0), (BigInteger)arguments.get(1), (EList<String>)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_COUNT_1__STRING_STRING_ELIST_ELIST:
				return getAlarmCount_1((String)arguments.get(0), (String)arguments.get(1), (EList<String>)arguments.get(2), (EList<Integer>)arguments.get(3));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_COUNT_BY_STATE__STRING_ELIST_ELIST:
				return getAlarmCountByState((String)arguments.get(0), (EList<String>)arguments.get(1), (EList<Integer>)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_COUNT_BY_STATE_1__ELIST_ELIST_ELIST:
				return getAlarmCountByState_1((EList<String>)arguments.get(0), (EList<String>)arguments.get(1), (EList<Integer>)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_COUNT_BY_STATE_AND_SYSTEM__ELIST_ELIST_ELIST:
				return getAlarmCountByStateAndSystem((EList<String>)arguments.get(0), (EList<String>)arguments.get(1), (EList<Integer>)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_COUNT_FOR_SYSTEM__STRING_ELIST_ELIST:
				return getAlarmCountForSystem((String)arguments.get(0), (EList<String>)arguments.get(1), (EList<Integer>)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_FOR_STATE_COUNT__STRING_ELIST_ELIST:
				return getAlarmForStateCount((String)arguments.get(0), (EList<String>)arguments.get(1), (EList<Integer>)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_LOG_TIMELINE__STRING_BIGINTEGER_BIGINTEGER_INTEGER_INTEGER:
				return getAlarmLogTimeline((String)arguments.get(0), (BigInteger)arguments.get(1), (BigInteger)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_LOG_TIMELINE_STATISTICS__STRING_BIGINTEGER_BIGINTEGER_STRING_STRING:
				return getAlarmLogTimelineStatistics((String)arguments.get(0), (BigInteger)arguments.get(1), (BigInteger)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_LOGS__ELIST_ELIST:
				return getAlarmLogs((EList<String>)arguments.get(0), (EList<Integer>)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_LOGS_1__STRING_ELIST_ELIST:
				return getAlarmLogs_1((String)arguments.get(0), (EList<String>)arguments.get(1), (EList<Integer>)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_LOGS_FOR_STATE__STRING_ELIST_ELIST:
				return getAlarmLogsForState((String)arguments.get(0), (EList<String>)arguments.get(1), (EList<Integer>)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_LOGS_FOR_STATES__ELIST_ELIST_ELIST:
				return getAlarmLogsForStates((EList<String>)arguments.get(0), (EList<String>)arguments.get(1), (EList<Integer>)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARM_LOGS_TIMELINE__STRING_BIGINTEGER_BIGINTEGER:
				return getAlarmLogsTimeline((String)arguments.get(0), (BigInteger)arguments.get(1), (BigInteger)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARMS_FOR_STATE__STRING_STRING_ELIST_ELIST:
				return getAlarmsForState((String)arguments.get(0), (String)arguments.get(1), (EList<String>)arguments.get(2), (EList<Integer>)arguments.get(3));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALARMS_FOR_STATES__STRING_ELIST_ELIST_ELIST:
				return getAlarmsForStates((String)arguments.get(0), (EList<String>)arguments.get(1), (EList<String>)arguments.get(2), (EList<Integer>)arguments.get(3));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ENTITY_MONITORING__INTEGER:
				return getEntityMonitoring((Integer)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ENTITY_MONITORING_1__INTEGER_STRING:
				return getEntityMonitoring_1((Integer)arguments.get(0), (String)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___UPDATE_ENTITY_MONITORING__INTEGER_STRING_INTEGER_STRING_BOOLEAN:
				return updateEntityMonitoring((Integer)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (Boolean)arguments.get(4));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_LOG__STRING:
				return getLog((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_LOGS:
				return getLogs();
			case GltPackage.GLT_OPEN_API_CLIENT___GET_LOGS_FOR_STATE__STRING:
				return getLogsForState((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_STATISTICS__STRING:
				return getStatistics((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_STATUS_LOGS:
				return getStatusLogs();
			case GltPackage.GLT_OPEN_API_CLIENT___UPSERT_STATUS_LOG__STATUSLOGREQUEST:
				return upsertStatusLog((StatusLogRequest)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_STATUS_LOGS_1__STRING:
				return getStatusLogs_1((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_STATUS_LOGS_TIMELINE__STRING_BIGINTEGER_BIGINTEGER:
				return getStatusLogsTimeline((String)arguments.get(0), (BigInteger)arguments.get(1), (BigInteger)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_TRACKED__STRING:
				return getTracked((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___IS_FLAKY__STRING_STRING_BIGINTEGER_BIGINTEGER_INTEGER:
				return isFlaky((String)arguments.get(0), (String)arguments.get(1), (BigInteger)arguments.get(2), (BigInteger)arguments.get(3), (Integer)arguments.get(4));
			case GltPackage.GLT_OPEN_API_CLIENT___LOGS_FOR_STATES__ELIST:
				return logsForStates((EList<String>)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___REFRESH_SYSTEM__STRING:
				return refreshSystem((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___UPDATE_ALARM_STATE__STRING_UPDATESTATEREQUEST:
				return updateAlarmState((String)arguments.get(0), (UpdateStateRequest)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_AUTHORS_1__ELIST_ELIST_BOOLEAN_STRING_STRING:
				return getAuthors_1((EList<Integer>)arguments.get(0), (EList<Integer>)arguments.get(1), (Boolean)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_CHANGELOG_1__INTEGER_INTEGER_ELIST_BOOLEAN_ELIST_STRING_STRING:
				return getChangelog_1((Integer)arguments.get(0), (Integer)arguments.get(1), (EList<Integer>)arguments.get(2), (Boolean)arguments.get(3), (EList<String>)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_CHANGELOG_COUNT_1__ELIST_BOOLEAN_ELIST_STRING_STRING:
				return getChangelogCount_1((EList<Integer>)arguments.get(0), (Boolean)arguments.get(1), (EList<String>)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_TIME_SCHEDULE_BLOCK_HISTORY__INTEGER_ELIST_BOOLEAN:
				return getTimeScheduleBlockHistory((Integer)arguments.get(0), (EList<Integer>)arguments.get(1), (Boolean)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_TIME_SCHEDULE_BLOCKS__INTEGER_ELIST:
				return getTimeScheduleBlocks((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___UPDATE_TIME_SCHEDULE_BLOCKS__INTEGER_ELIST:
				return updateTimeScheduleBlocks((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_TIME_SCHEDULE_STATE_HISTORY__INTEGER_ELIST_BOOLEAN:
				return getTimeScheduleStateHistory((Integer)arguments.get(0), (EList<Integer>)arguments.get(1), (Boolean)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_TIME_SCHEDULE_STATES__INTEGER_ELIST:
				return getTimeScheduleStates((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___UPDATE_TIME_SCHEDULE_STATES__INTEGER_ELIST:
				return updateTimeScheduleStates((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_VERSION__INTEGER_ELIST:
				return getVersion((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___POINT__POINTRECORD:
				return point((PointRecord)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___TIMESCHEDULE__TIMESCHEDULERECORD:
				return timeschedule((TimeScheduleRecord)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET__STRING:
				return get((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___CREATE_OR_UPDATE__STRING_STRING:
				return createOrUpdate((String)arguments.get(0), (String)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___CREATE__STRING_STRING:
				return create((String)arguments.get(0), (String)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___DELETE__STRING:
				return delete((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ALL_SETTINGS:
				return getAllSettings();
			case GltPackage.GLT_OPEN_API_CLIENT___GET_AUTH_STATUS:
				return getAuthStatus();
			case GltPackage.GLT_OPEN_API_CLIENT___GET_STATUS:
				return getStatus();
			case GltPackage.GLT_OPEN_API_CLIENT___GET_SYSTEM__STRING_BOOLEAN:
				return getSystem((String)arguments.get(0), (Boolean)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___UPDATE_SYSTEM__STRING_SYSTEMDESCRIPTIONREQUEST:
				return updateSystem((String)arguments.get(0), (SystemDescriptionRequest)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___CREATE_SYSTEM_DESCRIPTION__STRING_SYSTEMDESCRIPTIONREQUEST:
				return createSystemDescription((String)arguments.get(0), (SystemDescriptionRequest)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___DELETE_SYSTEM__STRING:
				return deleteSystem((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_CONTACTS__STRING:
				return getContacts((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_CONTRACTS__STRING_STRING_BOOLEAN:
				return getContracts((String)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_SYSTEM_IDS__BOOLEAN:
				return getSystemIds((Boolean)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_SYSTEMS__BOOLEAN:
				return getSystems((Boolean)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_TECH_FACILITIES__STRING_STRING_BOOLEAN:
				return getTechFacilities((String)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ENTITIES__ELIST:
				return getEntities((EList<EntityRequest>)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ENTITIES_BY_TYPE__INTEGER_STRING_ELIST:
				return getEntitiesByType((Integer)arguments.get(0), (String)arguments.get(1), (EList<Integer>)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ENTITIES_BY_TYPES__INTEGER_ELIST_ELIST:
				return getEntitiesByTypes((Integer)arguments.get(0), (EList<String>)arguments.get(1), (EList<Integer>)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_SYSTEM_ENTITIES__INTEGER_INTEGER:
				return getSystemEntities((Integer)arguments.get(0), (Integer)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_SYSTEM_ENTITY__INTEGER_STRING_INTEGER:
				return getSystemEntity((Integer)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___IMPORT_SYSTEMS__BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN:
				return importSystems((Boolean)arguments.get(0), (Boolean)arguments.get(1), (Boolean)arguments.get(2), (Boolean)arguments.get(3));
			case GltPackage.GLT_OPEN_API_CLIENT___CLEANUP_TEXTS:
				return cleanupTexts();
			case GltPackage.GLT_OPEN_API_CLIENT___CREATE_TEXT__TEXTREQUEST:
				return createText((TextRequest)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_TEXT__INTEGER:
				return getText((Integer)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___UPDATE_TEXT__INTEGER_TEXTREQUEST:
				return updateText((Integer)arguments.get(0), (TextRequest)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___DELETE_TEXT__INTEGER:
				return deleteText((Integer)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_TEXT_IDS:
				return getTextIds();
			case GltPackage.GLT_OPEN_API_CLIENT___GET_TEXT_IDS_1__STRING:
				return getTextIds_1((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_TEXTS:
				return getTexts();
			case GltPackage.GLT_OPEN_API_CLIENT___GET_TEXTS_1__STRING:
				return getTexts_1((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_GROUPS:
				return getGroups();
			case GltPackage.GLT_OPEN_API_CLIENT___ADD_GROUP__STRING:
				return addGroup((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___ADD_MEMBER_TO_GROUP__STRING_STRING:
				return addMemberToGroup((String)arguments.get(0), (String)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___ADD_PROPERTY_TO_ROLE__STRING_STRING_STRING:
				return addPropertyToRole((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___REMOVE_PROPERTY_FROM_ROLE__STRING_STRING:
				return removePropertyFromRole((String)arguments.get(0), (String)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_USERS:
				return getUsers();
			case GltPackage.GLT_OPEN_API_CLIENT___ADD_USER__STRING:
				return addUser((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___CURRENT_ROLE:
				return currentRole();
			case GltPackage.GLT_OPEN_API_CLIENT___GET_ROLE__STRING_BOOLEAN_BOOLEAN:
				return getRole((String)arguments.get(0), (Boolean)arguments.get(1), (Boolean)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___REMOVE_MEMBER_FROM_GROUP__STRING_STRING:
				return removeMemberFromGroup((String)arguments.get(0), (String)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___REMOVE_ROLE__STRING:
				return removeRole((String)arguments.get(0));
			case GltPackage.GLT_OPEN_API_CLIENT___UPDATE_SUSPECT__STRING_STRING:
				return updateSuspect((String)arguments.get(0), (String)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___DELETE_SUSPECT__STRING_STRING:
				return deleteSuspect((String)arguments.get(0), (String)arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_SUSPECTS__ELIST_ELIST_BOOLEAN:
				return getSuspects((EList<String>)arguments.get(0), (EList<Integer>)arguments.get(1), (Boolean)arguments.get(2));
			case GltPackage.GLT_OPEN_API_CLIENT___GET_SUSPECTS_1__STRING_ELIST_ELIST_BOOLEAN:
				return getSuspects_1((String)arguments.get(0), (EList<String>)arguments.get(1), (EList<Integer>)arguments.get(2), (Boolean)arguments.get(3));
			case GltPackage.GLT_OPEN_API_CLIENT___TO_QUERY_STRING__STRING_OBJECT:
				return toQueryString((String)arguments.get(0), arguments.get(1));
			case GltPackage.GLT_OPEN_API_CLIENT___GET__STRING_ECLASS_EMAP_EMAP:
				return _get((String)arguments.get(0), (EClass)arguments.get(1), (EMap<String, String>)arguments.get(2), (EMap<String, String>)arguments.get(3));
			case GltPackage.GLT_OPEN_API_CLIENT___DELETE__STRING_ECLASS_EMAP_EMAP:
				return _delete((String)arguments.get(0), (EClass)arguments.get(1), (EMap<String, String>)arguments.get(2), (EMap<String, String>)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GltOpenApiClientImpl
