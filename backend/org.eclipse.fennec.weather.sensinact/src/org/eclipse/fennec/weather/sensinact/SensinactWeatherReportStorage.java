package org.eclipse.fennec.weather.sensinact;

import static java.util.Objects.isNull;
import static java.util.Objects.requireNonNull;

import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider;
import org.eclipse.fennec.qvt.osgi.api.ModelTransformationConstants;
import org.eclipse.fennec.qvt.osgi.api.ModelTransformator;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.gecko.weather.dwd.fc.WeatherReportStorageHandler;
import org.gecko.weather.model.weather.WeatherReport;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;


@Component(immediate = true, name = "SensinactWeatherReportStorage")
public class SensinactWeatherReportStorage implements WeatherReportStorageHandler {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH");
	
	@Reference
	private DataUpdate sensinact;
	
	private ModelTransformator transformator;
	
	private final Map<String, WeatherReport> cache = new ConcurrentHashMap<>();
	
	@Activate
	public SensinactWeatherReportStorage(@Reference(target = ("(" + ModelTransformationConstants.TRANSFORMATOR_ID + "=Weather2Sensinact)"), cardinality = ReferenceCardinality.MANDATORY) ModelTransformator modelTransformator) {
		this.transformator = modelTransformator;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.weather.dwd.fc.WeatherReportStorageHandler#saveReport(org.gecko.weather.model.weather.WeatherReport)
	 */
	@Override
	public <R extends WeatherReport> R saveReport(R report) {
		requireNonNull(report);
		if (isNull(report.getId())) {
			String id = createReportId(report);
			report.setId(id);
		}
		
		WeatherProvider sensinactWeatherReport = transformator.doTransformation(report);
		sensinact.pushUpdate(sensinactWeatherReport);
		cache.put(report.getId(), report);
		return report;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.weather.dwd.fc.WeatherReportStorageHandler#updateReport(org.gecko.weather.model.weather.WeatherReport)
	 */
	@Override
	public <R extends WeatherReport> R updateReport(R report) {
		return saveReport(report);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.weather.dwd.fc.WeatherReportStorageHandler#deleteReport(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R extends WeatherReport> Optional<R> deleteReport(String reportId) {
		requireNonNull(reportId);
		R report = (R) cache.remove(reportId);
		return Optional.ofNullable(report);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.weather.dwd.fc.WeatherReportStorageHandler#getReport(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R extends WeatherReport> Optional<R> getReport(String reportId) {
		requireNonNull(reportId);
		R report = (R) cache.get(reportId);
		return Optional.ofNullable(report);
	}

	public static String createReportId(WeatherReport report) {
		requireNonNull(report);
		requireNonNull(report.getWeatherStation());
		requireNonNull(report.getWeatherStation().getId());
		requireNonNull(report.getTimestamp());
		String stationId = report.getWeatherStation().getId();
		return String.format("%s-%s", stationId, sdf.format(report.getTimestamp()));
	}
}
