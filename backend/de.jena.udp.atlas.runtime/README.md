# UDP Atlas Runtime

Runtime image for `udp.datainmotion.com` on Model, Event and Data Atlas
([issue #28](https://github.com/de-jena/urban-data-platform/issues/28)). It replaces the stock
`eclipsefennec/event.atlas` image on dimserver02 and carries, on top of the Event Atlas bundles,
the UDP-specific adapters that mappings cannot express.

| | |
|---|---|
| bndrun | `de.jena.udp.atlas.runtime.docker.bndrun` (image), `de.jena.udp.atlas.runtime.local.bndrun` (same assembly launched from the workspace) |
| Java | 25 |
| config | `org.eclipse.fennec.event.atlas.mapping.docker.config` (Event Atlas, env-driven) + `de.jena.udp.atlas.runtime.config` (webconsole) |
| image | `docker/atlas-runtime/`; the Jenkins main build pushes `devel.data-in-motion.biz:6000/scj/udp-atlas-runtime:0.1.0.<build>` and `:latest` (and `registry-git.jena.de/scj/udp/atlas-runtime`) |
| deployment | `DataInMotion/infrastructure`, `server02/` (`eventatlas` service, `eventatlas.env`) |

## Build

```
./gradlew :de.jena.udp.atlas.runtime:resolve.de.jena.udp.atlas.runtime.docker
./gradlew :de.jena.udp.atlas.runtime:export.de.jena.udp.atlas.runtime.docker
cd ../docker && ./gradlew :atlas-runtime:prepareDocker && docker build -t udp-atlas-runtime:local atlas-runtime
```

This is the only UDP runtime; `de.jena.udp.sensinact.runtime` is the one it replaces (the 5g
runtime is gone). For a local run launch `de.jena.udp.atlas.runtime.local.bndrun`; the config
bundles read the environment, with localhost defaults for Model Atlas (`:8086`), the broker
(`:1883`) and Timescale (`:5432`), so the values that differ go into the launch environment:

```
EVENTATLAS_ATLAS_BASE_URI=http://localhost:8086/atlas/rest
EVENTATLAS_ATLAS_SCOPE=udp
EVENTATLAS_DOMAIN_NSURI=https://model.data.jena.de/chirpstack/uplink/1.0
EVENTATLAS_MQTT_HOST=localhost
TIMESCALE_HOST=localhost
TIMESCALE_PWD=...
```

## Endpoints

Everything is served by one HTTP whiteboard on port 8080 under the `event/` context path:

| URL | What |
|---|---|
| `/event/rest/sensinact` | sensiNact northbound REST |
| `/event/rest/v1.1` | SensorThings v1.1 |
| `/event/rest/ingest/{channel}` | REST southbound ingest |
| `/event/system/console` | Felix webconsole, basic auth `WEBCONSOLE_USER` / `WEBCONSOLE_PASSWORD` (default `admin` / `admin`) |

SensorThings MQTT listens on 1883 (TCP) and 8885 (WebSocket).

## Environment

All `EVENTATLAS_*`, `TIMESCALE_*` and `SENSORTHINGS_*` variables of the Event Atlas image apply
unchanged (see `event.atlas/docker/eventatlas/README.md`). Added here:

| Variable | Default | What |
|---|---|---|
| `WEBCONSOLE_USER` / `WEBCONSOLE_PASSWORD` | `admin` / `admin` | webconsole login |
| `MQTT_READ_PROTOCOL` / `MQTT_READ_HOST` / `MQTT_READ_PORT` / `MQTT_READ_USER` / `MQTT_READ_PWD` | the `EVENTATLAS_MQTT_*` values | broker of the gecko messaging client `read` used by the adapters below |

`EVENTATLAS_MQTT_TOPICS` only has to cover the Event Atlas mappings (ChirpStack); the adapters
subscribe on their own connection.

## ILSA and TrafiCam adapters

Both subscribe through the gecko messaging `MessagingService` with `id=read`
(`org.gecko.adapter.mqtt.v5`, configured by `MQTTService~read` in
`de.jena.udp.atlas.runtime.config/configs/mqtt.json`), the same client the legacy bundles use.

| Bundle | Topics | What |
|---|---|---|
| `de.jena.udp.atlas.ilsa` | `5g/ilsa/#` | TLConfiguration and TLSignalState JSON decoded by the Fennec codec; the configuration becomes an `Ilsa` provider through `transformations/ilsa.qvto` on the Fennec M2X QVT-O engine (`GeoJsonBlackBox` converts the areas); signal states and thermal values are pushed as DTOs. See `docs/ilsa-adapter/ILSASensinactAdapter.md`. |
| `de.jena.udp.atlas.traficam` | `5g/traficam/#`, `5g/config/traficam/#` | binary EMF detections and camera configurations; detections are collected per camera and object class and pushed every 2 s. See `docs/traficam-adapter/TrafiCamAdapter.md`. |
| `de.jena.udp.atlas.ibis` | `5g/ibis/#` | IBIS-IP service responses (EMF JSON keyed by the XML element names) decoded by the Fennec codec; each response becomes one `IbisDevice` service through `transformations/ibis.qvto` on the M2X engine, a GNSS position also sets the admin location. See `docs/ibis-adapter/IBISAdapter.md`. |

The trafficos and IBIS-IP models are generated against the gecko EMF OSGi API and join the 1.1
runtime through `org.eclipse.fennec.emf.gecko.compatibility.api`.

## ChirpStack mappings

The Event Atlas mappings for the ChirpStack profiles are generated from
`de.jena.chirpstack.model/model/chirpstack.ecore` by
`de.jena.chirpstack.model/eventatlas/gen-chirpstack-mappings.py` into
`de.jena.chirpstack.model/eventatlas/seed/`, which is what Model Atlas seeds into scope `udp`.
A service annotated with `collection` + `filter` (the IoTraffic counting lines) becomes an EMF map
on the uplink model and a `referencedResource` with a `collectionFilter`; attributes get the
wrapper data types so an absent field leaves the resource untouched; see
`docs/chirpstack/chirpstack-connector.md`. Recorded payloads for a replay through
`/event/rest/ingest/{channel}` are in `de.jena.chirpstack.sensinact/examples/`.
