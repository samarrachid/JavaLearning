package part3;

public class operations {
	/**
	 * e. print the result of the following operations -5 + 8 * 6 (55+9) % 9 20
	 * + -3*5 / 8 5 + 15 / 3 * 2 - 8 % 1
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
		int e = 1;
		int f = 1;

		int result = 0;

		operation1(a, b, c, result);
		operation2(a, b, result);
		operation3(a, b, c, d, result);
		operation4(a, b, c, d, e, f, result);

	}

	public static void operation1(int a, int b, int c, int result) {
		a = a - 6;
		b = b + 7;
		c = c + 5;
		result = -a + b * c;

		System.out.println("  The result of the operation -5 + 8 * 6 = " + result);

	}

	public static void operation2(int a, int b, int result) {
		a = a + 54;
		b = b + 8;
		result = (a + b) % b;
		System.out.println("The result of the operation (55 + 9)%9 = " + result);

	}

	public static void operation3(int a, int b, int c, int d, int result) {
		a = a + 19;
		b = b - 4;
		c = c + 4;
		d = d + 7;
		result = a + (-b) * c / b;
		System.out.println("The result of the operation 20 + (-3) * 5 / 8 = " + result);
	}

	public static void operation4(int a, int b, int c, int d, int e, int f, int result) {
		a = a + 4;
		b = b + 14;
		c = c + 2;
		d = d + 1;
		e = e + 7;
		f = 1;
		result = a + b / c * d - e % f;
		System.out.println("The result of the operation 5 + 15 / 3 * 2 - 8 % 1 = " + result);

	}

}
