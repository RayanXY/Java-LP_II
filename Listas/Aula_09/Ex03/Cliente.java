/**
 * This class represents simple client. Its attributes are the
 * driver's name license. 
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public class Cliente{

	private String nome;	/// Driver's name.
	private int carteira;	/// Driver's license.
	
	/**
	 * Creates a client.
	 * @param nome - Driver's name.
	 * @param carteira - Driver's license.
	 */
	public Cliente(String nome, int carteira){
	
		this.nome = nome;
		this.carteira = carteira;
		
	}
	
	/**
	 * Sets the driver's name.
	 * @param nome - Drive's name.
	 */ 
	public void setNome(String nome){
		this.nome = nome;
	}
	
	/**
	 * Sets the driver's license.
	 * @param carteira - Driver's license.
	 */
	public void setCarteira(int carteira){
		this.carteira = carteira;
	}
	
	/**
	 * @return The driver's name.
	 */
	public String getNome(){
		return nome;
	}
	
	/**
	 * @return the driver's license.
	 */
	public int getCarteira(){
		return carteira;
	}

}
