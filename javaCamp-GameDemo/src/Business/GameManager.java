package Business;

import Entities.Game;

public class GameManager implements GameService {

	public void add(Game game) {
		System.out.println("Oyun eklendi : " + game.getGameName());
		
	}

	public void delete(Game game) {
		System.out.println("Oyun silindi : " + game.getGameName());
		
	}

	public void update(Game game) {
		System.out.println("Oyun güncellendi : " + game.getGameName());
		
		
	}

}
