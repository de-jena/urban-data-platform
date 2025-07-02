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
	 * The feature id for the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__STATION = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wind Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__WIND_DATA = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cloud Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER__CLOUD_DATA = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_PROVIDER_FEATURE_COUNT = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 3;

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
	 * The number of structural features of the '<em>Wind Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIND_DATA_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

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
	 * The number of structural features of the '<em>Cloud Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DATA_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.StationImpl
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__METADATA = ProviderPackage.ADMIN__METADATA;

	/**
	 * The feature id for the '<em><b>Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__FRIENDLY_NAME = ProviderPackage.ADMIN__FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LOCATION = ProviderPackage.ADMIN__LOCATION;

	/**
	 * The feature id for the '<em><b>Model Package Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__MODEL_PACKAGE_URI = ProviderPackage.ADMIN__MODEL_PACKAGE_URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__MODEL = ProviderPackage.ADMIN__MODEL;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = ProviderPackage.ADMIN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.ADMIN___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = ProviderPackage.ADMIN_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider#getStation()
	 * @see #getWeatherProvider()
	 * @generated
	 */
	EReference getWeatherProvider_Station();

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
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.sensinact.weatherprovider.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see org.eclipse.fennec.model.sensinact.weatherprovider.Station
	 * @generated
	 */
	EClass getStation();

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
		 * The meta object literal for the '<em><b>Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER_PROVIDER__STATION = eINSTANCE.getWeatherProvider_Station();

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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.StationImpl
		 * @see org.eclipse.fennec.model.sensinact.weatherprovider.impl.WeatherPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

	}

} //WeatherPackage
