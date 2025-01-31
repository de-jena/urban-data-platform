// Code generated by soft.generator.ts. DO NOT EDIT.

// *****************************************************************************
// Copyright(c) 2024 MASA Group
//
// This Source Code Form is subject to the terms of the Mozilla Public
// License, v. 2.0. If a copy of the MPL was not distributed with this
// file, You can obtain one at https://mozilla.org/MPL/2.0/.
//
// *****************************************************************************

import deepEqual from "deep-equal"
import { anything, capture, instance, mock, reset, verify, when } from "ts-mockito"
import { describe, expect, test } from "vitest"
import {
    EAdapter,
    EClass,
    EClassifier,
    EList,
    ENotificationChain,
    EObject,
    EObjectInternal,
    EObjectList,
    EOperationImpl,
    EParameter,
    EcoreConstants,
    ImmutableEList,
    getEcorePackage
} from "./internal.js"

interface EClassInternal extends EClass, EObjectInternal {}
interface EClassifierInternal extends EClassifier, EObjectInternal {}
interface EParameterInternal extends EParameter, EObjectInternal {}

describe("EOperationImpl", () => {
    test("eStaticClass", () => {
        let o = new EOperationImpl()
        expect(o.eStaticClass()).toBe(getEcorePackage().getEOperation())
    })

    test("getEContainingClass", () => {
        // default
        let o = new EOperationImpl()
        expect(o.eContainingClass).toBeNull()

        // set a mock container
        let mockContainer = mock<EObject>()
        let container = instance(mockContainer)
        o.eSetInternalContainer(container, EcoreConstants.EOPERATION__ECONTAINING_CLASS)

        // no proxy
        when(mockContainer.eIsProxy()).thenReturn(false)
        expect(o.eContainingClass).toBe(container)
        verify(mockContainer.eIsProxy()).once()
    })

    test("getEExceptions", () => {
        let o = new EOperationImpl()
        expect(o.eExceptions).not.toBeNull()
    })

    test("unsetEExceptions", () => {
        let o = new EOperationImpl()
        o.unSetEExceptions()
        expect(o.eExceptions.isEmpty()).toBeTruthy()
    })

    test("getEParameters", () => {
        let o = new EOperationImpl()
        expect(o.eParameters).not.toBeNull()
    })

    test("getOperationID", () => {
        let o = new EOperationImpl()
        // get default value
        expect(o.operationID).toBe(-1)
    })

    test("setOperationID", () => {
        let o = new EOperationImpl()
        let value = 45

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set value
        o.operationID = value

        // checks
        verify(mockAdapter.notifyChanged(anything())).once()
        const [notification] = capture(mockAdapter.notifyChanged).last()
        expect(notification.notifier).toBe(o)
        expect(notification.oldValue).toBe(-1)
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("isOverrideOf", () => {
        let o = new EOperationImpl()
        expect(() => o.isOverrideOf(null)).toThrow(Error)
    })

    test("eGetFromID", () => {
        let o = new EOperationImpl()
        expect(() => o.eGetFromID(-1, true)).toThrow(Error)
        expect(o.eGetFromID(EcoreConstants.EOPERATION__ECONTAINING_CLASS, true)).toStrictEqual(o.eContainingClass)
        expect(o.eGetFromID(EcoreConstants.EOPERATION__EEXCEPTIONS, true)).toStrictEqual(o.eExceptions)
        expect(
            deepEqual(
                o.eGetFromID(EcoreConstants.EOPERATION__EEXCEPTIONS, false),
                (o.eExceptions as EObjectList<EClassifier>).getUnResolvedList()
            )
        ).toBeTruthy()
        expect(o.eGetFromID(EcoreConstants.EOPERATION__EPARAMETERS, true)).toStrictEqual(o.eParameters)
        expect(
            deepEqual(
                o.eGetFromID(EcoreConstants.EOPERATION__EPARAMETERS, false),
                (o.eParameters as EObjectList<EParameter>).getUnResolvedList()
            )
        ).toBeTruthy()
        expect(o.eGetFromID(EcoreConstants.EOPERATION__OPERATION_ID, true)).toStrictEqual(o.operationID)
    })

    test("eSetFromID", () => {
        let o = new EOperationImpl()
        expect(() => o.eSetFromID(-1, null)).toThrow(Error)
        {
            // list with a value
            let mockValue = mock<EClassifierInternal>()
            let value = instance(mockValue)
            let l = new ImmutableEList<EClassifier>([value])
            when(mockValue.eIsProxy()).thenReturn(false)

            // set list with new contents
            o.eSetFromID(EcoreConstants.EOPERATION__EEXCEPTIONS, l)
            // checks
            expect(o.eExceptions.size()).toBe(1)
            expect(o.eExceptions.get(0)).toBe(value)
        }

        {
            // list with a value
            let mockValue = mock<EParameterInternal>()
            let value = instance(mockValue)
            let l = new ImmutableEList<EParameter>([value])
            when(mockValue.eInverseAdd(o, EcoreConstants.EPARAMETER__EOPERATION, anything())).thenReturn(null)

            // set list with new contents
            o.eSetFromID(EcoreConstants.EOPERATION__EPARAMETERS, l)
            // checks
            expect(o.eParameters.size()).toBe(1)
            expect(o.eParameters.get(0)).toBe(value)
            verify(mockValue.eInverseAdd(o, EcoreConstants.EPARAMETER__EOPERATION, anything())).once()
        }

        {
            let value = 45
            o.eSetFromID(EcoreConstants.EOPERATION__OPERATION_ID, value)
            expect(o.eGetFromID(EcoreConstants.EOPERATION__OPERATION_ID, false)).toBe(value)
        }
    })

    test("eIsSetFromID", () => {
        let o = new EOperationImpl()
        expect(() => o.eIsSetFromID(-1)).toThrow(Error)
        expect(o.eIsSetFromID(EcoreConstants.EOPERATION__ECONTAINING_CLASS)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.EOPERATION__EEXCEPTIONS)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.EOPERATION__EPARAMETERS)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.EOPERATION__OPERATION_ID)).toBeFalsy()
    })

    test("eUnsetFromID", () => {
        let o = new EOperationImpl()
        expect(() => o.eUnsetFromID(-1)).toThrow(Error)
        {
            o.eUnsetFromID(EcoreConstants.EOPERATION__EEXCEPTIONS)
            let v = o.eGetFromID(EcoreConstants.EOPERATION__EEXCEPTIONS, false)
            expect(v).not.toBeNull()
            let l = v as EList<EClassifier>
            expect(l.isEmpty()).toBeTruthy()
        }
        {
            o.eUnsetFromID(EcoreConstants.EOPERATION__EPARAMETERS)
            let v = o.eGetFromID(EcoreConstants.EOPERATION__EPARAMETERS, false)
            expect(v).not.toBeNull()
            let l = v as EList<EParameter>
            expect(l.isEmpty()).toBeTruthy()
        }
        {
            o.eUnsetFromID(EcoreConstants.EOPERATION__OPERATION_ID)
            let v = o.eGetFromID(EcoreConstants.EOPERATION__OPERATION_ID, false)
            expect(v).toBe(-1)
        }
    })

    test("eInvokeFromID", () => {
        let o = new EOperationImpl()
        expect(() => o.eInvokeFromID(-1, null)).toThrow(Error)
        expect(() => o.eInvokeFromID(EcoreConstants.EOPERATION__IS_OVERRIDE_OF_EOPERATION, null)).toThrow(Error)
    })

    test("eBasicInverseAdd", () => {
        let o = new EOperationImpl()
        {
            let mockObject = mock<EObject>()
            let object = instance(mockObject)
            let mockNotifications = mock<ENotificationChain>()
            let notifications = instance(mockNotifications)
            expect(o.eBasicInverseAdd(object, -1, notifications)).toBe(notifications)
        }
        {
            let mockValue = mock<EClassInternal>()
            let value = instance(mockValue)
            when(mockValue.eResource()).thenReturn(null)
            when(mockValue.eIsProxy()).thenReturn(false)
            o.eBasicInverseAdd(value, EcoreConstants.EOPERATION__ECONTAINING_CLASS, null)
            expect(o.eContainingClass).toBe(value)

            reset(mockValue)
            let mockOther = mock<EClassInternal>()
            let other = instance(mockOther)
            when(mockOther.eResource()).thenReturn(null)
            when(mockOther.eIsProxy()).thenReturn(false)
            when(mockValue.eResource()).thenReturn(null)
            when(mockValue.eInverseRemove(o, EcoreConstants.ECLASS__EOPERATIONS, null)).thenReturn(null)
            o.eBasicInverseAdd(other, EcoreConstants.EOPERATION__ECONTAINING_CLASS, null)
            expect(o.eContainingClass).toBe(other)
        }
        {
            let mockValue = mock<EParameterInternal>()
            let value = instance(mockValue)
            o.eBasicInverseAdd(value, EcoreConstants.EOPERATION__EPARAMETERS, null)
            expect(o.eParameters.contains(value)).toBeTruthy()
        }
    })

    test("eBasicInverseRemove", () => {
        let o = new EOperationImpl()
        {
            let mockObject = mock<EObject>()
            let object = instance(mockObject)
            let mockNotifications = mock<ENotificationChain>()
            let notifications = instance(mockNotifications)
            expect(o.eBasicInverseRemove(object, -1, notifications)).toBe(notifications)
        }
        {
            let mockValue = mock<EClassInternal>()
            let value = instance(mockValue)
            o.eBasicInverseRemove(value, EcoreConstants.EOPERATION__ECONTAINING_CLASS, null)
        }
        {
            // initialize list with a mock object
            let mockValue = mock<EParameterInternal>()
            let value = instance(mockValue)
            when(mockValue.eInverseAdd(o, EcoreConstants.EPARAMETER__EOPERATION, anything())).thenReturn(null)

            o.eParameters.add(value)

            // basic inverse remove
            o.eBasicInverseRemove(value, EcoreConstants.EOPERATION__EPARAMETERS, null)

            // check it was removed
            expect(o.eParameters.contains(value)).toBeFalsy()
        }
    })
})
