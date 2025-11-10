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
package de.jena.udp.reference.area.sensinact.model.sensinactrefarea;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getGid <em>Gid</em>}</li>
 *   <li>{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getSensorCount <em>Sensor Count</em>}</li>
 *   <li>{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getTourName <em>Tour Name</em>}</li>
 *   <li>{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaPackage#getReferenceArea()
 * @model
 * @generated
 */
@ProviderType
public interface ReferenceArea extends Service {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name/identifier of the reference area (e.g., ZW-01, ZW-02)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaPackage#getReferenceArea_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique geographic identifier for the reference area
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gid</em>' attribute.
	 * @see #setGid(float)
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaPackage#getReferenceArea_Gid()
	 * @model
	 * @generated
	 */
	float getGid();

	/**
	 * Sets the value of the '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getGid <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gid</em>' attribute.
	 * @see #getGid()
	 * @generated
	 */
	void setGid(float value);

	/**
	 * Returns the value of the '<em><b>Sensor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of sensors (anzahl_sens) in this reference area
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sensor Count</em>' attribute.
	 * @see #setSensorCount(int)
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaPackage#getReferenceArea_SensorCount()
	 * @model
	 * @generated
	 */
	int getSensorCount();

	/**
	 * Sets the value of the '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getSensorCount <em>Sensor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Count</em>' attribute.
	 * @see #getSensorCount()
	 * @generated
	 */
	void setSensorCount(int value);

	/**
	 * Returns the value of the '<em><b>Tour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Long tour name describing the location (tour_name_lang)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tour Name</em>' attribute.
	 * @see #setTourName(String)
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaPackage#getReferenceArea_TourName()
	 * @model
	 * @generated
	 */
	String getTourName();

	/**
	 * Sets the value of the '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getTourName <em>Tour Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tour Name</em>' attribute.
	 * @see #getTourName()
	 * @generated
	 */
	void setTourName(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType
	 * @see #setColor(ColorType)
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaPackage#getReferenceArea_Color()
	 * @model
	 * @generated
	 */
	ColorType getColor();

	/**
	 * Sets the value of the '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType
	 * @see #getColor()
	 * @generated
	 */
	void setColor(ColorType value);

} // ReferenceArea
