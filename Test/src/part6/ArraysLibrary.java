package part6;
import java.util.Arrays;
public class ArraysLibrary {
	public static void main(String[] args) {
		int[] numberArray = new int[10];
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = i;
			
		}
		
		int k = 0;
		while(k <= 51) {
			System.out.print("-");
			k ++;
		}
		
		for (int j = 0; j < numberArray.length; j ++) {
			System.out.print("| " + j + " ");
		}
		System.out.println("|");
		int[] arrayName = Arrays.copyOf(numberArray, 5);
		System.out.println(arrayName);
	}

}
