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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
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
	private static final String GEN_MODEL_ANNOTATION_SOURCE = "http://www.eclipse.org/emf/2002/GenModel";

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
		String unit = "m/s";
		Map<String, String> metadata = new HashMap<>();
		metadata.put("sensorthings.unit.name", "meter per seconds");
		metadata.put("dwd.id", "FF");
		EAttribute eAttribute = weatherPackage.getMOSMIXSWeatherReport_WindSpeed();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "FX1");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_WindGustLastHour();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "FX3");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_WindGustLastThreeHours();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "FXh");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_WindGustMaxLast12Hours();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		unit = "°";
		metadata.put("sensorthings.unit.name", "degrees");
		metadata.put("dwd.id", "DD");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_WindDirection();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		unit = "%";
		metadata.put("sensorthings.unit.name", "percent probability");
		metadata.put("dwd.id", "FXh25");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_WindGustProb25();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "FXh40");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_WindGustProb40();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "FXh55");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_WindGustProb55();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		// Cloud resources
		metadata.put("sensorthings.unit.name", "percentage");
		metadata.put("dwd.id", "N");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_CloudCoverTotal();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "N05");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_CloudCoverBelow500();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "Neff");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_CloudCoverEffective();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "Nh");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_CloudCoverHigh();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "Nl");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_CloudCoverLow();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "Nm");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_CloudCoverMid();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));


		// Precipitation resources
		metadata.put("dwd.id", "Rh00");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_PrecipitationLarger00Last12();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "Rh02");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_PrecipitationLarger02Last12();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "R602");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_PrecipitationLarger02Last6();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "Rd02");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_PrecipitationLarger02LastDay();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "Rh10");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_PrecipitationLarger10Last12();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "Rh50");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_PrecipitationLarger50Last12();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "R650");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_PrecipitationLarger50Last6();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "Rd50");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_PrecipitationLarger50LastDay();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		// Fog resources
		metadata.put("dwd.id", "wwM");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_FogPropLast1();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "wwMh");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_FogPropLast12();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "wwM6");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_FogPropLast6();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));



		// Pressure resources
		unit = "Pa";
		metadata.put("sensorthings.unit.name", "Pascal");
		metadata.put("dwd.id", "PPPP");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_SurfacePressure();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));


		// Temperature resources
		unit = "K";
		metadata.put("sensorthings.unit.name", "Degree Kalvin");
		metadata.put("dwd.id", "T5cm");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_TempAboveSurface5();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "TTT");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_TempAboveSurface200();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "TN");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_TempMinLast12();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "TX");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_TempMaxLast12();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "Td");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_TempDewpointAboveSurface200();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));


		// Weather warning
		unit = "";
		metadata.put("sensorthings.unit.name", "");
		metadata.put("dwd.id", "ww");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_SignificantWeather3Hours();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "W1 part of W1W2");
		eAttribute = weatherPackage.getW1W2_W1();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, weatherPackage.getMOSMIXSWeatherReport_SignificantWeather6Hours(), eAttribute));

		metadata.put("dwd.id", "W2 part of W1W2");
		eAttribute = weatherPackage.getW1W2_W2();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, weatherPackage.getMOSMIXSWeatherReport_SignificantWeather6Hours(), eAttribute));



		//Snow/Rain resources
		unit = "Kg/m2";
		metadata.put("sensorthings.unit.name", "Kilograms per sqaure meter");
		metadata.put("dwd.id", "RRS1c");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_SnowRainEqLast1();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		metadata.put("dwd.id", "RRS3c");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_SnowRainEqLast3();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		//Irradiance
		unit = "KJ/m2";
		metadata.put("sensorthings.unit.name", "Kilo Joul per sqaure meter");
		metadata.put("dwd.id", "Rad1h");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_IrRadianceGlobal();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		//sunshine 
		unit = "s";
		metadata.put("sensorthings.unit.name", "seconds");
		metadata.put("dwd.id", "SunD1");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_SunshineDurationLast1();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));

		//visibility
		unit = "m";
		metadata.put("sensorthings.unit.name", "meters");
		metadata.put("dwd.id", "VV");
		eAttribute = weatherPackage.getMOSMIXSWeatherReport_Visibility();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));
		
		unit = "";
		metadata.clear();
		eAttribute = weatherPackage.getWeatherReport_IssueTime();
		service.getResources().add(createResource(eAttribute.getName(), eAttribute.getName(), unit,
				extractDocumentation(eAttribute), metadata, eAttribute.getEAttributeType(), mosReportClass, eAttribute));


		return service;
	}

	private String extractDocumentation(ENamedElement element) {
		EAnnotation eAnnotation = element.getEAnnotation(GEN_MODEL_ANNOTATION_SOURCE);
		if(eAnnotation != null) {
			return eAnnotation.getDetails().get("documentation");
		}
		return null;
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



	private ResourceMapping createResource(String mid, String name, String unit, String description, Map<String, String> metadata,
			EDataType dataType, EClass sourceClass, EStructuralFeature ... featurePath) {

		ResourceMapping resource = factory.createResourceMapping();
		resource.setMid(mid);
		resource.setName(name);


		if (unit != null) {
			resource.setUnit(unit);
		}
		if(description != null) {
			resource.setDescription(description);
		}

		if(!metadata.isEmpty()) {
			metadata.forEach((k,v) -> {
				resource.getExtraMetadata().put(k, v);
			});

		}

		resource.setChangeable(false);


		// Set data type
		resource.setEType(dataType);

		// Set value feature path
		for(EStructuralFeature feature : featurePath) resource.getValueFeature().add(feature);

		return resource;
	}


}
