package InClassPratice;

public class DiscountCalc01 {

	public static void main(String[] args) {
		// create a double name = discount
        // create a String name = fullName
        // create an int name = age
        // create a char name = gender / 'f' for female and 'm' for male
        // create a double name = total
        // create a double name = discountAmount
        // assign some random values to these variables


        // total * percent / 100   gives you the discount percent

        // we are going to calculate the discount based on the age of the customer
        // if the customer is a female between 22-35 then we give 10% discount
        // if the customer is a male between 22-35 then we give 5% discount
        // if the customer is a female above 60, then 25% discount
        // if the customer is a male above 60, then 20% discount
        // if the customer is a female between 50-55, then 10% discount
        // if the customer is a male between 50-55, then 8% discount
        // anything else, no discount

        // calculate the discount based on the values of the variables
        // print the total before discount
        // print the discount amount
        // print the total after discount
      
		double Discount = 20;
		String Name = "Ahmad";
		int Age = 66;
		String Gender = "Male" ;
		double Total = 120;
		double DiscountAmount = 24;
		 int totalAfterDiscountAmount = 96;
		if (Age >= 60);{
			System.out.print("we gave 20% discount" +"total amount before discount"+ Total + "Total discount"+DiscountAmount + "Total after discount" +totalAfterDiscountAmount );
		}
		
		
		
		
		
		
		

	}

}
