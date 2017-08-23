public class Cliente{

	private String nome;
	private int carteira;
	
	public Cliente(String nome, int carteira){
	
		this.nome = nome;
		this.carteira = carteira;
		
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCarteira(int carteira){
		this.carteira = carteira;
	}
	
	public String getNome(){
		return nome;
	}
	public int getCarteira(){
		return carteira;
	}

}
