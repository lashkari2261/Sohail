package InterviewQuestion;

import java.util.HashSet;

public class Interview_findDuplicates {

	public static void main(String[] args) {
		int[] numbers = { 12, 5, 1, 5, 3, 421, 4, 6, 2, 1, 12, 56, 1, 12, 3 };

		int[] numbers2 = { 1, 2, 3, 4, 5, 6 };

		// Q - find out if there is any duplicate in the array of numbers given to you
		System.out.println(hasDuplicate(numbers));

		System.out.println("hasDuplicate_Set(numbers) = " + hasDuplicate_Set(numbers));
		System.out.println("hasDuplicate_Set(numbers2) = " + hasDuplicate_Set(numbers2));

	}

	public static boolean hasDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					System.out.println("the duplicate number is " + nums[i] + " which was found on index number " + i
							+ " and " + j);
					return true;
				}
			}
		}
		return false;
	}

	public static boolean hasDuplicate_Set(int[] nums) {
		HashSet<Integer> temp = new HashSet<Integer>();
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (temp.add(nums[i]) == false) {
				System.out.print(nums[i] + "(index " + i + "), ");
				count++;
			}
		}
		System.out.println();
		System.out.println("We have found " + count + " duplicates in the array!");
		return count > 0;
	        
	        
	        

	}

}
