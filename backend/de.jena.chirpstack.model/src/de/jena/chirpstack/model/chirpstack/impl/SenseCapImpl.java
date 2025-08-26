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

import de.jena.chirpstack.model.chirpstack.Air;
import de.jena.chirpstack.model.chirpstack.ChirpstackPackage;
import de.jena.chirpstack.model.chirpstack.Light;
import de.jena.chirpstack.model.chirpstack.Rain;
import de.jena.chirpstack.model.chirpstack.SenseCap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sense Cap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.SenseCapImpl#getAir <em>Air</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.SenseCapImpl#getRain <em>Rain</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.SenseCapImpl#getLight <em>Light</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SenseCapImpl extends ProviderImpl implements SenseCap {
	/**
	 * The cached value of the '{@link #getAir() <em>Air</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAir()
	 * @generated
	 * @ordered
	 */
	protected Air air;

	/**
	 * The cached value of the '{@link #getRain() <em>Rain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRain()
	 * @generated
	 * @ordered
	 */
	protected Rain rain;

	/**
	 * The cached value of the '{@link #getLight() <em>Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected Light light;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenseCapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.SENSE_CAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Air getAir() {
		return air;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAir(Air newAir, NotificationChain msgs) {
		Air oldAir = air;
		air = newAir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.SENSE_CAP__AIR, oldAir, newAir);
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
	public void setAir(Air newAir) {
		if (newAir != air) {
			NotificationChain msgs = null;
			if (air != null)
				msgs = ((InternalEObject)air).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.SENSE_CAP__AIR, null, msgs);
			if (newAir != null)
				msgs = ((InternalEObject)newAir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.SENSE_CAP__AIR, null, msgs);
			msgs = basicSetAir(newAir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.SENSE_CAP__AIR, newAir, newAir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rain getRain() {
		return rain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRain(Rain newRain, NotificationChain msgs) {
		Rain oldRain = rain;
		rain = newRain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.SENSE_CAP__RAIN, oldRain, newRain);
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
	public void setRain(Rain newRain) {
		if (newRain != rain) {
			NotificationChain msgs = null;
			if (rain != null)
				msgs = ((InternalEObject)rain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.SENSE_CAP__RAIN, null, msgs);
			if (newRain != null)
				msgs = ((InternalEObject)newRain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.SENSE_CAP__RAIN, null, msgs);
			msgs = basicSetRain(newRain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.SENSE_CAP__RAIN, newRain, newRain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Light getLight() {
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLight(Light newLight, NotificationChain msgs) {
		Light oldLight = light;
		light = newLight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.SENSE_CAP__LIGHT, oldLight, newLight);
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
	public void setLight(Light newLight) {
		if (newLight != light) {
			NotificationChain msgs = null;
			if (light != null)
				msgs = ((InternalEObject)light).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.SENSE_CAP__LIGHT, null, msgs);
			if (newLight != null)
				msgs = ((InternalEObject)newLight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.SENSE_CAP__LIGHT, null, msgs);
			msgs = basicSetLight(newLight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.SENSE_CAP__LIGHT, newLight, newLight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChirpstackPackage.SENSE_CAP__AIR:
				return basicSetAir(null, msgs);
			case ChirpstackPackage.SENSE_CAP__RAIN:
				return basicSetRain(null, msgs);
			case ChirpstackPackage.SENSE_CAP__LIGHT:
				return basicSetLight(null, msgs);
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
			case ChirpstackPackage.SENSE_CAP__AIR:
				return getAir();
			case ChirpstackPackage.SENSE_CAP__RAIN:
				return getRain();
			case ChirpstackPackage.SENSE_CAP__LIGHT:
				return getLight();
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
			case ChirpstackPackage.SENSE_CAP__AIR:
				setAir((Air)newValue);
				return;
			case ChirpstackPackage.SENSE_CAP__RAIN:
				setRain((Rain)newValue);
				return;
			case ChirpstackPackage.SENSE_CAP__LIGHT:
				setLight((Light)newValue);
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
			case ChirpstackPackage.SENSE_CAP__AIR:
				setAir((Air)null);
				return;
			case ChirpstackPackage.SENSE_CAP__RAIN:
				setRain((Rain)null);
				return;
			case ChirpstackPackage.SENSE_CAP__LIGHT:
				setLight((Light)null);
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
			case ChirpstackPackage.SENSE_CAP__AIR:
				return air != null;
			case ChirpstackPackage.SENSE_CAP__RAIN:
				return rain != null;
			case ChirpstackPackage.SENSE_CAP__LIGHT:
				return light != null;
		}
		return super.eIsSet(featureID);
	}

} //SenseCapImpl
