/**
 * This class controls the flows and the proccess of the game. Its attributes are 
 * Game over, map for the game, the character of the player, and the size for the map.
 */
public class Game{

	private boolean gameOver = false;		//!< Represents the end of the game.
	private Map board;						//!< Represents the map of the game.
	private Paladin pala1;					//!< The player's character.
	private int size = 5;					//!< Size of the map.
	
	/**
	 * Creates everything necessery for the start of the game. Like the castles
	 * the map and the player, adding them to the map.
	 */
	public Game(){
	
		Japanese castleJap = new Japanese(250.0, 10, 500.0, "Mushroom Kingdom", 3);
		Samurai samu1 = new Samurai(35.0, 15.0, 10.0, 20.0, "S1");
	
		European castleEur = new European(150.0, 20, 600.0, "Mount Olympus", 3);
		pala1 = new Paladin(35.0, 15.0, 10.0, 20.0, "P1");
	
		board = new Map(size);
		
		board.addElement(0, 0, castleJap);
		board.addElement(1, 0, samu1);
		
		board.addElement(4, 4, castleEur);
		board.addElement(3, 4, pala1);
	
	}
	
	/**
	 * Prints the map.
	 */
	public void printMap(){
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				if(board.getPosition(j, i) instanceof Paladin){
					System.out.print(" P ");
				}else if(board.getPosition(j, i) instanceof Samurai){
					System.out.print(" S ");
				}else if(board.getPosition(j, i) instanceof European){
					System.out.print(" E ");
				}else if(board.getPosition(j, i) instanceof Japanese){
					System.out.print(" J ");
				}else{
					System.out.print(" 0 ");
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * Reads the moviment wanted for the player, then if it is possible, makes the move.
	 * @param move - The direction of the moviment that will be realized by the player.
	 */
	public void playerMove(String move){
	
		switch(move){
			case "w": case "W":		//!< UP moviment.
				board.moveCharacter(pala1, pala1.getRow(), pala1.getColumn()-1, size);
				break;
			case "a": case "A":		//!< LEFT moviment.
				board.moveCharacter(pala1, pala1.getRow()-1, pala1.getColumn(), size);
				break;
			case "s": case "S":		//!< DOWN moviment.
				board.moveCharacter(pala1, pala1.getRow(), pala1.getColumn()+1, size);
				break;
			case "d": case "D":		//!< RIGHT moviment.
				board.moveCharacter(pala1, pala1.getRow()+1, pala1.getColumn(), size);
				break;
			default:				//!< Worng moviment.
				System.out.println("Invalid command.");
				break;
		}
	
	}
	

}
