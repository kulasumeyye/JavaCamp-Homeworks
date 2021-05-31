package UI;

import Adapters.MernisServiceAdapter;
import Business.CampaignManager;
import Business.GameManager;
import Business.GamerManager;
import Business.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
				Gamer gamer = new Gamer(1,"Sümeyye","Kula",1997,"1234");
				
				Game game = new Game(1,1,"game1","strateji",20);
				
				Campaign campaign = new Campaign(1,"indirim1",50);
				
			
				
				GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
				gamerManager.add(gamer);
				
				GameManager gameManager = new GameManager();
				gameManager.add(game);
				
				SaleManager saleManager = new SaleManager(new CampaignManager());
				saleManager.sale(game, gamer);
				saleManager.saleWithCampaign(game, campaign);
				
				

	}

}
