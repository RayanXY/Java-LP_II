/**
 * This class represents a simple durable product. It is an extension
 * of the Produto class, inheriting its attributes and adding
 * predominant material and durability.
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public abstract class ProdutoDuravel extends Produto{

	private String material_pred, durabilidade;
	
	/**
	 * Creates a durable product.
	 * @param nome - The product's name.
	 * @param preco - The product's price.
	 * @param marca - The product's brand.
	 * @param descricao - The product's description.
	 * @param data_fabricacao - The product's date of manufacture.
	 * @param material_pred - The product's predominant material.
	 * @param durabilidade - The product's durability.
	 */
	public ProdutoDuravel(int id, String nome, double preco, String marca, String descricao, String data_fabricacao, String material_pred, String durabilidade){
	
		super(id, nome, preco, marca, descricao, data_fabricacao);
		this.material_pred = material_pred;
		this.durabilidade = durabilidade;
	
	}

	/**
	 * Sets the product's predominant material.
	 * @param material_pred - The product's predominant material.
	 */
	public void setMaterial_pred(String material_pred){
		this.material_pred = material_pred;
	}

	/**
	 * Sets the product's durability.
	 * @param durabilidade - The product's durability.
	 */
	public void setDurabilidade(String durabilidade){
		this.material_pred = material_pred;
	}

	/**
	 * @return The product's predominant material.
	 */
	public String getMaterial_pred(){
		return material_pred;
	}

	/**
	 * @return The product's durability.
	 */
	public String getDurabilidade(){
		return durabilidade;
	}

	public String toString(){
		return super.toString() + "\n>>> Material Predominante: " + this.material_pred + "\n>>> Durabilidade: " + this.durabilidade;
	}

	public abstract String eletronic();

}
