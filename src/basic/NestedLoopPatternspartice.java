package basic;

import java.util.Iterator;

public class NestedLoopPatternspartice {

	public static void main(String[] args) {
 		  // print this with a nested loop
//      System.out.print("*");
        // * * * * *
        // * * * *
        // * * *
        // * *
		// *
        System.out.println("*********************************");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
            System.out.println("*****************************");

	}
        int size = 4;
        int number = 1;
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                if(number < 10) {
                    // add a zero
                    System.out.print("0" + number++ + "\t");
                } else {
                    System.out.print(number++ + "\t");
                }
                
            }
            System.out.println();
            System.out.println();
        }
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(number < 10) {
                    // add a zero
                    System.out.print("0" + number++ + "\t");
                } else {
                    System.out.print(number++ + "\t");
                }
            }
            System.out.println();
            System.out.println();
        }
        // * * * *
        // * * *
        // * *
        // *
        
        System.out.println("*****************************");
        
        // A
        // B C
        // D E F
        
        char c = 'A';
        for ( int i = 0; i < 2; i++) {
        	for ( int j = 0; j <= i; j++ ) {
        		System.out.print(c++ + " ");
        	}
        	System.out.println("*******************");
        }
       
	}} 
