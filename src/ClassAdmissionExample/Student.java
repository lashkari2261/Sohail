package ClassAdmissionExample;

public class Student {
	String firstName;
	String lastName;
	int age;
	
	public Student() {
		firstName = "";
		lastName = "";
		age = 0;
	}
	
	
	// this keyword refers to the current class scope
	
	public Student(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String toString() {
		return "Student [ " + firstName + " " + lastName + " " + age + "]";
}
}