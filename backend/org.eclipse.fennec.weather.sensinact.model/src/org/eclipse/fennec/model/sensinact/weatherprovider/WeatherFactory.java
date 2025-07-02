/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage
 * @generated
 */
@ProviderType
public interface WeatherFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WeatherFactory eINSTANCE = org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider</em>'.
	 * @generated
	 */
	WeatherProvider createWeatherProvider();

	/**
	 * Returns a new object of class '<em>Wind Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wind Data</em>'.
	 * @generated
	 */
	WindData createWindData();

	/**
	 * Returns a new object of class '<em>Cloud Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Data</em>'.
	 * @generated
	 */
	CloudData createCloudData();

	/**
	 * Returns a new object of class '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station</em>'.
	 * @generated
	 */
	Station createStation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WeatherPackage getWeatherPackage();

} //WeatherFactory
