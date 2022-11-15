package CollectionsPractice;

import java.util.HashMap;

public class HashMapPratice {
public static void main(String[] args) {
	
	// creating a hashmap is like any other variable
			// inside the <> angle brackets, you first pass the key
			// data type and then the value data type
			HashMap<String, String> names = new HashMap<String, String>();

			// adding to a map
			// you have to use the method put to add something to the map
			names.put("student1", "Jack");
			names.put("student2", "Anna");
			names.put("student3", "Anna");
			names.put("student3", "new name for key 3");
			names.put("student1", "Elon");
			names.put(null, null);
			
			// if the keys you are entering are unique, they will be added to the map
			// if you add a key that is already in the map, then we change the value of that
			// key to what you just provided

			// getting values from your map
			// the method get is going to take a key and return the value for that key
			System.out.println("getting values = " + names.get("student2"));

			
			// getting all of the keys 
			// keySet Method is going to return all of the keys
			System.out.println("getting keySet = "+names.keySet());
			
			
			// contains key will return true if that key is in the map, 
			// false if the key is not present in the map
			System.out.println("checking contains method = "+names.containsKey("student1"));
			
			
			// method contains value is going to see if the value you provide exists in the map
			System.out.println("checking contains value = " + names.containsValue("Anna"));
			
			
			// method values will give you a list of all of the values that you have in the map
			System.out.println("chekcing method values = "+names.values());
			
			
			// the method isEmpty will check to see if your map is empty
			System.out.println("checking the method isEmpty = "+names.isEmpty());
			
			
			
			System.out.println("Iterating through a map ************* Start");
			// to iterate through a map, you need to key all of the keys in the map
			// then go through the keys, and use each key with the get method
			// method keySet is going to give you a Set, so you can use for each loop for that
			
			for(String key: names.keySet()) {
				System.out.println("Key: " + key + ", Value: " + names.get(key));
			}

			
			System.out.println("Iterating through a map ************* End");
			
			
			
			// print all the values in the map
			System.out.println(names);
	
	
	
}
}
