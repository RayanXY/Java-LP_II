/**
 * This class represents a simple chocolate. It is an extension
 * of the ProdutoNaoDuravel class, inheriting its attributes and adding
 * flavor and pieces.
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public class Chocolate extends ProdutoDuravel{

	private int pedacos;
	private String sabor;

	/**
	 * Creates a chocolate.
	 * @param nome - The chocolate's name.
	 * @param preco - The chocolate's price.
	 * @param marca - The chocolate's brand.
	 * @param descricao - The chocolate's description.
	 * @param data_fabricacao - The chocolate's date of manufacture.
	 * @param validade - The chocolate's validity.
	 * @param genero - The chocolate's gender.
	 * @param pedacos - The chocolate's number of pieces.
	 * @param sabor - The chocolate's flavor.
	 */
	public Chocolate(String nome, double preco, String marca, String descricao, String data_fabricacao, String validade, String genero, int pedacos, String sabor){
		
		super(nome, preco, marca, descricao, data_fabricacao, validade, genero);
		this.pedacos = pedacos;
		this.sabor = sabor;
		
	}
	
	/**
	 * Sets the chocolate's pieces.
	 * @param pedacos - The chocolate's pieces.
	 */
	public void setPedacos(int pedacos){
		this.pedacos = pedacos;
	}

	/**
	 * Sets the chocolate's flavor.
	 * @param sabor - The chocolate's flavor.
	 */
	public void setSabor(String sabor){
		this.sabor = sabor;
	}

	/**
	 * @return The chocolate's number of pieces.
	 */
	public int getPedacos(){
		return pedacos;
	}

	/**
	 * @return The chocolate's flavor.
	 */
	public String getSabor(){
		return sabor;
	}
	
	/**
	 * Decreases the number of pieces as it's eaten.
	 */
	public void comer(){
		pedacos--;
	}

}
