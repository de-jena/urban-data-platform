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
package de.jena.bike.impl;

import de.jena.bike.BikePackage;
import de.jena.bike.Count;
import de.jena.bike.DataStatus;
import de.jena.bike.DateTime;
import de.jena.bike.HistoricalRawTraffic_data;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historical Raw Traffic data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.impl.HistoricalRawTraffic_dataImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.bike.impl.HistoricalRawTraffic_dataImpl#getGranularity <em>Granularity</em>}</li>
 *   <li>{@link de.jena.bike.impl.HistoricalRawTraffic_dataImpl#getCounts <em>Counts</em>}</li>
 *   <li>{@link de.jena.bike.impl.HistoricalRawTraffic_dataImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoricalRawTraffic_dataImpl extends MinimalEObjectImpl.Container implements HistoricalRawTraffic_data {
	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected DateTime timestamp;

	/**
	 * The default value of the '{@link #getGranularity() <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGranularity()
	 * @generated
	 * @ordered
	 */
	protected static final String GRANULARITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGranularity() <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGranularity()
	 * @generated
	 * @ordered
	 */
	protected String granularity = GRANULARITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCounts() <em>Counts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounts()
	 * @generated
	 * @ordered
	 */
	protected Count counts;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected DataStatus status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoricalRawTraffic_dataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.HISTORICAL_RAW_TRAFFIC_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimestamp(DateTime newTimestamp, NotificationChain msgs) {
		DateTime oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__TIMESTAMP, oldTimestamp, newTimestamp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(DateTime newTimestamp) {
		if (newTimestamp != timestamp) {
			NotificationChain msgs = null;
			if (timestamp != null)
				msgs = ((InternalEObject)timestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__TIMESTAMP, null, msgs);
			if (newTimestamp != null)
				msgs = ((InternalEObject)newTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__TIMESTAMP, null, msgs);
			msgs = basicSetTimestamp(newTimestamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__TIMESTAMP, newTimestamp, newTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGranularity() {
		return granularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGranularity(String newGranularity) {
		String oldGranularity = granularity;
		granularity = newGranularity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__GRANULARITY, oldGranularity, granularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Count getCounts() {
		return counts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCounts(Count newCounts, NotificationChain msgs) {
		Count oldCounts = counts;
		counts = newCounts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__COUNTS, oldCounts, newCounts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounts(Count newCounts) {
		if (newCounts != counts) {
			NotificationChain msgs = null;
			if (counts != null)
				msgs = ((InternalEObject)counts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__COUNTS, null, msgs);
			if (newCounts != null)
				msgs = ((InternalEObject)newCounts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__COUNTS, null, msgs);
			msgs = basicSetCounts(newCounts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__COUNTS, newCounts, newCounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(DataStatus newStatus, NotificationChain msgs) {
		DataStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(DataStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__TIMESTAMP:
				return basicSetTimestamp(null, msgs);
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__COUNTS:
				return basicSetCounts(null, msgs);
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__STATUS:
				return basicSetStatus(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__TIMESTAMP:
				return getTimestamp();
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__GRANULARITY:
				return getGranularity();
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__COUNTS:
				return getCounts();
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__STATUS:
				return getStatus();
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
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__TIMESTAMP:
				setTimestamp((DateTime)newValue);
				return;
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__GRANULARITY:
				setGranularity((String)newValue);
				return;
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__COUNTS:
				setCounts((Count)newValue);
				return;
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__STATUS:
				setStatus((DataStatus)newValue);
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
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__TIMESTAMP:
				setTimestamp((DateTime)null);
				return;
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__GRANULARITY:
				setGranularity(GRANULARITY_EDEFAULT);
				return;
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__COUNTS:
				setCounts((Count)null);
				return;
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__STATUS:
				setStatus((DataStatus)null);
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
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__TIMESTAMP:
				return timestamp != null;
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__GRANULARITY:
				return GRANULARITY_EDEFAULT == null ? granularity != null : !GRANULARITY_EDEFAULT.equals(granularity);
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__COUNTS:
				return counts != null;
			case BikePackage.HISTORICAL_RAW_TRAFFIC_DATA__STATUS:
				return status != null;
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
		result.append(" (granularity: ");
		result.append(granularity);
		result.append(')');
		return result.toString();
	}

} //HistoricalRawTraffic_dataImpl
