package inhertanceExample;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("David Chan", "something@something.com", 40);

		Student stu = new Student();

		System.out.println(stu.getFullName());

		System.out.println(p);
		System.out.println(stu.getStudentID());
		
	}

}
