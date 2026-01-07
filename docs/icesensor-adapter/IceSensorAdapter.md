# IceSensor SensiNact Adapter

## Overview

The IceSensor adapter integrates air quality sensors from the Smart City Factory platform into the Eclipse SensiNact Gateway. These sensors monitor environmental conditions including various air pollutants, particulate matter, temperature, humidity, and pressure.

This adapter connects to the Smart City Factory WebSocket API and transforms the data into SensiNact providers using EMF-based QVTo model transformations.

## System Architecture

```
Smart City Factory → WebSocket Client → IceSensor Adapter → SensiNact Provider
(Air Quality Data)   (PushStream)       (EMF QVTo)           (IceSensor)
```

## EMF Ecore Data Model

The IceSensor adapter uses two EMF Ecore models:

**Input Model**: `backend/de.jena.icesensor.model/model/icesensor.ecore`
- **EMF Namespace**: `https://jena.de/models/icesensor/1.0`

**SensiNact Provider Model**: `backend/de.jena.icesensor.sensinact.model/model/icesensor.ecore`
- **EMF Namespace**: `https://jena.de/models/icesensor/sensinact/1.0`

### IceSensor Provider

The `IceSensor` represents an air quality monitoring station:

```xml
<eClassifiers xsi:type="ecore:EClass" name="IceSensor"
    eSuperTypes="sensinact.ecore#//Provider"/>
```

### SensorData Service

Each measurement type is represented as a `SensorData` service with statistical values:

```xml
<eClassifiers xsi:type="ecore:EClass" name="SensorData"
    eSuperTypes="sensinact.ecore#//Service">
  <eStructuralFeatures name="avg" eType="ecore:EDataType Ecore#//EDouble"/>
  <eStructuralFeatures name="min" eType="ecore:EDataType Ecore#//EDouble"/>
  <eStructuralFeatures name="max" eType="ecore:EDataType Ecore#//EDouble"/>
  <eStructuralFeatures name="unit" eType="ecore:EDataType Ecore#//EString"/>
  <eStructuralFeatures name="sensor_type" eType="ecore:EDataType Ecore#//EString"/>
  <eStructuralFeatures name="sensor_model" eType="ecore:EDataType Ecore#//EString"/>
  <eStructuralFeatures name="gateway" eType="ecore:EDataType Ecore#//EString"/>
  <eStructuralFeatures name="validity" eType="ecore:EDataType Ecore#//EInt"/>
  <eStructuralFeatures name="created_at" eType="ecore:EDataType Ecore#//EDate"/>
</eClassifiers>
```

## Data Source

The adapter uses **WebSocket streaming** from Smart City Factory:

- **Protocol**: WebSocket (WSS)
- **Endpoint**: `wss://jena.smart-city-factory.com/ws/sensor/`
- **Authentication**: Token-based query parameter
- **Data Flow**: Real-time PushStream

## Measured Parameters

### Air Pollutants (µg/m³)

| Service | Description | JSON Alias |
|---------|-------------|------------|
| h2sugm3 | Hydrogen Sulfide (H₂S) | h2s-ugm3 |
| cougm3 | Carbon Monoxide (CO) | co-ugm3 |
| nougm3 | Nitric Oxide (NO) | no-ugm3 |
| no2ugm3 | Nitrogen Dioxide (NO₂) | no2-ugm3 |
| o3ugm3 | Ozone (O₃) | o3-ugm3 |

### Particulate Matter

| Service | Description | JSON Alias |
|---------|-------------|------------|
| _1p | PM1.0 (fine particles) | 1.0p |
| _2_5p | PM2.5 (fine particles) | 2.5p |
| _10p | PM10 (coarse particles) | 10p |

### Environmental Conditions

| Service | Description |
|---------|-------------|
| temperature | Air temperature |
| humidity | Relative humidity |
| pressure | Atmospheric pressure |

### Air Quality Index

| Service | Description |
|---------|-------------|
| aqi | Air Quality Index value |
| aqi_criteria | AQI classification criteria |

## Provider Model

Each IceSensor station is represented as an `IceSensor` provider:

```
IceSensor (Provider ID: {ice_id})
├── admin
│   ├── friendlyName: "IceSensor {id}"
│   └── location: GeoJSON Point
├── h2sugm3 (SensorData)
│   ├── avg: 0.5
│   ├── min: 0.1
│   ├── max: 1.2
│   └── unit: "µg/m³"
├── cougm3 (SensorData)
├── nougm3 (SensorData)
├── no2ugm3 (SensorData)
├── o3ugm3 (SensorData)
├── _1p (SensorData)
├── _2_5p (SensorData)
├── _10p (SensorData)
├── temperature (SensorData)
├── humidity (SensorData)
├── pressure (SensorData)
├── aqi (SensorData)
└── aqi_criteria (SensorData)
```

## REST API Access

Access IceSensor data through SensiNact REST API (local environment):

```bash
# List all IceSensor providers
curl "http://localhost:8080/udp/rest/sensinact/providers?filter=(MODEL=IceSensor)"

# Get specific sensor
curl http://localhost:8080/udp/rest/sensinact/providers/{sensor_id}

# Get all services
curl http://localhost:8080/udp/rest/sensinact/providers/{sensor_id}/services

# Get temperature average value
curl http://localhost:8080/udp/rest/sensinact/providers/{sensor_id}/services/temperature/resources/avg/GET

# Get PM2.5 measurements
curl http://localhost:8080/udp/rest/sensinact/providers/{sensor_id}/services/_2_5p/resources/avg/GET

# Get Air Quality Index
curl http://localhost:8080/udp/rest/sensinact/providers/{sensor_id}/services/aqi/resources/avg/GET
```

### SensorThings API Access

Access via OGC SensorThings API (local environment):

```bash
# Get IceSensor as Things
curl "http://localhost:8080/udp/rest/v1.1/Things?\$filter=contains(name,'IceSensor')"

# Get temperature datastream
curl "http://localhost:8080/udp/rest/v1.1/Datastreams({sensor_id}~temperature~avg)"

# Get temperature history
curl "http://localhost:8080/udp/rest/v1.1/Datastreams({sensor_id}~temperature~avg)/Observations?\$orderby=resultTime desc&\$top=10"

# Get PM2.5 history
curl "http://localhost:8080/udp/rest/v1.1/Datastreams({sensor_id}~_2_5p~avg)/Observations?\$orderby=resultTime desc&\$top=10"
```

## Use Cases

### Air Quality Monitoring

Monitor real-time air quality across the city:

```bash
curl http://localhost:8080/udp/rest/sensinact/providers/{sensor_id}/services/aqi/resources/avg/GET
```

### Pollution Analysis

Track specific pollutant levels:

```bash
# Nitrogen dioxide levels
curl http://localhost:8080/udp/rest/sensinact/providers/{sensor_id}/services/no2ugm3/resources/avg/GET

# Ozone levels
curl http://localhost:8080/udp/rest/sensinact/providers/{sensor_id}/services/o3ugm3/resources/avg/GET
```

### Environmental Health

- Monitor air quality index trends
- Track particulate matter (PM2.5, PM10) for health advisories
- Correlate weather conditions with pollution levels
- Support public health decision-making

### Climate Monitoring

Track environmental conditions:

```bash
# Temperature
curl http://localhost:8080/udp/rest/sensinact/providers/{sensor_id}/services/temperature/resources/avg/GET

# Humidity
curl http://localhost:8080/udp/rest/sensinact/providers/{sensor_id}/services/humidity/resources/avg/GET

# Pressure
curl http://localhost:8080/udp/rest/sensinact/providers/{sensor_id}/services/pressure/resources/avg/GET
```

## Configuration

### OSGi Component Configuration

The IceSensor WebSocket client requires configuration:

```java
public @interface IceSensorWebsocketConfig {
    String token() default "";
}
```

### Example Configuration

```json
{
  "IceSensorWebsocketClient": {
    "token": "your-api-token"
  }
}
```

## Data Transformation

The adapter uses **QVTo (Query/View/Transformation Operational)** to transform IceSensor data into SensiNact provider structures. The transformations are defined in:

```
backend/de.jena.icesensor.sensinact.mmt/transformations/
```

The transformation process:
1. Receive sensor data via WebSocket PushStream
2. Apply QVTo transformation to create SensiNact provider
3. Set location from sensor coordinates
4. Push update to SensiNact

## Troubleshooting

### No IceSensor Data Appearing

1. **Check WebSocket connection**:
   - Verify token is configured correctly
   - Check network connectivity to smart-city-factory.com

2. **Check provider exists**:
   ```bash
   curl "http://localhost:8080/udp/rest/sensinact/providers?filter=(MODEL=IceSensor)"
   ```

3. **Check logs**:
   ```bash
   docker logs udp-broker | grep -i icesensor
   ```

### Authentication Issues

- Verify the API token in configuration
- Check token expiration with Smart City Factory

### Missing Sensor Values

Not all sensors may report all measurement types. Services are only created when the corresponding data is received from the sensor.

## Dependencies

- **Eclipse SensiNact Gateway** (Core framework)
- **Eclipse EMF** (Modeling framework)
- **QVTo** (Model transformation engine)
- **Jetty WebSocket Client** (WebSocket connectivity)
- **OSGi PushStream** (Reactive data streaming)
- **TimescaleDB** (History storage)

## Related Documentation

- [Weather Adapter](../weather-adapter/UDPSensinactWeatherAdapter.md) - Weather data integration
- [TTN Adapter](../ttn-adapter/TTNSensinactAdapter.md) - LoRaWAN sensor integration
- [SensiNact Configuration](../sensinact-configuration.md) - General SensiNact setup
