package fishsim;
import java.util.*;

/**
 * Manage the rectangle of cells representing an ocean
 */
public class Ocean
{
    // Configurable parameters
    
    FishParams herringParams, groperParams, sharkParams;
    private int width, height;
    private Cell cells[][];
    
    /**
     * Create a new ocean
     * @param height height in cells
     * @param width width in cells
     * @param herringParams provides parameters for any herrings created
     * @param groperParams provides parameters for any gropers created
     * @param sharkParams provides parameters for any sharks created
     */
    public Ocean(int height, int width, FishParams herringParams,
            FishParams groperParams, FishParams sharkParams)
    {
        this.width = width;
        this.height = height;
        this.herringParams = herringParams;
        this.groperParams = groperParams;
        this.sharkParams = sharkParams;
        cells = new Cell[height][width];
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                cells[i][j] = new Cell(this, i, j);
            }
        }
    }

    
    /**
     * Put the ocean through one iteraction of the simulator
     * @param step number of this iteration
     */
    public void act(int step) {
        /*
         * Seed the ocean with new fish occasionally
         */
    	if (step % 100 == 0)
    		cells[10][10].createFish("herring");
    	if (step % 100 == 50) {
    		cells[20][20].createFish("groper");
    		cells[20][20].createFish("shark");
        }
        
    }
    
    /**
     * Get all the cells in the ocean
     * @return array of cells
     */
    public Cell[] Cells()
    {
        Cell cells[] = new Cell[width * height];
        for (int n = 0; n < cells.length; n++)
            cells[n] = new Cell(this, n / width, n % width);
        return cells;
    }
    
    /**
     * Return the fish at the given location, if any.
     * @param row The desired row.
     * @param col The desired column.
     * @return The fish at the given location, or null if there is none.
     */
    public Fish getFishAt(int row, int col)
    {
        return cells[row][col].getFish();
    }
    
    /**
     * Low-level method to add the fish to the ocean. Used by cells
     * @param fish added
     * @param row cell location
     * @param col cell location
     */
    public void setFishAt(Fish fish, int row, int col)
    {
        cells[row][col].setFish(fish);
    }
    
    /**
     * Get the plancton level
     * @param row location
     * @param col location
     * @return level
     */
    public double getPlanctonAt(int row, int col)
    {
    	return cells[row][col].getPlancton();
    }
    
    /**
     * Mutator
     * @param p new plancton level
     * @param row location
     * @param col location
     */
    public void setPlanctonAt(double p, int row, int col)
    {
    	cells[row][col].setPlancton(p);
    }
    
    /**
     * @return The height of the ocean.
     */
    public int getHeight()
    {
        return height;
    }
    
    /**
     * @return The width of the ocean.
     */
    public int getWidth()
    {
        return width;
    }
    
    /// Getting the params    
    public FishParams getHerringParams() {
	return herringParams;
    }
    
    public FishParams getGroperParams() {
	return groperParams;
    }
    
    public FishParams getSharkParams() {
	return sharkParams;
    }
    
}
