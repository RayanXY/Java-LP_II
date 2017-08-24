/**
 * This class represents a simple hourly teacher. It is an extension
 * of the Professor class, inheriting its attributes and adding
 * the wage.
 *
 * @author Rayan Avelino
 * @version 22.08.2017
 */
public class ProfessorRegime extends Professor{

	private double salario;		//!< The teacher's wage.
	
	/**
	 * Creates a regime teacher.
	 * @param nome - The teacher's name.
	 * @param matricula - The teacher's registration.
	 * @param idade - The teacher's age.
	 * @param salario - The teacher's wage.
	 */
	public ProfessorRegime(String nome, String matricula, int idade, double salario){
	
		super(nome, matricula, idade);
		this.salario = salario;
	
	}
	
	/**
	 * Sets the teacher's wage.
	 * @param salario - The teacher's wage.
	 */
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	/**
	 * @return The teacher's wage.
	 */
	public double getSalario(){
		return salario;
	}

}
