package part4;
import java.util.Scanner;
public class ExtractDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a digit : ");
		int digit = input.nextInt();
		int extract = digit % 10 ;
		while (digit < 1000) {
		
		
		
		
	}
		digit = digit / 10;
		System.out.println(extract);
		System.out.println(digit);
		input.close();

}
}