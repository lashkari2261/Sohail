package basic;

public class Assigmenthw {

	public static void main(String[] args) {
		
		//avg
		int[] totalSales = { 156, 5, 1, 75, 545 };

		System.out.println("length of the array " + totalSales.length);
		int index = 0;
		
		// I want to see the sum of all of the integers in the array
		int sum = 0;
		int Avg = 0;
		int min = 0;
		
		while (Avg < totalSales.length) { 
			sum = sum + totalSales[Avg];
			System.out.println(totalSales[(int) Avg]);
			Avg++;
		}
		System.out.println("Grand total: " + sum);
		System.out.println("Avg "+ (double)sum / Avg);
	}
	
	
	{
//		
		
		
		// min
		int[] totalSales3 = { 156, 5, 1, 75, 545 };

		
		int min = totalSales3[0];
		int index1 = 0;
		
		while (index1 < totalSales3.length) { 
			if (totalSales3[index1]< min) min = totalSales3[index1];
			index1++;
			
		}
		System.out.println("min:" + min);
		
		
		// max
		
int[] totalSales2 = { 156, 5, 1, 75, 545 };

		
		int max = totalSales2[0];
		int index11 = 0;
		
		while (index11 < totalSales2.length) { 
			if (totalSales2[index11]> max) max = totalSales2[index11];
			index11++;
			
		}
		System.out.println("max of array: / " + max);
	}

}
