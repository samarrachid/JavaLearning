package part1;
import java.util.Scanner;
public class AddThreeNums
{
	/**
	 * Write a Java program that takes three numbers as input to calculate and

print the average of the numbers
	 */
	public static void main(String[] args ) {
	System.out.println("enter three integers!");
	int a;
	int b;
	int c;
	int d;
	Scanner add = new Scanner (System.in);
	a = add.nextInt();
	b =add.nextInt();
	c = add.nextInt();
	d = (a + b + c );
	
	System.out.println(d);
	
	}
}
