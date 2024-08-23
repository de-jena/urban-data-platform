// *****************************************************************************
// Copyright(c) 2021 MASA Group
//
// This Source Code Form is subject to the terms of the Mozilla Public
// License, v. 2.0. If a copy of the MPL was not distributed with this
// file, You can obtain one at https://mozilla.org/MPL/2.0/.
//
// *****************************************************************************

import { anything, capture, instance, mock, verify, when } from "ts-mockito"
import { beforeEach, describe, expect, test } from "vitest"
import {
    AbstractENotifier,
    AbstractENotifierList,
    EAdapter,
    EList,
    ENotification,
    EventType,
    ImmutableEList
} from "./internal.js"

describe("AbstractENotifierList", () => {
    let mockNotifier = mock<AbstractENotifier>()
    let notifier = instance(mockNotifier)
    let l: AbstractENotifierList = null
    beforeEach(() => {
        l = new AbstractENotifierList(notifier)
        expect(l).not.toBeNull()
    })

    test("add", () => {
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        l.add(adapter)
        expect(adapter.target).toBe(notifier)
    })

    test("remove-notification", () => {
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        // add adapter
        l.add(adapter)
        expect(adapter.target).toBe(notifier)

        // remove adapter
        l.remove(adapter)
        verify(mockAdapter.notifyChanged(anything())).once()
        verify(mockAdapter.unsetTarget(notifier)).once()
        let [n] = capture(mockAdapter.notifyChanged).last()
        expect(n).not.toBeNull()
        expect(n.notifier).toBe(notifier)
        expect(n.eventType).toBe(EventType.REMOVING_ADAPTER)
        expect(n.oldValue).toBe(adapter)
        expect(n.newValue).toBeNull()
        expect(n.position).toBe(0)
        expect(n.featureID).toBe(-1)
        expect(n.feature).toBeNull()
    })

    test("remove", () => {
        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        // add adapter
        l.add(adapter)
        expect(adapter.target).toBe(notifier)

        // remove adapter
        notifier.eDeliver = false
        l.remove(adapter)
        verify(mockAdapter.notifyChanged(anything())).never()
        verify(mockAdapter.unsetTarget(notifier)).once()
    })

    test("toJSON", () => {
        expect(l.toJSON()).toStrictEqual({})
    })
})

class ENotifierTest extends AbstractENotifier {}

class ENotifierTestImpl extends ENotifierTest {
    deliver: boolean
    adapters: EList<EAdapter>

    constructor() {
        super()
        this.deliver = false
        this.adapters = null
    }

    get eDeliver(): boolean {
        return this.deliver
    }

    set eDeliver(eDeliver: boolean) {
        super.eDeliver = eDeliver
    }

    protected eBasicAdapters(): EList<EAdapter> {
        return this.adapters
    }
}

describe("AbstractENotifier", () => {
    test("constructor", () => {
        expect(new ENotifierTest()).not.toBeNull()
    })
    describe("eDeliver ", () => {
        test("get", () => {
            let n = new ENotifierTest()
            expect(n.eDeliver).toBeFalsy()
        })
        test("set", () => {
            let n = new ENotifierTest()
            expect(() => {
                n.eDeliver = true
            }).toThrow(Error)
        })
    })
    test("eAdapters", () => {
        let n = new ENotifierTest()
        expect(n.eAdapters).not.toBeNull()
        expect(n.eAdapters.isEmpty()).toBeTruthy()
    })
    describe("eNotificationRequired", () => {
        test("default", () => {
            let n = new ENotifierTest()
            expect(n.eNotificationRequired).toBeFalsy()
        })
        test("deliver", () => {
            let n = new ENotifierTestImpl()
            n.deliver = true
            expect(n.eNotificationRequired).toBeFalsy()
        })
        test("adapters", () => {
            let n = new ENotifierTestImpl()
            let mockAdapters = mock<EList<EAdapter>>()
            let instanceAdapters = instance(mockAdapters)
            n.deliver = true
            n.adapters = instanceAdapters
            when(mockAdapters.isEmpty()).thenReturn(true)
            expect(n.eNotificationRequired).toBeFalsy()

            when(mockAdapters.isEmpty()).thenReturn(false)
            expect(n.eNotificationRequired).toBeTruthy()

            verify(mockAdapters.isEmpty()).twice()
        })
    })
    test("eNotify", () => {
        let n = new ENotifierTestImpl()
        let mockNotification = mock<ENotification>()
        let notification = instance(mockNotification)
        n.eNotify(notification)

        let mockAdapter = mock<EAdapter>()
        let adapter = instance(mockAdapter)
        n.deliver = true
        n.adapters = new ImmutableEList<EAdapter>([adapter])
        n.eNotify(notification)
        verify(mockAdapter.notifyChanged(notification)).once()
    })
})
