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
import { anything, capture, instance, mock, verify, when } from "ts-mockito"
import { describe, expect, test } from "vitest"
import {
    EAdapter,
    EClassifier,
    EGenericType,
    EGenericTypeImpl,
    EList,
    ENotificationChain,
    EOPPOSITE_FEATURE_BASE,
    EObject,
    EObjectInternal,
    EObjectList,
    EResource,
    EResourceSet,
    ETypeParameter,
    EcoreConstants,
    EventType,
    ImmutableEList,
    URI,
    getEcorePackage
} from "./internal.js"

interface EClassifierInternal extends EClassifier, EObjectInternal {}
interface EGenericTypeInternal extends EGenericType, EObjectInternal {}
interface ETypeParameterInternal extends ETypeParameter, EObjectInternal {}

describe("EGenericTypeImpl", () => {
    test("eStaticClass", () => {
        let o = new EGenericTypeImpl()
        expect(o.eStaticClass()).toBe(getEcorePackage().getEGenericType())
    })

    test("getEClassifier", () => {
        let o = new EGenericTypeImpl()

        // get default value
        expect(o.eClassifier).toBeNull()

        // initialize object with a mock value
        let mockValue = mock<EClassifierInternal>()
        let value = instance(mockValue)
        o.eClassifier = value

        // events
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set object resource
        let mockResourceSet = mock<EResourceSet>()
        let resourceSet = instance(mockResourceSet)
        let mockResource = mock<EResource>()
        let resource = instance(mockResource)
        o.eSetInternalResource(resource)

        // get non resolved value
        when(mockValue.eIsProxy()).thenReturn(false)
        expect(o.eClassifier).toBe(value)
        verify(mockValue.eIsProxy()).once()

        // get a resolved value
        let mockURI = new URI("test:///uri")
        let mockResolved = mock<EClassifierInternal>()
        let resolved = instance(mockResolved)
        when(mockResolved.eProxyURI()).thenReturn(null)
        when(mockResource.eResourceSet()).thenReturn(resourceSet)
        when(mockResourceSet.getEObject(mockURI, true)).thenReturn(resolved)
        when(mockValue.eIsProxy()).thenReturn(true)
        when(mockValue.eProxyURI()).thenReturn(mockURI)
        expect(o.eClassifier).toBe(resolved)
    })

    test("setEClassifier", () => {
        let o = new EGenericTypeImpl()
        let mockValue = mock<EClassifierInternal>()
        let value = instance(mockValue)

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set value
        o.eClassifier = value

        // checks
        verify(mockAdapter.notifyChanged(anything())).once()
        const [notification] = capture(mockAdapter.notifyChanged).last()
        expect(notification.notifier).toBe(o)
        expect(notification.oldValue).toBeNull()
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("getELowerBound", () => {
        let o = new EGenericTypeImpl()

        // get default value
        expect(o.eLowerBound).toBeNull()
    })

    test("setELowerBound", () => {
        let o = new EGenericTypeImpl()
        let mockValue = mock<EGenericTypeInternal>()
        let value = instance(mockValue)

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set value
        o.eLowerBound = value

        // checks
        verify(mockAdapter.notifyChanged(anything())).once()
        const [notification] = capture(mockAdapter.notifyChanged).last()
        expect(notification.notifier).toBe(o)
        expect(notification.oldValue).toBeNull()
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("basicSetELowerBound", () => {
        let o = new EGenericTypeImpl()
        let mockValue = mock<EGenericTypeInternal>()
        let value = instance(mockValue)

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // notification chain
        let mockNotifications = mock<ENotificationChain>()
        let notifications = instance(mockNotifications)

        // set value
        when(mockNotifications.add(anything())).thenReturn(true)
        o.basicSetELowerBound(value, notifications)

        // checks
        verify(mockNotifications.add(anything())).once()
        const [notification] = capture(mockNotifications.add).last()
        expect(notification.notifier).toBe(o)
        expect(notification.eventType).toBe(EventType.SET)
        expect(notification.featureID).toBe(EcoreConstants.EGENERIC_TYPE__ELOWER_BOUND)
        expect(notification.oldValue).toBeNull()
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("getERawType", () => {
        let o = new EGenericTypeImpl()

        // get default value
        expect(o.eRawType).toBeNull()

        // initialize object with a mock value
        let mockValue = mock<EClassifierInternal>()
        let value = instance(mockValue)
        o.eRawType = value

        // events
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set object resource
        let mockResourceSet = mock<EResourceSet>()
        let resourceSet = instance(mockResourceSet)
        let mockResource = mock<EResource>()
        let resource = instance(mockResource)
        o.eSetInternalResource(resource)

        // get non resolved value
        when(mockValue.eIsProxy()).thenReturn(false)
        expect(o.eRawType).toBe(value)
        verify(mockValue.eIsProxy()).once()

        // get a resolved value
        let mockURI = new URI("test:///uri")
        let mockResolved = mock<EClassifierInternal>()
        let resolved = instance(mockResolved)
        when(mockResolved.eProxyURI()).thenReturn(null)
        when(mockResource.eResourceSet()).thenReturn(resourceSet)
        when(mockResourceSet.getEObject(mockURI, true)).thenReturn(resolved)
        when(mockValue.eIsProxy()).thenReturn(true)
        when(mockValue.eProxyURI()).thenReturn(mockURI)
        expect(o.eRawType).toBe(resolved)
    })

    test("getETypeArguments", () => {
        let o = new EGenericTypeImpl()
        expect(o.eTypeArguments).not.toBeNull()
    })

    test("getETypeParameter", () => {
        let o = new EGenericTypeImpl()

        // get default value
        expect(o.eTypeParameter).toBeNull()
    })

    test("setETypeParameter", () => {
        let o = new EGenericTypeImpl()
        let mockValue = mock<ETypeParameterInternal>()
        let value = instance(mockValue)

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set value
        o.eTypeParameter = value

        // checks
        verify(mockAdapter.notifyChanged(anything())).once()
        const [notification] = capture(mockAdapter.notifyChanged).last()
        expect(notification.notifier).toBe(o)
        expect(notification.oldValue).toBeNull()
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("getEUpperBound", () => {
        let o = new EGenericTypeImpl()

        // get default value
        expect(o.eUpperBound).toBeNull()
    })

    test("setEUpperBound", () => {
        let o = new EGenericTypeImpl()
        let mockValue = mock<EGenericTypeInternal>()
        let value = instance(mockValue)

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set value
        o.eUpperBound = value

        // checks
        verify(mockAdapter.notifyChanged(anything())).once()
        const [notification] = capture(mockAdapter.notifyChanged).last()
        expect(notification.notifier).toBe(o)
        expect(notification.oldValue).toBeNull()
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("basicSetEUpperBound", () => {
        let o = new EGenericTypeImpl()
        let mockValue = mock<EGenericTypeInternal>()
        let value = instance(mockValue)

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // notification chain
        let mockNotifications = mock<ENotificationChain>()
        let notifications = instance(mockNotifications)

        // set value
        when(mockNotifications.add(anything())).thenReturn(true)
        o.basicSetEUpperBound(value, notifications)

        // checks
        verify(mockNotifications.add(anything())).once()
        const [notification] = capture(mockNotifications.add).last()
        expect(notification.notifier).toBe(o)
        expect(notification.eventType).toBe(EventType.SET)
        expect(notification.featureID).toBe(EcoreConstants.EGENERIC_TYPE__EUPPER_BOUND)
        expect(notification.oldValue).toBeNull()
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("isInstance", () => {
        let o = new EGenericTypeImpl()
        expect(() => o.isInstance(null)).toThrow(Error)
    })

    test("eGetFromID", () => {
        let o = new EGenericTypeImpl()
        expect(() => o.eGetFromID(-1, true)).toThrow(Error)
        expect(o.eGetFromID(EcoreConstants.EGENERIC_TYPE__ECLASSIFIER, true)).toStrictEqual(o.eClassifier)
        expect(o.eGetFromID(EcoreConstants.EGENERIC_TYPE__ELOWER_BOUND, true)).toStrictEqual(o.eLowerBound)
        expect(o.eGetFromID(EcoreConstants.EGENERIC_TYPE__ERAW_TYPE, true)).toStrictEqual(o.eRawType)
        expect(o.eGetFromID(EcoreConstants.EGENERIC_TYPE__ETYPE_ARGUMENTS, true)).toStrictEqual(o.eTypeArguments)
        expect(
            deepEqual(
                o.eGetFromID(EcoreConstants.EGENERIC_TYPE__ETYPE_ARGUMENTS, false),
                (o.eTypeArguments as EObjectList<EGenericType>).getUnResolvedList()
            )
        ).toBeTruthy()
        expect(o.eGetFromID(EcoreConstants.EGENERIC_TYPE__ETYPE_PARAMETER, true)).toStrictEqual(o.eTypeParameter)
        expect(o.eGetFromID(EcoreConstants.EGENERIC_TYPE__EUPPER_BOUND, true)).toStrictEqual(o.eUpperBound)
    })

    test("eSetFromID", () => {
        let o = new EGenericTypeImpl()
        expect(() => o.eSetFromID(-1, null)).toThrow(Error)
        {
            let mockValue = mock<EClassifierInternal>()
            let value = instance(mockValue)
            o.eSetFromID(EcoreConstants.EGENERIC_TYPE__ECLASSIFIER, value)
            expect(o.eGetFromID(EcoreConstants.EGENERIC_TYPE__ECLASSIFIER, false)).toBe(value)
        }
        {
            let mockValue = mock<EGenericTypeInternal>()
            let value = instance(mockValue)
            when(
                mockValue.eInverseAdd(
                    o,
                    EOPPOSITE_FEATURE_BASE - EcoreConstants.EGENERIC_TYPE__ELOWER_BOUND,
                    anything()
                )
            ).thenReturn(null)
            o.eSetFromID(EcoreConstants.EGENERIC_TYPE__ELOWER_BOUND, value)
            expect(o.eGetFromID(EcoreConstants.EGENERIC_TYPE__ELOWER_BOUND, false)).toBe(value)
            verify(
                mockValue.eInverseAdd(
                    o,
                    EOPPOSITE_FEATURE_BASE - EcoreConstants.EGENERIC_TYPE__ELOWER_BOUND,
                    anything()
                )
            ).once()
        }
        {
            // list with a value
            let mockValue = mock<EGenericTypeInternal>()
            let value = instance(mockValue)
            let l = new ImmutableEList<EGenericType>([value])
            when(
                mockValue.eInverseAdd(
                    o,
                    EOPPOSITE_FEATURE_BASE - EcoreConstants.EGENERIC_TYPE__ETYPE_ARGUMENTS,
                    anything()
                )
            ).thenReturn(null)

            // set list with new contents
            o.eSetFromID(EcoreConstants.EGENERIC_TYPE__ETYPE_ARGUMENTS, l)
            // checks
            expect(o.eTypeArguments.size()).toBe(1)
            expect(o.eTypeArguments.get(0)).toBe(value)
            verify(
                mockValue.eInverseAdd(
                    o,
                    EOPPOSITE_FEATURE_BASE - EcoreConstants.EGENERIC_TYPE__ETYPE_ARGUMENTS,
                    anything()
                )
            ).once()
        }

        {
            let mockValue = mock<ETypeParameterInternal>()
            let value = instance(mockValue)
            o.eSetFromID(EcoreConstants.EGENERIC_TYPE__ETYPE_PARAMETER, value)
            expect(o.eGetFromID(EcoreConstants.EGENERIC_TYPE__ETYPE_PARAMETER, false)).toBe(value)
        }
        {
            let mockValue = mock<EGenericTypeInternal>()
            let value = instance(mockValue)
            when(
                mockValue.eInverseAdd(
                    o,
                    EOPPOSITE_FEATURE_BASE - EcoreConstants.EGENERIC_TYPE__EUPPER_BOUND,
                    anything()
                )
            ).thenReturn(null)
            o.eSetFromID(EcoreConstants.EGENERIC_TYPE__EUPPER_BOUND, value)
            expect(o.eGetFromID(EcoreConstants.EGENERIC_TYPE__EUPPER_BOUND, false)).toBe(value)
            verify(
                mockValue.eInverseAdd(
                    o,
                    EOPPOSITE_FEATURE_BASE - EcoreConstants.EGENERIC_TYPE__EUPPER_BOUND,
                    anything()
                )
            ).once()
        }
    })

    test("eIsSetFromID", () => {
        let o = new EGenericTypeImpl()
        expect(() => o.eIsSetFromID(-1)).toThrow(Error)
        expect(o.eIsSetFromID(EcoreConstants.EGENERIC_TYPE__ECLASSIFIER)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.EGENERIC_TYPE__ELOWER_BOUND)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.EGENERIC_TYPE__ERAW_TYPE)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.EGENERIC_TYPE__ETYPE_ARGUMENTS)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.EGENERIC_TYPE__ETYPE_PARAMETER)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.EGENERIC_TYPE__EUPPER_BOUND)).toBeFalsy()
    })

    test("eUnsetFromID", () => {
        let o = new EGenericTypeImpl()
        expect(() => o.eUnsetFromID(-1)).toThrow(Error)
        {
            o.eUnsetFromID(EcoreConstants.EGENERIC_TYPE__ECLASSIFIER)
            expect(o.eGetFromID(EcoreConstants.EGENERIC_TYPE__ECLASSIFIER, false)).toBeNull()
        }
        {
            o.eUnsetFromID(EcoreConstants.EGENERIC_TYPE__ELOWER_BOUND)
            expect(o.eGetFromID(EcoreConstants.EGENERIC_TYPE__ELOWER_BOUND, false)).toBeNull()
        }
        {
            o.eUnsetFromID(EcoreConstants.EGENERIC_TYPE__ETYPE_ARGUMENTS)
            let v = o.eGetFromID(EcoreConstants.EGENERIC_TYPE__ETYPE_ARGUMENTS, false)
            expect(v).not.toBeNull()
            let l = v as EList<EGenericType>
            expect(l.isEmpty()).toBeTruthy()
        }
        {
            o.eUnsetFromID(EcoreConstants.EGENERIC_TYPE__ETYPE_PARAMETER)
            expect(o.eGetFromID(EcoreConstants.EGENERIC_TYPE__ETYPE_PARAMETER, false)).toBeNull()
        }
        {
            o.eUnsetFromID(EcoreConstants.EGENERIC_TYPE__EUPPER_BOUND)
            expect(o.eGetFromID(EcoreConstants.EGENERIC_TYPE__EUPPER_BOUND, false)).toBeNull()
        }
    })

    test("eInvokeFromID", () => {
        let o = new EGenericTypeImpl()
        expect(() => o.eInvokeFromID(-1, null)).toThrow(Error)
        expect(() => o.eInvokeFromID(EcoreConstants.EGENERIC_TYPE__IS_INSTANCE_EJAVAOBJECT, null)).toThrow(Error)
    })

    test("eBasicInverseRemove", () => {
        let o = new EGenericTypeImpl()
        {
            let mockObject = mock<EObject>()
            let object = instance(mockObject)
            let mockNotifications = mock<ENotificationChain>()
            let notifications = instance(mockNotifications)
            expect(o.eBasicInverseRemove(object, -1, notifications)).toBe(notifications)
        }
        {
            let mockValue = mock<EGenericTypeInternal>()
            let value = instance(mockValue)
            o.eBasicInverseRemove(value, EcoreConstants.EGENERIC_TYPE__ELOWER_BOUND, null)
        }
        {
            // initialize list with a mock object
            let mockValue = mock<EGenericTypeInternal>()
            let value = instance(mockValue)
            when(
                mockValue.eInverseAdd(
                    o,
                    EOPPOSITE_FEATURE_BASE - EcoreConstants.EGENERIC_TYPE__ETYPE_ARGUMENTS,
                    anything()
                )
            ).thenReturn(null)

            o.eTypeArguments.add(value)

            // basic inverse remove
            o.eBasicInverseRemove(value, EcoreConstants.EGENERIC_TYPE__ETYPE_ARGUMENTS, null)

            // check it was removed
            expect(o.eTypeArguments.contains(value)).toBeFalsy()
        }
        {
            let mockValue = mock<EGenericTypeInternal>()
            let value = instance(mockValue)
            o.eBasicInverseRemove(value, EcoreConstants.EGENERIC_TYPE__EUPPER_BOUND, null)
        }
    })
})
