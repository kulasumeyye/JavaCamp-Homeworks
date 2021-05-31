package Business;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {


	private CampaignService campaignService;
	
	
	
  public SaleManager(CampaignService campaignService) {
		super();
		this.campaignService = campaignService;
	}


	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getGameName() + " Oyunu " + gamer.getFirstName() + "kullan�c�s� taraf�ndan sat�n al�nd�.");
	}

	
	public void saleWithCampaign(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " Oyunu " + campaign.getCampignName() + "kampanyas� ile sat�n al�nd�." + " %" + campaign.getDiscount() + "indirim");
	}

	
	

}
