// Code generated by soft.generator.ts. DO NOT EDIT.

// *****************************************************************************
// Copyright(c) 2024 MASA Group
//
// This Source Code Form is subject to the terms of the Mozilla Public
// License, v. 2.0. If a copy of the MPL was not distributed with this
// file, You can obtain one at https://mozilla.org/MPL/2.0/.
//
// *****************************************************************************

import { anything, capture, instance, mock, reset, verify, when } from "ts-mockito"
import { describe, expect, test } from "vitest"
import {
    EAdapter,
    EClass,
    ENotificationChain,
    EObject,
    EObjectInternal,
    EStructuralFeatureImpl,
    EcoreConstants,
    getEcorePackage
} from "./internal.js"

interface EClassInternal extends EClass, EObjectInternal {}

describe("EStructuralFeatureImpl", () => {
    test("eStaticClass", () => {
        let o = new EStructuralFeatureImpl()
        expect(o.eStaticClass()).toBe(getEcorePackage().getEStructuralFeature())
    })

    test("getDefaultValue", () => {
        let o = new EStructuralFeatureImpl()
        expect(() => o.defaultValue).toThrow(Error)
    })

    test("setDefaultValue", () => {
        let o = new EStructuralFeatureImpl()
        let value = null
        expect(() => (o.defaultValue = value)).toThrow(Error)
    })

    test("getDefaultValueLiteral", () => {
        let o = new EStructuralFeatureImpl()
        // get default value
        expect(o.defaultValueLiteral).toBe("")
    })

    test("setDefaultValueLiteral", () => {
        let o = new EStructuralFeatureImpl()
        let value = "Test String"

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set value
        o.defaultValueLiteral = value

        // checks
        verify(mockAdapter.notifyChanged(anything())).once()
        const [notification] = capture(mockAdapter.notifyChanged).last()
        expect(notification.notifier).toBe(o)
        expect(notification.oldValue).toBe("")
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("getEContainingClass", () => {
        // default
        let o = new EStructuralFeatureImpl()
        expect(o.eContainingClass).toBeNull()

        // set a mock container
        let mockContainer = mock<EObject>()
        let container = instance(mockContainer)
        o.eSetInternalContainer(container, EcoreConstants.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS)

        // no proxy
        when(mockContainer.eIsProxy()).thenReturn(false)
        expect(o.eContainingClass).toBe(container)
        verify(mockContainer.eIsProxy()).once()
    })

    test("getFeatureID", () => {
        let o = new EStructuralFeatureImpl()
        // get default value
        expect(o.featureID).toBe(-1)
    })

    test("setFeatureID", () => {
        let o = new EStructuralFeatureImpl()
        let value = 45

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set value
        o.featureID = value

        // checks
        verify(mockAdapter.notifyChanged(anything())).once()
        const [notification] = capture(mockAdapter.notifyChanged).last()
        expect(notification.notifier).toBe(o)
        expect(notification.oldValue).toBe(-1)
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("getChangeable", () => {
        let o = new EStructuralFeatureImpl()
        // get default value
        expect(o.isChangeable).toBe(true)
    })

    test("setChangeable", () => {
        let o = new EStructuralFeatureImpl()
        let value = true

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set value
        o.isChangeable = value

        // checks
        verify(mockAdapter.notifyChanged(anything())).once()
        const [notification] = capture(mockAdapter.notifyChanged).last()
        expect(notification.notifier).toBe(o)
        expect(notification.oldValue).toBe(true)
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("getDerived", () => {
        let o = new EStructuralFeatureImpl()
        // get default value
        expect(o.isDerived).toBe(false)
    })

    test("setDerived", () => {
        let o = new EStructuralFeatureImpl()
        let value = true

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set value
        o.isDerived = value

        // checks
        verify(mockAdapter.notifyChanged(anything())).once()
        const [notification] = capture(mockAdapter.notifyChanged).last()
        expect(notification.notifier).toBe(o)
        expect(notification.oldValue).toBe(false)
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("getTransient", () => {
        let o = new EStructuralFeatureImpl()
        // get default value
        expect(o.isTransient).toBe(false)
    })

    test("setTransient", () => {
        let o = new EStructuralFeatureImpl()
        let value = true

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set value
        o.isTransient = value

        // checks
        verify(mockAdapter.notifyChanged(anything())).once()
        const [notification] = capture(mockAdapter.notifyChanged).last()
        expect(notification.notifier).toBe(o)
        expect(notification.oldValue).toBe(false)
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("getUnsettable", () => {
        let o = new EStructuralFeatureImpl()
        // get default value
        expect(o.isUnsettable).toBe(false)
    })

    test("setUnsettable", () => {
        let o = new EStructuralFeatureImpl()
        let value = true

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set value
        o.isUnsettable = value

        // checks
        verify(mockAdapter.notifyChanged(anything())).once()
        const [notification] = capture(mockAdapter.notifyChanged).last()
        expect(notification.notifier).toBe(o)
        expect(notification.oldValue).toBe(false)
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("getVolatile", () => {
        let o = new EStructuralFeatureImpl()
        // get default value
        expect(o.isVolatile).toBe(false)
    })

    test("setVolatile", () => {
        let o = new EStructuralFeatureImpl()
        let value = true

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set value
        o.isVolatile = value

        // checks
        verify(mockAdapter.notifyChanged(anything())).once()
        const [notification] = capture(mockAdapter.notifyChanged).last()
        expect(notification.notifier).toBe(o)
        expect(notification.oldValue).toBe(false)
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("getContainerClass", () => {
        let o = new EStructuralFeatureImpl()
        expect(() => o.getContainerClass()).toThrow(Error)
    })

    test("eGetFromID", () => {
        let o = new EStructuralFeatureImpl()
        expect(() => o.eGetFromID(-1, true)).toThrow(Error)
        expect(o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__CHANGEABLE, true)).toStrictEqual(o.isChangeable)
        expect(() => o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DEFAULT_VALUE, true)).toThrow(Error)
        expect(() => o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DEFAULT_VALUE, false)).toThrow(Error)
        expect(o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL, true)).toStrictEqual(
            o.defaultValueLiteral
        )
        expect(o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DERIVED, true)).toStrictEqual(o.isDerived)
        expect(o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, true)).toStrictEqual(
            o.eContainingClass
        )
        expect(o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__FEATURE_ID, true)).toStrictEqual(o.featureID)
        expect(o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__TRANSIENT, true)).toStrictEqual(o.isTransient)
        expect(o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__UNSETTABLE, true)).toStrictEqual(o.isUnsettable)
        expect(o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__VOLATILE, true)).toStrictEqual(o.isVolatile)
    })

    test("eSetFromID", () => {
        let o = new EStructuralFeatureImpl()
        expect(() => o.eSetFromID(-1, null)).toThrow(Error)
        {
            let value = true
            o.eSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__CHANGEABLE, value)
            expect(o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__CHANGEABLE, false)).toBe(value)
        }
        expect(() => o.eSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DEFAULT_VALUE, null)).toThrow(Error)
        {
            let value = "Test String"
            o.eSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL, value)
            expect(o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL, false)).toBe(value)
        }
        {
            let value = true
            o.eSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DERIVED, value)
            expect(o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DERIVED, false)).toBe(value)
        }
        {
            let value = 45
            o.eSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__FEATURE_ID, value)
            expect(o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__FEATURE_ID, false)).toBe(value)
        }
        {
            let value = true
            o.eSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__TRANSIENT, value)
            expect(o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__TRANSIENT, false)).toBe(value)
        }
        {
            let value = true
            o.eSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__UNSETTABLE, value)
            expect(o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__UNSETTABLE, false)).toBe(value)
        }
        {
            let value = true
            o.eSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__VOLATILE, value)
            expect(o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__VOLATILE, false)).toBe(value)
        }
    })

    test("eIsSetFromID", () => {
        let o = new EStructuralFeatureImpl()
        expect(() => o.eIsSetFromID(-1)).toThrow(Error)
        expect(o.eIsSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__CHANGEABLE)).toBeFalsy()
        expect(() => o.eIsSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DEFAULT_VALUE)).toThrow(Error)
        expect(o.eIsSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DERIVED)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__FEATURE_ID)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__TRANSIENT)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__UNSETTABLE)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__VOLATILE)).toBeFalsy()
    })

    test("eUnsetFromID", () => {
        let o = new EStructuralFeatureImpl()
        expect(() => o.eUnsetFromID(-1)).toThrow(Error)
        {
            o.eUnsetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__CHANGEABLE)
            let v = o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__CHANGEABLE, false)
            expect(v).toBe(true)
        }
        {
            expect(() => o.eUnsetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DEFAULT_VALUE)).toThrow(Error)
        }
        {
            o.eUnsetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL)
            let v = o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL, false)
            expect(v).toBe("")
        }
        {
            o.eUnsetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DERIVED)
            let v = o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__DERIVED, false)
            expect(v).toBe(false)
        }
        {
            o.eUnsetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__FEATURE_ID)
            let v = o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__FEATURE_ID, false)
            expect(v).toBe(-1)
        }
        {
            o.eUnsetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__TRANSIENT)
            let v = o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__TRANSIENT, false)
            expect(v).toBe(false)
        }
        {
            o.eUnsetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__UNSETTABLE)
            let v = o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__UNSETTABLE, false)
            expect(v).toBe(false)
        }
        {
            o.eUnsetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__VOLATILE)
            let v = o.eGetFromID(EcoreConstants.ESTRUCTURAL_FEATURE__VOLATILE, false)
            expect(v).toBe(false)
        }
    })

    test("eInvokeFromID", () => {
        let o = new EStructuralFeatureImpl()
        expect(() => o.eInvokeFromID(-1, null)).toThrow(Error)
        expect(() => o.eInvokeFromID(EcoreConstants.ESTRUCTURAL_FEATURE__GET_CONTAINER_CLASS, null)).toThrow(Error)
    })

    test("eBasicInverseAdd", () => {
        let o = new EStructuralFeatureImpl()
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
            o.eBasicInverseAdd(value, EcoreConstants.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, null)
            expect(o.eContainingClass).toBe(value)

            reset(mockValue)
            let mockOther = mock<EClassInternal>()
            let other = instance(mockOther)
            when(mockOther.eResource()).thenReturn(null)
            when(mockOther.eIsProxy()).thenReturn(false)
            when(mockValue.eResource()).thenReturn(null)
            when(mockValue.eInverseRemove(o, EcoreConstants.ECLASS__ESTRUCTURAL_FEATURES, null)).thenReturn(null)
            o.eBasicInverseAdd(other, EcoreConstants.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, null)
            expect(o.eContainingClass).toBe(other)
        }
    })

    test("eBasicInverseRemove", () => {
        let o = new EStructuralFeatureImpl()
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
            o.eBasicInverseRemove(value, EcoreConstants.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, null)
        }
    })
})