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
package de.jena.chirpstack.model.dummymoisture;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.chirpstack.model.dummymoisture.DummyMoisturePackage
 * @generated
 */
@ProviderType
public interface DummyMoistureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DummyMoistureFactory eINSTANCE = de.jena.chirpstack.model.dummymoisture.impl.DummyMoistureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Moisture Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moisture Sensor</em>'.
	 * @generated
	 */
	MoistureSensor createMoistureSensor();

	/**
	 * Returns a new object of class '<em>Moisture Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moisture Status</em>'.
	 * @generated
	 */
	MoistureStatus createMoistureStatus();

	/**
	 * Returns a new object of class '<em>Moisture Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moisture Admin</em>'.
	 * @generated
	 */
	MoistureAdmin createMoistureAdmin();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DummyMoisturePackage getDummyMoisturePackage();

} //DummyMoistureFactory
