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
	 * Returns a new object of class '<em>Precipitation Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precipitation Data</em>'.
	 * @generated
	 */
	PrecipitationData createPrecipitationData();

	/**
	 * Returns a new object of class '<em>Temperature Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temperature Data</em>'.
	 * @generated
	 */
	TemperatureData createTemperatureData();

	/**
	 * Returns a new object of class '<em>Fog Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fog Data</em>'.
	 * @generated
	 */
	FogData createFogData();

	/**
	 * Returns a new object of class '<em>Snow Rain Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Snow Rain Data</em>'.
	 * @generated
	 */
	SnowRainData createSnowRainData();

	/**
	 * Returns a new object of class '<em>Visibility Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility Data</em>'.
	 * @generated
	 */
	VisibilityData createVisibilityData();

	/**
	 * Returns a new object of class '<em>Pressure Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressure Data</em>'.
	 * @generated
	 */
	PressureData createPressureData();

	/**
	 * Returns a new object of class '<em>Irradiance Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Irradiance Data</em>'.
	 * @generated
	 */
	IrradianceData createIrradianceData();

	/**
	 * Returns a new object of class '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admin</em>'.
	 * @generated
	 */
	WeatherAdmin createWeatherAdmin();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WeatherPackage getWeatherPackage();

} //WeatherFactory
