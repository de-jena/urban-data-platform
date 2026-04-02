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

import de.jena.bike.BaseSerie;
import de.jena.bike.BaseSerie_direction;
import de.jena.bike.BaseSerie_travelMode;
import de.jena.bike.BikePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Serie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.impl.BaseSerieImpl#getTravelMode <em>Travel Mode</em>}</li>
 *   <li>{@link de.jena.bike.impl.BaseSerieImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseSerieImpl extends MinimalEObjectImpl.Container implements BaseSerie {
	/**
	 * The cached value of the '{@link #getTravelMode() <em>Travel Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelMode()
	 * @generated
	 * @ordered
	 */
	protected BaseSerie_travelMode travelMode;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected BaseSerie_direction direction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseSerieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.BASE_SERIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseSerie_travelMode getTravelMode() {
		return travelMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTravelMode(BaseSerie_travelMode newTravelMode, NotificationChain msgs) {
		BaseSerie_travelMode oldTravelMode = travelMode;
		travelMode = newTravelMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.BASE_SERIE__TRAVEL_MODE, oldTravelMode, newTravelMode);
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
	public void setTravelMode(BaseSerie_travelMode newTravelMode) {
		if (newTravelMode != travelMode) {
			NotificationChain msgs = null;
			if (travelMode != null)
				msgs = ((InternalEObject)travelMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.BASE_SERIE__TRAVEL_MODE, null, msgs);
			if (newTravelMode != null)
				msgs = ((InternalEObject)newTravelMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.BASE_SERIE__TRAVEL_MODE, null, msgs);
			msgs = basicSetTravelMode(newTravelMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.BASE_SERIE__TRAVEL_MODE, newTravelMode, newTravelMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseSerie_direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirection(BaseSerie_direction newDirection, NotificationChain msgs) {
		BaseSerie_direction oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.BASE_SERIE__DIRECTION, oldDirection, newDirection);
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
	public void setDirection(BaseSerie_direction newDirection) {
		if (newDirection != direction) {
			NotificationChain msgs = null;
			if (direction != null)
				msgs = ((InternalEObject)direction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.BASE_SERIE__DIRECTION, null, msgs);
			if (newDirection != null)
				msgs = ((InternalEObject)newDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.BASE_SERIE__DIRECTION, null, msgs);
			msgs = basicSetDirection(newDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.BASE_SERIE__DIRECTION, newDirection, newDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BikePackage.BASE_SERIE__TRAVEL_MODE:
				return basicSetTravelMode(null, msgs);
			case BikePackage.BASE_SERIE__DIRECTION:
				return basicSetDirection(null, msgs);
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
			case BikePackage.BASE_SERIE__TRAVEL_MODE:
				return getTravelMode();
			case BikePackage.BASE_SERIE__DIRECTION:
				return getDirection();
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
			case BikePackage.BASE_SERIE__TRAVEL_MODE:
				setTravelMode((BaseSerie_travelMode)newValue);
				return;
			case BikePackage.BASE_SERIE__DIRECTION:
				setDirection((BaseSerie_direction)newValue);
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
			case BikePackage.BASE_SERIE__TRAVEL_MODE:
				setTravelMode((BaseSerie_travelMode)null);
				return;
			case BikePackage.BASE_SERIE__DIRECTION:
				setDirection((BaseSerie_direction)null);
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
			case BikePackage.BASE_SERIE__TRAVEL_MODE:
				return travelMode != null;
			case BikePackage.BASE_SERIE__DIRECTION:
				return direction != null;
		}
		return super.eIsSet(featureID);
	}

} //BaseSerieImpl
