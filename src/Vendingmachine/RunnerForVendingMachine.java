package Vendingmachine;

public class RunnerForVendingMachine {

	public static void main(String[] args) {
		 // sample products
        Product p1 = new Product("M&M", 2.99, 8);
        Product p2 = new Product("RedB", 3.89, 15);
        Product p3 = new Product("Rani", 3.59, 7);
        Product p4 = new Product("Cake", 4.12, 5);
        Product p5 = new Product("Bar", 2.99, 15);
        Product p6 = new Product("Kitcat", 1.98, 12);
        Product p7 = new Product("Water", 1.99, 17);
        Product p8 = new Product("Coke", 1.2, 5);
        Product p9 = new Product("Lays", 0.99, 21);
        Product p10 = new Product("IceT", 3.88, 5);
        Product p11 = new Product("Pepsi", 1.2, 4);
        Product p12 = new Product("Coffee", 2.80, 7);
        Product p13 = new Product("Gum", 3.2, 8);
        Product p14 = new Product("Chips", 1.5, 15);
        Product p15 = new Product("7Up", 1.2, 7);
        // this class will have the main method
        // we use this to test our code
        VendingMachine machine1 = new VendingMachine();
        // adding the products to the first row in the machine
        machine1.addItem(p1, 0, 0);
        machine1.addItem(p2, 0, 1);
        machine1.addItem(p3, 0, 2);
        machine1.addItem(p4, 0, 3);
        machine1.addItem(p5, 0, 4);
        // adding the products to the second row in the machine
        machine1.addItem(p6, 1, 0);
        machine1.addItem(p7, 1, 1);
        machine1.addItem(p8, 1, 2);
        machine1.addItem(p9, 1, 3);
        machine1.addItem(p10, 1, 4);
        // adding the products to the third row in the machine
        machine1.addItem(p11, 2, 0);
        machine1.addItem(p12, 2, 1);
        machine1.addItem(p13, 2, 2);
        machine1.addItem(p14, 2, 3);
        machine1.addItem(p15, 2, 4);
        System.out.println(machine1);
        machine1.sellItem(true, 0, 0);
        machine1.sellItem(true, 0, 3);
        System.out.println();
        System.out.println();
        System.out.println(machine1);
    }
}