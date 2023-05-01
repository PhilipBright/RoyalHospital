package RoyalHospital;

public class LoginAdmin implements LoginSystem {

	@Override
	public boolean user(String username, String password) {
		String userName = "Admin";
		String PW = "Admin123";
		
		if(userName.equals(username)) {
			if(PW.equals(password)) {
				return true;
			}else {System.out.println("Invalid password");
			return false;}
		} else {
			System.out.println("Invalid username");
			return false;
		}
		
	}

}
