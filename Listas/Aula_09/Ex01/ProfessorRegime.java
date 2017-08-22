public class ProfessorRegime extends Professor{

	private double salario;
	
	public ProfessorRegime(String nome, String matricula, int idade, double salario){
	
		super(nome, matricula, idade);
		this.salario = salario;
	
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	public double getSalario(){
		return salario;
	}

}
