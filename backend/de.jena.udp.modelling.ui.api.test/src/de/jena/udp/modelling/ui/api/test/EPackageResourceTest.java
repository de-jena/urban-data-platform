/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.udp.modelling.ui.api.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCollection;

import org.eclipse.emf.common.util.EList;
import org.gecko.emf.osgi.example.model.basic.BasicPackage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceObjects;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.jena.upd.modelling.ui.api.modellingApi.EPackageResource;
import jakarta.ws.rs.core.Response;

@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
class EPackageResourceTest {
	@InjectBundleContext BundleContext bundleCtx;
	
	@Test
	void testSave(@InjectService(cardinality = 0) ServiceAware<EPackageResource> eprAware) throws InterruptedException {
		EPackageResource ePackageResource = eprAware.waitForService(1000);
		assertThat(ePackageResource).isNotNull();
		BasicPackage ep = BasicPackage.eINSTANCE;
		Response save = ePackageResource.save(ep);
		assertThat(save.getEntity()).isNotNull();
		
		ePackageResource = getNewEPackageResource(eprAware);
		assertThat(ePackageResource).isNotEqualTo(ePackageResource);
		
		EList<String> ePackages = ePackageResource.loadAll();
		assertThatCollection(ePackages).contains(ep.getNsURI());

		ePackageResource = getNewEPackageResource(eprAware);
		Response delete = ePackageResource.delete(ep.getNsURI());
		assertThat(delete.getEntity()).isNotNull();
		
	}

	private EPackageResource getNewEPackageResource(ServiceAware<EPackageResource> eprAware) {
		ServiceObjects<EPackageResource> serviceObjects = bundleCtx.getServiceObjects(eprAware.getServiceReference());
		return serviceObjects.getService();
	}

}
