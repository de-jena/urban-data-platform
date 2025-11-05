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
package de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl;

import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceAreaProvider;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Area Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.ReferenceAreaProviderImpl#getReferenceArea <em>Reference Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceAreaProviderImpl extends ProviderImpl implements ReferenceAreaProvider {
	/**
	 * The cached value of the '{@link #getReferenceArea() <em>Reference Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceArea()
	 * @generated
	 * @ordered
	 */
	protected ReferenceArea referenceArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceAreaProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensinactRefAreaPackage.Literals.REFERENCE_AREA_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceArea getReferenceArea() {
		return referenceArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceArea(ReferenceArea newReferenceArea, NotificationChain msgs) {
		ReferenceArea oldReferenceArea = referenceArea;
		referenceArea = newReferenceArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactRefAreaPackage.REFERENCE_AREA_PROVIDER__REFERENCE_AREA, oldReferenceArea, newReferenceArea);
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
	public void setReferenceArea(ReferenceArea newReferenceArea) {
		if (newReferenceArea != referenceArea) {
			NotificationChain msgs = null;
			if (referenceArea != null)
				msgs = ((InternalEObject)referenceArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactRefAreaPackage.REFERENCE_AREA_PROVIDER__REFERENCE_AREA, null, msgs);
			if (newReferenceArea != null)
				msgs = ((InternalEObject)newReferenceArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactRefAreaPackage.REFERENCE_AREA_PROVIDER__REFERENCE_AREA, null, msgs);
			msgs = basicSetReferenceArea(newReferenceArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensinactRefAreaPackage.REFERENCE_AREA_PROVIDER__REFERENCE_AREA, newReferenceArea, newReferenceArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensinactRefAreaPackage.REFERENCE_AREA_PROVIDER__REFERENCE_AREA:
				return basicSetReferenceArea(null, msgs);
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
			case SensinactRefAreaPackage.REFERENCE_AREA_PROVIDER__REFERENCE_AREA:
				return getReferenceArea();
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
			case SensinactRefAreaPackage.REFERENCE_AREA_PROVIDER__REFERENCE_AREA:
				setReferenceArea((ReferenceArea)newValue);
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
			case SensinactRefAreaPackage.REFERENCE_AREA_PROVIDER__REFERENCE_AREA:
				setReferenceArea((ReferenceArea)null);
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
			case SensinactRefAreaPackage.REFERENCE_AREA_PROVIDER__REFERENCE_AREA:
				return referenceArea != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceAreaProviderImpl
