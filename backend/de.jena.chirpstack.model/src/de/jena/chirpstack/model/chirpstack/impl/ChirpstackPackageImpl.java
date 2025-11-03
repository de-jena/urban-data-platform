/**
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
package de.jena.chirpstack.model.chirpstack.impl;

import de.jena.chirpstack.model.chirpstack.Air;
import de.jena.chirpstack.model.chirpstack.ChirpstackFactory;
import de.jena.chirpstack.model.chirpstack.ChirpstackPackage;
import de.jena.chirpstack.model.chirpstack.Device;
import de.jena.chirpstack.model.chirpstack.Dragino;
import de.jena.chirpstack.model.chirpstack.Light;
import de.jena.chirpstack.model.chirpstack.Rain;
import de.jena.chirpstack.model.chirpstack.SenseCap;
import de.jena.chirpstack.model.chirpstack.SenseCapS2105;
import de.jena.chirpstack.model.chirpstack.SenseCapS2120;
import de.jena.chirpstack.model.chirpstack.Sensor;
import de.jena.chirpstack.model.chirpstack.Soil;
import de.jena.chirpstack.model.chirpstack.SolidosTeros21;
import de.jena.chirpstack.model.chirpstack.TSoil;
import de.jena.chirpstack.model.chirpstack.Teros21;
import de.jena.chirpstack.model.chirpstack.Trash;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class ChirpstackPackageImpl extends EPackageImpl implements ChirpstackPackage {
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
	private EClass senseCapS2120EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senseCapS2105EClass = null;

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
	private EClass solidosTeros21EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teros21EClass = null;

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
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChirpstackPackageImpl() {
		super(eNS_URI, ChirpstackFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ChirpstackPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ChirpstackPackage init() {
		if (isInited) return (ChirpstackPackage)EPackage.Registry.INSTANCE.getEPackage(ChirpstackPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredChirpstackPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ChirpstackPackageImpl theChirpstackPackage = registeredChirpstackPackage instanceof ChirpstackPackageImpl ? (ChirpstackPackageImpl)registeredChirpstackPackage : new ChirpstackPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ProviderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theChirpstackPackage.createPackageContents();

		// Initialize created meta-data
		theChirpstackPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChirpstackPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChirpstackPackage.eNS_URI, theChirpstackPackage);
		return theChirpstackPackage;
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
	public EClass getSenseCapS2120() {
		return senseCapS2120EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenseCapS2120_Air() {
		return (EReference)senseCapS2120EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenseCapS2120_Rain() {
		return (EReference)senseCapS2120EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenseCapS2120_Light() {
		return (EReference)senseCapS2120EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSenseCapS2105() {
		return senseCapS2105EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenseCapS2105_Air() {
		return (EReference)senseCapS2105EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenseCapS2105_Rain() {
		return (EReference)senseCapS2105EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenseCapS2105_Light() {
		return (EReference)senseCapS2105EClass.getEStructuralFeatures().get(2);
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
	public EClass getSolidosTeros21() {
		return solidosTeros21EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolidosTeros21_Sensor() {
		return (EReference)solidosTeros21EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeros21() {
		return teros21EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeros21_PotentialWater1() {
		return (EAttribute)teros21EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeros21_PotentialWater2() {
		return (EAttribute)teros21EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeros21_Temperatur1() {
		return (EAttribute)teros21EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeros21_Temperatur2() {
		return (EAttribute)teros21EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeros21_Battery() {
		return (EAttribute)teros21EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChirpstackFactory getChirpstackFactory() {
		return (ChirpstackFactory)getEFactoryInstance();
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

		senseCapS2120EClass = createEClass(SENSE_CAP_S2120);
		createEReference(senseCapS2120EClass, SENSE_CAP_S2120__AIR);
		createEReference(senseCapS2120EClass, SENSE_CAP_S2120__RAIN);
		createEReference(senseCapS2120EClass, SENSE_CAP_S2120__LIGHT);

		senseCapS2105EClass = createEClass(SENSE_CAP_S2105);
		createEReference(senseCapS2105EClass, SENSE_CAP_S2105__AIR);
		createEReference(senseCapS2105EClass, SENSE_CAP_S2105__RAIN);
		createEReference(senseCapS2105EClass, SENSE_CAP_S2105__LIGHT);

		senseCapEClass = createEClass(SENSE_CAP);
		createEReference(senseCapEClass, SENSE_CAP__AIR);
		createEReference(senseCapEClass, SENSE_CAP__RAIN);
		createEReference(senseCapEClass, SENSE_CAP__LIGHT);

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

		solidosTeros21EClass = createEClass(SOLIDOS_TEROS21);
		createEReference(solidosTeros21EClass, SOLIDOS_TEROS21__SENSOR);

		teros21EClass = createEClass(TEROS21);
		createEAttribute(teros21EClass, TEROS21__POTENTIAL_WATER1);
		createEAttribute(teros21EClass, TEROS21__POTENTIAL_WATER2);
		createEAttribute(teros21EClass, TEROS21__TEMPERATUR1);
		createEAttribute(teros21EClass, TEROS21__TEMPERATUR2);
		createEAttribute(teros21EClass, TEROS21__BATTERY);
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
		senseCapS2120EClass.getESuperTypes().add(theProviderPackage.getProvider());
		senseCapS2105EClass.getESuperTypes().add(theProviderPackage.getProvider());
		senseCapEClass.getESuperTypes().add(theProviderPackage.getProvider());
		airEClass.getESuperTypes().add(theProviderPackage.getService());
		rainEClass.getESuperTypes().add(theProviderPackage.getService());
		lightEClass.getESuperTypes().add(theProviderPackage.getService());
		tektelicEClass.getESuperTypes().add(theProviderPackage.getProvider());
		tSoilEClass.getESuperTypes().add(theProviderPackage.getService());
		em310EClass.getESuperTypes().add(theProviderPackage.getProvider());
		trashEClass.getESuperTypes().add(theProviderPackage.getService());
		sn50EClass.getESuperTypes().add(theProviderPackage.getProvider());
		snEClass.getESuperTypes().add(theProviderPackage.getService());
		solidosTeros21EClass.getESuperTypes().add(theProviderPackage.getProvider());
		teros21EClass.getESuperTypes().add(theProviderPackage.getService());

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

		initEClass(senseCapS2120EClass, SenseCapS2120.class, "SenseCapS2120", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenseCapS2120_Air(), this.getAir(), null, "air", null, 0, 1, SenseCapS2120.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenseCapS2120_Rain(), this.getRain(), null, "rain", null, 0, 1, SenseCapS2120.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenseCapS2120_Light(), this.getLight(), null, "light", null, 0, 1, SenseCapS2120.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senseCapS2105EClass, SenseCapS2105.class, "SenseCapS2105", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenseCapS2105_Air(), this.getAir(), null, "air", null, 0, 1, SenseCapS2105.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenseCapS2105_Rain(), this.getRain(), null, "rain", null, 0, 1, SenseCapS2105.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenseCapS2105_Light(), this.getLight(), null, "light", null, 0, 1, SenseCapS2105.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senseCapEClass, SenseCap.class, "SenseCap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenseCap_Air(), this.getAir(), null, "air", null, 0, 1, SenseCap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenseCap_Rain(), this.getRain(), null, "rain", null, 0, 1, SenseCap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenseCap_Light(), this.getLight(), null, "light", null, 0, 1, SenseCap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(tektelicEClass, de.jena.chirpstack.model.chirpstack.TEKTELIC.class, "TEKTELIC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTEKTELIC_Soil(), this.getTSoil(), null, "soil", null, 0, 1, de.jena.chirpstack.model.chirpstack.TEKTELIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tSoilEClass, TSoil.class, "TSoil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTSoil_SoilWaterTension1(), ecorePackage.getEDouble(), "soilWaterTension1", null, 0, 1, TSoil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTSoil_SoilWaterTension2(), ecorePackage.getEDouble(), "soilWaterTension2", null, 0, 1, TSoil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTSoil_SoilMoistureRaw1(), ecorePackage.getEDouble(), "soilMoistureRaw1", null, 0, 1, TSoil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTSoil_SoilMoistureRaw2(), ecorePackage.getEDouble(), "soilMoistureRaw2", null, 0, 1, TSoil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTSoil_AmbientLight(), ecorePackage.getEDouble(), "ambientLight", null, 0, 1, TSoil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(em310EClass, de.jena.chirpstack.model.chirpstack.EM310.class, "EM310", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEM310_Trash(), this.getTrash(), null, "trash", null, 0, 1, de.jena.chirpstack.model.chirpstack.EM310.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trashEClass, Trash.class, "Trash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrash_Distance(), ecorePackage.getEDouble(), "distance", null, 0, 1, Trash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrash_Position(), ecorePackage.getEString(), "position", null, 0, 1, Trash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrash_Battery(), ecorePackage.getEDouble(), "battery", null, 0, 1, Trash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sn50EClass, de.jena.chirpstack.model.chirpstack.SN50.class, "SN50", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSN50_Sensor(), this.getSN(), null, "sensor", null, 0, 1, de.jena.chirpstack.model.chirpstack.SN50.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(snEClass, de.jena.chirpstack.model.chirpstack.SN.class, "SN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSN_Adc1v(), ecorePackage.getEDouble(), "adc1v", null, 0, 1, de.jena.chirpstack.model.chirpstack.SN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSN_Battery(), ecorePackage.getEDouble(), "battery", null, 0, 1, de.jena.chirpstack.model.chirpstack.SN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSN_Adc2(), ecorePackage.getEDouble(), "adc2", null, 0, 1, de.jena.chirpstack.model.chirpstack.SN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSN_Adc3(), ecorePackage.getEDouble(), "adc3", null, 0, 1, de.jena.chirpstack.model.chirpstack.SN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solidosTeros21EClass, SolidosTeros21.class, "SolidosTeros21", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolidosTeros21_Sensor(), this.getTeros21(), null, "sensor", null, 0, 1, SolidosTeros21.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teros21EClass, Teros21.class, "Teros21", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeros21_PotentialWater1(), ecorePackage.getEDouble(), "potentialWater1", null, 0, 1, Teros21.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeros21_PotentialWater2(), ecorePackage.getEDouble(), "potentialWater2", null, 0, 1, Teros21.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeros21_Temperatur1(), ecorePackage.getEDouble(), "temperatur1", null, 0, 1, Teros21.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeros21_Temperatur2(), ecorePackage.getEDouble(), "temperatur2", null, 0, 1, Teros21.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeros21_Battery(), ecorePackage.getEDouble(), "battery", null, 0, 1, Teros21.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// model
		createModelAnnotations();
		// mapping
		createMappingAnnotations();
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
			   "name", "Dragino_LSE01",
			   "profileId", "37cf9cbd-e7e1-4269-8c22-b46bb5261a2a"
		   });
		addAnnotation
		  (senseCapS2120EClass,
		   source,
		   new String[] {
			   "name", "SenseCAP_S2120_8-in-1_LoRaWAN_Wetterstation",
			   "profileName", "SenseCAP S2120 8-in-1 LoRaWAN Wetterstation",
			   "profileId", "d03f1299-95a3-4ab2-a924-e0e5fe3b277d"
		   });
		addAnnotation
		  (senseCapS2105EClass,
		   source,
		   new String[] {
			   "name", "SenseCAP_S2105-LoRaWAN_Soil_Moisture_Temperature_and_EC_Sensor",
			   "profileName", "SenseCAP S2105-LoRaWAN\u00ae Soil Moisture, Temperature and EC Sensor",
			   "profileId", "f74bb315-56ca-48c0-82f8-f7b837f4d917"
		   });
		addAnnotation
		  (senseCapEClass,
		   source,
		   new String[] {
			   "name", "SenseCAP_Wetterstation_2_0",
			   "profileName", "SenseCAP Wetterstation 2.0",
			   "profileId", "b6a1cea0-c82d-4261-b32c-cf4d2e1f97fb"
		   });
		addAnnotation
		  (tektelicEClass,
		   source,
		   new String[] {
			   "name", "TEKTELIC_KIWI_Agriculture_Sensor",
			   "profileName", "TEKTELIC KIWI Agriculture Sensor",
			   "profileId", "93f37439-1425-4a5f-a7e7-7eb4b75f1936"
		   });
		addAnnotation
		  (em310EClass,
		   source,
		   new String[] {
			   "name", "EM310-UDL",
			   "profileId", "1e6d47f7-1432-4c83-b48d-dd34a7e5e9c6"
		   });
		addAnnotation
		  (sn50EClass,
		   source,
		   new String[] {
			   "name", "SN50v3-LB_LS",
			   "profileName", "SN50v3-LB/LS",
			   "profileId", "a610241d-86c3-4d4a-af88-bfa1754f1610"
		   });
		addAnnotation
		  (solidosTeros21EClass,
		   source,
		   new String[] {
			   "name", "Solidos_Teros21",
			   "profileName", "Solidos Teros21",
			   "profileId", "7022e9ce-7673-4d0c-b3d1-ed51afc3fe27"
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
		addAnnotation
		  (getTeros21_PotentialWater1(),
		   source,
		   new String[] {
			   "path", "object/potentialwater_1"
		   });
		addAnnotation
		  (getTeros21_PotentialWater2(),
		   source,
		   new String[] {
			   "path", "object/potentialwater_2"
		   });
		addAnnotation
		  (getTeros21_Temperatur1(),
		   source,
		   new String[] {
			   "path", "object/temp_1"
		   });
		addAnnotation
		  (getTeros21_Temperatur2(),
		   source,
		   new String[] {
			   "path", "object/temp_2"
		   });
		addAnnotation
		  (getTeros21_Battery(),
		   source,
		   new String[] {
			   "path", "object/battery_voltage"
		   });
	}

} //ChirpstackPackageImpl
