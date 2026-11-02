# ChirpStack seed for the Model Atlas (scope `udp`)

What the Model Atlas loads at startup for the ChirpStack devices, hand-maintained:

| | |
|---|---|
| `seed/chirpstack-uplink.ecore` | the uplink JSON of every device profile as an Ecore model: the shared `Uplink` (`deviceInfo`, `rxInfo`) and per profile `<Profile>Uplink` → `<Profile>Object` mirroring what the payload decoder returns. A class is typed by the codec annotation `typeDiscriminator` = the ChirpStack `deviceProfileId`. Attributes use the wrapper types (`EDoubleObject`, …) so an absent member stays `null` and the resource keeps its value. |
| `seed/sensinactmapping/<Profile>ProviderMapping.xmi` | one Event Atlas mapping per profile: provider = `devEui`, admin `friendlyName` = `deviceName`, admin location = the first receiving gateway (`rxInfo/0/location`) unless the device is surveyed (Teros21: the KML adapter owns the point), one service per group of values. |

A new device profile is a new `<Profile>Uplink` class plus one mapping, nothing else; the decoder
has to return a mapping-friendly JSON (`docs/chirpstack/payload-decoder-leitfaden.md`, German).

## Two ways to write a service

- **Automatic**: a `referencedResource` on the service generates a resource per attribute of the
  referenced object, type and unit from the ecore (`sensinact.mapping.unit` annotation). With
  `exclude="true"` and no `filter` all attributes (`EM310`), with `exclude="false"` and a `filter`
  per attribute only those (the SenseCAP services split one flat object into `air`, `rain`,
  `light`, `status`). Resource names are the attribute names, so the decoder's names are the
  resource names - the way to go for new and reworked profiles.
- **Explicit**: a `resources` element per value with `eType` and the `valueFeature` path. Needed
  where the resource name differs from the decoder member (`temperature` ← `temp_SOIL_f`); the
  profiles still on their vendor decoders are written this way and switch to automatic resources
  when their decoder is reworked.

The IoTraffic counting lines read an EMF map (`lines`, keyed `line_N`) with a
`collectionFilter` per service; see `docs/chirpstack/chirpstack-connector.md`.

## Before pushing

`./gradlew :de.jena.udp.atlas.seed:test` loads every ecore and mapping of this seed (and the DWD
one) the way the Atlas does. The Atlas halts on the first file it cannot load, so a wrong feature
name would take the whole scope down at startup. The seed reaches dimserver02 by copying it into
`modelatlas/seed/scopes/udp/` of the infrastructure repo.
