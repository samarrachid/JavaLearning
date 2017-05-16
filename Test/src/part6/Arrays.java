package part6;

/*
Find Largest and Smallest Number in an Array Example
This Java Example shows how to find largest and smallest number in an
array.
*/
public class Arrays {

	public static void main(String[] args) {

		// array of 10 numbers

		// assign first element of an array to largest and smallest
		System.out.println("Smallest Number is : ");
	}

	// Given an array of ints, return true if 6 appears as either the first or last element in the array.
	// The array will be length 1 or more. 
	public boolean firstLast6(int[] nums) {
		return (nums[0] == 6 || nums[nums.length - 1] == 6);
	}

}
