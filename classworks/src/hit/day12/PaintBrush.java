package hit.day12;

import java.util.Scanner;

public class PaintBrush {
	public static void main(String[] args) {
		PaintBrush brush = new PaintBrush();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the choice of color: Red-1, Blue-2, Green-3, Pink-4");
		int choice = scan.nextInt();
		brush.doPaint(choice);
	}
	public void doPaint(int choice) {
		if(choice==1)
			System.out.println("Red Color applied...");
		else if(choice==2)
			System.out.println("Blue Color applied...");
		else if(choice==3)
			System.out.println("Green Color applied...");
		else if(choice ==4)
			System.out.println("Pink Color applied...");
	}
}

// Code Complexity for modification
