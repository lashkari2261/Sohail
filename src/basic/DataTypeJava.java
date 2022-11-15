
		   
		   package basics;

		   public class DataTypes {

		       public static void main(String[] args) {

		           // we have 2 data-types in java

		           // 1. primitives
		           // whole number data types
		           // byte
		           byte b = 5;

		           // short
		           short s = 10;

		           // int
		           int i = 15;

		           // long
		           long l = 10;

		           // floating number data types
		           // float
		           float f = 15.123456789123f;
		           System.out.println(f);
		           // double
		           double d = 15.123456789123456789;
		           System.out.println(d);
		           // character and boolean data types
		           // char - it can take any one character inside single quotes
		           char c = 'a';
		           System.out.println((int) c);
		           System.out.println(c);
		           // boolean - this can only take true or false
		           boolean bol = true;

		           // 2. reference/class
		           // class - blue print
		           // object - an instance of a class / copy of the class
		           String str = "test";

		           String firstName; // declaration

		           firstName = new String("David");
//		               firstName = "David"; // what goes inside the "" is called literal values

		           System.out.println(str);

		           // addition vs concatenation +
		           // addition is adding two number / mathematically

		           int num1 = 10;
		           int num2 = 20;
		           System.out.println(num1 + num2);
		           System.out.println(num1 + num1 + num1 + num1);

		           // concatenation is adding values side by side
		           System.out.println("number " + num1 + num2);

		           // "10" is not the same as 10
		           String s1 = "15";
		           String s2 = "25";
		           System.out.println(s1 + s2);

		           String sample1 = "sample1: some number are " + 1 + 2;
		           System.out.println(sample1);

		           String sample2 = "sample2: some number are " + (1 + 2);
		           System.out.println(sample2);

		           // Referencing

		           int number1 = 99;

		           int number2 = 85;

		           int number3 = number1;

		           number3 = number2;

		           System.out.println(number3);

		           int num11 = 5; //8
		           int num22 = 8; //13
		           int num33 = 13; //8
		           num11 = num22;
		           num22 = num33;
		           num33 = num11;
		           System.out.println(num33);
		       }

		   
		   
	}


