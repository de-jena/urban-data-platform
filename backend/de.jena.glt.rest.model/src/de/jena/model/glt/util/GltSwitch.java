/**
 */
package de.jena.model.glt.util;

import de.jena.model.glt.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.jena.model.glt.GltPackage
 * @generated
 */
public class GltSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GltPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GltSwitch() {
		if (modelPackage == null) {
			modelPackage = GltPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GltPackage.ALARM: {
				Alarm alarm = (Alarm)theEObject;
				T result = caseAlarm(alarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.ALARM_ID: {
				AlarmId alarmId = (AlarmId)theEObject;
				T result = caseAlarmId(alarmId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.ALARM_REQUEST: {
				AlarmRequest alarmRequest = (AlarmRequest)theEObject;
				T result = caseAlarmRequest(alarmRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.ALARM_POJO: {
				AlarmPojo alarmPojo = (AlarmPojo)theEObject;
				T result = caseAlarmPojo(alarmPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.INSTRUCTIONS_POJO: {
				InstructionsPojo instructionsPojo = (InstructionsPojo)theEObject;
				T result = caseInstructionsPojo(instructionsPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.RELATION_POJO: {
				RelationPojo relationPojo = (RelationPojo)theEObject;
				T result = caseRelationPojo(relationPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.CALENDAR_EVENT_POJO: {
				CalendarEventPojo calendarEventPojo = (CalendarEventPojo)theEObject;
				T result = caseCalendarEventPojo(calendarEventPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.CALENDER_EVENT_REQUEST: {
				CalenderEventRequest calenderEventRequest = (CalenderEventRequest)theEObject;
				T result = caseCalenderEventRequest(calenderEventRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.COMMENT_POJO: {
				CommentPojo commentPojo = (CommentPojo)theEObject;
				T result = caseCommentPojo(commentPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.STATUS_POJO: {
				StatusPojo statusPojo = (StatusPojo)theEObject;
				T result = caseStatusPojo(statusPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.COMMENT_REQUEST: {
				CommentRequest commentRequest = (CommentRequest)theEObject;
				T result = caseCommentRequest(commentRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.ALARM_LOG_POJO: {
				AlarmLogPojo alarmLogPojo = (AlarmLogPojo)theEObject;
				T result = caseAlarmLogPojo(alarmLogPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.CHANGE_ITEM: {
				ChangeItem changeItem = (ChangeItem)theEObject;
				T result = caseChangeItem(changeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.DATALOG_CONTENT_POJO: {
				DatalogContentPojo datalogContentPojo = (DatalogContentPojo)theEObject;
				T result = caseDatalogContentPojo(datalogContentPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.POINT_VALUE_POJO: {
				PointValuePojo pointValuePojo = (PointValuePojo)theEObject;
				T result = casePointValuePojo(pointValuePojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.ALARM_LOG_TIMELINE_POJO: {
				AlarmLogTimelinePojo alarmLogTimelinePojo = (AlarmLogTimelinePojo)theEObject;
				T result = caseAlarmLogTimelinePojo(alarmLogTimelinePojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.STATISTIC_ENTRY: {
				StatisticEntry statisticEntry = (StatisticEntry)theEObject;
				T result = caseStatisticEntry(statisticEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.TIME_WINDOW: {
				TimeWindow timeWindow = (TimeWindow)theEObject;
				T result = caseTimeWindow(timeWindow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO: {
				EntityMonitoringSettingsPojo entityMonitoringSettingsPojo = (EntityMonitoringSettingsPojo)theEObject;
				T result = caseEntityMonitoringSettingsPojo(entityMonitoringSettingsPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.SYNC_LOG_POJO: {
				SyncLogPojo syncLogPojo = (SyncLogPojo)theEObject;
				T result = caseSyncLogPojo(syncLogPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.STATUS_LOG_POJO: {
				StatusLogPojo statusLogPojo = (StatusLogPojo)theEObject;
				T result = caseStatusLogPojo(statusLogPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.UPDATE_STATE_REQUEST: {
				UpdateStateRequest updateStateRequest = (UpdateStateRequest)theEObject;
				T result = caseUpdateStateRequest(updateStateRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.STATUS_LOG_REQUEST: {
				StatusLogRequest statusLogRequest = (StatusLogRequest)theEObject;
				T result = caseStatusLogRequest(statusLogRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO: {
				TimeScheduleBlockPojo timeScheduleBlockPojo = (TimeScheduleBlockPojo)theEObject;
				T result = caseTimeScheduleBlockPojo(timeScheduleBlockPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.TIME_SCHEDULE_STATE_POJO: {
				TimeScheduleStatePojo timeScheduleStatePojo = (TimeScheduleStatePojo)theEObject;
				T result = caseTimeScheduleStatePojo(timeScheduleStatePojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.VERSION_INFO: {
				VersionInfo versionInfo = (VersionInfo)theEObject;
				T result = caseVersionInfo(versionInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.POINT_RECORD: {
				PointRecord pointRecord = (PointRecord)theEObject;
				T result = casePointRecord(pointRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.TIME_SCHEDULE_RECORD: {
				TimeScheduleRecord timeScheduleRecord = (TimeScheduleRecord)theEObject;
				T result = caseTimeScheduleRecord(timeScheduleRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.ADDRESS_POJO: {
				AddressPojo addressPojo = (AddressPojo)theEObject;
				T result = caseAddressPojo(addressPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.SYSTEM_DESCRIPTION_POJO: {
				SystemDescriptionPojo systemDescriptionPojo = (SystemDescriptionPojo)theEObject;
				T result = caseSystemDescriptionPojo(systemDescriptionPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.SYSTEM_DESCRIPTION_REQUEST: {
				SystemDescriptionRequest systemDescriptionRequest = (SystemDescriptionRequest)theEObject;
				T result = caseSystemDescriptionRequest(systemDescriptionRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.CONTACT_POJO: {
				ContactPojo contactPojo = (ContactPojo)theEObject;
				T result = caseContactPojo(contactPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.PHONE_POJO: {
				PhonePojo phonePojo = (PhonePojo)theEObject;
				T result = casePhonePojo(phonePojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.CONTRACT_POJO: {
				ContractPojo contractPojo = (ContractPojo)theEObject;
				T result = caseContractPojo(contractPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.TECH_FACILITY_POJO: {
				TechFacilityPojo techFacilityPojo = (TechFacilityPojo)theEObject;
				T result = caseTechFacilityPojo(techFacilityPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.ENTITY_POJO: {
				EntityPojo entityPojo = (EntityPojo)theEObject;
				T result = caseEntityPojo(entityPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.ENTITY_REQUEST: {
				EntityRequest entityRequest = (EntityRequest)theEObject;
				T result = caseEntityRequest(entityRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.CYLON_NETWORK_POJO: {
				CylonNetworkPojo cylonNetworkPojo = (CylonNetworkPojo)theEObject;
				T result = caseCylonNetworkPojo(cylonNetworkPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.IMPORT_STATISTIC_POJO: {
				ImportStatisticPojo importStatisticPojo = (ImportStatisticPojo)theEObject;
				T result = caseImportStatisticPojo(importStatisticPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.TEXT_REQUEST: {
				TextRequest textRequest = (TextRequest)theEObject;
				T result = caseTextRequest(textRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.ROLE_POJO: {
				RolePojo rolePojo = (RolePojo)theEObject;
				T result = caseRolePojo(rolePojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.SUSPECT_POJO: {
				SuspectPojo suspectPojo = (SuspectPojo)theEObject;
				T result = caseSuspectPojo(suspectPojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.RESPONSE: {
				Response response = (Response)theEObject;
				T result = caseResponse(response);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.OPEN_API_CLIENT: {
				OpenApiClient openApiClient = (OpenApiClient)theEObject;
				T result = caseOpenApiClient(openApiClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.GLT_OPEN_API_CLIENT: {
				GltOpenApiClient gltOpenApiClient = (GltOpenApiClient)theEObject;
				T result = caseGltOpenApiClient(gltOpenApiClient);
				if (result == null) result = caseOpenApiClient(gltOpenApiClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GltPackage.JSON_NODE: {
				JsonNode jsonNode = (JsonNode)theEObject;
				T result = caseJsonNode(jsonNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarm(Alarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarmId(AlarmId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarmRequest(AlarmRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarmPojo(AlarmPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instructions Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instructions Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionsPojo(InstructionsPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationPojo(RelationPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar Event Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar Event Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendarEventPojo(CalendarEventPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calender Event Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calender Event Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalenderEventRequest(CalenderEventRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentPojo(CommentPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusPojo(StatusPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentRequest(CommentRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm Log Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm Log Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarmLogPojo(AlarmLogPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeItem(ChangeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datalog Content Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datalog Content Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatalogContentPojo(DatalogContentPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Value Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Value Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointValuePojo(PointValuePojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm Log Timeline Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm Log Timeline Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarmLogTimelinePojo(AlarmLogTimelinePojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistic Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistic Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatisticEntry(StatisticEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeWindow(TimeWindow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Monitoring Settings Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Monitoring Settings Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityMonitoringSettingsPojo(EntityMonitoringSettingsPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sync Log Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sync Log Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyncLogPojo(SyncLogPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Log Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Log Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusLogPojo(StatusLogPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update State Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update State Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateStateRequest(UpdateStateRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Log Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Log Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusLogRequest(StatusLogRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Schedule Block Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Schedule Block Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeScheduleBlockPojo(TimeScheduleBlockPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Schedule State Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Schedule State Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeScheduleStatePojo(TimeScheduleStatePojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionInfo(VersionInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointRecord(PointRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Schedule Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Schedule Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeScheduleRecord(TimeScheduleRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressPojo(AddressPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Description Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Description Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemDescriptionPojo(SystemDescriptionPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Description Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Description Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemDescriptionRequest(SystemDescriptionRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactPojo(ContactPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phone Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phone Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhonePojo(PhonePojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractPojo(ContractPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tech Facility Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tech Facility Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechFacilityPojo(TechFacilityPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityPojo(EntityPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityRequest(EntityRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cylon Network Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cylon Network Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCylonNetworkPojo(CylonNetworkPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Statistic Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Statistic Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportStatisticPojo(ImportStatisticPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextRequest(TextRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRolePojo(RolePojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspect Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspect Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspectPojo(SuspectPojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponse(Response object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Api Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Api Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenApiClient(OpenApiClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Api Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Api Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGltOpenApiClient(GltOpenApiClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonNode(JsonNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GltSwitch
