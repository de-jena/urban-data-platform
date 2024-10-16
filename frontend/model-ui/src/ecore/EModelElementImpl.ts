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
    EAnnotation,
    EClass,
    EList,
    EModelElement,
    ENotificationChain,
    ENotifyingList,
    EObject,
    EObjectImpl,
    EcoreConstants,
    getEcorePackage
} from "./internal.js"

export class EModelElementImpl extends EObjectImpl implements EModelElement {
    protected _eAnnotations: EList<EAnnotation>

    constructor() {
        super()
        this._eAnnotations = null
    }

    eStaticClass(): EClass {
        return getEcorePackage().getEModelElement()
    }

    // get the value of eAnnotations
    get eAnnotations(): EList<EAnnotation> {
        if (this._eAnnotations == null) {
            this._eAnnotations = this.initEAnnotations()
        }
        return this._eAnnotations
    }

    // getEAnnotation default implementation
    getEAnnotation(source: string): EAnnotation {
        throw new Error("getEAnnotation not implemented")
    }

    protected initEAnnotations(): EList<EAnnotation> {
        return new BasicEObjectList<EAnnotation>(
            this,
            EcoreConstants.EMODEL_ELEMENT__EANNOTATIONS,
            EcoreConstants.EANNOTATION__EMODEL_ELEMENT,
            true,
            true,
            true,
            false,
            false
        )
    }

    eGetFromID(featureID: number, resolve: boolean): any {
        switch (featureID) {
            case EcoreConstants.EMODEL_ELEMENT__EANNOTATIONS: {
                return this.eAnnotations
            }
            default: {
                return super.eGetFromID(featureID, resolve)
            }
        }
    }

    eSetFromID(featureID: number, newValue: any) {
        switch (featureID) {
            case EcoreConstants.EMODEL_ELEMENT__EANNOTATIONS: {
                this.eAnnotations.clear()
                this.eAnnotations.addAll(newValue as EList<EAnnotation>)
                break
            }
            default: {
                super.eSetFromID(featureID, newValue)
            }
        }
    }

    eUnsetFromID(featureID: number) {
        switch (featureID) {
            case EcoreConstants.EMODEL_ELEMENT__EANNOTATIONS: {
                this.eAnnotations.clear()
                break
            }
            default: {
                super.eUnsetFromID(featureID)
            }
        }
    }

    eIsSetFromID(featureID: number): boolean {
        switch (featureID) {
            case EcoreConstants.EMODEL_ELEMENT__EANNOTATIONS: {
                return this.eAnnotations != null && this.eAnnotations.size() != 0
            }
            default: {
                return super.eIsSetFromID(featureID)
            }
        }
    }

    eInvokeFromID(operationID: number, args: EList<any>): any {
        switch (operationID) {
            case EcoreConstants.EMODEL_ELEMENT__GET_EANNOTATION_ESTRING: {
                return this.getEAnnotation(args.get(0) as string)
            }
            default: {
                return super.eInvokeFromID(operationID, args)
            }
        }
    }

    eBasicInverseAdd(otherEnd: EObject, featureID: number, notifications: ENotificationChain): ENotificationChain {
        switch (featureID) {
            case EcoreConstants.EMODEL_ELEMENT__EANNOTATIONS: {
                let list = this.eAnnotations as ENotifyingList<EAnnotation>
                let end = otherEnd as EAnnotation
                return list.addWithNotification(end, notifications)
            }
            default: {
                return super.eBasicInverseAdd(otherEnd, featureID, notifications)
            }
        }
    }

    eBasicInverseRemove(otherEnd: EObject, featureID: number, notifications: ENotificationChain): ENotificationChain {
        switch (featureID) {
            case EcoreConstants.EMODEL_ELEMENT__EANNOTATIONS: {
                let list = this.eAnnotations as ENotifyingList<EAnnotation>
                let end = otherEnd as EAnnotation
                return list.removeWithNotification(end, notifications)
            }
            default: {
                return super.eBasicInverseRemove(otherEnd, featureID, notifications)
            }
        }
    }
}
