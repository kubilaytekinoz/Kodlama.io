package concrete;

import abstracts.UserService;
import entities.User;

public class UserManager implements UserService {
	private User user;
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" kaydedildi");
		
}
	

}
