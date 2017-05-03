package part4;

import java.util.Scanner;

public class CheckString {


	public static void main(String[] args) {
		
		Scanner info = new Scanner(System.in);

		System.out.println("What's your name?");
		String name = info.nextLine();
		if(name.equals("Samar")) {
			System.out.println("Samar is the best");
		} else {
			System.out.println("Dania is the best");
		}
	}
}
