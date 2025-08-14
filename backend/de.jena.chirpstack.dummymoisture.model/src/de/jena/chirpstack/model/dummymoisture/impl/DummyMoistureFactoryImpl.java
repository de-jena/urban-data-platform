/**
 */
package de.jena.chirpstack.model.dummymoisture.impl;

import de.jena.chirpstack.model.dummymoisture.*;

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
public class DummyMoistureFactoryImpl extends EFactoryImpl implements DummyMoistureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DummyMoistureFactory init() {
		try {
			DummyMoistureFactory theDummyMoistureFactory = (DummyMoistureFactory)EPackage.Registry.INSTANCE.getEFactory(DummyMoisturePackage.eNS_URI);
			if (theDummyMoistureFactory != null) {
				return theDummyMoistureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DummyMoistureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DummyMoistureFactoryImpl() {
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
			case DummyMoisturePackage.MOISTURE_SENSOR: return createMoistureSensor();
			case DummyMoisturePackage.MOISTURE_STATUS: return createMoistureStatus();
			case DummyMoisturePackage.MOISTURE_ADMIN: return createMoistureAdmin();
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
			case DummyMoisturePackage.SOIL_TYPE:
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
			case DummyMoisturePackage.SOIL_TYPE:
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
	public DummyMoisturePackage getDummyMoisturePackage() {
		return (DummyMoisturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DummyMoisturePackage getPackage() {
		return DummyMoisturePackage.eINSTANCE;
	}

} //DummyMoistureFactoryImpl
