package part3;
import java.util.Scanner;
public class MagicSum {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int a = 0,b = 0;
		sum(a, b, input); // something wrong with the result, please fix
	}
	public static void sum(int a, int b, Scanner input) {
		System.out.println("Enter two numbers to show you their sum !");
		a = input.nextInt();
		b = input.nextInt();
		int c = a + b;
		System.out.println(a + " + " + b + " = 123" + c);
		
	}
}
