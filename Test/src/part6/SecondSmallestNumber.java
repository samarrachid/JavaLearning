package part6;
import java.util.Arrays;
//Write a Java program to find the second smallest element in an array

public class SecondSmallestNumber {
	public static void main(String[] args) {
		
		
	
		int[] numbers = {4, 2, 5, 6, 15, 3, 7};
		System.out.println("this is an array of integers: ");
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("the second smallest number is " + numbers[1]);
	}

}
