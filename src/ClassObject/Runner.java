package ClassObject;

public class Runner {

	public static void main(String[] args) {
		 Book obj = new Book("Harry Potter", "JK Rolling", 589, 85.99);
	        System.out.println(obj.title);
	        System.out.println(obj.authorName);
	        System.out.println(obj.numberOfPages);
	        System.out.println(obj.price);
	        Book temp = new Book("JAVA Illuminated", "someone", 700, 170);
	        System.out.println(temp.title);
	        System.out.println(temp.authorName);
	        System.out.println(temp.numberOfPages);
	        System.out.println(temp.price);
	        Book def = new Book();
	        System.out.println(def.numberOfPages);
	        def.authorName = "something new";
	        System.out.println(def.authorName);
	        temp.printInfo();
	        obj.printInfo();
	        def.printInfo();

	}

}
