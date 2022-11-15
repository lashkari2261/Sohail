package inhertanceExample;

public class Student extends Person {
	private int studentID;
	private double gpa;
	
	// 'super' is like the 'this' keyword
	// this = refers to current class 
	// super = refers to the immediate parent class
	
	// constructor chaining
	// calling another constructor at the start of your constructor
	// it must be the first statement in your constructor
	// you can match the signature of any of current or super class constructors
	// we use either this or super
	
	
	// 2 variables here in the class and 3 inherited from Person = 5 variables
	
	// we have to initialize all 5 variables 
	public Student() {
		super();
		this.setStudentID(0);
		this.setGpa(0);
	}
	public Student(int studentID, double gpa, String fullName, String email, int age, String address) {
		super(fullName, email, age);
		this.setStudentID(studentID);
		this.setGpa(gpa);
		super.setAddress(address);
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}
