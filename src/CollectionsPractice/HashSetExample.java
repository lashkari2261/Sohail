package CollectionsPractice;

import java.util.HashSet;

public class HashSetExample {
public static void main(String[] args) {
	// you can not have duplicates in a set / or you could say, you can have one of each
			// HashSet is an unordered collection
			
			
			// hashing - its going to convert your data to some code
			// you could use the function to convert back to your data
			// its used to secure and save space
			
			
			HashSet<Integer> temp = new HashSet<Integer>();

			temp.add(525);
			temp.add(645);
			temp.add(854);
			temp.add(525);
		 
		
			
			// method add - you can add a value to your set
			// if the value already exists in the set, the method will return false 
			// and the value will not be added again
			// if the value does not exist in the set, the method returns true and the value 
			// will be added to the set
			System.out.println("temp.add(255) = " + temp.add(255));
			System.out.println("temp.add(255) = " + temp.add(255));
			
			
			// method contains - will return true if the value exists in your set
			System.out.println("temp.contains(645) = " + temp.contains(645));
			
			
			// how to iterate through the set 
			// you can use a for each loop to iterate through your set
			for (Integer i : temp) {
				System.out.println(i);
			}
 
			System.out.println(temp);
}
}
