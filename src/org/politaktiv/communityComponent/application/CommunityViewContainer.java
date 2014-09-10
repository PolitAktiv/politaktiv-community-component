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

import java.util.ArrayList;
import java.util.List;

import org.politaktiv.communityLiferayAdapter.application.PortalState;

public class CommunityViewContainer {

    List<CommunityView> memberCommunityViews;
    List<CommunityView> nonMemberOpenCommunityViews;
    List<CommunityView> openCommunityViews;
    List<CommunityView> restrictedCommunityViews;
    long currentCompanyId;
    PortalState portalState;
    String nameToSearch;

    public CommunityViewContainer(long currentCompanyId, String nameToSearch, PortalState portalState) {
	resetResults();
	this.currentCompanyId = currentCompanyId;
	this.nameToSearch = nameToSearch;
	this.portalState = portalState;
    }

    public void addMemberCommunity(CommunityView communityView) {
	memberCommunityViews.add(communityView);
    }

    public List<CommunityView> getMemberCommunities() {
	return memberCommunityViews;
    }

    public int getMemberCommunitySize() {
	return memberCommunityViews.size();
    }
    
    public void addNonMemberOpenCommunity(CommunityView communityView) {
	nonMemberOpenCommunityViews.add(communityView);
    }

    public List<CommunityView> getNonMemberOpenCommunities() {
	return nonMemberOpenCommunityViews;
    }

    public void addRestrictedCommunity(CommunityView communityView) {
	restrictedCommunityViews.add(communityView);
    }

    public List<CommunityView> getRestrictedCommunities() {
	return restrictedCommunityViews;
    }

    public void addOpenCommunity(CommunityView communityView) {
	openCommunityViews.add(communityView);
    }

    public List<CommunityView> getOpenCommunities() {
	return openCommunityViews;
    }

    public boolean isDirty(PortalState portalState) {
	return !this.portalState.equals(portalState);
    }

    public void setPortalState(PortalState portalState) {
	this.portalState = portalState;
    }

    public PortalState getPortalState() {
	return portalState;
    }

    public long getCurrentCompanyId() {
	return currentCompanyId;
    }

    public void setNameToSearch(String nameToSearch) {
	this.nameToSearch = nameToSearch;
    }

    public String getNameToSearch() {
	return nameToSearch;
    }

    public void resetResults() {
	memberCommunityViews = new ArrayList<CommunityView>();
	nonMemberOpenCommunityViews = new ArrayList<CommunityView>();
	restrictedCommunityViews = new ArrayList<CommunityView>();
	openCommunityViews = new ArrayList<CommunityView>();
    }
}
