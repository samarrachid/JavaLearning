
package part1;
import java.util.Scanner ;


public class GreatestNum {

	/**
	 * 1. Take three numbers from the user and print the greatest number.
	 * @param args
	 */
			

	
	public static void main(String[] args){
		System.out.println("Enter three numbers!!");
		int x, y, w;
		
		 Scanner userInput = new Scanner (System.in);
		 
		
		x = userInput.nextInt();
		y = userInput.nextInt();
		w = userInput.nextInt();
		
		if (x > y && x > w ) {
	System.out.println(" The greatest number is :" + x); }
		
		else if (y > x && y > w) {
			System.out.println("The greatest number is :" + y);}
		
		
		
		else if  (w > x && w > y) {
		
		System.out.println("The greatest number is :" + w );
		}
		
	}
		
		
}

