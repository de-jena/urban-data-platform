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

import de.jena.chirpstack.moisture.model.moisture.Air;
import de.jena.chirpstack.moisture.model.moisture.ChirpstackMoistureFactory;
import de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage;
import de.jena.chirpstack.moisture.model.moisture.Device;
import de.jena.chirpstack.moisture.model.moisture.Dragino;
import de.jena.chirpstack.moisture.model.moisture.Light;
import de.jena.chirpstack.moisture.model.moisture.MoistureAdmin;
import de.jena.chirpstack.moisture.model.moisture.MoistureSensor;
import de.jena.chirpstack.moisture.model.moisture.MoistureStatus;
import de.jena.chirpstack.moisture.model.moisture.Rain;
import de.jena.chirpstack.moisture.model.moisture.SenseCap;
import de.jena.chirpstack.moisture.model.moisture.SenseCap2;
import de.jena.chirpstack.moisture.model.moisture.SenseCap3;
import de.jena.chirpstack.moisture.model.moisture.Sensor;
import de.jena.chirpstack.moisture.model.moisture.Soil;
import de.jena.chirpstack.moisture.model.moisture.SoilType;
import de.jena.chirpstack.moisture.model.moisture.TSoil;
import de.jena.chirpstack.moisture.model.moisture.Trash;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sensinact.model.core.provider.ProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChirpstackMoisturePackageImpl extends EPackageImpl implements ChirpstackMoisturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass draginoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moistureSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moistureStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moistureAdminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senseCapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senseCap2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senseCap3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass airEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tektelicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSoilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass em310EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sn50EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum soilTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChirpstackMoisturePackageImpl() {
		super(eNS_URI, ChirpstackMoistureFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ChirpstackMoisturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ChirpstackMoisturePackage init() {
		if (isInited) return (ChirpstackMoisturePackage)EPackage.Registry.INSTANCE.getEPackage(ChirpstackMoisturePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredChirpstackMoisturePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ChirpstackMoisturePackageImpl theChirpstackMoisturePackage = registeredChirpstackMoisturePackage instanceof ChirpstackMoisturePackageImpl ? (ChirpstackMoisturePackageImpl)registeredChirpstackMoisturePackage : new ChirpstackMoisturePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ProviderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theChirpstackMoisturePackage.createPackageContents();

		// Initialize created meta-data
		theChirpstackMoisturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChirpstackMoisturePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChirpstackMoisturePackage.eNS_URI, theChirpstackMoisturePackage);
		return theChirpstackMoisturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDragino() {
		return draginoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDragino_Sensor() {
		return (EReference)draginoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDragino_Soil() {
		return (EReference)draginoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDragino_Device() {
		return (EReference)draginoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_Battery() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_Iflag() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_Sflag() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_Mod() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_TemperatureDS18B20() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoil() {
		return soilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoil_Temperature() {
		return (EAttribute)soilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoil_Water() {
		return (EAttribute)soilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoil_Conduct() {
		return (EAttribute)soilEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_DevEUI() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_Name() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_ProfileId() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_ProfileName() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_TenantId() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_TenantName() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_ApplicationId() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_ApplicationName() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoistureSensor() {
		return moistureSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoistureSensor_Name() {
		return (EAttribute)moistureSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMoistureSensor_Status() {
		return (EReference)moistureSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoistureStatus() {
		return moistureStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoistureStatus_Value() {
		return (EAttribute)moistureStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoistureStatus_ObservedArea() {
		return (EAttribute)moistureStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoistureStatus_Temperature() {
		return (EAttribute)moistureStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoistureStatus_Water() {
		return (EAttribute)moistureStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoistureStatus_Conduct() {
		return (EAttribute)moistureStatusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoistureAdmin() {
		return moistureAdminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoistureAdmin_SoilType() {
		return (EAttribute)moistureAdminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSenseCap() {
		return senseCapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenseCap_Air() {
		return (EReference)senseCapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenseCap_Rain() {
		return (EReference)senseCapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenseCap_Light() {
		return (EReference)senseCapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSenseCap2() {
		return senseCap2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenseCap2_Air() {
		return (EReference)senseCap2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenseCap2_Rain() {
		return (EReference)senseCap2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenseCap2_Light() {
		return (EReference)senseCap2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSenseCap3() {
		return senseCap3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenseCap3_Air() {
		return (EReference)senseCap3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenseCap3_Rain() {
		return (EReference)senseCap3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenseCap3_Light() {
		return (EReference)senseCap3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAir() {
		return airEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAir_AirTemperature() {
		return (EAttribute)airEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAir_AirHumidity() {
		return (EAttribute)airEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAir_BarometricPressure() {
		return (EAttribute)airEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAir_PeakWindGust() {
		return (EAttribute)airEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAir_WindSpeed() {
		return (EAttribute)airEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAir_WindDirectionSensor() {
		return (EAttribute)airEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRain() {
		return rainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRain_RainGauge() {
		return (EAttribute)rainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRain_RainAccumulation() {
		return (EAttribute)rainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLight() {
		return lightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLight_LightIntensity() {
		return (EAttribute)lightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLight_UvIndex() {
		return (EAttribute)lightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTEKTELIC() {
		return tektelicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEKTELIC_Soil() {
		return (EReference)tektelicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSoil() {
		return tSoilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTSoil_SoilWaterTension1() {
		return (EAttribute)tSoilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTSoil_SoilWaterTension2() {
		return (EAttribute)tSoilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTSoil_SoilMoistureRaw1() {
		return (EAttribute)tSoilEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTSoil_SoilMoistureRaw2() {
		return (EAttribute)tSoilEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTSoil_AmbientLight() {
		return (EAttribute)tSoilEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEM310() {
		return em310EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEM310_Trash() {
		return (EReference)em310EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrash() {
		return trashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrash_Distance() {
		return (EAttribute)trashEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrash_Position() {
		return (EAttribute)trashEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrash_Battery() {
		return (EAttribute)trashEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSN50() {
		return sn50EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSN50_Sensor() {
		return (EReference)sn50EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSN() {
		return snEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSN_Adc1v() {
		return (EAttribute)snEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSN_Battery() {
		return (EAttribute)snEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSN_Adc2() {
		return (EAttribute)snEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSN_Adc3() {
		return (EAttribute)snEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSoilType() {
		return soilTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChirpstackMoistureFactory getChirpstackMoistureFactory() {
		return (ChirpstackMoistureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		draginoEClass = createEClass(DRAGINO);
		createEReference(draginoEClass, DRAGINO__SENSOR);
		createEReference(draginoEClass, DRAGINO__SOIL);
		createEReference(draginoEClass, DRAGINO__DEVICE);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__BATTERY);
		createEAttribute(sensorEClass, SENSOR__IFLAG);
		createEAttribute(sensorEClass, SENSOR__SFLAG);
		createEAttribute(sensorEClass, SENSOR__MOD);
		createEAttribute(sensorEClass, SENSOR__TEMPERATURE_DS18B20);

		soilEClass = createEClass(SOIL);
		createEAttribute(soilEClass, SOIL__TEMPERATURE);
		createEAttribute(soilEClass, SOIL__WATER);
		createEAttribute(soilEClass, SOIL__CONDUCT);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__DEV_EUI);
		createEAttribute(deviceEClass, DEVICE__NAME);
		createEAttribute(deviceEClass, DEVICE__PROFILE_ID);
		createEAttribute(deviceEClass, DEVICE__PROFILE_NAME);
		createEAttribute(deviceEClass, DEVICE__TENANT_ID);
		createEAttribute(deviceEClass, DEVICE__TENANT_NAME);
		createEAttribute(deviceEClass, DEVICE__APPLICATION_ID);
		createEAttribute(deviceEClass, DEVICE__APPLICATION_NAME);

		moistureSensorEClass = createEClass(MOISTURE_SENSOR);
		createEAttribute(moistureSensorEClass, MOISTURE_SENSOR__NAME);
		createEReference(moistureSensorEClass, MOISTURE_SENSOR__STATUS);

		moistureStatusEClass = createEClass(MOISTURE_STATUS);
		createEAttribute(moistureStatusEClass, MOISTURE_STATUS__VALUE);
		createEAttribute(moistureStatusEClass, MOISTURE_STATUS__OBSERVED_AREA);
		createEAttribute(moistureStatusEClass, MOISTURE_STATUS__TEMPERATURE);
		createEAttribute(moistureStatusEClass, MOISTURE_STATUS__WATER);
		createEAttribute(moistureStatusEClass, MOISTURE_STATUS__CONDUCT);

		moistureAdminEClass = createEClass(MOISTURE_ADMIN);
		createEAttribute(moistureAdminEClass, MOISTURE_ADMIN__SOIL_TYPE);

		senseCapEClass = createEClass(SENSE_CAP);
		createEReference(senseCapEClass, SENSE_CAP__AIR);
		createEReference(senseCapEClass, SENSE_CAP__RAIN);
		createEReference(senseCapEClass, SENSE_CAP__LIGHT);

		senseCap2EClass = createEClass(SENSE_CAP2);
		createEReference(senseCap2EClass, SENSE_CAP2__AIR);
		createEReference(senseCap2EClass, SENSE_CAP2__RAIN);
		createEReference(senseCap2EClass, SENSE_CAP2__LIGHT);

		senseCap3EClass = createEClass(SENSE_CAP3);
		createEReference(senseCap3EClass, SENSE_CAP3__AIR);
		createEReference(senseCap3EClass, SENSE_CAP3__RAIN);
		createEReference(senseCap3EClass, SENSE_CAP3__LIGHT);

		airEClass = createEClass(AIR);
		createEAttribute(airEClass, AIR__AIR_TEMPERATURE);
		createEAttribute(airEClass, AIR__AIR_HUMIDITY);
		createEAttribute(airEClass, AIR__BAROMETRIC_PRESSURE);
		createEAttribute(airEClass, AIR__PEAK_WIND_GUST);
		createEAttribute(airEClass, AIR__WIND_SPEED);
		createEAttribute(airEClass, AIR__WIND_DIRECTION_SENSOR);

		rainEClass = createEClass(RAIN);
		createEAttribute(rainEClass, RAIN__RAIN_GAUGE);
		createEAttribute(rainEClass, RAIN__RAIN_ACCUMULATION);

		lightEClass = createEClass(LIGHT);
		createEAttribute(lightEClass, LIGHT__LIGHT_INTENSITY);
		createEAttribute(lightEClass, LIGHT__UV_INDEX);

		tektelicEClass = createEClass(TEKTELIC);
		createEReference(tektelicEClass, TEKTELIC__SOIL);

		tSoilEClass = createEClass(TSOIL);
		createEAttribute(tSoilEClass, TSOIL__SOIL_WATER_TENSION1);
		createEAttribute(tSoilEClass, TSOIL__SOIL_WATER_TENSION2);
		createEAttribute(tSoilEClass, TSOIL__SOIL_MOISTURE_RAW1);
		createEAttribute(tSoilEClass, TSOIL__SOIL_MOISTURE_RAW2);
		createEAttribute(tSoilEClass, TSOIL__AMBIENT_LIGHT);

		em310EClass = createEClass(EM310);
		createEReference(em310EClass, EM310__TRASH);

		trashEClass = createEClass(TRASH);
		createEAttribute(trashEClass, TRASH__DISTANCE);
		createEAttribute(trashEClass, TRASH__POSITION);
		createEAttribute(trashEClass, TRASH__BATTERY);

		sn50EClass = createEClass(SN50);
		createEReference(sn50EClass, SN50__SENSOR);

		snEClass = createEClass(SN);
		createEAttribute(snEClass, SN__ADC1V);
		createEAttribute(snEClass, SN__BATTERY);
		createEAttribute(snEClass, SN__ADC2);
		createEAttribute(snEClass, SN__ADC3);

		// Create enums
		soilTypeEEnum = createEEnum(SOIL_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ProviderPackage theProviderPackage = (ProviderPackage)EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		draginoEClass.getESuperTypes().add(theProviderPackage.getProvider());
		sensorEClass.getESuperTypes().add(theProviderPackage.getService());
		soilEClass.getESuperTypes().add(theProviderPackage.getService());
		deviceEClass.getESuperTypes().add(theProviderPackage.getService());
		moistureSensorEClass.getESuperTypes().add(theProviderPackage.getProvider());
		moistureStatusEClass.getESuperTypes().add(theProviderPackage.getService());
		moistureAdminEClass.getESuperTypes().add(theProviderPackage.getAdmin());
		senseCapEClass.getESuperTypes().add(theProviderPackage.getProvider());
		senseCap2EClass.getESuperTypes().add(theProviderPackage.getProvider());
		senseCap3EClass.getESuperTypes().add(theProviderPackage.getProvider());
		airEClass.getESuperTypes().add(theProviderPackage.getService());
		rainEClass.getESuperTypes().add(theProviderPackage.getService());
		lightEClass.getESuperTypes().add(theProviderPackage.getService());
		tektelicEClass.getESuperTypes().add(theProviderPackage.getProvider());
		tSoilEClass.getESuperTypes().add(theProviderPackage.getService());
		em310EClass.getESuperTypes().add(theProviderPackage.getProvider());
		trashEClass.getESuperTypes().add(theProviderPackage.getService());
		sn50EClass.getESuperTypes().add(theProviderPackage.getProvider());
		snEClass.getESuperTypes().add(theProviderPackage.getService());

		// Initialize classes, features, and operations; add parameters
		initEClass(draginoEClass, Dragino.class, "Dragino", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDragino_Sensor(), this.getSensor(), null, "sensor", null, 0, 1, Dragino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDragino_Soil(), this.getSoil(), null, "soil", null, 0, 1, Dragino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDragino_Device(), this.getDevice(), null, "device", null, 0, 1, Dragino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Battery(), ecorePackage.getEDouble(), "battery", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Iflag(), ecorePackage.getEDouble(), "iflag", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Sflag(), ecorePackage.getEDouble(), "sflag", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Mod(), ecorePackage.getEDouble(), "Mod", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_TemperatureDS18B20(), ecorePackage.getEFloat(), "temperatureDS18B20", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soilEClass, Soil.class, "Soil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoil_Temperature(), ecorePackage.getEDouble(), "temperature", null, 0, 1, Soil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoil_Water(), ecorePackage.getEDouble(), "water", null, 0, 1, Soil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoil_Conduct(), ecorePackage.getEDouble(), "conduct", null, 0, 1, Soil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_DevEUI(), ecorePackage.getEString(), "DevEUI", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Name(), ecorePackage.getEString(), "name", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_ProfileId(), ecorePackage.getEString(), "profileId", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_ProfileName(), ecorePackage.getEString(), "profileName", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_TenantId(), ecorePackage.getEString(), "tenantId", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_TenantName(), ecorePackage.getEString(), "tenantName", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_ApplicationId(), ecorePackage.getEString(), "applicationId", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_ApplicationName(), ecorePackage.getEString(), "applicationName", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moistureSensorEClass, MoistureSensor.class, "MoistureSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoistureSensor_Name(), ecorePackage.getEString(), "name", null, 0, 1, MoistureSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoistureSensor_Status(), this.getMoistureStatus(), null, "status", null, 0, 1, MoistureSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moistureStatusEClass, MoistureStatus.class, "MoistureStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoistureStatus_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, MoistureStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoistureStatus_ObservedArea(), theProviderPackage.getEGeoJsonObject(), "observedArea", null, 0, 1, MoistureStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoistureStatus_Temperature(), ecorePackage.getEDouble(), "temperature", null, 0, 1, MoistureStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoistureStatus_Water(), ecorePackage.getEDouble(), "water", null, 0, 1, MoistureStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoistureStatus_Conduct(), ecorePackage.getEDouble(), "conduct", null, 0, 1, MoistureStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moistureAdminEClass, MoistureAdmin.class, "MoistureAdmin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoistureAdmin_SoilType(), this.getSoilType(), "soilType", null, 0, 1, MoistureAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senseCapEClass, SenseCap.class, "SenseCap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenseCap_Air(), this.getAir(), null, "air", null, 0, 1, SenseCap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenseCap_Rain(), this.getRain(), null, "rain", null, 0, 1, SenseCap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenseCap_Light(), this.getLight(), null, "light", null, 0, 1, SenseCap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senseCap2EClass, SenseCap2.class, "SenseCap2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenseCap2_Air(), this.getAir(), null, "air", null, 0, 1, SenseCap2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenseCap2_Rain(), this.getRain(), null, "rain", null, 0, 1, SenseCap2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenseCap2_Light(), this.getLight(), null, "light", null, 0, 1, SenseCap2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senseCap3EClass, SenseCap3.class, "SenseCap3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenseCap3_Air(), this.getAir(), null, "air", null, 0, 1, SenseCap3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenseCap3_Rain(), this.getRain(), null, "rain", null, 0, 1, SenseCap3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenseCap3_Light(), this.getLight(), null, "light", null, 0, 1, SenseCap3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(airEClass, Air.class, "Air", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAir_AirTemperature(), ecorePackage.getEDouble(), "airTemperature", null, 0, 1, Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAir_AirHumidity(), ecorePackage.getEDouble(), "airHumidity", null, 0, 1, Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAir_BarometricPressure(), ecorePackage.getEDouble(), "barometricPressure", null, 0, 1, Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAir_PeakWindGust(), ecorePackage.getEDouble(), "peakWindGust", null, 0, 1, Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAir_WindSpeed(), ecorePackage.getEDouble(), "windSpeed", null, 0, 1, Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAir_WindDirectionSensor(), ecorePackage.getEDouble(), "windDirectionSensor", null, 0, 1, Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rainEClass, Rain.class, "Rain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRain_RainGauge(), ecorePackage.getEDouble(), "rainGauge", null, 0, 1, Rain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRain_RainAccumulation(), ecorePackage.getEDouble(), "rainAccumulation", null, 0, 1, Rain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lightEClass, Light.class, "Light", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLight_LightIntensity(), ecorePackage.getEDouble(), "lightIntensity", null, 0, 1, Light.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLight_UvIndex(), ecorePackage.getEDouble(), "uvIndex", null, 0, 1, Light.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tektelicEClass, de.jena.chirpstack.moisture.model.moisture.TEKTELIC.class, "TEKTELIC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTEKTELIC_Soil(), this.getTSoil(), null, "soil", null, 0, 1, de.jena.chirpstack.moisture.model.moisture.TEKTELIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tSoilEClass, TSoil.class, "TSoil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTSoil_SoilWaterTension1(), ecorePackage.getEDouble(), "soilWaterTension1", null, 0, 1, TSoil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTSoil_SoilWaterTension2(), ecorePackage.getEDouble(), "soilWaterTension2", null, 0, 1, TSoil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTSoil_SoilMoistureRaw1(), ecorePackage.getEDouble(), "soilMoistureRaw1", null, 0, 1, TSoil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTSoil_SoilMoistureRaw2(), ecorePackage.getEDouble(), "soilMoistureRaw2", null, 0, 1, TSoil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTSoil_AmbientLight(), ecorePackage.getEDouble(), "ambientLight", null, 0, 1, TSoil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(em310EClass, de.jena.chirpstack.moisture.model.moisture.EM310.class, "EM310", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEM310_Trash(), this.getTrash(), null, "trash", null, 0, 1, de.jena.chirpstack.moisture.model.moisture.EM310.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trashEClass, Trash.class, "Trash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrash_Distance(), ecorePackage.getEDouble(), "distance", null, 0, 1, Trash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrash_Position(), ecorePackage.getEString(), "position", null, 0, 1, Trash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrash_Battery(), ecorePackage.getEDouble(), "battery", null, 0, 1, Trash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sn50EClass, de.jena.chirpstack.moisture.model.moisture.SN50.class, "SN50", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSN50_Sensor(), this.getSN(), null, "sensor", null, 0, 1, de.jena.chirpstack.moisture.model.moisture.SN50.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(snEClass, de.jena.chirpstack.moisture.model.moisture.SN.class, "SN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSN_Adc1v(), ecorePackage.getEDouble(), "adc1v", null, 0, 1, de.jena.chirpstack.moisture.model.moisture.SN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSN_Battery(), ecorePackage.getEDouble(), "battery", null, 0, 1, de.jena.chirpstack.moisture.model.moisture.SN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSN_Adc2(), ecorePackage.getEDouble(), "adc2", null, 0, 1, de.jena.chirpstack.moisture.model.moisture.SN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSN_Adc3(), ecorePackage.getEDouble(), "adc3", null, 0, 1, de.jena.chirpstack.moisture.model.moisture.SN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(soilTypeEEnum, SoilType.class, "SoilType");
		addEEnumLiteral(soilTypeEEnum, SoilType.SAND);
		addEEnumLiteral(soilTypeEEnum, SoilType.SILT);
		addEEnumLiteral(soilTypeEEnum, SoilType.LOAM);
		addEEnumLiteral(soilTypeEEnum, SoilType.CLAY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// model
		createModelAnnotations();
		// mapping
		createMappingAnnotations();
		// Metadata
		createMetadataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0"
		   });
	}

	/**
	 * Initializes the annotations for <b>model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations() {
		String source = "model";
		addAnnotation
		  (draginoEClass,
		   source,
		   new String[] {
			   "name", "Dragino_LSE01"
		   });
		addAnnotation
		  (senseCapEClass,
		   source,
		   new String[] {
			   "name", "SenseCAP S2120 8-in-1 LoRaWAN Wetterstation"
		   });
		addAnnotation
		  (senseCap2EClass,
		   source,
		   new String[] {
			   "name", "SenseCAP Wetterstation 2.0"
		   });
		addAnnotation
		  (senseCap3EClass,
		   source,
		   new String[] {
			   "name", "SenseCAP_Wetterstation_2_0"
		   });
		addAnnotation
		  (tektelicEClass,
		   source,
		   new String[] {
			   "name", "TEKTELIC KIWI Agriculture Sensor"
		   });
		addAnnotation
		  (em310EClass,
		   source,
		   new String[] {
			   "name", "EM310-UDL"
		   });
		addAnnotation
		  (sn50EClass,
		   source,
		   new String[] {
			   "name", "SN50v3-LB/LS"
		   });
	}

	/**
	 * Initializes the annotations for <b>mapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMappingAnnotations() {
		String source = "mapping";
		addAnnotation
		  (getSensor_Battery(),
		   source,
		   new String[] {
			   "path", "object/BatV"
		   });
		addAnnotation
		  (getSensor_Iflag(),
		   source,
		   new String[] {
			   "path", "object/i_flag"
		   });
		addAnnotation
		  (getSensor_Sflag(),
		   source,
		   new String[] {
			   "path", "object/s_flag"
		   });
		addAnnotation
		  (getSensor_Mod(),
		   source,
		   new String[] {
			   "path", "object/Mod"
		   });
		addAnnotation
		  (getSensor_TemperatureDS18B20(),
		   source,
		   new String[] {
			   "path", "object/temp_DS18B20",
			   "type", "float"
		   });
		addAnnotation
		  (getSoil_Temperature(),
		   source,
		   new String[] {
			   "path", "object/temp_SOIL_f"
		   });
		addAnnotation
		  (getSoil_Water(),
		   source,
		   new String[] {
			   "path", "object/water_SOIL_f"
		   });
		addAnnotation
		  (getSoil_Conduct(),
		   source,
		   new String[] {
			   "path", "object/conduct_SOIL_f"
		   });
		addAnnotation
		  (getDevice_DevEUI(),
		   source,
		   new String[] {
			   "path", "deviceInfo/devEui"
		   });
		addAnnotation
		  (getDevice_Name(),
		   source,
		   new String[] {
			   "path", "deviceInfo/deviceName"
		   });
		addAnnotation
		  (getDevice_ProfileId(),
		   source,
		   new String[] {
			   "path", "deviceInfo/deviceProfileId"
		   });
		addAnnotation
		  (getDevice_ProfileName(),
		   source,
		   new String[] {
			   "path", "deviceInfo/deviceProfileName"
		   });
		addAnnotation
		  (getDevice_TenantId(),
		   source,
		   new String[] {
			   "path", "deviceInfo/tenantId"
		   });
		addAnnotation
		  (getDevice_TenantName(),
		   source,
		   new String[] {
			   "path", "deviceInfo/tenantName"
		   });
		addAnnotation
		  (getDevice_ApplicationId(),
		   source,
		   new String[] {
			   "path", "deviceInfo/applicationId"
		   });
		addAnnotation
		  (getDevice_ApplicationName(),
		   source,
		   new String[] {
			   "path", "deviceInfo/applicationName"
		   });
		addAnnotation
		  (getAir_AirTemperature(),
		   source,
		   new String[] {
			   "path", "object/messages/0/0/measurementValue"
		   });
		addAnnotation
		  (getAir_AirHumidity(),
		   source,
		   new String[] {
			   "path", "object/messages/0/1/measurementValue"
		   });
		addAnnotation
		  (getAir_BarometricPressure(),
		   source,
		   new String[] {
			   "path", "object/messages/1/2/measurementValue"
		   });
		addAnnotation
		  (getAir_PeakWindGust(),
		   source,
		   new String[] {
			   "path", "object/messages/2/0/measurementValue"
		   });
		addAnnotation
		  (getAir_WindSpeed(),
		   source,
		   new String[] {
			   "path", "object/messages/0/4/measurementValue"
		   });
		addAnnotation
		  (getAir_WindDirectionSensor(),
		   source,
		   new String[] {
			   "path", "object/messages/1/0/measurementValue"
		   });
		addAnnotation
		  (getRain_RainGauge(),
		   source,
		   new String[] {
			   "path", "object/messages/1/1/measurementValue"
		   });
		addAnnotation
		  (getRain_RainAccumulation(),
		   source,
		   new String[] {
			   "path", "object/messages/2/1/measurementValue"
		   });
		addAnnotation
		  (getLight_LightIntensity(),
		   source,
		   new String[] {
			   "path", "object/messages/0/2/measurementValue"
		   });
		addAnnotation
		  (getLight_UvIndex(),
		   source,
		   new String[] {
			   "path", "object/messages/0/3/measurementValue"
		   });
		addAnnotation
		  (getTSoil_SoilWaterTension1(),
		   source,
		   new String[] {
			   "path", "object/soil_water_tension1"
		   });
		addAnnotation
		  (getTSoil_SoilWaterTension2(),
		   source,
		   new String[] {
			   "path", "object/soil_water_tension2"
		   });
		addAnnotation
		  (getTSoil_SoilMoistureRaw1(),
		   source,
		   new String[] {
			   "path", "object/soil_moisture_raw1"
		   });
		addAnnotation
		  (getTSoil_SoilMoistureRaw2(),
		   source,
		   new String[] {
			   "path", "object/soil_moisture_raw2"
		   });
		addAnnotation
		  (getTSoil_AmbientLight(),
		   source,
		   new String[] {
			   "path", "object/ambient_light"
		   });
		addAnnotation
		  (getTrash_Distance(),
		   source,
		   new String[] {
			   "path", "object/distance"
		   });
		addAnnotation
		  (getTrash_Position(),
		   source,
		   new String[] {
			   "path", "object/position"
		   });
		addAnnotation
		  (getTrash_Battery(),
		   source,
		   new String[] {
			   "path", "object/battery"
		   });
		addAnnotation
		  (getSN_Adc1v(),
		   source,
		   new String[] {
			   "path", "object/ADC1_V"
		   });
		addAnnotation
		  (getSN_Battery(),
		   source,
		   new String[] {
			   "path", "object/BatV"
		   });
		addAnnotation
		  (getSN_Adc2(),
		   source,
		   new String[] {
			   "path", "object/ADC2"
		   });
		addAnnotation
		  (getSN_Adc3(),
		   source,
		   new String[] {
			   "path", "object/ADC3"
		   });
	}

	/**
	 * Initializes the annotations for <b>Metadata</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMetadataAnnotations() {
		String source = "Metadata";
		addAnnotation
		  (getMoistureStatus_Value(),
		   source,
		   new String[] {
			   "sensorthings.unit.name", "Prozent"
		   });
		addAnnotation
		  (getMoistureStatus_ObservedArea(),
		   source,
		   new String[] {
			   "sensorthings.observedArea", "true"
		   });
	}

} //ChirpstackMoisturePackageImpl
