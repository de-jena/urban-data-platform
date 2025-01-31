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
    EDataType,
    EFactory,
    EList,
    EModelElementExt,
    ENotificationChain,
    EObject,
    EPackage,
    EcoreConstants,
    EventType,
    Notification,
    getEcorePackage,
    isEObjectInternal
} from "./internal.js"

export class EFactoryImpl extends EModelElementExt implements EFactory {
    constructor() {
        super()
    }

    eStaticClass(): EClass {
        return getEcorePackage().getEFactory()
    }

    // get the value of ePackage
    get ePackage(): EPackage {
        if (this.eContainerFeatureID() == EcoreConstants.EFACTORY__EPACKAGE) {
            return this.eContainer() as EPackage
        }
        return null
    }

    // set the value of ePackage
    set ePackage(newEPackage: EPackage) {
        if (
            newEPackage != this.eInternalContainer() ||
            (newEPackage != null && this.eContainerFeatureID() != EcoreConstants.EFACTORY__EPACKAGE)
        ) {
            let notifications: ENotificationChain = null
            if (this.eInternalContainer() != null) {
                notifications = this.eBasicRemoveFromContainer(notifications)
            }
            if (isEObjectInternal(newEPackage)) {
                notifications = newEPackage.eInverseAdd(this, EcoreConstants.EPACKAGE__EFACTORY_INSTANCE, notifications)
            }
            notifications = this.basicSetEPackage(newEPackage, notifications)
            if (notifications != null) {
                notifications.dispatch()
            }
        } else if (this.eNotificationRequired) {
            this.eNotify(
                new Notification(this, EventType.SET, EcoreConstants.EFACTORY__EPACKAGE, newEPackage, newEPackage)
            )
        }
    }

    basicSetEPackage(newEPackage: EPackage, msgs: ENotificationChain): ENotificationChain {
        return this.eBasicSetContainer(newEPackage, EcoreConstants.EFACTORY__EPACKAGE, msgs)
    }

    // convertToString default implementation
    convertToString(eDataType: EDataType, instanceValue: any): string {
        throw new Error("convertToString not implemented")
    }

    // create default implementation
    create(eClass: EClass): EObject {
        throw new Error("create not implemented")
    }

    // createFromString default implementation
    createFromString(eDataType: EDataType, literalValue: string): any {
        throw new Error("createFromString not implemented")
    }

    eGetFromID(featureID: number, resolve: boolean): any {
        switch (featureID) {
            case EcoreConstants.EFACTORY__EPACKAGE: {
                return this.ePackage
            }
            default: {
                return super.eGetFromID(featureID, resolve)
            }
        }
    }

    eSetFromID(featureID: number, newValue: any) {
        switch (featureID) {
            case EcoreConstants.EFACTORY__EPACKAGE: {
                this.ePackage = newValue as EPackage
                break
            }
            default: {
                super.eSetFromID(featureID, newValue)
            }
        }
    }

    eUnsetFromID(featureID: number) {
        switch (featureID) {
            case EcoreConstants.EFACTORY__EPACKAGE: {
                this.ePackage = null
                break
            }
            default: {
                super.eUnsetFromID(featureID)
            }
        }
    }

    eIsSetFromID(featureID: number): boolean {
        switch (featureID) {
            case EcoreConstants.EFACTORY__EPACKAGE: {
                return this.ePackage != null
            }
            default: {
                return super.eIsSetFromID(featureID)
            }
        }
    }

    eInvokeFromID(operationID: number, args: EList<any>): any {
        switch (operationID) {
            case EcoreConstants.EFACTORY__CONVERT_TO_STRING_EDATATYPE_EJAVAOBJECT: {
                return this.convertToString(args.get(0) as EDataType, args.get(1))
            }
            case EcoreConstants.EFACTORY__CREATE_ECLASS: {
                return this.create(args.get(0) as EClass)
            }
            case EcoreConstants.EFACTORY__CREATE_FROM_STRING_EDATATYPE_ESTRING: {
                return this.createFromString(args.get(0) as EDataType, args.get(1) as string)
            }
            default: {
                return super.eInvokeFromID(operationID, args)
            }
        }
    }

    eBasicInverseAdd(otherEnd: EObject, featureID: number, notifications: ENotificationChain): ENotificationChain {
        switch (featureID) {
            case EcoreConstants.EFACTORY__EPACKAGE: {
                let msgs = notifications
                if (this.eContainer() != null) {
                    msgs = this.eBasicRemoveFromContainer(msgs)
                }
                return this.basicSetEPackage(otherEnd as EPackage, msgs)
            }
            default: {
                return super.eBasicInverseAdd(otherEnd, featureID, notifications)
            }
        }
    }

    eBasicInverseRemove(otherEnd: EObject, featureID: number, notifications: ENotificationChain): ENotificationChain {
        switch (featureID) {
            case EcoreConstants.EFACTORY__EPACKAGE: {
                return this.basicSetEPackage(null, notifications)
            }
            default: {
                return super.eBasicInverseRemove(otherEnd, featureID, notifications)
            }
        }
    }
}
