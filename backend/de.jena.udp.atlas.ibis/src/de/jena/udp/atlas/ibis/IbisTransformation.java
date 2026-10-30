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
package de.jena.udp.atlas.ibis;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
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
import org.eclipse.sensinact.model.core.provider.Service;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.jena.model.ibis.common.IbisCommonPackage;
import de.jena.model.ibis.customerinformationservice.IbisCustomerInformationServicePackage;
import de.jena.model.ibis.enumerations.IbisEnumerationsPackage;
import de.jena.model.ibis.gnsslocationservice.IbisGNSSLocationServicePackage;
import de.jena.model.ibis.ticketvalidationservice.IbisTicketValidationServicePackage;
import de.jena.model.sensinact.ibis.IbisSensinactPackage;

/** Runs transformations/ibis.qvto: an IBIS service response becomes one IbisDevice service. */
@Component(service = IbisTransformation.class)
public class IbisTransformation {

	static final String TRANSFORMATION = "transformations/ibis.qvto";

	@Reference
	private ResourceSetFactory resourceSetFactory;

	// the metamodels of the transformation, referenced so the engine is built after their bundles
	// registered them (the IBIS-IP models come through the gecko compatibility wrapper)
	@Reference
	private IbisCommonPackage commonPackage;
	@Reference
	private IbisEnumerationsPackage enumerationsPackage;
	@Reference
	private IbisCustomerInformationServicePackage customerInformationPackage;
	@Reference
	private IbisGNSSLocationServicePackage gnssLocationPackage;
	@Reference
	private IbisTicketValidationServicePackage ticketValidationPackage;
	@Reference
	private IbisSensinactPackage ibisPackage;
	@Reference
	private ProviderPackage providerPackage;

	private QvtoEngine engine;
	private OperationalTransformation transformation;

	@Activate
	void activate() throws IOException, QvtoParseException {
		EPackage.Registry registry = new EPackageRegistryImpl(resourceSetFactory.createResourceSet().getPackageRegistry());
		for (EPackage ePackage : List.of(EcorePackage.eINSTANCE, commonPackage, enumerationsPackage,
				customerInformationPackage, gnssLocationPackage, ticketValidationPackage, ibisPackage, providerPackage)) {
			registry.put(ePackage.getNsURI(), ePackage);
		}
		engine = createEngine(registry);
		transformation = engine.parse(loadSource(), "IbisToSensinact");
	}

	/** For tests that bring their own registry and transformation source. */
	IbisTransformation(EPackage.Registry packageRegistry, String source) throws QvtoParseException {
		engine = createEngine(packageRegistry);
		transformation = engine.parse(source, "IbisToSensinact");
	}

	public IbisTransformation() {
	}

	private static QvtoEngine createEngine(EPackage.Registry packageRegistry) {
		BasicQvtoBlackboxRegistry blackboxes = new BasicQvtoBlackboxRegistry();
		blackboxes.register(new IbisDateBlackBox());
		return QvtoEngines.create(QvtoConfiguration
				.builder(OclConfiguration.builder(new OclParserSupport()).build())
				.packageRegistry(packageRegistry)
				.blackboxRegistry(blackboxes)
				.blackboxEnabled(true)
				.build());
	}

	private static String loadSource() throws IOException {
		try (InputStream in = IbisTransformation.class.getClassLoader().getResourceAsStream(TRANSFORMATION)) {
			if (in == null) {
				throw new IOException("missing " + TRANSFORMATION);
			}
			return new String(in.readAllBytes(), StandardCharsets.UTF_8);
		}
	}

	/** The IbisDevice service for a response, empty when the transformation has no mapping for it. */
	public Optional<Service> transform(EObject response) {
		BasicQvtoModelExtent in = new BasicQvtoModelExtent(response);
		BasicQvtoModelExtent out = new BasicQvtoModelExtent();
		QvtoExecutionResult result = engine.execute(transformation, QvtoExecutionContext.of(in, out));
		if (!result.isSuccess()) {
			throw new IllegalStateException("IBIS transformation failed: " + result.diagnostics());
		}
		return out.getContents().stream()
				.filter(Service.class::isInstance)
				.map(Service.class::cast)
				.findFirst();
	}
}
