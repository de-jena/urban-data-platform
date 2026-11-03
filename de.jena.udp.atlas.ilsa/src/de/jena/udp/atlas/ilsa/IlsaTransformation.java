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

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.fennec.emf.osgi.ResourceSetFactory;
import org.eclipse.fennec.m2x.model.qvtoperational.OperationalTransformation;
import org.eclipse.fennec.m2x.ocl.api.OclConfiguration;
import org.eclipse.fennec.m2x.ocl.parser.OclParserSupport;
import org.eclipse.fennec.m2x.qvto.api.BasicQvtoBlackboxRegistry;
import org.eclipse.fennec.m2x.qvto.api.BasicQvtoModelExtent;
import org.eclipse.fennec.m2x.qvto.api.QvtoConfiguration;
import org.eclipse.fennec.m2x.qvto.api.QvtoEngine;
import org.eclipse.fennec.m2x.qvto.api.QvtoExecutionContext;
import org.eclipse.fennec.m2x.qvto.api.QvtoExecutionResult;
import org.eclipse.fennec.m2x.qvto.api.QvtoParseException;
import org.eclipse.fennec.m2x.qvto.engine.QvtoEngines;
import org.eclipse.sensinact.model.core.provider.ProviderPackage;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.jena.ilsa.sensinact.model.ilsa.Ilsa;
import de.jena.ilsa.sensinact.model.ilsa.IlsaPackage;
import de.jena.udp.model.geojson.GeojsonPackage;
import de.jena.udp.model.trafficos.common.TOSCommonPackage;
import de.jena.udp.model.trafficos.trafficlight.TLConfiguration;
import de.jena.udp.model.trafficos.trafficlight.TOSTrafficLightPackage;

/** Runs transformations/ilsa.qvto: a {@link TLConfiguration} becomes an {@link Ilsa} provider. */
@Component(service = IlsaTransformation.class)
public class IlsaTransformation {

	static final String TRANSFORMATION = "transformations/ilsa.qvto";

	@Reference
	private ResourceSetFactory resourceSetFactory;

	// the metamodels of the transformation, referenced so the engine is built after their bundles
	// registered them (the trafficos models come through the gecko compatibility wrapper)
	@Reference
	private TOSTrafficLightPackage trafficLightPackage;
	@Reference
	private TOSCommonPackage commonPackage;
	@Reference
	private GeojsonPackage geojsonPackage;
	@Reference
	private IlsaPackage ilsaPackage;
	@Reference
	private ProviderPackage providerPackage;

	private QvtoEngine engine;
	private OperationalTransformation transformation;

	@Activate
	void activate() throws IOException, QvtoParseException {
		EPackage.Registry registry = new EPackageRegistryImpl(resourceSetFactory.createResourceSet().getPackageRegistry());
		for (EPackage ePackage : List.of(trafficLightPackage, commonPackage, geojsonPackage, ilsaPackage, providerPackage)) {
			registry.put(ePackage.getNsURI(), ePackage);
		}
		engine = createEngine(registry);
		transformation = engine.parse(loadSource(), "TrafficLightToIlsa");
	}

	/** For tests that bring their own registry and transformation source. */
	IlsaTransformation(EPackage.Registry packageRegistry, String source) throws QvtoParseException {
		engine = createEngine(packageRegistry);
		transformation = engine.parse(source, "TrafficLightToIlsa");
	}

	public IlsaTransformation() {
	}

	private static QvtoEngine createEngine(EPackage.Registry packageRegistry) {
		BasicQvtoBlackboxRegistry blackboxes = new BasicQvtoBlackboxRegistry();
		blackboxes.register(new GeoJsonBlackBox());
		return QvtoEngines.create(QvtoConfiguration
				.builder(OclConfiguration.builder(new OclParserSupport()).build())
				.packageRegistry(packageRegistry)
				.blackboxRegistry(blackboxes)
				.blackboxEnabled(true)
				.build());
	}

	private static String loadSource() throws IOException {
		try (InputStream in = IlsaTransformation.class.getClassLoader().getResourceAsStream(TRANSFORMATION)) {
			if (in == null) {
				throw new IOException("missing " + TRANSFORMATION);
			}
			return new String(in.readAllBytes(), StandardCharsets.UTF_8);
		}
	}

	public Ilsa transform(TLConfiguration configuration) {
		BasicQvtoModelExtent in = new BasicQvtoModelExtent(configuration);
		BasicQvtoModelExtent out = new BasicQvtoModelExtent();
		QvtoExecutionResult result = engine.execute(transformation, QvtoExecutionContext.of(in, out));
		if (!result.isSuccess()) {
			throw new IllegalStateException("ILSA transformation failed: " + result.diagnostics());
		}
		for (EObject root : out.getContents()) {
			if (root instanceof Ilsa ilsa) {
				return ilsa;
			}
		}
		throw new IllegalStateException("ILSA transformation produced no Ilsa provider");
	}
}
