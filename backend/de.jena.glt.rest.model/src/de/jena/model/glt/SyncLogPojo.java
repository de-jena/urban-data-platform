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
 * A representation of the model object '<em><b>Sync Log Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.SyncLogPojo#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.SyncLogPojo#getState <em>State</em>}</li>
 *   <li>{@link de.jena.model.glt.SyncLogPojo#getLatestRingbufferTimestamp <em>Latest Ringbuffer Timestamp</em>}</li>
 *   <li>{@link de.jena.model.glt.SyncLogPojo#getLastAccessTimeMs <em>Last Access Time Ms</em>}</li>
 *   <li>{@link de.jena.model.glt.SyncLogPojo#getAverageAccessTimeMs <em>Average Access Time Ms</em>}</li>
 *   <li>{@link de.jena.model.glt.SyncLogPojo#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.glt.SyncLogPojo#getStateSince <em>State Since</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getSyncLogPojo()
 * @model
 * @generated
 */
@ProviderType
public interface SyncLogPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Id</em>' attribute.
	 * @see #setSystemId(String)
	 * @see de.jena.model.glt.GltPackage#getSyncLogPojo_SystemId()
	 * @model unique="false"
	 * @generated
	 */
	String getSystemId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SyncLogPojo#getSystemId <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Id</em>' attribute.
	 * @see #getSystemId()
	 * @generated
	 */
	void setSystemId(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see de.jena.model.glt.GltPackage#getSyncLogPojo_State()
	 * @model unique="false"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SyncLogPojo#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Latest Ringbuffer Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Ringbuffer Timestamp</em>' attribute.
	 * @see #setLatestRingbufferTimestamp(BigInteger)
	 * @see de.jena.model.glt.GltPackage#getSyncLogPojo_LatestRingbufferTimestamp()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getLatestRingbufferTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SyncLogPojo#getLatestRingbufferTimestamp <em>Latest Ringbuffer Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Ringbuffer Timestamp</em>' attribute.
	 * @see #getLatestRingbufferTimestamp()
	 * @generated
	 */
	void setLatestRingbufferTimestamp(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Last Access Time Ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Access Time Ms</em>' attribute.
	 * @see #setLastAccessTimeMs(BigInteger)
	 * @see de.jena.model.glt.GltPackage#getSyncLogPojo_LastAccessTimeMs()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getLastAccessTimeMs();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SyncLogPojo#getLastAccessTimeMs <em>Last Access Time Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Access Time Ms</em>' attribute.
	 * @see #getLastAccessTimeMs()
	 * @generated
	 */
	void setLastAccessTimeMs(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Average Access Time Ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Access Time Ms</em>' attribute.
	 * @see #setAverageAccessTimeMs(Double)
	 * @see de.jena.model.glt.GltPackage#getSyncLogPojo_AverageAccessTimeMs()
	 * @model unique="false"
	 * @generated
	 */
	Double getAverageAccessTimeMs();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SyncLogPojo#getAverageAccessTimeMs <em>Average Access Time Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Access Time Ms</em>' attribute.
	 * @see #getAverageAccessTimeMs()
	 * @generated
	 */
	void setAverageAccessTimeMs(Double value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(BigInteger)
	 * @see de.jena.model.glt.GltPackage#getSyncLogPojo_Timestamp()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SyncLogPojo#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(BigInteger value);

	/**
	 * Returns the value of the '<em><b>State Since</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Since</em>' attribute.
	 * @see #setStateSince(BigInteger)
	 * @see de.jena.model.glt.GltPackage#getSyncLogPojo_StateSince()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getStateSince();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SyncLogPojo#getStateSince <em>State Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Since</em>' attribute.
	 * @see #getStateSince()
	 * @generated
	 */
	void setStateSince(BigInteger value);

} // SyncLogPojo
