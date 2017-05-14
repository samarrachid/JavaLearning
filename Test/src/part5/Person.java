package part5;

import java.util.Scanner;

// create a person class.
public class Person {
	

	
	public static void main(String[] args) {
		 String country = null;
		 String eyeColor;
		 String hairColor;
		
		 String gender = "";
		 String language = "";
		 String firstName = "" ;
		 String lastName = "";
		
		int age = 0;
		int height=0;
		int weight=0;
		int phoneNumber=0;
		int passportNumber=0;
		Scanner input = new Scanner(System.in);
		
		getFullName(firstName, lastName, input);
		getCountry(country, language, input, firstName);
		getAge(age, input);
		getGenderWeight(gender, weight, input);
//		System.out.println(getFullName(firstName, lastName, input));
		input.close();
		
	}
	
	public static String getFullName(String firstName, String lastName, Scanner input) {
		System.out.println("enter your first name: ");
		firstName = input.nextLine();
		System.out.println("enter your last name: ");

		lastName = input.nextLine();
		String fullName = firstName + " " +lastName;
		System.out.println("Hello, " + fullName);
		return fullName;
	}
	
	public static String getCountry(String country, String language, Scanner input, String firstName) {
		System.out.println("Where are you from? " );
		
		country = input.nextLine();
		
		
		if ( country.equals("syria") || country.equals("Syria")) {
			language = "Arabic" ;
			System.out.println("You must speak " + language + "!");
			
		}
		else if (country.equals("USA") || country.equals("america")|| country.equals("America")) {
			language = "English";
			System.out.println("You must speak " + language + "!");
			
		}
		return country;
	}
	public static int getAge(int age, Scanner input) {
		System.out.println("How old are you? ");
		age = input.nextInt();
		if(age < 16) {
			System.out.println("oh, you're too young to drive! ");
		}
		else if (age < 18) {
			System.out.println("Guess your age doesn't allow you to vote! ");
		}
		else if ( age < 25) {
			System.out.println("NOOO you can't rent a car!!  But you still can steel your dad's car ;)");
		}
		else if ( age >= 25) {
			System.out.println("Lucky you!, you can do anything! just don't take drugs ok ^_^");
		}
		else {
			System.out.println("you must enter an age!");
		}
		
		return age;
	}
	
	public static String getGenderWeight(String gender, int weight, Scanner input) {
		System.out.print("What's you gender? ");
		gender = input.nextLine();
		gender = input.nextLine();
		if (gender.equals("female")) {
			System.out.println("Do you think you're pretty? ");
			String pretty = input.nextLine();
			if(pretty.equals("yes")) {
				System.out.println("Mmm, tell me your weight then to tell you if you're pretty as you think!");
				weight = input.nextInt();
				if (weight <= 50) {
					System.out.println("guess you win!");
				}
				else if (weight > 50) {
					System.out.println("you're pretty no matter what!, but i guess you should lose some weight..");
				}
			
			}
		
			else if (gender.equals("male")) {
			System.out.println("Do you think you're courage enough?");
			String courage = input.nextLine();
			if (courage.equals("yes")) {
				System.out.println("this is something! prove it :P /n"
						+ "Let's play a quick game to see if you're right. /n"
						+ "The game is called (Would You Rather), i will ask you three questions and will evaluate your courage according to your answers. /n"
						+ "Type 1 or 2 according to the questions order. /n"
						+ "Let's get started");
				System.out.println("Question 1 ..Would you rather /n"
						+ "1. Always to say everything on your mind? /n"
						+ "2. Never be able to speak again?");
				int answer1 = input.nextInt();
				
				System.out.println("Question 2 .. Would you rather /n"
						+ "1. Confess a girl you love? /n"
						+ "2. Stay silent and wait for her to confess you?");
				int answer2 = input.nextInt();
				
				System.out.println("Question 3 .. Would you rather /n"
						+ "1. Save a girl from someone trying to kill her? /n"
						+ "2. Run and save your own life?");
				int answer3 = input.nextInt();
				
				int count = 0;
				if (answer1 == 1) {
					System.out.println("well, that's courage enough!");
					count ++;
				}
				else if (answer1 == 2) {
					System.out.println("that's good but not what i expected from you");
				}
				
				if (answer2 == 1) {
					System.out.println("Romantic!!");
					count ++;
				}
				else if (answer2 == 2) {
					System.out.println("Shame on you!!!");
				}
				
				if (answer3 == 1) {
					System.out.println("Bold!");
					count ++;
				}
				else if(answer3 ==2) {
					System.out.println("this is selfishness!!!");
				}
				
				System.out.println("now that was challenging, let me show you your result");
				if (count == 3) {
					System.out.println("you got me! .. i consider you a brave person");
				}
				else if (count == 2) {
					System.out.println("well you're brave .. just not the most brave person on earth!");
				}
				else if (count == 1) {
					System.out.println("Game over!, better luck next time");
					
				}
			}
		}
		}
		
		
	return gender;
	}
	
}