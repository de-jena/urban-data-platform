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
 * A representation of the model object '<em><b>Historical Raw Traffic data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.HistoricalRawTraffic_data#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.bike.HistoricalRawTraffic_data#getGranularity <em>Granularity</em>}</li>
 *   <li>{@link de.jena.bike.HistoricalRawTraffic_data#getCounts <em>Counts</em>}</li>
 *   <li>{@link de.jena.bike.HistoricalRawTraffic_data#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see de.jena.bike.BikePackage#getHistoricalRawTraffic_data()
 * @model
 * @generated
 */
@ProviderType
public interface HistoricalRawTraffic_data extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' containment reference.
	 * @see #setTimestamp(HistoricalRawTraffic_data_timestamp)
	 * @see de.jena.bike.BikePackage#getHistoricalRawTraffic_data_Timestamp()
	 * @model containment="true"
	 * @generated
	 */
	HistoricalRawTraffic_data_timestamp getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalRawTraffic_data#getTimestamp <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' containment reference.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(HistoricalRawTraffic_data_timestamp value);

	/**
	 * Returns the value of the '<em><b>Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Granularity</em>' attribute.
	 * @see #setGranularity(String)
	 * @see de.jena.bike.BikePackage#getHistoricalRawTraffic_data_Granularity()
	 * @model unique="false"
	 * @generated
	 */
	String getGranularity();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalRawTraffic_data#getGranularity <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Granularity</em>' attribute.
	 * @see #getGranularity()
	 * @generated
	 */
	void setGranularity(String value);

	/**
	 * Returns the value of the '<em><b>Counts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counts</em>' containment reference.
	 * @see #setCounts(HistoricalRawTraffic_data_counts)
	 * @see de.jena.bike.BikePackage#getHistoricalRawTraffic_data_Counts()
	 * @model containment="true"
	 * @generated
	 */
	HistoricalRawTraffic_data_counts getCounts();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalRawTraffic_data#getCounts <em>Counts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counts</em>' containment reference.
	 * @see #getCounts()
	 * @generated
	 */
	void setCounts(HistoricalRawTraffic_data_counts value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(HistoricalRawTraffic_data_status)
	 * @see de.jena.bike.BikePackage#getHistoricalRawTraffic_data_Status()
	 * @model containment="true"
	 * @generated
	 */
	HistoricalRawTraffic_data_status getStatus();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalRawTraffic_data#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(HistoricalRawTraffic_data_status value);

} // HistoricalRawTraffic_data
