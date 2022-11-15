package BankExample;

public class Runnerforbank {

	public static void main(String[] args) {
		 Custmer p1 = new Custmer("Michael Jackson","(202)123-1212", "6201 Leesburge Pike", "michael@gmail.com", "02/01/1650", "1234", 145236);
	        p1.checkBalance("1234");
	        p1.deposit(1000, 145236, "1234");
	        p1.checkBalance("1234");
	        p1.withdraw2(1500, "1234");
	        p1.checkBalance("1234");
	        p1.checkBalance("1234");
	        
	        

	}

}
