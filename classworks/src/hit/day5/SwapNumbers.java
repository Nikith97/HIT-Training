package hit.day5;

/**
 * 
 * @author Nikith Padala
 * Date: 4/6/21
 * 
 * This is my first lab book of HIT
 */

public class SwapNumbers {
	public static void main(String[] args) {
		int first = 100, second = 200;
		
		System.out.println("---Before Swap---");
		System.out.println("First Number = "+ first);
		System.out.println("Second Number = "+ second);
		
		first = first-second; // 100-200 = -100
		second = first+second; // -100+200 = 100
		first = second - first; // 100-(-100)
		
		System.out.println("--After Swap--");
		System.out.println("First number = "+ first);
		System.out.println("Second number = "+ second);
		
	}
}
