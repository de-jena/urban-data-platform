# UDP atlas runtime (issue #28). Same layout as the Event Atlas image so the deployment on
# dimserver02 (mounts below /opt/eventatlas/runtime, uid 65532, workdir) is unchanged.
FROM docker.io/library/eclipse-temurin:25-jre-alpine

ENV APP_HOME=/opt/eventatlas \
    RUNTIME_DIR=/opt/eventatlas/runtime \
    WORK_DIR=/opt/eventatlas/work \
    TMPDIR=/tmp/eventatlas

RUN mkdir -p ${RUNTIME_DIR}/mappings ${RUNTIME_DIR}/profiles ${RUNTIME_DIR}/deployment ${RUNTIME_DIR}/log ${WORK_DIR} ${TMPDIR} && \
    addgroup -g 65532 -S nonroot && adduser -u 65532 -h ${WORK_DIR} -s /bin/false -S nonroot -G nonroot && \
    chown -R 65532:65532 ${RUNTIME_DIR}/log ${WORK_DIR} ${TMPDIR}

COPY content/de.jena.udp.atlas.runtime.docker.jar ${APP_HOME}/

# 8080 HTTP (REST under event/), 1883 + 8885 SensorThings MQTT (TCP + WebSocket).
EXPOSE 8080 1883 8885
# The working directory must be writable: paho's file persistence opens it at activation.
WORKDIR ${WORK_DIR}
USER nonroot

ENTRYPOINT ["java", "-Dgosh.args=--nointeractive", "-Djava.io.tmpdir=/tmp/eventatlas", "-jar", "/opt/eventatlas/de.jena.udp.atlas.runtime.docker.jar"]
