# UDP Sensinact Weather Adapter

This is the sensinact adapter for the weather info obtained from [DWD](https://www.dwd.de/DE/Home/home_node.html).

## The Models

We have modeled the `MOSMIXWeatherReport` from [here](https://github.com/geckoprojects-org/org.gecko.weather/blob/snapshot/org.gecko.weather.model/model/dwd-weather.ecore) into the SensiNact using the `sensinact-mapping` model and the the `WeatherReportsMapping.xmi` which is located in the `de.jena.udp.sensinact.sensor.mapping` bundle.

As a result of such mapping we get a `WeatherProvider` which is, in sensinact terms, a `Provider`. This has several `WeatherService`, each one representing a `MOSMIXWeatherReport`. The first one is the `currentWeather`, meaning the weather forecast for the hour immediately after the one when the forecast has been asked (e.g. if the forecast is asked at 2:30 pm, then the `currentWeather` contains the forecast for 3 pm). The other reports are the forecast in subsequent 3 hours intervals, up to 72 hours (e.g. if the forecast is asked at 2:30 pm, the `currentWeather` is for 3 pm, then the other ones are for 6 pm, 9 pm, and so on, up to 72 hours).

A `WeatherService` contains the following resources:

+ all precipitation data
+ all wind data
+ all cloud data
+ all temperature data
+ all fog data
+ all snow/rain data
+ all visibility data
+ all pressure data
+ all irradiance data
+ the significant weather
+ the issued time of the report

## Runtime Config

The `weather.json` configuration looks like:

```json
"EMFLuceneIndex~dwd-forecast": {
		"id": "dwd.forecast",
		"directory.type": "ByteBuffer"
	},
	"DWD-MOSMIX-Station~Jena": {
		"stationId": "10567",
		"name": "Jena",
		"latitude": "50.9271",
		"longitude": "11.5892",
		"reportIndex.target": "(component.name=WeatherReportIndexWithFilter)"
	},
	"WeatherReportIndexWithFilter": {
		"cache.target": "(component.name=SensinactWeatherReportStorage)"
	}
```

where we have configured the corresponding index services, responsible of pushing the reports to sensinact, and the `DWD-MOSMIX-Station`. The coordinates are the ones for Jena, and the `stationId` is the closest weather station to Jena (which is located in Gera).

The weather data is collected from this station hourly and at reboot of the application. 







