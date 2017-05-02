package part3;

public class Functions2 {
	 public static void main (String[] args) {
		 test(4, 6);
		 test(6,9);
		 test(6,9);
		 test(6,9);
		 test(6,9);
		 test(6,9);
		 test(6,9);
		 test(6,9);
		 test(6,9);
		 test(6,9);
		 test1(6,9);
		 
		 int d = 5;
		 System.out.println("d in main" + d);
	 }

	 public static void test(int d, int t) {
		 int sum = d + t;
		 System.out.println("Test sum" + sum);
	 }
	 
	 public static void test1(int d, int t) {
		 int sum = d - t;
		 System.out.println("Test " + sum);
	 }
	 
	 
	 
}
