package basic;

import java.util.Random;
import java.util.Scanner;

public class ScannerEx {

	
		public class ScannerExamples {
			public void main(String[] args) {

				
//				Scanner class will help get external data/inputs
				
				Scanner sc = new Scanner(System.in);
			
//				System.out.println("Your input was1: " + sc.nextLine());
//				System.out.println("Your input was2: " + sc.nextLine());
//				System.out.println("Your input was3: " + sc.nextLine());
//				System.out.println("Your input was4: " + sc.nextLine());
				
//				while(sc.hasNext()) {
//					String input = sc.nextLine();
//					System.out.println("Your input was: " + input);
//					if(input.equals("stop")) {
//						System.out.println("Your loop is now ended!");
//						break;
//					}
//				}
				
				// random is a class that comes with java
				// it can generate a random number for you
				// you create the object of the class random first
				// you can call the method nextInt(max range) on the object
				// you define the range as a parameter
				Random rand = new Random(); 
				for (int i = 0; i < 10; i++) { // it runs 10 times 
					
					int num = rand.nextInt(10) + 1; // max range is 10 
					// its going create a random number from 0 - 9
					// adding 1 will bump up the number by 1
					System.out.println(num);
					
				}
				

	}

}
