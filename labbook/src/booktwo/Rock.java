package booktwo;

import java.util.Random;
import java.util.Scanner;

public class Rock {
	public static void main(String[] args) {
		String personPlay;
		String computerPlay;
		int computerInt;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.print("Rock, Paper, Scissors ??? (R,P,S)");
		personPlay = String.valueOf(scan.next().toUpperCase().charAt(0));
		computerInt = generator.nextInt(2);
		switch(computerInt) {
		case 0:
			computerPlay = "Rock";
			break;
		
		case 1:
			computerPlay = "Paper";
			break;
			
		default: 
			computerPlay = "Scissors";
			break;
		}
		
		System.out.println("Player - " + personPlay + "\nComputer: " + computerPlay);
		
		if(personPlay.equals(computerPlay)) {
			System.out.println("It is a tie!!!");
		}
		else if (personPlay.equals("Rock")) {
			if(computerPlay.equals("Scissors")) {
				System.out.println("Rock crushes Scissors - You win!!");
			}
			else {
				System.out.println("Paper surrounds rock. You lost!!!");
			}
		}
		else if (personPlay.equals("Paper")) {
			if (computerPlay.equals("Rock")) {
				System.out.println("Paper sorrounds rock. You win !!\nWinner: You");
			} else {
				System.out.println("Scissor cuts paper. You lost !!\nWinner: Computer");
			}
		} else {
			if (computerPlay.equals("Paper")) {
				System.out.println("Scissors cuts paper. You win !!\nWinner: You");
			}
			if (computerPlay.equals("Rock")) {
				System.out.println("Rock crushes scissors. You lost !!\nWinner: Computer");
			}
		}
		
		scan.close();
		}
	}