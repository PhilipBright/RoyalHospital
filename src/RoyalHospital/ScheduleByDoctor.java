package RoyalHospital;

public class ScheduleByDoctor {
	private String DocName;
    private String days;
    private String time;
	public ScheduleByDoctor(String docName, String days, String time) {
		super();
		DocName = docName;
		this.days = days;
		this.time = time;
	}
	public String getDocName() {
		return DocName;
	}
	public void setDocName(String docName) {
		DocName = docName;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "DocName=" + DocName + "\n"+"days=" + days +"\n" +"time = " + time ;
	}
    

}