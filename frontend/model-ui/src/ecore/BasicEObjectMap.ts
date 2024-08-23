// *****************************************************************************
// Copyright(c) 2021 MASA Group
//
// This Source Code Form is subject to the terms of the Mozilla Public
// License, v. 2.0. If a copy of the MPL was not distributed with this
// file, You can obtain one at https://mozilla.org/MPL/2.0/.
//
// *****************************************************************************

import { BasicEMap, EClass, EMapEntry } from "./internal.js"

export class BasicEObjectMap<K, V> extends BasicEMap<K, V> {
    private _entryClass: EClass

    constructor(entryClass: EClass) {
        super()
        this._entryClass = entryClass
    }

    protected newEntry(key: K, value: V): EMapEntry<K, V> {
        let eFactory = this._entryClass.ePackage.eFactoryInstance
        let eEntry = eFactory.create(this._entryClass) as any as EMapEntry<K, V>
        eEntry.key = key
        eEntry.value = value
        return eEntry
    }
}
