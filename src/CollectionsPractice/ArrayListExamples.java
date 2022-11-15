package CollectionsPractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExamples {

	public static void main(String[] args) {

		// ArrayList is good with relatively smaller data sets
		// Its good when you have a lot of retrieval and not a lot of addition or modifications
		
		// concept of how addition/grow is coded
		// there will be a an array that stores your data. the initial size is 10
		// every time you increase the size, it will need to create a bigger array 
		// and move the data to that, so you will have some empty indexes to use
	
		// concept of how removal is coded
		// every time you remove an index, it will need to move all of the following indexes
		// one step back
		
		ArrayList<String> temp = new ArrayList<String>(500);
		temp.add("1");
		temp.add("2");
		temp.add("3");
		temp.add("4");
		temp.add("5");
		System.out.println(temp);
		
		// <> Generics in Java - you can only pass reference data 
		// types/not primitives
		
		// Wrapper Classes
		// are classes that wraps the primitives. they will have functions that you could use
		// they are also useful when you work with collections as you can only pass a reference
		// data type in the generics
		
		
		
		// linked list is created with a chain of nodes
		// we have two concept/type of linked list
		// 1 - singly - every node has a reference to the next node
		// 2 - doubly - every node has a reference to the next and previous nodes
		// the linked list that you use in java is a doubly linked list
		
		// concept of addition, every time you add a new data to a linked list,
		// it creates a node and stores you data in that
		// concept of removal or change, it needs to find that node and then change 
		// the reference of the previous node to the one after, that will remove that node from the chain
		// concept of retrieval, to return an index, you will need to start from the beginning or the end 
		// of the chain, and go toward the node you need to return
		// in a doubly linked list, the size is divided by 2, if the index is bigger, 
		// then we start from the end, if the index you look is smaller, we start from the beginning 
		
		
		
		LinkedList<String> lltemp = new LinkedList<String>();
		lltemp.add("1");
		lltemp.add("2");
		lltemp.add("3");
		lltemp.add("4");
		lltemp.add("5");

	}

}
