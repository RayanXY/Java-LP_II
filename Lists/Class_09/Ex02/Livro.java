/**
 * This class represents a simple book. It is an extension
 * of the ProdutoDuravel class, inheriting its attributes and adding
 * number of pages and author.
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public class Livro extends ProdutoDuravel{

	private int quantidade_pag;
	private String autor;
	
	/**
	 * Creates a book.
	 * @param nome - The book's name.
	 * @param preco - The book's price.
	 * @param marca - The book's brand.
	 * @param descricao - The book's description.
	 * @param data_fabricacao - The book's date of manufacture.
	 * @param material_pred - The book's predominant material.
	 * @param durabilidade - The book's durability.
	 * @param quantidade_pag - The book's number of pages.
	 * @param autor - The book's author.
	 */
	public Livro(String nome, double preco, String marca, String descricao, String data_fabricacao, String material_pred, String durabilidade, int quantidade_pag, String autor){
		
		super(nome, preco, marca, descricao, data_fabricacao, material_pred, durabilidade);
		this.quantidade_pag = quantidade_pag;
		this.autor = autor;
		
	}
	/**
	 * Sets the book's number of pages.
	 * @param quantidade_pag - The book's number of pages.
	 */
	public void setQuantidade_pag(int quantidade_pag){
		this.quantidade_pag = quantidade_pag;
	}

	/**
	 * Sets the book's author.
	 * @param autor - The book's author.
	 */
	public void setAutor(String autor){
		this.autor = autor;
	}

	/**
	 * @return The book's number of pages.
	 */
	public int getQuantidade_pag(){
		return quantidade_pag;
	}

	/**
	 * @return The book's author.
	 */
	public String getAutor(){
		return autor;
	}

}
