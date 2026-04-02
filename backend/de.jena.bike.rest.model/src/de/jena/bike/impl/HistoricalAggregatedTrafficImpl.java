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
import de.jena.bike.HistoricalAggregatedTraffic;
import de.jena.bike.HistoricalAggregatedTraffic_data;
import de.jena.bike.HistoricalAggregatedTraffic_directionName;

import java.math.BigInteger;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Historical Aggregated Traffic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.impl.HistoricalAggregatedTrafficImpl#getData <em>Data</em>}</li>
 *   <li>{@link de.jena.bike.impl.HistoricalAggregatedTrafficImpl#getDirectionName <em>Direction Name</em>}</li>
 *   <li>{@link de.jena.bike.impl.HistoricalAggregatedTrafficImpl#getFlowID <em>Flow ID</em>}</li>
 *   <li>{@link de.jena.bike.impl.HistoricalAggregatedTrafficImpl#getFlowName <em>Flow Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoricalAggregatedTrafficImpl extends MinimalEObjectImpl.Container implements HistoricalAggregatedTraffic {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<HistoricalAggregatedTraffic_data> data;

	/**
	 * The cached value of the '{@link #getDirectionName() <em>Direction Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionName()
	 * @generated
	 * @ordered
	 */
	protected HistoricalAggregatedTraffic_directionName directionName;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoricalAggregatedTrafficImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.HISTORICAL_AGGREGATED_TRAFFIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HistoricalAggregatedTraffic_data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<HistoricalAggregatedTraffic_data>(HistoricalAggregatedTraffic_data.class, this, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoricalAggregatedTraffic_directionName getDirectionName() {
		return directionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectionName(HistoricalAggregatedTraffic_directionName newDirectionName, NotificationChain msgs) {
		HistoricalAggregatedTraffic_directionName oldDirectionName = directionName;
		directionName = newDirectionName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__DIRECTION_NAME, oldDirectionName, newDirectionName);
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
	public void setDirectionName(HistoricalAggregatedTraffic_directionName newDirectionName) {
		if (newDirectionName != directionName) {
			NotificationChain msgs = null;
			if (directionName != null)
				msgs = ((InternalEObject)directionName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__DIRECTION_NAME, null, msgs);
			if (newDirectionName != null)
				msgs = ((InternalEObject)newDirectionName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__DIRECTION_NAME, null, msgs);
			msgs = basicSetDirectionName(newDirectionName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__DIRECTION_NAME, newDirectionName, newDirectionName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__FLOW_ID, oldFlowID, flowID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__FLOW_NAME, oldFlowName, flowName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__DIRECTION_NAME:
				return basicSetDirectionName(null, msgs);
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
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__DATA:
				return getData();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__DIRECTION_NAME:
				return getDirectionName();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__FLOW_ID:
				return getFlowID();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__FLOW_NAME:
				return getFlowName();
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
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__DATA:
				getData().clear();
				getData().addAll((Collection<? extends HistoricalAggregatedTraffic_data>)newValue);
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__DIRECTION_NAME:
				setDirectionName((HistoricalAggregatedTraffic_directionName)newValue);
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__FLOW_ID:
				setFlowID((BigInteger)newValue);
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__FLOW_NAME:
				setFlowName((String)newValue);
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
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__DATA:
				getData().clear();
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__DIRECTION_NAME:
				setDirectionName((HistoricalAggregatedTraffic_directionName)null);
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__FLOW_ID:
				setFlowID(FLOW_ID_EDEFAULT);
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__FLOW_NAME:
				setFlowName(FLOW_NAME_EDEFAULT);
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
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__DATA:
				return data != null && !data.isEmpty();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__DIRECTION_NAME:
				return directionName != null;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__FLOW_ID:
				return FLOW_ID_EDEFAULT == null ? flowID != null : !FLOW_ID_EDEFAULT.equals(flowID);
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC__FLOW_NAME:
				return FLOW_NAME_EDEFAULT == null ? flowName != null : !FLOW_NAME_EDEFAULT.equals(flowName);
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

} //HistoricalAggregatedTrafficImpl
