public class Pizza extends ProdutoDuravel{

	private String sabor;
	private int fatias;
	
	public Pizza(String nome, double preco, String marca, String descricao, String data_fabricacao, String validade, String genero, String sabor, int fatias){
		
		super(nome, preco, marca, descricao, data_fabricacao, validade, genero);
		this.sabor = sabor;
		this.fatias = fatias;
		
	}
	
	public void setSabor(String sabor){
		this.sabor = sabor;
	}
	public void setFatias(int fatias){
		this.fatias = fatias;
	}
	public String getSabor(){
		return sabor;
	}
	public int getFatias(){
		return fatias;
	}
	
	public void comer(){
		fatias--;
	}

}
