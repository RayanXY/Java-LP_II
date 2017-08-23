public class ProdutoDuravel extends Produto{

	private String material_pred, durabilidade;
	
	public ProdutoDuravel(String nome, double preco, String marca, String descricao, String data_fabricacao, String material_pred, String durabilidade){
	
		super(nome, preco, marca, descricao, data_fabricacao);
		this.material_pred = material_pred;
		this.durabilidade = durabilidade;
	
	}
	
	public void setMaterial_pred(String material_pred){
		this.material_pred = material_pred;
	}
	public void setDurabilidade(String durabilidade){
		this.material_pred = material_pred;
	}
	public String getMaterial_pred(){
		return material_pred;
	}
	public String getDurabilidade(){
		return durabilidade;
	}

}
