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
package de.jena.bike.impl;

import de.jena.bike.BikePackage;
import de.jena.bike.siteCounter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>site Counter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.impl.siteCounterImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteCounterImpl#getSerial <em>Serial</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteCounterImpl#getInstallationDate <em>Installation Date</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteCounterImpl#getDetachmentDate <em>Detachment Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class siteCounterImpl extends MinimalEObjectImpl.Container implements siteCounter {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Integer id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSerial() <em>Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerial()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerial() <em>Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerial()
	 * @generated
	 * @ordered
	 */
	protected String serial = SERIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstallationDate() <em>Installation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTALLATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstallationDate() <em>Installation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallationDate()
	 * @generated
	 * @ordered
	 */
	protected String installationDate = INSTALLATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetachmentDate() <em>Detachment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetachmentDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DETACHMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetachmentDate() <em>Detachment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetachmentDate()
	 * @generated
	 * @ordered
	 */
	protected String detachmentDate = DETACHMENT_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected siteCounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.SITE_COUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Integer newId) {
		Integer oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE_COUNTER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerial() {
		return serial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerial(String newSerial) {
		String oldSerial = serial;
		serial = newSerial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE_COUNTER__SERIAL, oldSerial, serial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstallationDate() {
		return installationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstallationDate(String newInstallationDate) {
		String oldInstallationDate = installationDate;
		installationDate = newInstallationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE_COUNTER__INSTALLATION_DATE, oldInstallationDate, installationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetachmentDate() {
		return detachmentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetachmentDate(String newDetachmentDate) {
		String oldDetachmentDate = detachmentDate;
		detachmentDate = newDetachmentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE_COUNTER__DETACHMENT_DATE, oldDetachmentDate, detachmentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BikePackage.SITE_COUNTER__ID:
				return getId();
			case BikePackage.SITE_COUNTER__SERIAL:
				return getSerial();
			case BikePackage.SITE_COUNTER__INSTALLATION_DATE:
				return getInstallationDate();
			case BikePackage.SITE_COUNTER__DETACHMENT_DATE:
				return getDetachmentDate();
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
			case BikePackage.SITE_COUNTER__ID:
				setId((Integer)newValue);
				return;
			case BikePackage.SITE_COUNTER__SERIAL:
				setSerial((String)newValue);
				return;
			case BikePackage.SITE_COUNTER__INSTALLATION_DATE:
				setInstallationDate((String)newValue);
				return;
			case BikePackage.SITE_COUNTER__DETACHMENT_DATE:
				setDetachmentDate((String)newValue);
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
			case BikePackage.SITE_COUNTER__ID:
				setId(ID_EDEFAULT);
				return;
			case BikePackage.SITE_COUNTER__SERIAL:
				setSerial(SERIAL_EDEFAULT);
				return;
			case BikePackage.SITE_COUNTER__INSTALLATION_DATE:
				setInstallationDate(INSTALLATION_DATE_EDEFAULT);
				return;
			case BikePackage.SITE_COUNTER__DETACHMENT_DATE:
				setDetachmentDate(DETACHMENT_DATE_EDEFAULT);
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
			case BikePackage.SITE_COUNTER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BikePackage.SITE_COUNTER__SERIAL:
				return SERIAL_EDEFAULT == null ? serial != null : !SERIAL_EDEFAULT.equals(serial);
			case BikePackage.SITE_COUNTER__INSTALLATION_DATE:
				return INSTALLATION_DATE_EDEFAULT == null ? installationDate != null : !INSTALLATION_DATE_EDEFAULT.equals(installationDate);
			case BikePackage.SITE_COUNTER__DETACHMENT_DATE:
				return DETACHMENT_DATE_EDEFAULT == null ? detachmentDate != null : !DETACHMENT_DATE_EDEFAULT.equals(detachmentDate);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", serial: ");
		result.append(serial);
		result.append(", installationDate: ");
		result.append(installationDate);
		result.append(", detachmentDate: ");
		result.append(detachmentDate);
		result.append(')');
		return result.toString();
	}

} //siteCounterImpl
