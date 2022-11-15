package Vendingmachine;

public class VendingMachine {



	// variables
    // we need a 2D array of Product to store items in it
    Product[][] items;
    // constructor
    // default constructor that initializes the array to size of 3 x 5
    public VendingMachine() {
        items = new Product[3][5];
    }
    public VendingMachine(int rowSize, int colSize) {
        items = new Product[rowSize][colSize];
    }
    // add item
    // product, row, col
    public void addItem(Product p, int row, int col) {
        items[row][col] = p;
    }
    // Sell Item
    // payment / availability / address 
    public boolean sellItem(boolean payment, int row, int col) {
        if(payment == true) {
            // try to sell 
            return items[row][col].dispense();
        } else {
            // don't sell
            System.out.println("Payment Failed!");
            return false;
        }
    }
    // method toString
    // this method is given to us from class Object
    // when you print the name of the object, this method will be executed
    // you have to copy the exact definition of the method
    // public String toString(){}
    // if you do it correctly, you should be able to put annotation @Override
    // and its going to have a green arrow on the line number for that function
    public String toString() {
        String temp = "Vending Machine\n";
        for (int row = 0; row < items.length; row++) {
            for (int col = 0; col < items[row].length; col++) {
                if (items[row][col] == null) {
                    temp += " *empty* ";
                } else {
                    temp += items[row][col].name + "/" + items[row][col].qty + "  ***  ";
                }
            }
            temp += "\n";
        }
        return temp;
    }
}
