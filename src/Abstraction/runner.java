package Abstraction;

public class runner {
public static void main(String[] args) {
	BMW obj = new BMW();
	
	// you can access the static variables of your interface by calling them statically on the interface
	// the variables will be passed to the class that implements that interface as well, so you could call on the class name as well 
	System.out.println(BMW.x);
	System.out.println(FiveStarSafty.x);
	
	
	System.out.println(obj.div(10, 2));
	
	// static method in an interface belong to the interface, so you must call it statically on the interface
	FiveStarSafty.someMethod(10);
	
	
	
}
}
