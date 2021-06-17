package hit.day5;

import java.util.Scanner;

public class CircleAreaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius = ");
		Scanner scan = new Scanner(System.in);
		double radius = scan.nextDouble();
		double area = Math.PI*(radius*radius);
		System.out.println("Area of a circle is: "+ area);
		double circumference = Math.PI*2*radius;
		System.out.println("Circumference of circle is: "+ circumference);			
	}

}
