package part3;

/**
 * update the Functions class to contain the four basic operations two  in each method
 */
public class Functions {


	 public void sum(int d, int f) {
		 System.out.println("in sum d before " + d);
		 d = 8;
		 System.out.println("in sum d after " + d);

		 int sum = d + f;
		 System.out.println("Test sum" + sum);
		 sub(d, f);
	 }
	 
	 public void sub(int d, int t) {
		 System.out.println("in sub d before " + d);
		 d = 10;
		 System.out.println("in sun d after " + d);
		 int sum = d - t;
		 System.out.println("Test " + sum);
	 }
}
