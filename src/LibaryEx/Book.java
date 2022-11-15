package LibaryEx;

public class Book {
private String title;
private String author;
private int PageNum;
private String isbn;
private double price;


public Book () {
	super();
	this.setTitle("");
	this.setAuthor("");
	this.setPageNum(0);
	this.setIsbn("");
	this.setPrice(0);	
}
public Book (String title, String author, int pageNum, String isbn, double Price) {
	this();
	this.setTitle(title);
	this.setAuthor(author);
	this.setPageNum(pageNum);
	this.setIsbn(isbn);
	this.setPrice(Price);
}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getPageNum() {
	return PageNum;
}
public void setPageNum(int pageNum) {
	PageNum = pageNum;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String toString() {
    return "Book [Title: " + title + ", NumberOfPages: " + PageNum + ", isbn: " + isbn + "Price: $" + price+ "]";
} 
}
