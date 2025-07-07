/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverTotal <em>Cloud Cover Total</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverBelow500 <em>Cloud Cover Below500</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverEffective <em>Cloud Cover Effective</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverHigh <em>Cloud Cover High</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverMid <em>Cloud Cover Mid</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverLow <em>Cloud Cover Low</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getCloudData()
 * @model
 * @generated
 */
@ProviderType
public interface CloudData extends Service {
	/**
	 * Returns the value of the '<em><b>Cloud Cover Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total cloud cover: 0..100% (N)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloud Cover Total</em>' attribute.
	 * @see #setCloudCoverTotal(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getCloudData_CloudCoverTotal()
	 * @model
	 * @generated
	 */
	Float getCloudCoverTotal();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverTotal <em>Cloud Cover Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Cover Total</em>' attribute.
	 * @see #getCloudCoverTotal()
	 * @generated
	 */
	void setCloudCoverTotal(Float value);

	/**
	 * Returns the value of the '<em><b>Cloud Cover Below500</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cloud cover below 500 ft.: 0..100% (N05)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloud Cover Below500</em>' attribute.
	 * @see #setCloudCoverBelow500(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getCloudData_CloudCoverBelow500()
	 * @model
	 * @generated
	 */
	Float getCloudCoverBelow500();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverBelow500 <em>Cloud Cover Below500</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Cover Below500</em>' attribute.
	 * @see #getCloudCoverBelow500()
	 * @generated
	 */
	void setCloudCoverBelow500(Float value);

	/**
	 * Returns the value of the '<em><b>Cloud Cover Effective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Effective cloud cover: 0..100% (Neff)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloud Cover Effective</em>' attribute.
	 * @see #setCloudCoverEffective(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getCloudData_CloudCoverEffective()
	 * @model
	 * @generated
	 */
	Float getCloudCoverEffective();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverEffective <em>Cloud Cover Effective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Cover Effective</em>' attribute.
	 * @see #getCloudCoverEffective()
	 * @generated
	 */
	void setCloudCoverEffective(Float value);

	/**
	 * Returns the value of the '<em><b>Cloud Cover High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * High cloud cover (>7 km): 0..100% (Nh)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloud Cover High</em>' attribute.
	 * @see #setCloudCoverHigh(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getCloudData_CloudCoverHigh()
	 * @model
	 * @generated
	 */
	Float getCloudCoverHigh();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverHigh <em>Cloud Cover High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Cover High</em>' attribute.
	 * @see #getCloudCoverHigh()
	 * @generated
	 */
	void setCloudCoverHigh(Float value);

	/**
	 * Returns the value of the '<em><b>Cloud Cover Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Midlevel cloud cover (2-7 km): 0..100% (Nm)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloud Cover Mid</em>' attribute.
	 * @see #setCloudCoverMid(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getCloudData_CloudCoverMid()
	 * @model
	 * @generated
	 */
	Float getCloudCoverMid();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverMid <em>Cloud Cover Mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Cover Mid</em>' attribute.
	 * @see #getCloudCoverMid()
	 * @generated
	 */
	void setCloudCoverMid(Float value);

	/**
	 * Returns the value of the '<em><b>Cloud Cover Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Low cloud cover (lower than 2 km): 0..100% (Nl)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloud Cover Low</em>' attribute.
	 * @see #setCloudCoverLow(Float)
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#getCloudData_CloudCoverLow()
	 * @model
	 * @generated
	 */
	Float getCloudCoverLow();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverLow <em>Cloud Cover Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Cover Low</em>' attribute.
	 * @see #getCloudCoverLow()
	 * @generated
	 */
	void setCloudCoverLow(Float value);

} // CloudData
