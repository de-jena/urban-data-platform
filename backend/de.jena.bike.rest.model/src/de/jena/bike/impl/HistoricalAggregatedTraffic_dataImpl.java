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
import de.jena.bike.HistoricalAggregatedTraffic_data;
import de.jena.bike.HistoricalAggregatedTraffic_data_timestamp;
import de.jena.bike.HistoricalAggregatedTraffic_data_traffic;
import de.jena.bike.HistoricalAggregatedTraffic_data_weather;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historical Aggregated Traffic data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.impl.HistoricalAggregatedTraffic_dataImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.bike.impl.HistoricalAggregatedTraffic_dataImpl#getTraffic <em>Traffic</em>}</li>
 *   <li>{@link de.jena.bike.impl.HistoricalAggregatedTraffic_dataImpl#getWeather <em>Weather</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoricalAggregatedTraffic_dataImpl extends MinimalEObjectImpl.Container implements HistoricalAggregatedTraffic_data {
	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected HistoricalAggregatedTraffic_data_timestamp timestamp;

	/**
	 * The cached value of the '{@link #getTraffic() <em>Traffic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraffic()
	 * @generated
	 * @ordered
	 */
	protected HistoricalAggregatedTraffic_data_traffic traffic;

	/**
	 * The cached value of the '{@link #getWeather() <em>Weather</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeather()
	 * @generated
	 * @ordered
	 */
	protected HistoricalAggregatedTraffic_data_weather weather;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoricalAggregatedTraffic_dataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.HISTORICAL_AGGREGATED_TRAFFIC_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalAggregatedTraffic_data_timestamp getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimestamp(HistoricalAggregatedTraffic_data_timestamp newTimestamp, NotificationChain msgs) {
		HistoricalAggregatedTraffic_data_timestamp oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TIMESTAMP, oldTimestamp, newTimestamp);
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
	public void setTimestamp(HistoricalAggregatedTraffic_data_timestamp newTimestamp) {
		if (newTimestamp != timestamp) {
			NotificationChain msgs = null;
			if (timestamp != null)
				msgs = ((InternalEObject)timestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TIMESTAMP, null, msgs);
			if (newTimestamp != null)
				msgs = ((InternalEObject)newTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TIMESTAMP, null, msgs);
			msgs = basicSetTimestamp(newTimestamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TIMESTAMP, newTimestamp, newTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalAggregatedTraffic_data_traffic getTraffic() {
		return traffic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraffic(HistoricalAggregatedTraffic_data_traffic newTraffic, NotificationChain msgs) {
		HistoricalAggregatedTraffic_data_traffic oldTraffic = traffic;
		traffic = newTraffic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TRAFFIC, oldTraffic, newTraffic);
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
	public void setTraffic(HistoricalAggregatedTraffic_data_traffic newTraffic) {
		if (newTraffic != traffic) {
			NotificationChain msgs = null;
			if (traffic != null)
				msgs = ((InternalEObject)traffic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TRAFFIC, null, msgs);
			if (newTraffic != null)
				msgs = ((InternalEObject)newTraffic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TRAFFIC, null, msgs);
			msgs = basicSetTraffic(newTraffic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TRAFFIC, newTraffic, newTraffic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalAggregatedTraffic_data_weather getWeather() {
		return weather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeather(HistoricalAggregatedTraffic_data_weather newWeather, NotificationChain msgs) {
		HistoricalAggregatedTraffic_data_weather oldWeather = weather;
		weather = newWeather;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__WEATHER, oldWeather, newWeather);
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
	public void setWeather(HistoricalAggregatedTraffic_data_weather newWeather) {
		if (newWeather != weather) {
			NotificationChain msgs = null;
			if (weather != null)
				msgs = ((InternalEObject)weather).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__WEATHER, null, msgs);
			if (newWeather != null)
				msgs = ((InternalEObject)newWeather).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__WEATHER, null, msgs);
			msgs = basicSetWeather(newWeather, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__WEATHER, newWeather, newWeather));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TIMESTAMP:
				return basicSetTimestamp(null, msgs);
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TRAFFIC:
				return basicSetTraffic(null, msgs);
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__WEATHER:
				return basicSetWeather(null, msgs);
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
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TIMESTAMP:
				return getTimestamp();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TRAFFIC:
				return getTraffic();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__WEATHER:
				return getWeather();
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
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TIMESTAMP:
				setTimestamp((HistoricalAggregatedTraffic_data_timestamp)newValue);
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TRAFFIC:
				setTraffic((HistoricalAggregatedTraffic_data_traffic)newValue);
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__WEATHER:
				setWeather((HistoricalAggregatedTraffic_data_weather)newValue);
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
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TIMESTAMP:
				setTimestamp((HistoricalAggregatedTraffic_data_timestamp)null);
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TRAFFIC:
				setTraffic((HistoricalAggregatedTraffic_data_traffic)null);
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__WEATHER:
				setWeather((HistoricalAggregatedTraffic_data_weather)null);
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
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TIMESTAMP:
				return timestamp != null;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__TRAFFIC:
				return traffic != null;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA__WEATHER:
				return weather != null;
		}
		return super.eIsSet(featureID);
	}

} //HistoricalAggregatedTraffic_dataImpl
