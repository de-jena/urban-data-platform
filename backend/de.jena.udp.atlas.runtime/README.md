# UDP Atlas Runtime

Runtime image for `udp.datainmotion.com` on Model, Event and Data Atlas
([issue #28](https://github.com/de-jena/urban-data-platform/issues/28)). It replaces the stock
`eclipsefennec/event.atlas` image on dimserver02 and carries, on top of the Event Atlas bundles,
the UDP-specific adapters that mappings cannot express.

| | |
|---|---|
| bndrun | `de.jena.udp.atlas.runtime.docker.bndrun` |
| Java | 25 |
| config | `org.eclipse.fennec.event.atlas.mapping.docker.config` (Event Atlas, env-driven) + `de.jena.udp.atlas.runtime.config` (webconsole) |
| image | `docker/atlas-runtime/` |
| deployment | `DataInMotion/infrastructure`, `server02/` (`eventatlas` service, `eventatlas.env`) |

## Build

```
./gradlew :de.jena.udp.atlas.runtime:resolve.de.jena.udp.atlas.runtime.docker
./gradlew :de.jena.udp.atlas.runtime:export.de.jena.udp.atlas.runtime.docker
cd ../docker && ./gradlew :atlas-runtime:prepareDocker && docker build -t udp-atlas-runtime:local atlas-runtime
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
