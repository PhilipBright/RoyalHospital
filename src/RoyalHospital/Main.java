package RoyalHospital;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Log();
	}

	public static void Log() {
		// TODO Auto-generated method stub
		PatientAppointment sysop = new PatientAppointment();
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Enter user type (Admin/Staff): ");
		    String userType = scanner.nextLine();
	    System.out.print("Enter username: ");
	    String username = scanner.nextLine();
	    
	    System.out.print("Enter password: ");
	    String password = scanner.nextLine();
	    
	   
		LoginContext context;
		if(userType.equalsIgnoreCase("Admin")) {
			context = new LoginContext(new LoginAdmin());
			if (context.user(username, password)) {
			  System.out.println("Admin login successful");
			  sysop.WelcomePage();
			  
			} else {
			  System.out.println("Admin login failed, please try again!!");
			  Log();
			 
			}
		}else if(userType.equalsIgnoreCase("Staff")) {
			context = new LoginContext(new LoginStaff());
			if (context.user(username, password)) {
			  System.out.println("Staff login successful");
			  StaffView.viewStaffMenu();
			} else {
			  System.out.println("Staff login failed");
			  Log();
			}
		}
	}

}
