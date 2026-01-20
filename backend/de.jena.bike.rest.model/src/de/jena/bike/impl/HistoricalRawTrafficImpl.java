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
import de.jena.bike.HistoricalRawTraffic;
import de.jena.bike.HistoricalRawTraffic_data;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historical Raw Traffic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.impl.HistoricalRawTrafficImpl#getFlowID <em>Flow ID</em>}</li>
 *   <li>{@link de.jena.bike.impl.HistoricalRawTrafficImpl#getFlowName <em>Flow Name</em>}</li>
 *   <li>{@link de.jena.bike.impl.HistoricalRawTrafficImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoricalRawTrafficImpl extends BaseSerieImpl implements HistoricalRawTraffic {
	/**
	 * The default value of the '{@link #getFlowID() <em>Flow ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FLOW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlowID() <em>Flow ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger flowID = FLOW_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlowName() <em>Flow Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowName()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlowName() <em>Flow Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowName()
	 * @generated
	 * @ordered
	 */
	protected String flowName = FLOW_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<HistoricalRawTraffic_data> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoricalRawTrafficImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.HISTORICAL_RAW_TRAFFIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getFlowID() {
		return flowID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowID(BigInteger newFlowID) {
		BigInteger oldFlowID = flowID;
		flowID = newFlowID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_RAW_TRAFFIC__FLOW_ID, oldFlowID, flowID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFlowName() {
		return flowName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowName(String newFlowName) {
		String oldFlowName = flowName;
		flowName = newFlowName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_RAW_TRAFFIC__FLOW_NAME, oldFlowName, flowName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HistoricalRawTraffic_data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<HistoricalRawTraffic_data>(HistoricalRawTraffic_data.class, this, BikePackage.HISTORICAL_RAW_TRAFFIC__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BikePackage.HISTORICAL_RAW_TRAFFIC__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case BikePackage.HISTORICAL_RAW_TRAFFIC__FLOW_ID:
				return getFlowID();
			case BikePackage.HISTORICAL_RAW_TRAFFIC__FLOW_NAME:
				return getFlowName();
			case BikePackage.HISTORICAL_RAW_TRAFFIC__DATA:
				return getData();
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
			case BikePackage.HISTORICAL_RAW_TRAFFIC__FLOW_ID:
				setFlowID((BigInteger)newValue);
				return;
			case BikePackage.HISTORICAL_RAW_TRAFFIC__FLOW_NAME:
				setFlowName((String)newValue);
				return;
			case BikePackage.HISTORICAL_RAW_TRAFFIC__DATA:
				getData().clear();
				getData().addAll((Collection<? extends HistoricalRawTraffic_data>)newValue);
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
			case BikePackage.HISTORICAL_RAW_TRAFFIC__FLOW_ID:
				setFlowID(FLOW_ID_EDEFAULT);
				return;
			case BikePackage.HISTORICAL_RAW_TRAFFIC__FLOW_NAME:
				setFlowName(FLOW_NAME_EDEFAULT);
				return;
			case BikePackage.HISTORICAL_RAW_TRAFFIC__DATA:
				getData().clear();
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
			case BikePackage.HISTORICAL_RAW_TRAFFIC__FLOW_ID:
				return FLOW_ID_EDEFAULT == null ? flowID != null : !FLOW_ID_EDEFAULT.equals(flowID);
			case BikePackage.HISTORICAL_RAW_TRAFFIC__FLOW_NAME:
				return FLOW_NAME_EDEFAULT == null ? flowName != null : !FLOW_NAME_EDEFAULT.equals(flowName);
			case BikePackage.HISTORICAL_RAW_TRAFFIC__DATA:
				return data != null && !data.isEmpty();
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
		result.append(" (flowID: ");
		result.append(flowID);
		result.append(", flowName: ");
		result.append(flowName);
		result.append(')');
		return result.toString();
	}

} //HistoricalRawTrafficImpl
