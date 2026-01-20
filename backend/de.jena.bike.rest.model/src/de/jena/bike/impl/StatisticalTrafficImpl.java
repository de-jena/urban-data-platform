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
import de.jena.bike.Direction;
import de.jena.bike.DirectionName;
import de.jena.bike.StatisticalTraffic;
import de.jena.bike.TravelModeLabel;
import de.jena.bike.Value;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistical Traffic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.impl.StatisticalTrafficImpl#getSiteId <em>Site Id</em>}</li>
 *   <li>{@link de.jena.bike.impl.StatisticalTrafficImpl#getDate <em>Date</em>}</li>
 *   <li>{@link de.jena.bike.impl.StatisticalTrafficImpl#getTravelMode <em>Travel Mode</em>}</li>
 *   <li>{@link de.jena.bike.impl.StatisticalTrafficImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.jena.bike.impl.StatisticalTrafficImpl#getDirectionName <em>Direction Name</em>}</li>
 *   <li>{@link de.jena.bike.impl.StatisticalTrafficImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatisticalTrafficImpl extends MinimalEObjectImpl.Container implements StatisticalTraffic {
	/**
	 * The default value of the '{@link #getSiteId() <em>Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SITE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteId() <em>Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger siteId = SITE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTravelMode() <em>Travel Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelMode()
	 * @generated
	 * @ordered
	 */
	protected TravelModeLabel travelMode;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction;

	/**
	 * The cached value of the '{@link #getDirectionName() <em>Direction Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionName()
	 * @generated
	 * @ordered
	 */
	protected DirectionName directionName;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatisticalTrafficImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.STATISTICAL_TRAFFIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSiteId() {
		return siteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteId(BigInteger newSiteId) {
		BigInteger oldSiteId = siteId;
		siteId = newSiteId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.STATISTICAL_TRAFFIC__SITE_ID, oldSiteId, siteId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.STATISTICAL_TRAFFIC__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TravelModeLabel getTravelMode() {
		return travelMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTravelMode(TravelModeLabel newTravelMode, NotificationChain msgs) {
		TravelModeLabel oldTravelMode = travelMode;
		travelMode = newTravelMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.STATISTICAL_TRAFFIC__TRAVEL_MODE, oldTravelMode, newTravelMode);
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
	public void setTravelMode(TravelModeLabel newTravelMode) {
		if (newTravelMode != travelMode) {
			NotificationChain msgs = null;
			if (travelMode != null)
				msgs = ((InternalEObject)travelMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.STATISTICAL_TRAFFIC__TRAVEL_MODE, null, msgs);
			if (newTravelMode != null)
				msgs = ((InternalEObject)newTravelMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.STATISTICAL_TRAFFIC__TRAVEL_MODE, null, msgs);
			msgs = basicSetTravelMode(newTravelMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.STATISTICAL_TRAFFIC__TRAVEL_MODE, newTravelMode, newTravelMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirection(Direction newDirection, NotificationChain msgs) {
		Direction oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.STATISTICAL_TRAFFIC__DIRECTION, oldDirection, newDirection);
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
	public void setDirection(Direction newDirection) {
		if (newDirection != direction) {
			NotificationChain msgs = null;
			if (direction != null)
				msgs = ((InternalEObject)direction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.STATISTICAL_TRAFFIC__DIRECTION, null, msgs);
			if (newDirection != null)
				msgs = ((InternalEObject)newDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.STATISTICAL_TRAFFIC__DIRECTION, null, msgs);
			msgs = basicSetDirection(newDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.STATISTICAL_TRAFFIC__DIRECTION, newDirection, newDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionName getDirectionName() {
		return directionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectionName(DirectionName newDirectionName, NotificationChain msgs) {
		DirectionName oldDirectionName = directionName;
		directionName = newDirectionName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.STATISTICAL_TRAFFIC__DIRECTION_NAME, oldDirectionName, newDirectionName);
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
	public void setDirectionName(DirectionName newDirectionName) {
		if (newDirectionName != directionName) {
			NotificationChain msgs = null;
			if (directionName != null)
				msgs = ((InternalEObject)directionName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.STATISTICAL_TRAFFIC__DIRECTION_NAME, null, msgs);
			if (newDirectionName != null)
				msgs = ((InternalEObject)newDirectionName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.STATISTICAL_TRAFFIC__DIRECTION_NAME, null, msgs);
			msgs = basicSetDirectionName(newDirectionName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.STATISTICAL_TRAFFIC__DIRECTION_NAME, newDirectionName, newDirectionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Value newValue, NotificationChain msgs) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.STATISTICAL_TRAFFIC__VALUE, oldValue, newValue);
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
	public void setValue(Value newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.STATISTICAL_TRAFFIC__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.STATISTICAL_TRAFFIC__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.STATISTICAL_TRAFFIC__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BikePackage.STATISTICAL_TRAFFIC__TRAVEL_MODE:
				return basicSetTravelMode(null, msgs);
			case BikePackage.STATISTICAL_TRAFFIC__DIRECTION:
				return basicSetDirection(null, msgs);
			case BikePackage.STATISTICAL_TRAFFIC__DIRECTION_NAME:
				return basicSetDirectionName(null, msgs);
			case BikePackage.STATISTICAL_TRAFFIC__VALUE:
				return basicSetValue(null, msgs);
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
			case BikePackage.STATISTICAL_TRAFFIC__SITE_ID:
				return getSiteId();
			case BikePackage.STATISTICAL_TRAFFIC__DATE:
				return getDate();
			case BikePackage.STATISTICAL_TRAFFIC__TRAVEL_MODE:
				return getTravelMode();
			case BikePackage.STATISTICAL_TRAFFIC__DIRECTION:
				return getDirection();
			case BikePackage.STATISTICAL_TRAFFIC__DIRECTION_NAME:
				return getDirectionName();
			case BikePackage.STATISTICAL_TRAFFIC__VALUE:
				return getValue();
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
			case BikePackage.STATISTICAL_TRAFFIC__SITE_ID:
				setSiteId((BigInteger)newValue);
				return;
			case BikePackage.STATISTICAL_TRAFFIC__DATE:
				setDate((String)newValue);
				return;
			case BikePackage.STATISTICAL_TRAFFIC__TRAVEL_MODE:
				setTravelMode((TravelModeLabel)newValue);
				return;
			case BikePackage.STATISTICAL_TRAFFIC__DIRECTION:
				setDirection((Direction)newValue);
				return;
			case BikePackage.STATISTICAL_TRAFFIC__DIRECTION_NAME:
				setDirectionName((DirectionName)newValue);
				return;
			case BikePackage.STATISTICAL_TRAFFIC__VALUE:
				setValue((Value)newValue);
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
			case BikePackage.STATISTICAL_TRAFFIC__SITE_ID:
				setSiteId(SITE_ID_EDEFAULT);
				return;
			case BikePackage.STATISTICAL_TRAFFIC__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case BikePackage.STATISTICAL_TRAFFIC__TRAVEL_MODE:
				setTravelMode((TravelModeLabel)null);
				return;
			case BikePackage.STATISTICAL_TRAFFIC__DIRECTION:
				setDirection((Direction)null);
				return;
			case BikePackage.STATISTICAL_TRAFFIC__DIRECTION_NAME:
				setDirectionName((DirectionName)null);
				return;
			case BikePackage.STATISTICAL_TRAFFIC__VALUE:
				setValue((Value)null);
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
			case BikePackage.STATISTICAL_TRAFFIC__SITE_ID:
				return SITE_ID_EDEFAULT == null ? siteId != null : !SITE_ID_EDEFAULT.equals(siteId);
			case BikePackage.STATISTICAL_TRAFFIC__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case BikePackage.STATISTICAL_TRAFFIC__TRAVEL_MODE:
				return travelMode != null;
			case BikePackage.STATISTICAL_TRAFFIC__DIRECTION:
				return direction != null;
			case BikePackage.STATISTICAL_TRAFFIC__DIRECTION_NAME:
				return directionName != null;
			case BikePackage.STATISTICAL_TRAFFIC__VALUE:
				return value != null;
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
		result.append(" (siteId: ");
		result.append(siteId);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //StatisticalTrafficImpl
