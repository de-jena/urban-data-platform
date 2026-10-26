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
package de.jena.chirpstack.model.chirpstack.impl;

import de.jena.chirpstack.model.chirpstack.ChirpstackPackage;
import de.jena.chirpstack.model.chirpstack.IoTrafficWindow;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io Traffic Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficWindowImpl#getTotalObjects <em>Total Objects</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficWindowImpl#getLineCount <em>Line Count</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficWindowImpl#getPayloadVersion <em>Payload Version</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficWindowImpl#getFromTime <em>From Time</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficWindowImpl#getToTime <em>To Time</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficWindowImpl#getFromTimeText <em>From Time Text</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficWindowImpl#getToTimeText <em>To Time Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoTrafficWindowImpl extends ServiceImpl implements IoTrafficWindow {
	/**
	 * The default value of the '{@link #getTotalObjects() <em>Total Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalObjects()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_OBJECTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalObjects() <em>Total Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalObjects()
	 * @generated
	 * @ordered
	 */
	protected double totalObjects = TOTAL_OBJECTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineCount() <em>Line Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCount()
	 * @generated
	 * @ordered
	 */
	protected static final double LINE_COUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLineCount() <em>Line Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCount()
	 * @generated
	 * @ordered
	 */
	protected double lineCount = LINE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayloadVersion() <em>Payload Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadVersion()
	 * @generated
	 * @ordered
	 */
	protected static final double PAYLOAD_VERSION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPayloadVersion() <em>Payload Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadVersion()
	 * @generated
	 * @ordered
	 */
	protected double payloadVersion = PAYLOAD_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromTime() <em>From Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTime()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromTime() <em>From Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTime()
	 * @generated
	 * @ordered
	 */
	protected double fromTime = FROM_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getToTime() <em>To Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTime()
	 * @generated
	 * @ordered
	 */
	protected static final double TO_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getToTime() <em>To Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTime()
	 * @generated
	 * @ordered
	 */
	protected double toTime = TO_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromTimeText() <em>From Time Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTimeText()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_TIME_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromTimeText() <em>From Time Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTimeText()
	 * @generated
	 * @ordered
	 */
	protected String fromTimeText = FROM_TIME_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getToTimeText() <em>To Time Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTimeText()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_TIME_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToTimeText() <em>To Time Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTimeText()
	 * @generated
	 * @ordered
	 */
	protected String toTimeText = TO_TIME_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoTrafficWindowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.IO_TRAFFIC_WINDOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTotalObjects() {
		return totalObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalObjects(double newTotalObjects) {
		double oldTotalObjects = totalObjects;
		totalObjects = newTotalObjects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_WINDOW__TOTAL_OBJECTS, oldTotalObjects, totalObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLineCount() {
		return lineCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineCount(double newLineCount) {
		double oldLineCount = lineCount;
		lineCount = newLineCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_WINDOW__LINE_COUNT, oldLineCount, lineCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPayloadVersion() {
		return payloadVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayloadVersion(double newPayloadVersion) {
		double oldPayloadVersion = payloadVersion;
		payloadVersion = newPayloadVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_WINDOW__PAYLOAD_VERSION, oldPayloadVersion, payloadVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFromTime() {
		return fromTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromTime(double newFromTime) {
		double oldFromTime = fromTime;
		fromTime = newFromTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_WINDOW__FROM_TIME, oldFromTime, fromTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getToTime() {
		return toTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToTime(double newToTime) {
		double oldToTime = toTime;
		toTime = newToTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_WINDOW__TO_TIME, oldToTime, toTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFromTimeText() {
		return fromTimeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromTimeText(String newFromTimeText) {
		String oldFromTimeText = fromTimeText;
		fromTimeText = newFromTimeText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_WINDOW__FROM_TIME_TEXT, oldFromTimeText, fromTimeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToTimeText() {
		return toTimeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToTimeText(String newToTimeText) {
		String oldToTimeText = toTimeText;
		toTimeText = newToTimeText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_WINDOW__TO_TIME_TEXT, oldToTimeText, toTimeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__TOTAL_OBJECTS:
				return getTotalObjects();
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__LINE_COUNT:
				return getLineCount();
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__PAYLOAD_VERSION:
				return getPayloadVersion();
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__FROM_TIME:
				return getFromTime();
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__TO_TIME:
				return getToTime();
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__FROM_TIME_TEXT:
				return getFromTimeText();
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__TO_TIME_TEXT:
				return getToTimeText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__TOTAL_OBJECTS:
				setTotalObjects((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__LINE_COUNT:
				setLineCount((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__PAYLOAD_VERSION:
				setPayloadVersion((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__FROM_TIME:
				setFromTime((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__TO_TIME:
				setToTime((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__FROM_TIME_TEXT:
				setFromTimeText((String)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__TO_TIME_TEXT:
				setToTimeText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__TOTAL_OBJECTS:
				setTotalObjects(TOTAL_OBJECTS_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__LINE_COUNT:
				setLineCount(LINE_COUNT_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__PAYLOAD_VERSION:
				setPayloadVersion(PAYLOAD_VERSION_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__FROM_TIME:
				setFromTime(FROM_TIME_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__TO_TIME:
				setToTime(TO_TIME_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__FROM_TIME_TEXT:
				setFromTimeText(FROM_TIME_TEXT_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__TO_TIME_TEXT:
				setToTimeText(TO_TIME_TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__TOTAL_OBJECTS:
				return totalObjects != TOTAL_OBJECTS_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__LINE_COUNT:
				return lineCount != LINE_COUNT_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__PAYLOAD_VERSION:
				return payloadVersion != PAYLOAD_VERSION_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__FROM_TIME:
				return fromTime != FROM_TIME_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__TO_TIME:
				return toTime != TO_TIME_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__FROM_TIME_TEXT:
				return FROM_TIME_TEXT_EDEFAULT == null ? fromTimeText != null : !FROM_TIME_TEXT_EDEFAULT.equals(fromTimeText);
			case ChirpstackPackage.IO_TRAFFIC_WINDOW__TO_TIME_TEXT:
				return TO_TIME_TEXT_EDEFAULT == null ? toTimeText != null : !TO_TIME_TEXT_EDEFAULT.equals(toTimeText);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (totalObjects: ");
		result.append(totalObjects);
		result.append(", lineCount: ");
		result.append(lineCount);
		result.append(", payloadVersion: ");
		result.append(payloadVersion);
		result.append(", fromTime: ");
		result.append(fromTime);
		result.append(", toTime: ");
		result.append(toTime);
		result.append(", fromTimeText: ");
		result.append(fromTimeText);
		result.append(", toTimeText: ");
		result.append(toTimeText);
		result.append(')');
		return result.toString();
	}

} //IoTrafficWindowImpl
