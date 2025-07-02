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

} // WindData
