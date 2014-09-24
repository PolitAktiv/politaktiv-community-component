package org.politaktiv.community.application;

import org.politaktiv.community.domain.PortalState;

public class AfterPageRefreshEvent implements Event{

    long userId;
    long communityId;
    PortalState portalState;
    
    public AfterPageRefreshEvent(long userId, long communityId, PortalState portalState) {
        this.userId = userId;
        this.communityId = communityId;
        this.portalState = portalState;
    }
    
    public long getUserId() {
        return userId;
    }
    public long getCommunityId() {
        return communityId;
    }
    public PortalState getPortalState() {
        return portalState;
    }
    
}
