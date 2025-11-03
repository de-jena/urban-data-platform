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
 * A representation of the model object '<em><b>Suspect Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.SuspectPojo#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.SuspectPojo#getAlarmId <em>Alarm Id</em>}</li>
 *   <li>{@link de.jena.model.glt.SuspectPojo#getState <em>State</em>}</li>
 *   <li>{@link de.jena.model.glt.SuspectPojo#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.glt.SuspectPojo#getSeverity <em>Severity</em>}</li>
 *   <li>{@link de.jena.model.glt.SuspectPojo#getRecognized <em>Recognized</em>}</li>
 *   <li>{@link de.jena.model.glt.SuspectPojo#getBy <em>By</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getSuspectPojo()
 * @model
 * @generated
 */
@ProviderType
public interface SuspectPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Id</em>' attribute.
	 * @see #setSystemId(String)
	 * @see de.jena.model.glt.GltPackage#getSuspectPojo_SystemId()
	 * @model unique="false"
	 * @generated
	 */
	String getSystemId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SuspectPojo#getSystemId <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Id</em>' attribute.
	 * @see #getSystemId()
	 * @generated
	 */
	void setSystemId(String value);

	/**
	 * Returns the value of the '<em><b>Alarm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Id</em>' attribute.
	 * @see #setAlarmId(String)
	 * @see de.jena.model.glt.GltPackage#getSuspectPojo_AlarmId()
	 * @model unique="false"
	 * @generated
	 */
	String getAlarmId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SuspectPojo#getAlarmId <em>Alarm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Id</em>' attribute.
	 * @see #getAlarmId()
	 * @generated
	 */
	void setAlarmId(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see de.jena.model.glt.GltPackage#getSuspectPojo_State()
	 * @model unique="false"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SuspectPojo#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(BigInteger)
	 * @see de.jena.model.glt.GltPackage#getSuspectPojo_Timestamp()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SuspectPojo#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(Integer)
	 * @see de.jena.model.glt.GltPackage#getSuspectPojo_Severity()
	 * @model unique="false"
	 * @generated
	 */
	Integer getSeverity();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SuspectPojo#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Integer value);

	/**
	 * Returns the value of the '<em><b>Recognized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recognized</em>' attribute.
	 * @see #setRecognized(String)
	 * @see de.jena.model.glt.GltPackage#getSuspectPojo_Recognized()
	 * @model unique="false"
	 * @generated
	 */
	String getRecognized();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SuspectPojo#getRecognized <em>Recognized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recognized</em>' attribute.
	 * @see #getRecognized()
	 * @generated
	 */
	void setRecognized(String value);

	/**
	 * Returns the value of the '<em><b>By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By</em>' attribute.
	 * @see #setBy(String)
	 * @see de.jena.model.glt.GltPackage#getSuspectPojo_By()
	 * @model unique="false"
	 * @generated
	 */
	String getBy();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SuspectPojo#getBy <em>By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By</em>' attribute.
	 * @see #getBy()
	 * @generated
	 */
	void setBy(String value);

} // SuspectPojo
