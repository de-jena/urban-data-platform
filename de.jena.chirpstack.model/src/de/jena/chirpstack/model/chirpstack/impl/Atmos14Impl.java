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

import de.jena.chirpstack.model.chirpstack.Atmos14;
import de.jena.chirpstack.model.chirpstack.AtmosStatus;
import de.jena.chirpstack.model.chirpstack.Atmosphere;
import de.jena.chirpstack.model.chirpstack.ChirpstackPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atmos14</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.Atmos14Impl#getAtmosphere <em>Atmosphere</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.Atmos14Impl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Atmos14Impl extends ProviderImpl implements Atmos14 {
	/**
	 * The cached value of the '{@link #getAtmosphere() <em>Atmosphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtmosphere()
	 * @generated
	 * @ordered
	 */
	protected Atmosphere atmosphere;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected AtmosStatus status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Atmos14Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.ATMOS14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Atmosphere getAtmosphere() {
		return atmosphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtmosphere(Atmosphere newAtmosphere, NotificationChain msgs) {
		Atmosphere oldAtmosphere = atmosphere;
		atmosphere = newAtmosphere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.ATMOS14__ATMOSPHERE, oldAtmosphere, newAtmosphere);
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
	public void setAtmosphere(Atmosphere newAtmosphere) {
		if (newAtmosphere != atmosphere) {
			NotificationChain msgs = null;
			if (atmosphere != null)
				msgs = ((InternalEObject)atmosphere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.ATMOS14__ATMOSPHERE, null, msgs);
			if (newAtmosphere != null)
				msgs = ((InternalEObject)newAtmosphere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.ATMOS14__ATMOSPHERE, null, msgs);
			msgs = basicSetAtmosphere(newAtmosphere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.ATMOS14__ATMOSPHERE, newAtmosphere, newAtmosphere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtmosStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(AtmosStatus newStatus, NotificationChain msgs) {
		AtmosStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.ATMOS14__STATUS, oldStatus, newStatus);
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
	public void setStatus(AtmosStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.ATMOS14__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.ATMOS14__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.ATMOS14__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChirpstackPackage.ATMOS14__ATMOSPHERE:
				return basicSetAtmosphere(null, msgs);
			case ChirpstackPackage.ATMOS14__STATUS:
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
			case ChirpstackPackage.ATMOS14__ATMOSPHERE:
				return getAtmosphere();
			case ChirpstackPackage.ATMOS14__STATUS:
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
			case ChirpstackPackage.ATMOS14__ATMOSPHERE:
				setAtmosphere((Atmosphere)newValue);
				return;
			case ChirpstackPackage.ATMOS14__STATUS:
				setStatus((AtmosStatus)newValue);
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
			case ChirpstackPackage.ATMOS14__ATMOSPHERE:
				setAtmosphere((Atmosphere)null);
				return;
			case ChirpstackPackage.ATMOS14__STATUS:
				setStatus((AtmosStatus)null);
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
			case ChirpstackPackage.ATMOS14__ATMOSPHERE:
				return atmosphere != null;
			case ChirpstackPackage.ATMOS14__STATUS:
				return status != null;
		}
		return super.eIsSet(featureID);
	}

} //Atmos14Impl
