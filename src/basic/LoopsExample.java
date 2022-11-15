package basic;

public class LoopsExample {

	public static void main(String[] args) {
		
		// while (condition) {body}
		int x = 1;
		while (x<=10) {
		System.out.println(x++);
		}
		
		int x1 = 15;
		while (x1<=10) {
		System.out.println(x1++);
		}
		 
		int x2 = 15;
		do { 
			System.out.println(x2++);
		} while (x<=10);

        // while (conditions){ body }
        int x3 = 15;
        while (x3 <= 10) {
            System.out.println(x3++);
        }
        // while loop will check the condition first and then it runs the 
        // body of the loop if the condition is true to begin with
        do {
            System.out.println(x3++);
        } while (x3 <= 10);
        // do while runs the body of the loop first and then it checks the condition
        // it guarantees that the body the loop will executed at least once
       
        // the method length will give you an int / the number of characters in that string
//      System.out.println(str.length());
        // count the number of vowel characters in a given string
        //vowel characters
        String givenString = "This Is A TEst";
        // this is a test
        // refactoring a variable = change the name of the variable and all of its instances
        // alt + shit + r
        int countOfVowelChars = 0;
        int index = 0;
        // index < length of that string
        while (index < givenString.length()) { 
            char c = givenString.toLowerCase().charAt(index++);
            // i will check to see if the character is one of the vowels
            // if yes, then increase the count
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                ++countOfVowelChars;
            }
        }
        System.out.println("We have " + countOfVowelChars + " vowel characters in the given String!");
        System.out.println((int) ' ');

	}

}
