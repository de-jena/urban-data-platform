/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */

package de.dim.trafficos.gtfs.component.helper;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author ilenia
 * @since Jul 24, 2023
 */
public class GTFSHelper {
	
	public static String getDataFolder() {
		if(System.getProperty("gecko.data.dir") != null) {
			return System.getProperty("gecko.data.dir") + "/";
		} else if(System.getProperty("base.path") != null) {
			return System.getProperty("base.path") + "/data/";
		} else {
			if(!new File(System.getProperty("user.home") + "/data/").exists()) {
				try {
					new File(System.getProperty("user.home") + "/data/").createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return System.getProperty("user.home") + "/data/";
		}
	}

}
