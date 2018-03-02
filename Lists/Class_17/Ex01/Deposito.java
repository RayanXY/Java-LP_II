import java.util.ArrayList;

/**
 * This class represents simple rent company. It creates a list
 * of products, adds them, removes them, gives the size and return the most expensive item.
 *
 * @author Rayan Avelino
 * @version 22.08.2017
 */
public class Deposito{

	private ArrayList<Produto> deposito;			//!< List to store products.
	
	/**
	 * Creates a list to store products.
	 */
	public Deposito(){
		deposito = new ArrayList<Produto>();
	}
	
	/**
	 * Stores a product in the list.
	 * @param p - The product to be stored.
	 */
	public void adiciona_prod(Produto p){
		deposito.add(p);
	}
	
	/**
	 * Removes a product in the list.
	 * @param p - The product to be removed.
	 */
	public void remove_prod(Produto p){
		deposito.remove(p);
	}
	
	/**
	 * @return The number of products stored.
	 */
	public int quantidade_produtos(){
		return deposito.size();
	}
	
	/**
	 * Checks if the list is empty.
	 */
	public void deposito_vazio(){
		if(deposito.isEmpty()){
			System.out.println("Vazio!");
		}else{
			System.out.println("Não está vazio!");
		}
	}

	/**
	 * Finds the most expensive product in the list.
	 */
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
