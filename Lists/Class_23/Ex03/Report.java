import java.util.ArrayList;

/**
 * This class represents a Report. 
 *
 * @author Rayan Avelino
 * @version 21.10.2017
 */
public class Report{

	private float single, married, widowed, divorced;
	private ArrayList<Person> persons;

	/// Creates a calculator
	public Report(){
		persons = new ArrayList<Person>();
	}

	/**
	 * @return The sigle percentual.
	 */
	public float getSingle(){
		return single;
	}

	/**
	 * @return The married percentual.
	 */
	public float getMarried(){
		return married;
	}

	/**
	 * @return The widowed percentual.
	 */
	public float getWidowed(){
		return widowed;
	}

	/**
	 * @return The divorced percentual.
	 */
	public float getDivorced(){
		return divorced;
	}

	/**
	 * Adds a person to the report.
	 * @param person - The person to be added to the list.
	 */
	public void addPerson(Person person){
		persons.add(person);
	}

	/**
	 * Removes a person to the report.
	 * @param person - The person to be removed from the list.
	 */
	public void removePerson(Person person){
		persons.remove(person);
	}

	/**
	 * @return The avarage age in the list.
	 */
	public float averageAge(){

		int sum = 0;
		for(Person person : persons){
			sum += person.getAge();
		}
		float media = sum/persons.size();

		return media;

	}

	/**
	 * @return The avarage acceptance in the list.
	 */
	public float averageAcceptance(){

		int sum = 0;
		for(Person person : persons){
			sum += person.getAcceptance();
		}
		float media = sum/persons.size();

		return media;

	}

	/**
	 * Calculates the percentual of each civil status in the list.
	 */
	public void avarageCivilStatus(){

		float sCont = 0, mCont = 0, wCont = 0, dCont = 0;
		int size = persons.size();

		for(Person p : persons){

			if(p.getCivilStatus().equals("S")){
				sCont++;
			}else if(p.getCivilStatus().equals("C")){
				mCont++;
			}else if(p.getCivilStatus().equals("V")){
				wCont++;
			}else if(p.getCivilStatus().equals("D")){
				dCont++;
			}

		}

		single = (sCont/size) * 100;
		married = (mCont/size) * 100;
		widowed = (wCont/size) * 100;
		divorced = (dCont/size) * 100;

	}

}