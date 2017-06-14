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
		String firstName = "";
		String lastName = "";

		int age = 0;
		int height = 0;
		int weight = 0;
		int phoneNumber = 0;
		int passportNumber = 0;
		Scanner input = new Scanner(System.in);

		getFullName(firstName, lastName, input);
		getCountry(country, language, input, firstName);
		getAge(age, input);
		getGenderWeight(gender, weight, input);
		// System.out.println(getFullName(firstName, lastName, input));
		input.close();
		// make answer comments right under the Qes
	}

	public static String getFullName(String firstName, String lastName, Scanner input) {
		System.out.println("enter your first name: ");
		firstName = input.nextLine();
		System.out.println("enter your last name: ");

		lastName = input.nextLine();
		String fullName = firstName + " " + lastName;
		System.out.println("Hello, " + fullName);
		return fullName;
	}

	public static String getCountry(String country, String language, Scanner input, String firstName) {
		System.out.println("Where are you from? ");

		country = input.nextLine();

		// if ( country.equals("syria") || country.equals("Syria")) {// Mmmm you
		// can use
		if (country.equalsIgnoreCase(("syria"))) {
			language = "Arabic";
			System.out.println("You must speak " + language + "!");

		} else if (country.equalsIgnoreCase("USA") || country.equalsIgnoreCase("america")) {
			language = "English";
			System.out.println("You must speak " + language + "!");

		}
		return country;
	}

	public static int getAge(int age, Scanner input) {
		System.out.println("How old are you? ");
		age = input.nextInt();
		if (age < 16) {
			System.out.println("oh, you're too young to drive! ");
		}
		if (age < 18) {
			System.out.println("Guess your age doesn't allow you to vote! ");
		}
		if (age < 25) {
			System.out.println("NOOO you can't rent a car!!  But you still can steel your dad's car ;)");
		}
		if (age >= 25) {
			System.out.println("Lucky you!, you can do anything! just don't take drugs ok ^_^");
		} else {
			System.out.println("you must enter an age!");
		}
		return age;
	}
// TODO in case if the user enters an empty line
	public static String getGenderWeight(String gender, int weight, Scanner input) {
		System.out.print("What's you gender? ");
		gender = input.nextLine();
		gender = input.nextLine();
		if (gender.equalsIgnoreCase("female")) {
			// get another condition for
			// girl :P+ always use
			// equalsIgnoreCase when
			// value is coming from
			// user, you never know :P

			System.out.println("Do you think you're pretty? ");
			String pretty = input.nextLine();
			if (pretty.equalsIgnoreCase("yes")) {
				System.out.println("Mmm, tell me your weight then to tell you if you're pretty as you think!");
				weight = input.nextInt();
				if (weight <= 50) {
					System.out.println("guess you win!");
				} else if (weight > 50) {
					System.out.println("you're pretty no matter what!, but i guess you should lose some weight..");
				}

			}
		}

		else if (gender.equalsIgnoreCase("male")) {
			System.out.println("Do you think you're courage enough?");
			String courage = input.nextLine();
			if (courage.equalsIgnoreCase("yes")) {
				System.out.println(
						"this is something! prove it :P \n" + "Let's play a quick game to see if you're right. \n"
								+ "The game is called (Would You Rather), i will ask you three questions and will evaluate your courage according to your answers. \n"
								+ "Type 1 or 2 according to the questions order. \n" + "Let's get started");
				System.out.println("Question 1 ..Would you rather \n" + "1. Always to say everything on your mind? \n"
						+ "2. Never be able to speak again?");
				int answer1 = input.nextInt();
				int count = 0;
				if (answer1 == 1) {
					System.out.println("well, that's courage enough!");
					count++;
				} else if (answer1 == 2) {
					System.out.println("that's good but not what i expected from you");
				}

				System.out.println("Question 2 .. Would you rather \n" + "1. Confess a girl you love? \n"
						+ "2. Stay silent and wait for her to confess you?");
				int answer2 = input.nextInt();
				if (answer2 == 1) {
					System.out.println("Romantic!!");
					count++;
				} else if (answer2 == 2) {
					System.out.println("Shame on you!!!");
				}
				System.out.println("Question 3 .. Would you rather \n"
						+ "1. Save a girl from someone trying to kill her? \n" + "2. Run and save your own life?");
				int answer3 = input.nextInt();
				if (answer3 == 1) {
					System.out.println("Bold!");
					count++;
				} else if (answer3 == 2) {
					System.out.println("this is selfishness!!!");
				}
				System.out.println("now that was challenging, let me show you your result");
				if (count == 3) {
					System.out.println("Congrats! .. i consider you a brave person");
				} else if (count == 2) {
					System.out.println("well you're brave .. just not the most brave person on earth!");
				} else if (count == 1) {
					System.out.println("Game over!, better luck next time");
				}
			} else if (courage.equalsIgnoreCase("no")) {
				System.out.println(
						"Mmm not courage but maybe smart! \n" + "let's play a quick game to see how smart you are! \n"
								+ "i'll ask you three math questions, you should pick one of three answers by typing a, b, or c \n"
								+ "let the fun begin!" + "\n" + "Question 1 :");

				System.out.println("1 + 13 * 2 - 0 * 50 - 20 + 3 * 2 - 1 + 0 * 5 + 1 =");
				System.out.println("a. 0 \n" + "b. 13 \n" + "c. 1");
				String smartAnswer1 = input.nextLine();
				int countSmartAnswer = 0;
				if (smartAnswer1.equalsIgnoreCase("c")) {
					countSmartAnswer++;
				}
				System.out.println("ok, now Question  2 \n" + "if dog * dog = 16 \n" + "dog * cat * cat = 36 \n"
						+ "dog * cat * bird = 72 \n" + "then : dog + cat + bird = ?");
				System.out.println("a. 14 \n" + "b. 18 \n" + "c. 14");
				String smartAnswer2 = input.nextLine();
				if (smartAnswer2.equalsIgnoreCase("b")) {
					countSmartAnswer++;
				}
				System.out.println("Last but not least ... \n"
						+ "now this is gonna be a bit different, i won't give you choices you should guess the answer!");
				System.out.println("what is the number that if it's multiplied in 4 then \n"
						+ "added to 4 then divided by 4 then substracted from 4 equals 4 ?");
				int smartAnswer3 = input.nextInt();
				if (smartAnswer3 == 7) {
					countSmartAnswer++;
				}

				switch (countSmartAnswer) {
				case 3:
					System.out.println("congrats! all of your answers were correct");
					break;
				case 2:
					System.out.println("not bad!");
					break;
				case 1:
					System.out.println("not that stupid :D");
					break;
				case 0:
					System.out.println("guess you're not a fan of math ha!");
					break;
				}

			}
		}

		else {
			System.out.println("That's not a right gender!");
			// TODO Re run the age method
			getGenderWeight(gender, weight, input);
		}
		return gender;
	}
}