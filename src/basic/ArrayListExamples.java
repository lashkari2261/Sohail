package basic;

import java.util.ArrayList;

public class ArrayListExamples {



	public static void main(String[] args) {
		 ArrayList<String> colors = new ArrayList<String>();



	       // adding to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Orange");
	        colors.add("White");
	        colors.add("Black");
	        
	        // to get the length of your list, use method size()
//	        System.out.println("method size() "+colors.size());
	        
	        // to get one index from your list, use the method get(index)
//	        System.out.println("method get(0) "+colors.get(0));
	        
	        // to print the arraylist, you can simple print the list. or go through with a loop
//	        System.out.println(colors);
	        
//	        for (int i = 0; i < colors.size(); i++) {
//	            System.out.println(colors.get(i)+ " ");
//	        }
	       System.out.println("Pink" + colors + "Black");

	
  }

}
