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
package de.jena.udp.atlas.ilsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.model.core.provider.ProviderPackage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.jena.ilsa.sensinact.model.ilsa.Ilsa;
import de.jena.ilsa.sensinact.model.ilsa.IlsaPackage;
import de.jena.ilsa.sensinact.model.ilsa.Signal;
import de.jena.udp.model.geojson.Feature;
import de.jena.udp.model.geojson.GeojsonFactory;
import de.jena.udp.model.geojson.GeojsonPackage;
import de.jena.udp.model.geojson.Polygon;
import de.jena.udp.model.trafficos.common.TOSCommonPackage;
import de.jena.udp.model.trafficos.trafficlight.SerialPort;
import de.jena.udp.model.trafficos.trafficlight.SignalType;
import de.jena.udp.model.trafficos.trafficlight.Subcircle;
import de.jena.udp.model.trafficos.trafficlight.TLConfiguration;
import de.jena.udp.model.trafficos.trafficlight.TLModule;
import de.jena.udp.model.trafficos.trafficlight.TLSignal;
import de.jena.udp.model.trafficos.trafficlight.TLSignalGroup;
import de.jena.udp.model.trafficos.trafficlight.TOSTrafficLightFactory;
import de.jena.udp.model.trafficos.trafficlight.TOSTrafficLightPackage;

class IlsaTransformationTest {

	private IlsaTransformation transformation;

	@BeforeEach
	void createTransformation() throws Exception {
		EPackage.Registry registry = new EPackageRegistryImpl();
		for (EPackage ePackage : new EPackage[] { TOSTrafficLightPackage.eINSTANCE, TOSCommonPackage.eINSTANCE,
				GeojsonPackage.eINSTANCE, IlsaPackage.eINSTANCE, ProviderPackage.eINSTANCE }) {
			registry.put(ePackage.getNsURI(), ePackage);
		}
		transformation = new IlsaTransformation(registry, Files.readString(Path.of(IlsaTransformation.TRANSFORMATION)));
	}

	@Test
	void intersectionBecomesProviderWithOneServicePerSignal() {
		TLConfiguration felsenkeller = intersection("K440", "Felsenkeller", "K1/1", "K1/2", "F1/1");

		Ilsa provider = transformation.transform(felsenkeller);

		assertEquals("K440", provider.getId());
		assertEquals("ILSA Felsenkeller", provider.getAdmin().getFriendlyName());
		assertEquals(3, provider.getServices().size());
		assertTrue(provider.getServices().containsKey("K1_1"));
		assertTrue(provider.getServices().containsKey("F1_1"));
	}

	@Test
	void observedAreaOfASignalBecomesASensinactFeatureCollection() {
		TLConfiguration intersection = intersection("K413", "Löbdergraben", "K3/1");

		Signal signal = (Signal) transformation.transform(intersection).getServices().get("K3_1");

		FeatureCollection observedArea = assertInstanceOf(FeatureCollection.class, signal.getObservedArea());
		assertEquals(1, observedArea.features().size());
		assertInstanceOf(org.eclipse.sensinact.gateway.geojson.Polygon.class, observedArea.features().get(0).geometry());
	}

	static TLConfiguration intersection(String id, String name, String... signalIds) {
		TOSTrafficLightFactory factory = TOSTrafficLightFactory.eINSTANCE;
		TLConfiguration configuration = factory.createTLConfiguration();
		configuration.setIntersectionId(id);
		configuration.setIntersectionName(name);
		Subcircle subcircle = factory.createSubcircle();
		SerialPort serialPort = factory.createSerialPort();
		TLModule module = factory.createTLModule();
		for (String signalId : signalIds) {
			TLSignal signal = factory.createTLSignal();
			signal.setId(signalId);
			signal.setSignalType(SignalType.RED_AMBER_GREEN);
			TLSignalGroup group = factory.createTLSignalGroup();
			group.setId(signalId.substring(0, signalId.indexOf('/')));
			signal.setSignalGroup(group);
			signal.setObservedArea(squareAround(11.58, 50.92));
			module.getSignals().add(signal);
		}
		serialPort.getModules().add(module);
		subcircle.getSerialPorts().add(serialPort);
		configuration.getSubcircles().add(subcircle);
		return configuration;
	}

	static de.jena.udp.model.geojson.FeatureCollection squareAround(double lon, double lat) {
		GeojsonFactory geojson = GeojsonFactory.eINSTANCE;
		Polygon polygon = geojson.createPolygon();
		polygon.getCoordinates().add(new Double[][] { { lon, lat }, { lon + 0.001, lat }, { lon + 0.001, lat + 0.001 },
				{ lon, lat } });
		Feature feature = geojson.createFeature();
		feature.setGeometry(polygon);
		feature.getProperties().put("signal_type", "K");
		de.jena.udp.model.geojson.FeatureCollection area = geojson.createFeatureCollection();
		area.getFeatures().add(feature);
		return area;
	}
}
