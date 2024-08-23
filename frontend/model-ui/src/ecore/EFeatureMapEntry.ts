// *****************************************************************************
// Copyright(c) 2021 MASA Group
//
// This Source Code Form is subject to the terms of the Mozilla Public
// License, v. 2.0. If a copy of the MPL was not distributed with this
// file, You can obtain one at https://mozilla.org/MPL/2.0/.
//
// *****************************************************************************

import { EStructuralFeature } from "./internal.js"

export interface EFeatureMapEntry {
    getEStructuralFeature(): EStructuralFeature

    getValue(): any
}
