# Docker images

Two images are built from this directory by the Jenkins main build (`Jenkinsfile`, stages
`Prepare UDP Docker` and `Docker … Image build`), each from the exported executable jar of its
bndrun:

| Directory | Image | Source |
|---|---|---|
| `atlas-runtime/` | `udp-atlas-runtime` — the UDP runtime on the Event Atlas (`udp.datainmotion.com`) | `de.jena.udp.atlas.runtime/de.jena.udp.atlas.runtime.docker.bndrun`; see the README there |
| `bridge/` | `mqtt-bridge` — the MQTT bridge, a separate application | `de.jena.mqttbridge.runtime/mqttbridge.bndrun` |


## Local build

```bash
./gradlew :de.jena.udp.atlas.runtime:resolve.de.jena.udp.atlas.runtime.docker   # after a bundle change
./gradlew :de.jena.udp.atlas.runtime:export.de.jena.udp.atlas.runtime.docker
cd docker && ./gradlew :atlas-runtime:prepareDocker && podman build -t udp-atlas-runtime:local atlas-runtime
```

`prepareDocker` copies the exported jar into `<image>/content/`; the Dockerfile adds it to a JRE
image. The deployment on dimserver02 (units, environment, routes) lives in the
`DataInMotion/infrastructure` repository, `server02/`.
