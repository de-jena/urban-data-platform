/**
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
