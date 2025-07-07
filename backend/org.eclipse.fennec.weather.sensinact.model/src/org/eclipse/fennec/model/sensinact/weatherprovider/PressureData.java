/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pressure Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.PressureData#getSurfacePressure <em>Surface Pressure</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getPressureData()
 * @model
 * @generated
 */
@ProviderType
public interface PressureData extends Service {
	/**
	 * Returns the value of the '<em><b>Surface Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Surface pressure, reduced: Pa (PPPP)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Pressure</em>' attribute.
	 * @see #setSurfacePressure(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getPressureData_SurfacePressure()
	 * @model
	 * @generated
	 */
	Float getSurfacePressure();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PressureData#getSurfacePressure <em>Surface Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Pressure</em>' attribute.
	 * @see #getSurfacePressure()
	 * @generated
	 */
	void setSurfacePressure(Float value);

} // PressureData
