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

import de.jena.chirpstack.model.chirpstack.*;

import org.eclipse.emf.ecore.EClass;
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
public class ChirpstackFactoryImpl extends EFactoryImpl implements ChirpstackFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChirpstackFactory init() {
		try {
			ChirpstackFactory theChirpstackFactory = (ChirpstackFactory)EPackage.Registry.INSTANCE.getEFactory(ChirpstackPackage.eNS_URI);
			if (theChirpstackFactory != null) {
				return theChirpstackFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChirpstackFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChirpstackFactoryImpl() {
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
			case ChirpstackPackage.DRAGINO: return createDragino();
			case ChirpstackPackage.SENSOR: return createSensor();
			case ChirpstackPackage.SOIL: return createSoil();
			case ChirpstackPackage.DEVICE: return createDevice();
			case ChirpstackPackage.SENSE_CAP_S2120: return createSenseCapS2120();
			case ChirpstackPackage.SENSE_CAP_S2105: return createSenseCapS2105();
			case ChirpstackPackage.SENSE_CAP: return createSenseCap();
			case ChirpstackPackage.AIR: return createAir();
			case ChirpstackPackage.RAIN: return createRain();
			case ChirpstackPackage.LIGHT: return createLight();
			case ChirpstackPackage.TEKTELIC: return createTEKTELIC();
			case ChirpstackPackage.TSOIL: return createTSoil();
			case ChirpstackPackage.EM310: return createEM310();
			case ChirpstackPackage.TRASH: return createTrash();
			case ChirpstackPackage.SN50: return createSN50();
			case ChirpstackPackage.SN: return createSN();
			case ChirpstackPackage.SOLIDOS_TEROS21: return createSolidosTeros21();
			case ChirpstackPackage.TEROS21: return createTeros21();
			case ChirpstackPackage.PMXTCR: return createPMXTCR();
			case ChirpstackPackage.PMX_COUNTER: return createPMXCounter();
			case ChirpstackPackage.PMX_STATUS: return createPMXStatus();
			case ChirpstackPackage.ATMOS14: return createAtmos14();
			case ChirpstackPackage.ATMOSPHERE: return createAtmosphere();
			case ChirpstackPackage.ATMOS_STATUS: return createAtmosStatus();
			case ChirpstackPackage.ATMOS22: return createAtmos22();
			case ChirpstackPackage.WIND: return createWind();
			case ChirpstackPackage.ATMOS22_STATUS: return createAtmos22Status();
			case ChirpstackPackage.KALYX: return createKalyx();
			case ChirpstackPackage.KALYX_RAIN: return createKalyxRain();
			case ChirpstackPackage.KALYX_STATUS: return createKalyxStatus();
			case ChirpstackPackage.SE212: return createSE212();
			case ChirpstackPackage.SE212_LIGHT: return createSE212Light();
			case ChirpstackPackage.SE212_STATUS: return createSE212Status();
			case ChirpstackPackage.DDS45: return createDDS45();
			case ChirpstackPackage.DDS45_DISTANCE: return createDDS45Distance();
			case ChirpstackPackage.DDS45_STATUS: return createDDS45Status();
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
	public SenseCapS2120 createSenseCapS2120() {
		SenseCapS2120Impl senseCapS2120 = new SenseCapS2120Impl();
		return senseCapS2120;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SenseCapS2105 createSenseCapS2105() {
		SenseCapS2105Impl senseCapS2105 = new SenseCapS2105Impl();
		return senseCapS2105;
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
	@Override
	public SolidosTeros21 createSolidosTeros21() {
		SolidosTeros21Impl solidosTeros21 = new SolidosTeros21Impl();
		return solidosTeros21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Teros21 createTeros21() {
		Teros21Impl teros21 = new Teros21Impl();
		return teros21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PMXTCR createPMXTCR() {
		PMXTCRImpl pmxtcr = new PMXTCRImpl();
		return pmxtcr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PMXCounter createPMXCounter() {
		PMXCounterImpl pmxCounter = new PMXCounterImpl();
		return pmxCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PMXStatus createPMXStatus() {
		PMXStatusImpl pmxStatus = new PMXStatusImpl();
		return pmxStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Atmos14 createAtmos14() {
		Atmos14Impl atmos14 = new Atmos14Impl();
		return atmos14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Atmosphere createAtmosphere() {
		AtmosphereImpl atmosphere = new AtmosphereImpl();
		return atmosphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtmosStatus createAtmosStatus() {
		AtmosStatusImpl atmosStatus = new AtmosStatusImpl();
		return atmosStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Atmos22 createAtmos22() {
		Atmos22Impl atmos22 = new Atmos22Impl();
		return atmos22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wind createWind() {
		WindImpl wind = new WindImpl();
		return wind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Atmos22Status createAtmos22Status() {
		Atmos22StatusImpl atmos22Status = new Atmos22StatusImpl();
		return atmos22Status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kalyx createKalyx() {
		KalyxImpl kalyx = new KalyxImpl();
		return kalyx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KalyxRain createKalyxRain() {
		KalyxRainImpl kalyxRain = new KalyxRainImpl();
		return kalyxRain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KalyxStatus createKalyxStatus() {
		KalyxStatusImpl kalyxStatus = new KalyxStatusImpl();
		return kalyxStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SE212 createSE212() {
		SE212Impl se212 = new SE212Impl();
		return se212;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SE212Light createSE212Light() {
		SE212LightImpl se212Light = new SE212LightImpl();
		return se212Light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SE212Status createSE212Status() {
		SE212StatusImpl se212Status = new SE212StatusImpl();
		return se212Status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DDS45 createDDS45() {
		DDS45Impl dds45 = new DDS45Impl();
		return dds45;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DDS45Distance createDDS45Distance() {
		DDS45DistanceImpl dds45Distance = new DDS45DistanceImpl();
		return dds45Distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DDS45Status createDDS45Status() {
		DDS45StatusImpl dds45Status = new DDS45StatusImpl();
		return dds45Status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChirpstackPackage getChirpstackPackage() {
		return (ChirpstackPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChirpstackPackage getPackage() {
		return ChirpstackPackage.eINSTANCE;
	}

} //ChirpstackFactoryImpl
