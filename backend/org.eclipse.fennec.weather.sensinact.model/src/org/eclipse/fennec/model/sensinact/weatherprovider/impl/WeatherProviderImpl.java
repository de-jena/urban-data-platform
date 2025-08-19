/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
	 * The cached value of the '{@link #getCurrentWeather() <em>Current Weather</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentWeather()
	 * @generated
	 * @ordered
	 */
	protected WeatherService currentWeather;

	/**
	 * The cached value of the '{@link #getForecast3H() <em>Forecast3 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast3H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast3H;

	/**
	 * The cached value of the '{@link #getForecast6H() <em>Forecast6 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast6H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast6H;

	/**
	 * The cached value of the '{@link #getForecast9H() <em>Forecast9 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast9H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast9H;

	/**
	 * The cached value of the '{@link #getForecast12H() <em>Forecast12 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast12H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast12H;

	/**
	 * The cached value of the '{@link #getForecast15H() <em>Forecast15 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast15H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast15H;

	/**
	 * The cached value of the '{@link #getForecast18H() <em>Forecast18 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast18H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast18H;

	/**
	 * The cached value of the '{@link #getForecast21H() <em>Forecast21 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast21H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast21H;

	/**
	 * The cached value of the '{@link #getForecast24H() <em>Forecast24 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast24H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast24H;

	/**
	 * The cached value of the '{@link #getForecast27H() <em>Forecast27 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast27H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast27H;

	/**
	 * The cached value of the '{@link #getForecast30H() <em>Forecast30 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast30H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast30H;

	/**
	 * The cached value of the '{@link #getForecast33H() <em>Forecast33 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast33H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast33H;

	/**
	 * The cached value of the '{@link #getForecast36H() <em>Forecast36 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast36H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast36H;

	/**
	 * The cached value of the '{@link #getForecast39H() <em>Forecast39 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast39H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast39H;

	/**
	 * The cached value of the '{@link #getForecast42H() <em>Forecast42 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast42H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast42H;

	/**
	 * The cached value of the '{@link #getForecast45H() <em>Forecast45 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast45H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast45H;

	/**
	 * The cached value of the '{@link #getForecast48H() <em>Forecast48 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast48H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast48H;

	/**
	 * The cached value of the '{@link #getForecast51H() <em>Forecast51 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast51H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast51H;

	/**
	 * The cached value of the '{@link #getForecast54H() <em>Forecast54 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast54H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast54H;

	/**
	 * The cached value of the '{@link #getForecast57H() <em>Forecast57 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast57H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast57H;

	/**
	 * The cached value of the '{@link #getForecast60H() <em>Forecast60 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast60H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast60H;

	/**
	 * The cached value of the '{@link #getForecast63H() <em>Forecast63 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast63H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast63H;

	/**
	 * The cached value of the '{@link #getForecast66H() <em>Forecast66 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast66H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast66H;

	/**
	 * The cached value of the '{@link #getForecast69H() <em>Forecast69 H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecast69H()
	 * @generated
	 * @ordered
	 */
	protected WeatherService forecast69H;

	/**
	 * The cached value of the '{@link #getForecast72H() <em>Forecast72 H</em>}' containment reference.
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
		return currentWeather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentWeather(WeatherService newCurrentWeather, NotificationChain msgs) {
		WeatherService oldCurrentWeather = currentWeather;
		currentWeather = newCurrentWeather;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__CURRENT_WEATHER, oldCurrentWeather, newCurrentWeather);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentWeather(WeatherService newCurrentWeather) {
		if (newCurrentWeather != currentWeather) {
			NotificationChain msgs = null;
			if (currentWeather != null)
				msgs = ((InternalEObject)currentWeather).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__CURRENT_WEATHER, null, msgs);
			if (newCurrentWeather != null)
				msgs = ((InternalEObject)newCurrentWeather).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__CURRENT_WEATHER, null, msgs);
			msgs = basicSetCurrentWeather(newCurrentWeather, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__CURRENT_WEATHER, newCurrentWeather, newCurrentWeather));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast3H() {
		return forecast3H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast3H(WeatherService newForecast3H, NotificationChain msgs) {
		WeatherService oldForecast3H = forecast3H;
		forecast3H = newForecast3H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST3_H, oldForecast3H, newForecast3H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast3H(WeatherService newForecast3H) {
		if (newForecast3H != forecast3H) {
			NotificationChain msgs = null;
			if (forecast3H != null)
				msgs = ((InternalEObject)forecast3H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST3_H, null, msgs);
			if (newForecast3H != null)
				msgs = ((InternalEObject)newForecast3H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST3_H, null, msgs);
			msgs = basicSetForecast3H(newForecast3H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST3_H, newForecast3H, newForecast3H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast6H() {
		return forecast6H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast6H(WeatherService newForecast6H, NotificationChain msgs) {
		WeatherService oldForecast6H = forecast6H;
		forecast6H = newForecast6H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST6_H, oldForecast6H, newForecast6H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast6H(WeatherService newForecast6H) {
		if (newForecast6H != forecast6H) {
			NotificationChain msgs = null;
			if (forecast6H != null)
				msgs = ((InternalEObject)forecast6H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST6_H, null, msgs);
			if (newForecast6H != null)
				msgs = ((InternalEObject)newForecast6H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST6_H, null, msgs);
			msgs = basicSetForecast6H(newForecast6H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST6_H, newForecast6H, newForecast6H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast9H() {
		return forecast9H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast9H(WeatherService newForecast9H, NotificationChain msgs) {
		WeatherService oldForecast9H = forecast9H;
		forecast9H = newForecast9H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST9_H, oldForecast9H, newForecast9H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast9H(WeatherService newForecast9H) {
		if (newForecast9H != forecast9H) {
			NotificationChain msgs = null;
			if (forecast9H != null)
				msgs = ((InternalEObject)forecast9H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST9_H, null, msgs);
			if (newForecast9H != null)
				msgs = ((InternalEObject)newForecast9H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST9_H, null, msgs);
			msgs = basicSetForecast9H(newForecast9H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST9_H, newForecast9H, newForecast9H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast12H() {
		return forecast12H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast12H(WeatherService newForecast12H, NotificationChain msgs) {
		WeatherService oldForecast12H = forecast12H;
		forecast12H = newForecast12H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST12_H, oldForecast12H, newForecast12H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast12H(WeatherService newForecast12H) {
		if (newForecast12H != forecast12H) {
			NotificationChain msgs = null;
			if (forecast12H != null)
				msgs = ((InternalEObject)forecast12H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST12_H, null, msgs);
			if (newForecast12H != null)
				msgs = ((InternalEObject)newForecast12H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST12_H, null, msgs);
			msgs = basicSetForecast12H(newForecast12H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST12_H, newForecast12H, newForecast12H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast15H() {
		return forecast15H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast15H(WeatherService newForecast15H, NotificationChain msgs) {
		WeatherService oldForecast15H = forecast15H;
		forecast15H = newForecast15H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST15_H, oldForecast15H, newForecast15H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast15H(WeatherService newForecast15H) {
		if (newForecast15H != forecast15H) {
			NotificationChain msgs = null;
			if (forecast15H != null)
				msgs = ((InternalEObject)forecast15H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST15_H, null, msgs);
			if (newForecast15H != null)
				msgs = ((InternalEObject)newForecast15H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST15_H, null, msgs);
			msgs = basicSetForecast15H(newForecast15H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST15_H, newForecast15H, newForecast15H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast18H() {
		return forecast18H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast18H(WeatherService newForecast18H, NotificationChain msgs) {
		WeatherService oldForecast18H = forecast18H;
		forecast18H = newForecast18H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST18_H, oldForecast18H, newForecast18H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast18H(WeatherService newForecast18H) {
		if (newForecast18H != forecast18H) {
			NotificationChain msgs = null;
			if (forecast18H != null)
				msgs = ((InternalEObject)forecast18H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST18_H, null, msgs);
			if (newForecast18H != null)
				msgs = ((InternalEObject)newForecast18H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST18_H, null, msgs);
			msgs = basicSetForecast18H(newForecast18H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST18_H, newForecast18H, newForecast18H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast21H() {
		return forecast21H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast21H(WeatherService newForecast21H, NotificationChain msgs) {
		WeatherService oldForecast21H = forecast21H;
		forecast21H = newForecast21H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST21_H, oldForecast21H, newForecast21H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast21H(WeatherService newForecast21H) {
		if (newForecast21H != forecast21H) {
			NotificationChain msgs = null;
			if (forecast21H != null)
				msgs = ((InternalEObject)forecast21H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST21_H, null, msgs);
			if (newForecast21H != null)
				msgs = ((InternalEObject)newForecast21H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST21_H, null, msgs);
			msgs = basicSetForecast21H(newForecast21H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST21_H, newForecast21H, newForecast21H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast24H() {
		return forecast24H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast24H(WeatherService newForecast24H, NotificationChain msgs) {
		WeatherService oldForecast24H = forecast24H;
		forecast24H = newForecast24H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST24_H, oldForecast24H, newForecast24H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast24H(WeatherService newForecast24H) {
		if (newForecast24H != forecast24H) {
			NotificationChain msgs = null;
			if (forecast24H != null)
				msgs = ((InternalEObject)forecast24H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST24_H, null, msgs);
			if (newForecast24H != null)
				msgs = ((InternalEObject)newForecast24H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST24_H, null, msgs);
			msgs = basicSetForecast24H(newForecast24H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST24_H, newForecast24H, newForecast24H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast27H() {
		return forecast27H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast27H(WeatherService newForecast27H, NotificationChain msgs) {
		WeatherService oldForecast27H = forecast27H;
		forecast27H = newForecast27H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST27_H, oldForecast27H, newForecast27H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast27H(WeatherService newForecast27H) {
		if (newForecast27H != forecast27H) {
			NotificationChain msgs = null;
			if (forecast27H != null)
				msgs = ((InternalEObject)forecast27H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST27_H, null, msgs);
			if (newForecast27H != null)
				msgs = ((InternalEObject)newForecast27H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST27_H, null, msgs);
			msgs = basicSetForecast27H(newForecast27H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST27_H, newForecast27H, newForecast27H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast30H() {
		return forecast30H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast30H(WeatherService newForecast30H, NotificationChain msgs) {
		WeatherService oldForecast30H = forecast30H;
		forecast30H = newForecast30H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST30_H, oldForecast30H, newForecast30H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast30H(WeatherService newForecast30H) {
		if (newForecast30H != forecast30H) {
			NotificationChain msgs = null;
			if (forecast30H != null)
				msgs = ((InternalEObject)forecast30H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST30_H, null, msgs);
			if (newForecast30H != null)
				msgs = ((InternalEObject)newForecast30H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST30_H, null, msgs);
			msgs = basicSetForecast30H(newForecast30H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST30_H, newForecast30H, newForecast30H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast33H() {
		return forecast33H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast33H(WeatherService newForecast33H, NotificationChain msgs) {
		WeatherService oldForecast33H = forecast33H;
		forecast33H = newForecast33H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST33_H, oldForecast33H, newForecast33H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast33H(WeatherService newForecast33H) {
		if (newForecast33H != forecast33H) {
			NotificationChain msgs = null;
			if (forecast33H != null)
				msgs = ((InternalEObject)forecast33H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST33_H, null, msgs);
			if (newForecast33H != null)
				msgs = ((InternalEObject)newForecast33H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST33_H, null, msgs);
			msgs = basicSetForecast33H(newForecast33H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST33_H, newForecast33H, newForecast33H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast36H() {
		return forecast36H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast36H(WeatherService newForecast36H, NotificationChain msgs) {
		WeatherService oldForecast36H = forecast36H;
		forecast36H = newForecast36H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST36_H, oldForecast36H, newForecast36H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast36H(WeatherService newForecast36H) {
		if (newForecast36H != forecast36H) {
			NotificationChain msgs = null;
			if (forecast36H != null)
				msgs = ((InternalEObject)forecast36H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST36_H, null, msgs);
			if (newForecast36H != null)
				msgs = ((InternalEObject)newForecast36H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST36_H, null, msgs);
			msgs = basicSetForecast36H(newForecast36H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST36_H, newForecast36H, newForecast36H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast39H() {
		return forecast39H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast39H(WeatherService newForecast39H, NotificationChain msgs) {
		WeatherService oldForecast39H = forecast39H;
		forecast39H = newForecast39H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST39_H, oldForecast39H, newForecast39H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast39H(WeatherService newForecast39H) {
		if (newForecast39H != forecast39H) {
			NotificationChain msgs = null;
			if (forecast39H != null)
				msgs = ((InternalEObject)forecast39H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST39_H, null, msgs);
			if (newForecast39H != null)
				msgs = ((InternalEObject)newForecast39H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST39_H, null, msgs);
			msgs = basicSetForecast39H(newForecast39H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST39_H, newForecast39H, newForecast39H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast42H() {
		return forecast42H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast42H(WeatherService newForecast42H, NotificationChain msgs) {
		WeatherService oldForecast42H = forecast42H;
		forecast42H = newForecast42H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST42_H, oldForecast42H, newForecast42H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast42H(WeatherService newForecast42H) {
		if (newForecast42H != forecast42H) {
			NotificationChain msgs = null;
			if (forecast42H != null)
				msgs = ((InternalEObject)forecast42H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST42_H, null, msgs);
			if (newForecast42H != null)
				msgs = ((InternalEObject)newForecast42H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST42_H, null, msgs);
			msgs = basicSetForecast42H(newForecast42H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST42_H, newForecast42H, newForecast42H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast45H() {
		return forecast45H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast45H(WeatherService newForecast45H, NotificationChain msgs) {
		WeatherService oldForecast45H = forecast45H;
		forecast45H = newForecast45H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST45_H, oldForecast45H, newForecast45H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast45H(WeatherService newForecast45H) {
		if (newForecast45H != forecast45H) {
			NotificationChain msgs = null;
			if (forecast45H != null)
				msgs = ((InternalEObject)forecast45H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST45_H, null, msgs);
			if (newForecast45H != null)
				msgs = ((InternalEObject)newForecast45H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST45_H, null, msgs);
			msgs = basicSetForecast45H(newForecast45H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST45_H, newForecast45H, newForecast45H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast48H() {
		return forecast48H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast48H(WeatherService newForecast48H, NotificationChain msgs) {
		WeatherService oldForecast48H = forecast48H;
		forecast48H = newForecast48H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST48_H, oldForecast48H, newForecast48H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast48H(WeatherService newForecast48H) {
		if (newForecast48H != forecast48H) {
			NotificationChain msgs = null;
			if (forecast48H != null)
				msgs = ((InternalEObject)forecast48H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST48_H, null, msgs);
			if (newForecast48H != null)
				msgs = ((InternalEObject)newForecast48H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST48_H, null, msgs);
			msgs = basicSetForecast48H(newForecast48H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST48_H, newForecast48H, newForecast48H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast51H() {
		return forecast51H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast51H(WeatherService newForecast51H, NotificationChain msgs) {
		WeatherService oldForecast51H = forecast51H;
		forecast51H = newForecast51H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST51_H, oldForecast51H, newForecast51H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast51H(WeatherService newForecast51H) {
		if (newForecast51H != forecast51H) {
			NotificationChain msgs = null;
			if (forecast51H != null)
				msgs = ((InternalEObject)forecast51H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST51_H, null, msgs);
			if (newForecast51H != null)
				msgs = ((InternalEObject)newForecast51H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST51_H, null, msgs);
			msgs = basicSetForecast51H(newForecast51H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST51_H, newForecast51H, newForecast51H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast54H() {
		return forecast54H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast54H(WeatherService newForecast54H, NotificationChain msgs) {
		WeatherService oldForecast54H = forecast54H;
		forecast54H = newForecast54H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST54_H, oldForecast54H, newForecast54H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast54H(WeatherService newForecast54H) {
		if (newForecast54H != forecast54H) {
			NotificationChain msgs = null;
			if (forecast54H != null)
				msgs = ((InternalEObject)forecast54H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST54_H, null, msgs);
			if (newForecast54H != null)
				msgs = ((InternalEObject)newForecast54H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST54_H, null, msgs);
			msgs = basicSetForecast54H(newForecast54H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST54_H, newForecast54H, newForecast54H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast57H() {
		return forecast57H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast57H(WeatherService newForecast57H, NotificationChain msgs) {
		WeatherService oldForecast57H = forecast57H;
		forecast57H = newForecast57H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST57_H, oldForecast57H, newForecast57H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast57H(WeatherService newForecast57H) {
		if (newForecast57H != forecast57H) {
			NotificationChain msgs = null;
			if (forecast57H != null)
				msgs = ((InternalEObject)forecast57H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST57_H, null, msgs);
			if (newForecast57H != null)
				msgs = ((InternalEObject)newForecast57H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST57_H, null, msgs);
			msgs = basicSetForecast57H(newForecast57H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST57_H, newForecast57H, newForecast57H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast60H() {
		return forecast60H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast60H(WeatherService newForecast60H, NotificationChain msgs) {
		WeatherService oldForecast60H = forecast60H;
		forecast60H = newForecast60H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST60_H, oldForecast60H, newForecast60H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast60H(WeatherService newForecast60H) {
		if (newForecast60H != forecast60H) {
			NotificationChain msgs = null;
			if (forecast60H != null)
				msgs = ((InternalEObject)forecast60H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST60_H, null, msgs);
			if (newForecast60H != null)
				msgs = ((InternalEObject)newForecast60H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST60_H, null, msgs);
			msgs = basicSetForecast60H(newForecast60H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST60_H, newForecast60H, newForecast60H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast63H() {
		return forecast63H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast63H(WeatherService newForecast63H, NotificationChain msgs) {
		WeatherService oldForecast63H = forecast63H;
		forecast63H = newForecast63H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST63_H, oldForecast63H, newForecast63H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast63H(WeatherService newForecast63H) {
		if (newForecast63H != forecast63H) {
			NotificationChain msgs = null;
			if (forecast63H != null)
				msgs = ((InternalEObject)forecast63H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST63_H, null, msgs);
			if (newForecast63H != null)
				msgs = ((InternalEObject)newForecast63H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST63_H, null, msgs);
			msgs = basicSetForecast63H(newForecast63H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST63_H, newForecast63H, newForecast63H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast66H() {
		return forecast66H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast66H(WeatherService newForecast66H, NotificationChain msgs) {
		WeatherService oldForecast66H = forecast66H;
		forecast66H = newForecast66H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST66_H, oldForecast66H, newForecast66H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast66H(WeatherService newForecast66H) {
		if (newForecast66H != forecast66H) {
			NotificationChain msgs = null;
			if (forecast66H != null)
				msgs = ((InternalEObject)forecast66H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST66_H, null, msgs);
			if (newForecast66H != null)
				msgs = ((InternalEObject)newForecast66H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST66_H, null, msgs);
			msgs = basicSetForecast66H(newForecast66H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST66_H, newForecast66H, newForecast66H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast69H() {
		return forecast69H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast69H(WeatherService newForecast69H, NotificationChain msgs) {
		WeatherService oldForecast69H = forecast69H;
		forecast69H = newForecast69H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST69_H, oldForecast69H, newForecast69H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast69H(WeatherService newForecast69H) {
		if (newForecast69H != forecast69H) {
			NotificationChain msgs = null;
			if (forecast69H != null)
				msgs = ((InternalEObject)forecast69H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST69_H, null, msgs);
			if (newForecast69H != null)
				msgs = ((InternalEObject)newForecast69H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST69_H, null, msgs);
			msgs = basicSetForecast69H(newForecast69H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST69_H, newForecast69H, newForecast69H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherService getForecast72H() {
		return forecast72H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecast72H(WeatherService newForecast72H, NotificationChain msgs) {
		WeatherService oldForecast72H = forecast72H;
		forecast72H = newForecast72H;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST72_H, oldForecast72H, newForecast72H);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecast72H(WeatherService newForecast72H) {
		if (newForecast72H != forecast72H) {
			NotificationChain msgs = null;
			if (forecast72H != null)
				msgs = ((InternalEObject)forecast72H).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST72_H, null, msgs);
			if (newForecast72H != null)
				msgs = ((InternalEObject)newForecast72H).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeatherPackage.WEATHER_PROVIDER__FORECAST72_H, null, msgs);
			msgs = basicSetForecast72H(newForecast72H, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FORECAST72_H, newForecast72H, newForecast72H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WeatherPackage.WEATHER_PROVIDER__CURRENT_WEATHER:
				return basicSetCurrentWeather(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST3_H:
				return basicSetForecast3H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST6_H:
				return basicSetForecast6H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST9_H:
				return basicSetForecast9H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST12_H:
				return basicSetForecast12H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST15_H:
				return basicSetForecast15H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST18_H:
				return basicSetForecast18H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST21_H:
				return basicSetForecast21H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST24_H:
				return basicSetForecast24H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST27_H:
				return basicSetForecast27H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST30_H:
				return basicSetForecast30H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST33_H:
				return basicSetForecast33H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST36_H:
				return basicSetForecast36H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST39_H:
				return basicSetForecast39H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST42_H:
				return basicSetForecast42H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST45_H:
				return basicSetForecast45H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST48_H:
				return basicSetForecast48H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST51_H:
				return basicSetForecast51H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST54_H:
				return basicSetForecast54H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST57_H:
				return basicSetForecast57H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST60_H:
				return basicSetForecast60H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST63_H:
				return basicSetForecast63H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST66_H:
				return basicSetForecast66H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST69_H:
				return basicSetForecast69H(null, msgs);
			case WeatherPackage.WEATHER_PROVIDER__FORECAST72_H:
				return basicSetForecast72H(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
				return getCurrentWeather();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST3_H:
				return getForecast3H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST6_H:
				return getForecast6H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST9_H:
				return getForecast9H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST12_H:
				return getForecast12H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST15_H:
				return getForecast15H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST18_H:
				return getForecast18H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST21_H:
				return getForecast21H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST24_H:
				return getForecast24H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST27_H:
				return getForecast27H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST30_H:
				return getForecast30H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST33_H:
				return getForecast33H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST36_H:
				return getForecast36H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST39_H:
				return getForecast39H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST42_H:
				return getForecast42H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST45_H:
				return getForecast45H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST48_H:
				return getForecast48H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST51_H:
				return getForecast51H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST54_H:
				return getForecast54H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST57_H:
				return getForecast57H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST60_H:
				return getForecast60H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST63_H:
				return getForecast63H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST66_H:
				return getForecast66H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST69_H:
				return getForecast69H();
			case WeatherPackage.WEATHER_PROVIDER__FORECAST72_H:
				return getForecast72H();
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
