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
    EFactory,
    EList,
    ENamedElementImpl,
    ENotificationChain,
    ENotifyingList,
    EOPPOSITE_FEATURE_BASE,
    EObject,
    EPackage,
    EcoreConstants,
    EventType,
    Notification,
    getEcorePackage,
    isEObjectInternal
} from "./internal.js"

export class EPackageImpl extends ENamedElementImpl implements EPackage {
    protected _eClassifiers: EList<EClassifier>
    protected _eFactoryInstance: EFactory
    protected _nsURI: string
    protected _eSubPackages: EList<EPackage>
    protected _nsPrefix: string

    constructor() {
        super()
        this._eClassifiers = null
        this._eFactoryInstance = null
        this._eSubPackages = null
        this._nsPrefix = ""
        this._nsURI = ""
    }

    eStaticClass(): EClass {
        return getEcorePackage().getEPackage()
    }

    // get the value of eClassifiers
    get eClassifiers(): EList<EClassifier> {
        if (this._eClassifiers == null) {
            this._eClassifiers = this.initEClassifiers()
        }
        return this._eClassifiers
    }

    // get the value of eFactoryInstance
    get eFactoryInstance(): EFactory {
        return this._eFactoryInstance
    }

    // set the value of eFactoryInstance
    set eFactoryInstance(newEFactoryInstance: EFactory) {
        let oldEFactoryInstance = this._eFactoryInstance
        if (newEFactoryInstance != oldEFactoryInstance) {
            let notifications: ENotificationChain = null
            if (isEObjectInternal(oldEFactoryInstance)) {
                notifications = oldEFactoryInstance.eInverseRemove(
                    this,
                    EcoreConstants.EFACTORY__EPACKAGE,
                    notifications
                )
            }
            if (isEObjectInternal(newEFactoryInstance)) {
                notifications = newEFactoryInstance.eInverseAdd(this, EcoreConstants.EFACTORY__EPACKAGE, notifications)
            }
            notifications = this.basicSetEFactoryInstance(newEFactoryInstance, notifications)
            if (notifications != null) {
                notifications.dispatch()
            }
        }
    }

    basicSetEFactoryInstance(newEFactoryInstance: EFactory, msgs: ENotificationChain): ENotificationChain {
        let oldEFactoryInstance = this._eFactoryInstance
        this._eFactoryInstance = newEFactoryInstance
        let notifications = msgs
        if (this.eNotificationRequired) {
            let notification = new Notification(
                this,
                EventType.SET,
                EcoreConstants.EPACKAGE__EFACTORY_INSTANCE,
                oldEFactoryInstance,
                newEFactoryInstance
            )
            if (notifications != null) {
                notifications.add(notification)
            } else {
                notifications = notification
            }
        }
        return notifications
    }

    // get the value of eSubPackages
    get eSubPackages(): EList<EPackage> {
        if (this._eSubPackages == null) {
            this._eSubPackages = this.initESubPackages()
        }
        return this._eSubPackages
    }

    // get the value of eSuperPackage
    get eSuperPackage(): EPackage {
        if (this.eContainerFeatureID() == EcoreConstants.EPACKAGE__ESUPER_PACKAGE) {
            return this.eContainer() as EPackage
        }
        return null
    }

    // get the value of nsPrefix
    get nsPrefix(): string {
        return this._nsPrefix
    }

    // set the value of nsPrefix
    set nsPrefix(newNsPrefix: string) {
        let oldNsPrefix = this._nsPrefix
        this._nsPrefix = newNsPrefix
        if (this.eNotificationRequired) {
            this.eNotify(
                new Notification(this, EventType.SET, EcoreConstants.EPACKAGE__NS_PREFIX, oldNsPrefix, newNsPrefix)
            )
        }
    }

    // get the value of nsURI
    get nsURI(): string {
        return this._nsURI
    }

    // set the value of nsURI
    set nsURI(newNsURI: string) {
        let oldNsURI = this._nsURI
        this._nsURI = newNsURI
        if (this.eNotificationRequired) {
            this.eNotify(new Notification(this, EventType.SET, EcoreConstants.EPACKAGE__NS_URI, oldNsURI, newNsURI))
        }
    }

    // getEClassifier default implementation
    getEClassifier(name: string): EClassifier {
        throw new Error("getEClassifier not implemented")
    }

    protected initEClassifiers(): EList<EClassifier> {
        return new BasicEObjectList<EClassifier>(
            this,
            EcoreConstants.EPACKAGE__ECLASSIFIERS,
            EcoreConstants.ECLASSIFIER__EPACKAGE,
            true,
            true,
            true,
            false,
            false
        )
    }
    protected initESubPackages(): EList<EPackage> {
        return new BasicEObjectList<EPackage>(
            this,
            EcoreConstants.EPACKAGE__ESUB_PACKAGES,
            EcoreConstants.EPACKAGE__ESUPER_PACKAGE,
            true,
            true,
            true,
            false,
            false
        )
    }

    eGetFromID(featureID: number, resolve: boolean): any {
        switch (featureID) {
            case EcoreConstants.EPACKAGE__ECLASSIFIERS: {
                return this.eClassifiers
            }
            case EcoreConstants.EPACKAGE__EFACTORY_INSTANCE: {
                return this.eFactoryInstance
            }
            case EcoreConstants.EPACKAGE__ESUB_PACKAGES: {
                return this.eSubPackages
            }
            case EcoreConstants.EPACKAGE__ESUPER_PACKAGE: {
                return this.eSuperPackage
            }
            case EcoreConstants.EPACKAGE__NS_PREFIX: {
                return this.nsPrefix
            }
            case EcoreConstants.EPACKAGE__NS_URI: {
                return this.nsURI
            }
            default: {
                return super.eGetFromID(featureID, resolve)
            }
        }
    }

    eSetFromID(featureID: number, newValue: any) {
        switch (featureID) {
            case EcoreConstants.EPACKAGE__ECLASSIFIERS: {
                this.eClassifiers.clear()
                this.eClassifiers.addAll(newValue as EList<EClassifier>)
                break
            }
            case EcoreConstants.EPACKAGE__EFACTORY_INSTANCE: {
                this.eFactoryInstance = newValue as EFactory
                break
            }
            case EcoreConstants.EPACKAGE__ESUB_PACKAGES: {
                this.eSubPackages.clear()
                this.eSubPackages.addAll(newValue as EList<EPackage>)
                break
            }
            case EcoreConstants.EPACKAGE__NS_PREFIX: {
                this.nsPrefix = newValue as string
                break
            }
            case EcoreConstants.EPACKAGE__NS_URI: {
                this.nsURI = newValue as string
                break
            }
            default: {
                super.eSetFromID(featureID, newValue)
            }
        }
    }

    eUnsetFromID(featureID: number) {
        switch (featureID) {
            case EcoreConstants.EPACKAGE__ECLASSIFIERS: {
                this.eClassifiers.clear()
                break
            }
            case EcoreConstants.EPACKAGE__EFACTORY_INSTANCE: {
                this.eFactoryInstance = null
                break
            }
            case EcoreConstants.EPACKAGE__ESUB_PACKAGES: {
                this.eSubPackages.clear()
                break
            }
            case EcoreConstants.EPACKAGE__NS_PREFIX: {
                this.nsPrefix = ""
                break
            }
            case EcoreConstants.EPACKAGE__NS_URI: {
                this.nsURI = ""
                break
            }
            default: {
                super.eUnsetFromID(featureID)
            }
        }
    }

    eIsSetFromID(featureID: number): boolean {
        switch (featureID) {
            case EcoreConstants.EPACKAGE__ECLASSIFIERS: {
                return this.eClassifiers != null && this.eClassifiers.size() != 0
            }
            case EcoreConstants.EPACKAGE__EFACTORY_INSTANCE: {
                return this._eFactoryInstance != null
            }
            case EcoreConstants.EPACKAGE__ESUB_PACKAGES: {
                return this.eSubPackages != null && this.eSubPackages.size() != 0
            }
            case EcoreConstants.EPACKAGE__ESUPER_PACKAGE: {
                return this.eSuperPackage != null
            }
            case EcoreConstants.EPACKAGE__NS_PREFIX: {
                return this._nsPrefix != ""
            }
            case EcoreConstants.EPACKAGE__NS_URI: {
                return this._nsURI != ""
            }
            default: {
                return super.eIsSetFromID(featureID)
            }
        }
    }

    eInvokeFromID(operationID: number, args: EList<any>): any {
        switch (operationID) {
            case EcoreConstants.EPACKAGE__GET_ECLASSIFIER_ESTRING: {
                return this.getEClassifier(args.get(0) as string)
            }
            default: {
                return super.eInvokeFromID(operationID, args)
            }
        }
    }

    eBasicInverseAdd(otherEnd: EObject, featureID: number, notifications: ENotificationChain): ENotificationChain {
        switch (featureID) {
            case EcoreConstants.EPACKAGE__ECLASSIFIERS: {
                let list = this.eClassifiers as ENotifyingList<EClassifier>
                let end = otherEnd as EClassifier
                return list.addWithNotification(end, notifications)
            }
            case EcoreConstants.EPACKAGE__EFACTORY_INSTANCE: {
                let msgs = notifications
                if (isEObjectInternal(this.eFactoryInstance)) {
                    msgs = this.eFactoryInstance.eInverseRemove(
                        this,
                        EOPPOSITE_FEATURE_BASE - EcoreConstants.EPACKAGE__EFACTORY_INSTANCE,
                        msgs
                    )
                }
                return this.basicSetEFactoryInstance(otherEnd as EFactory, msgs)
            }
            case EcoreConstants.EPACKAGE__ESUB_PACKAGES: {
                let list = this.eSubPackages as ENotifyingList<EPackage>
                let end = otherEnd as EPackage
                return list.addWithNotification(end, notifications)
            }
            case EcoreConstants.EPACKAGE__ESUPER_PACKAGE: {
                let msgs = notifications
                if (this.eContainer() != null) {
                    msgs = this.eBasicRemoveFromContainer(msgs)
                }
                return this.eBasicSetContainer(otherEnd, EcoreConstants.EPACKAGE__ESUPER_PACKAGE, msgs)
            }
            default: {
                return super.eBasicInverseAdd(otherEnd, featureID, notifications)
            }
        }
    }

    eBasicInverseRemove(otherEnd: EObject, featureID: number, notifications: ENotificationChain): ENotificationChain {
        switch (featureID) {
            case EcoreConstants.EPACKAGE__ECLASSIFIERS: {
                let list = this.eClassifiers as ENotifyingList<EClassifier>
                let end = otherEnd as EClassifier
                return list.removeWithNotification(end, notifications)
            }
            case EcoreConstants.EPACKAGE__EFACTORY_INSTANCE: {
                return this.basicSetEFactoryInstance(null, notifications)
            }
            case EcoreConstants.EPACKAGE__ESUB_PACKAGES: {
                let list = this.eSubPackages as ENotifyingList<EPackage>
                let end = otherEnd as EPackage
                return list.removeWithNotification(end, notifications)
            }
            case EcoreConstants.EPACKAGE__ESUPER_PACKAGE: {
                return this.eBasicSetContainer(null, EcoreConstants.EPACKAGE__ESUPER_PACKAGE, notifications)
            }
            default: {
                return super.eBasicInverseRemove(otherEnd, featureID, notifications)
            }
        }
    }
}
