package part3;

import java.util.Scanner;

public class Password2 {
	/**
	 * rite a Java method to check whether a string is a valid password.
	 * Password rules: A password must have at least ten characters. A password
	 * consists of only letters and digits. A password must contain at least two
	 * digits.
	 */

	public static final int PASSWORD_LENGTH = 8;

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("1. A password please");
		String s = input.nextLine();

		char c = 0;
		if (is_Valid_Password(s)) {
		}

	}


	public static boolean is_Valid_Password(String password) {
		char ch = password.charAt(1);
		if (isNumeric(ch)) {
			System.out.println("Password is number ");
			return true;
		} else {
			System.out.println("Password not a letter: ");
			return false;
		}
	}

	/**
	 * method to check if the input is letter
	 * @param ch
	 * @return
	 */
	public static boolean isLetter(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'Z');
	}

	/**
	 * method to check if the input is number
	 * @param ch
	 * @return
	 */
	public static boolean isNumeric(char ch) {
		return (ch >= '0' && ch <= '9');
	}
}
