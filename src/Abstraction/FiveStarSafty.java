package Abstraction;

public interface FiveStarSafty {
	// interfaces are not classes
		// interfaces are designed for 100% abstraction, but you have exceptions to that
		// you do not have to mention the abstract keyword, its assumed

		// you can not create an object of an interface

		// variable are by default public final static
		int x = 10;
		public final static int y = 5;
		
		// abstract keyword on your methods is optional
		public abstract void stablityControl();
		
		public int sum(int a, int b);
		
		
		// exceptions were you can have implementation of your code in an interface
		// 1. static - you must provide implementation to static functions in your interface
		public static void someMethod(int arg) {
			System.out.println("this is the someMethod in the interface FiveStarSafty " + arg);
		}
		
		// 2. default - it gives the option to provide a default implementation to a function
		public default int div(int a, int b) {
			return a/b;
		}
}
