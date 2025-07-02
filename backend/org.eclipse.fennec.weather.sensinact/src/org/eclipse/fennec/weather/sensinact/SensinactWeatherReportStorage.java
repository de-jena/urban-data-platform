package org.eclipse.fennec.weather.sensinact;

import java.util.Optional;

import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider;
import org.eclipse.fennec.qvt.osgi.api.ModelTransformationConstants;
import org.eclipse.fennec.qvt.osgi.api.ModelTransformator;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.gecko.weather.dwd.fc.WeatherReportStorageHandler;
import org.gecko.weather.model.weather.WeatherReport;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, name = "SensinactWeatherReportStorage")
public class SensinactWeatherReportStorage implements WeatherReportStorageHandler {
	
	@Reference
	private DataUpdate sensinact;
	
	@Reference(target = ("(" + ModelTransformationConstants.TRANSFORMATOR_ID + "=Weather2Sensinact)"))
	private ModelTransformator transformator;

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.weather.dwd.fc.WeatherReportStorageHandler#saveReport(org.gecko.weather.model.weather.WeatherReport)
	 */
	@Override
	public <R extends WeatherReport> R saveReport(R report) {
		
		WeatherProvider sensinactWeatherReport = transformator.doTransformation(report);
		sensinact.pushUpdate(sensinactWeatherReport);
		return report;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.weather.dwd.fc.WeatherReportStorageHandler#updateReport(org.gecko.weather.model.weather.WeatherReport)
	 */
	@Override
	public <R extends WeatherReport> R updateReport(R report) {
		WeatherProvider sensinactWeatherReport = transformator.doTransformation(report);
		sensinact.pushUpdate(sensinactWeatherReport);
		return report;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.weather.dwd.fc.WeatherReportStorageHandler#deleteReport(java.lang.String)
	 */
	@Override
	public <R extends WeatherReport> Optional<R> deleteReport(String reportId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.weather.dwd.fc.WeatherReportStorageHandler#getReport(java.lang.String)
	 */
	@Override
	public <R extends WeatherReport> Optional<R> getReport(String reportId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}


}
