package part7;
import java.util.Scanner;

public class CheckMonthNumber {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	int monthNumber = 0;
	System.out.println("Check Month Program \n" + "What's your name?");
	String name = input.nextLine();
	System.out.println("Hello " + name + " this program will give you the number of the month you enter");
	
	getMonthNumber(monthNumber, input);
	
	
	
	

	input.close();
}
public static void getMonthNumber (int monthNumber,  Scanner input) {
	System.out.println("What's the month that you want to know it's number?");
	String monthName = input.nextLine();
	
	switch (monthName.toLowerCase()) {
	case ("january") :
		System.out.println("This is month 1");
	break;
	case ("february") :
		System.out.println("This is month 2");
	break;
	case ("march") :
		System.out.println("This is month 3");
	break;
	case ("april") :
		System.out.println("This is month 4, and it's my birthday month yay!");
	break;
	case ("may") :
		System.out.println("This is month 5");
	break;
	case ("june") :
		System.out.println("This is month 6");
	break;
	case ("july") :
		System.out.println("This is month 7");
	break;
	case ("august") :
		System.out.println("This is month 8");
	break;
	case ("septemper") :
		System.out.println("This is month 9");
	break;
	case ("october") :
		System.out.println("This is month 10");
	break;
	case ("november") :
		System.out.println("This is month 11");
	break;
	case ("december") :
		System.out.println("This is month 12");
	break;
	default :
		System.out.println("invalid month, please enter a valid month!");
		getMonthNumber(monthNumber, input);
	
	
	}
		
	}
}