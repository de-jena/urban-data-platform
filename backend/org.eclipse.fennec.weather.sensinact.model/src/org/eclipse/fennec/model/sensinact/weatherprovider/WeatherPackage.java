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
	int WEATHER_PROVIDER__ID = ProviderPackage.DYNAMIC_PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__ADMIN = ProviderPackage.DYNAMIC_PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__LINKED_PROVIDERS = ProviderPackage.DYNAMIC_PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__SERVICES = ProviderPackage.DYNAMIC_PROVIDER__SERVICES;

	/**
	 * The feature id for the '<em><b>Wind Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__WIND_DATA = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cloud Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__CLOUD_DATA = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precipitation Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__PRECIPITATION_DATA = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Temperature Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__TEMPERATURE_DATA = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fog Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__FOG_DATA = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Snow Rain Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__SNOW_RAIN_DATA = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Visibility Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__VISIBILITY_DATA = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pressure Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__PRESSURE_DATA = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Irradiance Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__IRRADIANCE_DATA = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER_FEATURE_COUNT = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER___GET_SERVICE__STRING = ProviderPackage.DYNAMIC_PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER___GET_SERVICE_ECLASS__STRING = ProviderPackage.DYNAMIC_PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER_OPERATION_COUNT = ProviderPackage.DYNAMIC_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WindDataImpl <em>Wind Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WindDataImpl
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getWindData()
	 * @generated
	 */
	int WIND_DATA = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_DATA__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Wind Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_DATA__WIND_DIRECTION = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_DATA__WIND_SPEED = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wind Gust Last Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_DATA__WIND_GUST_LAST_HOUR = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wind Gust Last Three Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_DATA__WIND_GUST_LAST_THREE_HOURS = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Wind Gust Max Last12 Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_DATA__WIND_GUST_MAX_LAST12_HOURS = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Wind Gust Prob25</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_DATA__WIND_GUST_PROB25 = ProviderPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Wind Gust Prob40</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_DATA__WIND_GUST_PROB40 = ProviderPackage.SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Wind Gust Prob55</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_DATA__WIND_GUST_PROB55 = ProviderPackage.SERVICE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Wind Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_DATA_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_DATA___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Wind Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_DATA_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.CloudDataImpl <em>Cloud Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.CloudDataImpl
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getCloudData()
	 * @generated
	 */
	int CLOUD_DATA = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DATA__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Cloud Cover Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DATA__CLOUD_COVER_TOTAL = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cloud Cover Below500</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DATA__CLOUD_COVER_BELOW500 = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cloud Cover Effective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DATA__CLOUD_COVER_EFFECTIVE = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cloud Cover High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DATA__CLOUD_COVER_HIGH = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cloud Cover Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DATA__CLOUD_COVER_MID = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cloud Cover Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DATA__CLOUD_COVER_LOW = ProviderPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Cloud Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DATA_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DATA___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Cloud Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DATA_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.PrecipitationDataImpl <em>Precipitation Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.PrecipitationDataImpl
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getPrecipitationData()
	 * @generated
	 */
	int PRECIPITATION_DATA = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_DATA__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Precipitation Larger02 Last6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST6 = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precipitation Larger50 Last6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST6 = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precipitation Larger02 Last Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST_DAY = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Precipitation Larger50 Last Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST_DAY = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Precipitation Larger00 Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_DATA__PRECIPITATION_LARGER00_LAST12 = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Precipitation Larger02 Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST12 = ProviderPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Precipitation Larger10 Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_DATA__PRECIPITATION_LARGER10_LAST12 = ProviderPackage.SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Precipitation Larger50 Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST12 = ProviderPackage.SERVICE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Precipitation Significant Weather Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL = ProviderPackage.SERVICE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Precipitation Significant Weather Last3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_LAST3 = ProviderPackage.SERVICE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Precipitation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_DATA_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_DATA___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Precipitation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_DATA_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.TemperatureDataImpl <em>Temperature Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.TemperatureDataImpl
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getTemperatureData()
	 * @generated
	 */
	int TEMPERATURE_DATA = 4;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_DATA__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Temp Above Surface5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_DATA__TEMP_ABOVE_SURFACE5 = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temp Above Surface200</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_DATA__TEMP_ABOVE_SURFACE200 = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temp Dewpoint Above Surface200</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_DATA__TEMP_DEWPOINT_ABOVE_SURFACE200 = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Temp Min Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_DATA__TEMP_MIN_LAST12 = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Temp Max Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_DATA__TEMP_MAX_LAST12 = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Temperature Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_DATA_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_DATA___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Temperature Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_DATA_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.FogDataImpl <em>Fog Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.FogDataImpl
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getFogData()
	 * @generated
	 */
	int FOG_DATA = 5;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_DATA__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Fog Prop Last1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_DATA__FOG_PROP_LAST1 = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fog Prop Last6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_DATA__FOG_PROP_LAST6 = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fog Prop Last12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_DATA__FOG_PROP_LAST12 = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fog Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_DATA_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_DATA___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Fog Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_DATA_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.SnowRainDataImpl <em>Snow Rain Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.SnowRainDataImpl
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getSnowRainData()
	 * @generated
	 */
	int SNOW_RAIN_DATA = 6;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNOW_RAIN_DATA__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Snow Rain Eq Last1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST1 = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Snow Rain Eq Last3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST3 = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Snow Rain Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNOW_RAIN_DATA_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNOW_RAIN_DATA___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Snow Rain Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNOW_RAIN_DATA_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.VisibilityDataImpl <em>Visibility Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.VisibilityDataImpl
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getVisibilityData()
	 * @generated
	 */
	int VISIBILITY_DATA = 7;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_DATA__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_DATA__VISIBILITY = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visibility Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_DATA_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_DATA___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Visibility Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_DATA_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.PressureDataImpl <em>Pressure Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.PressureDataImpl
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getPressureData()
	 * @generated
	 */
	int PRESSURE_DATA = 8;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_DATA__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Surface Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_DATA__SURFACE_PRESSURE = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pressure Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_DATA_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_DATA___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Pressure Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_DATA_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.IrradianceDataImpl <em>Irradiance Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.IrradianceDataImpl
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getIrradianceData()
	 * @generated
	 */
	int IRRADIANCE_DATA = 9;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRRADIANCE_DATA__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Ir Radiance Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRRADIANCE_DATA__IR_RADIANCE_GLOBAL = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Irradiance Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRRADIANCE_DATA_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRRADIANCE_DATA___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Irradiance Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRRADIANCE_DATA_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherAdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherAdminImpl
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getWeatherAdmin()
	 * @generated
	 */
	int WEATHER_ADMIN = 10;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_ADMIN__METADATA = ProviderPackage.ADMIN__METADATA;

	/**
	 * The feature id for the '<em><b>Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_ADMIN__FRIENDLY_NAME = ProviderPackage.ADMIN__FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_ADMIN__LOCATION = ProviderPackage.ADMIN__LOCATION;

	/**
	 * The feature id for the '<em><b>Model Package Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_ADMIN__MODEL_PACKAGE_URI = ProviderPackage.ADMIN__MODEL_PACKAGE_URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_ADMIN__MODEL = ProviderPackage.ADMIN__MODEL;

	/**
	 * The feature id for the '<em><b>Weather Station Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_ADMIN__WEATHER_STATION_ID = ProviderPackage.ADMIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weather Station Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_ADMIN__WEATHER_STATION_NAME = ProviderPackage.ADMIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_ADMIN_FEATURE_COUNT = ProviderPackage.ADMIN_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_ADMIN___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.ADMIN___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_ADMIN_OPERATION_COUNT = ProviderPackage.ADMIN_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getWindData <em>Wind Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wind Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getWindData()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_WindData();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getCloudData <em>Cloud Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cloud Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getCloudData()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_CloudData();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getPrecipitationData <em>Precipitation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precipitation Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getPrecipitationData()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_PrecipitationData();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getTemperatureData <em>Temperature Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Temperature Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getTemperatureData()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_TemperatureData();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getFogData <em>Fog Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fog Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getFogData()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_FogData();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getSnowRainData <em>Snow Rain Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Snow Rain Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getSnowRainData()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_SnowRainData();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getVisibilityData <em>Visibility Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visibility Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getVisibilityData()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_VisibilityData();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getPressureData <em>Pressure Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pressure Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getPressureData()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_PressureData();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getIrradianceData <em>Irradiance Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Irradiance Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getIrradianceData()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_IrradianceData();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData <em>Wind Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wind Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WindData
	 * @generated
	 */
	EClass getWindData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindDirection <em>Wind Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Direction</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindDirection()
	 * @see #getWindData()
	 * @generated
	 */
	EAttribute getWindData_WindDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindSpeed <em>Wind Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Speed</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindSpeed()
	 * @see #getWindData()
	 * @generated
	 */
	EAttribute getWindData_WindSpeed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustLastHour <em>Wind Gust Last Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Gust Last Hour</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustLastHour()
	 * @see #getWindData()
	 * @generated
	 */
	EAttribute getWindData_WindGustLastHour();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustLastThreeHours <em>Wind Gust Last Three Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Gust Last Three Hours</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustLastThreeHours()
	 * @see #getWindData()
	 * @generated
	 */
	EAttribute getWindData_WindGustLastThreeHours();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustMaxLast12Hours <em>Wind Gust Max Last12 Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Gust Max Last12 Hours</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustMaxLast12Hours()
	 * @see #getWindData()
	 * @generated
	 */
	EAttribute getWindData_WindGustMaxLast12Hours();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustProb25 <em>Wind Gust Prob25</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Gust Prob25</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustProb25()
	 * @see #getWindData()
	 * @generated
	 */
	EAttribute getWindData_WindGustProb25();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustProb40 <em>Wind Gust Prob40</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Gust Prob40</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustProb40()
	 * @see #getWindData()
	 * @generated
	 */
	EAttribute getWindData_WindGustProb40();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustProb55 <em>Wind Gust Prob55</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Gust Prob55</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WindData#getWindGustProb55()
	 * @see #getWindData()
	 * @generated
	 */
	EAttribute getWindData_WindGustProb55();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData <em>Cloud Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.CloudData
	 * @generated
	 */
	EClass getCloudData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverTotal <em>Cloud Cover Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Cover Total</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverTotal()
	 * @see #getCloudData()
	 * @generated
	 */
	EAttribute getCloudData_CloudCoverTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverBelow500 <em>Cloud Cover Below500</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Cover Below500</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverBelow500()
	 * @see #getCloudData()
	 * @generated
	 */
	EAttribute getCloudData_CloudCoverBelow500();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverEffective <em>Cloud Cover Effective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Cover Effective</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverEffective()
	 * @see #getCloudData()
	 * @generated
	 */
	EAttribute getCloudData_CloudCoverEffective();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverHigh <em>Cloud Cover High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Cover High</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverHigh()
	 * @see #getCloudData()
	 * @generated
	 */
	EAttribute getCloudData_CloudCoverHigh();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverMid <em>Cloud Cover Mid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Cover Mid</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverMid()
	 * @see #getCloudData()
	 * @generated
	 */
	EAttribute getCloudData_CloudCoverMid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverLow <em>Cloud Cover Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Cover Low</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.CloudData#getCloudCoverLow()
	 * @see #getCloudData()
	 * @generated
	 */
	EAttribute getCloudData_CloudCoverLow();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData <em>Precipitation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precipitation Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData
	 * @generated
	 */
	EClass getPrecipitationData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger02Last6 <em>Precipitation Larger02 Last6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger02 Last6</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger02Last6()
	 * @see #getPrecipitationData()
	 * @generated
	 */
	EAttribute getPrecipitationData_PrecipitationLarger02Last6();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger50Last6 <em>Precipitation Larger50 Last6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger50 Last6</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger50Last6()
	 * @see #getPrecipitationData()
	 * @generated
	 */
	EAttribute getPrecipitationData_PrecipitationLarger50Last6();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger02LastDay <em>Precipitation Larger02 Last Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger02 Last Day</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger02LastDay()
	 * @see #getPrecipitationData()
	 * @generated
	 */
	EAttribute getPrecipitationData_PrecipitationLarger02LastDay();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger50LastDay <em>Precipitation Larger50 Last Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger50 Last Day</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger50LastDay()
	 * @see #getPrecipitationData()
	 * @generated
	 */
	EAttribute getPrecipitationData_PrecipitationLarger50LastDay();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger00Last12 <em>Precipitation Larger00 Last12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger00 Last12</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger00Last12()
	 * @see #getPrecipitationData()
	 * @generated
	 */
	EAttribute getPrecipitationData_PrecipitationLarger00Last12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger02Last12 <em>Precipitation Larger02 Last12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger02 Last12</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger02Last12()
	 * @see #getPrecipitationData()
	 * @generated
	 */
	EAttribute getPrecipitationData_PrecipitationLarger02Last12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger10Last12 <em>Precipitation Larger10 Last12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger10 Last12</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger10Last12()
	 * @see #getPrecipitationData()
	 * @generated
	 */
	EAttribute getPrecipitationData_PrecipitationLarger10Last12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger50Last12 <em>Precipitation Larger50 Last12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Larger50 Last12</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationLarger50Last12()
	 * @see #getPrecipitationData()
	 * @generated
	 */
	EAttribute getPrecipitationData_PrecipitationLarger50Last12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationSignificantWeatherTotal <em>Precipitation Significant Weather Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Significant Weather Total</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationSignificantWeatherTotal()
	 * @see #getPrecipitationData()
	 * @generated
	 */
	EAttribute getPrecipitationData_PrecipitationSignificantWeatherTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationSignificantWeatherLast3 <em>Precipitation Significant Weather Last3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precipitation Significant Weather Last3</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.PrecipitationData#getPrecipitationSignificantWeatherLast3()
	 * @see #getPrecipitationData()
	 * @generated
	 */
	EAttribute getPrecipitationData_PrecipitationSignificantWeatherLast3();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData <em>Temperature Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData
	 * @generated
	 */
	EClass getTemperatureData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempAboveSurface5 <em>Temp Above Surface5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Above Surface5</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempAboveSurface5()
	 * @see #getTemperatureData()
	 * @generated
	 */
	EAttribute getTemperatureData_TempAboveSurface5();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempAboveSurface200 <em>Temp Above Surface200</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Above Surface200</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempAboveSurface200()
	 * @see #getTemperatureData()
	 * @generated
	 */
	EAttribute getTemperatureData_TempAboveSurface200();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempDewpointAboveSurface200 <em>Temp Dewpoint Above Surface200</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Dewpoint Above Surface200</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempDewpointAboveSurface200()
	 * @see #getTemperatureData()
	 * @generated
	 */
	EAttribute getTemperatureData_TempDewpointAboveSurface200();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempMinLast12 <em>Temp Min Last12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Min Last12</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempMinLast12()
	 * @see #getTemperatureData()
	 * @generated
	 */
	EAttribute getTemperatureData_TempMinLast12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempMaxLast12 <em>Temp Max Last12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Max Last12</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData#getTempMaxLast12()
	 * @see #getTemperatureData()
	 * @generated
	 */
	EAttribute getTemperatureData_TempMaxLast12();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.sensinact.weatherprovider.FogData <em>Fog Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fog Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.FogData
	 * @generated
	 */
	EClass getFogData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.FogData#getFogPropLast1 <em>Fog Prop Last1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fog Prop Last1</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.FogData#getFogPropLast1()
	 * @see #getFogData()
	 * @generated
	 */
	EAttribute getFogData_FogPropLast1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.FogData#getFogPropLast6 <em>Fog Prop Last6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fog Prop Last6</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.FogData#getFogPropLast6()
	 * @see #getFogData()
	 * @generated
	 */
	EAttribute getFogData_FogPropLast6();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.FogData#getFogPropLast12 <em>Fog Prop Last12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fog Prop Last12</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.FogData#getFogPropLast12()
	 * @see #getFogData()
	 * @generated
	 */
	EAttribute getFogData_FogPropLast12();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.sensinact.weatherprovider.SnowRainData <em>Snow Rain Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snow Rain Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.SnowRainData
	 * @generated
	 */
	EClass getSnowRainData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.SnowRainData#getSnowRainEqLast1 <em>Snow Rain Eq Last1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snow Rain Eq Last1</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.SnowRainData#getSnowRainEqLast1()
	 * @see #getSnowRainData()
	 * @generated
	 */
	EAttribute getSnowRainData_SnowRainEqLast1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.SnowRainData#getSnowRainEqLast3 <em>Snow Rain Eq Last3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snow Rain Eq Last3</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.SnowRainData#getSnowRainEqLast3()
	 * @see #getSnowRainData()
	 * @generated
	 */
	EAttribute getSnowRainData_SnowRainEqLast3();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.sensinact.weatherprovider.VisibilityData <em>Visibility Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.VisibilityData
	 * @generated
	 */
	EClass getVisibilityData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.VisibilityData#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.VisibilityData#getVisibility()
	 * @see #getVisibilityData()
	 * @generated
	 */
	EAttribute getVisibilityData_Visibility();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PressureData <em>Pressure Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.PressureData
	 * @generated
	 */
	EClass getPressureData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.PressureData#getSurfacePressure <em>Surface Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface Pressure</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.PressureData#getSurfacePressure()
	 * @see #getPressureData()
	 * @generated
	 */
	EAttribute getPressureData_SurfacePressure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.sensinact.weatherprovider.IrradianceData <em>Irradiance Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Irradiance Data</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.IrradianceData
	 * @generated
	 */
	EClass getIrradianceData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.IrradianceData#getIrRadianceGlobal <em>Ir Radiance Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ir Radiance Global</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.IrradianceData#getIrRadianceGlobal()
	 * @see #getIrradianceData()
	 * @generated
	 */
	EAttribute getIrradianceData_IrRadianceGlobal();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherAdmin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherAdmin
	 * @generated
	 */
	EClass getWeatherAdmin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherAdmin#getWeatherStationId <em>Weather Station Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weather Station Id</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherAdmin#getWeatherStationId()
	 * @see #getWeatherAdmin()
	 * @generated
	 */
	EAttribute getWeatherAdmin_WeatherStationId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherAdmin#getWeatherStationName <em>Weather Station Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weather Station Name</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherAdmin#getWeatherStationName()
	 * @see #getWeatherAdmin()
	 * @generated
	 */
	EAttribute getWeatherAdmin_WeatherStationName();

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
		 * The meta object literal for the '<em><b>Wind Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__WIND_DATA = eINSTANCE.getWeatherProvider_WindData();

		/**
		 * The meta object literal for the '<em><b>Cloud Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__CLOUD_DATA = eINSTANCE.getWeatherProvider_CloudData();

		/**
		 * The meta object literal for the '<em><b>Precipitation Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__PRECIPITATION_DATA = eINSTANCE.getWeatherProvider_PrecipitationData();

		/**
		 * The meta object literal for the '<em><b>Temperature Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__TEMPERATURE_DATA = eINSTANCE.getWeatherProvider_TemperatureData();

		/**
		 * The meta object literal for the '<em><b>Fog Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__FOG_DATA = eINSTANCE.getWeatherProvider_FogData();

		/**
		 * The meta object literal for the '<em><b>Snow Rain Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__SNOW_RAIN_DATA = eINSTANCE.getWeatherProvider_SnowRainData();

		/**
		 * The meta object literal for the '<em><b>Visibility Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__VISIBILITY_DATA = eINSTANCE.getWeatherProvider_VisibilityData();

		/**
		 * The meta object literal for the '<em><b>Pressure Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__PRESSURE_DATA = eINSTANCE.getWeatherProvider_PressureData();

		/**
		 * The meta object literal for the '<em><b>Irradiance Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__IRRADIANCE_DATA = eINSTANCE.getWeatherProvider_IrradianceData();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WindDataImpl <em>Wind Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WindDataImpl
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getWindData()
		 * @generated
		 */
		EClass WIND_DATA = eINSTANCE.getWindData();

		/**
		 * The meta object literal for the '<em><b>Wind Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIND_DATA__WIND_DIRECTION = eINSTANCE.getWindData_WindDirection();

		/**
		 * The meta object literal for the '<em><b>Wind Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIND_DATA__WIND_SPEED = eINSTANCE.getWindData_WindSpeed();

		/**
		 * The meta object literal for the '<em><b>Wind Gust Last Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIND_DATA__WIND_GUST_LAST_HOUR = eINSTANCE.getWindData_WindGustLastHour();

		/**
		 * The meta object literal for the '<em><b>Wind Gust Last Three Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIND_DATA__WIND_GUST_LAST_THREE_HOURS = eINSTANCE.getWindData_WindGustLastThreeHours();

		/**
		 * The meta object literal for the '<em><b>Wind Gust Max Last12 Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIND_DATA__WIND_GUST_MAX_LAST12_HOURS = eINSTANCE.getWindData_WindGustMaxLast12Hours();

		/**
		 * The meta object literal for the '<em><b>Wind Gust Prob25</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIND_DATA__WIND_GUST_PROB25 = eINSTANCE.getWindData_WindGustProb25();

		/**
		 * The meta object literal for the '<em><b>Wind Gust Prob40</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIND_DATA__WIND_GUST_PROB40 = eINSTANCE.getWindData_WindGustProb40();

		/**
		 * The meta object literal for the '<em><b>Wind Gust Prob55</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIND_DATA__WIND_GUST_PROB55 = eINSTANCE.getWindData_WindGustProb55();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.CloudDataImpl <em>Cloud Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.CloudDataImpl
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getCloudData()
		 * @generated
		 */
		EClass CLOUD_DATA = eINSTANCE.getCloudData();

		/**
		 * The meta object literal for the '<em><b>Cloud Cover Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_DATA__CLOUD_COVER_TOTAL = eINSTANCE.getCloudData_CloudCoverTotal();

		/**
		 * The meta object literal for the '<em><b>Cloud Cover Below500</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_DATA__CLOUD_COVER_BELOW500 = eINSTANCE.getCloudData_CloudCoverBelow500();

		/**
		 * The meta object literal for the '<em><b>Cloud Cover Effective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_DATA__CLOUD_COVER_EFFECTIVE = eINSTANCE.getCloudData_CloudCoverEffective();

		/**
		 * The meta object literal for the '<em><b>Cloud Cover High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_DATA__CLOUD_COVER_HIGH = eINSTANCE.getCloudData_CloudCoverHigh();

		/**
		 * The meta object literal for the '<em><b>Cloud Cover Mid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_DATA__CLOUD_COVER_MID = eINSTANCE.getCloudData_CloudCoverMid();

		/**
		 * The meta object literal for the '<em><b>Cloud Cover Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_DATA__CLOUD_COVER_LOW = eINSTANCE.getCloudData_CloudCoverLow();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.PrecipitationDataImpl <em>Precipitation Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.PrecipitationDataImpl
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getPrecipitationData()
		 * @generated
		 */
		EClass PRECIPITATION_DATA = eINSTANCE.getPrecipitationData();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger02 Last6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST6 = eINSTANCE.getPrecipitationData_PrecipitationLarger02Last6();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger50 Last6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST6 = eINSTANCE.getPrecipitationData_PrecipitationLarger50Last6();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger02 Last Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST_DAY = eINSTANCE.getPrecipitationData_PrecipitationLarger02LastDay();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger50 Last Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST_DAY = eINSTANCE.getPrecipitationData_PrecipitationLarger50LastDay();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger00 Last12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECIPITATION_DATA__PRECIPITATION_LARGER00_LAST12 = eINSTANCE.getPrecipitationData_PrecipitationLarger00Last12();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger02 Last12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECIPITATION_DATA__PRECIPITATION_LARGER02_LAST12 = eINSTANCE.getPrecipitationData_PrecipitationLarger02Last12();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger10 Last12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECIPITATION_DATA__PRECIPITATION_LARGER10_LAST12 = eINSTANCE.getPrecipitationData_PrecipitationLarger10Last12();

		/**
		 * The meta object literal for the '<em><b>Precipitation Larger50 Last12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECIPITATION_DATA__PRECIPITATION_LARGER50_LAST12 = eINSTANCE.getPrecipitationData_PrecipitationLarger50Last12();

		/**
		 * The meta object literal for the '<em><b>Precipitation Significant Weather Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_TOTAL = eINSTANCE.getPrecipitationData_PrecipitationSignificantWeatherTotal();

		/**
		 * The meta object literal for the '<em><b>Precipitation Significant Weather Last3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECIPITATION_DATA__PRECIPITATION_SIGNIFICANT_WEATHER_LAST3 = eINSTANCE.getPrecipitationData_PrecipitationSignificantWeatherLast3();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.TemperatureDataImpl <em>Temperature Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.TemperatureDataImpl
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getTemperatureData()
		 * @generated
		 */
		EClass TEMPERATURE_DATA = eINSTANCE.getTemperatureData();

		/**
		 * The meta object literal for the '<em><b>Temp Above Surface5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPERATURE_DATA__TEMP_ABOVE_SURFACE5 = eINSTANCE.getTemperatureData_TempAboveSurface5();

		/**
		 * The meta object literal for the '<em><b>Temp Above Surface200</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPERATURE_DATA__TEMP_ABOVE_SURFACE200 = eINSTANCE.getTemperatureData_TempAboveSurface200();

		/**
		 * The meta object literal for the '<em><b>Temp Dewpoint Above Surface200</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPERATURE_DATA__TEMP_DEWPOINT_ABOVE_SURFACE200 = eINSTANCE.getTemperatureData_TempDewpointAboveSurface200();

		/**
		 * The meta object literal for the '<em><b>Temp Min Last12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPERATURE_DATA__TEMP_MIN_LAST12 = eINSTANCE.getTemperatureData_TempMinLast12();

		/**
		 * The meta object literal for the '<em><b>Temp Max Last12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPERATURE_DATA__TEMP_MAX_LAST12 = eINSTANCE.getTemperatureData_TempMaxLast12();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.FogDataImpl <em>Fog Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.FogDataImpl
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getFogData()
		 * @generated
		 */
		EClass FOG_DATA = eINSTANCE.getFogData();

		/**
		 * The meta object literal for the '<em><b>Fog Prop Last1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOG_DATA__FOG_PROP_LAST1 = eINSTANCE.getFogData_FogPropLast1();

		/**
		 * The meta object literal for the '<em><b>Fog Prop Last6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOG_DATA__FOG_PROP_LAST6 = eINSTANCE.getFogData_FogPropLast6();

		/**
		 * The meta object literal for the '<em><b>Fog Prop Last12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOG_DATA__FOG_PROP_LAST12 = eINSTANCE.getFogData_FogPropLast12();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.SnowRainDataImpl <em>Snow Rain Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.SnowRainDataImpl
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getSnowRainData()
		 * @generated
		 */
		EClass SNOW_RAIN_DATA = eINSTANCE.getSnowRainData();

		/**
		 * The meta object literal for the '<em><b>Snow Rain Eq Last1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST1 = eINSTANCE.getSnowRainData_SnowRainEqLast1();

		/**
		 * The meta object literal for the '<em><b>Snow Rain Eq Last3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST3 = eINSTANCE.getSnowRainData_SnowRainEqLast3();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.VisibilityDataImpl <em>Visibility Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.VisibilityDataImpl
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getVisibilityData()
		 * @generated
		 */
		EClass VISIBILITY_DATA = eINSTANCE.getVisibilityData();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_DATA__VISIBILITY = eINSTANCE.getVisibilityData_Visibility();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.PressureDataImpl <em>Pressure Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.PressureDataImpl
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getPressureData()
		 * @generated
		 */
		EClass PRESSURE_DATA = eINSTANCE.getPressureData();

		/**
		 * The meta object literal for the '<em><b>Surface Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESSURE_DATA__SURFACE_PRESSURE = eINSTANCE.getPressureData_SurfacePressure();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.IrradianceDataImpl <em>Irradiance Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.IrradianceDataImpl
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getIrradianceData()
		 * @generated
		 */
		EClass IRRADIANCE_DATA = eINSTANCE.getIrradianceData();

		/**
		 * The meta object literal for the '<em><b>Ir Radiance Global</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IRRADIANCE_DATA__IR_RADIANCE_GLOBAL = eINSTANCE.getIrradianceData_IrRadianceGlobal();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherAdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherAdminImpl
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getWeatherAdmin()
		 * @generated
		 */
		EClass WEATHER_ADMIN = eINSTANCE.getWeatherAdmin();

		/**
		 * The meta object literal for the '<em><b>Weather Station Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_ADMIN__WEATHER_STATION_ID = eINSTANCE.getWeatherAdmin_WeatherStationId();

		/**
		 * The meta object literal for the '<em><b>Weather Station Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_ADMIN__WEATHER_STATION_NAME = eINSTANCE.getWeatherAdmin_WeatherStationName();

	}

} //WeatherPackage
