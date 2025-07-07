/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Snow Rain Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.SnowRainData#getSnowRainEqLast1 <em>Snow Rain Eq Last1</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.SnowRainData#getSnowRainEqLast3 <em>Snow Rain Eq Last3</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getSnowRainData()
 * @model
 * @generated
 */
@ProviderType
public interface SnowRainData extends Service {
	/**
	 * Returns the value of the '<em><b>Snow Rain Eq Last1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Snow-Rain-Equivalent during the last hour: kg/m2 (RRS1c)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Snow Rain Eq Last1</em>' attribute.
	 * @see #setSnowRainEqLast1(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getSnowRainData_SnowRainEqLast1()
	 * @model
	 * @generated
	 */
	Float getSnowRainEqLast1();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.SnowRainData#getSnowRainEqLast1 <em>Snow Rain Eq Last1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snow Rain Eq Last1</em>' attribute.
	 * @see #getSnowRainEqLast1()
	 * @generated
	 */
	void setSnowRainEqLast1(Float value);

	/**
	 * Returns the value of the '<em><b>Snow Rain Eq Last3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Snow-Rain-Equivalent during the 3 hours: kg/m2 (RRS3c)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Snow Rain Eq Last3</em>' attribute.
	 * @see #setSnowRainEqLast3(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getSnowRainData_SnowRainEqLast3()
	 * @model
	 * @generated
	 */
	Float getSnowRainEqLast3();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.SnowRainData#getSnowRainEqLast3 <em>Snow Rain Eq Last3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snow Rain Eq Last3</em>' attribute.
	 * @see #getSnowRainEqLast3()
	 * @generated
	 */
	void setSnowRainEqLast3(Float value);

} // SnowRainData
