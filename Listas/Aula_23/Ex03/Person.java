public class Person{
	
	private String name;
	private int age, acceptance;
	char civilStatus;

	public Person(String name, int age, char civilStatus, int acceptance){
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

	public char getCivilStatus(){
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

	public void setCivilStatus(){
		this.civilStatus = civilStatus;
	}

	public void setAcceptance(){
		this.acceptance = acceptance;
	}

}