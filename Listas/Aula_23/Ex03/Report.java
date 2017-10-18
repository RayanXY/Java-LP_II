import java.util.ArrayList;

public class Report{

	private ArrayList<Person> persons;

	public Report(){
		persons = new ArrayList<Person>();
	}

	public void addPerson(Person person){
		persons.add(person);
	}

	public void removePerson(Person person){
		persons.remove(person);
	}

	public float ageMedia(){

		int sum = 0;
		for(Person person : persons){
			sum += person.getAge();
		}
		float media = sum/persons.size();

		return media;

	}

	public float acceptanceMedia(){

		int sum = 0;
		for(Person person : persons){
			sum += person.getAcceptance();
		}
		float media = sum/persons.size();

		return media;

	}

}