/*
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
