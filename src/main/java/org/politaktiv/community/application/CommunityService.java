package org.politaktiv.community.application;

import org.politaktiv.community.domain.CommunitiesRepository;
import org.politaktiv.community.domain.PortalState;

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
