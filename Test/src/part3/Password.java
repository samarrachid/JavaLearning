package part3;

import java.util.Scanner;

public class Password {

	/**
	 * rite a Java method to check whether a string is a valid password.
	 * Password rules: A password must have at least ten characters. A password
	 * consists of only letters and digits. A password must contain at least two
	 * digits.
	 */

	static Scanner input = new Scanner(System.in);

	public static void main(String args[]) {
		String password = "0";
		length10(input, password);
		digitOrLetter(input, password);

	}

	public static void length10(Scanner input, String password) {
		System.out.println("Enter password:");
		password = input.nextLine();
		while (password.length() < 10) {

			System.out.println("password must have 10 chars at least");
			// if (Character.LetterOrDigit(password.charAt)) {
			password = input.nextLine();

		}

	}

	public static void digitOrLetter(Scanner input, String password) {
		int digit = 0;
		if (!Character.isLetterOrDigit(password.charAt(0))) {
			System.out.println("Enter digit or letter only!!");
			password = input.nextLine(); }
			while (Character.isDigit(password.charAt(0))) {
				digit++; 
				if (digit < 2) {
					System.out.println("your password must contain at least 2 digits!");
					password = input.nextLine();
				}

				}
				
			
		}

	

}
