/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.eclipse.fennec.weather.sensinact;


import java.util.Optional;
import java.util.logging.Logger;

import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider;
import org.eclipse.fennec.qvt.osgi.api.ModelTransformationConstants;
import org.eclipse.fennec.qvt.osgi.api.ModelTransformator;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.gecko.weather.dwd.fc.WeatherReportStorageHandler;
import org.gecko.weather.model.weather.WeatherReports;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

@Component(immediate = true, name = "SensinactWeatherReportStorage")
public class SensinactWeatherReportStorage implements WeatherReportStorageHandler<WeatherReports> {
	
	private static final Logger LOGGER = Logger.getLogger(SensinactWeatherReportStorage.class.getName());
	
	
	@Reference
	private DataUpdate sensinact;
	
	private ModelTransformator transformator;
	
	
	@Activate
	public SensinactWeatherReportStorage(@Reference(target = ("(" + ModelTransformationConstants.TRANSFORMATOR_ID + "=Weather2Sensinact)"), cardinality = ReferenceCardinality.MANDATORY) ModelTransformator modelTransformator) {
		this.transformator = modelTransformator;
	}


	/* 
	 * (non-Javadoc)
	 * @see org.gecko.weather.dwd.fc.WeatherReportStorageHandler#saveReport(R)
	 */
	@Override
	public <R extends WeatherReports> R saveReport(R report) {
		WeatherProvider provider = transformator.doTransformation(report);
		sensinact.pushUpdate(provider)
		.onSuccess(o -> LOGGER.info("Weather report successfully updated"))
		.onFailure(t -> LOGGER.severe(String.format("Error while updating WeatherReport %s", t.getMessage())));
		return report;
	}


	/* 
	 * (non-Javadoc)
	 * @see org.gecko.weather.dwd.fc.WeatherReportStorageHandler#updateReport(R)
	 */
	@Override
	public <R extends WeatherReports> R updateReport(R report) {
		return saveReport(report);
	}

	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.weather.dwd.fc.WeatherReportStorageHandler#deleteReport(java.lang.String)
	 */
	@Override
	public <R extends WeatherReports> Optional<R> deleteReport(String reportId) {
		throw new UnsupportedOperationException("This operation should not be relevant for sensinact, thus it is not implemented!");
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.weather.dwd.fc.WeatherReportStorageHandler#getReport(java.lang.String)
	 */
	@Override
	public <R extends WeatherReports> Optional<R> getReport(String reportId) {
		throw new UnsupportedOperationException("This operation should not be relevant for sensinact, thus it is not implemented!");
	}

}
