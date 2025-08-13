/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService;

import org.eclipse.sensinact.model.core.provider.impl.ProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getCurrentWeather <em>Current Weather</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast3H <em>Forecast3 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast6H <em>Forecast6 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast9H <em>Forecast9 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast12H <em>Forecast12 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast15H <em>Forecast15 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast18H <em>Forecast18 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast21H <em>Forecast21 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast24H <em>Forecast24 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast27H <em>Forecast27 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast30H <em>Forecast30 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast33H <em>Forecast33 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast36H <em>Forecast36 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast39H <em>Forecast39 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast42H <em>Forecast42 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast45H <em>Forecast45 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast48H <em>Forecast48 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast51H <em>Forecast51 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast54H <em>Forecast54 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast57H <em>Forecast57 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast60H <em>Forecast60 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast63H <em>Forecast63 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast66H <em>Forecast66 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast69H <em>Forecast69 H</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getForecast72H <em>Forecast72 H</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeatherProviderImpl extends ProviderImpl implements WeatherProvider {
	/**
	 * The cached value of the '{@link #getCurrentWeather() <em>Current Weather</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentWeather()
	 * @generated
	 * @ordered
	 */
	protected WeatherService currentWeather;

	/**
	 * The cached value of the '{@link #getForecast3H() <em>Forecast3 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast3H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast3H;

	/**
	 * The cached value of the '{@link #getForecast6H() <em>Forecast6 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast6H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast6H;

	/**
	 * The cached value of the '{@link #getForecast9H() <em>Forecast9 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast9H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast9H;

	/**
	 * The cached value of the '{@link #getForecast12H() <em>Forecast12 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast12H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast12H;

	/**
	 * The cached value of the '{@link #getForecast15H() <em>Forecast15 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast15H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast15H;

	/**
	 * The cached value of the '{@link #getForecast18H() <em>Forecast18 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast18H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast18H;

	/**
	 * The cached value of the '{@link #getForecast21H() <em>Forecast21 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast21H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast21H;

	/**
	 * The cached value of the '{@link #getForecast24H() <em>Forecast24 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast24H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast24H;

	/**
	 * The cached value of the '{@link #getForecast27H() <em>Forecast27 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast27H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast27H;

	/**
	 * The cached value of the '{@link #getForecast30H() <em>Forecast30 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast30H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast30H;

	/**
	 * The cached value of the '{@link #getForecast33H() <em>Forecast33 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast33H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast33H;

	/**
	 * The cached value of the '{@link #getForecast36H() <em>Forecast36 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast36H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast36H;

	/**
	 * The cached value of the '{@link #getForecast39H() <em>Forecast39 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast39H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast39H;

	/**
	 * The cached value of the '{@link #getForecast42H() <em>Forecast42 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast42H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast42H;

	/**
	 * The cached value of the '{@link #getForecast45H() <em>Forecast45 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast45H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast45H;

	/**
	 * The cached value of the '{@link #getForecast48H() <em>Forecast48 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast48H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast48H;

	/**
	 * The cached value of the '{@link #getForecast51H() <em>Forecast51 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast51H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast51H;

	/**
	 * The cached value of the '{@link #getForecast54H() <em>Forecast54 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast54H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast54H;

	/**
	 * The cached value of the '{@link #getForecast57H() <em>Forecast57 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast57H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast57H;

	/**
	 * The cached value of the '{@link #getForecast60H() <em>Forecast60 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast60H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast60H;

	/**
	 * The cached value of the '{@link #getForecast63H() <em>Forecast63 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast63H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast63H;

	/**
	 * The cached value of the '{@link #getForecast66H() <em>Forecast66 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast66H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast66H;

	/**
	 * The cached value of the '{@link #getForecast69H() <em>Forecast69 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast69H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast69H;

	/**
	 * The cached value of the '{@link #getForecast72H() <em>Forecast72 H</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast72H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast72H;

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
	public WeatherService getCurrentWeather() {
		if (currentWeather != null && currentWeather.eIsProxy()) {
			InternalEObject oldCurrentWeather = (InternalEObject)currentWeather;
			currentWeather = (WeatherService)eResolveProxy(oldCurrentWeather);
			if (currentWeather != oldCurrentWeather) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__CURRENT_WEATHER, oldCurrentWeather, currentWeather));
			}
		}
		return currentWeather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetCurrentWeather() {
		return currentWeather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentWeather(WeatherService newCurrentWeather) {
		WeatherService oldCurrentWeather = currentWeather;
		currentWeather = newCurrentWeather;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__CURRENT_WEATHER, oldCurrentWeather, currentWeather));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast3H() {
		if (forecast3H != null && forecast3H.eIsProxy()) {
			InternalEObject oldForecast3H = (InternalEObject)forecast3H;
			forecast3H = (WeatherService)eResolveProxy(oldForecast3H);
			if (forecast3H != oldForecast3H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST3_H, oldForecast3H, forecast3H));
			}
		}
		return forecast3H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast3H() {
		return forecast3H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast3H(WeatherService newForecast3H) {
		WeatherService oldForecast3H = forecast3H;
		forecast3H = newForecast3H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST3_H, oldForecast3H, forecast3H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast6H() {
		if (forecast6H != null && forecast6H.eIsProxy()) {
			InternalEObject oldForecast6H = (InternalEObject)forecast6H;
			forecast6H = (WeatherService)eResolveProxy(oldForecast6H);
			if (forecast6H != oldForecast6H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST6_H, oldForecast6H, forecast6H));
			}
		}
		return forecast6H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast6H() {
		return forecast6H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast6H(WeatherService newForecast6H) {
		WeatherService oldForecast6H = forecast6H;
		forecast6H = newForecast6H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST6_H, oldForecast6H, forecast6H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast9H() {
		if (forecast9H != null && forecast9H.eIsProxy()) {
			InternalEObject oldForecast9H = (InternalEObject)forecast9H;
			forecast9H = (WeatherService)eResolveProxy(oldForecast9H);
			if (forecast9H != oldForecast9H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST9_H, oldForecast9H, forecast9H));
			}
		}
		return forecast9H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast9H() {
		return forecast9H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast9H(WeatherService newForecast9H) {
		WeatherService oldForecast9H = forecast9H;
		forecast9H = newForecast9H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST9_H, oldForecast9H, forecast9H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast12H() {
		if (forecast12H != null && forecast12H.eIsProxy()) {
			InternalEObject oldForecast12H = (InternalEObject)forecast12H;
			forecast12H = (WeatherService)eResolveProxy(oldForecast12H);
			if (forecast12H != oldForecast12H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST12_H, oldForecast12H, forecast12H));
			}
		}
		return forecast12H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast12H() {
		return forecast12H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast12H(WeatherService newForecast12H) {
		WeatherService oldForecast12H = forecast12H;
		forecast12H = newForecast12H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST12_H, oldForecast12H, forecast12H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast15H() {
		if (forecast15H != null && forecast15H.eIsProxy()) {
			InternalEObject oldForecast15H = (InternalEObject)forecast15H;
			forecast15H = (WeatherService)eResolveProxy(oldForecast15H);
			if (forecast15H != oldForecast15H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST15_H, oldForecast15H, forecast15H));
			}
		}
		return forecast15H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast15H() {
		return forecast15H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast15H(WeatherService newForecast15H) {
		WeatherService oldForecast15H = forecast15H;
		forecast15H = newForecast15H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST15_H, oldForecast15H, forecast15H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast18H() {
		if (forecast18H != null && forecast18H.eIsProxy()) {
			InternalEObject oldForecast18H = (InternalEObject)forecast18H;
			forecast18H = (WeatherService)eResolveProxy(oldForecast18H);
			if (forecast18H != oldForecast18H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST18_H, oldForecast18H, forecast18H));
			}
		}
		return forecast18H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast18H() {
		return forecast18H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast18H(WeatherService newForecast18H) {
		WeatherService oldForecast18H = forecast18H;
		forecast18H = newForecast18H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST18_H, oldForecast18H, forecast18H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast21H() {
		if (forecast21H != null && forecast21H.eIsProxy()) {
			InternalEObject oldForecast21H = (InternalEObject)forecast21H;
			forecast21H = (WeatherService)eResolveProxy(oldForecast21H);
			if (forecast21H != oldForecast21H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST21_H, oldForecast21H, forecast21H));
			}
		}
		return forecast21H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast21H() {
		return forecast21H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast21H(WeatherService newForecast21H) {
		WeatherService oldForecast21H = forecast21H;
		forecast21H = newForecast21H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST21_H, oldForecast21H, forecast21H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast24H() {
		if (forecast24H != null && forecast24H.eIsProxy()) {
			InternalEObject oldForecast24H = (InternalEObject)forecast24H;
			forecast24H = (WeatherService)eResolveProxy(oldForecast24H);
			if (forecast24H != oldForecast24H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST24_H, oldForecast24H, forecast24H));
			}
		}
		return forecast24H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast24H() {
		return forecast24H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast24H(WeatherService newForecast24H) {
		WeatherService oldForecast24H = forecast24H;
		forecast24H = newForecast24H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST24_H, oldForecast24H, forecast24H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast27H() {
		if (forecast27H != null && forecast27H.eIsProxy()) {
			InternalEObject oldForecast27H = (InternalEObject)forecast27H;
			forecast27H = (WeatherService)eResolveProxy(oldForecast27H);
			if (forecast27H != oldForecast27H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST27_H, oldForecast27H, forecast27H));
			}
		}
		return forecast27H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast27H() {
		return forecast27H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast27H(WeatherService newForecast27H) {
		WeatherService oldForecast27H = forecast27H;
		forecast27H = newForecast27H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST27_H, oldForecast27H, forecast27H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast30H() {
		if (forecast30H != null && forecast30H.eIsProxy()) {
			InternalEObject oldForecast30H = (InternalEObject)forecast30H;
			forecast30H = (WeatherService)eResolveProxy(oldForecast30H);
			if (forecast30H != oldForecast30H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST30_H, oldForecast30H, forecast30H));
			}
		}
		return forecast30H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast30H() {
		return forecast30H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast30H(WeatherService newForecast30H) {
		WeatherService oldForecast30H = forecast30H;
		forecast30H = newForecast30H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST30_H, oldForecast30H, forecast30H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast33H() {
		if (forecast33H != null && forecast33H.eIsProxy()) {
			InternalEObject oldForecast33H = (InternalEObject)forecast33H;
			forecast33H = (WeatherService)eResolveProxy(oldForecast33H);
			if (forecast33H != oldForecast33H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST33_H, oldForecast33H, forecast33H));
			}
		}
		return forecast33H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast33H() {
		return forecast33H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast33H(WeatherService newForecast33H) {
		WeatherService oldForecast33H = forecast33H;
		forecast33H = newForecast33H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST33_H, oldForecast33H, forecast33H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast36H() {
		if (forecast36H != null && forecast36H.eIsProxy()) {
			InternalEObject oldForecast36H = (InternalEObject)forecast36H;
			forecast36H = (WeatherService)eResolveProxy(oldForecast36H);
			if (forecast36H != oldForecast36H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST36_H, oldForecast36H, forecast36H));
			}
		}
		return forecast36H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast36H() {
		return forecast36H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast36H(WeatherService newForecast36H) {
		WeatherService oldForecast36H = forecast36H;
		forecast36H = newForecast36H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST36_H, oldForecast36H, forecast36H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast39H() {
		if (forecast39H != null && forecast39H.eIsProxy()) {
			InternalEObject oldForecast39H = (InternalEObject)forecast39H;
			forecast39H = (WeatherService)eResolveProxy(oldForecast39H);
			if (forecast39H != oldForecast39H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST39_H, oldForecast39H, forecast39H));
			}
		}
		return forecast39H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast39H() {
		return forecast39H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast39H(WeatherService newForecast39H) {
		WeatherService oldForecast39H = forecast39H;
		forecast39H = newForecast39H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST39_H, oldForecast39H, forecast39H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast42H() {
		if (forecast42H != null && forecast42H.eIsProxy()) {
			InternalEObject oldForecast42H = (InternalEObject)forecast42H;
			forecast42H = (WeatherService)eResolveProxy(oldForecast42H);
			if (forecast42H != oldForecast42H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST42_H, oldForecast42H, forecast42H));
			}
		}
		return forecast42H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast42H() {
		return forecast42H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast42H(WeatherService newForecast42H) {
		WeatherService oldForecast42H = forecast42H;
		forecast42H = newForecast42H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST42_H, oldForecast42H, forecast42H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast45H() {
		if (forecast45H != null && forecast45H.eIsProxy()) {
			InternalEObject oldForecast45H = (InternalEObject)forecast45H;
			forecast45H = (WeatherService)eResolveProxy(oldForecast45H);
			if (forecast45H != oldForecast45H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST45_H, oldForecast45H, forecast45H));
			}
		}
		return forecast45H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast45H() {
		return forecast45H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast45H(WeatherService newForecast45H) {
		WeatherService oldForecast45H = forecast45H;
		forecast45H = newForecast45H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST45_H, oldForecast45H, forecast45H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast48H() {
		if (forecast48H != null && forecast48H.eIsProxy()) {
			InternalEObject oldForecast48H = (InternalEObject)forecast48H;
			forecast48H = (WeatherService)eResolveProxy(oldForecast48H);
			if (forecast48H != oldForecast48H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST48_H, oldForecast48H, forecast48H));
			}
		}
		return forecast48H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast48H() {
		return forecast48H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast48H(WeatherService newForecast48H) {
		WeatherService oldForecast48H = forecast48H;
		forecast48H = newForecast48H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST48_H, oldForecast48H, forecast48H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast51H() {
		if (forecast51H != null && forecast51H.eIsProxy()) {
			InternalEObject oldForecast51H = (InternalEObject)forecast51H;
			forecast51H = (WeatherService)eResolveProxy(oldForecast51H);
			if (forecast51H != oldForecast51H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST51_H, oldForecast51H, forecast51H));
			}
		}
		return forecast51H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast51H() {
		return forecast51H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast51H(WeatherService newForecast51H) {
		WeatherService oldForecast51H = forecast51H;
		forecast51H = newForecast51H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST51_H, oldForecast51H, forecast51H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast54H() {
		if (forecast54H != null && forecast54H.eIsProxy()) {
			InternalEObject oldForecast54H = (InternalEObject)forecast54H;
			forecast54H = (WeatherService)eResolveProxy(oldForecast54H);
			if (forecast54H != oldForecast54H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST54_H, oldForecast54H, forecast54H));
			}
		}
		return forecast54H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast54H() {
		return forecast54H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast54H(WeatherService newForecast54H) {
		WeatherService oldForecast54H = forecast54H;
		forecast54H = newForecast54H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST54_H, oldForecast54H, forecast54H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast57H() {
		if (forecast57H != null && forecast57H.eIsProxy()) {
			InternalEObject oldForecast57H = (InternalEObject)forecast57H;
			forecast57H = (WeatherService)eResolveProxy(oldForecast57H);
			if (forecast57H != oldForecast57H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST57_H, oldForecast57H, forecast57H));
			}
		}
		return forecast57H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast57H() {
		return forecast57H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast57H(WeatherService newForecast57H) {
		WeatherService oldForecast57H = forecast57H;
		forecast57H = newForecast57H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST57_H, oldForecast57H, forecast57H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast60H() {
		if (forecast60H != null && forecast60H.eIsProxy()) {
			InternalEObject oldForecast60H = (InternalEObject)forecast60H;
			forecast60H = (WeatherService)eResolveProxy(oldForecast60H);
			if (forecast60H != oldForecast60H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST60_H, oldForecast60H, forecast60H));
			}
		}
		return forecast60H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast60H() {
		return forecast60H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast60H(WeatherService newForecast60H) {
		WeatherService oldForecast60H = forecast60H;
		forecast60H = newForecast60H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST60_H, oldForecast60H, forecast60H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast63H() {
		if (forecast63H != null && forecast63H.eIsProxy()) {
			InternalEObject oldForecast63H = (InternalEObject)forecast63H;
			forecast63H = (WeatherService)eResolveProxy(oldForecast63H);
			if (forecast63H != oldForecast63H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST63_H, oldForecast63H, forecast63H));
			}
		}
		return forecast63H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast63H() {
		return forecast63H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast63H(WeatherService newForecast63H) {
		WeatherService oldForecast63H = forecast63H;
		forecast63H = newForecast63H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST63_H, oldForecast63H, forecast63H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast66H() {
		if (forecast66H != null && forecast66H.eIsProxy()) {
			InternalEObject oldForecast66H = (InternalEObject)forecast66H;
			forecast66H = (WeatherService)eResolveProxy(oldForecast66H);
			if (forecast66H != oldForecast66H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST66_H, oldForecast66H, forecast66H));
			}
		}
		return forecast66H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast66H() {
		return forecast66H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast66H(WeatherService newForecast66H) {
		WeatherService oldForecast66H = forecast66H;
		forecast66H = newForecast66H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST66_H, oldForecast66H, forecast66H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast69H() {
		if (forecast69H != null && forecast69H.eIsProxy()) {
			InternalEObject oldForecast69H = (InternalEObject)forecast69H;
			forecast69H = (WeatherService)eResolveProxy(oldForecast69H);
			if (forecast69H != oldForecast69H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST69_H, oldForecast69H, forecast69H));
			}
		}
		return forecast69H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast69H() {
		return forecast69H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast69H(WeatherService newForecast69H) {
		WeatherService oldForecast69H = forecast69H;
		forecast69H = newForecast69H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST69_H, oldForecast69H, forecast69H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast72H() {
		if (forecast72H != null && forecast72H.eIsProxy()) {
			InternalEObject oldForecast72H = (InternalEObject)forecast72H;
			forecast72H = (WeatherService)eResolveProxy(oldForecast72H);
			if (forecast72H != oldForecast72H) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FORECAST72_H, oldForecast72H, forecast72H));
			}
		}
		return forecast72H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherService basicGetForecast72H() {
		return forecast72H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast72H(WeatherService newForecast72H) {
		WeatherService oldForecast72H = forecast72H;
		forecast72H = newForecast72H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST72_H, oldForecast72H, forecast72H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WeatherPackage.WEATHER_PROVIDER__CURRENT_WEATHER:
				if (resolve) return getCurrentWeather();
				return basicGetCurrentWeather();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST3_H:
				if (resolve) return getForecast3H();
				return basicGetForecast3H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST6_H:
				if (resolve) return getForecast6H();
				return basicGetForecast6H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST9_H:
				if (resolve) return getForecast9H();
				return basicGetForecast9H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST12_H:
				if (resolve) return getForecast12H();
				return basicGetForecast12H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST15_H:
				if (resolve) return getForecast15H();
				return basicGetForecast15H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST18_H:
				if (resolve) return getForecast18H();
				return basicGetForecast18H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST21_H:
				if (resolve) return getForecast21H();
				return basicGetForecast21H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST24_H:
				if (resolve) return getForecast24H();
				return basicGetForecast24H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST27_H:
				if (resolve) return getForecast27H();
				return basicGetForecast27H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST30_H:
				if (resolve) return getForecast30H();
				return basicGetForecast30H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST33_H:
				if (resolve) return getForecast33H();
				return basicGetForecast33H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST36_H:
				if (resolve) return getForecast36H();
				return basicGetForecast36H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST39_H:
				if (resolve) return getForecast39H();
				return basicGetForecast39H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST42_H:
				if (resolve) return getForecast42H();
				return basicGetForecast42H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST45_H:
				if (resolve) return getForecast45H();
				return basicGetForecast45H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST48_H:
				if (resolve) return getForecast48H();
				return basicGetForecast48H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST51_H:
				if (resolve) return getForecast51H();
				return basicGetForecast51H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST54_H:
				if (resolve) return getForecast54H();
				return basicGetForecast54H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST57_H:
				if (resolve) return getForecast57H();
				return basicGetForecast57H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST60_H:
				if (resolve) return getForecast60H();
				return basicGetForecast60H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST63_H:
				if (resolve) return getForecast63H();
				return basicGetForecast63H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST66_H:
				if (resolve) return getForecast66H();
				return basicGetForecast66H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST69_H:
				if (resolve) return getForecast69H();
				return basicGetForecast69H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST72_H:
				if (resolve) return getForecast72H();
				return basicGetForecast72H();
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
			case WeatherPackage.WEATHER_PROVIDER__CURRENT_WEATHER:
				setCurrentWeather((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST3_H:
				setForecast3H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST6_H:
				setForecast6H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST9_H:
				setForecast9H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST12_H:
				setForecast12H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST15_H:
				setForecast15H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST18_H:
				setForecast18H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST21_H:
				setForecast21H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST24_H:
				setForecast24H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST27_H:
				setForecast27H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST30_H:
				setForecast30H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST33_H:
				setForecast33H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST36_H:
				setForecast36H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST39_H:
				setForecast39H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST42_H:
				setForecast42H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST45_H:
				setForecast45H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST48_H:
				setForecast48H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST51_H:
				setForecast51H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST54_H:
				setForecast54H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST57_H:
				setForecast57H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST60_H:
				setForecast60H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST63_H:
				setForecast63H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST66_H:
				setForecast66H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST69_H:
				setForecast69H((WeatherService)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST72_H:
				setForecast72H((WeatherService)newValue);
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
			case WeatherPackage.WEATHER_PROVIDER__CURRENT_WEATHER:
				setCurrentWeather((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST3_H:
				setForecast3H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST6_H:
				setForecast6H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST9_H:
				setForecast9H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST12_H:
				setForecast12H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST15_H:
				setForecast15H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST18_H:
				setForecast18H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST21_H:
				setForecast21H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST24_H:
				setForecast24H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST27_H:
				setForecast27H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST30_H:
				setForecast30H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST33_H:
				setForecast33H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST36_H:
				setForecast36H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST39_H:
				setForecast39H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST42_H:
				setForecast42H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST45_H:
				setForecast45H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST48_H:
				setForecast48H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST51_H:
				setForecast51H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST54_H:
				setForecast54H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST57_H:
				setForecast57H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST60_H:
				setForecast60H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST63_H:
				setForecast63H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST66_H:
				setForecast66H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST69_H:
				setForecast69H((WeatherService)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST72_H:
				setForecast72H((WeatherService)null);
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
			case WeatherPackage.WEATHER_PROVIDER__CURRENT_WEATHER:
				return currentWeather != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST3_H:
				return forecast3H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST6_H:
				return forecast6H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST9_H:
				return forecast9H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST12_H:
				return forecast12H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST15_H:
				return forecast15H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST18_H:
				return forecast18H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST21_H:
				return forecast21H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST24_H:
				return forecast24H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST27_H:
				return forecast27H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST30_H:
				return forecast30H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST33_H:
				return forecast33H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST36_H:
				return forecast36H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST39_H:
				return forecast39H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST42_H:
				return forecast42H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST45_H:
				return forecast45H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST48_H:
				return forecast48H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST51_H:
				return forecast51H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST54_H:
				return forecast54H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST57_H:
				return forecast57H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST60_H:
				return forecast60H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST63_H:
				return forecast63H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST66_H:
				return forecast66H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST69_H:
				return forecast69H != null;
			case WeatherPackage.WEATHER_PROVIDER__FORECAST72_H:
				return forecast72H != null;
		}
		return super.eIsSet(featureID);
	}

} //WeatherProviderImpl
