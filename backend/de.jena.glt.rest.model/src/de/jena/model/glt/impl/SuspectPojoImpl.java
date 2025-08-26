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

import de.jena.model.glt.GltPackage;
import de.jena.model.glt.SuspectPojo;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suspect Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.SuspectPojoImpl#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SuspectPojoImpl#getAlarmId <em>Alarm Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SuspectPojoImpl#getState <em>State</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SuspectPojoImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SuspectPojoImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SuspectPojoImpl#getRecognized <em>Recognized</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SuspectPojoImpl#getBy <em>By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuspectPojoImpl extends MinimalEObjectImpl.Container implements SuspectPojo {
	/**
	 * The default value of the '{@link #getSystemId() <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemId()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemId() <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemId()
	 * @generated
	 * @ordered
	 */
	protected String systemId = SYSTEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlarmId() <em>Alarm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmId()
	 * @generated
	 * @ordered
	 */
	protected static final String ALARM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlarmId() <em>Alarm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmId()
	 * @generated
	 * @ordered
	 */
	protected String alarmId = ALARM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected BigInteger timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Integer severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecognized() <em>Recognized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecognized()
	 * @generated
	 * @ordered
	 */
	protected static final String RECOGNIZED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecognized() <em>Recognized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecognized()
	 * @generated
	 * @ordered
	 */
	protected String recognized = RECOGNIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBy() <em>By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBy()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBy() <em>By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBy()
	 * @generated
	 * @ordered
	 */
	protected String by = BY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuspectPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getSuspectPojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemId() {
		return systemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemId(String newSystemId) {
		String oldSystemId = systemId;
		systemId = newSystemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SUSPECT_POJO__SYSTEM_ID, oldSystemId, systemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlarmId() {
		return alarmId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlarmId(String newAlarmId) {
		String oldAlarmId = alarmId;
		alarmId = newAlarmId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SUSPECT_POJO__ALARM_ID, oldAlarmId, alarmId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SUSPECT_POJO__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(BigInteger newTimestamp) {
		BigInteger oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SUSPECT_POJO__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(Integer newSeverity) {
		Integer oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SUSPECT_POJO__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecognized() {
		return recognized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecognized(String newRecognized) {
		String oldRecognized = recognized;
		recognized = newRecognized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SUSPECT_POJO__RECOGNIZED, oldRecognized, recognized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBy() {
		return by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBy(String newBy) {
		String oldBy = by;
		by = newBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SUSPECT_POJO__BY, oldBy, by));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.SUSPECT_POJO__SYSTEM_ID:
				return getSystemId();
			case GltPackage.SUSPECT_POJO__ALARM_ID:
				return getAlarmId();
			case GltPackage.SUSPECT_POJO__STATE:
				return getState();
			case GltPackage.SUSPECT_POJO__TIMESTAMP:
				return getTimestamp();
			case GltPackage.SUSPECT_POJO__SEVERITY:
				return getSeverity();
			case GltPackage.SUSPECT_POJO__RECOGNIZED:
				return getRecognized();
			case GltPackage.SUSPECT_POJO__BY:
				return getBy();
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
			case GltPackage.SUSPECT_POJO__SYSTEM_ID:
				setSystemId((String)newValue);
				return;
			case GltPackage.SUSPECT_POJO__ALARM_ID:
				setAlarmId((String)newValue);
				return;
			case GltPackage.SUSPECT_POJO__STATE:
				setState((String)newValue);
				return;
			case GltPackage.SUSPECT_POJO__TIMESTAMP:
				setTimestamp((BigInteger)newValue);
				return;
			case GltPackage.SUSPECT_POJO__SEVERITY:
				setSeverity((Integer)newValue);
				return;
			case GltPackage.SUSPECT_POJO__RECOGNIZED:
				setRecognized((String)newValue);
				return;
			case GltPackage.SUSPECT_POJO__BY:
				setBy((String)newValue);
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
			case GltPackage.SUSPECT_POJO__SYSTEM_ID:
				setSystemId(SYSTEM_ID_EDEFAULT);
				return;
			case GltPackage.SUSPECT_POJO__ALARM_ID:
				setAlarmId(ALARM_ID_EDEFAULT);
				return;
			case GltPackage.SUSPECT_POJO__STATE:
				setState(STATE_EDEFAULT);
				return;
			case GltPackage.SUSPECT_POJO__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case GltPackage.SUSPECT_POJO__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case GltPackage.SUSPECT_POJO__RECOGNIZED:
				setRecognized(RECOGNIZED_EDEFAULT);
				return;
			case GltPackage.SUSPECT_POJO__BY:
				setBy(BY_EDEFAULT);
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
			case GltPackage.SUSPECT_POJO__SYSTEM_ID:
				return SYSTEM_ID_EDEFAULT == null ? systemId != null : !SYSTEM_ID_EDEFAULT.equals(systemId);
			case GltPackage.SUSPECT_POJO__ALARM_ID:
				return ALARM_ID_EDEFAULT == null ? alarmId != null : !ALARM_ID_EDEFAULT.equals(alarmId);
			case GltPackage.SUSPECT_POJO__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case GltPackage.SUSPECT_POJO__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case GltPackage.SUSPECT_POJO__SEVERITY:
				return SEVERITY_EDEFAULT == null ? severity != null : !SEVERITY_EDEFAULT.equals(severity);
			case GltPackage.SUSPECT_POJO__RECOGNIZED:
				return RECOGNIZED_EDEFAULT == null ? recognized != null : !RECOGNIZED_EDEFAULT.equals(recognized);
			case GltPackage.SUSPECT_POJO__BY:
				return BY_EDEFAULT == null ? by != null : !BY_EDEFAULT.equals(by);
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
		result.append(" (systemId: ");
		result.append(systemId);
		result.append(", alarmId: ");
		result.append(alarmId);
		result.append(", state: ");
		result.append(state);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", severity: ");
		result.append(severity);
		result.append(", recognized: ");
		result.append(recognized);
		result.append(", by: ");
		result.append(by);
		result.append(')');
		return result.toString();
	}

} //SuspectPojoImpl
