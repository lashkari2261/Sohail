package basic;

public class SelectionBasics2 {

	public static void main(String[] args) {
		// you grade will be between 0 - 100 
        // for each range you get a letter
        // 90-100 A
        // 80-89 B
        // 70-79 C
        // 60-69 D
        // 0-59 F

        double grade = 98;

        if(grade >= 95) {
            System.out.println("A"+ grade);
        } else if (grade >= 80) {
            System.out.println("B" + grade);
        } else if (grade >= 70) {
            System.out.println("C"+ grade);
        } else if (grade >= 60) {
            System.out.println("D"+ grade);
        } else {
            System.out.println("F"+ grade);
        }
       
        
     // calculate grades and assign letter
        // assign plus and minus as well
        // 90 - 100 A
        // 80 - 89 B
        // 70 - 79 C
        // 60 - 69 D
        // 0 - 59 F
        // in each category, if you pass 5, then add + if not add -
        // example 95 A+ 94 A-
        
        double grade1 = 34;
        if(grade1 >= 95) {
            System.out.println("A+"+ grade1);
        } 
        else if(grade1 >= 90) {
            System.out.println("A-"+ grade1);
        } 
        else if(grade1 >= 85) {
            System.out.println("B+"+ grade1);
        } 
        else if(grade1 >= 80) {
            System.out.println("B-"+ grade1);
        } 
        else if(grade1 >= 75) {
            System.out.println("C+"+ grade1);
        } 
        else if(grade1 >= 70) {
            System.out.println("C-"+ grade1);
        } 
        else if(grade1 >= 65) {
            System.out.println("D+"+ grade1);
        } 
        else if(grade1 >= 60) {
            System.out.println("D-"+ grade1);
        
	} else {
        System.out.println("F"+ grade1);
    }
	}

}




