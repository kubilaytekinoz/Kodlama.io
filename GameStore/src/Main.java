import concrete.CampaignManager;
import concrete.GameManager;
import concrete.SaleManager;
import concrete.UserManager;
import entities.Campaign;
import entities.Game;
import entities.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"22891095736","Kubilay","Tekin�z","1994");
		Game game = new Game(1,"Counter Strike",7000);
		Campaign campaign = new Campaign(1,"Muhte�em K�� �ndirimleri",50);
		UserManager userManager = new UserManager();
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		SaleManager saleManager = new SaleManager();
		userManager.add(user);
		gameManager.add(game);
		campaignManager.campaignDiscountRate(game, campaign);
		saleManager.sale(user, game, campaign);
		

	}

}
