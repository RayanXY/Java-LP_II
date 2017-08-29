/**
 * This class represents a Legal Person. It is an extension
 * of the Client class, inheriting its attributes and adding
 * the CNPj and a Fancy Name for the person's company.
 * 
 * @author Rayan Avelino
 * @version 29.08.2017
 */
public class LegalPerson extends Client{

	private String cnpj;		//!< The person's CNPj.
	private String fancyName;   //!< The person's fancy name.
	
	/**
	 * Creates a Legal Person.
	 * @param name - The name of the person.
	 * @param address - Where the person lives.
	 * @param phone - The phone number of the person.
	 * @param cnpj - The CNPj of the person.
	 * @param fancyName - The fancy name for the person's company.
	 */
	public LegalPerson(String name, String address, String phone, String cnpj, String fancyName){
	
		super(name, address, phone);
		this.cnpj = cnpj;
		this.fancyName = fancyName;
	
	}
	
	/**
	 * @return The person's CNPj.
	 */
	public String getCnpj(){
		return cnpj;
	}
	
	/**
	 * @return The fancy name for the company.
	 */
	public String getFancyName(){
		return fancyName;
	}
	
	/**
	 * Sets an fancy name for the person's company.
	 * @param fancyName - The fancy name to be set.
	 */
	public void setFancyName(String fancyName){
		this.fancyName = fancyName;
	}
	
	/**
	 * @override
	 * Print's the person data.
	 */
	public void printData(){
		System.out.println(">>> LEGAL PERSON");
		System.out.println("> NAME: " + getName());
		System.out.println("> ADDRESS: " + getAddress());
		System.out.println("> PHONE: " + getPhone());
		System.out.println("> CNPj: " + cnpj);
		System.out.println("> COMPANY FANCY NAME: " + fancyName);
		System.out.println();
	}

}
