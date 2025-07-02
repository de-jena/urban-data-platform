/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider;

import org.eclipse.sensinact.model.core.provider.DynamicProvider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getStation <em>Station</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getWindData <em>Wind Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getCloudData <em>Cloud Data</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider()
 * @model
 * @generated
 */
@ProviderType
public interface WeatherProvider extends DynamicProvider {
	/**
	 * Returns the value of the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station</em>' reference.
	 * @see #setStation(Station)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Station()
	 * @model
	 * @generated
	 */
	Station getStation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getStation <em>Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station</em>' reference.
	 * @see #getStation()
	 * @generated
	 */
	void setStation(Station value);

	/**
	 * Returns the value of the '<em><b>Wind Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind Data</em>' reference.
	 * @see #setWindData(WindData)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_WindData()
	 * @model
	 * @generated
	 */
	WindData getWindData();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getWindData <em>Wind Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Data</em>' reference.
	 * @see #getWindData()
	 * @generated
	 */
	void setWindData(WindData value);

	/**
	 * Returns the value of the '<em><b>Cloud Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Data</em>' reference.
	 * @see #setCloudData(CloudData)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_CloudData()
	 * @model
	 * @generated
	 */
	CloudData getCloudData();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getCloudData <em>Cloud Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Data</em>' reference.
	 * @see #getCloudData()
	 * @generated
	 */
	void setCloudData(CloudData value);

} // WeatherProvider
