package fishsim;

import java.util.Collections;
import java.util.List;

/**
 * This is the superclass for all kinds of fish
 * 
 * @author jdb 
 * @version 28/11/2008
 */
public abstract class Fish
{
	protected double weight;
	protected double viableWeight;
	protected double weightReduce;
        protected double breedWeight;
        protected int breedAge;
        protected int maxAge;
        protected int status; // how high up the food chain
	protected int age = 0;
	protected int step = -1;
	
        /**
         * Create a new fish
         * @param cell fish location
         * @param params parameters for the new fish
         */
        public Fish(FishParams params)
        {
                weight = params.getInitWeight();
                viableWeight = params.getViableWeight();
                weightReduce = params.getWeightReduce();
                breedWeight = params.getBreedWeight();
                breedAge = params.getBreedAge();
                maxAge = params.getMaxAge();
		age = 0;
	}
        
        /**
         * Create a new fish of the same kind
         * @param cell - location of spawned fish
         * @return the fish spawned
         */
        abstract Fish spawn(Cell cell);
        
	/**
	 * Consume a given weight of food
	 * @param w weight of food consumed
	 */
	public void eat(double w)
	{
		weight += w;
	}
	
        /**
         * Accessor
         * @return status of this fish
         */
        public int getStatus() {
            return status;
        }
        
        /**
         * Accessor
         * @return weight of this fish
         */
	public double getWeight()
	{
		return weight;
	}
	
        /**
         * Mutator
         * @param weight new wightn of this fish
         */
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	/**
	 * Move the fish to a new cell
	 * @param cell destination
	 */
	public void move(Cell cell)
	{
            cell.setFish(this);
	}
        
        public void move(Cell current, List<Cell> neighborhood) {
            Collections.shuffle(neighborhood);
            for (Cell c: neighborhood){
                if (c.getFish() == null){
                    
                    Fish fish = current.getFish();
                    current.setFish(null);
                    c.setFish(fish);
                    break;
                    
                }
            }
	}
        
        public boolean isAlive() {
            age++;
            return age < maxAge && weight >= viableWeight;
	}
        
	public abstract void eat(List<Cell > neighborhood);
        
        
}
