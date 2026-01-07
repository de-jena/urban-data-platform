# GLT (Gebäudeleittechnik) SensiNact Adapter

## Overview

The GLT (Gebäudeleittechnik / Building Automation) adapter integrates building management systems into the Eclipse SensiNact Gateway. GLT systems monitor and control building infrastructure including heating, ventilation, air conditioning (HVAC), and other building services.

This adapter polls data from the GLT REST API at configurable intervals and transforms the data into SensiNact providers.

## System Architecture

```
GLT REST API → Scheduled Polling → SensiNact Provider
(Building Data)   (Interval)         (GltSide)
```

## EMF Ecore Data Model

The GLT adapter is built on EMF Ecore models defined in:
`backend/de.jena.glt.sensinact.model/model/glt.ecore`

**EMF Namespace**: `https://model.data.jena.de/sensinact/glt/1.0`

### GltSide Provider

The `GltSide` represents a building or site with monitoring points:

```xml
<eClassifiers xsi:type="ecore:EClass" name="GltSide"
    eSuperTypes="sensinact.ecore#//DynamicProvider"/>
```

### MonitoringData Service

Each monitoring point is represented as a `MonitoringData` service:

```xml
<eClassifiers xsi:type="ecore:EClass" name="MonitoringData"
    eSuperTypes="sensinact.ecore#//Service">
  <eStructuralFeatures xsi:type="ecore:EAttribute" name="value"
      eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EFloat"/>
</eClassifiers>
```

## Data Source

Unlike MQTT-based adapters, the GLT adapter uses **REST API polling**:

- **Protocol**: HTTPS REST API
- **Authentication**: Keycloak OAuth2
- **Polling**: Scheduled at configurable intervals (default: 10 minutes)
- **Data Types**: DATALOG, ANALOG_HARDWARE, DIGITAL_HARDWARE

## Provider Model

Each GLT site is represented as a `GltSide` provider:

```
GltSide (Provider ID: 065)
├── admin
│   ├── friendlyName: "Funktionsgebäude Leichtathletikstadion"
│   └── location: GeoJSON Point
├── 16842753 (MonitoringData)
│   └── value: 8.82 (temperature sensor)
├── 16842754 (MonitoringData)
│   └── value: 7.30 (temperature sensor)
├── 17170438 (MonitoringData)
│   └── value: ... (monitoring point)
└── ... (additional monitoring points)
```

**Service Metadata**:
- `description`: Human-readable point description
- `pointNumber`: Monitoring point number
- `pointId`: Unique point identifier

## Configuration

### OSGi Component Configuration

The GLT adapter requires configuration with the following properties:

```java
@ObjectClassDefinition(name = "GLT Configuration")
public @interface GltConfiguration {
    String systemID();           // System/Site ID
    int[] points();              // Measurement points (optional, auto-discovered if empty)
    long interval() default 10;  // Update interval in minutes
    long back() default 60;      // Time to look back on update in minutes
}
```

### Example Configuration

```json
{
  "Glt~building1": {
    "systemID": "065",
    "interval": 10,
    "back": 60
  }
}
```

### Authentication

GLT API authentication is configured via Keycloak:
`backend/de.jena.glt.sensinact/configs/keycloak.json`

## REST API Access

Access GLT building data through SensiNact REST API (local environment):

```bash
# List all GLT providers
curl "http://localhost:8080/udp/rest/sensinact/providers?filter=(MODEL=GltSide)"

# Get specific building
curl http://localhost:8080/udp/rest/sensinact/providers/065

# Get all monitoring services
curl http://localhost:8080/udp/rest/sensinact/providers/065/services

# Get monitoring point value
curl http://localhost:8080/udp/rest/sensinact/providers/065/services/16842753/resources/value/GET

# Response example:
{
  "type": "GET_RESPONSE",
  "uri": "/065/16842753/value",
  "statusCode": 200,
  "response": {
    "name": "value",
    "timestamp": 1767780900000,
    "type": "float",
    "value": 8.823793
  }
}

# Get building name
curl http://localhost:8080/udp/rest/sensinact/providers/065/services/admin/resources/friendlyName/GET
```

### SensorThings API Access

Access via OGC SensorThings API (local environment):

```bash
# Get GLT buildings as Things
curl "http://localhost:8080/udp/rest/v1.1/Things?\$filter=contains(name,'Funktionsgebäude')"

# Get a specific datastream
curl "http://localhost:8080/udp/rest/v1.1/Datastreams(065~16842753~value)"

# Get monitoring observations (history)
curl "http://localhost:8080/udp/rest/v1.1/Datastreams(065~16842753~value)/Observations?\$orderby=resultTime desc&\$top=10"
```

## Use Cases

### Building Energy Monitoring

Monitor temperature and energy consumption:

```bash
curl http://localhost:8080/udp/rest/sensinact/providers/065/services/16842753/resources/value/GET
```

### HVAC System Monitoring

Track heating, ventilation, and air conditioning parameters across building systems.

### Facility Management

- Monitor building infrastructure status
- Track sensor values over time
- Analyze energy efficiency patterns
- Detect anomalies in building systems

## Data Flow

1. **Scheduled Trigger**: Executor runs at configured interval (default 10 minutes)
2. **API Request**: Fetch datalog content from GLT REST API for configured time range
3. **Response Processing**: Parse response and extract time/value entries
4. **DTO Creation**: Create GltDto with system ID, point ID, value, and timestamp
5. **Batch Push**: Push updates to SensiNact in batches of 1000
6. **History Storage**: Data automatically stored in TimescaleDB

## Troubleshooting

### No GLT Data Appearing

1. **Check configuration**:
   - Verify `systemID` is correct
   - Check `interval` and `back` settings

2. **Check API connectivity**:
   ```bash
   # Verify GLT provider exists
   curl "http://localhost:8080/udp/rest/sensinact/providers?filter=(MODEL=GltSide)"
   ```

3. **Check logs**:
   ```bash
   docker logs udp-broker | grep -i glt
   ```

### Authentication Issues

- Verify Keycloak configuration in `configs/keycloak.json`
- Check API credentials and token refresh

### Missing Monitoring Points

- If `points` array is empty, points are auto-discovered from the GLT API
- Verify the GLT system has DATALOG, ANALOG_HARDWARE, or DIGITAL_HARDWARE entities

## Dependencies

- **Eclipse SensiNact Gateway** (Core framework)
- **Eclipse EMF** (Modeling framework)
- **Keycloak** (OAuth2 authentication)
- **GLT REST API** (Data source)
- **TimescaleDB** (History storage)

## Related Documentation

- [SensiNact Configuration](../sensinact-configuration.md) - General SensiNact setup
- [ILSA Adapter](../ilsa-adapter/ILSASensinactAdapter.md) - Traffic light integration
- [Eclipse SensiNact Documentation](https://eclipse.org/sensinact/)
