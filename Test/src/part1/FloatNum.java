package part1;
import java.util.Scanner;
public class FloatNum {
	/**
	 * 2. Write a Java program that reads a floating number and prints &quot;zero&quot; if the
number is zero. Otherwise, print positive or negative.
	 * @param args
	 */
	public static void main(String [] args){
		System.out.println("Enter a float number!");
		float a;
		float b;
		Scanner userInput = new Scanner(System.in);
		a = userInput.nextFloat();
		
		
		if (a == 0) {
			System.out.println("Value is Zero!");
			
		}
		else if (a >0) {
			System.out.println("Value is Positive");
		}
		
		else if (a < 0) {
			System.out.println("Value is Negative!");
		}
		
		System.out.println(Math.abs(a));
		if (Math.abs(a) < 1) {
			System.out.println("Absolute value is Small");
		}
		else if (Math.abs(a) > 1000000) {
			System.out.println("Absolute value isLarge");
			
		}
		
	}
}
