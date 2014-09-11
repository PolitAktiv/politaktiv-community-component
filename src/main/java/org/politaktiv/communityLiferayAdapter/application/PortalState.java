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

package org.politaktiv.communityLiferayAdapter.application;

import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;

public class PortalState {
    boolean signedIn;
    User user;
    String portalUrl;
    boolean i18n;
    String i18nPath;
    String doAsUserId;

    public PortalState(boolean signedIn, User user, String portalUrl, boolean i18n, String i18nPath, String doAsUserId) {
	this.signedIn = signedIn;
	this.user = user;
	this.portalUrl = portalUrl;
	this.i18n = i18n;
	this.i18nPath = i18nPath;
	this.doAsUserId = doAsUserId;
    }

    public PortalState(ThemeDisplay themeDisplay) {
	this(themeDisplay.isSignedIn(), themeDisplay.getUser(), themeDisplay.getPortalURL(), themeDisplay.isI18n(),
		themeDisplay.getI18nPath(), themeDisplay.getDoAsUserId());
    }

    public boolean isSignedIn() {
	return signedIn;
    }

    public User getUser() {
	return user;
    }

    public boolean isI18n() {
	return i18n;
    }

    public String getI18nPath() {
	return i18nPath;
    }

    public String getDoAsUserId() {
	return doAsUserId;
    }

    public String getPortalUrl() {
	return portalUrl;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((doAsUserId == null) ? 0 : doAsUserId.hashCode());
	result = prime * result + (i18n ? 1231 : 1237);
	result = prime * result + ((i18nPath == null) ? 0 : i18nPath.hashCode());
	result = prime * result + ((portalUrl == null) ? 0 : portalUrl.hashCode());
	result = prime * result + (signedIn ? 1231 : 1237);
	result = prime * result + ((user == null) ? 0 : user.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	PortalState other = (PortalState) obj;
	if (doAsUserId == null) {
	    if (other.doAsUserId != null)
		return false;
	} else if (!doAsUserId.equals(other.doAsUserId))
	    return false;
	if (i18n != other.i18n)
	    return false;
	if (i18nPath == null) {
	    if (other.i18nPath != null)
		return false;
	} else if (!i18nPath.equals(other.i18nPath))
	    return false;
	if (portalUrl == null) {
	    if (other.portalUrl != null)
		return false;
	} else if (!portalUrl.equals(other.portalUrl))
	    return false;
	if (signedIn != other.signedIn)
	    return false;
	if (user == null) {
	    if (other.user != null)
		return false;
	} else if (!user.equals(other.user))
	    return false;
	return true;
    }
}