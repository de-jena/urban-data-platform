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
package de.jena.udp.modelling.ui;

import static org.assertj.core.api.Assertions.assertThat;
import static org.gecko.emf.osgi.mocktest.EMFArgumentMatchers.eqEObject;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.osgi.example.model.basic.Address;
import org.gecko.emf.osgi.example.model.basic.BasicFactory;
import org.gecko.emf.osgi.example.model.basic.BasicPackage;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.IQueryBuilder;
import org.gecko.emf.repository.query.QueryRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.PrototypeServiceFactory;
import org.osgi.framework.ServiceRegistration;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.jena.upd.modelling.ui.api.modellingApi.EObjectResource;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(MockitoExtension.class)
public class EObjectResourceImplTest {

	private static final String ADDRESS_CLASS_URI = EcoreUtil.getURI(BasicPackage.Literals.ADDRESS).toString();
	private static final BasicPackage bp = BasicPackage.eINSTANCE;

	private static final String ID = "address1";
	private static final Address address = BasicFactory.eINSTANCE.createAddress();

	private static final EParameter parameter = EcoreFactory.eINSTANCE.createEParameter();
	private ServiceRegistration<QueryRepository> repoRegistration;
	@InjectBundleContext
	BundleContext bundleCtx;
	@Mock
	private ResourceSet rs;
	@Mock
	private Registry registry;

	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx, @Mock QueryRepository repoMock) {
		Dictionary<String, Object> options = new Hashtable<>();
		options.put(Constants.SERVICE_RANKING, Integer.valueOf(1000));
		options.put("repo_id", "de.jena.modelling");

		repoRegistration = ctx.registerService(QueryRepository.class, new PrototypeServiceFactory<QueryRepository>() {
			@Override
			public QueryRepository getService(Bundle bundle, ServiceRegistration<QueryRepository> registration) {
				return repoMock;
			}

			@Override
			public void ungetService(Bundle bundle, ServiceRegistration<QueryRepository> registration,
					QueryRepository service) {
			}
		}, options);
		address.setId(ID);
	}

	@AfterEach
	public void after() {
		repoRegistration.unregister();
	}

	@Test
	void testSave(@InjectService QueryRepository repo, @InjectService EObjectResource or) {
		or.save(address);

		verify(repo).save(eqEObject(address));
	}

	@Test
	void testSaveAll(@InjectService QueryRepository repo, @InjectService EObjectResource or) {
		EList<EObject> objects = or.saveAll(ECollections.asEList(address, parameter));

		assertThat(objects).size().isEqualTo(2);

		ArgumentCaptor<EObject> captor = ArgumentCaptor.forClass(EObject.class);
		verify(repo, times(2)).save(captor.capture());
		assertThat(captor.getAllValues()).contains(address, parameter);
	}

	@Test
	void testLoadFromRepo(@InjectService QueryRepository repo, @InjectService EObjectResource or) {
		when(repo.getEObject(EcorePackage.Literals.EPACKAGE, bp.getNsURI())).thenReturn(bp);
		when(repo.getEObject(BasicPackage.Literals.ADDRESS, ID)).thenReturn(address);

		EObject result = or.load(ADDRESS_CLASS_URI, ID);

		assertThat(result).isEqualTo(address);
	}

	@Test
	void testLoadAll(@InjectService QueryRepository repo, @InjectService EObjectResource or, @Mock IQueryBuilder queryBuild,
			@Mock IQuery query) {
		when(repo.getEObject(EcorePackage.Literals.EPACKAGE, bp.getNsURI())).thenReturn(bp);
		when(repo.getEObjectsByQuery(BasicPackage.Literals.ADDRESS, query)).thenReturn(ECollections.asEList(address));
		when(repo.createQueryBuilder()).thenReturn(queryBuild);
		when(queryBuild.build()).thenReturn(query);

		EList<EObject> result = or.loadAll(ADDRESS_CLASS_URI,
				ECollections.asEList(BasicPackage.Literals.ADDRESS__CITY.getName()));

		assertThat(result).containsExactly(address);
		verify(queryBuild).projectionPath(BasicPackage.Literals.ADDRESS__CITY);
	}

	@Test
	void testDelete(@InjectService QueryRepository repo, @InjectService EObjectResource or) {
		when(repo.getEObject(EcorePackage.Literals.EPACKAGE, bp.getNsURI())).thenReturn(bp);
		when(repo.getEObject(BasicPackage.Literals.ADDRESS, ID)).thenReturn(address);

		Response response = or.delete(ADDRESS_CLASS_URI, ID);

		assertThat(response.getStatusInfo()).isEqualTo(Status.OK);
		verify(repo).delete(address);
	}

	@Test
	void testExist(@InjectService QueryRepository repo, @InjectService EObjectResource or) {
		when(repo.getEObject(EcorePackage.Literals.EPACKAGE, bp.getNsURI())).thenReturn(bp);
		when(repo.getEObject(BasicPackage.Literals.ADDRESS, ID)).thenReturn(address);

		Response exists = or.exists(ADDRESS_CLASS_URI, ID);

		assertThat(exists.getStatusInfo()).isEqualTo(Status.OK);
	}
}
