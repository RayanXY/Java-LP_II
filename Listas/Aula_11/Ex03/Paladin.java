/**
 * This class represents a Paladin warrior in the game. It is an extension of the 
 * Characters class, inheriting its attributes and adding the ID for the warrior.
 * 
 * @author Rayan Avelino
 * @version 30.08.2017
 */
public class Paladin extends Characters{

	private String id;		//!< The ID for the warrior.
	
	/**
	 * Creates a paladin for the game.
	 * @param hp - The damage that the character can take.
	 * @param strength - The damage that the character can give.
	 * @param defense - Lowes the damage received.
	 * @param ado - A chance of an extra damage. 
	 * @param id - The ID of the warrior.
	 */
	public Paladin(double hp, double strength, double defense, double ado, String id){
	
		super(hp, strength, defense, ado);
		this.id = id;
	
	}
	
	/**
	 * @return The ID of the warrior.
	 */
	public String getId(){
		return id;
	}
	
	/**
	 * Sets the ID for the warrior.
	 * @param id - The ID of warrior.
	 */
	public void setId(String id){
		this.id = id;
	}

}
