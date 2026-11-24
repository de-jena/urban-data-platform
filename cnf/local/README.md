# Local repository

Jars that are not published anywhere usable.

**Shadowing is not automatic, and it is not enough to put a jar here.** An entry does not
override a published bundle: it only competes with it. `-buildpath` asks for `version=latest`
and the bndruns for `[1.0.0,1.0.1)`, so of the candidates the highest version wins - and for a
`-SNAPSHOT` from upstream CI that qualifier is the wall-clock time of its last publish, which
passes ours within hours of our jar being built. So every bundle below that also has a
published snapshot is **commented out of `cnf/ext/central.maven`** while the local jar is in
use, which is the only way to keep it out of the candidate set. The comment there says when to
put the line back. Dropping a jar here without doing that buys a day at most: on 2026-11-24 the
event.atlas CI published at 12:07 and the CI build at 12:19 compiled against it instead of
ours, which does not have `ValueConverter`.

Remove an entry once the published artifact carries the change - jar, README row, and the
`central.maven` line all together.

| Bundle | Why | Remove when |
|---|---|---|
| `org.eclipse.sensinact.gateway.northbound.sensorthings.rest.gateway` `0.0.2.202609240827` | local build of `eclipse-sensinact/org.eclipse.sensinact.gateway` at `8f72d680`, carrying gateway PR [#769](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/pull/769). Without it SensorThings answers one Observation per Datastream once the history store registers after the SensorThings application. Copied from `event.atlas/cnf/local`. | the Eclipse sensiNact snapshot deployment (stalled since 2026-09-10) publishes a build with PR #769 |
| `org.apache.aries.spifly.dynamic.framework.extension` | used by the mqttbridge and the TrafiCam camera tooling | |
| `org.eclipse.fennec.m2x.ocl.engine` `0.1.1.202611240857-SNAPSHOT` | local build of `eclipse-fennec/emf.m2x` at `47140eda`, branch `issue431_operation_providers_ref`, carrying m2x [#431](https://github.com/eclipse-fennec/emf.m2x/issues/431) **and** the `OclOperationProviderProvider` gate on top of it: the engine's `operationProvider` reference is dynamic, and `operationProvidersReady` is a mandatory static reference whose target `configs/ocl.json` points at `provider.name=de.jena.udp.atlas.ilsa.geojson`, so `DefaultOclEngine` does not exist before `GeoJsonArrayOperations`. Without it the ILSA admin location stays unset. | the published 0.1.1 snapshot carries #431 and the gate |
| `org.eclipse.fennec.event.atlas.mapping.docker.config` `1.0.0.202611180904-SNAPSHOT` | local build of `eclipse-fennec/event.atlas`, adding the `$[prop:...]` fallbacks to `OSGI-INF/configurator/config.json` that `de.jena.udp.atlas.runtime.local.bndrun` needs: `EVENTATLAS_MAPPING_DIR` and `EVENTATLAS_PROFILE_DIR` settable with `-D` so a workspace launch reads seed folders in the source tree, plus `EVENTATLAS_ATLAS_MODE` and `EVENTATLAS_ATLAS_DRIFT_INTERVAL_MS` so a launch with no Atlas is quiet. Upstream has none of them and would fall back to `/opt/eventatlas/runtime`, where a workspace launch finds nothing. | the fallbacks are upstream |
| `org.eclipse.fennec.event.atlas.mapping` `1.0.0.202611241040-SNAPSHOT` | local build of `eclipse-fennec/event.atlas` at `ee8d3ef` + uncommitted, branch `issue91_additional_mapping_features`, carrying `ExpressionEvaluatorReadyCondition` and the `event.atlas.instance.pusher` configuration PID. `InstancePusherImpl` binds its `ExpressionEvaluator` optionally, so without them nothing holds a listener back until expressions can be evaluated; `configs/ocl.json` points the pusher's satisfying condition at that condition. It also carries `75450eb`, the guard for models arriving later than the mappings that use them, which the previous jar predates. | the change is merged and a snapshot is published |
