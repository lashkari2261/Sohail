package basic;

import java.util.ArrayList;

public class FebunmberEx {

	public static void main(String[] args) {
		// interview question 
		
		// fib numbers
        // we start with values of 0 and 1
        // then, every next number is the sum of the two previous numbers
        
        int count = 220;
        // creating a list to keep the fib numbers
        ArrayList<Integer> fibNums = new ArrayList<Integer>();
        // adding the first two values in the list
        fibNums.add(0);
        fibNums.add(1);
        for (int i = 0; i < count-2; i++) {
            // getting the two previous indexes and adding them
            int sum = fibNums.get(i) + fibNums.get(i+1);
            // adding the new fib num to the list
            fibNums.add(sum);
        }
        // printing the list of fib numbers
        System.out.println(fibNums);

	}

}
