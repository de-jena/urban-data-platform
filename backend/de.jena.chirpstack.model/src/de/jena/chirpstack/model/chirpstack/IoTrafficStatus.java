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
package de.jena.chirpstack.model.chirpstack;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io Traffic Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getTotalObjects <em>Total Objects</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getLineCount <em>Line Count</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getPayloadVersion <em>Payload Version</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getFromTime <em>From Time</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getToTime <em>To Time</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getFromTimeText <em>From Time Text</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getToTimeText <em>To Time Text</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficStatus()
 * @model
 * @generated
 */
@ProviderType
public interface IoTrafficStatus extends Service {
	/**
	 * Returns the value of the '<em><b>Total Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Objects</em>' attribute.
	 * @see #setTotalObjects(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficStatus_TotalObjects()
	 * @model annotation="mapping path='object/total_objects'"
	 * @generated
	 */
	double getTotalObjects();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getTotalObjects <em>Total Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Objects</em>' attribute.
	 * @see #getTotalObjects()
	 * @generated
	 */
	void setTotalObjects(double value);

	/**
	 * Returns the value of the '<em><b>Line Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Count</em>' attribute.
	 * @see #setLineCount(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficStatus_LineCount()
	 * @model annotation="mapping path='object/line_count'"
	 * @generated
	 */
	double getLineCount();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getLineCount <em>Line Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Count</em>' attribute.
	 * @see #getLineCount()
	 * @generated
	 */
	void setLineCount(double value);

	/**
	 * Returns the value of the '<em><b>Payload Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload Version</em>' attribute.
	 * @see #setPayloadVersion(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficStatus_PayloadVersion()
	 * @model annotation="mapping path='object/payload_version'"
	 * @generated
	 */
	double getPayloadVersion();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getPayloadVersion <em>Payload Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload Version</em>' attribute.
	 * @see #getPayloadVersion()
	 * @generated
	 */
	void setPayloadVersion(double value);

	/**
	 * Returns the value of the '<em><b>From Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Time</em>' attribute.
	 * @see #setFromTime(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficStatus_FromTime()
	 * @model annotation="mapping path='object/from_time'"
	 * @generated
	 */
	double getFromTime();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getFromTime <em>From Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Time</em>' attribute.
	 * @see #getFromTime()
	 * @generated
	 */
	void setFromTime(double value);

	/**
	 * Returns the value of the '<em><b>To Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Time</em>' attribute.
	 * @see #setToTime(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficStatus_ToTime()
	 * @model annotation="mapping path='object/to_time'"
	 * @generated
	 */
	double getToTime();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getToTime <em>To Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Time</em>' attribute.
	 * @see #getToTime()
	 * @generated
	 */
	void setToTime(double value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see #setMessageType(String)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficStatus_MessageType()
	 * @model annotation="mapping path='object/message_type'"
	 * @generated
	 */
	String getMessageType();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(String value);

	/**
	 * Returns the value of the '<em><b>From Time Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Time Text</em>' attribute.
	 * @see #setFromTimeText(String)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficStatus_FromTimeText()
	 * @model annotation="mapping path='object/from_time_text'"
	 * @generated
	 */
	String getFromTimeText();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getFromTimeText <em>From Time Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Time Text</em>' attribute.
	 * @see #getFromTimeText()
	 * @generated
	 */
	void setFromTimeText(String value);

	/**
	 * Returns the value of the '<em><b>To Time Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Time Text</em>' attribute.
	 * @see #setToTimeText(String)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficStatus_ToTimeText()
	 * @model annotation="mapping path='object/to_time_text'"
	 * @generated
	 */
	String getToTimeText();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficStatus#getToTimeText <em>To Time Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Time Text</em>' attribute.
	 * @see #getToTimeText()
	 * @generated
	 */
	void setToTimeText(String value);

} // IoTrafficStatus
