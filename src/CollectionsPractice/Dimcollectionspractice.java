package CollectionsPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
public class Dimcollectionspractice {
public static void main(String[] args) {
	// map of all of the students
			// key = string = name of the class
			// value = ArrayList<String> = list of names

			HashMap<String, ArrayList<String>> students = new HashMap<>();
			students.put("Panthers", new ArrayList<String>());
			students.put("Titans", new ArrayList<String>());
			students.put("Tigers", new ArrayList<String>());
			students.put("Sharks", new ArrayList<String>());
			students.put("Transformers", new ArrayList<String>());
			students.put("Phantom", new ArrayList<String>());
			
			students.get("Panthers").add("Jack");
			students.get("Panthers").add("David");
			students.get("Panthers").add("Anna");
			
			students.get("Tigers").add("Michael");
			students.get("Tigers").add("Ahmad");
			
			
			System.out.println(students);
			
			
			// dont do stuff like this / no one likes it
			ArrayList<ArrayList<HashMap<String, LinkedList<String>>>> temp ;
			
			
			// 2 Dimensional arrayList of string
			ArrayList<ArrayList<String>> temp2 = new ArrayList<>();
			temp2.add(new ArrayList<>());
			temp2.add(new ArrayList<>());
			temp2.add(new ArrayList<>());

			temp2.get(0).add("Jack");
			temp2.get(2).add("1");
			temp2.get(2).add("2");
			
			
			System.out.println(temp2);
			
}
}
