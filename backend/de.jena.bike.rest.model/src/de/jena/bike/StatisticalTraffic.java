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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistical Traffic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.StatisticalTraffic#getSiteId <em>Site Id</em>}</li>
 *   <li>{@link de.jena.bike.StatisticalTraffic#getDate <em>Date</em>}</li>
 *   <li>{@link de.jena.bike.StatisticalTraffic#getTravelMode <em>Travel Mode</em>}</li>
 *   <li>{@link de.jena.bike.StatisticalTraffic#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.jena.bike.StatisticalTraffic#getDirectionName <em>Direction Name</em>}</li>
 *   <li>{@link de.jena.bike.StatisticalTraffic#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.jena.bike.BikePackage#getStatisticalTraffic()
 * @model
 * @generated
 */
@ProviderType
public interface StatisticalTraffic extends EObject {
	/**
	 * Returns the value of the '<em><b>Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Id</em>' attribute.
	 * @see #setSiteId(BigInteger)
	 * @see de.jena.bike.BikePackage#getStatisticalTraffic_SiteId()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getSiteId();

	/**
	 * Sets the value of the '{@link de.jena.bike.StatisticalTraffic#getSiteId <em>Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Id</em>' attribute.
	 * @see #getSiteId()
	 * @generated
	 */
	void setSiteId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see de.jena.bike.BikePackage#getStatisticalTraffic_Date()
	 * @model unique="false"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link de.jena.bike.StatisticalTraffic#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Travel Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Mode</em>' containment reference.
	 * @see #setTravelMode(TravelModeLabel)
	 * @see de.jena.bike.BikePackage#getStatisticalTraffic_TravelMode()
	 * @model containment="true"
	 * @generated
	 */
	TravelModeLabel getTravelMode();

	/**
	 * Sets the value of the '{@link de.jena.bike.StatisticalTraffic#getTravelMode <em>Travel Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Mode</em>' containment reference.
	 * @see #getTravelMode()
	 * @generated
	 */
	void setTravelMode(TravelModeLabel value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' containment reference.
	 * @see #setDirection(Direction)
	 * @see de.jena.bike.BikePackage#getStatisticalTraffic_Direction()
	 * @model containment="true"
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link de.jena.bike.StatisticalTraffic#getDirection <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' containment reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Direction Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Name</em>' containment reference.
	 * @see #setDirectionName(DirectionName)
	 * @see de.jena.bike.BikePackage#getStatisticalTraffic_DirectionName()
	 * @model containment="true"
	 * @generated
	 */
	DirectionName getDirectionName();

	/**
	 * Sets the value of the '{@link de.jena.bike.StatisticalTraffic#getDirectionName <em>Direction Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Name</em>' containment reference.
	 * @see #getDirectionName()
	 * @generated
	 */
	void setDirectionName(DirectionName value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see de.jena.bike.BikePackage#getStatisticalTraffic_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link de.jena.bike.StatisticalTraffic#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // StatisticalTraffic
