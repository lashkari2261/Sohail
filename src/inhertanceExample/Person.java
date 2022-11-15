package inhertanceExample;

public class Person {
	// every class inherit from class Object
		// one class can only have one immediate parent class
		// one class can have many sub classes
		// we use the keyword extends to define an inheritance relationship
		// inheriting from one class means you get a copy of all of the code of the
		// parent
		// you do not get a copy of the constructors
		// you can call the constructors of the parent class
		// inheritance is used to increase re-usability and maintainability of your code

		private String fullName;
		private String email;
		private int age;
		private String address;

		// initialize all of the variables of the class
		public Person() {
			super();
			this.fullName = "";
			this.email = "";
			this.age = 0;
			this.address= "";
		}

		public Person(String fullName, String email, int age) {
			this();
			this.fullName = fullName;
			this.email = email;
			this.age = age;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}

		public String toString() {
			return "Person [fullName: " + fullName + ", email: " + email + ", age: " + age + "]";
	    }
}
