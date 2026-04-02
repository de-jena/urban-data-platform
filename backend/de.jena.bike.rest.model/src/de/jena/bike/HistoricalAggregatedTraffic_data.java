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
 * A representation of the model object '<em><b>Historical Aggregated Traffic data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.HistoricalAggregatedTraffic_data#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.bike.HistoricalAggregatedTraffic_data#getTraffic <em>Traffic</em>}</li>
 *   <li>{@link de.jena.bike.HistoricalAggregatedTraffic_data#getWeather <em>Weather</em>}</li>
 * </ul>
 *
 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic_data()
 * @model
 * @generated
 */
@ProviderType
public interface HistoricalAggregatedTraffic_data extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' containment reference.
	 * @see #setTimestamp(HistoricalAggregatedTraffic_data_timestamp)
	 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic_data_Timestamp()
	 * @model containment="true"
	 * @generated
	 */
	HistoricalAggregatedTraffic_data_timestamp getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalAggregatedTraffic_data#getTimestamp <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' containment reference.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(HistoricalAggregatedTraffic_data_timestamp value);

	/**
	 * Returns the value of the '<em><b>Traffic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic</em>' containment reference.
	 * @see #setTraffic(HistoricalAggregatedTraffic_data_traffic)
	 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic_data_Traffic()
	 * @model containment="true"
	 * @generated
	 */
	HistoricalAggregatedTraffic_data_traffic getTraffic();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalAggregatedTraffic_data#getTraffic <em>Traffic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traffic</em>' containment reference.
	 * @see #getTraffic()
	 * @generated
	 */
	void setTraffic(HistoricalAggregatedTraffic_data_traffic value);

	/**
	 * Returns the value of the '<em><b>Weather</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weather</em>' containment reference.
	 * @see #setWeather(HistoricalAggregatedTraffic_data_weather)
	 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic_data_Weather()
	 * @model containment="true"
	 * @generated
	 */
	HistoricalAggregatedTraffic_data_weather getWeather();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalAggregatedTraffic_data#getWeather <em>Weather</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weather</em>' containment reference.
	 * @see #getWeather()
	 * @generated
	 */
	void setWeather(HistoricalAggregatedTraffic_data_weather value);

} // HistoricalAggregatedTraffic_data
