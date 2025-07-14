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
import de.jena.chirpstack.moisture.model.moisture.Light;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.LightImpl#getLightIntensity <em>Light Intensity</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.LightImpl#getUvIndex <em>Uv Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LightImpl extends ServiceImpl implements Light {
	/**
	 * The default value of the '{@link #getLightIntensity() <em>Light Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final double LIGHT_INTENSITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLightIntensity() <em>Light Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightIntensity()
	 * @generated
	 * @ordered
	 */
	protected double lightIntensity = LIGHT_INTENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUvIndex() <em>Uv Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUvIndex()
	 * @generated
	 * @ordered
	 */
	protected static final double UV_INDEX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUvIndex() <em>Uv Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUvIndex()
	 * @generated
	 * @ordered
	 */
	protected double uvIndex = UV_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackMoisturePackage.Literals.LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLightIntensity() {
		return lightIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLightIntensity(double newLightIntensity) {
		double oldLightIntensity = lightIntensity;
		lightIntensity = newLightIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.LIGHT__LIGHT_INTENSITY, oldLightIntensity, lightIntensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUvIndex() {
		return uvIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUvIndex(double newUvIndex) {
		double oldUvIndex = uvIndex;
		uvIndex = newUvIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.LIGHT__UV_INDEX, oldUvIndex, uvIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackMoisturePackage.LIGHT__LIGHT_INTENSITY:
				return getLightIntensity();
			case ChirpstackMoisturePackage.LIGHT__UV_INDEX:
				return getUvIndex();
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
			case ChirpstackMoisturePackage.LIGHT__LIGHT_INTENSITY:
				setLightIntensity((Double)newValue);
				return;
			case ChirpstackMoisturePackage.LIGHT__UV_INDEX:
				setUvIndex((Double)newValue);
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
			case ChirpstackMoisturePackage.LIGHT__LIGHT_INTENSITY:
				setLightIntensity(LIGHT_INTENSITY_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.LIGHT__UV_INDEX:
				setUvIndex(UV_INDEX_EDEFAULT);
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
			case ChirpstackMoisturePackage.LIGHT__LIGHT_INTENSITY:
				return lightIntensity != LIGHT_INTENSITY_EDEFAULT;
			case ChirpstackMoisturePackage.LIGHT__UV_INDEX:
				return uvIndex != UV_INDEX_EDEFAULT;
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
		result.append(" (lightIntensity: ");
		result.append(lightIntensity);
		result.append(", uvIndex: ");
		result.append(uvIndex);
		result.append(')');
		return result.toString();
	}

} //LightImpl
