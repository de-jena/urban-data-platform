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

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Optional;

import org.eclipse.fennec.event.atlas.mapping.InstancePusher;
import org.gecko.weather.dwd.fc.WeatherReportStorageHandler;
import org.gecko.weather.model.weather.WeatherReports;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * The storage handler behind the gecko weather report index: every {@link WeatherReports} the
 * MOSMIX fetcher produces for a station goes through the Event Atlas provider mapping
 * {@code dwd-weather-reports}, which turns it into the forecast provider of that station.
 */
@Component(name = DwdReportPusher.NAME)
public class DwdReportPusher implements WeatherReportStorageHandler<WeatherReports> {

	static final String NAME = "DwdReportPusher";

	private static final Logger logger = System.getLogger(DwdReportPusher.class.getName());

	@Reference
	InstancePusher pusher;

	@Override
	public <R extends WeatherReports> R saveReport(R reports) {
		int applied = pusher.pushInstance(reports);
		if (applied == 0) {
			logger.log(Level.WARNING, "no provider mapping for the {0} weather reports of station {1}",
					reports.getReports().size(), reports.getId());
		} else {
			logger.log(Level.INFO, "pushed {0} weather reports of station {1}", reports.getReports().size(),
					reports.getId());
		}
		return reports;
	}

	@Override
	public <R extends WeatherReports> R updateReport(R reports) {
		return saveReport(reports);
	}

	/** Nothing is kept here; the forecast lives in the digital twin. */
	@Override
	public <R extends WeatherReports> Optional<R> deleteReport(String reportId) {
		return Optional.empty();
	}

	@Override
	public <R extends WeatherReports> Optional<R> getReport(String reportId) {
		return Optional.empty();
	}
}
