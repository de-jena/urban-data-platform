// Code generated by soft.generator.ts. DO NOT EDIT.

// *****************************************************************************
// Copyright(c) 2024 MASA Group
//
// This Source Code Form is subject to the terms of the Mozilla Public
// License, v. 2.0. If a copy of the MPL was not distributed with this
// file, You can obtain one at https://mozilla.org/MPL/2.0/.
//
// *****************************************************************************

import { EDataType, EEnumLiteral, EList } from "./internal.js"

export interface EEnum extends EDataType {
    // References
    readonly eLiterals: EList<EEnumLiteral>

    // Operations
    getEEnumLiteralByName(name: string): EEnumLiteral
    getEEnumLiteralByValue(value: number): EEnumLiteral
    getEEnumLiteralByLiteral(literal: string): EEnumLiteral
}
