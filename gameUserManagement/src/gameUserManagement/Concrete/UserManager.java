package gameUserManagement.Concrete;
import gameUserManagement.Entities.*;
import gameUserManagement.Abstract.*;
public class UserManager implements UserService {
	
	private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService=userCheckService;
	}
	
	public void addUser(User user) {
		if(userCheckService.checkIfRealPerson(user)) {
			System.out.println("User created: "+user.getFirstName());
		}else {
			System.out.println("Verification failed!");
		}
			
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("User deleted: "+user.getFirstName());
		
	}

	@Override
	public void updateUser(User user) {
		System.out.println("User deleted: "+user.getFirstName());
		
	}

}
