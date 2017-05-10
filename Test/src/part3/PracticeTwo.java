package part3;

import java.util.Scanner;

public class PracticeTwo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		do {
			while (!input.hasNextInt()) {
				System.out.println("this is not");
				input.next();
			}
			number = input.nextInt();
		} while (number <= 0);
		System.out.println("tnq" + number);

	}

}
