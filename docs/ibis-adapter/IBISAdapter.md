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

Timestamps are parsed with the pattern `yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz`, for
example `2026-01-07T10:08:00.000ZCET`. In that pattern the `Z` is a literal
separator, not a UTC marker.

The trailing zone is **discarded on parsing**: `…000ZCET`, `…000Z` and
`…000+05:00` all yield the same instant, because the wall-clock is resolved in
the default timezone of the JVM running the connector. A message therefore has
to carry wall-clock time in the runtime's zone — writing the time in UTC for a
runtime that runs in `Europe/Berlin` shifts every reading by one or two hours.

### One MQTT client per topic filter

`AbstractMqttService` keeps one `MqttPushEventSource` per topic filter, and each
opens its own client:

```java
mqtt = clientFactory.createClient(config, "gecko" + UUID.randomUUID() + "-" + topic);
mqtt.subscribe(this.topic, this.qos, this);
```

So `5g/ibis/#`, `5g/ilsa/#` and `5g/traficam/#` are three separate connections.
Live ILSA or TrafiCam data says nothing about the state of the IBIS client.

The cache is also never pruned, so restarting `de.jena.ibis.sensinact` hands the
connector back the *same* source without issuing a new SUBSCRIBE — no retained
message is replayed and a dead source stays dead. To force a genuine
resubscribe, restart the MQTT provider (`org.gecko.adapter.mqtt.v5`, or the
`MQTTService` component) or the whole runtime. With a retained message on the
broker that is enough on its own to bring the provider back, with no republish.

### An empty IbisDevice list is normal

Only one vehicle, `bus359`, currently feeds the IBIS path. The twin is held in
memory and a provider exists only once its vehicle has reported, so

```bash
curl "$BROKER/udp/rest/sensinact/providers?filter=(MODEL=IbisDevice)"
```

returning an empty list means the bus is not transmitting — it says nothing
about the health of the connector. Do not read it as a broken adapter, and use
one of the other `id=read` connectors below to judge the MQTT link instead.

### Published, but no provider appears

A QoS 0 publish is fire-and-forget: a broker whose ACL does not grant write
access on `5g/ibis/#` discards the message without telling the publisher, and
`mosquitto_pub` exits 0. `publish-gnss.sh` therefore publishes at QoS 1 and
fails loudly when the broker refuses:

```
Warning: Publish 1 failed: Not authorized.
publish REJECTED by mqttbr.jena.de:8883 for 5g/ibis/bus/bus359
```

If the publish is accepted and the provider still does not appear, the message
reached the broker but not the connector. Check in this order:

1. Is the runtime reading from the broker that was published to? `MQTT_READ_HOST`
   of the deployment, against `--host` of the script.
2. Is another connector on the same `id=read` service still receiving? ILSA
   (`5g/ilsa/#`) and TrafiCam (`5g/traficam/#`) share it, so a fresh timestamp
   on one of their resources proves the MQTT link itself is alive:
   ```bash
   curl -s "$BROKER/udp/rest/sensinact/providers/K413/services/admin/resources/location/GET"
   ```
3. Is `de.jena.ibis.sensinact` active? It logs `Ibis connector is active!` when
   it starts and `Error subscribing mqtt 5g/ibis/` when the subscription fails.
   The Felix console at `/udp/system/console/components` shows the component
   state and, under `IbisConnector`, which `MQTTService` it bound — ILSA and
   TrafiCam bind the same instance, so if they receive data the client is
   connected and only the IBIS topic is in question.
4. Do publish and subscribe rights differ for the topic? They are separate
   grants: an account may publish to `5g/ibis/#` and still have its SUBSCRIBE
   refused, in which case the broker answers SUBACK `0x80` / reason code 135 and
   the connector waits forever without logging anything. MQTT 5 with `-d` shows
   the reason code, and a distinct client id avoids kicking the runtime off:
   ```bash
   mosquitto_sub -h mqttbr.jena.de -p 8883 --capath /etc/ssl/certs \
       -u <user> -P <pwd> -i diag-1 -V 5 -d -t '5g/ibis/#' -v -W 15
   ```
5. A message whose root `eClass` matches no `rootObjects()` case in
   `ibisToSensinact.qvto` is dropped **without any log entry**, so a payload
   error can look exactly like no message at all.

### Connection Refused: identifier rejected

The broker accepted the TCP/TLS connection and the credentials but turned down
the client id (CONNACK code 2). `mosquitto_pub` introduces itself as
`mosquitto_pub_<pid>`, which brokers that tie the client id to the account
reject; the runtime's own clients connect as `gecko-<uuid>` over MQTT 5.

`publish-gnss.sh` sends `<user>-gnss-<random>` by default. If that is still
refused, name one explicitly and, failing that, switch protocol version:

```bash
./docs/ibis-adapter/publish-gnss.sh ... --client-id iwoms-gnss-1
./docs/ibis-adapter/publish-gnss.sh ... --mqtt-version 5
```

### Missing Services

Not all IBIS services may be implemented by every vehicle. Check the vehicle's IBIS system capabilities. Services are only created when the corresponding MQTT messages are received.

## Reactivating a Provider

The sensiNact twin is held in memory, so a provider disappears from the REST and
SensorThings endpoints whenever the runtime restarts and the vehicle has not
reported since. Publishing one GNSS message for that vehicle is enough to bring
it back: the connector recreates the `IbisDevice` provider, its `gnssLocation`
service and `admin/location` in one go.

`publish-gnss.sh` (next to this document) builds the EMF JSON and publishes it:

```bash
# see what would be sent
./docs/ibis-adapter/publish-gnss.sh --provider bus359 \
    --lat 50.9003733 --lon 11.58823 --dry-run

# send it to a broker
./docs/ibis-adapter/publish-gnss.sh --provider bus359 \
    --lat 50.9003733 --lon 11.58823 \
    --host localhost --port 1883
```

Add `--retain` to leave the message on the broker: the runtime then receives it
again on every restart and recreates the provider without anyone republishing.
Clear it later with an empty retained message on the same topic
(`mosquitto_pub -r -n -t 5g/ibis/bus/bus359`).

The provider id is taken from the **second** topic segment after the prefix, so
the script publishes to `5g/ibis/<device-type>/<provider>`; `--device-type` only
fills the segment in between and is not otherwise interpreted.

Pass `--runtime-tz` when the runtime's JVM runs in a different timezone than the
machine sending the message (`--runtime-tz UTC` for the Docker deployment) —
see [Invalid Date Format](#invalid-date-format) for why this matters.

Verify afterwards:

```bash
curl http://localhost:8080/udp/rest/sensinact/providers/bus359/services/gnssLocation/resources/resource/GET
curl http://localhost:8080/udp/rest/sensinact/providers/bus359/services/admin/resources/location/GET
```

### Trying it against a local broker

The runtime reads from the broker configured as `MQTTService~read`, which
defaults to `mqttbr.jena.de:8883`. To rehearse without touching that broker,
start a local one, point the runtime at it and publish there:

```bash
printf 'listener 1883\nallow_anonymous true\n' > /tmp/mosquitto.conf
mosquitto -c /tmp/mosquitto.conf -d

mosquitto_sub -h localhost -t '5g/ibis/#' -v      # watch what arrives
```

In `de.jena.udp.sensinact.runtime.config.docker/configs/mqtt.json` the whole
broker URL comes from the environment, so
`MQTT_READ_PROTOCOL=tcp MQTT_READ_HOST=localhost MQTT_READ_PORT=1883` is enough.
The `.config.local` bundle hardcodes `ssl://` and only reads host and port from
the environment, so a plain TCP broker needs that `brokerUrl` edited.

### Known issue: admin/location timestamp

`IbisConnector.updateAdmin` derives the `admin/location` timestamp as
`date.epochSecond + time.epochSecond`. Real IBIS messages carry the epoch in
`date` and the full instant in `time`, so the sum happens to equal the fix time;
a message with a real date lands roughly 56 years in the future. `publish-gnss.sh`
writes the epoch into `date` for that reason.

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
