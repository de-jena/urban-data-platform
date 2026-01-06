[![CI Build](https://github.com/de-jena/urban-data-platform/actions/workflows/build.yml/badge.svg)](https://github.com/de-jena/urban-data-platform/actions/workflows/build.yml)[![License](https://github.com/de-jena/urban-data-platform/actions/workflows/license.yml/badge.svg)](https://github.com/de-jena/urban-data-platform/actions/workflows/license.yml )

# Jena - WISSENsAllmende - Urban Data Platform 

## Documentation
* [SensiNact / History](docs/sensinact-configuration.md)
* [Weather adapter](docs/weather-adapter/UDPSensinactWeatherAdapter.md)
* [Humidity sensor rules](docs/humidity-sensors-rules/HumiditySensorRulesImplementation.md)
* [ChirpStack Connector](docs/chirpstack/chirpstack-connector.md)
* [ILSA (Traffic Light) Adapter](docs/ilsa-adapter/ILSASensinactAdapter.md)
* [TTN (The Things Network) Adapter](docs/ttn-adapter/TTNSensinactAdapter.md)
* [TrafICam (Traffic Camera) Adapter](docs/traficam-adapter/TrafiCamAdapter.md)

## Resources 

All examples are for a staging environment (https://udp-broker-stage.nomad-dmz.jena.de). But can be adapted for production https://udp-broker.nomad-dmz.jena.de

## REST API

The base url for the UDP Sensinact REST API is ```https://udp-broker-stage.nomad-dmz.jena.de/udp/rest/sensinact/```

A list of all providers can be found at ```https://udp-broker-stage.nomad-dmz.jena.de/udp/rest/sensinact/providers/```

For more information and endpoints please consider the [Eclipse sensiNact documentation](https://eclipse-sensinact.readthedocs.io/en/latest/northbound/RestDataAccess.html)

### Sensorthings

The base url for the UDP Sensorthings API is ```https://udp-broker-stage.nomad-dmz.jena.de/udp/rest/v1.1/```

To get all things (providers) ```https://udp-broker-stage.nomad-dmz.jena.de/udp/rest/v1.1/Things```. The things URL provides url to the ```Datastreams```, ```Locations``` and ```HistoricalLocations``` access to all things and 

#### Example URLs

* Last 5 signal states of the K1 signal group of the ILSA Felsenkeller: https://udp-broker-stage.nomad-dmz.jena.de/udp/rest/v1.1/Datastreams(K440~K1_1~color)/Observations?$orderby=resultTime%20desc&$top=5
* Location history of the Bus 359: https://udp-broker-stage.nomad-dmz.jena.de/udp/rest/v1.1/Datastreams(bus359~admin~location)/Observations?orderby=resultTime%20desc
* Temperature of the "Werkstatt" "Funktionsgebäude Leichtathletikstadion": https://udp-broker-stage.nomad-dmz.jena.de/udp/rest/v1.1/Datastreams(065~17170438~value)/Observations?$orderby=resultTime%20desc

### Swagger

[OpenAPI](http://localhost:8080/udp/swagger-api/index.html)


### Log files
List of available log files:
http://localhost:8080/udp/rest/control/logs
Content of one log file from the list:
http://localhost:8080/udp/rest/control/logs/log-2025-06-25.log

### Felix Web console
http://localhost:8080/udp/system/console


## Links

* [Documentation](https://github.com/de-jena/urban-data-platform)
* [Source Code](https://github.com/de-jena/urban-data-platform) (clone with `scm:git:git@github.com:de-jena/urban-data-platform.git`)

## Developers

* **Juergen Albert** (jalbert) / [j.albert@datainmotion.com](mailto:j.albert@datainmotion.com) @ [Data In Motion](https://www.datainmotion.com) - *architect*, *developer*
* **Mark Hoffmann** (mhoffmann) / [m.hoffmann@data-in-motion.biz](mailto:m.hoffmann@datainmotion.com) @ [Data In Motion](https://www.datainmotion.com) - *developer*, *architect*
* **Guido Grune** (dd-dim) / [g.grune@datainmotion.com](mailto:g.grune@datainmotion.com) @ [Data In Motion](https://www.datainmotion.com) - *developer*
* **Markus Hochstein** (vwfox) / [m.hochstein@datainmotion.com](mailto:m.hochstein@datainmotion.com) @ [Data In Motion](https://www.datainmotion.com) - *developer*
* **Ilenia Salvadori** (isalvadori) / [i.salvadori@datainmotion.com](mailto:i.salvadori@datainmotion.com) @ [Data In Motion](https://www.datainmotion.com) - *developer*


## Licenses

** Eclipse Public License - v 2.0**

## Copyright

Data In Motion Consuling GmbH - All rights reserved

---
Data In Motion Consuling GmbH - [info@data-in-motion.biz](mailto:info@data-in-motion.biz)
