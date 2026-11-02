# Leitfaden: Payload-Decoder in ChirpStack mapping-freundlich schreiben

Ein neuer LoRaWAN-Sensor kommt ohne Programmierung in die Urban Data Platform, wenn sein
Payload-Decoder in ChirpStack ein JSON liefert, das sich 1:1 auf sensiNact-Ressourcen abbilden
lässt. Die Abbildung selbst ist Konfiguration (ein Eintrag im ChirpStack-Modell, aus dem das
Event-Atlas-Mapping generiert wird), kein Code. Dieser Leitfaden beschreibt, wie das JSON des
Decoders aussehen muss, damit das klappt.

## Wie das JSON des Decoders weiterverarbeitet wird

ChirpStack ruft für jeden Uplink den Decoder des Geräteprofils auf:

```javascript
function decodeUplink(input) {
  // input.bytes: die Rohdaten, input.fPort: der LoRaWAN-Port
  return { data: { /* das Ergebnis */ } };
}
```

Was der Decoder in `data` zurückgibt, erscheint im MQTT-Uplink als `object`. Die Plattform
liest jeden Wert über einen festen Pfad (`object/<Name>`) und schreibt ihn auf genau eine
Ressource eines Dienstes des Providers. Das Gerät wird zum Provider (Name = DevEUI), die
Dienste und Ressourcen stammen aus dem Modell:

```
object.temperature  ->  Provider 2cf7...  /  Dienst air  /  Ressource temperature
object.humidity     ->  Provider 2cf7...  /  Dienst air  /  Ressource humidity
object.battery      ->  Provider 2cf7...  /  Dienst status  /  Ressource battery
```

Daraus folgt die wichtigste Regel: **ein Messwert = ein benannter Member von `object` mit einem
festen Namen und einem festen Typ.**

## Die Regeln

1. **Flach und benannt.** Jeder Messwert ist ein eigener Member direkt in `object` (oder in
   einem benannten Unterobjekt, z. B. `object.soil.temperature`). Keine Listen, in denen die
   Position die Bedeutung trägt.

   ```json
   {"temperature": 21.5, "humidity": 48.0, "battery": 3.57}
   ```

2. **Keine Listen von Messungen.** Ein Decoder, der `messages: [[{measurementId: 4097,
   measurementValue: 24.4}, ...]]` oder `sensors: [{...}, {...}]` liefert, ist für die Plattform
   nicht lesbar: ein Pfad adressiert immer nur das erste Element einer Liste, und eine Liste von
   Listen kann gar nicht modelliert werden. Solche Hersteller-Decoder (SenseCAP, Atmos) werden
   im Decoder selbst aufgelöst, siehe das Beispiel unten.

3. **Sprechende, stabile Namen.** `airTemperature` statt `m4097` oder `temp1`; englisch,
   `camelCase` oder `snake_case`, nur Buchstaben, Ziffern und Unterstrich, mit Buchstabe
   beginnend. Der Name wird zum Ressourcennamen und taucht in SensorThings-Datastreams auf. Ein
   Name darf später nicht umgedeutet werden.

4. **Zahlen als Zahlen.** `21.5`, nicht `"21.5"`. Wahrheitswerte als `true`/`false`, nicht als
   `0`/`1` oder `"on"`. Ein Wert hat in jedem Uplink denselben Typ.

5. **Einheiten festlegen, nicht umrechnen lassen.** Die Einheit gehört zur Ressource (sie wird
   im Modell als `unit` hinterlegt). Der Decoder liefert immer dieselbe Einheit, bevorzugt die
   SI-Einheit bzw. die in der Plattform übliche: °C, %, hPa, m/s, mm, V. Keine Einheit im
   Wert (`"21.5 °C"` ist ein String, kein Messwert), gern aber im Namen, wenn sie
   ungewöhnlich ist (`pressureKPa`).

6. **Fehlende Werte weglassen, nicht auf 0 setzen.** Sendet ein Gerät einen Wert in diesem
   Uplink nicht (anderer Port, anderes Frame), fehlt der Member einfach. Die Ressource behält
   dann ihren letzten Wert. Ein `0` oder `null` würde als Messung gespeichert.

7. **Keine Metadaten im Wert.** Nicht benötigte Felder wie `payload` (Rohbytes als Hex), `err`,
   `valid`, `type` oder `fPort` können bleiben, werden aber ignoriert; sie dürfen keine
   Messwerte verdecken oder deren Namen belegen.

8. **Keine dynamischen Schlüssel.** `{"4097": 24.4}` oder `{"ch_<kanal>": ...}` mit wechselnder
   Kanalnummer ist nicht abbildbar. Ausnahme: Ein Objekt mit einer kleinen, bekannten Menge
   gleichartiger Schlüssel (z. B. die Zähllinien einer Kamera `lines.line_1 … lines.line_4`) wird
   als Sammlung mit Filter modelliert; dafür muss die Menge der Schlüssel vorher feststehen.

9. **Eine Gerätesorte, ein Geräteprofil, ein Decoder.** Die Plattform erkennt das Modell an der
   `deviceProfileId`. Zwei Firmware-Varianten mit unterschiedlichem JSON brauchen zwei Profile.

10. **Dokumentieren.** Für jeden Member: Bedeutung, Einheit, Wertebereich, Messintervall. Diese
    Angaben wandern ins Modell und damit in die Beschreibung der Ressource.

## Beispiel: SenseCAP-Decoder umbauen

Der Hersteller-Decoder der SenseCAP S2120 liefert Messungen in Frames, identifiziert nur über
eine Nummer:

```json
{"messages": [[{"measurementId": "4097", "measurementValue": 24.4, "type": "Air Temperature"},
               {"measurementId": "4098", "measurementValue": 36.0, "type": "Air Humidity"}],
              [{"measurementId": "4104", "measurementValue": 354.0, "type": "Wind Direction Sensor"}]]}
```

Mapping-freundlich ist dasselbe Ergebnis so:

```json
{"airTemperature": 24.4, "airHumidity": 36.0, "windDirection": 354.0}
```

Dafür genügt am Ende des Hersteller-Decoders ein Umbau des Ergebnisses:

```javascript
// SenseCAP measurementId -> Name und Einheit (Auszug, Vollständige Liste: SenseCAP-Dokumentation)
var NAMES = {
  4097: "airTemperature",      // °C
  4098: "airHumidity",         // %
  4099: "lightIntensity",      // lux
  4101: "barometricPressure",  // Pa
  4102: "soilTemperature",     // °C
  4103: "soilMoisture",        // %
  4104: "windDirection",       // °
  4105: "windSpeed",           // m/s
  4108: "soilConductivity",    // µS/cm
  4113: "rainGauge",           // mm/h
  4190: "uvIndex",
  4191: "peakWindGust",        // m/s
  4213: "rainAccumulation"     // mm
};

function decodeUplink(input) {
  var raw = decodeSenseCap(input.bytes);   // der Hersteller-Decoder, unverändert
  var data = {};
  (raw.messages || []).forEach(function (frame) {
    (Array.isArray(frame) ? frame : [frame]).forEach(function (m) {
      var name = NAMES[Number(m.measurementId)];
      if (name !== undefined && typeof m.measurementValue === "number") {
        data[name] = m.measurementValue;
      }
    });
  });
  return { data: data };
}
```

Eine unbekannte `measurementId` fällt dabei weg, statt als `m4321` einen Namen zu erfinden; sie
wird erst aufgenommen, wenn sie dokumentiert und ins Modell übernommen ist.

Noch einfacher ist es, die Namen direkt dort zu vergeben, wo der Hersteller-Decoder die Frames
auseinandernimmt. [`decoders/sensecap-s2120-decoder.js`](decoders/sensecap-s2120-decoder.js) ist
der vollständige Vorschlag für die S2120: Frame-Zerlegung und Zahlenformate des Herstellers
unverändert, aber jedes Frame schreibt benannte Werte (`airTemperature`, `windDirection`,
`battery`, `sensorError`, …) in `data`; die Tabelle im Dateikopf nennt Einheit, Frame und die
SenseCAP-`measurementId` jedes Members. Gegen den aufgezeichneten Uplink
`4A00F424…` liefert er dieselben zehn Werte wie der Hersteller-Decoder, nur flach. Für die
S2105 ist der Umbau derselbe mit den Boden-Messungen 4102/4103/4108.

## Beispiel: Sensorliste auflösen

Ein Decoder, der mehrere Sensoren eines Geräts als Liste liefert
(`sensors: [{wind_speed_ms: 3.2, gust_ms: 6.8}, {air_temperature_degC: 11.4}]`), gibt
stattdessen benannte Unterobjekte zurück:

```json
{"wind": {"speed": 3.2, "gust": 6.8, "direction": 210.0}, "air": {"temperature": 11.4}, "battery": 3.9}
```

Die Unterobjekte werden zu den Diensten `wind`, `air` und `status` des Providers.

## Prüfen, bevor es ins Profil geht

- In ChirpStack unter dem Geräteprofil "Codec" gibt es einen Test mit Beispiel-Bytes: das Ergebnis
  muss die Regeln oben erfüllen (flach, benannt, Zahlen als Zahlen).
- Zwei verschiedene Uplinks desselben Geräts (z. B. unterschiedliche Ports) liefern dieselben
  Namen für dieselben Größen; ein Wert, den ein Uplink nicht enthält, fehlt dort einfach.
- Der Uplink erscheint auf dem Broker unter `chirpstack/application/<app>/device/<devEui>/event/up`;
  ein mitgeschnittenes Beispiel wird als `backend/de.jena.chirpstack.sensinact/examples/<gerät>.json`
  abgelegt und dient als Vorlage für das Modell und als Testfall.

## Was danach in der Plattform passiert

Mit dem Beispiel-Uplink wird das Geräteprofil im ChirpStack-Modell
(`backend/de.jena.chirpstack.model/model/chirpstack.ecore`) ergänzt: ein Provider mit der
`profileId` des Geräteprofils, je Dienst eine Klasse, je Ressource ein Attribut mit dem Pfad
(`object/airTemperature`) und der Einheit. Der Generator
(`backend/de.jena.chirpstack.model/eventatlas/gen-chirpstack-mappings.py`) erzeugt daraus das
Uplink-Modell und das Event-Atlas-Mapping, das in den Model Atlas (Scope `udp`) geladen wird. Ab
dann wird jeder Uplink des Profils zum Provider, ohne eine Zeile Java. Details:
`docs/chirpstack/chirpstack-connector.md`.
