/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.sensinact.model.core.provider.ProviderPackage;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = WeatherPackage.eNS_URI, genModel = "/model/weather.genmodel", genModelSourceLocations = {"model/weather.genmodel","org.eclipse.fennec.weather.sensinact.model/model/weather.genmodel"}, ecore="/model/weather.ecore", ecoreSourceLocations="/model/weather.ecore")
public interface WeatherPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "weatherprovider";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://fennec.eclipse.org/sensinact/weather/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "weatherprovider";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WeatherPackage eINSTANCE = org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getWeatherProvider()
	 * @generated
	 */
	int WEATHER_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Current Weather</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__CURRENT_WEATHER = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Forecast3 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST3_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Forecast6 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST6_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Forecast9 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST9_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Forecast12 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST12_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Forecast15 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST15_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Forecast18 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST18_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Forecast21 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST21_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Forecast24 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST24_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Forecast27 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST27_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Forecast30 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST30_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Forecast33 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST33_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Forecast36 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST36_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Forecast39 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST39_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Forecast42 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST42_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Forecast45 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST45_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Forecast48 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST48_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Forecast51 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST51_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Forecast54 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST54_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Forecast57 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST57_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Forecast60 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST60_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Forecast63 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST63_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Forecast66 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST66_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Forecast69 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST69_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Forecast72 H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FORECAST72_H = ProviderPackage.PROVIDER_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherServiceImpl
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getWeatherService()
	 * @generated
	 */
	int WEATHER_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Forecasted Weather Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__FORECASTED_WEATHER_TIME = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wind Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__WIND_DIRECTION = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__WIND_SPEED = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wind Gust Last Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__WIND_GUST_LAST_HOUR = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Wind Gust Last Three Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__WIND_GUST_LAST_THREE_HOURS = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Wind Gust Max Last12 Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__WIND_GUST_MAX_LAST12_HOURS = ProviderPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Wind Gust Prob25</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__WIND_GUST_PROB25 = ProviderPackage.SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Wind Gust Prob40</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__WIND_GUST_PROB40 = ProviderPackage.SERVICE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Wind Gust Prob55</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__WIND_GUST_PROB55 = ProviderPackage.SERVICE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cloud Cover Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__CLOUD_COVER_TOTAL = ProviderPackage.SERVICE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cloud Cover Below500</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__CLOUD_COVER_BELOW500 = ProviderPackage.SERVICE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Cloud Cover Effective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__CLOUD_COVER_EFFECTIVE = ProviderPackage.SERVICE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Cloud Cover High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__CLOUD_COVER_HIGH = ProviderPackage.SERVICE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Cloud Cover Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__CLOUD_COVER_MID = ProviderPackage.SERVICE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Cloud Cover Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__CLOUD_COVER_LOW = ProviderPackage.SERVICE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Precipitation Larger02 Last6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__PRECIPITATION_LARGER02_LAST6 = ProviderPackage.SERVICE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Precipitation Larger50 Last6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__PRECIPITATION_LARGER50_LAST6 = ProviderPackage.SERVICE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Precipitation Larger02 Last Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__PRECIPITATION_LARGER02_LAST_DAY = ProviderPackage.SERVICE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Precipitation Larger50 Last Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__PRECIPITATION_LARGER50_LAST_DAY = ProviderPackage.SERVICE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Precipitation Larger00 Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__PRECIPITATION_LARGER00_LAST12 = ProviderPackage.SERVICE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Precipitation Larger02 Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__PRECIPITATION_LARGER02_LAST12 = ProviderPackage.SERVICE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Precipitation Larger10 Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__PRECIPITATION_LARGER10_LAST12 = ProviderPackage.SERVICE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Precipitation Larger50 Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__PRECIPITATION_LARGER50_LAST12 = ProviderPackage.SERVICE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Precipitation Significant Weather Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL = ProviderPackage.SERVICE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Precipitation Significant Weather Last3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__PRECIPITATION_SIGNIFICANT_WEATHER_LAST3 = ProviderPackage.SERVICE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Temp Above Surface5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__TEMP_ABOVE_SURFACE5 = ProviderPackage.SERVICE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Temp Above Surface200</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__TEMP_ABOVE_SURFACE200 = ProviderPackage.SERVICE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Temp Dewpoint Above Surface200</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__TEMP_DEWPOINT_ABOVE_SURFACE200 = ProviderPackage.SERVICE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Temp Min Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__TEMP_MIN_LAST12 = ProviderPackage.SERVICE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Temp Max Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__TEMP_MAX_LAST12 = ProviderPackage.SERVICE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Fog Prop Last1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__FOG_PROP_LAST1 = ProviderPackage.SERVICE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Fog Prop Last6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__FOG_PROP_LAST6 = ProviderPackage.SERVICE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Fog Prop Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__FOG_PROP_LAST12 = ProviderPackage.SERVICE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Snow Rain Eq Last1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__SNOW_RAIN_EQ_LAST1 = ProviderPackage.SERVICE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Snow Rain Eq Last3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__SNOW_RAIN_EQ_LAST3 = ProviderPackage.SERVICE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__VISIBILITY = ProviderPackage.SERVICE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Surface Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__SURFACE_PRESSURE = ProviderPackage.SERVICE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Ir Radiance Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__IR_RADIANCE_GLOBAL = ProviderPackage.SERVICE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Ww</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__WW = ProviderPackage.SERVICE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>W1w2 w1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__W1W2_W1 = ProviderPackage.SERVICE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>W1w2 w2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE__W1W2_W2 = ProviderPackage.SERVICE_FEATURE_COUNT + 40;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 41;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_SERVICE_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider
	 * @generated
	 */
	EClass getWeatherProvider();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getCurrentWeather <em>Current Weather</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Weather</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getCurrentWeather()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_CurrentWeather();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast3H <em>Forecast3 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast3 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast3H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast3H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast6H <em>Forecast6 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast6 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast6H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast6H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast9H <em>Forecast9 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast9 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast9H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast9H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast12H <em>Forecast12 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast12 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast12H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast12H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast15H <em>Forecast15 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast15 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast15H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast15H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast18H <em>Forecast18 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast18 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast18H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast18H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast21H <em>Forecast21 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast21 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast21H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast21H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast24H <em>Forecast24 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast24 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast24H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast24H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast27H <em>Forecast27 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast27 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast27H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast27H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast30H <em>Forecast30 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast30 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast30H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast30H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast33H <em>Forecast33 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast33 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast33H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast33H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast36H <em>Forecast36 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast36 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast36H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast36H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast39H <em>Forecast39 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast39 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast39H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast39H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast42H <em>Forecast42 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast42 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast42H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast42H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast45H <em>Forecast45 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast45 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast45H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast45H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast48H <em>Forecast48 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast48 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast48H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast48H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast51H <em>Forecast51 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast51 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast51H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast51H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast54H <em>Forecast54 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast54 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast54H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast54H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast57H <em>Forecast57 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast57 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast57H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast57H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast60H <em>Forecast60 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast60 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast60H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast60H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast63H <em>Forecast63 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast63 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast63H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast63H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast66H <em>Forecast66 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast66 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast66H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast66H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast69H <em>Forecast69 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast69 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast69H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast69H();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast72H <em>Forecast72 H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forecast72 H</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getForecast72H()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Forecast72H();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService
	 * @generated
	 */
	EClass getWeatherService();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getForecastedWeatherTime <em>Forecasted Weather Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forecasted Weather Time</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getForecastedWeatherTime()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_ForecastedWeatherTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindDirection <em>Wind Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Direction</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindDirection()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_WindDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindSpeed <em>Wind Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Speed</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindSpeed()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_WindSpeed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindGustLastHour <em>Wind Gust Last Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Gust Last Hour</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindGustLastHour()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_WindGustLastHour();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindGustLastThreeHours <em>Wind Gust Last Three Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Gust Last Three Hours</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindGustLastThreeHours()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_WindGustLastThreeHours();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindGustMaxLast12Hours <em>Wind Gust Max Last12 Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Gust Max Last12 Hours</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindGustMaxLast12Hours()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_WindGustMaxLast12Hours();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindGustProb25 <em>Wind Gust Prob25</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Gust Prob25</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindGustProb25()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_WindGustProb25();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindGustProb40 <em>Wind Gust Prob40</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Gust Prob40</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindGustProb40()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_WindGustProb40();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindGustProb55 <em>Wind Gust Prob55</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Gust Prob55</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWindGustProb55()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_WindGustProb55();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getCloudCoverTotal <em>Cloud Cover Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Cover Total</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getCloudCoverTotal()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_CloudCoverTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getCloudCoverBelow500 <em>Cloud Cover Below500</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Cover Below500</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getCloudCoverBelow500()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_CloudCoverBelow500();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getCloudCoverEffective <em>Cloud Cover Effective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Cover Effective</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getCloudCoverEffective()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_CloudCoverEffective();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getCloudCoverHigh <em>Cloud Cover High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Cover High</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getCloudCoverHigh()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_CloudCoverHigh();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getCloudCoverMid <em>Cloud Cover Mid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Cover Mid</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getCloudCoverMid()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_CloudCoverMid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getCloudCoverLow <em>Cloud Cover Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Cover Low</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getCloudCoverLow()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_CloudCoverLow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger02Last6 <em>Precipitation Larger02 Last6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger02 Last6</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger02Last6()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_PrecipitationLarger02Last6();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger50Last6 <em>Precipitation Larger50 Last6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger50 Last6</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger50Last6()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_PrecipitationLarger50Last6();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger02LastDay <em>Precipitation Larger02 Last Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger02 Last Day</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger02LastDay()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_PrecipitationLarger02LastDay();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger50LastDay <em>Precipitation Larger50 Last Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger50 Last Day</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger50LastDay()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_PrecipitationLarger50LastDay();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger00Last12 <em>Precipitation Larger00 Last12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger00 Last12</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger00Last12()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_PrecipitationLarger00Last12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger02Last12 <em>Precipitation Larger02 Last12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger02 Last12</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger02Last12()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_PrecipitationLarger02Last12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger10Last12 <em>Precipitation Larger10 Last12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger10 Last12</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger10Last12()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_PrecipitationLarger10Last12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger50Last12 <em>Precipitation Larger50 Last12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger50 Last12</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationLarger50Last12()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_PrecipitationLarger50Last12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationSignificantWeatherTotal <em>Precipitation Significant Weather Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Significant Weather Total</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationSignificantWeatherTotal()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_PrecipitationSignificantWeatherTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationSignificantWeatherLast3 <em>Precipitation Significant Weather Last3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Significant Weather Last3</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getPrecipitationSignificantWeatherLast3()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_PrecipitationSignificantWeatherLast3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getTempAboveSurface5 <em>Temp Above Surface5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Above Surface5</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getTempAboveSurface5()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_TempAboveSurface5();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getTempAboveSurface200 <em>Temp Above Surface200</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Above Surface200</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getTempAboveSurface200()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_TempAboveSurface200();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getTempDewpointAboveSurface200 <em>Temp Dewpoint Above Surface200</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Dewpoint Above Surface200</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getTempDewpointAboveSurface200()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_TempDewpointAboveSurface200();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getTempMinLast12 <em>Temp Min Last12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Min Last12</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getTempMinLast12()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_TempMinLast12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getTempMaxLast12 <em>Temp Max Last12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Max Last12</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getTempMaxLast12()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_TempMaxLast12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getFogPropLast1 <em>Fog Prop Last1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fog Prop Last1</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getFogPropLast1()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_FogPropLast1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getFogPropLast6 <em>Fog Prop Last6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fog Prop Last6</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getFogPropLast6()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_FogPropLast6();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getFogPropLast12 <em>Fog Prop Last12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fog Prop Last12</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getFogPropLast12()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_FogPropLast12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getSnowRainEqLast1 <em>Snow Rain Eq Last1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snow Rain Eq Last1</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getSnowRainEqLast1()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_SnowRainEqLast1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getSnowRainEqLast3 <em>Snow Rain Eq Last3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snow Rain Eq Last3</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getSnowRainEqLast3()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_SnowRainEqLast3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getVisibility()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getSurfacePressure <em>Surface Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface Pressure</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getSurfacePressure()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_SurfacePressure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getIrRadianceGlobal <em>Ir Radiance Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ir Radiance Global</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getIrRadianceGlobal()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_IrRadianceGlobal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWw <em>Ww</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ww</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getWw()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_Ww();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getW1w2_w1 <em>W1w2 w1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W1w2 w1</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getW1w2_w1()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_W1w2_w1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getW1w2_w2 <em>W1w2 w2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W1w2 w2</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherService#getW1w2_w2()
	 * @see #getWeatherService()
	 * @generated
	 */
	EAttribute getWeatherService_W1w2_w2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WeatherFactory getWeatherFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherProviderImpl
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getWeatherProvider()
		 * @generated
		 */
		EClass WEATHER_PROVIDER = eINSTANCE.getWeatherProvider();

		/**
		 * The meta object literal for the '<em><b>Current Weather</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__CURRENT_WEATHER = eINSTANCE.getWeatherProvider_CurrentWeather();

		/**
		 * The meta object literal for the '<em><b>Forecast3 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST3_H = eINSTANCE.getWeatherProvider_Forecast3H();

		/**
		 * The meta object literal for the '<em><b>Forecast6 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST6_H = eINSTANCE.getWeatherProvider_Forecast6H();

		/**
		 * The meta object literal for the '<em><b>Forecast9 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST9_H = eINSTANCE.getWeatherProvider_Forecast9H();

		/**
		 * The meta object literal for the '<em><b>Forecast12 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST12_H = eINSTANCE.getWeatherProvider_Forecast12H();

		/**
		 * The meta object literal for the '<em><b>Forecast15 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST15_H = eINSTANCE.getWeatherProvider_Forecast15H();

		/**
		 * The meta object literal for the '<em><b>Forecast18 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST18_H = eINSTANCE.getWeatherProvider_Forecast18H();

		/**
		 * The meta object literal for the '<em><b>Forecast21 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST21_H = eINSTANCE.getWeatherProvider_Forecast21H();

		/**
		 * The meta object literal for the '<em><b>Forecast24 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST24_H = eINSTANCE.getWeatherProvider_Forecast24H();

		/**
		 * The meta object literal for the '<em><b>Forecast27 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST27_H = eINSTANCE.getWeatherProvider_Forecast27H();

		/**
		 * The meta object literal for the '<em><b>Forecast30 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST30_H = eINSTANCE.getWeatherProvider_Forecast30H();

		/**
		 * The meta object literal for the '<em><b>Forecast33 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST33_H = eINSTANCE.getWeatherProvider_Forecast33H();

		/**
		 * The meta object literal for the '<em><b>Forecast36 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST36_H = eINSTANCE.getWeatherProvider_Forecast36H();

		/**
		 * The meta object literal for the '<em><b>Forecast39 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST39_H = eINSTANCE.getWeatherProvider_Forecast39H();

		/**
		 * The meta object literal for the '<em><b>Forecast42 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST42_H = eINSTANCE.getWeatherProvider_Forecast42H();

		/**
		 * The meta object literal for the '<em><b>Forecast45 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST45_H = eINSTANCE.getWeatherProvider_Forecast45H();

		/**
		 * The meta object literal for the '<em><b>Forecast48 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST48_H = eINSTANCE.getWeatherProvider_Forecast48H();

		/**
		 * The meta object literal for the '<em><b>Forecast51 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST51_H = eINSTANCE.getWeatherProvider_Forecast51H();

		/**
		 * The meta object literal for the '<em><b>Forecast54 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST54_H = eINSTANCE.getWeatherProvider_Forecast54H();

		/**
		 * The meta object literal for the '<em><b>Forecast57 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST57_H = eINSTANCE.getWeatherProvider_Forecast57H();

		/**
		 * The meta object literal for the '<em><b>Forecast60 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST60_H = eINSTANCE.getWeatherProvider_Forecast60H();

		/**
		 * The meta object literal for the '<em><b>Forecast63 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST63_H = eINSTANCE.getWeatherProvider_Forecast63H();

		/**
		 * The meta object literal for the '<em><b>Forecast66 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST66_H = eINSTANCE.getWeatherProvider_Forecast66H();

		/**
		 * The meta object literal for the '<em><b>Forecast69 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST69_H = eINSTANCE.getWeatherProvider_Forecast69H();

		/**
		 * The meta object literal for the '<em><b>Forecast72 H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FORECAST72_H = eINSTANCE.getWeatherProvider_Forecast72H();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherServiceImpl
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getWeatherService()
		 * @generated
		 */
		EClass WEATHER_SERVICE = eINSTANCE.getWeatherService();

		/**
		 * The meta object literal for the '<em><b>Forecasted Weather Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__FORECASTED_WEATHER_TIME = eINSTANCE.getWeatherService_ForecastedWeatherTime();

		/**
		 * The meta object literal for the '<em><b>Wind Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__WIND_DIRECTION = eINSTANCE.getWeatherService_WindDirection();

		/**
		 * The meta object literal for the '<em><b>Wind Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__WIND_SPEED = eINSTANCE.getWeatherService_WindSpeed();

		/**
		 * The meta object literal for the '<em><b>Wind Gust Last Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__WIND_GUST_LAST_HOUR = eINSTANCE.getWeatherService_WindGustLastHour();

		/**
		 * The meta object literal for the '<em><b>Wind Gust Last Three Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__WIND_GUST_LAST_THREE_HOURS = eINSTANCE.getWeatherService_WindGustLastThreeHours();

		/**
		 * The meta object literal for the '<em><b>Wind Gust Max Last12 Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__WIND_GUST_MAX_LAST12_HOURS = eINSTANCE.getWeatherService_WindGustMaxLast12Hours();

		/**
		 * The meta object literal for the '<em><b>Wind Gust Prob25</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__WIND_GUST_PROB25 = eINSTANCE.getWeatherService_WindGustProb25();

		/**
		 * The meta object literal for the '<em><b>Wind Gust Prob40</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__WIND_GUST_PROB40 = eINSTANCE.getWeatherService_WindGustProb40();

		/**
		 * The meta object literal for the '<em><b>Wind Gust Prob55</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__WIND_GUST_PROB55 = eINSTANCE.getWeatherService_WindGustProb55();

		/**
		 * The meta object literal for the '<em><b>Cloud Cover Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__CLOUD_COVER_TOTAL = eINSTANCE.getWeatherService_CloudCoverTotal();

		/**
		 * The meta object literal for the '<em><b>Cloud Cover Below500</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__CLOUD_COVER_BELOW500 = eINSTANCE.getWeatherService_CloudCoverBelow500();

		/**
		 * The meta object literal for the '<em><b>Cloud Cover Effective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__CLOUD_COVER_EFFECTIVE = eINSTANCE.getWeatherService_CloudCoverEffective();

		/**
		 * The meta object literal for the '<em><b>Cloud Cover High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__CLOUD_COVER_HIGH = eINSTANCE.getWeatherService_CloudCoverHigh();

		/**
		 * The meta object literal for the '<em><b>Cloud Cover Mid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__CLOUD_COVER_MID = eINSTANCE.getWeatherService_CloudCoverMid();

		/**
		 * The meta object literal for the '<em><b>Cloud Cover Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__CLOUD_COVER_LOW = eINSTANCE.getWeatherService_CloudCoverLow();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger02 Last6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__PRECIPITATION_LARGER02_LAST6 = eINSTANCE.getWeatherService_PrecipitationLarger02Last6();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger50 Last6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__PRECIPITATION_LARGER50_LAST6 = eINSTANCE.getWeatherService_PrecipitationLarger50Last6();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger02 Last Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__PRECIPITATION_LARGER02_LAST_DAY = eINSTANCE.getWeatherService_PrecipitationLarger02LastDay();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger50 Last Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__PRECIPITATION_LARGER50_LAST_DAY = eINSTANCE.getWeatherService_PrecipitationLarger50LastDay();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger00 Last12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__PRECIPITATION_LARGER00_LAST12 = eINSTANCE.getWeatherService_PrecipitationLarger00Last12();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger02 Last12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__PRECIPITATION_LARGER02_LAST12 = eINSTANCE.getWeatherService_PrecipitationLarger02Last12();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger10 Last12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__PRECIPITATION_LARGER10_LAST12 = eINSTANCE.getWeatherService_PrecipitationLarger10Last12();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger50 Last12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__PRECIPITATION_LARGER50_LAST12 = eINSTANCE.getWeatherService_PrecipitationLarger50Last12();

		/**
		 * The meta object literal for the '<em><b>Precipitation Significant Weather Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL = eINSTANCE.getWeatherService_PrecipitationSignificantWeatherTotal();

		/**
		 * The meta object literal for the '<em><b>Precipitation Significant Weather Last3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__PRECIPITATION_SIGNIFICANT_WEATHER_LAST3 = eINSTANCE.getWeatherService_PrecipitationSignificantWeatherLast3();

		/**
		 * The meta object literal for the '<em><b>Temp Above Surface5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__TEMP_ABOVE_SURFACE5 = eINSTANCE.getWeatherService_TempAboveSurface5();

		/**
		 * The meta object literal for the '<em><b>Temp Above Surface200</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__TEMP_ABOVE_SURFACE200 = eINSTANCE.getWeatherService_TempAboveSurface200();

		/**
		 * The meta object literal for the '<em><b>Temp Dewpoint Above Surface200</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__TEMP_DEWPOINT_ABOVE_SURFACE200 = eINSTANCE.getWeatherService_TempDewpointAboveSurface200();

		/**
		 * The meta object literal for the '<em><b>Temp Min Last12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__TEMP_MIN_LAST12 = eINSTANCE.getWeatherService_TempMinLast12();

		/**
		 * The meta object literal for the '<em><b>Temp Max Last12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__TEMP_MAX_LAST12 = eINSTANCE.getWeatherService_TempMaxLast12();

		/**
		 * The meta object literal for the '<em><b>Fog Prop Last1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__FOG_PROP_LAST1 = eINSTANCE.getWeatherService_FogPropLast1();

		/**
		 * The meta object literal for the '<em><b>Fog Prop Last6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__FOG_PROP_LAST6 = eINSTANCE.getWeatherService_FogPropLast6();

		/**
		 * The meta object literal for the '<em><b>Fog Prop Last12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__FOG_PROP_LAST12 = eINSTANCE.getWeatherService_FogPropLast12();

		/**
		 * The meta object literal for the '<em><b>Snow Rain Eq Last1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__SNOW_RAIN_EQ_LAST1 = eINSTANCE.getWeatherService_SnowRainEqLast1();

		/**
		 * The meta object literal for the '<em><b>Snow Rain Eq Last3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__SNOW_RAIN_EQ_LAST3 = eINSTANCE.getWeatherService_SnowRainEqLast3();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__VISIBILITY = eINSTANCE.getWeatherService_Visibility();

		/**
		 * The meta object literal for the '<em><b>Surface Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__SURFACE_PRESSURE = eINSTANCE.getWeatherService_SurfacePressure();

		/**
		 * The meta object literal for the '<em><b>Ir Radiance Global</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__IR_RADIANCE_GLOBAL = eINSTANCE.getWeatherService_IrRadianceGlobal();

		/**
		 * The meta object literal for the '<em><b>Ww</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__WW = eINSTANCE.getWeatherService_Ww();

		/**
		 * The meta object literal for the '<em><b>W1w2 w1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__W1W2_W1 = eINSTANCE.getWeatherService_W1w2_w1();

		/**
		 * The meta object literal for the '<em><b>W1w2 w2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_SERVICE__W1W2_W2 = eINSTANCE.getWeatherService_W1w2_w2();

	}

} //WeatherPackage
