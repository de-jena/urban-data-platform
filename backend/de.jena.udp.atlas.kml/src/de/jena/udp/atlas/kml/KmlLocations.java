/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.udp.atlas.kml;

import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.sensinact.core.command.AbstractTwinCommand;
import org.eclipse.sensinact.core.command.GatewayThread;
import org.eclipse.sensinact.core.notification.LifecycleNotification;
import org.eclipse.sensinact.core.notification.LifecycleNotification.Status;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.core.twin.SensinactDigitalTwin;
import org.eclipse.sensinact.core.twin.SensinactProvider;
import org.eclipse.sensinact.core.twin.SensinactResource;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.typedevent.TypedEventConstants;
import org.osgi.service.typedevent.TypedEventHandler;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.PromiseFactory;

import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceAreaProvider;
import net.opengis.kml.PlacemarkType;

/**
 * Reads the city's KML once at activation. The reference-area folder is pushed as ReferenceArea
 * providers; the sensor folder gives the admin location of the ChirpStack provider named after the
 * EUI, set when that provider is created and once at activation for the providers already there.
 */
@Component(name = KmlLocations.NAME, immediate = true, configurationPid = KmlLocations.NAME,
		configurationPolicy = ConfigurationPolicy.OPTIONAL, service = TypedEventHandler.class, property = {
				TypedEventConstants.TYPED_EVENT_TOPICS + "=LIFECYCLE/*",
				TypedEventConstants.TYPED_EVENT_TYPE + "=org.eclipse.sensinact.core.notification.LifecycleNotification" })
public class KmlLocations implements TypedEventHandler<LifecycleNotification> {

	static final String NAME = "KmlLocations";
	static final String BUNDLED_KML = "data/teros_sensors_and_ref_areas.kml";

	public @interface Config {
		/** Path of the KML file; blank for the one in the bundle. */
		String kml_file() default "";

		String area_folder() default "refflaechen_smartcity";

		String sensor_folder() default "sensoren";
	}

	/** Writes a provider's admin location; the twin in production, a recorder in tests. */
	interface LocationWriter {
		Promise<Void> write(String provider, Point location);
	}

	private static final Logger logger = System.getLogger(KmlLocations.class.getName());

	@Reference
	DataUpdate sensiNact;

	@Reference
	private GatewayThread gateway;

	LocationWriter locationWriter = this::writeToTwin;
	private SensorLocations sensors = SensorLocations.none();

	@Activate
	void activate(BundleContext context, Config config) throws IOException {
		try (InputStream kml = open(context, config.kml_file())) {
			load(kml, config.area_folder(), config.sensor_folder());
		}
		gateway.execute(new AbstractTwinCommand<List<String>>() {
			@Override
			protected Promise<List<String>> call(SensinactDigitalTwin twin, PromiseFactory promises) {
				return promises.resolved(twin.getProviders().stream().map(SensinactProvider::getName).toList());
			}
		}).onSuccess(providers -> providers.forEach(this::locate))
				.onFailure(e -> logger.log(Level.ERROR, "Error listing the providers for their KML location", e));
	}

	private static InputStream open(BundleContext context, String kmlFile) throws IOException {
		if (kmlFile == null || kmlFile.isBlank()) {
			return context.getBundle().getEntry(BUNDLED_KML).openStream();
		}
		return Files.newInputStream(Path.of(kmlFile));
	}

	void load(InputStream kml, String areaFolder, String sensorFolder) throws IOException {
		KmlPlacemarks placemarks = KmlPlacemarks.load(kml);
		sensors = SensorLocations.of(placemarks.inFolder(sensorFolder));
		List<PlacemarkType> areas = placemarks.inFolder(areaFolder);
		areas.forEach(this::pushArea);
		logger.log(Level.INFO, "KML: {0} reference areas pushed, {1} sensor locations known", areas.size(), sensors.size());
	}

	private void pushArea(PlacemarkType placemark) {
		ReferenceAreaProvider provider = ReferenceAreas.toProvider(placemark);
		sensiNact.pushUpdate(provider)
				.onFailure(e -> logger.log(Level.ERROR, "Error pushing reference area " + provider.getId(), e));
	}

	@Override
	public void notify(String topic, LifecycleNotification event) {
		if (event.status() == Status.PROVIDER_CREATED) {
			locate(event.provider());
		}
	}

	void locate(String provider) {
		sensors.of(provider).ifPresent(location -> locationWriter.write(provider, location)
				.onSuccess(nothing -> logger.log(Level.INFO, "KML location set on {0}", provider))
				.onFailure(e -> logger.log(Level.ERROR, "Error setting the KML location of " + provider, e)));
	}

	private Promise<Void> writeToTwin(String provider, Point location) {
		return gateway.execute(new AbstractTwinCommand<Void>() {
			@Override
			protected Promise<Void> call(SensinactDigitalTwin twin, PromiseFactory promises) {
				SensinactResource resource = twin.getResource(provider, "admin", "location");
				return resource == null ? promises.resolved(null) : resource.setValue(location);
			}
		});
	}
}
