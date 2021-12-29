package concrete;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " adlý oyun "+ game.getPrice() + "fiyatýyla eklendi ");
		
	}

}
