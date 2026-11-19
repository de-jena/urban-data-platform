#!/bin/sh
# Composes the Model Atlas seed of scope udp from the repository seeds into
# generated/modelatlas/load, and resets the local Atlas storage (generated/modelatlas/data),
# so a changed ecore is seeded again instead of kept.
set -eu
here="$(cd "$(dirname "$0")" && pwd)"
repo="$(cd "$here/../.." && pwd)"
target="$here/../generated/modelatlas"
rm -rf "$target"
mkdir -p "$target/load/scopes/udp/sensinactmapping" "$target/data"
cp "$repo"/de.jena.chirpstack.model/eventatlas/seed/*.ecore "$target/load/scopes/udp/"
cp "$repo"/de.jena.chirpstack.model/eventatlas/seed/sensinactmapping/*.xmi "$target/load/scopes/udp/sensinactmapping/"
cp "$repo"/de.jena.udp.atlas.dwd/eventatlas/seed/sensinactmapping/*.xmi "$target/load/scopes/udp/sensinactmapping/"
echo "seed: $(ls "$target/load/scopes/udp/sensinactmapping" | wc -l) mappings in $target/load"
