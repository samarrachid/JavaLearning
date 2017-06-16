package part4;

import java.util.Scanner;

public class KeyboardScanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an intger: ");
		int number = input.nextInt();
		System.out.print("Enter a floating point: ");
		float f_number = input.nextFloat();
		float sum = number + f_number;
		System.out.println("What's your name? ");
		String name = input.nextLine();
		String name2 = input.nextLine();
		// when i do only one string it doesn't take the input!!!!

		input.close();
		sum(number, f_number, sum, name2);
	}

	public static void sum(int number, float f_number, float sum, String name2) {
		System.out.println("Hi! " + name2 + " the sum of " + number + " and " + f_number + " is " + sum);
	}

}
