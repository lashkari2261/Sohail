
package basic;

public class MutationExample {

	public static void main(String[] args) {
		 // mutation/
        // String is immutable - you can change the value of a String,
        // but it will not bring that change in the same spot in the memory
        // it will instead create a new object
        
        // StringBuilder and StringBuffer are both mutable
        // meaning that if you change the value, the change
        // takes place in the same spot in the memory
        
        // StringBuilder vs StringBuffer
        // StringBuffer is thread Safe
        // StringBuilder is not thread safe, so it can be faster
        // if used properly in multi-thread codes
        
        
        String str = "test";
        str = str.replace('t', 'A');
        System.out.println(str); // test
        
        
        StringBuilder sb = new StringBuilder("book");
        sb.replace(0, 1, "C");
        System.out.println(sb); // Cook
        



       // second example
        // 10 objects of SB is created
        StringBuilder sb1 = new StringBuilder("book");
        StringBuilder sb2 = new StringBuilder("book");
        StringBuilder sb3 = new StringBuilder("book");
        StringBuilder sb4 = new StringBuilder("book");
        StringBuilder sb5 = new StringBuilder("book");
        StringBuilder sb6 = new StringBuilder("book");
        StringBuilder sb7 = new StringBuilder("book");
        StringBuilder sb8 = new StringBuilder("book");
        StringBuilder sb9 = new StringBuilder("book");
        StringBuilder sb10 = new StringBuilder("book");
        
        StringBuffer sbf = new StringBuffer("test");
        
        
        // 1 object is created
        String s1 = "test";
        String s2 = "test";
        String s3 = "test";
        String s4 = "test";
        String s5 = "test";
        String s6 = "test";
        String s7 = "test";
        String s8 = "test";
        String s9 = "test";
        String s10 = "test";

        
System.out.println(Math.pow(2, 20));

        
        
        
	}

}
