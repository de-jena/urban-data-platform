// Code generated by soft.generator.ts. DO NOT EDIT.

// *****************************************************************************
// Copyright(c) 2024 MASA Group
//
// This Source Code Form is subject to the terms of the Mozilla Public
// License, v. 2.0. If a copy of the MPL was not distributed with this
// file, You can obtain one at https://mozilla.org/MPL/2.0/.
//
// *****************************************************************************

import { ENamedElement, EPackage } from "./internal.js"

export interface EClassifier extends ENamedElement {
    // Attributes
    instanceClassName: string
    instanceClass: any
    instanceTypeName: string
    readonly defaultValue: any
    classifierID: number

    // References
    readonly ePackage: EPackage

    // Operations
    isInstance(object: any): boolean
}
