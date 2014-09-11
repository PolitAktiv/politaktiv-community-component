/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.politaktiv.communityComponent.domain;

import java.io.IOException;

import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.ValidatorException;

public class PreferencesRepository {

	/**
	 * Set value and store directly
	 * 
	 * @param name
	 * @param value
	 * @throws ReadOnlyException
	 * @throws ValidatorException
	 * @throws IOException
	 */
	public void setValueAndStore(PortletPreferences preferences, String name, String value)
			throws ReadOnlyException, ValidatorException, IOException {
		this.setValue(preferences, name, value);
		this.store(preferences);
	}

	/**
	 * Set a value - don't forget to store!
	 * 
	 * @param name
	 *            name of value
	 * @param parameter
	 *            value
	 * @throws ReadOnlyException
	 */
	private void setValue(PortletPreferences preferences, String name, String value) throws ReadOnlyException {
		preferences.setValue(name, value);

	}

	/**
	 * Storing set values
	 * 
	 * @throws ValidatorException
	 * @throws IOException
	 */
	private void store(PortletPreferences preferences) throws ValidatorException, IOException {
		preferences.store();
	}
}
