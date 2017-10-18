import java.util.ArrayList;

public class Report{

	private float single, married, widowed, divorced;
	private ArrayList<Person> persons;

	public Report(){
		persons = new ArrayList<Person>();
	}

	public float getSingle(){
		return single;
	}

	public float getMarried(){
		return married;
	}

	public float getWidowed(){
		return widowed;
	}

	public float getDivorced(){
		return divorced;
	}

	public void addPerson(Person person){
		persons.add(person);
	}

	public void removePerson(Person person){
		persons.remove(person);
	}

	public float averageAge(){

		int sum = 0;
		for(Person person : persons){
			sum += person.getAge();
		}
		float media = sum/persons.size();

		return media;

	}

	public float averageAcceptance(){

		int sum = 0;
		for(Person person : persons){
			sum += person.getAcceptance();
		}
		float media = sum/persons.size();

		return media;

	}

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