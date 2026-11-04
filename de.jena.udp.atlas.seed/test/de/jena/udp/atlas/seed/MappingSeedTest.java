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
package de.jena.udp.atlas.seed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.fennec.event.atlas.model.mapping.AdminMapping;
import org.eclipse.fennec.event.atlas.model.mapping.MappingPackage;
import org.eclipse.fennec.event.atlas.model.mapping.ProviderMapping;
import org.eclipse.fennec.event.atlas.model.mapping.ResourceMapping;
import org.eclipse.fennec.event.atlas.model.mapping.ServiceMapping;
import org.gecko.weather.model.weather.WeatherPackage;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

/**
 * Loads what the Model Atlas loads at startup for scope {@code udp}: the ecores at the root of a
 * seed and the mappings in {@code sensinactmapping/}, against the mapping metamodel, the models
 * the image ships as bundles and the ecores of the seed. The Atlas halts on the first file it
 * cannot load, so one wrong feature name takes the whole scope down; this fails the build instead.
 */
class MappingSeedTest {

	static final List<Path> SEEDS = List.of(
			Path.of("../de.jena.chirpstack.model/eventatlas/seed"),
			Path.of("../de.jena.udp.atlas.dwd/eventatlas/seed"));

	/** The packages the image provides as bundles; a seed must not carry a copy of them. */
	static final Map<String, EPackage> BUNDLED = Map.of(WeatherPackage.eNS_URI, WeatherPackage.eINSTANCE);

	@TestFactory
	Stream<DynamicTest> everySeededEcoreLoads() throws IOException {
		return ecores().map(ecore -> dynamicTest(ecore.toString(), () -> {
			EPackage ePackage = loadEcore(newResourceSet(), ecore);
			assertFalse(BUNDLED.containsKey(ePackage.getNsURI()),
					ecore + " duplicates a model the image ships as a bundle, which would bind the mappings to the copy");
		}));
	}

	@TestFactory
	Stream<DynamicTest> everySeededMappingLoadsAndResolves() throws IOException {
		return mappings().map(xmi -> dynamicTest(xmi.toString(), () -> {
			ProviderMapping mapping = loadMapping(xmi);
			assertNoUnresolvedProxies(mapping.eResource());
			assertNotNull(mapping.getMid(), "mid");
			assertFalse(mapping.getProviderClasses().isEmpty(), "providerClasses");
			assertNotNull(mapping.getName(), "name mapping");
			Set<String> serviceMids = new HashSet<>();
			for (ServiceMapping service : mapping.getServices()) {
				assertTrue(serviceMids.add(service.getMid()), "duplicate service mid " + service.getMid());
				assertTrue(service.getReferencedResource() != null || !service.getResources().isEmpty(),
						"service " + service.getMid() + " maps nothing");
				for (ResourceMapping resource : service.getResources()) {
					assertNotNull(resource.getEType(), service.getMid() + "." + resource.getMid() + " has no eType");
					assertFalse(resource.getValueFeature().isEmpty(), service.getMid() + "." + resource.getMid() + " has no valueFeature");
				}
			}
			AdminMapping admin = mapping.getAdmin();
			if (admin != null) {
				assertEquals(admin.getLatitudeRef().isEmpty(), admin.getLongitudeRef().isEmpty(),
						"latitudeRef and longitudeRef come in pairs");
			}
		}));
	}

	@Test
	void mappingIdsAreUniqueAcrossTheSeeds() throws IOException {
		Set<String> mids = new HashSet<>();
		for (Path xmi : mappings().toList()) {
			String mid = loadMapping(xmi).getMid();
			assertTrue(mids.add(mid), "mid " + mid + " is used twice, the second mapping would replace the first");
		}
	}

	static Stream<Path> ecores() throws IOException {
		return files(SEEDS.stream(), "*.ecore");
	}

	static Stream<Path> mappings() throws IOException {
		return files(SEEDS.stream().map(seed -> seed.resolve("sensinactmapping")), "*.xmi");
	}

	private static Stream<Path> files(Stream<Path> directories, String glob) throws IOException {
		List<Path> found = new java.util.ArrayList<>();
		for (Path directory : directories.toList()) {
			if (Files.isDirectory(directory)) {
				try (Stream<Path> listing = Files.list(directory)) {
					listing.filter(path -> path.getFileSystem().getPathMatcher("glob:" + glob).matches(path.getFileName()))
							.sorted().forEach(found::add);
				}
			}
		}
		assertFalse(found.isEmpty(), "no " + glob + " under " + SEEDS);
		return found.stream();
	}

	/** A resource set that knows the metamodel, the bundled models and every ecore of the seeds. */
	static ResourceSet newResourceSet() throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(MappingPackage.eNS_URI, MappingPackage.eINSTANCE);
		resourceSet.getPackageRegistry().putAll(BUNDLED);
		return resourceSet;
	}

	static ResourceSet seedResourceSet() throws IOException {
		ResourceSet resourceSet = newResourceSet();
		for (Path ecore : ecores().toList()) {
			loadEcore(resourceSet, ecore);
		}
		return resourceSet;
	}

	static EPackage loadEcore(ResourceSet resourceSet, Path ecore) throws IOException {
		Resource resource = resourceSet.getResource(URI.createFileURI(ecore.toAbsolutePath().toString()), true);
		assertTrue(resource.getErrors().isEmpty(), () -> ecore + ": " + resource.getErrors());
		EPackage ePackage = assertInstanceOf(EPackage.class, resource.getContents().get(0));
		resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		return ePackage;
	}

	static ProviderMapping loadMapping(Path xmi) throws IOException {
		Resource resource = seedResourceSet().getResource(URI.createFileURI(xmi.toAbsolutePath().toString()), true);
		assertTrue(resource.getErrors().isEmpty(), () -> xmi + ": " + resource.getErrors());
		EcoreUtil.resolveAll(resource);
		return assertInstanceOf(ProviderMapping.class, resource.getContents().get(0));
	}

	static void assertNoUnresolvedProxies(Resource resource) {
		Map<EObject, ?> unresolved = EcoreUtil.UnresolvedProxyCrossReferencer.find(resource);
		assertTrue(unresolved.isEmpty(), () -> "unresolved references: " + unresolved.keySet().stream()
				.map(proxy -> EcoreUtil.getURI(proxy).toString()).toList());
	}
}
