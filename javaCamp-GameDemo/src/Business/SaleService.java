package Business;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	public void sale(Game game,Gamer gamer);
	public void saleWithCampaign(Game game, Campaign campaign);

}
