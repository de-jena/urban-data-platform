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
import de.jena.chirpstack.moisture.model.moisture.MoistureStatus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moisture Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.MoistureStatusImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.MoistureStatusImpl#getObservedArea <em>Observed Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoistureStatusImpl extends ServiceImpl implements MoistureStatus {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Integer value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getObservedArea() <em>Observed Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedArea()
	 * @generated
	 * @ordered
	 */
	protected static final GeoJsonObject OBSERVED_AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservedArea() <em>Observed Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedArea()
	 * @generated
	 * @ordered
	 */
	protected GeoJsonObject observedArea = OBSERVED_AREA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoistureStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackMoisturePackage.Literals.MOISTURE_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Integer newValue) {
		Integer oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.MOISTURE_STATUS__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoJsonObject getObservedArea() {
		return observedArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObservedArea(GeoJsonObject newObservedArea) {
		GeoJsonObject oldObservedArea = observedArea;
		observedArea = newObservedArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.MOISTURE_STATUS__OBSERVED_AREA, oldObservedArea, observedArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackMoisturePackage.MOISTURE_STATUS__VALUE:
				return getValue();
			case ChirpstackMoisturePackage.MOISTURE_STATUS__OBSERVED_AREA:
				return getObservedArea();
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
			case ChirpstackMoisturePackage.MOISTURE_STATUS__VALUE:
				setValue((Integer)newValue);
				return;
			case ChirpstackMoisturePackage.MOISTURE_STATUS__OBSERVED_AREA:
				setObservedArea((GeoJsonObject)newValue);
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
			case ChirpstackMoisturePackage.MOISTURE_STATUS__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.MOISTURE_STATUS__OBSERVED_AREA:
				setObservedArea(OBSERVED_AREA_EDEFAULT);
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
			case ChirpstackMoisturePackage.MOISTURE_STATUS__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ChirpstackMoisturePackage.MOISTURE_STATUS__OBSERVED_AREA:
				return OBSERVED_AREA_EDEFAULT == null ? observedArea != null : !OBSERVED_AREA_EDEFAULT.equals(observedArea);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", observedArea: ");
		result.append(observedArea);
		result.append(')');
		return result.toString();
	}

} //MoistureStatusImpl
