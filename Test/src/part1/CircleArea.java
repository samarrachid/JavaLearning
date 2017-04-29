package part1;
import java.util.Scanner;
public class CircleArea {
	/** 
	 * Write a Java program to print the area of a circle if the Radius = 7.5
	 */
	public static void main(String[] args) {
		int circleRadius;
		double pi = 3.14, area;
		System.out.println("Enter a radius!");
		Scanner circle = new Scanner(System.in);
		circleRadius = circle.nextInt();
		area = pi * circleRadius * circleRadius;
		
		if (area == 7.5 ) { // why you're checking the area to print?
			System.out.println("Area of circle" + area);
		}
		
		
	}
}
