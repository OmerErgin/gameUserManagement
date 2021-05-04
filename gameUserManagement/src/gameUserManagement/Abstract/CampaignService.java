package gameUserManagement.Abstract;
import gameUserManagement.Entities.*;
public interface CampaignService {
	void addCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign);
}
