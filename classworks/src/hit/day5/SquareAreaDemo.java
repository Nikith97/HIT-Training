package hit.day5;

import java.util.Scanner;

public class SquareAreaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter side of the square = ");
		Scanner scan = new Scanner(System.in);
		double side = scan.nextDouble();
		double Area = side*side;
		System.out.println("Area of square is: " + Area);
	}

}
