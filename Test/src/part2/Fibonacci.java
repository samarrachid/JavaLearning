package part2;
import java.util.Scanner;
public class Fibonacci {
	/** 
	 * 2-Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n),
 where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1.
 Also compute their average. The output shall look like:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5
	 */
	public static void main(String[] args) {
//		int n;
//		int a;
//	
//		Scanner nextInput = new Scanner(System.in);
//		n = nextInput.nextInt();
//		a = n = (n-1) + (n-2);
//		System.out.println(a);
		
		/** the hint
		  int n = 3;          // the index n for F(n), starting from n=3
	      int fn;             // F(n) to be computed
	      int fnMinus1 = 1;   // F(n-1), init to F(2)
	      int fnMinus2 = 1;   // F(n-2), init to F(1)
	      int nMax = 20;      // maximum n, inclusive
	      int sum = fnMinus1 + fnMinus2;  // Need sum to compute average
	      double average;
	 
	      System.out.println("The first " + nMax + " Fibonacci numbers are:");
	      ......
	 
	      while (n <= nMax) {  // n starts from 3
	         // Compute F(n), print it and add to sum
	         ......
	         // Increment the index n and shift the numbers for the next iteration
	         ++n;
	         fnMinus2 = fnMinus1;
	         fnMinus1 = fn;
	      }
	 
	      // Compute and display the average (=sum/nMax).
	      // Beware that int/int give int.
	      ......
	   }
		**/
	}
}
