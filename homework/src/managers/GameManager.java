package managers;

import Entities.Game;
import interfaces.GameService;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " added with " + game.getPrice() + " price");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " deleted ");
		
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " updated with " + game.getPrice());
		
	}

}
