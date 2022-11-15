package basic;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	public class ExceptionHandLingEx {
		public static void main(String[] args) {
	        int a = 10;
	        int b = 0;
	        String x = "test";
	        int[] nums = { 1, 1, 1, 1 };
	        System.out.println(a / b);
	        try {
	            System.out.println(x.charAt(0));
	            System.out.println(nums[0]);
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException");
	        } catch (NullPointerException e) {
	            System.out.println("NullPointerException");
	        } catch (Exception e) {
	            System.out.println("any other exception");
	        } finally {
	            // this block will be executed regardless of you catching any exception or not
	            System.out.println("finally");
	        }
	        System.out.println("end");
	        // 1. exceptions
	        // events that are not planned and going to stop the execution
	        // user defined, the ones that developers can create
	        // pre-defined, the ones coming with the JDK or any tool that you use
	        // 2. handling exceptions
	        // a - try/catch
	        // b - throws keyword
	        // "throw" is a keyword that call/runs an exception
	        // checked vs. unchecked -
	        // checked - you will be forced to handle the exception that may occur
	        // it is mandatory to handle the checked exceptions
	        // unchecked - its optional for you to handle the exception
	        try {
	            FileInputStream f = new FileInputStream(new File(""));
	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        // throws vs throw keywords
	        // throws is a way to handle exceptions. it basically passes the responsibility
	        // of handling a checked exception
	        // of a code that you have in a method to the caller of that method
	        // throw is a keyword that we can use to run/call an exception
	        try {
	            readFile("path");
	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        try {
	            readFile("path2");
	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        try {
	            readFile("path3");
	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        // throws - if I want to have the same solution for all of the callers of my method, 
	        // i can use try/catch inside of the method
	        // if I want to pass the responsibility of handling the exception to the caller, so that they 
	        // can have their own version of a solution for that exception, I can use the keyword throws
	    }
	    public static void readFile(String path) throws FileNotFoundException {
	        File f = new File(path);
	        FileInputStream fl = new FileInputStream(f);

}
}
