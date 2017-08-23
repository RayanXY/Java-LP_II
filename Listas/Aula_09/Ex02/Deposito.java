import java.util.ArrayList;

public class Deposito{

	private ArrayList<Produto> deposito;
	
	public Deposito(){
		deposito = new ArrayList<Produto>();
	}
	
	public void adiciona_prod(Produto p){
		deposito.add(p);
	}
	
	public void remove_prod(Produto p){
		deposito.remove(p);
	}
	
	public int quantidade_produtos(){
		return deposito.size();
	}
	
	public void deposito_vazio(){
		if(deposito.isEmpty()){
			System.out.println("Vazio!");
		}else{
			System.out.println("Não está vazio!");
		}
	}

	public void mais_caro(){
		
		Produto caro, atual;
		int i = 0;
		int sz = deposito.size();
		
		caro = deposito.get(i);
		
		for(i = 1; i < sz; i++){
		
			atual = deposito.get(i);
			if(atual.getPreco() > caro.getPreco()){
				caro = atual;
			}
		
		}
		
		System.out.println("Produto: " + caro.getNome() + " - Preço: R$" + caro.getPreco());
		
	}	

}
