public class Chocolate extends ProdutoDuravel{

	private int pedacos;
	private String sabor;
	
	public Chocolate(String nome, double preco, String marca, String descricao, String data_fabricacao, String validade, String genero, int pedacos, String sabor){
		
		super(nome, preco, marca, descricao, data_fabricacao, validade, genero);
		this.pedacos = pedacos;
		this.sabor = sabor;
		
	}
	
	public void setPedacos(int pedacos){
		this.pedacos = pedacos;
	}
	public void setSabor(String sabor){
		this.sabor = sabor;
	}
	public int getPedacos(){
		return pedacos;
	}
	public String getSabor(){
		return sabor;
	}
	
	public void comer(){
		pedacos--;
	}

}
