# UDP Sensinact Weather Adapter

This is the sensinact adapter for the weather info obtained from [DWD](https://www.dwd.de/DE/Home/home_node.html).

## The Models

We have modeled the `MOSMIXWeatherReport` from [here](https://github.com/geckoprojects-org/org.gecko.weather/blob/snapshot/org.gecko.weather.model/model/dwd-weather.ecore) into the corresponding sensinact model, located under `org.eclipse.fennec.weather.sensinact.model`.

We have a `WeatherProvider` which is, in sensinact terms, a `Provider`. This has several `WeatherService`, each one representing a `MOSMIXWeatherReport`. The first one is the `currentWeather`, meaning the weather forecast for the hour immediately after the one when the forecast has been asked (e.g. if the forecast is asked at 2:30 pm, then the `currentWeather` contains the forecast for 3 pm). The other reports are the forecast in subsequent 3 hours intervals, up to 72 hours (e.g. if the forecast is asked at 2:30 pm, the `currentWeather` is for 3 pm, then the other ones are for 6 pm, 9 pm, and so on, up to 72 hours).

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








## Atlas runtime variant

The atlas runtime (`de.jena.udp.atlas.runtime`, issue #28) keeps the gecko weather stack and
replaces only the sensiNact end of it:

| | legacy runtime | atlas runtime |
|---|---|---|
| fetch | `org.gecko.weather.dwd.forecast` (`DWD-MOSMIX-Station`, hourly + at boot) | same |
| 3-hour filter | `WeatherReportIndexWithFilter` (Lucene index in memory) | same |
| storage handler | `org.eclipse.fennec.weather.sensinact` with `org.gecko.emf.sensinact.model` | `de.jena.udp.atlas.dwd.DwdReportPusher` hands the `WeatherReports` to the Event Atlas `InstancePusher` |
| mapping | `mapping/WeatherReportsProviderMapping.xmi` in `de.jena.udp.sensinact.sensor.mapping` | the same mapping in the Event Atlas dialect (`https://fennec.eclipse.org/event.atlas/mapping/1.0`), seeded into Model Atlas scope `udp`, registry `sensinactmapping`, from `de.jena.udp.atlas.dwd/eventatlas/seed/` |
| config | `weather.json` | `de.jena.udp.atlas.runtime.config/configs/dwd.json`, station through `DWD_STATION_ID` / `DWD_STATION_NAME` / `DWD_STATION_LATITUDE` / `DWD_STATION_LONGITUDE` (defaults: 10567 Gera, "Weather Forecast for Jena", Jena) |

The provider is the station id (`10567`) with `admin`, `currentWeather` and `forecast3H` …
`forecast72H`; every service has the 42 MOSMIX attributes of a `MOSMIXSWeatherReport` as
resources (`tempAboveSurface200`, `windSpeed`, `significantWeather3Hours`, …). Temperatures stay
in Kelvin on this provider; `WeatherCelsiusRule` in `de.jena.udp.atlas.rules` writes every
resource whose unit is `K` (the five `temp…` attributes) in degrees Celsius to the same service of
`<station>-derived` (`10567-derived/currentWeather/tempAboveSurface200`). The station comes from
`DWD_STATION_ID` (`configs/rules.json`).

Two things to know about the seed:

- Only the mapping is seeded. The weather model is the `org.gecko.weather.model` bundle of the
  image; a seeded copy of `dwd-weather.ecore` makes the mapping bind to the Atlas copy and the
  pushed instances are no longer matched (the registry keys mappings by `EClass`).
- The admin location is the static `latitude`/`longitude` of the admin mapping, not a
  `latitudeRef`/`longitudeRef` path: `ValueMapperImpl.mapLocation` in event.atlas returns before it
  writes a point computed from the refs, so only the static coordinates reach the twin.
