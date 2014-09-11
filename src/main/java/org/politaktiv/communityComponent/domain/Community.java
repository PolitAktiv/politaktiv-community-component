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

import org.politaktiv.communityLiferayAdapter.application.CommunityConstants;

/**
 * Community model with | name | groupId | logoFolderId | memberCount | for view
 * @author eichi
 *
 */
/**
 * @author politaktiv
 *
 */
public class Community{

	private String name;
	private long communityId;
	private long logoFolderId;
	private int memberCount;
	private String friendlyUrl;
	private boolean hasLogo = false;
	private boolean isOpenCommunity = false;
	private boolean isRescritedCommunity = false;
	
	/**
	 * General Community
	 * @param name
	 * @param communityId
	 * @param logoId
	 * @param memberCount
	 * @param friendlyUrl
	 * @param type
	 */
	public Community(String name, long communityId, long logoFolderId, int memberCount, String friendlyUrl, int type){
		this.name = name;
		this.communityId = communityId;
		this.logoFolderId = logoFolderId;
		this.memberCount = memberCount;
		this.friendlyUrl = friendlyUrl;
		this.hasLogo = true;
		
		if(type == CommunityConstants.TYPE_SITE_OPEN)
			this.isOpenCommunity = true;
		
		if(type == CommunityConstants.TYPE_SITE_RESTRICTED)
			this.isRescritedCommunity = true;
	}
	
	/**
	 * Community without a logo
	 * @param name
	 * @param communityId
	 * @param memberCount
	 * @param friendlyUrl
	 * @param type
	 */
	public Community(String name, long communityId , int memberCount, String friendlyUrl, int type){
		this.name = name;
		this.communityId = communityId;
		this.memberCount = memberCount;
		this.friendlyUrl = friendlyUrl;
		
		if(type == CommunityConstants.TYPE_SITE_OPEN)
			this.isOpenCommunity = true;
		
		if(type == CommunityConstants.TYPE_SITE_RESTRICTED)
			this.isRescritedCommunity = true;
	}

	/**
	 * @return if community has logo
	 */
	public boolean hasLogo(){
		return this.hasLogo;
	}
	
	/**
	 * @return the title
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the groupId
	 */
	public long getCommunityId() {
		return this.communityId;
	}

	/**
	 * @return the logoId
	 */
	public long getLogoFolderId() {
		return this.logoFolderId;
	}

	/**
	 * @return the memberCount
	 */
	public int getMemberCount() {
		return this.memberCount;
	}
	/**
	 * @return the friendly url
	 */
	public String getFriendlyUrl(){
		return this.friendlyUrl;
	}
	/**
	 * @return weather its a open community or not
	 */
	public boolean isOpenCommunity(){
		return this.isOpenCommunity;
	}
	/**
	 * @return weather its a restricted community or not
	 */
	public boolean isRestrictedCommunity(){
		return this.isRescritedCommunity;
	}
}
