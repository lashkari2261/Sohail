package ClassAdmissionExample;

public class RunnerForstudenCourse {

	public static void main(String[] args) {
		// students objects
				Student st1 = new Student("Jack", "Jackson", 25);
				Student st2 = new Student("David", "Jackson", 25);
				Student st3 = new Student("Anna", "Jackson", 25);
				Student st4 = new Student("Ahmad", "Jackson", 25);
				Student st5 = new Student("Mack", "Jackson", 25);
				
				
				// create an object of the course
				Course java = new Course("Java Basics", "Fun Class", 500.99, "2 months", "someone who does not know whats going on");
				
				java.addStudent(st1);
				java.addStudent(st2);
				java.addStudent(st3);
				java.addStudent(st4);
				java.addStudent(st5);
				
				System.out.println(java);
				

	}

}
