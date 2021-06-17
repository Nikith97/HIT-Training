package hit.day5;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char operator;
		Double number1, number2, result;
		
		//create an object of scanner class
		Scanner input = new Scanner(System.in);
		
		//ask users to enter the operator
		System.out.println("Choose an operator: +,-,*, or /");
		operator = input.next().charAt(0);
		
		//ask users to enter numbers
		System.out.println("Enter first number");
		number1 = input.nextDouble();
		
		System.out.println("Enter second number");
		number2 = input.nextDouble();
		
		switch(operator) {
		
		//addition
		case '+':
			result = number1 + number2;
			System.out.println("Addition = " + result);
			
			break;
			
		//subtraction
		case '-':
			result = number1-number2;
			System.out.println("Subtraction = " + result);
			
			break;
			
		//multiplication
		case '*':
			result = number1*number2;
			System.out.println("Multiplication = " + result);
			
			break;
		//division
		case '/':
			result = number1/number2;
			System.out.println("Division = " + result);
			
			break;
			
		default:
			System.out.println("Invalid Operator.....");
			break;
		}
		
		input.close();
	}

}
