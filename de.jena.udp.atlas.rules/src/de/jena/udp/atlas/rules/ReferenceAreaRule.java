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
package de.jena.udp.atlas.rules;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.sensinact.core.notification.ResourceDataNotification;
import org.eclipse.sensinact.core.snapshot.ICriterion;
import org.eclipse.sensinact.core.snapshot.ProviderSnapshot;
import org.eclipse.sensinact.core.snapshot.ResourceSnapshot;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.southbound.rules.api.ResourceUpdater;
import org.eclipse.sensinact.southbound.rules.api.RuleDefinition;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType;

/**
 * Colours a reference area from the pF averages of the soil sensors standing in it. Runs on each
 * new {@code derivedQuantities/pfWertAvg}: the sensor behind that derived provider decides the
 * area, every sensor of the area contributes its average (0 while it has none), and the colour
 * goes to the area's {@code referenceArea/color}.
 */
@Component(name = ReferenceAreaRule.NAME, configurationPid = ReferenceAreaRule.NAME,
		configurationPolicy = ConfigurationPolicy.OPTIONAL, property = RuleDefinition.RULE_NAME_PROPERTY + "=" + ReferenceAreaRule.NAME)
public class ReferenceAreaRule implements RuleDefinition {

	static final String NAME = "ReferenceAreaRule";
	static final String AREA_MODEL = "ReferenceAreaProvider";
	static final String PF_AVERAGE = "pfWertAvg";

	public @interface Config {
		/** The sensiNact models of the soil sensors. */
		String[] models() default { "Solidos_Teros21" };
	}

	private static final Logger logger = System.getLogger(ReferenceAreaRule.class.getName());

	private Set<String> sensorModels = Set.of("Solidos_Teros21");

	@Activate
	void activate(Config config) {
		sensorModels = Set.of(config.models());
	}

	@Override
	public ICriterion getInputFilter() {
		return new AreaCriterion(sensorModels);
	}

	@Override
	public void evaluate(List<ProviderSnapshot> providers, ResourceUpdater updater) {
		Map<String, ProviderSnapshot> byName = providers.stream()
				.collect(Collectors.toMap(ProviderSnapshot::getName, Function.identity(), (a, b) -> a));
		Optional<ProviderSnapshot> trigger = providers.stream()
				.filter(provider -> Derived.isDerived(provider.getName()) && pfAverage(provider) != null)
				.max(Comparator.comparing(provider -> pfAverage(provider).getValue().getTimestamp()));
		if (trigger.isEmpty()) {
			return;
		}
		String sensor = Derived.sourceOf(trigger.get().getName());
		Optional<Point> position = location(byName.get(sensor)).filter(Point.class::isInstance).map(Point.class::cast);
		if (position.isEmpty()) {
			logger.log(Level.WARNING, "no location known for sensor {0}, its reference area stays as it is", sensor);
			return;
		}
		List<ProviderSnapshot> areas = providers.stream().filter(provider -> AREA_MODEL.equals(provider.getModelName())).toList();
		Optional<ProviderSnapshot> area = areas.stream()
				.filter(candidate -> location(candidate).map(shape -> GeoJsonInside.contains(shape, position.get())).orElse(false))
				.findFirst();
		if (area.isEmpty()) {
			logger.log(Level.WARNING, "sensor {0} stands in no reference area", sensor);
			return;
		}
		List<Double> pfValues = providers.stream()
				.filter(provider -> sensorModels.contains(provider.getModelName()))
				.filter(provider -> location(provider).filter(Point.class::isInstance)
						.map(point -> GeoJsonInside.contains(location(area.get()).get(), (Point) point)).orElse(false))
				.map(provider -> pfAverage(byName.get(Derived.of(provider.getName()))))
				.map(average -> average == null ? 0.0 : ((Number) average.getValue().getValue()).doubleValue())
				.toList();
		ColorType colour = ReferenceAreaColour.of(pfValues);
		updater.updateResource(area.get().getName(), "referenceArea", "color", colour);
		logger.log(Level.INFO, "reference area {0}: {1} from the pF averages {2}", area.get().getName(), colour, pfValues);
	}

	private static ResourceSnapshot pfAverage(ProviderSnapshot derived) {
		if (derived == null) {
			return null;
		}
		ResourceSnapshot average = derived.getResource("derivedQuantities", PF_AVERAGE);
		return average != null && average.isSet() && average.getValue().getValue() != null ? average : null;
	}

	private static Optional<GeoJsonObject> location(ProviderSnapshot provider) {
		if (provider == null) {
			return Optional.empty();
		}
		ResourceSnapshot location = provider.getResource("admin", "location");
		if (location == null || !location.isSet()) {
			return Optional.empty();
		}
		return Optional.ofNullable((GeoJsonObject) location.getValue().getValue());
	}

	/** Areas, sensors and derived providers with their locations and pF averages; only a new average triggers. */
	record AreaCriterion(Set<String> sensorModels) implements ICriterion {

		@Override
		public java.util.function.BiPredicate<ProviderSnapshot, GeoJsonObject> getLocationFilter() {
			return null;
		}

		@Override
		public Predicate<ProviderSnapshot> getProviderFilter() {
			return provider -> AREA_MODEL.equals(provider.getModelName()) || sensorModels.contains(provider.getModelName())
					|| Derived.isDerived(provider.getName());
		}

		@Override
		public Predicate<org.eclipse.sensinact.core.snapshot.ServiceSnapshot> getServiceFilter() {
			return service -> Set.of("admin", "derivedQuantities", "referenceArea").contains(service.getName());
		}

		@Override
		public Predicate<ResourceSnapshot> getResourceFilter() {
			return resource -> Set.of("location", PF_AVERAGE, "color").contains(resource.getName());
		}

		@Override
		public org.eclipse.sensinact.core.snapshot.ResourceValueFilter getResourceValueFilter() {
			return null;
		}

		@Override
		public Predicate<ResourceDataNotification> dataEventFilter() {
			return event -> PF_AVERAGE.equals(event.resource()) && Derived.isDerived(event.provider());
		}
	}
}
