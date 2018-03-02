import java.util.Random;

/**
 * This class represents an European Castle in the game. It is an extension of the 
 * Castle class, inheriting its attributes and adding number of paladins.
 * 
 * @author Rayan Avelino
 * @version 30.08.2017
 */
public class European extends Castle{

	protected int numPaladins;		//!< The number of paladins.
	
	/**
	 * Creates an european castle for the game.
	 * @param defenses - The amount of extra damage that the castle supports.
	 * @param location - The position in the map of the castle.
	 * @param lifePoints - The amount of real damage that the castle supoorts.
	 * @param name - The name of the castle.
	 * @param numPaladins - The number of paladins.
	 */
	public European(double defenses, double location, double lifePoints, String name, int numPaladins){
	
		super(defenses, location, lifePoints, name);
		this.numPaladins = numPaladins;
	
	}
	
	/**
	 * @override
	 * Prints all the information of the castle.
	 */
	public void showState(){
		/// Treatments
		String lP;
		if(defenses < 0.0){
			defenses = 0.0;
		}
		if(numPaladins < 0){
			numPaladins = 0;
		}
		if(lifePoints <= 0.0){
			lP = "> The castle was destoyed";
		}else{
			lP = "> Life Points: " + lifePoints;  
		}
		
		System.out.println(">>> EUROPEAN CASTLE");
		System.out.println("> Defenses: " + defenses);
		System.out.println("> Location: " + location);
		System.out.println(lP);
		System.out.println("> Name: " + name);
		System.out.println("> Paladins: " + numPaladins);
		System.out.println();
	}
	
	/**
	 * @override
	 * Calculates the damage suffered by the castle.
	 * @param atk - The damage suffered by the castle.
	 */
	public void attack(double atk){
		/// Eliminates a random number of paladins.
		if(numPaladins > 0){
			Random rand = new Random();
			int deaths = rand.nextInt(4)+2;
			numPaladins = numPaladins - deaths;
		}else if(defenses > 0.0){
			defenses = defenses - atk;
		}else{
			lifePoints = lifePoints - atk;
		}
	}

}
