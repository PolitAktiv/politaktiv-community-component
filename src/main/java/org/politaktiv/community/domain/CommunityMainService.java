package org.politaktiv.community.domain;

import org.politaktiv.community.application.CommunityViewContainer;
import org.politaktiv.community.application.InitializeEvent;
import org.politaktiv.community.application.SearchEvent;

public interface CommunityMainService {
    

    public <T extends MainCommunitiesRepository> void setCommunitiesRepository(T communitiesRepository);

    public void setMembershipRequestService(MembershipRequestService membershipRequestService);

    public void setShowOtherLimit(int showOtherLimit);

    public CommunityViewContainer initializeView(InitializeEvent initializeEvent);

    public CommunityViewContainer searchCommunity(CommunityViewContainer container, SearchEvent searchEvent);

    public CommunityViewContainer calculateView(CommunityViewContainer container, PortalState currentPortalState);
   
}
