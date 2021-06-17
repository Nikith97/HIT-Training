package hit.day5;

import java.util.Scanner;

public class AreaTriangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter base of triangle = ");
		double base = scan.nextDouble();
		System.out.println("Enter height of triangle = ");
		double height = scan.nextDouble();
		double Area = (base*height)/2;
		System.out.println("Area of triangle is = "+ Area);
	}

}
