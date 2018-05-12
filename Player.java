package RockPaperScissor;

import java.util.Scanner;

public class Player extends GameItems {
	Scanner kybd;
	
	public Player() {
		super();
		kybd = new Scanner(System.in);
		
	}
	
	public CHOICES getChoice() {
		System.out.print("Please enter your choice: R=ROCK, P=PAPER, S=SCISSOR "); 
		char playerChoice = kybd.nextLine().toUpperCase().charAt(0);
		
		
		switch(playerChoice) {
		case 'R':
			return CHOICES.ROCK;
		case 'P':
			return CHOICES.PAPER;
		case 'S':
			return CHOICES.SCISSORS;
			
		}
		
		//if neither of the above then it is an invalid input
		System.out.println("Invalid input!!");
		return getChoice();
	
	}

}
