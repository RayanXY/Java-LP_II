public class Person{
	
	private String name, civilStatus;
	private int age, acceptance;

	public Person(String name, int age, String civilStatus, int acceptance){
		this.name = name;
		this.age = age;
		this.civilStatus = civilStatus;
		this.acceptance = acceptance;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public String getCivilStatus(){
		return civilStatus;
	}

	public int getAcceptance(){
		return acceptance;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setCivilStatus(String civilStatus){
		this.civilStatus = civilStatus;
	}

	public void setAcceptance(int acceptance){
		this.acceptance = acceptance;
	}

}