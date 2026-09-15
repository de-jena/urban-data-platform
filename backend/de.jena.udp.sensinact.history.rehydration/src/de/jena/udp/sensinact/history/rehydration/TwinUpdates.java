/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
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
package de.jena.udp.sensinact.history.rehydration;

import java.util.List;

import org.eclipse.sensinact.core.push.dto.BulkGenericDto;
import org.eclipse.sensinact.core.push.dto.GenericDto;

/**
 * Builds the digital twin updates that restore a set of history records.
 * 
 * The original timestamp is kept, which makes the restore both idempotent and
 * harmless: sensiNact ignores an update whose timestamp is not newer than the
 * value a resource already holds, so a device that reported while the restore
 * was running keeps its fresher value.
 * 
 * @author Guido Grune
 * @since Sep 15, 2026
 */
public class TwinUpdates {

	private TwinUpdates() {
	}

	public static BulkGenericDto restoring(List<HistoryRecord> records) {
		BulkGenericDto bulk = new BulkGenericDto();
		bulk.dtos = records.stream().map(TwinUpdates::restoring).toList();
		return bulk;
	}

	public static GenericDto restoring(HistoryRecord record) {
		GenericDto dto = new GenericDto();
		dto.modelPackageUri = record.modelPackageUri();
		dto.model = record.model();
		dto.provider = record.provider();
		dto.service = record.service();
		dto.resource = record.resource();
		dto.value = record.value();
		dto.timestamp = record.timestamp();
		return dto;
	}
}
