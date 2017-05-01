package part2;

public class SumAndAverage {
	/**
	 * 4- Write a program called SumAndAverage to produce the sum of 1, 2, 3,
	 * ..., to 100. Also compute and display the average. The output shall look
	 * like: The sum is 5050 The average is 50.5 Modify the program to use a
	 * "while - do " loop instead of "for" loop. Modify the program to use a
	 * "do-while" loop. Notice What is the difference between "for" and
	 * "while-do" loops? What is the difference between "while-do" and
	 * "do-while" loops? Modify the program to sum from 111 to 8899, and compute
	 * the average. Introduce an int variable called count to count the numbers
	 * in the specified range. Modify the program to sum only the odd numbers
	 * from 1 to 100, and compute the average. (HINTS: n is an odd number if n %
	 * 2 is not 0.) Modify the program to sum those numbers from 1 to 100 that
	 * is divisible by 7, and compute the average. Modify the program to find
	 * the "sum of the squares" of all the numbers from 1 to 100, i.e. 1*1 + 2*2
	 * + 3*3 + ... + 100*100.
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// sum and average 1 to 100 using while loop
		int a = 0;
		int sumA = 0;
		double averageA = 0;

		while (a < 100) {
			a = a + 1; // also you can use a += 1;

			sumA += a;
		
			// you don't have to print inside the loop, --> done that
			// it shouldn't print every time you're looping +
			// If your number greater than 999, your computer will die :P

			averageA = sumA / 100;

			// * i don't know why the average is wrong!!! --> check your if
			// statement to know why ;)
		}
		System.out.println("sum in while is " + sumA);
		System.out.println("Average in while  is :" + averageA);
		System.out.println("");
		
		

		// sum 1 to 100 using for loop
		int sumI = 0;
		double averageI = 0;
		
		for (int i = 1; i <= 100; i++) {
			sumI += i;

			averageI = sumI / 100;

		
			
		}
		System.out.println("Sum using for loop  is :" + sumI);
		System.out.println("Average using for loop is :" + averageI);
		System.out.println(""); // it worked!

		// sum 111 to 8899
		int sumX = 0;
		for (int x = 1; x < 8899; x++) {
			sumX += x;

		}
		int averageX = sumX / 8788;
		System.out.println("Sum 111 to 8899 :" + sumX);
		System.out.println("Average 111-8899 :" + averageX);
		System.out.println("");
		
		int odd = 0;
		int checkOdd = odd%2;
		int sumOdd = 0;
		
		while (odd <= 100)
		{
			odd ++;
			sumOdd += checkOdd;
			if (checkOdd != 0)
			{
				System.out.println(sumOdd);
			}
		
		
		
		}
		

	}

}
