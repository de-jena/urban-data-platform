/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temperature Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempAboveSurface5 <em>Temp Above Surface5</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempAboveSurface200 <em>Temp Above Surface200</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempDewpointAboveSurface200 <em>Temp Dewpoint Above Surface200</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempMinLast12 <em>Temp Min Last12</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempMaxLast12 <em>Temp Max Last12</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getTemperatureData()
 * @model
 * @generated
 */
@ProviderType
public interface TemperatureData extends Service {
	/**
	 * Returns the value of the '<em><b>Temp Above Surface5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temperature 5cm above surface: Kelvin (T5cm)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temp Above Surface5</em>' attribute.
	 * @see #setTempAboveSurface5(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getTemperatureData_TempAboveSurface5()
	 * @model
	 * @generated
	 */
	Float getTempAboveSurface5();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempAboveSurface5 <em>Temp Above Surface5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Above Surface5</em>' attribute.
	 * @see #getTempAboveSurface5()
	 * @generated
	 */
	void setTempAboveSurface5(Float value);

	/**
	 * Returns the value of the '<em><b>Temp Above Surface200</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temperature 2m above surface: Kelvin (TTT)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temp Above Surface200</em>' attribute.
	 * @see #setTempAboveSurface200(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getTemperatureData_TempAboveSurface200()
	 * @model
	 * @generated
	 */
	Float getTempAboveSurface200();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempAboveSurface200 <em>Temp Above Surface200</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Above Surface200</em>' attribute.
	 * @see #getTempAboveSurface200()
	 * @generated
	 */
	void setTempAboveSurface200(Float value);

	/**
	 * Returns the value of the '<em><b>Temp Dewpoint Above Surface200</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dewpoint 2m above surface: Kelvin (Td)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temp Dewpoint Above Surface200</em>' attribute.
	 * @see #setTempDewpointAboveSurface200(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getTemperatureData_TempDewpointAboveSurface200()
	 * @model
	 * @generated
	 */
	Float getTempDewpointAboveSurface200();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempDewpointAboveSurface200 <em>Temp Dewpoint Above Surface200</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Dewpoint Above Surface200</em>' attribute.
	 * @see #getTempDewpointAboveSurface200()
	 * @generated
	 */
	void setTempDewpointAboveSurface200(Float value);

	/**
	 * Returns the value of the '<em><b>Temp Min Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum temperature - within the last 12 hours: Kelvin (TN)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temp Min Last12</em>' attribute.
	 * @see #setTempMinLast12(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getTemperatureData_TempMinLast12()
	 * @model
	 * @generated
	 */
	Float getTempMinLast12();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempMinLast12 <em>Temp Min Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Min Last12</em>' attribute.
	 * @see #getTempMinLast12()
	 * @generated
	 */
	void setTempMinLast12(Float value);

	/**
	 * Returns the value of the '<em><b>Temp Max Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum temperature - within the last 12 hours: Kelvin (TX)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temp Max Last12</em>' attribute.
	 * @see #setTempMaxLast12(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getTemperatureData_TempMaxLast12()
	 * @model
	 * @generated
	 */
	Float getTempMaxLast12();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempMaxLast12 <em>Temp Max Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Max Last12</em>' attribute.
	 * @see #getTempMaxLast12()
	 * @generated
	 */
	void setTempMaxLast12(Float value);

} // TemperatureData
