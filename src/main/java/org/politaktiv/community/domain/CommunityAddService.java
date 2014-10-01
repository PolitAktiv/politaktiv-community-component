package org.politaktiv.community.domain;

import org.politaktiv.community.application.CommunityViewContainer;
import org.politaktiv.community.application.JoinEvent;
import org.politaktiv.community.application.RequestMembershipEvent;

public interface CommunityAddService {
   
    public CommunityViewContainer joinCommunity(CommunityViewContainer container, JoinEvent event);
    public CommunityViewContainer requestCommunityMembership(CommunityViewContainer container, RequestMembershipEvent event);

}
