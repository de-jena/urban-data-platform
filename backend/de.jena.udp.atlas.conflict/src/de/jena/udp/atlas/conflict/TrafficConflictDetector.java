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
package de.jena.udp.atlas.conflict;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.sensinact.core.notification.ResourceDataNotification;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.typedevent.TypedEventConstants;
import org.osgi.service.typedevent.TypedEventHandler;

import de.jena.conflict.sensinact.model.conflictProvider.Conflict;
import de.jena.conflict.sensinact.model.conflictProvider.ConflictFactory;
import de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictAdmin;
import de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictProvider;

/**
 * A conflict is a bike crossing the intersection against the direction of travel while the car
 * signal group shows green (or yellow after green). The {@code event.topics} of the
 * configuration name the signal group's {@code color} and the camera class' {@code objects};
 * the provider is pushed whenever the conflict state flips.
 */
@Component(name = TrafficConflictDetector.NAME, configurationPid = TrafficConflictDetector.NAME,
		configurationPolicy = ConfigurationPolicy.REQUIRE, service = TypedEventHandler.class,
		property = TypedEventConstants.TYPED_EVENT_TYPE + "=org.eclipse.sensinact.core.notification.ResourceDataNotification")
public class TrafficConflictDetector implements TypedEventHandler<ResourceDataNotification> {

	static final String NAME = "TrafficConflictDetector";
	static final Set<String> GREEN_FOR_CARS = Set.of("🟢⚪⚪", "⚪🟡🔴");

	public @interface Config {
		/** The sensiNact DATA topics of the signal colour and the camera objects. */
		String[] event_topics();

		String provider() default "Conflict01";

		String friendlyName() default "Conflict Bike Car Felsenkeller";

		double longitude() default 11.581274;

		double latitude() default 50.921142;

		/** A class-3 object slower than this is no bike on the move. */
		double minBikeSpeed() default 7.0;

		/** Headings in degrees that cross the car traffic. */
		double minHeading() default 90.0;

		double maxHeading() default 230.0;
	}

	private static final Logger logger = System.getLogger(TrafficConflictDetector.class.getName());

	@Reference
	DataUpdate sensiNact;

	/** The configuration as plain values, so tests can start the detector without a Config. */
	record Settings(String provider, String friendlyName, Point location, double minBikeSpeed, double minHeading,
			double maxHeading) {
		static Settings of(Config config) {
			return new Settings(config.provider(), config.friendlyName(), new Point(config.longitude(), config.latitude()),
					config.minBikeSpeed(), config.minHeading(), config.maxHeading());
		}
	}

	private volatile Settings settings;
	private TrafficConflictProvider provider;
	private Conflict conflict;
	private String colour;
	private boolean bikeCrossing;
	private Long bikeId;
	private Boolean reported;

	@Activate
	void activate(Config config) {
		start(Settings.of(config));
	}

	@Modified
	void modified(Config config) {
		settings = Settings.of(config);
	}

	void start(Settings settings) {
		this.settings = settings;
		provider = ConflictFactory.eINSTANCE.createTrafficConflictProvider();
		provider.setId(settings.provider());
		TrafficConflictAdmin admin = ConflictFactory.eINSTANCE.createTrafficConflictAdmin();
		admin.setFriendlyName(settings.friendlyName());
		admin.setLocation(settings.location());
		admin.setViewport(FELSENKELLER_CROSSINGS);
		provider.setAdmin(admin);
		conflict = ConflictFactory.eINSTANCE.createConflict();
		provider.setConflict(conflict);
		report(false);
	}

	@Override
	public synchronized void notify(String topic, ResourceDataNotification event) {
		if ("color".equals(event.resource())) {
			colour = (String) event.newValue();
		} else if ("objects".equals(event.resource())) {
			Feature bike = crossingBike(event.newValue());
			bikeCrossing = bike != null;
			bikeId = bike == null ? null : ((Number) bike.properties().get("id")).longValue();
		} else {
			return;
		}
		boolean now = GREEN_FOR_CARS.contains(colour) && bikeCrossing;
		if (reported == null || reported != now) {
			report(now);
		}
	}

	/** The first object heading across the car traffic faster than a walking bike. */
	Feature crossingBike(Object objects) {
		if (!(objects instanceof FeatureCollection collection)) {
			return null;
		}
		for (Feature feature : collection.features()) {
			Map<String, Object> properties = feature.properties();
			if (properties.get("heading") instanceof Number heading && properties.get("speed") instanceof Number speed
					&& heading.doubleValue() > settings.minHeading() && heading.doubleValue() < settings.maxHeading()
					&& speed.doubleValue() > settings.minBikeSpeed()) {
				return feature;
			}
		}
		return null;
	}

	private void report(boolean inConflict) {
		conflict.setConflict(inConflict);
		conflict.setBikeId(bikeId);
		reported = inConflict;
		sensiNact.pushUpdate(provider)
				.onSuccess(nothing -> logger.log(Level.INFO, "{0}: conflict={1} bike={2} signal={3}", settings.provider(), inConflict, bikeId, colour))
				.onFailure(e -> logger.log(Level.ERROR, "Error pushing the conflict state of " + settings.provider(), e));
	}

	/** The two bike crossings (RF2, RF3) in the Felsenkeller camera's view. */
	static final Polygon FELSENKELLER_CROSSINGS = new Polygon(List.of(
			List.of(new Coordinates(11.581174804340378, 50.92114749250047), new Coordinates(11.581092406951655, 50.92103629166223),
					new Coordinates(11.581132445119607, 50.921015807268105), new Coordinates(11.58123631225098, 50.92114163983149),
					new Coordinates(11.581174804340378, 50.92114749250047)),
			List.of(new Coordinates(11.581350041018055, 50.921183244297964), new Coordinates(11.58131050400172, 50.921157831897375),
					new Coordinates(11.581420587456762, 50.921121668072885), new Coordinates(11.581443069289548, 50.92115245619581),
					new Coordinates(11.581350041018055, 50.921183244297964))), null, null);
}
