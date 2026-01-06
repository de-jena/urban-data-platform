# ILSA (Integrierte Lichtsignalanlage) SensiNact Adapter

## Overview

The ILSA SensiNact Adapter enables integration with German Integrated Traffic Light Systems ("Integrierte Lichtsignalanlage") through MQTT data feeds. This adapter processes real-time traffic light signal data from devices that directly read the electrical signals from traffic light systems at intersections, transforming this data into SensiNact provider instances for smart city monitoring applications.

## Architecture

The ILSA adapter follows the standard EMF-based architecture with Model-to-Model Transformation (MMT) for processing traffic light signal data received via MQTT:

### Key Components

- **ILSA Model**: EMF model defining ILSA traffic light data structures (`de.jena.ilsa.sensinact.model`)
- **MMT Transformation**: QVTo transformation for converting ILSA signal data to SensiNact format (`de.jena.ilsa.sensinact.mmt`)
- **MQTT Integration**: Receives real-time signal data from traffic light monitoring devices (`de.jena.ilsa.sensinact`)

## Data Model Structure

### Traffic Signals

The ILSA adapter processes traffic light signal state information from intersection monitoring devices:

#### Signal Service

Each traffic light signal is represented as a **Signal** service in SensiNact with a single resource:

**Resource**: `color` (String)
- Contains the current signal state as an UTF8 representation
- Examples:
  - `"⚪⚪🔴"` - Red light active (position 3)
  - `"🟢⚪⚪"` - Green light active (position 1)
  - `"⚪🟡⚪"` - Amber/Yellow light active (position 2)
  - `"⚪🟡🔴"` - Red and amber together
- Updated in real-time via MQTT
- Includes timestamp metadata

**Service Metadata** (set during configuration):
- `type`: Signal type (e.g., "RED_AMBER_GREEN", "RED_GREEN", "BUTTON", "ORIENTATION_SOUND")
- `signalGroup`: Signal group identifier (e.g., "K1", "F2", "RF3")
- `observedArea`: GeoJSON polygon defining the area monitored by this signal

#### Intersection Configuration

EMF model **TLConfiguration** containing static intersection setup:

- **intersectionId**: Unique identifier (e.g., "K440")
- **intersectionName**: Human-readable name (e.g., "Felsenkeller")
- **geoJson**: Intersection boundary as GeoJSON FeatureCollection
- **subcircles**: Traffic control subcircles
- **serialPorts**: Hardware serial port connections
- **modules**: Signal reader hardware modules
- **signals**: Individual traffic light signals with:
  - Signal ID (e.g., "K1/1")
  - Signal type: `RED_AMBER_GREEN`, `RED_GREEN`, `BUTTON`, `BLIND_BUTTON`, `ORIENTATION_SOUND`, `SIGNAL_IS_COMING`, `BLINKING`
  - Signal group reference
  - ObservedArea (GeoJSON polygon)
  - Physical location coordinates

#### Thermal Service

Optional **Thermal** admin service for temperature monitoring:

- **temperature** (Double): Temperature in Celsius from intersection hardware sensors

## Configuration

### MQTT Topic Structure

The ILSA adapter subscribes to MQTT messages with the following topic pattern:

**Topic Pattern**: `5g/ilsa/#`

**Topic Structure**:
- Configuration messages: `5g/ilsa/{intersectionId}/config/retained`
- Signal state messages: `5g/ilsa/{intersectionId}/{subcircle}/{signalId}/...`
- Thermal data: `5g/ilsa/{intersectionId}/thermal`

**Examples**:
- `5g/ilsa/K440/config/retained` - Static intersection configuration
- `5g/ilsa/K440/1/K1_1` - Signal state update for K1/1
- `5g/ilsa/K434/thermal` - Temperature sensor data

### OSGi Component Configuration

The ILSA adapter is activated as an OSGi component with the following dependencies:

```java
@Component(name = "TrafficLightComponent")
@Reference(target = "(transformator.id=TLSTrafficLightToIlsa)")
private ModelTransformator traf;

@Reference(target = "(id=read)")
private MessagingService messaging;
```

The adapter uses:
- **ModelTransformator** service with ID `TLSTrafficLightToIlsa` for configuration transformation
- **MessagingService** with ID `read` for MQTT subscription
- **DataUpdate** service for pushing data to SensiNact

## MQTT Message Format

### Signal State Messages

Traffic light signal state updates are published as **TLSignalState** EMF objects serialized to JSON on topics matching the pattern:
`5g/ilsa/{intersectionId}/{subcircle}/{signalId}`

**Example Topic**: `5g/ilsa/K413/tk1/K3/1`

**Message Format**:
```json
{
  "eClass": "http://jena.de/udp/trafficos/trafficlight/1.1.1#//TLSignalState",
  "id": "K3/1",
  "signalGroup": {
    "id": "K3"
  },
  "timestamp": "2026-01-06T14:48:15.288ZCET",
  "state": "⚪⚪🔴",
  "values": [
    false,
    false,
    true
  ]
}
```

**Field Descriptions**:
- `eClass`: EMF class reference to TLSignalState
- `id`: Signal identifier (e.g., "K3/1")
- `signalGroup`: Object containing the signal group ID
- `timestamp`: ISO 8601 timestamp with timezone
- `state`: Visual UTF8 representation of light states
  - White circle (⚪) = light off
  - Red circle (🔴) = red light on
  - Yellow circle (🟡) = amber/yellow light on
  - Green circle (🟢) = green light on
  - Position in string corresponds to light position (typically: amber, green, red or variations)
- `values`: Boolean array matching the light positions (true = on, false = off)

**Common Signal State Examples**:

- `"⚪⚪🔴"` with `[false, false, true]` - Red light only
- `"🟢⚪⚪"` with `[true, false, false]` - Green light only
- `"⚪🟡⚪"` with `[false, true, false]` - Amber light only
- `"⚪🟡🔴"` with `[false, true, true]` - Red and amber together (prepare to go)
- `"⚪⚪⚪"` with `[false, false, false]` - All lights off

### Configuration Messages

Static intersection configuration sent on the `5g/ilsa/{intersectionId}/config/retained` topic as **TLConfiguration**:

**Example Topic**: `5g/ilsa/K440/config/retained`

**Message Format** (abbreviated - see config.json example in mmt module):
```json
{
  "eClass": "http://jena.de/udp/trafficos/trafficlight/1.1.1#//TLConfiguration",
  "intersectionId": "K440",
  "intersectionName": "Felsenkeller",
  "geoJson": {
    "eClass": "http://datainmotion.com/emf/geojson/1.0#//FeatureCollection",
    "bbox": [11.5804, 50.9212, 0, 0],
    "features": [...]
  },
  "modules": [
    {
      "id": "6426ee356280c369c0d6177b",
      "address": 1,
      "signals": [
        {
          "id": "K1/1",
          "channel": "a",
          "signalType": "RED_AMBER_GREEN",
          "signalGroup": { "id": "K1" },
          "observedArea": { "type": "FeatureCollection", ... },
          "location": [{ "latitude": 11.581255, "longitude": 50.920902 }]
        }
      ]
    }
  ]
}
```

This configuration is used to initialize the provider structure with all signal services and their metadata.

### Thermal Data Messages

Temperature sensor data from intersection hardware on topic `5g/ilsa/{intersectionId}/thermal`:

**Example Topic**: `5g/ilsa/K440/thermal`

**Message Format**:
```
25.6
```

Published as plain number (temperature in Celsius).

## Data Processing Flow

### Signal State Updates

1. **MQTT Reception**: Subscribe to `5g/ilsa/#` topic pattern
2. **Topic Parsing**: Extract intersectionId from topic using regex pattern `5g/ilsa/(\\w+)/(\\w+)/([A-Za-z0-9-]+)(/([0-9]))*`
3. **JSON Deserialization**: Parse TLSignalState JSON using EMF JSON codec with date format configuration
4. **DTO Creation**: Create TrafficLightDto with:
   - Provider: intersectionId (e.g., "K413")
   - Service: signalId with "/" replaced by "_" (e.g., "K3_1")
   - Resource: "color" = state value (UTF8 string like "⚪⚪🔴")
   - Timestamp: from TLSignalState
5. **SensiNact Push**: Push update via DataUpdate service
6. **History Storage**: Automatically stored in TimescaleDB history provider

### Configuration Processing

1. **MQTT Reception**: Receive on `5g/ilsa/{intersectionId}/config/retained`
2. **JSON Deserialization**: Parse TLConfiguration using EMF JSON codec with root object hint
3. **QVTo Transformation**: Transform TLConfiguration → Ilsa provider using ModelTransformator (ID: "TLSTrafficLightToIlsa")
4. **Provider Setup**:
   - Set provider ID from intersectionId
   - Set admin.friendlyName = "ILSA " + intersectionName
   - Set admin.location from geoJson (converted to Point from bbox)
   - Create Signal services for each TLSignal (from subcircles → serialPorts → modules → signals)
   - Add service metadata: type (signalType.name), signalGroup (signalGroup.id)
5. **SensiNact Push**: Push complete Ilsa provider structure

### Thermal Data Processing

1. **MQTT Reception**: Receive on `5g/ilsa/{intersectionId}/thermal`
2. **Topic Parsing**: Extract intersectionId from topic path segment
3. **Value Parsing**: Parse temperature as Double from plain text payload
4. **DTO Creation**: Create GenericDto with:
   - Model: "Ilsa"
   - Provider: intersectionId
   - Service: "thermal"
   - Resource: "temperature"
   - Value: temperature reading (Double)
5. **SensiNact Push**: Push thermal update via DataUpdate service

## QVTo Transformation

The ILSA adapter uses QVTo (Query/View/Transformation Operational) for transforming TLConfiguration to Ilsa providers.

**Transformation File**: `/backend/de.jena.ilsa.sensinact.mmt/transformations/ilsa.qvto`
**Transformation ID**: `TLSTrafficLightToIlsa`

### Transformation Mappings

#### TLConfiguration to Ilsa Provider
```qvto
mapping ILSA::TLConfiguration::toProvider(): SENSINACT::Ilsa {
    id := self.intersectionId;
    admin := self.map toAdmin();
    services := self.subcircles.serialPorts.modules.signals->map toSignalMapEntry();
}
```

Creates the main Ilsa provider instance with:
- Provider ID from intersectionId
- Admin service via toAdmin mapping
- Signal services from nested subcircles → serialPorts → modules → signals hierarchy

#### TLConfiguration to Admin Service
```qvto
mapping ILSA::TLConfiguration::toAdmin(): PROVIDER::Admin {
    friendlyName := "ILSA " + self.intersectionName;
    location := self.geoJson.convertToFeatureCollection();
}
```

Creates Admin service with:
- Friendly name combining "ILSA" prefix with intersection name (e.g., "ILSA Felsenkeller")
- Location from GeoJSON configuration (converted to FeatureCollection using black-box helper)

#### TLSignal to Signal Service
```qvto
mapping ILSA::TLSignal::toSignalMapEntry(): PROVIDER::ServiceMap {
    key := self.id.replaceAll("/","_");
    value := self.map toSignal();
}

mapping ILSA::TLSignal::toSignal(): SENSINACT::Signal {
    observedArea := self.observedArea.convertToFeatureCollection();
}
```

Creates Signal service entries:
- Service name: Signal ID with "/" replaced by "_" (e.g., "K1/1" → "K1_1")
- ObservedArea: GeoJSON polygon from TLSignal configuration (converted using black-box helper)

**Important Notes**:
- The transformation only creates the provider structure from configuration
- The `color` resource values are populated dynamically via signal state MQTT messages
- Additional metadata (signalType, signalGroup) is added programmatically in TrafficLight.java:256-263
- GeoJSON conversion uses black-box helper: `GeoJsonBlackBox.convertToFeatureCollection()`

## API Integration

### REST Endpoints

Access ILSA traffic light data through SensiNact REST API:

```bash
# List all providers (includes ILSA intersections)
GET /udp/rest/sensinact/providers

# Get specific intersection provider
GET /udp/rest/sensinact/providers/K440

# Get all services for an intersection
GET /udp/rest/sensinact/providers/K440/services

# Get specific signal service (note: / becomes _)
GET /udp/rest/sensinact/providers/K440/K1_1

# Get signal color resource (returns current state)
GET /udp/rest/sensinact/providers/K440/K1_1/color

# Response example:
{
  "provider": "K440",
  "service": "K1_1",
  "resource": "color",
  "value": "⚪⚪🔴",
  "timestamp": 1704462615288,
  "type": "java.lang.String"
}

# Get thermal temperature
GET /udp/rest/sensinact/providers/K440/thermal/temperature
```

### SensorThings API

Access via OGC SensorThings API for standardized IoT access:

```bash
# Get ILSA providers as Things
GET /udp/rest/v1.1/Things?$filter=name eq 'K440'

# Get all datastreams for an intersection
GET /udp/rest/v1.1/Things('K440')/Datastreams

# Get signal color observations (history)
GET /udp/rest/v1.1/Datastreams(K440~K1_1~color)/Observations?$orderby=resultTime desc&$top=10

# Get latest signal state
GET /udp/rest/v1.1/Datastreams(K440~K1_1~color)/Observations?$orderby=resultTime desc&$top=1

# Response example:
{
  "@iot.id": "K440~K1_1~color",
  "result": "⚪⚪🔴",
  "resultTime": "2026-01-06T14:48:15.288Z",
  "phenomenonTime": "2026-01-06T14:48:15.288Z"
}
```

## Traffic Analysis Capabilities

### Real-time Monitoring
- **Phase Detection**: Automatic recognition of red, amber, green phases
- **Cycle Analysis**: Traffic light timing pattern analysis
- **Transition Tracking**: Phase change detection and timing

### Historical Analysis
- **Traffic Patterns**: Signal timing trends over time
- **Peak Hour Analysis**: Rush hour traffic light behavior
- **Maintenance Windows**: Periods of signal irregularities

## Integration with Smart City Systems

### Traffic Management
- **Flow Optimization**: Real-time traffic signal data for adaptive control
- **Emergency Response**: Priority lane monitoring and coordination
- **Public Transport**: Bus priority signal detection
- **Navigation Systems**: Real-time traffic light information for route optimization

### Urban Analytics
- **Traffic Flow Analysis**: Intersection performance metrics
- **Environmental Impact**: Idle time and emissions correlation
- **Safety Monitoring**: Signal timing safety analysis
- **Infrastructure Planning**: Traffic pattern data for urban planning

## Security and Safety

### Data Integrity
- **Signal Validation**: Multiple redundancy checks for signal state accuracy
- **Communication Security**: Encrypted MQTT communication where possible
- **Audit Trail**: Complete logging of all signal state changes

### Safety Compliance
- **Read-Only Operation**: No control capabilities, monitoring only
- **Non-Interference**: Passive signal reading without affecting traffic systems
- **Fail-Safe Design**: Graceful degradation during communication loss
- **Standards Compliance**: Adherence to German traffic monitoring regulations

## Troubleshooting

### Debug Configuration

Enable detailed logging for ILSA components in your logging configuration:

```properties
de.jena.ilsa.sensinact=DEBUG
de.jena.ilsa.sensinact.mmt=DEBUG
org.gecko.osgi.messaging=INFO
```

### Common Issues

**Issue**: Signal updates not appearing in SensiNact
- **Check**: MQTT subscription is active for `5g/ilsa/#`
- **Verify**: Topic pattern matches: `5g/ilsa/{intersectionId}/{subcircle}/{signalId}/...`
- **Check**: EMF deserialization logs for correct eClass URI: `http://jena.de/udp/trafficos/trafficlight/1.1.1#//TLSignalState`
- **Verify**: Signal ID "/" to "_" conversion (e.g., "K3/1" → "K3_1")
- **Check**: Provider exists (configuration must be processed first)

**Issue**: Configuration not loading
- **Check**: Config topic ends with `/config/retained` (exactly)
- **Verify**: TLConfiguration JSON has valid EMF format with correct eClass
- **Check**: ModelTransformator service is available with ID `TLSTrafficLightToIlsa`
- **Review**: Transformation logs in `de.jena.ilsa.sensinact.mmt` for mapping errors
- **Verify**: GeoJSON black-box helper is working correctly

**Issue**: Thermal data not updating
- **Check**: Thermal topic format: `5g/ilsa/{intersectionId}/thermal` (exact match)
- **Verify**: Payload is valid number (temperature in Celsius)
- **Ensure**: Provider already exists (config must be processed before thermal data)
- **Check**: GenericDto creation logs

**Issue**: Emoji characters not displaying correctly
- **Check**: Database and API charset encoding supports UTF-8
- **Verify**: Client application renders UTF8 characters
- **Note**: The `state` field contains UTF8 strings like "⚪⚪🔴", not plain text

**Issue**: Regex pattern not matching topics
- **Pattern**: `5g/ilsa/(\\w+)/(\\w+)/([A-Za-z0-9-]+)(/([0-9]))*`
- **Verify**: IntersectionId contains only word characters
- **Check**: Signal ID format matches pattern

### Implementation Reference

**Source Files**:
- `backend/de.jena.ilsa.sensinact/src/de/jena/ilsa/sensinact/TrafficLight.java:77` - Main component
- `backend/de.jena.ilsa.sensinact/src/de/jena/ilsa/sensinact/TrafficLightDto.java:33` - DTO structure
- `backend/de.jena.ilsa.sensinact.model/model/ilsa.ecore:1` - EMF model definition
- `backend/de.jena.ilsa.sensinact.mmt/transformations/ilsa.qvto:1` - QVTo transformation
- `backend/de.jena.ilsa.sensinact.mmt/config.json:1` - Example TLConfiguration

**Key Constants** (TrafficLight.java):
- Topic base: `"5g/ilsa/"` (line 81)
- Topic pattern: `Pattern.compile("5g/ilsa/(\\w+)/(\\w+)/([A-Za-z0-9-]+)(/([0-9]))*")` (line 82)
- Date format: `"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz"` (line 85)

## Related Documentation

- [SensiNact Configuration](../sensinact-configuration.md) - General SensiNact setup and history provider
- [ChirpStack Connector](../chirpstack/chirpstack-connector.md) - Similar EMF-based adapter pattern
- [TTN Adapter](../ttn-adapter/TTNSensinactAdapter.md) - LoRaWAN integration example

## External References

- [Eclipse SensiNact Documentation](https://eclipse-sensinact.readthedocs.io/) - Core framework documentation
- [OGC SensorThings API](https://www.ogc.org/standards/sensorthings) - SensorThings API specification
- [EMF (Eclipse Modeling Framework)](https://www.eclipse.org/modeling/emf/) - EMF documentation
- [QVTo Transformation](https://wiki.eclipse.org/QVTo) - QVT Operational language reference