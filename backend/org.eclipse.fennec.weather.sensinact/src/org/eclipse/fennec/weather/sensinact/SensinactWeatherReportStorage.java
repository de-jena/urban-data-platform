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


import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.eclipse.sensinact.core.command.AbstractSensinactCommand;
import org.eclipse.sensinact.core.command.GatewayThread;
import org.eclipse.sensinact.core.model.SensinactModelManager;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.core.twin.SensinactDigitalTwin;
import org.eclipse.sensinact.mapping.ProviderMapping;
import org.gecko.emf.sensinact.model.ProviderMappingRegistry;
import org.gecko.emf.sensinact.model.ValueMapper;
import org.gecko.emf.sensinact.model.ValueMapperFactory;
import org.gecko.weather.dwd.fc.WeatherReportStorageHandler;
import org.gecko.weather.model.weather.WeatherReports;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.PromiseFactory;


@Component(immediate = true, name = "SensinactWeatherReportStorage")
public class SensinactWeatherReportStorage implements WeatherReportStorageHandler<WeatherReports> {
	
	private static final Logger LOGGER = Logger.getLogger(SensinactWeatherReportStorage.class.getName());
	
	
	@Reference
	private DataUpdate sensinact;
	
	@Reference
	private ProviderMappingRegistry registry;
	
	@Reference
	private GatewayThread gatewayThread;
	
	
	
	@Activate
	public SensinactWeatherReportStorage() {
	}


	/* 
	 * (non-Javadoc)
	 * @see org.gecko.weather.dwd.fc.WeatherReportStorageHandler#saveReport(R)
	 */
	@Override
	public <R extends WeatherReports> R saveReport(R report) {
		
		List<ProviderMapping> mappings = registry.getProviderMapping(report.eClass());
		if (mappings.size() != 1) {
			throw new IllegalStateException("No mapping found for EClass '" + report.eClass().getName() + "'.");
		}
		ProviderMapping mapping = mappings.stream().findFirst().get();
		
			gatewayThread.execute(new AbstractSensinactCommand<Boolean>() {
				@Override
				protected Promise<Boolean> call(SensinactDigitalTwin twin, SensinactModelManager modelManager,
						PromiseFactory pf) {
					
					try {						
						ValueMapper mapper = ValueMapperFactory.createValueMapper(twin, mapping);
						mapper.mapInstance(report);
						
						return pf.resolved(Boolean.TRUE);
					} catch (Exception e) {
						
						return pf.failed(e);
					}
				}
			}).onSuccess(o -> LOGGER.info("Weather report successfully updated"))
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
