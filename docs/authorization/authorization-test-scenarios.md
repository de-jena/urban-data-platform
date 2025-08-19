# SensinAct jCasbin Authorization Test Scenarios

## Configuration Overview

The authorization configuration defines several roles with different access levels:

### Role Definitions

1. **Provider-Limited Roles:**
   - `weather_provider_reader`: Read-only access to weather providers
   - `chirpstack_service_reader`: Read-only access to ChirpStack device services

2. **Service-Limited Roles:**
   - `sensor_data_reader`: Read-only access to sensor data across all providers
   - `device_configurator`: Configuration access to device settings

3. **Operation-Limited Roles:**
   - `read_only_guest`: Basic read access to non-sensitive services
   - `maintenance_technician`: Diagnostic and maintenance operations only

4. **Admin Role:**
   - `system_admin`: Full unrestricted access to everything

## Test Scenarios

### Scenario 1: Provider-Limited Access
**User:** alice (role: weather_provider_reader)
**Expected Access:**
- ✅ READ weather.station1/temperature/value
- ✅ DESCRIBE weather.forecast/prediction/data
- ❌ READ chirpstack.gateway1/status/online
- ❌ UPDATE weather.station1/configuration/interval

### Scenario 2: Service-Limited Access  
**User:** bob (role: chirpstack_service_reader)
**Expected Access:**
- ✅ READ chirpstack.device1/device/battery
- ✅ READ chirpstack.gateway2/gateway/status  
- ✅ READ chirpstack.app1/application/settings
- ❌ READ chirpstack.device1/sensor/temperature
- ❌ ACT chirpstack.device1/admin/restart

### Scenario 3: Operation-Limited Access
**User:** guest (role: read_only_guest)
**Expected Access:**
- ✅ READ weather.station1/status/operational
- ✅ READ device.sensor1/info/version
- ❌ ACT device.sensor1/admin/reset
- ❌ READ device.sensor1/control/commands

### Scenario 4: Cross-Provider Sensor Access
**User:** eve (role: sensor_data_reader)
**Expected Access:**
- ✅ READ weather.station1/sensor/humidity
- ✅ READ chirpstack.device1/sensor/temperature  
- ✅ READ iot.device5/measurement/voltage
- ❌ UPDATE weather.station1/sensor/calibration
- ❌ ACT iot.device5/sensor/restart

### Scenario 5: Device Configuration Access
**User:** frank (role: device_configurator)
**Expected Access:**
- ✅ UPDATE weather.station1/configuration/interval
- ✅ UPDATE chirpstack.device1/settings/transmit_power
- ✅ ACT device.sensor1/admin/restart
- ❌ READ weather.station1/sensor/data
- ❌ ACT emergency.system1/control/shutdown

### Scenario 6: Traffic Control Operations
**User:** charlie (role: glt_traffic_operator)  
**Expected Access:**
- ✅ READ glt.intersection1/status/current_phase
- ✅ ACT glt.intersection1/traffic-control/change_phase
- ✅ UPDATE glt.intersection2/configuration/timing
- ❌ READ weather.station1/sensor/temperature
- ❌ ACT chirpstack.device1/admin/reset

### Scenario 7: Operations Manager Broad Access
**User:** diana (role: operations_manager)
**Expected Access:**
- ✅ READ any_provider/any_service/any_resource
- ✅ ACT glt.intersection1/admin/restart
- ✅ UPDATE traffic.controller1/control/settings
- ✅ ACT device-management/admin/bulk_update
- ❌ Full admin operations (limited by operations scope)

### Scenario 8: Maintenance Technician
**User:** technician (role: maintenance_technician)
**Expected Access:**
- ✅ READ device.sensor1/diagnostic/errors
- ✅ READ device.sensor2/health/status
- ✅ ACT device.sensor1/admin/reset
- ✅ ACT device.sensor1/admin/calibrate
- ❌ READ device.sensor1/data/measurements
- ❌ UPDATE device.sensor1/configuration/network

### Scenario 9: Emergency Operator
**User:** emergency_user (role: emergency_operator)
**Expected Access:**
- ✅ ACT emergency.system1/emergency/activate
- ✅ UPDATE glt.intersection1/emergency/override
- ✅ READ traffic.controller1/emergency/status
- ❌ READ weather.station1/sensor/data (non-emergency)

### Scenario 10: System Administrator
**User:** admin (role: system_admin)
**Expected Access:**
- ✅ Full access to all providers, services, and operations
- ✅ READ, UPDATE, ACT on any resource
- ✅ Administrative control over entire system

## Testing Commands

To test these scenarios, you can use the SensinAct REST API or command line interface:

```bash
# Test weather provider access (alice)
curl -H "Authorization: Bearer alice_token" \
     http://localhost:8080/sensinact/providers/weather.station1/services/temperature/resources/value

# Test chirpstack service access (bob)  
curl -H "Authorization: Bearer bob_token" \
     http://localhost:8080/sensinact/providers/chirpstack.device1/services/device/resources/battery

# Test device configuration (frank)
curl -X PUT -H "Authorization: Bearer frank_token" \
     -d '{"value": 30}' \
     http://localhost:8080/sensinact/providers/weather.station1/services/configuration/resources/interval

# Test traffic control operations (charlie)
curl -X POST -H "Authorization: Bearer charlie_token" \
     -d '{"action": "change_phase", "phase": "green"}' \
     http://localhost:8080/sensinact/providers/glt.intersection1/services/traffic-control/resources/change_phase/ACT
```

## Configuration Activation

To activate this authorization configuration, update your main sensinact.json:

```json
{
    "sensinact.session.manager": {
        "auth.policy": "CASBIN"
    }
}
```

And ensure the authorization configuration file is loaded by the runtime.