package part3;

public class homework1e {
	/**
	 * e. print the result of the following operations -5 + 8 * 6 (55+9) % 9 20
	 * + -3*5 / 8 5 + 15 / 3 * 2 - 8 % 1
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		int c = 6;
		int d = 55;
		int e = 9;
		int f = 20;
		int g = 3;
		int h = 15;
		int i = 2;
		int j = 1;
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;

		operation1(a, b, c, result1);
		operation2(d, e, result2);
		operation3( f, g, a, b, result3);
		operation4(a, h, g, i, b, j, result4);
		
		

	}

	public static void operation1(int a, int b, int c, int result1) {
		result1 = -a + b * c;

		System.out.println("The result of the operation -5 + 8 * 6 = " + result1);

	}
	
	public static void operation2(int d, int e, int result2)
	{
		result2 = (d + e) % e;
		System.out.println("The result of the operation (55 + 9)%9 = " + result2);
		
	}
	
	public static void operation3(int f, int g, int a, int b, int result3)
	{
		result3 = f + (-g) * a / b;
		System.out.println("The result of the operation 20 + (-3) * 5 / 8 = " + result3);
	}
	
	public static void operation4(int a, int h, int g, int i, int b, int j, int result4)
	{
		result4= a + h / g * i - b % 1;
		System.out.println("The result of the operation 5 + 15 / 3 * 2 - 8 % 1 = " + result4);
		
	}

}
