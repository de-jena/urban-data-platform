/*
 */
package de.jena.model.glt;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.jena.model.glt.GltFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = GltPackage.eNS_URI, genModel = "/model/glt.genmodel", genModelSourceLocations = {"model/glt.genmodel","de.jena.glt.rest.model/model/glt.genmodel"}, ecore="/model/glt.ecore", ecoreSourceLocations="/model/glt.ecore")
public interface GltPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "glt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://glt.jena.de/rest/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "glt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GltPackage eINSTANCE = de.jena.model.glt.impl.GltPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.AlarmImpl <em>Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.AlarmImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getAlarm()
	 * @generated
	 */
	int ALARM = 0;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__FLAGS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Consequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__CONSEQUENCE = 4;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__CAUSE = 5;

	/**
	 * The feature id for the '<em><b>Sl24schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__SL24SCHEDULE = 6;

	/**
	 * The feature id for the '<em><b>Priority Summer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__PRIORITY_SUMMER = 7;

	/**
	 * The feature id for the '<em><b>Priority Winter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__PRIORITY_WINTER = 8;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__SYSTEM_ID = 9;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__FLAG = 10;

	/**
	 * The number of structural features of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.AlarmIdImpl <em>Alarm Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.AlarmIdImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getAlarmId()
	 * @generated
	 */
	int ALARM_ID = 1;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_ID__SYSTEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Building Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_ID__BUILDING_ID = 1;

	/**
	 * The feature id for the '<em><b>Alarm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_ID__ALARM_ID = 2;

	/**
	 * The number of structural features of the '<em>Alarm Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_ID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Alarm Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.AlarmRequestImpl <em>Alarm Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.AlarmRequestImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getAlarmRequest()
	 * @generated
	 */
	int ALARM_REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_REQUEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Priority Summer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_REQUEST__PRIORITY_SUMMER = 1;

	/**
	 * The feature id for the '<em><b>Priority Winter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_REQUEST__PRIORITY_WINTER = 2;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_REQUEST__FLAGS = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_REQUEST__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Consequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_REQUEST__CONSEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_REQUEST__CAUSE = 6;

	/**
	 * The feature id for the '<em><b>Sl24 Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_REQUEST__SL24_SCHEDULE = 7;

	/**
	 * The number of structural features of the '<em>Alarm Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_REQUEST_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Alarm Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.AlarmPojoImpl <em>Alarm Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.AlarmPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getAlarmPojo()
	 * @generated
	 */
	int ALARM_POJO = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_POJO__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_POJO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_POJO__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_POJO__FLAGS = 3;

	/**
	 * The feature id for the '<em><b>Consequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_POJO__CONSEQUENCE = 4;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_POJO__CAUSE = 5;

	/**
	 * The feature id for the '<em><b>Sl24schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_POJO__SL24SCHEDULE = 6;

	/**
	 * The feature id for the '<em><b>Priority Summer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_POJO__PRIORITY_SUMMER = 7;

	/**
	 * The feature id for the '<em><b>Priority Winter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_POJO__PRIORITY_WINTER = 8;

	/**
	 * The number of structural features of the '<em>Alarm Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_POJO_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Alarm Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.InstructionsPojoImpl <em>Instructions Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.InstructionsPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getInstructionsPojo()
	 * @generated
	 */
	int INSTRUCTIONS_POJO = 4;

	/**
	 * The feature id for the '<em><b>Alarm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_POJO__ALARM_ID = 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_POJO__RELATIONS = 1;

	/**
	 * The number of structural features of the '<em>Instructions Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_POJO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Instructions Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.RelationPojoImpl <em>Relation Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.RelationPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getRelationPojo()
	 * @generated
	 */
	int RELATION_POJO = 5;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_POJO__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_POJO__INSTRUCTIONS = 1;

	/**
	 * The number of structural features of the '<em>Relation Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_POJO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relation Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.CalendarEventPojoImpl <em>Calendar Event Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.CalendarEventPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getCalendarEventPojo()
	 * @generated
	 */
	int CALENDAR_EVENT_POJO = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_EVENT_POJO__ID = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_EVENT_POJO__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_EVENT_POJO__TO = 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_EVENT_POJO__NOTE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_EVENT_POJO__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_EVENT_POJO__AUTHOR = 5;

	/**
	 * The feature id for the '<em><b>Alarm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_EVENT_POJO__ALARM_ID = 6;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_EVENT_POJO__SYSTEM_ID = 7;

	/**
	 * The number of structural features of the '<em>Calendar Event Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_EVENT_POJO_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Calendar Event Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_EVENT_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.CalenderEventRequestImpl <em>Calender Event Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.CalenderEventRequestImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getCalenderEventRequest()
	 * @generated
	 */
	int CALENDER_EVENT_REQUEST = 7;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_EVENT_REQUEST__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_EVENT_REQUEST__TO = 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_EVENT_REQUEST__NOTE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_EVENT_REQUEST__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Calender Event Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_EVENT_REQUEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Calender Event Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_EVENT_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.CommentPojoImpl <em>Comment Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.CommentPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getCommentPojo()
	 * @generated
	 */
	int COMMENT_POJO = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_POJO__ID = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_POJO__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_POJO__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_POJO__CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_POJO__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Owner Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_POJO__OWNER_ID = 5;

	/**
	 * The feature id for the '<em><b>Owner Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_POJO__OWNER_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_POJO__STATUS = 7;

	/**
	 * The number of structural features of the '<em>Comment Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_POJO_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Comment Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.StatusPojoImpl <em>Status Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.StatusPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getStatusPojo()
	 * @generated
	 */
	int STATUS_POJO = 9;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_POJO__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_POJO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_POJO__AUTHOR = 2;

	/**
	 * The number of structural features of the '<em>Status Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_POJO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Status Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.CommentRequestImpl <em>Comment Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.CommentRequestImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getCommentRequest()
	 * @generated
	 */
	int COMMENT_REQUEST = 10;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_REQUEST__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_REQUEST__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Comment Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Comment Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.AlarmLogPojoImpl <em>Alarm Log Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.AlarmLogPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getAlarmLogPojo()
	 * @generated
	 */
	int ALARM_LOG_POJO = 11;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_LOG_POJO__SYSTEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Alarm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_LOG_POJO__ALARM_ID = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_LOG_POJO__STATE = 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_LOG_POJO__TIMESTAMP = 3;

	/**
	 * The number of structural features of the '<em>Alarm Log Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_LOG_POJO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Alarm Log Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_LOG_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.ChangeItemImpl <em>Change Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.ChangeItemImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getChangeItem()
	 * @generated
	 */
	int CHANGE_ITEM = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__TARGET = 4;

	/**
	 * The feature id for the '<em><b>Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__CHANGE = 5;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM__AUTHOR = 6;

	/**
	 * The number of structural features of the '<em>Change Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Change Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.DatalogContentPojoImpl <em>Datalog Content Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.DatalogContentPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getDatalogContentPojo()
	 * @generated
	 */
	int DATALOG_CONTENT_POJO = 13;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__SYSTEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__NAME = 2;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__VALUE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Datalog Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__DATALOG_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Point Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__POINT_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__POINT_NAME = 6;

	/**
	 * The feature id for the '<em><b>Point Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__POINT_ID = 7;

	/**
	 * The feature id for the '<em><b>Entries T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__ENTRIES_T = 8;

	/**
	 * The feature id for the '<em><b>Entries V</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__ENTRIES_V = 9;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__TIME = 10;

	/**
	 * The feature id for the '<em><b>Time Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__TIME_CONTROLLER = 11;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__COUNTER = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__VALUE = 13;

	/**
	 * The feature id for the '<em><b>Is Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__IS_UNKNOWN = 14;

	/**
	 * The feature id for the '<em><b>Is Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__IS_ERROR = 15;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO__COMMENTS = 16;

	/**
	 * The number of structural features of the '<em>Datalog Content Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Datalog Content Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALOG_CONTENT_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.PointValuePojoImpl <em>Point Value Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.PointValuePojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getPointValuePojo()
	 * @generated
	 */
	int POINT_VALUE_POJO = 14;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_VALUE_POJO__SYSTEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_VALUE_POJO__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_VALUE_POJO__NAME = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_VALUE_POJO__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Value Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_VALUE_POJO__VALUE_PREV = 4;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_VALUE_POJO__TIME = 5;

	/**
	 * The feature id for the '<em><b>Override State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_VALUE_POJO__OVERRIDE_STATE = 6;

	/**
	 * The feature id for the '<em><b>Is Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_VALUE_POJO__IS_UNKNOWN = 7;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_VALUE_POJO__COMMENTS = 8;

	/**
	 * The number of structural features of the '<em>Point Value Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_VALUE_POJO_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Point Value Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_VALUE_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.AlarmLogTimelinePojoImpl <em>Alarm Log Timeline Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.AlarmLogTimelinePojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getAlarmLogTimelinePojo()
	 * @generated
	 */
	int ALARM_LOG_TIMELINE_POJO = 15;

	/**
	 * The feature id for the '<em><b>Alarm Logs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_LOG_TIMELINE_POJO__ALARM_LOGS = 0;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_LOG_TIMELINE_POJO__TOTAL = 1;

	/**
	 * The number of structural features of the '<em>Alarm Log Timeline Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_LOG_TIMELINE_POJO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Alarm Log Timeline Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_LOG_TIMELINE_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.StatisticEntryImpl <em>Statistic Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.StatisticEntryImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getStatisticEntry()
	 * @generated
	 */
	int STATISTIC_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Time Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_ENTRY__TIME_WINDOW = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_ENTRY__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Statistic Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Statistic Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.TimeWindowImpl <em>Time Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.TimeWindowImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getTimeWindow()
	 * @generated
	 */
	int TIME_WINDOW = 17;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW__UNIT = 2;

	/**
	 * The feature id for the '<em><b>Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW__ZONE_ID = 3;

	/**
	 * The number of structural features of the '<em>Time Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Time Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.EntityMonitoringSettingsPojoImpl <em>Entity Monitoring Settings Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.EntityMonitoringSettingsPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getEntityMonitoringSettingsPojo()
	 * @generated
	 */
	int ENTITY_MONITORING_SETTINGS_POJO = 18;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MONITORING_SETTINGS_POJO__SYSTEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MONITORING_SETTINGS_POJO__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MONITORING_SETTINGS_POJO__NAME = 2;

	/**
	 * The feature id for the '<em><b>Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MONITORING_SETTINGS_POJO__INCLUDED = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MONITORING_SETTINGS_POJO__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Entity Monitoring Settings Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MONITORING_SETTINGS_POJO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Entity Monitoring Settings Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MONITORING_SETTINGS_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.SyncLogPojoImpl <em>Sync Log Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.SyncLogPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getSyncLogPojo()
	 * @generated
	 */
	int SYNC_LOG_POJO = 19;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_LOG_POJO__SYSTEM_ID = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_LOG_POJO__STATE = 1;

	/**
	 * The feature id for the '<em><b>Latest Ringbuffer Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_LOG_POJO__LATEST_RINGBUFFER_TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Last Access Time Ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_LOG_POJO__LAST_ACCESS_TIME_MS = 3;

	/**
	 * The feature id for the '<em><b>Average Access Time Ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_LOG_POJO__AVERAGE_ACCESS_TIME_MS = 4;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_LOG_POJO__TIMESTAMP = 5;

	/**
	 * The feature id for the '<em><b>State Since</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_LOG_POJO__STATE_SINCE = 6;

	/**
	 * The number of structural features of the '<em>Sync Log Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_LOG_POJO_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Sync Log Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_LOG_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.StatusLogPojoImpl <em>Status Log Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.StatusLogPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getStatusLogPojo()
	 * @generated
	 */
	int STATUS_LOG_POJO = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_POJO__ID = 0;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_POJO__SYSTEM_ID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_POJO__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_POJO__SEVERITY = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_POJO__MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_POJO__TIMESTAMP = 5;

	/**
	 * The number of structural features of the '<em>Status Log Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_POJO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Status Log Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.UpdateStateRequestImpl <em>Update State Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.UpdateStateRequestImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getUpdateStateRequest()
	 * @generated
	 */
	int UPDATE_STATE_REQUEST = 21;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_STATE_REQUEST__SYSTEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Alarm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_STATE_REQUEST__ALARM_ID = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_STATE_REQUEST__STATE = 2;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_STATE_REQUEST__SEVERITY = 3;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_STATE_REQUEST__TIMESTAMP = 4;

	/**
	 * The number of structural features of the '<em>Update State Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_STATE_REQUEST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Update State Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_STATE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.StatusLogRequestImpl <em>Status Log Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.StatusLogRequestImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getStatusLogRequest()
	 * @generated
	 */
	int STATUS_LOG_REQUEST = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_REQUEST__ID = 0;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_REQUEST__SYSTEM_ID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_REQUEST__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_REQUEST__SEVERITY = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_REQUEST__MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_REQUEST__TIMESTAMP = 5;

	/**
	 * The number of structural features of the '<em>Status Log Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_REQUEST_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Status Log Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LOG_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.TimeScheduleBlockPojoImpl <em>Time Schedule Block Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.TimeScheduleBlockPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getTimeScheduleBlockPojo()
	 * @generated
	 */
	int TIME_SCHEDULE_BLOCK_POJO = 23;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_BLOCK_POJO__SYSTEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_BLOCK_POJO__ID = 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_BLOCK_POJO__BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Exception Start Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_START_DAY = 3;

	/**
	 * The feature id for the '<em><b>Exception Start Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_START_MONTH = 4;

	/**
	 * The feature id for the '<em><b>Exception End Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_END_DAY = 5;

	/**
	 * The feature id for the '<em><b>Exception End Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_END_MONTH = 6;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_BLOCK_POJO__YEAR = 7;

	/**
	 * The feature id for the '<em><b>Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_BLOCK_POJO__TIMES = 8;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_BLOCK_POJO__TIME = 9;

	/**
	 * The feature id for the '<em><b>Is Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_BLOCK_POJO__IS_UNKNOWN = 10;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_BLOCK_POJO__COMMENTS = 11;

	/**
	 * The number of structural features of the '<em>Time Schedule Block Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_BLOCK_POJO_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Time Schedule Block Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_BLOCK_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.TimeScheduleStatePojoImpl <em>Time Schedule State Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.TimeScheduleStatePojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getTimeScheduleStatePojo()
	 * @generated
	 */
	int TIME_SCHEDULE_STATE_POJO = 24;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_STATE_POJO__SYSTEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_STATE_POJO__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_STATE_POJO__NAME = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_STATE_POJO__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_STATE_POJO__TIME = 4;

	/**
	 * The feature id for the '<em><b>Is Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_STATE_POJO__IS_UNKNOWN = 5;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_STATE_POJO__COMMENTS = 6;

	/**
	 * The number of structural features of the '<em>Time Schedule State Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_STATE_POJO_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Time Schedule State Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_STATE_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.VersionInfoImpl <em>Version Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.VersionInfoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getVersionInfo()
	 * @generated
	 */
	int VERSION_INFO = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO__ID = 0;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO__COORDINATES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO__SERIAL = 5;

	/**
	 * The number of structural features of the '<em>Version Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Version Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.PointRecordImpl <em>Point Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.PointRecordImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getPointRecord()
	 * @generated
	 */
	int POINT_RECORD = 26;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RECORD__SYSTEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RECORD__ID = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RECORD__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RECORD__NEW_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RECORD__OLD_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Override Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RECORD__OVERRIDE_STATUS = 5;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RECORD__NOTE = 6;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RECORD__AUTHOR = 7;

	/**
	 * The number of structural features of the '<em>Point Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RECORD_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Point Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.TimeScheduleRecordImpl <em>Time Schedule Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.TimeScheduleRecordImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getTimeScheduleRecord()
	 * @generated
	 */
	int TIME_SCHEDULE_RECORD = 27;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_RECORD__SYSTEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_RECORD__ID = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_RECORD__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_RECORD__OLD_VALUE = 3;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_RECORD__NEW_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_RECORD__NOTE = 5;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_RECORD__AUTHOR = 6;

	/**
	 * The number of structural features of the '<em>Time Schedule Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_RECORD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Time Schedule Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCHEDULE_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.AddressPojoImpl <em>Address Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.AddressPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getAddressPojo()
	 * @generated
	 */
	int ADDRESS_POJO = 28;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Community</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO__COMMUNITY = 1;

	/**
	 * The feature id for the '<em><b>County</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO__COUNTY = 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO__COUNTRY = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO__DISTRICT = 5;

	/**
	 * The feature id for the '<em><b>Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO__EXTENDED = 6;

	/**
	 * The feature id for the '<em><b>Federal State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO__FEDERAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO__LOCATION = 8;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO__NUMBER = 9;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO__POST_BOX = 10;

	/**
	 * The feature id for the '<em><b>Post Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO__POST_CODE = 11;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO__STREET = 12;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO__REPRESENTATION = 13;

	/**
	 * The number of structural features of the '<em>Address Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Address Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl <em>System Description Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.SystemDescriptionPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getSystemDescriptionPojo()
	 * @generated
	 */
	int SYSTEM_DESCRIPTION_POJO = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__IP = 3;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__DIRECTORY = 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__PORT = 5;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__LON = 6;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__LAT = 7;

	/**
	 * The feature id for the '<em><b>Shallow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__SHALLOW = 8;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__EXCLUDED = 9;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__EXTERNAL_ID = 10;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__ADDRESS = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__SOURCE = 12;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__CHILDREN = 13;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__FLAGS = 14;

	/**
	 * The feature id for the '<em><b>Cylon Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO__CYLON_NETWORK = 15;

	/**
	 * The number of structural features of the '<em>System Description Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>System Description Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.SystemDescriptionRequestImpl <em>System Description Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.SystemDescriptionRequestImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getSystemDescriptionRequest()
	 * @generated
	 */
	int SYSTEM_DESCRIPTION_REQUEST = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_REQUEST__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_REQUEST__NAME = 1;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_REQUEST__DIRECTORY = 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_REQUEST__PORT = 3;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_REQUEST__EXTERNAL_ID = 4;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_REQUEST__IP = 5;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_REQUEST__LON = 6;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_REQUEST__LAT = 7;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_REQUEST__EXCLUDED = 8;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_REQUEST__FLAGS = 9;

	/**
	 * The number of structural features of the '<em>System Description Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_REQUEST_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>System Description Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.ContactPojoImpl <em>Contact Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.ContactPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getContactPojo()
	 * @generated
	 */
	int CONTACT_POJO = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POJO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POJO__TASK = 1;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POJO__ADDITIONAL = 2;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POJO__FIRST_NAME = 3;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POJO__LAST_NAME = 4;

	/**
	 * The feature id for the '<em><b>Salutation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POJO__SALUTATION = 5;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POJO__SHORT_NAME = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POJO__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POJO__ADDRESS = 8;

	/**
	 * The feature id for the '<em><b>Phones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POJO__PHONES = 9;

	/**
	 * The feature id for the '<em><b>Emails</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POJO__EMAILS = 10;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POJO__COMMENTS = 11;

	/**
	 * The number of structural features of the '<em>Contact Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POJO_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Contact Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.PhonePojoImpl <em>Phone Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.PhonePojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getPhonePojo()
	 * @generated
	 */
	int PHONE_POJO = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_POJO__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_POJO__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Phone Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_POJO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Phone Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.ContractPojoImpl <em>Contract Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.ContractPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getContractPojo()
	 * @generated
	 */
	int CONTRACT_POJO = 33;

	/**
	 * The feature id for the '<em><b>Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__ART = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Displayname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__DISPLAYNAME = 2;

	/**
	 * The feature id for the '<em><b>Conclusion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__CONCLUSION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Contacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__CONTACTS = 5;

	/**
	 * The feature id for the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__CUSTOMER_ID = 6;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__END = 7;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__NUMBER = 8;

	/**
	 * The feature id for the '<em><b>Partner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__PARTNER = 9;

	/**
	 * The feature id for the '<em><b>Referee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__REFEREE = 10;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__START = 11;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__STATE = 12;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__SUBJECT = 13;

	/**
	 * The feature id for the '<em><b>Termination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__TERMINATION = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO__TYPE = 15;

	/**
	 * The number of structural features of the '<em>Contract Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Contract Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.TechFacilityPojoImpl <em>Tech Facility Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.TechFacilityPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getTechFacilityPojo()
	 * @generated
	 */
	int TECH_FACILITY_POJO = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_FACILITY_POJO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Facility Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_FACILITY_POJO__FACILITY_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Facility Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_FACILITY_POJO__FACILITY_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_FACILITY_POJO__ROOM = 3;

	/**
	 * The feature id for the '<em><b>Construction Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_FACILITY_POJO__CONSTRUCTION_YEAR = 4;

	/**
	 * The feature id for the '<em><b>Launch Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_FACILITY_POJO__LAUNCH_DATE = 5;

	/**
	 * The feature id for the '<em><b>Contracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_FACILITY_POJO__CONTRACTS = 6;

	/**
	 * The number of structural features of the '<em>Tech Facility Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_FACILITY_POJO_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Tech Facility Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_FACILITY_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.EntityPojoImpl <em>Entity Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.EntityPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getEntityPojo()
	 * @generated
	 */
	int ENTITY_POJO = 35;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_POJO__ENTITY = 0;

	/**
	 * The number of structural features of the '<em>Entity Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_POJO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.EntityRequestImpl <em>Entity Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.EntityRequestImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getEntityRequest()
	 * @generated
	 */
	int ENTITY_REQUEST = 36;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REQUEST__SYSTEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REQUEST__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REQUEST__IDENTIFIER = 2;

	/**
	 * The number of structural features of the '<em>Entity Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entity Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.CylonNetworkPojoImpl <em>Cylon Network Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.CylonNetworkPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getCylonNetworkPojo()
	 * @generated
	 */
	int CYLON_NETWORK_POJO = 37;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLON_NETWORK_POJO__ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLON_NETWORK_POJO__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLON_NETWORK_POJO__NAME = 2;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLON_NETWORK_POJO__SYSTEM_ID = 3;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLON_NETWORK_POJO__DIRECTORY = 4;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLON_NETWORK_POJO__IP = 5;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLON_NETWORK_POJO__PORT = 6;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLON_NETWORK_POJO__COUNT = 7;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLON_NETWORK_POJO__CHILDREN = 8;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLON_NETWORK_POJO__SUMMARY = 9;

	/**
	 * The number of structural features of the '<em>Cylon Network Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLON_NETWORK_POJO_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Cylon Network Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLON_NETWORK_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.ImportStatisticPojoImpl <em>Import Statistic Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.ImportStatisticPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getImportStatisticPojo()
	 * @generated
	 */
	int IMPORT_STATISTIC_POJO = 38;

	/**
	 * The feature id for the '<em><b>Add</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATISTIC_POJO__ADD = 0;

	/**
	 * The feature id for the '<em><b>Remove</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATISTIC_POJO__REMOVE = 1;

	/**
	 * The feature id for the '<em><b>Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATISTIC_POJO__UPDATE = 2;

	/**
	 * The number of structural features of the '<em>Import Statistic Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATISTIC_POJO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Import Statistic Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATISTIC_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.TextImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 39;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = 2;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.TextRequestImpl <em>Text Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.TextRequestImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getTextRequest()
	 * @generated
	 */
	int TEXT_REQUEST = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REQUEST__ID = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REQUEST__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REQUEST__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Text Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Text Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.RolePojoImpl <em>Role Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.RolePojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getRolePojo()
	 * @generated
	 */
	int ROLE_POJO = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_POJO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_POJO__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_POJO__GROUPS = 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_POJO__ROLES = 3;

	/**
	 * The feature id for the '<em><b>Members</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_POJO__MEMBERS = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_POJO__PROPERTIES = 5;

	/**
	 * The number of structural features of the '<em>Role Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_POJO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Role Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.SuspectPojoImpl <em>Suspect Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.SuspectPojoImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getSuspectPojo()
	 * @generated
	 */
	int SUSPECT_POJO = 42;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPECT_POJO__SYSTEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Alarm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPECT_POJO__ALARM_ID = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPECT_POJO__STATE = 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPECT_POJO__TIMESTAMP = 3;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPECT_POJO__SEVERITY = 4;

	/**
	 * The feature id for the '<em><b>Recognized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPECT_POJO__RECOGNIZED = 5;

	/**
	 * The feature id for the '<em><b>By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPECT_POJO__BY = 6;

	/**
	 * The number of structural features of the '<em>Suspect Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPECT_POJO_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Suspect Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPECT_POJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.ResponseImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 43;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESULT = 3;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.OpenApiClient <em>Open Api Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.OpenApiClient
	 * @see de.jena.model.glt.impl.GltPackageImpl#getOpenApiClient()
	 * @generated
	 */
	int OPEN_API_CLIENT = 44;

	/**
	 * The number of structural features of the '<em>Open Api Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_API_CLIENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>To Query String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_API_CLIENT___TO_QUERY_STRING__STRING_OBJECT = 0;

	/**
	 * The operation id for the '<em>get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_API_CLIENT___GET__STRING_ECLASS_EMAP_EMAP = 1;

	/**
	 * The number of operations of the '<em>Open Api Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_API_CLIENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.GltOpenApiClientImpl <em>Open Api Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.GltOpenApiClientImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getGltOpenApiClient()
	 * @generated
	 */
	int GLT_OPEN_API_CLIENT = 45;

	/**
	 * The number of structural features of the '<em>Open Api Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT_FEATURE_COUNT = OPEN_API_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To Query String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___TO_QUERY_STRING__STRING_OBJECT = OPEN_API_CLIENT___TO_QUERY_STRING__STRING_OBJECT;

	/**
	 * The operation id for the '<em>get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET__STRING_ECLASS_EMAP_EMAP = OPEN_API_CLIENT___GET__STRING_ECLASS_EMAP_EMAP;

	/**
	 * The operation id for the '<em>Bulk Text Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___BULK_TEXT_UPDATE__STRING_INTEGER_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Alarm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM__STRING_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Update Alarm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___UPDATE_ALARM__STRING_ALARMREQUEST = OPEN_API_CLIENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Alarm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___CREATE_ALARM__STRING_ALARMREQUEST = OPEN_API_CLIENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Alarm Instructions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM_INSTRUCTIONS__STRING = OPEN_API_CLIENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Update Instructions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___UPDATE_INSTRUCTIONS__STRING_INSTRUCTIONSPOJO = OPEN_API_CLIENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Alarms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARMS__ELIST_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___USAGE__INTEGER_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Events For Alarm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_EVENTS_FOR_ALARM__STRING_STRING_STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Create Event For Alarm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___CREATE_EVENT_FOR_ALARM__STRING_CALENDEREVENTREQUEST = OPEN_API_CLIENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Events For System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_EVENTS_FOR_SYSTEM__STRING_STRING_BOOLEAN_STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Create Event For System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___CREATE_EVENT_FOR_SYSTEM__STRING_CALENDEREVENTREQUEST = OPEN_API_CLIENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Update Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___UPDATE_EVENT__INTEGER_CALENDEREVENTREQUEST = OPEN_API_CLIENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___DELETE_EVENT__INTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_EVENTS__ELIST_STRING_STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Events At Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_EVENTS_AT_TIME__ELIST_STRING_STRING_BIGINTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Events For Alarm 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_EVENTS_FOR_ALARM_1__STRING_STRING_STRING_BIGINTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Events For System 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_EVENTS_FOR_SYSTEM_1__STRING_STRING_STRING_BIGINTEGER_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get For Alarm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_FOR_ALARM__STRING_BIGINTEGER_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Create Comment For Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___CREATE_COMMENT_FOR_OWNER__STRING_BIGINTEGER_COMMENTREQUEST = OPEN_API_CLIENT_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Update Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___UPDATE_COMMENT__INTEGER_COMMENTREQUEST = OPEN_API_CLIENT_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Delete Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___DELETE_COMMENT__INTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Commented On</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_COMMENTED_ON__STRING_STRING_STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Filtered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_FILTERED__INTEGER_INTEGER_ELIST_ELIST_BOOLEAN_ELIST_ELIST_ELIST_STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Filtered Authors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_FILTERED_AUTHORS__ELIST_ELIST_BOOLEAN_ELIST_ELIST_STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Filtered Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_FILTERED_COUNT__ELIST_ELIST_BOOLEAN_ELIST_ELIST_ELIST_STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Update Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___UPDATE_STATUS__INTEGER_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Building Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_BUILDING_NAMES__ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Device Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_DEVICE_NAME__ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Devices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_DEVICES__BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Get Devices Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_DEVICES_COUNT = OPEN_API_CLIENT_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Get Alarms With Mismatched Systems</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARMS_WITH_MISMATCHED_SYSTEMS = OPEN_API_CLIENT_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Get Audit Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_AUDIT_LOG__INTEGER_INTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Get Audit Log Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_AUDIT_LOG_COUNT = OPEN_API_CLIENT_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Get Duplicate Texts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_DUPLICATE_TEXTS = OPEN_API_CLIENT_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Get Fields</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_FIELDS__BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Get Undocumented Alarms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_UNDOCUMENTED_ALARMS = OPEN_API_CLIENT_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Get Unused Texts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_UNUSED_TEXTS = OPEN_API_CLIENT_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Import From Csv</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___IMPORT_FROM_CSV__ELIST_STRING_BOOLEAN_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Get Datalog Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_DATALOG_CONTENT__INTEGER_ELIST_STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Get Datalog Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_DATALOG_INFO__INTEGER_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Update Datalog Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___UPDATE_DATALOG_CONTENT__INTEGER_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Get Changelog</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_CHANGELOG__INTEGER_INTEGER_ELIST_BOOLEAN_ELIST_STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Get Changelog Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_CHANGELOG_COUNT__ELIST_BOOLEAN_ELIST_STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Get Point Value History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_POINT_VALUE_HISTORY__INTEGER_ELIST_BOOLEAN_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Get Point Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_POINT_VALUES__INTEGER_STRING_STRING_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Update Point Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___UPDATE_POINT_VALUES__INTEGER_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Get Alarm Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM_COUNT__ELIST_BIGINTEGER_BIGINTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Get Alarm Count Post</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM_COUNT_POST__BIGINTEGER_BIGINTEGER_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Get Alarm Count 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM_COUNT_1__STRING_STRING_ELIST_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Get Alarm Count By State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM_COUNT_BY_STATE__STRING_ELIST_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Get Alarm Count By State 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM_COUNT_BY_STATE_1__ELIST_BOOLEAN_ELIST_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Get Alarm Count For System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM_COUNT_FOR_SYSTEM__STRING_ELIST_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Get Alarm For State Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM_FOR_STATE_COUNT__STRING_ELIST_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Get Alarm Log Timeline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM_LOG_TIMELINE__STRING_BIGINTEGER_BIGINTEGER_INTEGER_INTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>Get Alarm Log Timeline Statistics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM_LOG_TIMELINE_STATISTICS__STRING_BIGINTEGER_BIGINTEGER_STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>Get Alarm Logs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM_LOGS__ELIST_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 56;

	/**
	 * The operation id for the '<em>Get Alarm Logs 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM_LOGS_1__STRING_ELIST_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 57;

	/**
	 * The operation id for the '<em>Get Alarm Logs For State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM_LOGS_FOR_STATE__STRING_ELIST_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 58;

	/**
	 * The operation id for the '<em>Get Alarm Logs For States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM_LOGS_FOR_STATES__ELIST_ELIST_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 59;

	/**
	 * The operation id for the '<em>Get Alarm Logs Timeline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARM_LOGS_TIMELINE__STRING_BIGINTEGER_BIGINTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 60;

	/**
	 * The operation id for the '<em>Get Alarms For State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARMS_FOR_STATE__STRING_STRING_ELIST_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 61;

	/**
	 * The operation id for the '<em>Get Alarms For States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALARMS_FOR_STATES__STRING_ELIST_ELIST_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 62;

	/**
	 * The operation id for the '<em>Get Entity Monitoring</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ENTITY_MONITORING__INTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 63;

	/**
	 * The operation id for the '<em>Get Entity Monitoring 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ENTITY_MONITORING_1__INTEGER_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 64;

	/**
	 * The operation id for the '<em>Update Entity Monitoring</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___UPDATE_ENTITY_MONITORING__INTEGER_STRING_INTEGER_STRING_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 65;

	/**
	 * The operation id for the '<em>Get Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_LOG__STRING = OPEN_API_CLIENT_OPERATION_COUNT + 66;

	/**
	 * The operation id for the '<em>Get Logs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_LOGS = OPEN_API_CLIENT_OPERATION_COUNT + 67;

	/**
	 * The operation id for the '<em>Get Logs For State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_LOGS_FOR_STATE__STRING = OPEN_API_CLIENT_OPERATION_COUNT + 68;

	/**
	 * The operation id for the '<em>Get Statistics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_STATISTICS__STRING = OPEN_API_CLIENT_OPERATION_COUNT + 69;

	/**
	 * The operation id for the '<em>Get Status Logs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_STATUS_LOGS = OPEN_API_CLIENT_OPERATION_COUNT + 70;

	/**
	 * The operation id for the '<em>Upsert Status Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___UPSERT_STATUS_LOG__STATUSLOGREQUEST = OPEN_API_CLIENT_OPERATION_COUNT + 71;

	/**
	 * The operation id for the '<em>Get Status Logs 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_STATUS_LOGS_1__STRING = OPEN_API_CLIENT_OPERATION_COUNT + 72;

	/**
	 * The operation id for the '<em>Get Status Logs Timeline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_STATUS_LOGS_TIMELINE__STRING_BIGINTEGER_BIGINTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 73;

	/**
	 * The operation id for the '<em>Get Tracked</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_TRACKED__STRING = OPEN_API_CLIENT_OPERATION_COUNT + 74;

	/**
	 * The operation id for the '<em>Is Flaky</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___IS_FLAKY__STRING_STRING_BIGINTEGER_BIGINTEGER_INTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 75;

	/**
	 * The operation id for the '<em>Logs For States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___LOGS_FOR_STATES__ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 76;

	/**
	 * The operation id for the '<em>Refresh System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___REFRESH_SYSTEM__STRING = OPEN_API_CLIENT_OPERATION_COUNT + 77;

	/**
	 * The operation id for the '<em>Update Alarm State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___UPDATE_ALARM_STATE__STRING_UPDATESTATEREQUEST = OPEN_API_CLIENT_OPERATION_COUNT + 78;

	/**
	 * The operation id for the '<em>Get Changelog 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_CHANGELOG_1__INTEGER_INTEGER_ELIST_BOOLEAN_ELIST_STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 79;

	/**
	 * The operation id for the '<em>Get Changelog Count 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_CHANGELOG_COUNT_1__ELIST_BOOLEAN_ELIST_STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 80;

	/**
	 * The operation id for the '<em>Get Time Schedule Block History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_TIME_SCHEDULE_BLOCK_HISTORY__INTEGER_ELIST_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 81;

	/**
	 * The operation id for the '<em>Get Time Schedule Blocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_TIME_SCHEDULE_BLOCKS__INTEGER_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 82;

	/**
	 * The operation id for the '<em>Update Time Schedule Blocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___UPDATE_TIME_SCHEDULE_BLOCKS__INTEGER_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 83;

	/**
	 * The operation id for the '<em>Get Time Schedule State History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_TIME_SCHEDULE_STATE_HISTORY__INTEGER_ELIST_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 84;

	/**
	 * The operation id for the '<em>Get Time Schedule States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_TIME_SCHEDULE_STATES__INTEGER_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 85;

	/**
	 * The operation id for the '<em>Update Time Schedule States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___UPDATE_TIME_SCHEDULE_STATES__INTEGER_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 86;

	/**
	 * The operation id for the '<em>Get Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_VERSION__INTEGER_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 87;

	/**
	 * The operation id for the '<em>Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___POINT__POINTRECORD = OPEN_API_CLIENT_OPERATION_COUNT + 88;

	/**
	 * The operation id for the '<em>Timeschedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___TIMESCHEDULE__TIMESCHEDULERECORD = OPEN_API_CLIENT_OPERATION_COUNT + 89;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET__STRING = OPEN_API_CLIENT_OPERATION_COUNT + 90;

	/**
	 * The operation id for the '<em>Create Or Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___CREATE_OR_UPDATE__STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 91;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___CREATE__STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 92;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___DELETE__STRING = OPEN_API_CLIENT_OPERATION_COUNT + 93;

	/**
	 * The operation id for the '<em>Get All Settings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ALL_SETTINGS = OPEN_API_CLIENT_OPERATION_COUNT + 94;

	/**
	 * The operation id for the '<em>Get Auth Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_AUTH_STATUS = OPEN_API_CLIENT_OPERATION_COUNT + 95;

	/**
	 * The operation id for the '<em>Get Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_STATUS = OPEN_API_CLIENT_OPERATION_COUNT + 96;

	/**
	 * The operation id for the '<em>Get System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_SYSTEM__STRING_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 97;

	/**
	 * The operation id for the '<em>Update System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___UPDATE_SYSTEM__STRING_SYSTEMDESCRIPTIONREQUEST = OPEN_API_CLIENT_OPERATION_COUNT + 98;

	/**
	 * The operation id for the '<em>Create System Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___CREATE_SYSTEM_DESCRIPTION__STRING_SYSTEMDESCRIPTIONREQUEST = OPEN_API_CLIENT_OPERATION_COUNT + 99;

	/**
	 * The operation id for the '<em>Delete System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___DELETE_SYSTEM__STRING = OPEN_API_CLIENT_OPERATION_COUNT + 100;

	/**
	 * The operation id for the '<em>Get Contacts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_CONTACTS__STRING = OPEN_API_CLIENT_OPERATION_COUNT + 101;

	/**
	 * The operation id for the '<em>Get Contracts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_CONTRACTS__STRING_STRING_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 102;

	/**
	 * The operation id for the '<em>Get Systems</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_SYSTEMS__BOOLEAN_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 103;

	/**
	 * The operation id for the '<em>Get Tech Facilities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_TECH_FACILITIES__STRING_STRING_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 104;

	/**
	 * The operation id for the '<em>Get Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ENTITIES__ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 105;

	/**
	 * The operation id for the '<em>Get Entities By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ENTITIES_BY_TYPE__INTEGER_STRING_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 106;

	/**
	 * The operation id for the '<em>Get Entities By Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ENTITIES_BY_TYPES__INTEGER_ELIST_ELIST = OPEN_API_CLIENT_OPERATION_COUNT + 107;

	/**
	 * The operation id for the '<em>Get System Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_SYSTEM_ENTITIES__INTEGER_INTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 108;

	/**
	 * The operation id for the '<em>Get System Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_SYSTEM_ENTITY__INTEGER_STRING_INTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 109;

	/**
	 * The operation id for the '<em>Import Systems</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___IMPORT_SYSTEMS__BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 110;

	/**
	 * The operation id for the '<em>Cleanup Texts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___CLEANUP_TEXTS = OPEN_API_CLIENT_OPERATION_COUNT + 111;

	/**
	 * The operation id for the '<em>Create Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___CREATE_TEXT__TEXTREQUEST = OPEN_API_CLIENT_OPERATION_COUNT + 112;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_TEXT__INTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 113;

	/**
	 * The operation id for the '<em>Update Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___UPDATE_TEXT__INTEGER_TEXTREQUEST = OPEN_API_CLIENT_OPERATION_COUNT + 114;

	/**
	 * The operation id for the '<em>Delete Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___DELETE_TEXT__INTEGER = OPEN_API_CLIENT_OPERATION_COUNT + 115;

	/**
	 * The operation id for the '<em>Get Text Ids</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_TEXT_IDS__BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 116;

	/**
	 * The operation id for the '<em>Get Texts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_TEXTS__STRING_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 117;

	/**
	 * The operation id for the '<em>Get Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_GROUPS = OPEN_API_CLIENT_OPERATION_COUNT + 118;

	/**
	 * The operation id for the '<em>Add Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___ADD_GROUP__STRING = OPEN_API_CLIENT_OPERATION_COUNT + 119;

	/**
	 * The operation id for the '<em>Add Member To Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___ADD_MEMBER_TO_GROUP__STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 120;

	/**
	 * The operation id for the '<em>Add Property To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___ADD_PROPERTY_TO_ROLE__STRING_STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 121;

	/**
	 * The operation id for the '<em>Remove Property From Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___REMOVE_PROPERTY_FROM_ROLE__STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 122;

	/**
	 * The operation id for the '<em>Get Users</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_USERS = OPEN_API_CLIENT_OPERATION_COUNT + 123;

	/**
	 * The operation id for the '<em>Add User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___ADD_USER__STRING = OPEN_API_CLIENT_OPERATION_COUNT + 124;

	/**
	 * The operation id for the '<em>Current Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___CURRENT_ROLE = OPEN_API_CLIENT_OPERATION_COUNT + 125;

	/**
	 * The operation id for the '<em>Get Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_ROLE__STRING_BOOLEAN_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 126;

	/**
	 * The operation id for the '<em>Remove Member From Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___REMOVE_MEMBER_FROM_GROUP__STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 127;

	/**
	 * The operation id for the '<em>Remove Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___REMOVE_ROLE__STRING = OPEN_API_CLIENT_OPERATION_COUNT + 128;

	/**
	 * The operation id for the '<em>Update Suspect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___UPDATE_SUSPECT__STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 129;

	/**
	 * The operation id for the '<em>Delete Suspect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___DELETE_SUSPECT__STRING_STRING = OPEN_API_CLIENT_OPERATION_COUNT + 130;

	/**
	 * The operation id for the '<em>Get Suspects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_SUSPECTS__ELIST_ELIST_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 131;

	/**
	 * The operation id for the '<em>Get Suspects 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT___GET_SUSPECTS_1__STRING_ELIST_ELIST_BOOLEAN = OPEN_API_CLIENT_OPERATION_COUNT + 132;

	/**
	 * The number of operations of the '<em>Open Api Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLT_OPEN_API_CLIENT_OPERATION_COUNT = OPEN_API_CLIENT_OPERATION_COUNT + 133;

	/**
	 * The meta object id for the '{@link de.jena.model.glt.impl.JsonNodeImpl <em>Json Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.glt.impl.JsonNodeImpl
	 * @see de.jena.model.glt.impl.GltPackageImpl#getJsonNode()
	 * @generated
	 */
	int JSON_NODE = 46;

	/**
	 * The number of structural features of the '<em>Json Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Json Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>JResponse</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jakarta.ws.rs.core.Response
	 * @see de.jena.model.glt.impl.GltPackageImpl#getJResponse()
	 * @generated
	 */
	int JRESPONSE = 47;


	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm</em>'.
	 * @see de.jena.model.glt.Alarm
	 * @generated
	 */
	EClass getAlarm();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Alarm#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see de.jena.model.glt.Alarm#getFlags()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_Flags();

	/**
	 * Returns the meta object for the reference '{@link de.jena.model.glt.Alarm#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id</em>'.
	 * @see de.jena.model.glt.Alarm#getId()
	 * @see #getAlarm()
	 * @generated
	 */
	EReference getAlarm_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Alarm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.Alarm#getName()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Alarm#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.model.glt.Alarm#getDescription()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Alarm#getConsequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consequence</em>'.
	 * @see de.jena.model.glt.Alarm#getConsequence()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_Consequence();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Alarm#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause</em>'.
	 * @see de.jena.model.glt.Alarm#getCause()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_Cause();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Alarm#getSl24schedule <em>Sl24schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sl24schedule</em>'.
	 * @see de.jena.model.glt.Alarm#getSl24schedule()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_Sl24schedule();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Alarm#getPrioritySummer <em>Priority Summer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority Summer</em>'.
	 * @see de.jena.model.glt.Alarm#getPrioritySummer()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_PrioritySummer();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Alarm#getPriorityWinter <em>Priority Winter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority Winter</em>'.
	 * @see de.jena.model.glt.Alarm#getPriorityWinter()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_PriorityWinter();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Alarm#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.Alarm#getSystemId()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Alarm#getFlag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag</em>'.
	 * @see de.jena.model.glt.Alarm#getFlag()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_Flag();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.AlarmId <em>Alarm Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm Id</em>'.
	 * @see de.jena.model.glt.AlarmId
	 * @generated
	 */
	EClass getAlarmId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmId#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.AlarmId#getSystemId()
	 * @see #getAlarmId()
	 * @generated
	 */
	EAttribute getAlarmId_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmId#getBuildingId <em>Building Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Id</em>'.
	 * @see de.jena.model.glt.AlarmId#getBuildingId()
	 * @see #getAlarmId()
	 * @generated
	 */
	EAttribute getAlarmId_BuildingId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmId#getAlarmId <em>Alarm Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Id</em>'.
	 * @see de.jena.model.glt.AlarmId#getAlarmId()
	 * @see #getAlarmId()
	 * @generated
	 */
	EAttribute getAlarmId_AlarmId();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.AlarmRequest <em>Alarm Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm Request</em>'.
	 * @see de.jena.model.glt.AlarmRequest
	 * @generated
	 */
	EClass getAlarmRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmRequest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.AlarmRequest#getName()
	 * @see #getAlarmRequest()
	 * @generated
	 */
	EAttribute getAlarmRequest_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmRequest#getPrioritySummer <em>Priority Summer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority Summer</em>'.
	 * @see de.jena.model.glt.AlarmRequest#getPrioritySummer()
	 * @see #getAlarmRequest()
	 * @generated
	 */
	EAttribute getAlarmRequest_PrioritySummer();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmRequest#getPriorityWinter <em>Priority Winter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority Winter</em>'.
	 * @see de.jena.model.glt.AlarmRequest#getPriorityWinter()
	 * @see #getAlarmRequest()
	 * @generated
	 */
	EAttribute getAlarmRequest_PriorityWinter();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmRequest#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see de.jena.model.glt.AlarmRequest#getFlags()
	 * @see #getAlarmRequest()
	 * @generated
	 */
	EAttribute getAlarmRequest_Flags();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmRequest#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.model.glt.AlarmRequest#getDescription()
	 * @see #getAlarmRequest()
	 * @generated
	 */
	EAttribute getAlarmRequest_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmRequest#getConsequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consequence</em>'.
	 * @see de.jena.model.glt.AlarmRequest#getConsequence()
	 * @see #getAlarmRequest()
	 * @generated
	 */
	EAttribute getAlarmRequest_Consequence();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmRequest#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause</em>'.
	 * @see de.jena.model.glt.AlarmRequest#getCause()
	 * @see #getAlarmRequest()
	 * @generated
	 */
	EAttribute getAlarmRequest_Cause();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmRequest#getSl24Schedule <em>Sl24 Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sl24 Schedule</em>'.
	 * @see de.jena.model.glt.AlarmRequest#getSl24Schedule()
	 * @see #getAlarmRequest()
	 * @generated
	 */
	EAttribute getAlarmRequest_Sl24Schedule();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.AlarmPojo <em>Alarm Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm Pojo</em>'.
	 * @see de.jena.model.glt.AlarmPojo
	 * @generated
	 */
	EClass getAlarmPojo();

	/**
	 * Returns the meta object for the reference '{@link de.jena.model.glt.AlarmPojo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id</em>'.
	 * @see de.jena.model.glt.AlarmPojo#getId()
	 * @see #getAlarmPojo()
	 * @generated
	 */
	EReference getAlarmPojo_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmPojo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.AlarmPojo#getName()
	 * @see #getAlarmPojo()
	 * @generated
	 */
	EAttribute getAlarmPojo_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmPojo#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.model.glt.AlarmPojo#getDescription()
	 * @see #getAlarmPojo()
	 * @generated
	 */
	EAttribute getAlarmPojo_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmPojo#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see de.jena.model.glt.AlarmPojo#getFlags()
	 * @see #getAlarmPojo()
	 * @generated
	 */
	EAttribute getAlarmPojo_Flags();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmPojo#getConsequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consequence</em>'.
	 * @see de.jena.model.glt.AlarmPojo#getConsequence()
	 * @see #getAlarmPojo()
	 * @generated
	 */
	EAttribute getAlarmPojo_Consequence();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmPojo#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause</em>'.
	 * @see de.jena.model.glt.AlarmPojo#getCause()
	 * @see #getAlarmPojo()
	 * @generated
	 */
	EAttribute getAlarmPojo_Cause();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmPojo#getSl24schedule <em>Sl24schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sl24schedule</em>'.
	 * @see de.jena.model.glt.AlarmPojo#getSl24schedule()
	 * @see #getAlarmPojo()
	 * @generated
	 */
	EAttribute getAlarmPojo_Sl24schedule();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmPojo#getPrioritySummer <em>Priority Summer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority Summer</em>'.
	 * @see de.jena.model.glt.AlarmPojo#getPrioritySummer()
	 * @see #getAlarmPojo()
	 * @generated
	 */
	EAttribute getAlarmPojo_PrioritySummer();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmPojo#getPriorityWinter <em>Priority Winter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority Winter</em>'.
	 * @see de.jena.model.glt.AlarmPojo#getPriorityWinter()
	 * @see #getAlarmPojo()
	 * @generated
	 */
	EAttribute getAlarmPojo_PriorityWinter();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.InstructionsPojo <em>Instructions Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instructions Pojo</em>'.
	 * @see de.jena.model.glt.InstructionsPojo
	 * @generated
	 */
	EClass getInstructionsPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.InstructionsPojo#getAlarmId <em>Alarm Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Id</em>'.
	 * @see de.jena.model.glt.InstructionsPojo#getAlarmId()
	 * @see #getInstructionsPojo()
	 * @generated
	 */
	EAttribute getInstructionsPojo_AlarmId();

	/**
	 * Returns the meta object for the reference list '{@link de.jena.model.glt.InstructionsPojo#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relations</em>'.
	 * @see de.jena.model.glt.InstructionsPojo#getRelations()
	 * @see #getInstructionsPojo()
	 * @generated
	 */
	EReference getInstructionsPojo_Relations();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.RelationPojo <em>Relation Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Pojo</em>'.
	 * @see de.jena.model.glt.RelationPojo
	 * @generated
	 */
	EClass getRelationPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.RelationPojo#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see de.jena.model.glt.RelationPojo#getCondition()
	 * @see #getRelationPojo()
	 * @generated
	 */
	EAttribute getRelationPojo_Condition();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.model.glt.RelationPojo#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Instructions</em>'.
	 * @see de.jena.model.glt.RelationPojo#getInstructions()
	 * @see #getRelationPojo()
	 * @generated
	 */
	EAttribute getRelationPojo_Instructions();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.CalendarEventPojo <em>Calendar Event Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar Event Pojo</em>'.
	 * @see de.jena.model.glt.CalendarEventPojo
	 * @generated
	 */
	EClass getCalendarEventPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CalendarEventPojo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.CalendarEventPojo#getId()
	 * @see #getCalendarEventPojo()
	 * @generated
	 */
	EAttribute getCalendarEventPojo_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CalendarEventPojo#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see de.jena.model.glt.CalendarEventPojo#getFrom()
	 * @see #getCalendarEventPojo()
	 * @generated
	 */
	EAttribute getCalendarEventPojo_From();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CalendarEventPojo#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see de.jena.model.glt.CalendarEventPojo#getTo()
	 * @see #getCalendarEventPojo()
	 * @generated
	 */
	EAttribute getCalendarEventPojo_To();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CalendarEventPojo#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see de.jena.model.glt.CalendarEventPojo#getNote()
	 * @see #getCalendarEventPojo()
	 * @generated
	 */
	EAttribute getCalendarEventPojo_Note();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CalendarEventPojo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.model.glt.CalendarEventPojo#getType()
	 * @see #getCalendarEventPojo()
	 * @generated
	 */
	EAttribute getCalendarEventPojo_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CalendarEventPojo#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see de.jena.model.glt.CalendarEventPojo#getAuthor()
	 * @see #getCalendarEventPojo()
	 * @generated
	 */
	EAttribute getCalendarEventPojo_Author();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CalendarEventPojo#getAlarmId <em>Alarm Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Id</em>'.
	 * @see de.jena.model.glt.CalendarEventPojo#getAlarmId()
	 * @see #getCalendarEventPojo()
	 * @generated
	 */
	EAttribute getCalendarEventPojo_AlarmId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CalendarEventPojo#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.CalendarEventPojo#getSystemId()
	 * @see #getCalendarEventPojo()
	 * @generated
	 */
	EAttribute getCalendarEventPojo_SystemId();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.CalenderEventRequest <em>Calender Event Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calender Event Request</em>'.
	 * @see de.jena.model.glt.CalenderEventRequest
	 * @generated
	 */
	EClass getCalenderEventRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CalenderEventRequest#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see de.jena.model.glt.CalenderEventRequest#getFrom()
	 * @see #getCalenderEventRequest()
	 * @generated
	 */
	EAttribute getCalenderEventRequest_From();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CalenderEventRequest#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see de.jena.model.glt.CalenderEventRequest#getTo()
	 * @see #getCalenderEventRequest()
	 * @generated
	 */
	EAttribute getCalenderEventRequest_To();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CalenderEventRequest#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see de.jena.model.glt.CalenderEventRequest#getNote()
	 * @see #getCalenderEventRequest()
	 * @generated
	 */
	EAttribute getCalenderEventRequest_Note();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CalenderEventRequest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.model.glt.CalenderEventRequest#getType()
	 * @see #getCalenderEventRequest()
	 * @generated
	 */
	EAttribute getCalenderEventRequest_Type();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.CommentPojo <em>Comment Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Pojo</em>'.
	 * @see de.jena.model.glt.CommentPojo
	 * @generated
	 */
	EClass getCommentPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CommentPojo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.CommentPojo#getId()
	 * @see #getCommentPojo()
	 * @generated
	 */
	EAttribute getCommentPojo_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CommentPojo#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see de.jena.model.glt.CommentPojo#getAuthor()
	 * @see #getCommentPojo()
	 * @generated
	 */
	EAttribute getCommentPojo_Author();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CommentPojo#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.model.glt.CommentPojo#getTimestamp()
	 * @see #getCommentPojo()
	 * @generated
	 */
	EAttribute getCommentPojo_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CommentPojo#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see de.jena.model.glt.CommentPojo#getContent()
	 * @see #getCommentPojo()
	 * @generated
	 */
	EAttribute getCommentPojo_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CommentPojo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.model.glt.CommentPojo#getType()
	 * @see #getCommentPojo()
	 * @generated
	 */
	EAttribute getCommentPojo_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CommentPojo#getOwnerId <em>Owner Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner Id</em>'.
	 * @see de.jena.model.glt.CommentPojo#getOwnerId()
	 * @see #getCommentPojo()
	 * @generated
	 */
	EAttribute getCommentPojo_OwnerId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CommentPojo#getOwnerType <em>Owner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner Type</em>'.
	 * @see de.jena.model.glt.CommentPojo#getOwnerType()
	 * @see #getCommentPojo()
	 * @generated
	 */
	EAttribute getCommentPojo_OwnerType();

	/**
	 * Returns the meta object for the reference '{@link de.jena.model.glt.CommentPojo#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see de.jena.model.glt.CommentPojo#getStatus()
	 * @see #getCommentPojo()
	 * @generated
	 */
	EReference getCommentPojo_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.StatusPojo <em>Status Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Pojo</em>'.
	 * @see de.jena.model.glt.StatusPojo
	 * @generated
	 */
	EClass getStatusPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatusPojo#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.model.glt.StatusPojo#getTimestamp()
	 * @see #getStatusPojo()
	 * @generated
	 */
	EAttribute getStatusPojo_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatusPojo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.StatusPojo#getName()
	 * @see #getStatusPojo()
	 * @generated
	 */
	EAttribute getStatusPojo_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatusPojo#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see de.jena.model.glt.StatusPojo#getAuthor()
	 * @see #getStatusPojo()
	 * @generated
	 */
	EAttribute getStatusPojo_Author();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.CommentRequest <em>Comment Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Request</em>'.
	 * @see de.jena.model.glt.CommentRequest
	 * @generated
	 */
	EClass getCommentRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CommentRequest#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see de.jena.model.glt.CommentRequest#getContent()
	 * @see #getCommentRequest()
	 * @generated
	 */
	EAttribute getCommentRequest_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CommentRequest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.model.glt.CommentRequest#getType()
	 * @see #getCommentRequest()
	 * @generated
	 */
	EAttribute getCommentRequest_Type();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.AlarmLogPojo <em>Alarm Log Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm Log Pojo</em>'.
	 * @see de.jena.model.glt.AlarmLogPojo
	 * @generated
	 */
	EClass getAlarmLogPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmLogPojo#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.AlarmLogPojo#getSystemId()
	 * @see #getAlarmLogPojo()
	 * @generated
	 */
	EAttribute getAlarmLogPojo_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmLogPojo#getAlarmId <em>Alarm Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Id</em>'.
	 * @see de.jena.model.glt.AlarmLogPojo#getAlarmId()
	 * @see #getAlarmLogPojo()
	 * @generated
	 */
	EAttribute getAlarmLogPojo_AlarmId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmLogPojo#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.jena.model.glt.AlarmLogPojo#getState()
	 * @see #getAlarmLogPojo()
	 * @generated
	 */
	EAttribute getAlarmLogPojo_State();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmLogPojo#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.model.glt.AlarmLogPojo#getTimestamp()
	 * @see #getAlarmLogPojo()
	 * @generated
	 */
	EAttribute getAlarmLogPojo_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.ChangeItem <em>Change Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Item</em>'.
	 * @see de.jena.model.glt.ChangeItem
	 * @generated
	 */
	EClass getChangeItem();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ChangeItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.ChangeItem#getId()
	 * @see #getChangeItem()
	 * @generated
	 */
	EAttribute getChangeItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ChangeItem#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.model.glt.ChangeItem#getTimestamp()
	 * @see #getChangeItem()
	 * @generated
	 */
	EAttribute getChangeItem_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ChangeItem#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see de.jena.model.glt.ChangeItem#getSource()
	 * @see #getChangeItem()
	 * @generated
	 */
	EAttribute getChangeItem_Source();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ChangeItem#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see de.jena.model.glt.ChangeItem#getOperation()
	 * @see #getChangeItem()
	 * @generated
	 */
	EAttribute getChangeItem_Operation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ChangeItem#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see de.jena.model.glt.ChangeItem#getTarget()
	 * @see #getChangeItem()
	 * @generated
	 */
	EAttribute getChangeItem_Target();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ChangeItem#getChange <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change</em>'.
	 * @see de.jena.model.glt.ChangeItem#getChange()
	 * @see #getChangeItem()
	 * @generated
	 */
	EAttribute getChangeItem_Change();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ChangeItem#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see de.jena.model.glt.ChangeItem#getAuthor()
	 * @see #getChangeItem()
	 * @generated
	 */
	EAttribute getChangeItem_Author();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.DatalogContentPojo <em>Datalog Content Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datalog Content Pojo</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo
	 * @generated
	 */
	EClass getDatalogContentPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.DatalogContentPojo#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getSystemId()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.DatalogContentPojo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getId()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.DatalogContentPojo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getName()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.DatalogContentPojo#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getValueType()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.DatalogContentPojo#getDatalogType <em>Datalog Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datalog Type</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getDatalogType()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_DatalogType();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.DatalogContentPojo#getPointNumber <em>Point Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Number</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getPointNumber()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_PointNumber();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.DatalogContentPojo#getPointName <em>Point Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Name</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getPointName()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_PointName();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.DatalogContentPojo#getPointId <em>Point Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Id</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getPointId()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_PointId();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.model.glt.DatalogContentPojo#getEntriesT <em>Entries T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entries T</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getEntriesT()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_EntriesT();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.model.glt.DatalogContentPojo#getEntriesV <em>Entries V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entries V</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getEntriesV()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_EntriesV();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.DatalogContentPojo#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getTime()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_Time();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.DatalogContentPojo#getTimeController <em>Time Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Controller</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getTimeController()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_TimeController();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.DatalogContentPojo#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getCounter()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_Counter();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.DatalogContentPojo#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getValue()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.DatalogContentPojo#getIsUnknown <em>Is Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unknown</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getIsUnknown()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_IsUnknown();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.DatalogContentPojo#getIsError <em>Is Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Error</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getIsError()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EAttribute getDatalogContentPojo_IsError();

	/**
	 * Returns the meta object for the reference list '{@link de.jena.model.glt.DatalogContentPojo#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comments</em>'.
	 * @see de.jena.model.glt.DatalogContentPojo#getComments()
	 * @see #getDatalogContentPojo()
	 * @generated
	 */
	EReference getDatalogContentPojo_Comments();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.PointValuePojo <em>Point Value Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Value Pojo</em>'.
	 * @see de.jena.model.glt.PointValuePojo
	 * @generated
	 */
	EClass getPointValuePojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointValuePojo#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.PointValuePojo#getSystemId()
	 * @see #getPointValuePojo()
	 * @generated
	 */
	EAttribute getPointValuePojo_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointValuePojo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.PointValuePojo#getId()
	 * @see #getPointValuePojo()
	 * @generated
	 */
	EAttribute getPointValuePojo_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointValuePojo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.PointValuePojo#getName()
	 * @see #getPointValuePojo()
	 * @generated
	 */
	EAttribute getPointValuePojo_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointValuePojo#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.model.glt.PointValuePojo#getValue()
	 * @see #getPointValuePojo()
	 * @generated
	 */
	EAttribute getPointValuePojo_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointValuePojo#getValuePrev <em>Value Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Prev</em>'.
	 * @see de.jena.model.glt.PointValuePojo#getValuePrev()
	 * @see #getPointValuePojo()
	 * @generated
	 */
	EAttribute getPointValuePojo_ValuePrev();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointValuePojo#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.jena.model.glt.PointValuePojo#getTime()
	 * @see #getPointValuePojo()
	 * @generated
	 */
	EAttribute getPointValuePojo_Time();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointValuePojo#getOverrideState <em>Override State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override State</em>'.
	 * @see de.jena.model.glt.PointValuePojo#getOverrideState()
	 * @see #getPointValuePojo()
	 * @generated
	 */
	EAttribute getPointValuePojo_OverrideState();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointValuePojo#getIsUnknown <em>Is Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unknown</em>'.
	 * @see de.jena.model.glt.PointValuePojo#getIsUnknown()
	 * @see #getPointValuePojo()
	 * @generated
	 */
	EAttribute getPointValuePojo_IsUnknown();

	/**
	 * Returns the meta object for the reference list '{@link de.jena.model.glt.PointValuePojo#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comments</em>'.
	 * @see de.jena.model.glt.PointValuePojo#getComments()
	 * @see #getPointValuePojo()
	 * @generated
	 */
	EReference getPointValuePojo_Comments();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.AlarmLogTimelinePojo <em>Alarm Log Timeline Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm Log Timeline Pojo</em>'.
	 * @see de.jena.model.glt.AlarmLogTimelinePojo
	 * @generated
	 */
	EClass getAlarmLogTimelinePojo();

	/**
	 * Returns the meta object for the reference list '{@link de.jena.model.glt.AlarmLogTimelinePojo#getAlarmLogs <em>Alarm Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alarm Logs</em>'.
	 * @see de.jena.model.glt.AlarmLogTimelinePojo#getAlarmLogs()
	 * @see #getAlarmLogTimelinePojo()
	 * @generated
	 */
	EReference getAlarmLogTimelinePojo_AlarmLogs();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AlarmLogTimelinePojo#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see de.jena.model.glt.AlarmLogTimelinePojo#getTotal()
	 * @see #getAlarmLogTimelinePojo()
	 * @generated
	 */
	EAttribute getAlarmLogTimelinePojo_Total();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.StatisticEntry <em>Statistic Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistic Entry</em>'.
	 * @see de.jena.model.glt.StatisticEntry
	 * @generated
	 */
	EClass getStatisticEntry();

	/**
	 * Returns the meta object for the reference '{@link de.jena.model.glt.StatisticEntry#getTimeWindow <em>Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Window</em>'.
	 * @see de.jena.model.glt.StatisticEntry#getTimeWindow()
	 * @see #getStatisticEntry()
	 * @generated
	 */
	EReference getStatisticEntry_TimeWindow();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatisticEntry#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see de.jena.model.glt.StatisticEntry#getValues()
	 * @see #getStatisticEntry()
	 * @generated
	 */
	EAttribute getStatisticEntry_Values();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.TimeWindow <em>Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Window</em>'.
	 * @see de.jena.model.glt.TimeWindow
	 * @generated
	 */
	EClass getTimeWindow();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeWindow#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.model.glt.TimeWindow#getTimestamp()
	 * @see #getTimeWindow()
	 * @generated
	 */
	EAttribute getTimeWindow_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeWindow#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see de.jena.model.glt.TimeWindow#getIdentifier()
	 * @see #getTimeWindow()
	 * @generated
	 */
	EAttribute getTimeWindow_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeWindow#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.jena.model.glt.TimeWindow#getUnit()
	 * @see #getTimeWindow()
	 * @generated
	 */
	EAttribute getTimeWindow_Unit();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeWindow#getZoneId <em>Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone Id</em>'.
	 * @see de.jena.model.glt.TimeWindow#getZoneId()
	 * @see #getTimeWindow()
	 * @generated
	 */
	EAttribute getTimeWindow_ZoneId();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.EntityMonitoringSettingsPojo <em>Entity Monitoring Settings Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Monitoring Settings Pojo</em>'.
	 * @see de.jena.model.glt.EntityMonitoringSettingsPojo
	 * @generated
	 */
	EClass getEntityMonitoringSettingsPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.EntityMonitoringSettingsPojo#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.EntityMonitoringSettingsPojo#getSystemId()
	 * @see #getEntityMonitoringSettingsPojo()
	 * @generated
	 */
	EAttribute getEntityMonitoringSettingsPojo_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.EntityMonitoringSettingsPojo#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see de.jena.model.glt.EntityMonitoringSettingsPojo#getIdentifier()
	 * @see #getEntityMonitoringSettingsPojo()
	 * @generated
	 */
	EAttribute getEntityMonitoringSettingsPojo_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.EntityMonitoringSettingsPojo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.EntityMonitoringSettingsPojo#getName()
	 * @see #getEntityMonitoringSettingsPojo()
	 * @generated
	 */
	EAttribute getEntityMonitoringSettingsPojo_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.EntityMonitoringSettingsPojo#getIncluded <em>Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Included</em>'.
	 * @see de.jena.model.glt.EntityMonitoringSettingsPojo#getIncluded()
	 * @see #getEntityMonitoringSettingsPojo()
	 * @generated
	 */
	EAttribute getEntityMonitoringSettingsPojo_Included();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.EntityMonitoringSettingsPojo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.model.glt.EntityMonitoringSettingsPojo#getType()
	 * @see #getEntityMonitoringSettingsPojo()
	 * @generated
	 */
	EAttribute getEntityMonitoringSettingsPojo_Type();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.SyncLogPojo <em>Sync Log Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sync Log Pojo</em>'.
	 * @see de.jena.model.glt.SyncLogPojo
	 * @generated
	 */
	EClass getSyncLogPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SyncLogPojo#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.SyncLogPojo#getSystemId()
	 * @see #getSyncLogPojo()
	 * @generated
	 */
	EAttribute getSyncLogPojo_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SyncLogPojo#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.jena.model.glt.SyncLogPojo#getState()
	 * @see #getSyncLogPojo()
	 * @generated
	 */
	EAttribute getSyncLogPojo_State();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SyncLogPojo#getLatestRingbufferTimestamp <em>Latest Ringbuffer Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Ringbuffer Timestamp</em>'.
	 * @see de.jena.model.glt.SyncLogPojo#getLatestRingbufferTimestamp()
	 * @see #getSyncLogPojo()
	 * @generated
	 */
	EAttribute getSyncLogPojo_LatestRingbufferTimestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SyncLogPojo#getLastAccessTimeMs <em>Last Access Time Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Access Time Ms</em>'.
	 * @see de.jena.model.glt.SyncLogPojo#getLastAccessTimeMs()
	 * @see #getSyncLogPojo()
	 * @generated
	 */
	EAttribute getSyncLogPojo_LastAccessTimeMs();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SyncLogPojo#getAverageAccessTimeMs <em>Average Access Time Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Access Time Ms</em>'.
	 * @see de.jena.model.glt.SyncLogPojo#getAverageAccessTimeMs()
	 * @see #getSyncLogPojo()
	 * @generated
	 */
	EAttribute getSyncLogPojo_AverageAccessTimeMs();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SyncLogPojo#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.model.glt.SyncLogPojo#getTimestamp()
	 * @see #getSyncLogPojo()
	 * @generated
	 */
	EAttribute getSyncLogPojo_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SyncLogPojo#getStateSince <em>State Since</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Since</em>'.
	 * @see de.jena.model.glt.SyncLogPojo#getStateSince()
	 * @see #getSyncLogPojo()
	 * @generated
	 */
	EAttribute getSyncLogPojo_StateSince();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.StatusLogPojo <em>Status Log Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Log Pojo</em>'.
	 * @see de.jena.model.glt.StatusLogPojo
	 * @generated
	 */
	EClass getStatusLogPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatusLogPojo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.StatusLogPojo#getId()
	 * @see #getStatusLogPojo()
	 * @generated
	 */
	EAttribute getStatusLogPojo_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatusLogPojo#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.StatusLogPojo#getSystemId()
	 * @see #getStatusLogPojo()
	 * @generated
	 */
	EAttribute getStatusLogPojo_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatusLogPojo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.model.glt.StatusLogPojo#getType()
	 * @see #getStatusLogPojo()
	 * @generated
	 */
	EAttribute getStatusLogPojo_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatusLogPojo#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see de.jena.model.glt.StatusLogPojo#getSeverity()
	 * @see #getStatusLogPojo()
	 * @generated
	 */
	EAttribute getStatusLogPojo_Severity();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatusLogPojo#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.jena.model.glt.StatusLogPojo#getMessage()
	 * @see #getStatusLogPojo()
	 * @generated
	 */
	EAttribute getStatusLogPojo_Message();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatusLogPojo#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.model.glt.StatusLogPojo#getTimestamp()
	 * @see #getStatusLogPojo()
	 * @generated
	 */
	EAttribute getStatusLogPojo_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.UpdateStateRequest <em>Update State Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update State Request</em>'.
	 * @see de.jena.model.glt.UpdateStateRequest
	 * @generated
	 */
	EClass getUpdateStateRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.UpdateStateRequest#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.UpdateStateRequest#getSystemId()
	 * @see #getUpdateStateRequest()
	 * @generated
	 */
	EAttribute getUpdateStateRequest_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.UpdateStateRequest#getAlarmId <em>Alarm Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Id</em>'.
	 * @see de.jena.model.glt.UpdateStateRequest#getAlarmId()
	 * @see #getUpdateStateRequest()
	 * @generated
	 */
	EAttribute getUpdateStateRequest_AlarmId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.UpdateStateRequest#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.jena.model.glt.UpdateStateRequest#getState()
	 * @see #getUpdateStateRequest()
	 * @generated
	 */
	EAttribute getUpdateStateRequest_State();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.UpdateStateRequest#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see de.jena.model.glt.UpdateStateRequest#getSeverity()
	 * @see #getUpdateStateRequest()
	 * @generated
	 */
	EAttribute getUpdateStateRequest_Severity();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.UpdateStateRequest#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.model.glt.UpdateStateRequest#getTimestamp()
	 * @see #getUpdateStateRequest()
	 * @generated
	 */
	EAttribute getUpdateStateRequest_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.StatusLogRequest <em>Status Log Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Log Request</em>'.
	 * @see de.jena.model.glt.StatusLogRequest
	 * @generated
	 */
	EClass getStatusLogRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatusLogRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.StatusLogRequest#getId()
	 * @see #getStatusLogRequest()
	 * @generated
	 */
	EAttribute getStatusLogRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatusLogRequest#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.StatusLogRequest#getSystemId()
	 * @see #getStatusLogRequest()
	 * @generated
	 */
	EAttribute getStatusLogRequest_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatusLogRequest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.model.glt.StatusLogRequest#getType()
	 * @see #getStatusLogRequest()
	 * @generated
	 */
	EAttribute getStatusLogRequest_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatusLogRequest#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see de.jena.model.glt.StatusLogRequest#getSeverity()
	 * @see #getStatusLogRequest()
	 * @generated
	 */
	EAttribute getStatusLogRequest_Severity();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatusLogRequest#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.jena.model.glt.StatusLogRequest#getMessage()
	 * @see #getStatusLogRequest()
	 * @generated
	 */
	EAttribute getStatusLogRequest_Message();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.StatusLogRequest#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.model.glt.StatusLogRequest#getTimestamp()
	 * @see #getStatusLogRequest()
	 * @generated
	 */
	EAttribute getStatusLogRequest_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.TimeScheduleBlockPojo <em>Time Schedule Block Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Schedule Block Pojo</em>'.
	 * @see de.jena.model.glt.TimeScheduleBlockPojo
	 * @generated
	 */
	EClass getTimeScheduleBlockPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleBlockPojo#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.TimeScheduleBlockPojo#getSystemId()
	 * @see #getTimeScheduleBlockPojo()
	 * @generated
	 */
	EAttribute getTimeScheduleBlockPojo_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleBlockPojo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.TimeScheduleBlockPojo#getId()
	 * @see #getTimeScheduleBlockPojo()
	 * @generated
	 */
	EAttribute getTimeScheduleBlockPojo_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleBlockPojo#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block</em>'.
	 * @see de.jena.model.glt.TimeScheduleBlockPojo#getBlock()
	 * @see #getTimeScheduleBlockPojo()
	 * @generated
	 */
	EAttribute getTimeScheduleBlockPojo_Block();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleBlockPojo#getExceptionStartDay <em>Exception Start Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Start Day</em>'.
	 * @see de.jena.model.glt.TimeScheduleBlockPojo#getExceptionStartDay()
	 * @see #getTimeScheduleBlockPojo()
	 * @generated
	 */
	EAttribute getTimeScheduleBlockPojo_ExceptionStartDay();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleBlockPojo#getExceptionStartMonth <em>Exception Start Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Start Month</em>'.
	 * @see de.jena.model.glt.TimeScheduleBlockPojo#getExceptionStartMonth()
	 * @see #getTimeScheduleBlockPojo()
	 * @generated
	 */
	EAttribute getTimeScheduleBlockPojo_ExceptionStartMonth();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleBlockPojo#getExceptionEndDay <em>Exception End Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception End Day</em>'.
	 * @see de.jena.model.glt.TimeScheduleBlockPojo#getExceptionEndDay()
	 * @see #getTimeScheduleBlockPojo()
	 * @generated
	 */
	EAttribute getTimeScheduleBlockPojo_ExceptionEndDay();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleBlockPojo#getExceptionEndMonth <em>Exception End Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception End Month</em>'.
	 * @see de.jena.model.glt.TimeScheduleBlockPojo#getExceptionEndMonth()
	 * @see #getTimeScheduleBlockPojo()
	 * @generated
	 */
	EAttribute getTimeScheduleBlockPojo_ExceptionEndMonth();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleBlockPojo#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see de.jena.model.glt.TimeScheduleBlockPojo#getYear()
	 * @see #getTimeScheduleBlockPojo()
	 * @generated
	 */
	EAttribute getTimeScheduleBlockPojo_Year();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleBlockPojo#getTimes <em>Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Times</em>'.
	 * @see de.jena.model.glt.TimeScheduleBlockPojo#getTimes()
	 * @see #getTimeScheduleBlockPojo()
	 * @generated
	 */
	EAttribute getTimeScheduleBlockPojo_Times();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleBlockPojo#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.jena.model.glt.TimeScheduleBlockPojo#getTime()
	 * @see #getTimeScheduleBlockPojo()
	 * @generated
	 */
	EAttribute getTimeScheduleBlockPojo_Time();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleBlockPojo#getIsUnknown <em>Is Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unknown</em>'.
	 * @see de.jena.model.glt.TimeScheduleBlockPojo#getIsUnknown()
	 * @see #getTimeScheduleBlockPojo()
	 * @generated
	 */
	EAttribute getTimeScheduleBlockPojo_IsUnknown();

	/**
	 * Returns the meta object for the reference list '{@link de.jena.model.glt.TimeScheduleBlockPojo#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comments</em>'.
	 * @see de.jena.model.glt.TimeScheduleBlockPojo#getComments()
	 * @see #getTimeScheduleBlockPojo()
	 * @generated
	 */
	EReference getTimeScheduleBlockPojo_Comments();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.TimeScheduleStatePojo <em>Time Schedule State Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Schedule State Pojo</em>'.
	 * @see de.jena.model.glt.TimeScheduleStatePojo
	 * @generated
	 */
	EClass getTimeScheduleStatePojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleStatePojo#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.TimeScheduleStatePojo#getSystemId()
	 * @see #getTimeScheduleStatePojo()
	 * @generated
	 */
	EAttribute getTimeScheduleStatePojo_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleStatePojo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.TimeScheduleStatePojo#getId()
	 * @see #getTimeScheduleStatePojo()
	 * @generated
	 */
	EAttribute getTimeScheduleStatePojo_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleStatePojo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.TimeScheduleStatePojo#getName()
	 * @see #getTimeScheduleStatePojo()
	 * @generated
	 */
	EAttribute getTimeScheduleStatePojo_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleStatePojo#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.model.glt.TimeScheduleStatePojo#getValue()
	 * @see #getTimeScheduleStatePojo()
	 * @generated
	 */
	EAttribute getTimeScheduleStatePojo_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleStatePojo#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.jena.model.glt.TimeScheduleStatePojo#getTime()
	 * @see #getTimeScheduleStatePojo()
	 * @generated
	 */
	EAttribute getTimeScheduleStatePojo_Time();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleStatePojo#getIsUnknown <em>Is Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unknown</em>'.
	 * @see de.jena.model.glt.TimeScheduleStatePojo#getIsUnknown()
	 * @see #getTimeScheduleStatePojo()
	 * @generated
	 */
	EAttribute getTimeScheduleStatePojo_IsUnknown();

	/**
	 * Returns the meta object for the reference list '{@link de.jena.model.glt.TimeScheduleStatePojo#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comments</em>'.
	 * @see de.jena.model.glt.TimeScheduleStatePojo#getComments()
	 * @see #getTimeScheduleStatePojo()
	 * @generated
	 */
	EReference getTimeScheduleStatePojo_Comments();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.VersionInfo <em>Version Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Info</em>'.
	 * @see de.jena.model.glt.VersionInfo
	 * @generated
	 */
	EClass getVersionInfo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.VersionInfo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.VersionInfo#getId()
	 * @see #getVersionInfo()
	 * @generated
	 */
	EAttribute getVersionInfo_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.VersionInfo#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinates</em>'.
	 * @see de.jena.model.glt.VersionInfo#getCoordinates()
	 * @see #getVersionInfo()
	 * @generated
	 */
	EAttribute getVersionInfo_Coordinates();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.VersionInfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.VersionInfo#getName()
	 * @see #getVersionInfo()
	 * @generated
	 */
	EAttribute getVersionInfo_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.VersionInfo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.model.glt.VersionInfo#getType()
	 * @see #getVersionInfo()
	 * @generated
	 */
	EAttribute getVersionInfo_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.VersionInfo#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.jena.model.glt.VersionInfo#getVersion()
	 * @see #getVersionInfo()
	 * @generated
	 */
	EAttribute getVersionInfo_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.VersionInfo#getSerial <em>Serial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial</em>'.
	 * @see de.jena.model.glt.VersionInfo#getSerial()
	 * @see #getVersionInfo()
	 * @generated
	 */
	EAttribute getVersionInfo_Serial();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.PointRecord <em>Point Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Record</em>'.
	 * @see de.jena.model.glt.PointRecord
	 * @generated
	 */
	EClass getPointRecord();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointRecord#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.PointRecord#getSystemId()
	 * @see #getPointRecord()
	 * @generated
	 */
	EAttribute getPointRecord_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointRecord#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.PointRecord#getId()
	 * @see #getPointRecord()
	 * @generated
	 */
	EAttribute getPointRecord_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointRecord#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see de.jena.model.glt.PointRecord#getAddress()
	 * @see #getPointRecord()
	 * @generated
	 */
	EAttribute getPointRecord_Address();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointRecord#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see de.jena.model.glt.PointRecord#getNewValue()
	 * @see #getPointRecord()
	 * @generated
	 */
	EAttribute getPointRecord_NewValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointRecord#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see de.jena.model.glt.PointRecord#getOldValue()
	 * @see #getPointRecord()
	 * @generated
	 */
	EAttribute getPointRecord_OldValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointRecord#getOverrideStatus <em>Override Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override Status</em>'.
	 * @see de.jena.model.glt.PointRecord#getOverrideStatus()
	 * @see #getPointRecord()
	 * @generated
	 */
	EAttribute getPointRecord_OverrideStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointRecord#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see de.jena.model.glt.PointRecord#getNote()
	 * @see #getPointRecord()
	 * @generated
	 */
	EAttribute getPointRecord_Note();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PointRecord#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see de.jena.model.glt.PointRecord#getAuthor()
	 * @see #getPointRecord()
	 * @generated
	 */
	EAttribute getPointRecord_Author();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.TimeScheduleRecord <em>Time Schedule Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Schedule Record</em>'.
	 * @see de.jena.model.glt.TimeScheduleRecord
	 * @generated
	 */
	EClass getTimeScheduleRecord();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleRecord#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.TimeScheduleRecord#getSystemId()
	 * @see #getTimeScheduleRecord()
	 * @generated
	 */
	EAttribute getTimeScheduleRecord_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleRecord#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.TimeScheduleRecord#getId()
	 * @see #getTimeScheduleRecord()
	 * @generated
	 */
	EAttribute getTimeScheduleRecord_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleRecord#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see de.jena.model.glt.TimeScheduleRecord#getAddress()
	 * @see #getTimeScheduleRecord()
	 * @generated
	 */
	EAttribute getTimeScheduleRecord_Address();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleRecord#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see de.jena.model.glt.TimeScheduleRecord#getOldValue()
	 * @see #getTimeScheduleRecord()
	 * @generated
	 */
	EAttribute getTimeScheduleRecord_OldValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleRecord#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see de.jena.model.glt.TimeScheduleRecord#getNewValue()
	 * @see #getTimeScheduleRecord()
	 * @generated
	 */
	EAttribute getTimeScheduleRecord_NewValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleRecord#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see de.jena.model.glt.TimeScheduleRecord#getNote()
	 * @see #getTimeScheduleRecord()
	 * @generated
	 */
	EAttribute getTimeScheduleRecord_Note();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TimeScheduleRecord#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see de.jena.model.glt.TimeScheduleRecord#getAuthor()
	 * @see #getTimeScheduleRecord()
	 * @generated
	 */
	EAttribute getTimeScheduleRecord_Author();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.AddressPojo <em>Address Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Pojo</em>'.
	 * @see de.jena.model.glt.AddressPojo
	 * @generated
	 */
	EClass getAddressPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AddressPojo#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see de.jena.model.glt.AddressPojo#getAddress()
	 * @see #getAddressPojo()
	 * @generated
	 */
	EAttribute getAddressPojo_Address();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AddressPojo#getCommunity <em>Community</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Community</em>'.
	 * @see de.jena.model.glt.AddressPojo#getCommunity()
	 * @see #getAddressPojo()
	 * @generated
	 */
	EAttribute getAddressPojo_Community();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AddressPojo#getCounty <em>County</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>County</em>'.
	 * @see de.jena.model.glt.AddressPojo#getCounty()
	 * @see #getAddressPojo()
	 * @generated
	 */
	EAttribute getAddressPojo_County();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AddressPojo#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see de.jena.model.glt.AddressPojo#getCountry()
	 * @see #getAddressPojo()
	 * @generated
	 */
	EAttribute getAddressPojo_Country();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AddressPojo#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.model.glt.AddressPojo#getDescription()
	 * @see #getAddressPojo()
	 * @generated
	 */
	EAttribute getAddressPojo_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AddressPojo#getDistrict <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>District</em>'.
	 * @see de.jena.model.glt.AddressPojo#getDistrict()
	 * @see #getAddressPojo()
	 * @generated
	 */
	EAttribute getAddressPojo_District();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AddressPojo#getExtended <em>Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extended</em>'.
	 * @see de.jena.model.glt.AddressPojo#getExtended()
	 * @see #getAddressPojo()
	 * @generated
	 */
	EAttribute getAddressPojo_Extended();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AddressPojo#getFederalState <em>Federal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Federal State</em>'.
	 * @see de.jena.model.glt.AddressPojo#getFederalState()
	 * @see #getAddressPojo()
	 * @generated
	 */
	EAttribute getAddressPojo_FederalState();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AddressPojo#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see de.jena.model.glt.AddressPojo#getLocation()
	 * @see #getAddressPojo()
	 * @generated
	 */
	EAttribute getAddressPojo_Location();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AddressPojo#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see de.jena.model.glt.AddressPojo#getNumber()
	 * @see #getAddressPojo()
	 * @generated
	 */
	EAttribute getAddressPojo_Number();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AddressPojo#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Box</em>'.
	 * @see de.jena.model.glt.AddressPojo#getPostBox()
	 * @see #getAddressPojo()
	 * @generated
	 */
	EAttribute getAddressPojo_PostBox();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AddressPojo#getPostCode <em>Post Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Code</em>'.
	 * @see de.jena.model.glt.AddressPojo#getPostCode()
	 * @see #getAddressPojo()
	 * @generated
	 */
	EAttribute getAddressPojo_PostCode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AddressPojo#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see de.jena.model.glt.AddressPojo#getStreet()
	 * @see #getAddressPojo()
	 * @generated
	 */
	EAttribute getAddressPojo_Street();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.AddressPojo#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see de.jena.model.glt.AddressPojo#getRepresentation()
	 * @see #getAddressPojo()
	 * @generated
	 */
	EAttribute getAddressPojo_Representation();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.SystemDescriptionPojo <em>System Description Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Description Pojo</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo
	 * @generated
	 */
	EClass getSystemDescriptionPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionPojo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getId()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EAttribute getSystemDescriptionPojo_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionPojo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getName()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EAttribute getSystemDescriptionPojo_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionPojo#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getPrefix()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EAttribute getSystemDescriptionPojo_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionPojo#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getIp()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EAttribute getSystemDescriptionPojo_Ip();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionPojo#getDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getDirectory()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EAttribute getSystemDescriptionPojo_Directory();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionPojo#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getPort()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EAttribute getSystemDescriptionPojo_Port();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionPojo#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getLon()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EAttribute getSystemDescriptionPojo_Lon();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionPojo#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getLat()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EAttribute getSystemDescriptionPojo_Lat();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionPojo#getShallow <em>Shallow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shallow</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getShallow()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EAttribute getSystemDescriptionPojo_Shallow();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionPojo#getExcluded <em>Excluded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Excluded</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getExcluded()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EAttribute getSystemDescriptionPojo_Excluded();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionPojo#getExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Id</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getExternalId()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EAttribute getSystemDescriptionPojo_ExternalId();

	/**
	 * Returns the meta object for the reference '{@link de.jena.model.glt.SystemDescriptionPojo#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getAddress()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EReference getSystemDescriptionPojo_Address();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionPojo#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getSource()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EAttribute getSystemDescriptionPojo_Source();

	/**
	 * Returns the meta object for the reference list '{@link de.jena.model.glt.SystemDescriptionPojo#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getChildren()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EReference getSystemDescriptionPojo_Children();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionPojo#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getFlags()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EAttribute getSystemDescriptionPojo_Flags();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionPojo#getCylonNetwork <em>Cylon Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cylon Network</em>'.
	 * @see de.jena.model.glt.SystemDescriptionPojo#getCylonNetwork()
	 * @see #getSystemDescriptionPojo()
	 * @generated
	 */
	EAttribute getSystemDescriptionPojo_CylonNetwork();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.SystemDescriptionRequest <em>System Description Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Description Request</em>'.
	 * @see de.jena.model.glt.SystemDescriptionRequest
	 * @generated
	 */
	EClass getSystemDescriptionRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.SystemDescriptionRequest#getId()
	 * @see #getSystemDescriptionRequest()
	 * @generated
	 */
	EAttribute getSystemDescriptionRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionRequest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.SystemDescriptionRequest#getName()
	 * @see #getSystemDescriptionRequest()
	 * @generated
	 */
	EAttribute getSystemDescriptionRequest_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionRequest#getDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory</em>'.
	 * @see de.jena.model.glt.SystemDescriptionRequest#getDirectory()
	 * @see #getSystemDescriptionRequest()
	 * @generated
	 */
	EAttribute getSystemDescriptionRequest_Directory();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionRequest#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see de.jena.model.glt.SystemDescriptionRequest#getPort()
	 * @see #getSystemDescriptionRequest()
	 * @generated
	 */
	EAttribute getSystemDescriptionRequest_Port();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionRequest#getExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Id</em>'.
	 * @see de.jena.model.glt.SystemDescriptionRequest#getExternalId()
	 * @see #getSystemDescriptionRequest()
	 * @generated
	 */
	EAttribute getSystemDescriptionRequest_ExternalId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionRequest#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see de.jena.model.glt.SystemDescriptionRequest#getIp()
	 * @see #getSystemDescriptionRequest()
	 * @generated
	 */
	EAttribute getSystemDescriptionRequest_Ip();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionRequest#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see de.jena.model.glt.SystemDescriptionRequest#getLon()
	 * @see #getSystemDescriptionRequest()
	 * @generated
	 */
	EAttribute getSystemDescriptionRequest_Lon();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionRequest#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see de.jena.model.glt.SystemDescriptionRequest#getLat()
	 * @see #getSystemDescriptionRequest()
	 * @generated
	 */
	EAttribute getSystemDescriptionRequest_Lat();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionRequest#getExcluded <em>Excluded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Excluded</em>'.
	 * @see de.jena.model.glt.SystemDescriptionRequest#getExcluded()
	 * @see #getSystemDescriptionRequest()
	 * @generated
	 */
	EAttribute getSystemDescriptionRequest_Excluded();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SystemDescriptionRequest#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see de.jena.model.glt.SystemDescriptionRequest#getFlags()
	 * @see #getSystemDescriptionRequest()
	 * @generated
	 */
	EAttribute getSystemDescriptionRequest_Flags();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.ContactPojo <em>Contact Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Pojo</em>'.
	 * @see de.jena.model.glt.ContactPojo
	 * @generated
	 */
	EClass getContactPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContactPojo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.ContactPojo#getName()
	 * @see #getContactPojo()
	 * @generated
	 */
	EAttribute getContactPojo_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContactPojo#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task</em>'.
	 * @see de.jena.model.glt.ContactPojo#getTask()
	 * @see #getContactPojo()
	 * @generated
	 */
	EAttribute getContactPojo_Task();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContactPojo#getAdditional <em>Additional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional</em>'.
	 * @see de.jena.model.glt.ContactPojo#getAdditional()
	 * @see #getContactPojo()
	 * @generated
	 */
	EAttribute getContactPojo_Additional();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContactPojo#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see de.jena.model.glt.ContactPojo#getFirstName()
	 * @see #getContactPojo()
	 * @generated
	 */
	EAttribute getContactPojo_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContactPojo#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see de.jena.model.glt.ContactPojo#getLastName()
	 * @see #getContactPojo()
	 * @generated
	 */
	EAttribute getContactPojo_LastName();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContactPojo#getSalutation <em>Salutation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salutation</em>'.
	 * @see de.jena.model.glt.ContactPojo#getSalutation()
	 * @see #getContactPojo()
	 * @generated
	 */
	EAttribute getContactPojo_Salutation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContactPojo#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see de.jena.model.glt.ContactPojo#getShortName()
	 * @see #getContactPojo()
	 * @generated
	 */
	EAttribute getContactPojo_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContactPojo#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.jena.model.glt.ContactPojo#getTitle()
	 * @see #getContactPojo()
	 * @generated
	 */
	EAttribute getContactPojo_Title();

	/**
	 * Returns the meta object for the reference '{@link de.jena.model.glt.ContactPojo#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see de.jena.model.glt.ContactPojo#getAddress()
	 * @see #getContactPojo()
	 * @generated
	 */
	EReference getContactPojo_Address();

	/**
	 * Returns the meta object for the reference list '{@link de.jena.model.glt.ContactPojo#getPhones <em>Phones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Phones</em>'.
	 * @see de.jena.model.glt.ContactPojo#getPhones()
	 * @see #getContactPojo()
	 * @generated
	 */
	EReference getContactPojo_Phones();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.model.glt.ContactPojo#getEmails <em>Emails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Emails</em>'.
	 * @see de.jena.model.glt.ContactPojo#getEmails()
	 * @see #getContactPojo()
	 * @generated
	 */
	EAttribute getContactPojo_Emails();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.model.glt.ContactPojo#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments</em>'.
	 * @see de.jena.model.glt.ContactPojo#getComments()
	 * @see #getContactPojo()
	 * @generated
	 */
	EAttribute getContactPojo_Comments();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.PhonePojo <em>Phone Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone Pojo</em>'.
	 * @see de.jena.model.glt.PhonePojo
	 * @generated
	 */
	EClass getPhonePojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PhonePojo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.model.glt.PhonePojo#getType()
	 * @see #getPhonePojo()
	 * @generated
	 */
	EAttribute getPhonePojo_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.PhonePojo#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see de.jena.model.glt.PhonePojo#getNumber()
	 * @see #getPhonePojo()
	 * @generated
	 */
	EAttribute getPhonePojo_Number();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.ContractPojo <em>Contract Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Pojo</em>'.
	 * @see de.jena.model.glt.ContractPojo
	 * @generated
	 */
	EClass getContractPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContractPojo#getArt <em>Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Art</em>'.
	 * @see de.jena.model.glt.ContractPojo#getArt()
	 * @see #getContractPojo()
	 * @generated
	 */
	EAttribute getContractPojo_Art();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContractPojo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.ContractPojo#getName()
	 * @see #getContractPojo()
	 * @generated
	 */
	EAttribute getContractPojo_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContractPojo#getDisplayname <em>Displayname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Displayname</em>'.
	 * @see de.jena.model.glt.ContractPojo#getDisplayname()
	 * @see #getContractPojo()
	 * @generated
	 */
	EAttribute getContractPojo_Displayname();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContractPojo#getConclusionDate <em>Conclusion Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conclusion Date</em>'.
	 * @see de.jena.model.glt.ContractPojo#getConclusionDate()
	 * @see #getContractPojo()
	 * @generated
	 */
	EAttribute getContractPojo_ConclusionDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContractPojo#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see de.jena.model.glt.ContractPojo#getComment()
	 * @see #getContractPojo()
	 * @generated
	 */
	EAttribute getContractPojo_Comment();

	/**
	 * Returns the meta object for the reference list '{@link de.jena.model.glt.ContractPojo#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contacts</em>'.
	 * @see de.jena.model.glt.ContractPojo#getContacts()
	 * @see #getContractPojo()
	 * @generated
	 */
	EReference getContractPojo_Contacts();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContractPojo#getCustomerId <em>Customer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Id</em>'.
	 * @see de.jena.model.glt.ContractPojo#getCustomerId()
	 * @see #getContractPojo()
	 * @generated
	 */
	EAttribute getContractPojo_CustomerId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContractPojo#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see de.jena.model.glt.ContractPojo#getEnd()
	 * @see #getContractPojo()
	 * @generated
	 */
	EAttribute getContractPojo_End();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContractPojo#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see de.jena.model.glt.ContractPojo#getNumber()
	 * @see #getContractPojo()
	 * @generated
	 */
	EAttribute getContractPojo_Number();

	/**
	 * Returns the meta object for the reference '{@link de.jena.model.glt.ContractPojo#getPartner <em>Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner</em>'.
	 * @see de.jena.model.glt.ContractPojo#getPartner()
	 * @see #getContractPojo()
	 * @generated
	 */
	EReference getContractPojo_Partner();

	/**
	 * Returns the meta object for the reference '{@link de.jena.model.glt.ContractPojo#getReferee <em>Referee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referee</em>'.
	 * @see de.jena.model.glt.ContractPojo#getReferee()
	 * @see #getContractPojo()
	 * @generated
	 */
	EReference getContractPojo_Referee();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContractPojo#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see de.jena.model.glt.ContractPojo#getStart()
	 * @see #getContractPojo()
	 * @generated
	 */
	EAttribute getContractPojo_Start();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContractPojo#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.jena.model.glt.ContractPojo#getState()
	 * @see #getContractPojo()
	 * @generated
	 */
	EAttribute getContractPojo_State();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContractPojo#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see de.jena.model.glt.ContractPojo#getSubject()
	 * @see #getContractPojo()
	 * @generated
	 */
	EAttribute getContractPojo_Subject();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContractPojo#getTermination <em>Termination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination</em>'.
	 * @see de.jena.model.glt.ContractPojo#getTermination()
	 * @see #getContractPojo()
	 * @generated
	 */
	EAttribute getContractPojo_Termination();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.ContractPojo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.model.glt.ContractPojo#getType()
	 * @see #getContractPojo()
	 * @generated
	 */
	EAttribute getContractPojo_Type();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.TechFacilityPojo <em>Tech Facility Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tech Facility Pojo</em>'.
	 * @see de.jena.model.glt.TechFacilityPojo
	 * @generated
	 */
	EClass getTechFacilityPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TechFacilityPojo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.TechFacilityPojo#getName()
	 * @see #getTechFacilityPojo()
	 * @generated
	 */
	EAttribute getTechFacilityPojo_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TechFacilityPojo#getFacilityClass <em>Facility Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facility Class</em>'.
	 * @see de.jena.model.glt.TechFacilityPojo#getFacilityClass()
	 * @see #getTechFacilityPojo()
	 * @generated
	 */
	EAttribute getTechFacilityPojo_FacilityClass();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TechFacilityPojo#getFacilityClassName <em>Facility Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facility Class Name</em>'.
	 * @see de.jena.model.glt.TechFacilityPojo#getFacilityClassName()
	 * @see #getTechFacilityPojo()
	 * @generated
	 */
	EAttribute getTechFacilityPojo_FacilityClassName();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TechFacilityPojo#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room</em>'.
	 * @see de.jena.model.glt.TechFacilityPojo#getRoom()
	 * @see #getTechFacilityPojo()
	 * @generated
	 */
	EAttribute getTechFacilityPojo_Room();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TechFacilityPojo#getConstructionYear <em>Construction Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Construction Year</em>'.
	 * @see de.jena.model.glt.TechFacilityPojo#getConstructionYear()
	 * @see #getTechFacilityPojo()
	 * @generated
	 */
	EAttribute getTechFacilityPojo_ConstructionYear();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TechFacilityPojo#getLaunchDate <em>Launch Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launch Date</em>'.
	 * @see de.jena.model.glt.TechFacilityPojo#getLaunchDate()
	 * @see #getTechFacilityPojo()
	 * @generated
	 */
	EAttribute getTechFacilityPojo_LaunchDate();

	/**
	 * Returns the meta object for the reference list '{@link de.jena.model.glt.TechFacilityPojo#getContracts <em>Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contracts</em>'.
	 * @see de.jena.model.glt.TechFacilityPojo#getContracts()
	 * @see #getTechFacilityPojo()
	 * @generated
	 */
	EReference getTechFacilityPojo_Contracts();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.EntityPojo <em>Entity Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Pojo</em>'.
	 * @see de.jena.model.glt.EntityPojo
	 * @generated
	 */
	EClass getEntityPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.EntityPojo#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity</em>'.
	 * @see de.jena.model.glt.EntityPojo#getEntity()
	 * @see #getEntityPojo()
	 * @generated
	 */
	EAttribute getEntityPojo_Entity();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.EntityRequest <em>Entity Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Request</em>'.
	 * @see de.jena.model.glt.EntityRequest
	 * @generated
	 */
	EClass getEntityRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.EntityRequest#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.EntityRequest#getSystemId()
	 * @see #getEntityRequest()
	 * @generated
	 */
	EAttribute getEntityRequest_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.EntityRequest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.model.glt.EntityRequest#getType()
	 * @see #getEntityRequest()
	 * @generated
	 */
	EAttribute getEntityRequest_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.EntityRequest#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see de.jena.model.glt.EntityRequest#getIdentifier()
	 * @see #getEntityRequest()
	 * @generated
	 */
	EAttribute getEntityRequest_Identifier();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.CylonNetworkPojo <em>Cylon Network Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylon Network Pojo</em>'.
	 * @see de.jena.model.glt.CylonNetworkPojo
	 * @generated
	 */
	EClass getCylonNetworkPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CylonNetworkPojo#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity</em>'.
	 * @see de.jena.model.glt.CylonNetworkPojo#getEntity()
	 * @see #getCylonNetworkPojo()
	 * @generated
	 */
	EAttribute getCylonNetworkPojo_Entity();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CylonNetworkPojo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.CylonNetworkPojo#getId()
	 * @see #getCylonNetworkPojo()
	 * @generated
	 */
	EAttribute getCylonNetworkPojo_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CylonNetworkPojo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.CylonNetworkPojo#getName()
	 * @see #getCylonNetworkPojo()
	 * @generated
	 */
	EAttribute getCylonNetworkPojo_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CylonNetworkPojo#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.CylonNetworkPojo#getSystemId()
	 * @see #getCylonNetworkPojo()
	 * @generated
	 */
	EAttribute getCylonNetworkPojo_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CylonNetworkPojo#getDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory</em>'.
	 * @see de.jena.model.glt.CylonNetworkPojo#getDirectory()
	 * @see #getCylonNetworkPojo()
	 * @generated
	 */
	EAttribute getCylonNetworkPojo_Directory();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CylonNetworkPojo#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see de.jena.model.glt.CylonNetworkPojo#getIp()
	 * @see #getCylonNetworkPojo()
	 * @generated
	 */
	EAttribute getCylonNetworkPojo_Ip();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CylonNetworkPojo#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see de.jena.model.glt.CylonNetworkPojo#getPort()
	 * @see #getCylonNetworkPojo()
	 * @generated
	 */
	EAttribute getCylonNetworkPojo_Port();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CylonNetworkPojo#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see de.jena.model.glt.CylonNetworkPojo#getCount()
	 * @see #getCylonNetworkPojo()
	 * @generated
	 */
	EAttribute getCylonNetworkPojo_Count();

	/**
	 * Returns the meta object for the reference list '{@link de.jena.model.glt.CylonNetworkPojo#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see de.jena.model.glt.CylonNetworkPojo#getChildren()
	 * @see #getCylonNetworkPojo()
	 * @generated
	 */
	EReference getCylonNetworkPojo_Children();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.CylonNetworkPojo#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see de.jena.model.glt.CylonNetworkPojo#getSummary()
	 * @see #getCylonNetworkPojo()
	 * @generated
	 */
	EAttribute getCylonNetworkPojo_Summary();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.ImportStatisticPojo <em>Import Statistic Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Statistic Pojo</em>'.
	 * @see de.jena.model.glt.ImportStatisticPojo
	 * @generated
	 */
	EClass getImportStatisticPojo();

	/**
	 * Returns the meta object for the reference list '{@link de.jena.model.glt.ImportStatisticPojo#getAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Add</em>'.
	 * @see de.jena.model.glt.ImportStatisticPojo#getAdd()
	 * @see #getImportStatisticPojo()
	 * @generated
	 */
	EReference getImportStatisticPojo_Add();

	/**
	 * Returns the meta object for the reference list '{@link de.jena.model.glt.ImportStatisticPojo#getRemove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Remove</em>'.
	 * @see de.jena.model.glt.ImportStatisticPojo#getRemove()
	 * @see #getImportStatisticPojo()
	 * @generated
	 */
	EReference getImportStatisticPojo_Remove();

	/**
	 * Returns the meta object for the reference list '{@link de.jena.model.glt.ImportStatisticPojo#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Update</em>'.
	 * @see de.jena.model.glt.ImportStatisticPojo#getUpdate()
	 * @see #getImportStatisticPojo()
	 * @generated
	 */
	EReference getImportStatisticPojo_Update();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see de.jena.model.glt.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Text#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.model.glt.Text#getType()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Text#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see de.jena.model.glt.Text#getContent()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Text#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.Text#getId()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Id();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.TextRequest <em>Text Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Request</em>'.
	 * @see de.jena.model.glt.TextRequest
	 * @generated
	 */
	EClass getTextRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TextRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.model.glt.TextRequest#getId()
	 * @see #getTextRequest()
	 * @generated
	 */
	EAttribute getTextRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TextRequest#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see de.jena.model.glt.TextRequest#getContent()
	 * @see #getTextRequest()
	 * @generated
	 */
	EAttribute getTextRequest_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.TextRequest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.model.glt.TextRequest#getType()
	 * @see #getTextRequest()
	 * @generated
	 */
	EAttribute getTextRequest_Type();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.RolePojo <em>Role Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Pojo</em>'.
	 * @see de.jena.model.glt.RolePojo
	 * @generated
	 */
	EClass getRolePojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.RolePojo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.model.glt.RolePojo#getName()
	 * @see #getRolePojo()
	 * @generated
	 */
	EAttribute getRolePojo_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.RolePojo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.model.glt.RolePojo#getType()
	 * @see #getRolePojo()
	 * @generated
	 */
	EAttribute getRolePojo_Type();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.model.glt.RolePojo#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Groups</em>'.
	 * @see de.jena.model.glt.RolePojo#getGroups()
	 * @see #getRolePojo()
	 * @generated
	 */
	EAttribute getRolePojo_Groups();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.model.glt.RolePojo#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Roles</em>'.
	 * @see de.jena.model.glt.RolePojo#getRoles()
	 * @see #getRolePojo()
	 * @generated
	 */
	EAttribute getRolePojo_Roles();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.model.glt.RolePojo#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Members</em>'.
	 * @see de.jena.model.glt.RolePojo#getMembers()
	 * @see #getRolePojo()
	 * @generated
	 */
	EAttribute getRolePojo_Members();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.RolePojo#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see de.jena.model.glt.RolePojo#getProperties()
	 * @see #getRolePojo()
	 * @generated
	 */
	EAttribute getRolePojo_Properties();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.SuspectPojo <em>Suspect Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspect Pojo</em>'.
	 * @see de.jena.model.glt.SuspectPojo
	 * @generated
	 */
	EClass getSuspectPojo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SuspectPojo#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see de.jena.model.glt.SuspectPojo#getSystemId()
	 * @see #getSuspectPojo()
	 * @generated
	 */
	EAttribute getSuspectPojo_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SuspectPojo#getAlarmId <em>Alarm Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Id</em>'.
	 * @see de.jena.model.glt.SuspectPojo#getAlarmId()
	 * @see #getSuspectPojo()
	 * @generated
	 */
	EAttribute getSuspectPojo_AlarmId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SuspectPojo#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.jena.model.glt.SuspectPojo#getState()
	 * @see #getSuspectPojo()
	 * @generated
	 */
	EAttribute getSuspectPojo_State();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SuspectPojo#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.model.glt.SuspectPojo#getTimestamp()
	 * @see #getSuspectPojo()
	 * @generated
	 */
	EAttribute getSuspectPojo_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SuspectPojo#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see de.jena.model.glt.SuspectPojo#getSeverity()
	 * @see #getSuspectPojo()
	 * @generated
	 */
	EAttribute getSuspectPojo_Severity();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SuspectPojo#getRecognized <em>Recognized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recognized</em>'.
	 * @see de.jena.model.glt.SuspectPojo#getRecognized()
	 * @see #getSuspectPojo()
	 * @generated
	 */
	EAttribute getSuspectPojo_Recognized();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.SuspectPojo#getBy <em>By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By</em>'.
	 * @see de.jena.model.glt.SuspectPojo#getBy()
	 * @see #getSuspectPojo()
	 * @generated
	 */
	EAttribute getSuspectPojo_By();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see de.jena.model.glt.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Response#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.jena.model.glt.Response#getCode()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Response#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.model.glt.Response#getDescription()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.glt.Response#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see de.jena.model.glt.Response#getResponse()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Response();

	/**
	 * Returns the meta object for the reference list '{@link de.jena.model.glt.Response#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Result</em>'.
	 * @see de.jena.model.glt.Response#getResult()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Result();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.OpenApiClient <em>Open Api Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Api Client</em>'.
	 * @see de.jena.model.glt.OpenApiClient
	 * @generated
	 */
	EClass getOpenApiClient();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.OpenApiClient#toQueryString(java.lang.String, java.lang.Object) <em>To Query String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Query String</em>' operation.
	 * @see de.jena.model.glt.OpenApiClient#toQueryString(java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getOpenApiClient__ToQueryString__String_Object();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.OpenApiClient#_get(java.lang.String, org.eclipse.emf.ecore.EClass, org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EMap) <em>get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>get</em>' operation.
	 * @see de.jena.model.glt.OpenApiClient#_get(java.lang.String, org.eclipse.emf.ecore.EClass, org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getOpenApiClient___get__String_EClass_EMap_EMap();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.GltOpenApiClient <em>Open Api Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Api Client</em>'.
	 * @see de.jena.model.glt.GltOpenApiClient
	 * @generated
	 */
	EClass getGltOpenApiClient();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#bulkTextUpdate(java.lang.String, java.lang.Integer, org.eclipse.emf.common.util.EList) <em>Bulk Text Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bulk Text Update</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#bulkTextUpdate(java.lang.String, java.lang.Integer, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__BulkTextUpdate__String_Integer_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarm(java.lang.String, java.lang.Boolean) <em>Get Alarm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarm(java.lang.String, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarm__String_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#updateAlarm(java.lang.String, de.jena.model.glt.AlarmRequest) <em>Update Alarm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Alarm</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#updateAlarm(java.lang.String, de.jena.model.glt.AlarmRequest)
	 * @generated
	 */
	EOperation getGltOpenApiClient__UpdateAlarm__String_AlarmRequest();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#createAlarm(java.lang.String, de.jena.model.glt.AlarmRequest) <em>Create Alarm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Alarm</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#createAlarm(java.lang.String, de.jena.model.glt.AlarmRequest)
	 * @generated
	 */
	EOperation getGltOpenApiClient__CreateAlarm__String_AlarmRequest();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmInstructions(java.lang.String) <em>Get Alarm Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Instructions</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmInstructions(java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmInstructions__String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#updateInstructions(java.lang.String, de.jena.model.glt.InstructionsPojo) <em>Update Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Instructions</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#updateInstructions(java.lang.String, de.jena.model.glt.InstructionsPojo)
	 * @generated
	 */
	EOperation getGltOpenApiClient__UpdateInstructions__String_InstructionsPojo();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarms(org.eclipse.emf.common.util.EList, java.lang.String) <em>Get Alarms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarms</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarms(org.eclipse.emf.common.util.EList, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarms__EList_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#usage(java.lang.Integer, java.lang.Boolean) <em>Usage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Usage</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#usage(java.lang.Integer, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__Usage__Integer_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getEventsForAlarm(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Get Events For Alarm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events For Alarm</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getEventsForAlarm(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetEventsForAlarm__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#createEventForAlarm(java.lang.String, de.jena.model.glt.CalenderEventRequest) <em>Create Event For Alarm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Event For Alarm</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#createEventForAlarm(java.lang.String, de.jena.model.glt.CalenderEventRequest)
	 * @generated
	 */
	EOperation getGltOpenApiClient__CreateEventForAlarm__String_CalenderEventRequest();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getEventsForSystem(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String) <em>Get Events For System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events For System</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getEventsForSystem(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetEventsForSystem__String_String_Boolean_String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#createEventForSystem(java.lang.String, de.jena.model.glt.CalenderEventRequest) <em>Create Event For System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Event For System</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#createEventForSystem(java.lang.String, de.jena.model.glt.CalenderEventRequest)
	 * @generated
	 */
	EOperation getGltOpenApiClient__CreateEventForSystem__String_CalenderEventRequest();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#updateEvent(java.lang.Integer, de.jena.model.glt.CalenderEventRequest) <em>Update Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Event</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#updateEvent(java.lang.Integer, de.jena.model.glt.CalenderEventRequest)
	 * @generated
	 */
	EOperation getGltOpenApiClient__UpdateEvent__Integer_CalenderEventRequest();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#deleteEvent(java.lang.Integer) <em>Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Event</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#deleteEvent(java.lang.Integer)
	 * @generated
	 */
	EOperation getGltOpenApiClient__DeleteEvent__Integer();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getEvents(org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, java.lang.String) <em>Get Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getEvents(org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetEvents__EList_String_String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getEventsAtTime(org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, java.math.BigInteger) <em>Get Events At Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events At Time</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getEventsAtTime(org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, java.math.BigInteger)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetEventsAtTime__EList_String_String_BigInteger();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getEventsForAlarm_1(java.lang.String, java.lang.String, java.lang.String, java.math.BigInteger) <em>Get Events For Alarm 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events For Alarm 1</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getEventsForAlarm_1(java.lang.String, java.lang.String, java.lang.String, java.math.BigInteger)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetEventsForAlarm_1__String_String_String_BigInteger();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getEventsForSystem_1(java.lang.String, java.lang.String, java.lang.String, java.math.BigInteger, java.lang.Boolean) <em>Get Events For System 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events For System 1</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getEventsForSystem_1(java.lang.String, java.lang.String, java.lang.String, java.math.BigInteger, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetEventsForSystem_1__String_String_String_BigInteger_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getForAlarm(java.lang.String, java.math.BigInteger, java.lang.String) <em>Get For Alarm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get For Alarm</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getForAlarm(java.lang.String, java.math.BigInteger, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetForAlarm__String_BigInteger_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#createCommentForOwner(java.lang.String, java.math.BigInteger, de.jena.model.glt.CommentRequest) <em>Create Comment For Owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Comment For Owner</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#createCommentForOwner(java.lang.String, java.math.BigInteger, de.jena.model.glt.CommentRequest)
	 * @generated
	 */
	EOperation getGltOpenApiClient__CreateCommentForOwner__String_BigInteger_CommentRequest();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#updateComment(java.lang.Integer, de.jena.model.glt.CommentRequest) <em>Update Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Comment</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#updateComment(java.lang.Integer, de.jena.model.glt.CommentRequest)
	 * @generated
	 */
	EOperation getGltOpenApiClient__UpdateComment__Integer_CommentRequest();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#deleteComment(java.lang.Integer) <em>Delete Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Comment</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#deleteComment(java.lang.Integer)
	 * @generated
	 */
	EOperation getGltOpenApiClient__DeleteComment__Integer();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getCommentedOn(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Get Commented On</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Commented On</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getCommentedOn(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetCommentedOn__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getFiltered(java.lang.Integer, java.lang.Integer, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String) <em>Get Filtered</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Filtered</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getFiltered(java.lang.Integer, java.lang.Integer, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetFiltered__Integer_Integer_EList_EList_Boolean_EList_EList_EList_String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getFilteredAuthors(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String) <em>Get Filtered Authors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Filtered Authors</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getFilteredAuthors(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetFilteredAuthors__EList_EList_Boolean_EList_EList_String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getFilteredCount(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String) <em>Get Filtered Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Filtered Count</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getFilteredCount(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetFilteredCount__EList_EList_Boolean_EList_EList_EList_String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#updateStatus(java.lang.Integer, java.lang.String) <em>Update Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Status</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#updateStatus(java.lang.Integer, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__UpdateStatus__Integer_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getBuildingNames(org.eclipse.emf.common.util.EList) <em>Get Building Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Building Names</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getBuildingNames(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetBuildingNames__EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getDeviceName(org.eclipse.emf.common.util.EList) <em>Get Device Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Device Name</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getDeviceName(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetDeviceName__EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getDevices(java.lang.Boolean) <em>Get Devices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Devices</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getDevices(java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetDevices__Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getDevicesCount() <em>Get Devices Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Devices Count</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getDevicesCount()
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetDevicesCount();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmsWithMismatchedSystems() <em>Get Alarms With Mismatched Systems</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarms With Mismatched Systems</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmsWithMismatchedSystems()
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmsWithMismatchedSystems();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAuditLog(java.lang.Integer, java.lang.Integer) <em>Get Audit Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Audit Log</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAuditLog(java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAuditLog__Integer_Integer();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAuditLogCount() <em>Get Audit Log Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Audit Log Count</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAuditLogCount()
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAuditLogCount();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getDuplicateTexts() <em>Get Duplicate Texts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Duplicate Texts</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getDuplicateTexts()
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetDuplicateTexts();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getFields(java.lang.Boolean) <em>Get Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Fields</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getFields(java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetFields__Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getUndocumentedAlarms() <em>Get Undocumented Alarms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Undocumented Alarms</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getUndocumentedAlarms()
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetUndocumentedAlarms();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getUnusedTexts() <em>Get Unused Texts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unused Texts</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getUnusedTexts()
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetUnusedTexts();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#importFromCsv(org.eclipse.emf.common.util.EList, java.lang.String, java.lang.Boolean, java.lang.String) <em>Import From Csv</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Import From Csv</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#importFromCsv(org.eclipse.emf.common.util.EList, java.lang.String, java.lang.Boolean, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__ImportFromCsv__EList_String_Boolean_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getDatalogContent(java.lang.Integer, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String) <em>Get Datalog Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Datalog Content</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getDatalogContent(java.lang.Integer, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetDatalogContent__Integer_EList_String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getDatalogInfo(java.lang.Integer, org.eclipse.emf.common.util.EList) <em>Get Datalog Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Datalog Info</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getDatalogInfo(java.lang.Integer, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetDatalogInfo__Integer_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#updateDatalogContent(java.lang.Integer, org.eclipse.emf.common.util.EList) <em>Update Datalog Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Datalog Content</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#updateDatalogContent(java.lang.Integer, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__UpdateDatalogContent__Integer_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getChangelog(java.lang.Integer, java.lang.Integer, org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String) <em>Get Changelog</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Changelog</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getChangelog(java.lang.Integer, java.lang.Integer, org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetChangelog__Integer_Integer_EList_Boolean_EList_String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getChangelogCount(org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String) <em>Get Changelog Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Changelog Count</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getChangelogCount(org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetChangelogCount__EList_Boolean_EList_String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getPointValueHistory(java.lang.Integer, org.eclipse.emf.common.util.EList, java.lang.Boolean, java.lang.Boolean) <em>Get Point Value History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Point Value History</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getPointValueHistory(java.lang.Integer, org.eclipse.emf.common.util.EList, java.lang.Boolean, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetPointValueHistory__Integer_EList_Boolean_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getPointValues(java.lang.Integer, java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList) <em>Get Point Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Point Values</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getPointValues(java.lang.Integer, java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetPointValues__Integer_String_String_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#updatePointValues(java.lang.Integer, org.eclipse.emf.common.util.EList) <em>Update Point Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Point Values</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#updatePointValues(java.lang.Integer, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__UpdatePointValues__Integer_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmCount(org.eclipse.emf.common.util.EList, java.math.BigInteger, java.math.BigInteger) <em>Get Alarm Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Count</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmCount(org.eclipse.emf.common.util.EList, java.math.BigInteger, java.math.BigInteger)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmCount__EList_BigInteger_BigInteger();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmCountPost(java.math.BigInteger, java.math.BigInteger, org.eclipse.emf.common.util.EList) <em>Get Alarm Count Post</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Count Post</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmCountPost(java.math.BigInteger, java.math.BigInteger, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmCountPost__BigInteger_BigInteger_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmCount_1(java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Alarm Count 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Count 1</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmCount_1(java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmCount_1__String_String_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmCountByState(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Alarm Count By State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Count By State</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmCountByState(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmCountByState__String_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmCountByState_1(org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Alarm Count By State 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Count By State 1</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmCountByState_1(org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmCountByState_1__EList_Boolean_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmCountForSystem(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Alarm Count For System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Count For System</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmCountForSystem(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmCountForSystem__String_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmForStateCount(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Alarm For State Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm For State Count</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmForStateCount(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmForStateCount__String_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmLogTimeline(java.lang.String, java.math.BigInteger, java.math.BigInteger, java.lang.Integer, java.lang.Integer) <em>Get Alarm Log Timeline</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Log Timeline</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmLogTimeline(java.lang.String, java.math.BigInteger, java.math.BigInteger, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmLogTimeline__String_BigInteger_BigInteger_Integer_Integer();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmLogTimelineStatistics(java.lang.String, java.math.BigInteger, java.math.BigInteger, java.lang.String, java.lang.String) <em>Get Alarm Log Timeline Statistics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Log Timeline Statistics</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmLogTimelineStatistics(java.lang.String, java.math.BigInteger, java.math.BigInteger, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmLogTimelineStatistics__String_BigInteger_BigInteger_String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmLogs(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Alarm Logs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Logs</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmLogs(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmLogs__EList_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmLogs_1(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Alarm Logs 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Logs 1</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmLogs_1(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmLogs_1__String_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmLogsForState(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Alarm Logs For State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Logs For State</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmLogsForState(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmLogsForState__String_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmLogsForStates(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Alarm Logs For States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Logs For States</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmLogsForStates(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmLogsForStates__EList_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmLogsTimeline(java.lang.String, java.math.BigInteger, java.math.BigInteger) <em>Get Alarm Logs Timeline</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Logs Timeline</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmLogsTimeline(java.lang.String, java.math.BigInteger, java.math.BigInteger)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmLogsTimeline__String_BigInteger_BigInteger();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmsForState(java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Alarms For State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarms For State</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmsForState(java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmsForState__String_String_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAlarmsForStates(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Alarms For States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarms For States</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAlarmsForStates(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAlarmsForStates__String_EList_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getEntityMonitoring(java.lang.Integer) <em>Get Entity Monitoring</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entity Monitoring</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getEntityMonitoring(java.lang.Integer)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetEntityMonitoring__Integer();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getEntityMonitoring_1(java.lang.Integer, java.lang.String) <em>Get Entity Monitoring 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entity Monitoring 1</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getEntityMonitoring_1(java.lang.Integer, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetEntityMonitoring_1__Integer_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#updateEntityMonitoring(java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean) <em>Update Entity Monitoring</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Entity Monitoring</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#updateEntityMonitoring(java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__UpdateEntityMonitoring__Integer_String_Integer_String_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getLog(java.lang.String) <em>Get Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Log</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getLog(java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetLog__String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getLogs() <em>Get Logs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Logs</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getLogs()
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetLogs();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getLogsForState(java.lang.String) <em>Get Logs For State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Logs For State</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getLogsForState(java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetLogsForState__String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getStatistics(java.lang.String) <em>Get Statistics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Statistics</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getStatistics(java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetStatistics__String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getStatusLogs() <em>Get Status Logs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Status Logs</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getStatusLogs()
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetStatusLogs();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#upsertStatusLog(de.jena.model.glt.StatusLogRequest) <em>Upsert Status Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Upsert Status Log</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#upsertStatusLog(de.jena.model.glt.StatusLogRequest)
	 * @generated
	 */
	EOperation getGltOpenApiClient__UpsertStatusLog__StatusLogRequest();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getStatusLogs_1(java.lang.String) <em>Get Status Logs 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Status Logs 1</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getStatusLogs_1(java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetStatusLogs_1__String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getStatusLogsTimeline(java.lang.String, java.math.BigInteger, java.math.BigInteger) <em>Get Status Logs Timeline</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Status Logs Timeline</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getStatusLogsTimeline(java.lang.String, java.math.BigInteger, java.math.BigInteger)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetStatusLogsTimeline__String_BigInteger_BigInteger();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getTracked(java.lang.String) <em>Get Tracked</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tracked</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getTracked(java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetTracked__String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#isFlaky(java.lang.String, java.lang.String, java.math.BigInteger, java.math.BigInteger, java.lang.Integer) <em>Is Flaky</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Flaky</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#isFlaky(java.lang.String, java.lang.String, java.math.BigInteger, java.math.BigInteger, java.lang.Integer)
	 * @generated
	 */
	EOperation getGltOpenApiClient__IsFlaky__String_String_BigInteger_BigInteger_Integer();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#logsForStates(org.eclipse.emf.common.util.EList) <em>Logs For States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Logs For States</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#logsForStates(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__LogsForStates__EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#refreshSystem(java.lang.String) <em>Refresh System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh System</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#refreshSystem(java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__RefreshSystem__String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#updateAlarmState(java.lang.String, de.jena.model.glt.UpdateStateRequest) <em>Update Alarm State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Alarm State</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#updateAlarmState(java.lang.String, de.jena.model.glt.UpdateStateRequest)
	 * @generated
	 */
	EOperation getGltOpenApiClient__UpdateAlarmState__String_UpdateStateRequest();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getChangelog_1(java.lang.Integer, java.lang.Integer, org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String) <em>Get Changelog 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Changelog 1</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getChangelog_1(java.lang.Integer, java.lang.Integer, org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetChangelog_1__Integer_Integer_EList_Boolean_EList_String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getChangelogCount_1(org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String) <em>Get Changelog Count 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Changelog Count 1</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getChangelogCount_1(org.eclipse.emf.common.util.EList, java.lang.Boolean, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetChangelogCount_1__EList_Boolean_EList_String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getTimeScheduleBlockHistory(java.lang.Integer, org.eclipse.emf.common.util.EList, java.lang.Boolean) <em>Get Time Schedule Block History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Time Schedule Block History</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getTimeScheduleBlockHistory(java.lang.Integer, org.eclipse.emf.common.util.EList, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetTimeScheduleBlockHistory__Integer_EList_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getTimeScheduleBlocks(java.lang.Integer, org.eclipse.emf.common.util.EList) <em>Get Time Schedule Blocks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Time Schedule Blocks</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getTimeScheduleBlocks(java.lang.Integer, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetTimeScheduleBlocks__Integer_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#updateTimeScheduleBlocks(java.lang.Integer, org.eclipse.emf.common.util.EList) <em>Update Time Schedule Blocks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Time Schedule Blocks</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#updateTimeScheduleBlocks(java.lang.Integer, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__UpdateTimeScheduleBlocks__Integer_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getTimeScheduleStateHistory(java.lang.Integer, org.eclipse.emf.common.util.EList, java.lang.Boolean) <em>Get Time Schedule State History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Time Schedule State History</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getTimeScheduleStateHistory(java.lang.Integer, org.eclipse.emf.common.util.EList, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetTimeScheduleStateHistory__Integer_EList_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getTimeScheduleStates(java.lang.Integer, org.eclipse.emf.common.util.EList) <em>Get Time Schedule States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Time Schedule States</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getTimeScheduleStates(java.lang.Integer, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetTimeScheduleStates__Integer_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#updateTimeScheduleStates(java.lang.Integer, org.eclipse.emf.common.util.EList) <em>Update Time Schedule States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Time Schedule States</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#updateTimeScheduleStates(java.lang.Integer, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__UpdateTimeScheduleStates__Integer_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getVersion(java.lang.Integer, org.eclipse.emf.common.util.EList) <em>Get Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Version</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getVersion(java.lang.Integer, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetVersion__Integer_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#point(de.jena.model.glt.PointRecord) <em>Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Point</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#point(de.jena.model.glt.PointRecord)
	 * @generated
	 */
	EOperation getGltOpenApiClient__Point__PointRecord();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#timeschedule(de.jena.model.glt.TimeScheduleRecord) <em>Timeschedule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Timeschedule</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#timeschedule(de.jena.model.glt.TimeScheduleRecord)
	 * @generated
	 */
	EOperation getGltOpenApiClient__Timeschedule__TimeScheduleRecord();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#get(java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__Get__String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#createOrUpdate(java.lang.String, java.lang.String) <em>Create Or Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Or Update</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#createOrUpdate(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__CreateOrUpdate__String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#create(java.lang.String, java.lang.String) <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#create(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__Create__String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#delete(java.lang.String) <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#delete(java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__Delete__String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAllSettings() <em>Get All Settings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Settings</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAllSettings()
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAllSettings();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getAuthStatus() <em>Get Auth Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Auth Status</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getAuthStatus()
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetAuthStatus();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getStatus() <em>Get Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Status</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getStatus()
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetStatus();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getSystem(java.lang.String, java.lang.Boolean) <em>Get System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get System</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getSystem(java.lang.String, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetSystem__String_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#updateSystem(java.lang.String, de.jena.model.glt.SystemDescriptionRequest) <em>Update System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update System</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#updateSystem(java.lang.String, de.jena.model.glt.SystemDescriptionRequest)
	 * @generated
	 */
	EOperation getGltOpenApiClient__UpdateSystem__String_SystemDescriptionRequest();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#createSystemDescription(java.lang.String, de.jena.model.glt.SystemDescriptionRequest) <em>Create System Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create System Description</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#createSystemDescription(java.lang.String, de.jena.model.glt.SystemDescriptionRequest)
	 * @generated
	 */
	EOperation getGltOpenApiClient__CreateSystemDescription__String_SystemDescriptionRequest();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#deleteSystem(java.lang.String) <em>Delete System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete System</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#deleteSystem(java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__DeleteSystem__String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getContacts(java.lang.String) <em>Get Contacts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contacts</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getContacts(java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetContacts__String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getContracts(java.lang.String, java.lang.String, java.lang.Boolean) <em>Get Contracts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contracts</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getContracts(java.lang.String, java.lang.String, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetContracts__String_String_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getSystems(java.lang.Boolean, java.lang.Boolean) <em>Get Systems</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Systems</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getSystems(java.lang.Boolean, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetSystems__Boolean_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getTechFacilities(java.lang.String, java.lang.String, java.lang.Boolean) <em>Get Tech Facilities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tech Facilities</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getTechFacilities(java.lang.String, java.lang.String, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetTechFacilities__String_String_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getEntities(org.eclipse.emf.common.util.EList) <em>Get Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entities</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getEntities(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetEntities__EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getEntitiesByType(java.lang.Integer, java.lang.String, org.eclipse.emf.common.util.EList) <em>Get Entities By Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entities By Type</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getEntitiesByType(java.lang.Integer, java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetEntitiesByType__Integer_String_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getEntitiesByTypes(java.lang.Integer, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Entities By Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entities By Types</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getEntitiesByTypes(java.lang.Integer, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetEntitiesByTypes__Integer_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getSystemEntities(java.lang.Integer, java.lang.Integer) <em>Get System Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get System Entities</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getSystemEntities(java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetSystemEntities__Integer_Integer();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getSystemEntity(java.lang.Integer, java.lang.String, java.lang.Integer) <em>Get System Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get System Entity</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getSystemEntity(java.lang.Integer, java.lang.String, java.lang.Integer)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetSystemEntity__Integer_String_Integer();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#importSystems(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean) <em>Import Systems</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Import Systems</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#importSystems(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__ImportSystems__Boolean_Boolean_Boolean_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#cleanupTexts() <em>Cleanup Texts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cleanup Texts</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#cleanupTexts()
	 * @generated
	 */
	EOperation getGltOpenApiClient__CleanupTexts();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#createText(de.jena.model.glt.TextRequest) <em>Create Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Text</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#createText(de.jena.model.glt.TextRequest)
	 * @generated
	 */
	EOperation getGltOpenApiClient__CreateText__TextRequest();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getText(java.lang.Integer) <em>Get Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Text</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getText(java.lang.Integer)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetText__Integer();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#updateText(java.lang.Integer, de.jena.model.glt.TextRequest) <em>Update Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Text</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#updateText(java.lang.Integer, de.jena.model.glt.TextRequest)
	 * @generated
	 */
	EOperation getGltOpenApiClient__UpdateText__Integer_TextRequest();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#deleteText(java.lang.Integer) <em>Delete Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Text</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#deleteText(java.lang.Integer)
	 * @generated
	 */
	EOperation getGltOpenApiClient__DeleteText__Integer();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getTextIds(java.lang.Boolean) <em>Get Text Ids</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Text Ids</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getTextIds(java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetTextIds__Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getTexts(java.lang.String, java.lang.Boolean) <em>Get Texts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Texts</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getTexts(java.lang.String, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetTexts__String_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getGroups() <em>Get Groups</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Groups</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getGroups()
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetGroups();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#addGroup(java.lang.String) <em>Add Group</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Group</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#addGroup(java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__AddGroup__String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#addMemberToGroup(java.lang.String, java.lang.String) <em>Add Member To Group</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Member To Group</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#addMemberToGroup(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__AddMemberToGroup__String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#addPropertyToRole(java.lang.String, java.lang.String, java.lang.String) <em>Add Property To Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Property To Role</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#addPropertyToRole(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__AddPropertyToRole__String_String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#removePropertyFromRole(java.lang.String, java.lang.String) <em>Remove Property From Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Property From Role</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#removePropertyFromRole(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__RemovePropertyFromRole__String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getUsers() <em>Get Users</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Users</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getUsers()
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetUsers();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#addUser(java.lang.String) <em>Add User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add User</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#addUser(java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__AddUser__String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#currentRole() <em>Current Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Current Role</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#currentRole()
	 * @generated
	 */
	EOperation getGltOpenApiClient__CurrentRole();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getRole(java.lang.String, java.lang.Boolean, java.lang.Boolean) <em>Get Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Role</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getRole(java.lang.String, java.lang.Boolean, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetRole__String_Boolean_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#removeMemberFromGroup(java.lang.String, java.lang.String) <em>Remove Member From Group</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Member From Group</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#removeMemberFromGroup(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__RemoveMemberFromGroup__String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#removeRole(java.lang.String) <em>Remove Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Role</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#removeRole(java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__RemoveRole__String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#updateSuspect(java.lang.String, java.lang.String) <em>Update Suspect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Suspect</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#updateSuspect(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__UpdateSuspect__String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#deleteSuspect(java.lang.String, java.lang.String) <em>Delete Suspect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Suspect</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#deleteSuspect(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGltOpenApiClient__DeleteSuspect__String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getSuspects(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.Boolean) <em>Get Suspects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Suspects</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getSuspects(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetSuspects__EList_EList_Boolean();

	/**
	 * Returns the meta object for the '{@link de.jena.model.glt.GltOpenApiClient#getSuspects_1(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.Boolean) <em>Get Suspects 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Suspects 1</em>' operation.
	 * @see de.jena.model.glt.GltOpenApiClient#getSuspects_1(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.Boolean)
	 * @generated
	 */
	EOperation getGltOpenApiClient__GetSuspects_1__String_EList_EList_Boolean();

	/**
	 * Returns the meta object for class '{@link de.jena.model.glt.JsonNode <em>Json Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Node</em>'.
	 * @see de.jena.model.glt.JsonNode
	 * @generated
	 */
	EClass getJsonNode();

	/**
	 * Returns the meta object for data type '{@link jakarta.ws.rs.core.Response <em>JResponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JResponse</em>'.
	 * @see jakarta.ws.rs.core.Response
	 * @model instanceClass="jakarta.ws.rs.core.Response"
	 * @generated
	 */
	EDataType getJResponse();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GltFactory getGltFactory();

} //GltPackage
