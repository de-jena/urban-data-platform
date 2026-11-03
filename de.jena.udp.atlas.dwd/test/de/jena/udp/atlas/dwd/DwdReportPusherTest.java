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
package de.jena.udp.atlas.dwd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fennec.event.atlas.mapping.InstancePusher;
import org.gecko.weather.model.weather.WeatherFactory;
import org.gecko.weather.model.weather.WeatherReports;
import org.junit.jupiter.api.Test;

class DwdReportPusherTest {

	private final List<EObject> pushed = new ArrayList<>();
	private final DwdReportPusher reportPusher = new DwdReportPusher();

	@Test
	void savedReportsGoThroughTheInstancePusherOnce() {
		reportPusher.pusher = recording(1);
		WeatherReports reports = stationReports("10567");

		assertSame(reports, reportPusher.saveReport(reports));
		assertEquals(List.of(reports), pushed);
	}

	@Test
	void updatingIsSavingAgain() {
		reportPusher.pusher = recording(1);
		WeatherReports reports = stationReports("10567");

		reportPusher.updateReport(reports);

		assertEquals(List.of(reports), pushed);
	}

	@Test
	void reportsWithoutMappingAreStillReturned() {
		reportPusher.pusher = recording(0);
		WeatherReports reports = stationReports("unknown");

		assertSame(reports, reportPusher.saveReport(reports));
	}

	@Test
	void nothingIsKept() {
		assertTrue(reportPusher.getReport("10567").isEmpty());
		assertTrue(reportPusher.deleteReport("10567").isEmpty());
	}

	private InstancePusher recording(int applied) {
		return instance -> {
			pushed.add(instance);
			return applied;
		};
	}

	private static WeatherReports stationReports(String stationId) {
		WeatherReports reports = WeatherFactory.eINSTANCE.createWeatherReports();
		reports.setId(stationId);
		reports.getReports().add(WeatherFactory.eINSTANCE.createMOSMIXSWeatherReport());
		return reports;
	}
}
