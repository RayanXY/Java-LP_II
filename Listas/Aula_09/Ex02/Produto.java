public class Produto{

	private String nome, marca, descricao, data_fabricacao;
	private double preco;
	
	public Produto(String nome, double preco, String marca, String descricao, String data_fabricacao){
	
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.descricao = descricao;
		this.data_fabricacao = data_fabricacao;
		
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setPreco(double preco){
		this.preco = preco;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	public void setData_fabricacao(String data_fabricacao){
		this.data_fabricacao = data_fabricacao;
	}
	
	public String getNome(){
		return nome;
	}
	public double getPreco(){
		return preco;
	}
	public String getMarca(){
		return marca;
	}
	public String getDescricao(){
		return descricao;
	}
	public String getData_fabricacao(){
		return data_fabricacao;
	}

}
