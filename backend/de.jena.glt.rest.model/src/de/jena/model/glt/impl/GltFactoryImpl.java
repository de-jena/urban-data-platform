/**
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.*;

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
public class GltFactoryImpl extends EFactoryImpl implements GltFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GltFactory init() {
		try {
			GltFactory theGltFactory = (GltFactory)EPackage.Registry.INSTANCE.getEFactory(GltPackage.eNS_URI);
			if (theGltFactory != null) {
				return theGltFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GltFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GltFactoryImpl() {
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
			case GltPackage.ALARM: return createAlarm();
			case GltPackage.ALARM_ID: return createAlarmId();
			case GltPackage.ALARM_REQUEST: return createAlarmRequest();
			case GltPackage.ALARM_POJO: return createAlarmPojo();
			case GltPackage.LINKED_ID_STRING: return createLinkedIdString();
			case GltPackage.INSTRUCTIONS_POJO: return createInstructionsPojo();
			case GltPackage.RELATION_POJO: return createRelationPojo();
			case GltPackage.CALENDER_EVENT_REQUEST: return createCalenderEventRequest();
			case GltPackage.CALENDAR_EVENT_POJO: return createCalendarEventPojo();
			case GltPackage.COMMENT_POJO: return createCommentPojo();
			case GltPackage.STATUS_POJO: return createStatusPojo();
			case GltPackage.COMMENT_REQUEST: return createCommentRequest();
			case GltPackage.DEVICE_BUILDING_POJO: return createDeviceBuildingPojo();
			case GltPackage.DEVICE_POJO: return createDevicePojo();
			case GltPackage.DEVICE_CONNECTION_POJO: return createDeviceConnectionPojo();
			case GltPackage.DEVICES_COLLECTION_POJO: return createDevicesCollectionPojo();
			case GltPackage.DEVICE_ADAPTER_POJO: return createDeviceAdapterPojo();
			case GltPackage.ALARM_LOG_POJO: return createAlarmLogPojo();
			case GltPackage.CHANGE_ITEM: return createChangeItem();
			case GltPackage.DATALOG_CONTENT_POJO: return createDatalogContentPojo();
			case GltPackage.POINT_VALUE_POJO: return createPointValuePojo();
			case GltPackage.ALARM_LOG_TIMELINE_POJO: return createAlarmLogTimelinePojo();
			case GltPackage.STATISTIC_ENTRY: return createStatisticEntry();
			case GltPackage.TIME_WINDOW: return createTimeWindow();
			case GltPackage.ENTITY_MONITORING_SETTINGS_POJO: return createEntityMonitoringSettingsPojo();
			case GltPackage.SYNC_LOG_POJO: return createSyncLogPojo();
			case GltPackage.STATUS_LOG_POJO: return createStatusLogPojo();
			case GltPackage.UPDATE_STATE_REQUEST: return createUpdateStateRequest();
			case GltPackage.STATUS_LOG_REQUEST: return createStatusLogRequest();
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO: return createTimeScheduleBlockPojo();
			case GltPackage.TIME_SCHEDULE_STATE_POJO: return createTimeScheduleStatePojo();
			case GltPackage.VERSION_INFO: return createVersionInfo();
			case GltPackage.POINT_RECORD: return createPointRecord();
			case GltPackage.TIME_SCHEDULE_RECORD: return createTimeScheduleRecord();
			case GltPackage.JSON_NODE: return createJsonNode();
			case GltPackage.ADDRESS_POJO: return createAddressPojo();
			case GltPackage.SYSTEM_DESCRIPTION_POJO: return createSystemDescriptionPojo();
			case GltPackage.SYSTEM_DESCRIPTION_REQUEST: return createSystemDescriptionRequest();
			case GltPackage.CONTACT_POJO: return createContactPojo();
			case GltPackage.PHONE_POJO: return createPhonePojo();
			case GltPackage.CONTRACT_POJO: return createContractPojo();
			case GltPackage.TECH_FACILITY_POJO: return createTechFacilityPojo();
			case GltPackage.ENTITY_POJO: return createEntityPojo();
			case GltPackage.ENTITY_REQUEST: return createEntityRequest();
			case GltPackage.CYLON_NETWORK_POJO: return createCylonNetworkPojo();
			case GltPackage.IMPORT_STATISTIC_POJO: return createImportStatisticPojo();
			case GltPackage.TEXT: return createText();
			case GltPackage.TEXT_REQUEST: return createTextRequest();
			case GltPackage.LINKED_ID_INTEGER: return createLinkedIdInteger();
			case GltPackage.ROLE_POJO: return createRolePojo();
			case GltPackage.SUSPECT_POJO: return createSuspectPojo();
			case GltPackage.RESPONSE: return createResponse();
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
			case GltPackage.JRESPONSE:
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
			case GltPackage.JRESPONSE:
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
	public Alarm createAlarm() {
		AlarmImpl alarm = new AlarmImpl();
		return alarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlarmId createAlarmId() {
		AlarmIdImpl alarmId = new AlarmIdImpl();
		return alarmId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlarmRequest createAlarmRequest() {
		AlarmRequestImpl alarmRequest = new AlarmRequestImpl();
		return alarmRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlarmPojo createAlarmPojo() {
		AlarmPojoImpl alarmPojo = new AlarmPojoImpl();
		return alarmPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkedIdString createLinkedIdString() {
		LinkedIdStringImpl linkedIdString = new LinkedIdStringImpl();
		return linkedIdString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstructionsPojo createInstructionsPojo() {
		InstructionsPojoImpl instructionsPojo = new InstructionsPojoImpl();
		return instructionsPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationPojo createRelationPojo() {
		RelationPojoImpl relationPojo = new RelationPojoImpl();
		return relationPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalenderEventRequest createCalenderEventRequest() {
		CalenderEventRequestImpl calenderEventRequest = new CalenderEventRequestImpl();
		return calenderEventRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalendarEventPojo createCalendarEventPojo() {
		CalendarEventPojoImpl calendarEventPojo = new CalendarEventPojoImpl();
		return calendarEventPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommentPojo createCommentPojo() {
		CommentPojoImpl commentPojo = new CommentPojoImpl();
		return commentPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusPojo createStatusPojo() {
		StatusPojoImpl statusPojo = new StatusPojoImpl();
		return statusPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommentRequest createCommentRequest() {
		CommentRequestImpl commentRequest = new CommentRequestImpl();
		return commentRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceBuildingPojo createDeviceBuildingPojo() {
		DeviceBuildingPojoImpl deviceBuildingPojo = new DeviceBuildingPojoImpl();
		return deviceBuildingPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DevicePojo createDevicePojo() {
		DevicePojoImpl devicePojo = new DevicePojoImpl();
		return devicePojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceConnectionPojo createDeviceConnectionPojo() {
		DeviceConnectionPojoImpl deviceConnectionPojo = new DeviceConnectionPojoImpl();
		return deviceConnectionPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DevicesCollectionPojo createDevicesCollectionPojo() {
		DevicesCollectionPojoImpl devicesCollectionPojo = new DevicesCollectionPojoImpl();
		return devicesCollectionPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceAdapterPojo createDeviceAdapterPojo() {
		DeviceAdapterPojoImpl deviceAdapterPojo = new DeviceAdapterPojoImpl();
		return deviceAdapterPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlarmLogPojo createAlarmLogPojo() {
		AlarmLogPojoImpl alarmLogPojo = new AlarmLogPojoImpl();
		return alarmLogPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeItem createChangeItem() {
		ChangeItemImpl changeItem = new ChangeItemImpl();
		return changeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatalogContentPojo createDatalogContentPojo() {
		DatalogContentPojoImpl datalogContentPojo = new DatalogContentPojoImpl();
		return datalogContentPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointValuePojo createPointValuePojo() {
		PointValuePojoImpl pointValuePojo = new PointValuePojoImpl();
		return pointValuePojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlarmLogTimelinePojo createAlarmLogTimelinePojo() {
		AlarmLogTimelinePojoImpl alarmLogTimelinePojo = new AlarmLogTimelinePojoImpl();
		return alarmLogTimelinePojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatisticEntry createStatisticEntry() {
		StatisticEntryImpl statisticEntry = new StatisticEntryImpl();
		return statisticEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeWindow createTimeWindow() {
		TimeWindowImpl timeWindow = new TimeWindowImpl();
		return timeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityMonitoringSettingsPojo createEntityMonitoringSettingsPojo() {
		EntityMonitoringSettingsPojoImpl entityMonitoringSettingsPojo = new EntityMonitoringSettingsPojoImpl();
		return entityMonitoringSettingsPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SyncLogPojo createSyncLogPojo() {
		SyncLogPojoImpl syncLogPojo = new SyncLogPojoImpl();
		return syncLogPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusLogPojo createStatusLogPojo() {
		StatusLogPojoImpl statusLogPojo = new StatusLogPojoImpl();
		return statusLogPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateStateRequest createUpdateStateRequest() {
		UpdateStateRequestImpl updateStateRequest = new UpdateStateRequestImpl();
		return updateStateRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusLogRequest createStatusLogRequest() {
		StatusLogRequestImpl statusLogRequest = new StatusLogRequestImpl();
		return statusLogRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeScheduleBlockPojo createTimeScheduleBlockPojo() {
		TimeScheduleBlockPojoImpl timeScheduleBlockPojo = new TimeScheduleBlockPojoImpl();
		return timeScheduleBlockPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeScheduleStatePojo createTimeScheduleStatePojo() {
		TimeScheduleStatePojoImpl timeScheduleStatePojo = new TimeScheduleStatePojoImpl();
		return timeScheduleStatePojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionInfo createVersionInfo() {
		VersionInfoImpl versionInfo = new VersionInfoImpl();
		return versionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointRecord createPointRecord() {
		PointRecordImpl pointRecord = new PointRecordImpl();
		return pointRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeScheduleRecord createTimeScheduleRecord() {
		TimeScheduleRecordImpl timeScheduleRecord = new TimeScheduleRecordImpl();
		return timeScheduleRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonNode createJsonNode() {
		JsonNodeImpl jsonNode = new JsonNodeImpl();
		return jsonNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressPojo createAddressPojo() {
		AddressPojoImpl addressPojo = new AddressPojoImpl();
		return addressPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemDescriptionPojo createSystemDescriptionPojo() {
		SystemDescriptionPojoImpl systemDescriptionPojo = new SystemDescriptionPojoImpl();
		return systemDescriptionPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemDescriptionRequest createSystemDescriptionRequest() {
		SystemDescriptionRequestImpl systemDescriptionRequest = new SystemDescriptionRequestImpl();
		return systemDescriptionRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactPojo createContactPojo() {
		ContactPojoImpl contactPojo = new ContactPojoImpl();
		return contactPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhonePojo createPhonePojo() {
		PhonePojoImpl phonePojo = new PhonePojoImpl();
		return phonePojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractPojo createContractPojo() {
		ContractPojoImpl contractPojo = new ContractPojoImpl();
		return contractPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechFacilityPojo createTechFacilityPojo() {
		TechFacilityPojoImpl techFacilityPojo = new TechFacilityPojoImpl();
		return techFacilityPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityPojo createEntityPojo() {
		EntityPojoImpl entityPojo = new EntityPojoImpl();
		return entityPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityRequest createEntityRequest() {
		EntityRequestImpl entityRequest = new EntityRequestImpl();
		return entityRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CylonNetworkPojo createCylonNetworkPojo() {
		CylonNetworkPojoImpl cylonNetworkPojo = new CylonNetworkPojoImpl();
		return cylonNetworkPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportStatisticPojo createImportStatisticPojo() {
		ImportStatisticPojoImpl importStatisticPojo = new ImportStatisticPojoImpl();
		return importStatisticPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextRequest createTextRequest() {
		TextRequestImpl textRequest = new TextRequestImpl();
		return textRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkedIdInteger createLinkedIdInteger() {
		LinkedIdIntegerImpl linkedIdInteger = new LinkedIdIntegerImpl();
		return linkedIdInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RolePojo createRolePojo() {
		RolePojoImpl rolePojo = new RolePojoImpl();
		return rolePojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuspectPojo createSuspectPojo() {
		SuspectPojoImpl suspectPojo = new SuspectPojoImpl();
		return suspectPojo;
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
	public GltPackage getGltPackage() {
		return (GltPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GltPackage getPackage() {
		return GltPackage.eINSTANCE;
	}

} //GltFactoryImpl
