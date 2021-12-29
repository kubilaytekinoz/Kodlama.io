package concrete;

import abstracts.CampaignService;
import entities.Campaign;
import entities.Game;

public class CampaignManager implements CampaignService{

	@Override
	public void campaignDiscountRate(Game game,Campaign campaign) {
		System.out.println(game.getGameName() + " adl� oyuna indirim tan�mland� ("+campaign.getCampaignId()+"). Yeni fiyat� " + 
				(game.getPrice()*(100-campaign.getDiscountRate())/100));
		
		
	}

}
