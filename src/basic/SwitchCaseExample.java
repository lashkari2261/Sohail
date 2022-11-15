package basic;

public class SwitchCaseExample {

	public static void main(String[] args) {
		String dayOfWeek = "Mon";
		//if (dayOfWeek.equals("Sat")) {
		//  System.out.println("First day of the weekend. Rest.");
		//} else if (dayOfWeek.equals("Sun")) {
		//  System.out.println("Last day of the weekend, we should get ready for the week.");
		//}
		// switch cases will only work with the following datatypes
		// byte, short, int, char, String
		// can not use relational operators
		// we put the expression inside the parathesis
		// if a case match the expression, we start the execution from that case
		// we only stop if we see a break or the end of the switch
		// you can add an optional default block, that will be executed if no case
		// matched
		switch (dayOfWeek) {
		case "Sat":
		    System.out.println("First day of the weekend. Rest.");
		case "Sun":
		    System.out.println("Last day of the weekend, we should get ready for the week.");
		    break;
		default:
		    System.out.println("its not weekend");
		}
		int num = 1;
		switch (num) {
		case 1:
		case 2:
		    System.out.println("small table");
		    break;
		case 3:
		case 4:
		    System.out.println("medium table");
		    break;
		case 5:
		    System.out.println("large table");
		    break;
		default:
		    System.out.println("may need to combine tables");
		    break;
		}
		

		int num1 =2;
		switch (num1) {
		case 1:
			System.out.println("table for 1");
			break;
		case 2:
			System.out.println("Table for 2");
			break;
		case 3:
		    System.out.println("Table for 3");
		    break;
		case 4:
			System.out.println("Table for 4");
			break;
		case 5:
			System.out.println("Table for 5");
			break;
			default:
				System.out.println("need two+ table");
			
		}
		// create a char startsWith and assign a letter
				// a, b , c, d ,e ,f
				// create a switch case that prints a name that starts with that character
				// now create an if statement that does the exact same thing.
		
		char StartsWith = 'M';
		switch (StartsWith) {
		case 'A':
			System.out.println("Ahmad");
			break;
		case 'B':
			System.out.println("Broke");
			break;
		case 'C':
			System.out.println("Control");
			break;
		case 'D':
			System.out.println("David");
			break;
		case 'E':
			System.out.println("Erik");
			default:
				System.out.println("We dont have a name for that  ");

		
		}
		
		
		
	}

}

