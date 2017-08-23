public class Carro extends ProdutoDuravel{

	private double kilometragem;
	private String cor;
	
	public Carro(String nome, double preco, String marca, String descricao, String data_fabricacao, String material_pred, String durabilidade, double kilometragem, String cor){
		
		super(nome, preco, marca, descricao, data_fabricacao, material_pred, durabilidade);
		this.kilometragem = kilometragem;
		this.cor = cor;
		
	}
	
	public void setKilometragem(double kilometragem){
		this.kilometragem = kilometragem;
	}
	public void setCor(String cor){
		this.cor = cor;
	}
	public double getKilometragem(){
		return kilometragem;
	}
	public String getCor(){
		return cor;
	}
	
	public void rodar(double km_percorridos){
		kilometragem = kilometragem - km_percorridos;
	}

}
