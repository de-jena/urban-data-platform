/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */

package de.jena.ilsa.sensinact.model.ilsa.impl;

import de.jena.ilsa.sensinact.model.ilsa.Ilsa;
import de.jena.ilsa.sensinact.model.ilsa.IlsaPackage;
import de.jena.ilsa.sensinact.model.ilsa.Thermal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.DynamicProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ilsa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.ilsa.sensinact.model.ilsa.impl.IlsaImpl#getThermal <em>Thermal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IlsaImpl extends DynamicProviderImpl implements Ilsa {
	/**
	 * The cached value of the '{@link #getThermal() <em>Thermal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermal()
	 * @generated
	 * @ordered
	 */
	protected Thermal thermal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IlsaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlsaPackage.Literals.ILSA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Thermal getThermal() {
		if (thermal != null && thermal.eIsProxy()) {
			InternalEObject oldThermal = (InternalEObject)thermal;
			thermal = (Thermal)eResolveProxy(oldThermal);
			if (thermal != oldThermal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IlsaPackage.ILSA__THERMAL, oldThermal, thermal));
			}
		}
		return thermal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thermal basicGetThermal() {
		return thermal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThermal(Thermal newThermal) {
		Thermal oldThermal = thermal;
		thermal = newThermal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlsaPackage.ILSA__THERMAL, oldThermal, thermal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IlsaPackage.ILSA__THERMAL:
				if (resolve) return getThermal();
				return basicGetThermal();
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
			case IlsaPackage.ILSA__THERMAL:
				setThermal((Thermal)newValue);
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
			case IlsaPackage.ILSA__THERMAL:
				setThermal((Thermal)null);
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
			case IlsaPackage.ILSA__THERMAL:
				return thermal != null;
		}
		return super.eIsSet(featureID);
	}

} //IlsaImpl
