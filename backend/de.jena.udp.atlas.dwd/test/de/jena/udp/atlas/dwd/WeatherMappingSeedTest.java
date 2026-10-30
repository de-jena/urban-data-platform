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
package de.jena.udp.atlas.dwd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.fennec.event.atlas.model.mapping.MappingPackage;
import org.eclipse.fennec.event.atlas.model.mapping.ProviderMapping;
import org.eclipse.fennec.event.atlas.model.mapping.ServiceMapping;
import org.gecko.weather.model.weather.WeatherPackage;
import org.junit.jupiter.api.Test;

/** The seed is the legacy mapping rewritten to the Event Atlas metamodel; it must still resolve. */
class WeatherMappingSeedTest {

	private static final String SEED = "eventatlas/seed/sensinactmapping/WeatherReportsProviderMapping.xmi";

	@Test
	void theSeedMapsWeatherReportsToTheForecastProvider() throws IOException {
		ProviderMapping mapping = loadSeed();

		assertEquals("dwd-weather-reports", mapping.getMid());
		assertEquals(List.of(WeatherPackage.Literals.WEATHER_REPORTS), mapping.getProviderClasses());
		assertEquals(WeatherPackage.Literals.WEATHER_STATION__ID,
				mapping.getName().getFeaturePath().get(mapping.getName().getFeaturePath().size() - 1));
		assertEquals(50.9271, mapping.getAdmin().getLatitude());
		assertEquals(11.5892, mapping.getAdmin().getLongitude());
	}

	@Test
	void theSeedCoversTheCurrentWeatherAndThreeDaysOfThreeHourSteps() throws IOException {
		List<String> services = loadSeed().getServices().stream().map(ServiceMapping::getMid).toList();

		assertEquals(25, services.size());
		assertEquals("currentWeather", services.get(0));
		assertEquals("forecast3H", services.get(1));
		assertEquals("forecast72H", services.get(24));
	}

	@Test
	void everyReferenceOfTheSeedResolves() throws IOException {
		Resource resource = loadSeed().eResource();

		Map<EObject, ?> unresolved = EcoreUtil.UnresolvedProxyCrossReferencer.find(resource);

		assertTrue(unresolved.isEmpty(), () -> "unresolved: " + unresolved.keySet());
	}

	private static ProviderMapping loadSeed() throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(MappingPackage.eNS_URI, MappingPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(WeatherPackage.eNS_URI, WeatherPackage.eINSTANCE);
		Resource resource = resourceSet.getResource(URI.createFileURI(SEED), true);
		EcoreUtil.resolveAll(resource);
		return (ProviderMapping) resource.getContents().get(0);
	}
}
