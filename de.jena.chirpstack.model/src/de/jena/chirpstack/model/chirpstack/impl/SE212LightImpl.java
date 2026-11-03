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
import de.jena.chirpstack.model.chirpstack.SE212Light;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SE212 Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.SE212LightImpl#getLux <em>Lux</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SE212LightImpl extends ServiceImpl implements SE212Light {
	/**
	 * The default value of the '{@link #getLux() <em>Lux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLux()
	 * @generated
	 * @ordered
	 */
	protected static final double LUX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLux() <em>Lux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLux()
	 * @generated
	 * @ordered
	 */
	protected double lux = LUX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SE212LightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.SE212_LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLux() {
		return lux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLux(double newLux) {
		double oldLux = lux;
		lux = newLux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.SE212_LIGHT__LUX, oldLux, lux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackPackage.SE212_LIGHT__LUX:
				return getLux();
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
			case ChirpstackPackage.SE212_LIGHT__LUX:
				setLux((Double)newValue);
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
			case ChirpstackPackage.SE212_LIGHT__LUX:
				setLux(LUX_EDEFAULT);
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
			case ChirpstackPackage.SE212_LIGHT__LUX:
				return lux != LUX_EDEFAULT;
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
		result.append(" (lux: ");
		result.append(lux);
		result.append(')');
		return result.toString();
	}

} //SE212LightImpl
