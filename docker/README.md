# Urban Data Platform - Docker Deployment

This directory contains the Docker deployment configuration for the Jena Urban Data Platform.

## Architecture

The platform uses a containerized architecture with the following main components:

### Containers

1. **UDP Broker** (`udp-broker`)
   - Eclipse SensiNact Gateway runtime
   - OSGi-based microservices (95+ bundles)
   - REST APIs and SensorThings API
   - MQTT clients for data ingestion
   - Ports: 8080 (HTTP), 1883 (MQTT), 8885 (MQTT over WebSocket)

2. **MQTT Bridge** (`mqtt-bridge`)
   - MQTT topic bridge service
   - Routes messages between different MQTT brokers
   - Handles protocol translation

3. **MongoDB**
   - Document database for provider metadata
   - Port: 27017

4. **TimescaleDB** (PostgreSQL 16)
   - Time-series database for historical data
   - SensiNact history provider backend
   - Port: 5432

## Directory Structure

```
docker/
├── broker/                     # UDP Broker container
│   ├── Dockerfile             # Alpine Linux + OpenJDK 17
│   └── content/               # Application artifacts (copied during build)
│       ├── jar/               # OSGi bundles
│       └── de.jena.udp.sensinact.runtime.docker.jar
├── bridge/                     # MQTT Bridge container
│   ├── Dockerfile
│   └── content/
├── docker-compose/            # Docker Compose orchestration
│   └── docker-compose.yml    # Service definitions
└── README.md                  # This file
```

## Building Docker Images

### Prerequisites

- Docker installed and running
- Gradle build completed successfully
- Build artifacts exported

### Build Process

1. **Build the backend**:
   ```bash
   cd backend
   ./gradlew clean build
   ```

2. **Resolve and export runtime**:
   ```bash
   ./gradlew :de.jena.udp.sensinact.runtime:resolve.de.jena.udp.sensinact.runtime.base
   ./gradlew :de.jena.udp.sensinact.runtime:export.de.jena.udp.sensinact.runtime.docker
   ```

3. **Prepare Docker artifacts**:
   ```bash
   cd docker
   ./gradlew prepareDocker
   ```

4. **Build Docker images**:
   ```bash
   # Build UDP Broker image
   docker build -t udp-broker:latest broker/

   # Build MQTT Bridge image
   docker build -t mqtt-bridge:latest bridge/
   ```

## Deployment with Docker Compose

### Environment Configuration

Create a `.env` file in the `docker-compose/` directory with the following variables:

```bash
# MongoDB Configuration
MONGO_BASE_URI=mongodb://mongodb:27017
MONGO_USERNAME=admin
MONGO_PASSWORD=<your-secure-password>

# TimescaleDB Configuration
TIMESCALE_HOST=timescaledb
TIMESCALE_DB=sensinact
TIMESCALE_USER=postgres
TIMESCALE_PWD=<your-secure-password>

# ChirpStack MQTT (SSL)
CHIRPSTACK_HOST=mqtt.chirpstack.io
CHIRPSTACK_PORT=8883
CHIRPSTACK_CERT=<base64-encoded-client-cert>
CHIRPSTACK_KEY=<base64-encoded-client-key>
CHIRPSTACK_CA=<base64-encoded-ca-cert>

# The Things Network
TTN_APP_ID=<your-ttn-app-id>
TTN_APP_KEY=<your-ttn-app-key>

# Ice Sensor API
ICESENSOR_TOKEN=<your-api-token>

# MQTT Credentials
MQTT_FULL_USER=<mqtt-username>
MQTT_FULL_PASSWORD=<mqtt-password>
```

### Start Services

```bash
cd docker-compose
docker-compose up -d
```

### Stop Services

```bash
docker-compose down
```

### View Logs

```bash
# All services
docker-compose logs -f

# Specific service
docker-compose logs -f udp-broker
```

## Accessing the Platform

Once deployed, the platform is accessible at:

- **REST API**: `http://localhost:8080/udp/rest/sensinact/`
- **SensorThings API**: `http://localhost:8080/udp/rest/v1.1/`
- **Swagger UI**: `http://localhost:8080/udp/swagger-api/index.html`
- **Felix Web Console**: `http://localhost:8080/udp/system/console`
- **Log Files API**: `http://localhost:8080/udp/rest/control/logs`

### Health Checks

Check if services are running:

```bash
# Check provider list
curl http://localhost:8080/udp/rest/sensinact/providers

# Check SensorThings
curl http://localhost:8080/udp/rest/v1.1/Things
```

## Container Configuration

### UDP Broker

The broker container uses:
- **Base Image**: Alpine Linux with OpenJDK 17
- **Runtime**: OSGi framework (Apache Felix)
- **Configuration**: Loaded from ConfigAdmin JSON files
- **Data Volumes**:
  - `/app/data` - KML files, runtime data
  - `/app/runtime` - Runtime state (should be ephemeral)

### Environment Variables

The platform supports environment variable substitution in configuration files:

```json
{
  "host": "$[env:MQTT_HOST;default=localhost]",
  "username": "$[env:MQTT_USER;default=admin]"
}
```

## Security Considerations

### Production Deployment Checklist

- [ ] Change all default passwords
- [ ] Enable SensiNact authentication (currently: `allow.anonymous: true`)
- [ ] Configure authorization policies
- [ ] Use HTTPS/TLS for external access (reverse proxy)
- [ ] Secure MQTT connections with TLS
- [ ] Restrict network access to internal services
- [ ] Use Docker secrets for sensitive data
- [ ] Enable firewall rules
- [ ] Regular security updates

### Current Security State

**WARNING**: The default configuration has security features disabled for development:

```json
{
  "allow.anonymous": true,
  "authorization.policy": "ALLOW_ALL"
}
```

This **MUST** be changed for production deployments!

## Troubleshooting

### Container won't start

Check logs:
```bash
docker logs udp-broker
```

Common issues:
- Database connection failed (check MongoDB/TimescaleDB are running)
- Port already in use (check port 8080, 1883, 8885)
- Missing environment variables

### MQTT adapters not receiving data

1. Check MQTT broker connectivity:
   ```bash
   docker logs udp-broker | grep -i mqtt
   ```

2. Verify MQTT credentials in environment variables

3. Check certificate configuration for SSL connections

4. Test MQTT connection manually:
   ```bash
   mosquitto_sub -h localhost -p 1883 -t '#' -v
   ```

### Database connection issues

**MongoDB**:
```bash
docker exec -it mongodb mongosh --eval "db.adminCommand('ping')"
```

**TimescaleDB**:
```bash
docker exec -it timescaledb psql -U postgres -c "SELECT version();"
```

### Bundle resolution errors

Check Felix console:
```bash
curl http://localhost:8080/udp/system/console/bundles
```

Look for bundles in state other than ACTIVE.

## Maintenance

### Backup

**MongoDB**:
```bash
docker exec mongodb mongodump --out /backup
```

**TimescaleDB**:
```bash
docker exec timescaledb pg_dump -U postgres sensinact > backup.sql
```

### Updates

To update the platform:

1. Pull latest code
2. Rebuild backend
3. Rebuild Docker images
4. Stop containers: `docker-compose down`
5. Start with new images: `docker-compose up -d`

### Clean Build

Remove all build artifacts and caches:

```bash
# Clean Gradle build
cd backend
./gradlew clean

# Remove Docker volumes (WARNING: deletes data!)
docker-compose down -v

# Remove Docker images
docker rmi udp-broker:latest mqtt-bridge:latest
```

## CI/CD Integration

The platform includes Jenkins and GitHub Actions pipelines:

- **GitHub Actions**: `.github/workflows/build.yml`
- **Jenkins**: `Jenkinsfile` at project root

Both pipelines:
1. Build frontend applications
2. Build backend with Gradle
3. Run tests (when enabled)
4. Export Docker artifacts
5. Build Docker images
6. Push images to registry (on main branch)

## Related Documentation

- [Main README](../readme.md) - Project overview
- [SensiNact Configuration](../docs/sensinact-configuration.md) - Platform configuration
- [ILSA Adapter](../docs/ilsa-adapter/ILSASensinactAdapter.md) - Traffic light integration
- [ChirpStack Connector](../docs/chirpstack/chirpstack-connector.md) - LoRaWAN integration

## Support

For issues or questions:
- GitHub Issues: https://github.com/de-jena/urban-data-platform/issues
- Email: info@data-in-motion.biz
