/*
 */
package de.jena.model.glt;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Api Client</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.jena.model.glt.GltPackage#getGltOpenApiClient()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface GltOpenApiClient extends OpenApiClient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will update alarms text of type to the specified text id. endpoint: /alarms/text/{type}/{id}
	 * <!-- end-model-doc -->
	 * @model requestMany="true"
	 * @generated
	 */
	Response bulkTextUpdate(String type, Integer id, EList<String> request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return alarm with specified definition id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getAlarm(String id, Boolean create);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will update alarm with specified id. endpoint: /alarms/{id}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response updateAlarm(String id, AlarmRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will create alarm with specified id. endpoint: /alarms/{id}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response createAlarm(String id, AlarmRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all alarm definition ids.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getAlarmIds(String regex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return alarm instruction with specified alarm id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getAlarmInstructions(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will update instruction for alarm with specified id. endpoint: /alarms/instructions/{id}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response updateInstructions(String id, InstructionsPojo request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all alarm definitions
	 * <!-- end-model-doc -->
	 * @model fieldsMany="true"
	 * @generated
	 */
	Response getAlarms(EList<String> fields, String regex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all alarms which use the given text id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response usage(Integer id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all alarm ids which use the given text id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response usageIds(Integer id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get calendar events for an alarm [in a range of a given type].
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getEventsForAlarm(String alarmId, String type, String from, String to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a calendar event for an alarm. endpoint: /calendar/alarm/{alarmId}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response createEventForAlarm(String alarmId, CalenderEventRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get calendar events for an alarm [in a range of a given type].
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getEventsForSystem(String systemId, String type, Boolean includeAlarms, String from, String to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a calendar event for a system. endpoint: /calendar/system/{systemId}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response createEventForSystem(String systemId, CalenderEventRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update a calendar event. endpoint: /calendar/{id}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response updateEvent(Integer id, CalenderEventRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delete a calendar event. endpoint: /calendar/{id}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response deleteEvent(Integer id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get calendar events [in a range].
	 * <!-- end-model-doc -->
	 * @model systemIdsMany="true"
	 * @generated
	 */
	Response getEvents(EList<String> systemIds, String type, String from, String to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get calendar events at a given point in time [within a grace period/ms].
	 * <!-- end-model-doc -->
	 * @model systemIdsMany="true"
	 * @generated
	 */
	Response getEventsAtTime(EList<String> systemIds, String time, String type, BigInteger grace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get calendar events for an alarm at a given point in time [within a grace period/ms]
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getEventsForAlarm_1(String alarmId, String time, String type, BigInteger grace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get calendar events for a system at a given point in time [within a grace period/ms]
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getEventsForSystem_1(String systemId, String time, String type, BigInteger grace, Boolean includeAlarms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get comments for a given owner type (alarm, system ...).
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getForAlarm(String ownerType, BigInteger ownerId, String type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a comment for a given comment owner. endpoint: /comment/{ownerType}/{ownerId}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response createCommentForOwner(String ownerType, BigInteger ownerId, CommentRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update a comment. endpoint: /comment/{id}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response updateComment(Integer id, CommentRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delete a comment. endpoint: /comment/{id}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response deleteComment(Integer id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get ids for which comments created in given time range for a given owner type and type.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getCommentedOn(String ownerType, String type, String from, String to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get comments created in given time range for a given owner types and types.
	 * <!-- end-model-doc -->
	 * @model ownerTypeMany="true" ownerIdMany="true" typeMany="true" authorMany="true" statusMany="true"
	 * @generated
	 */
	Response getFiltered(Integer offset, Integer limit, EList<String> ownerType, EList<BigInteger> ownerId, Boolean includeOwnerChildren, EList<String> type, EList<String> author, EList<String> status, String from, String to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get unique authors of comments created in given time range for a given owner types and types.
	 * <!-- end-model-doc -->
	 * @model ownerTypeMany="true" ownerIdMany="true" typeMany="true" statusMany="true"
	 * @generated
	 */
	Response getFilteredAuthors(EList<String> ownerType, EList<BigInteger> ownerId, Boolean includeChildren, EList<String> type, EList<String> status, String from, String to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get number of comments created in given time range for a given owner types and types.
	 * <!-- end-model-doc -->
	 * @model ownerTypeMany="true" ownerIdMany="true" typeMany="true" authorMany="true" statusMany="true"
	 * @generated
	 */
	Response getFilteredCount(EList<String> ownerType, EList<BigInteger> ownerId, Boolean includeChildren, EList<String> type, EList<String> author, EList<String> status, String from, String to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update a comments status. endpoint: /comment/{id}/status
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response updateStatus(Integer id, String request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model buildingIdMany="true"
	 * @generated
	 */
	Response getBuildingNames(EList<BigInteger> buildingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model deviceIdMany="true"
	 * @generated
	 */
	Response getDeviceName(EList<BigInteger> deviceId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return a collection of devices with their corresponding status.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getDevices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return count of devices by status (AVAILABLE, UNAVAILABLE).
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getDevicesCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return a set of devices with their corresponding status (without hierarchy).
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getDevicesFlat();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return alarms with mismatching system id.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getAlarmsWithMismatchedSystems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns audit-log entries.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getAuditLog(Integer limit, Integer offset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns number of audit-log entries.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getAuditLogCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all texts that are duplicates.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getDuplicateTexts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return csv fields.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getFields(Boolean importableOnly);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return alarms that have incomplete information.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getUndocumentedAlarms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all texts that are unused.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getUnusedTexts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upload metadata in csv format. endpoint: /meta/csv
	 * <!-- end-model-doc -->
	 * @model fieldsMany="true"
	 * @generated
	 */
	Response importFromCsv(EList<String> fields, String delimiter, Boolean dryRun, String request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return datalog contents for the system and its given identifier within the specified timeframe.
	 * <!-- end-model-doc -->
	 * @model idMany="true"
	 * @generated
	 */
	Response getDatalogContent(Integer systemId, EList<Integer> id, String from, String to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return datalog infos for the system and its given identifiers. Will return all datalogs for all points connected to this system if no point ids are given.
	 * <!-- end-model-doc -->
	 * @model idMany="true"
	 * @generated
	 */
	Response getDatalogInfo(Integer systemId, EList<Integer> id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will update datalog for system with specified systemId and optionally specific identifiers. endpoint: /monitoring/datalogs/update/{systemId}
	 * <!-- end-model-doc -->
	 * @model idMany="true"
	 * @generated
	 */
	Response updateDatalogContent(Integer systemId, EList<Integer> id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return point changes for input filters.
	 * <!-- end-model-doc -->
	 * @model systemIdsMany="true" authorMany="true"
	 * @generated
	 */
	Response getChangelog(Integer offset, Integer limit, EList<Integer> systemIds, Boolean external, EList<String> author, String from, String to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return count of point changes for input filters.
	 * <!-- end-model-doc -->
	 * @model systemIdsMany="true" authorMany="true"
	 * @generated
	 */
	Response getChangelogCount(EList<Integer> systemIds, Boolean external, EList<String> author, String from, String to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return stored point values for system.
	 * <!-- end-model-doc -->
	 * @model idMany="true"
	 * @generated
	 */
	Response getPointValueHistory(Integer systemId, EList<Integer> id, Boolean latestOnly, Boolean includeComments);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return current point values for system.
	 * <!-- end-model-doc -->
	 * @model idMany="true"
	 * @generated
	 */
	Response getPointValues(Integer systemId, String type, String valueType, EList<Integer> id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will update points for system with specified systemId and optionally specific identifiers. endpoint: /monitoring/points/update/{systemId}
	 * <!-- end-model-doc -->
	 * @model idMany="true"
	 * @generated
	 */
	Response updatePointValues(Integer systemId, EList<Integer> id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return active count for given alarm ids.
	 * <!-- end-model-doc -->
	 * @model alarmIdMany="true"
	 * @generated
	 */
	Response getAlarmCount(EList<String> alarmId, BigInteger from, BigInteger to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return active count for given alarm ids. endpoint: /monitoring/alarms/count
	 * <!-- end-model-doc -->
	 * @model requestMany="true"
	 * @generated
	 */
	Response getAlarmCountPost(BigInteger from, BigInteger to, EList<String> request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return count for alarms in state for the given system id. [ON, OFF, UNKNOWN]
	 * <!-- end-model-doc -->
	 * @model eventTypeMany="true" flagsMany="true"
	 * @generated
	 */
	Response getAlarmCount_1(String systemId, String state, EList<String> eventType, EList<Integer> flags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return count for alarms in state for the given system id. 
	 * <!-- end-model-doc -->
	 * @model eventTypeMany="true" flagsMany="true"
	 * @generated
	 */
	Response getAlarmCountByState(String systemId, EList<String> eventType, EList<Integer> flags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all alarm counts for states.
	 * <!-- end-model-doc -->
	 * @model systemIdsMany="true" eventTypeMany="true" flagsMany="true"
	 * @generated
	 */
	Response getAlarmCountByState_1(EList<String> systemIds, EList<String> eventType, EList<Integer> flags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all alarm counts for states by system id.
	 * <!-- end-model-doc -->
	 * @model systemIdsMany="true" eventTypeMany="true" flagsMany="true"
	 * @generated
	 */
	Response getAlarmCountByStateAndSystem(EList<String> systemIds, EList<String> eventType, EList<Integer> flags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return count for alarms for the given system id.
	 * <!-- end-model-doc -->
	 * @model eventTypeMany="true" flagsMany="true"
	 * @generated
	 */
	Response getAlarmCountForSystem(String systemId, EList<String> eventType, EList<Integer> flags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all alarm logs for the given state. [ON, OFF, UNKNOWN]
	 * <!-- end-model-doc -->
	 * @model eventTypeMany="true" flagsMany="true"
	 * @generated
	 */
	Response getAlarmForStateCount(String state, EList<String> eventType, EList<Integer> flags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all alarm logs for the given alarm id including superseded.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getAlarmLogTimeline(String alarmId, BigInteger from, BigInteger to, Integer limit, Integer offset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return statistics for alarm logs with the given alarm id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getAlarmLogTimelineStatistics(String alarmId, BigInteger from, BigInteger to, String unit, String timezone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all active alarm logs.
	 * <!-- end-model-doc -->
	 * @model eventTypeMany="true" flagsMany="true"
	 * @generated
	 */
	Response getAlarmLogs(EList<String> eventType, EList<Integer> flags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all current alarm logs for the given system id.
	 * <!-- end-model-doc -->
	 * @model eventTypeMany="true" flagsMany="true"
	 * @generated
	 */
	Response getAlarmLogs_1(String systemId, EList<String> eventType, EList<Integer> flags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all alarm logs for the given state. [ON, OFF, UNKNOWN]
	 * <!-- end-model-doc -->
	 * @model eventTypeMany="true" flagsMany="true"
	 * @generated
	 */
	Response getAlarmLogsForState(String state, EList<String> eventType, EList<Integer> flags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all alarm logs for the given states. [ON, OFF, UNKNOWN]
	 * <!-- end-model-doc -->
	 * @model stateMany="true" eventTypeMany="true" flagsMany="true"
	 * @generated
	 */
	Response getAlarmLogsForStates(EList<String> state, EList<String> eventType, EList<Integer> flags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all alarm logs for the given system id including superseded.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getAlarmLogsTimeline(String systemId, BigInteger from, BigInteger to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return alarms in state for the given system id. [ON, OFF, UNKNOWN]
	 * <!-- end-model-doc -->
	 * @model eventTypeMany="true" flagsMany="true"
	 * @generated
	 */
	Response getAlarmsForState(String systemId, String state, EList<String> eventType, EList<Integer> flags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return alarms in any of the states for the given system id. [ON, OFF, UNKNOWN]
	 * <!-- end-model-doc -->
	 * @model stateMany="true" eventTypeMany="true" flagsMany="true"
	 * @generated
	 */
	Response getAlarmsForStates(String systemId, EList<String> state, EList<String> eventType, EList<Integer> flags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will get monitoring setting for system with specified id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getEntityMonitoring(Integer systemId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will get monitored identifiers for system with specified id and given entity type.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getEntityMonitoring_1(Integer systemId, String type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will update monitoring for system with specified id, entity type and optionally specific identifier. endpoint: /monitoring/entities/{systemId}/{type}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response updateEntityMonitoring(Integer systemId, String type, Integer identifier, String name, Boolean isIncluded);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all logs for the given system id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getLog(String systemId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all logs.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getLogs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all logs in a given state.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getLogsForState(String state);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return statistics for alarm ids for the given system id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getStatistics(String systemId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all status logs.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getStatusLogs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will update or insert status log. endpoint: /monitoring/status
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response upsertStatusLog(StatusLogRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all status logs for the given system id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getStatusLogs_1(String systemId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all status logs for the given system id including superseded.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getStatusLogsTimeline(String systemId, BigInteger from, BigInteger to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return tracked alarm ids for the given system id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getTracked(String systemId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return true if given alarm on given system is flaky.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response isFlaky(String systemId, String alarmId, BigInteger from, BigInteger to, Integer threshold);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all logs in any of the given states.
	 * <!-- end-model-doc -->
	 * @model stateMany="true"
	 * @generated
	 */
	Response logsForStates(EList<String> state);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update the alarm states of the system with the given id from the controller's buffer. endpoint: /monitoring/refresh/{systemId}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response refreshSystem(String systemId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update the state of the alarm with the given id to the given state. endpoint: /monitoring/state/{systemId}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response updateAlarmState(String systemId, UpdateStateRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return block changes for input filters.
	 * <!-- end-model-doc -->
	 * @model systemIdsMany="true" authorMany="true"
	 * @generated
	 */
	Response getChangelog_1(Integer offset, Integer limit, EList<Integer> systemIds, Boolean external, EList<String> author, String from, String to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return count of block changes for input filters.
	 * <!-- end-model-doc -->
	 * @model systemIdsMany="true" authorMany="true"
	 * @generated
	 */
	Response getChangelogCount_1(EList<Integer> systemIds, Boolean external, EList<String> author, String from, String to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return stored time schedule blocks for system.
	 * <!-- end-model-doc -->
	 * @model idMany="true"
	 * @generated
	 */
	Response getTimeScheduleBlockHistory(Integer systemId, EList<Integer> id, Boolean latestOnly);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return current time schedule states for system.
	 * <!-- end-model-doc -->
	 * @model idMany="true"
	 * @generated
	 */
	Response getTimeScheduleBlocks(Integer systemId, EList<Integer> id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will update time schedule blocks for system with specified systemId and optionally specific identifiers. endpoint: /monitoring/timeschedule/block/update/{systemId}
	 * <!-- end-model-doc -->
	 * @model idMany="true"
	 * @generated
	 */
	Response updateTimeScheduleBlocks(Integer systemId, EList<Integer> id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return stored time schedule states for system.
	 * <!-- end-model-doc -->
	 * @model idMany="true"
	 * @generated
	 */
	Response getTimeScheduleStateHistory(Integer systemId, EList<Integer> id, Boolean latestOnly);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return current time schedule states for system.
	 * <!-- end-model-doc -->
	 * @model idMany="true"
	 * @generated
	 */
	Response getTimeScheduleStates(Integer systemId, EList<Integer> id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will update time schedule states for system with specified systemId and optionally specific identifiers. endpoint: /monitoring/timeschedule/state/update/{systemId}
	 * <!-- end-model-doc -->
	 * @model idMany="true"
	 * @generated
	 */
	Response updateTimeScheduleStates(Integer systemId, EList<Integer> id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all logs for the system with the given systemId + ids if provided.
	 * <!-- end-model-doc -->
	 * @model idMany="true"
	 * @generated
	 */
	Response getVersion(Integer systemId, EList<Integer> id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Records a point change endpoint: /record/point
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response point(PointRecord request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Records a time schedule (block) change endpoint: /record/timeschedule
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response timeschedule(TimeScheduleRecord request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all settings.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response get(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will create or update setting with given key. endpoint: /conf/{key}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response createOrUpdate(String key, String request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will delete setting with given key. endpoint: /conf/{key}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response create(String key, String request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will delete setting with given key. endpoint: /conf/{key}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response delete(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return setting with given key.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getAllSettings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return authorization status information regarding the service.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getAuthStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return status information regarding the service.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return system with specified id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getSystem(String id, Boolean shallow);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will update system with specified id. endpoint: /systems/{id}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response updateSystem(String id, SystemDescriptionRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will create system with specified id. endpoint: /systems/{id}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response createSystemDescription(String id, SystemDescriptionRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will delete system with specified id. endpoint: /systems/{id}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response deleteSystem(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return contacts for the system with specified id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getContacts(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return contracts for the system with specified id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getContracts(String id, String type, Boolean activeOnly);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all system ids.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getSystemIds(Boolean excluded);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all systems.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getSystems(Boolean excluded);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return tech facilities for the building with specified id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getTechFacilities(String id, String type, Boolean activeOnly);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return control entity information. endpoint: /system/entities
	 * <!-- end-model-doc -->
	 * @model requestMany="true"
	 * @generated
	 */
	Response getEntities(EList<EntityRequest> request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return entities of given type for system optionally filtered by identifier.
	 * <!-- end-model-doc -->
	 * @model idMany="true"
	 * @generated
	 */
	Response getEntitiesByType(Integer systemId, String type, EList<Integer> id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return entities of given types for system optionally filtered by identifier.
	 * <!-- end-model-doc -->
	 * @model typeMany="true" idMany="true"
	 * @generated
	 */
	Response getEntitiesByTypes(Integer systemId, EList<String> type, EList<Integer> id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return control entity information for the system.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getSystemEntities(Integer systemId, Integer depth);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return control entity information for system with specified id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getSystemEntity(Integer systemId, String type, Integer id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Import of systems from external configuration (e.g. Unitron data folder) endpoint: /system/import
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response importSystems(Boolean cleanUp, Boolean dryRun, Boolean skipIp, Boolean skipName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will purge texts that are not referenced. endpoint: /texts/cleanup
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response cleanupTexts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will create specified text. endpoint: /texts/new
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response createText(TextRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return text with specified id.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getText(Integer id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will update text with specified id. endpoint: /texts/{id}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response updateText(Integer id, TextRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will delete specified text. endpoint: /texts/{id}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response deleteText(Integer id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all text ids.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getTextIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all text ids of given type.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getTextIds_1(String type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all texts.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getTexts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all texts of given type.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getTexts_1(String type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all groups.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getGroups();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will add group with given name. endpoint: /useradmin/groups
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response addGroup(String request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will add role to group with given name endpoint: /useradmin/groups/{groupName}/members
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response addMemberToGroup(String groupName, String request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will add property to role with given name. endpoint: /useradmin/roles/{roleName}/properties/{key}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response addPropertyToRole(String roleName, String key, String request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will add property to role with given name endpoint: /useradmin/roles/{roleName}/properties/{key}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response removePropertyFromRole(String roleName, String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return all users.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Response getUsers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will add user with given id or auth. endpoint: /useradmin/users
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response addUser(String request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return authorization status information regarding the service.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response currentRole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return user with given identifier (uid or name depending on discovery).
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response getRole(String identifier, Boolean mandatory, Boolean discovery);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will remove role from group with given name. endpoint: /useradmin/groups/{groupName}/members/{roleName}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response removeMemberFromGroup(String groupName, String roleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will remove role with given name. endpoint: /useradmin/{name}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response removeRole(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update a suspect. endpoint: /watcher/suspects/{systemId}.{alarmId}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response updateSuspect(String systemId, String alarmId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delete a suspect. endpoint: /watcher/suspects/{systemId}.{alarmId}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Response deleteSuspect(String systemId, String alarmId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return a collection of alarms, that occur repeatedly as per settings (flaky).
	 * <!-- end-model-doc -->
	 * @model eventTypeMany="true" flagsMany="true"
	 * @generated
	 */
	Response getSuspects(EList<String> eventType, EList<Integer> flags, Boolean recognized);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will return a collection of alarms for system, that occur repeatedly as per settings (flaky).
	 * <!-- end-model-doc -->
	 * @model eventTypeMany="true" flagsMany="true"
	 * @generated
	 */
	Response getSuspects_1(String systemId, EList<String> eventType, EList<Integer> flags, Boolean recognized);

} // GltOpenApiClient
