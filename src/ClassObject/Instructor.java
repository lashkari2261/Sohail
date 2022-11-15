package ClassObject;

public class Instructor {
	 // variables
    String firstName;
    String lastName;
    // constructors
    // default - when you dont have a arguments
    public Instructor() {
        firstName = "";
        lastName = "";
    }
    // Parameterized constructor - when you have arguments
    public Instructor(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }
    // print name if this format lastname, firstname
    public void printFullName() {
        System.out.println(lastName + ", " + firstName);
    }
    public int sum(int a, int b) {
        return a + b;
    }
    // 
    // Definition of a method - everything before the body
    // Implementation of a method - the body method
    // Signature of a method - name and args
    // Parameters/arguments of a method - args - what goes inside parenthesis
    // Return of a method - depends to return type of your method. 
    // if void, you dont return anything
    // if any other data type, you must have a return statement 
    // What is input to a method and what is output of a method
    // input = args
    // output = either something that the function will do, like printing something
    // or returning something
    // constructor vs methods
    // constructors will never have return types
    // constructors name must match the name of the class
    // methods must have return data-type 
    // methods does not have to have the class name
    // both must have unique signatures within the same scope

}
