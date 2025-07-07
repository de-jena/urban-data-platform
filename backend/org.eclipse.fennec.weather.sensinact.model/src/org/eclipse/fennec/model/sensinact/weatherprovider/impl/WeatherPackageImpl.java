/**
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.CloudData;
import org.eclipse.fennec.model.sensinact.weatherprovider.FogData;
import org.eclipse.fennec.model.sensinact.weatherprovider.IrradianceData;
import org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData;
import org.eclipse.fennec.model.sensinact.weatherprovider.PressureData;
import org.eclipse.fennec.model.sensinact.weatherprovider.SnowRainData;
import org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData;
import org.eclipse.fennec.model.sensinact.weatherprovider.VisibilityData;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherAdmin;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherFactory;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider;
import org.eclipse.fennec.model.sensinact.weatherprovider.WindData;

import org.eclipse.sensinact.model.core.provider.ProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WeatherPackageImpl extends EPackageImpl implements WeatherPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weatherProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precipitationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperatureDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snowRainDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressureDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irradianceDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weatherAdminEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WeatherPackageImpl() {
		super(eNS_URI, WeatherFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WeatherPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WeatherPackage init() {
		if (isInited) return (WeatherPackage)EPackage.Registry.INSTANCE.getEPackage(WeatherPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWeatherPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WeatherPackageImpl theWeatherPackage = registeredWeatherPackage instanceof WeatherPackageImpl ? (WeatherPackageImpl)registeredWeatherPackage : new WeatherPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ProviderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWeatherPackage.createPackageContents();

		// Initialize created meta-data
		theWeatherPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWeatherPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WeatherPackage.eNS_URI, theWeatherPackage);
		return theWeatherPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeatherProvider() {
		return weatherProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_WindData() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_CloudData() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_PrecipitationData() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_TemperatureData() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_FogData() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_SnowRainData() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_VisibilityData() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_PressureData() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_IrradianceData() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWindData() {
		return windDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindData_WindDirection() {
		return (EAttribute)windDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindData_WindSpeed() {
		return (EAttribute)windDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindData_WindGustLastHour() {
		return (EAttribute)windDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindData_WindGustLastThreeHours() {
		return (EAttribute)windDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindData_WindGustMaxLast12Hours() {
		return (EAttribute)windDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindData_WindGustProb25() {
		return (EAttribute)windDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindData_WindGustProb40() {
		return (EAttribute)windDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindData_WindGustProb55() {
		return (EAttribute)windDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCloudData() {
		return cloudDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudData_CloudCoverTotal() {
		return (EAttribute)cloudDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudData_CloudCoverBelow500() {
		return (EAttribute)cloudDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudData_CloudCoverEffective() {
		return (EAttribute)cloudDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudData_CloudCoverHigh() {
		return (EAttribute)cloudDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudData_CloudCoverMid() {
		return (EAttribute)cloudDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudData_CloudCoverLow() {
		return (EAttribute)cloudDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrecipitationData() {
		return precipitationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecipitationData_PrecipitationLarger02Last6() {
		return (EAttribute)precipitationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecipitationData_PrecipitationLarger50Last6() {
		return (EAttribute)precipitationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecipitationData_PrecipitationLarger02LastDay() {
		return (EAttribute)precipitationDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecipitationData_PrecipitationLarger50LastDay() {
		return (EAttribute)precipitationDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecipitationData_PrecipitationLarger00Last12() {
		return (EAttribute)precipitationDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecipitationData_PrecipitationLarger02Last12() {
		return (EAttribute)precipitationDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecipitationData_PrecipitationLarger10Last12() {
		return (EAttribute)precipitationDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecipitationData_PrecipitationLarger50Last12() {
		return (EAttribute)precipitationDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecipitationData_PrecipitationSignificantWeatherTotal() {
		return (EAttribute)precipitationDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecipitationData_PrecipitationSignificantWeatherLast3() {
		return (EAttribute)precipitationDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemperatureData() {
		return temperatureDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemperatureData_TempAboveSurface5() {
		return (EAttribute)temperatureDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemperatureData_TempAboveSurface200() {
		return (EAttribute)temperatureDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemperatureData_TempDewpointAboveSurface200() {
		return (EAttribute)temperatureDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemperatureData_TempMinLast12() {
		return (EAttribute)temperatureDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemperatureData_TempMaxLast12() {
		return (EAttribute)temperatureDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFogData() {
		return fogDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFogData_FogPropLast1() {
		return (EAttribute)fogDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFogData_FogPropLast6() {
		return (EAttribute)fogDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFogData_FogPropLast12() {
		return (EAttribute)fogDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSnowRainData() {
		return snowRainDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSnowRainData_SnowRainEqLast1() {
		return (EAttribute)snowRainDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSnowRainData_SnowRainEqLast3() {
		return (EAttribute)snowRainDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVisibilityData() {
		return visibilityDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVisibilityData_Visibility() {
		return (EAttribute)visibilityDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPressureData() {
		return pressureDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPressureData_SurfacePressure() {
		return (EAttribute)pressureDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIrradianceData() {
		return irradianceDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIrradianceData_IrRadianceGlobal() {
		return (EAttribute)irradianceDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeatherAdmin() {
		return weatherAdminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherAdmin_WeatherStationId() {
		return (EAttribute)weatherAdminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherAdmin_WeatherStationName() {
		return (EAttribute)weatherAdminEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeatherFactory getWeatherFactory() {
		return (WeatherFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		weatherProviderEClass = createEClass(WEATHER_PROVIDER);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__WIND_DATA);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__CLOUD_DATA);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__PRECIPITATION_DATA);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__TEMPERATURE_DATA);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FOG_DATA);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__SNOW_RAIN_DATA);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__VISIBILITY_DATA);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__PRESSURE_DATA);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__IRRADIANCE_DATA);

		windDataEClass = createEClass(WIND_DATA);
		createEAttribute(windDataEClass, WIND_DATA__WIND_DIRECTION);
		createEAttribute(windDataEClass, WIND_DATA__WIND_SPEED);
		createEAttribute(windDataEClass, WIND_DATA__WIND_GUST_LAST_HOUR);
		createEAttribute(windDataEClass, WIND_DATA__WIND_GUST_LAST_THREE_HOURS);
		createEAttribute(windDataEClass, WIND_DATA__WIND_GUST_MAX_LAST12_HOURS);
		createEAttribute(windDataEClass, WIND_DATA__WIND_GUST_PROB25);
		createEAttribute(windDataEClass, WIND_DATA__WIND_GUST_PROB40);
		createEAttribute(windDataEClass, WIND_DATA__WIND_GUST_PROB55);

		cloudDataEClass = createEClass(CLOUD_DATA);
		createEAttribute(cloudDataEClass, CLOUD_DATA__CLOUD_COVER_TOTAL);
		createEAttribute(cloudDataEClass, CLOUD_DATA__CLOUD_COVER_BELOW500);
		createEAttribute(cloudDataEClass, CLOUD_DATA__CLOUD_COVER_EFFECTIVE);
		createEAttribute(cloudDataEClass, CLOUD_DATA__CLOUD_COVER_HIGH);
		createEAttribute(cloudDataEClass, CLOUD_DATA__CLOUD_COVER_MID);
		createEAttribute(cloudDataEClass, CLOUD_DATA__CLOUD_COVER_LOW);

		precipitationDataEClass = createEClass(PRECIPITATION_DATA);
		createEAttribute(precipitationDataEClass, PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST6);
		createEAttribute(precipitationDataEClass, PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST6);
		createEAttribute(precipitationDataEClass, PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST_DAY);
		createEAttribute(precipitationDataEClass, PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST_DAY);
		createEAttribute(precipitationDataEClass, PRECIPITATION_DATA__PRECIPITATION_LARGER00_LAST12);
		createEAttribute(precipitationDataEClass, PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST12);
		createEAttribute(precipitationDataEClass, PRECIPITATION_DATA__PRECIPITATION_LARGER10_LAST12);
		createEAttribute(precipitationDataEClass, PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST12);
		createEAttribute(precipitationDataEClass, PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL);
		createEAttribute(precipitationDataEClass, PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_LAST3);

		temperatureDataEClass = createEClass(TEMPERATURE_DATA);
		createEAttribute(temperatureDataEClass, TEMPERATURE_DATA__TEMP_ABOVE_SURFACE5);
		createEAttribute(temperatureDataEClass, TEMPERATURE_DATA__TEMP_ABOVE_SURFACE200);
		createEAttribute(temperatureDataEClass, TEMPERATURE_DATA__TEMP_DEWPOINT_ABOVE_SURFACE200);
		createEAttribute(temperatureDataEClass, TEMPERATURE_DATA__TEMP_MIN_LAST12);
		createEAttribute(temperatureDataEClass, TEMPERATURE_DATA__TEMP_MAX_LAST12);

		fogDataEClass = createEClass(FOG_DATA);
		createEAttribute(fogDataEClass, FOG_DATA__FOG_PROP_LAST1);
		createEAttribute(fogDataEClass, FOG_DATA__FOG_PROP_LAST6);
		createEAttribute(fogDataEClass, FOG_DATA__FOG_PROP_LAST12);

		snowRainDataEClass = createEClass(SNOW_RAIN_DATA);
		createEAttribute(snowRainDataEClass, SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST1);
		createEAttribute(snowRainDataEClass, SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST3);

		visibilityDataEClass = createEClass(VISIBILITY_DATA);
		createEAttribute(visibilityDataEClass, VISIBILITY_DATA__VISIBILITY);

		pressureDataEClass = createEClass(PRESSURE_DATA);
		createEAttribute(pressureDataEClass, PRESSURE_DATA__SURFACE_PRESSURE);

		irradianceDataEClass = createEClass(IRRADIANCE_DATA);
		createEAttribute(irradianceDataEClass, IRRADIANCE_DATA__IR_RADIANCE_GLOBAL);

		weatherAdminEClass = createEClass(WEATHER_ADMIN);
		createEAttribute(weatherAdminEClass, WEATHER_ADMIN__WEATHER_STATION_ID);
		createEAttribute(weatherAdminEClass, WEATHER_ADMIN__WEATHER_STATION_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ProviderPackage theProviderPackage = (ProviderPackage)EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		weatherProviderEClass.getESuperTypes().add(theProviderPackage.getDynamicProvider());
		windDataEClass.getESuperTypes().add(theProviderPackage.getService());
		cloudDataEClass.getESuperTypes().add(theProviderPackage.getService());
		precipitationDataEClass.getESuperTypes().add(theProviderPackage.getService());
		temperatureDataEClass.getESuperTypes().add(theProviderPackage.getService());
		fogDataEClass.getESuperTypes().add(theProviderPackage.getService());
		snowRainDataEClass.getESuperTypes().add(theProviderPackage.getService());
		visibilityDataEClass.getESuperTypes().add(theProviderPackage.getService());
		pressureDataEClass.getESuperTypes().add(theProviderPackage.getService());
		irradianceDataEClass.getESuperTypes().add(theProviderPackage.getService());
		weatherAdminEClass.getESuperTypes().add(theProviderPackage.getAdmin());

		// Initialize classes, features, and operations; add parameters
		initEClass(weatherProviderEClass, WeatherProvider.class, "WeatherProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeatherProvider_WindData(), this.getWindData(), null, "windData", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_CloudData(), this.getCloudData(), null, "cloudData", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_PrecipitationData(), this.getPrecipitationData(), null, "precipitationData", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_TemperatureData(), this.getTemperatureData(), null, "temperatureData", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_FogData(), this.getFogData(), null, "fogData", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_SnowRainData(), this.getSnowRainData(), null, "snowRainData", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_VisibilityData(), this.getVisibilityData(), null, "visibilityData", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_PressureData(), this.getPressureData(), null, "pressureData", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_IrradianceData(), this.getIrradianceData(), null, "irradianceData", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windDataEClass, WindData.class, "WindData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWindData_WindDirection(), ecorePackage.getEFloatObject(), "windDirection", null, 0, 1, WindData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindData_WindSpeed(), ecorePackage.getEFloatObject(), "windSpeed", null, 0, 1, WindData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindData_WindGustLastHour(), ecorePackage.getEFloatObject(), "windGustLastHour", null, 0, 1, WindData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindData_WindGustLastThreeHours(), ecorePackage.getEFloatObject(), "windGustLastThreeHours", null, 0, 1, WindData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindData_WindGustMaxLast12Hours(), ecorePackage.getEFloatObject(), "windGustMaxLast12Hours", null, 0, 1, WindData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindData_WindGustProb25(), ecorePackage.getEFloatObject(), "windGustProb25", null, 0, 1, WindData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindData_WindGustProb40(), ecorePackage.getEFloatObject(), "windGustProb40", null, 0, 1, WindData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindData_WindGustProb55(), ecorePackage.getEFloatObject(), "windGustProb55", null, 0, 1, WindData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudDataEClass, CloudData.class, "CloudData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudData_CloudCoverTotal(), ecorePackage.getEFloatObject(), "cloudCoverTotal", null, 0, 1, CloudData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudData_CloudCoverBelow500(), ecorePackage.getEFloatObject(), "cloudCoverBelow500", null, 0, 1, CloudData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudData_CloudCoverEffective(), ecorePackage.getEFloatObject(), "cloudCoverEffective", null, 0, 1, CloudData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudData_CloudCoverHigh(), ecorePackage.getEFloatObject(), "cloudCoverHigh", null, 0, 1, CloudData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudData_CloudCoverMid(), ecorePackage.getEFloatObject(), "cloudCoverMid", null, 0, 1, CloudData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudData_CloudCoverLow(), ecorePackage.getEFloatObject(), "cloudCoverLow", null, 0, 1, CloudData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precipitationDataEClass, PrecipitationData.class, "PrecipitationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecipitationData_PrecipitationLarger02Last6(), ecorePackage.getEFloatObject(), "precipitationLarger02Last6", null, 0, 1, PrecipitationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecipitationData_PrecipitationLarger50Last6(), ecorePackage.getEFloatObject(), "precipitationLarger50Last6", null, 0, 1, PrecipitationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecipitationData_PrecipitationLarger02LastDay(), ecorePackage.getEFloatObject(), "precipitationLarger02LastDay", null, 0, 1, PrecipitationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecipitationData_PrecipitationLarger50LastDay(), ecorePackage.getEFloatObject(), "precipitationLarger50LastDay", null, 0, 1, PrecipitationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecipitationData_PrecipitationLarger00Last12(), ecorePackage.getEFloatObject(), "precipitationLarger00Last12", null, 0, 1, PrecipitationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecipitationData_PrecipitationLarger02Last12(), ecorePackage.getEFloatObject(), "precipitationLarger02Last12", null, 0, 1, PrecipitationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecipitationData_PrecipitationLarger10Last12(), ecorePackage.getEFloatObject(), "precipitationLarger10Last12", null, 0, 1, PrecipitationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecipitationData_PrecipitationLarger50Last12(), ecorePackage.getEFloatObject(), "precipitationLarger50Last12", null, 0, 1, PrecipitationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecipitationData_PrecipitationSignificantWeatherTotal(), ecorePackage.getEFloatObject(), "precipitationSignificantWeatherTotal", null, 0, 1, PrecipitationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecipitationData_PrecipitationSignificantWeatherLast3(), ecorePackage.getEFloatObject(), "precipitationSignificantWeatherLast3", null, 0, 1, PrecipitationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temperatureDataEClass, TemperatureData.class, "TemperatureData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemperatureData_TempAboveSurface5(), ecorePackage.getEFloatObject(), "tempAboveSurface5", null, 0, 1, TemperatureData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemperatureData_TempAboveSurface200(), ecorePackage.getEFloatObject(), "tempAboveSurface200", null, 0, 1, TemperatureData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemperatureData_TempDewpointAboveSurface200(), ecorePackage.getEFloatObject(), "tempDewpointAboveSurface200", null, 0, 1, TemperatureData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemperatureData_TempMinLast12(), ecorePackage.getEFloatObject(), "tempMinLast12", null, 0, 1, TemperatureData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemperatureData_TempMaxLast12(), ecorePackage.getEFloatObject(), "tempMaxLast12", null, 0, 1, TemperatureData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fogDataEClass, FogData.class, "FogData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFogData_FogPropLast1(), ecorePackage.getEFloatObject(), "fogPropLast1", null, 0, 1, FogData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFogData_FogPropLast6(), ecorePackage.getEFloatObject(), "fogPropLast6", null, 0, 1, FogData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFogData_FogPropLast12(), ecorePackage.getEFloatObject(), "fogPropLast12", null, 0, 1, FogData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(snowRainDataEClass, SnowRainData.class, "SnowRainData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSnowRainData_SnowRainEqLast1(), ecorePackage.getEFloatObject(), "snowRainEqLast1", null, 0, 1, SnowRainData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSnowRainData_SnowRainEqLast3(), ecorePackage.getEFloatObject(), "snowRainEqLast3", null, 0, 1, SnowRainData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visibilityDataEClass, VisibilityData.class, "VisibilityData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisibilityData_Visibility(), ecorePackage.getEFloatObject(), "visibility", null, 0, 1, VisibilityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pressureDataEClass, PressureData.class, "PressureData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPressureData_SurfacePressure(), ecorePackage.getEFloatObject(), "surfacePressure", null, 0, 1, PressureData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(irradianceDataEClass, IrradianceData.class, "IrradianceData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIrradianceData_IrRadianceGlobal(), ecorePackage.getEFloatObject(), "irRadianceGlobal", null, 0, 1, IrradianceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weatherAdminEClass, WeatherAdmin.class, "WeatherAdmin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeatherAdmin_WeatherStationId(), ecorePackage.getEString(), "weatherStationId", null, 0, 1, WeatherAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherAdmin_WeatherStationName(), ecorePackage.getEString(), "weatherStationName", null, 0, 1, WeatherAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (getWindData_WindDirection(),
		   source,
		   new String[] {
			   "documentation", "Wind direction: 0..360 Degrees (DD)"
		   });
		addAnnotation
		  (getWindData_WindSpeed(),
		   source,
		   new String[] {
			   "documentation", "Wind speed: m/s (FF)"
		   });
		addAnnotation
		  (getWindData_WindGustLastHour(),
		   source,
		   new String[] {
			   "documentation", "Maximum wind gust within the last hour: m/s (FX1)"
		   });
		addAnnotation
		  (getWindData_WindGustLastThreeHours(),
		   source,
		   new String[] {
			   "documentation", "Maximum wind gust within the last 3 hours: m/s (FX3)"
		   });
		addAnnotation
		  (getWindData_WindGustMaxLast12Hours(),
		   source,
		   new String[] {
			   "documentation", "Maximum wind gust within the last 12 hours: m/s (FXh)"
		   });
		addAnnotation
		  (getWindData_WindGustProb25(),
		   source,
		   new String[] {
			   "documentation", "Probability of wind gusts >= 25kn within the last 12 hours: 0..100% (FXh25)"
		   });
		addAnnotation
		  (getWindData_WindGustProb40(),
		   source,
		   new String[] {
			   "documentation", "Probability of wind gusts >= 40kn within the last 12 hours: 0..100% (FXh40)"
		   });
		addAnnotation
		  (getWindData_WindGustProb55(),
		   source,
		   new String[] {
			   "documentation", "Probability of wind gusts >= 55kn within the last 12 hours: 0..100% (FXh55)"
		   });
		addAnnotation
		  (getCloudData_CloudCoverTotal(),
		   source,
		   new String[] {
			   "documentation", "Total cloud cover: 0..100% (N)"
		   });
		addAnnotation
		  (getCloudData_CloudCoverBelow500(),
		   source,
		   new String[] {
			   "documentation", "Cloud cover below 500 ft.: 0..100% (N05)"
		   });
		addAnnotation
		  (getCloudData_CloudCoverEffective(),
		   source,
		   new String[] {
			   "documentation", "Effective cloud cover: 0..100% (Neff)"
		   });
		addAnnotation
		  (getCloudData_CloudCoverHigh(),
		   source,
		   new String[] {
			   "documentation", "High cloud cover (>7 km): 0..100% (Nh)"
		   });
		addAnnotation
		  (getCloudData_CloudCoverMid(),
		   source,
		   new String[] {
			   "documentation", "Midlevel cloud cover (2-7 km): 0..100% (Nm)"
		   });
		addAnnotation
		  (getCloudData_CloudCoverLow(),
		   source,
		   new String[] {
			   "documentation", "Low cloud cover (lower than 2 km): 0..100% (Nl)"
		   });
		addAnnotation
		  (getPrecipitationData_PrecipitationLarger02Last6(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 0.2mm during the last 6 hours: 0..100% (R602)"
		   });
		addAnnotation
		  (getPrecipitationData_PrecipitationLarger50Last6(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 5mm during the last 6 hours: 0..100% (R650)"
		   });
		addAnnotation
		  (getPrecipitationData_PrecipitationLarger02LastDay(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 0.2mm during the last 24 hours: 0..100% (Rd02)"
		   });
		addAnnotation
		  (getPrecipitationData_PrecipitationLarger50LastDay(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 5mm during the last 24 hours: 0..100% (Rd50)"
		   });
		addAnnotation
		  (getPrecipitationData_PrecipitationLarger00Last12(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 0.0mm during the last 12 hours: 0..100% (Rh00)"
		   });
		addAnnotation
		  (getPrecipitationData_PrecipitationLarger02Last12(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 0.2mm during the last 12 hours: 0..100% (Rh02)"
		   });
		addAnnotation
		  (getPrecipitationData_PrecipitationLarger10Last12(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 1 mm during the last 12 hours: 0..100% (Rh10)"
		   });
		addAnnotation
		  (getPrecipitationData_PrecipitationLarger50Last12(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 5mm during the last 12 hours: 0..100% (Rh50)"
		   });
		addAnnotation
		  (getPrecipitationData_PrecipitationSignificantWeatherTotal(),
		   source,
		   new String[] {
			   "documentation", "Total precipitation during the last hour consistent with significant weather: kg/m2 (RR1c)"
		   });
		addAnnotation
		  (getPrecipitationData_PrecipitationSignificantWeatherLast3(),
		   source,
		   new String[] {
			   "documentation", "Total precipitation during the last 3 hours  consistent with significant weather: kg/m2 (RR3c)"
		   });
		addAnnotation
		  (getTemperatureData_TempAboveSurface5(),
		   source,
		   new String[] {
			   "documentation", "Temperature 5cm above surface: Kelvin (T5cm)"
		   });
		addAnnotation
		  (getTemperatureData_TempAboveSurface200(),
		   source,
		   new String[] {
			   "documentation", "Temperature 2m above surface: Kelvin (TTT)"
		   });
		addAnnotation
		  (getTemperatureData_TempDewpointAboveSurface200(),
		   source,
		   new String[] {
			   "documentation", "Dewpoint 2m above surface: Kelvin (Td)"
		   });
		addAnnotation
		  (getTemperatureData_TempMinLast12(),
		   source,
		   new String[] {
			   "documentation", "Minimum temperature - within the last 12 hours: Kelvin (TN)"
		   });
		addAnnotation
		  (getTemperatureData_TempMaxLast12(),
		   source,
		   new String[] {
			   "documentation", "Maximum temperature - within the last 12 hours: Kelvin (TX)"
		   });
		addAnnotation
		  (getFogData_FogPropLast1(),
		   source,
		   new String[] {
			   "documentation", "Probability for fog within the last hour: 0..100% (wwM)"
		   });
		addAnnotation
		  (getFogData_FogPropLast6(),
		   source,
		   new String[] {
			   "documentation", "Probability for fog within the last 6 hours: 0..100% (wwM6)"
		   });
		addAnnotation
		  (getFogData_FogPropLast12(),
		   source,
		   new String[] {
			   "documentation", "Probability for fog within the last 12 hours: 0..100% (wwMh)"
		   });
		addAnnotation
		  (getSnowRainData_SnowRainEqLast1(),
		   source,
		   new String[] {
			   "documentation", "Snow-Rain-Equivalent during the last hour: kg/m2 (RRS1c)"
		   });
		addAnnotation
		  (getSnowRainData_SnowRainEqLast3(),
		   source,
		   new String[] {
			   "documentation", "Snow-Rain-Equivalent during the 3 hours: kg/m2 (RRS3c)"
		   });
		addAnnotation
		  (getVisibilityData_Visibility(),
		   source,
		   new String[] {
			   "documentation", "Visibility: m (VV)"
		   });
		addAnnotation
		  (getPressureData_SurfacePressure(),
		   source,
		   new String[] {
			   "documentation", "Surface pressure, reduced: Pa (PPPP)"
		   });
		addAnnotation
		  (getIrradianceData_IrRadianceGlobal(),
		   source,
		   new String[] {
			   "documentation", "Global Irradiance: kJ/m2 (Rad1h)"
		   });
	}

} //WeatherPackageImpl
