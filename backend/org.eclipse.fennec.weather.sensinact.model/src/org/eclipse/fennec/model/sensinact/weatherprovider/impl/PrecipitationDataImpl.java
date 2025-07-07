/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precipitation Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.PrecipitationDataImpl#getPrecipitationLarger02Last6 <em>Precipitation Larger02 Last6</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.PrecipitationDataImpl#getPrecipitationLarger50Last6 <em>Precipitation Larger50 Last6</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.PrecipitationDataImpl#getPrecipitationLarger02LastDay <em>Precipitation Larger02 Last Day</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.PrecipitationDataImpl#getPrecipitationLarger50LastDay <em>Precipitation Larger50 Last Day</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.PrecipitationDataImpl#getPrecipitationLarger00Last12 <em>Precipitation Larger00 Last12</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.PrecipitationDataImpl#getPrecipitationLarger02Last12 <em>Precipitation Larger02 Last12</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.PrecipitationDataImpl#getPrecipitationLarger10Last12 <em>Precipitation Larger10 Last12</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.PrecipitationDataImpl#getPrecipitationLarger50Last12 <em>Precipitation Larger50 Last12</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.PrecipitationDataImpl#getPrecipitationSignificantWeatherTotal <em>Precipitation Significant Weather Total</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.PrecipitationDataImpl#getPrecipitationSignificantWeatherLast3 <em>Precipitation Significant Weather Last3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrecipitationDataImpl extends ServiceImpl implements PrecipitationData {
	/**
	 * The default value of the '{@link #getPrecipitationLarger02Last6() <em>Precipitation Larger02 Last6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger02Last6()
	 * @generated
	 * @ordered
	 */
	protected static final Float PRECIPITATION_LARGER02_LAST6_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecipitationLarger02Last6() <em>Precipitation Larger02 Last6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger02Last6()
	 * @generated
	 * @ordered
	 */
	protected Float precipitationLarger02Last6 = PRECIPITATION_LARGER02_LAST6_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecipitationLarger50Last6() <em>Precipitation Larger50 Last6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger50Last6()
	 * @generated
	 * @ordered
	 */
	protected static final Float PRECIPITATION_LARGER50_LAST6_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecipitationLarger50Last6() <em>Precipitation Larger50 Last6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger50Last6()
	 * @generated
	 * @ordered
	 */
	protected Float precipitationLarger50Last6 = PRECIPITATION_LARGER50_LAST6_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecipitationLarger02LastDay() <em>Precipitation Larger02 Last Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger02LastDay()
	 * @generated
	 * @ordered
	 */
	protected static final Float PRECIPITATION_LARGER02_LAST_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecipitationLarger02LastDay() <em>Precipitation Larger02 Last Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger02LastDay()
	 * @generated
	 * @ordered
	 */
	protected Float precipitationLarger02LastDay = PRECIPITATION_LARGER02_LAST_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecipitationLarger50LastDay() <em>Precipitation Larger50 Last Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger50LastDay()
	 * @generated
	 * @ordered
	 */
	protected static final Float PRECIPITATION_LARGER50_LAST_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecipitationLarger50LastDay() <em>Precipitation Larger50 Last Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger50LastDay()
	 * @generated
	 * @ordered
	 */
	protected Float precipitationLarger50LastDay = PRECIPITATION_LARGER50_LAST_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecipitationLarger00Last12() <em>Precipitation Larger00 Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger00Last12()
	 * @generated
	 * @ordered
	 */
	protected static final Float PRECIPITATION_LARGER00_LAST12_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecipitationLarger00Last12() <em>Precipitation Larger00 Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger00Last12()
	 * @generated
	 * @ordered
	 */
	protected Float precipitationLarger00Last12 = PRECIPITATION_LARGER00_LAST12_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecipitationLarger02Last12() <em>Precipitation Larger02 Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger02Last12()
	 * @generated
	 * @ordered
	 */
	protected static final Float PRECIPITATION_LARGER02_LAST12_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecipitationLarger02Last12() <em>Precipitation Larger02 Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger02Last12()
	 * @generated
	 * @ordered
	 */
	protected Float precipitationLarger02Last12 = PRECIPITATION_LARGER02_LAST12_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecipitationLarger10Last12() <em>Precipitation Larger10 Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger10Last12()
	 * @generated
	 * @ordered
	 */
	protected static final Float PRECIPITATION_LARGER10_LAST12_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecipitationLarger10Last12() <em>Precipitation Larger10 Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger10Last12()
	 * @generated
	 * @ordered
	 */
	protected Float precipitationLarger10Last12 = PRECIPITATION_LARGER10_LAST12_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecipitationLarger50Last12() <em>Precipitation Larger50 Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger50Last12()
	 * @generated
	 * @ordered
	 */
	protected static final Float PRECIPITATION_LARGER50_LAST12_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecipitationLarger50Last12() <em>Precipitation Larger50 Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationLarger50Last12()
	 * @generated
	 * @ordered
	 */
	protected Float precipitationLarger50Last12 = PRECIPITATION_LARGER50_LAST12_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecipitationSignificantWeatherTotal() <em>Precipitation Significant Weather Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationSignificantWeatherTotal()
	 * @generated
	 * @ordered
	 */
	protected static final Float PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecipitationSignificantWeatherTotal() <em>Precipitation Significant Weather Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationSignificantWeatherTotal()
	 * @generated
	 * @ordered
	 */
	protected Float precipitationSignificantWeatherTotal = PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecipitationSignificantWeatherLast3() <em>Precipitation Significant Weather Last3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationSignificantWeatherLast3()
	 * @generated
	 * @ordered
	 */
	protected static final Float PRECIPITATION_SIGNIFICANT_WEATHER_LAST3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecipitationSignificantWeatherLast3() <em>Precipitation Significant Weather Last3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationSignificantWeatherLast3()
	 * @generated
	 * @ordered
	 */
	protected Float precipitationSignificantWeatherLast3 = PRECIPITATION_SIGNIFICANT_WEATHER_LAST3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecipitationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WeatherPackage.Literals.PRECIPITATION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getPrecipitationLarger02Last6() {
		return precipitationLarger02Last6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecipitationLarger02Last6(Float newPrecipitationLarger02Last6) {
		Float oldPrecipitationLarger02Last6 = precipitationLarger02Last6;
		precipitationLarger02Last6 = newPrecipitationLarger02Last6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST6, oldPrecipitationLarger02Last6, precipitationLarger02Last6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getPrecipitationLarger50Last6() {
		return precipitationLarger50Last6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecipitationLarger50Last6(Float newPrecipitationLarger50Last6) {
		Float oldPrecipitationLarger50Last6 = precipitationLarger50Last6;
		precipitationLarger50Last6 = newPrecipitationLarger50Last6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST6, oldPrecipitationLarger50Last6, precipitationLarger50Last6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getPrecipitationLarger02LastDay() {
		return precipitationLarger02LastDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecipitationLarger02LastDay(Float newPrecipitationLarger02LastDay) {
		Float oldPrecipitationLarger02LastDay = precipitationLarger02LastDay;
		precipitationLarger02LastDay = newPrecipitationLarger02LastDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST_DAY, oldPrecipitationLarger02LastDay, precipitationLarger02LastDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getPrecipitationLarger50LastDay() {
		return precipitationLarger50LastDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecipitationLarger50LastDay(Float newPrecipitationLarger50LastDay) {
		Float oldPrecipitationLarger50LastDay = precipitationLarger50LastDay;
		precipitationLarger50LastDay = newPrecipitationLarger50LastDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST_DAY, oldPrecipitationLarger50LastDay, precipitationLarger50LastDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getPrecipitationLarger00Last12() {
		return precipitationLarger00Last12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecipitationLarger00Last12(Float newPrecipitationLarger00Last12) {
		Float oldPrecipitationLarger00Last12 = precipitationLarger00Last12;
		precipitationLarger00Last12 = newPrecipitationLarger00Last12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER00_LAST12, oldPrecipitationLarger00Last12, precipitationLarger00Last12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getPrecipitationLarger02Last12() {
		return precipitationLarger02Last12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecipitationLarger02Last12(Float newPrecipitationLarger02Last12) {
		Float oldPrecipitationLarger02Last12 = precipitationLarger02Last12;
		precipitationLarger02Last12 = newPrecipitationLarger02Last12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST12, oldPrecipitationLarger02Last12, precipitationLarger02Last12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getPrecipitationLarger10Last12() {
		return precipitationLarger10Last12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecipitationLarger10Last12(Float newPrecipitationLarger10Last12) {
		Float oldPrecipitationLarger10Last12 = precipitationLarger10Last12;
		precipitationLarger10Last12 = newPrecipitationLarger10Last12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER10_LAST12, oldPrecipitationLarger10Last12, precipitationLarger10Last12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getPrecipitationLarger50Last12() {
		return precipitationLarger50Last12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecipitationLarger50Last12(Float newPrecipitationLarger50Last12) {
		Float oldPrecipitationLarger50Last12 = precipitationLarger50Last12;
		precipitationLarger50Last12 = newPrecipitationLarger50Last12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST12, oldPrecipitationLarger50Last12, precipitationLarger50Last12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getPrecipitationSignificantWeatherTotal() {
		return precipitationSignificantWeatherTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecipitationSignificantWeatherTotal(Float newPrecipitationSignificantWeatherTotal) {
		Float oldPrecipitationSignificantWeatherTotal = precipitationSignificantWeatherTotal;
		precipitationSignificantWeatherTotal = newPrecipitationSignificantWeatherTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL, oldPrecipitationSignificantWeatherTotal, precipitationSignificantWeatherTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getPrecipitationSignificantWeatherLast3() {
		return precipitationSignificantWeatherLast3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecipitationSignificantWeatherLast3(Float newPrecipitationSignificantWeatherLast3) {
		Float oldPrecipitationSignificantWeatherLast3 = precipitationSignificantWeatherLast3;
		precipitationSignificantWeatherLast3 = newPrecipitationSignificantWeatherLast3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_LAST3, oldPrecipitationSignificantWeatherLast3, precipitationSignificantWeatherLast3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST6:
				return getPrecipitationLarger02Last6();
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST6:
				return getPrecipitationLarger50Last6();
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST_DAY:
				return getPrecipitationLarger02LastDay();
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST_DAY:
				return getPrecipitationLarger50LastDay();
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER00_LAST12:
				return getPrecipitationLarger00Last12();
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST12:
				return getPrecipitationLarger02Last12();
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER10_LAST12:
				return getPrecipitationLarger10Last12();
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST12:
				return getPrecipitationLarger50Last12();
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL:
				return getPrecipitationSignificantWeatherTotal();
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_LAST3:
				return getPrecipitationSignificantWeatherLast3();
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
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST6:
				setPrecipitationLarger02Last6((Float)newValue);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST6:
				setPrecipitationLarger50Last6((Float)newValue);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST_DAY:
				setPrecipitationLarger02LastDay((Float)newValue);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST_DAY:
				setPrecipitationLarger50LastDay((Float)newValue);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER00_LAST12:
				setPrecipitationLarger00Last12((Float)newValue);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST12:
				setPrecipitationLarger02Last12((Float)newValue);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER10_LAST12:
				setPrecipitationLarger10Last12((Float)newValue);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST12:
				setPrecipitationLarger50Last12((Float)newValue);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL:
				setPrecipitationSignificantWeatherTotal((Float)newValue);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_LAST3:
				setPrecipitationSignificantWeatherLast3((Float)newValue);
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
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST6:
				setPrecipitationLarger02Last6(PRECIPITATION_LARGER02_LAST6_EDEFAULT);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST6:
				setPrecipitationLarger50Last6(PRECIPITATION_LARGER50_LAST6_EDEFAULT);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST_DAY:
				setPrecipitationLarger02LastDay(PRECIPITATION_LARGER02_LAST_DAY_EDEFAULT);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST_DAY:
				setPrecipitationLarger50LastDay(PRECIPITATION_LARGER50_LAST_DAY_EDEFAULT);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER00_LAST12:
				setPrecipitationLarger00Last12(PRECIPITATION_LARGER00_LAST12_EDEFAULT);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST12:
				setPrecipitationLarger02Last12(PRECIPITATION_LARGER02_LAST12_EDEFAULT);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER10_LAST12:
				setPrecipitationLarger10Last12(PRECIPITATION_LARGER10_LAST12_EDEFAULT);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST12:
				setPrecipitationLarger50Last12(PRECIPITATION_LARGER50_LAST12_EDEFAULT);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL:
				setPrecipitationSignificantWeatherTotal(PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL_EDEFAULT);
				return;
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_LAST3:
				setPrecipitationSignificantWeatherLast3(PRECIPITATION_SIGNIFICANT_WEATHER_LAST3_EDEFAULT);
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
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST6:
				return PRECIPITATION_LARGER02_LAST6_EDEFAULT == null ? precipitationLarger02Last6 != null : !PRECIPITATION_LARGER02_LAST6_EDEFAULT.equals(precipitationLarger02Last6);
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST6:
				return PRECIPITATION_LARGER50_LAST6_EDEFAULT == null ? precipitationLarger50Last6 != null : !PRECIPITATION_LARGER50_LAST6_EDEFAULT.equals(precipitationLarger50Last6);
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST_DAY:
				return PRECIPITATION_LARGER02_LAST_DAY_EDEFAULT == null ? precipitationLarger02LastDay != null : !PRECIPITATION_LARGER02_LAST_DAY_EDEFAULT.equals(precipitationLarger02LastDay);
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST_DAY:
				return PRECIPITATION_LARGER50_LAST_DAY_EDEFAULT == null ? precipitationLarger50LastDay != null : !PRECIPITATION_LARGER50_LAST_DAY_EDEFAULT.equals(precipitationLarger50LastDay);
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER00_LAST12:
				return PRECIPITATION_LARGER00_LAST12_EDEFAULT == null ? precipitationLarger00Last12 != null : !PRECIPITATION_LARGER00_LAST12_EDEFAULT.equals(precipitationLarger00Last12);
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST12:
				return PRECIPITATION_LARGER02_LAST12_EDEFAULT == null ? precipitationLarger02Last12 != null : !PRECIPITATION_LARGER02_LAST12_EDEFAULT.equals(precipitationLarger02Last12);
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER10_LAST12:
				return PRECIPITATION_LARGER10_LAST12_EDEFAULT == null ? precipitationLarger10Last12 != null : !PRECIPITATION_LARGER10_LAST12_EDEFAULT.equals(precipitationLarger10Last12);
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST12:
				return PRECIPITATION_LARGER50_LAST12_EDEFAULT == null ? precipitationLarger50Last12 != null : !PRECIPITATION_LARGER50_LAST12_EDEFAULT.equals(precipitationLarger50Last12);
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL:
				return PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL_EDEFAULT == null ? precipitationSignificantWeatherTotal != null : !PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL_EDEFAULT.equals(precipitationSignificantWeatherTotal);
			case WeatherPackage.PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_LAST3:
				return PRECIPITATION_SIGNIFICANT_WEATHER_LAST3_EDEFAULT == null ? precipitationSignificantWeatherLast3 != null : !PRECIPITATION_SIGNIFICANT_WEATHER_LAST3_EDEFAULT.equals(precipitationSignificantWeatherLast3);
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
		result.append(" (precipitationLarger02Last6: ");
		result.append(precipitationLarger02Last6);
		result.append(", precipitationLarger50Last6: ");
		result.append(precipitationLarger50Last6);
		result.append(", precipitationLarger02LastDay: ");
		result.append(precipitationLarger02LastDay);
		result.append(", precipitationLarger50LastDay: ");
		result.append(precipitationLarger50LastDay);
		result.append(", precipitationLarger00Last12: ");
		result.append(precipitationLarger00Last12);
		result.append(", precipitationLarger02Last12: ");
		result.append(precipitationLarger02Last12);
		result.append(", precipitationLarger10Last12: ");
		result.append(precipitationLarger10Last12);
		result.append(", precipitationLarger50Last12: ");
		result.append(precipitationLarger50Last12);
		result.append(", precipitationSignificantWeatherTotal: ");
		result.append(precipitationSignificantWeatherTotal);
		result.append(", precipitationSignificantWeatherLast3: ");
		result.append(precipitationSignificantWeatherLast3);
		result.append(')');
		return result.toString();
	}

} //PrecipitationDataImpl
