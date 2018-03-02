/**
 * This class represents a simple hourly teacher. It is an extension
 * of the Professor class, inheriting its attributes and adding
 * the amount of hours and hourly wage.
 *
 * @author Rayan Avelino
 * @version 22.08.2017
 */
public class ProfessorHorista extends Professor{

	private int total_horas;			//!< Amount of hours.
	private String salario_hora;		//!< Hourly wage.
	
	/**
	 * Creates a hourly teacher.
	 * @param nome - The teacher's name.
	 * @param matricula - The teacher's registration.
	 * @param idade - The teacher's age.
	 * @param total_horas - Amount of hours.
	 * @param salario_hora - Hourly wage.
	 */
	public ProfessorHorista(String nome, String matricula, int idade, int total_horas, String salario_hora){
	
		super(nome, matricula, idade);
		this.total_horas = total_horas;
		this.salario_hora = salario_hora;
	
	}
	
	/**
	 * Sets the amount of hours.
	 * @param total_horas - The amount of hours.
	 */
	public void setTotal_horas(int total_horas){
		this.total_horas = total_horas;
	}
	
	/**
	 * Sets the hourly wage.
	 * @param salario_hora - The hourly wage.
	 */
	public void setSalario_hora(String salario_hora){
		this.salario_hora = salario_hora;
	}
	
	/**
	 * @return The amount of hours.
	 */
	public int getTotal_horas(){
		return total_horas;
	}
	
	/**
	 * @return The hourly wage.
	 */
	public String getSalario_hora(){
		return salario_hora;
	}
	
	/**
	 * Calculates the wage of the teacher.
	 * @return The teacher's monthly wage.
	 */
	public double salario(){
		double salario = Double.parseDouble(salario_hora);
		return salario * total_horas;
	}

}
