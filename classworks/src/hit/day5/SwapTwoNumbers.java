package hit.day5;

/*
 * Documentation Comment
 * 
 * @author Nikith Padala
 * 
 * This is my first Lab book of HIT
 * 
 * 4/6/21
 * 
 * 
 */

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 120, second = 220;
		System.out.println("----Before Swapping----");
		System.out.println("First number = "+first);
		System.out.println("Second number = "+second);
		//Value of first is assigned to temporary
		float temporary = first;
		//Value of second is assigned to first
		first = second;
		//Value of temporary is assigned to second
		second = (int) temporary; //we need to add int for temporary
		System.out.println("----After Swapping----");
		System.out.println("First number = "+first);
		System.out.println("Second number = "+ second);
	}

}
