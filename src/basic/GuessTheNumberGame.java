package basic;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

	  public static void main(String[] args) {



	       guessTheNum(1, 1000);



	   }



	   public static void guessTheNum(int start, int end) {
	        Random r = new Random();
	        // this will generate a number in the range provided
	        // start and end given in the params
	        int randNum = r.nextInt(end + 1 - start) + start;



	       // creating scanner to take the input
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Guess the number:");
	        // creating a while loop to get input until right result
	        while (sc.hasNext()) {
	            // taking in the next input
	            int input = sc.nextInt();
	            // checking to see if the input is bigger than the random number
	            if (input > randNum) {
	                // go down
	                System.out.println("Go Down!");
	            } else if (input < randNum) {
	                // go up
	                System.out.println("Go Up!");
	            } else {
	                // its equal
	                System.out.println("You guessed it right!");
	                // stop the loop
	                
	                break;
	            }
	        }
	    }

	   


	}
