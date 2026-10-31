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
import de.jena.chirpstack.model.chirpstack.SenseCapSoil;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sense Cap Soil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.SenseCapSoilImpl#getSoilTemperature <em>Soil Temperature</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.SenseCapSoilImpl#getSoilMoisture <em>Soil Moisture</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.SenseCapSoilImpl#getSoilConductivity <em>Soil Conductivity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SenseCapSoilImpl extends ServiceImpl implements SenseCapSoil {
	/**
	 * The default value of the '{@link #getSoilTemperature() <em>Soil Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final double SOIL_TEMPERATURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSoilTemperature() <em>Soil Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilTemperature()
	 * @generated
	 * @ordered
	 */
	protected double soilTemperature = SOIL_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoilMoisture() <em>Soil Moisture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilMoisture()
	 * @generated
	 * @ordered
	 */
	protected static final double SOIL_MOISTURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSoilMoisture() <em>Soil Moisture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilMoisture()
	 * @generated
	 * @ordered
	 */
	protected double soilMoisture = SOIL_MOISTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoilConductivity() <em>Soil Conductivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilConductivity()
	 * @generated
	 * @ordered
	 */
	protected static final double SOIL_CONDUCTIVITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSoilConductivity() <em>Soil Conductivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilConductivity()
	 * @generated
	 * @ordered
	 */
	protected double soilConductivity = SOIL_CONDUCTIVITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenseCapSoilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.SENSE_CAP_SOIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSoilTemperature() {
		return soilTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoilTemperature(double newSoilTemperature) {
		double oldSoilTemperature = soilTemperature;
		soilTemperature = newSoilTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.SENSE_CAP_SOIL__SOIL_TEMPERATURE, oldSoilTemperature, soilTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSoilMoisture() {
		return soilMoisture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoilMoisture(double newSoilMoisture) {
		double oldSoilMoisture = soilMoisture;
		soilMoisture = newSoilMoisture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.SENSE_CAP_SOIL__SOIL_MOISTURE, oldSoilMoisture, soilMoisture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSoilConductivity() {
		return soilConductivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoilConductivity(double newSoilConductivity) {
		double oldSoilConductivity = soilConductivity;
		soilConductivity = newSoilConductivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.SENSE_CAP_SOIL__SOIL_CONDUCTIVITY, oldSoilConductivity, soilConductivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackPackage.SENSE_CAP_SOIL__SOIL_TEMPERATURE:
				return getSoilTemperature();
			case ChirpstackPackage.SENSE_CAP_SOIL__SOIL_MOISTURE:
				return getSoilMoisture();
			case ChirpstackPackage.SENSE_CAP_SOIL__SOIL_CONDUCTIVITY:
				return getSoilConductivity();
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
			case ChirpstackPackage.SENSE_CAP_SOIL__SOIL_TEMPERATURE:
				setSoilTemperature((Double)newValue);
				return;
			case ChirpstackPackage.SENSE_CAP_SOIL__SOIL_MOISTURE:
				setSoilMoisture((Double)newValue);
				return;
			case ChirpstackPackage.SENSE_CAP_SOIL__SOIL_CONDUCTIVITY:
				setSoilConductivity((Double)newValue);
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
			case ChirpstackPackage.SENSE_CAP_SOIL__SOIL_TEMPERATURE:
				setSoilTemperature(SOIL_TEMPERATURE_EDEFAULT);
				return;
			case ChirpstackPackage.SENSE_CAP_SOIL__SOIL_MOISTURE:
				setSoilMoisture(SOIL_MOISTURE_EDEFAULT);
				return;
			case ChirpstackPackage.SENSE_CAP_SOIL__SOIL_CONDUCTIVITY:
				setSoilConductivity(SOIL_CONDUCTIVITY_EDEFAULT);
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
			case ChirpstackPackage.SENSE_CAP_SOIL__SOIL_TEMPERATURE:
				return soilTemperature != SOIL_TEMPERATURE_EDEFAULT;
			case ChirpstackPackage.SENSE_CAP_SOIL__SOIL_MOISTURE:
				return soilMoisture != SOIL_MOISTURE_EDEFAULT;
			case ChirpstackPackage.SENSE_CAP_SOIL__SOIL_CONDUCTIVITY:
				return soilConductivity != SOIL_CONDUCTIVITY_EDEFAULT;
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
		result.append(" (soilTemperature: ");
		result.append(soilTemperature);
		result.append(", soilMoisture: ");
		result.append(soilMoisture);
		result.append(", soilConductivity: ");
		result.append(soilConductivity);
		result.append(')');
		return result.toString();
	}

} //SenseCapSoilImpl
