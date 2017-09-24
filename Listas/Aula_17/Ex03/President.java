public class President extends Employee{
	
	public President(String name, String birthday, String cpf, double salary){

		super(name, birthday, cpf, salary);

	}

	public double getBonus(){
		double salary = getSalary();
		setSalary((salary*0.3)+salary);
		return getSalary();
	}

}