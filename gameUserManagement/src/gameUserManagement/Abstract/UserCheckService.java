package gameUserManagement.Abstract;
import gameUserManagement.Entities.User;

public interface UserCheckService {
	boolean checkIfRealPerson(User user);
}
