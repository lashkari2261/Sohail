package Collection;

import java.util.ArrayList;
import java.util.List;

public class DynamicRemoveElement {

	public static void main(String[] args) {
		//another way to instantiate and object ArrayList. 
				List<String> cities = new ArrayList<>(); 
				
				cities.add("Falls Church");
				cities.add("Arlington");
				cities.add("Tysons");
				cities.add("Alexandria");
				
				
				//write a code that remove all the cities starting with letter A.
				for(int index = 0 ; index < cities.size() ; index++) {
					if (cities.get(index).startsWith("A")) {
						cities.remove(index);
					}
				}
				
				for (String city : cities) {
					System.out.println(city);
				}
	}

}
