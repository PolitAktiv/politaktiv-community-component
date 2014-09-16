package org.politaktiv.community.application;

public interface MembershipRequestService {
    
    public boolean isUserMembershipRequestPending(long userId, long communityId) throws Exception;
}
