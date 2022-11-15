package basic;







import java.util.TreeSet;




public class Student {
	public static void main(String[] args) {
		 TreeSet<Integer> num = new TreeSet<Integer>();
num.add(10);
num.add(14);
num.add(16);
num.add(22);
num.add(25);
num.add(36);
num.add(70);
num.add(82);
num.add(89);

System.out.println("Original tree set: "+ num);
System.out.println("Removes the first(lowest) element: " +num.pollFirst());
System.out.println("Tree set after removing first element: "+ num);
	}
}
