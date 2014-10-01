package org.politaktiv.community.domain;

import java.util.List;

public interface MainCommunitiesRepository {
       
    public List<Community> findCommunitiesByCompanyId(long companyId);
    public List<Community> findCommunitiesByCompanyIdAndSearchString(long companyId, String searchString);

}
