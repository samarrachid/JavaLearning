package part3;
import java.util.Scanner;

public class OddTest {
	/**
	* - Write a boolean method called isOdd() in a class called OddTest,
	 *  which takes an int as input and returns true if the it is odd.
	 *   The signature of the method is as follows:
public static boolean isOdd(int number) Also write the main() method 
that prompts user for a number, and prints "ODD" or "EVEN". 
You should test for negative input.
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 0 ;
		Scanner input = new Scanner(System.in);
		isOdd(a, input);
		
		
	}
	
	public static boolean isOdd(int a, Scanner input) {
		System.out.println("enter a number to see if it's odd or even");
		a = input.nextInt();
	if	( a%2 != 0) {
		System.out.println(a +" is an odd number");
		return true;
	}
		if (a%2 == 0) {
			System.out.println(a + "is an Even number");
			return false;
		}
		return false ;
		
		
		
				
		
	}
	

}
