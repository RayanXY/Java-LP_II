public class Celular extends ProdutoDuravel{

	private double creditos;
	private String sistema_op;
	
	public Celular(String nome, double preco, String marca, String descricao, String data_fabricacao, String material_pred, String durabilidade, double creditos, String sistema_op){
		
		super(nome, preco, marca, descricao, data_fabricacao, material_pred, durabilidade);
		this.creditos = creditos;
		this.sistema_op = sistema_op;
		
	}
	
	public void setCreditos(double creditos){
		this.creditos = creditos;
	}
	public void setSistema_op(String sistema_op){
		this.sistema_op = sistema_op;
	}
	public double getCreditos(){
		return creditos;
	}
	public String getSistema_op(){
		return sistema_op;
	}
	
	public void ligar(){
		creditos = creditos - 0.50;
	}

}
