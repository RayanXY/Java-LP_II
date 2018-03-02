/**
 * This class represents a simple durable product. It is an extension
 * of the Produto class, inheriting its attributes and adding
 * product validity and its gender.
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public abstract class ProdutoNaoDuravel extends Produto{

	private boolean valid;
	private String validade, genero;
	
	/**
	 * Creates a durable product.
	 * @param id - The product's id.
	 * @param nome - The product's name.
	 * @param preco - The product's price.
	 * @param marca - The product's brand.
	 * @param descricao - The product's description.
	 * @param data_fabricacao - The product's date of manufacture.
	 * @param validade - The product's validity.
	 * @param genero - The product's gender.
	 */
	public ProdutoNaoDuravel(int id, String nome, double preco, String marca, String descricao, String data_fabricacao, String validade, String genero){
	
		super(id, nome, preco, marca, descricao, data_fabricacao);
		this.validade = validade;
		this.genero = genero;
	
	}
	
	/**
	 * Sets the product's validity.
	 * @param validade - The product's validity.
	 */
	public void setValidade(String validade){
		this.validade = validade;
	}

	/**
	 * Sets the product's gender.
	 * @param genero - The product's gender.
	 */
	public void setGenero(String genero){
		this.genero = genero;
	}

	public void setValid(boolean valid){
		this.valid = valid;
	}

	public boolean getValid(){
		return valid;
	}
	
	/**
	 * @return The product's validity.
	 */
	public String getValidade(){
		return validade;
	}

	/**
	 * @return The product's gender.
	 */
	public String getGenero(){
		return genero;
	}

	public String toString(){
		return super.toString() + "\n>>> Validade: " + this.validade + "\n>>> Gênero: " + this.genero;
	}

	public abstract void valido(boolean damaged);
	
}
