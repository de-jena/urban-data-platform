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

import static de.jena.udp.modelling.ui.EMFArgumentMatchers.eqEObject;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.osgi.example.model.basic.BasicPackage;
import org.gecko.emf.repository.EMFRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
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

import de.jena.upd.modelling.ui.api.modellingApi.EPackageResource;
import jakarta.ws.rs.core.Response;

@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(MockitoExtension.class)
public class EPackageResourceImplTest {

	private static final Map<String, EAttribute> OPTIONS = Collections.singletonMap("OVERWRITE_PRIMARY_KEY_EATTRIBUTE",
			EcorePackage.Literals.EPACKAGE__NS_URI);
	private static final BasicPackage bp = BasicPackage.eINSTANCE;
	private ServiceRegistration<EMFRepository> repoRegistration;
	@InjectBundleContext
	BundleContext bundleCtx;
	@Mock
	private ResourceSet rs;
	@Mock
	private Registry registry;

	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx, @Mock EMFRepository repoMock) {
		Dictionary<String, Object> options = new Hashtable<>();
		options.put(Constants.SERVICE_RANKING, Integer.valueOf(1000));
		options.put("repo_id", "de.jena.modelling");

		repoRegistration = ctx.registerService(EMFRepository.class, new PrototypeServiceFactory<EMFRepository>() {
			@Override
			public EMFRepository getService(Bundle bundle, ServiceRegistration<EMFRepository> registration) {
				return repoMock;
			}

			@Override
			public void ungetService(Bundle bundle, ServiceRegistration<EMFRepository> registration,
					EMFRepository service) {
			}
		}, options);
	}

	@AfterEach
	public void after() {
		repoRegistration.unregister();
	}

	@Test
	void testSave(@InjectService EMFRepository repo, @InjectService EPackageResource pr) {
		pr.save(bp);

		verify(repo).save(eqEObject(bp), eq(OPTIONS));
		verify(repo).detach(eqEObject(bp));
	}

	@Test
	void testSaveAll(@InjectService EMFRepository repo, @InjectService EPackageResource pr) {
		Response response = pr.saveAll(ECollections.asEList(bp, EcorePackage.eINSTANCE));

		assertThat(response.getEntity()).isInstanceOf(EList.class).asList().size().isEqualTo(2);

		verify(repo).save(eqEObject(bp), eq(OPTIONS));
		verify(repo).detach(eqEObject(bp));
		verify(repo).save(eqEObject(EcorePackage.eINSTANCE), eq(OPTIONS));
		verify(repo).detach(eqEObject(EcorePackage.eINSTANCE));
	}

	@Test
	void testLoadFromRegistry(@InjectService EMFRepository repo, @InjectService EPackageResource pr) {
		when(repo.getResourceSet()).thenReturn(rs);
		when(rs.getPackageRegistry()).thenReturn(registry);
		when(registry.getEPackage(bp.getNsURI())).thenReturn(bp);

		EPackage resultPackage = pr.load(bp.getNsURI());

		assertThat(EcoreUtil.equals(bp, resultPackage)).isTrue();
	}

	@Test
	void testLoadFromRepo(@InjectService EMFRepository repo, @InjectService EPackageResource pr) {
		when(repo.getResourceSet()).thenReturn(rs);
		when(rs.getPackageRegistry()).thenReturn(registry);
		when(registry.getEPackage(bp.getNsURI())).thenReturn(null);

		pr.load(bp.getNsURI());

		verify(repo).getEObject(eq(EcorePackage.Literals.EPACKAGE), eq(bp.getNsURI()), eq(OPTIONS));
	}

	@Test
	void testLoadAll(@InjectService EMFRepository repo, @InjectService EPackageResource pr) {
		pr.loadAll();

		verify(repo).getAllEObjects(eq(EcorePackage.Literals.EPACKAGE), eq(OPTIONS));
	}

	@Test
	void testDelete(@InjectService EMFRepository repo, @InjectService EPackageResource pr) {
		when(repo.getEObject(EcorePackage.Literals.EPACKAGE, bp.getNsURI(), OPTIONS)).thenReturn(bp);
		
		Response response = pr.delete(bp.getNsURI());
		
		assertThat(response.getEntity()).isEqualTo(bp);
		verify(repo).delete(bp);
		verify(repo).delete(bp);
	}
	
	@Test
	void testExist(@InjectService EMFRepository repo, @InjectService EPackageResource pr) {
		when(repo.getResourceSet()).thenReturn(rs);
		when(rs.getPackageRegistry()).thenReturn(registry);
		when(registry.getEPackage(bp.getNsURI())).thenReturn(null);

		Response exists = pr.exists(bp.getNsURI());
		
		assertThat(exists.getEntity()).isEqualTo(false); 

		verify(repo).getEObject(eq(EcorePackage.Literals.EPACKAGE), eq(bp.getNsURI()), eq(OPTIONS));
	}
}
