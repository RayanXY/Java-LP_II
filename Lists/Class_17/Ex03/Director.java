public class Director extends Manager{
	
	public Director(String name, String birthday, String cpf, double salary){

		super(name, birthday, cpf, salary);

	}

	public double getBonus(){
		double salary = getSalary();
		setSalary((salary*0.2)+salary);
		return getSalary();
	}

}