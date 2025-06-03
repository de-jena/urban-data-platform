package de.jena.glt.sensinact;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.model.core.provider.Admin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;

import de.jena.glt.rest.GltOpenApi;
import de.jena.glt.sensinact.model.glt.GltFactory;
import de.jena.glt.sensinact.model.glt.GltSide;
import de.jena.glt.sensinact.model.glt.MonitoringData;
import de.jena.model.glt.DatalogContentPojo;
import de.jena.model.glt.Response;
import de.jena.model.glt.SystemDescriptionPojo;

/**
 * Lädt
 * 
 * @author grune
 * @since May 27, 2025
 */
@Component(configurationPid = "Glt", configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = GltConfiguration.class)
public class GltConverter {
	private static final Logger logger = System.getLogger(GltConverter.class.getName());

	@Reference
	private GltOpenApi gltOpenApi;
	@Reference
	private DataUpdate sensiNact;

	private GltConfiguration conf;

	private ScheduledExecutorService executor;

	private GeoJsonObject geoJson;

	@Activate
	public void activate(GltConfiguration config) {
		this.conf = config;
		logger.log(Level.INFO, "activate GLT for system id " + config.systemID());
		initSide();
		executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(this::update, 0, config.interval(), TimeUnit.MINUTES);
	}

	public void deactivate() {
		executor.shutdown();
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
				// TODO: Metadaten
			}
		} else if (code == 404){
			logger.log(Level.WARNING, "Response Code: " + code + " System with id " + systemId);
		} else {
			logger.log(Level.WARNING, "Response Code: " + code + " : " + response.getDescription());
		}
	}

	private void initGeo(SystemDescriptionPojo site) {
//		FeatureCollection fc = new FeatureCollection();
//		Feature castFeature = new Feature();
		Point point = new Point();
		Double lon = site.getLon();
		Double lat = site.getLat();
		if (lon != null && lat != null) {
			Coordinates coordinates = new Coordinates();
			point.coordinates = coordinates;
			coordinates.longitude = lon;
			coordinates.latitude = lat;
		}
		geoJson = point;
//		castFeature.geometry = pg;
//		fc.features.add(castFeature);
//		geoJson = fc;
	}

	private void update() {
		int systemId = Integer.parseInt(conf.systemID());
		EList<Integer> point = ECollections.asEList(Arrays.stream(conf.points()).boxed().toList());
		String from = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now().minusMinutes(conf.interval()));
		String to = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now().plusMinutes(1));

		Response response = gltOpenApi.getDatalogContent(systemId, point, from, to);
		int code = response.getCode();
		if (code == 200) {
			EList<EObject> result = response.getResult();
			for (EObject object : result) {
				DatalogContentPojo dc = (DatalogContentPojo) object;
				logger.log(Level.INFO, "Data: " + dc);
				GltSide glt = GltFactory.eINSTANCE.createGltSide();
				Admin admin = glt.getAdmin();
				admin.setLocation(geoJson);
				MonitoringData service = GltFactory.eINSTANCE.createMonitoringData();
				service.setValue(dc.getValue());
				glt.getServices().put(dc.getName(), service);
				sensiNact.pushUpdate(glt);
//				dc.getTime();
			}

		} else if (code == 404) {
			logger.log(Level.INFO, "Response Code: " + code + " : No new data.");
		} else {
			logger.log(Level.INFO, "Response Code: " + code + " : " + response.getDescription());
		}
	}
}
// 16842753 16842754  16842755