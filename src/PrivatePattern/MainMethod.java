package PrivatePattern;

import java.util.ArrayList;
import java.util.Scanner;



public class MainMethod {
	static Scanner si = new Scanner(System.in);
	public static ArrayList<Patient> P= new ArrayList<Patient>();
	public static void AddPatientInfo() {
		// TODO Auto-generated method stub
		
			
			
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
			P.add(pat);
			System.out.println(P);
			
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		AddPatientInfo();
		
		

}
}
