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
 * A representation of the model object '<em><b>Base Serie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.BaseSerie#getTravelMode <em>Travel Mode</em>}</li>
 *   <li>{@link de.jena.bike.BaseSerie#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see de.jena.bike.BikePackage#getBaseSerie()
 * @model
 * @generated
 */
@ProviderType
public interface BaseSerie extends EObject {
	/**
	 * Returns the value of the '<em><b>Travel Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Mode</em>' containment reference.
	 * @see #setTravelMode(BaseSerie_travelMode)
	 * @see de.jena.bike.BikePackage#getBaseSerie_TravelMode()
	 * @model containment="true"
	 * @generated
	 */
	BaseSerie_travelMode getTravelMode();

	/**
	 * Sets the value of the '{@link de.jena.bike.BaseSerie#getTravelMode <em>Travel Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Mode</em>' containment reference.
	 * @see #getTravelMode()
	 * @generated
	 */
	void setTravelMode(BaseSerie_travelMode value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' containment reference.
	 * @see #setDirection(BaseSerie_direction)
	 * @see de.jena.bike.BikePackage#getBaseSerie_Direction()
	 * @model containment="true"
	 * @generated
	 */
	BaseSerie_direction getDirection();

	/**
	 * Sets the value of the '{@link de.jena.bike.BaseSerie#getDirection <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' containment reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(BaseSerie_direction value);

} // BaseSerie
