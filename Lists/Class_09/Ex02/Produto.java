/**
 * This class represents a simple product. With the name, price,
 * brand, description and date of manufacture. 
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public class Produto{

	private String nome, marca, descricao, data_fabricacao;
	private double preco;
	
	/**
	 * Creates a product.
	 * @param nome - The product's name.
	 * @param preco - The product's price.
	 * @param marca - The product's brand.
	 * @param descricao - The product's description.
	 * @param data_fabricacao - The product's date of manufacture.
	 */
	public Produto(String nome, double preco, String marca, String descricao, String data_fabricacao){
	
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.descricao = descricao;
		this.data_fabricacao = data_fabricacao;
		
	}
	
	/**
	 * Sets the product's name.
	 * @param nome - The product's name.
	 */
	public void setNome(String nome){
		this.nome = nome;
	}

	/**
	 * Sets the product's price.
	 * @param preco - The product's price.
	 */
	public void setPreco(double preco){
		this.preco = preco;
	}

	/**
	 * Sets the product's brand.
	 * @param marca - The product's brand.
	 */
	public void setMarca(String marca){
		this.marca = marca;
	}

	/**
	 * Sets the product's description.
	 * @param descricao - The product's description.
	 */
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	/**
	 * Sets the product's date of manufacture.
	 * @param data_fabricacao - The product's date of manufacture.
	 */
	public void setData_fabricacao(String data_fabricacao){
		this.data_fabricacao = data_fabricacao;
	}
	
	/**
	 * @return The product's name.
	 */
	public String getNome(){
		return nome;
	}

	/**
	 * @return The product's price.
	 */
	public double getPreco(){
		return preco;
	}

	/**
	 * @return The product's brand.
	 */
	public String getMarca(){
		return marca;
	}

	/**
	 * @return The product's description.
	 */
	public String getDescricao(){
		return descricao;
	}

	/**
	 * @return The product's date of manufacture.
	 */
	public String getData_fabricacao(){
		return data_fabricacao;
	}

}
