package fishsim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Blue groper fish class
 * @author jdb
 */
public class Groper extends Predator {

    /**
     * Create a new blue groper
     * @param cell location of the fish
     * @param params initial parameters
     */
    public Groper(FishParams params)
    {
        super(params);
        status = 2;
    }

    /**
     * Create another groper
     * @param cell location for the new fish
     * @return the fish spawned
     */
    public Fish spawn(Cell cell)
    {
        return cell.createFish("groper");
    }
    
    /// Override
    public void eat(List<Cell> neighborhood){
        double eaten = 0.0;
        for (Cell c : neighborhood) {
            if (c.getStatus() == 0) {
                break;
            }
            if (c.getStatus() < status && !(c.getFish() instanceof Shark)){
                
                double w = c.getFish().getWeight();
                eat(w);
                c.setFish(null);
                eaten += w;
                if (eaten >= maxEat){
                    break;
                }
                
            }
        }
    }
    
}
