public abstract class Employee{
	
	private String name, birthday, cpf;
	private double salary;

	public Employee(String name, String birthday, String cpf, double salary){

		this.name = name;
		this.birthday = birthday;
		this.cpf = cpf;
		this.salary = salary;

	}

	public void setName(String name){
		this.name = name;
	}

	public void setBirthday(String birthday){
		this.birthday = birthday;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}

	public String getName(){
		return name;
	}

	public String getBirthday(){
		return birthday;
	}

	public String getCpf(){
		return cpf;
	}

	public double getSalary(){
		return salary;
	}

	abstract double getBonus();

}