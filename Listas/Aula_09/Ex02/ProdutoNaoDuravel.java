public class ProdutoNaoDuravel extends Produto{

	private String validade, genero;
	
	public ProdutoNaoDuravel(String nome, double preco, String marca, String descricao, String data_fabricacao, String validade, String genero){
	
		super(nome, preco, marca, descricao, data_fabricacao);
		this.validade = validade;
		this.genero = genero;
	
	}
	
	public void setValidade(String validade){
		this.validade = validade;
	}
	public void setGenero(String genero){
		this.genero = genero;
	}
	
	public String getValidade(){
		return validade;
	}
	public String getGenero(){
		return genero;
	}
	
}
