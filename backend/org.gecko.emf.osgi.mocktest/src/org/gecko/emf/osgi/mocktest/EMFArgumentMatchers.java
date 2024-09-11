/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.gecko.emf.osgi.mocktest;

import static org.mockito.ArgumentMatchers.argThat;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;

public class EMFArgumentMatchers {

	private EMFArgumentMatchers() {
	}

	/**
	 * <code>EObject</code> argument that is equal to the given EObject.
	 * <p>
	 * See examples in javadoc for {@link ArgumentMatchers} class
	 *
	 * @param EObject to be equal.
	 * @return EObject.
	 */
	public static EObject eqEObject(EObject eObject) {
		return argThat(new EqualsEObject(eObject));
	}

	static class EqualsEObject implements ArgumentMatcher<EObject> {
		private EObject eObject;

		public EqualsEObject(EObject eObject) {
			this.eObject = eObject;
		}

		public boolean matches(EObject eObject) {
			return EcoreUtil.equals(this.eObject, eObject);
		}

		public String toString() {
			// printed in verification errors
			return "[EObjects not equal]";

		}
	}
}
