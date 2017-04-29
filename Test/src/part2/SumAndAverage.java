package part2;

public class SumAndAverage {
	/** 
	 * 4- Write a program called SumAndAverage to produce the sum of 1, 2, 3, ...,
	 *  to 100. Also compute and display the average. The output shall look like:
The sum is 5050
The average is 50.5
* Modify the program to use a "while - do " loop instead of "for" loop.
* Modify the program to use a "do-while" loop.
*Notice What is the difference between "for" and "while-do" loops?
* What is the difference between "while-do" and "do-while" loops?
* Modify the program to sum from 111 to 8899, and compute the average.
*  Introduce an int variable called count to count the numbers in the specified range.
*Modify the program to sum only the odd numbers from 1 to 100, and compute the average.
* (HINTS: n is an odd number if n % 2 is not 0.)
*Modify the program to sum those numbers from 1 to 100 that is divisible by 7, 
*and compute the average.
*Modify the program to find the "sum of the squares" of all the numbers from 1 to 100,
* i.e. 1*1 + 2*2 + 3*3 + ... + 100*100.


	 */
	public static void main(String[] args){
		int a = 1;
		int sum = 1;
		double b = 1;
		
		
		
		while (a <= 100) {
			
			
			
		
		a = a +1;
		
		sum += a;
		System.out.println("sum is " + sum);
		b = sum/100;
		System.out.println("Average is :" + b);
		//* i don't know why the average is wrong!!! 
		
		
		
		
		
		}
		
		int summ = 0;
		double av = 0;
		for (int i1 = 1; i1 <= 100; i1++ ) summ +=i1; 
		System.out.println("Sum is :" + summ);
		av = summ/100;
		System.out.println("Average is :" + av);
		
		int sum2=0;
		for (int x = 1; x <= 8899; x++) sum2 += x;
		System.out.println("Sum 111 to 8899 :" + sum2);
		int average = sum2/8788;
		System.out.println("Average 111-8899 :" + average );
		
				
	}

}
