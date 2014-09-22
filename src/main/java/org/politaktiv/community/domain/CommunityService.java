package org.politaktiv.community.domain;

import org.politaktiv.community.application.CommunityViewContainer;
import org.politaktiv.community.application.InitializeEvent;
import org.politaktiv.community.application.JoinEvent;
import org.politaktiv.community.application.LeaveEvent;
import org.politaktiv.community.application.RequestMembershipEvent;
import org.politaktiv.community.application.SearchEvent;

public interface CommunityService {
    

    public void setCommunitiesRepository(CommunitiesRepository repository);

    public void setMembershipRequestService(MembershipRequestService membershipRequestService);

    public void setShowOtherLimit(int showOtherLimit);

    public CommunityViewContainer initializeView(InitializeEvent initializeEvent);

    public CommunityViewContainer searchCommunity(CommunityViewContainer container, SearchEvent searchEvent);

    public CommunityViewContainer calculateView(CommunityViewContainer container, PortalState currentPortalState);
   
    public CommunityViewContainer joinCommunity(CommunityViewContainer container, JoinEvent event);

    public CommunityViewContainer leaveCommunity(CommunityViewContainer container, LeaveEvent event);

    public CommunityViewContainer requestCommunityMembership(CommunityViewContainer container,
        RequestMembershipEvent event); 

}
