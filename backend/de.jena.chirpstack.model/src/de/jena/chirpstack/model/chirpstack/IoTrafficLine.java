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
 * A representation of the model object '<em><b>Io Traffic Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getPerson <em>Person</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getBicycle <em>Bicycle</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getCar <em>Car</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getBus <em>Bus</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getTruck <em>Truck</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getMotorbike <em>Motorbike</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getTrain <em>Train</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getTotal <em>Total</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficLine()
 * @model
 * @generated
 */
@ProviderType
public interface IoTrafficLine extends Service {
	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficLine_LineNumber()
	 * @model annotation="mapping path='line_number'"
	 * @generated
	 */
	double getLineNumber();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(double value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' attribute.
	 * @see #setPerson(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficLine_Person()
	 * @model annotation="mapping path='person'"
	 * @generated
	 */
	double getPerson();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getPerson <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' attribute.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(double value);

	/**
	 * Returns the value of the '<em><b>Bicycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bicycle</em>' attribute.
	 * @see #setBicycle(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficLine_Bicycle()
	 * @model annotation="mapping path='bicycle'"
	 * @generated
	 */
	double getBicycle();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getBicycle <em>Bicycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bicycle</em>' attribute.
	 * @see #getBicycle()
	 * @generated
	 */
	void setBicycle(double value);

	/**
	 * Returns the value of the '<em><b>Car</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car</em>' attribute.
	 * @see #setCar(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficLine_Car()
	 * @model annotation="mapping path='car'"
	 * @generated
	 */
	double getCar();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getCar <em>Car</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car</em>' attribute.
	 * @see #getCar()
	 * @generated
	 */
	void setCar(double value);

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' attribute.
	 * @see #setBus(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficLine_Bus()
	 * @model annotation="mapping path='bus'"
	 * @generated
	 */
	double getBus();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getBus <em>Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus</em>' attribute.
	 * @see #getBus()
	 * @generated
	 */
	void setBus(double value);

	/**
	 * Returns the value of the '<em><b>Truck</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Truck</em>' attribute.
	 * @see #setTruck(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficLine_Truck()
	 * @model annotation="mapping path='truck'"
	 * @generated
	 */
	double getTruck();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getTruck <em>Truck</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Truck</em>' attribute.
	 * @see #getTruck()
	 * @generated
	 */
	void setTruck(double value);

	/**
	 * Returns the value of the '<em><b>Motorbike</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motorbike</em>' attribute.
	 * @see #setMotorbike(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficLine_Motorbike()
	 * @model annotation="mapping path='motorbike'"
	 * @generated
	 */
	double getMotorbike();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getMotorbike <em>Motorbike</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motorbike</em>' attribute.
	 * @see #getMotorbike()
	 * @generated
	 */
	void setMotorbike(double value);

	/**
	 * Returns the value of the '<em><b>Train</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train</em>' attribute.
	 * @see #setTrain(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficLine_Train()
	 * @model annotation="mapping path='train'"
	 * @generated
	 */
	double getTrain();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getTrain <em>Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train</em>' attribute.
	 * @see #getTrain()
	 * @generated
	 */
	void setTrain(double value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficLine_Total()
	 * @model annotation="mapping path='total'"
	 * @generated
	 */
	double getTotal();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficLine#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(double value);

} // IoTrafficLine
