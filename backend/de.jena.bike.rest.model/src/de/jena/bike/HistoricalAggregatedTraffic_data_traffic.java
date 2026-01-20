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
package de.jena.bike;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Historical Aggregated Traffic data traffic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.HistoricalAggregatedTraffic_data_traffic#getCounts <em>Counts</em>}</li>
 *   <li>{@link de.jena.bike.HistoricalAggregatedTraffic_data_traffic#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic_data_traffic()
 * @model
 * @generated
 */
@ProviderType
public interface HistoricalAggregatedTraffic_data_traffic extends EObject {
	/**
	 * Returns the value of the '<em><b>Counts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counts</em>' containment reference.
	 * @see #setCounts(Count)
	 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic_data_traffic_Counts()
	 * @model containment="true"
	 * @generated
	 */
	Count getCounts();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalAggregatedTraffic_data_traffic#getCounts <em>Counts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counts</em>' containment reference.
	 * @see #getCounts()
	 * @generated
	 */
	void setCounts(Count value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(Object)
	 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic_data_traffic_Status()
	 * @model unique="false"
	 * @generated
	 */
	Object getStatus();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalAggregatedTraffic_data_traffic#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Object value);

} // HistoricalAggregatedTraffic_data_traffic
