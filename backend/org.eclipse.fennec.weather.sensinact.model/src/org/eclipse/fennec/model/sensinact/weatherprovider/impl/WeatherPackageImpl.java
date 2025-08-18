/**
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherFactory;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService;

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
	private EClass weatherServiceEClass = null;

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
	public EReference getWeatherProvider_CurrentWeather() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast3H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast6H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast9H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast12H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast15H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast18H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast21H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast24H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast27H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast30H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast33H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast36H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast39H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast42H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast45H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast48H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast51H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast54H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast57H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast60H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast63H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast66H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast69H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_Forecast72H() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeatherService() {
		return weatherServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_ForecastedWeatherTime() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_IssueTime() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_WindDirection() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_WindSpeed() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_WindGustLastHour() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_WindGustLastThreeHours() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_WindGustMaxLast12Hours() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_WindGustProb25() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_WindGustProb40() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_WindGustProb55() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_CloudCoverTotal() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_CloudCoverBelow500() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_CloudCoverEffective() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_CloudCoverHigh() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_CloudCoverMid() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_CloudCoverLow() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_PrecipitationLarger02Last6() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_PrecipitationLarger50Last6() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_PrecipitationLarger02LastDay() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_PrecipitationLarger50LastDay() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_PrecipitationLarger00Last12() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_PrecipitationLarger02Last12() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_PrecipitationLarger10Last12() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_PrecipitationLarger50Last12() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_PrecipitationSignificantWeatherTotal() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_PrecipitationSignificantWeatherLast3() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_TempAboveSurface5() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_TempAboveSurface200() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_TempDewpointAboveSurface200() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_TempMinLast12() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_TempMaxLast12() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_FogPropLast1() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_FogPropLast6() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_FogPropLast12() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_SnowRainEqLast1() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_SnowRainEqLast3() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_Visibility() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_SurfacePressure() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_IrRadianceGlobal() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_Ww() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_W1w2_w1() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeatherService_W1w2_w2() {
		return (EAttribute)weatherServiceEClass.getEStructuralFeatures().get(41);
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
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__CURRENT_WEATHER);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST3_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST6_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST9_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST12_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST15_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST18_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST21_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST24_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST27_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST30_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST33_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST36_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST39_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST42_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST45_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST48_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST51_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST54_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST57_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST60_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST63_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST66_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST69_H);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__FORECAST72_H);

		weatherServiceEClass = createEClass(WEATHER_SERVICE);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__FORECASTED_WEATHER_TIME);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__ISSUE_TIME);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__WIND_DIRECTION);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__WIND_SPEED);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__WIND_GUST_LAST_HOUR);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__WIND_GUST_LAST_THREE_HOURS);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__WIND_GUST_MAX_LAST12_HOURS);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__WIND_GUST_PROB25);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__WIND_GUST_PROB40);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__WIND_GUST_PROB55);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__CLOUD_COVER_TOTAL);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__CLOUD_COVER_BELOW500);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__CLOUD_COVER_EFFECTIVE);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__CLOUD_COVER_HIGH);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__CLOUD_COVER_MID);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__CLOUD_COVER_LOW);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__PRECIPITATION_LARGER02_LAST6);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__PRECIPITATION_LARGER50_LAST6);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__PRECIPITATION_LARGER02_LAST_DAY);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__PRECIPITATION_LARGER50_LAST_DAY);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__PRECIPITATION_LARGER00_LAST12);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__PRECIPITATION_LARGER02_LAST12);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__PRECIPITATION_LARGER10_LAST12);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__PRECIPITATION_LARGER50_LAST12);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__PRECIPITATION_SIGNIFICANT_WEATHER_LAST3);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__TEMP_ABOVE_SURFACE5);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__TEMP_ABOVE_SURFACE200);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__TEMP_DEWPOINT_ABOVE_SURFACE200);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__TEMP_MIN_LAST12);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__TEMP_MAX_LAST12);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__FOG_PROP_LAST1);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__FOG_PROP_LAST6);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__FOG_PROP_LAST12);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__SNOW_RAIN_EQ_LAST1);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__SNOW_RAIN_EQ_LAST3);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__VISIBILITY);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__SURFACE_PRESSURE);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__IR_RADIANCE_GLOBAL);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__WW);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__W1W2_W1);
		createEAttribute(weatherServiceEClass, WEATHER_SERVICE__W1W2_W2);
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
		weatherProviderEClass.getESuperTypes().add(theProviderPackage.getProvider());
		weatherServiceEClass.getESuperTypes().add(theProviderPackage.getService());

		// Initialize classes, features, and operations; add parameters
		initEClass(weatherProviderEClass, WeatherProvider.class, "WeatherProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeatherProvider_CurrentWeather(), this.getWeatherService(), null, "currentWeather", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast3H(), this.getWeatherService(), null, "forecast3H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast6H(), this.getWeatherService(), null, "forecast6H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast9H(), this.getWeatherService(), null, "forecast9H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast12H(), this.getWeatherService(), null, "forecast12H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast15H(), this.getWeatherService(), null, "forecast15H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast18H(), this.getWeatherService(), null, "forecast18H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast21H(), this.getWeatherService(), null, "forecast21H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast24H(), this.getWeatherService(), null, "forecast24H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast27H(), this.getWeatherService(), null, "forecast27H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast30H(), this.getWeatherService(), null, "forecast30H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast33H(), this.getWeatherService(), null, "forecast33H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast36H(), this.getWeatherService(), null, "forecast36H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast39H(), this.getWeatherService(), null, "forecast39H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast42H(), this.getWeatherService(), null, "forecast42H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast45H(), this.getWeatherService(), null, "forecast45H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast48H(), this.getWeatherService(), null, "forecast48H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast51H(), this.getWeatherService(), null, "forecast51H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast54H(), this.getWeatherService(), null, "forecast54H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast57H(), this.getWeatherService(), null, "forecast57H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast60H(), this.getWeatherService(), null, "forecast60H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast63H(), this.getWeatherService(), null, "forecast63H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast66H(), this.getWeatherService(), null, "forecast66H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast69H(), this.getWeatherService(), null, "forecast69H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_Forecast72H(), this.getWeatherService(), null, "forecast72H", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weatherServiceEClass, WeatherService.class, "WeatherService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeatherService_ForecastedWeatherTime(), theProviderPackage.getEInstant(), "forecastedWeatherTime", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_IssueTime(), theProviderPackage.getEInstant(), "issueTime", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_WindDirection(), ecorePackage.getEFloatObject(), "windDirection", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_WindSpeed(), ecorePackage.getEFloatObject(), "windSpeed", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_WindGustLastHour(), ecorePackage.getEFloatObject(), "windGustLastHour", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_WindGustLastThreeHours(), ecorePackage.getEFloatObject(), "windGustLastThreeHours", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_WindGustMaxLast12Hours(), ecorePackage.getEFloatObject(), "windGustMaxLast12Hours", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_WindGustProb25(), ecorePackage.getEFloatObject(), "windGustProb25", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_WindGustProb40(), ecorePackage.getEFloatObject(), "windGustProb40", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_WindGustProb55(), ecorePackage.getEFloatObject(), "windGustProb55", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_CloudCoverTotal(), ecorePackage.getEFloatObject(), "cloudCoverTotal", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_CloudCoverBelow500(), ecorePackage.getEFloatObject(), "cloudCoverBelow500", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_CloudCoverEffective(), ecorePackage.getEFloatObject(), "cloudCoverEffective", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_CloudCoverHigh(), ecorePackage.getEFloatObject(), "cloudCoverHigh", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_CloudCoverMid(), ecorePackage.getEFloatObject(), "cloudCoverMid", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_CloudCoverLow(), ecorePackage.getEFloatObject(), "cloudCoverLow", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_PrecipitationLarger02Last6(), ecorePackage.getEFloatObject(), "precipitationLarger02Last6", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_PrecipitationLarger50Last6(), ecorePackage.getEFloatObject(), "precipitationLarger50Last6", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_PrecipitationLarger02LastDay(), ecorePackage.getEFloatObject(), "precipitationLarger02LastDay", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_PrecipitationLarger50LastDay(), ecorePackage.getEFloatObject(), "precipitationLarger50LastDay", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_PrecipitationLarger00Last12(), ecorePackage.getEFloatObject(), "precipitationLarger00Last12", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_PrecipitationLarger02Last12(), ecorePackage.getEFloatObject(), "precipitationLarger02Last12", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_PrecipitationLarger10Last12(), ecorePackage.getEFloatObject(), "precipitationLarger10Last12", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_PrecipitationLarger50Last12(), ecorePackage.getEFloatObject(), "precipitationLarger50Last12", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_PrecipitationSignificantWeatherTotal(), ecorePackage.getEFloatObject(), "precipitationSignificantWeatherTotal", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_PrecipitationSignificantWeatherLast3(), ecorePackage.getEFloatObject(), "precipitationSignificantWeatherLast3", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_TempAboveSurface5(), ecorePackage.getEFloatObject(), "tempAboveSurface5", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_TempAboveSurface200(), ecorePackage.getEFloatObject(), "tempAboveSurface200", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_TempDewpointAboveSurface200(), ecorePackage.getEFloatObject(), "tempDewpointAboveSurface200", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_TempMinLast12(), ecorePackage.getEFloatObject(), "tempMinLast12", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_TempMaxLast12(), ecorePackage.getEFloatObject(), "tempMaxLast12", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_FogPropLast1(), ecorePackage.getEFloatObject(), "fogPropLast1", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_FogPropLast6(), ecorePackage.getEFloatObject(), "fogPropLast6", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_FogPropLast12(), ecorePackage.getEFloatObject(), "fogPropLast12", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_SnowRainEqLast1(), ecorePackage.getEFloatObject(), "snowRainEqLast1", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_SnowRainEqLast3(), ecorePackage.getEFloatObject(), "snowRainEqLast3", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_Visibility(), ecorePackage.getEFloatObject(), "visibility", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_SurfacePressure(), ecorePackage.getEFloatObject(), "surfacePressure", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_IrRadianceGlobal(), ecorePackage.getEFloatObject(), "irRadianceGlobal", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_Ww(), ecorePackage.getEString(), "ww", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_W1w2_w1(), ecorePackage.getEString(), "w1w2_w1", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeatherService_W1w2_w2(), ecorePackage.getEString(), "w1w2_w2", null, 0, 1, WeatherService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getWeatherService_ForecastedWeatherTime(),
		   source,
		   new String[] {
			   "documentation", "The time of the forecasted weather"
		   });
		addAnnotation
		  (getWeatherService_IssueTime(),
		   source,
		   new String[] {
			   "documentation", "The time this report was issued"
		   });
		addAnnotation
		  (getWeatherService_WindDirection(),
		   source,
		   new String[] {
			   "documentation", "Wind direction: 0..360 Degrees (DD)",
			   "unit", "\u00b0",
			   "dwd.id", "DD"
		   });
		addAnnotation
		  (getWeatherService_WindSpeed(),
		   source,
		   new String[] {
			   "documentation", "Wind speed: m/s (FF)",
			   "unit", "m/s",
			   "dwd.id", "FF"
		   });
		addAnnotation
		  (getWeatherService_WindGustLastHour(),
		   source,
		   new String[] {
			   "documentation", "Maximum wind gust within the last hour: m/s (FX1)",
			   "unit", "m/s",
			   "dwd.id", "FX1"
		   });
		addAnnotation
		  (getWeatherService_WindGustLastThreeHours(),
		   source,
		   new String[] {
			   "documentation", "Maximum wind gust within the last 3 hours: m/s (FX3)",
			   "unit", "m/s",
			   "dwd.id", "FX3"
		   });
		addAnnotation
		  (getWeatherService_WindGustMaxLast12Hours(),
		   source,
		   new String[] {
			   "documentation", "Maximum wind gust within the last 12 hours: m/s (FXh)",
			   "unit", "m/s",
			   "dwd.id", "FXh"
		   });
		addAnnotation
		  (getWeatherService_WindGustProb25(),
		   source,
		   new String[] {
			   "documentation", "Probability of wind gusts >= 25kn within the last 12 hours: 0..100% (FXh25)",
			   "unit", "%",
			   "dwd.id", "FXh25"
		   });
		addAnnotation
		  (getWeatherService_WindGustProb40(),
		   source,
		   new String[] {
			   "documentation", "Probability of wind gusts >= 40kn within the last 12 hours: 0..100% (FXh40)",
			   "unit", "%",
			   "dwd.id", "FXh40"
		   });
		addAnnotation
		  (getWeatherService_WindGustProb55(),
		   source,
		   new String[] {
			   "documentation", "Probability of wind gusts >= 55kn within the last 12 hours: 0..100% (FXh55)",
			   "unit", "%",
			   "dwd.id", "FXh55"
		   });
		addAnnotation
		  (getWeatherService_CloudCoverTotal(),
		   source,
		   new String[] {
			   "documentation", "Total cloud cover: 0..100% (N)",
			   "unit", "%",
			   "dwd.id", "N"
		   });
		addAnnotation
		  (getWeatherService_CloudCoverBelow500(),
		   source,
		   new String[] {
			   "documentation", "Cloud cover below 500 ft.: 0..100% (N05)",
			   "unit", "%",
			   "dwd.id", "N05"
		   });
		addAnnotation
		  (getWeatherService_CloudCoverEffective(),
		   source,
		   new String[] {
			   "documentation", "Effective cloud cover: 0..100% (Neff)",
			   "unit", "%",
			   "dwd.id", "Neff"
		   });
		addAnnotation
		  (getWeatherService_CloudCoverHigh(),
		   source,
		   new String[] {
			   "documentation", "High cloud cover (>7 km): 0..100% (Nh)",
			   "unit", "%",
			   "dwd.id", "Nh"
		   });
		addAnnotation
		  (getWeatherService_CloudCoverMid(),
		   source,
		   new String[] {
			   "documentation", "Midlevel cloud cover (2-7 km): 0..100% (Nm)",
			   "unit", "%",
			   "dwd.id", "Nm"
		   });
		addAnnotation
		  (getWeatherService_CloudCoverLow(),
		   source,
		   new String[] {
			   "documentation", "Low cloud cover (lower than 2 km): 0..100% (Nl)",
			   "unit", "%",
			   "dwd.id", "Nl"
		   });
		addAnnotation
		  (getWeatherService_PrecipitationLarger02Last6(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 0.2mm during the last 6 hours: 0..100% (R602)",
			   "unit", "%",
			   "dwd.id", "R602"
		   });
		addAnnotation
		  (getWeatherService_PrecipitationLarger50Last6(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 5mm during the last 6 hours: 0..100% (R650)",
			   "unit", "%",
			   "dwd.id", "R650"
		   });
		addAnnotation
		  (getWeatherService_PrecipitationLarger02LastDay(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 0.2mm during the last 24 hours: 0..100% (Rd02)",
			   "unit", "%",
			   "dwd.id", "Rd02"
		   });
		addAnnotation
		  (getWeatherService_PrecipitationLarger50LastDay(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 5mm during the last 24 hours: 0..100% (Rd50)",
			   "unit", "%",
			   "dwd.id", "Rd50"
		   });
		addAnnotation
		  (getWeatherService_PrecipitationLarger00Last12(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 0.0mm during the last 12 hours: 0..100% (Rh00)",
			   "unit", "%",
			   "dwd.id", "Rh00"
		   });
		addAnnotation
		  (getWeatherService_PrecipitationLarger02Last12(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 0.2mm during the last 12 hours: 0..100% (Rh02)",
			   "unit", "%",
			   "dwd.id", "Rh02"
		   });
		addAnnotation
		  (getWeatherService_PrecipitationLarger10Last12(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 1 mm during the last 12 hours: 0..100% (Rh10)",
			   "unit", "%",
			   "dwd.id", "Rh10"
		   });
		addAnnotation
		  (getWeatherService_PrecipitationLarger50Last12(),
		   source,
		   new String[] {
			   "documentation", "Probability of precipitation > 5mm during the last 12 hours: 0..100% (Rh50)",
			   "unit", "%",
			   "dwd.id", "Rh50"
		   });
		addAnnotation
		  (getWeatherService_PrecipitationSignificantWeatherTotal(),
		   source,
		   new String[] {
			   "documentation", "Total precipitation during the last hour consistent with significant weather: kg/m2 (RR1c)",
			   "unit", "kg/m2",
			   "dwd.id", "RR1c"
		   });
		addAnnotation
		  (getWeatherService_PrecipitationSignificantWeatherLast3(),
		   source,
		   new String[] {
			   "documentation", "Total precipitation during the last 3 hours  consistent with significant weather: kg/m2 (RR3c)",
			   "unit", "kg/m2",
			   "dwd.id", "RR3c"
		   });
		addAnnotation
		  (getWeatherService_TempAboveSurface5(),
		   source,
		   new String[] {
			   "documentation", "Temperature 5cm above surface: Kelvin (T5cm)",
			   "unit", "K",
			   "dwd.id", "T5cm"
		   });
		addAnnotation
		  (getWeatherService_TempAboveSurface200(),
		   source,
		   new String[] {
			   "documentation", "Temperature 2m above surface: Kelvin (TTT)",
			   "unit", "K",
			   "dwd.id", "TTT"
		   });
		addAnnotation
		  (getWeatherService_TempDewpointAboveSurface200(),
		   source,
		   new String[] {
			   "documentation", "Dewpoint 2m above surface: Kelvin (Td)",
			   "unit", "K",
			   "dwd.id", "Td"
		   });
		addAnnotation
		  (getWeatherService_TempMinLast12(),
		   source,
		   new String[] {
			   "documentation", "Minimum temperature - within the last 12 hours: Kelvin (TN)",
			   "unit", "K",
			   "dwd.id", "TN"
		   });
		addAnnotation
		  (getWeatherService_TempMaxLast12(),
		   source,
		   new String[] {
			   "documentation", "Maximum temperature - within the last 12 hours: Kelvin (TX)",
			   "unit", "K",
			   "dwd.id", "TX"
		   });
		addAnnotation
		  (getWeatherService_FogPropLast1(),
		   source,
		   new String[] {
			   "documentation", "Probability for fog within the last hour: 0..100% (wwM)",
			   "unit", "%",
			   "dwd.id", "wwM"
		   });
		addAnnotation
		  (getWeatherService_FogPropLast6(),
		   source,
		   new String[] {
			   "documentation", "Probability for fog within the last 6 hours: 0..100% (wwM6)",
			   "unit", "%",
			   "dwd.id", "wwM6"
		   });
		addAnnotation
		  (getWeatherService_FogPropLast12(),
		   source,
		   new String[] {
			   "documentation", "Probability for fog within the last 12 hours: 0..100% (wwMh)",
			   "unit", "%",
			   "dwd.id", "wwMh"
		   });
		addAnnotation
		  (getWeatherService_SnowRainEqLast1(),
		   source,
		   new String[] {
			   "documentation", "Snow-Rain-Equivalent during the last hour: kg/m2 (RRS1c)",
			   "unit", "kg/m2",
			   "dwd.id", "RRS1c"
		   });
		addAnnotation
		  (getWeatherService_SnowRainEqLast3(),
		   source,
		   new String[] {
			   "documentation", "Snow-Rain-Equivalent during the 3 hours: kg/m2 (RRS3c)",
			   "unit", "kg/m2",
			   "dwd.id", "RRS3c"
		   });
		addAnnotation
		  (getWeatherService_Visibility(),
		   source,
		   new String[] {
			   "documentation", "Visibility: m (VV)",
			   "unit", "m",
			   "dwd.id", "VV"
		   });
		addAnnotation
		  (getWeatherService_SurfacePressure(),
		   source,
		   new String[] {
			   "documentation", "Surface pressure, reduced: Pa (PPPP)",
			   "unit", "Pa",
			   "dwd.id", "PPPP"
		   });
		addAnnotation
		  (getWeatherService_IrRadianceGlobal(),
		   source,
		   new String[] {
			   "documentation", "Global Irradiance: kJ/m2 (Rad1h)",
			   "unit", "kJ/m2",
			   "dwd.id", "Rad1h"
		   });
		addAnnotation
		  (getWeatherService_Ww(),
		   source,
		   new String[] {
			   "documentation", "Significant weather during the past 3 hours: - (ww)",
			   "dwd.id", "ww"
		   });
		addAnnotation
		  (getWeatherService_W1w2_w1(),
		   source,
		   new String[] {
			   "documentation", "Significant weather in the past 6 to 3 hours: - (W1 part of W1W2)",
			   "dwd.id", "W1 part of W1W2"
		   });
		addAnnotation
		  (getWeatherService_W1w2_w2(),
		   source,
		   new String[] {
			   "documentation", "Significant weather in the past 3 hours: - (W2 part of W1W2)",
			   "dwd.id", "W2 part of W1W2"
		   });
	}

} //WeatherPackageImpl
