package basic;

public class diamondExample {

	
	public static void main(String[] args) {
		
		// Optional Question 1
        // make a diamond using nested loops 
        // you should have one int that specifies the size of the diamond
        // make 2 side by side
        //     *
        //   * * *
        // * * * * *
        //   * * *
        //     *
        
        // Optional Question 2 
        // code something that gets us the Fibonacci numbers 
        // you should have an int that defines how many of fib numbers you should return
		//I did this
for (int i = 1; i < 5; i++ ) {
	for (int k =3; k>=i; k--) {
		System.out.print(" ");
	}
	for ( int j =1; j<=i; j++) {
		System.out.print("* " );
	}
	System.out.println();
}

for (int i = 1; i < 5; i++ ) {
	for (int k = 1; k <= i; k++) {
		System.out.print(" ");
	}
	for ( int j =1; j<=4-i; j++) {
		System.out.print("* " );
	}
	
	
	System.out.println();
}


// teacher did it
int size = 5;
int dCount = 5;
String space = " ";
String star = "* ";
// going through the rows
String row = "";
for (int r = size; r > 0; r--) {
    // going through spaces
    for (int s = r; s > 0; s--) {
        row+=space;
    }
    // going through stars
    for (int a = 0; a < size - (r - 1); a++) {
        row+=star;
    }
    // going through spaces
    for (int s = r; s > 0; s--) {
        row+=space;
    }
    // to print the line
    for (int i = 0; i < dCount; i++) {
        System.out.print(row);
    }
    row = "";
    System.out.println();
}
for (int r = 0; r < size + 1; r++) {
    // going through spaces
    for (int s = r; s > 0; s--) {
        row += space;
    }
    // going through stars
    for (int a = 0; a < size - (r - 1); a++) {
        row+=star;
    }
    // going through spaces
    for (int s = r; s > 0; s--) {
        row+=space;
    }
    // to print the line
    for (int i = 0; i < dCount; i++) {
        System.out.print(row);
    }
    row = "";
    System.out.println();
}





}
}
