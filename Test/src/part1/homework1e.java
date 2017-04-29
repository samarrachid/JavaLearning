package part1;

public class homework1e {
	/**
	 * e. print the result of the following operations -5 + 8 * 6 
	 * (55+9) % 9 
	 *  20 + -3*5 / 8
	 *   5 + 15 / 3 * 2 - 8 %
	 * @param args
	 */
	public static void main(String[] args){
		
		int a = -5;
		int b = 8;
		int c = 6;
		int d = a + b * c;
		System.out.println("Print value d "+  d); //why the torture sis :(
		d = a - b ;
		System.out.println("Print value d2 "+  d); //why the torture sis :(

		int e = 55;
		int f = 9;
		int g = 9;
		int h = ((e + f) % g);
		System.out.println(h);
		
		int a1 = 20;
		int b1 = -3;
		int c1 = 5;
		int d1 = 8;
		int e1 = (a1 + b1 * c1 / d1);
		System.out.println(e1);
		
		int a2 = 5;
		int b2 = 15;
		int c2 = 3;
		int d2 = 2;
		int e2 = 8;
		int f2 = ( (a2 + b2 / c2 * d2 - e2)% 1 ); //% without a number after it didn't work!!
		System.out.println(f2);
		
		
		
		
		
		
	}
}
