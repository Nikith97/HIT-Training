package hit.day5;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		int factorial  = fact(num);
		System.out.println("Factorial of entered number is: "+factorial);
	}
	
	static int fact(int n)
	{
		int output;
		if(n==1) {
			return 1;
		}
		//Recursion: Function calling itself
		output = fact(n-1)*n;
		return output;
	}

}
