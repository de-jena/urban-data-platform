/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Irradiance Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.IrradianceData#getIrRadianceGlobal <em>Ir Radiance Global</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getIrradianceData()
 * @model
 * @generated
 */
@ProviderType
public interface IrradianceData extends Service {
	/**
	 * Returns the value of the '<em><b>Ir Radiance Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Global Irradiance: kJ/m2 (Rad1h)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ir Radiance Global</em>' attribute.
	 * @see #setIrRadianceGlobal(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getIrradianceData_IrRadianceGlobal()
	 * @model
	 * @generated
	 */
	Float getIrRadianceGlobal();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.IrradianceData#getIrRadianceGlobal <em>Ir Radiance Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ir Radiance Global</em>' attribute.
	 * @see #getIrRadianceGlobal()
	 * @generated
	 */
	void setIrRadianceGlobal(Float value);

} // IrradianceData
