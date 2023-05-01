package RoyalHospital;

import java.util.Scanner;



	public class LoginContext {
		  private LoginSystem strategy;
		  
		  public LoginContext(LoginSystem strategy) {
		    this.strategy = strategy;
		  }
		  
		  public boolean user(String username, String password) {
			return strategy.user(username, password);
		   
		  }
		}

		
		
	
