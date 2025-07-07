/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.CloudData;
import org.eclipse.fennec.model.sensinact.weatherprovider.FogData;
import org.eclipse.fennec.model.sensinact.weatherprovider.IrradianceData;
import org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData;
import org.eclipse.fennec.model.sensinact.weatherprovider.PressureData;
import org.eclipse.fennec.model.sensinact.weatherprovider.SnowRainData;
import org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData;
import org.eclipse.fennec.model.sensinact.weatherprovider.VisibilityData;
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
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getWindData <em>Wind Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getCloudData <em>Cloud Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getPrecipitationData <em>Precipitation Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getTemperatureData <em>Temperature Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getFogData <em>Fog Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getSnowRainData <em>Snow Rain Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getVisibilityData <em>Visibility Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getPressureData <em>Pressure Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl#getIrradianceData <em>Irradiance Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeatherProviderImpl extends DynamicProviderImpl implements WeatherProvider {
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
	 * The cached value of the '{@link #getPrecipitationData() <em>Precipitation Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecipitationData()
	 * @generated
	 * @ordered
	 */
	protected PrecipitationData precipitationData;

	/**
	 * The cached value of the '{@link #getTemperatureData() <em>Temperature Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureData()
	 * @generated
	 * @ordered
	 */
	protected TemperatureData temperatureData;

	/**
	 * The cached value of the '{@link #getFogData() <em>Fog Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFogData()
	 * @generated
	 * @ordered
	 */
	protected FogData fogData;

	/**
	 * The cached value of the '{@link #getSnowRainData() <em>Snow Rain Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnowRainData()
	 * @generated
	 * @ordered
	 */
	protected SnowRainData snowRainData;

	/**
	 * The cached value of the '{@link #getVisibilityData() <em>Visibility Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilityData()
	 * @generated
	 * @ordered
	 */
	protected VisibilityData visibilityData;

	/**
	 * The cached value of the '{@link #getPressureData() <em>Pressure Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureData()
	 * @generated
	 * @ordered
	 */
	protected PressureData pressureData;

	/**
	 * The cached value of the '{@link #getIrradianceData() <em>Irradiance Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrradianceData()
	 * @generated
	 * @ordered
	 */
	protected IrradianceData irradianceData;

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
	public PrecipitationData getPrecipitationData() {
		if (precipitationData != null && precipitationData.eIsProxy()) {
			InternalEObject oldPrecipitationData = (InternalEObject)precipitationData;
			precipitationData = (PrecipitationData)eResolveProxy(oldPrecipitationData);
			if (precipitationData != oldPrecipitationData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__PRECIPITATION_DATA, oldPrecipitationData, precipitationData));
			}
		}
		return precipitationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecipitationData basicGetPrecipitationData() {
		return precipitationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecipitationData(PrecipitationData newPrecipitationData) {
		PrecipitationData oldPrecipitationData = precipitationData;
		precipitationData = newPrecipitationData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__PRECIPITATION_DATA, oldPrecipitationData, precipitationData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemperatureData getTemperatureData() {
		if (temperatureData != null && temperatureData.eIsProxy()) {
			InternalEObject oldTemperatureData = (InternalEObject)temperatureData;
			temperatureData = (TemperatureData)eResolveProxy(oldTemperatureData);
			if (temperatureData != oldTemperatureData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__TEMPERATURE_DATA, oldTemperatureData, temperatureData));
			}
		}
		return temperatureData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemperatureData basicGetTemperatureData() {
		return temperatureData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperatureData(TemperatureData newTemperatureData) {
		TemperatureData oldTemperatureData = temperatureData;
		temperatureData = newTemperatureData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__TEMPERATURE_DATA, oldTemperatureData, temperatureData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FogData getFogData() {
		if (fogData != null && fogData.eIsProxy()) {
			InternalEObject oldFogData = (InternalEObject)fogData;
			fogData = (FogData)eResolveProxy(oldFogData);
			if (fogData != oldFogData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__FOG_DATA, oldFogData, fogData));
			}
		}
		return fogData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogData basicGetFogData() {
		return fogData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFogData(FogData newFogData) {
		FogData oldFogData = fogData;
		fogData = newFogData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__FOG_DATA, oldFogData, fogData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SnowRainData getSnowRainData() {
		if (snowRainData != null && snowRainData.eIsProxy()) {
			InternalEObject oldSnowRainData = (InternalEObject)snowRainData;
			snowRainData = (SnowRainData)eResolveProxy(oldSnowRainData);
			if (snowRainData != oldSnowRainData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__SNOW_RAIN_DATA, oldSnowRainData, snowRainData));
			}
		}
		return snowRainData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnowRainData basicGetSnowRainData() {
		return snowRainData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSnowRainData(SnowRainData newSnowRainData) {
		SnowRainData oldSnowRainData = snowRainData;
		snowRainData = newSnowRainData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__SNOW_RAIN_DATA, oldSnowRainData, snowRainData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisibilityData getVisibilityData() {
		if (visibilityData != null && visibilityData.eIsProxy()) {
			InternalEObject oldVisibilityData = (InternalEObject)visibilityData;
			visibilityData = (VisibilityData)eResolveProxy(oldVisibilityData);
			if (visibilityData != oldVisibilityData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__VISIBILITY_DATA, oldVisibilityData, visibilityData));
			}
		}
		return visibilityData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityData basicGetVisibilityData() {
		return visibilityData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibilityData(VisibilityData newVisibilityData) {
		VisibilityData oldVisibilityData = visibilityData;
		visibilityData = newVisibilityData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__VISIBILITY_DATA, oldVisibilityData, visibilityData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PressureData getPressureData() {
		if (pressureData != null && pressureData.eIsProxy()) {
			InternalEObject oldPressureData = (InternalEObject)pressureData;
			pressureData = (PressureData)eResolveProxy(oldPressureData);
			if (pressureData != oldPressureData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__PRESSURE_DATA, oldPressureData, pressureData));
			}
		}
		return pressureData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureData basicGetPressureData() {
		return pressureData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPressureData(PressureData newPressureData) {
		PressureData oldPressureData = pressureData;
		pressureData = newPressureData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__PRESSURE_DATA, oldPressureData, pressureData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IrradianceData getIrradianceData() {
		if (irradianceData != null && irradianceData.eIsProxy()) {
			InternalEObject oldIrradianceData = (InternalEObject)irradianceData;
			irradianceData = (IrradianceData)eResolveProxy(oldIrradianceData);
			if (irradianceData != oldIrradianceData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WeatherPackage.WEATHER_PROVIDER__IRRADIANCE_DATA, oldIrradianceData, irradianceData));
			}
		}
		return irradianceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrradianceData basicGetIrradianceData() {
		return irradianceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIrradianceData(IrradianceData newIrradianceData) {
		IrradianceData oldIrradianceData = irradianceData;
		irradianceData = newIrradianceData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.WEATHER_PROVIDER__IRRADIANCE_DATA, oldIrradianceData, irradianceData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WeatherPackage.WEATHER_PROVIDER__WIND_DATA:
				if (resolve) return getWindData();
				return basicGetWindData();
			case WeatherPackage.WEATHER_PROVIDER__CLOUD_DATA:
				if (resolve) return getCloudData();
				return basicGetCloudData();
			case WeatherPackage.WEATHER_PROVIDER__PRECIPITATION_DATA:
				if (resolve) return getPrecipitationData();
				return basicGetPrecipitationData();
			case WeatherPackage.WEATHER_PROVIDER__TEMPERATURE_DATA:
				if (resolve) return getTemperatureData();
				return basicGetTemperatureData();
			case WeatherPackage.WEATHER_PROVIDER__FOG_DATA:
				if (resolve) return getFogData();
				return basicGetFogData();
			case WeatherPackage.WEATHER_PROVIDER__SNOW_RAIN_DATA:
				if (resolve) return getSnowRainData();
				return basicGetSnowRainData();
			case WeatherPackage.WEATHER_PROVIDER__VISIBILITY_DATA:
				if (resolve) return getVisibilityData();
				return basicGetVisibilityData();
			case WeatherPackage.WEATHER_PROVIDER__PRESSURE_DATA:
				if (resolve) return getPressureData();
				return basicGetPressureData();
			case WeatherPackage.WEATHER_PROVIDER__IRRADIANCE_DATA:
				if (resolve) return getIrradianceData();
				return basicGetIrradianceData();
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
			case WeatherPackage.WEATHER_PROVIDER__WIND_DATA:
				setWindData((WindData)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__CLOUD_DATA:
				setCloudData((CloudData)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__PRECIPITATION_DATA:
				setPrecipitationData((PrecipitationData)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__TEMPERATURE_DATA:
				setTemperatureData((TemperatureData)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FOG_DATA:
				setFogData((FogData)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__SNOW_RAIN_DATA:
				setSnowRainData((SnowRainData)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__VISIBILITY_DATA:
				setVisibilityData((VisibilityData)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__PRESSURE_DATA:
				setPressureData((PressureData)newValue);
				return;
			case WeatherPackage.WEATHER_PROVIDER__IRRADIANCE_DATA:
				setIrradianceData((IrradianceData)newValue);
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
			case WeatherPackage.WEATHER_PROVIDER__WIND_DATA:
				setWindData((WindData)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__CLOUD_DATA:
				setCloudData((CloudData)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__PRECIPITATION_DATA:
				setPrecipitationData((PrecipitationData)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__TEMPERATURE_DATA:
				setTemperatureData((TemperatureData)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__FOG_DATA:
				setFogData((FogData)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__SNOW_RAIN_DATA:
				setSnowRainData((SnowRainData)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__VISIBILITY_DATA:
				setVisibilityData((VisibilityData)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__PRESSURE_DATA:
				setPressureData((PressureData)null);
				return;
			case WeatherPackage.WEATHER_PROVIDER__IRRADIANCE_DATA:
				setIrradianceData((IrradianceData)null);
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
			case WeatherPackage.WEATHER_PROVIDER__WIND_DATA:
				return windData != null;
			case WeatherPackage.WEATHER_PROVIDER__CLOUD_DATA:
				return cloudData != null;
			case WeatherPackage.WEATHER_PROVIDER__PRECIPITATION_DATA:
				return precipitationData != null;
			case WeatherPackage.WEATHER_PROVIDER__TEMPERATURE_DATA:
				return temperatureData != null;
			case WeatherPackage.WEATHER_PROVIDER__FOG_DATA:
				return fogData != null;
			case WeatherPackage.WEATHER_PROVIDER__SNOW_RAIN_DATA:
				return snowRainData != null;
			case WeatherPackage.WEATHER_PROVIDER__VISIBILITY_DATA:
				return visibilityData != null;
			case WeatherPackage.WEATHER_PROVIDER__PRESSURE_DATA:
				return pressureData != null;
			case WeatherPackage.WEATHER_PROVIDER__IRRADIANCE_DATA:
				return irradianceData != null;
		}
		return super.eIsSet(featureID);
	}

} //WeatherProviderImpl
