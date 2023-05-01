package RoyalHospital;

import java.util.Scanner;

public class StaffView {
	static Scanner sc = new Scanner(System.in);
	public static void viewStaffMenu() {
		System.out.println("1- Add Doctor information");
		System.out.println("2- View Doctor information");
		System.out.println("3- Add Schedule by Doctor");
		System.out.println("4- View Schedule List");
		System.out.println("5- Add Patient information");
		System.out.println("6- View Patient information");
		System.out.println("7- Add Appointment");
		System.out.println("8- View Appointment");
		System.out.println("9- Find Number of Patient in a doctor");
		System.out.println("10- Logout");
		System.out.println("11- Exit");
		
		System.out.print("Choose option: ");
		int option = sc.nextInt();
        PatientAppointment AppointObj = new PatientAppointment();
		switch (option) {
		
		case 1:	AppointObj.AddDoctorInfo();break;	
		case 2:	AppointObj.ViewDoctorInfo();break;
		case 3:	AppointObj.AddScheduleList();break;
		case 4:	AppointObj.ViewScheduleList();break;
		case 5: AppointObj.AddPatientInfo();break;
		case 6: AppointObj.ViewPatientList();break;
		case 7: AppointObj.AddBooking();break;
		case 8: AppointObj.ViewBooking();break;
		case 9: AppointObj.numberOfPatientByDoc();break;
		case 10: Main.Log();break;
		case 11: AppointObj.Exit();break;
		default:System.out.println("Invalid option! Please try again!");;
		}
		if(Repeat()) {
			viewStaffMenu();
		}
		else {
			AppointObj.Exit();
		}
		
	}
	private static boolean Repeat() {
		// TODO Auto-generated method stub
		System.out.print("Do you want to go back to menu setting? Yes/No ");
		
		String status = sc.next();;
		if(status.equalsIgnoreCase("yes")) {
			return true;
			
		}
		else {
			return false;
		}


}
}
