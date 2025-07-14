/**
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
package de.jena.chirpstack.moisture.model.moisture.impl;

import de.jena.chirpstack.moisture.model.moisture.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChirpstackMoistureFactoryImpl extends EFactoryImpl implements ChirpstackMoistureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChirpstackMoistureFactory init() {
		try {
			ChirpstackMoistureFactory theChirpstackMoistureFactory = (ChirpstackMoistureFactory)EPackage.Registry.INSTANCE.getEFactory(ChirpstackMoisturePackage.eNS_URI);
			if (theChirpstackMoistureFactory != null) {
				return theChirpstackMoistureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChirpstackMoistureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChirpstackMoistureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ChirpstackMoisturePackage.DRAGINO: return createDragino();
			case ChirpstackMoisturePackage.SENSOR: return createSensor();
			case ChirpstackMoisturePackage.SOIL: return createSoil();
			case ChirpstackMoisturePackage.DEVICE: return createDevice();
			case ChirpstackMoisturePackage.MOISTURE_SENSOR: return createMoistureSensor();
			case ChirpstackMoisturePackage.MOISTURE_STATUS: return createMoistureStatus();
			case ChirpstackMoisturePackage.MOISTURE_ADMIN: return createMoistureAdmin();
			case ChirpstackMoisturePackage.SENSE_CAP: return createSenseCap();
			case ChirpstackMoisturePackage.SENSE_CAP2: return createSenseCap2();
			case ChirpstackMoisturePackage.SENSE_CAP3: return createSenseCap3();
			case ChirpstackMoisturePackage.AIR: return createAir();
			case ChirpstackMoisturePackage.RAIN: return createRain();
			case ChirpstackMoisturePackage.LIGHT: return createLight();
			case ChirpstackMoisturePackage.TEKTELIC: return createTEKTELIC();
			case ChirpstackMoisturePackage.TSOIL: return createTSoil();
			case ChirpstackMoisturePackage.EM310: return createEM310();
			case ChirpstackMoisturePackage.TRASH: return createTrash();
			case ChirpstackMoisturePackage.SN50: return createSN50();
			case ChirpstackMoisturePackage.SN: return createSN();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ChirpstackMoisturePackage.SOIL_TYPE:
				return createSoilTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ChirpstackMoisturePackage.SOIL_TYPE:
				return convertSoilTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dragino createDragino() {
		DraginoImpl dragino = new DraginoImpl();
		return dragino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Soil createSoil() {
		SoilImpl soil = new SoilImpl();
		return soil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoistureSensor createMoistureSensor() {
		MoistureSensorImpl moistureSensor = new MoistureSensorImpl();
		return moistureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoistureStatus createMoistureStatus() {
		MoistureStatusImpl moistureStatus = new MoistureStatusImpl();
		return moistureStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoistureAdmin createMoistureAdmin() {
		MoistureAdminImpl moistureAdmin = new MoistureAdminImpl();
		return moistureAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SenseCap createSenseCap() {
		SenseCapImpl senseCap = new SenseCapImpl();
		return senseCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SenseCap2 createSenseCap2() {
		SenseCap2Impl senseCap2 = new SenseCap2Impl();
		return senseCap2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SenseCap3 createSenseCap3() {
		SenseCap3Impl senseCap3 = new SenseCap3Impl();
		return senseCap3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Air createAir() {
		AirImpl air = new AirImpl();
		return air;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rain createRain() {
		RainImpl rain = new RainImpl();
		return rain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Light createLight() {
		LightImpl light = new LightImpl();
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEKTELIC createTEKTELIC() {
		TEKTELICImpl tektelic = new TEKTELICImpl();
		return tektelic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSoil createTSoil() {
		TSoilImpl tSoil = new TSoilImpl();
		return tSoil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EM310 createEM310() {
		EM310Impl em310 = new EM310Impl();
		return em310;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trash createTrash() {
		TrashImpl trash = new TrashImpl();
		return trash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SN50 createSN50() {
		SN50Impl sn50 = new SN50Impl();
		return sn50;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SN createSN() {
		SNImpl sn = new SNImpl();
		return sn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoilType createSoilTypeFromString(EDataType eDataType, String initialValue) {
		SoilType result = SoilType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSoilTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChirpstackMoisturePackage getChirpstackMoisturePackage() {
		return (ChirpstackMoisturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChirpstackMoisturePackage getPackage() {
		return ChirpstackMoisturePackage.eINSTANCE;
	}

} //ChirpstackMoistureFactoryImpl
