// *****************************************************************************
// Copyright(c) 2021 MASA Group
//
// This Source Code Form is subject to the terms of the Mozilla Public
// License, v. 2.0. If a copy of the MPL was not distributed with this
// file, You can obtain one at https://mozilla.org/MPL/2.0/.
//
// *****************************************************************************

import { ENotifier, EStructuralFeature } from "./internal.js"

export enum EventType {
    // CREATE An event type indicating that the notifier has been created.
    CREATE = 1,
    // SET An event type indicating that a feature of the notifier has been set.
    SET,
    // UNSET An event type indicating that a feature of the notifier has been set.
    UNSET,
    // ADD An event type indicating that a feature of the notifier has been unset.
    ADD,
    // REMOVE An event type indicating that a feature of the notifier has been set.
    REMOVE,
    // ADD_MANY An event type indicating that a several values have been added into a list-based feature of the notifier..
    ADD_MANY,
    // REMOVE_MANY An event type indicating that a several values have been removed from a list-based feature of the notifier..
    REMOVE_MANY,
    // MOVE An event type indicating that a value has been moved within a list-based feature of the notifier.
    MOVE,
    // REMOVING_ADAPTER An event type indicating that an adapter is being removed from the notifier.
    REMOVING_ADAPTER,
    // RESOLVE An event type indicating that a feature of the notifier has been resolved from a proxy.
    RESOLVE,
    // EVENT_TYPE_COUNT User defined event types should start from this value.
    EVENT_TYPE_COUNT
}

export interface ENotification {
    // the type of change that has occurred.
    readonly eventType: EventType

    // the object affected by the change.
    readonly notifier: ENotifier

    // the object representing the feature of the notifier that has changed.
    readonly feature: EStructuralFeature

    // the numeric ID of the feature relative to the given class, or NO_FEATURE_ID when not applicable.
    readonly featureID: number

    // the value of the notifier's feature before the change occurred.
    // For a list-based feature, this represents a value, or a list of values, removed from the list.
    // For a move, this represents the old position of the moved value.
    readonly oldValue: any

    // the value of the notifier's feature after the change occurred.
    // For a list-based feature, this represents a value, or a list of values, added to the list,
    // an array of int containing the original index of each value in the list of values removed from the list (except for the case of a clear),
    // the value moved within the list, or nill otherwise.
    readonly newValue: any

    // GetPosition Returns the position within a list-based feature at which the change occurred.
    // It returns NO_INDEX when not applicable.
    readonly position: number

    // Merge Returns whether the notification can be and has been merged with this one.
    merge(notification: ENotification): boolean
}
