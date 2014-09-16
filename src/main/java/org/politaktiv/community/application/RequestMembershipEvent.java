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

package org.politaktiv.community.application;

import org.politaktiv.community.domain.PortalState;

public class RequestMembershipEvent implements Event{

    long userId;
    long companyId;
    long communityId;
    long guestUserId;
    PortalState portalState;

    public long getUserId() {
        return userId;
    }

    public long getCompanyId() {
        return companyId;
    }

    public long getCommunityId() {
        return communityId;
    }

    public long getGuestUserId() {
        return guestUserId;
    }

    public PortalState getPortalState() {
        return portalState;
    }

    public RequestMembershipEvent(long userId, long companyId, long communityId, long guestUserId,
	    PortalState portalState) {
	this.userId = userId;
	this.companyId = companyId;
	this.communityId = communityId;
	this.guestUserId = guestUserId;
	this.portalState = portalState;
    }
}
