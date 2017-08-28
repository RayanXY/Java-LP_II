public class Vehicle{

	// A unique ID for this taxi.
    private String id;
    // The destination of this taxi.
    private String destination;
    // The location of this taxi.
    private String location;
    
    
    public Vehicle(String id, String destination, String location){
    	this.id = id;
    	this.destination = destination;
    	this.location = location;
    }

    /**
     * Return the ID of the taxi.
     * @return The ID of the taxi.
     */
    public String getID(){
        return id;
    }
    
    /**
     * Return the location of the taxi.
     * @return The location of the taxi.
     */
    public String getLocation(){
        return location;
    }
    
    /**
     * Return the destination of the taxi.
     * @return The destination of the taxi.
     */
    public String getDestination(){
        return destination;
    }

	/**
	 * Return the status of this shuttle.
	 * @return The status.
	 */
    public String getStatus(){
    	if(destination != null){
        	return "> " + id + " at " + location + " headed for " + destination;
    	}else{
    		return "> " + id + " at " + location + " is stopped.";
    	}
    }

    /**
     * Set the intented destination of the taxi.
     * @param destination The intended destination.
     */
    public void setDestination(String destination){
        this.destination = destination;
    }

    /**
     * Set the current location of the vehicle.
     * @param location The current location.
     */
    public void setLocation(String location){
    	this.location = location;
    }

    public void arrived(){
    	location = destination;
    }

}
