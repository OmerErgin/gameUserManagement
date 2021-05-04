package gameUserManagement.Concrete;
import gameUserManagement.Abstract.*;
import gameUserManagement.Entities.*;
public class GameManager implements GameService {
	
	public void addGame(Game game) {
		System.out.println("Game listed: "+game.getGameName());
		
	}

	
	public void deleteGame(Game game) {
		System.out.println("Game deleted: "+game.getGameName());
		
	}

	
	public void updateGame(Game game) {
		System.out.println("Game updated: "+game.getGameName());
		
	}
}
