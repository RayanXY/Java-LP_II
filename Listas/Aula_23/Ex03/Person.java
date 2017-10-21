/**
 * This class represents a simple Person. 
 *
 * @author Rayan Avelino
 * @version 21.10.2017
 */
public class Person{
	
	private String name, civilStatus;
	private int age, acceptance;

	/**
	 * Creates a Person.
	 * @param name - The person's name.
	 * @param age - The person's age.
	 * @param civilStatus - The person's civil status.
	 * @param acceptance - The person's acceptance.
	 */
	public Person(String name, int age, String civilStatus, int acceptance){
		this.name = name;
		this.age = age;
		this.civilStatus = civilStatus;
		this.acceptance = acceptance;
	}

	/**
	 * @return The person's name.
	 */
	public String getName(){
		return name;
	}

	/**
	 * @return The person's age.
	 */
	public int getAge(){
		return age;
	}

	/**
	 * @return The person's civil status.
	 */
	public String getCivilStatus(){
		return civilStatus;
	}

	/**
	 * @return The person's acceptance.
	 */
	public int getAcceptance(){
		return acceptance;
	}

}