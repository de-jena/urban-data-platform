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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Historical Aggregated Traffic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.HistoricalAggregatedTraffic#getData <em>Data</em>}</li>
 *   <li>{@link de.jena.bike.HistoricalAggregatedTraffic#getDirectionName <em>Direction Name</em>}</li>
 *   <li>{@link de.jena.bike.HistoricalAggregatedTraffic#getFlowID <em>Flow ID</em>}</li>
 *   <li>{@link de.jena.bike.HistoricalAggregatedTraffic#getFlowName <em>Flow Name</em>}</li>
 * </ul>
 *
 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic()
 * @model
 * @generated
 */
@ProviderType
public interface HistoricalAggregatedTraffic extends BaseSerie {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.bike.HistoricalAggregatedTraffic_data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<HistoricalAggregatedTraffic_data> getData();

	/**
	 * Returns the value of the '<em><b>Direction Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Name</em>' containment reference.
	 * @see #setDirectionName(DirectionName)
	 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic_DirectionName()
	 * @model containment="true"
	 * @generated
	 */
	DirectionName getDirectionName();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalAggregatedTraffic#getDirectionName <em>Direction Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Name</em>' containment reference.
	 * @see #getDirectionName()
	 * @generated
	 */
	void setDirectionName(DirectionName value);

	/**
	 * Returns the value of the '<em><b>Flow ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow ID</em>' attribute.
	 * @see #setFlowID(BigInteger)
	 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic_FlowID()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getFlowID();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalAggregatedTraffic#getFlowID <em>Flow ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow ID</em>' attribute.
	 * @see #getFlowID()
	 * @generated
	 */
	void setFlowID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Flow Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Name</em>' attribute.
	 * @see #setFlowName(String)
	 * @see de.jena.bike.BikePackage#getHistoricalAggregatedTraffic_FlowName()
	 * @model unique="false"
	 * @generated
	 */
	String getFlowName();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalAggregatedTraffic#getFlowName <em>Flow Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Name</em>' attribute.
	 * @see #getFlowName()
	 * @generated
	 */
	void setFlowName(String value);

} // HistoricalAggregatedTraffic
