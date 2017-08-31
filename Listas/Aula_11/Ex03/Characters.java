/**
 * This class represents a Character in the game. It is an extension of the 
 * ElementOfGame class, inheriting its attributes and adding the hits points, 
 * strength, defense and critical hit chance.
 * 
 * @author Rayan Avelino
 * @version 30.08.2017
 */
public class Characters extends ElementOfGame{

	private double hp;			//!< The damage the character can take.
	private double strength;	//!< The damage that the character can give.
	private double defense;		//!< Lowes the damage received.
	private double ado;			//!< The chance of an extra damage given by the character.
	
	/**
	 * Creates a character for the game.
	 * @param hp - The damage that the character can take.
	 * @param strength - The damage that the character can give.
	 * @param defense - Lowes the damage received.
	 * @param ado - A chance of an extra damage. 
	 */
	public Characters(double hp, double strenght, double defense, double ado){
		
		super(0, 0);
		this.hp = hp;
		this.strength = strength;
		this.defense = defense;
		this.ado = ado;
	
	}
	
	/**
	 * @return The hits points of the character.
	 */
	public double getHp(){
		return hp;
	}
	
	/**
	 * @return The strength of the character.
	 */
	public double getStrength(){
		return strength;
	}
	
	/**
	 * @return The defense of the character.
	 */
	public double getDefense(){
		return defense;
	}
	
	/**
	 * @return The critical chance of the character.
	 */
	public double getAdo(){
		return ado;
	}
	
	/**
	 * Sets the hits points of the character.
	 * @param hp - The damage that the character can take.
	 */
	public void setHp(double hp){
		this.hp = hp;
	}
	
	/**
	 * Sets the strength of the character.
	 * @param strength - The damage that the character can give.
	 */
	public void setStrenght(double strength){	
		this.strength = strength;
	}
	
	/**
	 * Sets the defense of the character.
	 * @param hp - Lowes the damage received by the character.
	 */
	public void setDefense(double defense){
		this.defense = defense;
	}
	
	/**
	 * Sets the critical hit chance of the character.
	 * @param ado - The chance of an extra damage.
	 */
	public void setAdo(double ado){
		this.ado = ado;
	}
	
}
