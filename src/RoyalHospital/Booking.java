package RoyalHospital;

public class Booking {
	private int BookingId;
	private String Name;
	private int Age;
	private String BloodType;
	private String Gender;
	private String Phone;
	private String Symptoms;
	private String DocName;
	private String Time;
	private String Day;
	public Booking(int bookingId, String name, int age, String bloodType, String gender, String phone, String symptoms,
			String docName, String time, String day) {
		super();
		BookingId = bookingId;
		Name = name;
		Age = age;
		BloodType = bloodType;
		Gender = gender;
		Phone = phone;
		Symptoms = symptoms;
		DocName = docName;
		Time = time;
		Day = day;
	}
	public int getBookingId() {
		return BookingId;
	}
	public void setBookingId(int bookingId) {
		BookingId = bookingId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getBloodType() {
		return BloodType;
	}
	public void setBloodType(String bloodType) {
		BloodType = bloodType;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getSymptoms() {
		return Symptoms;
	}
	public void setSymptoms(String symptoms) {
		Symptoms = symptoms;
	}
	public String getDocName() {
		return DocName;
	}
	public void setDocName(String docName) {
		DocName = docName;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getDay() {
		return Day;
	}
	public void setDay(String day) {
		Day = day;
	}
	@Override
	public String toString() {
		return "BookingId = " + BookingId + "\n"+"Name = " + Name +"\n" +"Age = " + Age +"\n"+"BloodType = " + BloodType
				+"\n" +"Gender = " + Gender +"\n"+ "Phone = " + Phone + "\n"+"Symptoms = " + Symptoms +"\n"+ "DocName = " + DocName
				+ "\n"+"Time = " + Time + "\n"+", Day = " + Day ;
	}
	
	
}
