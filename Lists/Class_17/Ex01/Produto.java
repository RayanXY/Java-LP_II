/**
 * This class represents a simple product. With the name, price,
 * brand, description and date of manufacture. 
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public abstract class Produto{

	private boolean sold;
	private int id;
	private String nome, marca, descricao, data_fabricacao;
	private double preco;
	
	/**
	 * Creates a product.
	 * @param id - THe product's ID.
	 * @param nome - The product's name.
	 * @param preco - The product's price.
	 * @param marca - The product's brand.
	 * @param descricao - The product's description.
	 * @param data_fabricacao - The product's date of manufacture.
	 */
	public Produto(int id, String nome, double preco, String marca, String descricao, String data_fabricacao){
		
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.descricao = descricao;
		this.data_fabricacao = data_fabricacao;
		
	}

	/**
	 * Sets the product's id.
	 * @param id - The product's id.
	 */
	public void setNome(int id){
		this.id = id;
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

	public void setSold(boolean sold){
		this.sold = sold;
	}

	public boolean getSold(){
		return sold;
	}
	
	/**
	 * @return The product's id.
	 */
	public int getId(){
		return id;
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

	public String toString(){

		return ">>> ID: " + this.id + "\n>>> Nome: " + this.nome + "\n>>> Preço: R$" + this.preco + "\n>>> Marca: " + this.marca + "\n>>> Descrição: " + this.descricao + "\n>>> Data de fabricação: " + this.data_fabricacao;

	}

	public abstract void sold();

}
