package Collection;

import java.util.ArrayList;

public class ArrayListActivity {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(); 
		numbers.add(100);
		numbers.add(1231);
		numbers.add(321);
		numbers.add(32);
		numbers.add(2124);
		
		// activity is sum all the numbers in the array.
		int sum = 0; 
	
		for (int number : numbers) {
			sum += number;
		}
		
		System.out.println("Sum is " + sum);

	}

}
