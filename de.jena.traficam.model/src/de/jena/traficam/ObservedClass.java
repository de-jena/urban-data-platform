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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observed Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The objects of one class that one camera saw in one window: one service of the TrafiCam provider.
 * 
 * The class appears twice, and the two are not the same thing. classId is what the MQTT topic says and what names the service. classificationName is what the camera calls that class, which the adapter resolves from the classMap of a CamConfig that arrived earlier on another topic - a cross-message lookup, so it is resolved before the engine sees the payload.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.ObservedClass#getClassId <em>Class Id</em>}</li>
 *   <li>{@link de.jena.traficam.ObservedClass#getClassificationName <em>Classification Name</em>}</li>
 *   <li>{@link de.jena.traficam.ObservedClass#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see de.jena.traficam.TrafiCamPackage#getObservedClass()
 * @model
 * @generated
 */
@ProviderType
public interface ObservedClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object class, from the fourth segment of the MQTT topic. It names the service, and it is the key the classMap of the camera configuration is read with.
	 * 
	 * A string, not the EShort of TrafiCamObject.classId: the topic segment is what groups the window, and it is what the classMap is keyed by.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Id</em>' attribute.
	 * @see #setClassId(String)
	 * @see de.jena.traficam.TrafiCamPackage#getObservedClass_ClassId()
	 * @model
	 * @generated
	 */
	String getClassId();

	/**
	 * Sets the value of the '{@link de.jena.traficam.ObservedClass#getClassId <em>Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Id</em>' attribute.
	 * @see #getClassId()
	 * @generated
	 */
	void setClassId(String value);

	/**
	 * Returns the value of the '<em><b>Classification Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The readable name of the class, resolved by the adapter from the classMap of the camera configuration. It falls back to classId while no configuration for this camera has arrived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification Name</em>' attribute.
	 * @see #setClassificationName(String)
	 * @see de.jena.traficam.TrafiCamPackage#getObservedClass_ClassificationName()
	 * @model
	 * @generated
	 */
	String getClassificationName();

	/**
	 * Sets the value of the '{@link de.jena.traficam.ObservedClass#getClassificationName <em>Classification Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Name</em>' attribute.
	 * @see #getClassificationName()
	 * @generated
	 */
	void setClassificationName(String value);

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.traficam.TrafiCamObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The objects seen in this window, already reduced to one entry per object id - the first sighting of each, which is what the window keeps.
	 * 
	 * The list is not a resource itself. The GeoJSON FeatureCollection the twin publishes is computed from it by a value function, the way the viewport is computed from a Scene.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see de.jena.traficam.TrafiCamPackage#getObservedClass_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrafiCamObject> getObjects();

} // ObservedClass
