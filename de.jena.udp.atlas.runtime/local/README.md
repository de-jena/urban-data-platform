# Local run against a local Model Atlas

The UDP runtime (`de.jena.udp.atlas.runtime.local.bndrun`) next to a Model Atlas from a
`model.atlas` checkout, with the same scope and seed as the server.

| | |
|---|---|
| Model Atlas | `:8086`, scope `udp` from `infrastructure/server02/modelatlas/configs/udp.json`, seed from this repository |
| UDP runtime | `:8080` (`/event/...`), SensorThings MQTT on `SENSORTHINGS_MQTT_PORT` |
| ChirpStack broker | `localhost:1883` (`EVENTATLAS_MQTT_*` in the local bndrun) |
| `5g/*` broker | `MQTT_READ_*`, the city broker `mqttbr.jena.de:8883`; set explicitly, since an unset `MQTT_READ_*` falls back to the `EVENTATLAS_MQTT_*` value |
| Timescale | `localhost:5432`, `sensinactHistory` / `snaHistory`, password `TIMESCALE_PWD` |

## 1. Seed

```bash
de.jena.udp.atlas.runtime/local/prepare-modelatlas.sh
```

Copies the ChirpStack seed (`de.jena.chirpstack.model/eventatlas/seed`) and the DWD mapping into
`generated/modelatlas/load/scopes/udp` and empties `generated/modelatlas/data`, the local Atlas
storage. Run it again after a seed change: the Atlas does not replace an ecore it already holds.

## 2. Model Atlas

In the `model.atlas` checkout, `org.eclipse.fennec.model.atlas.runtime/modelatlas.runtime_local_udp.bndrun`:

```
# Local Model Atlas for the UDP runtime (urban-data-platform): the file-storage runtime of the
# server image, scope udp from the infrastructure repo, seed from urban-data-platform.
-include: ~modelatlas.runtime_docker_file.bndrun

udp.repo: ${.}/../../urban-data-platform
infra.repo: ${.}/../../infrastructure

-runproperties.docker: \
	base.path=${.},\
	logback.configurationFile=file:${.}/runtime/etc/logback.xml,\
	gecko.log.dir=${.}/runtime/logs,\
	org.apache.felix.configadmin.plugin.interpolation.secretsdir=${.}/runtime/secrets,\
	data=${.}/runtime/data/,\
	STORAGE_ROOT=${udp.repo}/de.jena.udp.atlas.runtime/generated/modelatlas/data,\
	udp.modelatlas.load=${udp.repo}/de.jena.udp.atlas.runtime/generated/modelatlas/load,\
	configurator.initial="file:${infra.repo}/server02/modelatlas/configs/udp.json,file:${udp.repo}/de.jena.udp.atlas.runtime/local/modelatlas.json"

# the runtime targets Java 21 (spifly's ASM cannot read Java 25 classes); no interactive shell
java: /usr/lib/jvm/java-21-openjdk-amd64/bin/java
-runproperties.shell: gosh.args=--nointeractive
-runtrace: true
-resolve: never
```

`~` keeps these properties over the included ones. `local/modelatlas.json` moves the HTTP port
to 8086 and points the initial model loader at the seed. Launch it from Eclipse (Run OSGi, with
a Java 21 JRE) or with
`./gradlew :org.eclipse.fennec.model.atlas.runtime:run.modelatlas.runtime_local_udp`.
`http://localhost:8086/atlas/rest/scopes/udp` answers once it is up; the log reports
"seeding scope 'udp' (registry 'sensinactmapping' …) uploaded 17 object(s)".

## 3. UDP runtime

Secrets go into `de.jena.udp.atlas.runtime/secrets.bnd` (git-ignored, optional include):

```
secrets.runenv: \
	TIMESCALE_PWD="...",\
	MQTT_READ_USER="...",\
	MQTT_READ_PWD="...",\
	SENSORTHINGS_MQTT_PORT="3883"
```

The configs read `$[env:…]`, so the values travel as environment variables: the local bndrun's
`-runenv` carries the non-secret settings and appends `secrets.runenv`. `-runenv` is applied by

```bash
./gradlew :de.jena.udp.atlas.runtime:run.de.jena.udp.atlas.runtime.local
```

and the bnd CLI. The Eclipse "Run OSGi" launch ignores `-runenv`; there the same variables go
into the Environment tab of the launch configuration (the `-runenv` list of the local bndrun
plus the secrets). Without them every lookup falls to its default: the read client then gets
`ssl://mqttbr.jena.de:8883` with an empty user.

A local broker for the ChirpStack uplinks, and one recorded uplink:

```bash
podman run -d --name udp-local-mqtt -p 1883:1883 docker.io/library/eclipse-mosquitto:1.6
mosquitto_pub -h localhost -t chirpstack/application/e8d62144-b9b6-4fee-937f-5d8248eee499/device/24e124713c401925/event/up \
  -f de.jena.chirpstack.model/examples/example3.json
curl http://localhost:8080/event/rest/sensinact/providers/24e124713c401925/services
```
