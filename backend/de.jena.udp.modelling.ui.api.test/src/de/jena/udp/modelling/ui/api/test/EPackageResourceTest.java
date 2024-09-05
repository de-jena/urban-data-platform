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

import org.bson.Document;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.gecko.emf.osgi.example.model.basic.BasicPackage;
import org.gecko.emf.repository.mongo.annotations.RequireMongoEMFRepository;
import org.gecko.mongo.osgi.MongoDatabaseProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceObjects;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import de.jena.upd.modelling.ui.api.modellingApi.EPackageResource;
import jakarta.ws.rs.core.Response;

@RequireMongoEMFRepository
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
class EPackageResourceTest {

	@InjectBundleContext
	BundleContext bundleCtx;

	BasicPackage bp = BasicPackage.eINSTANCE;

	@BeforeEach
	void setup(@InjectService(cardinality = 0) ServiceAware<MongoDatabaseProvider> mdpAware)
			throws InterruptedException {
		MongoDatabaseProvider mongoDatabaseProvider = mdpAware.waitForService(1000);
		if (mongoDatabaseProvider != null) {
			MongoDatabase database = mongoDatabaseProvider.getDatabase();
			database.drop();
		}
	}

	@Test
	void testSaveDelete(@InjectService(cardinality = 0) ServiceAware<EPackageResource> eprAware,
			@InjectService(cardinality = 0) MongoDatabaseProvider mdp) {
		MongoDatabase database = mdp.getDatabase();
		MongoCollection<Document> collection = database.getCollection("EPackage");
		assertThat(collection).isNotNull();
		assertThat(collection.countDocuments()).isEqualTo(0);

		EPackageResource ePackageResource = getNewEPackageResource(eprAware);
		assertThat(ePackageResource).isNotNull();
		Response save = ePackageResource.save(bp);
		assertThat(save.getEntity()).isNotNull();

		assertThat(collection.countDocuments()).isEqualTo(1);

		ePackageResource = getNewEPackageResource(eprAware);
		Response delete = ePackageResource.delete(bp.getNsURI());
		assertThat(delete.getEntity()).isNotNull();

		assertThat(collection.countDocuments()).isEqualTo(0);
	}

	@Test
	void testLoadAll(@InjectService(cardinality = 0) ServiceAware<EPackageResource> eprAware) {
		EPackageResource ePackageResource = getNewEPackageResource(eprAware);
		EList<String> ePackages = ePackageResource.loadAll();
		assertThatCollection(ePackages).size().isEqualTo(0);

		ePackageResource.save(bp);

		ePackages = ePackageResource.loadAll();
		assertThatCollection(ePackages).size().isEqualTo(1);
		assertThatCollection(ePackages).contains(bp.getNsURI());
	}

	@Test
	void testExists(@InjectService(cardinality = 0) ServiceAware<EPackageResource> eprAware) {
		EPackageResource ePackageResource = getNewEPackageResource(eprAware);
//		Response response = ePackageResource.exists(bp.getNsURI());
//		assertThat(response.getEntity()).isEqualTo(false);

		ePackageResource.save(bp);

		Response response = ePackageResource.exists(bp.getNsURI());
		assertThat(response.getEntity()).isEqualTo(true);
	}

	@Test
	void testLoadEcorePackage(@InjectService(cardinality = 0) ServiceAware<EPackageResource> eprAware)
			throws InterruptedException {
		EPackageResource epr = eprAware.waitForService(1000);
		assertThat(epr).isNotNull();

		// comes from PackageRegistry
		EPackage eCore = epr.load(EcorePackage.eINSTANCE.getNsURI());
		assertThat(eCore).isNotNull();

		epr = getNewEPackageResource(eprAware);
		Response delete = epr.delete(EcorePackage.eINSTANCE.getNsURI());
		assertThat(delete.getEntity()).isNull();

		// can't delete
		epr = getNewEPackageResource(eprAware);
		assertThat(epr.load(EcorePackage.eINSTANCE.getNsURI())).isNotNull();
	}

	private EPackageResource getNewEPackageResource(ServiceAware<EPackageResource> eprAware) {
		ServiceObjects<EPackageResource> serviceObjects = bundleCtx.getServiceObjects(eprAware.getServiceReference());
		return serviceObjects.getService();
	}

}
