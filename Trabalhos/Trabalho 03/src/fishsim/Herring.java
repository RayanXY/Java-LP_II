package fishsim;

import java.util.*;

/**
 * The Herring fish class
 * @author jdb
 * @version 28/11/2008
 */
public class Herring extends Fish {
	private double planctonEaten;
	
        /**
         * Construct a new herring
         * @param params parameters for the new fish
         */
        public  Herring(FishParams params) {
            super(params);
            planctonEaten = params.getPlanctonEaten();
            status = 1;
        }
        
        /**
         * Return a new fish of the same kind
         * @param cell fish location
         * @return new fish
         */
        public Fish spawn(Cell cell) {
            return cell.createFish("herring");
        }
	
        /**
         * Iterate this fish through one simulator cycle
         * @param step counter that should be incremented for each
         * call. Used to avoid the same fish acting more than once
         * in a cycle
         */
	public void eat(List<Cell> neighborhood){
            
            Collections.shuffle(neighborhood);
            for(Cell c : neighborhood) {
            	double p = c.getPlancton();
		if (p > planctonEaten) {
                    eat(planctonEaten);
                    p -= planctonEaten;
                    c.setPlancton(p);
                    break;
		}
                
            }
		
	}
}
