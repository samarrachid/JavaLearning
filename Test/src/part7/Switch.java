package part7;

public class Switch {

	public static void main(final String[] args)
	{	
		/// Try to test this out without the break;
		int ival = 25;
		switch (ival % 3) {
		case 0:
			System.out.println(ival);
			System.out.println("is even");
			break;
		case 1:
			System.out.println(ival);
			System.out.println("is odd");
			break;
		default:
			System.out.println("oops it breaks");
			break;
		}
	}
}
