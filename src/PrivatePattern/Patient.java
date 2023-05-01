package PrivatePattern;

public class Patient {
	private String name;
	private int age;
	private String bloodType;
	private String gender;
	private String phone;
	
	private String symptoms;
	
	public Patient(String name, int age, String bloodType, String gender, String phone, String symptoms ) {
		super();
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
		this.gender = gender;
		this.phone = phone;

		this.symptoms = symptoms;
	
	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public int getAge() {
		return age;
	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	public String getBloodType() {
		return bloodType;
	}
//	public void setBloodType(String bloodType) {
//		this.bloodType = bloodType;
//	}
	public String getGender() {
		return gender;
	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
	public String getPhone() {
		return phone;
	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
	
	public String getSymptoms() {
		return symptoms;
	}
//	public void setSymptoms(String symptoms) {
//		this.symptoms = symptoms;
//	}
	
	@Override
	public String toString() {
		return "Patient name = " + name+ "\n" +"Age = "+ age + "\n "+"Blood Type = "+ bloodType+ "\n"+"Gender = "+ gender+ "\n" +"Phone = "+ phone+  "\n" +"Symptoms = "+ symptoms  ;
	}



	
	
}
