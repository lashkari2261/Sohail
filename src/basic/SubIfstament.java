package basic;

public class SubIfstament {

	public static void main(String[] args) {
		boolean condition1, condition2, condition3, condition4, condition5;
        condition1 = false;
        condition2 = false;
        condition3 = true;
        condition4 = true;
        condition5 = true;
        if (condition1) {
            if (condition2) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        } else if (condition3) {
            if (condition4) {
                if (condition5) {
                    System.out.println("C");
                } else {
                    System.out.println("F");
                }
            } else {
                System.out.println("E");
            }
        } else {
        	
            System.out.println("D");
        }
        int age = 22;
     String status = age > 19 ? "can apply License": " can Not apply";
     
     System.out.println(status);
     String status2 = "";
     if (age>= 19) {
    	 status2 = "can apply";
     } else { 
    	 status2="can not apply";
    	 
     }

	}

}
