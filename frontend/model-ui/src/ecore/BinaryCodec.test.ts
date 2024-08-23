import { mock } from "ts-mockito"
import { describe, expect, test } from "vitest"
import { BinaryCodec, EResource } from "./internal.js"

describe("BinaryCodec", () => {
    test("newEncoder", () => {
        let c = new BinaryCodec()
        let resource = mock<EResource>()
        let d = c.newDecoder(resource, null)
        expect(d).not.toBeNull()
    })

    test("newDecoder", () => {
        let c = new BinaryCodec()
        let resource = mock<EResource>()
        let d = c.newEncoder(resource, null)
        expect(d).not.toBeNull()
    })
})
