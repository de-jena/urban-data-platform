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
package de.jena.model.glt;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.model.glt.GltPackage
 * @generated
 */
@ProviderType
public interface GltFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GltFactory eINSTANCE = de.jena.model.glt.impl.GltFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alarm</em>'.
	 * @generated
	 */
	Alarm createAlarm();

	/**
	 * Returns a new object of class '<em>Alarm Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alarm Id</em>'.
	 * @generated
	 */
	AlarmId createAlarmId();

	/**
	 * Returns a new object of class '<em>Alarm Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alarm Request</em>'.
	 * @generated
	 */
	AlarmRequest createAlarmRequest();

	/**
	 * Returns a new object of class '<em>Alarm Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alarm Pojo</em>'.
	 * @generated
	 */
	AlarmPojo createAlarmPojo();

	/**
	 * Returns a new object of class '<em>Linked Id String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linked Id String</em>'.
	 * @generated
	 */
	LinkedIdString createLinkedIdString();

	/**
	 * Returns a new object of class '<em>Instructions Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instructions Pojo</em>'.
	 * @generated
	 */
	InstructionsPojo createInstructionsPojo();

	/**
	 * Returns a new object of class '<em>Relation Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Pojo</em>'.
	 * @generated
	 */
	RelationPojo createRelationPojo();

	/**
	 * Returns a new object of class '<em>Calendar Event Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar Event Pojo</em>'.
	 * @generated
	 */
	CalendarEventPojo createCalendarEventPojo();

	/**
	 * Returns a new object of class '<em>Calender Event Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calender Event Request</em>'.
	 * @generated
	 */
	CalenderEventRequest createCalenderEventRequest();

	/**
	 * Returns a new object of class '<em>Comment Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment Pojo</em>'.
	 * @generated
	 */
	CommentPojo createCommentPojo();

	/**
	 * Returns a new object of class '<em>Status Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Pojo</em>'.
	 * @generated
	 */
	StatusPojo createStatusPojo();

	/**
	 * Returns a new object of class '<em>Comment Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment Request</em>'.
	 * @generated
	 */
	CommentRequest createCommentRequest();

	/**
	 * Returns a new object of class '<em>Device Building Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Building Pojo</em>'.
	 * @generated
	 */
	DeviceBuildingPojo createDeviceBuildingPojo();

	/**
	 * Returns a new object of class '<em>Device Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Pojo</em>'.
	 * @generated
	 */
	DevicePojo createDevicePojo();

	/**
	 * Returns a new object of class '<em>Device Connection Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Connection Pojo</em>'.
	 * @generated
	 */
	DeviceConnectionPojo createDeviceConnectionPojo();

	/**
	 * Returns a new object of class '<em>Devices Collection Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Devices Collection Pojo</em>'.
	 * @generated
	 */
	DevicesCollectionPojo createDevicesCollectionPojo();

	/**
	 * Returns a new object of class '<em>Device Adapter Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Adapter Pojo</em>'.
	 * @generated
	 */
	DeviceAdapterPojo createDeviceAdapterPojo();

	/**
	 * Returns a new object of class '<em>Alarm Log Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alarm Log Pojo</em>'.
	 * @generated
	 */
	AlarmLogPojo createAlarmLogPojo();

	/**
	 * Returns a new object of class '<em>Change Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Item</em>'.
	 * @generated
	 */
	ChangeItem createChangeItem();

	/**
	 * Returns a new object of class '<em>Datalog Content Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datalog Content Pojo</em>'.
	 * @generated
	 */
	DatalogContentPojo createDatalogContentPojo();

	/**
	 * Returns a new object of class '<em>Point Value Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Value Pojo</em>'.
	 * @generated
	 */
	PointValuePojo createPointValuePojo();

	/**
	 * Returns a new object of class '<em>Alarm Log Timeline Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alarm Log Timeline Pojo</em>'.
	 * @generated
	 */
	AlarmLogTimelinePojo createAlarmLogTimelinePojo();

	/**
	 * Returns a new object of class '<em>Statistic Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistic Entry</em>'.
	 * @generated
	 */
	StatisticEntry createStatisticEntry();

	/**
	 * Returns a new object of class '<em>Time Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Window</em>'.
	 * @generated
	 */
	TimeWindow createTimeWindow();

	/**
	 * Returns a new object of class '<em>Entity Monitoring Settings Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Monitoring Settings Pojo</em>'.
	 * @generated
	 */
	EntityMonitoringSettingsPojo createEntityMonitoringSettingsPojo();

	/**
	 * Returns a new object of class '<em>Sync Log Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sync Log Pojo</em>'.
	 * @generated
	 */
	SyncLogPojo createSyncLogPojo();

	/**
	 * Returns a new object of class '<em>Status Log Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Log Pojo</em>'.
	 * @generated
	 */
	StatusLogPojo createStatusLogPojo();

	/**
	 * Returns a new object of class '<em>Update State Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update State Request</em>'.
	 * @generated
	 */
	UpdateStateRequest createUpdateStateRequest();

	/**
	 * Returns a new object of class '<em>Status Log Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Log Request</em>'.
	 * @generated
	 */
	StatusLogRequest createStatusLogRequest();

	/**
	 * Returns a new object of class '<em>Time Schedule Block Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Schedule Block Pojo</em>'.
	 * @generated
	 */
	TimeScheduleBlockPojo createTimeScheduleBlockPojo();

	/**
	 * Returns a new object of class '<em>Time Schedule State Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Schedule State Pojo</em>'.
	 * @generated
	 */
	TimeScheduleStatePojo createTimeScheduleStatePojo();

	/**
	 * Returns a new object of class '<em>Version Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version Info</em>'.
	 * @generated
	 */
	VersionInfo createVersionInfo();

	/**
	 * Returns a new object of class '<em>Point Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Record</em>'.
	 * @generated
	 */
	PointRecord createPointRecord();

	/**
	 * Returns a new object of class '<em>Time Schedule Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Schedule Record</em>'.
	 * @generated
	 */
	TimeScheduleRecord createTimeScheduleRecord();

	/**
	 * Returns a new object of class '<em>Json Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Json Node</em>'.
	 * @generated
	 */
	JsonNode createJsonNode();

	/**
	 * Returns a new object of class '<em>Address Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Pojo</em>'.
	 * @generated
	 */
	AddressPojo createAddressPojo();

	/**
	 * Returns a new object of class '<em>System Description Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Description Pojo</em>'.
	 * @generated
	 */
	SystemDescriptionPojo createSystemDescriptionPojo();

	/**
	 * Returns a new object of class '<em>System Description Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Description Request</em>'.
	 * @generated
	 */
	SystemDescriptionRequest createSystemDescriptionRequest();

	/**
	 * Returns a new object of class '<em>Contact Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Pojo</em>'.
	 * @generated
	 */
	ContactPojo createContactPojo();

	/**
	 * Returns a new object of class '<em>Phone Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phone Pojo</em>'.
	 * @generated
	 */
	PhonePojo createPhonePojo();

	/**
	 * Returns a new object of class '<em>Contract Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Pojo</em>'.
	 * @generated
	 */
	ContractPojo createContractPojo();

	/**
	 * Returns a new object of class '<em>Tech Facility Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tech Facility Pojo</em>'.
	 * @generated
	 */
	TechFacilityPojo createTechFacilityPojo();

	/**
	 * Returns a new object of class '<em>Entity Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Pojo</em>'.
	 * @generated
	 */
	EntityPojo createEntityPojo();

	/**
	 * Returns a new object of class '<em>Entity Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Request</em>'.
	 * @generated
	 */
	EntityRequest createEntityRequest();

	/**
	 * Returns a new object of class '<em>Cylon Network Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cylon Network Pojo</em>'.
	 * @generated
	 */
	CylonNetworkPojo createCylonNetworkPojo();

	/**
	 * Returns a new object of class '<em>Import Statistic Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Statistic Pojo</em>'.
	 * @generated
	 */
	ImportStatisticPojo createImportStatisticPojo();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Text Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Request</em>'.
	 * @generated
	 */
	TextRequest createTextRequest();

	/**
	 * Returns a new object of class '<em>Linked Id Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linked Id Integer</em>'.
	 * @generated
	 */
	LinkedIdInteger createLinkedIdInteger();

	/**
	 * Returns a new object of class '<em>Role Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Pojo</em>'.
	 * @generated
	 */
	RolePojo createRolePojo();

	/**
	 * Returns a new object of class '<em>Suspect Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspect Pojo</em>'.
	 * @generated
	 */
	SuspectPojo createSuspectPojo();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GltPackage getGltPackage();

} //GltFactory
