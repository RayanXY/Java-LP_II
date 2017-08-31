public class Vehicle{

	// A unique ID for this vehicle.
    private String id;
    // The destination of this vehicle.
    private String destination;
    // The location of this vehicle.
    private String location;
    
    /**
     * Creates a vehicle.
     * @param id - A unique ID for this vehicle.
     * @param destination - The destination of this vehicle.
     * @param location - The location of this vehicle.
     */
    public Vehicle(String id, String destination, String location){
    	this.id = id;
    	this.destination = destination;
    	this.location = location;
    }

    /**
     * @return The ID of the vehicle.
     */
    public String getID(){
        return id;
    }
    
    /**
     * @return The location of the vehicle.
     */
    public String getLocation(){
        return location;
    }
    
    /**
     * @return The destination of the vehicle.
     */
    public String getDestination(){
        return destination;
    }

	/**
	 * @return The status of the vehicle.
	 */
    public String getStatus(){
    	if(destination != null){
        	return "> " + id + " at " + location + " headed for " + destination;
    	}else{
    		return "> " + id + " at " + location + " is available.";
    	}
    }

    /**
     * Sets the intented destination of the vehicle.
     * @param destination - The intended destination.
     */
    public void setDestination(String destination){
        this.destination = destination;
    }

    /**
     * Sets the current location of the vehicle.
     * @param location - The current location.
     */
    public void setLocation(String location){
    	this.location = location;
    }
	
	/**
	 * Means that the vehicle has arrived its destination.
	 */
    public void arrived(){
    	location = destination;
    }

}
