package managers;

import Entities.Player;
import interfaces.PlayerCheckService;

public class PlayerCheckManager implements PlayerCheckService{



	@Override
	public boolean checkIfPlayerReal(Player player) {

		if(player.getNationalId() == player.getNationalId()) {
			System.out.println("National id is true and you can play this game");
			
		}else  {
			System.out.println("National id is not true and you cannot play this game");
		}
		return false;
	

		
	}

	

}
