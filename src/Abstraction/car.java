package Abstraction;

public interface car {
	// to perform abstraction, you have two options
	
	// IMPORTANT - you can not have objects of an interface or an abstract class
	
	//1. interfaces
	
	//2. abstract classes
	// you have the option to have zero or many abstract method in an abstract class
	// if you want to have abstract method, you must mention the term abstract in the definition 
	// the keyword extends is used to inherit from and abstract class, using extend, you get a copy of the methods with, 
	// and you are forced to implement the abstract method
	
	public abstract void something();
	
	public static void printSomething() {
		System.out.println("something");
	}
	
	public default void anotherMethod() {
		System.out.println("this is the another method");
	}
}
