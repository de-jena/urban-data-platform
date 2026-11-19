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
package de.jena.udp.atlas.traficam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
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
import org.eclipse.fennec.event.atlas.mapping.SourceFilter;
import org.eclipse.fennec.event.atlas.model.mapping.MappingPackage;
import org.eclipse.fennec.event.atlas.model.mapping.ProviderMapping;
import org.junit.jupiter.api.Test;

import de.jena.traficam.TrafiCamPackage;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage;
import io.cloudevents.model.ce.CloudEventsPackage;

/**
 * The envelope-rooted seeds, read the way the runtime reads them.
 * <p>
 * What is asserted here is what an XMI file can get wrong on its own: that it parses, that
 * every href resolves, and that the configuration selector really carries the <em>two</em>
 * source filters its one attribute is written as - a many-valued attribute that silently
 * stayed one value would select half of what the mapping says it selects.
 */
class TrafiCamMappingSeedTest {

	private static final String SEEDS = "eventatlas/seed/sensinactmapping/";
	private static final String CONFIG_SEED = SEEDS + "traficam-config-ce-mapping.xmi";
	private static final String DETECTIONS_SEED = SEEDS + "traficam-detections-ce-mapping.xmi";

	@Test
	void theConfigurationSeedSelectsBothTopicsACameraPublishesItsConfigurationOn() throws IOException {
		ProviderMapping mapping = load(CONFIG_SEED);

		assertEquals("traficam-config-ce", mapping.getMid());
		assertEquals(List.of("5g/config/traficam/#", "5g/traficam/+/config/retained"),
				mapping.getSelector().getSource());
		assertEquals(TrafiCamPackage.eNS_URI + "#//CamConfig", mapping.getSelector().getDataschema());
	}

	/** Both filters have to be filters, and each has to match only its own topic. */
	@Test
	void eachSourceFilterMatchesTheTopicItIsThereFor() throws IOException {
		List<SourceFilter> filters = load(CONFIG_SEED).getSelector().getSource().stream()
				.map(SourceFilter::compile).toList();

		assertTrue(filters.get(0).matches("5g/config/traficam/cam1"));
		assertFalse(filters.get(0).matches("5g/traficam/cam1/config/retained"));
		assertTrue(filters.get(1).matches("5g/traficam/cam1/config/retained"));
		assertFalse(filters.get(1).matches("5g/traficam/cam1/2"));
	}

	/**
	 * The camera is the fourth segment of one topic and the third of the other, so the name
	 * is an expression rather than a path - and an attribute written across lines is one line
	 * of OCL by the time it is read.
	 */
	@Test
	void theNameExpressionReadsTheCameraOffEitherTopic() throws IOException {
		String expression = load(CONFIG_SEED).getName().getExpression();

		assertEquals("if self.source.tokenize('/')->at(2) = 'config' "
				+ "then self.source.tokenize('/')->at(4) "
				+ "else self.source.tokenize('/')->at(3) endif", expression);
	}

	/**
	 * The friendly name reads the same camera as the provider name, so it asks the same
	 * question first: at(4) alone would read 'config' off the retained topic.
	 */
	@Test
	void theFriendlyNameReadsTheCameraOffEitherTopicToo() throws IOException {
		String expression = load(CONFIG_SEED).getAdmin().getFriendlyNameMapping().getExpression();

		assertEquals("if self.source.tokenize('/')->at(2) = 'config' "
				+ "then 'Camera ' + self.source.tokenize('/')->at(4) "
				+ "else 'Camera ' + self.source.tokenize('/')->at(3) endif", expression);
	}

	/** The detections flow reads the camera off its own topic, which is a different index. */
	@Test
	void theDetectionsSeedKeepsItsOwnSourceAndIndex() throws IOException {
		ProviderMapping mapping = load(DETECTIONS_SEED);

		assertEquals(List.of("5g/traficam/#"), mapping.getSelector().getSource());
		assertEquals("self.source.tokenize('/')->at(3)", mapping.getName().getExpression());
		// its own 5g/traficam/# covers the retained configuration topic as well, so the
		// schema is what keeps a CamConfig out of it
		assertEquals(TrafiCamPackage.eNS_URI + "#//TrafiCamDetections", mapping.getSelector().getDataschema());
	}

	@Test
	void everyReferenceOfTheSeedsResolves() throws IOException {
		for (String seed : List.of(CONFIG_SEED, DETECTIONS_SEED)) {
			Resource resource = load(seed).eResource();

			Map<EObject, ?> unresolved = EcoreUtil.UnresolvedProxyCrossReferencer.find(resource);

			assertTrue(unresolved.isEmpty(), () -> seed + " leaves unresolved: " + unresolved.keySet());
		}
	}

	private static ProviderMapping load(String seed) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(MappingPackage.eNS_URI, MappingPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(TrafiCamPackage.eNS_URI, TrafiCamPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(TraficamproviderPackage.eNS_URI, TraficamproviderPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(CloudEventsPackage.eNS_URI, CloudEventsPackage.eINSTANCE);
		// absolute, because the profile href is relative to the seed and EMF cannot resolve
		// a relative reference against a relative base
		Resource resource = resourceSet.getResource(URI.createFileURI(new File(seed).getAbsolutePath()), true);
		EcoreUtil.resolveAll(resource);
		return (ProviderMapping) resource.getContents().get(0);
	}
}
