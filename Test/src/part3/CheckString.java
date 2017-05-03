package part3;

import java.util.Scanner;

public class CheckString {


	public static void main(String[] args) {
		
		Scanner info = new Scanner(System.in);

		System.out.println("What's your name?");
		String name = info.nextLine();
		if(name.equals("Samar")) {
			System.out.println("Samar is the best");
		} else if( name.contains("sa")){
			System.out.println("Samar is the best");
		}else if( name.startsWith("sa")){
			System.out.println("Samar is the best");
		}
		else {
			System.out.println("Danis is the best");
		}
	}
}
