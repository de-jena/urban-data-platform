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
    EEnum,
    EEnumLiteral,
    ENamedElementImpl,
    ENotificationChain,
    EObject,
    EcoreConstants,
    EventType,
    Notification,
    getEcorePackage
} from "./internal.js"

export class EEnumLiteralImpl extends ENamedElementImpl implements EEnumLiteral {
    protected _value: number
    protected _instance: any
    protected _literal: string

    constructor() {
        super()
        this._instance = null
        this._literal = ""
        this._value = 0
    }

    eStaticClass(): EClass {
        return getEcorePackage().getEEnumLiteral()
    }

    // get the value of eEnum
    get eEnum(): EEnum {
        if (this.eContainerFeatureID() == EcoreConstants.EENUM_LITERAL__EENUM) {
            return this.eContainer() as EEnum
        }
        return null
    }

    // get the value of instance
    get instance(): any {
        return this._instance
    }

    // set the value of instance
    set instance(newInstance: any) {
        let oldInstance = this._instance
        this._instance = newInstance
        if (this.eNotificationRequired) {
            this.eNotify(
                new Notification(this, EventType.SET, EcoreConstants.EENUM_LITERAL__INSTANCE, oldInstance, newInstance)
            )
        }
    }

    // get the value of literal
    get literal(): string {
        return this._literal
    }

    // set the value of literal
    set literal(newLiteral: string) {
        let oldLiteral = this._literal
        this._literal = newLiteral
        if (this.eNotificationRequired) {
            this.eNotify(
                new Notification(this, EventType.SET, EcoreConstants.EENUM_LITERAL__LITERAL, oldLiteral, newLiteral)
            )
        }
    }

    // get the value of value
    get value(): number {
        return this._value
    }

    // set the value of value
    set value(newValue: number) {
        let oldValue = this._value
        this._value = newValue
        if (this.eNotificationRequired) {
            this.eNotify(new Notification(this, EventType.SET, EcoreConstants.EENUM_LITERAL__VALUE, oldValue, newValue))
        }
    }

    eGetFromID(featureID: number, resolve: boolean): any {
        switch (featureID) {
            case EcoreConstants.EENUM_LITERAL__EENUM: {
                return this.eEnum
            }
            case EcoreConstants.EENUM_LITERAL__INSTANCE: {
                return this.instance
            }
            case EcoreConstants.EENUM_LITERAL__LITERAL: {
                return this.literal
            }
            case EcoreConstants.EENUM_LITERAL__VALUE: {
                return this.value
            }
            default: {
                return super.eGetFromID(featureID, resolve)
            }
        }
    }

    eSetFromID(featureID: number, newValue: any) {
        switch (featureID) {
            case EcoreConstants.EENUM_LITERAL__INSTANCE: {
                this.instance = newValue as any
                break
            }
            case EcoreConstants.EENUM_LITERAL__LITERAL: {
                this.literal = newValue as string
                break
            }
            case EcoreConstants.EENUM_LITERAL__VALUE: {
                this.value = newValue as number
                break
            }
            default: {
                super.eSetFromID(featureID, newValue)
            }
        }
    }

    eUnsetFromID(featureID: number) {
        switch (featureID) {
            case EcoreConstants.EENUM_LITERAL__INSTANCE: {
                this.instance = null
                break
            }
            case EcoreConstants.EENUM_LITERAL__LITERAL: {
                this.literal = ""
                break
            }
            case EcoreConstants.EENUM_LITERAL__VALUE: {
                this.value = 0
                break
            }
            default: {
                super.eUnsetFromID(featureID)
            }
        }
    }

    eIsSetFromID(featureID: number): boolean {
        switch (featureID) {
            case EcoreConstants.EENUM_LITERAL__EENUM: {
                return this.eEnum != null
            }
            case EcoreConstants.EENUM_LITERAL__INSTANCE: {
                return this.instance != null
            }
            case EcoreConstants.EENUM_LITERAL__LITERAL: {
                return this._literal != ""
            }
            case EcoreConstants.EENUM_LITERAL__VALUE: {
                return this._value != 0
            }
            default: {
                return super.eIsSetFromID(featureID)
            }
        }
    }

    eBasicInverseAdd(otherEnd: EObject, featureID: number, notifications: ENotificationChain): ENotificationChain {
        switch (featureID) {
            case EcoreConstants.EENUM_LITERAL__EENUM: {
                let msgs = notifications
                if (this.eContainer() != null) {
                    msgs = this.eBasicRemoveFromContainer(msgs)
                }
                return this.eBasicSetContainer(otherEnd, EcoreConstants.EENUM_LITERAL__EENUM, msgs)
            }
            default: {
                return super.eBasicInverseAdd(otherEnd, featureID, notifications)
            }
        }
    }

    eBasicInverseRemove(otherEnd: EObject, featureID: number, notifications: ENotificationChain): ENotificationChain {
        switch (featureID) {
            case EcoreConstants.EENUM_LITERAL__EENUM: {
                return this.eBasicSetContainer(null, EcoreConstants.EENUM_LITERAL__EENUM, notifications)
            }
            default: {
                return super.eBasicInverseRemove(otherEnd, featureID, notifications)
            }
        }
    }
}
