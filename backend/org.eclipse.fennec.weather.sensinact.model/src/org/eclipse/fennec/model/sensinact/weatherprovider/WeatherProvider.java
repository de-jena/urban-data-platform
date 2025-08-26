/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.eclipse.fennec.model.sensinact.weatherprovider;

import org.eclipse.sensinact.model.core.provider.Provider;

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
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getCurrentWeather <em>Current Weather</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast3H <em>Forecast3 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast6H <em>Forecast6 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast9H <em>Forecast9 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast12H <em>Forecast12 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast15H <em>Forecast15 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast18H <em>Forecast18 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast21H <em>Forecast21 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast24H <em>Forecast24 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast27H <em>Forecast27 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast30H <em>Forecast30 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast33H <em>Forecast33 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast36H <em>Forecast36 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast39H <em>Forecast39 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast42H <em>Forecast42 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast45H <em>Forecast45 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast48H <em>Forecast48 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast51H <em>Forecast51 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast54H <em>Forecast54 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast57H <em>Forecast57 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast60H <em>Forecast60 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast63H <em>Forecast63 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast66H <em>Forecast66 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast69H <em>Forecast69 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast72H <em>Forecast72 H</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider()
 * @model
 * @generated
 */
@ProviderType
public interface WeatherProvider extends Provider {
	/**
	 * Returns the value of the '<em><b>Current Weather</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Weather</em>' containment reference.
	 * @see #setCurrentWeather(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_CurrentWeather()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getCurrentWeather();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getCurrentWeather <em>Current Weather</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Weather</em>' containment reference.
	 * @see #getCurrentWeather()
	 * @generated
	 */
	void setCurrentWeather(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast3 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast3 H</em>' containment reference.
	 * @see #setForecast3H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast3H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast3H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast3H <em>Forecast3 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast3 H</em>' containment reference.
	 * @see #getForecast3H()
	 * @generated
	 */
	void setForecast3H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast6 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast6 H</em>' containment reference.
	 * @see #setForecast6H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast6H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast6H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast6H <em>Forecast6 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast6 H</em>' containment reference.
	 * @see #getForecast6H()
	 * @generated
	 */
	void setForecast6H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast9 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast9 H</em>' containment reference.
	 * @see #setForecast9H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast9H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast9H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast9H <em>Forecast9 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast9 H</em>' containment reference.
	 * @see #getForecast9H()
	 * @generated
	 */
	void setForecast9H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast12 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast12 H</em>' containment reference.
	 * @see #setForecast12H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast12H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast12H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast12H <em>Forecast12 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast12 H</em>' containment reference.
	 * @see #getForecast12H()
	 * @generated
	 */
	void setForecast12H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast15 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast15 H</em>' containment reference.
	 * @see #setForecast15H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast15H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast15H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast15H <em>Forecast15 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast15 H</em>' containment reference.
	 * @see #getForecast15H()
	 * @generated
	 */
	void setForecast15H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast18 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast18 H</em>' containment reference.
	 * @see #setForecast18H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast18H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast18H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast18H <em>Forecast18 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast18 H</em>' containment reference.
	 * @see #getForecast18H()
	 * @generated
	 */
	void setForecast18H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast21 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast21 H</em>' containment reference.
	 * @see #setForecast21H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast21H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast21H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast21H <em>Forecast21 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast21 H</em>' containment reference.
	 * @see #getForecast21H()
	 * @generated
	 */
	void setForecast21H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast24 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast24 H</em>' containment reference.
	 * @see #setForecast24H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast24H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast24H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast24H <em>Forecast24 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast24 H</em>' containment reference.
	 * @see #getForecast24H()
	 * @generated
	 */
	void setForecast24H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast27 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast27 H</em>' containment reference.
	 * @see #setForecast27H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast27H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast27H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast27H <em>Forecast27 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast27 H</em>' containment reference.
	 * @see #getForecast27H()
	 * @generated
	 */
	void setForecast27H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast30 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast30 H</em>' containment reference.
	 * @see #setForecast30H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast30H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast30H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast30H <em>Forecast30 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast30 H</em>' containment reference.
	 * @see #getForecast30H()
	 * @generated
	 */
	void setForecast30H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast33 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast33 H</em>' containment reference.
	 * @see #setForecast33H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast33H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast33H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast33H <em>Forecast33 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast33 H</em>' containment reference.
	 * @see #getForecast33H()
	 * @generated
	 */
	void setForecast33H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast36 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast36 H</em>' containment reference.
	 * @see #setForecast36H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast36H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast36H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast36H <em>Forecast36 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast36 H</em>' containment reference.
	 * @see #getForecast36H()
	 * @generated
	 */
	void setForecast36H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast39 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast39 H</em>' containment reference.
	 * @see #setForecast39H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast39H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast39H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast39H <em>Forecast39 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast39 H</em>' containment reference.
	 * @see #getForecast39H()
	 * @generated
	 */
	void setForecast39H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast42 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast42 H</em>' containment reference.
	 * @see #setForecast42H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast42H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast42H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast42H <em>Forecast42 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast42 H</em>' containment reference.
	 * @see #getForecast42H()
	 * @generated
	 */
	void setForecast42H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast45 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast45 H</em>' containment reference.
	 * @see #setForecast45H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast45H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast45H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast45H <em>Forecast45 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast45 H</em>' containment reference.
	 * @see #getForecast45H()
	 * @generated
	 */
	void setForecast45H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast48 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast48 H</em>' containment reference.
	 * @see #setForecast48H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast48H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast48H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast48H <em>Forecast48 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast48 H</em>' containment reference.
	 * @see #getForecast48H()
	 * @generated
	 */
	void setForecast48H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast51 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast51 H</em>' containment reference.
	 * @see #setForecast51H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast51H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast51H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast51H <em>Forecast51 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast51 H</em>' containment reference.
	 * @see #getForecast51H()
	 * @generated
	 */
	void setForecast51H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast54 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast54 H</em>' containment reference.
	 * @see #setForecast54H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast54H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast54H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast54H <em>Forecast54 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast54 H</em>' containment reference.
	 * @see #getForecast54H()
	 * @generated
	 */
	void setForecast54H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast57 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast57 H</em>' containment reference.
	 * @see #setForecast57H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast57H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast57H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast57H <em>Forecast57 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast57 H</em>' containment reference.
	 * @see #getForecast57H()
	 * @generated
	 */
	void setForecast57H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast60 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast60 H</em>' containment reference.
	 * @see #setForecast60H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast60H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast60H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast60H <em>Forecast60 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast60 H</em>' containment reference.
	 * @see #getForecast60H()
	 * @generated
	 */
	void setForecast60H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast63 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast63 H</em>' containment reference.
	 * @see #setForecast63H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast63H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast63H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast63H <em>Forecast63 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast63 H</em>' containment reference.
	 * @see #getForecast63H()
	 * @generated
	 */
	void setForecast63H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast66 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast66 H</em>' containment reference.
	 * @see #setForecast66H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast66H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast66H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast66H <em>Forecast66 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast66 H</em>' containment reference.
	 * @see #getForecast66H()
	 * @generated
	 */
	void setForecast66H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast69 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast69 H</em>' containment reference.
	 * @see #setForecast69H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast69H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast69H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast69H <em>Forecast69 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast69 H</em>' containment reference.
	 * @see #getForecast69H()
	 * @generated
	 */
	void setForecast69H(WeatherService value);

	/**
	 * Returns the value of the '<em><b>Forecast72 H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast72 H</em>' containment reference.
	 * @see #setForecast72H(WeatherService)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getWeatherProvider_Forecast72H()
	 * @model containment="true"
	 * @generated
	 */
	WeatherService getForecast72H();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast72H <em>Forecast72 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast72 H</em>' containment reference.
	 * @see #getForecast72H()
	 * @generated
	 */
	void setForecast72H(WeatherService value);

} // WeatherProvider
