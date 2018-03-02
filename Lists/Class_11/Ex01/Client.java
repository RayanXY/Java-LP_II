/**
 * This class represents a Client. Its attributes are the client's
 * name, its address and its phone number. 
 * 
 * @author Rayan Avelino
 * @version 29.08.2017
 */
public class Client{

	private String name;		//!< Client's name.
	private String address; 	//!< Client's address.
	private String phone;		//!< Client's phone number.
	
	/**
	 * Creates a client.
	 * @param name - The name of the client.
	 * @param address - Where the client lives.
	 * @param phone - The phone number of the client.
	 */
	public Client(String name, String address, String phone){
	
		this.name = name;
		this.address = address;
		this.phone = phone;
	
	}
	
	/**
	 * @return The client's name.
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * @return The client's address.
	 */
	public String getAddress(){
		return address;
	}
	
	/**
	 * @return The client's phone number.
	 */
	public String getPhone(){
		return phone;
	}
	
	/**
	 * Sets an address for the client.
	 * @param address - The address to be set.
	 */
	public void setAddress(String address){
		this.address = address;
	}
	
	/**
	 * Sets a phone number for the client.
	 * @param phone - The phone number to be set.
	 */
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public void printData(){
		System.out.println();
	}

}
