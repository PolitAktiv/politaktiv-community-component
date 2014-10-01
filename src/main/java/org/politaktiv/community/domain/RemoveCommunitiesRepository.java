package org.politaktiv.community.domain;

public interface RemoveCommunitiesRepository {

    public void leaveCommunity(long userId, long communityId);
}
