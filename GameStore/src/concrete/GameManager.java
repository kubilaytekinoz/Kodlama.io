package concrete;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " adl� oyun "+ game.getPrice() + "fiyat�yla eklendi ");
		
	}

}
