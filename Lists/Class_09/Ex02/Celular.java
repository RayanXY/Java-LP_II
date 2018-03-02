/**
 * This class represents a simple cell phone. It is an extension
 * of the ProdutoDuravel class, inheriting its attributes and adding
 * credits and operacional system.
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public class Celular extends ProdutoDuravel{

	private double creditos;
	private String sistema_op;
	
	/**
	 * Creates a cell phone.
	 * @param nome - The cell phone's name.
	 * @param preco - The cell phone's price.
	 * @param marca - The cell phone's brand.
	 * @param descricao - The cell phone's description.
	 * @param data_fabricacao - The cell phone's date of manufacture.
	 * @param material_pred - The cell phone's predominant material.
	 * @param durabilidade - The cell phone's durability.
	 * @param creditos - The cell phone's credits.
	 * @param sistema_op - The cell phone's operational system.
	 */
	public Celular(String nome, double preco, String marca, String descricao, String data_fabricacao, String material_pred, String durabilidade, double creditos, String sistema_op){
		
		super(nome, preco, marca, descricao, data_fabricacao, material_pred, durabilidade);
		this.creditos = creditos;
		this.sistema_op = sistema_op;
		
	}
	
	/**
	 * Sets the cell phone's credits.
	 * @param creditos - The cell phone's credits.
	 */
	public void setCreditos(double creditos){
		this.creditos = creditos;
	}

	/**
	 * Sets the cell phone's operantional system.
	 * @param sistema_op - The cell phone's operantional system.
	 */
	public void setSistema_op(String sistema_op){
		this.sistema_op = sistema_op;
	}

	/**
	 * @return The cell phone's credits.
	 */
	public double getCreditos(){
		return creditos;
	}

	/**
	 * @return The cell phone's operantional system.
	 */
	public String getSistema_op(){
		return sistema_op;
	}
	
	/**
	 * Consumes the credits of a call.
	 */
	public void ligar(){
		creditos = creditos - 0.50;
	}

}
