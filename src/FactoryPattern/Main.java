package FactoryPattern;

import java.util.ArrayList;
import java.util.Scanner;

import RoyalHospital.DoctorInfo;
import RoyalHospital.FactoryDoc;

public class Main {
	public static ArrayList<DoctorInfo> doctorList = new ArrayList<DoctorInfo>();
	static Scanner si = new Scanner(System.in);
	
	public static void AddDoctorInfo() {
		// TODO Auto-generated method stub
		
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddDoctorInfo();

}
}
