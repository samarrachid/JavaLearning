package part4;
import java.util.Scanner;
public class CollegeAdmit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("If you want to know your GPA answer the following questions: ");
		System.out.print("What is your total grade points? ");
		double totalGradePoints = input.nextDouble();
		System.out.print("What is your total credit hours? ");
		double totalCreditHours = input.nextDouble();
		
		double gpa = totalGradePoints / totalCreditHours ;
		System.out.print("What is your SAT? ");
		double sat = input.nextDouble();
		
		System.out.println("Your GPA is: " + gpa);
		if (gpa < 1.8 || sat < 900) {
			System.out.println("Student is rejected");
		}
		else {
			System.out.println("Student is admitted to the university");
		}
		if (gpa < 1.8 && sat < 900) {
			System.out.println("Scors are too low to be admitted!");
		}
		
	}

}
