package booktwo;

import java.text.NumberFormat;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		double currentSalary;//Employee current salary
		double raise;//amount of raise
		double newSalary;//new salary for the employee
		String rating; //performance rating
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the current salary");
		currentSalary = scan.nextDouble();
		System.out.println("Enter the performance rating - G/B/P: ");
		rating = scan.nextLine();
		
		//compute the raise using if...
		if(rating.equalsIgnoreCase("G"))
			raise = currentSalary*0.06;
			else if(rating.equalsIgnoreCase("B"))
				raise = currentSalary*0.04;
			else 
				raise = currentSalary*0.015;
		newSalary = currentSalary + raise;
		
		System.out.println(currentSalary);
		System.out.println(raise);
		System.out.println(newSalary);
		
	
		//Print the results
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary: " + money.format(currentSalary));
		System.out.println("Amount of your raise: " + money.format(raise));
		System.out.println("Your new Salary" + money.format(newSalary));
		System.out.println();
	}
}
