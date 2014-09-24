package org.politaktiv.community.domain;

import org.politaktiv.community.application.CommunityViewContainer;
import org.politaktiv.community.application.InitializeEvent;
import org.politaktiv.community.application.JoinEvent;
import org.politaktiv.community.application.RequestMembershipEvent;

public interface CommunityService {
    

    public void setMembershipRequestService(MembershipRequestService membershipRequestService);

    public void setShowOtherLimit(int showOtherLimit);

    public CommunityViewContainer initializeView(InitializeEvent initializeEvent);
    
    public CommunityViewContainer calculateView(CommunityViewContainer container, PortalState currentPortalState);
   
    public CommunityViewContainer joinCommunity(CommunityViewContainer container, JoinEvent event);

    public CommunityViewContainer requestCommunityMembership(CommunityViewContainer container, RequestMembershipEvent event);
    

}
