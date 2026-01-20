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
 * A representation of the model object '<em><b>Historical Aggregated Traffic data weather</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.HistoricalAggregatedTraffic_data_weather#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link de.jena.bike.HistoricalAggregatedTraffic_data_weather#getRainAccumulation <em>Rain Accumulation</em>}</li>
 *   <li>{@link de.jena.bike.HistoricalAggregatedTraffic_data_weather#getSnowAccumulation <em>Snow Accumulation</em>}</li>
 * </ul>
 *
 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic_data_weather()
 * @model
 * @generated
 */
@ProviderType
public interface HistoricalAggregatedTraffic_data_weather extends EObject {
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(Float)
	 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic_data_weather_Temperature()
	 * @model unique="false"
	 * @generated
	 */
	Float getTemperature();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalAggregatedTraffic_data_weather#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(Float value);

	/**
	 * Returns the value of the '<em><b>Rain Accumulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rain Accumulation</em>' attribute.
	 * @see #setRainAccumulation(Float)
	 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic_data_weather_RainAccumulation()
	 * @model unique="false"
	 * @generated
	 */
	Float getRainAccumulation();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalAggregatedTraffic_data_weather#getRainAccumulation <em>Rain Accumulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rain Accumulation</em>' attribute.
	 * @see #getRainAccumulation()
	 * @generated
	 */
	void setRainAccumulation(Float value);

	/**
	 * Returns the value of the '<em><b>Snow Accumulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snow Accumulation</em>' attribute.
	 * @see #setSnowAccumulation(Float)
	 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic_data_weather_SnowAccumulation()
	 * @model unique="false"
	 * @generated
	 */
	Float getSnowAccumulation();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalAggregatedTraffic_data_weather#getSnowAccumulation <em>Snow Accumulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snow Accumulation</em>' attribute.
	 * @see #getSnowAccumulation()
	 * @generated
	 */
	void setSnowAccumulation(Float value);

} // HistoricalAggregatedTraffic_data_weather
