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

import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.ReferenceAreaImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.ReferenceAreaImpl#getGid <em>Gid</em>}</li>
 *   <li>{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.ReferenceAreaImpl#getSensorCount <em>Sensor Count</em>}</li>
 *   <li>{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.ReferenceAreaImpl#getTourName <em>Tour Name</em>}</li>
 *   <li>{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.ReferenceAreaImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceAreaImpl extends ServiceImpl implements ReferenceArea {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected static final float GID_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected float gid = GID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSensorCount() <em>Sensor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SENSOR_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSensorCount() <em>Sensor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorCount()
	 * @generated
	 * @ordered
	 */
	protected int sensorCount = SENSOR_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTourName() <em>Tour Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTourName()
	 * @generated
	 * @ordered
	 */
	protected static final String TOUR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTourName() <em>Tour Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTourName()
	 * @generated
	 * @ordered
	 */
	protected String tourName = TOUR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final ColorType COLOR_EDEFAULT = ColorType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected ColorType color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensinactRefAreaPackage.Literals.REFERENCE_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensinactRefAreaPackage.REFERENCE_AREA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getGid() {
		return gid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGid(float newGid) {
		float oldGid = gid;
		gid = newGid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensinactRefAreaPackage.REFERENCE_AREA__GID, oldGid, gid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSensorCount() {
		return sensorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensorCount(int newSensorCount) {
		int oldSensorCount = sensorCount;
		sensorCount = newSensorCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensinactRefAreaPackage.REFERENCE_AREA__SENSOR_COUNT, oldSensorCount, sensorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTourName() {
		return tourName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTourName(String newTourName) {
		String oldTourName = tourName;
		tourName = newTourName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensinactRefAreaPackage.REFERENCE_AREA__TOUR_NAME, oldTourName, tourName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorType getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(ColorType newColor) {
		ColorType oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensinactRefAreaPackage.REFERENCE_AREA__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensinactRefAreaPackage.REFERENCE_AREA__NAME:
				return getName();
			case SensinactRefAreaPackage.REFERENCE_AREA__GID:
				return getGid();
			case SensinactRefAreaPackage.REFERENCE_AREA__SENSOR_COUNT:
				return getSensorCount();
			case SensinactRefAreaPackage.REFERENCE_AREA__TOUR_NAME:
				return getTourName();
			case SensinactRefAreaPackage.REFERENCE_AREA__COLOR:
				return getColor();
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
			case SensinactRefAreaPackage.REFERENCE_AREA__NAME:
				setName((String)newValue);
				return;
			case SensinactRefAreaPackage.REFERENCE_AREA__GID:
				setGid((Float)newValue);
				return;
			case SensinactRefAreaPackage.REFERENCE_AREA__SENSOR_COUNT:
				setSensorCount((Integer)newValue);
				return;
			case SensinactRefAreaPackage.REFERENCE_AREA__TOUR_NAME:
				setTourName((String)newValue);
				return;
			case SensinactRefAreaPackage.REFERENCE_AREA__COLOR:
				setColor((ColorType)newValue);
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
			case SensinactRefAreaPackage.REFERENCE_AREA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SensinactRefAreaPackage.REFERENCE_AREA__GID:
				setGid(GID_EDEFAULT);
				return;
			case SensinactRefAreaPackage.REFERENCE_AREA__SENSOR_COUNT:
				setSensorCount(SENSOR_COUNT_EDEFAULT);
				return;
			case SensinactRefAreaPackage.REFERENCE_AREA__TOUR_NAME:
				setTourName(TOUR_NAME_EDEFAULT);
				return;
			case SensinactRefAreaPackage.REFERENCE_AREA__COLOR:
				setColor(COLOR_EDEFAULT);
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
			case SensinactRefAreaPackage.REFERENCE_AREA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SensinactRefAreaPackage.REFERENCE_AREA__GID:
				return gid != GID_EDEFAULT;
			case SensinactRefAreaPackage.REFERENCE_AREA__SENSOR_COUNT:
				return sensorCount != SENSOR_COUNT_EDEFAULT;
			case SensinactRefAreaPackage.REFERENCE_AREA__TOUR_NAME:
				return TOUR_NAME_EDEFAULT == null ? tourName != null : !TOUR_NAME_EDEFAULT.equals(tourName);
			case SensinactRefAreaPackage.REFERENCE_AREA__COLOR:
				return color != COLOR_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", gid: ");
		result.append(gid);
		result.append(", sensorCount: ");
		result.append(sensorCount);
		result.append(", tourName: ");
		result.append(tourName);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //ReferenceAreaImpl
