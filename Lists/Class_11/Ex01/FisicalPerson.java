/**
 * This class represents a Fisical Person. It is an extension
 * of the Client class, inheriting its attributes and adding
 * the CPF for the person.
 * 
 * @author Rayan Avelino
 * @version 29.08.2017
 */
public class FisicalPerson extends Client{

	private String cpf;		//!< The person's CPF.
	
	/**
	 * Creates a Fisical Person.
	 * @param name - The name of the person.
	 * @param address - Where the person lives.
	 * @param phone - The phone number of the person.
	 * @param cpf - The CPF of the person.
	 */
	public FisicalPerson(String name, String address, String phone, String cpf){
	
		super(name, address, phone);
		this.cpf = cpf;	
	}
	
	/**
	 * @return The person's CPF.
	 */
	public String getCpf(){
		return cpf;
	}
	
	/**
	 * @override
	 * Print's the person data.
	 */
	public void printData(){
		System.out.println(">>> FISICAL PERSON");
		System.out.println("> NAME: " + getName());
		System.out.println("> ADDRESS: " + getAddress());
		System.out.println("> PHONE: " + getPhone());
		System.out.println("> CPF: " + cpf);
		System.out.println();
	}

}
