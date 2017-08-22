public class ProfessorHorista extends Professor{

	private int total_horas;
	private String salario_hora;
	
	public ProfessorHorista(String nome, String matricula, int idade, int total_horas, String salario_hora){
	
		super(nome, matricula, idade);
		this.total_horas = total_horas;
		this.salario_hora = salario_hora;
	
	}
	
	public void setTotal_horas(int total_horas){
		this.total_horas = total_horas;
	}
	public int getTotal_horas(){
		return total_horas;
	}
	public void setSalario_hora(String salario_hora){
		this.salario_hora = salario_hora;
	}
	public String getSalario_hora(){
		return salario_hora;
	}
	
	public double salario(){
		double salario = Double.parseDouble(salario_hora);
		return salario * total_horas;
	}

}
