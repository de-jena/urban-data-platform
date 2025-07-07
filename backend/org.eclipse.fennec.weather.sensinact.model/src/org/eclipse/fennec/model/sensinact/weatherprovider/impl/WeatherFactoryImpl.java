/**
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.fennec.model.sensinact.weatherprovider.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WeatherFactoryImpl extends EFactoryImpl implements WeatherFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WeatherFactory init() {
		try {
			WeatherFactory theWeatherFactory = (WeatherFactory)EPackage.Registry.INSTANCE.getEFactory(WeatherPackage.eNS_URI);
			if (theWeatherFactory != null) {
				return theWeatherFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WeatherFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WeatherPackage.WEATHER_PROVIDER: return createWeatherProvider();
			case WeatherPackage.WIND_DATA: return createWindData();
			case WeatherPackage.CLOUD_DATA: return createCloudData();
			case WeatherPackage.PRECIPITATION_DATA: return createPrecipitationData();
			case WeatherPackage.TEMPERATURE_DATA: return createTemperatureData();
			case WeatherPackage.FOG_DATA: return createFogData();
			case WeatherPackage.SNOW_RAIN_DATA: return createSnowRainData();
			case WeatherPackage.VISIBILITY_DATA: return createVisibilityData();
			case WeatherPackage.PRESSURE_DATA: return createPressureData();
			case WeatherPackage.IRRADIANCE_DATA: return createIrradianceData();
			case WeatherPackage.WEATHER_ADMIN: return createWeatherAdmin();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherProvider createWeatherProvider() {
		WeatherProviderImpl weatherProvider = new WeatherProviderImpl();
		return weatherProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WindData createWindData() {
		WindDataImpl windData = new WindDataImpl();
		return windData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudData createCloudData() {
		CloudDataImpl cloudData = new CloudDataImpl();
		return cloudData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrecipitationData createPrecipitationData() {
		PrecipitationDataImpl precipitationData = new PrecipitationDataImpl();
		return precipitationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemperatureData createTemperatureData() {
		TemperatureDataImpl temperatureData = new TemperatureDataImpl();
		return temperatureData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FogData createFogData() {
		FogDataImpl fogData = new FogDataImpl();
		return fogData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SnowRainData createSnowRainData() {
		SnowRainDataImpl snowRainData = new SnowRainDataImpl();
		return snowRainData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisibilityData createVisibilityData() {
		VisibilityDataImpl visibilityData = new VisibilityDataImpl();
		return visibilityData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PressureData createPressureData() {
		PressureDataImpl pressureData = new PressureDataImpl();
		return pressureData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IrradianceData createIrradianceData() {
		IrradianceDataImpl irradianceData = new IrradianceDataImpl();
		return irradianceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherAdmin createWeatherAdmin() {
		WeatherAdminImpl weatherAdmin = new WeatherAdminImpl();
		return weatherAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherPackage getWeatherPackage() {
		return (WeatherPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WeatherPackage getPackage() {
		return WeatherPackage.eINSTANCE;
	}

} //WeatherFactoryImpl
