#!/bin/sh
# Composes the Event Atlas seeds of the repository into one mapping directory and one profile
# directory under local/generated/eventatlas. The local bndrun points EVENTATLAS_MAPPING_DIR and
# EVENTATLAS_PROFILE_DIR at them.
#
# NOT UNDER THE PROJECT'S OWN generated/: that is bnd's output directory, and a clean build
# empties it. The seeds would be gone with no sign of it but an empty mapping registry - every
# event answered by "no provider mapping". local/generated is ignored by git all the same.
#
# THE TWO DIRECTORIES KEEP THEIR SEED NAMES, and stay siblings, because a mapping names its
# profile with a RELATIVE href - ../sensinactprofile/<x>.xmi#<id> - which EMF resolves against
# the mapping's own file. Renaming them to mappings/ and profiles/ would break every such
# reference.
#
# WHY NOT POINT THE PROVIDER AT THE SEEDS WHERE THEY LIE. It could: locations takes a list.
# But mappings and profiles go to two registries with two key features (mid, profileId), so
# each list would have to name every use case's directory separately, and every new use case
# would mean editing a configuration that docker shares.
#
# Run it before launching, and again after changing a seed - the provider loads its locations
# once, at activation.
#
# Usage: prepare-seeds.sh [bundle...]   (default: every bundle that has eventatlas/seed)
set -eu
here="$(cd "$(dirname "$0")" && pwd)"
repo="$(cd "$here/../.." && pwd)"
target="$here/generated/eventatlas"

rm -rf "$target"
mkdir -p "$target/sensinactmapping" "$target/sensinactprofile"

if [ "$#" -gt 0 ]; then
    bundles="$*"
else
    bundles="$(cd "$repo" && find . -maxdepth 3 -type d -path "*/eventatlas/seed" | sed 's|^\./||; s|/eventatlas/seed$||')"
fi

for bundle in $bundles; do
    for kind in sensinactmapping sensinactprofile; do
        from="$repo/$bundle/eventatlas/seed/$kind"
        [ -d "$from" ] || continue
        find "$from" -name '*.xmi' -exec cp {} "$target/$kind/" \;
    done
done

echo "seeds: $(ls "$target/sensinactmapping" | wc -l) mapping(s), $(ls "$target/sensinactprofile" | wc -l) profile(s) in $target"
