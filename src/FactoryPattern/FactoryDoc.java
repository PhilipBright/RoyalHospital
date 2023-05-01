package FactoryPattern;

public class FactoryDoc {
	public static DoctorInfo getDoctorInfo(String treatmentType) {
		if(treatmentType == null) {
			return null;
		}
		else if(treatmentType.equalsIgnoreCase("Brain")) {
			return new BrainDoc();
		}
		else if(treatmentType.equalsIgnoreCase("Eye")) {
			return new EyeDoc();
		}
		else if(treatmentType.equalsIgnoreCase("Heart")) {
			return new HeartDoc();
		}
		return null;
	}
}
