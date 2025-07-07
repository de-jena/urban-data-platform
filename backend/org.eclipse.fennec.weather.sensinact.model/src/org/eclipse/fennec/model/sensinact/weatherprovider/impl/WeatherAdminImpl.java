/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherAdmin;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage;

import org.eclipse.sensinact.model.core.provider.impl.AdminImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherAdminImpl#getWeatherStationId <em>Weather Station Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherAdminImpl#getWeatherStationName <em>Weather Station Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeatherAdminImpl extends AdminImpl implements WeatherAdmin {
	/**
	 * The default value of the '{@link #getWeatherStationId() <em>Weather Station Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeatherStationId()
	 * @generated
	 * @ordered
	 */
	protected static final String WEATHER_STATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeatherStationId() <em>Weather Station Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeatherStationId()
	 * @generated
	 * @ordered
	 */
	protected String weatherStationId = WEATHER_STATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeatherStationName() <em>Weather Station Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeatherStationName()
	 * @generated
	 * @ordered
	 */
	protected static final String WEATHER_STATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeatherStationName() <em>Weather Station Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeatherStationName()
	 * @generated
	 * @ordered
	 */
	protected String weatherStationName = WEATHER_STATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeatherAdminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WeatherPackage.Literals.WEATHER_ADMIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWeatherStationId() {
		return weatherStationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeatherStationId(String newWeatherStationId) {
		String oldWeatherStationId = weatherStationId;
		weatherStationId = newWeatherStationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_ADMIN__WEATHER_STATION_ID, oldWeatherStationId, weatherStationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWeatherStationName() {
		return weatherStationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeatherStationName(String newWeatherStationName) {
		String oldWeatherStationName = weatherStationName;
		weatherStationName = newWeatherStationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_ADMIN__WEATHER_STATION_NAME, oldWeatherStationName, weatherStationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WeatherPackage.WEATHER_ADMIN__WEATHER_STATION_ID:
				return getWeatherStationId();
			case WeatherPackage.WEATHER_ADMIN__WEATHER_STATION_NAME:
				return getWeatherStationName();
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
			case WeatherPackage.WEATHER_ADMIN__WEATHER_STATION_ID:
				setWeatherStationId((String)newValue);
				return;
			case WeatherPackage.WEATHER_ADMIN__WEATHER_STATION_NAME:
				setWeatherStationName((String)newValue);
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
			case WeatherPackage.WEATHER_ADMIN__WEATHER_STATION_ID:
				setWeatherStationId(WEATHER_STATION_ID_EDEFAULT);
				return;
			case WeatherPackage.WEATHER_ADMIN__WEATHER_STATION_NAME:
				setWeatherStationName(WEATHER_STATION_NAME_EDEFAULT);
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
			case WeatherPackage.WEATHER_ADMIN__WEATHER_STATION_ID:
				return WEATHER_STATION_ID_EDEFAULT == null ? weatherStationId != null : !WEATHER_STATION_ID_EDEFAULT.equals(weatherStationId);
			case WeatherPackage.WEATHER_ADMIN__WEATHER_STATION_NAME:
				return WEATHER_STATION_NAME_EDEFAULT == null ? weatherStationName != null : !WEATHER_STATION_NAME_EDEFAULT.equals(weatherStationName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (weatherStationId: ");
		result.append(weatherStationId);
		result.append(", weatherStationName: ");
		result.append(weatherStationName);
		result.append(')');
		return result.toString();
	}

} //WeatherAdminImpl
