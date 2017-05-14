package part5;

import java.util.Scanner;

// create a person class.
public class Person {
	
	
	String eyeColor;
	String hairColor;
	String country;
	int age;
	int height;
	int weight;
	int phoneNumber;
	int passportNumber;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName ="we";
		String lastName=" Re";
		getFullName(firstName, lastName, input);
//		System.out.println(getFullName(firstName, lastName, input));

		input.close();
		
		
	}
	
	public static String getFullName(String firstName, String lastName, Scanner input) {
		System.out.println("enter your name: ");
		firstName = input.nextLine();
		lastName = input.nextLine();
		String fullName = firstName + " " +lastName;
		System.out.println(fullName);
		return fullName;
	}
	
}