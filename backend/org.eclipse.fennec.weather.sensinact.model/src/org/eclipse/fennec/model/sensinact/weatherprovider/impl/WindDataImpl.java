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
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WindDataImpl#getWindGustLastHour <em>Wind Gust Last Hour</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WindDataImpl#getWindGustLastThreeHours <em>Wind Gust Last Three Hours</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WindDataImpl#getWindGustMaxLast12Hours <em>Wind Gust Max Last12 Hours</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WindDataImpl#getWindGustProb25 <em>Wind Gust Prob25</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WindDataImpl#getWindGustProb40 <em>Wind Gust Prob40</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WindDataImpl#getWindGustProb55 <em>Wind Gust Prob55</em>}</li>
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
	 * The default value of the '{@link #getWindGustLastHour() <em>Wind Gust Last Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindGustLastHour()
	 * @generated
	 * @ordered
	 */
	protected static final Float WIND_GUST_LAST_HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindGustLastHour() <em>Wind Gust Last Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindGustLastHour()
	 * @generated
	 * @ordered
	 */
	protected Float windGustLastHour = WIND_GUST_LAST_HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindGustLastThreeHours() <em>Wind Gust Last Three Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindGustLastThreeHours()
	 * @generated
	 * @ordered
	 */
	protected static final Float WIND_GUST_LAST_THREE_HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindGustLastThreeHours() <em>Wind Gust Last Three Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindGustLastThreeHours()
	 * @generated
	 * @ordered
	 */
	protected Float windGustLastThreeHours = WIND_GUST_LAST_THREE_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindGustMaxLast12Hours() <em>Wind Gust Max Last12 Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindGustMaxLast12Hours()
	 * @generated
	 * @ordered
	 */
	protected static final Float WIND_GUST_MAX_LAST12_HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindGustMaxLast12Hours() <em>Wind Gust Max Last12 Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindGustMaxLast12Hours()
	 * @generated
	 * @ordered
	 */
	protected Float windGustMaxLast12Hours = WIND_GUST_MAX_LAST12_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindGustProb25() <em>Wind Gust Prob25</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindGustProb25()
	 * @generated
	 * @ordered
	 */
	protected static final Float WIND_GUST_PROB25_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindGustProb25() <em>Wind Gust Prob25</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindGustProb25()
	 * @generated
	 * @ordered
	 */
	protected Float windGustProb25 = WIND_GUST_PROB25_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindGustProb40() <em>Wind Gust Prob40</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindGustProb40()
	 * @generated
	 * @ordered
	 */
	protected static final Float WIND_GUST_PROB40_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindGustProb40() <em>Wind Gust Prob40</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindGustProb40()
	 * @generated
	 * @ordered
	 */
	protected Float windGustProb40 = WIND_GUST_PROB40_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindGustProb55() <em>Wind Gust Prob55</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindGustProb55()
	 * @generated
	 * @ordered
	 */
	protected static final Float WIND_GUST_PROB55_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindGustProb55() <em>Wind Gust Prob55</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindGustProb55()
	 * @generated
	 * @ordered
	 */
	protected Float windGustProb55 = WIND_GUST_PROB55_EDEFAULT;

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
	public Float getWindGustLastHour() {
		return windGustLastHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindGustLastHour(Float newWindGustLastHour) {
		Float oldWindGustLastHour = windGustLastHour;
		windGustLastHour = newWindGustLastHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WIND_DATA__WIND_GUST_LAST_HOUR, oldWindGustLastHour, windGustLastHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getWindGustLastThreeHours() {
		return windGustLastThreeHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindGustLastThreeHours(Float newWindGustLastThreeHours) {
		Float oldWindGustLastThreeHours = windGustLastThreeHours;
		windGustLastThreeHours = newWindGustLastThreeHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WIND_DATA__WIND_GUST_LAST_THREE_HOURS, oldWindGustLastThreeHours, windGustLastThreeHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getWindGustMaxLast12Hours() {
		return windGustMaxLast12Hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindGustMaxLast12Hours(Float newWindGustMaxLast12Hours) {
		Float oldWindGustMaxLast12Hours = windGustMaxLast12Hours;
		windGustMaxLast12Hours = newWindGustMaxLast12Hours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WIND_DATA__WIND_GUST_MAX_LAST12_HOURS, oldWindGustMaxLast12Hours, windGustMaxLast12Hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getWindGustProb25() {
		return windGustProb25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindGustProb25(Float newWindGustProb25) {
		Float oldWindGustProb25 = windGustProb25;
		windGustProb25 = newWindGustProb25;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WIND_DATA__WIND_GUST_PROB25, oldWindGustProb25, windGustProb25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getWindGustProb40() {
		return windGustProb40;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindGustProb40(Float newWindGustProb40) {
		Float oldWindGustProb40 = windGustProb40;
		windGustProb40 = newWindGustProb40;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WIND_DATA__WIND_GUST_PROB40, oldWindGustProb40, windGustProb40));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getWindGustProb55() {
		return windGustProb55;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindGustProb55(Float newWindGustProb55) {
		Float oldWindGustProb55 = windGustProb55;
		windGustProb55 = newWindGustProb55;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WIND_DATA__WIND_GUST_PROB55, oldWindGustProb55, windGustProb55));
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
			case WeatherPackage.WIND_DATA__WIND_GUST_LAST_HOUR:
				return getWindGustLastHour();
			case WeatherPackage.WIND_DATA__WIND_GUST_LAST_THREE_HOURS:
				return getWindGustLastThreeHours();
			case WeatherPackage.WIND_DATA__WIND_GUST_MAX_LAST12_HOURS:
				return getWindGustMaxLast12Hours();
			case WeatherPackage.WIND_DATA__WIND_GUST_PROB25:
				return getWindGustProb25();
			case WeatherPackage.WIND_DATA__WIND_GUST_PROB40:
				return getWindGustProb40();
			case WeatherPackage.WIND_DATA__WIND_GUST_PROB55:
				return getWindGustProb55();
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
			case WeatherPackage.WIND_DATA__WIND_GUST_LAST_HOUR:
				setWindGustLastHour((Float)newValue);
				return;
			case WeatherPackage.WIND_DATA__WIND_GUST_LAST_THREE_HOURS:
				setWindGustLastThreeHours((Float)newValue);
				return;
			case WeatherPackage.WIND_DATA__WIND_GUST_MAX_LAST12_HOURS:
				setWindGustMaxLast12Hours((Float)newValue);
				return;
			case WeatherPackage.WIND_DATA__WIND_GUST_PROB25:
				setWindGustProb25((Float)newValue);
				return;
			case WeatherPackage.WIND_DATA__WIND_GUST_PROB40:
				setWindGustProb40((Float)newValue);
				return;
			case WeatherPackage.WIND_DATA__WIND_GUST_PROB55:
				setWindGustProb55((Float)newValue);
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
			case WeatherPackage.WIND_DATA__WIND_GUST_LAST_HOUR:
				setWindGustLastHour(WIND_GUST_LAST_HOUR_EDEFAULT);
				return;
			case WeatherPackage.WIND_DATA__WIND_GUST_LAST_THREE_HOURS:
				setWindGustLastThreeHours(WIND_GUST_LAST_THREE_HOURS_EDEFAULT);
				return;
			case WeatherPackage.WIND_DATA__WIND_GUST_MAX_LAST12_HOURS:
				setWindGustMaxLast12Hours(WIND_GUST_MAX_LAST12_HOURS_EDEFAULT);
				return;
			case WeatherPackage.WIND_DATA__WIND_GUST_PROB25:
				setWindGustProb25(WIND_GUST_PROB25_EDEFAULT);
				return;
			case WeatherPackage.WIND_DATA__WIND_GUST_PROB40:
				setWindGustProb40(WIND_GUST_PROB40_EDEFAULT);
				return;
			case WeatherPackage.WIND_DATA__WIND_GUST_PROB55:
				setWindGustProb55(WIND_GUST_PROB55_EDEFAULT);
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
			case WeatherPackage.WIND_DATA__WIND_GUST_LAST_HOUR:
				return WIND_GUST_LAST_HOUR_EDEFAULT == null ? windGustLastHour != null : !WIND_GUST_LAST_HOUR_EDEFAULT.equals(windGustLastHour);
			case WeatherPackage.WIND_DATA__WIND_GUST_LAST_THREE_HOURS:
				return WIND_GUST_LAST_THREE_HOURS_EDEFAULT == null ? windGustLastThreeHours != null : !WIND_GUST_LAST_THREE_HOURS_EDEFAULT.equals(windGustLastThreeHours);
			case WeatherPackage.WIND_DATA__WIND_GUST_MAX_LAST12_HOURS:
				return WIND_GUST_MAX_LAST12_HOURS_EDEFAULT == null ? windGustMaxLast12Hours != null : !WIND_GUST_MAX_LAST12_HOURS_EDEFAULT.equals(windGustMaxLast12Hours);
			case WeatherPackage.WIND_DATA__WIND_GUST_PROB25:
				return WIND_GUST_PROB25_EDEFAULT == null ? windGustProb25 != null : !WIND_GUST_PROB25_EDEFAULT.equals(windGustProb25);
			case WeatherPackage.WIND_DATA__WIND_GUST_PROB40:
				return WIND_GUST_PROB40_EDEFAULT == null ? windGustProb40 != null : !WIND_GUST_PROB40_EDEFAULT.equals(windGustProb40);
			case WeatherPackage.WIND_DATA__WIND_GUST_PROB55:
				return WIND_GUST_PROB55_EDEFAULT == null ? windGustProb55 != null : !WIND_GUST_PROB55_EDEFAULT.equals(windGustProb55);
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
		result.append(", windGustLastHour: ");
		result.append(windGustLastHour);
		result.append(", windGustLastThreeHours: ");
		result.append(windGustLastThreeHours);
		result.append(", windGustMaxLast12Hours: ");
		result.append(windGustMaxLast12Hours);
		result.append(", windGustProb25: ");
		result.append(windGustProb25);
		result.append(", windGustProb40: ");
		result.append(windGustProb40);
		result.append(", windGustProb55: ");
		result.append(windGustProb55);
		result.append(')');
		return result.toString();
	}

} //WindDataImpl
