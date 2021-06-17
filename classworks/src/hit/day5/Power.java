package hit.day5;

/**
 * 
 * @author Nikith Padala
 * Date: 4/6/21
 * 
 * This is my first lab book of HIT
 *
 */


public class Power {
public static void main(String[] args) {
	int base = 3, exponent =4;
	
	long result = 1;
	
	while(exponent !=0) {
		result *=base;
		--exponent;
	}
	System.out.println("Answer = "+ result);
}
}
