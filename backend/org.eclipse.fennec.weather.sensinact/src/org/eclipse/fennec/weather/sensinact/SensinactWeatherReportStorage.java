package org.eclipse.fennec.weather.sensinact;


import java.util.Optional;

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
		sensinact.pushUpdate(provider);
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
