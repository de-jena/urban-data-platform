#!/usr/bin/env python3
"""Generate the Event Atlas ChirpStack uplink model + ProviderMappings from chirpstack.ecore
(profileId + mapping/path annotations) into seed/, which Model Atlas seeds into scope `udp`.
A service reference annotated with mapping/collection + mapping/filter reads one entry of a
JSON object (EMF map) selected by key; its attribute paths are relative to that entry.
A numeric path segment is a list element; element 0 is read in place. A profile that reads
another element (Atmos-22 sensors/1) or SenseCAP measurements (mapping/measurementId) is
"flat": de.jena.udp.atlas.chirpstack reshapes its payload first - sensors/1 becomes the member
sensors_1, the messages become measurements/m<id> - and marks it with the discriminator
<profileId>-flat, so the mapping reads plain paths.
Uplink attributes get the wrapper data types, so a field absent from a payload stays null
instead of becoming 0/false and overwriting the resource.
  ./gen-chirpstack-mappings.py [<chirpstack.ecore>] [<out dir>]
"""
import sys, re, pathlib
import xml.etree.ElementTree as ET
from xml.sax.saxutils import quoteattr

HERE = pathlib.Path(__file__).resolve().parent
SRC = sys.argv[1] if len(sys.argv) > 1 else HERE.parent / "model" / "chirpstack.ecore"
OUT = pathlib.Path(sys.argv[2]) if len(sys.argv) > 2 else HERE / "seed"
NS = "https://model.data.jena.de/chirpstack/uplink/1.0"
TYPEMAP = "jena-sensors"
XSI = "{http://www.w3.org/2001/XMLSchema-instance}type"
ECORE = "http://www.eclipse.org/emf/2002/Ecore#//"
FLAT = "-flat"   # discriminator suffix of a flattened payload (see UplinkFlattener)
WRAPPER = {"EDouble": "EDoubleObject", "EFloat": "EFloatObject", "EBoolean": "EBooleanObject",
           "EInt": "EIntegerObject", "ELong": "ELongObject", "EShort": "EShortObject"}
DEVICE_INFO = ["tenantId", "tenantName", "applicationId", "applicationName",
               "deviceProfileId", "deviceProfileName", "deviceName", "devEui"]

root = ET.parse(SRC).getroot()
classes = {c.get("name"): c for c in root.findall("eClassifiers")}

def ann(e, src):
    for a in e.findall("eAnnotations"):
        if a.get("source") == src:
            return {d.get("key"): d.get("value") for d in a.findall("details")}
    return {}

def etype(f):
    return (f.get("eType") or "").split("#//")[-1] or "EDouble"

# --- collect per provider: services -> resources -> json path -------------------------
providers = []
for name, c in classes.items():
    model = ann(c, "model")
    if "profileId" not in model:
        continue
    services = []
    for ref in c.findall("eStructuralFeatures"):
        svc = classes[ref.get("eType").split("#//")[-1]]
        res = []
        for f in svc.findall("eStructuralFeatures"):
            mapping = ann(f, "mapping")
            res.append((f.get("name"), etype(f), mapping["path"].split("/"), mapping.get("measurementId")))
        # a service annotated with collection + filter reads one entry of a JSON object
        # (EMF map): its resources are the entry value's attributes, paths relative to it
        svc_ann = ann(ref, "mapping")
        services.append((ref.get("name"), res, svc_ann.get("collection"), svc_ann.get("filter")))
    providers.append((name, model["name"], model["profileId"], services))

# --- domain model: tree of classes per profile shaped like the JSON ---------------------
def cls_name(*parts):
    return "".join(p[:1].upper() + p[1:] for p in re.split(r"[^A-Za-z0-9]", "_".join(parts)) if p)

eclasses = {}   # name -> {feature: ("attr", type) | ("ref", class, many) | ("map", entry class)}
map_entries = set()   # EClasses with instanceClassName java.util.Map$Entry
def ensure(cn):
    return eclasses.setdefault(cn, {})

def add_map_path(owner, path, prefix):
    """path below `object` ending in a JSON object keyed by member name. Returns the hrefs
    down to the entry's `value` and the value class."""
    hrefs, cn = [], owner
    for seg in path[:-1]:
        child = cls_name(prefix, seg)
        ensure(cn)[seg] = ("ref", child, False)
        hrefs.append(("EReference", cn, seg))
        cn = child
    seg = path[-1]
    value, entry = cls_name(prefix, seg), cls_name(prefix, seg, "Entry")
    ensure(cn)[seg] = ("map", entry)
    ensure(entry).update({"key": ("attr", "EString"), "value": ("ref", value, False)})
    ensure(value)
    map_entries.add(entry)
    hrefs += [("EReference", cn, seg), ("EReference", entry, "value")]
    return hrefs, value

def needs_flattening(services):
    """a list element other than 0 or a SenseCAP measurement: the payload is reshaped first."""
    for _, res, coll, _ in services:
        for _, _, path, measurement in res:
            if measurement or (not coll and any(seg.isdigit() and int(seg) for seg in path)):
                return True
    return False

def flat_path(path):
    """sensors/1/x -> sensors_1/x: the flattener turns element i of a list into member <list>_i."""
    out = []
    for seg in path:
        if seg.isdigit() and out:
            out[-1] = f"{out[-1]}_{seg}"
        else:
            out.append(seg)
    return out

def add_path(owner, path, typ, prefix):
    """path below `object`; a numeric segment is a list element (0, in place). Returns the
    feature hrefs."""
    hrefs, cn, i = [], owner, 0
    while i < len(path):
        seg = path[i]
        last = i == len(path) - 1
        if last:
            ensure(cn)[seg] = ("attr", typ)
            hrefs.append(("EAttribute", cn, seg))
            break
        many = i + 1 < len(path) and path[i + 1].isdigit()
        if many and int(path[i + 1]):
            raise ValueError(f"{'/'.join(path)}: only element 0 can be read in place, flatten the profile")
        child = cls_name(prefix, seg)
        ensure(cn)[seg] = ("ref", child, many)
        hrefs.append(("EReference", cn, seg))
        cn = child
        i += 2 if many else 1
    return hrefs

mappings = []
for name, model, profile, services in providers:
    up, obj = cls_name(name, "Uplink"), cls_name(name, "Object")
    ensure(up)["object"] = ("ref", obj, False)
    ensure(obj)
    svc_out = []
    flat = needs_flattening(services)
    for sname, res, coll, filt in services:
        if coll:
            hrefs, value = add_map_path(obj, coll.split("/")[1:], name)
            for rname, typ, path, _ in res:
                add_path(value, path, typ, name)
            svc_out.append((sname, None, filt, [("EReference", up, "object")] + hrefs))
            continue
        r_out = []
        for rname, typ, path, measurement in res:
            if measurement:
                path = ["object", "measurements", f"m{measurement}"]
            elif flat:
                path = flat_path(path)
            if path[0] == "deviceInfo":
                hrefs = [("EReference", "Uplink", "deviceInfo"), ("EAttribute", "DeviceInfo", path[1])]
            else:
                hrefs = [("EReference", up, "object")] + add_path(obj, path[1:], typ, name)
            r_out.append((rname, typ, hrefs))
        svc_out.append((sname, r_out, None, None))
    mappings.append((name, model, profile + (FLAT if flat else ""), up, svc_out))

def f_xml(fname, spec):
    if spec[0] == "attr":
        typ = WRAPPER.get(spec[1], spec[1])
        return f'    <eStructuralFeatures xsi:type="ecore:EAttribute" name="{fname}" eType="ecore:EDataType {ECORE}{typ}"/>'
    many = ' upperBound="-1"' if spec[0] == "map" or spec[2] else ""
    return f'    <eStructuralFeatures xsi:type="ecore:EReference" name="{fname}"{many} eType="#//{spec[1]}" containment="true"/>'

lines = ['<?xml version="1.0" encoding="UTF-8"?>',
         '<!-- GENERATED from urban-data-platform chirpstack.ecore. ChirpStack v4 uplink JSON;',
         '     the JSON codec types a payload by deviceInfo.deviceProfileId. -->',
         '<ecore:EPackage xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI"',
         '    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore"',
         f'    name="chirpstackuplink" nsURI="{NS}" nsPrefix="chirpstackuplink">',
         '  <eClassifiers xsi:type="ecore:EClass" name="DeviceInfo">']
lines += [f_xml(a, ("attr", "EString")) for a in DEVICE_INFO]
lines += ['  </eClassifiers>',
          '  <eClassifiers xsi:type="ecore:EClass" name="Uplink" abstract="true">',
          f_xml("deduplicationId", ("attr", "EString")),
          f_xml("time", ("attr", "EString")),
          f_xml("deviceInfo", ("ref", "DeviceInfo", False)),
          '  </eClassifiers>']
for name, model, profile, up, _ in mappings:
    lines += [f'  <eClassifiers xsi:type="ecore:EClass" name="{up}" eSuperTypes="#//Uplink">',
              f'    <eAnnotations source="http://eclipse.org/fennec/codec/typeMapping/{TYPEMAP}">',
              f'      <details key="typeDiscriminator" value="{profile}"/>',
              '      <details key="typeDiscriminatorPath" value="deviceInfo.deviceProfileId"/>',
              '      <details key="fallbackStrategy" value="SKIP"/>',
              '    </eAnnotations>']
    lines += [f_xml(f, s) for f, s in eclasses.pop(up).items()]
    lines.append('  </eClassifiers>')
for cn, feats in eclasses.items():
    entry = ' instanceClassName="java.util.Map$Entry"' if cn in map_entries else ""
    lines.append(f'  <eClassifiers xsi:type="ecore:EClass" name="{cn}"{entry}>')
    lines += [f_xml(f, s) for f, s in feats.items()]
    lines.append('  </eClassifiers>')
lines.append('</ecore:EPackage>')
OUT.mkdir(parents=True, exist_ok=True)
(OUT / "chirpstack-uplink.ecore").write_text("\n".join(lines) + "\n")

# --- one ProviderMapping per profile ------------------------------------------------------
mdir = OUT / "sensinactmapping"
mdir.mkdir(exist_ok=True)
for name, model, profile, up, services in mappings:
    x = ['<?xml version="1.0" encoding="UTF-8"?>',
         f'<!-- GENERATED: ChirpStack profile {profile} -> sensiNact model {model} (provider = devEui) -->',
         '<sensinactMapping:ProviderMapping xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI"',
         '    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore"',
         '    xmlns:sensinactMapping="https://fennec.eclipse.org/event.atlas/mapping/1.0"',
         f'    mid={quoteattr(model)} providerTimestamp="true">',
         '  <name>',
         f'    <featurePath xsi:type="ecore:EReference" href="{NS}#//Uplink/deviceInfo"/>',
         f'    <featurePath xsi:type="ecore:EAttribute" href="{NS}#//DeviceInfo/devEui"/>',
         '  </name>',
         '  <timestamp strategy="NOW"/>',
         f'  <providerClasses href="{NS}#//{up}"/>',
         # friendlyName = the ChirpStack device name -> the SensorThings Thing's `name`; the
         # provider id (@iot.id) stays the devEui from <name> above
         '  <admin xsi:type="sensinactMapping:AdminMapping" mid="admin">',
         '    <timestamp strategy="NOW"/>',
         '    <name name="Admin"/>',
         f'    <friendlyNameFeature xsi:type="ecore:EReference" href="{NS}#//Uplink/deviceInfo"/>',
         f'    <friendlyNameFeature xsi:type="ecore:EAttribute" href="{NS}#//DeviceInfo/deviceName"/>',
         '  </admin>']
    for sname, res, filt, hrefs in services:
        x += [f'  <services mid="{sname}">', '    <timestamp strategy="NOW"/>', f'    <name name="{sname}"/>']
        if res is None:
            # one entry of a JSON object, selected by key; every attribute of the entry value
            # becomes a resource. No match (an uplink without that key) skips the service.
            x.append(f'    <referencedResource xsi:type="sensinactMapping:ReferenceMapping" collectionFilter={quoteattr(filt)}>')
            x += [f'      <featurePath xsi:type="ecore:{k}" href="{NS}#//{c}/{f}"/>' for k, c, f in hrefs]
            x += ['    </referencedResource>', '  </services>']
            continue
        for rname, typ, hrefs in res:
            x += [f'    <resources name="{rname}" mid="{rname}">',
                  f'      <eType xsi:type="ecore:EDataType" href="{ECORE}{typ}"/>']
            x += [f'      <valueFeature xsi:type="ecore:{k}" href="{NS}#//{c}/{f}"/>' for k, c, f in hrefs]
            x.append('    </resources>')
        x.append('  </services>')
    x.append('</sensinactMapping:ProviderMapping>')
    (mdir / f"{name}ProviderMapping.xmi").write_text("\n".join(x) + "\n")

print(f"{len(mappings)} profiles")
