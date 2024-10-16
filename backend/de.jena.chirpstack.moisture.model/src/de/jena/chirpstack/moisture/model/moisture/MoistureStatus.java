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

import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moisture Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getObservedArea <em>Observed Area</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getWater <em>Water</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getConduct <em>Conduct</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getMoistureStatus()
 * @model
 * @generated
 */
@ProviderType
public interface MoistureStatus extends Service {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getMoistureStatus_Value()
	 * @model annotation="Metadata sensorthings.unit.name='Prozent'"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Observed Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observed Area</em>' attribute.
	 * @see #setObservedArea(GeoJsonObject)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getMoistureStatus_ObservedArea()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EGeoJsonObject"
	 *        annotation="Metadata sensorthings.observedArea='true'"
	 * @generated
	 */
	GeoJsonObject getObservedArea();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getObservedArea <em>Observed Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed Area</em>' attribute.
	 * @see #getObservedArea()
	 * @generated
	 */
	void setObservedArea(GeoJsonObject value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getMoistureStatus_Temperature()
	 * @model
	 * @generated
	 */
	double getTemperature();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(double value);

	/**
	 * Returns the value of the '<em><b>Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water</em>' attribute.
	 * @see #setWater(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getMoistureStatus_Water()
	 * @model
	 * @generated
	 */
	double getWater();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getWater <em>Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water</em>' attribute.
	 * @see #getWater()
	 * @generated
	 */
	void setWater(double value);

	/**
	 * Returns the value of the '<em><b>Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conduct</em>' attribute.
	 * @see #setConduct(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getMoistureStatus_Conduct()
	 * @model
	 * @generated
	 */
	double getConduct();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.MoistureStatus#getConduct <em>Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conduct</em>' attribute.
	 * @see #getConduct()
	 * @generated
	 */
	void setConduct(double value);

} // MoistureStatus
