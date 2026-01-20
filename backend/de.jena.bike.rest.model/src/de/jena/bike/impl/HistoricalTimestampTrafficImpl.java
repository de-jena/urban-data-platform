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
import de.jena.bike.DateTime;
import de.jena.bike.HistoricalTimestampTraffic;
import de.jena.bike.Lane;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historical Timestamp Traffic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.impl.HistoricalTimestampTrafficImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.bike.impl.HistoricalTimestampTrafficImpl#getLane <em>Lane</em>}</li>
 *   <li>{@link de.jena.bike.impl.HistoricalTimestampTrafficImpl#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoricalTimestampTrafficImpl extends BaseSerieImpl implements HistoricalTimestampTraffic {
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
	 * The cached value of the '{@link #getLane() <em>Lane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLane()
	 * @generated
	 * @ordered
	 */
	protected Lane lane;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger speed = SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoricalTimestampTrafficImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.HISTORICAL_TIMESTAMP_TRAFFIC;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__TIMESTAMP, oldTimestamp, newTimestamp);
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
				msgs = ((InternalEObject)timestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__TIMESTAMP, null, msgs);
			if (newTimestamp != null)
				msgs = ((InternalEObject)newTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__TIMESTAMP, null, msgs);
			msgs = basicSetTimestamp(newTimestamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__TIMESTAMP, newTimestamp, newTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lane getLane() {
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLane(Lane newLane, NotificationChain msgs) {
		Lane oldLane = lane;
		lane = newLane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__LANE, oldLane, newLane);
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
	public void setLane(Lane newLane) {
		if (newLane != lane) {
			NotificationChain msgs = null;
			if (lane != null)
				msgs = ((InternalEObject)lane).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__LANE, null, msgs);
			if (newLane != null)
				msgs = ((InternalEObject)newLane).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__LANE, null, msgs);
			msgs = basicSetLane(newLane, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__LANE, newLane, newLane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeed(BigInteger newSpeed) {
		BigInteger oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__TIMESTAMP:
				return basicSetTimestamp(null, msgs);
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__LANE:
				return basicSetLane(null, msgs);
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
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__TIMESTAMP:
				return getTimestamp();
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__LANE:
				return getLane();
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__SPEED:
				return getSpeed();
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
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__TIMESTAMP:
				setTimestamp((DateTime)newValue);
				return;
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__LANE:
				setLane((Lane)newValue);
				return;
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__SPEED:
				setSpeed((BigInteger)newValue);
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
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__TIMESTAMP:
				setTimestamp((DateTime)null);
				return;
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__LANE:
				setLane((Lane)null);
				return;
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__SPEED:
				setSpeed(SPEED_EDEFAULT);
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
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__TIMESTAMP:
				return timestamp != null;
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__LANE:
				return lane != null;
			case BikePackage.HISTORICAL_TIMESTAMP_TRAFFIC__SPEED:
				return SPEED_EDEFAULT == null ? speed != null : !SPEED_EDEFAULT.equals(speed);
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
		result.append(" (speed: ");
		result.append(speed);
		result.append(')');
		return result.toString();
	}

} //HistoricalTimestampTrafficImpl
