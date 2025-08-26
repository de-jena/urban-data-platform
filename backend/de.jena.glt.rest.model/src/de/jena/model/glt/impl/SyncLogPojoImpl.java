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
import de.jena.model.glt.SyncLogPojo;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sync Log Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.SyncLogPojoImpl#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SyncLogPojoImpl#getState <em>State</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SyncLogPojoImpl#getLatestRingbufferTimestamp <em>Latest Ringbuffer Timestamp</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SyncLogPojoImpl#getLastAccessTimeMs <em>Last Access Time Ms</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SyncLogPojoImpl#getAverageAccessTimeMs <em>Average Access Time Ms</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SyncLogPojoImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SyncLogPojoImpl#getStateSince <em>State Since</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SyncLogPojoImpl extends MinimalEObjectImpl.Container implements SyncLogPojo {
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
	 * The default value of the '{@link #getLatestRingbufferTimestamp() <em>Latest Ringbuffer Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestRingbufferTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LATEST_RINGBUFFER_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatestRingbufferTimestamp() <em>Latest Ringbuffer Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestRingbufferTimestamp()
	 * @generated
	 * @ordered
	 */
	protected BigInteger latestRingbufferTimestamp = LATEST_RINGBUFFER_TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastAccessTimeMs() <em>Last Access Time Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAccessTimeMs()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LAST_ACCESS_TIME_MS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastAccessTimeMs() <em>Last Access Time Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAccessTimeMs()
	 * @generated
	 * @ordered
	 */
	protected BigInteger lastAccessTimeMs = LAST_ACCESS_TIME_MS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageAccessTimeMs() <em>Average Access Time Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageAccessTimeMs()
	 * @generated
	 * @ordered
	 */
	protected static final Double AVERAGE_ACCESS_TIME_MS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageAccessTimeMs() <em>Average Access Time Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageAccessTimeMs()
	 * @generated
	 * @ordered
	 */
	protected Double averageAccessTimeMs = AVERAGE_ACCESS_TIME_MS_EDEFAULT;

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
	 * The default value of the '{@link #getStateSince() <em>State Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateSince()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STATE_SINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateSince() <em>State Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateSince()
	 * @generated
	 * @ordered
	 */
	protected BigInteger stateSince = STATE_SINCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyncLogPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getSyncLogPojo();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYNC_LOG_POJO__SYSTEM_ID, oldSystemId, systemId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYNC_LOG_POJO__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getLatestRingbufferTimestamp() {
		return latestRingbufferTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatestRingbufferTimestamp(BigInteger newLatestRingbufferTimestamp) {
		BigInteger oldLatestRingbufferTimestamp = latestRingbufferTimestamp;
		latestRingbufferTimestamp = newLatestRingbufferTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYNC_LOG_POJO__LATEST_RINGBUFFER_TIMESTAMP, oldLatestRingbufferTimestamp, latestRingbufferTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getLastAccessTimeMs() {
		return lastAccessTimeMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastAccessTimeMs(BigInteger newLastAccessTimeMs) {
		BigInteger oldLastAccessTimeMs = lastAccessTimeMs;
		lastAccessTimeMs = newLastAccessTimeMs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYNC_LOG_POJO__LAST_ACCESS_TIME_MS, oldLastAccessTimeMs, lastAccessTimeMs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getAverageAccessTimeMs() {
		return averageAccessTimeMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageAccessTimeMs(Double newAverageAccessTimeMs) {
		Double oldAverageAccessTimeMs = averageAccessTimeMs;
		averageAccessTimeMs = newAverageAccessTimeMs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYNC_LOG_POJO__AVERAGE_ACCESS_TIME_MS, oldAverageAccessTimeMs, averageAccessTimeMs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYNC_LOG_POJO__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getStateSince() {
		return stateSince;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateSince(BigInteger newStateSince) {
		BigInteger oldStateSince = stateSince;
		stateSince = newStateSince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYNC_LOG_POJO__STATE_SINCE, oldStateSince, stateSince));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.SYNC_LOG_POJO__SYSTEM_ID:
				return getSystemId();
			case GltPackage.SYNC_LOG_POJO__STATE:
				return getState();
			case GltPackage.SYNC_LOG_POJO__LATEST_RINGBUFFER_TIMESTAMP:
				return getLatestRingbufferTimestamp();
			case GltPackage.SYNC_LOG_POJO__LAST_ACCESS_TIME_MS:
				return getLastAccessTimeMs();
			case GltPackage.SYNC_LOG_POJO__AVERAGE_ACCESS_TIME_MS:
				return getAverageAccessTimeMs();
			case GltPackage.SYNC_LOG_POJO__TIMESTAMP:
				return getTimestamp();
			case GltPackage.SYNC_LOG_POJO__STATE_SINCE:
				return getStateSince();
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
			case GltPackage.SYNC_LOG_POJO__SYSTEM_ID:
				setSystemId((String)newValue);
				return;
			case GltPackage.SYNC_LOG_POJO__STATE:
				setState((String)newValue);
				return;
			case GltPackage.SYNC_LOG_POJO__LATEST_RINGBUFFER_TIMESTAMP:
				setLatestRingbufferTimestamp((BigInteger)newValue);
				return;
			case GltPackage.SYNC_LOG_POJO__LAST_ACCESS_TIME_MS:
				setLastAccessTimeMs((BigInteger)newValue);
				return;
			case GltPackage.SYNC_LOG_POJO__AVERAGE_ACCESS_TIME_MS:
				setAverageAccessTimeMs((Double)newValue);
				return;
			case GltPackage.SYNC_LOG_POJO__TIMESTAMP:
				setTimestamp((BigInteger)newValue);
				return;
			case GltPackage.SYNC_LOG_POJO__STATE_SINCE:
				setStateSince((BigInteger)newValue);
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
			case GltPackage.SYNC_LOG_POJO__SYSTEM_ID:
				setSystemId(SYSTEM_ID_EDEFAULT);
				return;
			case GltPackage.SYNC_LOG_POJO__STATE:
				setState(STATE_EDEFAULT);
				return;
			case GltPackage.SYNC_LOG_POJO__LATEST_RINGBUFFER_TIMESTAMP:
				setLatestRingbufferTimestamp(LATEST_RINGBUFFER_TIMESTAMP_EDEFAULT);
				return;
			case GltPackage.SYNC_LOG_POJO__LAST_ACCESS_TIME_MS:
				setLastAccessTimeMs(LAST_ACCESS_TIME_MS_EDEFAULT);
				return;
			case GltPackage.SYNC_LOG_POJO__AVERAGE_ACCESS_TIME_MS:
				setAverageAccessTimeMs(AVERAGE_ACCESS_TIME_MS_EDEFAULT);
				return;
			case GltPackage.SYNC_LOG_POJO__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case GltPackage.SYNC_LOG_POJO__STATE_SINCE:
				setStateSince(STATE_SINCE_EDEFAULT);
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
			case GltPackage.SYNC_LOG_POJO__SYSTEM_ID:
				return SYSTEM_ID_EDEFAULT == null ? systemId != null : !SYSTEM_ID_EDEFAULT.equals(systemId);
			case GltPackage.SYNC_LOG_POJO__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case GltPackage.SYNC_LOG_POJO__LATEST_RINGBUFFER_TIMESTAMP:
				return LATEST_RINGBUFFER_TIMESTAMP_EDEFAULT == null ? latestRingbufferTimestamp != null : !LATEST_RINGBUFFER_TIMESTAMP_EDEFAULT.equals(latestRingbufferTimestamp);
			case GltPackage.SYNC_LOG_POJO__LAST_ACCESS_TIME_MS:
				return LAST_ACCESS_TIME_MS_EDEFAULT == null ? lastAccessTimeMs != null : !LAST_ACCESS_TIME_MS_EDEFAULT.equals(lastAccessTimeMs);
			case GltPackage.SYNC_LOG_POJO__AVERAGE_ACCESS_TIME_MS:
				return AVERAGE_ACCESS_TIME_MS_EDEFAULT == null ? averageAccessTimeMs != null : !AVERAGE_ACCESS_TIME_MS_EDEFAULT.equals(averageAccessTimeMs);
			case GltPackage.SYNC_LOG_POJO__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case GltPackage.SYNC_LOG_POJO__STATE_SINCE:
				return STATE_SINCE_EDEFAULT == null ? stateSince != null : !STATE_SINCE_EDEFAULT.equals(stateSince);
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
		result.append(", state: ");
		result.append(state);
		result.append(", latestRingbufferTimestamp: ");
		result.append(latestRingbufferTimestamp);
		result.append(", lastAccessTimeMs: ");
		result.append(lastAccessTimeMs);
		result.append(", averageAccessTimeMs: ");
		result.append(averageAccessTimeMs);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", stateSince: ");
		result.append(stateSince);
		result.append(')');
		return result.toString();
	}

} //SyncLogPojoImpl
