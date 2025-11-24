# Actual Geo Location for Chirpstack Sensors

It turned out the location we were using for the sensors was not their actual geographical position, but a gateway location from where the signal was sent. 

The city then provided a `.gpkg` file with the actual geo location for the sensors (the corresponding `kml` file can be found [here]( [data](./backend/de.jena.udp.sensinact.runtime/runtime/data/sensoren.kml) )).

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