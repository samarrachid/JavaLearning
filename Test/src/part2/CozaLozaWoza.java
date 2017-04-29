package part2;

public class CozaLozaWoza {
	/**
	 * 3-Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line.
	 *  The program shall print "Coza" in place of the numbers which are multiples of 3,
	 *   "Loza" for multiples of 5, "Woza" for multiples of 7,
	 *    "CozaLoza" for multiples of 3 and 5, 
	 *   and so on. The output shall look like:
1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11 
Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22 
23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
	 */
	public static void main(String[] args) {
		int a = 1;
		int b = a * 3;
		
		while (a <= 110) {
			
			while (a == b){
				System.out.println("Coza");
				a = a + 2 ;
			}
			
		
			}
			System.out.println(a);
			a = a + 1;

		
			
		}
		
		
	}
