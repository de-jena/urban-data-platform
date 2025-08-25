[![CI Build](https://github.com/de-jena/urban-data-platform/actions/workflows/build.yml/badge.svg)](https://github.com/de-jena/urban-data-platform/actions/workflows/build.yml)[![License](https://github.com/de-jena/urban-data-platform/actions/workflows/license.yml/badge.svg)](https://github.com/de-jena/urban-data-platform/actions/workflows/license.yml )

# Jena - WISSENsAllmende - Urban Data Platform 

## Documentation
* [SensiNact / History](docs/sensinact-configuration.md)
* [Weather adapter](docs/weather-adapter/UDPSensinactWeatherAdapter.md)
* [Humidity sensor rules](docs/humidity-sensors-rules/HumiditySensorRulesImplementation.md)
* [ChirpStack Connector](docs/chirpstack/chirpstack-connector.md)

## Resources 

All examples are for a localhost development environment. But can be adapted for:

* staging https://udp-broker-stage.nomad-dmz.jena.de/
* produtive https://udp-broker.nomad-dmz.jena.de

## Rest API

[Providers](http://localhost:8080/udp/rest/sensinact/providers/)

[OpenAPI](http://localhost:8080/udp/swagger-api/index.html)

### Sensorthings
http://localhost:8080/udp/rest/v1.1/

ILSA K1 Felsenkeller: http://localhost:8080/udp/rest/v1.1/Datastreams(K440~K1_1~color)/Observations

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
