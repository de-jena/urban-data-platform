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
import de.jena.bike.HistoricalAggregatedTraffic_data_traffic;
import de.jena.bike.HistoricalAggregatedTraffic_data_traffic_counts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historical Aggregated Traffic data traffic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.impl.HistoricalAggregatedTraffic_data_trafficImpl#getCounts <em>Counts</em>}</li>
 *   <li>{@link de.jena.bike.impl.HistoricalAggregatedTraffic_data_trafficImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoricalAggregatedTraffic_data_trafficImpl extends MinimalEObjectImpl.Container implements HistoricalAggregatedTraffic_data_traffic {
	/**
	 * The cached value of the '{@link #getCounts() <em>Counts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounts()
	 * @generated
	 * @ordered
	 */
	protected HistoricalAggregatedTraffic_data_traffic_counts counts;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Object STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Object status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoricalAggregatedTraffic_data_trafficImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalAggregatedTraffic_data_traffic_counts getCounts() {
		return counts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCounts(HistoricalAggregatedTraffic_data_traffic_counts newCounts, NotificationChain msgs) {
		HistoricalAggregatedTraffic_data_traffic_counts oldCounts = counts;
		counts = newCounts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__COUNTS, oldCounts, newCounts);
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
	public void setCounts(HistoricalAggregatedTraffic_data_traffic_counts newCounts) {
		if (newCounts != counts) {
			NotificationChain msgs = null;
			if (counts != null)
				msgs = ((InternalEObject)counts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__COUNTS, null, msgs);
			if (newCounts != null)
				msgs = ((InternalEObject)newCounts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__COUNTS, null, msgs);
			msgs = basicSetCounts(newCounts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__COUNTS, newCounts, newCounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Object newStatus) {
		Object oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__COUNTS:
				return basicSetCounts(null, msgs);
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
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__COUNTS:
				return getCounts();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__STATUS:
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
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__COUNTS:
				setCounts((HistoricalAggregatedTraffic_data_traffic_counts)newValue);
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__STATUS:
				setStatus(newValue);
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
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__COUNTS:
				setCounts((HistoricalAggregatedTraffic_data_traffic_counts)null);
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__COUNTS:
				return counts != null;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_TRAFFIC__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //HistoricalAggregatedTraffic_data_trafficImpl
