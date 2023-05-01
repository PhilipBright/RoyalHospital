package RoyalHospital;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;



public class PatientAppointment implements HospitalSystem {
	Scanner si = new Scanner(System.in);
	static int count;
	//public static Map<String, DoctorInfo> doc = new HashMap<String, DoctorInfo>();
	public static ArrayList<DoctorInfo> doctorList = new ArrayList<DoctorInfo>();
	public static Collection<Patient> p = new ArrayList<Patient>();
	public static ArrayList<Booking> B = new ArrayList<Booking>();
	    public static Collection<ScheduleByDoctor> scheduleList = new ArrayList<ScheduleByDoctor>();
//	    public static Collection<CashPayment>
	   
	    public PatientAppointment() {
	        super();
	       
	    }
	   
	@Override
	public void AddBooking() {
		// TODO Auto-generated method stub
		si.nextLine();
		System.out.println("Enter Doctor Name to Add Booking: ");
		String BookingDoc = si.nextLine();
		DoctorInfo DocName = isFoundDoc(BookingDoc);
		
		if(DocName == null) {
			System.out.println(DocName +" is not from our Hospital");
			
		}
		else {
			
			System.out.println("Enter Booking ID");
			int pId = si.nextInt();
			si.nextLine();
			System.out.println("Enter Patient Name");
			String pName = si.nextLine();
			
			System.out.println("Enter Patient Age");
			
			int pAge = si.nextInt();
			si.nextLine();
			System.out.println("Enter Patient Bloodtype");
			String pBlood = si.nextLine();
			
			System.out.println("Enter Patient Gender");
			String pGender = si.nextLine();
			System.out.println("Enter Patient Phone Number");
			String pPh = si.nextLine();
			
			System.out.println("Enter Patient Disease Symptoms");
			String pSymptoms = si.nextLine();
			
			System.out.println("Enter Time ");
			String pT = si.nextLine();
			System.out.println("Enter Days");
			String pD = si.nextLine();
			B.add(new Booking (pId, pName,pAge, pBlood, pGender, pPh, pSymptoms,BookingDoc, pT,pD));
			System.out.println("Booking has been added completely!!");
			
			System.out.println(B);

		}
		
		System.out.println("Do you want to add more booking? Yes/No");
		String option = si.next();
		if(option.equalsIgnoreCase("yes")) {
			AddBooking();
			
		}
		 
	}
	
	@Override
	public void UpdateBooking() {
		// TODO Auto-generated method stub
		si.nextLine();
		System.out.println("Enter booking Patient name to update");
		String Uname = si.nextLine();
		
		Booking I = isFoundBooking(Uname);
		if(I == null) {
			System.out.println(Uname + " is not found in booking list");
		}
		else {
			System.out.println("Enter new name to Update ");
			String newP = si.nextLine();
			I.setName(newP);
			System.out.println(B);
	}
		}
		public Booking isFoundBooking(String name) {
			Booking I = null;
			for(Booking i : B) {
				if(i.getName().equalsIgnoreCase(name)) {
					I = i;
					break;
					}
				}
			return I;
		}
	@Override
	public void DeleteBooking() {
		// TODO Auto-generated method stub
		si.nextLine();
		System.out.println("Enter a booking patient name to remove booking ");
		String Dname = si.nextLine();
		
		
		Booking Bo = isFoundBooking(Dname);
		if(Bo == null) {
			System.out.println(Dname + " is not found in booking list");
		}
		else {
			B.remove(Bo);
			System.out.println("removed Successfully");
			System.out.println(B);
		}
		System.out.println("Do you want to remove another? Yes/No?");
		String status = si.next();
		if(status.equalsIgnoreCase("yes")){
			DeleteBooking();
		}
		
	}

	

	@Override
	public void ViewBooking() {
		// TODO Auto-generated method stub
		System.out.println("Booking Information\n"
				+ 			"_________________________");
		System.out.printf("%-14s%-14s%-14s%-14s%-17s%-14s%-14s%-14s%-14s%-14s\n","Booking ID","Name","Age","Blood Type","Gender", "Phone Number", "Disease Symptom","Booking Doctor", "Date", "Time");
		
		Iterator<Booking> i = B.iterator();
		
		while(i.hasNext()) {
			Booking e = i.next();
			System.out.printf("%-14s%-14s%-14s%-14s%-17s%-14s%-14s%-14s%-14s%-14s\n",e.getBookingId(),e.getName(),e.getAge(),e.getBloodType(),e.getGender(), e.getPhone(), e.getSymptoms(), e.getDocName(), e.getDay(), e.getTime());
		}
	}

	@Override
	public void AddDoctorInfo() {
		// TODO Auto-generated method stub
		si.nextLine();
		System.out.println("Enter Type of Doctor, Brain, Eye, Heart");
		String DT = si.nextLine();
		System.out.println("Enter Doctor Number");
		int dNo = si.nextInt();
		si.nextLine();
		System.out.println("Enter Doctor name");
		String dName = si.nextLine();
		
		System.out.println("Enter Doctor Gender");
		String dGender = si.nextLine();
		System.out.println("Enter Doctor Degree");
		String dDegree = si.nextLine();
		System.out.println("Enter Doctor Phone number");
		String dPhone = si.nextLine();
		System.out.println("Enter Doctor treatment fee");
		int dFee = si.nextInt();
		si.nextLine();
		
		DoctorInfo doc = FactoryDoc.getDoctorInfo(DT);
		if(doc != null) {
			doc.setNo(dNo);
			doc.setName(dName);
			doc.setGender(dGender);
			doc.setDegree(dDegree);
			doc.setPhone(dPhone);
			doc.setTreatmentFee(dFee);
			doc.setTreatmentType(DT);
			
			doctorList.add(doc);
			
			
		}
		else {
			System.out.println("Invalid Doctor Type, Try Again!!");
			AddDoctorInfo();
		}
		System.out.println(doctorList);
		
//
		si.nextLine();
		System.out.println("Do you want to add more Doctor? Yes/No");
		String option = si.next();
		if(option.equalsIgnoreCase("yes")) {
			AddDoctorInfo();
		}
		 
		
		
		
		
		
	}
	@Override
	public void UpdateDoctorInfo() {
		// TODO Auto-generated method stub
		si.nextLine();
		System.out.println("Enter Doctor name to Update");
		String Uname = si.nextLine();
		
		DoctorInfo I = isFoundDoc(Uname);
		if(I == null) {
			System.out.println(Uname + " is not found in order item list");
		}
		else {
			System.out.println("Enter new name to Update ");
			String newP = si.nextLine();
			I.setName(newP);
			System.out.println("Update Successfully");
			System.out.println(doctorList);
		}
		si.nextLine();
		System.out.println("Do you want to update more Doctor? Yes/No");
		String option = si.next();
		if(option.equalsIgnoreCase("yes")) {
			UpdateDoctorInfo();
		}
		 
	}

	@Override
	public void DeleteDoctorInfo() {
		// TODO Auto-generated method stub
		si.nextLine();
		System.out.println("Enter a Doctor name to remove: ");
		String Dname = si.nextLine();
		
		
		DoctorInfo Pat = isFoundDoc(Dname);
		if(Pat == null) {
			System.out.println(Dname + " is not found in patient list");
		}
		else {
			doctorList.remove(Pat);
			System.out.println("removed Successfully");
			System.out.println(doctorList);
		}
		System.out.println("Do you want to remove another? Yes/No?");
		String status = si.next();
		if(status.equalsIgnoreCase("yes")){
			DeleteDoctorInfo();
		}
		
	}

	public void ViewDoctorInfo() {
		// TODO Auto-generated method stub
		
		System.out.println("Doctor Information\n");
		
		System.out.printf("%-11s%-14s%-14s%-14s%-17s%-14s%-14s\n","No","Name","Gender","Degree","Phone Number","Fees", "Specialist");
		System.out.println("-------------------------------------------------------------------------------------------------");
		Iterator<DoctorInfo> i = doctorList.iterator();
		
		while(i.hasNext()) {
			DoctorInfo e = i.next();
			System.out.printf("%-11s%-14s%-14s%-14s%-17s%-14s%-14s\n",e.getNo(),e.getName(), e.getGender(), e.getDegree(), e.getPhone(), e.getTreatmentFee(), e.getTreatmentType());
			
		}}
	

	@Override
	public void AddPatientInfo() {
		// TODO Auto-generated method stub
		
			
			si.nextLine();
			System.out.println("Enter Patient Name");
			String pName = si.nextLine();
			
			System.out.println("Enter Patient Age");
			
			int pAge = si.nextInt();
			si.nextLine();
			System.out.println("Enter Patient Bloodtype");
			String pBlood = si.nextLine();
			
			System.out.println("Enter Patient Gender");
			String pGender = si.nextLine();
			System.out.println("Enter Patient Phone Number");
			String pPh = si.nextLine();
			
			System.out.println("Enter Patient Disease Symptoms");
			String pSymptoms = si.nextLine();
			Patient pat = new Patient( pName, pAge, pBlood,
					pGender, pPh, pSymptoms);
			p.add(pat);
			System.out.println(p);
			
			si.nextLine();
			System.out.println("Do you want to add more Patient? Yes/No");
			String option = si.next();
			if(option.equalsIgnoreCase("yes")) {
				AddPatientInfo();
			}
			
		}
	@Override
	public void UpdatePatientInfo() {
		// TODO Auto-generated method stub
		si.nextLine();
		System.out.println("Enter Update Patient name");
		String Uname = si.nextLine();
		
		Patient I = isFoundPatient(Uname);
		if(I == null) {
			System.out.println(Uname + " is not found in order item list");
		}
		else {
			System.out.println("Enter new name to Update ");
			String newP = si.nextLine();
			I.setName(newP);
			System.out.println("Update Successfully");
			si.nextLine();
			System.out.println(p);
			
			
		}
		System.out.println("Do you want to Update more Patient? Yes/No");
		String option = si.next();
		if(option.equalsIgnoreCase("yes")) {
			UpdatePatientInfo();
		}
		 
	}

	@Override
	public void DeletePatientInfo() {
		// TODO Auto-generated method stub
		si.nextLine();
		System.out.println("Enter a patient name to remove: ");
		String Dname = si.nextLine();
		
		
		Patient Pat = isFoundPatient(Dname);
		if(Pat == null) {
			System.out.println(Dname + " is not found in patient list");
		}
		else {
			p.remove(Pat);
			System.out.println("removed Successfully");
			System.out.println(p);
		}
		System.out.println("Do you want to remove another? Yes/No?");
		String status = si.next();
		if(status.equalsIgnoreCase("yes")){
			DeletePatientInfo();
		}
		 
	}
	public Patient isFoundPatient(String name) {
		Patient I = null;
		for(Patient i : p) {
			if(i.getName().equalsIgnoreCase(name)) {
				I = i;
				break;
				}
			}
		return I;
	}

	@Override
	public void ViewPatientList() {
		// TODO Auto-generated method stu

		System.out.printf("%-14s%-14s%-14s%-14s%-17s%-14s\n","Name","Age","Blood Type","Gender","Phone Number","Disease Symptom");
		System.out.println("-------------------------------------------------------------------------------------------------");
		Iterator<Patient> i = p.iterator();
		
		while(i.hasNext()) {
			Patient e = i.next();
			System.out.printf("%-14s%-14s%-14s%-14s%-17s%-14s\n",e.getName(),e.getAge(),e.getBloodType(),
					e.getGender(),e.getPhone(),e.getSymptoms());
			
		}
	}
	public DoctorInfo isFoundDoc(String searchname){
		DoctorInfo I = null;
		for (DoctorInfo i:doctorList){
			if(searchname.equalsIgnoreCase(i.getName())){
				I = i;
				break;
			}
		}
		return I;
	}
	

	@Override
	public void AddScheduleList() {
		// TODO Auto-generated method stub
		si.nextLine();
		System.out.println("Enter the existing Doctor name to add Schedule");
		String dName = si.nextLine();
		
		
		System.out.println("Enter Doctor Duty days to add");
		String dDays = si.nextLine();
		System.out.println("Enter Doctor Duty time to add");
		String dTime = si.nextLine();
		
		
		DoctorInfo DocName = isFoundDoc(dName);
		
		if(DocName == null) {
			System.out.println(dName +" is not from our Hospital");
			
		}
		else {
			
			scheduleList.add(new ScheduleByDoctor(dName,dDays, dTime));
			System.out.println("Schedule has been added!!");
			System.out.println(scheduleList);
			
		}
		System.out.println("Do you want to add more Schedule? Yes/No");
		String option = si.next();
		if(option.equalsIgnoreCase("yes")) {
			AddScheduleList();
		}
		else {
			WelcomePage();
		}
		
		
	
		
	}


	@Override
	public void UpdateScheduleList() {
		// TODO Auto-generated method stub
		si.nextLine();
		System.out.println("Enter Doctor name to update schedule");
		String Uname = si.nextLine();
		
		ScheduleByDoctor I = isFoundSchedule(Uname);
		if(I == null) {
			System.out.println(Uname + " is not found in order item list");
		}
		else {
			System.out.println("Enter new name to Update ");
			String newP = si.nextLine();
			System.out.println("Enter new day to Update ");
			String newD = si.nextLine();
			System.out.println("Enter new time to Update ");
			String newT = si.nextLine();
			I.setDocName(newP);
			I.setDays(newD);
			I.setTime(newT);
			System.out.println("Update Successfully");
			System.out.println(scheduleList);
		}
		System.out.println("Do you want to Update more Patient? Yes/No");
		String option = si.next();
		if(option.equalsIgnoreCase("yes")) {
			UpdateScheduleList();
		}
		 
	}
	public ScheduleByDoctor isFoundSchedule(String name) {
		ScheduleByDoctor I = null;
		for(ScheduleByDoctor i : scheduleList) {
			if(i.getDocName().equalsIgnoreCase(name)) {
				I = i;
				break;
				}
			}
		return I;
	}

	@Override
	public void DeleteScheduleList() {
		// TODO Auto-generated method stub
		si.nextLine();
		System.out.println("Enter a Doctor name to remove: ");
		String Dname = si.nextLine();
		
		
		ScheduleByDoctor Pat = isFoundSchedule(Dname);
		if(Pat == null) {
			System.out.println(Dname + " is not found in patient list");
		}
		else {
			scheduleList.remove(Pat);
			System.out.println("removed Successfully");
			System.out.println(scheduleList);
		}
		System.out.println("Do you want to remove another? Yes/No?");
		String status = si.next();
		if(status.equalsIgnoreCase("yes")){
			DeleteScheduleList();
		}
		 
	}
	@Override
	public void ViewScheduleList() {
		// TODO Auto-generated method stub
		
		System.out.println("Schedule Information\n");
		System.out.printf("%-13s%-13s%-13s\n", "Doctor Name", "Time", "Date");
		System.out.println("---------------------------------------------");
		Iterator<ScheduleByDoctor> i = scheduleList.iterator();
		
		while(i.hasNext()) {
			ScheduleByDoctor e = i.next();
			System.out.printf("%-13s%-13s%-13s\n", e.getDocName(), e.getTime(), e.getDays());
		}
	}

	

	@Override						
	public void Exit() {
		// TODO Auto-generated method stub
		System.out.print("=====End=====");
		System.exit(0);
	}
//	private Booking isFoundSearchDoc(String searchname) {
//		// TODO Auto-generated method stub
//		
//		Booking I = null;
//		for (Booking i:B){
//			if(searchname.equalsIgnoreCase(i.getDocName())){
//				I = i;
//				
//				
//			}
//		}
//		return I;
//	}
	public void numberOfPatientByDoc() {
		System.out.println("Numbers of patient by doctors ");
	    System.out.println("Doctor name  No of patients");
		 Map<String , Integer> dc=new HashMap<String,Integer>();
//			System.out.println("Enter doctor name to calculate number of patient");
//			String Dname = si.nextLine();
//			Booking I = isFoundSearchDoc(Dname);
			for(Booking ap:B) {
			
				if(!dc.containsKey(ap.getName())){
					
					dc.put(ap.getName(), 1);
					
					
				}
				else {
					int n=dc.get(ap.getName());
					dc.put(ap.getName(), ++n);
				}
			
			
			}
			for(String n : dc.keySet()) {
			      System.out.printf("%-15s%-10d\n",n , dc.get(n));
			    }
			
			
			
		}

	
	
	
	@Override
	public void WelcomePage() {
		// TODO Auto-generated method stub
		System.out.println("Welcome from the Hospital");
		System.out.println("=====================================");
		System.out.println("1- WelcomePage");

		System.out.println("2- Add Doctor information");
		System.out.println("3- Update Doctor information");
		System.out.println("4- Delete Doctor information");
		System.out.println("5- View Doctor information");
		System.out.println("6- Add Schedule by Doctor");
		System.out.println("7- Update Schedule list");
		System.out.println("8- Delete Schedule list");
		System.out.println("9- View Schedule List");
		System.out.println("10- Add Patient information");
		System.out.println("11- Update Patient information");
		System.out.println("12- Delete patient information");
		System.out.println("13- View Patient information");
		System.out.println("14- Add Appointment");
		System.out.println("15- Update Appointment");
		System.out.println("16- Delete Appointment");
		System.out.println("17- View Appointment");
		System.out.println("18- Logout");
		System.out.println("19- End Process");
		
		System.out.print("Choose option: ");
		int option = si.nextInt();
        PatientAppointment AppointObj = new PatientAppointment();
		switch (option) {
		case 1: WelcomePage();break;
		case 2:	AppointObj.AddDoctorInfo();break;	
		case 3:	AppointObj.UpdateDoctorInfo();break;	
		case 4:	AppointObj.DeleteDoctorInfo();break;	
		case 5:	AppointObj.ViewDoctorInfo();break;
		case 6:	AppointObj.AddScheduleList();break;
		case 7:	AppointObj.UpdateScheduleList();break;
		case 8:	AppointObj.DeleteScheduleList();break;
		case 9:	AppointObj.ViewScheduleList();break;
		case 10: AppointObj.AddPatientInfo();break;
		case 11: AppointObj.UpdatePatientInfo();break;
		case 12: AppointObj.DeletePatientInfo();break;
		case 13: AppointObj.ViewPatientList();break;
		case 14: AppointObj.AddBooking();break;
		case 15: AppointObj.UpdateBooking();break;
		case 16: AppointObj.DeleteBooking();break;
		case 17: AppointObj.ViewBooking();break;
		case 18: Main.Log();break;
		case 19: AppointObj.Exit();break;
		default:System.out.println("Invalid option! Please try again!");;
		}
		if(AppointObj.Repeat()) {
			WelcomePage();
		}
		else {
			AppointObj.Exit();
		}
		
	}

	private boolean Repeat() {
			// TODO Auto-generated method stub
			System.out.print("Do you want to go back to menu setting? Yes/No ");
			
			String status = si.next();;
			if(status.equalsIgnoreCase("yes")) {
				return true;
				
			}
			else {
				return false;
			}
	

}}

