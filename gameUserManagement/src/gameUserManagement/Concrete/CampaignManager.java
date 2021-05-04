package gameUserManagement.Concrete;
import gameUserManagement.Entities.*;
import gameUserManagement.Abstract.*;
public class CampaignManager implements CampaignService {

	
	public void addCampaign(Campaign campaign) {
		System.out.println("The campaign has been saved in the system: "+campaign.getName());
		
	}

	
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Campaign has been deleted from the system: " +campaign.getName());
		
	}

	
	public void updateCampaign(Campaign campaign) {
		System.out.println("Campaign has been updated: " +campaign.getName());
		
	}

}
