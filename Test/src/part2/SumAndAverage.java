package part2;

public class SumAndAverage {
public static void main(String[] args){
	int x = 1;
	int sum = 0;
	double average = 0;
	sum1(x, sum, average);
	sumx(x, sum, average);
	sum2(x, sum, average);
	odd(x, sum, average);
	divisible7(x, sum, average);
	squares(x, sum, average);


	}
  public static void sum1(int x, int sum, double average) {
	  
	  while (x<=100) {
		  sum += x;
		  x ++;
		  average = sum/x;
		  
	  }
	  System.out.println("Sum using while loop is :" + sum);
	  System.out.println("Average using while loop is " + average);
	  System.out.println("");
  }
  public static void sumx(int x, int sum, double average) {
	  	for (x=0; x <=100; x++) {
	  		sum += x;
	  		average = sum/100;
	  		
	  	}
	  	System.out.println("Sum using for loop is " + sum);
	  	System.out.println("Average using for loop is " + average);
	  	System.out.println("");
  }
  
  public static void sum2(int x, int sum, double average) {
	  x = 111;
	  while (x <= 8899) {
		  sum += x;
		  x ++;
		  average = sum/x;
	  }
	  System.out.println("Sum 111-8899 is " + sum);
	  System.out.println("Average 111-8899 is " + average);
	  System.out.println("");
  }
  public static void odd(int x, int sum, double average) {
	  for (x=1; x<=100; x++) {
		  if (x%2 != 0) {
			  sum = sum + x;
			  average = sum/x;
		  }
	  }
	  System.out.println("sum odd numbers is " + sum);
	  System.out.println("average odd numbers is " + average);
	  System.out.println("");
  }
  
  public static void divisible7(int x, int sum, double average) {
	  for (x=1; x<=100; x++) {
		  if ( x%7 == 0) {
			  sum = sum + x;
			  average = sum/x;
			  
		  }
	  }
	  System.out.println("sum  numbers  divisible by 7 is " + sum);
	  System.out.println("average numbers  divisible by 7 is " + average);
	  System.out.println("");
  }
  public static void squares(int x, int sum, double average) {
	  while (x <= 100) {
		  Math.pow(x, 2);
		  x++;
		  sum +=x;
		  average = sum/x;
		  
	  }
	  System.out.println("Sum of sqaures is " + sum);
	  System.out.println("average of sqaures is " + average);
	  System.out.println("");
  }
  
  
	  
  
}