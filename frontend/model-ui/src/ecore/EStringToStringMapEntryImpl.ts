// Code generated by soft.generator.ts. DO NOT EDIT.

// *****************************************************************************
// Copyright(c) 2024 MASA Group
//
// This Source Code Form is subject to the terms of the Mozilla Public
// License, v. 2.0. If a copy of the MPL was not distributed with this
// file, You can obtain one at https://mozilla.org/MPL/2.0/.
//
// *****************************************************************************

import {
    EClass,
    EObjectImpl,
    EStringToStringMapEntry,
    EcoreConstants,
    EventType,
    Notification,
    getEcorePackage
} from "./internal.js"

export class EStringToStringMapEntryImpl extends EObjectImpl implements EStringToStringMapEntry {
    protected _key: string
    protected _value: string

    constructor() {
        super()
        this._key = ""
        this._value = ""
    }

    eStaticClass(): EClass {
        return getEcorePackage().getEStringToStringMapEntry()
    }

    // get the value of key
    get key(): string {
        return this._key
    }

    // set the value of key
    set key(newKey: string) {
        let oldKey = this._key
        this._key = newKey
        if (this.eNotificationRequired) {
            this.eNotify(
                new Notification(this, EventType.SET, EcoreConstants.ESTRING_TO_STRING_MAP_ENTRY__KEY, oldKey, newKey)
            )
        }
    }

    // get the value of value
    get value(): string {
        return this._value
    }

    // set the value of value
    set value(newValue: string) {
        let oldValue = this._value
        this._value = newValue
        if (this.eNotificationRequired) {
            this.eNotify(
                new Notification(
                    this,
                    EventType.SET,
                    EcoreConstants.ESTRING_TO_STRING_MAP_ENTRY__VALUE,
                    oldValue,
                    newValue
                )
            )
        }
    }

    eGetFromID(featureID: number, resolve: boolean): any {
        switch (featureID) {
            case EcoreConstants.ESTRING_TO_STRING_MAP_ENTRY__KEY: {
                return this.key
            }
            case EcoreConstants.ESTRING_TO_STRING_MAP_ENTRY__VALUE: {
                return this.value
            }
            default: {
                return super.eGetFromID(featureID, resolve)
            }
        }
    }

    eSetFromID(featureID: number, newValue: any) {
        switch (featureID) {
            case EcoreConstants.ESTRING_TO_STRING_MAP_ENTRY__KEY: {
                this.key = newValue as string
                break
            }
            case EcoreConstants.ESTRING_TO_STRING_MAP_ENTRY__VALUE: {
                this.value = newValue as string
                break
            }
            default: {
                super.eSetFromID(featureID, newValue)
            }
        }
    }

    eUnsetFromID(featureID: number) {
        switch (featureID) {
            case EcoreConstants.ESTRING_TO_STRING_MAP_ENTRY__KEY: {
                this.key = ""
                break
            }
            case EcoreConstants.ESTRING_TO_STRING_MAP_ENTRY__VALUE: {
                this.value = ""
                break
            }
            default: {
                super.eUnsetFromID(featureID)
            }
        }
    }

    eIsSetFromID(featureID: number): boolean {
        switch (featureID) {
            case EcoreConstants.ESTRING_TO_STRING_MAP_ENTRY__KEY: {
                return this._key != ""
            }
            case EcoreConstants.ESTRING_TO_STRING_MAP_ENTRY__VALUE: {
                return this._value != ""
            }
            default: {
                return super.eIsSetFromID(featureID)
            }
        }
    }
}