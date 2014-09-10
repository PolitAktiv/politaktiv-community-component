package org.politaktiv.communityComponent.application;

import org.politaktiv.communityLiferayAdapter.MembershipRequestServiceAdapter;

public class MembershipRequestService {
    MembershipRequestServiceAdapter adapter = new MembershipRequestServiceAdapter();
    
    public boolean isUserMembershipRequestPending(long userId, long communityId)
            throws Exception {
        return adapter.isUserMembershipRequestPending(userId, communityId);
        
    }
}
