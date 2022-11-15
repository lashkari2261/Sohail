package CollectionsPractice;

import java.util.HashMap;

public class HashMapExample_occurances {
public static void main(String[] args) {
	// count the number of occurrences of each character in a given String
			// example "this is a test" ==> {t=3, h=1, i=2, s=3, space=3, a=1, e=1}

			String str = "one day in the class, we kept asking for real life example, eventhough it was too early to see it. we got what we asked for";
			
			System.out.println(countOccurrences(str));
		}

		public static HashMap<Character, Integer> countOccurrences(String input) {
			HashMap<Character, Integer> res = new HashMap<Character, Integer>();

			// this loop will go through all of the chars in the input String
			for(int i = 0; i< input.length(); i++) {
				// input.charAt(i) is going to give us the char of that iteration

				// check to see if the char is in the map
				if(res.containsKey(input.charAt(i))) {
					// true = the key is present in the map
					// increase the count of it
					int currentCount = res.get(input.charAt(i)) + 1; // getting and increasing the count
					res.put(input.charAt(i), currentCount);// updating the count in the map
				} else {
					// false = the key is not yet added to the map
					// we add the key to the map with count 1
					res.put(input.charAt(i), 1);
				}
			}
			
			return res;	
	
	
	
}
}
