package org.politaktiv.communityComponent.application;

import org.politaktiv.communityComponent.domain.CommunitiesRepository;
import org.politaktiv.communityLiferayAdapter.CommunityServiceAdapter;
import org.politaktiv.communityLiferayAdapter.application.PortalState;


public class CommunityService {
    CommunityServiceAdapter adapter = new CommunityServiceAdapter();
    
    public void setCommunitiesRepository(CommunitiesRepository repository) {
        adapter.setCommunitiesRepository(repository);
    }
    
    public void setMembershipRequestService(MembershipRequestService membershipRequestService) {
        adapter.setMembershipRequestService(membershipRequestService);
    }
    
    public void setShowOtherLimit(int showOtherLimit) {
        adapter.setShowOtherLimit(showOtherLimit);
    }
    
    public CommunityViewContainer initializeView(InitializeEvent initializeEvent) throws Exception {
        return adapter.initializeView(initializeEvent);
    }
    
    public CommunityViewContainer searchCommunity(CommunityViewContainer container, SearchEvent searchEvent)
            throws Exception {
        return adapter.searchCommunity(container, searchEvent);
    }
    
    public CommunityViewContainer calculateView(CommunityViewContainer container, PortalState currentPortalState)
            throws Exception {
        return adapter.calculateView(container, currentPortalState);
    }
    
    public CommunityViewContainer joinCommunity(CommunityViewContainer container, JoinEvent event)
            throws Exception {
        return adapter.joinCommunity(container, event);
    }
    
    public CommunityViewContainer leaveCommunity(CommunityViewContainer container, LeaveEvent event)
            throws Exception {
        return adapter.leaveCommunity(container, event);
    }
    
    public CommunityViewContainer requestCommunityMembership(CommunityViewContainer container,
            RequestMembershipEvent event) throws Exception {
        return adapter.requestCommunityMembership(container, event);
    }



}
