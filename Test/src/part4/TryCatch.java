package part4;
import java.util.*;
;

public class TryCatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your phone number : ");
		
		try {
			int user = input.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("please enter a number!!");
			
		}
	}

}