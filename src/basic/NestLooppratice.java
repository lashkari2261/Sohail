package basic;

public class NestLooppratice {

	public static void main(String[] args) {
		
		int num = 1;
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 5; j++) {
                if (num == 5) {
                    
                }
                System.out.print(num + ", ");
                num++;
            }
            System.out.println();
        }
         System.out.println("***********************************");
//       1  2  3  4  5
//       6  7  8  9  10
//       11 12 13 14 15



//       create a nested loop that gives these values



      int num1 = 1;
       for (int row = 0; row < 3; row++) {
           for (int col = 0; col < 5; col++) {
               String temp = num1 < 10 ? "0" + num1 : "" + num1;
               System.out.print(temp + " ");
               num1++;
           }
           System.out.println();
       }
	}

}
