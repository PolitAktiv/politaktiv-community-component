package org.politaktiv.community.domain;

public interface MembershipRequestService {
    
    public boolean isUserMembershipRequestPending(long userId, long communityId) throws Exception;
}
