package Collection;

import java.util.ArrayList;

public class ListCollection {

	public static void main(String[] args) {
		//what is array? 
		//is is a container that can hold/store multiple values. 
		//array is fixed in size.
		//fix in data type. 
		//data manipulation is hard with array. (add delete or change or update)
		//array is index order. 
		//array don't have any method. 
			int[] numbers = new int[3];  // 3 is the length
			int length = numbers.length;
			numbers[0] = 10; 
			numbers[1] = 11; 
			numbers[2] = 14;
			
//			// add new number 
//			numbers[3] = 15;
//			
//			System.out.println(numbers[9]);
//			
//			//remove an element on index 2 from this array.
//			//you can not remove it but you can reassign the value
//			numbers[2] = 0;
			
			
			//List is an interface
			// ArrayList is a class. 
			// flexible in size. 
			//its generic. the type of data that array list can hold. 
			//manipulation is easier with help of methods. 
			//we can not use primitive data type but instead you can use wrapper classes. 
			//lists are index base. 
			//the order here is base on the order you add values. 
			
			// how to create array list. 
			//instantiate an object from a class. 
			ArrayList<String> list = new ArrayList<>(); 
			
			// how to add values to list?
			list.add("Country");
			list.add("City");
			list.add("Town");
			
			//how to find the size of the arraylist?
			int arraySize = list.size();
			System.out.println(arraySize);
			
			list.add("Village");
			int arraySize1 = list.size();
			System.out.println(arraySize1);
			
			//how to access the values in an array?
			String valueInIndex0= list.get(0);
			System.out.println(valueInIndex0);
			
			//how do remove and element from the list? 
			list.remove(3);
			arraySize1 = list.size();
			System.out.println(arraySize1);
			
			//is there any way to clear or empty a list. 
			list.clear();
			
			arraySize1 = list.size();
			System.out.println(arraySize1);
			
			//any way to check if the list is empty or have values. 
			boolean isEmpty = list.isEmpty();
			System.out.println(isEmpty);
	}

}
