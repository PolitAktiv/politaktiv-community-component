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

package org.politaktiv.community.domain;

import java.util.Set;

public class PortalState {
    boolean signedIn;
    String portalUrl;
    boolean i18n;
    String i18nPath;
    String doAsUserId;
    long userId;
    Set<Long> groupIds;
    
    public PortalState(boolean signedIn, String portalUrl, boolean i18n, String i18nPath, String doAsUserId, long userId, Set<Long> groupIds) {
	this.signedIn = signedIn;
	this.portalUrl = portalUrl;
	this.i18n = i18n;
	this.i18nPath = i18nPath;
	this.doAsUserId = doAsUserId;
	this.userId = userId;
    this.groupIds = groupIds;
    }

    public boolean isSignedIn() {
        return signedIn;
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
    
    public long getUserId(){
        return userId;
    }
    
    public Set<Long> getGroupIds(){
        return groupIds;
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
	result = prime * result + (int)userId;
	result = prime * result + ((groupIds == null) ? 0 : groupIds.hashCode());
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
	if (userId != other.getUserId()) {
		return false;
	} else if (groupIds != null){
	    if (!other.getGroupIds().equals(groupIds))
	        return false;
	}
	return true;
    }
}