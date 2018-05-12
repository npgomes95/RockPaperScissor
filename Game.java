package RockPaperScissor;

import RockPaperScissor.GameItems.CHOICES;
import RockPaperScissor.GameItems.RESULT;

public class Game extends GameItems {
	private Player player;
	private Computer computer;
	private CHOICES playerChoice;
	private CHOICES computerChoice;
	private RESULT result;
	
	private static int wins;
	private static int loses;
	private static int ties;
	
	
	
	public Game() {
		super();
		player = new Player();
		computer = new Computer();
		
	}
	
	public void play() {
		playerChoice = player.getChoice();
		computerChoice = computer.getChoice();
		result = getResults();
		displayResults();
		stats();
		
		
		
	}
	
	public void displayStats() {
		System.out.println("You have played " + (wins + loses + ties));
		System.out.println("You have won " +wins + " times.");
		System.out.println("You have lost " +loses + " times.");
		System.out.println("You have tied " +ties + " times.\nGood Bye");
	}
private void stats() {
		if (result == RESULT.WIN) {
			wins++;
		}
		else if (result == result.LOSE) {
			loses++;
		}
		else 
			ties++;
	}
	
	private void displayResults() {
		switch (result) {
		case WIN:
			System.out.println(playerChoice + " beats " + computerChoice + " Player WINS");
			break;
		case LOSE:
			System.out.println(playerChoice + " beats " + computerChoice + " Computer WINS");
			break;
		case TIE:
			System.out.println(playerChoice + " beats " + computerChoice + " It's a tie");
			break;
		}
	}
	
	private RESULT getResults() {
		if (playerChoice == computerChoice ) {
			return result.TIE;
			
		}
		
		switch(playerChoice) {
		case ROCK:
			return (computerChoice == CHOICES.SCISSORS ? RESULT.WIN: RESULT.LOSE);
		case PAPER:
			return (computerChoice == CHOICES.ROCK ? RESULT.WIN: RESULT.LOSE);
		case SCISSORS:
			return (computerChoice == CHOICES.PAPER ? RESULT.WIN: RESULT.LOSE);
		}
		
		
		//it will never come to this line
		return result.LOSE;
		
		
	}
	
	

}
