package org.politaktiv.community.domain;

public interface AddCommunitiesRepository {
    
    public void joinCommunity(long userId, long communityId);
    public void requestMembershipToCommunity(long currentUserId, long currentCompanyId, long communityId,
            long currentGuestUserId) throws Exception;

}
