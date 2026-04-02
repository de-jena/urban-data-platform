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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Historical Raw Traffic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.HistoricalRawTraffic#getFlowID <em>Flow ID</em>}</li>
 *   <li>{@link de.jena.bike.HistoricalRawTraffic#getFlowName <em>Flow Name</em>}</li>
 *   <li>{@link de.jena.bike.HistoricalRawTraffic#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see de.jena.bike.BikePackage#getHistoricalRawTraffic()
 * @model
 * @generated
 */
@ProviderType
public interface HistoricalRawTraffic extends EObject {
	/**
	 * Returns the value of the '<em><b>Flow ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow ID</em>' attribute.
	 * @see #setFlowID(BigInteger)
	 * @see de.jena.bike.BikePackage#getHistoricalRawTraffic_FlowID()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getFlowID();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalRawTraffic#getFlowID <em>Flow ID</em>}' attribute.
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
	 * @see de.jena.bike.BikePackage#getHistoricalRawTraffic_FlowName()
	 * @model unique="false"
	 * @generated
	 */
	String getFlowName();

	/**
	 * Sets the value of the '{@link de.jena.bike.HistoricalRawTraffic#getFlowName <em>Flow Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Name</em>' attribute.
	 * @see #getFlowName()
	 * @generated
	 */
	void setFlowName(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.bike.HistoricalRawTraffic_data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see de.jena.bike.BikePackage#getHistoricalRawTraffic_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<HistoricalRawTraffic_data> getData();

} // HistoricalRawTraffic
