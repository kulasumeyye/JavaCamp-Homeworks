package Business;

import Entities.Campaign;

public class CampaignManager implements CampaignService {

	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi : " + campaign.getCampignName());
		
		
	}

	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getCampignName());
		
	}

	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi : " + campaign.getCampignName());
		
	}

}
