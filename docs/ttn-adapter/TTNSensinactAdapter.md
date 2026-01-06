# TTN (The Things Network) SensiNact Adapter

## Overview

The TTN (The Things Network) SensiNact Adapter enables seamless integration with LoRaWAN devices connected through The Things Network infrastructure. This adapter processes MQTT messages from TTN and transforms them into SensiNact provider instances, supporting various sensor types including temperature, soil moisture, and noise sensors.

## Architecture

The TTN adapter follows the same reflective, annotation-driven approach as the ChirpStack adapter, utilizing Eclipse Modeling Framework (EMF) models to automatically map JSON data from TTN MQTT messages to SensiNact providers and services.

### Key Components

- **TTN Model**: EMF model defining TTN uplink payload structure (`de.jena.ttn.model`)
- **TTN SensiNact Model**: SensiNact-specific model for sensor data transformation (`de.jena.ttn.sensinact.model`)
- **Model-to-Model Transformation (MMT)**: QVTo transformations converting TTN data to SensiNact format (`de.jena.ttn.sensinact.mmt`)

## Supported Sensors

The TTN adapter currently supports the following sensor types through dedicated provider models:

### Temperature Sensors (`TtnTemperatureSensor`)
- **Service**: `temperaturData`
- **Resources**: 
  - Temperature measurements
  - Battery level
  - Device metadata

### Soil Moisture Sensors (`TtnSoilMoistureSensor`)
- **Service**: `soilMoistureData`
- **Resources**:
  - Soil moisture percentage
  - Temperature readings
  - Battery status
  - Environmental conditions

### Noise Sensors (`TtnNoiseSensor`)
- **Service**: `noiseData`
- **Resources**:
  - Sound level measurements (dB)
  - Frequency analysis
  - Peak/average values

## Configuration

### MQTT Configuration

The TTN adapter is configured through the `ttn.json` configuration file:

```json
{
  ":configurator:resource-version": 1,
  ":configurator:symbolic-name": "TTNConfig",
  ":configurator:version": "0.0.1",
  
  "TTNConfig": {
    "id": "ttn-sensors",
    "protocol": "ssl",
    "host": "eu1.cloud.thethings.network",
    "port": 8883,
    "username": "your-application-id@your-tenant-id",
    ".password": "your-api-key",
    "topics": [
      "v3/+/devices/+/up"
    ]
  }
}
```

### Model-to-Model Transformation

The MMT configuration (`mmt-config.json`) defines how TTN messages are transformed:

```json
{
  ":configurator:resource-version": 1,
  ":configurator:symbolic-name": "de.jena.ttn.sensinact.mmt.TTNTransformer",
  ":configurator:version": "0.0.1",
  
  "de.jena.ttn.sensinact.mmt.TTNTransformer": {
    "sensiNact.provider.manager.whiteboard.target": "(provider.name=generic)",
    "transformation.script": "/transformations/ttn.qvto",
    "source.mapping": {
      "ttn": "de.jena.model.ttn.TTNPackage"
    },
    "target.mapping": {
      "ttn_sensinact": "de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage"
    }
  }
}
```

## Data Model Structure

### TTN Uplink Message

The TTN model represents the standard TTN v3 uplink message structure:

```json
{
  "end_device_ids": {
    "device_id": "sensor-001",
    "application_ids": {
      "application_id": "my-sensors"
    }
  },
  "uplink_message": {
    "decoded_payload": {
      "temperature": 22.5,
      "humidity": 65.3,
      "battery": 3.7
    },
    "rx_metadata": [
      {
        "gateway_ids": {
          "gateway_id": "gateway-001"
        },
        "location": {
          "latitude": 50.9271,
          "longitude": 11.5892
        },
        "rssi": -95,
        "snr": 8.5
      }
    ],
    "settings": {
      "data_rate": {
        "lora": {
          "bandwidth": 125000,
          "spreading_factor": 7
        }
      },
      "frequency": "867100000"
    }
  }
}
```

### SensiNact Provider Generation

The transformation creates SensiNact providers with the following structure:

- **Provider ID**: `ttn-{device_id}`
- **Location**: Extracted from gateway location or device location if available
- **Services**: Based on sensor type and decoded payload structure
- **Metadata**: Device information, gateway details, transmission parameters

## Message Processing Flow

1. **MQTT Reception**: Adapter receives uplink messages from TTN MQTT broker
2. **Payload Parsing**: JSON message parsed into TTN EMF model
3. **Device Type Detection**: Determines sensor type from device ID or payload structure
4. **MMT Transformation**: QVTo transformation converts TTN model to SensiNact model
5. **Provider Creation**: SensiNact provider instance created with appropriate services
6. **Data Push**: Complete provider pushed to SensiNact gateway

## QVTo Transformation Rules

The transformation script (`ttn.qvto`) includes mappings for:

### Basic Provider Mapping
```qvto
mapping TtnUplinkPayload::toTtnSensor() : TtnSensor {
    deviceId := self.endDeviceIds.deviceId;
    applicationId := self.endDeviceIds.applicationIds.applicationId;
    
    // Extract location from first available gateway
    if (not self.uplinkMessage.rxMetadata->isEmpty()) {
        location := self.uplinkMessage.rxMetadata->first().toLocation();
    };
}
```

### Sensor Data Mapping
```qvto
mapping TtnUplinkPayload::toTemperatureData() : TemperaturData
when {
    self.uplinkMessage.decodedPayload.oclIsKindOf(Dict) and
    self.uplinkMessage.decodedPayload.oclAsType(Dict).hasKey('temperature')
} {
    temperature := self.uplinkMessage.decodedPayload.getValue('temperature').oclAsType(Real);
    timestamp := self.receivedAt;
}
```

## Security and Authentication

### TTN API Key Configuration
- Use application API keys with minimal required permissions
- Store API keys securely using configuration system's password handling
- Prefix sensitive values with '.' in configuration files

### TLS Connection
- TTN connections use TLS by default
- Certificate validation against TTN's certificate chain
- Support for custom CA certificates if needed

## Monitoring and Troubleshooting

### Logging Configuration

Enable debug logging for TTN components:

```json
"org.eclipse.sensinact.gateway.southbound.mqtt.generic": "DEBUG",
"de.jena.ttn.sensinact.mmt": "DEBUG"
```

### Common Issues

1. **Authentication Failures**
   - Verify API key permissions
   - Check application ID matches TTN console
   - Ensure correct TTN region endpoint

2. **Missing Sensor Data**
   - Verify payload decoder in TTN application
   - Check QVTo transformation rules match payload structure
   - Validate device is sending data to correct application

3. **Location Not Set**
   - Configure gateway locations in TTN console
   - Ensure RX metadata includes location information
   - Check GPS coordinates are valid

## Integration Examples

### REST API Access

Access TTN sensor data through SensiNact REST API:

```bash
# List all TTN providers
GET /udp/rest/sensinact/providers?filter=ttn-*

# Get specific sensor data
GET /udp/rest/sensinact/providers/ttn-sensor-001/temperaturData

# Get historical data through SensorThings API
GET /udp/sensorthings/v1.1/Things('ttn-sensor-001')/Datastreams
```

### MQTT Notifications

Subscribe to sensor updates via SensiNact MQTT:

```bash
mosquitto_sub -h localhost -p 1883 -t "sensinact/providers/ttn-sensor-001/services/temperaturData/resources/temperature/VALUE_CHANGED"
```

## Extending Device Support

To add support for new TTN device types:

1. **Update TTN SensiNact Model**: Add new sensor types to the model
2. **Extend QVTo Transformations**: Add mapping rules for new payload formats
3. **Update Configuration**: Include new device patterns in topic filters
4. **Test Integration**: Validate data flow from device to SensiNact

### Example: Adding Air Quality Sensor

```xml
<!-- In ttn.ecore model -->
<eClassifiers xsi:type="ecore:EClass" name="TtnAirQualitySensor" eSuperTypes="#//AbstractTtnProvider">
  <eStructuralFeatures xsi:type="ecore:EReference" name="airQualityData" eType="#//AirQualityData"/>
</eClassifiers>

<eClassifiers xsi:type="ecore:EClass" name="AirQualityData">
  <eStructuralFeatures xsi:type="ecore:EAttribute" name="pm25" eType="EDouble"/>
  <eStructuralFeatures xsi:type="ecore:EAttribute" name="pm10" eType="EDouble"/>
  <eStructuralFeatures xsi:type="ecore:EAttribute" name="co2" eType="EDouble"/>
</eClassifiers>
```

```qvto
-- In ttn.qvto transformation
mapping TtnUplinkPayload::toAirQualityData() : AirQualityData
when {
    self.uplinkMessage.decodedPayload.hasKey('pm2_5') and
    self.uplinkMessage.decodedPayload.hasKey('pm10')
} {
    pm25 := self.uplinkMessage.decodedPayload.getValue('pm2_5').oclAsType(Real);
    pm10 := self.uplinkMessage.decodedPayload.getValue('pm10').oclAsType(Real);
    co2 := self.uplinkMessage.decodedPayload.getValue('co2').oclAsType(Real);
}
```

## Related Documentation

- [ChirpStack Connector Documentation](../chirpstack/chirpstack-connector.md)
- [SensiNact Configuration](../sensinact-configuration.md)
- [TTN Documentation](https://www.thethingsnetwork.org/docs/)
- [Eclipse SensiNact Documentation](https://eclipse-sensinact.readthedocs.io/)