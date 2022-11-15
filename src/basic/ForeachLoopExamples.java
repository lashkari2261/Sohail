package basic;

public class ForeachLoopExamples {

	public static void main(String[] args) {
		
		   // for each is designed to go through the entire collection



	       int[] nums = { 15, 51, 87, 89, 85 };
	        // i = 0,1,2,3,4
	        // index number
	        System.out.println("For Loop");
	        for (int i = 0; i < nums.length; i++) {
	            // to refer to the index of the array,
	            // i have to mention the name name of the array
	            // and then use i for the index number
	            // nums[i] 0,1,2,3,4
	            System.out.println(nums[i]);
	        }



	       System.out.println("For Each Loop");



	       // for(data-type pointer: collection-name) {body of the loop}



	       for (int pointer : nums) {
	            // pointer is refer to the value of each index on every iteration
	            System.out.println(pointer);
	        }




		
	}

}
