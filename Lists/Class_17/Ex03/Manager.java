public class Manager extends Employee{
	
	public Manager(String name, String birthday, String cpf, double salary){

		super(name, birthday, cpf, salary);

	}

	public double getBonus(){
		double salary = getSalary();
		setSalary((salary*0.1)+salary);
		return getSalary();
	}

}