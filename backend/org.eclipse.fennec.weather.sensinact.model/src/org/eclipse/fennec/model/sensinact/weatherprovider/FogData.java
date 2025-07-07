/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fog Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.FogData#getFogPropLast1 <em>Fog Prop Last1</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.FogData#getFogPropLast6 <em>Fog Prop Last6</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.FogData#getFogPropLast12 <em>Fog Prop Last12</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getFogData()
 * @model
 * @generated
 */
@ProviderType
public interface FogData extends Service {
	/**
	 * Returns the value of the '<em><b>Fog Prop Last1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability for fog within the last hour: 0..100% (wwM)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fog Prop Last1</em>' attribute.
	 * @see #setFogPropLast1(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getFogData_FogPropLast1()
	 * @model
	 * @generated
	 */
	Float getFogPropLast1();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.FogData#getFogPropLast1 <em>Fog Prop Last1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fog Prop Last1</em>' attribute.
	 * @see #getFogPropLast1()
	 * @generated
	 */
	void setFogPropLast1(Float value);

	/**
	 * Returns the value of the '<em><b>Fog Prop Last6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability for fog within the last 6 hours: 0..100% (wwM6)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fog Prop Last6</em>' attribute.
	 * @see #setFogPropLast6(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getFogData_FogPropLast6()
	 * @model
	 * @generated
	 */
	Float getFogPropLast6();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.FogData#getFogPropLast6 <em>Fog Prop Last6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fog Prop Last6</em>' attribute.
	 * @see #getFogPropLast6()
	 * @generated
	 */
	void setFogPropLast6(Float value);

	/**
	 * Returns the value of the '<em><b>Fog Prop Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability for fog within the last 12 hours: 0..100% (wwMh)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fog Prop Last12</em>' attribute.
	 * @see #setFogPropLast12(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getFogData_FogPropLast12()
	 * @model
	 * @generated
	 */
	Float getFogPropLast12();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.FogData#getFogPropLast12 <em>Fog Prop Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fog Prop Last12</em>' attribute.
	 * @see #getFogPropLast12()
	 * @generated
	 */
	void setFogPropLast12(Float value);

} // FogData
