# Local repository

Jars that are not published anywhere usable. Each entry shadows the same bundle at a lower
version, so remove it once the published artifact catches up.

| Bundle | Why | Remove when |
|---|---|---|
| `org.eclipse.sensinact.gateway.northbound.sensorthings.rest.gateway` `0.0.2.202609240827` | local build of `eclipse-sensinact/org.eclipse.sensinact.gateway` at `8f72d680`, carrying gateway PR [#769](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/pull/769). Without it SensorThings answers one Observation per Datastream once the history store registers after the SensorThings application. Copied from `event.atlas/cnf/local`. | the Eclipse sensiNact snapshot deployment (stalled since 2026-09-10) publishes a build with PR #769 |
| `org.apache.aries.spifly.dynamic.framework.extension` | used by the mqttbridge and the TrafiCam camera tooling | |
| `org.eclipse.fennec.m2x.ocl.engine` `0.1.1.202611191226-SNAPSHOT` | local build of `eclipse-fennec/emf.m2x` at `4e154443`, branch `issue431_operation_providers_ref`, carrying m2x [#431](https://github.com/eclipse-fennec/emf.m2x/issues/431): the engine's `operationProvider` reference becomes dynamic, so a provider registered after the engine - `GeoJsonArrayOperations` in de.jena.udp.atlas.ilsa - still reaches it. Without it the ILSA admin location stays unset. | the published 0.1.1 snapshot carries #431 |
