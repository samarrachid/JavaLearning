package part3;
import java.util.Scanner;
public class Functions3_2 {
	/** 
	 * 2­ Write a program(class) with these methods: 
	 * ­ method to calculate the area of a triangle.
	 *  ­  method to find the smallest number among three numbers
	 *   ­ method to compute the average of three numbers 
	 *   ­ method to create the area of a pentagon ­ 
	 * method to find all twin prime numbers less than 100
	 */
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double a = 0, b = 0, c = 0;
		int x = 0;
		 
		triangle(a, b, c, input);
		smallestNum(a, b, c, input);
		average(a, b, c, input);
		pentagon(a, b, input);
		twinPrime(x);
	}
	
	public static void triangle (double a, double b, double c, Scanner input) {
		System.out.println("I will calculate the area of a triangle");
		System.out.print("Enter the hight of the triangle : ");
		a = input.nextInt();
		System.out.print("Enter the length of the triangle's base : ");
		b= input.nextInt();
		
		c = (a*b)/2;
		System.out.println("the area of the triangle is : " + c );
		System.out.println("");
		
	}
	
	public static void smallestNum (double a, double b, double c, Scanner input) {
		
		System.out.println("Enter three numbers to find the smallest one!");
		 a = input.nextInt();
		 b = input.nextInt();
		 c = input.nextInt();
		 if ((a<b) && (a<c)){
			 System.out.println(a + "is the smallest");
			 
		 }
		 else if ((b<a) && (b < c)) {
			 System.out.println(b + "is the smallest");
		 }
		  
		 else if ((c<a)&& (c<b)) {
			 System.out.println(c + " is the smallest");
		 }
		
	}
	
	public static void average(double a, double b, double c, Scanner input) {
		System.out.println("Enter three numbers to find their average !");
		a = input.nextInt();
		 b = input.nextInt();
		 c = input.nextInt();
		 double average = (a + b + c)/2 ;
		 System.out.println("The average is : " + average);
		 System.out.println("");
		 
	}
	
	public static void pentagon(double a, double b, Scanner input) {
		System.out.println("Finding pentagon area!");
		System.out.println("Enter the length of pentagon side");
		a = input.nextInt();
		// don't freak out :D
		b = 1/4* Math.sqrt (5 *(5+2*Math.sqrt(5) ) )*Math.pow(a, 2) ;
		System.out.println("Area is " + b );
		System.out.println("");
		
	}
	
	public static void twinPrime(int x) {
		x = 3;
		while (x < 100) {
			
			x= x+ 2;
			
			
			System.out.println(x);
		}
		
	}

}
