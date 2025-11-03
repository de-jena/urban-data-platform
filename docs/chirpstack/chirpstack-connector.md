# ChirpStack Connector Documentation

## Overview

The ChirpStack Connector is a powerful integration component within the Urban Data Platform that enables seamless connectivity with [ChirpStack LoRaWAN Network Server](https://www.chirpstack.io/). This connector automatically discovers and integrates LoRaWAN IoT sensors, transforming MQTT messages from ChirpStack into SensiNact provider instances.

## Architecture

The ChirpStack connector uses a **reflective, annotation-driven approach** that leverages Eclipse Modeling Framework (EMF) models to automatically map JSON data from ChirpStack MQTT messages to SensiNact providers and services.

### Key Components

- **ChirpstackDeviceFactoryHandler**: Main MQTT message processor that handles device discovery and data transformation
- **EMF Model Annotations**: Declarative mappings between JSON paths and model attributes
- **Reflective Provider Creation**: Automatic instantiation of providers based on device profile matching

## Supported Devices

The connector currently supports the following LoRaWAN sensor types:

### Dragino LSE01 Soil Sensor
- **Profile ID**: `37cf9cbd-e7e1-4269-8c22-b46bb5261a2a`
- **Model**: `Dragino`
- **Services**:
  - **Sensor**: Battery level, temperature (DS18B20), status flags
  - **Soil**: Temperature, moisture, conductivity
  - **Device**: Metadata (DevEUI, names, tenant information)

### SenseCap Environmental Sensors
- **SenseCap S2105**: Soil temperature and moisture sensor
- **SenseCap S2120**: Weather station with multiple environmental parameters

### TEKTELIC Sensors
- Various environmental monitoring devices with customizable sensor configurations

### Other Supported Models
- **SN50**: Multi-purpose sensor node
- **Teros21**: Soil monitoring sensor
- **EM310**: Environmental monitoring sensor

## Configuration

### MQTT Configuration

The connector is configured via the `chirpstack.json` configuration file:

```json
{
  ":configurator:resource-version": 1,
  ":configurator:symbolic-name": "ChirpstackConfig",
  ":configurator:version": "0.0.1",
  
  "ChirpstackConfig": {
    "id": "chirpstack-all",
    "protocol": "ssl",
    "host": "chirpstack.jena.de",
    "port": 8883,
    "topics": [
      "application/5bb92de6-49b3-49af-a366-34667f2230be/device/+/event/up",
      "application/20290ceb-2231-4219-a61c-33eea6fc38f7/device/+/event/up"
    ],
    "certPath": "$[env:CHIRPSTACK_CERT;default=/opt/sensinact/chirpstack/certificates/cert.pem]",
    "certKey": "$[env:CHIRPSTACK_KEY;default=/opt/sensinact/chirpstack/certificates/private.key]",
    "caPath": "$[env:CHIRPSTACK_CA;default=/opt/sensinact/chirpstack/certificates/ca.pem]",
    "caChainPath": [
      "/opt/sensinact/chirpstack/certificates/ISRG_Root_X1_DST_Root_CA_X3_.cer",
      "/opt/sensinact/chirpstack/certificates/R3_ISRG_Root_X1_.cer"
    ]
  }
}
```

### Component Configuration

The device factory handler is configured using OSGi Configuration Admin:

```java
public @interface ChirpstackConfiguration {
    /**
     * MQTT topics to subscribe to (null accepts all)
     */
    String[] mqttTopics();

    /**
     * Name for the IMqttMessageListener service
     */
    String name() default "ChirpstackHandler";
}
```

### Environment Variables and Properties

The connector supports flexible configuration through environment variables and system properties:

- **CHIRPSTACK_CERT**: Path to client certificate
- **CHIRPSTACK_KEY**: Path to private key
- **CHIRPSTACK_CA**: Path to certificate authority certificate

## Data Model and Annotations

### Model Structure

The connector uses EMF (Eclipse Modeling Framework) models with special annotations to define how JSON data maps to SensiNact structures:

```xml
<eClassifiers xsi:type="ecore:EClass" name="Dragino">
  <eAnnotations source="model">
    <details key="name" value="Dragino_LSE01"/>
    <details key="profileId" value="37cf9cbd-e7e1-4269-8c22-b46bb5261a2a"/>
  </eAnnotations>
  <eStructuralFeatures xsi:type="ecore:EReference" name="sensor" eType="#//Sensor"/>
  <eStructuralFeatures xsi:type="ecore:EReference" name="soil" eType="#//Soil"/>
</eClassifiers>
```

### Mapping Annotations

Attributes use `@mapping` annotations to specify JSON path extraction:

```xml
<eStructuralFeatures xsi:type="ecore:EAttribute" name="battery" eType="EDouble">
  <eAnnotations source="mapping">
    <details key="path" value="object/BatV"/>
  </eAnnotations>
</eStructuralFeatures>
```

### Supported JSON Path Syntax

The connector supports sophisticated JSON path navigation:
- **Object properties**: `deviceInfo/deviceName`
- **Array indices**: `rxInfo/0/location`
- **Nested paths**: `object/temp_SOIL_f`

## Message Processing Flow

1. **MQTT Message Reception**: Connector receives uplink messages from ChirpStack
2. **Device Profile Matching**: Extracts `deviceProfileId` and matches against model annotations
3. **Provider Instantiation**: Creates appropriate EMF model instance based on device type
4. **Reflective Population**: Uses mapping annotations to populate attributes from JSON
5. **Metadata Extraction**: Sets provider ID, location, and device information
6. **SensiNact Push**: Pushes complete provider instance to SensiNact gateway

## Example ChirpStack Message

```json
{
  "deduplicationId": "9ffbc7be-916a-4597-9d64-0713a3d5e030",
  "time": "2024-06-20T08:48:38.863512+00:00",
  "deviceInfo": {
    "tenantId": "52f14cd4-c6f1-4fbd-8f87-4025e1d49242",
    "tenantName": "Jena",
    "applicationId": "5bb92de6-49b3-49af-a366-34667f2230be",
    "applicationName": "KSJ_Bodenfeuchte_Stadtforst",
    "deviceProfileId": "37cf9cbd-e7e1-4269-8c22-b46bb5261a2a",
    "deviceProfileName": "Dragino_LSE01",
    "deviceName": "LST25628782",
    "devEui": "a8404187d187106e"
  },
  "object": {
    "BatV": 3.301,
    "temp_DS18B20": "0.00",
    "temp_SOIL": "13.25",
    "water_SOIL_f": 13.74,
    "conduct_SOIL": 35.0
  },
  "rxInfo": [{
    "gatewayId": "a84041ffff1f4b70",
    "location": {
      "latitude": 50.949717,
      "longitude": 11.608153,
      "altitude": 151.0
    }
  }]
}
```

## Generated SensiNact Provider

The above message creates a SensiNact provider with:
- **Provider ID**: `chirpstack-a8404187d187106e`
- **Location**: GeoJSON Point from gateway location
- **Services**:
  - **sensor**: battery=3.301, temperatureDS18B20=0.0
  - **soil**: temperature=13.25, water=13.74, conduct=35.0
  - **device**: devEUI, deviceName, profileId, etc.

## Security Features

### TLS/SSL Support
- **Mutual TLS**: Client certificate authentication
- **Certificate Chain Validation**: Support for certificate authority chains
- **Configurable Certificates**: Environment-based certificate configuration

### Topic Filtering
- **Application-Specific**: Subscribe only to relevant application topics
- **Device Filtering**: Wildcards supported for device-level filtering
- **Security Through Scoping**: Limit exposure to necessary data streams

## Monitoring and Logging

The connector provides comprehensive logging at different levels:

- **INFO**: Device creation and successful updates
- **DEBUG**: Detailed attribute mapping and value setting
- **WARNING**: Missing device profiles or conversion errors
- **ERROR**: MQTT processing failures and connectivity issues

Example log output:
```
INFO: ChirpStack Device Factory Handler activated for topics: application/*/device/+/event/up
INFO: Successfully updated ChirpStack device: LST25628782 (Dragino_LSE01) using provider: Dragino
DEBUG: Set attribute battery = 3.301 from path object/BatV
```

## Adding New Device Types

To add support for new LoRaWAN devices:

1. **Update EMF Model**: Add new EClass with appropriate annotations
2. **Device Profile Mapping**: Add `@model` annotation with `profileId`
3. **Attribute Mappings**: Define `@mapping` annotations for JSON paths
4. **Model Generation**: Regenerate EMF model code
5. **Configuration Update**: Add new topics to chirpstack.json if needed

### Example New Device Type

```xml
<eClassifiers xsi:type="ecore:EClass" name="NewSensorType">
  <eAnnotations source="model">
    <details key="name" value="CustomSensor_V1"/>
    <details key="profileId" value="your-device-profile-id-here"/>
  </eAnnotations>
  <eStructuralFeatures xsi:type="ecore:EReference" name="measurements" eType="#//CustomMeasurements"/>
</eClassifiers>
```

## Troubleshooting

### Common Issues

1. **Device Not Recognized**
   - Check device profile ID matches model annotation
   - Verify MQTT topic subscription includes device's application

2. **Missing Data**
   - Validate JSON path mappings in model annotations
   - Check ChirpStack payload decoder configuration

3. **Connection Issues**
   - Verify TLS certificates and paths
   - Check ChirpStack MQTT broker accessibility

4. **Location Not Set**
   - Ensure ChirpStack gateway has location configured
   - Check rxInfo array contains location data

### Debug Configuration

Enable debug logging by setting log level:
```json
"org.eclipse.sensinact.gateway.southbound.mqtt": "DEBUG"
```

## Integration with SensiNact

The connector integrates seamlessly with the SensiNact gateway:

- **Automatic Provider Registration**: No manual provider configuration needed
- **Service Discovery**: All device services automatically available
- **Resource Accessibility**: Standard SensiNact REST API access
- **History Integration**: Automatic data persistence when history provider configured

## API Access

Once devices are connected, they are accessible via standard SensiNact APIs:

**REST API Endpoints:**
- List providers: `GET /udp/rest/sensinact/providers`
- Device data: `GET /udp/rest/sensinact/providers/chirpstack-{devEUI}`
- Soil data: `GET /udp/rest/sensinact/providers/chirpstack-{devEUI}/soil`

**SensorThings API:**
- Things: Accessible as SensorThings entities
- Observations: Historical data through SensorThings observations

For comprehensive SensiNact API documentation, refer to: [Eclipse SensiNact Documentation](https://eclipse-sensinact.readthedocs.io/)