package gameUserManagement.Abstract;

import gameUserManagement.Entities.*;

public interface GameService {
	void addGame(Game game);
	void deleteGame(Game game);
	void updateGame(Game game);
}
