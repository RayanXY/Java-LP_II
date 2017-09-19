/**
 * This class represents a simple soda. It is an extension
 * of the ProdutoNaoDuravel class, inheriting its attributes and adding
 * flavor and liters.
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public class Refrigerante extends ProdutoDuravel{

	private double litros;
	private String sabor;
	
	/**
	 * Creates a soda.
	 * @param nome - The soda's name.
	 * @param preco - The soda's price.
	 * @param marca - The soda's brand.
	 * @param descricao - The soda's description.
	 * @param data_fabricacao - The soda's date of manufacture.
	 * @param validade - The soda's validity.
	 * @param genero - The soda's gender.
	 * @param litros - The soda's liters.
	 * @param sabor - The soda's flavor.
	 */
	public Refrigerante(String nome, double preco, String marca, String descricao, String data_fabricacao, String validade, String genero, double litros, String sabor){
		
		super(nome, preco, marca, descricao, data_fabricacao, validade, genero);
		this.litros = litros;
		this.sabor = sabor;
		
	}
	
	/**
	 * Sets the soda's liters.
	 * @param litros - The soda's liters.
	 */
	public void setLitros(double litros){
		this.litros = litros;
	}

	/**
	 * Sets the soda's flavor.
	 * @param sabor - The chocolate's flavor.
	 */
	public void setSabor(String sabor){
		this.sabor = sabor;
	}

	/**
	 * @return The soda's liters.
	 */
	public double getLitros(){
		return litros;
	}

	/**
	 * @return The soda's flavor.
	 */
	public String getSabor(){
		return sabor;
	}
	
	/**
	 * Decreases the liters as it's driken.
	 */
	public void beber(){
		litros = litros - 0.2;
	}

}
