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
package de.jena.model.glt;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.TimeWindow#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeWindow#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeWindow#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeWindow#getZoneId <em>Zone Id</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getTimeWindow()
 * @model
 * @generated
 */
@ProviderType
public interface TimeWindow extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(BigInteger)
	 * @see de.jena.model.glt.GltPackage#getTimeWindow_Timestamp()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeWindow#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see de.jena.model.glt.GltPackage#getTimeWindow_Identifier()
	 * @model unique="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeWindow#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see de.jena.model.glt.GltPackage#getTimeWindow_Unit()
	 * @model unique="false"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeWindow#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Id</em>' attribute.
	 * @see #setZoneId(String)
	 * @see de.jena.model.glt.GltPackage#getTimeWindow_ZoneId()
	 * @model unique="false"
	 * @generated
	 */
	String getZoneId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeWindow#getZoneId <em>Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Id</em>' attribute.
	 * @see #getZoneId()
	 * @generated
	 */
	void setZoneId(String value);

} // TimeWindow
