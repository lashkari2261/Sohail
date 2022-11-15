package inhertanceExample;

public class polymorphismEx {

	public static void main(String[] args) {

	       // Polymorphism - your code can take different shapes



	       // signature of a method is name + args
	        // -- overloading - your signatures must be different
	        // constructors - you could have multiple versions of it



	       // -- Overriding - changing the implementation of a method
	        // that we have inherited



	       // up-casting - declaring an object of the parent class
	        // and initializing any of the child classes



	       String str = "test";



	       // declare parent = initialize child class
	        Person obj1 = new Person(); // not upcasting
	        Person obj2 = new Student(); // upcasting
	        Person obj3 = new Instructor(); // upcasting
	        // upcasting is the ability to declare an object of the
	        // parent class
	        // and initialize any of the sub classes of that class.



	       // wrapper classes
	        // Integer, Double, Boolean, ...



	       // Object
	        Object obj4 = 'c';



	       Object[] names = new Object[4];
	        names[0] = 10;
	        names[1] = "test";
	        names[2] = true;
	        names[3] = new Person("Jack", "jack@gmail.com", 25);
	        
	        for (Object s : names) {
	            System.out.println(s);
	        }




	        String text = "I dont know if java is fun anymore";
	        
	        String s = "fun"; // String
	        StringBuilder sb = new StringBuilder("fun"); // StringBuilder
	        StringBuffer sbf = new StringBuffer ("fun"); // StringBuffer
	        
	        System.out.println("Checking method contains => "+ text.contains(sbf));
	
	}

}
