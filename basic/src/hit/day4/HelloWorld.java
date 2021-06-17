package hit.day4;

import java.util.Scanner;

// single line comment
/*
 * 
 * multi line comment
 * multi line comment
 * multi line comment
 * 
 */
/**
 * Documentation Comment
 * 
 * 
 * 
 * @author Nikith Padala
 * Date: 3/6/21
 * This is my first program of HIT
 *
 */

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to JAVA....");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name  = scan.next();
		System.out.println("Welcome to Java practice..." + name);
	}

}
