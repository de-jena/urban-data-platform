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
import de.jena.chirpstack.model.chirpstack.Kalyx;
import de.jena.chirpstack.model.chirpstack.KalyxRain;
import de.jena.chirpstack.model.chirpstack.KalyxStatus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kalyx</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.KalyxImpl#getRain <em>Rain</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.KalyxImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KalyxImpl extends ProviderImpl implements Kalyx {
	/**
	 * The cached value of the '{@link #getRain() <em>Rain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRain()
	 * @generated
	 * @ordered
	 */
	protected KalyxRain rain;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected KalyxStatus status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KalyxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.KALYX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KalyxRain getRain() {
		return rain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRain(KalyxRain newRain, NotificationChain msgs) {
		KalyxRain oldRain = rain;
		rain = newRain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.KALYX__RAIN, oldRain, newRain);
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
	public void setRain(KalyxRain newRain) {
		if (newRain != rain) {
			NotificationChain msgs = null;
			if (rain != null)
				msgs = ((InternalEObject)rain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.KALYX__RAIN, null, msgs);
			if (newRain != null)
				msgs = ((InternalEObject)newRain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.KALYX__RAIN, null, msgs);
			msgs = basicSetRain(newRain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.KALYX__RAIN, newRain, newRain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KalyxStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(KalyxStatus newStatus, NotificationChain msgs) {
		KalyxStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.KALYX__STATUS, oldStatus, newStatus);
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
	public void setStatus(KalyxStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.KALYX__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.KALYX__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.KALYX__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChirpstackPackage.KALYX__RAIN:
				return basicSetRain(null, msgs);
			case ChirpstackPackage.KALYX__STATUS:
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
			case ChirpstackPackage.KALYX__RAIN:
				return getRain();
			case ChirpstackPackage.KALYX__STATUS:
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
			case ChirpstackPackage.KALYX__RAIN:
				setRain((KalyxRain)newValue);
				return;
			case ChirpstackPackage.KALYX__STATUS:
				setStatus((KalyxStatus)newValue);
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
			case ChirpstackPackage.KALYX__RAIN:
				setRain((KalyxRain)null);
				return;
			case ChirpstackPackage.KALYX__STATUS:
				setStatus((KalyxStatus)null);
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
			case ChirpstackPackage.KALYX__RAIN:
				return rain != null;
			case ChirpstackPackage.KALYX__STATUS:
				return status != null;
		}
		return super.eIsSet(featureID);
	}

} //KalyxImpl
