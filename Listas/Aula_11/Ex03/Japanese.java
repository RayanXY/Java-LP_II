import java.util.Random;

/**
 * This class represents a Japanese Castle in the game. It is an extension of the 
 * Castle class, inheriting its attributes and adding number of samurais.
 * 
 * @author Rayan Avelino
 * @version 30.08.2017
 */
public class Japanese extends Castle{

	protected int numSamurais;		//!< The number of samurais.
	
	/**
	 * Creates a japanese castle for the game.
	 * @param defenses - The amount of extra damage that the castle supports.
	 * @param location - The position in the map of the castle.
	 * @param lifePoints - The amount of real damage that the castle supoorts.
	 * @param name - The name of the castle.
	 * @param numSamurais - The number of samurais.
	 */
	public Japanese(double defenses, double location, double lifePoints, String name, int numSamurais){
	
		super(defenses, location, lifePoints, name);
		this.numSamurais = numSamurais;
	
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
		if(numSamurais < 0){
			numSamurais = 0;
		}
		if(lifePoints <= 0.0){
			lP = "> The castle was destoyed";
		}else{
			lP = "> Life Points: " + lifePoints;  
		}
		
		System.out.println(">>> JAPANESE CASTLE");
		System.out.println("> Defenses: " + defenses);
		System.out.println("> Location: " + location);
		System.out.println(lP);
		System.out.println("> Name: " + name);
		System.out.println("> Samurais: " + numSamurais);
		System.out.println();
	}
	
	/**
	 * @override
	 * Calculates the damage suffered by the castle.
	 * @param atk - The damage suffered by the castle.
	 */
	public void attack(double atk){
		/// Eliminates a random number of samurais.
		if(numSamurais > 0){
			Random rand = new Random();
			int deaths = rand.nextInt(4)+2;
			numSamurais = numSamurais - deaths;
		}else if(defenses > 0.0){
			defenses = defenses - atk;
		}else{
			lifePoints = lifePoints - atk;
		}
	}

}
