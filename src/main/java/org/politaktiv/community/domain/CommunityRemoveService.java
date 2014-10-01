package org.politaktiv.community.domain;

import org.politaktiv.community.application.CommunityViewContainer;
import org.politaktiv.community.application.LeaveEvent;

public interface CommunityRemoveService {

    public CommunityViewContainer leaveCommunity(CommunityViewContainer container, LeaveEvent event);
    
}
