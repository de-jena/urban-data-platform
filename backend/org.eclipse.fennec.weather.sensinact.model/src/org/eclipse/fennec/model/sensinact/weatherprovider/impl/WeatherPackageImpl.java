/**
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.CloudData;
import org.eclipse.fennec.model.sensinact.weatherprovider.Station;
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
	private EClass stationEClass = null;

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
	public EReference getWeatherProvider_Station() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_WindData() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeatherProvider_CloudData() {
		return (EReference)weatherProviderEClass.getEStructuralFeatures().get(2);
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
	public EClass getStation() {
		return stationEClass;
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
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__STATION);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__WIND_DATA);
		createEReference(weatherProviderEClass, WEATHER_PROVIDER__CLOUD_DATA);

		windDataEClass = createEClass(WIND_DATA);
		createEAttribute(windDataEClass, WIND_DATA__WIND_DIRECTION);
		createEAttribute(windDataEClass, WIND_DATA__WIND_SPEED);

		cloudDataEClass = createEClass(CLOUD_DATA);
		createEAttribute(cloudDataEClass, CLOUD_DATA__CLOUD_COVER_TOTAL);
		createEAttribute(cloudDataEClass, CLOUD_DATA__CLOUD_COVER_BELOW500);

		stationEClass = createEClass(STATION);
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
		stationEClass.getESuperTypes().add(theProviderPackage.getAdmin());

		// Initialize classes, features, and operations; add parameters
		initEClass(weatherProviderEClass, WeatherProvider.class, "WeatherProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeatherProvider_Station(), this.getStation(), null, "station", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_WindData(), this.getWindData(), null, "windData", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeatherProvider_CloudData(), this.getCloudData(), null, "cloudData", null, 0, 1, WeatherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windDataEClass, WindData.class, "WindData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWindData_WindDirection(), ecorePackage.getEFloatObject(), "windDirection", null, 0, 1, WindData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindData_WindSpeed(), ecorePackage.getEFloatObject(), "windSpeed", null, 0, 1, WindData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudDataEClass, CloudData.class, "CloudData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudData_CloudCoverTotal(), ecorePackage.getEFloatObject(), "cloudCoverTotal", null, 0, 1, CloudData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudData_CloudCoverBelow500(), ecorePackage.getEFloatObject(), "cloudCoverBelow500", null, 0, 1, CloudData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationEClass, Station.class, "Station", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
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

} //WeatherPackageImpl
