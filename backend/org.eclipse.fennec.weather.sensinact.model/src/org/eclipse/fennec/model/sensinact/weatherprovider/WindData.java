/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wind Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindDirection <em>Wind Direction</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindSpeed <em>Wind Speed</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustLastHour <em>Wind Gust Last Hour</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustLastThreeHours <em>Wind Gust Last Three Hours</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustMaxLast12Hours <em>Wind Gust Max Last12 Hours</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustProb25 <em>Wind Gust Prob25</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustProb40 <em>Wind Gust Prob40</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustProb55 <em>Wind Gust Prob55</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWindData()
 * @model
 * @generated
 */
@ProviderType
public interface WindData extends Service {
	/**
	 * Returns the value of the '<em><b>Wind Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wind direction: 0..360 Degrees (DD)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wind Direction</em>' attribute.
	 * @see #setWindDirection(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWindData_WindDirection()
	 * @model
	 * @generated
	 */
	Float getWindDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindDirection <em>Wind Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Direction</em>' attribute.
	 * @see #getWindDirection()
	 * @generated
	 */
	void setWindDirection(Float value);

	/**
	 * Returns the value of the '<em><b>Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wind speed: m/s (FF)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wind Speed</em>' attribute.
	 * @see #setWindSpeed(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWindData_WindSpeed()
	 * @model
	 * @generated
	 */
	Float getWindSpeed();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindSpeed <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Speed</em>' attribute.
	 * @see #getWindSpeed()
	 * @generated
	 */
	void setWindSpeed(Float value);

	/**
	 * Returns the value of the '<em><b>Wind Gust Last Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum wind gust within the last hour: m/s (FX1)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wind Gust Last Hour</em>' attribute.
	 * @see #setWindGustLastHour(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWindData_WindGustLastHour()
	 * @model
	 * @generated
	 */
	Float getWindGustLastHour();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustLastHour <em>Wind Gust Last Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Gust Last Hour</em>' attribute.
	 * @see #getWindGustLastHour()
	 * @generated
	 */
	void setWindGustLastHour(Float value);

	/**
	 * Returns the value of the '<em><b>Wind Gust Last Three Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum wind gust within the last 3 hours: m/s (FX3)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wind Gust Last Three Hours</em>' attribute.
	 * @see #setWindGustLastThreeHours(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWindData_WindGustLastThreeHours()
	 * @model
	 * @generated
	 */
	Float getWindGustLastThreeHours();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustLastThreeHours <em>Wind Gust Last Three Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Gust Last Three Hours</em>' attribute.
	 * @see #getWindGustLastThreeHours()
	 * @generated
	 */
	void setWindGustLastThreeHours(Float value);

	/**
	 * Returns the value of the '<em><b>Wind Gust Max Last12 Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum wind gust within the last 12 hours: m/s (FXh)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wind Gust Max Last12 Hours</em>' attribute.
	 * @see #setWindGustMaxLast12Hours(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWindData_WindGustMaxLast12Hours()
	 * @model
	 * @generated
	 */
	Float getWindGustMaxLast12Hours();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustMaxLast12Hours <em>Wind Gust Max Last12 Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Gust Max Last12 Hours</em>' attribute.
	 * @see #getWindGustMaxLast12Hours()
	 * @generated
	 */
	void setWindGustMaxLast12Hours(Float value);

	/**
	 * Returns the value of the '<em><b>Wind Gust Prob25</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability of wind gusts >= 25kn within the last 12 hours: 0..100% (FXh25)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wind Gust Prob25</em>' attribute.
	 * @see #setWindGustProb25(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWindData_WindGustProb25()
	 * @model
	 * @generated
	 */
	Float getWindGustProb25();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustProb25 <em>Wind Gust Prob25</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Gust Prob25</em>' attribute.
	 * @see #getWindGustProb25()
	 * @generated
	 */
	void setWindGustProb25(Float value);

	/**
	 * Returns the value of the '<em><b>Wind Gust Prob40</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability of wind gusts >= 40kn within the last 12 hours: 0..100% (FXh40)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wind Gust Prob40</em>' attribute.
	 * @see #setWindGustProb40(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWindData_WindGustProb40()
	 * @model
	 * @generated
	 */
	Float getWindGustProb40();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustProb40 <em>Wind Gust Prob40</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Gust Prob40</em>' attribute.
	 * @see #getWindGustProb40()
	 * @generated
	 */
	void setWindGustProb40(Float value);

	/**
	 * Returns the value of the '<em><b>Wind Gust Prob55</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability of wind gusts >= 55kn within the last 12 hours: 0..100% (FXh55)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wind Gust Prob55</em>' attribute.
	 * @see #setWindGustProb55(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWindData_WindGustProb55()
	 * @model
	 * @generated
	 */
	Float getWindGustProb55();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustProb55 <em>Wind Gust Prob55</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Gust Prob55</em>' attribute.
	 * @see #getWindGustProb55()
	 * @generated
	 */
	void setWindGustProb55(Float value);

} // WindData
