package part3;

public class Functions2 {
	 public static void main (String[] args) {
		   int i = 9;
		   int y = 78;
		   
		   test(i, y);
		   test1(i, y);
		   test2(i, y);
		   test3(i, y);
	   }
	 
	 public static void test(int i, int gf) {
		 int sum = i + gf;
		 System.out.println("Test sum" + sum);
	 }
	 
	 public static void test1(int i, int gf) {
		 int result = i - gf;
		 System.out.println("Test 1" + result);
	 }
	 
	 public static void test2(int i, int gf) {
		 int result = i / gf;
		 System.out.println("Test 2 " + result);
	 }
	 
	 public static void test3(int i, int gf) {
		 int result = i * gf;
		 System.out.println("Test 3" + result);
	 }
}
