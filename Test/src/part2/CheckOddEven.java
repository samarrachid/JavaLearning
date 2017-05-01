package part2;

import java.util.Scanner;

public class CheckOddEven {

	// update the program to let the user insert the number, then check if 0 or
	// odd or even

	static Scanner nextInput = new Scanner(System.in);

	public static void main(String[] args) {
		int x;
		x = nextInput.nextInt();

		if (x == 0) 
		{
			System.out.println("Number is Zero : " + x);
		}
		else if (x%2 != 0)
		{
			System.out.println("Number is Odd : " + x);
		}
		else if (x%2 == 0)
		{
			System.out.println("Number is Even : " + x);
		}
	}
}
