package part1;

public class SpecifiedFormula {
/**
 * 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 */

	public static void main(String[] args){
		
		int a, b, c, d, e, f, g, h, i;
		a = 4; 
		b = 1;
		c = 1;
		d = 3;
		e = 5;
		f = 7;
		g = 9;
		h = 11;
		i= a * (c - (b/d) + (b/e) - (b/f) + (b/g) - (b/h ));
		System.out.println(i);
		
		
	
	}
}