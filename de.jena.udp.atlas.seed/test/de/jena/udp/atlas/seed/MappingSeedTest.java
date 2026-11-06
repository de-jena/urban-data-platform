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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
import org.eclipse.fennec.event.atlas.model.mapping.MappingProfile;
import org.eclipse.fennec.event.atlas.model.mapping.ProviderMapping;
import org.eclipse.fennec.event.atlas.model.mapping.ResourceMapping;
import org.eclipse.fennec.event.atlas.model.mapping.ServiceMapping;
import org.eclipse.fennec.event.atlas.model.mapping.ValueMapping;
import org.eclipse.sensinact.model.core.provider.ProviderPackage;
import org.gecko.weather.model.weather.WeatherPackage;

import de.jena.traficam.TrafiCamPackage;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage;
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
			Path.of("../de.jena.udp.atlas.dwd/eventatlas/seed"),
			Path.of("../de.jena.udp.atlas.traficam/eventatlas/seed"));

	/**
	 * The packages the image provides as bundles; a seed must not carry a copy of them.
	 * <p>
	 * A mapping resolves its {@code providerClasses}, feature paths and {@code serviceEClass}
	 * against these, so every nsURI a seeded mapping names has to be here or be seeded as an
	 * ecore beside it. TrafiCam's two models and sensiNact's provider model are bundles of the
	 * image (see the runbundles of de.jena.udp.atlas.runtime.docker.bndrun), which is why they
	 * appear here rather than under a seed.
	 */
	static final Map<String, EPackage> BUNDLED = Map.of(
			WeatherPackage.eNS_URI, WeatherPackage.eINSTANCE,
			ProviderPackage.eNS_URI, ProviderPackage.eINSTANCE,
			TrafiCamPackage.eNS_URI, TrafiCamPackage.eINSTANCE,
			TraficamproviderPackage.eNS_URI, TraficamproviderPackage.eINSTANCE);

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
				EClass serviceEClass = service.getServiceEClass();
				for (ResourceMapping resource : service.getResources()) {
					String where = service.getMid() + "." + resource.getMid();
					if (serviceEClass == null) {
						// An untyped service is built from its resource mappings, so each one
						// has to say what it is.
						assertNotNull(resource.getEType(), where + " has no eType");
					} else {
						// A typed service takes the types from its EClass, and
						// ProviderMappingRegistryImpl.refusedTypedServices REFUSES the whole
						// mapping when a resource mid is not a feature of it.
						assertNotNull(serviceEClass.getEStructuralFeature(resource.getMid()),
								where + " is no feature of " + serviceEClass.getName() + ", which has "
										+ serviceEClass.getEAllAttributes().stream().map(EAttribute::getName).toList());
					}
					assertTrue(hasValueSource(resource), where + " names no value source");
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

	/**
	 * Every profile the Atlas loads into the {@code sensinactprofile} registry. A profile that
	 * does not load takes the scope down exactly as a mapping does, and a mapping whose profile
	 * is missing is skipped at registration rather than registered profile-less.
	 */
	@TestFactory
	Stream<DynamicTest> everySeededProfileLoads() throws IOException {
		return profiles().map(xmi -> dynamicTest(xmi.toString(), () -> {
			MappingProfile profile = loadProfile(xmi);
			assertNoUnresolvedProxies(profile.eResource());
			assertNotNull(profile.getProfileId(), "profileId");
			assertNotNull(profile.getProvider(), "provider");
			assertNotNull(profile.getProvider().getProviderId(), "providerId");
		}));
	}

	@Test
	void profileIdsAreUniqueAcrossTheSeeds() throws IOException {
		Set<String> profileIds = new HashSet<>();
		for (Path xmi : profiles().toList()) {
			String profileId = loadProfile(xmi).getProfileId();
			assertTrue(profileIds.add(profileId), "profileId " + profileId + " is used twice");
		}
	}

	/**
	 * Every profile a mapping names is one of the seeded profiles. At runtime the reference is
	 * resolved by {@code profileId} through the profile registry, so a fragment that matches no
	 * deployed profile silently costs the mapping its registration.
	 */
	@Test
	void everyProfileAMappingNamesIsSeeded() throws IOException {
		Set<String> seeded = new HashSet<>();
		for (Path xmi : profiles().toList()) {
			seeded.add(loadProfile(xmi).getProfileId());
		}
		for (Path xmi : mappings().toList()) {
			MappingProfile profile = loadMapping(xmi).getProfile();
			if (profile != null) {
				assertTrue(seeded.contains(profile.getProfileId()),
						xmi + " names profile " + profile.getProfileId() + ", which no seed declares");
			}
		}
	}

	/**
	 * Whether a resource mapping says where its value comes from. {@code valueFeature} is the
	 * plain feature path; {@code valueMapping} is the richer form that adds an expression, a
	 * function or a constant, and it wins where both are set. Either one is a value source -
	 * neither is not.
	 */
	static boolean hasValueSource(ResourceMapping resource) {
		if (!resource.getValueFeature().isEmpty()) {
			return true;
		}
		ValueMapping valueMapping = resource.getValueMapping();
		return valueMapping != null && (!valueMapping.getFeaturePath().isEmpty()
				|| isSet(valueMapping.getExpression())
				|| isSet(valueMapping.getFunctionId())
				|| isSet(valueMapping.getValue()));
	}

	static boolean isSet(String value) {
		return value != null && !value.isBlank();
	}

	static Stream<Path> profiles() throws IOException {
		return files(SEEDS.stream().map(seed -> seed.resolve("sensinactprofile")), "*.xmi");
	}

	static MappingProfile loadProfile(Path xmi) throws IOException {
		Resource resource = seedResourceSet().getResource(URI.createFileURI(xmi.toAbsolutePath().toString()), true);
		assertTrue(resource.getErrors().isEmpty(), () -> xmi + ": " + resource.getErrors());
		EcoreUtil.resolveAll(resource);
		return assertInstanceOf(MappingProfile.class, resource.getContents().get(0));
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
