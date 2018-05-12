package RockPaperScissor;

import java.util.Scanner;

public class PlayGame {
	public static void main(String [] args) {
		Scanner kybd = new Scanner(System.in);
		Game game = new Game();
		char quit = ' ';
		
		while (quit != 'N') {
			game.play();
			System.out.print("Play again? Press any key to continue, or 'N' to quit ");
			quit = kybd.nextLine().toUpperCase().charAt(0);
			
		}
		kybd.close();
		game.displayStats();
		
	}

}
