
public class SignUpManager {
	private IUserCheckService iUserCheckService;
	
	public SignUpManager(IUserCheckService iUserCheckService) {
		super();
		this.iUserCheckService = iUserCheckService;
	}

	public void signUp(User user,String name,String surname) {
		if(iUserCheckService.checkUser(user)) {
			System.out.println("Registration Completed!! Welcome to MWL!!!: " +name +" " +surname);
		}
		else {
			System.out.println("Registration could not be completed!!!!!");
		}
	}
}
