#!/usr/bin/env bash
#
# Publish a single IBIS GNSSLocationService message for one vehicle, so the
# IbisConnector (topic 5g/ibis/#) recreates the provider in the sensiNact twin
# with its gnssLocation service and admin/location.
#
# The payload is EMF JSON for
# https://jena.de/models/ibis/gnsslocationservice/1.0#//GNSSLocationData.
# Property names follow the ExtendedMetaData annotations of the ecore model,
# which is what emfjson-jackson uses by default.
#
# Usage: publish-gnss.sh --provider bus359 --lat 50.9003733 --lon 11.58823
#        publish-gnss.sh --provider bus359 --lat ... --lon ... --dry-run
#
set -euo pipefail

provider=""
latitude=""
longitude=""
altitude="155.0"
speed="0.0"
track="0.0"
satellites="9"
hdop="0.9"
vdop="1.3"
quality="GPS"
gnss_type="GPS"
coordinate_system="WGS84"
fix_time="now"
runtime_tz=""
device_type="bus"
topic_prefix="5g/ibis"
host="localhost"
port="1883"
username=""
password=""
use_tls="false"
qos="1"
retain="false"
client_id=""
mqtt_version=""
dry_run="false"

usage() {
	sed -n '2,15p' "$0" | sed 's/^# \{0,1\}//'
	cat <<'USAGE'

Options:
  --provider ID        vehicle / provider id, e.g. bus359   (required)
  --lat DEGREES        signed decimal degrees               (required)
  --lon DEGREES        signed decimal degrees               (required)
  --alt METERS         default 155.0
  --speed M_PER_S      default 0.0
  --track DEGREES      default 0.0
  --satellites N       default 9
  --hdop / --vdop      default 0.9 / 1.3
  --quality LITERAL    GNSSQualityEnumeration, default GPS
  --gnss-type LITERAL  GNSSTypeEnumeration, default GPS
  --coordinate-system LITERAL   default WGS84
  --time WHEN          fix time, anything date(1) understands, default now
  --runtime-tz ZONE    timezone the sensiNact runtime's JVM uses, default this
                       machine's zone; timestamps are wall-clock in that zone
  --device-type NAME   topic segment before the provider id, default bus
  --topic-prefix P     default 5g/ibis
  --host / --port      broker, default localhost:1883
  --user / --password  broker credentials
  --tls                use --capath /etc/ssl/certs (for ssl:// brokers)
  --qos N              default 1, so the broker acknowledges the publish; at
                       QoS 0 a broker that denies the topic drops it silently
  --client-id ID       MQTT client id; default <user>-gnss-<random> when a user
                       is given, else gecko-<uuid> as the runtime's own clients
                       use. Brokers that tie the id to the account answer a
                       wrong one with "Connection Refused: identifier rejected"
  --mqtt-version V     3.1, 3.1.1 or 5; default is mosquitto_pub's 3.1.1, while
                       the runtime itself speaks 5
  --retain             publish retained, so the runtime picks the message up
                       again on every restart and recreates the provider
  --dry-run            print topic and payload, publish nothing
USAGE
}

while [ $# -gt 0 ]; do
	case "$1" in
		--provider) provider="$2"; shift 2 ;;
		--lat) latitude="$2"; shift 2 ;;
		--lon) longitude="$2"; shift 2 ;;
		--alt) altitude="$2"; shift 2 ;;
		--speed) speed="$2"; shift 2 ;;
		--track) track="$2"; shift 2 ;;
		--satellites) satellites="$2"; shift 2 ;;
		--hdop) hdop="$2"; shift 2 ;;
		--vdop) vdop="$2"; shift 2 ;;
		--quality) quality="$2"; shift 2 ;;
		--gnss-type) gnss_type="$2"; shift 2 ;;
		--coordinate-system) coordinate_system="$2"; shift 2 ;;
		--time) fix_time="$2"; shift 2 ;;
		--runtime-tz) runtime_tz="$2"; shift 2 ;;
		--device-type) device_type="$2"; shift 2 ;;
		--topic-prefix) topic_prefix="$2"; shift 2 ;;
		--host) host="$2"; shift 2 ;;
		--port) port="$2"; shift 2 ;;
		--user) username="$2"; shift 2 ;;
		--password) password="$2"; shift 2 ;;
		--tls) use_tls="true"; shift ;;
		--qos) qos="$2"; shift 2 ;;
		--retain) retain="true"; shift ;;
		--client-id) client_id="$2"; shift 2 ;;
		--mqtt-version) mqtt_version="$2"; shift 2 ;;
		--dry-run) dry_run="true"; shift ;;
		-h|--help) usage; exit 0 ;;
		*) echo "unknown option: $1" >&2; usage >&2; exit 2 ;;
	esac
done

if [ -z "$provider" ] || [ -z "$latitude" ] || [ -z "$longitude" ]; then
	echo "--provider, --lat and --lon are required" >&2
	usage >&2
	exit 2
fi

# emfjson-jackson parses these values with SimpleDateFormat and the pattern
# yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz, where the Z is a literal and the trailing
# zone name is discarded: the wall-clock is read in the JVM's default timezone.
# So the time has to be written in the runtime's zone, not in ours or in UTC.
ibis_time() { date -d "$1" +%Y-%m-%dT%H:%M:%S.000Z%Z; }
if [ -n "$runtime_tz" ]; then
	fix_timestamp=$(TZ="$runtime_tz" ibis_time "$fix_time")
	# IbisConnector derives the admin/location timestamp as
	# date.epochSecond + time.epochSecond, so the date has to land on the epoch
	# for that sum to come out as the real fix time.
	epoch_date=$(TZ="$runtime_tz" ibis_time @0)
else
	fix_timestamp=$(ibis_time "$fix_time")
	epoch_date=$(ibis_time @0)
fi

case "$latitude" in -*) latitude_direction="south" ;; *) latitude_direction="north" ;; esac
case "$longitude" in -*) longitude_direction="west" ;; *) longitude_direction="east" ;; esac

topic="${topic_prefix}/${device_type}/${provider}"

payload=$(cat <<PAYLOAD
{
  "eClass" : "https://jena.de/models/ibis/gnsslocationservice/1.0#//GNSSLocationData",
  "latitude" : {
    "Degree" : { "Value" : ${latitude} },
    "Direction" : { "Value" : "${latitude_direction}" }
  },
  "longitude" : {
    "Degree" : { "Value" : ${longitude} },
    "Direction" : { "Value" : "${longitude_direction}" }
  },
  "altitude" : { "Value" : ${altitude} },
  "time" : { "Value" : "${fix_timestamp}" },
  "date" : { "Value" : "${epoch_date}" },
  "SpeedOverGround" : { "Value" : ${speed} },
  "SignalQuality" : "${quality}",
  "NumberOfSatellites" : { "Value" : ${satellites} },
  "HoriziontalDilutionOfPrecision" : { "Value" : ${hdop} },
  "VerticalDilutionOfPrecision" : { "Value" : ${vdop} },
  "TrackDegreeTrue" : { "Value" : ${track} },
  "TrackDegreeMagnetic" : { "Value" : ${track} },
  "GNSSType" : "${gnss_type}",
  "GNSSCoordinateSystem" : "${coordinate_system}"
}
PAYLOAD
)

if [ "$dry_run" = "true" ]; then
	echo "topic: ${topic}"
	echo "$payload"
	exit 0
fi

if [ -z "$client_id" ]; then
	if [ -n "$username" ]; then
		client_id="${username}-gnss-$(od -An -N3 -tx1 /dev/urandom | tr -d ' ')"
	else
		client_id="gecko-$(uuidgen)"
	fi
fi

publish_args=(-h "$host" -p "$port" -q "$qos" -i "$client_id" -t "$topic" -m "$payload")
[ -n "$mqtt_version" ] && publish_args+=(-V "$mqtt_version")
[ -n "$username" ] && publish_args+=(-u "$username")
[ -n "$password" ] && publish_args+=(-P "$password")
[ "$use_tls" = "true" ] && publish_args+=(--capath /etc/ssl/certs)
[ "$retain" = "true" ] && publish_args+=(-r)

# mosquitto_pub reports a rejected publish on stderr but still exits 0, so the
# outcome has to be read out of its output.
publish_output=$(mosquitto_pub "${publish_args[@]}" 2>&1)
publish_status=$?

[ -n "$publish_output" ] && printf '%s\n' "$publish_output" >&2

if [ $publish_status -ne 0 ] || printf '%s' "$publish_output" | grep -qiE 'failed|not authoris|not authoriz|refused|error'; then
	echo "publish REJECTED by ${host}:${port} for ${topic}" >&2
	exit 1
fi

echo "published ${provider} @ ${latitude},${longitude} (${fix_timestamp}) to ${host}:${port} ${topic} as ${client_id}"
