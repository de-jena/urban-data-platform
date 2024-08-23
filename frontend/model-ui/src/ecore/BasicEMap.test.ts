// *****************************************************************************
// Copyright(c) 2021 MASA Group
//
// This Source Code Form is subject to the terms of the Mozilla Public
// License, v. 2.0. If a copy of the MPL was not distributed with this
// file, You can obtain one at https://mozilla.org/MPL/2.0/.
//
// *****************************************************************************

import { instance, mock, when } from "ts-mockito"
import { describe, expect, test } from "vitest"
import { BasicEMap, EMapEntry } from "./internal.js"

describe("BasicEMap", () => {
    test("constructor", () => {
        let m = new BasicEMap<string, string>()
        expect(m).not.toBeNull()
    })

    test("put", () => {
        let m = new BasicEMap<number, string>()
        m.put(2, "2")
        expect(m.toMap()).toEqual(new Map([[2, "2"]]))
    })

    test("getValue", () => {
        let m = new BasicEMap<number, string>()
        m.put(2, "2")
        expect(m.getValue(2)).toBe("2")
    })

    test("removeKey", () => {
        let m = new BasicEMap<number, string>()
        m.put(2, "2")
        expect(m.removeKey(-2)).toBeUndefined()
        expect(m.removeKey(2)).toBe("2")
        expect(m.getValue(2)).toBeUndefined()
        expect(m.removeKey(2)).toBeUndefined()
    })

    test("containsKey", () => {
        let m = new BasicEMap<number, string>()
        m.put(2, "2")
        expect(m.containsKey(2)).toBeTruthy()
        expect(m.containsKey(-2)).toBeFalsy()
    })

    test("containsValue", () => {
        let m = new BasicEMap<number, string>()
        m.put(2, "2")
        expect(m.containsValue("2")).toBeTruthy()
        expect(m.containsValue("-2")).toBeFalsy()
    })

    test("addEntry", () => {
        let m = new BasicEMap<number, string>()
        let mockEntry = mock<EMapEntry<number, string>>()
        let entry = instance(mockEntry)
        when(mockEntry.key).thenReturn(2)
        when(mockEntry.value).thenReturn("2")
        m.add(entry)
        expect(m.toMap()).toEqual(new Map([[2, "2"]]))
    })

    test("setEntry", () => {
        let m = new BasicEMap<number, string>()
        let mockEntry1 = mock<EMapEntry<number, string>>()
        let entry1 = instance(mockEntry1)
        when(mockEntry1.key).thenReturn(2)
        when(mockEntry1.value).thenReturn("2")
        m.add(entry1)

        let mockEntry2 = mock<EMapEntry<number, string>>()
        let entry2 = instance(mockEntry2)
        when(mockEntry2.key).thenReturn(3)
        when(mockEntry2.value).thenReturn("3")
        m.set(0, entry2)

        expect(m.toMap()).toEqual(new Map([[3, "3"]]))
    })

    test("updateEntry", () => {
        let m = new BasicEMap<number, string>()
        m.put(2, "2")
        let e = m.get(0)
        e.key = 2
        e.value = "2"
    })

    test("clear", () => {
        let m = new BasicEMap<number, string>()
        let mockEntry = mock<EMapEntry<number, string>>()
        let entry = instance(mockEntry)
        when(mockEntry.key).thenReturn(2)
        when(mockEntry.value).thenReturn("2")
        m.add(entry)

        m.clear()
        expect(m.toMap()).toEqual(new Map())
        expect(m.getValue(2)).toBeUndefined()
    })
})
