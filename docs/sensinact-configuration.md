# SensiNact Configuration Documentation

This document describes the options configured in the `sensinact.json` configuration files used within the Urban Data Platform.

For comprehensive SensiNact documentation, please refer to the official documentation: https://eclipse-sensinact.readthedocs.io/en/latest/index.html

## Overview

The SensiNact gateway uses JSON configuration files to define various settings for northbound interfaces, session management, and Sensorthings MQTT broker configurations. The current configuration is located in:

`/backend/de.jena.udp.sensinact.runtime.config/configs/sensinact.json`

## Configuration Structure

### Basic Configuration Metadata

```json
{
    ":configurator:resource-version": 1,
    ":configurator:symbolic-name": "org.eclipse.sensinact.gateway.configuration",
    ":configurator:version": "0.0.1"
}
```

- **resource-version**: Version of the configuration resource format
- **symbolic-name**: Unique identifier for the configuration component
- **version**: Version of this specific configuration

### REST Northbound Interface

```json
"sensinact.northbound.rest": {
    "allow.anonymous": true,
    "osgi.jakartars.whiteboard.target": "(jersey.jakartars.whiteboard.name=udprest)"
}
```

**Configuration Options:**
- **allow.anonymous** (boolean): Enables anonymous access to the REST API
- **osgi.jakartars.whiteboard.target** (string): OSGi filter for targeting specific JAX-RS whiteboard services (configured for `udprest`)

**Note:** The JAX-RS whiteboard service `udprest` is configured in the `http.json` file via the `JakartarsServletWhiteboardRuntimeComponent~udprest` configuration:

```json
"JakartarsServletWhiteboardRuntimeComponent~udprest": {
    "jersey.jakartars.whiteboard.name": "udprest",
    "jersey.context.path": "rest",
    "osgi.http.whiteboard.target": "(rest=true)"
}
```

### Session Manager

```json
"sensinact.session.manager": {
    "auth.policy": "ALLOW_ALL"
}
```

**Configuration Options:**
- **auth.policy** (string): Authorization policy. Currently set to `ALLOW_ALL`, which **deactivates authorization** and permits all requests without authorization.

For more information about SensiNact authorization and other available authorization policies, please refer to: https://eclipse-sensinact.readthedocs.io/en/latest/northbound/Authorization.html

### History Provider

```json
"sensinact.sensorthings.northbound.rest": {
    "history.provider": "brokerHistory"
}
```

**Configuration Options:**
- **history.provider** (string): Specifies the history data provider service. Currently set to `brokerHistory`, which references the TimescaleDB history provider configured in `/backend/de.jena.udp.sensinact.runtime.config.docker/configs/timescale.json`.

The TimescaleDB configuration includes:
```json
"sensinact.history.timescale": {
    "url": "jdbc:postgresql://[host]:[port]/[database]",
    "user": "[username]",
    ".password": "[password]",
    "provider": "brokerHistory",
    "exclude.resources": [
    		"{\"resource\": {\"value\": \"observedArea\",\"type\":\"EXACT\"}} ",
			"{\"resource\": {\"value\": \"objects\",\"type\":\"EXACT\"}} ",
			"{\"resource\": {\"value\": \"viewport\",\"type\":\"EXACT\"}} "
    ],
    "include.resource": [
			"{\"provider\": {\"value\": \"foo\",\"type\":\"EXACT\"}} "
    ]
}
```

The configuration allows the definition of black- and whitelists (```exclude```, ```include```) to filter the historicised data. 

For detailed information about the TimescaleDB history provider configuration, please refer to: https://eclipse-sensinact.readthedocs.io/en/latest/southbound/history/timescale.html

### SensorThings MQTT Configuration

```json
"sensiNact.northbound.sensorthings.mqtt": {
    "port": "$[env:SENSORTHINGS_MQTT_PORT;default=$[prop:SENSORTHINGS_MQTT_PORT;default=1883]]",
    "secure.port": "$[env:SENSORTHINGS_MQTT_SECURE_PORT;default=$[prop:SENSORTHINGS_MQTT_SECURE_PORT;default=8883]]",
    "websocket.port": "$[env:SENSORTHINGS_MQTT_WS_PORT;default=$[prop:SENSORTHINGS_MQTT_WS_PORT;default=8885]]",
    "websocket.secure.port": "$[env:SENSORTHINGS_MQTT_WSS_PORT;default=$[prop:SENSORTHINGS_MQTT_WSS_PORT;default=8886]]",
    "keystore.file": "$[env:SENSORTHINGS_MQTT_KEYSTORE_FILE;default=$[prop:SENSORTHINGS_MQTT_KEYSTORE_FILE;default=]]",
    "keystore.type": "$[env:SENSORTHINGS_MQTT_KEYSTORE_TYPE;default=$[prop:SENSORTHINGS_MQTT_WSS_KEYSTORE_TYPE;default=jks]]",
    ".keystore.password": "$[env:SENSORTHINGS_MQTT_KEYSTORE_PASSWORD;default=$[prop:SENSORTHINGS_MQTT_KEYSTORE_PASSWORD;default=]]",
    ".keymanager.password": "$[env:SENSORTHINGS_MQTT_KEYMANAGER_PASSWORD;default=$[prop:SENSORTHINGS_MQTT_KEYMANAGER_PASSWORD;default=]]"
}
```

This option can be configured via environment variables or Java properties, e.g. ```-runvm -DSENSORTHINGS_MQTT_PORT=2883``` in the ```bndrun```.

**Port Configuration:**

- **port**: Standard MQTT port (default: 1883)
- **secure.port**: Secure MQTT port with TLS (default: 8883)
- **websocket.port**: WebSocket MQTT port (default: 8885)
- **websocket.secure.port**: Secure WebSocket MQTT port (default: 8886)

**TLS Configuration Options:**
- **keystore.file**: Path to the keystore file for TLS certificates
- **keystore.type**: Type of keystore (default: jks - Java KeyStore)
- **.keystore.password**: Password for the keystore (prefixed with dot for security)
- **.keymanager.password**: Password for the key manager (prefixed with dot for security)

## Environment Variable and Property Substitution

The configuration supports dynamic value resolution using the following pattern:
```
$[env:ENVIRONMENT_VARIABLE_NAME;default=$[prop:PROPERTY_NAME;default=fallback_value]]
```

This allows:
1. First preference: Environment variable
2. Second preference: System property
3. Final fallback: Default value

## Security Considerations

- Anonymous access is currently enabled (`allow.anonymous: true`)
- Authentication policy is set to `ALLOW_ALL`
- TLS configuration is available but requires proper keystore setup
- Passwords in configuration use dot prefix (`.keystore.password`) indicating sensitive data