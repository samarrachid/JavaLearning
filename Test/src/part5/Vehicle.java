package part5;

// create a vehicle class.
public class Vehicle {

	
	
	
	
	
	
	
	
	public static void main(String []args ) {
		double speed = 0;
		int wheels = 0;
		boolean brake = false;
		String type = "";
		
		getWheels(wheels);
		
	}
	
	public static int getWheels (int wheels) {
		
		return wheels;
	}
	
	public static String getType(String type, int wheels) {
		switch (wheels) {
		case 2 :
			System.out.println("vehicle is a motor or a bike");
			break;
		case 3 :
			System.out.println("it's a tertera :P");
		case 4 :
			System.out.println("vehicle is a car!");
			break;
		case 6 :
			System.out.println("vehicle is a bus!");
			break;
			
		}
		
		return type;
	}
}