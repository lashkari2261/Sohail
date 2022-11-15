package inhertanceExample;

public class Instructor extends Person {
	private String major;

	public Instructor() {
		this.setMajor("");
	}

	public Instructor(String major) {
		this.setMajor(major);
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
