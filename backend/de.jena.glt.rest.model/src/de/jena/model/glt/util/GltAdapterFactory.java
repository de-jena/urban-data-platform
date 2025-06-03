/**
 */
package de.jena.model.glt.util;

import de.jena.model.glt.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.model.glt.GltPackage
 * @generated
 */
public class GltAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GltPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GltAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GltPackage.eINSTANCE;
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
	protected GltSwitch<Adapter> modelSwitch =
		new GltSwitch<Adapter>() {
			@Override
			public Adapter caseAlarm(Alarm object) {
				return createAlarmAdapter();
			}
			@Override
			public Adapter caseAlarmId(AlarmId object) {
				return createAlarmIdAdapter();
			}
			@Override
			public Adapter caseAlarmRequest(AlarmRequest object) {
				return createAlarmRequestAdapter();
			}
			@Override
			public Adapter caseAlarmPojo(AlarmPojo object) {
				return createAlarmPojoAdapter();
			}
			@Override
			public Adapter caseInstructionsPojo(InstructionsPojo object) {
				return createInstructionsPojoAdapter();
			}
			@Override
			public Adapter caseRelationPojo(RelationPojo object) {
				return createRelationPojoAdapter();
			}
			@Override
			public Adapter caseCalendarEventPojo(CalendarEventPojo object) {
				return createCalendarEventPojoAdapter();
			}
			@Override
			public Adapter caseCalenderEventRequest(CalenderEventRequest object) {
				return createCalenderEventRequestAdapter();
			}
			@Override
			public Adapter caseCommentPojo(CommentPojo object) {
				return createCommentPojoAdapter();
			}
			@Override
			public Adapter caseStatusPojo(StatusPojo object) {
				return createStatusPojoAdapter();
			}
			@Override
			public Adapter caseCommentRequest(CommentRequest object) {
				return createCommentRequestAdapter();
			}
			@Override
			public Adapter caseAlarmLogPojo(AlarmLogPojo object) {
				return createAlarmLogPojoAdapter();
			}
			@Override
			public Adapter caseChangeItem(ChangeItem object) {
				return createChangeItemAdapter();
			}
			@Override
			public Adapter caseDatalogContentPojo(DatalogContentPojo object) {
				return createDatalogContentPojoAdapter();
			}
			@Override
			public Adapter casePointValuePojo(PointValuePojo object) {
				return createPointValuePojoAdapter();
			}
			@Override
			public Adapter caseAlarmLogTimelinePojo(AlarmLogTimelinePojo object) {
				return createAlarmLogTimelinePojoAdapter();
			}
			@Override
			public Adapter caseStatisticEntry(StatisticEntry object) {
				return createStatisticEntryAdapter();
			}
			@Override
			public Adapter caseTimeWindow(TimeWindow object) {
				return createTimeWindowAdapter();
			}
			@Override
			public Adapter caseEntityMonitoringSettingsPojo(EntityMonitoringSettingsPojo object) {
				return createEntityMonitoringSettingsPojoAdapter();
			}
			@Override
			public Adapter caseSyncLogPojo(SyncLogPojo object) {
				return createSyncLogPojoAdapter();
			}
			@Override
			public Adapter caseStatusLogPojo(StatusLogPojo object) {
				return createStatusLogPojoAdapter();
			}
			@Override
			public Adapter caseUpdateStateRequest(UpdateStateRequest object) {
				return createUpdateStateRequestAdapter();
			}
			@Override
			public Adapter caseStatusLogRequest(StatusLogRequest object) {
				return createStatusLogRequestAdapter();
			}
			@Override
			public Adapter caseTimeScheduleBlockPojo(TimeScheduleBlockPojo object) {
				return createTimeScheduleBlockPojoAdapter();
			}
			@Override
			public Adapter caseTimeScheduleStatePojo(TimeScheduleStatePojo object) {
				return createTimeScheduleStatePojoAdapter();
			}
			@Override
			public Adapter caseVersionInfo(VersionInfo object) {
				return createVersionInfoAdapter();
			}
			@Override
			public Adapter casePointRecord(PointRecord object) {
				return createPointRecordAdapter();
			}
			@Override
			public Adapter caseTimeScheduleRecord(TimeScheduleRecord object) {
				return createTimeScheduleRecordAdapter();
			}
			@Override
			public Adapter caseAddressPojo(AddressPojo object) {
				return createAddressPojoAdapter();
			}
			@Override
			public Adapter caseSystemDescriptionPojo(SystemDescriptionPojo object) {
				return createSystemDescriptionPojoAdapter();
			}
			@Override
			public Adapter caseSystemDescriptionRequest(SystemDescriptionRequest object) {
				return createSystemDescriptionRequestAdapter();
			}
			@Override
			public Adapter caseContactPojo(ContactPojo object) {
				return createContactPojoAdapter();
			}
			@Override
			public Adapter casePhonePojo(PhonePojo object) {
				return createPhonePojoAdapter();
			}
			@Override
			public Adapter caseContractPojo(ContractPojo object) {
				return createContractPojoAdapter();
			}
			@Override
			public Adapter caseTechFacilityPojo(TechFacilityPojo object) {
				return createTechFacilityPojoAdapter();
			}
			@Override
			public Adapter caseEntityPojo(EntityPojo object) {
				return createEntityPojoAdapter();
			}
			@Override
			public Adapter caseEntityRequest(EntityRequest object) {
				return createEntityRequestAdapter();
			}
			@Override
			public Adapter caseCylonNetworkPojo(CylonNetworkPojo object) {
				return createCylonNetworkPojoAdapter();
			}
			@Override
			public Adapter caseImportStatisticPojo(ImportStatisticPojo object) {
				return createImportStatisticPojoAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseTextRequest(TextRequest object) {
				return createTextRequestAdapter();
			}
			@Override
			public Adapter caseRolePojo(RolePojo object) {
				return createRolePojoAdapter();
			}
			@Override
			public Adapter caseSuspectPojo(SuspectPojo object) {
				return createSuspectPojoAdapter();
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
			public Adapter caseGltOpenApiClient(GltOpenApiClient object) {
				return createGltOpenApiClientAdapter();
			}
			@Override
			public Adapter caseJsonNode(JsonNode object) {
				return createJsonNodeAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.Alarm
	 * @generated
	 */
	public Adapter createAlarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.AlarmId <em>Alarm Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.AlarmId
	 * @generated
	 */
	public Adapter createAlarmIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.AlarmRequest <em>Alarm Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.AlarmRequest
	 * @generated
	 */
	public Adapter createAlarmRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.AlarmPojo <em>Alarm Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.AlarmPojo
	 * @generated
	 */
	public Adapter createAlarmPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.InstructionsPojo <em>Instructions Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.InstructionsPojo
	 * @generated
	 */
	public Adapter createInstructionsPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.RelationPojo <em>Relation Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.RelationPojo
	 * @generated
	 */
	public Adapter createRelationPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.CalendarEventPojo <em>Calendar Event Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.CalendarEventPojo
	 * @generated
	 */
	public Adapter createCalendarEventPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.CalenderEventRequest <em>Calender Event Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.CalenderEventRequest
	 * @generated
	 */
	public Adapter createCalenderEventRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.CommentPojo <em>Comment Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.CommentPojo
	 * @generated
	 */
	public Adapter createCommentPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.StatusPojo <em>Status Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.StatusPojo
	 * @generated
	 */
	public Adapter createStatusPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.CommentRequest <em>Comment Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.CommentRequest
	 * @generated
	 */
	public Adapter createCommentRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.AlarmLogPojo <em>Alarm Log Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.AlarmLogPojo
	 * @generated
	 */
	public Adapter createAlarmLogPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.ChangeItem <em>Change Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.ChangeItem
	 * @generated
	 */
	public Adapter createChangeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.DatalogContentPojo <em>Datalog Content Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.DatalogContentPojo
	 * @generated
	 */
	public Adapter createDatalogContentPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.PointValuePojo <em>Point Value Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.PointValuePojo
	 * @generated
	 */
	public Adapter createPointValuePojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.AlarmLogTimelinePojo <em>Alarm Log Timeline Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.AlarmLogTimelinePojo
	 * @generated
	 */
	public Adapter createAlarmLogTimelinePojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.StatisticEntry <em>Statistic Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.StatisticEntry
	 * @generated
	 */
	public Adapter createStatisticEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.TimeWindow <em>Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.TimeWindow
	 * @generated
	 */
	public Adapter createTimeWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.EntityMonitoringSettingsPojo <em>Entity Monitoring Settings Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.EntityMonitoringSettingsPojo
	 * @generated
	 */
	public Adapter createEntityMonitoringSettingsPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.SyncLogPojo <em>Sync Log Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.SyncLogPojo
	 * @generated
	 */
	public Adapter createSyncLogPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.StatusLogPojo <em>Status Log Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.StatusLogPojo
	 * @generated
	 */
	public Adapter createStatusLogPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.UpdateStateRequest <em>Update State Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.UpdateStateRequest
	 * @generated
	 */
	public Adapter createUpdateStateRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.StatusLogRequest <em>Status Log Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.StatusLogRequest
	 * @generated
	 */
	public Adapter createStatusLogRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.TimeScheduleBlockPojo <em>Time Schedule Block Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.TimeScheduleBlockPojo
	 * @generated
	 */
	public Adapter createTimeScheduleBlockPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.TimeScheduleStatePojo <em>Time Schedule State Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.TimeScheduleStatePojo
	 * @generated
	 */
	public Adapter createTimeScheduleStatePojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.VersionInfo <em>Version Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.VersionInfo
	 * @generated
	 */
	public Adapter createVersionInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.PointRecord <em>Point Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.PointRecord
	 * @generated
	 */
	public Adapter createPointRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.TimeScheduleRecord <em>Time Schedule Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.TimeScheduleRecord
	 * @generated
	 */
	public Adapter createTimeScheduleRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.AddressPojo <em>Address Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.AddressPojo
	 * @generated
	 */
	public Adapter createAddressPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.SystemDescriptionPojo <em>System Description Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.SystemDescriptionPojo
	 * @generated
	 */
	public Adapter createSystemDescriptionPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.SystemDescriptionRequest <em>System Description Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.SystemDescriptionRequest
	 * @generated
	 */
	public Adapter createSystemDescriptionRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.ContactPojo <em>Contact Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.ContactPojo
	 * @generated
	 */
	public Adapter createContactPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.PhonePojo <em>Phone Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.PhonePojo
	 * @generated
	 */
	public Adapter createPhonePojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.ContractPojo <em>Contract Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.ContractPojo
	 * @generated
	 */
	public Adapter createContractPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.TechFacilityPojo <em>Tech Facility Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.TechFacilityPojo
	 * @generated
	 */
	public Adapter createTechFacilityPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.EntityPojo <em>Entity Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.EntityPojo
	 * @generated
	 */
	public Adapter createEntityPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.EntityRequest <em>Entity Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.EntityRequest
	 * @generated
	 */
	public Adapter createEntityRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.CylonNetworkPojo <em>Cylon Network Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.CylonNetworkPojo
	 * @generated
	 */
	public Adapter createCylonNetworkPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.ImportStatisticPojo <em>Import Statistic Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.ImportStatisticPojo
	 * @generated
	 */
	public Adapter createImportStatisticPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.TextRequest <em>Text Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.TextRequest
	 * @generated
	 */
	public Adapter createTextRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.RolePojo <em>Role Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.RolePojo
	 * @generated
	 */
	public Adapter createRolePojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.SuspectPojo <em>Suspect Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.SuspectPojo
	 * @generated
	 */
	public Adapter createSuspectPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.Response
	 * @generated
	 */
	public Adapter createResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.OpenApiClient <em>Open Api Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.OpenApiClient
	 * @generated
	 */
	public Adapter createOpenApiClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.GltOpenApiClient <em>Open Api Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.GltOpenApiClient
	 * @generated
	 */
	public Adapter createGltOpenApiClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.glt.JsonNode <em>Json Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.glt.JsonNode
	 * @generated
	 */
	public Adapter createJsonNodeAdapter() {
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

} //GltAdapterFactory
