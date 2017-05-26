package part6;

public class Arrays {

	public static void main(String[] args) {
		float[] values = { 3.0f, 2.0f, 5.0f};
//		= new float[3];
//		values[0] = 10.1f;
//		values[1] = 11.1f;
//		values[2] = 12.1f;
		
		float sum = 0f;
//		for (int i = 0; i < values.length; i++) {
//			sum += values[i];
//			System.out.println(sum);
//		}
		
		for (float currentVal : values) {
			sum += currentVal;
			System.out.println(sum);
		}
	}
}
