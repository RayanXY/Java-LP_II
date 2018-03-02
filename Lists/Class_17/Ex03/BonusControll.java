import java.util.ArrayList;

public class BonusControll{
	
	private ArrayList<Employee> employees;

	public BonusControll(){

		employees = new ArrayList<Employee>();

	}

	public void add(Employee employee){
		employees.add(employee);
	}

	public void registerBonus(Employee employee){	
		if(employee instanceof Manager){
			employee.getBonus();
		}else if(employee instanceof Director){
			employee.getBonus();
		}else if(employee instanceof President){
			employee.getBonus();
		}
	}

}