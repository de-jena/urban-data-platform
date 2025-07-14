/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.jena.chirpstack.moisture.model.moisture.impl;

import de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage;
import de.jena.chirpstack.moisture.model.moisture.TSoil;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSoil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.TSoilImpl#getSoilWaterTension1 <em>Soil Water Tension1</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.TSoilImpl#getSoilWaterTension2 <em>Soil Water Tension2</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.TSoilImpl#getSoilMoistureRaw1 <em>Soil Moisture Raw1</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.TSoilImpl#getSoilMoistureRaw2 <em>Soil Moisture Raw2</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.TSoilImpl#getAmbientLight <em>Ambient Light</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSoilImpl extends ServiceImpl implements TSoil {
	/**
	 * The default value of the '{@link #getSoilWaterTension1() <em>Soil Water Tension1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilWaterTension1()
	 * @generated
	 * @ordered
	 */
	protected static final double SOIL_WATER_TENSION1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSoilWaterTension1() <em>Soil Water Tension1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilWaterTension1()
	 * @generated
	 * @ordered
	 */
	protected double soilWaterTension1 = SOIL_WATER_TENSION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoilWaterTension2() <em>Soil Water Tension2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilWaterTension2()
	 * @generated
	 * @ordered
	 */
	protected static final double SOIL_WATER_TENSION2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSoilWaterTension2() <em>Soil Water Tension2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilWaterTension2()
	 * @generated
	 * @ordered
	 */
	protected double soilWaterTension2 = SOIL_WATER_TENSION2_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoilMoistureRaw1() <em>Soil Moisture Raw1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilMoistureRaw1()
	 * @generated
	 * @ordered
	 */
	protected static final double SOIL_MOISTURE_RAW1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSoilMoistureRaw1() <em>Soil Moisture Raw1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilMoistureRaw1()
	 * @generated
	 * @ordered
	 */
	protected double soilMoistureRaw1 = SOIL_MOISTURE_RAW1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoilMoistureRaw2() <em>Soil Moisture Raw2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilMoistureRaw2()
	 * @generated
	 * @ordered
	 */
	protected static final double SOIL_MOISTURE_RAW2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSoilMoistureRaw2() <em>Soil Moisture Raw2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilMoistureRaw2()
	 * @generated
	 * @ordered
	 */
	protected double soilMoistureRaw2 = SOIL_MOISTURE_RAW2_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmbientLight() <em>Ambient Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientLight()
	 * @generated
	 * @ordered
	 */
	protected static final double AMBIENT_LIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmbientLight() <em>Ambient Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientLight()
	 * @generated
	 * @ordered
	 */
	protected double ambientLight = AMBIENT_LIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSoilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackMoisturePackage.Literals.TSOIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSoilWaterTension1() {
		return soilWaterTension1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoilWaterTension1(double newSoilWaterTension1) {
		double oldSoilWaterTension1 = soilWaterTension1;
		soilWaterTension1 = newSoilWaterTension1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.TSOIL__SOIL_WATER_TENSION1, oldSoilWaterTension1, soilWaterTension1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSoilWaterTension2() {
		return soilWaterTension2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoilWaterTension2(double newSoilWaterTension2) {
		double oldSoilWaterTension2 = soilWaterTension2;
		soilWaterTension2 = newSoilWaterTension2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.TSOIL__SOIL_WATER_TENSION2, oldSoilWaterTension2, soilWaterTension2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSoilMoistureRaw1() {
		return soilMoistureRaw1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoilMoistureRaw1(double newSoilMoistureRaw1) {
		double oldSoilMoistureRaw1 = soilMoistureRaw1;
		soilMoistureRaw1 = newSoilMoistureRaw1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.TSOIL__SOIL_MOISTURE_RAW1, oldSoilMoistureRaw1, soilMoistureRaw1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSoilMoistureRaw2() {
		return soilMoistureRaw2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoilMoistureRaw2(double newSoilMoistureRaw2) {
		double oldSoilMoistureRaw2 = soilMoistureRaw2;
		soilMoistureRaw2 = newSoilMoistureRaw2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.TSOIL__SOIL_MOISTURE_RAW2, oldSoilMoistureRaw2, soilMoistureRaw2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAmbientLight() {
		return ambientLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmbientLight(double newAmbientLight) {
		double oldAmbientLight = ambientLight;
		ambientLight = newAmbientLight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.TSOIL__AMBIENT_LIGHT, oldAmbientLight, ambientLight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackMoisturePackage.TSOIL__SOIL_WATER_TENSION1:
				return getSoilWaterTension1();
			case ChirpstackMoisturePackage.TSOIL__SOIL_WATER_TENSION2:
				return getSoilWaterTension2();
			case ChirpstackMoisturePackage.TSOIL__SOIL_MOISTURE_RAW1:
				return getSoilMoistureRaw1();
			case ChirpstackMoisturePackage.TSOIL__SOIL_MOISTURE_RAW2:
				return getSoilMoistureRaw2();
			case ChirpstackMoisturePackage.TSOIL__AMBIENT_LIGHT:
				return getAmbientLight();
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
			case ChirpstackMoisturePackage.TSOIL__SOIL_WATER_TENSION1:
				setSoilWaterTension1((Double)newValue);
				return;
			case ChirpstackMoisturePackage.TSOIL__SOIL_WATER_TENSION2:
				setSoilWaterTension2((Double)newValue);
				return;
			case ChirpstackMoisturePackage.TSOIL__SOIL_MOISTURE_RAW1:
				setSoilMoistureRaw1((Double)newValue);
				return;
			case ChirpstackMoisturePackage.TSOIL__SOIL_MOISTURE_RAW2:
				setSoilMoistureRaw2((Double)newValue);
				return;
			case ChirpstackMoisturePackage.TSOIL__AMBIENT_LIGHT:
				setAmbientLight((Double)newValue);
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
			case ChirpstackMoisturePackage.TSOIL__SOIL_WATER_TENSION1:
				setSoilWaterTension1(SOIL_WATER_TENSION1_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.TSOIL__SOIL_WATER_TENSION2:
				setSoilWaterTension2(SOIL_WATER_TENSION2_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.TSOIL__SOIL_MOISTURE_RAW1:
				setSoilMoistureRaw1(SOIL_MOISTURE_RAW1_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.TSOIL__SOIL_MOISTURE_RAW2:
				setSoilMoistureRaw2(SOIL_MOISTURE_RAW2_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.TSOIL__AMBIENT_LIGHT:
				setAmbientLight(AMBIENT_LIGHT_EDEFAULT);
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
			case ChirpstackMoisturePackage.TSOIL__SOIL_WATER_TENSION1:
				return soilWaterTension1 != SOIL_WATER_TENSION1_EDEFAULT;
			case ChirpstackMoisturePackage.TSOIL__SOIL_WATER_TENSION2:
				return soilWaterTension2 != SOIL_WATER_TENSION2_EDEFAULT;
			case ChirpstackMoisturePackage.TSOIL__SOIL_MOISTURE_RAW1:
				return soilMoistureRaw1 != SOIL_MOISTURE_RAW1_EDEFAULT;
			case ChirpstackMoisturePackage.TSOIL__SOIL_MOISTURE_RAW2:
				return soilMoistureRaw2 != SOIL_MOISTURE_RAW2_EDEFAULT;
			case ChirpstackMoisturePackage.TSOIL__AMBIENT_LIGHT:
				return ambientLight != AMBIENT_LIGHT_EDEFAULT;
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
		result.append(" (soilWaterTension1: ");
		result.append(soilWaterTension1);
		result.append(", soilWaterTension2: ");
		result.append(soilWaterTension2);
		result.append(", soilMoistureRaw1: ");
		result.append(soilMoistureRaw1);
		result.append(", soilMoistureRaw2: ");
		result.append(soilMoistureRaw2);
		result.append(", ambientLight: ");
		result.append(ambientLight);
		result.append(')');
		return result.toString();
	}

} //TSoilImpl
