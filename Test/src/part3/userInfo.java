package part3;

import java.util.Scanner;

public class userInfo {
	/**
	 * Write a program that takes information from the user about ( age, eye color, tall, language speak and weight then print that info in the end
Something like this:


Add if statement to check if the weight is over 50, print message to user saying over weight

Ask the user for their name. Then display their name to prove that you can recall it. 
Ask them for their age. Then display what their age would be five years from now.
 Then display what their age would be five years ago.
	 */
	private static Scanner nextInput;

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);

		System.out.println("What's your name?");
		String name = info.nextLine();
		System.out.println("");
		
		System.out.println("How old are you ?");
		int age = info.nextInt();
		System.out.println("");

		System.out.println("What's your height in cm?");
		int height = info.nextInt();
		System.out.println("");

		System.out.println("What language do you speak ?");
		String language = info.nextLine();
		System.out.println("");

		System.out.println("What is your eyes color ?");
		String eye = info.nextLine();
		System.out.println("");

		System.out.println("What's your weight in kg?");
		int weight = info.nextInt();
		System.out.println("");
		
		int ageAfter = age + 5;
		int ageBefore = age - 5;
		
		System.out.println("Hello " + name + ", here is a summuray for information you enterd:");
		System.out.println("you're " + age + " years old.");
		System.out.println("you will be " + ageAfter + " years old after 5 years from now");
		System.out.println("you were " + ageBefore + "vyears old 5 years ago");
		System.out.println("your height is " + height + "cm.");
		System.out.println("you speak " + language);
		System.out.println("your eyes are " + eye);
		System.out.println("you weigh " + weight + "kg.");
		if (weight > 50) 
		{
			System.out.println("You are overweight!");
		}
		System.out.println("");
		
		

	}

}
