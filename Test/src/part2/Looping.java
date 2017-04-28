package part2;


/*
 * Exercise SumAndAverage (Loop): 
 * Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. 
 * Also compute and display the average. The output shall look like:

 */
public class Looping {
	 public static void main (String[] args) {
	      int sum = 0;          // Store the accumulated sum, init to 0
	      double average = 0;       // average in double
	      int lowerbound = 1;   // The lowerbound to sum
	      int upperbound = 100; // The upperbound to sum
	      
	      // Use a for-loop to sum from lowerbound to upperbound
	      for (int number = lowerbound; number <= upperbound; ++number) {
	         sum += number; // same as "sum = sum + number"
		     average =  (double) sum/ number;
	       }  	     
	   		System.out.println(average);
		 	System.out.println(sum);
		 	
		 	main1();
	 	}
	 
	 public static void main1 () {
	      int sum = 0;          // Store the accumulated sum, init to 0
	      double average = 0;       // average in double
	      int lowerbound = 1;   // The lowerbound to sum
	      int upperbound = 100; // The upperbound to sum
	      
	      int number = lowerbound;

	      while (number <= upperbound) {
	    	   sum += number;
	    	   ++number;
	    	}	     
	   		System.out.println("here" + average);
		 	System.out.println(sum);
	 	}
}
