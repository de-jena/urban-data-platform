/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Significant Weather Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.SignificantWeatherData#getWw <em>Ww</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.SignificantWeatherData#getW1w2_w1 <em>W1w2 w1</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.SignificantWeatherData#getW1w2_w2 <em>W1w2 w2</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getSignificantWeatherData()
 * @model
 * @generated
 */
@ProviderType
public interface SignificantWeatherData extends Service {
	/**
	 * Returns the value of the '<em><b>Ww</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ww</em>' attribute.
	 * @see #setWw(String)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getSignificantWeatherData_Ww()
	 * @model
	 * @generated
	 */
	String getWw();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.SignificantWeatherData#getWw <em>Ww</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ww</em>' attribute.
	 * @see #getWw()
	 * @generated
	 */
	void setWw(String value);

	/**
	 * Returns the value of the '<em><b>W1w2 w1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W1w2 w1</em>' attribute.
	 * @see #setW1w2_w1(String)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getSignificantWeatherData_W1w2_w1()
	 * @model
	 * @generated
	 */
	String getW1w2_w1();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.SignificantWeatherData#getW1w2_w1 <em>W1w2 w1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W1w2 w1</em>' attribute.
	 * @see #getW1w2_w1()
	 * @generated
	 */
	void setW1w2_w1(String value);

	/**
	 * Returns the value of the '<em><b>W1w2 w2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W1w2 w2</em>' attribute.
	 * @see #setW1w2_w2(String)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getSignificantWeatherData_W1w2_w2()
	 * @model
	 * @generated
	 */
	String getW1w2_w2();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.SignificantWeatherData#getW1w2_w2 <em>W1w2 w2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W1w2 w2</em>' attribute.
	 * @see #getW1w2_w2()
	 * @generated
	 */
	void setW1w2_w2(String value);

} // SignificantWeatherData
