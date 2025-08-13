/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.jena.chirpstack.moisture.model.moisture;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teros21</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Teros21#getPotentialWater1 <em>Potential Water1</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Teros21#getPotentialWater2 <em>Potential Water2</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Teros21#getTemperatur1 <em>Temperatur1</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Teros21#getTemperatur2 <em>Temperatur2</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Teros21#getBattery <em>Battery</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getTeros21()
 * @model
 * @generated
 */
@ProviderType
public interface Teros21 extends Service {
	/**
	 * Returns the value of the '<em><b>Potential Water1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potential Water1</em>' attribute.
	 * @see #setPotentialWater1(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getTeros21_PotentialWater1()
	 * @model annotation="mapping path='object/potentialwater_1'"
	 * @generated
	 */
	double getPotentialWater1();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Teros21#getPotentialWater1 <em>Potential Water1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Potential Water1</em>' attribute.
	 * @see #getPotentialWater1()
	 * @generated
	 */
	void setPotentialWater1(double value);

	/**
	 * Returns the value of the '<em><b>Potential Water2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potential Water2</em>' attribute.
	 * @see #setPotentialWater2(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getTeros21_PotentialWater2()
	 * @model annotation="mapping path='object/potentialwater_2'"
	 * @generated
	 */
	double getPotentialWater2();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Teros21#getPotentialWater2 <em>Potential Water2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Potential Water2</em>' attribute.
	 * @see #getPotentialWater2()
	 * @generated
	 */
	void setPotentialWater2(double value);

	/**
	 * Returns the value of the '<em><b>Temperatur1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperatur1</em>' attribute.
	 * @see #setTemperatur1(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getTeros21_Temperatur1()
	 * @model annotation="mapping path='object/temp_1'"
	 * @generated
	 */
	double getTemperatur1();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Teros21#getTemperatur1 <em>Temperatur1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperatur1</em>' attribute.
	 * @see #getTemperatur1()
	 * @generated
	 */
	void setTemperatur1(double value);

	/**
	 * Returns the value of the '<em><b>Temperatur2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperatur2</em>' attribute.
	 * @see #setTemperatur2(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getTeros21_Temperatur2()
	 * @model annotation="mapping path='object/temp_2'"
	 * @generated
	 */
	double getTemperatur2();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Teros21#getTemperatur2 <em>Temperatur2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperatur2</em>' attribute.
	 * @see #getTemperatur2()
	 * @generated
	 */
	void setTemperatur2(double value);

	/**
	 * Returns the value of the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery</em>' attribute.
	 * @see #setBattery(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getTeros21_Battery()
	 * @model annotation="mapping path='object/battery_voltage'"
	 * @generated
	 */
	double getBattery();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Teros21#getBattery <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery</em>' attribute.
	 * @see #getBattery()
	 * @generated
	 */
	void setBattery(double value);

} // Teros21
