package fishsim;

import java.util.*;

public class Shark extends Predator {
        
        public Shark(FishParams params)
        {
            super(params);
            status = 3;
        }
        
        @Override
        public Fish spawn(Cell cell)
        {
            return cell.createFish("shark");
        }
        
        @Override
        public void eat(List<Cell> neighborhood) {
            double eaten = 0.0;
            for (Cell c : neighborhood){
                if (c.getStatus() == 0){
                    break;
                }
                if (c.getStatus() < status && !(c.getFish() instanceof Shark)) {
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
