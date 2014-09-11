/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.politaktiv.communityComponent.domain;

import java.util.List;

import org.politaktiv.communityLiferayAdapter.CommunitiesRepositoryAdapter;


public class CommunitiesRepository {

	CommunitiesRepositoryAdapter adapter = new CommunitiesRepositoryAdapter();
	
	public List<Community> findCommunitiesByCompanyId(long companyId){
	   return adapter.findCommunitiesByCompanyId(companyId);
	}
	
	public void joinCommunity(long userId, long communityId){
	    adapter.joinCommunity(userId, communityId);
	}
	
	public void leaveCommunity(long userId, long communityId){
	    adapter.leaveCommunity(userId, communityId);
	}
	
	public List<Community> findCommunitiesByCompanyIdAndSearchString(long companyId, String searchString) {
	    return adapter.findCommunitiesByCompanyIdAndSearchString(companyId, searchString);
	}
	
	public void requestMembershipToCommunity(long currentUserId, long currentCompanyId, long communityId,
	        long currentGuestUserId) throws Exception{
	    adapter.requestMembershipToCommunity(currentUserId, currentCompanyId, communityId, currentGuestUserId);
	}
}       
		