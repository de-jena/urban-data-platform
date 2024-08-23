// *****************************************************************************
// Copyright(c) 2021 MASA Group
//
// This Source Code Form is subject to the terms of the Mozilla Public
// License, v. 2.0. If a copy of the MPL was not distributed with this
// file, You can obtain one at https://mozilla.org/MPL/2.0/.
//
// *****************************************************************************

import { EAdapter, EList, ENotification } from "./internal.js"

export interface ENotifier {
    // list of the adapters associated with this notifier.
    readonly eAdapters: EList<EAdapter>

    // whether this notifier will deliver notifications to the adapters.
    eDeliver: boolean

    // Notifies a change to a feature of this notifier as described by the notification.
    eNotify(notification: ENotification): void
}
