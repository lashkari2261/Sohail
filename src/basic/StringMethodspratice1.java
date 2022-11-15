package basic;

public class StringMethodspratice1 {

	public static void main(String[] args) {
		
		        String str1 = "test";
		        String str2 = "test";
		        // charAt return a character at the specified index 
		        System.out.println(str1.charAt(2));
		        // toUpperCase converts your string to upper case
		        System.out.println(str1.toUpperCase());
		        System.out.println(str2.endsWith("tions"));
		        // == equality operator is only good with primitive data types
		        System.out.println(str1.equals(str2));
		        System.out.println(str1.toUpperCase().charAt(0));
		        System.out.println("this is a test".replaceAll("a", "b"));
		    

	}

}
