public class Livro extends ProdutoDuravel{

	private int quantidade_pag;
	private String autor;
	
	public Livro(String nome, double preco, String marca, String descricao, String data_fabricacao, String material_pred, String durabilidade, int quantidade_pag, String autor){
		
		super(nome, preco, marca, descricao, data_fabricacao, material_pred, durabilidade);
		this.quantidade_pag = quantidade_pag;
		this.autor = autor;
		
	}
	
	public void setQuantidade_pag(int quantidade_pag){
		this.quantidade_pag = quantidade_pag;
	}
	public void setAutor(String autor){
		this.autor = autor;
	}
	public int getQuantidade_pag(){
		return quantidade_pag;
	}
	public String getAutor(){
		return autor;
	}
	
	public void ler(){
		quantidade_pag--;
	}

}
