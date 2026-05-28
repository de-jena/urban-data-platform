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
package de.jena.chirpstack.model.chirpstack;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PMX Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.PMXStatus#getVolts <em>Volts</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.PMXStatus#getCounterCategory <em>Counter Category</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.PMXStatus#getCounterKind <em>Counter Kind</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.PMXStatus#getTimestampUtcHhmm <em>Timestamp Utc Hhmm</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getPMXStatus()
 * @model
 * @generated
 */
@ProviderType
public interface PMXStatus extends Service {
	/**
	 * Returns the value of the '<em><b>Volts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volts</em>' attribute.
	 * @see #setVolts(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getPMXStatus_Volts()
	 * @model annotation="mapping path='object/volts'"
	 * @generated
	 */
	double getVolts();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.PMXStatus#getVolts <em>Volts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volts</em>' attribute.
	 * @see #getVolts()
	 * @generated
	 */
	void setVolts(double value);

	/**
	 * Returns the value of the '<em><b>Counter Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Category</em>' attribute.
	 * @see #setCounterCategory(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getPMXStatus_CounterCategory()
	 * @model annotation="mapping path='object/counter_category'"
	 * @generated
	 */
	double getCounterCategory();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.PMXStatus#getCounterCategory <em>Counter Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Category</em>' attribute.
	 * @see #getCounterCategory()
	 * @generated
	 */
	void setCounterCategory(double value);

	/**
	 * Returns the value of the '<em><b>Counter Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Kind</em>' attribute.
	 * @see #setCounterKind(String)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getPMXStatus_CounterKind()
	 * @model annotation="mapping path='object/counter_kind'"
	 * @generated
	 */
	String getCounterKind();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.PMXStatus#getCounterKind <em>Counter Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Kind</em>' attribute.
	 * @see #getCounterKind()
	 * @generated
	 */
	void setCounterKind(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp Utc Hhmm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp Utc Hhmm</em>' attribute.
	 * @see #setTimestampUtcHhmm(String)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getPMXStatus_TimestampUtcHhmm()
	 * @model annotation="mapping path='object/timestamp_utc_hhmm'"
	 * @generated
	 */
	String getTimestampUtcHhmm();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.PMXStatus#getTimestampUtcHhmm <em>Timestamp Utc Hhmm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp Utc Hhmm</em>' attribute.
	 * @see #getTimestampUtcHhmm()
	 * @generated
	 */
	void setTimestampUtcHhmm(String value);

} // PMXStatus
