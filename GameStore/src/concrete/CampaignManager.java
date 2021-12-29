package concrete;

import abstracts.CampaignService;
import entities.Campaign;
import entities.Game;

public class CampaignManager implements CampaignService{

	@Override
	public void campaignDiscountRate(Game game,Campaign campaign) {
		System.out.println(game.getGameName() + " adlý oyuna indirim tanýmlandý ("+campaign.getCampaignId()+"). Yeni fiyatý " + 
				(game.getPrice()*(100-campaign.getDiscountRate())/100));
		
		
	}

}
