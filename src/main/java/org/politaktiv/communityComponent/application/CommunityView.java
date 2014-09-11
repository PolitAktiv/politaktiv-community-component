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

package org.politaktiv.communityComponent.application;

public class CommunityView {

	private String name;
	private String id;	
	private String communityUrl;
	private String logoUrl;
	private int memberCount;
	private String actionIcon;
	private String actionText;
	private String action;

	public CommunityView(String name, String id, String communityUrl, String logoUrl,
			int memberCount, String actionIcon, String actionText,
			String actionUrl) {
		this.name = name;
		this.id = id;
		this.communityUrl = communityUrl;
		this.logoUrl = logoUrl;
		this.memberCount = memberCount;
		this.actionIcon = actionIcon;
		this.actionText = actionText;
		this.action = actionUrl;
	}

	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}

	public String getCommunityUrl() {
		return communityUrl;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public String getActionIcon() {
		return actionIcon;
	}

	public String getActionText() {
		return actionText;
	}

	public boolean isActionJoin() {
		return "JOIN".equals(action);
	}
	
	public boolean isActionLeave() {
		return "LEAVE".equals(action);
	}

}
