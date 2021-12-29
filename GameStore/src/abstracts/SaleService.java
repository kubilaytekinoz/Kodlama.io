package abstracts;

import entities.Campaign;
import entities.Game;
import entities.User;

public interface SaleService {
	public void sale(User user,Game game,Campaign campaign);

}
