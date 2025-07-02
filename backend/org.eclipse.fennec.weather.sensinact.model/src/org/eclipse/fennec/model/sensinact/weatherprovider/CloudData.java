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

} // CloudData
