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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage
 * @generated
 */
@ProviderType
public interface ChirpstackMoistureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChirpstackMoistureFactory eINSTANCE = de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoistureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dragino</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dragino</em>'.
	 * @generated
	 */
	Dragino createDragino();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Soil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soil</em>'.
	 * @generated
	 */
	Soil createSoil();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

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
	 * Returns a new object of class '<em>Sense Cap S2120</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense Cap S2120</em>'.
	 * @generated
	 */
	SenseCapS2120 createSenseCapS2120();

	/**
	 * Returns a new object of class '<em>Sense Cap S2105</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense Cap S2105</em>'.
	 * @generated
	 */
	SenseCapS2105 createSenseCapS2105();

	/**
	 * Returns a new object of class '<em>Sense Cap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense Cap</em>'.
	 * @generated
	 */
	SenseCap createSenseCap();

	/**
	 * Returns a new object of class '<em>Air</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Air</em>'.
	 * @generated
	 */
	Air createAir();

	/**
	 * Returns a new object of class '<em>Rain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rain</em>'.
	 * @generated
	 */
	Rain createRain();

	/**
	 * Returns a new object of class '<em>Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light</em>'.
	 * @generated
	 */
	Light createLight();

	/**
	 * Returns a new object of class '<em>TEKTELIC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEKTELIC</em>'.
	 * @generated
	 */
	TEKTELIC createTEKTELIC();

	/**
	 * Returns a new object of class '<em>TSoil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSoil</em>'.
	 * @generated
	 */
	TSoil createTSoil();

	/**
	 * Returns a new object of class '<em>EM310</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EM310</em>'.
	 * @generated
	 */
	EM310 createEM310();

	/**
	 * Returns a new object of class '<em>Trash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trash</em>'.
	 * @generated
	 */
	Trash createTrash();

	/**
	 * Returns a new object of class '<em>SN50</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SN50</em>'.
	 * @generated
	 */
	SN50 createSN50();

	/**
	 * Returns a new object of class '<em>SN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SN</em>'.
	 * @generated
	 */
	SN createSN();

	/**
	 * Returns a new object of class '<em>Solidos Teros21</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solidos Teros21</em>'.
	 * @generated
	 */
	SolidosTeros21 createSolidosTeros21();

	/**
	 * Returns a new object of class '<em>Teros21</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Teros21</em>'.
	 * @generated
	 */
	Teros21 createTeros21();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ChirpstackMoisturePackage getChirpstackMoisturePackage();

} //ChirpstackMoistureFactory
