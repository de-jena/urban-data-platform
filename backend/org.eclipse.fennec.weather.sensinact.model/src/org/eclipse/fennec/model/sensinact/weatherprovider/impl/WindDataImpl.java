/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage;
import org.eclipse.fennec.model.sensinact.weatherprovider.WindData;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WindDataImpl#getWindDirection <em>Wind Direction</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WindDataImpl#getWindSpeed <em>Wind Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindDataImpl extends ServiceImpl implements WindData {
	/**
	 * The default value of the '{@link #getWindDirection() <em>Wind Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Float WIND_DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindDirection() <em>Wind Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindDirection()
	 * @generated
	 * @ordered
	 */
	protected Float windDirection = WIND_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindSpeed() <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Float WIND_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindSpeed() <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindSpeed()
	 * @generated
	 * @ordered
	 */
	protected Float windSpeed = WIND_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WeatherPackage.Literals.WIND_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getWindDirection() {
		return windDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindDirection(Float newWindDirection) {
		Float oldWindDirection = windDirection;
		windDirection = newWindDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WIND_DATA__WIND_DIRECTION, oldWindDirection, windDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getWindSpeed() {
		return windSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindSpeed(Float newWindSpeed) {
		Float oldWindSpeed = windSpeed;
		windSpeed = newWindSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WIND_DATA__WIND_SPEED, oldWindSpeed, windSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WeatherPackage.WIND_DATA__WIND_DIRECTION:
				return getWindDirection();
			case WeatherPackage.WIND_DATA__WIND_SPEED:
				return getWindSpeed();
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
			case WeatherPackage.WIND_DATA__WIND_DIRECTION:
				setWindDirection((Float)newValue);
				return;
			case WeatherPackage.WIND_DATA__WIND_SPEED:
				setWindSpeed((Float)newValue);
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
			case WeatherPackage.WIND_DATA__WIND_DIRECTION:
				setWindDirection(WIND_DIRECTION_EDEFAULT);
				return;
			case WeatherPackage.WIND_DATA__WIND_SPEED:
				setWindSpeed(WIND_SPEED_EDEFAULT);
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
			case WeatherPackage.WIND_DATA__WIND_DIRECTION:
				return WIND_DIRECTION_EDEFAULT == null ? windDirection != null : !WIND_DIRECTION_EDEFAULT.equals(windDirection);
			case WeatherPackage.WIND_DATA__WIND_SPEED:
				return WIND_SPEED_EDEFAULT == null ? windSpeed != null : !WIND_SPEED_EDEFAULT.equals(windSpeed);
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
		result.append(" (windDirection: ");
		result.append(windDirection);
		result.append(", windSpeed: ");
		result.append(windSpeed);
		result.append(')');
		return result.toString();
	}

} //WindDataImpl
