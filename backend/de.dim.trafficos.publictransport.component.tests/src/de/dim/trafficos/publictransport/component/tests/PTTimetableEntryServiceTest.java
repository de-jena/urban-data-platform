/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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

package de.dim.trafficos.publictransport.component.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalTime;
import java.util.List;

import org.gecko.emf.repository.EMFRepository;
import org.gecko.mongo.osgi.MongoDatabaseProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import com.mongodb.client.MongoDatabase;

import de.dim.trafficos.publictransport.apis.PTTimetableEntryService;
import de.dim.trafficos.publictransport.component.tests.helper.PublicTransportTestHelper;
import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;



/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class PTTimetableEntryServiceTest {
	
	@Test
	public void testServices(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService(timeout=5000l) ServiceAware<PTTimetableEntryService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTTimetableEntryService service = persistenceAware.getService();
		assertThat(service).isNotNull();
	}
	
	@Test
	public void testSaveNullTimetableEntry(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTTimetableEntryService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTTimetableEntryService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTTimetableEntry[] nullArray = new PTTimetableEntry[] {null};
		Assertions.assertThrows(Exception.class, () -> {
			service.savePTTimetableEntry(nullArray);
		});
	}

	
	@Test
	public void testSaveValidTimetableEntry(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTTimetableEntryService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTTimetableEntryService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTTimetableEntry(PublicTransportTestHelper.getTestPTTimetableEntry("test", LocalTime.now(), LocalTime.now().plusMinutes(1), 0));
		
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTTimetableEntry> entries = repo.getAllEObjects(tosPackage.getPTTimetableEntry());
		assertThat(entries).hasSize(1);
		PTTimetableEntry entry = entries.get(0);
		
		assertThat(entry.getId()).isNotNull();
	}
	
	@Test
	public void testUpdateTimetableEntry(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTTimetableEntryService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTTimetableEntryService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTTimetableEntry(PublicTransportTestHelper.getTestPTTimetableEntry("test", LocalTime.now(), LocalTime.now().plusMinutes(1), 0));
		
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTTimetableEntry> entries = repo.getAllEObjects(tosPackage.getPTTimetableEntry());
		assertThat(entries).hasSize(1);
		PTTimetableEntry entry = entries.get(0);
		
		String id = entry.getId();
		assertThat(id).isNotNull();
		assertThat(entry.getEntryIndex()).isEqualTo(0);
		
		entry.setEntryIndex(1);
		service.savePTTimetableEntry(entry);
		
		entries = repo.getAllEObjects(tosPackage.getPTTimetableEntry());
		assertThat(entries).hasSize(1);
		entry = entries.get(0);
		assertThat(entry.getId()).isEqualTo(id);
		assertThat(entry.getEntryIndex()).isEqualTo(1);	
	}
	
	@Test
	public void testGetTimetableEntry(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTTimetableEntryService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTTimetableEntryService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTTimetableEntry(PublicTransportTestHelper.getTestPTTimetableEntry("test", LocalTime.now(), LocalTime.now().plusMinutes(1), 0));
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTTimetableEntry> entries = repo.getAllEObjects(tosPackage.getPTTimetableEntry());
		assertThat(entries).hasSize(1);
		PTTimetableEntry entry = entries.get(0);
		String id = entry.getId();
		assertThat(id).isNotNull();
		
		entry = service.getPTTimetableEntry(id);
		assertThat(entry).isNotNull();
		assertThat(entry.getId()).isEqualTo(id);
	}
	

	@BeforeEach
	@AfterEach
	public void clean(@InjectService(cardinality = 1, timeout = 5000, filter = "(database=trafficos)") ServiceAware<MongoDatabaseProvider> dbProviderAware) {
		
		assertThat(dbProviderAware.getServices()).hasSize(1);	
		MongoDatabaseProvider dbProvider = dbProviderAware.getService();
		assertThat(dbProvider).isNotNull();	
		
		MongoDatabase database = dbProvider.getDatabase();
		database.drop();
	}
}
