package basic;

public class StaticEX {

	public static void main(String[] args) {
		// static variables are class level variables
				// static belongs to the class and not to the objects
				
				// static call - to call a static member, you have to 
				// name the class . name of the member
				
				// Class Math is a class that comes with java, it has 
				// functions to perform mathematical operations
				
				System.out.println(Math.pow(5, 3));

				
				Student obj1 = new Student("Jack");
				Student obj2 = new Student("David");
				Student obj3 = new Student("David");
				Student obj4 = new Student("David");
				
				System.out.println(obj1.getFirstName());
				System.out.println("obj1  ==> "  + obj1);
				System.out.println("obj2  ==> "  + obj2);
				System.out.println("obj3  ==> "  + obj3);
				System.out.println("obj4  ==> "  + obj4);
				
				
				// calling functions of MyCalculator
				// you dont need an object of the class to call static functions
				
				
				MyCalculator.subtract(5, 2);
				MyCalculator.addition(5, 5);
				MyCalculator.multiplication(5, 5);
				MyCalculator.division(10, 5);
				MyCalculator.percentage(15469, 5.5);
				MyCalculator.power(7, 4);
				
				System.out.println(Math.sqrt(5));

	}

}
