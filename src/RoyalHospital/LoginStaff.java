package RoyalHospital;

import java.util.ArrayList;

public class LoginStaff implements LoginSystem {
	

	@Override
	public boolean user(String username, String password) {
		// TODO Auto-generated method stub
		String userName = "Staff";
		String PW = "Staff123";
		
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
