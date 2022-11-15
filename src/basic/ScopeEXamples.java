package basic;

public class ScopeEXamples {

	public static void main(String[] args) {
		double grade = 55;
        String s = "Student is ";
        // if the grade is more than 60 then student is passing, if not then failing        if (grade >= 60) {
            s += "passing";
        } else {
            s += "failing";
        }
//      s += grade >= 60 ? "passing" : "failing";        System.out.println(s);
        int a = 10;
        int b = 15;
        System.out.println(a > b ? "a is bigger" : "b is bigger");
        if (a > b) {
            System.out.println("a is bigger");
        } else {
            System.out.println("b is bigger");
        }
        // conditions ? true " false;        if (a > b) {
            int c = 18;
            // what variables can i access?        } else {
            int d = 18;
            System.out.println(a);
        }	
		
	}
}
