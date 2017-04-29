package part1;
import java.util.Scanner;
public class TwoIntegers {
	/**
	 * Write Java program to allow the user to input two integer
values and then the program prints the results of adding,
subtracting, multiplying, and dividing among the two values.
	 * @param args
	 */
	public static void main(String [] args){
		System.out.println("Enter two integers!");
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	Scanner userInput = new Scanner (System.in);
		a = userInput.nextInt();
		b = userInput.nextInt();
		
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		System.out.println("Adding a and b=" +" " + c);
		System.out.println("Substracting a from b=" +" "+ d);
		System.out.println("Multiplying a and b=" +" " + e);
		System.out.println("Dividing a on b=" +" " + f);	// update the program to check  the result, if result equal to 7a7ee7(Not float) print message, otherwise print different message.
		
	}
}
//Like what you did here, Excellent Job! Some updates for better
