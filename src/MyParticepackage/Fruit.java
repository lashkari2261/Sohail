package MyParticepackage;

public class Fruit {
Object Fruit;
String name;
double baseprice;
double quantity;
public Fruit(Object fruit, String name, double baseprice, double quantity) {
	super();
	Fruit = fruit;
	this.name = name;
	this.baseprice = baseprice;
	this.quantity = quantity;
}

public Fruit() {
	// TODO Auto-generated constructor stub
}

public double getTotalPrice() {
return baseprice * quantity;	
}


}	

