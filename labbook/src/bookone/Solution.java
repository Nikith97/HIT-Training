package bookone;

import java.util.Scanner;

class Account{
	int id;
	
	public int getid() {
		return id;
	}
	
	public void setid() {
		this.id = id;
	}
	
	double balance;
	
	public double getbalance() {
		return balance;
	}
	
	public void setBalance() {
		this.balance = balance;
	}
	
	double interestRate;
	
	public double getinterestRate() {
		return interestRate;
	}
	
	public void setinterestRate() {
		this.interestRate = interestRate;
	}
	
	public Account(int id, double balance, double interestRate) {
		
	}
	
//	public calculateInterest() {
//		
//		return calculateInterest();
//	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		System.out.println(id);
		double balance = scan.nextDouble();
		System.out.println(balance);
		double interestRate = scan.nextDouble();
		System.out.println(interestRate);
		Account account = new Account(id, balance, interestRate);
		
		System.out.println("Enter number of years = ");
		int noOfYears = scan.nextInt();
		
	}
}

