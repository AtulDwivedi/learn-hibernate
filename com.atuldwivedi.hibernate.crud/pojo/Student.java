package pojo;

public class Student {
	
	private int stdId;
	private String stdName;
	private String stdAge;
	private int subject;
	
	public Student() {
		
		
	}
	
	public Student(int stdId, String stdName, String stdAge, int subject) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.subject = subject;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdAge() {
		return stdAge;
	}
	public void setStdAge(String stdAge) {
		this.stdAge = stdAge;
	}
	public int getSubject() {
		return subject;
	}
	public void setSubject(int subject) {
		this.subject = subject;
	}
	
	

}
