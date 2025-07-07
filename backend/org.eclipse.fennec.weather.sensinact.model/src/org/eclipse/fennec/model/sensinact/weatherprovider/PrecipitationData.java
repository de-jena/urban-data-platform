/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precipitation Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger02Last6 <em>Precipitation Larger02 Last6</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger50Last6 <em>Precipitation Larger50 Last6</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger02LastDay <em>Precipitation Larger02 Last Day</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger50LastDay <em>Precipitation Larger50 Last Day</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger00Last12 <em>Precipitation Larger00 Last12</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger02Last12 <em>Precipitation Larger02 Last12</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger10Last12 <em>Precipitation Larger10 Last12</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger50Last12 <em>Precipitation Larger50 Last12</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationSignificantWeatherTotal <em>Precipitation Significant Weather Total</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationSignificantWeatherLast3 <em>Precipitation Significant Weather Last3</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getPrecipitationData()
 * @model
 * @generated
 */
@ProviderType
public interface PrecipitationData extends Service {
	/**
	 * Returns the value of the '<em><b>Precipitation Larger02 Last6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability of precipitation > 0.2mm during the last 6 hours: 0..100% (R602)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precipitation Larger02 Last6</em>' attribute.
	 * @see #setPrecipitationLarger02Last6(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getPrecipitationData_PrecipitationLarger02Last6()
	 * @model
	 * @generated
	 */
	Float getPrecipitationLarger02Last6();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger02Last6 <em>Precipitation Larger02 Last6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precipitation Larger02 Last6</em>' attribute.
	 * @see #getPrecipitationLarger02Last6()
	 * @generated
	 */
	void setPrecipitationLarger02Last6(Float value);

	/**
	 * Returns the value of the '<em><b>Precipitation Larger50 Last6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability of precipitation > 5mm during the last 6 hours: 0..100% (R650)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precipitation Larger50 Last6</em>' attribute.
	 * @see #setPrecipitationLarger50Last6(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getPrecipitationData_PrecipitationLarger50Last6()
	 * @model
	 * @generated
	 */
	Float getPrecipitationLarger50Last6();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger50Last6 <em>Precipitation Larger50 Last6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precipitation Larger50 Last6</em>' attribute.
	 * @see #getPrecipitationLarger50Last6()
	 * @generated
	 */
	void setPrecipitationLarger50Last6(Float value);

	/**
	 * Returns the value of the '<em><b>Precipitation Larger02 Last Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability of precipitation > 0.2mm during the last 24 hours: 0..100% (Rd02)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precipitation Larger02 Last Day</em>' attribute.
	 * @see #setPrecipitationLarger02LastDay(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getPrecipitationData_PrecipitationLarger02LastDay()
	 * @model
	 * @generated
	 */
	Float getPrecipitationLarger02LastDay();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger02LastDay <em>Precipitation Larger02 Last Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precipitation Larger02 Last Day</em>' attribute.
	 * @see #getPrecipitationLarger02LastDay()
	 * @generated
	 */
	void setPrecipitationLarger02LastDay(Float value);

	/**
	 * Returns the value of the '<em><b>Precipitation Larger50 Last Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability of precipitation > 5mm during the last 24 hours: 0..100% (Rd50)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precipitation Larger50 Last Day</em>' attribute.
	 * @see #setPrecipitationLarger50LastDay(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getPrecipitationData_PrecipitationLarger50LastDay()
	 * @model
	 * @generated
	 */
	Float getPrecipitationLarger50LastDay();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger50LastDay <em>Precipitation Larger50 Last Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precipitation Larger50 Last Day</em>' attribute.
	 * @see #getPrecipitationLarger50LastDay()
	 * @generated
	 */
	void setPrecipitationLarger50LastDay(Float value);

	/**
	 * Returns the value of the '<em><b>Precipitation Larger00 Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability of precipitation > 0.0mm during the last 12 hours: 0..100% (Rh00)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precipitation Larger00 Last12</em>' attribute.
	 * @see #setPrecipitationLarger00Last12(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getPrecipitationData_PrecipitationLarger00Last12()
	 * @model
	 * @generated
	 */
	Float getPrecipitationLarger00Last12();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger00Last12 <em>Precipitation Larger00 Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precipitation Larger00 Last12</em>' attribute.
	 * @see #getPrecipitationLarger00Last12()
	 * @generated
	 */
	void setPrecipitationLarger00Last12(Float value);

	/**
	 * Returns the value of the '<em><b>Precipitation Larger02 Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability of precipitation > 0.2mm during the last 12 hours: 0..100% (Rh02)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precipitation Larger02 Last12</em>' attribute.
	 * @see #setPrecipitationLarger02Last12(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getPrecipitationData_PrecipitationLarger02Last12()
	 * @model
	 * @generated
	 */
	Float getPrecipitationLarger02Last12();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger02Last12 <em>Precipitation Larger02 Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precipitation Larger02 Last12</em>' attribute.
	 * @see #getPrecipitationLarger02Last12()
	 * @generated
	 */
	void setPrecipitationLarger02Last12(Float value);

	/**
	 * Returns the value of the '<em><b>Precipitation Larger10 Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability of precipitation > 1 mm during the last 12 hours: 0..100% (Rh10)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precipitation Larger10 Last12</em>' attribute.
	 * @see #setPrecipitationLarger10Last12(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getPrecipitationData_PrecipitationLarger10Last12()
	 * @model
	 * @generated
	 */
	Float getPrecipitationLarger10Last12();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger10Last12 <em>Precipitation Larger10 Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precipitation Larger10 Last12</em>' attribute.
	 * @see #getPrecipitationLarger10Last12()
	 * @generated
	 */
	void setPrecipitationLarger10Last12(Float value);

	/**
	 * Returns the value of the '<em><b>Precipitation Larger50 Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability of precipitation > 5mm during the last 12 hours: 0..100% (Rh50)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precipitation Larger50 Last12</em>' attribute.
	 * @see #setPrecipitationLarger50Last12(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getPrecipitationData_PrecipitationLarger50Last12()
	 * @model
	 * @generated
	 */
	Float getPrecipitationLarger50Last12();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger50Last12 <em>Precipitation Larger50 Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precipitation Larger50 Last12</em>' attribute.
	 * @see #getPrecipitationLarger50Last12()
	 * @generated
	 */
	void setPrecipitationLarger50Last12(Float value);

	/**
	 * Returns the value of the '<em><b>Precipitation Significant Weather Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total precipitation during the last hour consistent with significant weather: kg/m2 (RR1c)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precipitation Significant Weather Total</em>' attribute.
	 * @see #setPrecipitationSignificantWeatherTotal(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getPrecipitationData_PrecipitationSignificantWeatherTotal()
	 * @model
	 * @generated
	 */
	Float getPrecipitationSignificantWeatherTotal();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationSignificantWeatherTotal <em>Precipitation Significant Weather Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precipitation Significant Weather Total</em>' attribute.
	 * @see #getPrecipitationSignificantWeatherTotal()
	 * @generated
	 */
	void setPrecipitationSignificantWeatherTotal(Float value);

	/**
	 * Returns the value of the '<em><b>Precipitation Significant Weather Last3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total precipitation during the last 3 hours  consistent with significant weather: kg/m2 (RR3c)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precipitation Significant Weather Last3</em>' attribute.
	 * @see #setPrecipitationSignificantWeatherLast3(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getPrecipitationData_PrecipitationSignificantWeatherLast3()
	 * @model
	 * @generated
	 */
	Float getPrecipitationSignificantWeatherLast3();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationSignificantWeatherLast3 <em>Precipitation Significant Weather Last3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precipitation Significant Weather Last3</em>' attribute.
	 * @see #getPrecipitationSignificantWeatherLast3()
	 * @generated
	 */
	void setPrecipitationSignificantWeatherLast3(Float value);

} // PrecipitationData
