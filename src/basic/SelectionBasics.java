package basic;

public class SelectionBasics {

	public static void main(String[] args) {
		int a = 10;
		        int b = 15;
		        if (a > b) {
		            // true block
		            System.out.println("a is bigger");
		        } else {
		            // else block / false block
		            System.out.println("b is bigger");
		        }
		        double balance = 500;
		        double widthraw = 600;
		        // 600 - 500 = 100
		        // 500 - 600 = -100
		        if (widthraw <= balance) {
		            System.out.println("give the customer $" + widthraw);
		        } else {
		            System.out.println("Insufficient balance. $" + (balance - widthraw));
		        }
		        int pinStored = 1234;
		        int pinEntered = 1234;
		        if (pinStored == pinEntered) {
		            System.out.println("Unlock the phone");
		        } else {
		            System.out.println("Do NOT unlock!");
		        }
		        System.out.println("-----------------------------");
		        // equality equal to == not equal to !=
		        // relational < > <= >=
		        // logical and && OR || NOT !
		        boolean b1 = true;
		        boolean b2 = false;
		        System.out.println(b1 == b2);
		        int numX = 10;
		        int numY = 5;
		        System.out.println(numX > numY);
		        System.out.println(b1 == b2 && numX > numY);
		        System.out.println(!(b1 == true || b2 == true));
		        System.out.println(b1 == true && b2 != false || true && !(b1 != b2));
		//        System.out.println(true && false || true && false);
		//        System.out.println(false);
		        // xor ^ if both sides are different, then its true
		        // if both sides are the same, then its false
		        // both sides are same = false
		        // both sides are different = true
		        // true ^ false = true
		        // false ^ true = true
		        // true ^ true = false
		        // false ^ false = false
		        if (true ^ true) {
		            System.out.println("this is if the condition results in TRUE");
		        } else {
		            System.out.println("this is if the condition results in FALSE");
		        }
		        int t = 5;
		        int t2 = 10;
		        if (t > t2) {
		            System.out.println("dead code");
		        }
		        System.out.println("end of the code");
		        // short circuit
		        // true or anything is true
		        // false and anything is false
		        // true || anything .......
		        int s = 10;
		        int e = 5;
		        if (s > ++e || ++s < ++e) {
		            System.out.println("this is the true block");
		        }
		        if(++e <= 5 && s > 5) {
		            System.out.println("challenging");
		        }
		        System.out.println("s " + s);
		        System.out.println("e " + e);
		        
		        int j = 10;
		        int k = 10;
		        if(++j == ++k && ++j == ++k) {
		            System.out.println("this is the true block of j and k");
}
System.out.println("j " + j);
System.out.println("k " + k);
	}

}
