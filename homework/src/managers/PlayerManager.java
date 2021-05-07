package managers;

import Entities.Player;
import interfaces.PlayerCheckService;
import interfaces.PlayerService;

public class PlayerManager implements PlayerService{

	public PlayerManager(PlayerCheckService playerCheckService) {
		
	}

	@Override
	public void register(Player player) {
		System.out.println(player.getUserName() + " has already registered with " + player.getId());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getUserName() + " deleted ");
	 
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getUserName() + "has already updated with" + player.getId());
		
	}
	

}
