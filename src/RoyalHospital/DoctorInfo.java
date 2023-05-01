package RoyalHospital;

import java.util.Iterator;

public abstract class DoctorInfo {
	private int No;
	private String Name;
	private String Gender;
	private String Degree;
	private String Phone;
	
	
	public DoctorInfo() {
		super();
	}
	
	public DoctorInfo(int no, String name, String gender, String degree, String phone) {
		super();
		No = no;
		Name = name;
		Gender = gender;
		Degree = degree;
		Phone = phone;
		
		
	}
	
		// TODO Auto-generated method stub
		
	

	public int getNo() {
		return No;
	}

	public void setNo(int no) {
		No = no;
	}

	public abstract void TreatmentFee();
	public abstract void TreatmentType();
	
	
	
	public abstract int getTreatmentFee();
	public abstract void setTreatmentFee(int TreatmentFee);
	
	public abstract String getTreatmentType();
	public abstract void setTreatmentType(String TreatmentType);

	

	public String getName() {
		return Name;
	}




	public void setName(String name) {
		Name = name;
	}




	public String getGender() {
		return Gender;
	}




	public void setGender(String gender) {
		Gender = gender;
	}




	public String getDegree() {
		return Degree;
	}




	public void setDegree(String degree) {
		Degree = degree;
	}




	public String getPhone() {
		return Phone;
	}




	public void setPhone(String phone) {
		Phone = phone;
	}


	
	
	@Override
	public String toString() {
		return "No = "+No+ "\n"+"Doctor Name = "+ Name+"\n"+ "Gender = "+Gender+"\n"+ "Degree = "+ Degree+ "\n"+"Phone number = " +Phone+"\n";
	}
	
	
	
}
