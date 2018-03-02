/**
 * This class represents a Castle in the game. It is an extension of the 
 * ElementOfGame class, inheriting its attributes and adding the castle's 
 * defense, its location, the life points and its name.
 * 
 * @author Rayan Avelino
 * @version 30.08.2017
 */
public class Castle extends ElementOfGame{

	protected double defenses;		//!< How much of defense the castle has.
	protected double location;		//!< Where the castle is located in the map.
	protected double lifePoints;	//!< How much damage the castle can take.
	protected String name;			//!< The name of the castle.
	
	/**
	 * Creates a castle for the game.
	 * @param defenses - The amount of extra damage that the castle supports.
	 * @param location - The position in the map of the castle.
	 * @param lifePoints - The amount of real damage that the castle supoorts.
	 * @param name - The name of the castle.
	 */
	public Castle(double defenses, double location, double lifePoints, String name){
	
		super(0, 0);
		this.defenses = defenses;
		this.location = location;
		this.lifePoints = lifePoints;
		this.name = name;
	
	}
	
	/**
	 * Prints all the information of the castle.
	 */
	public void showState(){
		/// Treatments
		String lP;
		if(defenses < 0.0){
			defenses = 0.0;
		}
		if(lifePoints <= 0.0){
			lP = "> The castle was destoyed";
		}else{
			lP = "> Life Points: " + lifePoints;  
		}
		
		System.out.println(">>> CASTLE");
		System.out.println("> Defenses: " + defenses);
		System.out.println("> Location: " + location);
		System.out.println(lP);
		System.out.println("> Name: " + name);
		System.out.println();
	}
	
	/**
	 * Calculates the damage suffered by the castle.
	 * @param atk - The damage suffered by the castle.
	 */
	public void attack(double atk){
		if(defenses > 0.0){
			defenses = defenses - atk;
		}else{
			lifePoints = lifePoints - atk;
		}
	}

}
