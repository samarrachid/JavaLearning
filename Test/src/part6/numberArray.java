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
 		while(k <= 30) {
 			System.out.print("-");
 			k++;
 			
 		}
 		System.out.println();
 		
 		for (int j = 0; j < numberArray.length; j ++) {
 		System.out.print("| " + j + "  ");
 		}
 		// if i don't write the below statement the the row won't be printed, why?!
 		System.out.println("|");
 		
 		for (int row : numberArray) {
 			System.out.print(row);
	}
 		System.out.println("\n");
 		
 		
		
	}
	
}
