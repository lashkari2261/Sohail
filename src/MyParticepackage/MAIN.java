package MyParticepackage;

public class MAIN {
public static void main(String[] args) {
	 Fruit appleObject = new Fruit();
	    appleObject.name = "Apple";
	    appleObject.baseprice = 3.10 ; 
	    appleObject.quantity = 2.11; 
	    double appleTotalPrice = appleObject.getTotalPrice();
	    System.out.println("Total price for " + appleObject.name + " is " + appleTotalPrice);

	    Fruit orangeObject = new Fruit();
	    orangeObject.name = "Orange"; 
	    orangeObject.baseprice = 2.10; 
	    orangeObject.quantity = 3.41;
	    double orangeTotalPrice = orangeObject.getTotalPrice();
	    System.out.println("Total price for " + orangeObject.name + " is " + orangeTotalPrice);
	
}
}
