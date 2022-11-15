package ClassObject;

public class Student {
	// class Student - is our blue print / template
		//
		// members of a class
		// // 1- variables
		// store the data that you want in your template
		String firstName;
		String lastName;
		int age;

		// // 2- methods
		// 1 - constructors -> are used to create an object of the class
		// the job of a constructor is to initialize all of the variables
		// of the class
		// access-modifier class-name(arguments/parameters){ body }
		public Student() {
			firstName = "";
			lastName = "";
			age = 0;
			System.out.println("we called the constructor of Student Class");
		}

		// 2 - methods -> are used to perform some action on that object
		// is a series of instructions that is going to be performed once called
		// A.M. Return-Type identifier(args/params){ body }
		// void = function non returning anything

		public void printInfo() {
			System.out.println("FirstName: " + firstName + ", LastName: " + lastName + ", Age: " + age);
		}
 
	}

