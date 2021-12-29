package concrete;

import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.User;

public class SaleManager implements SaleService {

	@Override
	public void sale(User user, Game game, Campaign campaign) {
		double discPrice = game.getPrice() * (100-campaign.getDiscountRate())/100;
		
		System.out.println(user.getFirstName() + " adl� kullan�c� " + game.getGameName() + " oyununu " + discPrice +" fiyat�yla sat�n ald�");
		
	}

}
