/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.udp.sensinact.sensor.mapping;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.mapping.AdminMapping;
import org.eclipse.sensinact.mapping.MappingFactory;
import org.eclipse.sensinact.mapping.NameMapping;
import org.eclipse.sensinact.mapping.ProviderMapping;
import org.eclipse.sensinact.mapping.ResourceMapping;
import org.eclipse.sensinact.mapping.ServiceMapping;
import org.eclipse.sensinact.mapping.TimestampMapping;
import org.eclipse.sensinact.mapping.TimestampStrategy;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.weather.model.weather.WeatherPackage;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;


/**
 * 
 * @author ilenia
 * @since Nov 7, 2025
 */
//@Component(immediate = true, name = "WeatherMappingGenerator")
public class WeatherMappingGenerator {
	
	ResourceSet resourceSet;	
	WeatherPackage weatherPackage;
	TimestampMapping timestampMapping;
	
	private static final MappingFactory factory = MappingFactory.eINSTANCE;
	private static final String MAPPING_FILE_NAME =  "WeatherReportsMapping.xmi";
	
	@Activate
	public WeatherMappingGenerator(
			@Reference(cardinality = ReferenceCardinality.MANDATORY) WeatherPackage weatherPackage,
			@Reference(cardinality = ReferenceCardinality.MANDATORY, target = "(" + EMFNamespaces.EMF_MODEL_FILE_EXT + "=xmi)") ResourceSet resourceSet,
			BundleContext ctx
			) throws IOException {
		this.weatherPackage = weatherPackage;
		this.resourceSet = resourceSet;
		URL mappingUrl = ctx.getBundle().getEntry("mapping");
		generateMapping(mappingUrl.toString() + MAPPING_FILE_NAME);
	}


	/**
	 * Generates a complete weather reports mapping with multiple forecast horizons.
	 *
	 * @param outputPath Path where the XMI file should be saved
	 * @throws IOException if saving fails
	 */
	public void generateMapping(String outputPath) throws IOException {
		// Initialize EMF resource set
//		ResourceSet resourceSet = new ResourceSetImpl();
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
//			.put("xmi", new XMIResourceFactoryImpl());
//		resourceSet.getPackageRegistry().put(MappingPackage.eNS_URI, MappingPackage.eINSTANCE);

		// Load the weather ecore model (needed for references)
//		Resource weatherResource = resourceSet.getResource(URI.createURI(WEATHER_NS), true);
//		EPackage weatherPackage = (EPackage) weatherResource.getContents().get(0);

		// Create the provider mapping
		ProviderMapping mapping = createProviderMapping();

		// Save to XMI
		
		Resource resource = resourceSet.createResource(URI.createURI(System.getProperty("base.path") + "/WeatherReportsMapping.xmi"), "application/xmi");
		resource.getContents().add(mapping);
		resource.save(null);

		System.out.println("Generated mapping saved to: " + outputPath);
	}

	/**
	 * Creates the complete provider mapping structure.
	 */
	private ProviderMapping createProviderMapping() {
		ProviderMapping mapping = factory.createProviderMapping();
		mapping.setMid("dwd-weather-reports");
		mapping.setProviderTimestamp(false);

		// Set provider name extraction
		mapping.setName(createProviderName());

		// Set provider classes
		EClass weatherReportsClass = (EClass) weatherPackage.getEClassifier("WeatherReports");
		mapping.getProviderClasses().add(weatherReportsClass);

		// Create admin service
		mapping.setAdmin(createAdminService());

		// Create current weather service (index 0)
		mapping.getServices().add(createWeatherService(
			"currentWeather", "Current Weather", 0));

		// Create forecast services for 3H, 6H, 12H, 24H, 48H, 72H
		int[] forecastHours = {3, 6, 12, 24, 48, 72};
		for (int i = 0; i < forecastHours.length; i++) {
			int hours = forecastHours[i];
			mapping.getServices().add(createWeatherService(
				"forecast" + hours + "H",
				hours + "H Forecast",
				i + 1));  // collection index
		}

		return mapping;
	}

	/**
	 * Creates the provider name mapping.
	 */
	private NameMapping createProviderName() {
		NameMapping name = factory.createNameMapping();
		name.setCollectionIndex(0);

		name.getFeaturePath().add(weatherPackage.getWeatherReports_Reports());
		name.getFeaturePath().add(weatherPackage.getWeatherReport_WeatherStation());
		name.getFeaturePath().add(weatherPackage.getWeatherStation_Id());

		return name;
	}

	/**
	 * Creates the admin service mapping.
	 */
	private AdminMapping createAdminService() {
		AdminMapping admin = factory.createAdminMapping();
		admin.setMid("admin");
		admin.setCollectionIndex(0);

		// Service name
		NameMapping adminName = factory.createNameMapping();
		adminName.setName("Admin");
		admin.setName(adminName);

		// Timestamp
//		admin.setTimestamp(createTimestampMapping(weatherPackage, 0));

		// Collection feature
		admin.setCollectionFeature(weatherPackage.getWeatherReports_Reports());

		// Friendly name: WeatherReport.station.name
		
		admin.getFriendlyNameFeature().add(weatherPackage.getWeatherReport_Station());
		admin.getFriendlyNameFeature().add(weatherPackage.getStation_Name());

		// Provider package
		admin.setProviderPackage(weatherPackage);

		// Location: WeatherReport.station.location.latitude/longitude
		admin.getLatitudeRef().add(weatherPackage.getWeatherReport_Station());
		admin.getLatitudeRef().add(weatherPackage.getStation_Location());
		admin.getLatitudeRef().add(weatherPackage.getGeoPosition_Latitude());

		admin.getLongitudeRef().add(weatherPackage.getWeatherReport_Station());
		admin.getLongitudeRef().add(weatherPackage.getStation_Location());
		admin.getLongitudeRef().add(weatherPackage.getGeoPosition_Longitude());

		return admin;
	}

	/**
	 * Creates a weather service mapping with all standard resources.
	 * This is the template method that gets reused for each service.
	 */
	private ServiceMapping createWeatherService(String serviceId, String serviceName,
			int collectionIndex) {

		ServiceMapping service = factory.createServiceMapping();
		service.setMid(serviceId);
		service.setCollectionIndex(collectionIndex);

		// Service name
		NameMapping name = factory.createNameMapping();
		name.setName(serviceName);
		service.setName(name);

		// Timestamp
		service.setTimestamp(createTimestampMapping(weatherPackage, collectionIndex));

		// Collection feature
		service.setCollectionFeature(weatherPackage.getWeatherReports_Reports());

		// Add all standard weather resources (TEMPLATE REUSE!)
		EClass mosReportClass =  weatherPackage.getMOSMIXSWeatherReport();

		// Wind resources
		service.getResources().add(createResource("windSpeed", "windSpeed", "m/s",
			false, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_WindSpeed()));
		service.getResources().add(createResource("windDirection", "windDirection", "degrees",
			null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_WindDirection()));
		service.getResources().add(createResource("windGustLastHour", "windGustLastHour", "m/s",
			null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_WindGustLastHour()));

		// Cloud resources
		service.getResources().add(createResource("cloudCoverTotal", "cloudCoverTotal", "%",
			null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_CloudCoverTotal()));
		service.getResources().add(createResource("cloudCoverBelow500", "cloudCoverBelow500", "%",
				null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_CloudCoverBelow500()));
		service.getResources().add(createResource("cloudCoverEffective", "cloudCoverEffective", "%",
				null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_CloudCoverEffective()));
		service.getResources().add(createResource("cloudCoverHigh", "cloudCoverHigh", "%",
				null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_CloudCoverHigh()));
		service.getResources().add(createResource("cloudCoverTotal", "cloudCoverLow", "%",
				null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_CloudCoverLow()));
		service.getResources().add(createResource("cloudCoverMid", "cloudCoverMid", "%",
				null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_CloudCoverMid()));
		

		// Pressure resources
		service.getResources().add(createResource("surfacePressure", "surfacePressure", "Pa",
			null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_SurfacePressure()));

		// Temperature resources
		service.getResources().add(createResource("tempAboveSurface5", "tempAboveSurface5", "K",
			null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_TempAboveSurface5()));
		service.getResources().add(createResource("tempAboveSurface200", "tempAboveSurface200", "K",
				null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_TempAboveSurface200()));
		service.getResources().add(createResource("tempMinLast12", "tempMinLast12", "K",
			null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_TempMinLast12()));
		service.getResources().add(createResource("tempMaxLast12", "tempMaxLast12", "K",
			null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_TempMaxLast12()));

		// Precipitation resources
		service.getResources().add(createResource("precipitationLarger00Last12", "precipitationLarger00Last12", "%",
			null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_PrecipitationLarger00Last12()));
		service.getResources().add(createResource("precipitationLarger02Last12", "precipitationLarger02Last12", "%",
			null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_PrecipitationLarger02Last12()));
		service.getResources().add(createResource("precipitationLarger02Last6", "precipitationLarger02Last6", "%",
				null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_PrecipitationLarger02Last6()));
			service.getResources().add(createResource("precipitationLarger02Last12", "precipitationLarger02Last12", "%",
				null, EcorePackage.Literals.EFLOAT, mosReportClass, weatherPackage.getMOSMIXSWeatherReport_PrecipitationLarger02Last12()));
		service.getResources().add(createResource("precipitation10mm", "precipitationProbability10mm", "%",
			null, EcorePackage.Literals.EFLOAT, mosReportClass, "precipitationLarger10Last12"));

		// Weather warning
		service.getResources().add(createResource("significantWeather", "significantWeather", null,
			null, EcorePackage.Literals.ESTRING, mosReportClass, "significantWeather3Hours"));

		return service;
	}

	/**
	 * Creates a timestamp mapping for a service.
	 */
	private TimestampMapping createTimestampMapping(EPackage weatherPackage, int collectionIndex) {
		TimestampMapping timestamp = factory.createTimestampMapping();
		timestamp.setStrategy(TimestampStrategy.FEATURE);

		// Path: WeatherReport.timestamp
		EClass weatherReportClass = (EClass) weatherPackage.getEClassifier("WeatherReport");
		timestamp.getFeaturePath().add((EAttribute) weatherReportClass.getEStructuralFeature("timestamp"));

		return timestamp;
	}

	/**
	 * Template method to create a resource mapping.
	 *
	 * @param mid Resource identifier
	 * @param name Resource display name
	 * @param unit Unit of measurement (can be null)
	 * @param changeable Whether the resource is changeable (can be null for default)
	 * @param dataType The EDataType for this resource
	 * @param sourceClass The source EClass containing the attribute
	 * @param attributeName The name of the attribute in the source class
	 */
	private ResourceMapping createResource(String mid, String name, String unit,
			Boolean changeable, EDataType dataType, EClass sourceClass, String attributeName) {

		ResourceMapping resource = factory.createResourceMapping();
		resource.setMid(mid);
		resource.setName(name);

		if (unit != null) {
			resource.setUnit(unit);
		}

		if (changeable != null) {
			resource.setChangeable(changeable);
		}

		// Set data type
		resource.setEType(dataType);

		// Set value feature path
		EAttribute attribute = (EAttribute) sourceClass.getEStructuralFeature(attributeName);
		resource.getValueFeature().add(attribute);

		// Every resource needs a timestamp (inherited from service in this case)
//		TimestampMapping timestamp = factory.createTimestampMapping();
//		timestamp.setStrategy(TimestampStrategy.FEATURE);
//		resource.setTimestamp(timestamp);

		return resource;
	}
	
	private ResourceMapping createResource(String mid, String name, String unit,
			Boolean changeable, EDataType dataType, EClass sourceClass, EAttribute attribute) {

		ResourceMapping resource = factory.createResourceMapping();
		resource.setMid(mid);
		resource.setName(name);
		

		if (unit != null) {
			resource.setUnit(unit);
		}

		if (changeable != null) {
			resource.setChangeable(changeable);
		}

		// Set data type
		resource.setEType(dataType);

		// Set value feature path
		resource.getValueFeature().add(attribute);

		// Every resource needs a timestamp (inherited from service in this case)
//		TimestampMapping timestamp = factory.createTimestampMapping();
//		timestamp.setStrategy(TimestampStrategy.FEATURE);
//		resource.setTimestamp(timestamp);

		return resource;
	}

	
}
