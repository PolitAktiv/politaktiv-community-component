package org.politaktiv.community.domain;

import java.util.List;

public interface CommunitiesRepository {
       
    public List<Community> findCommunitiesByCompanyId(long companyId);
    public void joinCommunity(long userId, long communityId);
    public void requestMembershipToCommunity(long currentUserId, long currentCompanyId, long communityId,
            long currentGuestUserId) throws Exception;

}
