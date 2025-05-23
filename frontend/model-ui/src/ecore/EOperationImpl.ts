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
    BasicEObjectList,
    EClass,
    EClassifier,
    EList,
    ENotificationChain,
    ENotifyingList,
    EObject,
    EOperation,
    EParameter,
    ETypedElementExt,
    EcoreConstants,
    EventType,
    Notification,
    getEcorePackage,
    isEObjectList
} from "./internal.js"

export class EOperationImpl extends ETypedElementExt implements EOperation {
    protected _eParameters: EList<EParameter>
    protected _operationID: number
    protected _eExceptions: EList<EClassifier>

    constructor() {
        super()
        this._eExceptions = null
        this._eParameters = null
        this._operationID = -1
    }

    eStaticClass(): EClass {
        return getEcorePackage().getEOperation()
    }

    // get the value of eContainingClass
    get eContainingClass(): EClass {
        if (this.eContainerFeatureID() == EcoreConstants.EOPERATION__ECONTAINING_CLASS) {
            return this.eContainer() as EClass
        }
        return null
    }

    // get the value of eExceptions
    get eExceptions(): EList<EClassifier> {
        if (this._eExceptions == null) {
            this._eExceptions = this.initEExceptions()
        }
        return this._eExceptions
    }

    // unSetEExceptions unset the value of _eExceptions
    unSetEExceptions(): void {
        if (this._eExceptions != null) {
            this._eExceptions.clear()
        }
    }

    // get the value of eParameters
    get eParameters(): EList<EParameter> {
        if (this._eParameters == null) {
            this._eParameters = this.initEParameters()
        }
        return this._eParameters
    }

    // get the value of operationID
    get operationID(): number {
        return this._operationID
    }

    // set the value of operationID
    set operationID(newOperationID: number) {
        let oldOperationID = this._operationID
        this._operationID = newOperationID
        if (this.eNotificationRequired) {
            this.eNotify(
                new Notification(
                    this,
                    EventType.SET,
                    EcoreConstants.EOPERATION__OPERATION_ID,
                    oldOperationID,
                    newOperationID
                )
            )
        }
    }

    // isOverrideOf default implementation
    isOverrideOf(someOperation: EOperation): boolean {
        throw new Error("isOverrideOf not implemented")
    }

    protected initEExceptions(): EList<EClassifier> {
        return new BasicEObjectList<EClassifier>(
            this,
            EcoreConstants.EOPERATION__EEXCEPTIONS,
            -1,
            false,
            false,
            false,
            true,
            true
        )
    }
    protected initEParameters(): EList<EParameter> {
        return new BasicEObjectList<EParameter>(
            this,
            EcoreConstants.EOPERATION__EPARAMETERS,
            EcoreConstants.EPARAMETER__EOPERATION,
            true,
            true,
            true,
            false,
            false
        )
    }

    eGetFromID(featureID: number, resolve: boolean): any {
        switch (featureID) {
            case EcoreConstants.EOPERATION__ECONTAINING_CLASS: {
                return this.eContainingClass
            }
            case EcoreConstants.EOPERATION__EEXCEPTIONS: {
                return !resolve && isEObjectList(this.eExceptions)
                    ? this.eExceptions.getUnResolvedList()
                    : this.eExceptions
            }
            case EcoreConstants.EOPERATION__EPARAMETERS: {
                return this.eParameters
            }
            case EcoreConstants.EOPERATION__OPERATION_ID: {
                return this.operationID
            }
            default: {
                return super.eGetFromID(featureID, resolve)
            }
        }
    }

    eSetFromID(featureID: number, newValue: any) {
        switch (featureID) {
            case EcoreConstants.EOPERATION__EEXCEPTIONS: {
                this.eExceptions.clear()
                this.eExceptions.addAll(newValue as EList<EClassifier>)
                break
            }
            case EcoreConstants.EOPERATION__EPARAMETERS: {
                this.eParameters.clear()
                this.eParameters.addAll(newValue as EList<EParameter>)
                break
            }
            case EcoreConstants.EOPERATION__OPERATION_ID: {
                this.operationID = newValue as number
                break
            }
            default: {
                super.eSetFromID(featureID, newValue)
            }
        }
    }

    eUnsetFromID(featureID: number) {
        switch (featureID) {
            case EcoreConstants.EOPERATION__EEXCEPTIONS: {
                this.unSetEExceptions()
                break
            }
            case EcoreConstants.EOPERATION__EPARAMETERS: {
                this.eParameters.clear()
                break
            }
            case EcoreConstants.EOPERATION__OPERATION_ID: {
                this.operationID = -1
                break
            }
            default: {
                super.eUnsetFromID(featureID)
            }
        }
    }

    eIsSetFromID(featureID: number): boolean {
        switch (featureID) {
            case EcoreConstants.EOPERATION__ECONTAINING_CLASS: {
                return this.eContainingClass != null
            }
            case EcoreConstants.EOPERATION__EEXCEPTIONS: {
                return this.eExceptions != null && this.eExceptions.size() != 0
            }
            case EcoreConstants.EOPERATION__EPARAMETERS: {
                return this.eParameters != null && this.eParameters.size() != 0
            }
            case EcoreConstants.EOPERATION__OPERATION_ID: {
                return this._operationID != -1
            }
            default: {
                return super.eIsSetFromID(featureID)
            }
        }
    }

    eInvokeFromID(operationID: number, args: EList<any>): any {
        switch (operationID) {
            case EcoreConstants.EOPERATION__IS_OVERRIDE_OF_EOPERATION: {
                return this.isOverrideOf(args.get(0) as EOperation)
            }
            default: {
                return super.eInvokeFromID(operationID, args)
            }
        }
    }

    eBasicInverseAdd(otherEnd: EObject, featureID: number, notifications: ENotificationChain): ENotificationChain {
        switch (featureID) {
            case EcoreConstants.EOPERATION__ECONTAINING_CLASS: {
                let msgs = notifications
                if (this.eContainer() != null) {
                    msgs = this.eBasicRemoveFromContainer(msgs)
                }
                return this.eBasicSetContainer(otherEnd, EcoreConstants.EOPERATION__ECONTAINING_CLASS, msgs)
            }
            case EcoreConstants.EOPERATION__EPARAMETERS: {
                let list = this.eParameters as ENotifyingList<EParameter>
                let end = otherEnd as EParameter
                return list.addWithNotification(end, notifications)
            }
            default: {
                return super.eBasicInverseAdd(otherEnd, featureID, notifications)
            }
        }
    }

    eBasicInverseRemove(otherEnd: EObject, featureID: number, notifications: ENotificationChain): ENotificationChain {
        switch (featureID) {
            case EcoreConstants.EOPERATION__ECONTAINING_CLASS: {
                return this.eBasicSetContainer(null, EcoreConstants.EOPERATION__ECONTAINING_CLASS, notifications)
            }
            case EcoreConstants.EOPERATION__EPARAMETERS: {
                let list = this.eParameters as ENotifyingList<EParameter>
                let end = otherEnd as EParameter
                return list.removeWithNotification(end, notifications)
            }
            default: {
                return super.eBasicInverseRemove(otherEnd, featureID, notifications)
            }
        }
    }
}
