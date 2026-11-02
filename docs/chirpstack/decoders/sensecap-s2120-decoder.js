/**
 * SenseCAP S2120 (8-in-1 Wetterstation) - mapping-freundlicher Payload-Decoder für ChirpStack v4.
 *
 * Gleiche Frame-Zerlegung und Zahlenformate wie der Hersteller-Decoder, aber das Ergebnis sind
 * benannte Werte statt messages[frame][n] mit measurementId (siehe docs/chirpstack/
 * payload-decoder-leitfaden.md). Ein Uplink trägt nur die Werte seiner Frames; was er nicht
 * trägt, fehlt und die Ressource behält ihren letzten Wert.
 *
 *   Member               Einheit  Frame   SenseCAP measurementId
 *   airTemperature       °C       01/4a   4097
 *   airHumidity          %        01/4a   4098
 *   lightIntensity       lux      01/4a   4099
 *   uvIndex              -        01/4a   4190
 *   windSpeed            m/s      01/4a   4105
 *   windDirection        °        02/4b   4104
 *   rainGauge            mm/h     02/4b   4113
 *   barometricPressure   Pa       02/4b   4101
 *   peakWindGust         m/s      4c      4191
 *   rainAccumulation     mm       4c      4213
 *   battery              %        03/04
 *   hardwareVersion      -        04
 *   firmwareVersion      -        04
 *   measureInterval      s        04/05
 *   gpsInterval          s        04/05
 *   sensorErrorCode      -        06      (Hex-Code des Herstellers als Zahl)
 *   sensorError          -        06      (Name des Fehlers)
 *   sensorStatus         -        10
 *   sensorChannelType    -        10
 *   sensorEui            -        10
 */
function decodeUplink(input) {
  var hex = bytes2HexString(input.bytes).toUpperCase()
  var data = {}
  var frames = dataSplit(hex)
  for (var i = 0; i < frames.length; i++) {
    decodeFrame(frames[i].dataId, frames[i].dataValue, data)
  }
  return { data: data }
}

/** Schreibt die Werte eines Frames als benannte Member in data. */
function decodeFrame(dataId, v, data) {
  switch (dataId) {
    case '01':
    case '4a':
      data.airTemperature = loraWANV2DataFormat(v.substring(0, 4), 10)
      data.airHumidity = loraWANV2DataFormat(v.substring(4, 6))
      data.lightIntensity = loraWANV2DataFormat(v.substring(6, 14))
      data.uvIndex = loraWANV2DataFormat(v.substring(14, 16), 10)
      data.windSpeed = loraWANV2DataFormat(v.substring(16, 20), 10)
      break
    case '02':
    case '4b':
      data.windDirection = loraWANV2DataFormat(v.substring(0, 4))
      data.rainGauge = loraWANV2DataFormat(v.substring(4, 12), 1000)
      data.barometricPressure = loraWANV2DataFormat(v.substring(12, 16), 0.1)
      break
    case '4c':
      data.peakWindGust = loraWANV2DataFormat(v.substring(0, 4), 10)
      data.rainAccumulation = loraWANV2DataFormat(v.substring(4, 12), 1000)
      break
    case '03':
      data.battery = loraWANV2DataFormat(v)
      break
    case '04':
      data.battery = loraWANV2DataFormat(v.substring(0, 2))
      data.hardwareVersion = version(v.substring(2, 6))
      data.firmwareVersion = version(v.substring(6, 10))
      data.measureInterval = loraWANV2DataFormat(v.substring(10, 14)) * 60
      data.gpsInterval = loraWANV2DataFormat(v.substring(14, 18)) * 60
      break
    case '05':
      data.measureInterval = loraWANV2DataFormat(v.substring(0, 4)) * 60
      data.gpsInterval = loraWANV2DataFormat(v.substring(4, 8)) * 60
      break
    case '06':
      data.sensorErrorCode = parseInt(v, 16)
      data.sensorError = SENSOR_ERRORS[v.toUpperCase()] || 'CC_OTHER_FAILED'
      break
    case '10':
      var bits = loraWANV2BitDataFormat(v.substring(0, 2))
      data.sensorStatus = bits.status
      data.sensorChannelType = bits.type
      data.sensorEui = v.substring(2)
      break
    default:
      break
  }
}

function version(hex4) {
  return loraWANV2DataFormat(hex4.substring(0, 2)) + '.' + loraWANV2DataFormat(hex4.substring(2, 4))
}

var SENSOR_ERRORS = {
  '00': 'CCL_SENSOR_ERROR_NONE', '01': 'CCL_SENSOR_NOT_FOUND', '02': 'CCL_SENSOR_WAKEUP_ERROR',
  '03': 'CCL_SENSOR_NOT_RESPONSE', '04': 'CCL_SENSOR_DATA_EMPTY', '05': 'CCL_SENSOR_DATA_HEAD_ERROR',
  '06': 'CCL_SENSOR_DATA_CRC_ERROR', '07': 'CCL_SENSOR_DATA_B1_NO_VALID', '08': 'CCL_SENSOR_DATA_B2_NO_VALID',
  '09': 'CCL_SENSOR_RANDOM_NOT_MATCH', '0A': 'CCL_SENSOR_PUBKEY_SIGN_VERIFY_FAILED',
  '0B': 'CCL_SENSOR_DATA_SIGN_VERIFY_FAILED', '0C': 'CCL_SENSOR_DATA_VALUE_HI', '0D': 'CCL_SENSOR_DATA_VALUE_LOW',
  '0E': 'CCL_SENSOR_DATA_VALUE_MISSED', '0F': 'CCL_SENSOR_ARG_INVAILD', '10': 'CCL_SENSOR_RS485_MASTER_BUSY',
  '11': 'CCL_SENSOR_RS485_REV_DATA_ERROR', '12': 'CCL_SENSOR_RS485_REG_MISSED', '13': 'CCL_SENSOR_RS485_FUN_EXE_ERROR',
  '14': 'CCL_SENSOR_RS485_WRITE_STRATEGY_ERROR', '15': 'CCL_SENSOR_CONFIG_ERROR', 'FF': 'CCL_SENSOR_DATA_ERROR_UNKONW'
}

/* ---- ab hier unverändert aus dem Hersteller-Decoder ---------------------------------------- */

function dataSplit(bytes) {
  var frameArray = []
  for (var i = 0; i < bytes.length; i++) {
    var remainingValue = bytes
    var dataId = remainingValue.substring(0, 2).toLowerCase()
    var dataValue
    var dataObj = {}
    switch (dataId) {
      case '01': case '20': case '21': case '30': case '31': case '33':
      case '40': case '41': case '42': case '43': case '44': case '45': case '4a':
        dataValue = remainingValue.substring(2, 22)
        bytes = remainingValue.substring(22)
        dataObj = { dataId: dataId, dataValue: dataValue }
        break
      case '02': case '4b':
        dataValue = remainingValue.substring(2, 18)
        bytes = remainingValue.substring(18)
        dataObj = { dataId: dataId, dataValue: dataValue }
        break
      case '03': case '06':
        dataValue = remainingValue.substring(2, 4)
        bytes = remainingValue.substring(4)
        dataObj = { dataId: dataId, dataValue: dataValue }
        break
      case '05': case '34':
        dataValue = bytes.substring(2, 10)
        bytes = remainingValue.substring(10)
        dataObj = { dataId: dataId, dataValue: dataValue }
        break
      case '04': case '10': case '32': case '35': case '36': case '37': case '38': case '39':
        dataValue = bytes.substring(2, 20)
        bytes = remainingValue.substring(20)
        dataObj = { dataId: dataId, dataValue: dataValue }
        break
      case '4c':
        dataValue = bytes.substring(2, 14)
        bytes = remainingValue.substring(14)
        dataObj = { dataId: dataId, dataValue: dataValue }
        break
      default:
        dataValue = '9'
        break
    }
    if (dataValue.length < 2) {
      break
    }
    frameArray.push(dataObj)
  }
  return frameArray
}

function loraWANV2DataFormat(str, divisor) {
  divisor = divisor || 1
  var str2 = toBinary(bigEndianTransform(str))
  if (str2.substring(0, 1) === '1') {
    var inverted = str2.split('').map(function (bit) { return bit === '1' ? 0 : 1 }).join('')
    return parseFloat('-' + (parseInt(inverted, 2) + 1) / divisor)
  }
  return parseInt(str2, 2) / divisor
}

function bigEndianTransform(data) {
  var dataArray = []
  for (var i = 0; i < data.length; i += 2) {
    dataArray.push(data.substring(i, i + 2))
  }
  return dataArray
}

function toBinary(arr) {
  return arr.map(function (item) {
    var bits = parseInt(item, 16).toString(2)
    while (bits.length < 8) {
      bits = '0' + bits
    }
    return bits
  }).join('')
}

function loraWANV2BitDataFormat(str) {
  var str2 = toBinary(bigEndianTransform(str))
  return {
    channel: parseInt(str2.substring(0, 4), 2),
    status: parseInt(str2.substring(4, 5), 2),
    type: parseInt(str2.substring(5), 2)
  }
}

function bytes2HexString(arrBytes) {
  var str = ''
  for (var i = 0; i < arrBytes.length; i++) {
    var num = arrBytes[i]
    var tmp = (num < 0 ? 255 + num + 1 : num).toString(16)
    str += tmp.length === 1 ? '0' + tmp : tmp
  }
  return str
}

if (typeof module !== 'undefined') {
  module.exports = { decodeUplink: decodeUplink }
}
