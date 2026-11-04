# Actual Geo Location for Chirpstack Sensors

> The sensiNact bundles this document describes were removed from the repository on 2026-11-03 with the legacy runtime; the sections on the atlas runtime (`de.jena.udp.atlas.*`) are the current state, the rest is kept as the record of what was ported.

It turned out the location we were using for the sensors was not their actual geographical position, but a gateway location from where the signal was sent. 

The city then provided a `.gpkg` file with the actual geo location for the sensors (the corresponding `kml` file is `de.jena.udp.sensinact.runtime/runtime/data/sensoren.kml`; the combined `teros_sensors_and_ref_areas.kml` next to it also carries the reference areas).

In order to match the sensors in this document with the sensors we are getting data from, we used the `eui` attribute provided in the `kml` file. If no `eui` attribute for a certain sensor is found, we then use the `key` attribute. 

There are some sensors for which neither the `eui` attribute nor the `key` is set. For these sensors it was not possible to set the proper geo location, because we have no way to match them with the sensors we are receiving data from. These sensors are the ones located in:

+ 11.608237,50.944350
+ 11.608303,50.944385
+ 11.608318,50.944410
+ 11.608343,50.944398
+ 11.607604,50.944001
+ 11.607589,50.943994
+ 11.607708,50.944056
+ 11.607696,50.944050

## Atlas runtime

In `de.jena.udp.atlas.runtime` the bundle `de.jena.udp.atlas.kml` does the matching
(`docs/humidity-sensors-rules/HumiditySensorRulesImplementation.md` covers the reference areas of the
same file). It ships `teros_sensors_and_ref_areas.kml` and reads it once at activation; `KML_FILE`
points at a newer file. The `eui` of the `sensoren` folder, lower-cased, is the ChirpStack provider
name (the mappings name providers after `deviceInfo/devEui`). The bundle listens to the sensiNact
`LIFECYCLE/*` events and sets `admin/location` on the gateway thread when such a provider is created,
plus once at activation for the providers already there. The ChirpStack mappings do not map a
location for the surveyed profile (`location=surveyed` in the `model` annotation of
`SolidosTeros21` in `chirpstack.ecore`), and a push only touches the resources it sets, so the
point survives the uplinks. Every other profile's mapping sets the admin location to the position
of the first receiving gateway (`rxInfo/0/location`), as the legacy connector did, on every
uplink. Teros21 sensors without an `eui` in the file (the eight above) therefore keep no location
until the file names them.
