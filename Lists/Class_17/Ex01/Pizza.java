/**
 * This class represents a simple pizza. It is an extension
 * of the ProdutoNaoDuravel class, inheriting its attributes and adding
 * flavor and slices.
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public class Pizza extends ProdutoNaoDuravel{

	private String sabor;
	private int fatias;
	
	/**
	 * Creates a pizza.
	 * @param id - The pizza's id.
	 * @param nome - The product's name.
	 * @param preco - The product's price.
	 * @param marca - The product's brand.
	 * @param descricao - The product's description.
	 * @param data_fabricacao - The product's date of manufacture.
	 * @param validade - The product's validity.
	 * @param genero - The product's gender.
	 * @param sabor - The product's flavor.
	 * @param fatias - The product's number of slices.
	 */
	public Pizza(int id, String nome, double preco, String marca, String descricao, String data_fabricacao, String validade, String genero, String sabor, int fatias){
		
		super(id, nome, preco, marca, descricao, data_fabricacao, validade, genero);
		this.sabor = sabor;
		this.fatias = fatias;
		
	}
	
	/**
	 * Sets the pizza's flavor.
	 * @param sabor - The pizza's flavor.
	 */
	public void setSabor(String sabor){
		this.sabor = sabor;
	}

	/**
	 * Sets the pizza's slices.
	 * @param fatias - The pizza's number of slices.
	 */
	public void setFatias(int fatias){
		this.fatias = fatias;
	}

	/**
	 * @return The pizza's flavor.
	 */
	public String getSabor(){
		return sabor;
	}

	/**
	 * @return The pizza's number of slices.
	 */
	public int getFatias(){
		return fatias;
	}
	
	/**
	 * Decreases the number of slices as it's eaten.
	 */
	public void comer(){
		fatias--;
	}

	public void valido(boolean damaged){
		if(damaged){
			super.setValid(true);
		}else{
			super.setValid(false);
		}
	}

	public void sold(){
		super.setSold(true);
	}

}
