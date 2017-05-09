package part3;
import java.util.Scanner;

public class HasEight {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int a = 0;
		hasEight(a, input);
	}
	
	public static  boolean hasEight(int a, Scanner input) {
		a = input.nextInt();
		boolean hasEight;
		if ( ("" + a).contains("8")) {
			hasEight = true;
			
			
		
		}
		else {
			hasEight = false;
		}
		System.out.println(hasEight);
		return hasEight;
	}

}
