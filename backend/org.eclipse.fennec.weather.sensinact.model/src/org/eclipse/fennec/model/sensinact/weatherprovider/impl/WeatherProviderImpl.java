/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.CloudData;
import org.eclipse.fennec.model.sensinact.weatherprovider.Station;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider;
import org.eclipse.fennec.model.sensinact.weatherprovider.WindData;

import org.eclipse.sensinact.model.core.provider.impl.DynamicProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getStation <em>Station</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getWindData <em>Wind Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getCloudData <em>Cloud Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeatherProviderImpl extends DynamicProviderImpl implements WeatherProvider {
	/**
	 * The cached value of the '{@link #getStation() <em>Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStation()
	 * @generated
	 * @ordered
	 */
	protected Station station;

	/**
	 * The cached value of the '{@link #getWindData() <em>Wind Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindData()
	 * @generated
	 * @ordered
	 */
	protected WindData windData;

	/**
	 * The cached value of the '{@link #getCloudData() <em>Cloud Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudData()
	 * @generated
	 * @ordered
	 */
	protected CloudData cloudData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeatherProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WeatherPackage.Literals.WEATHER_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Station getStation() {
		if (station != null && station.eIsProxy()) {
			InternalEObject oldStation = (InternalEObject)station;
			station = (Station)eResolveProxy(oldStation);
			if (station != oldStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__STATION, oldStation, station));
			}
		}
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetStation() {
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStation(Station newStation) {
		Station oldStation = station;
		station = newStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__STATION, oldStation, station));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WindData getWindData() {
		if (windData != null && windData.eIsProxy()) {
			InternalEObject oldWindData = (InternalEObject)windData;
			windData = (WindData)eResolveProxy(oldWindData);
			if (windData != oldWindData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__WIND_DATA, oldWindData, windData));
			}
		}
		return windData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindData basicGetWindData() {
		return windData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindData(WindData newWindData) {
		WindData oldWindData = windData;
		windData = newWindData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__WIND_DATA, oldWindData, windData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudData getCloudData() {
		if (cloudData != null && cloudData.eIsProxy()) {
			InternalEObject oldCloudData = (InternalEObject)cloudData;
			cloudData = (CloudData)eResolveProxy(oldCloudData);
			if (cloudData != oldCloudData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__CLOUD_DATA, oldCloudData, cloudData));
			}
		}
		return cloudData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudData basicGetCloudData() {
		return cloudData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudData(CloudData newCloudData) {
		CloudData oldCloudData = cloudData;
		cloudData = newCloudData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__CLOUD_DATA, oldCloudData, cloudData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WeatherPackage.WEATHER_PROVIDER__STATION:
				if (resolve) return getStation();
				return basicGetStation();
			case WeatherPackage.WEATHER_PROVIDER__WIND_DATA:
				if (resolve) return getWindData();
				return basicGetWindData();
			case WeatherPackage.WEATHER_PROVIDER__CLOUD_DATA:
				if (resolve) return getCloudData();
				return basicGetCloudData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WeatherPackage.WEATHER_PROVIDER__STATION:
				setStation((Station)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__WIND_DATA:
				setWindData((WindData)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__CLOUD_DATA:
				setCloudData((CloudData)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WeatherPackage.WEATHER_PROVIDER__STATION:
				setStation((Station)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__WIND_DATA:
				setWindData((WindData)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__CLOUD_DATA:
				setCloudData((CloudData)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WeatherPackage.WEATHER_PROVIDER__STATION:
				return station != null;
			case WeatherPackage.WEATHER_PROVIDER__WIND_DATA:
				return windData != null;
			case WeatherPackage.WEATHER_PROVIDER__CLOUD_DATA:
				return cloudData != null;
		}
		return super.eIsSet(featureID);
	}

} //WeatherProviderImpl
