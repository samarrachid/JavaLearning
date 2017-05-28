package part6;

public class TwoDemonsionalArray {
	public static void main(String[] args) {
		
		// now this is two demonsional array
		 		String[][] bigArray= new String[10][10];
		 		for (int i = 0; i < bigArray.length; i++) {
		 			for (int j = 0; j < bigArray[i].length; j++) {
		 				bigArray[i][j] = i + " " + j;
		 			}
		 			
		 		}
		 		int k = 1;
		 		while(k <= 60) {
		 			System.out.print("-");
		 			k++;
		 		}
		 		System.out.println();
		 		for (int i = 0; i < bigArray.length; i++) {
		 			for (int j = 0; j < bigArray[i].length; j++) {
		 				
		 				System.out.print("| " + bigArray[i][j] + " ");
		 				
		 			}
		 			 k = 1;
			 		while(k <= 60) {
			 			System.out.print("-");
			 			k++;
			 		}
			 		System.out.println();
		 			
		 		}
		 		System.out.println();
		 		for (String[] row : bigArray) {
		 			for(String column : row) {
		 				
		 				System.out.print("| " + column + " ");
		 			}
		 			System.out.println("|");
		 		}
	}

}
