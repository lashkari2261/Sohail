package Collection;

import java.util.ArrayList;
import java.util.List;

public class ItemListEx {

	public static void main(String[] args) {
List<Item> itemsList = new ArrayList<>();
		
		Item apple = new Item("Apple", 1.32);
		Item orange = new Item("Orange", 0.92);
	
		itemsList.add(apple);
		itemsList.add(orange);
		 
		for(Item value : itemsList) {
			System.out.println(value.getName());
			System.out.println(value.getPrice());
		}	

	}

}
