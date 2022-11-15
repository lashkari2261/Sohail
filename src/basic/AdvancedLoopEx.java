package basic;

public class AdvancedLoopEx {

	public static void main(String[] args) {

	       // auto complete = ctrl + space



	       // labels - you can assign a name to your loop



	       // break - stop the loop
	        for (int i = 0; i < 10; i++) {
	            // the loop 0-9 = 10 iterations
	            System.out.println(i);
	            if (i > 5) {
	                break;
	            }
	        }
	        // continue - skip the rest of current iteration
	        System.out.println("********** continue ********** ");
	        for (int i = 0; i < 10; i++) {
	            if (i == 5) {
	                // when i is 5, skip the rest of this iteration and go to the next one
	                continue;
	            }
	            System.out.println(i);
	        }



	       System.out.println("**************************");
	        int x = 10;
	        while (x > 0) {
	            x--;
	            if (x == 5) {
	                continue;
	            }
	            System.out.println(x);
	        }



	       System.out.println("\n\n***************************************************");



	       // label assigns a name to the loop
	        int num = 1;
	        outter: for (int i = 0; i < 10; i++) {
	            inner: for (int j = 0; j < 5; j++) {
	                if (i == 2) {
	                    break inner;
	                }
	                System.out.print(num + ", ");
	                num++;
	            }
	            System.out.println();
	        }



	}

}
