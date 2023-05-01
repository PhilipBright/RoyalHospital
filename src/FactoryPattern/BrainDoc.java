package FactoryPattern;

import java.util.Iterator;

public class BrainDoc extends DoctorInfo {
	private int treatmentFee;
	private String treatmentType;
	

	
	public BrainDoc() {
		super();
	}
	public BrainDoc(int no, String name, String gender, String degree, String phone,
			int treatmentFee, String treatmentType) {
		super(no, name, gender, degree, phone);
		this.treatmentFee = treatmentFee;
		this.treatmentType = treatmentType;
	}
	
	
	public int getTreatmentFee() {
		return treatmentFee;
	}

	public void setTreatmentFee(int treatmentFee) {
		this.treatmentFee = treatmentFee;
	}

	public String getTreatmentType() {
		return treatmentType;
	}

	public void setTreatmentType(String treatmentType) {
		this.treatmentType = treatmentType;
	}
	

	@Override
	public void TreatmentFee() {
		// TODO Auto-generated method stub
		System.out.println(getTreatmentFee());
	}

	@Override
	public void TreatmentType() {
		// TODO Auto-generated method stub
		System.out.println(getTreatmentType());
	}

	@Override
	public String toString() {
		return super.toString() + "treatmentFee=" + treatmentFee + "\n"+" treatmentType=" + treatmentType +"]";
	}
	
	
	
	

	

	
	
	

}
