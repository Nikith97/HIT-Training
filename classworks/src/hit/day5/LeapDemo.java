package hit.day5;

import java.util.Scanner;

public class LeapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year = ");
		year = scan.nextInt();
		scan.close();
		boolean isLeap = false;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
					isLeap=true;
				else
					isLeap=false;
			}
			else
				isLeap=true;
		}
		else {
			isLeap = false;
	}
		if(isLeap==true)
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");
		
	}

}

