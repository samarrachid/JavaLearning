package part3;

import java.util.Scanner;

public class PasswordSolution {
	/**
	 * rite a Java method to check whether a string is a valid password.
	 * Password rules: A password must have at least ten characters. A password
	 * consists of only letters and digits. A password must contain at least two
	 * digits.
	 */

	public static final int PASSWORD_LENGTH = 8;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("1. A password must have at least eight characters.\n"
				+ "2. A password consists of only letters and digits.\n"
				+ "3. A password must contain at least two digits \n"
				+ "Input a password (You are agreeing to the above Terms and Conditions.): ");
		String s = input.nextLine();

		if (is_Valid_Password(s)) {
			System.out.println("Password is valid: " + s);
		} else {
			System.out.println("Not a valid password: " + s);
		}
		input.close();
	}

	public static boolean is_Valid_Password(String password) {  
	  
	        if (password.length() < PASSWORD_LENGTH) {
	        	// length nit 8
	        	return false;  
	        } 
//	        else {
//	        	return true;
//	        }
//	    }
	        int charCount = 0;  
	        int numCount = 0;  
	        for (int i = 0; i < password.length(); i++) {  
	  
	            char ch = password.charAt(i);  
	  
	            //passwor3
	            if (is_Numeric(ch)) {
	            	numCount++;  
	            }
	            else if (is_Letter(ch)) {
	            	charCount++;  
	            }
	            else {
	            	
	            	return false;  
	            }
	        }  
//	  
//	  
	        return (charCount >= 2 && numCount >= 2);  
	    }  

	public static boolean is_Letter(char ch) {
		ch = Character.toUpperCase(ch);
		// ch = Character.toLowerCase(ch)
		return (ch >= 'A' && ch <= 'Z');
	}

	public static boolean is_Numeric(char ch) {

		return (ch >= '0' && ch <= '9');
	}
}
