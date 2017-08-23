public class Refrigerante extends ProdutoDuravel{

	private double litros;
	private String sabor;
	
	public Refrigerante(String nome, double preco, String marca, String descricao, String data_fabricacao, String validade, String genero, double litros, String sabor){
		
		super(nome, preco, marca, descricao, data_fabricacao, validade, genero);
		this.litros = litros;
		this.sabor = sabor;
		
	}
	
	public void setLitros(double litros){
		this.litros = litros;
	}
	public void setSabor(String sabor){
		this.sabor = sabor;
	}
	public double getLitros(){
		return litros;
	}
	public String getSabor(){
		return sabor;
	}
	
	public void beber(){
		litros = litros - 0.2;
	}

}
