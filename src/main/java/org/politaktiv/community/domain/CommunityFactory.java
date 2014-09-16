package org.politaktiv.community.domain;

public interface CommunityFactory {
    
    public Community createCommunity(String name, long communityId, long logoFolderId, 
            int memberCount, String friendlyUrl, int type);

    public Community createCommunity(String name, long communityId, int memberCount,
            String friendlyURL, int type);
}
