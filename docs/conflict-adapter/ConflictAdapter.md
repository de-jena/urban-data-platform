# Traffic Conflict SensiNact Adapter

## Overview

The Traffic Conflict adapter detects potential bike-car conflicts at intersections by correlating traffic light states with bike movement data. It listens to events from both the ILSA (traffic light) and TrafICam (traffic camera) adapters to identify hazardous situations where bikes are moving through an intersection while car traffic has a green light.

This adapter demonstrates event-driven integration between multiple SensiNact providers to derive higher-level insights.

## System Architecture

```
ILSA Adapter ─────┐
(Traffic Light)   │
                  ├──→ Conflict Adapter ──→ SensiNact Provider
TrafICam Adapter ─┘      (Event Fusion)      (TrafficConflictProvider)
(Bike Detection)
```

## EMF Ecore Data Model

The Conflict adapter is built on EMF Ecore models defined in:
`backend/de.jena.conflict.sensinact.model/model/conflict.ecore`

**EMF Namespace**: `http://model.data.jena.de/sensinact/trafficConflict/1.0`

### TrafficConflictProvider

The `TrafficConflictProvider` represents a conflict detection point:

```xml
<eClassifiers xsi:type="ecore:EClass" name="TrafficConflictProvider"
    eSuperTypes="sensinact.ecore#//Provider"/>
```

### Conflict Service

The `Conflict` service contains the conflict detection results:

```xml
<eClassifiers xsi:type="ecore:EAttribute" name="conflict"
    eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBooleanObject"/>
<eClassifiers xsi:type="ecore:EAttribute" name="bikeId"
    eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//ELongObject"/>
```

## Data Sources

The adapter uses **event-driven correlation** from two sources:

### ILSA Traffic Light Events

- **Provider**: K440 (Felsenkeller intersection)
- **Service**: K4_1 (signal group for car traffic)
- **Resource**: color (traffic light state: 🟢⚪⚪ for green, ⚪🟡🔴 for yellow/red, etc.)

### TrafICam Bike Detection Events

- **Provider**: Felsenkeller camera
- **Service**: class3 (motorcycle/bike classifications)
- **Data**: Object tracking with heading and speed

## Conflict Detection Logic

A conflict is detected when:

1. **Traffic light is green for cars** (color = "🟢⚪⚪" or "⚪🟡🔴")
2. **Bike is moving southward** through the intersection:
   - Heading between 90° and 230°
   - Speed greater than 7 km/h

This identifies situations where bikes might cross the path of car traffic that has right-of-way.

## Provider Model

Each conflict detection point is represented as a `TrafficConflictProvider`:

```
TrafficConflictProvider (Provider ID: Conflict01)
├── admin
│   ├── friendlyName: "Traffic Conflict Felsenkeller"
│   └── location: GeoJSON Point
└── conflict
    ├── conflict: false (boolean - true when conflict detected)
    └── bikeId: null (Long - ID of the bike causing conflict)
```

## REST API Access

Access conflict data through SensiNact REST API (local environment):

```bash
# List all conflict providers
curl "http://localhost:8080/udp/rest/sensinact/providers?filter=(MODEL=TrafficConflictProvider)"

# Get specific conflict provider
curl http://localhost:8080/udp/rest/sensinact/providers/Conflict01

# Get all services
curl http://localhost:8080/udp/rest/sensinact/providers/Conflict01/services

# Get current conflict status
curl http://localhost:8080/udp/rest/sensinact/providers/Conflict01/services/conflict/resources/conflict/GET

# Response example:
{
  "type": "GET_RESPONSE",
  "uri": "/Conflict01/conflict/conflict",
  "statusCode": 200,
  "response": {
    "name": "conflict",
    "timestamp": 1767780900000,
    "type": "boolean",
    "value": false
  }
}

# Get bike ID involved in conflict
curl http://localhost:8080/udp/rest/sensinact/providers/Conflict01/services/conflict/resources/bikeId/GET
```

### SensorThings API Access

Access via OGC SensorThings API (local environment):

```bash
# Get conflict provider as Thing
curl "http://localhost:8080/udp/rest/v1.1/Things?\$filter=contains(name,'Conflict')"

# Get conflict datastream
curl "http://localhost:8080/udp/rest/v1.1/Datastreams(Conflict01~conflict~conflict)"

# Get conflict history
curl "http://localhost:8080/udp/rest/v1.1/Datastreams(Conflict01~conflict~conflict)/Observations?\$orderby=resultTime desc&\$top=10"
```

## Use Cases

### Real-Time Safety Monitoring

Monitor bike-car conflict situations at intersections:

```bash
curl http://localhost:8080/udp/rest/sensinact/providers/Conflict01/services/conflict/resources/conflict/GET
```

### Historical Conflict Analysis

Analyze conflict patterns over time to identify dangerous intersections or time periods:

```bash
curl "http://localhost:8080/udp/rest/v1.1/Datastreams(Conflict01~conflict~conflict)/Observations?\$orderby=resultTime desc&\$top=100"
```

### Traffic Safety Research

- Identify high-risk intersection configurations
- Correlate conflicts with traffic light timing
- Analyze bike movement patterns at intersections
- Support evidence-based infrastructure improvements

## Configuration

### OSGi Component Configuration

The Conflict adapter is configured in:
`backend/de.jena.udp.sensinact.runtime/de.jena.udp.sensinact.runtime.base.bndrun`

```
bnd.identity;id='de.jena.conflict.sensinact'
```

### Event Subscriptions

The adapter subscribes to SensiNact events via TypedEventHandler:

- ILSA color change events from K440/K4_1
- TrafICam class3 object detection events from Felsenkeller

## Troubleshooting

### No Conflict Data Appearing

1. **Check dependent adapters**:
   ```bash
   # Verify ILSA provider exists
   curl "http://localhost:8080/udp/rest/sensinact/providers?filter=(MODEL=Ilsa)"

   # Verify TrafICam provider exists
   curl "http://localhost:8080/udp/rest/sensinact/providers?filter=(MODEL=TraficamProvider)"
   ```

2. **Check provider exists**:
   ```bash
   curl "http://localhost:8080/udp/rest/sensinact/providers?filter=(MODEL=TrafficConflictProvider)"
   ```

3. **Check logs**:
   ```bash
   docker logs udp-broker | grep -i conflict
   ```

### Conflict Always False

- Ensure bikes are being detected by TrafICam (class3 objects)
- Verify traffic light states are updating (K440/K4_1/color)
- Check that bike heading and speed meet detection thresholds

## Atlas runtime

In `de.jena.udp.atlas.runtime` (issue #28) the detector is `de.jena.udp.atlas.conflict`
(`TrafficConflictDetector`, the model bundle `de.jena.conflict.sensinact.model` is reused). It is a
`TypedEventHandler` whose topics come from the configuration in
`de.jena.udp.atlas.runtime.config/configs/rules.json`:

```json
"TrafficConflictDetector": {
  "event.topics": ["DATA/Ilsa/K440/K4_1/color", "DATA/TraficamProvider/Felsenkeller/3/objects"]
}
```

`provider` (`Conflict01`), `friendlyName`, `longitude`/`latitude`, `minBikeSpeed` (7), `minHeading`
(90) and `maxHeading` (230) have the values above as defaults; the viewport is the pair of bike
crossings at Felsenkeller. The provider is pushed at activation with `conflict=false` and again
whenever the state flips; `bikeId` is the last bike that crossed. `conflict` is an `EBooleanObject`
since the atlas runtime: an EMF push only carries set attributes, and a primitive `false` is the
default, so the initial state never reached the twin.

The detector reads `heading` and `speed` from the properties of the camera's `objects` features.
The legacy TrafiCam adapter published bare points without properties, so the legacy detector
could never see a bike; the atlas TrafiCam adapter adds `id`, `speed` and `heading`
(`docs/traficam-adapter/TrafiCamAdapter.md`).

## Dependencies

- **Eclipse SensiNact Gateway** (Core framework)
- **Eclipse EMF** (Modeling framework)
- **ILSA Adapter** (Traffic light data source)
- **TrafICam Adapter** (Bike detection data source)
- **TimescaleDB** (History storage)

## Related Documentation

- [ILSA Adapter](../ilsa-adapter/ILSASensinactAdapter.md) - Traffic light integration
- [TrafICam Adapter](../traficam-adapter/TrafiCamAdapter.md) - Traffic camera AI integration
- [SensiNact Configuration](../sensinact-configuration.md) - General SensiNact setup
