package part6;
import java.util.Arrays;

public class numberArray {
	public static void main(String [] args) {
	// this is one demonsional array
		int[] numberArray = new int[10];
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = i;
		}
		
 		int k = 1;
 		while(k <= 51) {
 			System.out.print("-");
 			k++;
 			
 		}
 		System.out.println();
 		// here why are we assigning j as new value while we've already assigned i?n
 		for (int j = 0; j < numberArray.length; j ++) {
 		System.out.print("| " + j + " ");
 		}
 		// if i don't write the below statement the the row won't be printed, why?!
 		System.out.println("|");
 		// the ":" is to relate row to numberArray?
 		for (int row : numberArray) {
 			System.out.print(row);
	}
 		System.out.println("\n");
 		// print the first 5 indexes of the array
 		int[] numberCopy = Arrays.copyOf(numberArray, 5);
 		for (int row : numberCopy) {
 			System.out.print(row);
	}
 		System.out.println("\n");
 		// print the first 5 indexes but as an array 
 		System.out.print(Arrays.toString(numberCopy));
 		System.out.println("\n");
 		// start at a specific place and end at a specific one, start at index 3 end at index 6
 		int[] copyRange = Arrays.copyOfRange(numberArray, 4, 6);
 		for (int rows : copyRange) {
 			System.out.print(rows);
 		}
 		System.out.println();
 		char [][] boardGame = new char[10][10];
 		for (char[]row : boardGame) {
 			Arrays.fill(row, '*');
 			System.out.println(row);
 		}
 		
		
	}
	
}
