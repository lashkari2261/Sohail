package basic;

import java.util.Iterator;

public class FullloopExamples {

	public static void main(String[] args) {
		
		
		for(int i = 0; i <= 10 ; i++) {
			System.out.println(i);
		}


 
        // palindrome
        // cat = No
        // dad = Yes
        // mom = Yes
        // 123454321 = Yes
        // check to see if the given String is palindrome
        String str = "123454321";
        String rev = "";
        for(int i = 0; i<str.length();i++) {
            rev = str.charAt(i) + rev;
        }
        // 987654321
        if(str.equals(rev)) {
            System.out.println("The words are palindrome!");
        } else {
            System.out.println("The words are not palindrome!");
        }
        System.out.println(str);
        System.out.println(rev);
		/////////////////////////////////////////////////////////////////////////////////
        String str1 = "123454321";
        String rev1 = "";
        for( int i =str1.length()-1;i >= 0; i--) {
        System.out.println(str1.charAt(i));
        rev1 = str1.charAt(i) + rev1;
        }
        System.out.println(str1);
        System.out.println(rev1);
            
        
     // based on the boolean above, i want to see one of the following results
//      reverse = false [1, 2, 3, 4, 5]
//      reverse = true  [5, 4, 3, 2, 1]

        
		for (int A = 19; A >= 3; A--) {
			System.out.print(A + ", ");
			
		}
		System.out.println("[");
		for (int B = 1; B <= 5; B++) {
			if ( B + 1 < 6) {
				System.out.print(B + ", ");
			} else {
				System.out.print(B);
				System.out.println("]");
			}
			  // 1 2 3
	        // 1 2 3
	        // 1 2 3
//	      print this with a loop
	        // this loop runs 3 times
	        for (int j = 1; j <= 5; j++) {
	            // this prints 1 2 3 and goes to the next line
	            for (int i = j; i <= 5; i++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	        for (int j = 5; j >= 1; j--) {
	            // this prints 1 2 3 and goes to the next line
	            for (int i = j; i <= 5; i++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
			// you have to run 3 stes of 12
			for (int set = 0; set <3; set++) {
				System.out.println("set " + set);
				for(int rep = 0; rep <= 12; rep++) {
					System.out.print("rep " + rep + ", ");
				}
				System.out.println();
				
				System.out.println("****************************************");
			}
			int setcount = 15;
			for (int i = 0; i<5 ; i++) {
				// 0 1 2 
				for(int j = 1; j <= setcount; j++) {
					System.out.print(j + ", ");
					
				}
				setcount -=2;
				System.out.println();
			}
	
	        
	        
	        
	        
	        
	        
	        
	        

        }
	}

}
