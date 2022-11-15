package ClassObject;

public class Book {

	
    // variables
//  title of the book
    String title;
    String authorName;
    int numberOfPages;
    double price;
    public Book() {
        title = "";
        authorName = "";
        numberOfPages = 0;
        price = 0;9
    }
    public Book(String newTitle, String newAuthor, int pageNum, double newPrice) {
        title = newTitle;
        authorName = newAuthor;
        numberOfPages = pageNum;
        price = newPrice;
    }
    public void printInfo() {
        System.out.println("Book [Title: " + title + ", Author: " + authorName + ", NumberOfPages: " + numberOfPages
                + ", Price: $" + price + "]");
    }
	
}
