/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.traficam;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One flushed detection window of one camera: everything it saw since the last flush, grouped by object class.
 * 
 * The camera sends one binary TrafiCamObject per detection on 5g/traficam/<cam>/<class>. TrafiCamListener windows those, reduces them per object id, then fills this object and hands it to the mapping engine. The aggregation stays in the adapter - it is state the engine does not hold - while the provider shaping becomes a mapping over this object.
 * 
 * It is built in process and never travels on MQTT, so its features carry no positional constraint: unlike CamConfig, where BinaryResourceImpl identifies a feature by its position and a new attribute has to come last, a feature may be added here anywhere.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.TrafiCamDetections#getCamId <em>Cam Id</em>}</li>
 *   <li>{@link de.jena.traficam.TrafiCamDetections#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.traficam.TrafiCamDetections#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see de.jena.traficam.TrafiCamPackage#getTrafiCamDetections()
 * @model
 * @generated
 */
@ProviderType
public interface TrafiCamDetections extends EObject {
	/**
	 * Returns the value of the '<em><b>Cam Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The camera, taken from the third segment of the MQTT topic. The mapping takes the provider id from it, the same value CamConfig.camId carries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cam Id</em>' attribute.
	 * @see #setCamId(String)
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCamDetections_CamId()
	 * @model
	 * @generated
	 */
	String getCamId();

	/**
	 * Sets the value of the '{@link de.jena.traficam.TrafiCamDetections#getCamId <em>Cam Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cam Id</em>' attribute.
	 * @see #getCamId()
	 * @generated
	 */
	void setCamId(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the window was flushed, which is the instant the whole provider is stamped with. The engine reads an EDate as a timestamp as it stands, so a TimestampMapping needs no hint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCamDetections_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link de.jena.traficam.TrafiCamDetections#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.traficam.ObservedClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object classes this window saw, one entry each, and one service of the twin each.
	 * 
	 * The fan-out is intrinsic: a service mapping whose referencedResource path ends on this collection, and whose name is produced rather than constant, builds one service per entry. A constant name would keep selecting a single element instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCamDetections_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObservedClass> getClasses();

} // TrafiCamDetections
