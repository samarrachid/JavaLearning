package part7;
import java.util.Scanner;
public class Hotel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullName = "";
		String firstName = "";
		String lastName = "";
		int age = 0;
		int passportNum = 0;
		int numOfAdults = 0;
		int numOfChildren = 0;
		int singleRoom = 0;
		int doubleSingleRoom = 0;
		int kingRoom = 0;
		int sweet = 0;
		
		System.out.println("Hello, this is SMILE hotel, how can i help you?");
		String answer = input.nextLine();
		if (answer.contains("room") || answer.contains("book") || answer.contains("sweet") ) {
			System.out.println("Sure");
		}
		else {
			System.out.println("would you like to book a room?");
			answer = input.nextLine();
			if (answer.equals("yes")) {
				System.out.println("Sure");
				
			}
			else   {
				System.out.println("Ok, thank you");
				
				
			}
			
		} //end of else statement
			
		
		System.out.println("what's your first name?");
		 firstName = input.nextLine();
		
		System.out.println("last name?");
		lastName = input.nextLine();
		getFullName(firstName, lastName, fullName, input);
		
		System.out.println("How old are you?" + fullName);
		age = input.nextInt();
		if (age > 18) {
			System.out.println("ok, let me check for you");
		}
		else if ( age < 18) {
			System.out.println("Sorry, you should be with one of your parents!" );
		}
		else {
			System.out.println("How old are you");
			age = input.nextInt();
		}
		
		System.out.println("ok Mr/Ms " + fullName + "is it just you?");
		answer = input.nextLine();
		switch (answer) {
		case ("yes") :
			System.out.println("there is a single room with a single bed");
			break;
		case ("no") :
			System.out.println("How many people?");
		}
		
		
		
		
		
		
		
	}
	public static String getFullName(String firstName, String fullName, String lastName, Scanner input) {
		fullName= firstName + lastName;
		return fullName;
	}
}
