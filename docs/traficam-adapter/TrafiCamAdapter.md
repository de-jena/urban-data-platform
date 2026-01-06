# TrafICam SensiNact Adapter

## Overview

The TrafICam SensiNact Adapter integrates AI-powered traffic cameras into the Urban Data Platform. TrafICam cameras use computer vision to detect and track vehicles, pedestrians, bicycles, and other traffic participants in real-time, providing rich traffic flow data including object positions, speeds, trajectories, and classifications.

The adapter receives binary-encoded traffic object data via MQTT, processes it through a sophisticated windowing and aggregation pipeline, and exposes the results as SensiNact providers with GeoJSON-formatted object collections.

## Architecture

The TrafICam adapter follows a streaming data processing architecture using Eclipse Modeling Framework (EMF) for data representation:

### Key Components

- **TrafICam Model**: EMF Ecore model defining camera data structures (`de.jena.traficam.model/model/traficam.ecore`)
  - Namespace: `https://jena.de/models/traficam/1.0`
  - Defines: TrafiCam, TrafiCamObject, GpsCoordinates, Coordinates, CamConfig, etc.
- **TrafICam SensiNact Model**: EMF Ecore model for SensiNact providers (`de.jena.traficam.sensinact.model/model/traficam.ecore`)
  - Namespace: `https://model.data.jena.de/sensinact/traficam/1.0`
  - Defines: TraficamProvider, TraficamAdmin, ObservedObjects
- **MQTT Subscription**: Receives real-time object detection data (`de.jena.traficam.sensinact`)
- **WebSocket Client**: Alternative data ingestion via WebSocket (`de.jena.traficam.websocket`)
- **MQTT Publisher**: Bridges WebSocket data to MQTT (`de.jena.traficam.mqtt`)
- **Configuration Service**: Dynamic camera configuration management (`de.jena.traficam.config`)

### Data Flow

```
TrafICam Camera (AI Vision System)
    ↓
WebSocket or Direct MQTT
    ↓
MQTT Topics: 5g/traficam/{camId}/{classId}
    ↓
Binary EMF Deserialization (BinaryResourceImpl)
    ↓
EMF TrafiCamObject instances
    ↓
PushStream Windowing (2-second windows)
    ↓
Deduplication & GeoJSON Aggregation
    ↓
SensiNact Provider Update (EMF-based DTO)
    ↓
REST/SensorThings API
```

## Data Model Structure

### EMF Model Architecture

All data structures are defined as **EMF Ecore models**, providing:
- Type-safe data representation
- Automatic serialization/deserialization
- Binary encoding for efficiency
- Model-driven architecture

### Camera Provider (TraficamProvider)

Each TrafICam camera is represented as a **TraficamProvider** in SensiNact with the following structure:

**EMF Definition**: `de.jena.traficam.sensinact.model/model/traficam.ecore`

```xml
<eClassifiers xsi:type="ecore:EClass" name="TraficamProvider"
    eSuperTypes="sensinact.ecore#//DynamicProvider"/>
```

#### Admin Service (TraficamAdmin)

**EMF Definition**:
```xml
<eClassifiers xsi:type="ecore:EClass" name="TraficamAdmin"
    eSuperTypes="sensinact.ecore#//Admin">
  <eStructuralFeatures xsi:type="ecore:EAttribute" name="viewport"
      eType="sensinact.ecore#//EGeoJsonObject">
    <eAnnotations source="Metadata">
      <details key="sensorthings.observedArea" value="true"/>
    </eAnnotations>
  </eStructuralFeatures>
</eClassifiers>
```

**Resources**:
- `location` (Point): Camera GPS location
- `friendlyName` (String): Human-readable name (e.g., "Camera TC001")
- `viewport` (GeometryCollection): Camera field of view as polygon
  - Defined by scene corners: leftBottom, rightBottom, rightTop, leftTop
  - Contains GeoJSON polygons representing observable area
  - Marked as SensorThings observedArea via EMF annotation

#### Observed Objects Services (ObservedObjects)

**EMF Definition**:
```xml
<eClassifiers xsi:type="ecore:EClass" name="ObservedObjects"
    eSuperTypes="sensinact.ecore#//Service">
  <eStructuralFeatures xsi:type="ecore:EAttribute" name="objects"
      eType="sensinact.ecore#//EGeoJsonObject"/>
  <eStructuralFeatures xsi:type="ecore:EAttribute" name="classificationName"
      eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
</eClassifiers>
```

One service per object classification (e.g., "5" for cars, "0" for persons):

**Service Name**: Object class ID from classMap

**Resources**:
- `classificationName` (String): Human-readable class name (e.g., "Car", "Person", "Bicycle")
- `objects` (GeometryCollection): Collection of detected object positions as GeoJSON Points
  - Updated every 2 seconds with windowed aggregation
  - Contains only unique objects within the time window
  - Empty collection sent once when no objects detected

### TrafiCamObject EMF Model

**EMF Definition**: `de.jena.traficam.model/model/traficam.ecore`

Individual detected objects from the camera (received via MQTT as binary EMF):

```xml
<eClassifiers xsi:type="ecore:EClass" name="TrafiCamObject">
  <eStructuralFeatures xsi:type="ecore:EAttribute" name="classId"
      eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EShort"/>
  <eStructuralFeatures xsi:type="ecore:EAttribute" name="id"
      eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//ELong"/>
  <eStructuralFeatures xsi:type="ecore:EAttribute" name="time"
      eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDate"/>
  <eStructuralFeatures xsi:type="ecore:EAttribute" name="lifetime"
      eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDouble"/>
  <eStructuralFeatures xsi:type="ecore:EAttribute" name="speed"
      eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDouble"/>
  <eStructuralFeatures xsi:type="ecore:EAttribute" name="speedConfidence"
      eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EShort"/>
  <eStructuralFeatures xsi:type="ecore:EReference" name="gpsCoordinates"
      eType="#//GpsCoordinates" containment="true"/>
  <eStructuralFeatures xsi:type="ecore:EReference" name="imageCoordinates"
      eType="#//Coordinates" containment="true"/>
  <eStructuralFeatures xsi:type="ecore:EReference" name="worldCoordinates"
      eType="#//Coordinates" containment="true"/>
</eClassifiers>
```

**Attributes**:
- `id` (Long): Unique object tracking ID
- `classId` (Short): Classification from classMap (0=Person, 5=Car, etc.)
- `time` (Date): Detection timestamp
- `lifetime` (Double): How long object has been tracked (seconds)
- `speed` (Double): Object speed (km/h or m/s)
- `speedConfidence` (Short): Speed measurement confidence (0-100)

**References**:
- `gpsCoordinates` (GpsCoordinates[]): GPS position(s) with latitude, longitude, heading
- `imageCoordinates` (Coordinates[]): Position in camera image (x, y coordinates)
- `worldCoordinates` (Coordinates[]): 3D world coordinates (x, y, z)

### Camera Configuration EMF Model (CamConfig)

**EMF Definition**: `de.jena.traficam.model/model/traficam.ecore`

```xml
<eClassifiers xsi:type="ecore:EClass" name="CamConfig">
  <eStructuralFeatures xsi:type="ecore:EReference" name="calibration"
      eType="#//Calibration" containment="true"/>
  <eStructuralFeatures xsi:type="ecore:EReference" name="location"
      eType="#//GpsCoordinates" containment="true"/>
  <eStructuralFeatures xsi:type="ecore:EReference" name="fieldOfView"
      eType="#//FieldOfView" containment="true"/>
  <eStructuralFeatures xsi:type="ecore:EReference" name="scene"
      eType="#//Scene" containment="true"/>
  <eStructuralFeatures xsi:type="ecore:EReference" name="classMap"
      eType="#//ClassMap" containment="true"/>
</eClassifiers>
```

Static camera setup information:

**Structure**:
- `location` (GpsCoordinates): Camera physical location
- `calibration` (Calibration): Camera calibration parameters
  - `focalDistance`, `height`, `panAngle`, `tiltAngle`, `rollAngle`
- `fieldOfView` (FieldOfView): Viewing angles
  - `hfov` (horizontal field of view), `vfov` (vertical field of view)
- `scene` (Scene): Observable area boundaries
  - `leftBottom`, `rightBottom`, `rightTop`, `leftTop` (GpsCoordinates)
- `classMap` (ClassMap): Map<String, String> for classId → className mapping

**Example classMap**:
```json
{
  "classMap": {
    "0": "Person",
    "1": "Bicycle",
    "2": "Motorcycle",
    "5": "Car",
    "7": "Van",
    "10": "SmallTruck",
    "12": "LargeTruck",
    "14": "Bus",
    "20": "CarAndTrailer",
    "21": "VanAndTrailer",
    "24": "TruckAndTrailer"
  }
}
```

## MQTT Topic Structure

### Object Data Topics

**Pattern**: `5g/traficam/{camId}/{classId}`

**Examples**:
- `5g/traficam/TC001/5` - Cars detected by camera TC001
- `5g/traficam/TC002/12` - Large trucks detected by camera TC002
- `5g/traficam/TC001/1` - Bicycles detected by camera TC001
- `5g/traficam/TC003/0` - Persons detected by camera TC003

**Message Format**: **Binary EMF (not JSON)**
- Uses `BinaryResourceImpl` for efficient serialization
- Contains TrafiCamObject EMF instances
- Published in real-time as objects are detected/tracked
- Much smaller payload size compared to JSON (~10x compression)

### Configuration Topics

**Pattern**: `5g/config/traficam/{camId}` or `5g/traficam/{camId}/config/retained`

**Message Format**: **Binary EMF** containing CamConfig

**Purpose**: Initialize camera provider with calibration, field of view, and class mappings

### Lifesign Topic

**Pattern**: `5g/traficam/{camId}/lifesign`

**Purpose**: Camera heartbeat/health monitoring (currently logged, not processed)

## Data Processing Pipeline

### 1. MQTT Reception

```java
@Activate
subscription = messaging.subscribe("5g/traficam/#", messagingContext);
configSubscription = messaging.subscribe("5g/config/traficam/#", messagingContext);
```

**Configuration**:
- Buffer size: 3200 messages
- Parallelism: 10 threads
- Queue policy: BLOCK (backpressure handling)
- Executor: Cached thread pool

### 2. Binary EMF Deserialization

Each MQTT message containing object data is deserialized using EMF Binary Resource:

```java
BinaryResourceImpl resource = new BinaryResourceImpl();
resource.load(new ByteArrayInputStream(payload), Collections.emptyMap());
EList<EObject> contents = resource.getContents();
TrafiCamObject object = (TrafiCamObject) contents.get(0);
```

**Why Binary EMF?**
- Efficient binary encoding (~10x smaller than JSON)
- Type-safe deserialization
- No manual JSON parsing needed
- Automatic handling of EMF containment relationships

### 3. Stream Windowing & Aggregation

Objects are processed using **2-second time windows**:

```java
PushStream<GeometryCollection> stream = source
  .window(Duration.ofSeconds(2), messages -> {
    // Collect unique objects within window
    List<Geometry> geometries = new ArrayList<>();
    List<String> seenIds = new ArrayList<>();

    for (Message message : messages) {
      TrafiCamObject obj = loadTrafiCamObject(message);
      String id = "" + obj.getId();

      // Deduplication by object ID
      if (!seenIds.contains(id)) {
        GpsCoordinates gps = obj.getGpsCoordinates().get(0);
        Point point = new Point(gps.getLongitude(), gps.getLatitude());
        geometries.add(point);
        seenIds.add(id);
      }
    }

    return new GeometryCollection(geometries, null, null);
  });
```

**Why windowing?**
- Reduces update frequency (every 2 seconds instead of real-time)
- Deduplicates objects that appear in multiple frames
- Aggregates all objects of same class into single GeoJSON collection
- Reduces database writes by ~98%
- Maintains sub-3-second latency for applications

### 4. Empty Collection Handling

To avoid spamming empty updates:
```java
if (!geo.isEmpty() || !sendEmpty.getAndSet(true)) {
  // Send update
}
```
- First empty collection is sent (clears previous objects)
- Subsequent empty collections are suppressed until new objects appear

### 5. SensiNact Update via EMF DTO

```java
TrafiCamDto dto = new TrafiCamDto(camId, classId, className, geoJsonCollection);
dto.timestamp = new Date().getTime();
sensiNact.pushUpdate(dto);
```

The DTO uses EMF annotations to map to the SensiNact provider model:
```java
@ModelPackageUri(TraficamproviderPackage.eNS_URI)
@Model("TrafiCam")
@Provider String camId;
@Service String classification;
@ServiceModel EClass serviceEClass = TraficamproviderPackage.Literals.OBSERVED_OBJECTS;
@Data String classificationName;
@Data GeoJsonObject objects;
@Timestamp long timestamp;
```

## Configuration Processing

When a camera configuration is received:

1. **Deserialize CamConfig** from binary EMF MQTT payload
   ```java
   BinaryResourceImpl resource = new BinaryResourceImpl();
   resource.load(inputStream, Collections.emptyMap());
   CamConfig configuration = (CamConfig) resource.getContents().get(0);
   ```

2. **Create EMF Provider Instance**
   ```java
   TraficamProvider provider = TraficamproviderFactory.eINSTANCE.createTraficamProvider();
   TraficamAdmin admin = TraficamproviderFactory.eINSTANCE.createTraficamAdmin();
   ```

3. **Set Admin Service**:
   - Location from `camConfig.location`
   - FriendlyName: "Camera {camId}"
   - Viewport: GeometryCollection from scene boundaries

4. **Create observedArea Service** with viewport geometry
   ```java
   ObservedObjects area = TraficamproviderFactory.eINSTANCE.createObservedObjects();
   area.setObjects(viewport);
   provider.getServices().put("observedArea", area);
   ```

5. **Cache configuration** for class name lookup
   ```java
   configs.put(camId, configuration);
   ```

6. **Push provider structure** to SensiNact

## API Integration

### REST Endpoints

```bash
# List all TrafICam cameras
GET /udp/rest/sensinact/providers

# Get specific camera
GET /udp/rest/sensinact/providers/TC001

# Get admin info (location, viewport)
GET /udp/rest/sensinact/providers/TC001/admin

# Get camera location
GET /udp/rest/sensinact/providers/TC001/admin/location

# Get camera viewport (field of view)
GET /udp/rest/sensinact/providers/TC001/admin/viewport

# Get observed area service
GET /udp/rest/sensinact/providers/TC001/observedArea

# Get objects for specific classification (e.g., Cars = class "5")
GET /udp/rest/sensinact/providers/TC001/5/objects

# Response example:
{
  "provider": "TC001",
  "service": "5",
  "resource": "objects",
  "value": {
    "type": "GeometryCollection",
    "geometries": [
      {
        "type": "Point",
        "coordinates": [11.5812, 50.9209]
      },
      {
        "type": "Point",
        "coordinates": [11.5815, 50.9211]
      }
    ]
  },
  "timestamp": 1704462615288,
  "type": "org.eclipse.sensinact.gateway.geojson.GeometryCollection"
}

# Get classification name
GET /udp/rest/sensinact/providers/TC001/5/classificationName
# Returns: "Car"

# Get persons (class "0")
GET /udp/rest/sensinact/providers/TC001/0/objects
GET /udp/rest/sensinact/providers/TC001/0/classificationName
# Returns: "Person"

# Get bicycles (class "1")
GET /udp/rest/sensinact/providers/TC001/1/objects
GET /udp/rest/sensinact/providers/TC001/1/classificationName
# Returns: "Bicycle"
```

### SensorThings API

```bash
# Get TrafICam cameras as Things
GET /udp/rest/v1.1/Things?$filter=contains(name,'TC')

# Get datastreams for a camera
GET /udp/rest/v1.1/Things('TC001')/Datastreams

# Get car observations (history) - class "5"
GET /udp/rest/v1.1/Datastreams(TC001~5~objects)/Observations?$orderby=resultTime desc&$top=10

# Get latest car positions
GET /udp/rest/v1.1/Datastreams(TC001~5~objects)/Observations?$orderby=resultTime desc&$top=1

# Get person observations - class "0"
GET /udp/rest/v1.1/Datastreams(TC001~0~objects)/Observations?$orderby=resultTime desc&$top=10

# Response includes GeoJSON GeometryCollection with Point geometries
```

## WebSocket Integration

The adapter retrieves data via WebSocket:

### WebSocket Client

**Component**: `de.jena.traficam.websocket.TrafiCamWebsocket`

**Features**:
- Connects to TrafICam camera WebSocket endpoint
- Automatic subscription on connect
- Reads JSON messages and forwards to TrafiCamReader
- Graceful unsubscribe on close

**Subscription Message**:
```json
{
  "messageType": "Subscription",
  "subscription": {
    "type": "Data",
    "action": "Subscribe"
  }
}
```

**Unsubscription**:
```json
{
  "messageType": "Subscription",
  "subscription": {
    "type": "Data",
    "action": "Unsubscribe"
  }
}
```

### WebSocket → MQTT Bridge

**Component**: `de.jena.traficam.mqtt.MqttTrafiCamSender`

Bridges WebSocket data to MQTT topics for processing by the SensiNact adapter.

## Object Classification

Object classifications based on actual classMap configuration:

| Class ID | Classification Name | Description |
|----------|---------------------|-------------|
| 0 | Person | Pedestrians |
| 1 | Bicycle | Bicycles |
| 2 | Motorcycle | Motorcycles, scooters |
| 5 | Car | Passenger cars |
| 7 | Van | Delivery vans |
| 10 | SmallTruck | Small commercial trucks |
| 12 | LargeTruck | Large trucks, lorries |
| 14 | Bus | Buses |
| 20 | CarAndTrailer | Cars towing trailers |
| 21 | VanAndTrailer | Vans towing trailers |
| 24 | TruckAndTrailer | Trucks with trailers/semi-trailers |

**Note**: Classification IDs are defined in each camera's configuration (`classMap`). The mapping may vary between different camera models or installations.

## Use Cases

### Traffic Flow Monitoring

- **Real-time vehicle counting**: Count cars, trucks, bicycles by class
- **Speed detection**: Monitor average speeds and identify speeding
- **Traffic density**: Visualize congestion by object count in area
- **Trajectory analysis**: Track movement patterns through viewport

### Smart City Applications

- **Pedestrian safety**: Monitor crosswalk usage and pedestrian density
- **Bicycle infrastructure**: Measure bicycle lane utilization
- **Parking management**: Detect available parking spots
- **Emergency response**: Track vehicle movements for incident detection
- **Traffic light optimization**: Adaptive signal timing based on real traffic
- **Air quality correlation**: Correlate traffic density with pollution sensors

### Analytics & Insights

- **Peak hour analysis**: Identify rush hour patterns by vehicle class
- **Route optimization**: Understand preferred routes and bottlenecks
- **Urban planning**: Data-driven infrastructure decisions
- **Accident hotspots**: Identify dangerous intersections
- **Public transport efficiency**: Monitor bus punctuality and routes
- **Heavy vehicle monitoring**: Track truck traffic and trailer usage

## Performance Considerations

### Binary EMF Encoding

- **~10x smaller** than equivalent JSON
- Faster serialization/deserialization
- Type-safe with automatic validation
- Native EMF integration throughout platform

### Windowing Strategy

- **2-second windows** balance update frequency with system load
- Reduces SensiNact updates from real-time (30+ Hz) to 0.5 Hz
- Decreases database writes by ~98%
- Maintains sub-3-second latency for applications

### Buffer Configuration

```java
buffer_size: 3200
parallelism: 10
queue_policy: BLOCK
```

- Handles burst traffic from multiple cameras
- Parallel processing across 10 threads
- Backpressure prevents memory overflow

### Resource Usage

- **Binary encoding**: ~10x smaller than JSON
- **In-memory caching**: Configuration cached per camera
- **Stream processing**: Low memory footprint with windowing
- **Deduplication**: Prevents redundant storage

## Troubleshooting

### Debug Configuration

Enable detailed logging:

```properties
de.jena.traficam.sensinact=DEBUG
de.jena.traficam.websocket=DEBUG
de.jena.traficam.mqtt=INFO
org.gecko.osgi.messaging=INFO
```

### Common Issues

**Issue**: No objects appearing in SensiNact
- **Check**: MQTT subscription active for `5g/traficam/#`
- **Verify**: Camera configuration loaded (check logs for camId)
- **Check**: Binary EMF deserialization working (BinaryResourceImpl, look for IOException)
- **Verify**: Provider exists (configuration must be processed first)
- **Check**: classMap contains classId → className mapping
- **Verify**: EMF packages registered correctly

**Issue**: EMF deserialization errors
- **Check**: Binary resource format is valid EMF binary
- **Verify**: EMF package namespace URIs match: `https://jena.de/models/traficam/1.0`
- **Check**: Required EMF bundles are active
- **Verify**: ClassLoader has access to EMF model classes

**Issue**: Empty collections being sent repeatedly
- **Cause**: `sendEmpty` flag logic
- **Expected**: First empty sent, then suppressed until objects detected
- **Check**: Windowing pipeline logs

**Issue**: Objects appearing in wrong location
- **Check**: Camera calibration parameters (panAngle, tiltAngle, height)
- **Verify**: GPS coordinates in camera configuration correct
- **Check**: Scene boundaries match actual field of view

**Issue**: Duplicate objects in collection
- **Check**: Deduplication by object ID working
- **Verify**: Object IDs are unique within tracking session
- **Check**: Window duration (2 seconds) appropriate for camera framerate

**Issue**: Wrong classification names
- **Check**: classMap in camera configuration matches actual class IDs
- **Verify**: Configuration cached properly for the camera
- **Check**: getClassName() method logs

**Issue**: WebSocket connection failing
- **Check**: Camera WebSocket endpoint accessible
- **Verify**: Subscription message accepted
- **Check**: Error logs from `TrafiCamWebsocket.onErrorReceived`

**Issue**: High memory usage
- **Check**: Buffer size (3200) appropriate for deployment
- **Verify**: Old PushStreams being closed properly
- **Check**: Configuration cache not growing unbounded
- **Verify**: EMF resources being released after use

## Implementation Reference

**Source Files**:
- `backend/de.jena.traficam.sensinact/src/de/jena/traficam/sensinact/TrafiCam.java:70` - Main component
- `backend/de.jena.traficam.sensinact/src/de/jena/traficam/sensinact/TrafiCamDto.java:30` - DTO structure
- `backend/de.jena.traficam.model/model/traficam.ecore:3` - **EMF data model** (TrafiCamObject, CamConfig)
- `backend/de.jena.traficam.sensinact.model/model/traficam.ecore:3` - **EMF SensiNact provider model**
- `backend/de.jena.traficam.websocket/src/de/jena/traficam/websocket/TrafiCamWebsocket.java:39` - WebSocket client

**Key Constants** (TrafiCam.java):
- Config topic: `"5g/config/traficam/"` (line 74)
- Data topic: `"5g/traficam/"` (line 75)
- Window duration: `Duration.ofSeconds(2)` (line 190)
- Buffer size: `3200` (line 94)
- Parallelism: `10` (line 95)

**EMF Model Namespaces**:
- TrafICam model: `https://jena.de/models/traficam/1.0`
- SensiNact provider model: `https://model.data.jena.de/sensinact/traficam/1.0`

## Related Documentation

- [SensiNact Configuration](../sensinact-configuration.md) - General SensiNact setup and history provider
- [ILSA Adapter](../ilsa-adapter/ILSASensinactAdapter.md) - Similar MQTT-based adapter pattern
- [ChirpStack Connector](../chirpstack/chirpstack-connector.md) - Another EMF-based adapter with binary encoding

## External References

- [Eclipse SensiNact Documentation](https://eclipse-sensinact.readthedocs.io/) - Core framework
- [GeoJSON Specification](https://geojson.org/) - GeoJSON format standard
- [EMF (Eclipse Modeling Framework)](https://www.eclipse.org/modeling/emf/) - EMF documentation
- [Ecore Documentation](https://wiki.eclipse.org/Ecore) - EMF Ecore meta-model
- [OSGi PushStream](https://docs.osgi.org/specification/osgi.cmpn/7.0.0/util.pushstream.html) - Reactive streams
