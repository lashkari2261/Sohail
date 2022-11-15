package Vendingmachine;

public class Product {
	String name;
    double price;
    int qty;
    // constructors
    public Product() {
        name = "";
        price = 0;
        qty = 0;
    }
    public Product(String newName, double newPrice, int newQTY) {
        name = newName;
        price = newPrice;
        qty = newQTY;
    }
    public void printProductInfo() {
        System.out.println("Product [Name: " + name + ", Price: $" + price + ", Quantity: " + qty + "pcs]");
    }
    public boolean dispense() {
        // decrease the quantity
        // print a receipt
        // check to see if the qty > 1, if so, dispense
        if (qty > 0) {
            // reducing the quantity
            qty--;
            // printing the message to console
            System.out.print("Item Sold => New Product info => ");
            printProductInfo();
            // returning true
            return true;
        } else {
            System.out.println("Out of Stock!");
            return false;
        }
    }
    public int reStock(int newQty) {
        qty += newQty;
        System.out.println(name + " new QTY: " + qty);
        return qty;
    }
    public static void main(String[] args) {
        Product prod1 = new Product("M&M", 3.99, 2);
        prod1.reStock(15);
    }

	
		
	}
	



	

