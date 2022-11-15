package Collection;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		
		// Create a list of cities. 
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Alexandria");
		cities.add("Falls Church");
		cities.add("Tysons");
		cities.add("Arlington");
	
		System.out.println(cities.size());
		
		// how to print all values of the list? 
		System.out.println(cities.get(0));
		System.out.println(cities.get(1));
		System.out.println(cities.get(2));
		System.out.println(cities.get(3));
		
		//access list data using loops? 
		for(int index = 0 ; index < cities.size() ; index ++ ) {
			System.out.println(cities.get(index));
		}
		
		for(String value : cities) {
			System.out.println(value);
		}
		
	}
}
