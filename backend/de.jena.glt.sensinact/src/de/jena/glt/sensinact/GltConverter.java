package de.jena.glt.sensinact;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.gateway.geojson.utils.GeoJsonUtils;
import org.eclipse.sensinact.model.core.provider.Admin;
import org.eclipse.sensinact.model.core.provider.MetadataValue;
import org.eclipse.sensinact.model.core.provider.ProviderFactory;
import org.eclipse.sensinact.model.core.provider.ProviderPackage;
import org.eclipse.sensinact.model.core.provider.ResourceValueMetadata;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;

import de.jena.glt.rest.GltOpenApi;
import de.jena.glt.sensinact.model.glt.GltFactory;
import de.jena.glt.sensinact.model.glt.GltPackage;
import de.jena.glt.sensinact.model.glt.GltSide;
import de.jena.glt.sensinact.model.glt.MonitoringData;
import de.jena.model.glt.DatalogContentPojo;
import de.jena.model.glt.EntityPojo;
import de.jena.model.glt.Response;
import de.jena.model.glt.SystemDescriptionPojo;

/**
 * Loads data from the GLT API of the city of Jena
 * 
 * @author grune
 * @since May 27, 2025
 */
@Component(configurationPid = "Glt", configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = GltConfiguration.class)
public class GltConverter {
	private static final Logger logger = System.getLogger(GltConverter.class.getName());

	private DateTimeFormatter dateFormat = DateTimeFormatter.ISO_OFFSET_DATE_TIME.withLocale(Locale.GERMANY).withZone( ZoneId.of("CET"));
	
	@Reference
	private GltOpenApi gltOpenApi;
	@Reference
	private DataUpdate sensiNact;

	private GltConfiguration conf;

	private ScheduledExecutorService executor;

	private GeoJsonObject geoJson;

	private String friendlyName;

	private int[] points;

	private Instant locationTimestamp;

	@Activate
	public void activate(GltConfiguration config) {
		this.conf = config;
		logger.log(Level.INFO, "activate GLT for system id " + config.systemID());
		executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(this::update, 0, config.interval(), TimeUnit.MINUTES);
	}

	public void deactivate() {
		executor.shutdown();
	}

	private void initPoints() {
		if(points != null) {
			return;
		}
		if(conf.points().length != 0) {
			points = conf.points();
		} else {
			int systemId = Integer.parseInt(conf.systemID());
			Response entitiesByTypes = gltOpenApi.getEntitiesByTypes(systemId, ECollections.asEList("DATALOG","ANALOG_HARDWARE","DIGITAL_HARDWARE") , ECollections.emptyEList());
			EList<EObject> result = entitiesByTypes.getResult();
			logger.log(Level.INFO, "Load points from {0}", systemId);
			points = result.stream() //
					.filter(EntityPojo.class::isInstance).map(EntityPojo.class::cast) //
					.mapToInt(EntityPojo::getId).toArray();
		}
		
	}
	
	private void initSide() {
		String systemId = conf.systemID();
		Response response = gltOpenApi.getSystem(systemId, false);
		int code = response.getCode();
		if (code == 200) {
			EList<EObject> result = response.getResult();
			if (!result.isEmpty()) {
				SystemDescriptionPojo site = (SystemDescriptionPojo) result.get(0);
				logger.log(Level.INFO, "Init side: {0}", site.getName());
				initGeo(site);
				friendlyName = site.getName();
			}
		} else if (code == 404) {
			logger.log(Level.WARNING, "Response Code: " + code + " System with id " + systemId);
		} else {
			logger.log(Level.WARNING, "Response Code: " + code + " : " + response.getDescription());
		}
	}

	private void initGeo(SystemDescriptionPojo site) {
		Double lon = site.getLon();
		Double lat = site.getLat();
		if (lon == null || lat == null) {
			lat = 50.928685;
			lon = 11.583359;
		}
		geoJson = GeoJsonUtils.point(lon, lat);
	}

	private void update() {
		try {
			initPoints();
			int systemId = Integer.parseInt(conf.systemID());
			EList<Integer> point = ECollections.asEList(Arrays.stream(points).boxed().toList());
			
			String from = dateFormat.format(Instant.now().minus(conf.back(), ChronoUnit.MINUTES));
			String to = dateFormat.format(Instant.now().plus(1, ChronoUnit.MINUTES));
			Response response = gltOpenApi.getDatalogContent(systemId, point, from, to);
			int code = response.getCode();
			if (code == 200) {
				EList<EObject> result = response.getResult();
				GltSide glt = GltFactory.eINSTANCE.createGltSide();
				glt.setId(conf.systemID());
				updateAdmin(glt);
				for (EObject object : result) {
					DatalogContentPojo dc = (DatalogContentPojo) object;
					logger.log(Level.DEBUG, "Data: " + dc);
					updateService(glt, dc);
				}
				sensiNact.pushUpdate(glt);

			} else if (code == 404) {
				logger.log(Level.INFO, "Response Code: " + code + " : No new data.");
			} else {
				logger.log(Level.INFO, "Response Code: " + code + " : " + response.getDescription());
			}
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error while updating datalog content for system " + conf.systemID(), e);
		}
	}

	private void updateAdmin(GltSide glt) {
		Admin admin = ProviderFactory.eINSTANCE.createAdmin();
		if(locationTimestamp == null) {
			locationTimestamp = Instant.now();
		}
		glt.setAdmin(admin);
		if(friendlyName == null) initSide();
		admin.setLocation(geoJson);
		ResourceValueMetadata meta = ProviderFactory.eINSTANCE.createResourceValueMetadata();
		meta.setTimestamp(locationTimestamp);
		admin.getMetadata().put(ProviderPackage.Literals.ADMIN__LOCATION, meta);
		admin.setFriendlyName(friendlyName);
	}

	private void updateService(GltSide glt, DatalogContentPojo dc) {
		MonitoringData service = GltFactory.eINSTANCE.createMonitoringData();
		EList<String> timeEntries = dc.getEntriesT();
		if (!timeEntries.isEmpty()) {
			String time = timeEntries.get(timeEntries.size() - 1);
			EList<Float> valueEntries = dc.getEntriesV();
			Float value = valueEntries.get(valueEntries.size() - 1); 
			service.setValue(value);
			addMetaData(dc, service, time);
			glt.getServices().put("" + dc.getId(), service);
		}
	}

	private void addMetaData(DatalogContentPojo dc, MonitoringData service, String time) {
		EMap<ETypedElement, ResourceValueMetadata> metadata = service.getMetadata();
		ResourceValueMetadata md = ProviderFactory.eINSTANCE.createResourceValueMetadata();
		Instant instant = LocalDateTime.parse(time, DateTimeFormatter.ISO_OFFSET_DATE_TIME)
				.atZone(ZoneId.of("Europe/Berlin")).toInstant();
		md.setTimestamp(instant);
		md.getExtra().put("description", createCustomMetadata(dc.getName()));
		md.getExtra().put("pointNumber", createCustomMetadata(dc.getPointNumber()));
		md.getExtra().put("pointId", createCustomMetadata(dc.getPointId()));
		metadata.put(GltPackage.eINSTANCE.getMonitoringData_Value(), md);
	}

	private MetadataValue createCustomMetadata(Object value) {
		MetadataValue mv = ProviderFactory.eINSTANCE.createMetadataValue();
		mv.setValue(value);
		return mv;
	}
}
// 16842753 16842754  16842755