package gameUserManagement;
import gameUserManagement.Entities.*;
import gameUserManagement.Concrete.*;
public class Main {

	public static void main(String[] args) {
		
		UserManager userManager=new UserManager(new UserCheckManager());
		userManager.addUser(new User(1, "Ömer", "Ergin", "denemedeneme@deneme.com", "123456", 2000,Long.parseLong("98765432199")));
		
		User user1=new User(1, "Deneme", "Deneme", "denemedeneme@deneme.com", "123456", 1990,Long.parseLong("12345678911"));
		
		Campaign campaign1=new Campaign(3,"Ramazan Kampanyasi",3,0.12);
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.addCampaign(campaign1);
		
		Game game1=new Game(22, "Total War: Warhammer", 120);
		
		GameManager gameManager=new GameManager();
		gameManager.addGame(game1);
		
		Order order1=new Order(30,34242341);
		OrderManager orderManager=new OrderManager();
		orderManager.bargainSale(user1, game1, campaign1, order1);
		
	}

}
