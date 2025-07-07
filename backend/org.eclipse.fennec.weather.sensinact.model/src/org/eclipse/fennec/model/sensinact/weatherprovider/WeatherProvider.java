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
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getWindData <em>Wind Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getCloudData <em>Cloud Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getPrecipitationData <em>Precipitation Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getTemperatureData <em>Temperature Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getFogData <em>Fog Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getSnowRainData <em>Snow Rain Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getVisibilityData <em>Visibility Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getPressureData <em>Pressure Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getIrradianceData <em>Irradiance Data</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider()
 * @model
 * @generated
 */
@ProviderType
public interface WeatherProvider extends DynamicProvider {
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

	/**
	 * Returns the value of the '<em><b>Precipitation Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precipitation Data</em>' reference.
	 * @see #setPrecipitationData(PrecipitationData)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_PrecipitationData()
	 * @model
	 * @generated
	 */
	PrecipitationData getPrecipitationData();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getPrecipitationData <em>Precipitation Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precipitation Data</em>' reference.
	 * @see #getPrecipitationData()
	 * @generated
	 */
	void setPrecipitationData(PrecipitationData value);

	/**
	 * Returns the value of the '<em><b>Temperature Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Data</em>' reference.
	 * @see #setTemperatureData(TemperatureData)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_TemperatureData()
	 * @model
	 * @generated
	 */
	TemperatureData getTemperatureData();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getTemperatureData <em>Temperature Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Data</em>' reference.
	 * @see #getTemperatureData()
	 * @generated
	 */
	void setTemperatureData(TemperatureData value);

	/**
	 * Returns the value of the '<em><b>Fog Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fog Data</em>' reference.
	 * @see #setFogData(FogData)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_FogData()
	 * @model
	 * @generated
	 */
	FogData getFogData();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getFogData <em>Fog Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fog Data</em>' reference.
	 * @see #getFogData()
	 * @generated
	 */
	void setFogData(FogData value);

	/**
	 * Returns the value of the '<em><b>Snow Rain Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snow Rain Data</em>' reference.
	 * @see #setSnowRainData(SnowRainData)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_SnowRainData()
	 * @model
	 * @generated
	 */
	SnowRainData getSnowRainData();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getSnowRainData <em>Snow Rain Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snow Rain Data</em>' reference.
	 * @see #getSnowRainData()
	 * @generated
	 */
	void setSnowRainData(SnowRainData value);

	/**
	 * Returns the value of the '<em><b>Visibility Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility Data</em>' reference.
	 * @see #setVisibilityData(VisibilityData)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_VisibilityData()
	 * @model
	 * @generated
	 */
	VisibilityData getVisibilityData();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getVisibilityData <em>Visibility Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility Data</em>' reference.
	 * @see #getVisibilityData()
	 * @generated
	 */
	void setVisibilityData(VisibilityData value);

	/**
	 * Returns the value of the '<em><b>Pressure Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Data</em>' reference.
	 * @see #setPressureData(PressureData)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_PressureData()
	 * @model
	 * @generated
	 */
	PressureData getPressureData();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getPressureData <em>Pressure Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Data</em>' reference.
	 * @see #getPressureData()
	 * @generated
	 */
	void setPressureData(PressureData value);

	/**
	 * Returns the value of the '<em><b>Irradiance Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Irradiance Data</em>' reference.
	 * @see #setIrradianceData(IrradianceData)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_IrradianceData()
	 * @model
	 * @generated
	 */
	IrradianceData getIrradianceData();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getIrradianceData <em>Irradiance Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Irradiance Data</em>' reference.
	 * @see #getIrradianceData()
	 * @generated
	 */
	void setIrradianceData(IrradianceData value);

} // WeatherProvider
