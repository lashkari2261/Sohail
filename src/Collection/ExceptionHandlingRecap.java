package Collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlingRecap {
public static void main(String[] args) {
	
		//Compile time error 
		String someVariable = "something";
		System.out.println(someVariable);
		
		//Logical error. 
		// expectation 2 + 2 = 4
		int result = 2 + 2;
		
		//runtime error.
		try {
			int devid = 10 / 0;
		}catch(ArithmeticException e) {
			System.out.println("Error happened.");
		}
		
		System.out.println("this print after divid by zero");

		// Example for exception handling.
		// trying to read a file and see how exception work.
		//if you don't know what is exact exception you can always use Exception Family. 
		// Family can be RunTimeException or Exception or Throwable.
		try {
			FileInputStream fis = new FileInputStream(new File("c:/somewhere/123.txt"));
			int result1 = 10 / 0; 
		} catch (FileNotFoundException exception) {
			// you can code here they way you want to handle it.
			System.out.println("File not exist.");
			System.out.println(exception.getMessage());
			throw new RuntimeException("I don't want to continue stop here");
		} catch(ArithmeticException e) {
//			System.out.println("arithmentic exception happened");			
			//intentionally throw exception how ? 
			throw new RuntimeException("I don't want to continue stop here");
			
		} finally {
			// finally will execute no matter if code run successfully or catch by an Exception
			System.out.println("Finally block executed. ");
		}
		
		

	}
	
	
	public void doSomething() throws Exception {
		FileInputStream fis = new FileInputStream(new File("c:/somewhere/123.txt"));

}
}
