package ClassAdmissionExample;
import java.util.ArrayList;

public class Course {
	String title;
	String description;
	double fees;
	String duration;
	String instructor;
	ArrayList<Student> students;
// over loading - haveing two the same meathat  
	public Course() {
		this.title = "";
		this.description = "";
		this.fees = 0;
		this.duration = "";
		this.instructor = "";
		this.students = new ArrayList<Student>();
	}

	public Course(String title, String description, double fees, String duration, String instructor) {
		this.title = title;
		this.description = description;
		this.fees = fees;
		this.duration = duration;
		this.instructor = instructor;
		this.students = new ArrayList<Student>();
	}

	// add student
	public void addStudent(Student stu) {
		students.add(stu);
	}

	
	// overriding - changing the implementation of the inherited functions
	
	public String toString() {
		String temp = "";

		temp += "Title: " + title + "\n";
		temp += "Instructor: " + instructor + "\n";
		temp += "Fees: $" + fees + "\n";
		temp += "List of Students: \n";

		for (Student stu : students) {
			temp += stu.toString() + "\n";
		}
		
		return temp;
	}
}
