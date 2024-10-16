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
    EAttribute,
    EClass,
    EList,
    EObjectInternal,
    EObjectList,
    EReference,
    EReferenceImpl,
    EResource,
    EResourceSet,
    EcoreConstants,
    ImmutableEList,
    URI,
    getEcorePackage
} from "./internal.js"

interface EAttributeInternal extends EAttribute, EObjectInternal {}
interface EClassInternal extends EClass, EObjectInternal {}
interface EReferenceInternal extends EReference, EObjectInternal {}

describe("EReferenceImpl", () => {
    test("eStaticClass", () => {
        let o = new EReferenceImpl()
        expect(o.eStaticClass()).toBe(getEcorePackage().getEReference())
    })

    test("getEKeys", () => {
        let o = new EReferenceImpl()
        expect(o.eKeys).not.toBeNull()
    })

    test("getEOpposite", () => {
        let o = new EReferenceImpl()

        // get default value
        expect(o.eOpposite).toBeNull()

        // initialize object with a mock value
        let mockValue = mock<EReferenceInternal>()
        let value = instance(mockValue)
        o.eOpposite = value

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
        expect(o.eOpposite).toBe(value)
        verify(mockValue.eIsProxy()).once()

        // get a resolved value
        let mockURI = new URI("test:///uri")
        let mockResolved = mock<EReferenceInternal>()
        let resolved = instance(mockResolved)
        when(mockResolved.eProxyURI()).thenReturn(null)
        when(mockResource.eResourceSet()).thenReturn(resourceSet)
        when(mockResourceSet.getEObject(mockURI, true)).thenReturn(resolved)
        when(mockValue.eIsProxy()).thenReturn(true)
        when(mockValue.eProxyURI()).thenReturn(mockURI)
        expect(o.eOpposite).toBe(resolved)
    })

    test("setEOpposite", () => {
        let o = new EReferenceImpl()
        let mockValue = mock<EReferenceInternal>()
        let value = instance(mockValue)

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set value
        o.eOpposite = value

        // checks
        verify(mockAdapter.notifyChanged(anything())).once()
        const [notification] = capture(mockAdapter.notifyChanged).last()
        expect(notification.notifier).toBe(o)
        expect(notification.oldValue).toBeNull()
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("getEReferenceType", () => {
        let o = new EReferenceImpl()
        expect(() => o.eReferenceType).toThrow(Error)
    })

    test("getContainer", () => {
        let o = new EReferenceImpl()
        expect(() => o.isContainer).toThrow(Error)
    })

    test("getContainment", () => {
        let o = new EReferenceImpl()
        // get default value
        expect(o.isContainment).toBe(false)
    })

    test("setContainment", () => {
        let o = new EReferenceImpl()
        let value = true

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set value
        o.isContainment = value

        // checks
        verify(mockAdapter.notifyChanged(anything())).once()
        const [notification] = capture(mockAdapter.notifyChanged).last()
        expect(notification.notifier).toBe(o)
        expect(notification.oldValue).toBe(false)
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("getResolveProxies", () => {
        let o = new EReferenceImpl()
        // get default value
        expect(o.isResolveProxies).toBe(true)
    })

    test("setResolveProxies", () => {
        let o = new EReferenceImpl()
        let value = true

        // add listener
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        o.eAdapters.add(adapter)

        // set value
        o.isResolveProxies = value

        // checks
        verify(mockAdapter.notifyChanged(anything())).once()
        const [notification] = capture(mockAdapter.notifyChanged).last()
        expect(notification.notifier).toBe(o)
        expect(notification.oldValue).toBe(true)
        expect(notification.newValue).toBe(value)
        expect(notification.position).toBe(-1)
    })

    test("eGetFromID", () => {
        let o = new EReferenceImpl()
        expect(() => o.eGetFromID(-1, true)).toThrow(Error)
        expect(() => o.eGetFromID(EcoreConstants.EREFERENCE__CONTAINER, true)).toThrow(Error)
        expect(() => o.eGetFromID(EcoreConstants.EREFERENCE__CONTAINER, false)).toThrow(Error)
        expect(o.eGetFromID(EcoreConstants.EREFERENCE__CONTAINMENT, true)).toStrictEqual(o.isContainment)
        expect(o.eGetFromID(EcoreConstants.EREFERENCE__EKEYS, true)).toStrictEqual(o.eKeys)
        expect(
            deepEqual(
                o.eGetFromID(EcoreConstants.EREFERENCE__EKEYS, false),
                (o.eKeys as EObjectList<EAttribute>).getUnResolvedList()
            )
        ).toBeTruthy()
        expect(o.eGetFromID(EcoreConstants.EREFERENCE__EOPPOSITE, true)).toStrictEqual(o.eOpposite)
        expect(() => o.eGetFromID(EcoreConstants.EREFERENCE__EREFERENCE_TYPE, true)).toThrow(Error)
        expect(() => o.eGetFromID(EcoreConstants.EREFERENCE__EREFERENCE_TYPE, false)).toThrow(Error)
        expect(o.eGetFromID(EcoreConstants.EREFERENCE__RESOLVE_PROXIES, true)).toStrictEqual(o.isResolveProxies)
    })

    test("eSetFromID", () => {
        let o = new EReferenceImpl()
        expect(() => o.eSetFromID(-1, null)).toThrow(Error)
        {
            let value = true
            o.eSetFromID(EcoreConstants.EREFERENCE__CONTAINMENT, value)
            expect(o.eGetFromID(EcoreConstants.EREFERENCE__CONTAINMENT, false)).toBe(value)
        }
        {
            // list with a value
            let mockValue = mock<EAttributeInternal>()
            let value = instance(mockValue)
            let l = new ImmutableEList<EAttribute>([value])
            when(mockValue.eIsProxy()).thenReturn(false)

            // set list with new contents
            o.eSetFromID(EcoreConstants.EREFERENCE__EKEYS, l)
            // checks
            expect(o.eKeys.size()).toBe(1)
            expect(o.eKeys.get(0)).toBe(value)
        }

        {
            let mockValue = mock<EReferenceInternal>()
            let value = instance(mockValue)
            o.eSetFromID(EcoreConstants.EREFERENCE__EOPPOSITE, value)
            expect(o.eGetFromID(EcoreConstants.EREFERENCE__EOPPOSITE, false)).toBe(value)
        }
        {
            let value = true
            o.eSetFromID(EcoreConstants.EREFERENCE__RESOLVE_PROXIES, value)
            expect(o.eGetFromID(EcoreConstants.EREFERENCE__RESOLVE_PROXIES, false)).toBe(value)
        }
    })

    test("eIsSetFromID", () => {
        let o = new EReferenceImpl()
        expect(() => o.eIsSetFromID(-1)).toThrow(Error)
        expect(() => o.eIsSetFromID(EcoreConstants.EREFERENCE__CONTAINER)).toThrow(Error)
        expect(o.eIsSetFromID(EcoreConstants.EREFERENCE__CONTAINMENT)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.EREFERENCE__EKEYS)).toBeFalsy()
        expect(o.eIsSetFromID(EcoreConstants.EREFERENCE__EOPPOSITE)).toBeFalsy()
        expect(() => o.eIsSetFromID(EcoreConstants.EREFERENCE__EREFERENCE_TYPE)).toThrow(Error)
        expect(o.eIsSetFromID(EcoreConstants.EREFERENCE__RESOLVE_PROXIES)).toBeFalsy()
    })

    test("eUnsetFromID", () => {
        let o = new EReferenceImpl()
        expect(() => o.eUnsetFromID(-1)).toThrow(Error)
        {
            o.eUnsetFromID(EcoreConstants.EREFERENCE__CONTAINMENT)
            let v = o.eGetFromID(EcoreConstants.EREFERENCE__CONTAINMENT, false)
            expect(v).toBe(false)
        }
        {
            o.eUnsetFromID(EcoreConstants.EREFERENCE__EKEYS)
            let v = o.eGetFromID(EcoreConstants.EREFERENCE__EKEYS, false)
            expect(v).not.toBeNull()
            let l = v as EList<EAttribute>
            expect(l.isEmpty()).toBeTruthy()
        }
        {
            o.eUnsetFromID(EcoreConstants.EREFERENCE__EOPPOSITE)
            expect(o.eGetFromID(EcoreConstants.EREFERENCE__EOPPOSITE, false)).toBeNull()
        }
        {
            o.eUnsetFromID(EcoreConstants.EREFERENCE__RESOLVE_PROXIES)
            let v = o.eGetFromID(EcoreConstants.EREFERENCE__RESOLVE_PROXIES, false)
            expect(v).toBe(true)
        }
    })
})
