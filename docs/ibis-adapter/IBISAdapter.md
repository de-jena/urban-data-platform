# IBIS SensiNact Adapter

## Overview

The IBIS (Integrierten Bordinformationssystem) adapter integrates public transport vehicle systems into the Eclipse SensiNact Gateway. IBIS is a German standard for onboard computer systems in buses, trams, and other public transport vehicles, providing real-time passenger information, GPS tracking, ticket validation, and operational data.

This adapter connects to IBIS systems via MQTT and transforms the data into SensiNact providers using EMF-based QVTo model transformations.

## System Architecture

```
IBIS Vehicle System → MQTT Broker → IBIS Adapter → SensiNact Provider
                      (5g/ibis/#)    (EMF JSON)      (IbisDevice)
```

## EMF Ecore Data Model

The IBIS adapter is built on EMF Ecore models defined in:

```	
de.jena.ibis.common.model
de.jena.ibis.customer.info.service.model
de.jena.ibis.device.management.service.model
de.jena.ibis.door.state.service.model
de.jena.ibis.enumerations.model
de.jena.ibis.gnss.location.service.model
de.jena.ibis.passenger.counting.service.model
de.jena.ibis.ticket.validation.service.model
```

This input models will transformed to the models based on the SensiNact provider models defined in `backend/de.jena.ibis.sensinact.model/model/ibis.ecore`

**EMF Namespace**: `https://jena.de/models/ibis/sensinact/1.0`

### IbisDevice Provider

The `IbisDevice` represents a public transport vehicle (bus, tram, etc.) with the following services:

## Service Categories

### CustomerInformationService (8 services)

Provides passenger-facing information displayed on vehicle systems:

- **CustomerInfoAll**: Combined vehicle state (trip status, doors, panic button, stop button, vehicle mode)
- **CustomerInfoCurrentStopIndex**: Current stop index on the route
- **CustomerInfoCurrentStopPoint**: Detailed stop data (name, platform, scheduled/expected times, distance)
- **CustomerInfoTrip**: Trip details (route, destination, delay, run number, additional text messages)
- **CustomerInfoVehicle**: Vehicle state (route deviation, door state, panic, stop requested, exit side)
- **CustomerInfoCurrentAnnouncement**: Active announcements (text and TTS)
- **CustomerInfoCurrentConnection**: Connection information
- **CustomerInfoCurrentDisplayContent**: Content shown on destination displays (line name, destination)

### GNSSLocationService

High-precision GPS positioning data with:
- Latitude/longitude degrees and direction
- Altitude and speed over ground
- Signal quality and satellite count
- Horizontal/vertical dilution of precision
- Track degrees (true and magnetic)
- GNSS type and coordinate system

### TicketValidationService (4 services)

Fare enforcement and ticket validation:

- **TicketValidationCurrentTariffStop**: Current tariff zone and stop information
- **TicketValidationRazzia**: Fare inspection mode state
- **TicketValidationCurrentLine**: Line identification (ref, name, short name, number)
- **TicketValidationVehicle**: Vehicle identification and state for ticketing


## MQTT Integration

### Topic Pattern

The adapter subscribes to all IBIS messages:

```
5g/ibis/#
```

This wildcard pattern captures messages from all IBIS devices and service types.

### Message Format

Messages are serialized as **EMF JSON**. Here's a real example for **CustomerInfoCurrentStopPoint**:

```json
{
  "eClass": "https://jena.de/models/ibis/customerinfoservice/1.0#//CurrentStopPointResponse",
  "CurrentStopPointData": {
    "TimeStamp": {
      "Value": "2026-01-07T10:07:08.000ZCET"
    },
    "CurrentStopPoint": {
      "StopIndex": {
        "Value": 8
      },
      "StopRef": {
        "Value": "4003"
      },
      "StopName": [{
        "Value": "Westbahnhofstraße",
        "Language": "de"
      }],
      "DisplayContent": [{
        "LineInformation": {
          "LineRef": {
            "Value": "noRef"
          },
          "LineName": [{
            "Value": "11",
            "Language": "de"
          }],
          "LineShortName": [{
            "Value": "11",
            "Language": "de"
          }],
          "LineNumber": {
            "Value": 11
          }
        },
        "Destination": {
          "DestinationRef": {
            "Value": "noRef"
          },
          "DestinationName": [{
            "Value": "Stadtzentrum",
            "Language": "de"
          }]
        }
      }],
      "ArrivalScheduled": {
        "Value": "2026-01-07T10:08:00.000ZCET"
      },
      "DepartureScheduled": {
        "Value": "2026-01-07T10:08:00.000ZCET"
      },
      "DistanceToNextStop": {
        "Value": 658
      },
      "FareZone": [{
        "Value": "30"
      }]
    }
  }
}
```

**Key message characteristics:**
- Date/time format: `yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz` (e.g., `2026-01-07T10:08:00.000ZCET`)
- Values are wrapped in objects with `Value` property
- Multi-language fields include `Language` property
- Arrays are used for multi-value fields (stopName, fareZone, etc.)

## Data Transformation

The adapter uses **QVTo (Query/View/Transformation Operational)** to transform IBIS service responses into SensiNact provider structures. The transformations are defined in:

```
backend/de.jena.ibis.sensinact.mmt/transformations/
├── ibisToSensinact.qvto                    # Main entry point
├── ibisCustomerInfoToSensinact.qvto        # Customer info transformations
├── ibisGNSSLocationToSensinact.qvto        # GPS transformations
├── ibisTicketValidationToSensinact.qvto    # Ticket validation transformations
└── ibisToSensinactLibrary.qvto             # Common utilities
```

The transformation process:
1. Deserialize EMF JSON message
2. Apply QVTo transformation based on message type (eClass)
3. Create/update SensiNact provider and services
4. Push the data to SensiNact

## SensiNact Integration

### Provider Model

Each IBIS vehicle is represented as an `IbisDevice` provider:

```
IbisDevice (Provider ID: vehicle-123)
├── ibisAdmin
├── customerInfoAll
├── customerInfoCurrentStopIndex
├── customerInfoCurrentStopPoint
├── customerInfoTrip
├── customerInfoVehicle
├── customerInfoCurrentAnnouncement
├── customerInfoCurrentConnection
├── customerInfoCurrentDisplayContent
├── gnssLocation
├── door1CountingState
├── door2CountingState
├── door3CountingState
├── door4CountingState
├── door1State
├── door2State
├── door3State
├── door4State
├── stopRequested
├── currentTariffStop
├── razzia
├── currentLine
├── vehicle
└── tripInfo
```

### REST API Access

Query via SensiNact REST API (local environment):

```bash
# Get all IBIS providers
curl "http://localhost:8080/udp/rest/sensinact/providers?filter=(MODEL=IbisDevice)"

# Get specific vehicle
curl http://localhost:8080/udp/rest/sensinact/providers/vehicle-123

# Get current GPS location
curl http://localhost:8080/udp/rest/sensinact/providers/vehicle-123/services/gnssLocation/resources/resource/GET

# Get current stop information
curl http://localhost:8080/udp/rest/sensinact/providers/vehicle-123/services/customerInfoCurrentStopPoint/resources/resource/GET

# Get passenger counting for door 1
curl http://localhost:8080/udp/rest/sensinact/providers/vehicle-123/services/door1CountingState/resources/resource/GET

# Get trip delay information
curl http://localhost:8080/udp/rest/sensinact/providers/vehicle-123/services/customerInfoTrip/resources/resource/GET
```

### SensorThings API Access

Query via OGC SensorThings API (local environment):

```bash
# Get all IBIS datastreams
curl http://localhost:8080/udp/rest/v1.1/Datastreams?$filter=Thing/name eq 'vehicle-123'

# Get GPS observations
curl http://localhost:8080/udp/rest/v1.1/Datastreams?$filter=name eq 'gnssLocation/resource'&$expand=Observations

# Get passenger count observations
curl http://localhost:8080/udp/rest/v1.1/Datastreams?$filter=name eq 'door1CountingState/resource'&$expand=Observations
```

## Use Cases

### 1. Real-Time Passenger Information

Track vehicle position and estimated arrival times:

```bash
curl http://localhost:8080/udp/rest/sensinact/providers/bus-42/services/customerInfoCurrentStopPoint/resources/resource/GET
```

**Response includes:**
- Current stop name and index
- Scheduled vs. actual arrival/departure times
- Distance to next stop
- Fare zone information
- Line and destination display content

### 2. Fleet Management

Monitor vehicle operational status:

```bash
curl http://localhost:8080/udp/rest/sensinact/providers/bus-42/services/customerInfoVehicle/resources/resource/GET
```

**Provides:**
- Door state (open/closed)
- Panic button status
- Route deviation indicator
- Vehicle mode (in service, garage, etc.)
- Stop requested status
- Exit side (left/right)

### 3. Passenger Flow Analytics

Analyze boarding/alighting patterns:

```bash
curl http://localhost:8080/udp/rest/sensinact/providers/bus-42/services/door1CountingState/resources/resource/GET
curl http://localhost:8080/udp/rest/sensinact/providers/bus-42/services/door2CountingState/resources/resource/GET
```

**Returns:**
- In/out passenger counts per door
- Door ID and exit side
- Counting type

### 4. Service Reliability Monitoring

Track schedule adherence:

```bash
curl http://localhost:8080/udp/rest/sensinact/providers/bus-42/services/customerInfoTrip/resources/resource/GET
```

**Provides:**
- Timetable delay (seconds, negative for early arrival)
- Current stop index
- Trip reference and run number
- Route direction
- Additional text messages

### 5. Geographic Tracking

Real-time vehicle positioning:

```bash
curl http://localhost:8080/udp/rest/sensinact/providers/bus-42/services/gnssLocation/resources/resource/GET
```

**High-precision GPS data:**
- Latitude/longitude (degrees)
- Altitude
- Speed over ground
- Signal quality metrics
- Number of satellites
- Track degree (true/magnetic)

## Configuration

### OSGi Component Configuration

The IBIS adapter is configured in:
`backend/de.jena.udp.sensinact.runtime/de.jena.udp.sensinact.runtime.base.bndrun`

```
bnd.identity;id='de.jena.ibis.sensinact'
```

### MQTT Bridge Configuration

MQTT topic forwarding is configured in:
`backend/de.jena.sensinact.5g.runtime.config.docker/configs/mqttforward.json`

```json
{
  "MQTTBridge~all": {
    "forwardClients": 6,
    "topics": [
      "5g/ibis/#"
    ]
  }
}
```

## Troubleshooting

### No IBIS Data Appearing

1. **Check MQTT broker connection**:
   ```bash
   mosquitto_sub -h localhost -t "5g/ibis/#" -v
   ```

2. **Verify provider exists**:
   ```bash
   curl "http://localhost:8080/udp/rest/sensinact/providers?filter=(MODEL=IbisDevice)"
   ```

3. **Check logs**:
   ```bash
   docker logs udp-broker | grep -i ibis
   ```

### Invalid Date Format

Ensure timestamps match the format: `yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz`

Example valid timestamp: `2026-01-07T10:08:00.000ZCET`

### Missing Services

Not all IBIS services may be implemented by every vehicle. Check the vehicle's IBIS system capabilities. Services are only created when the corresponding MQTT messages are received.

## Dependencies

- **Eclipse SensiNact Gateway** (Core framework)
- **Eclipse EMF** (Modeling framework)
- **QVTo** (Model transformation engine)
- **Eclipse Paho MQTT** (MQTT client)
- **TimescaleDB** (History storage)
- **MongoDB** (Provider metadata)

## Related Documentation

- [ILSA Adapter](../ilsa-adapter/ILSASensinactAdapter.md) - Traffic light integration
- [TrafICam Adapter](../traficam-adapter/TrafiCamAdapter.md) - Traffic camera AI integration
- [Eclipse SensiNact Documentation](https://eclipse.org/sensinact/)
- [IBIS Standard (VDV 301)](https://www.vdv.de/) - German public transport data standard
