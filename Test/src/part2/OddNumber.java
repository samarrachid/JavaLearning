package part2;
/**
 * 1-Write a program to print odd numbers that is not greater then 50, 
 * @author Dania Rachid
 *
 */

public class OddNumber {

	
	public static void main(String[] args) {
		
		System.out.println("This is a program to print odd numbrt < 50");
		int a = 1;
		
		
		while (a < 50 ) {
			if (a%2 != 0) {
				System.out.println(a);
			}
			a = a +1;
		}
	}

}
