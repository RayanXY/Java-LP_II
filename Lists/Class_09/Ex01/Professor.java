/**
 * This class represents a simple teacher. Its attributes are the teacher's
 * name, registration and age.
 * 
 * @author Rayan Avelino
 * @version 22.08.2017
 */
public class Professor{

	private String nome;		//!< The teacher's name.
	private String matricula;	//!< The teacher's registration.
	private int idade;			//!< The teacher's age.
	
	/**
	 * Creates a teacher.
	 * @param nome - The teacher's name.
	 * @param matricula - The teacher's registration.
	 * @param idade - The teacher's age.
	 */
	public Professor(String nome, String matricula, int idade){
	
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
	
	}
	
	/**
	 * Sets the teacher's name.
	 * @param nome - The teacher's name.
	 */
	public void setNome(String nome){
		this.nome = nome;
	}
	
	/**
	 * Sets the teacher's registration.
	 * @param matricula - The teacher's registration.
	 */
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	/**
	 * Sets the teacher's age.
	 * @param idade - The teacher's age.
	 */
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	/**
	 * @return The teacher's name.
	 */
	public String getNome(){
		return nome;
	}
	
	/**
	 * @return The teacher's registration.
	 */
	public String getMatricula(){
		return matricula;
	}
	
	/**
	 * @return The teacher's age.
	 */
	public int getIdade(){
		return idade;
	}

}
