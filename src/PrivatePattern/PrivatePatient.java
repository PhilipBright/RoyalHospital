package PrivatePattern;

public class PrivatePatient {
	private Patient NP;

	public  PrivatePatient(String name, int age, String bloodType, String gender, String phone, String symptoms) {
		this.NP = new Patient(name, age, bloodType, gender, phone, symptoms);
	}
public Patient getPatient() {
	return this.NP;
}
public void Pview(){
	System.out.printf(this.NP.getName(), this.NP.getAge(), this.NP.getBloodType(), this.NP.getGender(), this.NP.getPhone(), this.NP.getSymptoms());
}
	
}
	
	

