/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider;

import org.eclipse.sensinact.model.core.provider.Admin;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherAdmin#getWeatherStationId <em>Weather Station Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherAdmin#getWeatherStationName <em>Weather Station Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherAdmin()
 * @model
 * @generated
 */
@ProviderType
public interface WeatherAdmin extends Admin {
	/**
	 * Returns the value of the '<em><b>Weather Station Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weather Station Id</em>' attribute.
	 * @see #setWeatherStationId(String)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherAdmin_WeatherStationId()
	 * @model
	 * @generated
	 */
	String getWeatherStationId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherAdmin#getWeatherStationId <em>Weather Station Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weather Station Id</em>' attribute.
	 * @see #getWeatherStationId()
	 * @generated
	 */
	void setWeatherStationId(String value);

	/**
	 * Returns the value of the '<em><b>Weather Station Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weather Station Name</em>' attribute.
	 * @see #setWeatherStationName(String)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherAdmin_WeatherStationName()
	 * @model
	 * @generated
	 */
	String getWeatherStationName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherAdmin#getWeatherStationName <em>Weather Station Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weather Station Name</em>' attribute.
	 * @see #getWeatherStationName()
	 * @generated
	 */
	void setWeatherStationName(String value);

} // WeatherAdmin
