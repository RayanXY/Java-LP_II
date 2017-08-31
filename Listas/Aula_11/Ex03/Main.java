import java.util.Scanner;

public class Main{

	public static void main(String [] args){
	
		/// Tests
		European rome = new European(100.0, 10.0, 200.0, "Rome", 5);
		Japanese tokyo = new Japanese(100.0, 50.5, 150.0, "Tokyo", 7);
		
		/// European Castle being destroyed.
		rome.showState();
		rome.attack(150.0);
		rome.attack(150.0);
		rome.attack(150.0);
		rome.attack(150.0);
		rome.showState();
		rome.attack(150.0);
		rome.showState();
		
		/// Japanese Castle being destroyed
		tokyo.showState();
		tokyo.attack(150.0);
		tokyo.attack(150.0);
		tokyo.attack(150.0);
		tokyo.attack(150.0);
		tokyo.showState();
		tokyo.attack(150.0);
		tokyo.showState();
	
		/// Testing the game
		String move;
		Scanner scan = new Scanner(System.in);
		
		Game game = new Game(); 	//!< Starting a new game.
		
		game.printMap();			//!< The initial state of the map.
		
		/// Infinity loop for the test of the character moviment.
		while(true){
			System.out.print("Mova seu personagem: ");
			move = scan.next();
		
			/// Moves the player.
			game.playerMove(move);
		
			game.printMap();
		}
	
	}

}
