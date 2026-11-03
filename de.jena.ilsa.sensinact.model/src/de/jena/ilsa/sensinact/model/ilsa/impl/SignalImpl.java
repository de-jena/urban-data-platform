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
package de.jena.ilsa.sensinact.model.ilsa.impl;

import de.jena.ilsa.sensinact.model.ilsa.IlsaPackage;
import de.jena.ilsa.sensinact.model.ilsa.Signal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.ilsa.sensinact.model.ilsa.impl.SignalImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.jena.ilsa.sensinact.model.ilsa.impl.SignalImpl#getObservedArea <em>Observed Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalImpl extends ServiceImpl implements Signal {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

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
	protected SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlsaPackage.Literals.SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlsaPackage.SIGNAL__COLOR, oldColor, color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IlsaPackage.SIGNAL__OBSERVED_AREA, oldObservedArea, observedArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IlsaPackage.SIGNAL__COLOR:
				return getColor();
			case IlsaPackage.SIGNAL__OBSERVED_AREA:
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
			case IlsaPackage.SIGNAL__COLOR:
				setColor((String)newValue);
				return;
			case IlsaPackage.SIGNAL__OBSERVED_AREA:
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
			case IlsaPackage.SIGNAL__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case IlsaPackage.SIGNAL__OBSERVED_AREA:
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
			case IlsaPackage.SIGNAL__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case IlsaPackage.SIGNAL__OBSERVED_AREA:
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
		result.append(" (color: ");
		result.append(color);
		result.append(", observedArea: ");
		result.append(observedArea);
		result.append(')');
		return result.toString();
	}

} //SignalImpl
