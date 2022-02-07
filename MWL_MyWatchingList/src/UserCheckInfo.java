
public class UserCheckInfo implements IUserCheckService {

	@Override
	public boolean checkUser(User user) {
		if(user.getAge() >= 18 & user.getEmail().length() <=16) {
			return true;
		}
		else {
			return false;
		}
	}

	
}
