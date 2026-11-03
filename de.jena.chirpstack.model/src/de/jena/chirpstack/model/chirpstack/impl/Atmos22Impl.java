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

import de.jena.chirpstack.model.chirpstack.Atmos22;
import de.jena.chirpstack.model.chirpstack.Atmos22Status;
import de.jena.chirpstack.model.chirpstack.ChirpstackPackage;
import de.jena.chirpstack.model.chirpstack.Wind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atmos22</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.Atmos22Impl#getWind <em>Wind</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.Atmos22Impl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Atmos22Impl extends ProviderImpl implements Atmos22 {
	/**
	 * The cached value of the '{@link #getWind() <em>Wind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWind()
	 * @generated
	 * @ordered
	 */
	protected Wind wind;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Atmos22Status status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Atmos22Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.ATMOS22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wind getWind() {
		return wind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWind(Wind newWind, NotificationChain msgs) {
		Wind oldWind = wind;
		wind = newWind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.ATMOS22__WIND, oldWind, newWind);
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
	public void setWind(Wind newWind) {
		if (newWind != wind) {
			NotificationChain msgs = null;
			if (wind != null)
				msgs = ((InternalEObject)wind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.ATMOS22__WIND, null, msgs);
			if (newWind != null)
				msgs = ((InternalEObject)newWind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.ATMOS22__WIND, null, msgs);
			msgs = basicSetWind(newWind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.ATMOS22__WIND, newWind, newWind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Atmos22Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Atmos22Status newStatus, NotificationChain msgs) {
		Atmos22Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.ATMOS22__STATUS, oldStatus, newStatus);
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
	public void setStatus(Atmos22Status newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.ATMOS22__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.ATMOS22__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.ATMOS22__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChirpstackPackage.ATMOS22__WIND:
				return basicSetWind(null, msgs);
			case ChirpstackPackage.ATMOS22__STATUS:
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
			case ChirpstackPackage.ATMOS22__WIND:
				return getWind();
			case ChirpstackPackage.ATMOS22__STATUS:
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
			case ChirpstackPackage.ATMOS22__WIND:
				setWind((Wind)newValue);
				return;
			case ChirpstackPackage.ATMOS22__STATUS:
				setStatus((Atmos22Status)newValue);
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
			case ChirpstackPackage.ATMOS22__WIND:
				setWind((Wind)null);
				return;
			case ChirpstackPackage.ATMOS22__STATUS:
				setStatus((Atmos22Status)null);
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
			case ChirpstackPackage.ATMOS22__WIND:
				return wind != null;
			case ChirpstackPackage.ATMOS22__STATUS:
				return status != null;
		}
		return super.eIsSet(featureID);
	}

} //Atmos22Impl
