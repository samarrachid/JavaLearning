package part3;

import java.util.Scanner;

public class ageLegacy {
	/**
	 * Make a program which displays a different message depending on the age
	 * given. Here are the possible responses: age is less than 16, say "You
	 * can't drive." age is less than 18, say "You can't vote." age is less than
	 * 25, say "You can't rent a car." age is 25 or over, say "You can do
	 * anything that's legal."
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter your age ! ");
		int age = input.nextInt();
		age16(age);
		age18(age);
		age20(age);
		age25(age);
	}

	public static void age16(int age) {
		if (age < 16) {
			System.out.println("You can't drive !");
		}
	}

	public static void age18(int age) {
		if (age < 18) {
			System.out.println("You can't vote !");
		}
	}

	public static void age20(int age) {
		if (age < 25) {
			System.out.println("You can't rent a car!");
		}
	}

	public static void age25(int age) {
		if (age >= 25) {
			System.out.println("You can do anything that's legal !");
		}
	}
}