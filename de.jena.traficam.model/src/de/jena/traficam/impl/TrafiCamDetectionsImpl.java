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
package de.jena.traficam.impl;

import de.jena.traficam.ObservedClass;
import de.jena.traficam.TrafiCamDetections;
import de.jena.traficam.TrafiCamPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.impl.TrafiCamDetectionsImpl#getCamId <em>Cam Id</em>}</li>
 *   <li>{@link de.jena.traficam.impl.TrafiCamDetectionsImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.traficam.impl.TrafiCamDetectionsImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafiCamDetectionsImpl extends MinimalEObjectImpl.Container implements TrafiCamDetections {
	/**
	 * The default value of the '{@link #getCamId() <em>Cam Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamId()
	 * @generated
	 * @ordered
	 */
	protected static final String CAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCamId() <em>Cam Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamId()
	 * @generated
	 * @ordered
	 */
	protected String camId = CAM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservedClass> classes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafiCamDetectionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafiCamPackage.Literals.TRAFI_CAM_DETECTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCamId() {
		return camId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCamId(String newCamId) {
		String oldCamId = camId;
		camId = newCamId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.TRAFI_CAM_DETECTIONS__CAM_ID, oldCamId, camId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.TRAFI_CAM_DETECTIONS__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObservedClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<ObservedClass>(ObservedClass.class, this, TrafiCamPackage.TRAFI_CAM_DETECTIONS__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrafiCamPackage.TRAFI_CAM_DETECTIONS__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
			case TrafiCamPackage.TRAFI_CAM_DETECTIONS__CAM_ID:
				return getCamId();
			case TrafiCamPackage.TRAFI_CAM_DETECTIONS__TIME:
				return getTime();
			case TrafiCamPackage.TRAFI_CAM_DETECTIONS__CLASSES:
				return getClasses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrafiCamPackage.TRAFI_CAM_DETECTIONS__CAM_ID:
				setCamId((String)newValue);
				return;
			case TrafiCamPackage.TRAFI_CAM_DETECTIONS__TIME:
				setTime((Date)newValue);
				return;
			case TrafiCamPackage.TRAFI_CAM_DETECTIONS__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends ObservedClass>)newValue);
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
			case TrafiCamPackage.TRAFI_CAM_DETECTIONS__CAM_ID:
				setCamId(CAM_ID_EDEFAULT);
				return;
			case TrafiCamPackage.TRAFI_CAM_DETECTIONS__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case TrafiCamPackage.TRAFI_CAM_DETECTIONS__CLASSES:
				getClasses().clear();
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
			case TrafiCamPackage.TRAFI_CAM_DETECTIONS__CAM_ID:
				return CAM_ID_EDEFAULT == null ? camId != null : !CAM_ID_EDEFAULT.equals(camId);
			case TrafiCamPackage.TRAFI_CAM_DETECTIONS__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case TrafiCamPackage.TRAFI_CAM_DETECTIONS__CLASSES:
				return classes != null && !classes.isEmpty();
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
		result.append(" (camId: ");
		result.append(camId);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //TrafiCamDetectionsImpl
