package Main;

import Entities.Campaing;
import Entities.Game;
import Entities.Player;
import Entities.Sale;
import interfaces.PlayerCheckService;
import managers.CampaingManager;
import managers.GameManager;
import managers.PlayerCheckManager;
import managers.PlayerManager;
import managers.SaleManager;

public class Main {

	public static void main(String[] args) {
		GameManager gameManager = new GameManager();
		PlayerCheckService playerCheckService = new PlayerCheckManager();
		PlayerManager playerManager = new PlayerManager(playerCheckService);
		CampaingManager campaingManager = new CampaingManager();
		SaleManager saleManager = new SaleManager();
		
		Game game= new Game (1, "ABC", 120);
		
		Player doga = new Player (2,"dogasac", "123", "124544", 2000);
		
		Campaing campaing = new Campaing(3, "CDE", 30);
		Sale sale = new Sale (120, 30);
		
		gameManager.add(game);
		gameManager.delete(game);
		playerManager.delete(doga);
		playerManager.register(doga);
		playerManager.update(doga);
		playerCheckService.checkIfPlayerReal(doga);

	}

}
